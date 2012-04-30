package org.eclipselabs.recommenders.test.codesearch.rcp.dslQL1;

import org.eclipse.recommenders.internal.codesearch.rcp.views.MethodPatternQLEditorWrapper;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.QL1StandaloneSetup;
import org.eclipselabs.recommenders.test.codesearch.QLTestBase;
import org.junit.Test;

public class ExampleTest extends QLTestBase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        with(QL1StandaloneSetup.class);
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

        for (String exampleQuery : w.getExampleQueriesInternal()) {
            @SuppressWarnings("unused")
			IParseResult result = getParseResultAndExpect(exampleQuery, 0);
        }
    }
}
