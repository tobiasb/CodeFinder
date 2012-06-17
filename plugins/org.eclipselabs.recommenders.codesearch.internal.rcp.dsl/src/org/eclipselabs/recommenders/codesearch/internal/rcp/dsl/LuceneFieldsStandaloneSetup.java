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

package org.eclipselabs.recommenders.codesearch.internal.rcp.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class LuceneFieldsStandaloneSetup extends LuceneFieldsStandaloneSetupGenerated{

	public static void doSetup() {
		new LuceneFieldsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

