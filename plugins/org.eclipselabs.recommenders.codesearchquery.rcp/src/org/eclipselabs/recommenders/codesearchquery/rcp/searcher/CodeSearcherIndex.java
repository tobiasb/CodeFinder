package org.eclipselabs.recommenders.codesearchquery.rcp.searcher;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.queryParser.ParseException;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.MatchAllDocsQuery;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopScoreDocCollector;
import org.apache.lucene.store.Directory;
import org.eclipselabs.recommenders.codesearchquery.rcp.AbstractIndex;
import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.termvector.ITermVectorConsumable;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class CodeSearcherIndex extends AbstractIndex implements ITermVectorConsumable {
    private QueryParser parser;
    private final IndexReader reader;

    public CodeSearcherIndex(final Directory directory) throws IOException {
        super(directory);
        reader = IndexReader.open(directory);
        parser = new QueryParser(getVersion(), Fields.FULL_TEXT, getAnalyzer());
        parser.setLowercaseExpandedTerms(false);
    }

    public List<Document> search(final String queryString) throws CorruptIndexException, IOException, ParseException {
        final Query query = parser.parse(queryString);

        return search(query);
    }

    public List<Document> search(final Query query) throws IOException {

        // TODO: Schränke Felder mit IFieldSelector ein

        @SuppressWarnings("deprecation")
        IndexReader tmp = reader.reopen(true);
        final IndexSearcher searcher = new IndexSearcher(tmp);

        final int collectorSize = tmp.numDocs() > 0 ? tmp.numDocs() : 1;

        final TopScoreDocCollector collector = TopScoreDocCollector.create(collectorSize, true);

        searcher.search(query, collector);

        final List<Document> result = toList(searcher, collector.topDocs().scoreDocs);

        // System.out.println("Searching for: " + query.toString() + ". " +
        // result.size() + " hits.");

        searcher.close();

        return result;
    }

    private static List<Document> toList(final IndexSearcher searcher, final ScoreDoc[] scoreDocs) {

        final List<Document> result = Lists.newArrayList();

        for (final ScoreDoc doc : scoreDocs) {
            try {
                result.add(searcher.doc(doc.doc));
            } catch (final CorruptIndexException e) {
                e.printStackTrace(); // TODO refactor
            } catch (final IOException e) {
                e.printStackTrace(); // TODO refactor
            }
        }

        return result;
    }

    public List<Document> getDocuments() throws IOException {
        final MatchAllDocsQuery allDocsQuery = new MatchAllDocsQuery();

        return search(allDocsQuery);
    }

    @Override
    public Set<String> getTermVector(final String fieldName) {
        final Set<String> result = Sets.newHashSet();

        try {
            final List<Document> allDocs = getDocuments();

            for (final Document doc : allDocs) {
                for (final String value : doc.getValues(fieldName)) {
                    result.add(value);
                }
            }

        } catch (final CorruptIndexException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (final IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return result;
    }
}
