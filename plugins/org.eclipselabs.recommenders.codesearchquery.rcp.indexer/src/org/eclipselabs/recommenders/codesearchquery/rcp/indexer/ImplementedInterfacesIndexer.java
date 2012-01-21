package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;
import org.eclipselabs.recommenders.codesearchquery.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;

public class ImplementedInterfacesIndexer extends AbstractIndexer implements IClassIndexer {

    @Override
    public void index(final Document document, final TypeDeclaration type) {
        ITypeBinding clazz = type.resolveBinding();
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
