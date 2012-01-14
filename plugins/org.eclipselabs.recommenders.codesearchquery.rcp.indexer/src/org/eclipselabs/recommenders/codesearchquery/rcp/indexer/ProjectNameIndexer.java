package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipselabs.recommenders.codesearchquery.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IFieldIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IMethodIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.ITryCatchBlockIndexer;

public class ProjectNameIndexer extends AbstractIndexer implements
		IClassIndexer, IMethodIndexer, ITryCatchBlockIndexer, IFieldIndexer {

	@Override
	public void index(Document document, FieldDeclaration field) {
		addField(document, field);
	}

	@Override
	public void index(Document document, MethodDeclaration method) {
		addField(document, method);
	}

	@Override
	public void index(Document document, TypeDeclaration type) {
		addField(document, type);
	}

	@Override
	public void index(Document document, TryStatement tryStatement,
			CatchClause catchClause) {
		addField(document, tryStatement);
	}
	
	private void addField(final Document document, ASTNode node) {
		String projectName = getProject(node).getName();
		
		addAnalyzedField(document, Fields.PROJECT_NAME, projectName);
	}
}
