package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.recommenders.rcp.utils.ast.BindingUtils;
import org.eclipse.recommenders.utils.names.IMethodName;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IMethodIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;

public class ReturnTypeIndexer extends AbstractIndexer implements IMethodIndexer {

    @Override
    public void index(Document document, MethodDeclaration method) {
        IMethodBinding b = method.resolveBinding();
        final IMethodName methodName = BindingUtils.toMethodName(b);
        
        if(methodName != null) {
	        ITypeName returnType = methodName.getReturnType();
	        
	        if(!isPrimitiveOrArrayOrNullOrObjectOrString(returnType)) {
	            addAnalyzedField(document, Fields.RETURN_TYPE, returnType.getIdentifier());
	        }
        }
    }
}
