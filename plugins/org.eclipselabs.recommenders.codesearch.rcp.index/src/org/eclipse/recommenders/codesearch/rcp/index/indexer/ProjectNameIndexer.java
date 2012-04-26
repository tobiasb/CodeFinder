package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IClassIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IFieldIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IMethodIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.ITryCatchBlockIndexer;

public class ProjectNameIndexer implements IClassIndexer, IMethodIndexer,
        ITryCatchBlockIndexer, IFieldIndexer {

    @Override
    public void indexField(final Document document, final FieldDeclaration field) {
        addField(document, field);
    }

    @Override
    public void indexMethod(final Document document, final MethodDeclaration method) {
        addField(document, method);
    }

    @Override
    public void indexType(final Document document, final TypeDeclaration type) {
        addField(document, type);
    }

    @Override
    public void indexTryCatchBlock(final Document document, final TryStatement tryStatement,
            final CatchClause catchClause) {
        addField(document, tryStatement);
    }

    private void addField(final Document document, final ASTNode node) {
        final String projectName = AstHelper.getProject(node).getName();
        CodeIndexer.addFieldToDocument(document, Fields.PROJECT_NAME, projectName);
    }
}
