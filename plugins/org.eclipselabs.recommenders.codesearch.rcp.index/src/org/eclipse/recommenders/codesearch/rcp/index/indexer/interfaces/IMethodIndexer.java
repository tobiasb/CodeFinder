package org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.MethodDeclaration;

public interface IMethodIndexer extends IIndexer {
    void index(final Document document, final MethodDeclaration method);
}
