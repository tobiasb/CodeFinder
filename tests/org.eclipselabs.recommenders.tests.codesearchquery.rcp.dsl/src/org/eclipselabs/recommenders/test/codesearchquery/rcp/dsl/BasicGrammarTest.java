package org.eclipselabs.recommenders.test.codesearchquery.rcp.dsl;

import org.junit.Test;

public class BasicGrammarTest extends DslTestBase {

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
	public void testWildcard() throws Exception {
		String textModel = "UsedTypes:java.util.*";

        getParseResultAndExpect(textModel, 0);
	}
	
	@Test
	public void testWildcard02() throws Exception {
		String textModel = "UsedTypes:java.util*";

        getParseResultAndExpect(textModel, 0);
	}
	
	@Test
	public void testWildcard03() throws Exception {
		String textModel = "UsedTypes:java.util*.";

        getParseResultAndExpect(textModel, 0);
	}
	
	@Test
	public void testWildcard04() throws Exception {
		String textModel = "UsedTypes:java.util*.*";

        getParseResultAndExpect(textModel, 0);
	}
	
	@Test
	public void testWildcard05() throws Exception {
		String textModel = "UsedTypes:java*";

        getParseResultAndExpect(textModel, 0);
	}
}
