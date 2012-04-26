package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IMethodIndexer;

public class ParameterCountIndexer implements IMethodIndexer {

    @Override
    public void indexMethod(final Document document, final MethodDeclaration method) {
    	CodeIndexer.addFieldToDocument(document, Fields.PARAMETER_COUNT, method.parameters().size());
    }
}
