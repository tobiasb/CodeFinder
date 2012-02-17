/**
 * Copyright (c) 2010, 2011 Darmstadt University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Marcel Bruch - initial API and implementation.
 */
package org.eclipse.recommenders.codesearch.rcp.index.extdoc;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.MethodDeclaration;

public class Selection {

    public final MethodDeclaration method;
    public final String varname;
    public final Document doc;

    public Selection(final MethodDeclaration method, final String varname, final Document doc) {
        this.method = method;
        this.varname = varname;
        this.doc = doc;
    }
}
