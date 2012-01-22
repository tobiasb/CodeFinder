package org.eclipselabs.recommenders.codesearchquery.rcp.searcher;

import java.io.ByteArrayOutputStream;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.TypeClauseImpl;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.DotNotationConverter;

public class QueryExtractor implements IUnitOfWork<String, XtextResource> {

	@Override
	public String exec(XtextResource state) throws Exception {
		TreeIterator iter = state.getAllContents();
		
		do {
			EObject o = (EObject) iter.next();
			
			if(o instanceof TypeClauseImpl) {
                DotNotationConverter conv = new DotNotationConverter();
                
                String oldValue = ((TypeClauseImpl)o).getValue();
                String newValue = conv.convertFrom(oldValue);
                
				((TypeClauseImpl)o).setValue(newValue);
			}
			
			//System.out.println(o);
		} while(iter.hasNext());

		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		state.save(stream, null);
		return stream.toString();
	}

}
