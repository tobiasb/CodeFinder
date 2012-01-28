package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IFieldIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IMethodIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.ITryCatchBlockIndexer;

public class ProjectNameIndexer extends AbstractIndexer implements IClassIndexer, IMethodIndexer,
        ITryCatchBlockIndexer, IFieldIndexer {

    @Override
    public void index(final Document document, final FieldDeclaration field) {
        addField(document, field);
    }

    @Override
    public void index(final Document document, final MethodDeclaration method) {
        addField(document, method);
    }

    @Override
    public void index(final Document document, final TypeDeclaration type) {
        addField(document, type);
    }

    @Override
    public void index(final Document document, final TryStatement tryStatement, final CatchClause catchClause) {
        addField(document, tryStatement);
    }

    private void addField(final Document document, final ASTNode node) {
        final String projectName = getProject(node).getName();

        addAnalyzedField(document, Fields.PROJECT_NAME, projectName);
    }
}
