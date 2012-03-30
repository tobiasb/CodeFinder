package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.internal.corext.dom.LinkedNodeFinder;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IVarUsageIndexer;

import com.google.common.base.Optional;

@SuppressWarnings("restriction")
public class VariableParameterUsageIndexer extends AbstractIndexer implements IVarUsageIndexer {

    @Override
    public void indexVarUsage(final Document document, final MethodDeclaration method, final SimpleName name) {
        final SimpleName[] linkedNodes = LinkedNodeFinder.findByNode(method, name);

        for (final SimpleName linkedName : linkedNodes) {
            if (linkedName.getParent() != null) {
                switch (linkedName.getParent().getNodeType()) {
                case ASTNode.METHOD_INVOCATION:
                    final MethodInvocation targetMethod = (MethodInvocation) linkedName.getParent();

                    if (targetMethod.arguments().size() > 0 && targetMethod.arguments().indexOf(linkedName) > -1) {
                        /*
                         * The idea is that when the the parent node of a simple
                         * name is a method invocation and the simple name is in
                         * the parameter list then it is being used as a
                         * parameter of a method invocation.
                         */
                        final Optional<String> opt = BindingHelper.getIdentifier(targetMethod);
                        if (opt.isPresent()) {

                            String value = String.format("%s|%s", opt.get(), targetMethod.getExpression());

                            addFieldToDocument(document, Fields.USED_AS_PARAMETER_IN_METHODS, value);
                        }
                        break;
                    }
                }
            }
        }
    }
}
