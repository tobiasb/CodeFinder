package org.eclipselabs.recommenders.codesearchquery.termvector;

import java.util.Set;

public interface ITermVectorConsumable {
	public Set<String> getTermVector(String fieldName);
}
