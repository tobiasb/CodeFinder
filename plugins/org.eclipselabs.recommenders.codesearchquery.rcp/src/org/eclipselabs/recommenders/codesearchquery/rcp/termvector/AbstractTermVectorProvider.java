package org.eclipselabs.recommenders.codesearchquery.rcp.termvector;

import java.util.List;
import java.util.Set;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public abstract class AbstractTermVectorProvider implements ITermVectorProvider {
    private boolean done = false;
    private List<String> termVector = null;

    public boolean isDone() {
        return done;
    }

    protected void setDone(final boolean done) {
        this.done = done;
    }

    public List<String> getTermVector() {
        return termVector;
    }

    protected void setTermVector(final List<String> termVector) {
        this.termVector = termVector;
    }

    @Override
    public List<String> getDisjunctTermVector() {
        return getTermVector();
    }

    protected abstract String[] getFields();

    @Override
    public void load(final ITermVectorConsumable consumable) {
        final Set<String> result = Sets.newHashSet();

        final Set<String> types = consumable.getTermVector(getFields());
        result.addAll(types);

        setTermVector(Lists.newArrayList(result));
        setDone(true);
    }

    @Override
    public boolean doneLoading() {
        return isDone();
    }
}
