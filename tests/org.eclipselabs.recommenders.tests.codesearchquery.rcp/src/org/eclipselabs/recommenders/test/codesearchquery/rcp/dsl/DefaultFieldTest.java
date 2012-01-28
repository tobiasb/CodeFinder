package org.eclipselabs.recommenders.test.codesearchquery.rcp.dsl;

import org.junit.Test;

public class DefaultFieldTest extends DslTestBase {

    @Test
    public void testMultipleFields01() throws Exception {
        super.setUp();

        getParseResultAndExpect("String", 0); // Default field
    }
}
