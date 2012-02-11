package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.ITryCatchBlockIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.visitor.MethodCallVisitor;

import com.google.common.base.Optional;

public class UsedMethodsInTryIndexer extends AbstractIndexer implements ITryCatchBlockIndexer {

    @Override
    public void indexTryCatchBlock(final Document document, final TryStatement tryStatement, final CatchClause catchClause) {

        final ASTVisitor visitor = new MethodCallVisitor() {
            @Override
            protected void handleMethodCall(final IMethodBinding methodBinding) {
                final Optional<String> opt = BindingHelper.getIdentifier(methodBinding);
                if (opt.isPresent()) {
                    addAnalyzedField(document, Fields.USED_METHODS_IN_TRY, opt.get());
                }
            };
        };

        tryStatement.accept(visitor);
    }

}
