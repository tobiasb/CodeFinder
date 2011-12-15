package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;

public class DeclaredMethodNamesIndexer extends AbstractIndexer implements
		IClassIndexer {

	@Override
	public void index(Document document, TypeDeclaration type) {
		// TODO Auto-generated method stub

	}

}
