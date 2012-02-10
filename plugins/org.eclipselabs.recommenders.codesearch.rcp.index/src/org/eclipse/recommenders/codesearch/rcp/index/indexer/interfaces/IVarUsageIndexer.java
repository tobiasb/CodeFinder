package org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.MethodDeclaration;

public interface IVarUsageIndexer extends IIndexer {
    void indexVarUsage(Document document, MethodDeclaration method);
}
