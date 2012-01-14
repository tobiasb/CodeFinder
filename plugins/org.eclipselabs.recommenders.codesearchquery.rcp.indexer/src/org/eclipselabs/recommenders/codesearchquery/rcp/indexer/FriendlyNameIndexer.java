package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;
import org.eclipse.recommenders.utils.names.IMethodName;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipselabs.recommenders.codesearchquery.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.*;

public class FriendlyNameIndexer extends AbstractIndexer implements IMethodIndexer, IClassIndexer, IFieldIndexer {

    @Override
    public void index(Document document, MethodDeclaration method) {

        final IMethodBinding b = method.resolveBinding();
        final IMethodName methodName = BindingUtils.toMethodName(b);
        
        if(methodName != null) {
        	addAnalyzedField(document, Fields.FRIENDLY_NAME, methodName.getName());
        } else {
        	addAnalyzedField(document, Fields.FRIENDLY_NAME, "");
        }
    }

    @Override
    public void index(Document document, TypeDeclaration type) {
        final ITypeBinding b = type.resolveBinding();
        final ITypeName typeName = BindingUtils.toTypeName(b);
        
        addAnalyzedField(document, Fields.FRIENDLY_NAME, typeName.getClassName());
    }

    @Override
    public void index(Document document, FieldDeclaration field) {        
        addAnalyzedField(document, Fields.FRIENDLY_NAME, field.fragments().get(0).toString());
    }
}
