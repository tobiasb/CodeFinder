package org.eclipselabs.recommenders.test.codesearch;

import java.io.StringReader;
import java.util.Map;

import junit.framework.Assert;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.IQueryExtractor;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.LuceneQueryExtractor;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.internal.LuceneQueryActivator;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.queryhandler.Node;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.queryhandler.ParameterValidator;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.QL2QueryExtractor;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.VariableExtractor;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.VariableUsage;

import com.google.inject.Injector;

public abstract class QLTestBase extends AbstractXtextTests {

    private Injector luceneInjector = null;

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        final LuceneQueryActivator activator = LuceneQueryActivator.getInstance();
        luceneInjector = activator
                .getInjector(LuceneQueryActivator.ORG_ECLIPSELABS_RECOMMENDERS_CODESEARCH_RCP_DSL_LUCENEQUERY);
    }

    protected IParseResult parse(String query) throws Exception {
        return getParser().parse(new StringReader(String.format(query)));
    }

    protected String serializeLuceneQuery(EObject o) {

        ISerializer s = luceneInjector.getInstance(ISerializer.class);
        return s.serialize(o);
    }

    protected void assertQueryEqual(String expected, String actual) {
        Assert.assertEquals(sanitize(expected), sanitize(actual));
    }

    private String sanitize(String s) {
        return s.replace("(", "").replace(")", "").replace(" ", "").replace("\r", "").replace("\n", "");
    }

    protected <T extends IQueryExtractor> void testQuery(String query, String expected, T qe) throws Exception {

        // QL1QueryExtractor qe = new QL1QueryExtractor();

        IParseResult result = parse(query);
        EObject o = qe.transform(result);

        assertQueryEqual(expected, serializeLuceneQuery(o));
    }

    protected void checkGraphTrue(Node n, String s) {
        assertTrue(ParameterValidator.paramGraphFitsActualParams(n, s.split(";")));
    }

    protected void checkGraphFalse(Node n, String s) {
        assertFalse(ParameterValidator.paramGraphFitsActualParams(n, s.split(";")));
    }

    protected void testQuery(String query, String[] expected) throws Exception {
        QL2QueryExtractor qe = new QL2QueryExtractor();

        IParseResult result = parse(query);

        assertFalse(result.hasSyntaxErrors());

        Map<String, VariableUsage> map = new VariableExtractor().getVars(result.getRootASTElement());

        assertEquals(expected.length, map.size());

        for (int i = 0; i < expected.length; i++) {

            EObject o = qe.transform((VariableUsage) map.values().toArray()[i]);

            LuceneQueryExtractor lextr = new LuceneQueryExtractor();
            lextr.process(o.eAllContents());

            assertQueryEqual(expected[i], serializeLuceneQuery(o));
        }

    }

    protected Map<String, VariableUsage> parseAndExtractVars(String s) throws Exception {
        IParseResult r = getParseResultAndExpect(String.format(s), 0);
        return new VariableExtractor().getVars(r.getRootASTElement());
    }
}
