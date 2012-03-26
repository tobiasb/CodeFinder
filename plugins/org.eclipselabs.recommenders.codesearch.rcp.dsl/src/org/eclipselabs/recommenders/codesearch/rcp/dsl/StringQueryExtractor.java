package org.eclipselabs.recommenders.codesearch.rcp.dsl;

import java.io.ByteArrayOutputStream;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

public class StringQueryExtractor implements IUnitOfWork<String, XtextResource> {

    @Override
    public String exec(final XtextResource state) throws Exception {
        final TreeIterator<EObject> iter = state.getAllContents();

        if (!iter.hasNext())
            return "";

        final ByteArrayOutputStream stream = new ByteArrayOutputStream();
        state.save(stream, null);
        return stream.toString();
    }
}
