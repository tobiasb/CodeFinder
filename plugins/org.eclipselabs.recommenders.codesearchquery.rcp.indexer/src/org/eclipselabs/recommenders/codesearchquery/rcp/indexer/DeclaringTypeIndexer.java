package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

public class DeclaringTypeIndexer extends AbstractIndexer implements
		IFieldIndexer, IMethodIndexer, IClassIndexer {

	@Override
	public void index(Document document, TypeDeclaration type) {
		
	}

	@SuppressWarnings("unused")
	@Override
	public void index(Document document, MethodDeclaration method) {
		
		ASTNode parent = method.getParent();
		
	}

	@Override
	public void index(Document document, FieldDeclaration field) {
	}

}
