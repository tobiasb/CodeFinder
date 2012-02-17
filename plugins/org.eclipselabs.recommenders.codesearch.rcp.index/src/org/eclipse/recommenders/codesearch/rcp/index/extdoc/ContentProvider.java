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

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.ITypeRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.internal.corext.refactoring.structure.ASTNodeSearchUtil;
import org.eclipse.jdt.ui.SharedASTProvider;
import org.eclipse.jface.viewers.ILazyContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.SearchResult;
import org.eclipse.recommenders.rcp.RecommendersPlugin;
import org.eclipse.recommenders.utils.rcp.JavaElementResolver;
import org.eclipse.recommenders.utils.rcp.internal.RecommendersUtilsPlugin;
import org.eclipse.swt.widgets.Display;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

final class ContentProvider implements ILazyContentProvider {

    private final ExecutorService s = Executors.newFixedThreadPool(1,
            new ThreadFactoryBuilder().setPriority(Thread.MIN_PRIORITY).build());
    public static MethodDeclaration EMPTY;
    static {
        final AST ast = AST.newAST(AST.JLS4);
        EMPTY = ast.newMethodDeclaration();
        EMPTY.setName(ast.newSimpleName("not_found"));
        EMPTY.setBody(ast.newBlock());
    }

    private TableViewer viewer;
    private final JavaElementResolver jdtResolver;
    private final SearchResult searchResults;

    ContentProvider(final SearchResult searchResults, final JavaElementResolver jdtResolver) {
        this.searchResults = searchResults;
        this.jdtResolver = jdtResolver;
    }

    @Override
    public void dispose() {
        s.shutdown();
    }

    @Override
    public void updateElement(final int index) {
        s.submit(new Runnable() {
            private IMethod jdtMethod;
            private MethodDeclaration astMethod;
            private IJavaElement element;

            @Override
            public void run() {
                try {
                    final Document doc = searchResults.scoreDoc(index);
                    if (!findHandle(doc)) {
                        return;
                    }
                    if (!findJdtMethod()) {
                        updateIndex(EMPTY, "", doc, index);
                        return;
                    }
                    if (!findAstMethod()) {
                        updateIndex(EMPTY, "", doc, index);
                        return;
                    }
                    updateIndex(astMethod, doc.get(Fields.VARIABLE_NAME), doc, index);
                } catch (final Exception e) {
                    RecommendersUtilsPlugin.logError(e, "failed to load document from index");
                }
            }

            private boolean findHandle(final Document doc) {
                final String handle = doc.get(Fields.JAVA_ELEMENT_HANDLE);
                element = JavaCore.create(handle);
                return element != null;
            }

            private void updateIndex(final MethodDeclaration method, final String varname, final Document doc,
                    final int index) {
                Display.getDefault().asyncExec(new Runnable() {

                    @Override
                    public void run() {
                        final Selection s = new Selection(method, varname, doc);
                        viewer.replace(s, index);
                    }
                });
            }

            private boolean findJdtMethod() {
                jdtMethod = (IMethod) element.getAncestor(IJavaElement.METHOD);
                return jdtMethod != null;
            }

            private boolean findAstMethod() {
                try {
                    final ITypeRoot cu = jdtMethod.getTypeRoot();
                    if (cu == null) {
                        return false;
                    }
                    final CompilationUnit ast = SharedASTProvider.getAST(cu, SharedASTProvider.WAIT_YES, null);
                    if (ast == null) {
                        return false;
                    }
                    astMethod = ASTNodeSearchUtil.getMethodDeclarationNode(jdtMethod, ast);
                    // caused NPEs: ASTNodeSearchUtil.getMethodDeclarationNode(jdtMethod, ast);
                } catch (final Exception e) {
                    RecommendersPlugin.logError(e, "failed to find declaring method %s", jdtMethod);
                }
                return astMethod != null;
            }
        });
    }

    @Override
    public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
        this.viewer = (TableViewer) viewer;
    }
}