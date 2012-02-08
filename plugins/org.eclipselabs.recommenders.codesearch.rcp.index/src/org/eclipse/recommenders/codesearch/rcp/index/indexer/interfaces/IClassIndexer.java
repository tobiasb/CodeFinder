package org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.TypeDeclaration;

public interface IClassIndexer extends IIndexer {
    void index(Document document, TypeDeclaration type);
}
