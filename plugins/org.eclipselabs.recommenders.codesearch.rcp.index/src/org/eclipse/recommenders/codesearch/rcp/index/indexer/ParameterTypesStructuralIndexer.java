package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import java.util.List;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IMethodIndexer;

import com.google.common.base.Optional;

/**
 * Indexes a different view on method parameters.
 * 
 * Example: public void testReturnNames(List l, String s) { }
 * 
 * is indexed as Ljava/util/List;Ljava/lang/String;
 * 
 */
public class ParameterTypesStructuralIndexer extends AbstractIndexer implements IMethodIndexer {

    @Override
    public void indexMethod(Document document, MethodDeclaration method) {

        String s = "";

        for (final SingleVariableDeclaration var : (List<SingleVariableDeclaration>) method.parameters()) {
            final Optional<String> opt = BindingHelper.getIdentifier(var.getType());
            if (opt.isPresent()) {
                s += opt.get() + ";";
            }
        }

        if (!s.equals(""))
            addFieldToDocument(document, Fields.PARAMETER_TYPES_STRUCTURAL, s);
    }

}
