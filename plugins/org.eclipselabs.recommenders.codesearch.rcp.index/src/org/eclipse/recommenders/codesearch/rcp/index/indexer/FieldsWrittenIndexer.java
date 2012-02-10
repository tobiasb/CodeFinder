package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IMethodIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.ITryCatchBlockIndexer;

public class FieldsWrittenIndexer extends AbstractFieldsAccessIndexer implements IMethodIndexer, ITryCatchBlockIndexer {

    @Override
    public void indexMethod(final Document document, final MethodDeclaration method) {
        addFields(document, method, Fields.FIELDS_WRITTEN, AssignmentSide.LEFT);
    }

    @Override
    public void indexTryCatchBlock(final Document document, final TryStatement tryStatement, final CatchClause catchClause) {
        addFields(document, catchClause, Fields.FIELDS_WRITTEN, AssignmentSide.LEFT);
    }

}
