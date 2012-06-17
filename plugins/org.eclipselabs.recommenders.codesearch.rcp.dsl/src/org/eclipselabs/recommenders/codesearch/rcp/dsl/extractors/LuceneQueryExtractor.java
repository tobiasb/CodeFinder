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

package org.eclipselabs.recommenders.codesearch.rcp.dsl.extractors;

import java.io.ByteArrayOutputStream;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.converter.DotNotationMethodConverter;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.converter.DotNotationTypeConverter;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.converter.IQueryPartConverter;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.converter.PathValueConverter;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.ClauseExpressionImpl;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.FilePathFieldImpl;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.MethodFieldImpl;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.TypeFieldImpl;

public class LuceneQueryExtractor implements IUnitOfWork<String, XtextResource> {

    @Override
    public String exec(final XtextResource state) throws Exception {
        final TreeIterator<EObject> iter = state.getAllContents();

        if (!iter.hasNext())
            return "";

        process(iter);

        final ByteArrayOutputStream stream = new ByteArrayOutputStream();
        state.save(stream, null);
        return stream.toString();
    }

    public void process(TreeIterator<EObject> iter) {
        if (!iter.hasNext())
            return;

        do {
            final EObject o = iter.next();

            if (o instanceof ClauseExpressionImpl) {
                final ClauseExpressionImpl impl = (ClauseExpressionImpl) o;
                final EObject field = impl.getField();

                IQueryPartConverter conv = null;

                if (field instanceof TypeFieldImpl) {
                    conv = new DotNotationTypeConverter();
                } else if (field instanceof FilePathFieldImpl) {
                    conv = new PathValueConverter();
                } else if (field instanceof MethodFieldImpl) {
                    conv = new DotNotationMethodConverter();
                }

                if (conv != null) {
                    for (int i = 0; i < impl.getValues().size(); i++) {
                        final String oldValue = impl.getValues().get(i);
                        final String newValue = conv.convertFrom(oldValue);
                        impl.getValues().set(i, newValue);
                    }
                }
            }

        } while (iter.hasNext());
    }
}
