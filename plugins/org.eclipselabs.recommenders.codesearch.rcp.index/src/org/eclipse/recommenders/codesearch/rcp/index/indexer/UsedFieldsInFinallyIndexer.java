package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.ITryCatchBlockIndexer;

public class UsedFieldsInFinallyIndexer extends AbstractFieldsAccessIndexer implements ITryCatchBlockIndexer {

    @Override
    public void indexTryCatchBlock(final Document document, final TryStatement tryStatement,
            final CatchClause catchClause) {
        if (tryStatement.getFinally() != null) {
            addFields(document, tryStatement.getFinally(), Fields.USED_FIELDS_IN_FINALLY);
        }
    }
}
