package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.FieldSelector;
import org.apache.lucene.document.SetBasedFieldSelector;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.store.Directory;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.recommenders.codesearch.rcp.index.AbstractIndex;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.utils.IIndexInformationProvider;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.utils.IndexInformationCache;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.visitor.CompilationUnitVisitor;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.CodeSearcherIndex;
import org.eclipse.recommenders.rcp.RecommendersPlugin;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class CodeIndexerIndex extends AbstractIndex implements ICompilationUnitIndexer {

    public static void addAnalyzedField(final Document document, final String fieldName, final int fieldValue) {
        addAnalyzedField(document, fieldName, String.valueOf(fieldValue));
    }

    public static void addAnalyzedField(final Document document, final String fieldName, final String fieldValue) {
        if (fieldValue == null) {
            return;
        }

        final Field field = new Field(fieldName, fieldValue, Field.Store.YES, Field.Index.ANALYZED);

        // System.out.println(String.format("Adding field: [%1$30s] = [%2$50s]",
        // fieldName, field.stringValue()));

        document.add(field);
    }

    private final IndexWriter m_writer;
    private final CodeSearcherIndex searcherIndex;
    private final List<IIndexer> tmpIndexerCollection = Lists.newArrayList();
    private final IIndexInformationProvider indexInformationProvider;

    public CodeIndexerIndex(final Directory directory) throws IOException {
        super(directory);

        final IndexWriterConfig config = new IndexWriterConfig(getVersion(), getAnalyzer());
        IndexWriter.unlock(getIndex());
        m_writer = new IndexWriter(getIndex(), config);
        m_writer.commit();
        searcherIndex = new CodeSearcherIndex(getIndex());
        indexInformationProvider = new IndexInformationCache();
    }

    /**
     * Adds a compilation unit to the index without previously checking and deleting old versions/documents in the
     * index.
     */
    public void add(final CompilationUnit cu) {
        final CompilationUnitVisitor visitor = new CompilationUnitVisitor(this);
        visitor.addIndexer(CompilationUnitVisitor.getDefaultIndexer());
        cu.accept(visitor);
        // add to internal cache
        indexInformationProvider.setLastIndexed(ResourcePathIndexer.getFile(cu), TimestampIndexer.getTime());
    }

    @Override
    public void index(final CompilationUnit cu) throws IOException {
        index(cu, CompilationUnitVisitor.getDefaultIndexer());
    }

    @Override
    public void index(final CompilationUnit cu, final IIndexer indexer) throws IOException {
        tmpIndexerCollection.clear();
        tmpIndexerCollection.add(indexer);
        index(cu, tmpIndexerCollection);
    }

    @Override
    public void index(final CompilationUnit cu, final List<IIndexer> indexer) throws IOException {
        delete(cu);
        final CompilationUnitVisitor visitor = new CompilationUnitVisitor(this);
        visitor.addIndexer(indexer);
        cu.accept(visitor);
        // add to internal cache
        indexInformationProvider.setLastIndexed(ResourcePathIndexer.getFile(cu), TimestampIndexer.getTime());
    }

    @Override
    public long lastIndexed(final File location) {
        Optional<Long> lastIndexed = indexInformationProvider.getLastIndexed(location);

        if (lastIndexed.isPresent()) {
            return lastIndexed.get();
        } else {
            lastIndexed = lastIndexedInternal(location);
        }

        if (lastIndexed.isPresent()) {
            indexInformationProvider.setLastIndexed(location, lastIndexed.get());
            return lastIndexed.get();
        }

        // last update 1.1.1970 ;)
        return 0;
    }

    private Optional<Long> lastIndexedInternal(final File location) {
        try {
            final Query query = new TermQuery(new Term(Fields.RESOURCE_PATH, ResourcePathIndexer.getPath(location)));
            final FieldSelector selector = new SetBasedFieldSelector(Sets.newHashSet(Fields.TIMESTAMP),
                    Sets.<String> newHashSet());
            final List<Document> docs = searcherIndex.search(query, selector, 1);
            if (docs.size() > 0) {
                return getMinTimestamp(docs);
            }
        } catch (final Exception e) {
            RecommendersPlugin.logError(e, "failed to fetch last indexed timestamp for CU from code-search index.");
        }

        return Optional.absent();
    }

    private Optional<Long> getMinTimestamp(final List<Document> documents) {
        long min = Long.MAX_VALUE;

        for (final Document doc : documents) {
            final String timestampString = doc.get(Fields.TIMESTAMP);

            try {
                final Long timestampValue = Long.parseLong(timestampString);
                if (min > timestampValue) {
                    min = timestampValue;
                }
            } catch (final Exception ex) {
            }
        }

        if (min == Long.MAX_VALUE) {
            return Optional.absent();
        }

        return Optional.of(min);
    }

    public void delete(final File location) throws IOException {
        delete(new Term(Fields.RESOURCE_PATH, ResourcePathIndexer.getPath(location)));
    }

    public void delete(final Term term) throws IOException {
        if (term == null || term.text() == null) {
            return;
        }
        final Query q = new TermQuery(term);
        m_writer.deleteDocuments(q);
    }

    @Override
    public void delete(final CompilationUnit cu) throws IOException {
        final String cuPath = ResourcePathIndexer.getPath(cu);

        delete(new Term(Fields.RESOURCE_PATH, cuPath));
    }

    public void commit() {
        try {
            m_writer.commit();
        } catch (final Exception e) {
            RecommendersPlugin.logError(e, "failed to commit latest changes to code-search index.");
        }
    }

    public void addDocument(final Document d) throws IOException {
        m_writer.addDocument(d);
    }

    @Override
    public void truncateIndex() {
        try {
            m_writer.deleteAll();
            m_writer.commit();
        } catch (final IOException e) {
            RecommendersPlugin.logError(e, "failed to truncate code-search index.");
        }
    }

    public void printStats() {
        // XXX: Mach was
        // try {
        // Activator.logInfo("Stat - Docs in Index: " +
        // // m_writer.numDocs());
        // } catch (final IOException e) {
        // // XXX: Activator.logError(e);
        // }
    }

    @Override
    public void close() {
        try {
            // XXX: Activator.logInfo("Closing %s",
            // CodeIndexerIndex.class.getName());

            commit();
            // m_writer.close();
            // getIndex().close();
        } catch (final Exception ex) {
            RecommendersPlugin.logError(ex, "failed to close code-search index.");
        }
    }

    public void addDocuments(final List<Document> docs) throws IOException {
        for (final Document doc : docs) {
            addDocument(doc);
        }
    }
}
