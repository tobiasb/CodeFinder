package org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractQL1JavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.qL1.QL1Package.eINSTANCE);
		return result;
	}

}
