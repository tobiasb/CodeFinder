package org.eclipselabs.recommenders.test.codesearch.rcp.dslQL2;

import java.util.Map;

import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.QL2StandaloneSetup;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.VariableUsage;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui.contentassist.QL2ProposalProvider;
import org.eclipselabs.recommenders.test.codesearch.QLTestBase;
import org.junit.Test;

public class VariableDiscoveryTest extends QLTestBase {

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

        Map<String, VariableUsage> result = parseAndExtractVars("(X varX)%n{%nvar A varA = *%nvar B varB = *%nvar C varC%n}");

        assertEquals(4, result.size());
        assertTrue(result.containsKey("varA"));
        assertTrue(result.containsKey("varB"));
        assertTrue(result.containsKey("varC"));
        assertTrue(result.containsKey("varX"));
    }

    @Test
    public void variableDiscoveryTestMethodParam() throws Exception {
        setUp();

        Map<String, VariableUsage> result = parseAndExtractVars("(TypeX varX)%n");

        assertEquals(1, result.size());
        assertTrue(result.containsKey("varX"));
    }

    @Test
    public void variableDiscoveryTestOneVar() throws Exception {
        setUp();

        Map<String, VariableUsage> result = parseAndExtractVars("{%n var TypeA varA%n}");

        assertEquals(1, result.size());
        assertTrue(result.containsKey("varA"));
    }

    @Test
    public void variableDiscoveryTestOneVarFullyQualified() throws Exception {
        setUp();

        Map<String, VariableUsage> result = parseAndExtractVars("{%n var x.y.z.TypeA varA%n}");

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
    public void variableDiscoveryMethodCallNonExistentVarTest() throws Exception {
        setUp();

        Map<String, VariableUsage> result = parseAndExtractVars("{%ncall varA.testMethod()%n}");

        assertEquals(0, result.size());
    }

    @Test
    public void variableDiscoveryMethodCallTest() throws Exception {
        setUp();

        Map<String, VariableUsage> result = parseAndExtractVars("{%nvar A varA = *%ncall varA.testMethod()%n}");

        assertEquals(1, result.size());
        assertTrue(result.containsKey("varA"));
        assertEquals(1, result.get("varA").calledMethodsOnVariable.size());
        assertEquals("testMethod", result.get("varA").calledMethodsOnVariable.get(0));
    }
}
