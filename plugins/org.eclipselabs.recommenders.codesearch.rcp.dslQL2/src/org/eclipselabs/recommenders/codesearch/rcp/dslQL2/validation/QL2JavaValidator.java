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

package org.eclipselabs.recommenders.codesearch.rcp.dslQL2.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.EmfHelper;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.VariableExtractor;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Name;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.QL2Package;

public class QL2JavaValidator extends AbstractQL2JavaValidator {

    @Check
    public void checkVariableNameExists(Name name) {
        EObject model = EmfHelper.getRoot(name);

        VariableExtractor e = new VariableExtractor();

        if (!e.getVars(model).keySet().contains(name.getValue())) {
            error("Name cannot be resolved to a previously defined variable", QL2Package.Literals.NAME__VALUE);
        }
    }
}
