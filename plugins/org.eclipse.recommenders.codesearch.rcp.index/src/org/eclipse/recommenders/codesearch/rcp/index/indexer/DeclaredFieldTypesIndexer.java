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
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IClassIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IMethodIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.ITryCatchBlockIndexer;

import com.google.common.base.Optional;

public class DeclaredFieldTypesIndexer implements IClassIndexer, IMethodIndexer,
        ITryCatchBlockIndexer {

    @Override
    public void indexMethod(final Document document, final MethodDeclaration method) {
        final ASTVisitor visitor = new ASTVisitor() {
            @Override
            public boolean visit(final VariableDeclarationStatement node) {
                addDeclaredFieldType(document, node);
                return false;
            }
        };

        method.accept(visitor);
    }

    @Override
    public void indexType(final Document document, final TypeDeclaration type) {
        final ASTVisitor visitor = new ASTVisitor() {
            @Override
            public boolean visit(final FieldDeclaration node) {
                final Optional<String> opt = BindingHelper.getIdentifier(node);
                if (opt.isPresent()) {
                	CodeIndexer.addFieldToDocument(document, Fields.DECLARED_FIELD_TYPES, opt.get());
                }
                return false;
            }
        };

        type.accept(visitor);
    }

    @Override
    public void indexTryCatchBlock(final Document document, final TryStatement tryStatement, final CatchClause catchClause) {
        final ASTVisitor visitor = new ASTVisitor() {
            @Override
            public boolean visit(final VariableDeclarationStatement node) {
                addDeclaredFieldType(document, node);
                return false;
            }
        };

        catchClause.accept(visitor);
    }

    private void addDeclaredFieldType(final Document document, final VariableDeclarationStatement variableDeclaration) {
        final Optional<String> opt = BindingHelper.getIdentifier(variableDeclaration);
        if (opt.isPresent()) {
        	CodeIndexer.addFieldToDocument(document, Fields.DECLARED_FIELD_TYPES, opt.get());
        }
    }
}
