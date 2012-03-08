package org.eclipselabs.recommenders.test.codesearch.rcp.dsl.tranformation;

import java.io.StringReader;

import junit.framework.Assert;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.internal.LuceneQueryActivator;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.QL1QueryExtractor;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.QL1StandaloneSetup;

import com.google.inject.Injector;

public abstract class MethodPatternQLTestBase extends AbstractXtextTests {

    private Injector luceneInjector = null;

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        final LuceneQueryActivator activator = LuceneQueryActivator.getInstance();
        luceneInjector = activator
                .getInjector(LuceneQueryActivator.ORG_ECLIPSELABS_RECOMMENDERS_CODESEARCH_RCP_DSL_LUCENEQUERY);

        with(QL1StandaloneSetup.class);
    }

    protected IParseResult parse(String query) throws Exception {
        return getParser().parse(new StringReader(query));
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

    protected void testQuery(String query, String expected) throws Exception {

        QL1QueryExtractor qe = new QL1QueryExtractor();

        IParseResult result = parse(query);
        EObject o = qe.transform(result);

        assertQueryEqual(expected, serializeLuceneQuery(o));
    }
}
