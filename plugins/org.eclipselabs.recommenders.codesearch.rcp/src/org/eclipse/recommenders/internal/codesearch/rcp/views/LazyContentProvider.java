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
package org.eclipse.recommenders.internal.codesearch.rcp.views;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.viewers.ILazyContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.SearchResult;
import org.eclipse.recommenders.utils.names.IMethodName;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.names.VmMethodName;
import org.eclipse.recommenders.utils.names.VmTypeName;
import org.eclipse.recommenders.utils.rcp.JavaElementResolver;

import com.google.common.base.Optional;

public class LazyContentProvider implements ILazyContentProvider {

    private TableViewer viewer;
    private SearchResult input;

    @Override
    public void dispose() {
    }

    @Override
    public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
        this.viewer = (TableViewer) viewer;
        dispose();
        this.input = (SearchResult) newInput;

    }

    @Override
    public void updateElement(final int index) {
        try {
            final Document doc = input.scoreDoc(index);
            final String docId = doc.get(Fields.FULLY_QUALIFIED_NAME);
            final String docType = doc.get(Fields.TYPE);
            final String declaringType = doc.get(Fields.DECLARING_TYPE);
            if (docType.equals(Fields.TYPE_CLASS)) {
                final ITypeName typeName = VmTypeName.get(docId);
                final Optional<IType> type = JavaElementResolver.INSTANCE.toJdtType(typeName);
                if (type.isPresent()) {
                    viewer.replace(type.get(), index);
                }
            } else if (docType.equals(Fields.TYPE_METHOD)) {
                final IMethodName methodName = VmMethodName.get(docId);
                final Optional<IMethod> method = JavaElementResolver.INSTANCE.toJdtMethod(methodName);
                if (method.isPresent()) {
                    viewer.replace(method.get(), index);
                }
            } else if (docType.equals(Fields.TYPE_TRYCATCH) || docType.equals(Fields.TYPE_FIELD)
                    || docType.equals(Fields.TYPE_VARUSAGE)) {
                final ITypeName typeName = VmTypeName.get(declaringType);
                final Optional<IType> type = JavaElementResolver.INSTANCE.toJdtType(typeName);
                if (type.isPresent()) {
                    viewer.replace(type.get(), index);
                }
            }

        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
}
