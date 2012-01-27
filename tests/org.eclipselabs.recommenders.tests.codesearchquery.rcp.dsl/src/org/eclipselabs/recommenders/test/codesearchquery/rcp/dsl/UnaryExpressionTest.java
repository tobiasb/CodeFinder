package org.eclipselabs.recommenders.test.codesearchquery.rcp.dsl;

import org.junit.Test;

public class UnaryExpressionTest extends DslTestBase {

	@Test
	public void testNot01() throws Exception {

        getParseResultAndExpect("!UsedTypes:java.util.List", 0);
	}

	@Test
	public void testNot02() throws Exception {

        getParseResultAndExpect("! UsedTypes:java.util.List", 0);
	}

	@Test
	public void testNot03() throws Exception {

        getParseResultAndExpect("NOT UsedTypes:java.util.List", 0);
	}

	@Test
	public void testNot04Brackets() throws Exception {

        getParseResultAndExpect("NOT(UsedTypes:java.util.List)", 0);
	}

	@Test
	public void testMust01() throws Exception {

        getParseResultAndExpect("!UsedTypes:java.util.List", 0);
	}

	@Test
	public void testMust02() throws Exception {

        getParseResultAndExpect("! UsedTypes:java.util.List", 0);
	}

	@Test
	public void testMust03Brackets() throws Exception {

        getParseResultAndExpect("!(UsedTypes:java.util.List)", 0);
	}
}
