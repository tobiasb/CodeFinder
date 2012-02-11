package org.eclipse.recommenders.codesearch.rcp.index.searcher;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.queryParser.ParseException;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.search.FieldCache;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.MatchAllDocsQuery;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopScoreDocCollector;
import org.apache.lucene.store.Directory;
import org.eclipse.recommenders.codesearch.rcp.index.AbstractIndex;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.termvector.ITermVectorConsumable;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

// TODO: Tobias, what is the meaning of a code searcher index? Is it actually an index?
public class CodeSearcherIndex extends AbstractIndex implements ITermVectorConsumable {
    private final QueryParser parser;
    private IndexReader reader;

    public CodeSearcherIndex(final Directory directory) throws IOException {
        super(directory);
        reader = IndexReader.open(directory);
        parser = new QueryParser(getVersion(), Fields.FULL_TEXT, getAnalyzer());
        parser.setLowercaseExpandedTerms(false);
        parser.setAllowLeadingWildcard(true);
    }

    public List<Document> search(final String queryString) throws CorruptIndexException, IOException, ParseException {
        final Query query = parser.parse(queryString);

        return search(query);
    }

    private void renewReader() {
        try {
            final IndexReader newReader = IndexReader.openIfChanged(reader);
            if (newReader != null) {
                // reader was reopened
                reader.close();
                reader = newReader;
            }
        } catch (final Exception ex) {
            // XXX: Activator.logError(ex);
        }
    }

    public List<Document> search(final Query query) throws IOException {

        // TODO: Schränke Felder mit IFieldSelector ein

        renewReader();

        final IndexSearcher searcher = new IndexSearcher(reader);

        // TODO MB: Tobias, not sure this is the intended way how to do this.
        // anyway, ensure that the number is at least in the case of a completly
        // new created index.
        final int collectorSize = reader.numDocs() > 0 ? reader.numDocs() : 1;

        final TopScoreDocCollector collector = TopScoreDocCollector.create(collectorSize, true);

        searcher.search(query, collector);

        final List<Document> result = toList(searcher, collector.topDocs().scoreDocs);

        // XXX: Activator.logInfo("Searching for: %s. %s hits.",
        // query.toString(), result.size());

        searcher.close();

        return result;
    }

    private static List<Document> toList(final IndexSearcher searcher, final ScoreDoc[] scoreDocs) {

        final List<Document> result = Lists.newArrayList();

        for (final ScoreDoc doc : scoreDocs) {
            try {
                result.add(searcher.doc(doc.doc));
            } catch (final CorruptIndexException e) {
                // XXX: Activator.logError(e);
            } catch (final IOException e) {
                // XXX: Activator.logError(e);
            }
        }

        return result;
    }

    public List<Document> getDocuments() throws IOException {
        final MatchAllDocsQuery allDocsQuery = new MatchAllDocsQuery();

        return search(allDocsQuery);
    }

    @Override
    public Set<String> getTermVector(final String[] fieldNames) {

        renewReader();

        final Set<String> result = Sets.newHashSet();

        for (final String field : fieldNames) {
            try {
                final String[] values = FieldCache.DEFAULT.getStrings(reader, field);
                result.addAll(Lists.newArrayList(values));
            } catch (final IOException e) {
                // XXX: Activator.logError(e);
            }
        }

        result.remove(null);

        return result;
    }
}
