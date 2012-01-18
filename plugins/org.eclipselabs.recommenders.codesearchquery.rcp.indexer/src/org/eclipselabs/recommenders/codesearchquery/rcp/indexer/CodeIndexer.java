package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import java.io.IOException;
import java.util.List;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.LockObtainFailedException;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipselabs.recommenders.codesearchquery.AbstractIndex;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.visitor.CompilationUnitVisitor;

public class CodeIndexer extends AbstractIndex {

	private IndexWriter m_writer = null;
	
	public CodeIndexer(Directory directory) throws IOException {
		super(directory);
		
		initializeWriter();
	}
	
	private void initializeWriter() throws CorruptIndexException, LockObtainFailedException, IOException {
	    IndexWriterConfig config = new IndexWriterConfig(getVersion(), m_analyzer);

		m_writer = new IndexWriter(m_index, config);
		m_writer.deleteAll();
	}
	
	public void index(CompilationUnit cu) {

        CompilationUnitVisitor visitor = new CompilationUnitVisitor(this);
        visitor.addIndexer(CompilationUnitVisitor.getAllIndexer());

        cu.accept(visitor);
	}
	
	public void index(CompilationUnit cu, List<IIndexer> indexer) {
        CompilationUnitVisitor visitor = new CompilationUnitVisitor(this);
        visitor.addIndexer(indexer);

        cu.accept(visitor);
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

	public void addDocument(Document d) throws IOException {
		m_writer.addDocument(d);
	}
	
	public void truncateIndex() {
		try {
			m_writer.deleteAll();
			m_writer.commit();
		} catch (IOException e) {
			e.printStackTrace(); //TODO: refactor
		}
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
			commit();
			m_writer.close();
			m_index.close();
		} catch (CorruptIndexException e) {
			e.printStackTrace(); //TODO: refactor
		} catch (IOException e) {
			e.printStackTrace(); //TODO: refactor
		}
	}
}
