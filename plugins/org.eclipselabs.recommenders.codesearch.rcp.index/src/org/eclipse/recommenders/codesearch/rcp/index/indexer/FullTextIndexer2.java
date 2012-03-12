package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IClassIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IFieldIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IMethodIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.ITryCatchBlockIndexer;

public class FullTextIndexer2 extends AbstractIndexer implements IClassIndexer, IMethodIndexer, ITryCatchBlockIndexer,
        IFieldIndexer {

    private final class LiteralsCollector extends ASTVisitor {

        private final Document document;

        public LiteralsCollector(final Document document) {
            this.document = document;
        }

        @Override
        public boolean visit(final SimpleName node) {
            final String identifier = node.getIdentifier();
            addFieldToDocument(document, Fields.FULL_TEXT, identifier);
            return true;
        }
    }

    @Override
    public void indexField(final Document document, final FieldDeclaration field) {
        field.accept(new LiteralsCollector(document));
    }

    @Override
    public void indexMethod(final Document document, final MethodDeclaration method) {
        method.accept(new LiteralsCollector(document));
    }

    @Override
    public void indexType(final Document document, final TypeDeclaration type) {
        type.accept(new LiteralsCollector(document));
    }

    @Override
    public void indexTryCatchBlock(final Document document, final TryStatement tryStatement,
            final CatchClause catchClause) {
        tryStatement.accept(new LiteralsCollector(document));
    }
}
