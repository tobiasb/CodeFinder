package org.eclipselabs.recommenders.codesearchquery;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.store.Directory;
import org.apache.lucene.util.Version;

public class AbstractIndex {

	protected Directory m_index = null;
	protected Analyzer m_analyzer = null;
	
	private final static Version luceneVersion = Version.LUCENE_29;
	
	public AbstractIndex(Directory directory, Analyzer analyzer) {
		m_index = directory;
		m_analyzer = analyzer;
	}
	
	public static Version getVersion() {
		return luceneVersion;
	}
	
	public Directory getIndex() {
		return m_index;
	}
}
