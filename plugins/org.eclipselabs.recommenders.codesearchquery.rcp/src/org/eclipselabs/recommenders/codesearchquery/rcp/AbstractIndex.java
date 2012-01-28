package org.eclipselabs.recommenders.codesearchquery.rcp;

import java.io.IOException;
import java.util.Map;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.KeywordAnalyzer;
import org.apache.lucene.analysis.PerFieldAnalyzerWrapper;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.store.Directory;
import org.apache.lucene.util.Version;

import com.google.common.collect.Maps;

public abstract class AbstractIndex {

    private Directory m_index = null;
    private Analyzer m_analyzer = null;

    private final static Version luceneVersion = Version.LUCENE_35;

    // public AbstractIndex(Directory directory, Analyzer analyzer) {
    // m_index = directory;
    // m_analyzer = analyzer;
    // }

    public AbstractIndex(final Directory directory) throws IOException {
        m_index = directory;

        Map<String, Analyzer> analyzerPerField = Maps.newHashMap();
        analyzerPerField.put(Fields.FULL_TEXT, new StandardAnalyzer(getVersion()));

        m_analyzer = new PerFieldAnalyzerWrapper(new KeywordAnalyzer(), analyzerPerField);
    }

    public static Version getVersion() {
        return luceneVersion;
    }

    public Directory getIndex() {
        return m_index;
    }

    public Analyzer getAnalyzer() {
        return m_analyzer;
    }
}
