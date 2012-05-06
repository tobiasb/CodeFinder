package org.eclipse.recommenders.codesearch.rcp.index.tokenizers;

import org.apache.lucene.analysis.TokenStream;

public class WordSplitTokenizer extends TermSplitTokenizer {

    public WordSplitTokenizer(TokenStream in) {
        super(in);
    }

    @Override
    public String[] splitTerm(String term) {
        return term.split("[^A-Za-z0-9\u00E0-\u00FF_'.]"); // or "\\W"
    }

}