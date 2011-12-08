package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.names.VmTypeName;

public abstract class AbstractIndexer {

    
    protected void addAnalyzedField(Document doc, String fieldName, String fieldValue) {        
        Field field = new Field(fieldName, fieldValue,
                Field.Store.YES, Field.Index.NOT_ANALYZED_NO_NORMS);

        System.out.println("Adding field: " + field.toString());
        
        doc.add(field);
    }

    protected boolean isPrimitiveOrArrayOrNullOrObjectOrString(
            final ITypeName type) {
        return type == null || type.isPrimitiveType() || type.isArrayType()
                || type == VmTypeName.OBJECT || type == VmTypeName.STRING;
    }
}
