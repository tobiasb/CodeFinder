package org.eclipselabs.recommenders.codesearchquery.rcp.searcher;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.lucene.store.Directory;
import org.apache.lucene.store.SimpleFSDirectory;
import org.eclipse.core.runtime.Platform;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.contentassist.IQueryProposalProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.contentassist.QueryProposalType;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.DotNotationConverter;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.IQueryPartConverter;
import org.eclipselabs.recommenders.codesearchquery.rcp.termvector.JavaTypeProvider;

public class TypeQueryProposalProvider implements IQueryProposalProvider {

	@Override
	public List<String> getProposals(QueryProposalType type) {

		try {
	        final String path = Platform.getLocation().toString() + "/index.l";
	        final Directory index = new SimpleFSDirectory(new File(path));
	
	        if(!new File(path).exists()) {
	        	System.out.println("Index doesn't exist at " + path);
	        	return null;
	        }
	        
			CodeSearcherIndex searcherIndex;
				searcherIndex = new CodeSearcherIndex(index);
			
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
