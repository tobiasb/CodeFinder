package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipselabs.recommenders.codesearchquery.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.ITryCatchBlockIndexer;

public class UsedFieldsInTryIndexer extends AbstractFieldsAccessIndexer implements
		ITryCatchBlockIndexer {

	@Override
	public void index(Document document, TryStatement tryStatement,
			CatchClause catchClause) {

		addFields(document, tryStatement, Fields.USED_FIELDS_IN_TRY);
	}

}
