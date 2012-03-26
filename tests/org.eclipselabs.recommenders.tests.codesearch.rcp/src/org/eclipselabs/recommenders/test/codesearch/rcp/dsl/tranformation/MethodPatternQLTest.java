package org.eclipselabs.recommenders.test.codesearch.rcp.dsl.tranformation;

import java.util.List;

import org.eclipse.recommenders.internal.codesearch.rcp.views.MethodPatternQLEditorWrapper;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.QL1QueryExtractor;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.QL1StandaloneSetup;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.queryhandler.Node;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.queryhandler.NodeWalker;
import org.eclipselabs.recommenders.test.codesearch.QLTestBase;
import org.junit.Test;

public class MethodPatternQLTest extends QLTestBase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        with(QL1StandaloneSetup.class);
    }

    private void testQuery(String query, String expected) throws Exception {
        super.testQuery(query, expected, new QL1QueryExtractor());
    }

    @Test
    public void transformToLuceneQueryTestOnlyModifier01() throws Exception {
        setUp();

        String query = "public * *";
        String expected = "Type:(method) AND (Modifiers):public";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestOnlyModifiers() throws Exception {
        setUp();

        String query = "public static * *";
        String expected = "Type:(method) AND (Modifiers):public AND (Modifiers):static";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestOptionalParts() throws Exception {
        setUp();

        String query = "public * testName";
        String expected = "Type:(method) AND Modifiers:(public) AND FriendlyName:(testName)";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestThrows() throws Exception {
        setUp();

        String query = "* * throws exception";
        String expected = "Type:(method) AND CheckedExceptions:(exception) ";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestOnlyModifier02() throws Exception {
        setUp();

        String query = "public * *()";
        String expected = "Type:(method) AND Modifiers:(public) AND ParameterCount:0";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestEmptyQuery() throws Exception {
        setUp();

        String query = "* *()";
        String expected = "Type:(method) AND ParameterCount:0";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestParametersPreselectionSingle() throws Exception {
        setUp();

        String query = "* *(List)";
        String expected = "Type:(method) AND ParameterTypesStructural:List;";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestParametersPreselectionSingle02() throws Exception {
        setUp();

        String query = "* * (List, Map)";
        String expected = "Type:(method) AND ParameterTypesStructural:List;Map;";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestParametersPreselectionMulti() throws Exception {
        setUp();

        String query = "* *({List | Map}, String)";
        String expected = "Type:(method) AND (ParameterTypesStructural:List;String; ParameterTypesStructural:Map;String;)";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestParametersPreselectionMulti02() throws Exception {
        setUp();

        String query = "* *(String, {List | Map})";
        String expected = "Type:(method) AND (ParameterTypesStructural:String;List; ParameterTypesStructural:String;Map;)";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestParametersPreselectionMulti03() throws Exception {
        setUp();

        String query = "* *(String, {List | Map}, ..)";
        String expected = "Type:(method) AND (ParameterTypesStructural:String;List;* ParameterTypesStructural:String;Map;*)";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestParametersPreselectionMulti04() throws Exception {
        setUp();

        String query = "* *(.., String, {List | Map})";
        String expected = "Type:(method) AND (ParameterTypesStructural:*String;List; ParameterTypesStructural:*String;Map;)";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestParametersPreselectionMulti05() throws Exception {
        setUp();

        String query = "* *(String, *, {List | Map})";
        String expected = "Type:(method) AND (ParameterTypesStructural:String;*List; ParameterTypesStructural:String;*Map;)";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestParametersPreselectionMulti06() throws Exception {
        setUp();

        String query = "* *(String, .., {List | Map})";
        String expected = "Type:(method) AND (ParameterTypesStructural:String;*List; ParameterTypesStructural:String;*Map;)";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestAnyParameters() throws Exception {
        setUp();

        String query = "* *(..)";
        String expected = "Type:(method) AND (ParameterTypesStructural:*)";

        testQuery(query, expected);
    }

    @Test
    public void createParameterQueryPartCombinationsTest() {
        final Node n1 = new Node("T1");
        final Node n2 = new Node("T21", "T22");

        n1.nextNode = n2; // wiring

        NodeWalker nw = new NodeWalker();
        List<StringBuilder> result = nw.walk(n1);

        assertTrue(result.size() == 2);
        assertEquals("T1;T21;", result.get(0).toString());
        assertEquals("T1;T22;", result.get(1).toString());
    }

    @Test
    public void paramGraphFitsTestSimple() {
        final Node n1 = new Node("T1");
        final Node n2 = new Node("T21");
        n1.nextNode = n2; // wiring

        String actualParams = "T1;T21;";

        checkGraphTrue(n1, actualParams);
    }

    @Test
    public void paramGraphFitsTestSimple01() {
        final Node n1 = new Node("T1");
        final Node n2 = new Node("T21", "T22");
        n1.nextNode = n2; // wiring

        checkGraphTrue(n1, "T1;T21;");
        checkGraphTrue(n1, "T1;T22;");
    }

    @Test
    public void paramGraphFitsAnyOneTest() {
        final Node n1 = new Node("T1");
        final Node n2 = new Node("*");
        final Node n3 = new Node("T21", "T22");
        n1.nextNode = n2; // wiring
        n2.nextNode = n3; // wiring

        checkGraphTrue(n1, "T1;foo;T21;");
        checkGraphTrue(n1, "T1;foo;T22;");

        checkGraphFalse(n1, "T1;T22;");
        checkGraphFalse(n1, "T1;foo;bar;T22;");
    }

    @Test
    public void paramGraphFitsAnyOneTest02() {
        final Node n1 = new Node("*");
        final Node n2 = new Node("T1");
        final Node n3 = new Node("T21", "T22");
        n1.nextNode = n2; // wiring
        n2.nextNode = n3; // wiring

        checkGraphTrue(n1, "foo;T1;T21;");
        checkGraphTrue(n1, "foo;T1;T22;");

        checkGraphFalse(n1, "T1;T22;");
        checkGraphFalse(n1, "T1;foo;bar;T22;");
        checkGraphFalse(n1, "foo;T1;T22;bar;");
    }

    @Test
    public void paramGraphFitsAnyOneTest03() {
        final Node n1 = new Node("T1");
        final Node n2 = new Node("T21", "T22");
        final Node n3 = new Node("*");
        n1.nextNode = n2; // wiring
        n2.nextNode = n3; // wiring

        checkGraphTrue(n1, "T1;T21;foo;");
        checkGraphTrue(n1, "T1;T22;foo;");

        checkGraphFalse(n1, "T1;T22;");
        checkGraphFalse(n1, "T1;foo;bar;T22;");
    }

    @Test
    public void paramGraphFitsAnyOneTest04() {
        final Node n1 = new Node("*");
        final Node n2 = new Node("T1");
        final Node n3 = new Node("*");
        final Node n4 = new Node("T21", "T22");
        final Node n5 = new Node("*");
        n1.nextNode = n2; // wiring
        n2.nextNode = n3; // wiring
        n3.nextNode = n4; // wiring
        n4.nextNode = n5; // wiring

        checkGraphTrue(n1, "bar;T1;bla;T21;foo;");
        checkGraphTrue(n1, "bar;T1;bla;T22;foo;");

        checkGraphFalse(n1, "T1;T22;");
        checkGraphFalse(n1, "T1;foo;bar;T22;");
    }

    @Test
    public void paramGraphFitsAnyTest() {
        final Node n1 = new Node("T1");
        final Node n2 = new Node("..");
        final Node n3 = new Node("T21", "T22");
        n1.nextNode = n2; // wiring
        n2.nextNode = n3; // wiring

        checkGraphTrue(n1, "T1;foo;T21;");
        checkGraphTrue(n1, "T1;foo;T22;");

        checkGraphTrue(n1, "T1;T22;");
        checkGraphTrue(n1, "T1;foo;bar;T22;");
    }

    @Test
    public void paramGraphFitsAnyTest02() {
        final Node n1 = new Node("..");
        final Node n2 = new Node("T1");
        final Node n3 = new Node("T21", "T22");
        n1.nextNode = n2; // wiring
        n2.prevNode = n1; // wiring
        n2.nextNode = n3; // wiring

        checkGraphTrue(n1, "foo;T1;T21;");
        checkGraphTrue(n1, "foo;T1;T22;");

        checkGraphTrue(n1, "foo;foo;T1;T22;");
        checkGraphTrue(n1, "foo;foo;foo;T1;T21;");
    }

    @Test
    public void paramGraphFitsAnyTest03() {
        final Node n1 = new Node("T1");
        final Node n2 = new Node("T21", "T22");
        final Node n3 = new Node("..");
        n1.nextNode = n2; // wiring
        n2.prevNode = n1; // wiring
        n2.nextNode = n3; // wiring

        checkGraphTrue(n1, "T1;T21;foo;");
        checkGraphTrue(n1, "T1;T22;foo;");

        checkGraphTrue(n1, "T1;T22;");
        checkGraphTrue(n1, "T1;T22;foo;bar;");
    }

    @Test
    public void paramGraphFitsAnyTest04() {
        final Node n1 = new Node("..");
        final Node n2 = new Node("T1");
        final Node n3 = new Node("..");
        n1.nextNode = n2; // wiring
        n2.prevNode = n1; // wiring
        n2.nextNode = n3; // wiring
        n3.prevNode = n2; // wiring

        checkGraphTrue(n1, "foo;T1;T21;");
        checkGraphTrue(n1, "foo;T1;bar;");

        checkGraphTrue(n1, "foo;foo;T1;T22;bar;fobar;");
        checkGraphTrue(n1, "foo;foo;foo;T1;T21;");
    }

    @Test
    public void paramGraphFitsAnyTest05() {
        final Node n1 = new Node("..");
        final Node n2 = new Node("T1");
        n1.nextNode = n2; // wiring
        n2.prevNode = n1; // wiring

        checkGraphTrue(n1, "T1;");
        checkGraphTrue(n1, "foo;T1;");
        checkGraphTrue(n1, "foo;bar;T1;");

        checkGraphFalse(n1, "foo;foo;T1;T22;bar;fobar;");
        checkGraphFalse(n1, "foo;foo;foo;T1;T21;");
    }

    @Test
    public void paramGraphFitsAnyTest06() {
        final Node n1 = new Node("T1");
        final Node n2 = new Node("..");
        n1.nextNode = n2; // wiring
        n2.prevNode = n1; // wiring

        checkGraphTrue(n1, "T1;");
        checkGraphTrue(n1, "T1;foo;");
        checkGraphTrue(n1, "T1;foo;bar;");

        checkGraphFalse(n1, "foo;foo;T1;T22;bar;fobar;");
        checkGraphFalse(n1, "foo;foo;foo;T1;T21;");
    }

    @Test
    public void paramGraphFitsNotTestSimple01() {
        final Node n1 = new Node("T1");
        final Node n2 = new Node("T21", "T22");
        n1.nextNode = n2; // wiring
        n2.prevNode = n1; // wiring

        checkGraphFalse(n1, "T1;T21;T31;");
        checkGraphFalse(n1, "T1;T23;");
    }

    /**
     * Test example queries that are being shown in UI. This is just a
     * syntactical test.
     * 
     * @throws Exception
     */
    @Test
    public void testExamples() throws Exception {
        setUp();

        MethodPatternQLEditorWrapper w = new MethodPatternQLEditorWrapper();
        QL1QueryExtractor qe = new QL1QueryExtractor();

        for (String exampleQuery : w.getExampleQueriesInternal()) {
            IParseResult result = getParseResultAndExpect(exampleQuery, 0);
        }
    }
}
