package org.eclipselabs.recommenders.codesearchquery;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.KeywordAnalyzer;
import org.apache.lucene.store.Directory;
import org.apache.lucene.util.Version;

public class AbstractIndex {

	protected Directory m_index = null;
	protected Analyzer m_analyzer = null;
	
	private final static Version luceneVersion = Version.LUCENE_35;
	
//	public AbstractIndex(Directory directory, Analyzer analyzer) {
//		m_index = directory;
//		m_analyzer = analyzer;
//	}
	
	public AbstractIndex(Directory directory) {
		m_index = directory;
//		m_analyzer = new Analyzer(){
//
//	    	@Override
//	    	public TokenStream tokenStream(String fieldName, Reader reader) {
////
//	    		//return new KeywordTokenizer(reader);
//	    		return new WhitespaceTokenizer(reader);
//	    	}
//	    };
		m_analyzer = new KeywordAnalyzer();
	}
	
	public static Version getVersion() {
		return luceneVersion;
	}
	
	public Directory getIndex() {
		return m_index;
	}
}
