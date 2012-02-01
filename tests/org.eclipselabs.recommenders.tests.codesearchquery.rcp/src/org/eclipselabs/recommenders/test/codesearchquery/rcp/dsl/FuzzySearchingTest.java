package org.eclipselabs.recommenders.test.codesearchquery.rcp.dsl;

import org.junit.Ignore;
import org.junit.Test;

public class FuzzySearchingTest extends DslTestBase {

    @Test
    @Ignore("Fuzzy Search not working yet")
    public void testSimpleFuzzySearching() throws Exception {
        super.setUp();

        getParseResultAndExpect("toString~0.4", 0);
        getParseResultAndExpect("toString~1.4", 1);
        getParseResultAndExpect("toString~0", 1);
    }

    @Test
    @Ignore("Fuzzy Search not working yet")
    public void testSimpleFuzzySearchingWithBoost() throws Exception {
        super.setUp();

        getParseResultAndExpect("toString~0.4^2", 0);
    }

    @Test
    @Ignore("Fuzzy Search not working yet")
    public void testFuzzySearchingTerms01() throws Exception {
        super.setUp();

        getParseResultAndExpect("FriendlyName:(test~0.4)", 0);
        getParseResultAndExpect("FriendlyName:(test~4.2)", 1);
    }

    @Test
    @Ignore("Fuzzy Search not working yet")
    public void testFuzzySearchingTerms01WithBoost() throws Exception {
        super.setUp();

        getParseResultAndExpect("FriendlyName:(test~0.4^2)", 0);
        getParseResultAndExpect("FriendlyName:(test~0.4)^2", 0);
    }

    @Test
    @Ignore("Fuzzy Search not working yet")
    public void testFuzzySearchingTerms02() throws Exception {
        super.setUp();

        getParseResultAndExpect("FriendlyName:(test~0.4 bla~0.3)", 0);
        getParseResultAndExpect("FriendlyName:(test~4.5 bla~3)", 1);
    }

    @Test
    @Ignore("Fuzzy Search not working yet")
    public void testFuzzySearchingTerms02WithBoost() throws Exception {
        super.setUp();

        getParseResultAndExpect("FriendlyName:(test~0.4^2 bla~0.3)", 0);
        getParseResultAndExpect("FriendlyName:(test~0.2 bla~0.3^2)", 0);
        getParseResultAndExpect("FriendlyName:(test~0.4^2 bla~0.3^2)", 0);
        getParseResultAndExpect("FriendlyName:(test~0.2 bla~0.3)^2", 0);

        getParseResultAndExpect("FriendlyName:(test~0.4^2~0.3 bla~0.2)", 0);
        getParseResultAndExpect("FriendlyName:(test~0.2 bla~0.3^2)", 0);
        getParseResultAndExpect("FriendlyName:(test~0.4~0.3^2 bla~0.3^2)", 0);
        getParseResultAndExpect("FriendlyName:(test~0.2 bla~0.3)^2", 0);
    }

    @Test
    @Ignore("Fuzzy Search not working yet")
    public void testFuzzySearchingTermsWithBoost() throws Exception {
        super.setUp();

        assertNoErrors("(FriendlyName:(test~0.4 bla~0.3))^3");
        assertNoErrors("(FriendlyName:(test bla~0.3))~0.3");
        assertNoErrors("(FriendlyName:(test~0.8 bla~0.6))^3.1");
        assertNoErrors("(FriendlyName:(test bla~0.3))^0.3");
    }
}
