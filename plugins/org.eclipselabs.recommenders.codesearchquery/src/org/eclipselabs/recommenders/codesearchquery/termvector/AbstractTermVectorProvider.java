package org.eclipselabs.recommenders.codesearchquery.termvector;

import java.util.List;


public abstract class AbstractTermVectorProvider {
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
	
	protected abstract String[] getFields();
}
