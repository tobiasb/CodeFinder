package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.FieldDeclaration;

public interface IFieldIndexer extends IIndexer {
    void index(Document document, FieldDeclaration field);
}
