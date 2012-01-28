package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IMethodIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.ITryCatchBlockIndexer;

public class FieldsWrittenIndexer extends AbstractFieldsAccessIndexer implements IMethodIndexer, ITryCatchBlockIndexer {

    @Override
    public void index(final Document document, final MethodDeclaration method) {
        addFields(document, method, Fields.FIELDS_WRITTEN, AssignmentSide.LEFT);
    }

    @Override
    public void index(final Document document, final TryStatement tryStatement, final CatchClause catchClause) {
        addFields(document, catchClause, Fields.FIELDS_WRITTEN, AssignmentSide.LEFT);
    }

}
