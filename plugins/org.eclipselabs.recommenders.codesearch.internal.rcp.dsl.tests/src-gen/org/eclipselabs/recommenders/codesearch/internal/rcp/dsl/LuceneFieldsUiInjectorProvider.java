/*
* generated by Xtext
*/
package org.eclipselabs.recommenders.codesearch.internal.rcp.dsl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class LuceneFieldsUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui.internal.LuceneFieldsActivator.getInstance().getInjector("org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.LuceneFields");
	}
	
}
