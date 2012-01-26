package org.eclipselabs.recommenders.codesearchquery.rcp.searcher;

import java.io.ByteArrayOutputStream;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.FieldNameImpl;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.SimpleClauseImpl;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.TypeClauseImpl;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.contentassist.LuceneQueryProposalProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.contentassist.QueryProposalType;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.DotNotationConverter;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.UnixPathNameConverter;

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
			
			if(o instanceof SimpleClauseImpl && o.eContents().get(0) instanceof FieldNameImpl) {
				FieldNameImpl fieldNameImpl = (FieldNameImpl)o.eContents().get(0);
				
				if(LuceneQueryProposalProvider.getProposalType(fieldNameImpl) == QueryProposalType.RESOURCE_PATH) {
					UnixPathNameConverter conv = new UnixPathNameConverter();
					
					String oldValue = ((SimpleClauseImpl)o).getValue();
					String newValue = conv.convertFrom(oldValue);
					
					((SimpleClauseImpl)o).setValue(newValue);
				}
			}
			
			//System.out.println(o);
		} while(iter.hasNext());

		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		state.save(stream, null);
		return stream.toString();
	}

}
