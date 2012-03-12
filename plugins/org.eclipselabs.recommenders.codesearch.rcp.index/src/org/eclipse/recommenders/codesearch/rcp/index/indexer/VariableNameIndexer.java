package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IVarUsageIndexer;

public class VariableNameIndexer extends AbstractIndexer implements IVarUsageIndexer {

    @Override
    public void indexVarUsage(Document document, MethodDeclaration method, SimpleName name) {
        addFieldToDocument(document, Fields.VARIABLE_NAME, name.toString());
    }

}
