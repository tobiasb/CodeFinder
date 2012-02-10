package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.internal.corext.dom.Bindings;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IClassIndexer;
import org.eclipse.recommenders.utils.names.IMethodName;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;

@SuppressWarnings("restriction")
public class OverriddenMethodsIndexer extends AbstractIndexer implements IClassIndexer {
    @Override
    public void indexType(final Document document, final TypeDeclaration type) {
        final ASTVisitor visitor = new ASTVisitor() {
            @Override
            public boolean visit(final MethodDeclaration node) {
                final IMethodBinding b = node.resolveBinding();

                setOverriddenMethodName(document, b);

                return false;
            }
        };

        type.accept(visitor);
    }

    private void setOverriddenMethodName(final Document document, final IMethodBinding b) {
        if (b == null) {
            return;
        }

        final IMethodBinding overriddenBinding = Bindings.findOverriddenMethod(b, true);

        final IMethodName overriddenMethodName = BindingUtils.toMethodName(overriddenBinding);

        if (overriddenMethodName != null) {
            addAnalyzedField(document, Fields.OVERRIDDEN_METHODS, overriddenMethodName.getIdentifier());
        }
    }
}
