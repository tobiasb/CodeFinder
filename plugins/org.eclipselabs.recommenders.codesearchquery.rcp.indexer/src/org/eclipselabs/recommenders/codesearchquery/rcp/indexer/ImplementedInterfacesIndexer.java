package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.rcp.utils.ast.BindingUtils;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;

public class ImplementedInterfacesIndexer extends AbstractIndexer implements IClassIndexer {

    @Override
    public void index(final Document document, final TypeDeclaration type) {
        for (final ITypeBinding interface_ : type.resolveBinding().getInterfaces()) {
            final ITypeName interfaceName = BindingUtils.toTypeName(interface_);
            if (!isPrimitiveOrArrayOrNullOrObjectOrString(interfaceName)) {
                addAnalyzedField(document, Fields.IMPLEMENTED_TYPES, interfaceName.getIdentifier());
            }
        }
    }
}
