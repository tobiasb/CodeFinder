package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IMethodIndexer;

import com.google.common.base.Optional;

public class CheckedExceptionsIndexer implements IMethodIndexer {

    @Override
    public void indexMethod(final Document document, final MethodDeclaration method) {
        for (final Object exName : method.thrownExceptions()) {
            if (!(exName instanceof SimpleName))
                continue;

            final Optional<String> opt = BindingHelper.getTypeIdentifier((SimpleName) exName);

            if (opt.isPresent()) {
            	CodeIndexer.addFieldToDocument(document, Fields.CHECKED_EXCEPTIONS, opt.get());
            }
        }
    }
}
