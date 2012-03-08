package org.eclipselabs.recommenders.test.codesearch.rcp.dsl.tranformation;

import java.util.List;

import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.QL1QueryExtractor;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.queryhandler.Node;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.queryhandler.NodeWalker;
import org.junit.Ignore;
import org.junit.Test;

public class MethodPatternQLTest extends MethodPatternQLTestBase {

    @Test
    public void transformToLuceneQueryTestOnlyModifier01() throws Exception {
        super.setUp();

        String query = "public * *";
        String expected = "Type:(method) AND (Modifiers):public";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestOnlyModifiers() throws Exception {
        super.setUp();

        String query = "public static * *";
        String expected = "Type:(method) AND (Modifiers):public AND (Modifiers):static";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestOptionalParts() throws Exception {
        super.setUp();

        String query = "public * testName";
        String expected = "Type:(method)AND Modifiers:(public) AND FriendlyName:(testName)";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestThrows() throws Exception {
        super.setUp();

        String query = "* * throws exception";
        String expected = "Type:(method) AND CheckedExceptions:(exception) ";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestOnlyModifier02() throws Exception {
        super.setUp();

        String query = "public * *()";
        String expected = "Type:(method)AND Modifiers:(public) ";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestEmptyQuery() throws Exception {
        super.setUp();

        String query = "* *()";
        String expected = "Type:(method) AND Type:(method)";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestParametersPreselectionSingle() throws Exception {
        super.setUp();

        String query = "* *(List)";
        String expected = "Type:(method) AND ParameterTypesStructural:List;";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestParametersPreselectionSingle02() throws Exception {
        super.setUp();

        String query = "* *(List, Map)";
        String expected = "Type:(method) AND ParameterTypesStructural:List;Map;";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestParametersPreselectionMulti() throws Exception {
        super.setUp();

        String query = "* *({List | Map}, String)";
        String expected = "Type:(method) AND (ParameterTypesStructural:List;String; ParameterTypesStructural:Map;String;)";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestParametersPreselectionMulti02() throws Exception {
        super.setUp();

        String query = "* *(String, {List | Map})";
        String expected = "Type:(method) AND (ParameterTypesStructural:String;List; ParameterTypesStructural:String;Map;)";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestParametersPreselectionMulti03() throws Exception {
        super.setUp();

        String query = "* *(String, {List | Map}, ..)";
        String expected = "Type:(method) AND (ParameterTypesStructural:String;List;* ParameterTypesStructural:String;Map;*)";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestParametersPreselectionMulti04() throws Exception {
        super.setUp();

        String query = "* *(.., String, {List | Map})";
        String expected = "Type:(method) AND (ParameterTypesStructural:*String;List; ParameterTypesStructural:*String;Map;)";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestParametersPreselectionMulti05() throws Exception {
        super.setUp();

        String query = "* *(String, *, {List | Map})";
        String expected = "Type:(method) AND (ParameterTypesStructural:String;*List; ParameterTypesStructural:String;*Map;)";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestParametersPreselectionMulti06() throws Exception {
        super.setUp();

        String query = "* *(String, .., {List | Map})";
        String expected = "Type:(method) AND (ParameterTypesStructural:String;*List; ParameterTypesStructural:String;*Map;)";

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

        QL1QueryExtractor qe = new QL1QueryExtractor();

        String actualParams = "T1;T21;";

        assertTrue(qe.paramGraphFitsActualParams(n1, actualParams.split(";")));
    }

    @Test
    public void paramGraphFitsTestSimple01() {
        final Node n1 = new Node("T1");
        final Node n2 = new Node("T21", "T22");
        n1.nextNode = n2; // wiring

        QL1QueryExtractor qe = new QL1QueryExtractor();

        assertTrue(qe.paramGraphFitsActualParams(n1, "T1;T21;".split(";")));
        assertTrue(qe.paramGraphFitsActualParams(n1, "T1;T22;".split(";")));
    }

    @Test
    public void paramGraphFitsAnyOneTest() {
        final Node n1 = new Node("T1");
        final Node n2 = new Node("*");
        final Node n3 = new Node("T21", "T22");
        n1.nextNode = n2; // wiring
        n2.nextNode = n3; // wiring

        QL1QueryExtractor qe = new QL1QueryExtractor();

        assertTrue(qe.paramGraphFitsActualParams(n1, "T1;foo;T21;".split(";")));
        assertTrue(qe.paramGraphFitsActualParams(n1, "T1;foo;T22;".split(";")));

        assertFalse(qe.paramGraphFitsActualParams(n1, "T1;T22;".split(";")));
        assertFalse(qe.paramGraphFitsActualParams(n1, "T1;foo;bar;T22;".split(";")));
    }

    @Test
    public void paramGraphFitsAnyOneTest02() {
        final Node n1 = new Node("*");
        final Node n2 = new Node("T1");
        final Node n3 = new Node("T21", "T22");
        n1.nextNode = n2; // wiring
        n2.nextNode = n3; // wiring

        QL1QueryExtractor qe = new QL1QueryExtractor();

        assertTrue(qe.paramGraphFitsActualParams(n1, "foo;T1;T21;".split(";")));
        assertTrue(qe.paramGraphFitsActualParams(n1, "foo;T1;T22;".split(";")));

        assertFalse(qe.paramGraphFitsActualParams(n1, "T1;T22;".split(";")));
        assertFalse(qe.paramGraphFitsActualParams(n1, "T1;foo;bar;T22;".split(";")));
        assertFalse(qe.paramGraphFitsActualParams(n1, "foo;T1;T22;bar;".split(";")));
    }

    @Test
    public void paramGraphFitsAnyOneTest03() {
        final Node n1 = new Node("T1");
        final Node n2 = new Node("T21", "T22");
        final Node n3 = new Node("*");
        n1.nextNode = n2; // wiring
        n2.nextNode = n3; // wiring

        QL1QueryExtractor qe = new QL1QueryExtractor();

        assertTrue(qe.paramGraphFitsActualParams(n1, "T1;T21;foo;".split(";")));
        assertTrue(qe.paramGraphFitsActualParams(n1, "T1;T22;foo;".split(";")));

        assertFalse(qe.paramGraphFitsActualParams(n1, "T1;T22;".split(";")));
        assertFalse(qe.paramGraphFitsActualParams(n1, "T1;foo;bar;T22;".split(";")));
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

        QL1QueryExtractor qe = new QL1QueryExtractor();

        assertTrue(qe.paramGraphFitsActualParams(n1, "bar;T1;bla;T21;foo;".split(";")));
        assertTrue(qe.paramGraphFitsActualParams(n1, "bar;T1;bla;T22;foo;".split(";")));

        assertFalse(qe.paramGraphFitsActualParams(n1, "T1;T22;".split(";")));
        assertFalse(qe.paramGraphFitsActualParams(n1, "T1;foo;bar;T22;".split(";")));
    }

    @Test
    @Ignore("not possible yet")
    public void paramGraphFitsAnyTest() {
        final Node n1 = new Node("T1");
        final Node n2 = new Node("..");
        final Node n3 = new Node("T21", "T22");
        n1.nextNode = n2; // wiring
        n2.nextNode = n3; // wiring

        QL1QueryExtractor qe = new QL1QueryExtractor();

        assertTrue(qe.paramGraphFitsActualParams(n1, "T1;foo;T21;".split(";")));
        assertTrue(qe.paramGraphFitsActualParams(n1, "T1;foo;T22;".split(";")));

        assertTrue(qe.paramGraphFitsActualParams(n1, "T1;T22;".split(";")));
        assertTrue(qe.paramGraphFitsActualParams(n1, "T1;foo;bar;T22;".split(";")));
    }

    @Test
    public void paramGraphFitsNotTestSimple01() {
        final Node n1 = new Node("T1");
        final Node n2 = new Node("T21", "T22");
        n1.nextNode = n2; // wiring

        QL1QueryExtractor qe = new QL1QueryExtractor();

        assertFalse(qe.paramGraphFitsActualParams(n1, "T1;T21;T31;".split(";")));
        assertFalse(qe.paramGraphFitsActualParams(n1, "T1;T23;".split(";")));
    }
}
