
package org.eclipselabs.recommenders.codesearch.rcp.dslQL2;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class QL2StandaloneSetup extends QL2StandaloneSetupGenerated{

	public static void doSetup() {
		new QL2StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

