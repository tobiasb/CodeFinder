package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IVarUsageIndexer;

public class VariableDefinitionIndexer extends AbstractIndexer implements IVarUsageIndexer {

    @Override
    public void indexVarUsage(final Document document, final MethodDeclaration method, final SimpleName name) {
        // wow - this method is ugly
        switch (name.getParent().getNodeType()) {
        case ASTNode.SINGLE_VARIABLE_DECLARATION:
            addField(document, Fields.DEFINITION_PARAMETER);
            break;
        case ASTNode.VARIABLE_DECLARATION_FRAGMENT:
            VariableDeclarationFragment parent = (VariableDeclarationFragment) name.getParent();

            if (parent.getInitializer() == null) {
                addField(document, Fields.DEFINITION_UNINITIALIZED);
                break;
            } else {
                switch (parent.getInitializer().getNodeType()) {
                case ASTNode.NULL_LITERAL:
                    addField(document, Fields.DEFINITION_NULLLITERAL);
                    break;
                case ASTNode.METHOD_INVOCATION:
                    addField(document, Fields.DEFINITION_METHOD_INVOCATION);
                    break;
                case ASTNode.CLASS_INSTANCE_CREATION:
                    addField(document, Fields.DEFINITION_INSTANCE_CREATION);
                    break;
                }
            }
            break;
        }
    }

    private void addField(final Document document, String definitionType) {
        addAnalyzedField(document, Fields.VARIABLE_DEFINITION, definitionType);
    }
}
