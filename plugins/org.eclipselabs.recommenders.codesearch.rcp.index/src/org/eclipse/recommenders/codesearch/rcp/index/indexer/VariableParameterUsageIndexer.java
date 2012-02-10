package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.internal.corext.dom.LinkedNodeFinder;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IVarUsageIndexer;
import org.eclipse.recommenders.utils.names.IMethodName;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;

@SuppressWarnings("restriction")
public class VariableParameterUsageIndexer extends AbstractIndexer implements IVarUsageIndexer {

    @Override
    public void indexVarUsage(Document document, MethodDeclaration method, SimpleName name) {
        SimpleName[] linkedNodes = LinkedNodeFinder.findByNode(method, name);

        for (SimpleName linkedName : linkedNodes) {
            if (linkedName.getParent() != null) {
                switch (linkedName.getParent().getNodeType()) {
                case ASTNode.METHOD_INVOCATION:
                    MethodInvocation targetMethod = (MethodInvocation) linkedName.getParent();

                    if (targetMethod.arguments().size() > 0 && targetMethod.arguments().indexOf(linkedName) > -1) {
                        /*
                         * The idea is that when the the parent node of a simple
                         * name is a method invocation and the simple name is in
                         * the parameter list then it is being used as a
                         * parameter of a method invocation.
                         */

                        IMethodBinding methodBinding = targetMethod.resolveMethodBinding();
                        final IMethodName methodName = BindingUtils.toMethodName(methodBinding);

                        if (methodName != null) {
                            addAnalyzedField(document, Fields.USED_AS_PARAMETER_IN_METHODS, methodName.getIdentifier());
                        }
                        break;
                    }
                }
            }
        }
    }
}
