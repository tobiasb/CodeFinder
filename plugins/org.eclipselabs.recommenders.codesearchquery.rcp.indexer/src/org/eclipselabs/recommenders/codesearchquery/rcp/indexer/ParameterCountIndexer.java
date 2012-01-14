package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.recommenders.utils.names.IMethodName;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;
import org.eclipselabs.recommenders.codesearchquery.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IMethodIndexer;

public class ParameterCountIndexer extends AbstractIndexer implements
		IMethodIndexer {

	@Override
	public void index(Document document, MethodDeclaration method) {

        IMethodBinding b = method.resolveBinding();
        final IMethodName methodName = BindingUtils.toMethodName(b);
        
        if(methodName != null) {
            addAnalyzedField(document, Fields.PARAMETER_COUNT, methodName.getParameterTypes().length);
        }
	}

}
