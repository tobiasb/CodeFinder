package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.recommenders.rcp.utils.ast.BindingUtils;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IMethodIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.ITryCatchBlockIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;

public class DeclaredFieldTypesIndexer extends AbstractIndexer implements
		IClassIndexer, IMethodIndexer, ITryCatchBlockIndexer {

	@Override
	public void index(final Document document, MethodDeclaration method) {
		final ASTVisitor visitor = new ASTVisitor() {
			@Override
			public boolean visit(VariableDeclarationStatement node) {
            	addDeclaredFieldType(document, node);
            	return false;
			}
		};
        
        method.accept(visitor);
	}

	@Override
	public void index(final Document document, TypeDeclaration type) {
		final ASTVisitor visitor = new ASTVisitor() {
			@Override
			public boolean visit(FieldDeclaration node) {
		        final ITypeBinding fieldTypeBinding = node.getType().resolveBinding();
		        final ITypeName typeName = BindingUtils.toTypeName(fieldTypeBinding);  
		        addAnalyzedField(document, Fields.DECLARED_FIELD_TYPES, typeName.getIdentifier());
            	return false;
			}
		};
        
		type.accept(visitor);
	}

	@Override
	public void index(final Document document, TryStatement tryStatement, CatchClause catchClause) {
		final ASTVisitor visitor = new ASTVisitor() {
			@Override
			public boolean visit(VariableDeclarationStatement node) {
	        	addDeclaredFieldType(document, node);
	        	return false;
			}
		};
    
		catchClause.accept(visitor);
	}

    private void addDeclaredFieldType(final Document document, VariableDeclarationStatement variableDeclaration) {
        final ITypeBinding fieldTypeBinding = variableDeclaration.getType().resolveBinding();
        final ITypeName typeName = BindingUtils.toTypeName(fieldTypeBinding);  
        addAnalyzedField(document, Fields.DECLARED_FIELD_TYPES, typeName.getIdentifier());
    }
}
