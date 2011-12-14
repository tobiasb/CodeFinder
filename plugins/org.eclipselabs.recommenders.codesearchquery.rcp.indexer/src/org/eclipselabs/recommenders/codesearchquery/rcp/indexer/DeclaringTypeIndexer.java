package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.rcp.utils.ast.BindingUtils;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.*;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;

public class DeclaringTypeIndexer extends AbstractIndexer implements
		IFieldIndexer, IMethodIndexer, IClassIndexer {

	@Override
	public void index(Document document, TypeDeclaration type) {
		addFieldForParentTypes(document, type);
	}

	@Override
	public void index(Document document, MethodDeclaration method) {
		addFieldForParentTypes(document, method);
	}

	@Override
	public void index(Document document, FieldDeclaration field) {
		addFieldForParentTypes(document, field);
	}

	private void addFieldForParentTypes(Document document, ASTNode n) {

		ASTNode node = n.getParent();
		
		for(; node != null; node = node.getParent()) {
			if(node instanceof TypeDeclaration) {
		        ITypeBinding b = ((TypeDeclaration)node).resolveBinding();
		        final ITypeName typeName = BindingUtils.toTypeName(b);
		        
		        addAnalyzedField(document, Fields.DECLARING_TYPES, typeName.getIdentifier());
			}
		}
	}
}
