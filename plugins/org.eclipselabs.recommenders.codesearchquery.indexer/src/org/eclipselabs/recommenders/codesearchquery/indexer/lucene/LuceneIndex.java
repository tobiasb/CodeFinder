package org.eclipselabs.recommenders.codesearchquery.indexer.lucene;

import java.io.File;
import java.io.IOException;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriter.MaxFieldLength;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.SimpleFSDirectory;
import org.apache.lucene.util.Version;

public class LuceneIndex {

	private Directory m_index = null;
	private StandardAnalyzer m_analyzer = null;
//	private IndexWriterConfig m_config = null;
	private IndexWriter m_writer = null;

	public LuceneIndex(Directory directory, StandardAnalyzer analyzer/*, IndexWriterConfig config*/) throws IOException {
		m_index = directory;
		m_analyzer = analyzer;
//		m_config = config;

		m_writer = new IndexWriter(m_index, m_analyzer, MaxFieldLength.UNLIMITED);
	}

	public static LuceneIndex createNewIndex() throws IOException {

		// Directory directory = new RAMDirectory();
		Directory directory = new SimpleFSDirectory(new File("f:/index.l"));

		StandardAnalyzer analyzer = new StandardAnalyzer(Version.LUCENE_30);
//		IndexWriterConfig config = new IndexWriterConfig(Version.LUCENE_30,analyzer);

		LuceneIndex index = new LuceneIndex(directory, analyzer/*, config*/);

		return index;
	}

	public void addDocument(Document d) throws IOException {
		m_writer.addDocument(d);
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
