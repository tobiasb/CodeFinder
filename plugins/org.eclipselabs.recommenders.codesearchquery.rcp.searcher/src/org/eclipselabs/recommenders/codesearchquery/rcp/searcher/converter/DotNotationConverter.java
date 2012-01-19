package org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter;

public class DotNotationConverter extends AbstractQueryPartConverter {

	@Override
	public String convertFrom(String queryPart) {
		return "L" + queryPart.replace(".", "/");
	}

	@Override
	public String convertTo(String queryPart) {
		String tmp = queryPart;
		
		if(tmp.startsWith("L"))
			tmp = tmp.substring(1);
		
		tmp = tmp.replace("/", ".");
		
		return tmp;
	}
	
}
