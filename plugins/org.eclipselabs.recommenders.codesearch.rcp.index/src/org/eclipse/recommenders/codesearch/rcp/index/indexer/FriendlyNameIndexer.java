package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IClassIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IFieldIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IMethodIndexer;
import org.eclipse.recommenders.utils.names.IMethodName;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;

import com.google.common.base.Optional;

public class FriendlyNameIndexer extends AbstractIndexer implements IMethodIndexer, IClassIndexer, IFieldIndexer {

    @Override
    public void indexMethod(final Document document, final MethodDeclaration method) {

        final IMethodBinding b = method.resolveBinding();
        final Optional<IMethodName> opt = BindingUtils.toMethodName(b);
        if (opt.isPresent()) {
            addAnalyzedField(document, Fields.FRIENDLY_NAME, opt.get().getName());
        } else {
            addAnalyzedField(document, Fields.FRIENDLY_NAME, "");
        }
    }

    @Override
    public void indexType(final Document document, final TypeDeclaration type) {
        final ITypeBinding b = type.resolveBinding();
        final Optional<ITypeName> opt = BindingUtils.toTypeName(b);
        if (opt.isPresent()) {
            addAnalyzedField(document, Fields.FRIENDLY_NAME, opt.get().getClassName());
        }
    }

    @Override
    public void indexField(final Document document, final FieldDeclaration field) {
        addAnalyzedField(document, Fields.FRIENDLY_NAME, field.fragments().get(0).toString());
    }
}
