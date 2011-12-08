package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import java.util.Collection;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.names.VmTypeName;

public abstract class AbstractIndexer {

    
    protected void addAnalyzedField(final Document document, final String fieldName, final String fieldValue) {        
        Field field = new Field(fieldName, fieldValue,
                Field.Store.YES, Field.Index.NOT_ANALYZED_NO_NORMS);

        System.out.println("Adding field: " + field.toString());
        
        document.add(field);
    }
    
    protected void addToDocument(final Document document, final String fieldName, final Collection<String> fieldValues) {
        for(final String value : fieldValues) {
        	addAnalyzedField(document, fieldName, value);
        }
    }

    protected boolean isPrimitiveOrArrayOrNullOrObjectOrString(
            final ITypeName type) {
        return type == null || type.isPrimitiveType() || type.isArrayType()
                || type == VmTypeName.OBJECT || type == VmTypeName.STRING;
    }
	
	protected void debugOut(String msg, String origin) {
//	    Activator.logInfo("%1$s [%2$s]: %3$s (%4$s)", getDocumentType(), getName(), msg, origin);
	} 
}
