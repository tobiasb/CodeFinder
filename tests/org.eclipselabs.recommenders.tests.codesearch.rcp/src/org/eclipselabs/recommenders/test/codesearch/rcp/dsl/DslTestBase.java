package org.eclipselabs.recommenders.test.codesearch.rcp.dsl;

import java.io.StringReader;

import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.LuceneQueryStandaloneSetup;

public abstract class DslTestBase extends AbstractXtextTests {

    // private final Injector injector = new
    // LuceneQueryStandaloneSetup().createInjectorAndDoEMFRegistration();
    // private final LuceneQueryParser parser =
    // injector.getInstance(LuceneQueryParser.class);

    protected String field(final String fieldName, final String fieldValue) {
        return fieldName + ":" + fieldValue;
    }

    protected String field(final String fieldName, final int fieldValue) {
        return field(fieldName, String.valueOf(fieldValue));
    }

    protected IParseResult parse(String query) {
        return getParser().parse(new StringReader(query));
    }

    /**
     * Parses query and checks for syntax errors. Reason for this alternative
     * method is that getParseResultAndExpect checks the serialized query and
     * the grouping-tests failed there for some reason.
     */
    protected void assertNoErrors(String query) {
        IParseResult r = parse(query);
        assertFalse(query, r.hasSyntaxErrors());
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        with(LuceneQueryStandaloneSetup.class);
    }
}
