package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import java.util.List;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IClassIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IFieldIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IMethodIndexer;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;

import com.google.common.base.Optional;

public class FullyQualifiedNameIndexer extends AbstractIndexer implements IMethodIndexer, IClassIndexer, IFieldIndexer {

    @Override
    public void indexMethod(final Document document, final MethodDeclaration method) {
        addAnalyzedField(document, Fields.FULLY_QUALIFIED_NAME, BindingHelper.getIdentifier(method));
    }

    @Override
    public void indexType(final Document document, final TypeDeclaration type) {
        addAnalyzedField(document, Fields.FULLY_QUALIFIED_NAME, BindingHelper.getIdentifier(type));
    }

    @Override
    public void indexField(final Document document, final FieldDeclaration field) {
        final Optional<TypeDeclaration> opt = getDeclaringType(field);

        if (opt.isPresent()) {
            final ITypeBinding b = opt.get().resolveBinding();
            final ITypeName declaringTypeName = BindingUtils.toTypeName(b);

            @SuppressWarnings("unchecked")
            final List<VariableDeclarationFragment> fragments = field.fragments();
            final VariableDeclarationFragment fragment = fragments.get(0);

            addAnalyzedField(document, Fields.FULLY_QUALIFIED_NAME,
                    declaringTypeName.getIdentifier() + "." + fragment.getName());
        }
    }
}
