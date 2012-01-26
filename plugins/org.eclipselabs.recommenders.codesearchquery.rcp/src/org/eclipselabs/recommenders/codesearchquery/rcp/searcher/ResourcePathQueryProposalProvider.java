package org.eclipselabs.recommenders.codesearchquery.rcp.searcher;

import java.io.IOException;
import java.util.List;

import org.apache.lucene.store.Directory;
import org.eclipse.recommenders.injection.InjectionService;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.contentassist.IQueryProposalProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.UnixPathNameConverter;
import org.eclipselabs.recommenders.codesearchquery.rcp.termvector.ResourcePathProvider;

public class ResourcePathQueryProposalProvider implements
		IQueryProposalProvider {

	@Override
	public List<String> getProposals() {

		try {

            Directory directory = InjectionService.getInstance().requestInstance(Directory.class);
	        
			CodeSearcherIndex searcherIndex = new CodeSearcherIndex(directory);
			
			ResourcePathProvider source = new ResourcePathProvider();
			source.load(searcherIndex);
			
			return source.getDisjunctTermVector();
		} catch (IOException e) {
			return null;
		}
	}

	@Override
	public String convert(String source) {
		UnixPathNameConverter converter = new UnixPathNameConverter();
		return converter.convertTo(source);
	}

}
