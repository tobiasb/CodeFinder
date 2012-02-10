package org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.TryStatement;

public interface ITryCatchBlockIndexer extends IIndexer {
    void indexTryCatchBlock(final Document document, final TryStatement tryStatement, CatchClause catchClause);
}
