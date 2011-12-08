package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.*;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;

public class DocumentTypeIndexer extends AbstractIndexer implements IMethodIndexer, IClassIndexer, IFieldIndexer {

    @Override
    public void index(Document document, MethodDeclaration method) {
        addAnalyzedField(document, Fields.TYPE, "method");
    }

    @Override
    public void index(Document document, TypeDeclaration type) {
        addAnalyzedField(document, Fields.TYPE, "class");
    }

    @Override
    public void index(Document document, FieldDeclaration field) {
        addAnalyzedField(document, Fields.TYPE, "field");
    }
}
