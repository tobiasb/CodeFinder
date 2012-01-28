package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IMethodIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.ITryCatchBlockIndexer;

public class FieldsReadIndexer extends AbstractFieldsAccessIndexer implements IClassIndexer, IMethodIndexer,
        ITryCatchBlockIndexer {

    @Override
    public void index(final Document document, final MethodDeclaration method) {
        addFields(document, method, Fields.FIELDS_READ, AssignmentSide.RIGHT);
    }

    @Override
    public void index(final Document document, final TypeDeclaration type) {
        addFields(document, type, Fields.FIELDS_READ, AssignmentSide.RIGHT);
    }

    @Override
    public void index(final Document document, final TryStatement tryStatement, final CatchClause catchClause) {
        addFields(document, catchClause, Fields.FIELDS_READ, AssignmentSide.RIGHT);
    }
}
