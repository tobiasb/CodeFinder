package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IClassIndexer;

import com.google.common.base.Optional;

public class ExtendedTypeIndexer extends AbstractIndexer implements IClassIndexer {

    @Override
    public void indexType(final Document document, final TypeDeclaration type) {
        final ITypeBinding clazz = type.resolveBinding();
        if (clazz != null) {
            addAnalyzedExtendedTypeField(document, clazz, Fields.EXTENDED_TYPE);
        }
    }

    protected void addAnalyzedExtendedTypeField(final Document document, final ITypeBinding typeBinding,
            final String fieldName) {
        final ITypeBinding superclass = typeBinding.getSuperclass();
        final Optional<String> opt = BindingHelper.getIdentifier(superclass);
        if (opt.isPresent()) {
            addFieldToDocument(document, fieldName, opt.get());
        }
    }

}
