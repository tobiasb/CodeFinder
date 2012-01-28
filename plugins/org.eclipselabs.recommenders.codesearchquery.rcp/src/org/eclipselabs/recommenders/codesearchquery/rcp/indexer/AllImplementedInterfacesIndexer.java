package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;
import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;

public class AllImplementedInterfacesIndexer extends ImplementedInterfacesIndexer implements IClassIndexer {

    @Override
    public void index(final Document document, final TypeDeclaration type) {

        final ITypeBinding b = type.resolveBinding();
        if (b == null) {
            return;
        }
        for (final ITypeBinding interface_ : b.getInterfaces()) {

            ITypeBinding superclass = interface_;

            for (; superclass != null;) {
                final ITypeName interfaceName = BindingUtils.toTypeName(superclass);

                if (!isPrimitiveOrArrayOrNullOrObjectOrString(interfaceName)) {
                    addAnalyzedField(document, Fields.ALL_IMPLEMENTED_TYPES, interfaceName.getIdentifier());
                }

                superclass = superclass.getInterfaces().length > 0 ? superclass.getInterfaces()[0] : null;
            }
        }
    }
}