package org.eclipse.recommenders.codesearch.rcp.index.indexer.utils;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.google.common.base.Optional;
import com.google.common.collect.MapMaker;

public class IndexInformationCache implements IIndexInformationProvider {

    private final Map<String, Long> cache = new MapMaker().concurrencyLevel(1).maximumSize(3000)
            .expiration(1, TimeUnit.MINUTES).makeMap();

    @Override
    public Optional<Long> getLastIndexed(final String location) {
        if (cache.containsKey(location)) {
            return Optional.of(cache.get(location));
        }

        return Optional.absent();
    }

    @Override
    public void setLastIndexed(final String location, final Long lastIndexed) {
        cache.put(location, lastIndexed);
    }
}
