
package org.eclipselabs.recommenders.codesearchquery.rcp.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class LuceneQueryStandaloneSetup extends LuceneQueryStandaloneSetupGenerated{

	public static void doSetup() {
		new LuceneQueryStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

