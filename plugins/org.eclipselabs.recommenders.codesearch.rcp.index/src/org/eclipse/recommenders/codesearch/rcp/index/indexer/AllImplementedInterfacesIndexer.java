package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IClassIndexer;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;

import com.google.common.base.Optional;

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
                final Optional<ITypeName> opt = BindingUtils.toTypeName(superclass);

                if (opt.isPresent()) {
                	CodeIndexer.addFieldToDocument(document, Fields.ALL_IMPLEMENTED_TYPES, opt.get().getIdentifier());
                }

                superclass = superclass.getInterfaces().length > 0 ? superclass.getInterfaces()[0] : null;
            }
        }
    }
}
