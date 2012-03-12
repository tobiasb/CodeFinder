package org.eclipselabs.recommenders.codesearch.rcp.dslQL2.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractQL2JavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.QL2Package.eINSTANCE);
		return result;
	}

}
