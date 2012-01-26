package org.eclipselabs.recommenders.test.codesearchquery.rcp.dsl;

import org.eclipse.emf.ecore.EObject;
import org.junit.Test;

public class BasicGrammarTest extends DslTestBase {

	@Test
	public void testBasicGrammar() throws Exception {
		String textModel = "UsedTypes:java.util.List";
        
        EObject model = getModel(textModel);
        
        assertNotNull(model);
	}
	
	@Test
	public void testBasicGrammarTwoRules() throws Exception {
		String textModel = "UsedTypes:java.util.List AND UsedTypes:java.util.Map";
        
        EObject model = getModel(textModel);
        
        assertNotNull(model);
	}
}
