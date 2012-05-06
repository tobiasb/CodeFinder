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

package org.eclipselabs.recommenders.codesearch.rcp.dsl.extractors;

import java.io.ByteArrayOutputStream;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

public class StringQueryExtractor implements IUnitOfWork<String, XtextResource> {

    @Override
    public String exec(final XtextResource state) throws Exception {
        final TreeIterator<EObject> iter = state.getAllContents();

        if (!iter.hasNext())
            return "";

        final ByteArrayOutputStream stream = new ByteArrayOutputStream();
        state.save(stream, null);
        return stream.toString();
    }
}
