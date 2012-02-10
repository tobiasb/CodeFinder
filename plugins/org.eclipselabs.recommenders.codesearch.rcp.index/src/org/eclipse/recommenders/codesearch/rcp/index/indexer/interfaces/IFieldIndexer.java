package org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.FieldDeclaration;

public interface IFieldIndexer extends IIndexer {
    void indexField(Document document, FieldDeclaration field);
}
