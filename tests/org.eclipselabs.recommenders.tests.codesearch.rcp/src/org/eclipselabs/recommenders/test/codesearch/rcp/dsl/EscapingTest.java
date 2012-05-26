package org.eclipselabs.recommenders.test.codesearch.rcp.dsl;

import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.junit.Test;

public class EscapingTest extends DslTestBase {
    @Test
    public void testBasicEscaping() throws Exception {
        super.setUp();
        final String textModel = "Some path c\\:\\\\directory in a comment.";

        getParseResultAndExpect(textModel, 0);
    }
    
    @Test
    public void testEscapingFieldedWithPhrases() throws Exception {
        super.setUp();
        final String textModel = field(Fields.FULL_TEXT, "\"Some path c\\:\\\\directory in a comment.\"");

        getParseResultAndExpect(textModel, 0);
    }
}
