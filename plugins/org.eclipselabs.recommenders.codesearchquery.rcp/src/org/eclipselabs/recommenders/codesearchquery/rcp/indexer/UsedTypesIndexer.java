package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;
import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IFieldIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IMethodIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.ITryCatchBlockIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.visitor.TypeUseVisitor;

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