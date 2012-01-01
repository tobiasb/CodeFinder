package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IMethodIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.ITryCatchBlockIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;

public class AllFieldNamesIndexer extends DeclaredFieldNamesIndexer implements
		IClassIndexer, IMethodIndexer, ITryCatchBlockIndexer {

	@Override
	public void index(final Document document, TypeDeclaration type) {
		ITypeBinding typeBinding = type.resolveBinding();
		addFields(document, typeBinding);
	}

	@Override
	public void index(final Document document, MethodDeclaration method) {
        addFields(document, method);
        
		ITypeBinding typeBinding = getDeclaringType(method).resolveBinding();
        addFields(document, typeBinding);
	}

	@Override
	public void index(final Document document, TryStatement tryStatement, CatchClause catchClause) {
		addFields(document, catchClause);
        addFields(document, getDeclaringMethod(catchClause));

		ITypeBinding typeBinding = getDeclaringType(catchClause).resolveBinding();
        addFields(document, typeBinding);
	}
	
	private void addFields(final Document document, ITypeBinding type) {
		IType typeName = BindingUtils.getType(type);
		
		try {
			for(IField field : typeName.getFields()) {
		        addAnalyzedField(document, Fields.ALL_FIELD_NAMES, field.getElementName());
			}
		} catch (JavaModelException e) {
		}
		
		if(type.getSuperclass() != null) {
			ITypeBinding superclass = type.getSuperclass();
			addFields(document, superclass);
		}
	}
	
	private void addFields(final Document document, MethodDeclaration method) {
		final ASTVisitor visitor = new ASTVisitor() {
			@Override
			public boolean visit(VariableDeclarationStatement node) {
		        addAnalyzedField(document, Fields.ALL_FIELD_NAMES, node.fragments().get(0).toString());
            	return false;
			}
		};
        
        method.accept(visitor);
	}
	
	private void addFields(final Document document, CatchClause catchClause) {
		final ASTVisitor visitor = new ASTVisitor() {
			@Override
			public boolean visit(VariableDeclarationStatement node) {
		        addAnalyzedField(document, Fields.ALL_FIELD_NAMES, node.fragments().get(0).toString());
            	return false;
			}
		};
        
		catchClause.accept(visitor);
	}
}
