package org.eclipse.recommenders.codesearch.rcp.index.termvector;

import java.util.List;
import java.util.Map;

public interface ITermVectorProvider {
    public List<String> getDisjunctTermVector();

    public void load(final ITermVectorConsumable consumable, final Map<Integer, Object> argumentsMap);

    public boolean doneLoading();
}
