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

import static org.apache.commons.lang3.StringUtils.isEmpty;

import java.io.IOException;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.ITypeRoot;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.jdt.internal.corext.refactoring.structure.ASTNodeSearchUtil;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jdt.ui.SharedASTProvider;
import org.eclipse.jdt.ui.text.IColorManager;
import org.eclipse.jdt.ui.text.IJavaColorConstants;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.rcp.RecommendersPlugin;
import org.eclipse.recommenders.utils.IOUtils;
import org.eclipse.recommenders.utils.Tuple;
import org.eclipse.recommenders.utils.names.IMethodName;
import org.eclipse.recommenders.utils.names.VmMethodName;
import org.eclipse.recommenders.utils.rcp.JavaElementResolver;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;

public class LabelProvider extends StyledCellLabelProvider {

    private final JavaElementResolver jdtResolver;
    private IMethodName recMethod;
    private IMethod jdtMethod;
    private MethodDeclaration astMethod;
    private List<ASTNode> statements;
    private final List<String> searchterms;
    private final Tuple<TopDocs, IndexSearcher> searchResults;

    public LabelProvider(final JavaElementResolver jdtCache, final List<String> searchterms,
            final Tuple<TopDocs, IndexSearcher> searchResults) {
        this.jdtResolver = jdtCache;
        this.searchterms = searchterms;
        this.searchResults = searchResults;
    }

    /**
     * Finds all relevant statements and creates a *very* simple summary
     */
    @Override
    public void update(final ViewerCell cell) {
        final ScoreDoc scoreDoc = (ScoreDoc) cell.getElement();
        if (scoreDoc == null) {
            return;
        }
        try {
            final IndexSearcher reader = searchResults.getSecond();
            final Document doc = reader.doc(scoreDoc.doc);

            if (!findMethodName(doc)) {
                cell.setText("// error during resolution:" + doc);
                setCellToCommentStyle(cell);
                super.update(cell);
                return;
            }
            if (!findJdtMethod()) {
                cell.setText("// failed to resolve method in workspace" + recMethod);
                setCellToCommentStyle(cell);
                super.update(cell);
                return;
            }

            if (!findAstMethod()) {
                cell.setText("// failed to resolve method node in AST. Is index outdated?" + recMethod);
                setCellToCommentStyle(cell);
                super.update(cell);
                return;
            }

            if (!findStatements(doc.get(Fields.VARIABLE_NAME))) {
                cell.setText("// failed to resolve matching statements in AST.\n// Either index is outdated or method is not actually using this variable?");
                setCellToCommentStyle(cell);
                super.update(cell);
                return;
            }
            setCellText(cell);
        } catch (final CorruptIndexException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (final IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void setCellToCommentStyle(final ViewerCell cell) {
        final IColorManager colorManager = JavaUI.getColorManager();
        final Color color = colorManager.getColor(IJavaColorConstants.JAVA_MULTI_LINE_COMMENT);
        final StyleRange[] ranges = { new StyleRange(0, cell.getText().length(), color, null) };
        cell.setStyleRanges(ranges);
    }

    private boolean findMethodName(final Document doc) {
        final String name = doc.get(Fields.DECLARING_METHOD);
        if (name == null) {
            return false;
        }
        recMethod = VmMethodName.get(name);
        return recMethod != null;
    }

    private boolean findJdtMethod() {
        final Optional<IMethod> opt = jdtResolver.toJdtMethod(recMethod);
        jdtMethod = opt.orNull();
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
        } catch (final Exception e) {
            RecommendersPlugin.logError(e, "failed to find declaring method %s", jdtMethod);
        }
        return astMethod != null;
    }

    private boolean findStatements(final String varname) {
        statements = Lists.newArrayList();

        if (isEmpty(varname)) {
            return false;
        }

        astMethod.accept(new ASTVisitor() {
            @Override
            public boolean visit(final SimpleName node) {
                if (node.getIdentifier().equals(varname)) {
                    collectStatement(node);
                }
                return false;
            }

            private void collectStatement(final SimpleName node) {

                final ASTNode sup = node.getParent();
                switch (sup.getNodeType()) {
                case ASTNode.CLASS_INSTANCE_CREATION:
                    final ASTNode supSup = sup.getParent();
                    switch (supSup.getNodeType()) {
                    case ASTNode.ASSIGNMENT:
                        statements.add(supSup);
                        break;
                    case ASTNode.VARIABLE_DECLARATION_FRAGMENT:
                        final ASTNode supSupSup = supSup.getParent();
                        if (supSupSup instanceof VariableDeclarationStatement) {
                            statements.add(supSupSup);
                        } else {
                            statements.add(supSup);
                        }
                    }

                    break;
                case ASTNode.RETURN_STATEMENT:
                    if (((ReturnStatement) sup).getExpression() instanceof SimpleName) {
                        break;
                    }
                case ASTNode.METHOD_INVOCATION:
                case ASTNode.SUPER_METHOD_INVOCATION:
                case ASTNode.FIELD_ACCESS:
                case ASTNode.SUPER_FIELD_ACCESS:
                case ASTNode.CONSTRUCTOR_INVOCATION:
                case ASTNode.SUPER_CONSTRUCTOR_INVOCATION:
                case ASTNode.CAST_EXPRESSION:
                case ASTNode.VARIABLE_DECLARATION_FRAGMENT:
                    statements.add(sup);
                    break;
                default:
                    break;
                }
            };
        });

        return !statements.isEmpty();
    }

    private void setCellText(final ViewerCell cell) {
        final StringBuilder sb = new StringBuilder();
        for (final ASTNode n : statements) {
            // term matching in here:... waiting for contribution of Kristjian...
            sb.append(n.toString()).append(IOUtils.LINE_SEPARATOR);
        }
        final String[] split = StringUtils.split(sb.toString(), IOUtils.LINE_SEPARATOR);
        final String summary = StringUtils.join(ArrayUtils.subarray(split, 0, 3), IOUtils.LINE_SEPARATOR);
        cell.setText(summary);
        final List<StyleRange> ranges = Lists.newArrayList();
        final Color color = JavaUI.getColorManager().getColor(IJavaColorConstants.JAVA_KEYWORD);

        for (final String term : searchterms) {

            int index = 0;
            while (true) {
                index = StringUtils.indexOfIgnoreCase(summary, term, index);
                if (index == -1) {
                    break;
                }
                ranges.add(new StyleRange(index, term.length(), color, null));
                index += term.length();
            }
        }
        cell.setStyleRanges(ranges.toArray(new StyleRange[0]));
    }

    @Override
    protected void measure(final Event event, final Object element) {
        final TableItem item = (TableItem) event.item;
        final Point size = event.gc.textExtent("\n\n\n");
        final Table parent = item.getParent();
        final Rectangle clientArea = parent.getClientArea();
        final int clientWidth = clientArea.width;
        event.width = clientWidth - 20;
        event.height = size.y;
        super.measure(event, element);
    }

    @Override
    public void dispose() {
        // TODO Auto-generated method stub
        super.dispose();
    }
}
