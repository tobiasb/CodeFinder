package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IMethodIndexer;

public class AllFieldNamesIndexer extends AbstractIndexer implements
		IClassIndexer, IMethodIndexer {

	@Override
	public void index(Document document, MethodDeclaration method) {
		// TODO Auto-generated method stub

	}

	@Override
	public void index(Document document, TypeDeclaration type) {
		// TODO Auto-generated method stub

	}

}
