package org.eclipselabs.recommenders.codesearchquery.indexer.lucene;

import java.io.IOException;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriter.MaxFieldLength;
import org.apache.lucene.store.Directory;
import org.eclipselabs.recommenders.codesearchquery.indexer.Activator;

import com.google.inject.Inject;

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

	public static LuceneIndex createNewIndex() throws IOException {

		LuceneIndex index = Activator.injector.getInstance(LuceneIndex.class);
				
		return index;
	}

	public void addDocument(Document d) throws IOException {
		m_writer.addDocument(d);
	}
	
	public void printStats() {

        try {
            System.out.println("Stat - Docs in Index: " + m_writer.numDocs());
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	public void close() {
		try {
			m_writer.close();
		} catch (CorruptIndexException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
