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

public class TimestampIndexer extends AbstractIndexer implements IClassIndexer, IMethodIndexer, IFieldIndexer,
        ITryCatchBlockIndexer {

    @Override
    public void indexTryCatchBlock(final Document document, final TryStatement tryStatement,
            final CatchClause catchClause) {
        addAnalyzedField(document, Fields.TIMESTAMP, getTimeString());
    }

    @Override
    public void indexField(final Document document, final FieldDeclaration field) {
        addAnalyzedField(document, Fields.TIMESTAMP, getTimeString());
    }

    @Override
    public void indexMethod(final Document document, final MethodDeclaration method) {
        addAnalyzedField(document, Fields.TIMESTAMP, getTimeString());
    }

    @Override
    public void indexType(final Document document, final TypeDeclaration type) {
        addAnalyzedField(document, Fields.TIMESTAMP, getTimeString());
    }

    // XXX Der LastIndexed Timestamp sollte immer der von File.lastModfified sein. Ansonsten erzeugst du 1000de Terme
    // ohne sinnvolle Bedeutung.
    public static String getTimeString() {
        final long timestamp = getTime();
        return String.valueOf(timestamp);
    }

    public static Long getTime() {
        return System.currentTimeMillis();
    }
}
