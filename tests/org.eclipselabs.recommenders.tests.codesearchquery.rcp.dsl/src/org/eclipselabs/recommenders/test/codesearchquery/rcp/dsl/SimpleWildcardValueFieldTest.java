package org.eclipselabs.recommenders.test.codesearchquery.rcp.dsl;

import org.junit.Test;

public class SimpleWildcardValueFieldTest extends DslTestBase {

	@Test
	public void testSimpleName() throws Exception {

        getParseResultAndExpect("FriendlyName:Test", 0);
        getParseResultAndExpect("FriendlyName:Test001", 0);
	}

	@Test
	public void testWildcardName() throws Exception {

        getParseResultAndExpect("FriendlyName:Test*", 0);
        getParseResultAndExpect("FriendlyName:Test001*", 0);
        getParseResultAndExpect("FriendlyName:Test*001", 0);
        getParseResultAndExpect("FriendlyName:get*Name", 0);
	}
}
