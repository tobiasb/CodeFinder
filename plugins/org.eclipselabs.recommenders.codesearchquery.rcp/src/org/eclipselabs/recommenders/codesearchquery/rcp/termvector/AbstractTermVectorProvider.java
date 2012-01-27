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

	protected void setDone(boolean done) {
		this.done = done;
	}

	public List<String> getTermVector() {
		return termVector;
	}

	protected void setTermVector(List<String> termVector) {
		this.termVector = termVector;
	}

	@Override
	public List<String> getDisjunctTermVector() {
		return getTermVector();
	}
	
	protected abstract String[] getFields();

	@Override
	public void load(ITermVectorConsumable consumable) {
		final Set<String> result  = Sets.newHashSet();
		
		for(String fieldName : getFields()) {
			//TODO: Schränke Felder mit IFieldSelector ein
			Set<String> types = consumable.getTermVector(fieldName);
			result.addAll(types);
		}

		setTermVector(Lists.newArrayList(result));
		setDone(true);
	}

	@Override
	public boolean doneLoading() {
		return isDone();
	}
}
