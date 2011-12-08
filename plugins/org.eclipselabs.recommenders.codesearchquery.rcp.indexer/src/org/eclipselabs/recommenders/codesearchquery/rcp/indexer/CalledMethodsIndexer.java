package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.recommenders.rcp.utils.ast.BindingUtils;
import org.eclipse.recommenders.utils.names.IMethodName;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.*;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.visitor.MethodCallVisitor;

public class CalledMethodsIndexer extends AbstractIndexer implements IMethodIndexer {

    @Override
    public void index(final Document document, final MethodDeclaration method) {

        ASTVisitor visitor = new MethodCallVisitor() {
            @Override
            protected void handleMethodCall(IMethodBinding methodBinding) {
                final IMethodName methodName = BindingUtils.toMethodName(methodBinding);
                if (methodName != null) {
                    addAnalyzedField(document, Fields.CALLED_METHODS, methodName.getIdentifier());
                }
            };
        };
       
        method.accept(visitor);
    }

}
