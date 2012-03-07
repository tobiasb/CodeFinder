package org.eclipselabs.recommenders.test.codesearch.rcp.dsl.tranformation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.QL1QueryExtractor;
import org.junit.Test;

public class MethodPatternQLTest extends MethodPatternQLTestBase {

    @Test
    public void transformToLuceneQueryTest01() throws Exception {
        super.setUp();

        QL1QueryExtractor qe = new QL1QueryExtractor();

        String query = "public * *";

        IParseResult result = parse(query);
        EObject o = qe.transform(result);

        assertQueryEqual("Type:(method) AND (Modifiers):public", serializeLuceneQuery(o));
    }

    @Test
    public void transformToLuceneQueryTest02() throws Exception {
        super.setUp();

        QL1QueryExtractor qe = new QL1QueryExtractor();

        String query = "public static * *";

        IParseResult result = parse(query);
        EObject o = qe.transform(result);

        assertQueryEqual("Type:(method) AND (Modifiers):public AND (Modifiers):static", serializeLuceneQuery(o));
    }

    @Test
    public void transformToLuceneQueryTest03() throws Exception {
        super.setUp();

        QL1QueryExtractor qe = new QL1QueryExtractor();

        String query = "public * testName";

        IParseResult result = parse(query);
        EObject o = qe.transform(result);

        assertQueryEqual("Type:(method)AND Modifiers:(public) AND FriendlyName:(testName) ", serializeLuceneQuery(o));
    }

    @Test
    public void transformToLuceneQueryTest04() throws Exception {
        super.setUp();

        QL1QueryExtractor qe = new QL1QueryExtractor();

        String query = "public * * throws exception";

        IParseResult result = parse(query);
        EObject o = qe.transform(result);

        assertQueryEqual("Type:(method)AND Modifiers:(public) AND CheckedExceptions:(exception) ",
                serializeLuceneQuery(o));
    }
}
