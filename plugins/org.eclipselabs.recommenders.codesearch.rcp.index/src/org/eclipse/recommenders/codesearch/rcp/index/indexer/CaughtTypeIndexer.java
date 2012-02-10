package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.ITryCatchBlockIndexer;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;

public class CaughtTypeIndexer extends AbstractIndexer implements ITryCatchBlockIndexer {

    @Override
    public void indexTryCatchBlock(final Document document, final TryStatement tryStatement, final CatchClause catchClause) {

        final ITypeName typeName = BindingUtils.toTypeName(catchClause.getException().getType().resolveBinding());
        addAnalyzedField(document, Fields.CAUGHT_TYPE, typeName.getIdentifier());
    }

}
