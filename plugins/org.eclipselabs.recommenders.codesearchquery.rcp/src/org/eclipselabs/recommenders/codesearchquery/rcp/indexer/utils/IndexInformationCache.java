package org.eclipselabs.recommenders.codesearchquery.rcp.indexer.utils;

import java.io.File;
import java.util.HashMap;

import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ResourcePathIndexer;

import com.google.common.base.Optional;
import com.google.common.collect.Maps;

public class IndexInformationCache implements IIndexInformationProvider {

	private HashMap<String, Long> cache = Maps.newHashMap();
	
	private String getPath(File location) {
		return ResourcePathIndexer.getResourcePath(location);
	}
	
	@Override
	public Optional<Long> getLastIndexed(File location) {
		String path = getPath(location);
		
		if(cache.containsKey(path)) {
			return Optional.of(cache.get(path));
		}
		
		return Optional.absent();
	}

	@Override
	public void setLastIndexed(File location, Long lastIndexed) {
		String path = getPath(location);
		
		cache.put(path, lastIndexed);
	}
}
