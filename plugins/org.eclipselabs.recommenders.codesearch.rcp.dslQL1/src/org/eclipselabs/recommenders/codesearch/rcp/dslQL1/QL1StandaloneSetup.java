
package org.eclipselabs.recommenders.codesearch.rcp.dslQL1;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class QL1StandaloneSetup extends QL1StandaloneSetupGenerated{

	public static void doSetup() {
		new QL1StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

