package org.eclipselabs.recommenders.codesearchquery.rcp.termvector;

import java.util.Set;

public interface ITermVectorConsumable {
    public Set<String> getTermVector(String[] fieldNames);
}
