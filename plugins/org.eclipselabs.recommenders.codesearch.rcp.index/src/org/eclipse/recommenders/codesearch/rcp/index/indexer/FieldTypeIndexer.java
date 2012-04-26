package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IFieldIndexer;

import com.google.common.base.Optional;

public class FieldTypeIndexer implements IFieldIndexer {

    @Override
    public void indexField(final Document document, final FieldDeclaration field) {
        final Optional<String> opt = BindingHelper.getIdentifier(field);
        if (opt.isPresent()) {
        	CodeIndexer.addFieldToDocument(document, Fields.FIELD_TYPE, opt.get());
        }
    }

}
