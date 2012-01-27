package org.eclipselabs.recommenders.codesearchquery.rcp.searcher;

import java.io.ByteArrayOutputStream;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ClauseExpressionImpl;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.FilePathFieldImpl;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.TypeFieldImpl;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.DotNotationConverter;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.UnixPathNameConverter;

public class QueryExtractor implements IUnitOfWork<String, XtextResource> {

	@SuppressWarnings("unused")
	@Override
	public String exec(XtextResource state) throws Exception {
		TreeIterator iter = state.getAllContents();
		
		do {
			EObject o = (EObject) iter.next();
//			
			System.out.println(o.getClass());

			if(o instanceof ClauseExpressionImpl) {
				ClauseExpressionImpl impl = (ClauseExpressionImpl)o;
				EObject field = impl.getField();
				
				if(field instanceof TypeFieldImpl) {

					DotNotationConverter conv = new DotNotationConverter();
		              
					String oldValue = impl.getValue();
					String newValue = conv.convertFrom(oldValue);
					
					impl.setValue(newValue);
				}

				if(field instanceof FilePathFieldImpl) {
					UnixPathNameConverter conv = new UnixPathNameConverter();
					
					String oldValue = impl.getValue();
					String newValue = conv.convertFrom(oldValue);
					
					impl.setValue(newValue);
				}
			}
			
		} while(iter.hasNext());

		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		state.save(stream, null);
		return stream.toString();
	}

}
