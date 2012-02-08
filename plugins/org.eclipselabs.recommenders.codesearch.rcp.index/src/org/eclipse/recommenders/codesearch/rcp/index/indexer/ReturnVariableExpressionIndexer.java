package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IMethodIndexer;

public class ReturnVariableExpressionIndexer extends AbstractIndexer implements IMethodIndexer {

    @Override
    public void index(final Document document, final MethodDeclaration method) {
        final ASTVisitor visitor = new ASTVisitor() {
            @Override
            public boolean visit(final ReturnStatement node) {
                if (node.getExpression() != null) {
                    addAnalyzedField(document, Fields.RETURN_VARIABLE_EXPRESSIONS, node.getExpression().toString());
                }

                return false;
            }
        };

        method.accept(visitor);
    }

}
