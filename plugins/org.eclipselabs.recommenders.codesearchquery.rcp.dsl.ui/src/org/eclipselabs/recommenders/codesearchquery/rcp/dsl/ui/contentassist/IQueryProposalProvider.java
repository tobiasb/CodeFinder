package org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.contentassist;

import java.util.List;

public interface IQueryProposalProvider {
	public List<String> getProposals();
	public String convert(String source);
}
