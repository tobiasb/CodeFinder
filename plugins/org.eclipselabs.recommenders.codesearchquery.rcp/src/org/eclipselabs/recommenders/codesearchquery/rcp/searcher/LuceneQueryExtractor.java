package org.eclipselabs.recommenders.codesearchquery.rcp.searcher;

import java.io.ByteArrayOutputStream;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ClauseExpressionImpl;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.FilePathFieldImpl;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.MethodFieldImpl;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.TypeFieldImpl;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.DotNotationMethodConverter;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.DotNotationTypeConverter;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.IQueryPartConverter;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.PathValueConverter;

public class LuceneQueryExtractor implements IUnitOfWork<String, XtextResource> {

    @Override
    public String exec(final XtextResource state) throws Exception {
        final TreeIterator<EObject> iter = state.getAllContents();
        if (!iter.hasNext())
            return "";

        do {
            final EObject o = iter.next();

            if (o instanceof ClauseExpressionImpl) {
                final ClauseExpressionImpl impl = (ClauseExpressionImpl) o;
                final EObject field = impl.getField();

                IQueryPartConverter conv = null;

                if (field instanceof TypeFieldImpl) {
                    conv = new DotNotationTypeConverter();
                } else if (field instanceof FilePathFieldImpl) {
                    conv = new PathValueConverter();
                } else if (field instanceof MethodFieldImpl) {
                    conv = new DotNotationMethodConverter();
                }

                if (conv != null) {
                    for (int i = 0; i < impl.getValues().size(); i++) {
                        final String oldValue = impl.getValues().get(i);
                        final String newValue = conv.convertFrom(oldValue);
                        impl.getValues().set(i, newValue);
                    }
                }
            }

        } while (iter.hasNext());

        final ByteArrayOutputStream stream = new ByteArrayOutputStream();
        state.save(stream, null);
        return stream.toString();
    }
}
