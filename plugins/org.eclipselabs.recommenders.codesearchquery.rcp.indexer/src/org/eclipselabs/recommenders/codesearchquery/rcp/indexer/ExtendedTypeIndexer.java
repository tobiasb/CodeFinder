package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;

public class ExtendedTypeIndexer extends AbstractIndexer implements IClassIndexer {

    @Override
    public void index(Document document, TypeDeclaration type) {
        final ITypeBinding clazz = type.resolveBinding();

        addAnalyzedExtendedTypeField(document, clazz, Fields.EXTENDED_TYPE);
    }
    
    protected void addAnalyzedExtendedTypeField(final Document document, final ITypeBinding typeBinding, final String fieldName) {
        final ITypeBinding superclass = typeBinding.getSuperclass();
        
        final ITypeName superclassName = BindingUtils
                .toTypeName(superclass);            
        
        if (!isPrimitiveOrArrayOrNullOrObjectOrString(superclassName)) {
            addAnalyzedField(document, fieldName, superclassName.getIdentifier());
        }
    }

}
