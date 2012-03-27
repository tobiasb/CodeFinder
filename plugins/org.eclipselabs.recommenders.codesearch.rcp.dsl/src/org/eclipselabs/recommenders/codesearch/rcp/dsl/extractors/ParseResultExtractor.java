package org.eclipselabs.recommenders.codesearch.rcp.dsl.extractors;

import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

public class ParseResultExtractor implements IUnitOfWork<IParseResult, XtextResource> {

    @Override
    public IParseResult exec(final XtextResource state) throws Exception {
        IParseResult r = state.getParseResult();
        return r;
    }
}
