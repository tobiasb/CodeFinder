/**
 * Copyright (c) 2010, 2012 Darmstadt University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Tobias Boehm - initial API and implementation.
 */

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

