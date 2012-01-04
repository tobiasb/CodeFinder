package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.InstanceofExpression;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IMethodIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.ITryCatchBlockIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;

public class InstanceOfIndexer extends AbstractIndexer implements
		IMethodIndexer, ITryCatchBlockIndexer, IClassIndexer {

	@Override
	public void index(Document document, TypeDeclaration type) {
		InstanceOfVisitor visitor = new InstanceOfVisitor(document);
		type.accept(visitor);
	}

	@Override
	public void index(Document document, TryStatement tryStatement,
			CatchClause catchClause) {
		InstanceOfVisitor visitor = new InstanceOfVisitor(document);
		catchClause.accept(visitor);
	}

	@Override
	public void index(Document document, MethodDeclaration method) {
		InstanceOfVisitor visitor = new InstanceOfVisitor(document);
		method.accept(visitor);
	}
	
	private class InstanceOfVisitor extends ASTVisitor {
		private final Document document;
		
		public InstanceOfVisitor(Document document) {
			this.document = document;
		}
		
		@Override
		public boolean visit(InstanceofExpression node) {

			ITypeBinding type = node.getRightOperand().resolveBinding();
			ITypeName typeName = BindingUtils.toTypeName(type);
			
			addAnalyzedField(document, Fields.INSTANCEOF_TYPES, BindingHelper.getIdentifier(typeName));
			
			return false;
		}
	};
}
