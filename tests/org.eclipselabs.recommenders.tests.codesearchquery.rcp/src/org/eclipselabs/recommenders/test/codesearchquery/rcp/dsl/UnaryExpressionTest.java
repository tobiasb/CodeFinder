package org.eclipselabs.recommenders.test.codesearchquery.rcp.dsl;

import org.junit.Test;

public class UnaryExpressionTest extends DslTestBase {

    @Test
    public void testNot01() throws Exception {

        super.setUp();
        getParseResultAndExpect("!UsedTypes:java.util.List", 0);
    }

    @Test
    public void testNot02() throws Exception {

        super.setUp();
        getParseResultAndExpect("! UsedTypes:java.util.List", 0);
    }

    @Test
    public void testNot03() throws Exception {

        super.setUp();
        getParseResultAndExpect("NOT UsedTypes:java.util.List", 0);
    }

    @Test
    public void testNot04Brackets() throws Exception {

        super.setUp();
        getParseResultAndExpect("NOT (UsedTypes:java.util.List)", 0);
    }

    @Test
    public void testMust01() throws Exception {

        super.setUp();
        getParseResultAndExpect("!UsedTypes:java.util.List", 0);
    }

    @Test
    public void testMust02() throws Exception {

        super.setUp();
        getParseResultAndExpect("! UsedTypes:java.util.List", 0);
    }

    @Test
    public void testMust03Brackets() throws Exception {

        super.setUp();
        getParseResultAndExpect("!(UsedTypes:java.util.List)", 0);
    }

    @Test
    public void testMust04() throws Exception {

        super.setUp();
        getParseResultAndExpect("+UsedTypes:java.util.List", 0);
    }

    @Test
    public void testInFieldValue01() throws Exception {

        super.setUp();
        getParseResultAndExpect("UsedTypes:+java.util.List", 1);
        getParseResultAndExpect("UsedTypes:-java.util.List", 1);
        getParseResultAndExpect("UsedTypes:(+java.util.List)", 0);
        getParseResultAndExpect("UsedTypes:(-java.util.List)", 0);
        assertNoErrors("UsedTypes:(+java.util.List -java.util.Map)");
        assertNoErrors("UsedTypes:(-java.util.List +java.util.Map)");
    }
}
