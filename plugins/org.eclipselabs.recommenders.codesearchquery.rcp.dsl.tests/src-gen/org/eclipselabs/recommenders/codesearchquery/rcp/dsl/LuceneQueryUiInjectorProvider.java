/*
* generated by Xtext
*/
package org.eclipselabs.recommenders.codesearchquery.rcp.dsl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class LuceneQueryUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.internal.LuceneQueryActivator.getInstance().getInjector("org.eclipselabs.recommenders.codesearchquery.rcp.dsl.LuceneQuery");
	}
	
}
