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

package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IMethodIndexer;

public class ReturnVariableExpressionIndexer implements IMethodIndexer {

    @Override
    /**
     * Indexes the whole return expression as a token
     */
    public void indexMethod(final Document document, final MethodDeclaration method) {
        final ASTVisitor visitor = new ASTVisitor() {
            @Override
            public boolean visit(final ReturnStatement node) {
                if (node.getExpression() != null) {
                	CodeIndexer.addFieldToDocument(document, Fields.RETURN_VARIABLE_EXPRESSIONS, node.getExpression().toString());
                }

                return false;
            }
        };

        method.accept(visitor);
    }

}
