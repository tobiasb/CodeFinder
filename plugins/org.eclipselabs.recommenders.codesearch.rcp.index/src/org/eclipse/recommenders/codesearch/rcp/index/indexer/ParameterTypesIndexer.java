package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import java.util.List;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IMethodIndexer;

import com.google.common.base.Optional;

public class ParameterTypesIndexer implements IMethodIndexer {

    @Override
    public void indexMethod(final Document document, final MethodDeclaration method) {

        for (final SingleVariableDeclaration var : (List<SingleVariableDeclaration>) method.parameters()) {
            final Optional<String> opt = BindingHelper.getIdentifier(var.getType());
            if (opt.isPresent()) {
            	CodeIndexer.addFieldToDocument(document, Fields.PARAMETER_TYPES, opt.get());
            }
        }
    }
}
