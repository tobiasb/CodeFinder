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
import org.eclipselabs.recommenders.codesearchquery.AbstractIndex;
import org.eclipselabs.recommenders.codesearchquery.Fields;
import org.eclipselabs.recommenders.codesearchquery.termvector.ITermVectorConsumable;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class CodeSearcherIndex extends AbstractIndex implements ITermVectorConsumable {
	private QueryParser parser;
	
	public CodeSearcherIndex(Directory directory) throws IOException {
		super(directory);
	}
	
	protected void init() {
		parser = new QueryParser(getVersion(), Fields.FULLY_QUALIFIED_NAME, getAnalyzer());
		parser.setLowercaseExpandedTerms(false);
	}
	
	public List<Document> search(String queryString) throws CorruptIndexException, IOException, ParseException {
		Query query = parser.parse(queryString);
		
		return search(query);
	}
	
	public List<Document> search(Query query) throws IOException {

		IndexReader reader = IndexReader.open(getIndex());

		//TODO: Schränke Felder mit IFieldSelector ein
		
		IndexSearcher searcher = new IndexSearcher(reader);

		TopScoreDocCollector collector = TopScoreDocCollector.create(10, true);
		
		searcher.search(query, collector);

		List<Document> result = toList(searcher, collector.topDocs().scoreDocs);

        System.out.println("Searching for: " + query.toString() + ". " + result.size() + " hits.");
        
        searcher.close();
        
		return result;
	}
	
	private static List<Document> toList(IndexSearcher searcher, ScoreDoc[] scoreDocs) {
		
		List<Document> result = Lists.newArrayList();
		
        for (final ScoreDoc doc : scoreDocs) {
            try {
				result.add(searcher.doc(doc.doc));
			} catch (CorruptIndexException e) {
				e.printStackTrace(); //TODO refactor
			} catch (IOException e) {
				e.printStackTrace(); //TODO refactor
			}
        }
        
        return result;
	}
	
	public List<Document> getDocuments() throws IOException {
		MatchAllDocsQuery allDocsQuery = new MatchAllDocsQuery();

		return search(allDocsQuery);
	}

	@Override
	public Set<String> getTermVector(String fieldName) {
		Set<String> result = Sets.newHashSet();
		
		try {
			List<Document> allDocs = getDocuments();

			for(Document doc : allDocs) {
				for(String value : doc.getValues(fieldName)) {
					result.add(value);
				}
			}
			
		} catch (CorruptIndexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}
