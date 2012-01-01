package org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.TypeDeclaration;


public interface IClassIndexer extends IIndexer {
    void index(Document document, TypeDeclaration type);
}
