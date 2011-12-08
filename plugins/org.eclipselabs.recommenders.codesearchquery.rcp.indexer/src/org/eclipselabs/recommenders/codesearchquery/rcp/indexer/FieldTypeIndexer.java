package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.recommenders.rcp.utils.ast.BindingUtils;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IFieldIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;

public class FieldTypeIndexer extends AbstractIndexer implements IFieldIndexer {

	@Override
	public void index(Document document, FieldDeclaration field) {
        final ITypeBinding fieldTypeBinding = field.getType().resolveBinding();
        final ITypeName typeName = BindingUtils.toTypeName(fieldTypeBinding);
        addAnalyzedField(document, Fields.FIELD_TYPE, typeName.getIdentifier());
	}

}
