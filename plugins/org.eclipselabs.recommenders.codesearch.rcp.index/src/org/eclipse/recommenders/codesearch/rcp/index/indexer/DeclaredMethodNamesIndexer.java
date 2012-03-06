package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IClassIndexer;

public class DeclaredMethodNamesIndexer extends AbstractIndexer implements IClassIndexer {

    @Override
    public void indexType(final Document document, final TypeDeclaration type) {
        final ITypeBinding superclass = type.resolveBinding();
        if (superclass != null) {
            addAllMethods(document, superclass);
        }
    }

    protected void addAllMethods(final Document document, final ITypeBinding superclass) {
        for (final IMethodBinding methodBinding : superclass.getDeclaredMethods()) {
            addField(document, methodBinding);
        }
    }

    protected void addField(final Document document, final IMethodBinding methodBinding) {
        addAnalyzedField(document, Fields.DECLARED_METHODS_NAMES, methodBinding.getName());
    }

}
