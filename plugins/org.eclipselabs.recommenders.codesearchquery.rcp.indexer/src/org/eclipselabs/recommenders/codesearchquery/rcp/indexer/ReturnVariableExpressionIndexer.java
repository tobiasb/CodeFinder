package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IMethodIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;

public class ReturnVariableExpressionIndexer extends AbstractIndexer implements
		IMethodIndexer {

	@Override
	public void index(final Document document, final MethodDeclaration method) {
		ASTVisitor visitor = new ASTVisitor() {
			@Override
			public boolean visit(ReturnStatement node) {
				if(node.getExpression() != null) {
					addAnalyzedField(document, Fields.RETURN_VARIABLE_EXPRESSIONS, node.getExpression().toString());
				}
				
				return false;
			}
		};
		
		method.accept(visitor);
	}

}
