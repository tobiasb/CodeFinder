package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import java.util.List;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IClassIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IFieldIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IMethodIndexer;

import com.google.common.base.Optional;

public class QualifiedNameIndexer implements IMethodIndexer, IClassIndexer, IFieldIndexer {

    @Override
    public void indexMethod(final Document document, final MethodDeclaration method) {
        final Optional<String> opt = BindingHelper.getIdentifier(method);
        if (opt.isPresent()) {
        	CodeIndexer.addFieldToDocument(document, Fields.QUALIFIED_NAME, opt.get());
        }
    }

    @Override
    public void indexType(final Document document, final TypeDeclaration type) {
        final Optional<String> opt = BindingHelper.getIdentifier(type);
        if (opt.isPresent()) {
        	CodeIndexer.addFieldToDocument(document, Fields.QUALIFIED_NAME, opt.get());
        }
    }

    @Override
    public void indexField(final Document document, final FieldDeclaration field) {
        final Optional<String> opt = BindingHelper.getIdentifier(AstHelper.getDeclaringType(field));

        if (opt.isPresent()) {
            @SuppressWarnings("unchecked")
            final List<VariableDeclarationFragment> fragments = field.fragments();
            final VariableDeclarationFragment fragment = fragments.get(0);
            CodeIndexer.addFieldToDocument(document, Fields.QUALIFIED_NAME, opt.get() + "." + fragment.getName());
        }
    }
}
