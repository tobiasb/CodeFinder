package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import java.util.List;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;
import org.eclipselabs.recommenders.codesearchquery.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IFieldIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IMethodIndexer;

public class FullyQualifiedNameIndexer extends AbstractIndexer implements IMethodIndexer, IClassIndexer, IFieldIndexer {

    @Override
    public void index(Document document, MethodDeclaration method) {        
        addAnalyzedField(document, Fields.FULLY_QUALIFIED_NAME, BindingHelper.getIdentifier(method));
    }

    @Override
    public void index(Document document, TypeDeclaration type) {        
        addAnalyzedField(document, Fields.FULLY_QUALIFIED_NAME, BindingHelper.getIdentifier(type));
    }

    @Override
    public void index(Document document, FieldDeclaration field) {
        TypeDeclaration declaringType = getDeclaringType(field);
        ITypeBinding b = declaringType.resolveBinding();
        final ITypeName declaringTypeName = BindingUtils.toTypeName(b);
        
        @SuppressWarnings("unchecked")
		List<VariableDeclarationFragment> fragments = field.fragments();
        VariableDeclarationFragment fragment = fragments.get(0);
        
        addAnalyzedField(document, Fields.FULLY_QUALIFIED_NAME, declaringTypeName.getIdentifier() + "." + fragment.getName());
    }
}
