package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.ITryCatchBlockIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.visitor.TypeUseVisitor;

import com.google.common.base.Optional;

public class UsedTypesInFinallyIndexer implements ITryCatchBlockIndexer {

    @Override
    public void indexTryCatchBlock(final Document document, final TryStatement tryStatement, final CatchClause catchClause) {

        final TypeUseVisitor visitor = new TypeUseVisitor() {
            @Override
            protected void handleTypeUse(final ITypeBinding typeBinding) {
                addUsedType(document, typeBinding);
            }
        };

        if (tryStatement.getFinally() != null) {
            tryStatement.getFinally().accept(visitor);
        }
    }

    private void addUsedType(final Document document, final ITypeBinding typeBinding) {
        final Optional<String> opt = BindingHelper.getIdentifier(typeBinding);
        if (opt.isPresent()) {
        	CodeIndexer.addFieldToDocument(document, Fields.USED_TYPES_IN_FINALLY, opt.get());
        }
    }

}
