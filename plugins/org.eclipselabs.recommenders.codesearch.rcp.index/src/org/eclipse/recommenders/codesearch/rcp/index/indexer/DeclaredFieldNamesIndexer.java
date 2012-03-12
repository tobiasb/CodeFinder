package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import java.util.List;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IClassIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IMethodIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.ITryCatchBlockIndexer;

public class DeclaredFieldNamesIndexer extends AbstractIndexer implements IClassIndexer, IMethodIndexer,
        ITryCatchBlockIndexer {

    // XXX Deine Indexer speichern komplette Expressions als Terme ab. Zum Beispiel der DeclaredFieldNameIndexer
    // speichert "Map map = new HashMap()" ab, sollte aber wohl nur "map" abspeichern. Der RETURN_VARIABLE_EXPRESSIONS
    // indexer speichert das gesamte Literal im Index ab. Das sind zigtausende einzigartige Strings.
    @Override
    public void indexMethod(final Document document, final MethodDeclaration method) {
        final ASTVisitor visitor = new ASTVisitor() {
            @Override
            public boolean visit(final VariableDeclarationStatement node) {
                addVariableNames(document, node);
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
                addVariableNames(document, node);
                return false;
            }
        };

        type.accept(visitor);
    }

    @Override
    public void indexTryCatchBlock(final Document document, final TryStatement tryStatement,
            final CatchClause catchClause) {
        final ASTVisitor visitor = new ASTVisitor() {
            @Override
            public boolean visit(final VariableDeclarationStatement node) {
                addVariableNames(document, node);
                return false;
            }
        };

        catchClause.accept(visitor);
    }

    protected void addVariableNames(final Document document, final VariableDeclarationStatement node) {
        for (final VariableDeclarationFragment f : (List<VariableDeclarationFragment>) node.fragments()) {
            final SimpleName name = f.getName();
            addFieldToDocument(document, Fields.ALL_DECLARED_FIELD_NAMES, name.getIdentifier());
        }
    }

    protected void addVariableNames(final Document document, final FieldDeclaration node) {
        for (final VariableDeclarationFragment f : (List<VariableDeclarationFragment>) node.fragments()) {
            final SimpleName name = f.getName();
            addFieldToDocument(document, Fields.ALL_DECLARED_FIELD_NAMES, name.getIdentifier());
        }
    }
}
