package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IClassIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IFieldIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IMethodIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.ITryCatchBlockIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.visitor.TypeUseVisitor;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;

public class UsedTypesIndexer extends AbstractIndexer implements IMethodIndexer, IClassIndexer, IFieldIndexer,
        ITryCatchBlockIndexer {

    @Override
    public void index(final Document document, final MethodDeclaration method) {
        final TypeUseVisitor visitor = new TypeUseVisitor() {
            @Override
            protected void handleTypeUse(final ITypeBinding typeBinding) {
                addUsedType(document, typeBinding);
            }
        };

        method.accept(visitor);
    }

    @Override
    public void index(final Document document, final FieldDeclaration field) {
        final ITypeBinding fieldTypeBinding = field.getType().resolveBinding();
        addUsedType(document, fieldTypeBinding);
    }

    @Override
    public void index(final Document document, final TypeDeclaration type) {
        final TypeUseVisitor visitor = new TypeUseVisitor() {
            @Override
            protected void handleTypeUse(final ITypeBinding typeBinding) {
                addUsedType(document, typeBinding);
            }
        };

        type.accept(visitor);
    }

    @Override
    public void index(final Document document, final TryStatement tryStatement, final CatchClause catchClause) {

        final TypeUseVisitor visitor = new TypeUseVisitor() {
            @Override
            protected void handleTypeUse(final ITypeBinding typeBinding) {
                addUsedType(document, typeBinding);
            }
        };

        catchClause.accept(visitor);
    }

    private void addUsedType(final Document document, final ITypeBinding typeBinding) {
        final ITypeName typeName = BindingUtils.toTypeName(typeBinding);
        addAnalyzedField(document, Fields.USED_TYPES, BindingHelper.getIdentifier(typeName));
    }
}