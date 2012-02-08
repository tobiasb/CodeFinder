package org.eclipse.recommenders.codesearch.rcp.index.termvector;

import java.util.Set;

public interface ITermVectorConsumable {
    public Set<String> getTermVector(String[] fieldNames);
}
