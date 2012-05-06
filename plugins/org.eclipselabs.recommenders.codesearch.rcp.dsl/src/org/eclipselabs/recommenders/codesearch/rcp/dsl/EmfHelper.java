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

package org.eclipselabs.recommenders.codesearch.rcp.dsl;

import org.eclipse.emf.ecore.EObject;

public class EmfHelper {
    public static EObject getRoot(final EObject o) {
        EObject obj = o;

        while (obj != null) {
            if (obj.eContainer() == null)
                return obj;

            obj = obj.eContainer();
        }

        return obj;
    }
}
