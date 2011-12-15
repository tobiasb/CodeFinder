package org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene;

import java.io.IOException;
import java.util.List;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriter.MaxFieldLength;
import org.apache.lucene.store.Directory;
import org.apache.lucene.util.Version;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.Activator;

import com.google.inject.Inject;
import com.google.inject.internal.util.Lists;

public class LuceneIndex {

	private Directory m_index = null;
	private Analyzer m_analyzer = null;
	private IndexWriter m_writer = null;

	@Inject
	public LuceneIndex(Directory directory, Analyzer analyzer) throws IOException {
		m_index = directory;
		m_analyzer = analyzer;

		m_writer = new IndexWriter(m_index, m_analyzer, MaxFieldLength.UNLIMITED);
		m_writer.deleteAll();
	}
	
	public LuceneIndex(Directory directory) throws IOException {
		m_index = directory;
		m_analyzer = new StandardAnalyzer(Version.LUCENE_29);

		m_writer = new IndexWriter(m_index, m_analyzer, MaxFieldLength.UNLIMITED);
		m_writer.deleteAll();
	}

//	public static LuceneIndex createNewIndex() throws IOException {
//
//		LuceneIndex index = Activator.injector.getInstance(LuceneIndex.class);
//				
//		return index;
//	}

	public void addDocument(Document d) throws IOException {
		m_writer.addDocument(d);
	}
	
	public IndexReader getReader() {
		try {
			return m_writer.getReader();
		} catch (IOException e) {
			return null;
		}
	}
	
	public void truncateIndex() {
		try {
			m_writer.deleteAll();
		m_writer.commit();
		} catch (IOException e) {
			e.printStackTrace(); //TODO: refactor
		}
	}
	
	public List<Document> getDocuments() {
		List<Document> docs = Lists.newArrayList();
		IndexReader reader = getReader();
		
		try {
			for(int i = 0; i < m_writer.numDocs(); i++) {
				try {
					docs.add(reader.document(i));
				} catch (CorruptIndexException e) {
					// TODO Auto-generated catch block
					e.printStackTrace(); //TODO: refactor
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace(); //TODO: refactor
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); //TODO: refactor
		}
		
		return docs;
	}
	
	public void printStats() {
        try {
            Activator.logInfo("Stat - Docs in Index: " + m_writer.numDocs());
        } catch (IOException e) {
            e.printStackTrace(); //TODO: refactor
        }
	}

	public void close() {
		try {
			m_writer.close();
			m_index.close();
		} catch (CorruptIndexException e) {
			e.printStackTrace(); //TODO: refactor
		} catch (IOException e) {
			e.printStackTrace(); //TODO: refactor
		}
	}
}
