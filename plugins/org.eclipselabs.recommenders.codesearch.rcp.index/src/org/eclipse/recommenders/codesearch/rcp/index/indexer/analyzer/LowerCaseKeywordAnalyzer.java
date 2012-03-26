package org.eclipse.recommenders.codesearch.rcp.index.indexer.analyzer;

import java.io.Reader;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.KeywordTokenizer;
import org.apache.lucene.analysis.LowerCaseFilter;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.util.Version;

public class LowerCaseKeywordAnalyzer extends Analyzer {

    private Version luceneVersion = null;

    public LowerCaseKeywordAnalyzer(Version luceneVersion) {
        this.luceneVersion = luceneVersion;
    }

    @Override
    public TokenStream tokenStream(String fieldName, Reader reader) {
        TokenStream tokenStream = new KeywordTokenizer(reader);
        tokenStream = new LowerCaseFilter(luceneVersion, tokenStream);
        return tokenStream;
    }
}
