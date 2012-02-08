package org.eclipselabs.recommenders.test.codesearch.rcp.dsl;

import org.junit.Test;

public class DefaultFieldTest extends DslTestBase {

    @Test
    public void testMultipleFields01() throws Exception {
        super.setUp();

        getParseResultAndExpect("String", 0); // Default field
    }
}
