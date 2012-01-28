package org.eclipselabs.recommenders.test.codesearchquery.rcp.dsl;

import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;
import org.junit.Test;

public class PathFieldTest extends DslTestBase {

    @Test
    public void testSimplePath() throws Exception {

        super.setUp();
        getParseResultAndExpect(field(Fields.RESOURCE_PATH, "C:/Test.java"), 0);
    }

    @Test
    public void testWildcardPath01() throws Exception {

        super.setUp();
        getParseResultAndExpect(field(Fields.RESOURCE_PATH, "C:/Test.*"), 0);
        getParseResultAndExpect(field(Fields.RESOURCE_PATH, "C:/Test*.java"), 0);
    }

    @Test
    public void testWildcardPath02() throws Exception {

        super.setUp();
        getParseResultAndExpect(field(Fields.RESOURCE_PATH, "C:/Subfolder/Test.*"), 0);
        getParseResultAndExpect(field(Fields.RESOURCE_PATH, "C:/Subfolder/Test*.java"), 0);
    }

    @Test
    public void testWildcardPath03() throws Exception {

        super.setUp();
        getParseResultAndExpect(field(Fields.RESOURCE_PATH, "C:/Subf?lder/Test.*"), 0);
        getParseResultAndExpect(field(Fields.RESOURCE_PATH, "C:/Subf?lder/Test*.java"), 0);
        getParseResultAndExpect(field(Fields.RESOURCE_PATH, "C:/Subf*lder/Test.*"), 0);
        getParseResultAndExpect(field(Fields.RESOURCE_PATH, "C:/Subf*lder/Test*.java"), 0);
    }
}
