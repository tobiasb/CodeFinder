package org.eclipselabs.recommenders.codesearchquery.rcp.termvector;

import java.util.List;

public interface ITermVectorProvider {
    public List<String> getDisjunctTermVector();

    public void load(ITermVectorConsumable consumable);

    public boolean doneLoading();
}
