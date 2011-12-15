package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IMethodIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.ITryCatchBlockIndexer;

public class DeclaredFieldTypesIndexer extends AbstractIndexer implements
		IClassIndexer, IMethodIndexer, ITryCatchBlockIndexer {

	@Override
	public void index(Document document, MethodDeclaration method) {
		// TODO Auto-generated method stub

	}

	@Override
	public void index(Document document, TypeDeclaration type) {
		// TODO Auto-generated method stub

	}

	@Override
	public void index(Document document, TryStatement tryStatement,
			CatchClause catchClause) {
		// TODO Auto-generated method stub
		
	}

}
