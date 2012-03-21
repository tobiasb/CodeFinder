package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.IVariableBinding;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IClassIndexer;

public class AllDeclaredFieldNamesIndexer extends DeclaredFieldNamesIndexer implements IClassIndexer {

    @Override
    public void indexType(final Document document, final TypeDeclaration type) {
        ITypeBinding superclass = type.resolveBinding();

        for (; superclass != null; superclass = superclass.getSuperclass()) {
            addFields(document, superclass);
        }
    }

    private void addFields(final Document document, final ITypeBinding type) {
        if (type == null) {
            return;
        }

        for (final IVariableBinding field : type.getDeclaredFields()) {
            addFieldToDocument(document, Fields.ALL_DECLARED_FIELD_NAMES, field.getName());
        }
    }

}
