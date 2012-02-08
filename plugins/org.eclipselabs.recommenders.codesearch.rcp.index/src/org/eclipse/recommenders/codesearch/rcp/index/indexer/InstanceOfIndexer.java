package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.InstanceofExpression;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IClassIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IMethodIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.ITryCatchBlockIndexer;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;

public class InstanceOfIndexer extends AbstractIndexer implements IMethodIndexer, ITryCatchBlockIndexer, IClassIndexer {

    @Override
    public void index(final Document document, final TypeDeclaration type) {
        final InstanceOfVisitor visitor = new InstanceOfVisitor(document);
        type.accept(visitor);
    }

    @Override
    public void index(final Document document, final TryStatement tryStatement, final CatchClause catchClause) {
        final InstanceOfVisitor visitor = new InstanceOfVisitor(document);
        catchClause.accept(visitor);
    }

    @Override
    public void index(final Document document, final MethodDeclaration method) {
        final InstanceOfVisitor visitor = new InstanceOfVisitor(document);
        method.accept(visitor);
    }

    private class InstanceOfVisitor extends ASTVisitor {
        private final Document document;

        public InstanceOfVisitor(final Document document) {
            this.document = document;
        }

        @Override
        public boolean visit(final InstanceofExpression node) {

            final ITypeBinding type = node.getRightOperand().resolveBinding();
            final ITypeName typeName = BindingUtils.toTypeName(type);

            addAnalyzedField(document, Fields.INSTANCEOF_TYPES, BindingHelper.getIdentifier(typeName));

            return false;
        }
    };
}
