package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IClassIndexer;

public class DeclaredMethodsIndexer extends AbstractIndexer implements IClassIndexer {

    @Override
    public void indexType(final Document document, final TypeDeclaration type) {
        final ASTVisitor visitor = new ASTVisitor() {
            @Override
            public boolean visit(final MethodDeclaration node) {
                addAnalyzedField(document, Fields.DECLARED_METHODS, BindingHelper.getIdentifier(node));

                return false;
            }
        };

        type.accept(visitor);
    }
}
