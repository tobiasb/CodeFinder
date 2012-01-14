package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipselabs.recommenders.codesearchquery.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;

public class AllExtendedTypesIndexer extends ExtendedTypeIndexer implements IClassIndexer {
    
    @Override
    public void index(Document document, TypeDeclaration type) {
        final ITypeBinding clazz = type.resolveBinding();
        ITypeBinding superclass = clazz;
        
        for (; superclass != null; superclass = superclass.getSuperclass()) {
            addAnalyzedExtendedTypeField(document, superclass, Fields.ALL_EXTENDED_TYPES);
        }
    }
}
