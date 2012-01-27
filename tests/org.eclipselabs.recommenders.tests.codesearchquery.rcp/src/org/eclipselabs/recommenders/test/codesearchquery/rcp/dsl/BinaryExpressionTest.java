package org.eclipselabs.recommenders.test.codesearchquery.rcp.dsl;

import org.junit.Test;

public class BinaryExpressionTest extends DslTestBase {

	@Test
	public void testAnd01() throws Exception {

    	super.setUp();
        getParseResultAndExpect("UsedTypes:java.util.List AND UsedTypes:java.util.Map", 0);
	}

	@Test
	public void testAnd02WithBrackets() throws Exception {

    	super.setUp();
        getParseResultAndExpect("(UsedTypes:java.util.List) AND (UsedTypes:java.util.Map)", 0);
	}

	@Test
	public void testAnd03Fail() throws Exception {

    	super.setUp();
        getParseResultAndExpect("(UsedTypes:java.util.List) and (UsedTypes:java.util.Map)", 1);
	}

	@Test
	public void testOr01() throws Exception {

    	super.setUp();
        getParseResultAndExpect("UsedTypes:java.util.List OR UsedTypes:java.util.Map", 0);
	}

	@Test
	public void testOr02WithBrackets() throws Exception {

    	super.setUp();
        getParseResultAndExpect("(UsedTypes:java.util.List) OR (UsedTypes:java.util.Map)", 0);
	}

	@Test
	public void testOr03Fail() throws Exception {

    	super.setUp();
        getParseResultAndExpect("(UsedTypes:java.util.List) or (UsedTypes:java.util.Map)", 1);
	}

	@Test
	public void testImplicitOr01() throws Exception {

    	super.setUp();
        getParseResultAndExpect("UsedTypes:java.util.List UsedTypes:java.util.Map", 0);
	}

	@Test
	public void testImplicitOr02() throws Exception {

    	super.setUp();
        getParseResultAndExpect("UsedTypes:java.util.List UsedTypes:java.util.Map OR UsedTypes:java.util.List", 0);
	}
}
