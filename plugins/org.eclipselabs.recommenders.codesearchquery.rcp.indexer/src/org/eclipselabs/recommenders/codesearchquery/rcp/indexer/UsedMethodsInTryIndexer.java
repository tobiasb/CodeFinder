package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;
import org.eclipse.recommenders.utils.names.IMethodName;
import org.eclipselabs.recommenders.codesearchquery.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.ITryCatchBlockIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.visitor.MethodCallVisitor;

public class UsedMethodsInTryIndexer extends AbstractIndexer implements
		ITryCatchBlockIndexer {

	@Override
	public void index(final Document document, TryStatement tryStatement,
			CatchClause catchClause) {
		
        ASTVisitor visitor = new MethodCallVisitor() {
            @Override
            protected void handleMethodCall(IMethodBinding methodBinding) {
                final IMethodName methodName = BindingUtils.toMethodName(methodBinding);
                if (methodName != null) {
                    addAnalyzedField(document, Fields.USED_METHODS_IN_TRY, methodName.getIdentifier());
                }
            };
        };
       
        tryStatement.accept(visitor);
	}

}
