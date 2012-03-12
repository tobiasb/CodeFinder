package org.eclipse.recommenders.codesearch.rcp.index.indexer.utils;

import java.util.Map;

import org.apache.lucene.document.Field.Index;
import org.apache.lucene.document.Field.Store;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;

import com.google.common.collect.Maps;

/**
 * Simple non dynamic version that uses a hard-coded information set for some
 * predefined fields
 */
public class SimpleFieldIndexInformation implements IIndexingFieldInformationProvider {

    private Map<String, Store> storeMap = Maps.newHashMap();
    private Map<String, Index> indexMap = Maps.newHashMap();

    private Object helperObj = null;

    public SimpleFieldIndexInformation() {
        // Extend by filling the two maps...

        storeMap.put(Fields.FULL_TEXT, Store.NO);
    }

    @Override
    public Store getStore(String fieldName) {
        return getValueOrDefault(fieldName, storeMap, Store.YES);
    }

    @Override
    public Index getIndex(String fieldName) {
        return getValueOrDefault(fieldName, indexMap, Index.ANALYZED);
    }

    @SuppressWarnings("unchecked")
    private <T> T getValueOrDefault(String fieldName, Map<String, T> map, T defaultValue) {
        helperObj = map.get(fieldName);

        if (helperObj != null)
            return (T) helperObj;

        return defaultValue;
    }
}
