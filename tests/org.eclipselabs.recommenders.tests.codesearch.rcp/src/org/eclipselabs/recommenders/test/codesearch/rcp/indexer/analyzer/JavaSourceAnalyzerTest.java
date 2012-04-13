package org.eclipselabs.recommenders.test.codesearch.rcp.indexer.analyzer;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.TermAttribute;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.analyzer.JavaSourceCodeAnalyzer;
import org.junit.Test;

import com.google.common.collect.Lists;

public class JavaSourceAnalyzerTest {

    final JavaSourceCodeAnalyzer a = new JavaSourceCodeAnalyzer();

    @Test
    public void testLowerCase() {
        test("StringReader", new String[] { "stringreader" });
    }

    @Test
    public void testMethodName() {
        test("public String toString() { return \"\";}", new String[] { "to", "string" });
    }

    @Test
    public void testPackageNames() {
        test("java.io.StringReader", new String[] { "java", "io", "stringreader" });
    }

    @Test
    public void testCamelCase() {
        test("someCamelCaseString", new String[] { "some", "camel", "case", "string" });
    }

    @Test
    public void testCamelCase02() {
        test("SomeCamelCaseString", new String[] { "some", "camel", "case", "string" });
    }

    private void test(String text, String[] expected) {
        List<String> result = parseKeywords(a, null, text);

        for (String s : expected) {
            assertTrue(result.contains(s));
        }
    }

    private List<String> parseKeywords(Analyzer analyzer, String field, String keywords) {

        List<String> result = Lists.newArrayList();
        TokenStream stream = analyzer.tokenStream(field, new StringReader(keywords));

        try {
            while (stream.incrementToken()) {
                result.add(stream.getAttribute(TermAttribute.class).term());
            }
        } catch (IOException e) {
            // not thrown b/c we're using a string reader...
        }

        return result;
    }
}
