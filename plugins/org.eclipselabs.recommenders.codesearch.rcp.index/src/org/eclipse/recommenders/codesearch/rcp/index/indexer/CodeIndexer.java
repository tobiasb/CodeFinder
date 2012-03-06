package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.FieldSelector;
import org.apache.lucene.document.SetBasedFieldSelector;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TermQuery;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.utils.IIndexInformationProvider;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.utils.IndexInformationCache;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.visitor.CompilationUnitVisitor;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.CodeSearcher;
import org.eclipse.recommenders.rcp.RecommendersPlugin;
import org.eclipse.recommenders.utils.rcp.internal.RecommendersUtilsPlugin;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.inject.Inject;

public class CodeIndexer implements ICompilationUnitIndexer {

    public static void addAnalyzedField(final Document document, final String fieldName, final int fieldValue) {
        addAnalyzedField(document, fieldName, String.valueOf(fieldValue));
    }

    public static void addNoStoreNotAnalyzed(final Document document, final String fieldName, final String fieldValue) {
        if (fieldValue == null) {
            return;
        }
        final Field field = new Field(fieldName, fieldValue, Field.Store.NO, Field.Index.NOT_ANALYZED);
        document.add(field);
    }

    public static void addAnalyzedField(final Document document, final String fieldName, final String fieldValue) {
        if (fieldValue == null) {
            return;
        }
        final Field field = new Field(fieldName, fieldValue, Field.Store.YES, Field.Index.ANALYZED);
        document.add(field);
    }

    private final IndexWriter writer;
    private final CodeSearcher searcher;
    private final List<IIndexer> tmpIndexerCollection = Lists.newArrayList();
    private final IIndexInformationProvider indexInformationProvider;

    @Inject
    public CodeIndexer(final IndexWriter writer, final CodeSearcher searcher) throws IOException {
        this.writer = writer;
        this.searcher = searcher;
        indexInformationProvider = new IndexInformationCache();
    }

    /**
     * Adds a compilation unit to the index without previously checking and deleting old versions/documents in the
     * index.
     */
    public void add(final CompilationUnit cu) {
        final CompilationUnitVisitor visitor = new CompilationUnitVisitor(this);
        visitor.addIndexer(CompilationUnitVisitor.getDefaultIndexer());
        try {
            cu.accept(visitor);
        } catch (final Exception e) {
            RecommendersUtilsPlugin.logError(e, "Exception while indexing %s", cu);
        }
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
            final List<Document> docs = searcher.search(query, selector, 1);
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
        writer.deleteDocuments(q);
    }

    @Override
    public void delete(final CompilationUnit cu) throws IOException {
        final String cuPath = ResourcePathIndexer.getPath(cu);

        delete(new Term(Fields.RESOURCE_PATH, cuPath));
    }

    public void commit() {
        try {
            writer.commit();
        } catch (final Exception e) {
            RecommendersPlugin.logError(e, "failed to commit latest changes to code-search index.");
        }
    }

    public void compact(final boolean wait) {
        try {
            writer.forceMerge(10, true);
            writer.commit();
        } catch (final Exception e) {
            RecommendersPlugin.logError(e, "failed to commit latest changes to code-search index.");
        }
    }

    public void addDocument(final Document d) throws IOException {
        writer.addDocument(d);
    }

    @Override
    public void truncateIndex() {
        try {
            writer.deleteAll();
            writer.commit();
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
            commit();

            writer.close();

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
