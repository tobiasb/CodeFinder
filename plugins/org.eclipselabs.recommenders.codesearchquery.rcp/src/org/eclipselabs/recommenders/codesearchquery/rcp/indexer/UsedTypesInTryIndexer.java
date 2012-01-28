package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;
import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.ITryCatchBlockIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.visitor.TypeUseVisitor;

public class UsedTypesInTryIndexer extends AbstractIndexer implements ITryCatchBlockIndexer {

    @Override
    public void index(final Document document, final TryStatement tryStatement, final CatchClause catchClause) {

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
