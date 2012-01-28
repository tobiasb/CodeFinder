package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IFieldIndexer;

public class FieldTypeIndexer extends AbstractIndexer implements IFieldIndexer {

    @Override
    public void index(final Document document, final FieldDeclaration field) {
        addAnalyzedField(document, Fields.FIELD_TYPE, BindingHelper.getIdentifier(field));
    }

}
