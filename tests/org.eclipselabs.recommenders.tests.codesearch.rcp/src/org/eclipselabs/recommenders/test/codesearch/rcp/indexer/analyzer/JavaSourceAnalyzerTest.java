package org.eclipselabs.recommenders.test.codesearch.rcp.indexer.analyzer;

import org.junit.Test;

public class JavaSourceAnalyzerTest extends AnalysisTestBase {

    @Test
    public void testLowerCase() {
        testAnalyzer("StringReader", new String[] { "stringreader" });
    }

    @Test
    public void testMethodName() {
        testAnalyzer("public String toString() { return \"\";}", new String[] { "to", "string" });
    }

    @Test
    public void testPackageNames() {
        testAnalyzer("java.io.StringReader", new String[] { "java", "io", "stringreader" });
    }

    @Test
    public void testCamelCase() {
        testAnalyzer("someCamelCaseString", new String[] { "some", "camel", "case", "string" });
    }

    @Test
    public void testCamelCase02() {
        testAnalyzer("SomeCamelCaseString", new String[] { "some", "camel", "case", "string" });
    }
}
