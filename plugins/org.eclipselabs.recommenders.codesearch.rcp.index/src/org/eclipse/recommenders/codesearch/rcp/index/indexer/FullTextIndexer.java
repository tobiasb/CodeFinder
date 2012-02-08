package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
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

public class FullTextIndexer extends AbstractIndexer implements IClassIndexer, IMethodIndexer, ITryCatchBlockIndexer,
        IFieldIndexer {

    @Override
    public void index(final Document document, final FieldDeclaration field) {
        addAnalyzedField(document, Fields.FULL_TEXT, field.toString().trim());
    }

    @Override
    public void index(final Document document, final MethodDeclaration method) {
        addAnalyzedField(document, Fields.FULL_TEXT, method.toString().trim());
    }

    @Override
    public void index(final Document document, final TypeDeclaration type) {
        addAnalyzedField(document, Fields.FULL_TEXT, type.toString().trim());
    }

    @Override
    public void index(final Document document, final TryStatement tryStatement, final CatchClause catchClause) {
        addAnalyzedField(document, Fields.FULL_TEXT, catchClause.toString().trim());
    }
}
