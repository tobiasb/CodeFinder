package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IClassIndexer;

public class AllDeclaredMethodNamesIndexer extends DeclaredMethodNamesIndexer implements IClassIndexer {

    @Override
    public void indexType(final Document document, final TypeDeclaration type) {

        ITypeBinding superclass = type.resolveBinding();

        for (; superclass != null; superclass = superclass.getSuperclass()) {
            addAllMethods(document, superclass);
        }
    }

    @Override
    protected void addField(final Document document, final IMethodBinding methodBinding) {
        addFieldToDocument(document, Fields.ALL_DECLARED_METHOD_NAMES, methodBinding.getName());
    }

}
