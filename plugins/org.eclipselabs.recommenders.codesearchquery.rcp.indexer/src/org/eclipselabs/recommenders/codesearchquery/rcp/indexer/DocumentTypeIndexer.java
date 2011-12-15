package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.*;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;

public class DocumentTypeIndexer extends AbstractIndexer implements IMethodIndexer, IClassIndexer, IFieldIndexer, ITryCatchBlockIndexer {

    @Override
    public void index(Document document, MethodDeclaration method) {
        addAnalyzedField(document, Fields.TYPE, Fields.TYPE_METHOD);
    }

    @Override
    public void index(Document document, TypeDeclaration type) {
        addAnalyzedField(document, Fields.TYPE, Fields.TYPE_CLASS);
    }

    @Override
    public void index(Document document, FieldDeclaration field) {
        addAnalyzedField(document, Fields.TYPE, Fields.TYPE_FIELD);
    }

	@Override
	public void index(Document document, TryStatement tryStatement,
			CatchClause catchClause) {
        addAnalyzedField(document, Fields.TYPE, Fields.TYPE_TRYCATCH);
	}
}
