package org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter;

public class DotNotationConverter extends AbstractQueryPartConverter {

	@Override
	public String convert(String queryPart) {
		return "L" + queryPart.replace(".", "/");
	}
	
}
