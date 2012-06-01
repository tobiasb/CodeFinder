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

//    @Test
//    public void transformToLuceneQueryReturnTest() throws Exception {
//        setUp();
//
//        String query = "{%n var exmpl.type.TypeA varA%nreturn varA%n}";
//        String[] expected = new String[] { "Type:varusage AND VariableType:Lexmpl/type/TypeA AND VariableDefinition:uninitialized" };
//
//        testQuery(query, expected);
//    }

    @Test
    public void transformToLuceneQueryUninitialisedTest() throws Exception {
        setUp();

        String query = "{%n var exmpl.type.TypeA varA%n}";
        String[] expected = new String[] { "Type:varusage AND VariableType:Lexmpl/type/TypeA AND VariableDefinition:uninitialized" };

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryAnyTest() throws Exception {
        setUp();

        String query = "var exmpl.type.TypeA varA%n{%n}";
        String[] expected = new String[] { "Type:varusage AND VariableType:Lexmpl/type/TypeA AND VariableDefinition:*" };

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryDeclarationParameterTest() throws Exception {
        setUp();

        String query = "(exmpl.type.TypeA varA){%n}";
        String[] expected = new String[] { "Type:varusageAND VariableType:Lexmpl/type/TypeA AND VariableDefinition:parameter " };

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryDeclarationMethodInvocationTest() throws Exception {
        setUp();

        String query = "{%nvar exmpl.type.TypeA varA = *%n}";
        String[] expected = new String[] { "Type:varusage AND VariableType:Lexmpl/type/TypeA AND VariableDefinition:assignment" };

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryDeclarationMethodInvocationTest2() throws Exception {
        setUp();

        String query = "{%nvar exmpl.type.TypeA varA = new%n}";
        String[] expected = new String[] { "Type:varusage AND VariableType:Lexmpl/type/TypeA AND VariableDefinition:instanceCreation" };

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryDeclarationNoInitialisationTest() throws Exception {
        setUp();

        String query = "{%nvar exmpl.type.TypeA varA%n}";
        String[] expected = new String[] { "Type:varusage AND VariableType:Lexmpl/type/TypeA AND VariableDefinition:uninitialized" };

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryDeclarationNullLiteralTest() throws Exception {
        setUp();

        String query = "{%nvar exmpl.type.TypeA varA = null%n}";
        String[] expected = new String[] { "Type:varusage AND VariableType:Lexmpl/type/TypeA AND VariableDefinition:nullLiteral" };

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryMultipleVarsTest() throws Exception {
        setUp();

        String query = "{%n var exmpl.type.TypeA varA%nvar exmpl.type.TypeB varB}";
        String[] expected = new String[] { "Type:varusage AND VariableType:Lexmpl/type/TypeB AND VariableDefinition:uninitialized",
                "Type:varusage AND VariableType:Lexmpl/type/TypeA AND VariableDefinition:uninitialized" };

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryMethodCallTest() throws Exception {
        setUp();

        String query = "{%nvar exmpl.type.TypeA varA = *%ncall varA.testMethod()%n}";
        String[] expected = new String[] { "Type:varusage AND VariableType:Lexmpl/type/TypeA AND VariableDefinition:assignment AND UsedAsTargetForMethods:L*.testMethod\\(*" };

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryMethodCallParameterTest() throws Exception {
        setUp();

        String query = "{%nvar exmpl.type.TypeA varA = *%nvar exmpl.type.TypeB varB = *%ncall varB.testMethod(varA)%n}";
        String[] expected = new String[] {
                "Type:varusage AND VariableType:Lexmpl/type/TypeB AND VariableDefinition:assignment AND UsedAsTargetForMethods:L*.testMethod\\(*",
                "Type:varusage AND VariableType:Lexmpl/type/TypeA AND VariableDefinition:assignment AND UsedAsParameterInMethods:L*exmpl/type/TypeB.testMethod\\(*" };

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryStaticMethodCallParameterTest() throws Exception {
        setUp();

        String query = "{%nvar exmpl.type.TypeA varA = *%nscall java.lang.bla.testMethod(varA)%n}";
        String[] expected = new String[] { "Type:varusage AND VariableType:Lexmpl/type/TypeA AND VariableDefinition:assignment AND UsedAsParameterInMethods:L*java/lang/bla.testMethod\\(*" };

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryMethodCallMultipleVarsTest() throws Exception {
        setUp();

        String query = "{%nvar exmpl.type.TypeA varA = *%nvar exmpl.type.TypeB varB%ncall varA.testMethod()%ncall varB.testMethod2()%n}";
        String[] expected = new String[] {
                "Type:varusage AND VariableType:Lexmpl/type/TypeB AND VariableDefinition:uninitialized AND UsedAsTargetForMethods:L*.testMethod2\\(*",
                "Type:varusage AND VariableType:Lexmpl/type/TypeA AND VariableDefinition:assignment AND UsedAsTargetForMethods:L*.testMethod\\(*" };

        testQuery(query, expected);
    }
}
