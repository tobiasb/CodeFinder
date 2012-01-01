package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;
import org.eclipse.recommenders.utils.names.IMethodName;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;

public class AllDeclaredMethodNamesIndexer extends DeclaredMethodNamesIndexer implements
		IClassIndexer {

	@Override
	public void index(final Document document, TypeDeclaration type) {
     
        ITypeBinding superclass = type.resolveBinding();
        
        for (; superclass != null; superclass = superclass.getSuperclass()) {
        	addAllMethods(document, superclass);
        }   
	}
	
	@Override
	protected void addField(final Document document, IMethodBinding methodBinding) {
        final IMethodName method = BindingUtils.toMethodName(methodBinding);
        
        addAnalyzedField(document, Fields.ALL_METHOD_NAMES, method.getName());
	}

}
