package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IVarUsageIndexer;

import com.google.common.base.Optional;

public class VariableTypeIndexer extends AbstractIndexer implements IVarUsageIndexer {

    @Override
    public void indexVarUsage(final Document document, final MethodDeclaration method, final SimpleName name) {
        final ITypeBinding type = name.resolveTypeBinding();
        final Optional<String> opt = BindingHelper.getIdentifier(type);
        if (opt.isPresent()) {
            addFieldToDocument(document, Fields.VARIABLE_TYPE, (opt.get()));
        }
    }

}
