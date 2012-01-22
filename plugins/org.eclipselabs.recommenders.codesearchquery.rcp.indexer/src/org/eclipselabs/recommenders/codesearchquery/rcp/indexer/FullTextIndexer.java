package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IFieldIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IMethodIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.ITryCatchBlockIndexer;

public class FullTextIndexer extends AbstractIndexer implements
		IClassIndexer, IMethodIndexer, ITryCatchBlockIndexer, IFieldIndexer {

	@Override
	public void index(Document document, FieldDeclaration field) {
		addAnalyzedField(document, Fields.FULL_TEXT, field.toString().trim());
	}

	@Override
	public void index(Document document, MethodDeclaration method) {
		addAnalyzedField(document, Fields.FULL_TEXT, method.toString().trim());
	}

	@Override
	public void index(Document document, TypeDeclaration type) {
		addAnalyzedField(document, Fields.FULL_TEXT, type.toString().trim());
	}

	@Override
	public void index(Document document, TryStatement tryStatement,
			CatchClause catchClause) {
		addAnalyzedField(document, Fields.FULL_TEXT, catchClause.toString().trim());
	}
}
