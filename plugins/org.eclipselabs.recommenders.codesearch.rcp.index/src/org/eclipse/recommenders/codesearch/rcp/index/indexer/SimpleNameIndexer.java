package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import java.util.List;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IClassIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IFieldIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IMethodIndexer;

public class SimpleNameIndexer extends AbstractIndexer implements IMethodIndexer, IClassIndexer, IFieldIndexer {

    @Override
    public void indexMethod(final Document document, final MethodDeclaration method) {
        addFieldToDocument(document, Fields.SIMPLE_NAME, method.getName().getIdentifier());
    }

    @Override
    public void indexType(final Document document, final TypeDeclaration type) {
        addFieldToDocument(document, Fields.SIMPLE_NAME, type.getName().getIdentifier());
    }

    @Override
    public void indexField(final Document document, final FieldDeclaration field) {
        for (final VariableDeclarationFragment f : (List<VariableDeclarationFragment>) field.fragments()) {
            final SimpleName name = f.getName();
            addFieldToDocument(document, Fields.SIMPLE_NAME, name.getIdentifier());
        }

    }
}
