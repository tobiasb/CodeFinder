package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.rcp.utils.ast.BindingUtils;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.*;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.visitor.TypeUseVisitor;

public class UsedTypesIndexer extends AbstractIndexer implements IMethodIndexer, IClassIndexer, IFieldIndexer {

    @Override
    public void index(final Document document, final MethodDeclaration method) {
        final TypeUseVisitor visitor = new TypeUseVisitor() {
            @Override
            protected void handleTypeUse(ITypeBinding typeBinding) {
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
            protected void handleTypeUse(ITypeBinding typeBinding) {
                addUsedType(document, typeBinding);
            }
        };
        
        type.accept(visitor);
    }

    private void addUsedType(final Document document, ITypeBinding typeBinding) {
        final ITypeName typeName = BindingUtils.toTypeName(typeBinding);
        addAnalyzedField(document, Fields.USED_TYPES, typeName.getIdentifier());
    }
}