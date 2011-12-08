package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import java.util.List;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.recommenders.rcp.utils.ast.BindingUtils;
import org.eclipse.recommenders.utils.names.IMethodName;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.*;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;

public class FullyQualifiedNameIndexer extends AbstractIndexer implements IMethodIndexer, IClassIndexer, IFieldIndexer {

    @Override
    public void index(Document document, MethodDeclaration method) {
        IMethodBinding b = method.resolveBinding();
        final IMethodName methodName = BindingUtils.toMethodName(b);
        
        addAnalyzedField(document, Fields.FULLY_QUALIFIED_NAME, methodName.getIdentifier());
    }

    @Override
    public void index(Document document, TypeDeclaration type) {
        ITypeBinding b = type.resolveBinding();
        final ITypeName typeName = BindingUtils.toTypeName(b);
        
        addAnalyzedField(document, Fields.FULLY_QUALIFIED_NAME, typeName.getIdentifier());
    }

    @Override
    public void index(Document document, FieldDeclaration field) {
        ITypeBinding b = field.getType().resolveBinding();
        final ITypeName typeName = BindingUtils.toTypeName(b);

        @SuppressWarnings("unchecked")
        List<VariableDeclarationFragment> fragments = field.fragments();
        VariableDeclarationFragment fragment = fragments.get(0);
        
        addAnalyzedField(document, Fields.FULLY_QUALIFIED_NAME, typeName.getIdentifier() + "_" + fragment.getName());
    }
}
