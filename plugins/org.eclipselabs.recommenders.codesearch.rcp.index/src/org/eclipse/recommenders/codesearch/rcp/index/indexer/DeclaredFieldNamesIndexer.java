package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IClassIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IMethodIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.ITryCatchBlockIndexer;

public class DeclaredFieldNamesIndexer extends AbstractIndexer implements IClassIndexer, IMethodIndexer,
        ITryCatchBlockIndexer {

    @Override
    public void indexMethod(final Document document, final MethodDeclaration method) {
        final ASTVisitor visitor = new ASTVisitor() {
            @Override
            public boolean visit(final VariableDeclarationStatement node) {
                addAnalyzedField(document, Fields.DECLARED_FIELD_NAMES, node.fragments().get(0).toString());
                return false;
            }
        };

        method.accept(visitor);
    }

    @Override
    public void indexType(final Document document, final TypeDeclaration type) {
        final ASTVisitor visitor = new ASTVisitor() {
            @Override
            public boolean visit(final FieldDeclaration node) {
                addAnalyzedField(document, Fields.DECLARED_FIELD_NAMES, node.fragments().get(0).toString());
                return false;
            }
        };

        type.accept(visitor);
    }

    @Override
    public void indexTryCatchBlock(final Document document, final TryStatement tryStatement, final CatchClause catchClause) {
        final ASTVisitor visitor = new ASTVisitor() {
            @Override
            public boolean visit(final VariableDeclarationStatement node) {
                addAnalyzedField(document, Fields.DECLARED_FIELD_NAMES, node.fragments().get(0).toString());
                return false;
            }
        };

        catchClause.accept(visitor);
    }

}
