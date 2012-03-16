package org.eclipselabs.recommenders.test.codesearch.rcp.dsl.tranformation;

import java.util.Map;

import org.eclipse.xtext.parser.IParseResult;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.QL2QueryExtractor;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.QL2StandaloneSetup;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.VariableExtractor;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.VariableUsage;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui.contentassist.QL2ProposalProvider;
import org.eclipselabs.recommenders.test.codesearch.QLTestBase;
import org.junit.Test;

public class CodeSnippetQLTest extends QLTestBase {

    QL2ProposalProvider p = new QL2ProposalProvider();

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        with(QL2StandaloneSetup.class);
    }

    @Test
    public void variableDiscoveryTestMixed01() throws Exception {
        setUp();

        Map<String, VariableUsage> result = parseAndExtractVars("{%nvar A varA = *%nvar B varB = *%n}");

        assertEquals(2, result.size());
        assertTrue(result.containsKey("varA"));
        assertTrue(result.containsKey("varB"));
    }

    @Test
    public void variableDiscoveryTestMixed02() throws Exception {
        setUp();

        Map<String, VariableUsage> result = parseAndExtractVars("(X varX)%n{%nvar A varA = *%nvar B varB = *%nval C varC%n}");

        assertEquals(4, result.size());
        assertTrue(result.containsKey("varA"));
        assertTrue(result.containsKey("varB"));
        assertTrue(result.containsKey("varC"));
        assertTrue(result.containsKey("varX"));
    }

    @Test
    public void variableDiscoveryTestMethodParam() throws Exception {
        setUp();

        Map<String, VariableUsage> result = parseAndExtractVars("(X varX)%n{}");

        assertEquals(1, result.size());
        assertTrue(result.containsKey("varX"));
    }

    @Test
    public void variableDiscoveryTestOneVar() throws Exception {
        setUp();

        Map<String, VariableUsage> result = parseAndExtractVars("{%n val Aasdf varA%n}");

        assertEquals(1, result.size());
        assertTrue(result.containsKey("varA"));
    }

    @Test
    public void variableDiscoveryTestEmpty() throws Exception {
        setUp();

        Map<String, VariableUsage> result = parseAndExtractVars("{}");

        assertEquals(0, result.size());
    }

    @Test
    public void transformToLuceneQueryTest() throws Exception {
        setUp();

        String query = "{%n val TypeA varA%n}";
        String expected = "Type:varusage AND VariableType:TypeA";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryMultipleVarsTest() throws Exception {
        setUp();

        String query = "{%n val TypeA varA%nval TypeB varB}";
        String expected = "Type:varusage AND VariableType:TypeB AND VariableType:TypeA";

        testQuery(query, expected);
    }

    private void testQuery(String query, String expected) throws Exception {
        super.testQuery(query, expected, new QL2QueryExtractor());
    }

    private Map<String, VariableUsage> parseAndExtractVars(String s) throws Exception {
        IParseResult r = getParseResultAndExpect(String.format(s), 0);

        // if (r.hasSyntaxErrors()) {
        //
        // StringBuilder sb = new StringBuilder(String.format("Errors:%n"));
        // for (INode error : r.getSyntaxErrors()) {
        // sb.append(String.format("%s%n", error.getSyntaxErrorMessage()));
        // }
        //
        // assertTrue(sb.toString(), !r.hasSyntaxErrors());
        // }

        return new VariableExtractor().getVars(r.getRootASTElement());
    }

    @Test
    public void methodCallNonExistentVarTest() throws Exception {
        setUp();

        Map<String, VariableUsage> result = parseAndExtractVars("{%ncall varA.testMethod()%n}");

        assertEquals(1, result.size());
        assertTrue(result.containsKey("varA"));
        assertEquals(1, result.get("varA").calledMethodsOnVariable.size());
        assertEquals("testMethod", result.get("varA").calledMethodsOnVariable.get(0));
    }

    @Test
    public void methodCallTest() throws Exception {
        setUp();

        Map<String, VariableUsage> result = parseAndExtractVars("{%nvar A varA = *%ncall varA.testMethod()%n}");

        assertEquals(1, result.size());
        assertTrue(result.containsKey("varA"));
        assertEquals(1, result.get("varA").calledMethodsOnVariable.size());
        assertEquals("testMethod", result.get("varA").calledMethodsOnVariable.get(0));
    }
}
