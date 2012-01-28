package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IMethodIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.ITryCatchBlockIndexer;

public class DeclaredFieldTypesIndexer extends AbstractIndexer implements IClassIndexer, IMethodIndexer,
        ITryCatchBlockIndexer {

    @Override
    public void index(final Document document, final MethodDeclaration method) {
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
    public void index(final Document document, final TypeDeclaration type) {
        final ASTVisitor visitor = new ASTVisitor() {
            @Override
            public boolean visit(final FieldDeclaration node) {
                addAnalyzedField(document, Fields.DECLARED_FIELD_TYPES, BindingHelper.getIdentifier(node));
                return false;
            }
        };

        type.accept(visitor);
    }

    @Override
    public void index(final Document document, final TryStatement tryStatement, final CatchClause catchClause) {
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
        addAnalyzedField(document, Fields.DECLARED_FIELD_TYPES, BindingHelper.getIdentifier(variableDeclaration));
    }
}
