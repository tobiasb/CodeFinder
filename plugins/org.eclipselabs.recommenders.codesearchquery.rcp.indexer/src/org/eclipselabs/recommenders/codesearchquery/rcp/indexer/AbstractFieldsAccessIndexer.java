package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.QualifiedName;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;
import org.eclipse.recommenders.utils.names.ITypeName;

public abstract class AbstractFieldsAccessIndexer extends AbstractIndexer {
	public enum AssignmentSide { RIGHT, LEFT }
	
	protected void addFields(final Document document, final ASTNode node, final String fieldName) {
		addFields(document, node, fieldName, null);
	}
	
	protected void addFields(final Document document, final ASTNode node, final String fieldName, final AssignmentSide side) {
		ASTVisitor visitor = new ASTVisitor() {
			public boolean visit(QualifiedName node) {
				if(side == null || (parentIsAssignment(node) && currentNodeCorrectSideOfAssignment(node, side)) || side.equals(AssignmentSide.RIGHT)) {
					SimpleName simpleName = node.getName();
	
					ITypeBinding typeBinding = getDeclaringType(node).resolveBinding();
		            ITypeName declaringType = BindingUtils.toTypeName(typeBinding);
		            
	            	String result = String.format("%1$s.%2$s", declaringType.getIdentifier(), simpleName);
	            	
	            	addAnalyzedField(document, fieldName, result);
				}
				
				return false;
			}
		};
		
		node.accept(visitor);
	}
	
	private boolean parentIsAssignment(final ASTNode node) {
		return node.getParent() != null && node.getParent() instanceof Assignment;
	}
	
	private boolean currentNodeCorrectSideOfAssignment(final ASTNode node, final AssignmentSide side) {
		if(side.equals(AssignmentSide.LEFT)) {
			return ((Assignment)node.getParent()).getLeftHandSide() == node;
		} else if (side.equals(AssignmentSide.RIGHT)) {
			return ((Assignment)node.getParent()).getRightHandSide() == node;
		} else {
			//What "else"?
			return false;
		}
	}
}
