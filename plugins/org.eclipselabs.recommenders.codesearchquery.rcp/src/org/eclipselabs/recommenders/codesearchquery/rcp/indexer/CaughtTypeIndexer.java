package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;
import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.ITryCatchBlockIndexer;

public class CaughtTypeIndexer extends AbstractIndexer implements ITryCatchBlockIndexer {

    @Override
    public void index(final Document document, final TryStatement tryStatement, final CatchClause catchClause) {

        final ITypeName typeName = BindingUtils.toTypeName(catchClause.getException().getType().resolveBinding());
        addAnalyzedField(document, Fields.CAUGHT_TYPE, typeName.getIdentifier());
    }

}
