package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IMethodIndexer;

import com.google.common.base.Optional;

public class ReturnTypeIndexer extends AbstractIndexer implements IMethodIndexer {

    @Override
    public void indexMethod(final Document document, final MethodDeclaration method) {
        Type returnType = method.getReturnType2();

        addReturnsVoidField(document, returnType);
        addReturnsTypeField(document, returnType);
    }

    private void addReturnsVoidField(final Document document, Type returnType) {
        if (isVoid(returnType)) {
            addFieldToDocument(document, Fields.RETURN_TYPE, "Lvoid");
        }
    }

    private void addReturnsTypeField(final Document document, Type returnType) {
        final Optional<String> opt = BindingHelper.getIdentifier(returnType);
        if (opt.isPresent() && !opt.get().equals("V")) {
            // Ignore "V" which would be the case for void return types
            addFieldToDocument(document, Fields.RETURN_TYPE, opt.get());
        }
    }
}
