package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IVarUsageIndexer;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;

public class VariableTypeIndexer extends AbstractIndexer implements IVarUsageIndexer {

    @Override
    public void indexVarUsage(Document document, MethodDeclaration method, SimpleName name) {
        ITypeBinding type = name.resolveTypeBinding();

        if (type != null) {
            final ITypeName typeName = BindingUtils.toTypeName(type);
            addAnalyzedField(document, Fields.VARIABLE_TYPE, BindingHelper.getIdentifier(typeName));
        }
    }

}
