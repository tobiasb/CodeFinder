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

public class DocumentTypeIndexer extends AbstractIndexer implements IMethodIndexer, IClassIndexer, IFieldIndexer,
        ITryCatchBlockIndexer {

    @Override
    public void index(final Document document, final MethodDeclaration method) {
        addAnalyzedField(document, Fields.TYPE, Fields.TYPE_METHOD);
    }

    @Override
    public void index(final Document document, final TypeDeclaration type) {
        addAnalyzedField(document, Fields.TYPE, Fields.TYPE_CLASS);
    }

    @Override
    public void index(final Document document, final FieldDeclaration field) {
        addAnalyzedField(document, Fields.TYPE, Fields.TYPE_FIELD);
    }

    @Override
    public void index(final Document document, final TryStatement tryStatement, final CatchClause catchClause) {
        addAnalyzedField(document, Fields.TYPE, Fields.TYPE_TRYCATCH);
    }
}
