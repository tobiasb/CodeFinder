package org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.TryStatement;

public interface ITryCatchBlockIndexer extends IIndexer {
    void index(final Document document, final TryStatement tryStatement, CatchClause catchClause);
}
