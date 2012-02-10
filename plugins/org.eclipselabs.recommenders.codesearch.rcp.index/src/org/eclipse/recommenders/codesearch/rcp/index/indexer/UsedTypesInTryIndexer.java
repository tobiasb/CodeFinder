package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.ITryCatchBlockIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.visitor.TypeUseVisitor;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;

public class UsedTypesInTryIndexer extends AbstractIndexer implements ITryCatchBlockIndexer {

    @Override
    public void indexTryCatchBlock(final Document document, final TryStatement tryStatement, final CatchClause catchClause) {

        final TypeUseVisitor visitor = new TypeUseVisitor() {

            @Override
            protected void handleTypeUse(final ITypeBinding typeBinding) {
                addUsedType(document, typeBinding);
            }
        };

        tryStatement.accept(visitor);
    }

    private void addUsedType(final Document document, final ITypeBinding typeBinding) {
        final ITypeName typeName = BindingUtils.toTypeName(typeBinding);
        addAnalyzedField(document, Fields.USED_TYPES_IN_TRY, typeName.getIdentifier());
    }
}
