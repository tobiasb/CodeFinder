package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IMethodIndexer;

import com.google.common.base.Optional;

public class ReturnTypeIndexer extends AbstractIndexer implements IMethodIndexer {

    @Override
    public void indexMethod(final Document document, final MethodDeclaration method) {
        final Optional<String> opt = BindingHelper.getIdentifier(method.getReturnType2());
        if (opt.isPresent()) {
            addAnalyzedField(document, Fields.RETURN_TYPE, opt.get());
        }
    }
}
