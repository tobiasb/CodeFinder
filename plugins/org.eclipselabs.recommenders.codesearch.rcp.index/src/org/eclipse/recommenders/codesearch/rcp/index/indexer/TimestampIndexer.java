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

    private static Long currentTimestamp = 0L;

    @Override
    public void indexTryCatchBlock(final Document document, final TryStatement tryStatement,
            final CatchClause catchClause) {
        addFieldToDocument(document, Fields.TIMESTAMP, getTimeString());
    }

    @Override
    public void indexField(final Document document, final FieldDeclaration field) {
        addFieldToDocument(document, Fields.TIMESTAMP, getTimeString());
    }

    @Override
    public void indexMethod(final Document document, final MethodDeclaration method) {
        addFieldToDocument(document, Fields.TIMESTAMP, getTimeString());
    }

    @Override
    public void indexType(final Document document, final TypeDeclaration type) {
        addFieldToDocument(document, Fields.TIMESTAMP, getTimeString());
    }

    public static String getTimeString() {
        final long timestamp = getTime();
        return String.valueOf(timestamp);
    }

    /**
     * In order to keep the index smaller we use one timestamp for all indexed
     * items in the current indexing "job". This method updates this timestamp
     * value to the current system time
     */
    public static void updateCurrentTimestamp() {
        currentTimestamp = System.currentTimeMillis();
    }

    public static Long getTime() {
    	updateCurrentTimestamp(); //temporarily until the "only update once per indexing" is activated
        return currentTimestamp;
    }
}
