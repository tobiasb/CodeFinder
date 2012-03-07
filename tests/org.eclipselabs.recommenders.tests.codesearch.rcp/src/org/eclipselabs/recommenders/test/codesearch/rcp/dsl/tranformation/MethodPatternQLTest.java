package org.eclipselabs.recommenders.test.codesearch.rcp.dsl.tranformation;

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
}
