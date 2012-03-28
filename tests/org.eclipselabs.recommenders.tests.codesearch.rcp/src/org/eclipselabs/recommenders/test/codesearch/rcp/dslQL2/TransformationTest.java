package org.eclipselabs.recommenders.test.codesearch.rcp.dslQL2;

import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.QL2StandaloneSetup;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui.contentassist.QL2ProposalProvider;
import org.eclipselabs.recommenders.test.codesearch.QLTestBase;
import org.junit.Test;

public class TransformationTest extends QLTestBase {

    QL2ProposalProvider p = new QL2ProposalProvider();

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        with(QL2StandaloneSetup.class);
    }

    @Test
    public void transformToLuceneQueryTest() throws Exception {
        setUp();

        String query = "{%n var TypeA varA%n}";
        String[] expected = new String[] { "Type:varusage AND VariableType:LTypeA AND VariableDefinition:*" };

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryDeclarationParameterTest() throws Exception {
        setUp();

        String query = "(TypeA varA){%n}";
        String[] expected = new String[] { "Type:varusageAND VariableType:LTypeA AND VariableDefinition:parameter " };

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryDeclarationMethodInvocationTest() throws Exception {
        setUp();

        String query = "{%nvar TypeA varA = *%n}";
        String[] expected = new String[] { "Type:varusage AND VariableType:LTypeA AND VariableDefinition:instanceCreation" };

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryDeclarationNoInitialisationTest() throws Exception {
        setUp();

        String query = "{%nvar TypeA varA%n}";
        String[] expected = new String[] { "Type:varusage AND VariableType:LTypeA AND VariableDefinition:*" };

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryDeclarationNullLiteralTest() throws Exception {
        setUp();

        String query = "{%nvar TypeA varA = null%n}";
        String[] expected = new String[] { "Type:varusage AND VariableType:LTypeA AND VariableDefinition:nullLiteral" };

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryMultipleVarsTest() throws Exception {
        setUp();

        String query = "{%n var TypeA varA%nvar TypeB varB}";
        String[] expected = new String[] { "Type:varusage AND VariableType:LTypeB AND VariableDefinition:*",
                "Type:varusage AND VariableType:LTypeA AND VariableDefinition:*" };

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryMethodCallTest() throws Exception {
        setUp();

        String query = "{%nvar A varA = *%ncall varA.testMethod()%n}";
        String[] expected = new String[] { "Type:varusage AND VariableType:LA AND VariableDefinition:instanceCreation AND UsedAsTargetForMethods:L*testMethod\\(*" };

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryMethodCallParameterTest() throws Exception {
        setUp();

        String query = "{%nvar A varA = *%nvar B varB = *%ncall varB.testMethod(varA)%n}";
        String[] expected = new String[] {
                "Type:varusage AND VariableType:LB AND VariableDefinition:instanceCreation AND UsedAsTargetForMethods:L*testMethod\\(*",
                "Type:varusage AND VariableType:LA AND VariableDefinition:instanceCreation AND UsedAsParameterInMethods:L*B.testMethod\\(*" };

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryStaticMethodCallParameterTest() throws Exception {
        setUp();

        String query = "{%nvar A varA = *%nscall java.lang.bla.testMethod(varA)%n}";
        String[] expected = new String[] { "Type:varusage AND VariableType:LA AND VariableDefinition:instanceCreation AND UsedAsParameterInMethods:L*java/lang/bla.testMethod\\(*" };

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryMethodCallMultipleVarsTest() throws Exception {
        setUp();

        String query = "{%nvar A varA = *%nvar B varB%ncall varA.testMethod()%ncall varB.testMethod2()%n}";
        String[] expected = new String[] {
                "Type:varusage AND VariableType:LB AND VariableDefinition:* AND UsedAsTargetForMethods:L*testMethod2\\(*",
                "Type:varusage AND VariableType:LA AND VariableDefinition:instanceCreation AND UsedAsTargetForMethods:L*testMethod\\(*" };

        testQuery(query, expected);
    }
}
