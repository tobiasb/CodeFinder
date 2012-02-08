package org.eclipse.recommenders.codesearch.rcp.index.indexer.utils;

import java.io.File;

import com.google.common.base.Optional;

public interface IIndexInformationProvider {
    public Optional<Long> getLastIndexed(File location);

    public void setLastIndexed(File location, Long lastIndexed);
}
