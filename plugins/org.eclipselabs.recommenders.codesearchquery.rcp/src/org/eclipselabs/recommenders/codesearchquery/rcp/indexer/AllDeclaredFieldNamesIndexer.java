package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;
import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IMethodIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.ITryCatchBlockIndexer;

import com.google.common.base.Optional;

public class AllDeclaredFieldNamesIndexer extends DeclaredFieldNamesIndexer implements IClassIndexer, IMethodIndexer,
        ITryCatchBlockIndexer {

    @Override
    public void index(final Document document, final TypeDeclaration type) {
        final ITypeBinding typeBinding = type.resolveBinding();
        addFields(document, typeBinding);
    }

    @Override
    public void index(final Document document, final MethodDeclaration method) {
        addFields(document, method);

        final Optional<TypeDeclaration> opt = getDeclaringType(method);
        if (opt.isPresent()) {
            final ITypeBinding typeBinding = opt.get().resolveBinding();
            addFields(document, typeBinding);
        }
    }

    @Override
    public void index(final Document document, final TryStatement tryStatement, final CatchClause catchClause) {
        addFields(document, catchClause);
        addFields(document, getDeclaringMethod(catchClause));

        final Optional<TypeDeclaration> opt = getDeclaringType(catchClause);
        if (opt.isPresent()) {
            final ITypeBinding typeBinding = opt.get().resolveBinding();
            addFields(document, typeBinding);
        }
    }

    private void addFields(final Document document, final ITypeBinding type) {
        final Optional<IType> opt = BindingUtils.getType(type);
        if (!opt.isPresent()) {
            return;
        }
        final IType typeName = opt.get();

        try {
            for (final IField field : typeName.getFields()) {
                addAnalyzedField(document, Fields.ALL_DECLARED_FIELD_NAMES, field.getElementName());
            }
        } catch (final JavaModelException e) {
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
