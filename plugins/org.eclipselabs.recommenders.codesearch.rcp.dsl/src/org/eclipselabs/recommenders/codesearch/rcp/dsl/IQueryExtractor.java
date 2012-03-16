package org.eclipselabs.recommenders.codesearch.rcp.dsl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.IParseResult;

public interface IQueryExtractor {
    public EObject transform(IParseResult r);
}
