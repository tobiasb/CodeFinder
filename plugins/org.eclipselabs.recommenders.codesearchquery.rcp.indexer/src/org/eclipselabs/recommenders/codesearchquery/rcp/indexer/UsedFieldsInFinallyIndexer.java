package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.ITryCatchBlockIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;

public class UsedFieldsInFinallyIndexer extends AbstractFieldsAccessIndexer implements
		ITryCatchBlockIndexer {

	@Override
	public void index(Document document, TryStatement tryStatement,
			CatchClause catchClause) {
		
		if(tryStatement.getFinally() != null) {
			addFields(document, tryStatement.getFinally(), Fields.USED_FIELDS_IN_FINALLY);
		}
	}

}