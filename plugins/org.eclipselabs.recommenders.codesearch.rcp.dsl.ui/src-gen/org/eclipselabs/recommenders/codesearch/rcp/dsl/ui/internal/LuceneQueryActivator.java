/**
 * Copyright (c) 2012 Tobias Boehm.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Tobias Boehm - initial API and implementation.
 */

/*
 * generated by Xtext
 */
package org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.internal;

import static com.google.inject.util.Modules.override;
import static com.google.inject.Guice.createInjector;

import org.apache.log4j.Logger;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;

import java.util.concurrent.ExecutionException;

import org.eclipse.xtext.ui.shared.SharedStateModule;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class LuceneQueryActivator extends AbstractUIPlugin {
	
	private static final Logger logger = Logger.getLogger(LuceneQueryActivator.class);
	
	private Cache<String, Injector> injectors = CacheBuilder.newBuilder().build(new CacheLoader<String, Injector>() {
		@Override
		public Injector load(String language) throws Exception {
			Module runtimeModule = getRuntimeModule(language);
			Module sharedStateModule = getSharedStateModule();
			Module uiModule = getUiModule(language);
			Module mergedModule = override(override(runtimeModule).with(sharedStateModule)).with(uiModule);
			return createInjector(mergedModule);
		}
	});
	
	private static LuceneQueryActivator INSTANCE;
	
	public static final String ORG_ECLIPSELABS_RECOMMENDERS_CODESEARCH_RCP_DSL_LUCENEQUERY = "org.eclipselabs.recommenders.codesearch.rcp.dsl.LuceneQuery";
	
	public Injector getInjector(String languageName) {
		try {
			return injectors.get(languageName);
		} catch(ExecutionException e) {
			logger.error("Failed to create injector for " + languageName);
			logger.error(e.getMessage(), e);
			throw new RuntimeException("Failed to create injector for " + languageName, e);
		}
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		injectors.invalidateAll();
		injectors.cleanUp();
		INSTANCE = null;
		super.stop(context);
	}
	
	public static LuceneQueryActivator getInstance() {
		return INSTANCE;
	}
	
	protected Module getRuntimeModule(String grammar) {
		if (ORG_ECLIPSELABS_RECOMMENDERS_CODESEARCH_RCP_DSL_LUCENEQUERY.equals(grammar)) {
			return new org.eclipselabs.recommenders.codesearch.rcp.dsl.LuceneQueryRuntimeModule();
		}
		
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getUiModule(String grammar) {
		if (ORG_ECLIPSELABS_RECOMMENDERS_CODESEARCH_RCP_DSL_LUCENEQUERY.equals(grammar)) {
			return new org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.LuceneQueryUiModule(this);
		}
		
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getSharedStateModule() {
		return new SharedStateModule();
	}
	
}
