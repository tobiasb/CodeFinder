package org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.generator;

import java.util.ArrayList;
import java.util.List;

public class Values {
	public final static List<String> entityTypes = new ArrayList<String>();
	
	static {
		entityTypes.add("type");
		entityTypes.add("method");
		entityTypes.add("field");
		entityTypes.add("tryCatch");
		entityTypes.add("varusage");
	}
}
