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

package org.eclipse.recommenders.codesearch.rcp.searcher;

import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.ClauseExpressionImpl;

import com.google.common.collect.Sets;

public class LuceneSearchTermExtractor implements IUnitOfWork<Set<String>, XtextResource> {

    @Override
    public Set<String> exec(XtextResource state) throws Exception {

        final TreeIterator<EObject> iter = state.getAllContents();
        final Set<String> res = Sets.newHashSet();

        do {
            final EObject o = iter.next();

            if (o instanceof ClauseExpressionImpl) {
                final ClauseExpressionImpl impl = (ClauseExpressionImpl) o;

                for (int i = 0; i < impl.getValues().size(); i++) {
                    final String value = impl.getValues().get(i);

                    final String lowerCase = value.toLowerCase();
                    final String[] segments = lowerCase.split("\\W");
                    for (final String term : segments) {
                        if (term.isEmpty()) {
                            continue;
                        }
                        res.add(term);
                    }
                }
            }

        } while (iter.hasNext());

        return res;
    }

}
