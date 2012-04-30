package org.eclipselabs.recommenders.test.codesearch.rcp.dslQL1;

import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.QL1StandaloneSetup;
import org.junit.Test;

public class TransformationTest extends QL1TestBase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        with(QL1StandaloneSetup.class);
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

        String query = "* *(Map)";
        String expected = "Type:(method) AND ParameterTypesStructural:L*Map;";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestParametersPreselectionSingle02() throws Exception {
        setUp();

        String query = "* * (*List, Map)";
        String expected = "Type:(method) AND ParameterTypesStructural:L*List;L*Map;";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestParametersPreselectionMulti() throws Exception {
        setUp();

        String query = "* *({*List | Map}, String)";
        String expected = "Type:(method) AND (ParameterTypesStructural:L*List;L*String; ParameterTypesStructural:L*Map;L*String;)";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestParametersPreselectionMulti02() throws Exception {
        setUp();

        String query = "* *(String, {*List | Map})";
        String expected = "Type:(method) AND (ParameterTypesStructural:L*String;L*List; ParameterTypesStructural:L*String;L*Map;)";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestParametersPreselectionMulti03() throws Exception {
        setUp();

        String query = "* *(String, {*List | Map}, ..)";
        String expected = "Type:(method) AND (ParameterTypesStructural:L*String;L*List;* ParameterTypesStructural:L*String;L*Map;*)";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestParametersPreselectionMulti04() throws Exception {
        setUp();

        String query = "* *(.., String, {*List | Map})";
        String expected = "Type:(method) AND (ParameterTypesStructural:*L*String;L*List; ParameterTypesStructural:*L*String;L*Map;)";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestParametersPreselectionMulti05() throws Exception {
        setUp();

        String query = "* *(String, *, {*Tree | Map})";
        String expected = "Type:(method) AND (ParameterTypesStructural:L*String;L*;L*Tree; ParameterTypesStructural:L*String;L*;L*Map;)";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestParametersPreselectionMulti06() throws Exception {
        setUp();

        String query = "* *(String, .., {*List | Map})";
        String expected = "Type:(method) AND (ParameterTypesStructural:L*String;*L*List; ParameterTypesStructural:L*String;*L*Map;)";

        testQuery(query, expected);
    }

    @Test
    public void transformToLuceneQueryTestAnyParameters() throws Exception {
        setUp();

        String query = "* *(..)";
        String expected = "Type:(method) AND (ParameterTypesStructural:*)";

        testQuery(query, expected);
    }
}
