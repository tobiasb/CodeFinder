
package org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class LuceneFieldsStandaloneSetup extends LuceneFieldsStandaloneSetupGenerated{

	public static void doSetup() {
		new LuceneFieldsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

