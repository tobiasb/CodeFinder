package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;
import org.eclipse.recommenders.utils.names.IMethodName;
import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IMethodIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.ITryCatchBlockIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.visitor.MethodCallVisitor;

public class UsedMethodsIndexer extends AbstractIndexer implements
		IClassIndexer, IMethodIndexer, ITryCatchBlockIndexer {

	@Override
	public void index(final Document document, MethodDeclaration method) {
        ASTVisitor visitor = new MethodCallVisitor() {
            @Override
            protected void handleMethodCall(IMethodBinding methodBinding) {
                final IMethodName methodName = BindingUtils.toMethodName(methodBinding);
                if (methodName != null) {
                    addAnalyzedField(document, Fields.USED_METHODS, methodName.getIdentifier());
                }
            };
        };
       
        method.accept(visitor);
	}

	@Override
	public void index(final Document document, TypeDeclaration type) {
        ASTVisitor visitor = new MethodCallVisitor() {
            @Override
            protected void handleMethodCall(IMethodBinding methodBinding) {
                final IMethodName methodName = BindingUtils.toMethodName(methodBinding);
                if (methodName != null) {
                    addAnalyzedField(document, Fields.USED_METHODS, methodName.getIdentifier());
                }
            };
        };
       
        type.accept(visitor);
	}

	@Override
	public void index(final Document document, TryStatement tryStatement,
			CatchClause catchClause) {
		
        ASTVisitor visitor = new MethodCallVisitor() {
            @Override
            protected void handleMethodCall(IMethodBinding methodBinding) {
                final IMethodName methodName = BindingUtils.toMethodName(methodBinding);
                if (methodName != null) {
                    addAnalyzedField(document, Fields.USED_METHODS, methodName.getIdentifier());
                }
            };
        };
       
        catchClause.accept(visitor);
	}

}
