package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.recommenders.utils.names.IMethodName;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;
import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IMethodIndexer;

public class ParameterTypesIndexer extends AbstractIndexer implements IMethodIndexer {

    @Override
    public void index(final Document document, final MethodDeclaration method) {

        final IMethodBinding b = method.resolveBinding();
        final IMethodName methodName = BindingUtils.toMethodName(b);

        if (methodName != null) {
            for (final ITypeName typeName : methodName.getParameterTypes()) {
                if (!isPrimitiveOrArrayOrNullOrObjectOrString(typeName)) {
                    addAnalyzedField(document, Fields.PARAMETER_TYPES, typeName.getIdentifier());
                }
            }
        }
    }
}
