package org.eclipselabs.recommenders.test.codesearch.rcp.dslQL2;

import org.eclipse.recommenders.codesearch.rcp.index.searcher.SearchResult;
import org.eclipse.recommenders.codesearch.rcp.searcher.CodeSnippetQLSearcher;
import org.eclipse.recommenders.test.codesearch.rcp.indexer.TestBase;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.QL2StandaloneSetup;
import org.junit.Test;

public class VariableIdentityTest extends QL2TestBase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        with(QL2StandaloneSetup.class);
    }

    @Test
    public void testPositiveCase() throws Exception {
        setUp();

        TestBase tb = new TestBase();
        tb.exercise(VariableIdentityTestStrings.testPositiveCase, getVarUsageIndexer());

        IParseResult parseResult = parse(VariableIdentityTestStrings.varIdentityQueryString.toString());
        assertFalse(parseResult.hasSyntaxErrors());

        CodeSnippetQLSearcher QL2Searcher = new CodeSnippetQLSearcher(luceneInjector);
        SearchResult searchResult = QL2Searcher.search(tb.search, parseResult);

        assertEquals(1, searchResult.scoreDocs().length);
    }

    @Test
    public void testNegativeCase() throws Exception {
        setUp();

        TestBase tb = new TestBase();
        tb.exercise(VariableIdentityTestStrings.testNegativeCase, getVarUsageIndexer());

        IParseResult parseResult = parse(VariableIdentityTestStrings.varIdentityQueryString.toString());
        assertFalse(parseResult.hasSyntaxErrors());

        CodeSnippetQLSearcher QL2Searcher = new CodeSnippetQLSearcher(luceneInjector);
        SearchResult searchResult = QL2Searcher.search(tb.search, parseResult);

        assertEquals(0, searchResult.scoreDocs().length);
    }
}
