package org.eclipse.recommenders.codesearch.rcp.index.indexer.utils;

import com.google.common.base.Optional;

public interface IIndexInformationProvider {
    public Optional<Long> getLastIndexed(final String location);

    public void setLastIndexed(final String location, final Long lastIndexed);
}
