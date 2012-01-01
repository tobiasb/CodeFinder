package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IMethodIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.ITryCatchBlockIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;

public class FieldsWrittenIndexer extends AbstractFieldsAccessIndexer implements
		IMethodIndexer, ITryCatchBlockIndexer {

	@Override
	public void index(Document document, MethodDeclaration method) {
		addFields(document, method, Fields.FIELDS_WRITTEN, AssignmentSide.LEFT);
	}
	
	@Override
	public void index(Document document, TryStatement tryStatement,
			CatchClause catchClause) {
		addFields(document, catchClause, Fields.FIELDS_WRITTEN, AssignmentSide.LEFT);
	}

}
