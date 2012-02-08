package org.eclipse.recommenders.codesearch.rcp.index.indexer.utils;

import java.io.File;
import java.util.HashMap;

import org.eclipse.recommenders.codesearch.rcp.index.indexer.ResourcePathIndexer;

import com.google.common.base.Optional;
import com.google.common.collect.Maps;

public class IndexInformationCache implements IIndexInformationProvider {

    private final HashMap<String, Long> cache = Maps.newHashMap();

    private String getPath(final File location) {
        return ResourcePathIndexer.getResourcePath(location);
    }

    @Override
    public Optional<Long> getLastIndexed(final File location) {
        final String path = getPath(location);

        if (cache.containsKey(path)) {
            return Optional.of(cache.get(path));
        }

        return Optional.absent();
    }

    @Override
    public void setLastIndexed(final File location, final Long lastIndexed) {
        final String path = getPath(location);

        cache.put(path, lastIndexed);
    }
}
