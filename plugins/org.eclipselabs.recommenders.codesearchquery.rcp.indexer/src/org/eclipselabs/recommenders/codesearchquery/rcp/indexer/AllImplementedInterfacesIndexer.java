package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;

public class AllImplementedInterfacesIndexer extends AbstractIndexer implements IClassIndexer {

    private final ImplementedInterfacesIndexer implementedInterfaceIndexer;
    
    public AllImplementedInterfacesIndexer(ImplementedInterfacesIndexer implementedInterfaceIndexer) {
        this.implementedInterfaceIndexer = implementedInterfaceIndexer;
    }
    
    @Override
    public void index(Document document, TypeDeclaration type) {
        final ITypeBinding clazz = type.resolveBinding();
        ITypeBinding superclass = clazz.getSuperclass();
        // add superclass, if not null and not Object
        for (; superclass != null; superclass = superclass.getSuperclass()) {
            implementedInterfaceIndexer.addAnalyzedImplementedInterfaceField(document, superclass, Fields.ALL_IMPLEMENTED_TYPES);
        }
    }

}
