package org.eclipse.recommenders.codesearch.rcp.index.tokenizers;


import org.apache.lucene.analysis.TokenStream;

public class DotSplitTokenizer extends TermSplitTokenizer {

    public DotSplitTokenizer(TokenStream in) {
        super(in);
    }

    @Override
    public String[] splitTerm(String term) {
        String[] parts = term.split("[.]");
        return parts;
    }

    @Override
    protected boolean returnOriginalTerm()
    {
        return true;
    }
}