package org.eclipselabs.recommenders.test.codesearch.rcp.dsl;

import org.junit.Test;

public class ComplexQueryTest extends DslTestBase {

    @Test
    public void testMultipleFields01() throws Exception {

        super.setUp();
        getParseResultAndExpect(
                "Type:method AND Modifiers:private AND UsedTypes:org.eclipse.recommenders.codesearch.FeatureWeights", 0);
    }

    @Test
    public void testMultipleFields02() throws Exception {

        super.setUp();
        getParseResultAndExpect(
                "Type:method AND UsedTypes:org.eclipse.recommenders.codesearch.FeatureWeights AND Modifiers:private", 0);
    }

    @Test
    public void testMultipleFields03() throws Exception {

        super.setUp();
        getParseResultAndExpect("Type:method AND Modifiers:private", 0);
    }

    @Test
    public void testMultipleFields04() throws Exception {

        super.setUp();
        getParseResultAndExpect(
                "Type:method AND (UsedTypes:org.eclipse.recommenders.codesearch.FeatureWeights OR Modifiers:private)",
                0);
    }

    @Test
    public void testMultipleFields05() throws Exception {

        super.setUp();
        getParseResultAndExpect(
                "Type:method AND (UsedTypes:org.eclipse.recommenders.codesearch.FeatureWeights OR Modifiers:private OR Type:type)",
                0);
    }
}
