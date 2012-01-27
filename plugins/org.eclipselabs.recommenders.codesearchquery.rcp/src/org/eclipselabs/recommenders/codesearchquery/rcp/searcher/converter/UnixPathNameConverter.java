package org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter;

public class UnixPathNameConverter extends AbstractQueryPartConverter implements
		IQueryPartConverter {

	@Override
	public String convertFrom(String queryPart) {
		String result = queryPart;

//		result = result.replaceFirst("/", ":");	
//		result = result.replace(":", ":\\");		
//		result = result.replace("/", "\\");		
		result = result.replace(":", "\\:");
		
		return result;
	}

	@Override
	public String convertTo(String queryPart) {
		String result = queryPart;
		
//		result = result.replace("\\", "/");
//		result = result.replace(":", "\\:");		
		
		return result;
	}

}
