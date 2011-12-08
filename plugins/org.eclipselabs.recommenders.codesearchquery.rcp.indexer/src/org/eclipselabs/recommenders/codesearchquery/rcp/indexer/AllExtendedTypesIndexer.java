package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;

public class AllExtendedTypesIndexer extends AbstractIndexer implements IClassIndexer {

    private final ExtendedTypeIndexer extendedTypeIndexer;
    
    public AllExtendedTypesIndexer(ExtendedTypeIndexer extendedTypeIndexer) {
        this.extendedTypeIndexer = extendedTypeIndexer;
    }
    
    @Override
    public void index(Document document, TypeDeclaration type) {
        final ITypeBinding clazz = type.resolveBinding();
        ITypeBinding superclass = clazz.getSuperclass();
        // add superclass, if not null and not Object
        for (; superclass != null; superclass = superclass.getSuperclass()) {
            extendedTypeIndexer.addAnalyzedExtendedTypeField(document, superclass, Fields.ALL_EXTENDED_TYPES);
        }
    }
}
