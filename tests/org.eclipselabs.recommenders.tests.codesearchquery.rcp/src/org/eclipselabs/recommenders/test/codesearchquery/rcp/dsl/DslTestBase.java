package org.eclipselabs.recommenders.test.codesearchquery.rcp.dsl;

import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.LuceneQueryStandaloneSetup;

public class DslTestBase extends AbstractXtextTests {

//    private final Injector injector = new LuceneQueryStandaloneSetup().createInjectorAndDoEMFRegistration();
//    private final LuceneQueryParser parser = injector.getInstance(LuceneQueryParser.class);
    
    @Override
    protected void setUp() throws Exception {
    	super.setUp();
    	
    	with(LuceneQueryStandaloneSetup.class);
    }
}
