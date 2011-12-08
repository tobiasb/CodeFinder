package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.recommenders.rcp.utils.ast.BindingUtils;
import org.eclipse.recommenders.utils.names.IMethodName;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;

public class ParameterTypesIndexer extends AbstractIndexer implements IMethodIndexer {

    @Override
    public void index(Document document, MethodDeclaration method) {

        IMethodBinding b = method.resolveBinding();
        final IMethodName methodName = BindingUtils.toMethodName(b);
        
        for(ITypeName typeName : methodName.getParameterTypes()) {
            if(!isPrimitiveOrArrayOrNullOrObjectOrString(typeName)) {
                addAnalyzedField(document, Fields.PARAMETER_TYPES, typeName.getIdentifier());
            }
        }
    }
}
