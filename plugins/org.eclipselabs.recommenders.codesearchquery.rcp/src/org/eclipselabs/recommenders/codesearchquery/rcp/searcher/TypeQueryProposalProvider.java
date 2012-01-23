package org.eclipselabs.recommenders.codesearchquery.rcp.searcher;

import java.io.IOException;
import java.util.List;

import org.apache.lucene.store.Directory;
import org.eclipse.recommenders.injection.InjectionService;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.contentassist.IQueryProposalProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.contentassist.QueryProposalType;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.DotNotationConverter;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.IQueryPartConverter;
import org.eclipselabs.recommenders.codesearchquery.rcp.termvector.JavaTypeProvider;

public class TypeQueryProposalProvider implements IQueryProposalProvider {

	@Override
	public List<String> getProposals(QueryProposalType type) {

		try {

            Directory directory = InjectionService.getInstance().requestInstance(Directory.class);
	        
			CodeSearcherIndex searcherIndex = new CodeSearcherIndex(directory);
			
			JavaTypeProvider source = new JavaTypeProvider();
			source.load(searcherIndex);
			
			return source.getDisjunctTermVector();
		} catch (IOException e) {
			return null;
		}
	}

	@Override
	public String convert(String type) {
		IQueryPartConverter converter = new DotNotationConverter();
		return converter.convertTo(type);
	}

}
