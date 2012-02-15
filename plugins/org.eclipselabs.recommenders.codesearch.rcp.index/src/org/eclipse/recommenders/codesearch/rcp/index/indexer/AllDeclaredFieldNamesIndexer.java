package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.IVariableBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IClassIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IMethodIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.ITryCatchBlockIndexer;

import com.google.common.base.Optional;

public class AllDeclaredFieldNamesIndexer extends DeclaredFieldNamesIndexer implements IClassIndexer, IMethodIndexer,
        ITryCatchBlockIndexer {

    @Override
    public void indexType(final Document document, final TypeDeclaration type) {
        final ITypeBinding typeBinding = type.resolveBinding();
        addFields(document, typeBinding);
    }

    @Override
    public void indexMethod(final Document document, final MethodDeclaration method) {
        addFields(document, method);

        final Optional<TypeDeclaration> opt = getDeclaringType(method);
        if (opt.isPresent()) {
            final ITypeBinding typeBinding = opt.get().resolveBinding();
            addFields(document, typeBinding);
        }
    }

    @Override
    public void indexTryCatchBlock(final Document document, final TryStatement tryStatement,
            final CatchClause catchClause) {
        addFields(document, catchClause);
        final Optional<MethodDeclaration> optMethod = getDeclaringMethod(catchClause);
        if (optMethod.isPresent()) {
            addFields(document, optMethod.get());
        }

        final Optional<TypeDeclaration> opt = getDeclaringType(catchClause);
        if (opt.isPresent()) {
            final ITypeBinding typeBinding = opt.get().resolveBinding();
            addFields(document, typeBinding);
        }
    }

    private void addFields(final Document document, final ITypeBinding type) {
        if (type == null) {
            return;
        }

        for (final IVariableBinding field : type.getDeclaredFields()) {
            addAnalyzedField(document, Fields.ALL_DECLARED_FIELD_NAMES, field.getName());
        }

        if (type.getSuperclass() != null) {
            final ITypeBinding superclass = type.getSuperclass();
            addFields(document, superclass);
        }
    }

    private void addFields(final Document document, final MethodDeclaration method) {
        final ASTVisitor visitor = new ASTVisitor() {
            @Override
            public boolean visit(final VariableDeclarationStatement node) {
                addAnalyzedField(document, Fields.ALL_DECLARED_FIELD_NAMES, node.fragments().get(0).toString());
                return false;
            }
        };

        method.accept(visitor);
    }

    private void addFields(final Document document, final CatchClause catchClause) {
        final ASTVisitor visitor = new ASTVisitor() {
            @Override
            public boolean visit(final VariableDeclarationStatement node) {
                addAnalyzedField(document, Fields.ALL_DECLARED_FIELD_NAMES, node.fragments().get(0).toString());
                return false;
            }
        };

        catchClause.accept(visitor);
    }
}
