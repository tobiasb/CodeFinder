package org.eclipse.recommenders.codesearch.rcp.index.tokenizers;

import org.apache.lucene.analysis.TokenStream;

public class CamelCaseTokenizer extends TermSplitTokenizer {

    public CamelCaseTokenizer(TokenStream in) {
        super(in);
    }

    @Override
    public String[] splitTerm(String term) {

        String newWord = term.replaceAll("([A-Z][a-z])", "_$1").replaceAll("([a-z])([A-Z])", "$1_$2");

        return newWord.split("[_]");
    }

    @Override
    protected boolean returnOriginalTerm() {
        return true;
    }
}