package org.eclipse.recommenders.codesearch.rcp.index.indexer.utils;

import org.apache.lucene.document.Field;

/**
 * Information interface that indicates whether a certain field should be
 * stores/analyzed
 */
public interface IFieldIndexingStrategy {
    public Field.Store getStore(String fieldName);

    public Field.Index getIndex(String fieldName);
}
