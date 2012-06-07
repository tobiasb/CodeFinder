package org.eclipselabs.recommenders.test.codesearch.rcp.dsl;

import org.junit.Test;

public class MethodFieldTest extends DslTestBase {

    @Test
    public void testSimple() throws Exception {
        super.setUp();
        final String textModel = "UsedMethods:*addFieldToDocument";

        getParseResultAndExpect(textModel, 0);
    }

    @Test
    public void testWithType() throws Exception {
        super.setUp();
        final String textModel = "UsedMethods:*.CodeIndexer.addFieldToDocument";

        getParseResultAndExpect(textModel, 0);
    }

    @Test
    public void testWithParameters() throws Exception {
        super.setUp();
        
        String textModel; 
        
//        textModel = "UsedMethods:*.CodeIndexer.addFieldToDocument()";
//        getParseResultAndExpect(textModel, 0);

        textModel = "UsedMethods:*.CodeIndexer.addFieldToDocument(*)";
        getParseResultAndExpect(textModel, 0);

//        textModel = "UsedMethods:*.CodeIndexer.addFieldToDocument(*, java.lang.String)";
//        getParseResultAndExpect(textModel, 0);
    }
}
