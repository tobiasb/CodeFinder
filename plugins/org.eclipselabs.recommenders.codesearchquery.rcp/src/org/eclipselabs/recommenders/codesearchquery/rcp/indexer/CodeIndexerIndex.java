package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.LockObtainFailedException;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipselabs.recommenders.codesearchquery.rcp.AbstractIndex;
import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.utils.IIndexInformationProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.utils.IndexInformationCache;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.visitor.CompilationUnitVisitor;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.CodeSearcherIndex;
import org.eclipselabs.recommenders.internal.codesearchquery.rcp.Activator;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;

public class CodeIndexerIndex extends AbstractIndex implements ICompilationUnitIndexer {

    private IndexWriter m_writer;
    private CodeSearcherIndex searcherIndex;
    private final List<IIndexer> tmpIndexerCollection = Lists.newArrayList();
    private IIndexInformationProvider indexInformationProvider;

    public CodeIndexerIndex(final Directory directory) throws IOException {
        super(directory);

        commit();
    }

    @Override
    protected void init() throws CorruptIndexException, LockObtainFailedException, IOException {
        IndexWriterConfig config = new IndexWriterConfig(getVersion(), getAnalyzer());

        m_writer = new IndexWriter(getIndex(), config);
        searcherIndex = new CodeSearcherIndex(getIndex());
        indexInformationProvider = new IndexInformationCache();
    }

    @Override
    public void index(final CompilationUnit cu) throws IOException {
        index(cu, CompilationUnitVisitor.getDefaultIndexer());
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
        String path = ResourcePathIndexer.getResourcePath(location);

        try {
            Query q = new TermQuery(new Term(Fields.RESOURCE_PATH, path));
            List<Document> docs = searcherIndex.search(q);

            if (docs.size() > 0)
                return getMinTimestamp(docs);

        } catch (IOException e) {
            Activator.logError(e);
        }

        return Optional.absent();
    }

    private Optional<Long> getMinTimestamp(List<Document> documents) {
        long min = Long.MAX_VALUE;

        for (Document doc : documents) {
            String timestampString = doc.get(Fields.TIMESTAMP);

            try {
                Long timestampValue = Long.parseLong(timestampString);
                if (min > timestampValue)
                    min = timestampValue;
            } catch (Exception ex) {
            }
        }

        if (min == Long.MAX_VALUE)
            return Optional.absent();

        return Optional.of(min);
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

        CompilationUnitVisitor visitor = new CompilationUnitVisitor(this);
        visitor.addIndexer(indexer);

        cu.accept(visitor);

        commit();
    }

    public void delete(final Term term) throws IOException {

        int numDocsBefore = m_writer.numDocs();
        m_writer.deleteDocuments(term);
        commit(); // for correct num count

        int numDeleted = numDocsBefore - m_writer.numDocs();
        System.out.println("Deleting: " + numDeleted + "x " + term.field() + "=" + term.text() + ".");
    }

    @Override
    public void delete(final CompilationUnit cu) throws IOException {
        ResourcePathIndexer indexer = new ResourcePathIndexer();
        String cuPath = indexer.getResourcePath(cu);

        delete(new Term(Fields.RESOURCE_PATH, cuPath));
    }

    public static void addAnalyzedField(final Document document, final String fieldName, final int fieldValue) {
        addAnalyzedField(document, fieldName, String.valueOf(fieldValue));
    }

    public static void addAnalyzedField(final Document document, final String fieldName, final String fieldValue) {
        if (fieldValue == null) {
            return;
        }

        Field field = new Field(fieldName, fieldValue, Field.Store.YES, Field.Index.ANALYZED);

        System.out.println(String.format("Adding field: [%1$30s] = [%2$50s]", fieldName, field.stringValue()));

        document.add(field);
    }

    public void commit() {
        try {
            m_writer.commit();
        } catch (CorruptIndexException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
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
        } catch (IOException e) {
            e.printStackTrace(); // TODO: refactor
        }
    }

    public void printStats() {
        try {
            Activator.logInfo("Stat - Docs in Index: " + m_writer.numDocs());
        } catch (IOException e) {
            e.printStackTrace(); // TODO: refactor
        }
    }

    @Override
    public void close() {
        try {
            Activator.logInfo("Closing %s", CodeIndexerIndex.class.getName());

            commit();
            // m_writer.close();
            // getIndex().close();
        } catch (Exception ex) {
            Activator.logError(ex);
        }
    }

    public void addDocuments(final List<Document> docs) throws IOException {
        for (Document doc : docs) {
            addDocument(doc);
        }
    }
}
