package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.ITryCatchBlockIndexer;

import com.google.common.base.Optional;

public class CaughtTypeIndexer extends AbstractIndexer implements ITryCatchBlockIndexer {

    @Override
    public void indexTryCatchBlock(final Document document, final TryStatement tryStatement, final CatchClause catchClause) {

        final Optional<String> opt = BindingHelper.getIdentifier(catchClause.getException().getType().resolveBinding());
        if (opt.isPresent()) {
            addAnalyzedField(document, Fields.CAUGHT_TYPE, opt.get());
        }
    }

}
