package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IClassIndexer;

public class AllExtendedTypesIndexer extends ExtendedTypeIndexer implements IClassIndexer {

    @Override
    public void index(final Document document, final TypeDeclaration type) {
        final ITypeBinding clazz = type.resolveBinding();
        ITypeBinding superclass = clazz;

        for (; superclass != null; superclass = superclass.getSuperclass()) {
            addAnalyzedExtendedTypeField(document, superclass, Fields.ALL_EXTENDED_TYPES);
        }
    }
}
