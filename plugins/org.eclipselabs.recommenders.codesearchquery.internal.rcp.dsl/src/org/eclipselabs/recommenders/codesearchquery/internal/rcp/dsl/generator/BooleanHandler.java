package org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.generator;

public class BooleanHandler {
	private Boolean value = true;
	
	public Boolean getValue() {
		return value;
	}
	
	public void setValue(Boolean newValue) {
		value = newValue;
	}
	
	public void toggle() {
		value = !value;
	}
}
