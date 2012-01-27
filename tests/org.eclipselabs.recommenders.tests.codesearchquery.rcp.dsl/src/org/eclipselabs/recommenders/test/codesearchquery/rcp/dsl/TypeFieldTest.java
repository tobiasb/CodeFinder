package org.eclipselabs.recommenders.test.codesearchquery.rcp.dsl;

import org.junit.Test;

public class TypeFieldTest extends DslTestBase {

	@Test
	public void testBasicDotNotationGrammar() throws Exception {
		String textModel = "UsedTypes:java.util.List";
        
        getParseResultAndExpect(textModel, 0);
	}
	
	@Test
	public void testBasicDotNotationGrammarTwoRules() throws Exception {
		String textModel = "UsedTypes:java.util.List AND UsedTypes:java.util.Map";
        
        getParseResultAndExpect(textModel, 0);
	}
	
	@Test
	public void testWildcard01() throws Exception {
		
        getParseResultAndExpect("UsedTypes:java*", 0);
	}
	
	@Test
	public void testWildcard02() throws Exception {
	
        getParseResultAndExpect("UsedTypes:java.util*", 0);
	}
	
	@Test
	public void testWildcard05() throws Exception {
	
        getParseResultAndExpect("UsedTypes:java.util.*", 0);
	}
	
	@Test
	public void testWildcard06() throws Exception {
	
        getParseResultAndExpect("UsedTypes:java?", 0);
	}
	
	@Test
	public void testWildcard07() throws Exception {

        getParseResultAndExpect("UsedTypes:java.util.?", 0);
	}
	
	@Test
	public void testWildcard08() throws Exception {

        getParseResultAndExpect("UsedTypes:java.util?", 0);
	}
	
	@Test
	public void testWildcard10() throws Exception {

        getParseResultAndExpect("UsedTypes:java.util*.*", 0);
	}
	
	@Test
	public void testWildcard04() throws Exception {
	
        getParseResultAndExpect("UsedTypes:java.util*.bla", 0);
	}
	
	@Test
	public void testWildcard11() throws Exception {
	
        getParseResultAndExpect("UsedTypes:java.util*.bla*", 0);
	}
}
