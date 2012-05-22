package org.eclipselabs.recommenders.test.codesearch.rcp.dsl;

import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.junit.Test;

public class QuotedTermTest extends DslTestBase {

    @Test
    public void testQuotedDefaultFieldNoWS() throws Exception {
        super.setUp();

        getParseResultAndExpect("\"Sometermwithinquotes\"", 0);
    }
    
    @Test
    public void testQuotedDefaultFieldWS() throws Exception {
        super.setUp();

        getParseResultAndExpect("\"Some term within quotes\"", 0);
    }
    
    @Test
    public void testQuotedDefaultFieldWSEnd() throws Exception {
        super.setUp();

        getParseResultAndExpect("\"Some term within quotes ends in whitespace \"", 0);
    }
    
    @Test
    public void testQuotedDefaultFieldWSBeginning() throws Exception {
        super.setUp();

        getParseResultAndExpect("\" Some term within quotes starts with whitespace\"", 0);
    }

    @Test
    public void testQuotedSomeSimpleField() throws Exception {
        super.setUp();

        getParseResultAndExpect(Fields.SIMPLE_NAME + ":\"Some term within quotes\"", 0);
    }
}
