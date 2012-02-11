package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IClassIndexer;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;

public class AllImplementedInterfacesIndexer extends ImplementedInterfacesIndexer implements IClassIndexer {

    @Override
    public void indexType(final Document document, final TypeDeclaration type) {

        final ITypeBinding b = type.resolveBinding();
        if (b == null) {
            return;
        }
        for (final ITypeBinding interface_ : b.getInterfaces()) {

            ITypeBinding superclass = interface_;

            for (; superclass != null;) {
                final ITypeName interfaceName = BindingUtils.toTypeName(superclass).orNull();
                if (!isPrimitiveOrArrayOrNullOrObjectOrString(interfaceName)) {
                    addAnalyzedField(document, Fields.ALL_IMPLEMENTED_TYPES, interfaceName.getIdentifier());
                }

                superclass = superclass.getInterfaces().length > 0 ? superclass.getInterfaces()[0] : null;
            }
        }
    }
}
