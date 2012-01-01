package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IMethodIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.ITryCatchBlockIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;

public class FieldsReadIndexer extends AbstractFieldsAccessIndexer implements
		IClassIndexer, IMethodIndexer, ITryCatchBlockIndexer {

	@Override
	public void index(final Document document, MethodDeclaration method) {
		addFields(document, method, Fields.FIELDS_READ, AssignmentSide.RIGHT);
	}

	@Override
	public void index(Document document, TypeDeclaration type) {
		addFields(document, type, Fields.FIELDS_READ, AssignmentSide.RIGHT);
	}

	@Override
	public void index(Document document, TryStatement tryStatement,
			CatchClause catchClause) {
		addFields(document, catchClause, Fields.FIELDS_READ, AssignmentSide.RIGHT);
	}
}
