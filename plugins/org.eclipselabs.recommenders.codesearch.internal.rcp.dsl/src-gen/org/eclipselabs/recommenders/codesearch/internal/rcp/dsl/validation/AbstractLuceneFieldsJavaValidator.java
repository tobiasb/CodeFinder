package org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractLuceneFieldsJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.LuceneFieldsPackage.eINSTANCE);
		return result;
	}

}
