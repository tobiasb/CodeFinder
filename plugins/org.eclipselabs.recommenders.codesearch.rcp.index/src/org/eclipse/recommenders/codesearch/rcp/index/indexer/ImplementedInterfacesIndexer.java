package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IClassIndexer;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;

public class ImplementedInterfacesIndexer extends AbstractIndexer implements IClassIndexer {

    @Override
    public void indexType(final Document document, final TypeDeclaration type) {
        final ITypeBinding clazz = type.resolveBinding();
        if (clazz == null) {
            return;
        }
        for (final ITypeBinding interface_ : clazz.getInterfaces()) {
            final ITypeName interfaceName = BindingUtils.toTypeName(interface_);
            if (!isPrimitiveOrArrayOrNullOrObjectOrString(interfaceName)) {
                addAnalyzedField(document, Fields.IMPLEMENTED_TYPES, interfaceName.getIdentifier());
            }
        }
    }
}
