package org.eclipselabs.recommenders.codesearchquery.rcp.searcher;

import java.io.IOException;
import java.util.List;

import org.apache.lucene.analysis.KeywordAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.queryParser.ParseException;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopScoreDocCollector;
import org.apache.lucene.store.Directory;
import org.eclipselabs.recommenders.codesearchquery.AbstractIndex;
import org.eclipselabs.recommenders.codesearchquery.Fields;

import com.google.common.collect.Lists;

public class CodeSearcher extends AbstractIndex {
	private QueryParser parser = null;
	private IndexSearcher searcher = null;
	
	public CodeSearcher(Directory directory) {
//		super(directory, new StandardAnalyzer(getVersion()));
		super(directory, new KeywordAnalyzer());
		
		parser = new QueryParser(getVersion(), Fields.FULLY_QUALIFIED_NAME, m_analyzer);
	}
	
	public List<ScoreDoc> search(String queryString) throws CorruptIndexException, IOException, ParseException {

		searcher = new IndexSearcher(m_index, true);

		TopScoreDocCollector collector = TopScoreDocCollector.create(10, true);
		
		Query query = parser.parse(queryString);
		
		searcher.search(query, collector);
		ScoreDoc[] hits = collector.topDocs().scoreDocs;

		List<ScoreDoc> result = Lists.newArrayList();
        for (final ScoreDoc doc : hits) {
            result.add(doc);
        }

        System.out.println("Searching for: " + query.toString() + ". " + result.size() + " hits.");
        
		return result;
	}
	
	public Document resolve(int hitNr) {
		try {
			return searcher.doc(hitNr);
		} catch (CorruptIndexException e) {
			return null;
		} catch (IOException e) {
			return null;
		}
	}
	
	public IndexReader openReader() {
		try {
			return IndexReader.open(m_index, true);
		} catch (IOException e) {
			return null;
		}
	}
	
	public List<Document> getDocuments() {
		List<Document> docs = Lists.newArrayList();
		IndexReader reader = openReader();
		
		for(int i = 0; i < reader.numDocs(); i++) {
				try {
					docs.add(reader.document(i));
				} catch (CorruptIndexException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return docs;
	}
	
	public void close() {
		try {
			searcher.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
