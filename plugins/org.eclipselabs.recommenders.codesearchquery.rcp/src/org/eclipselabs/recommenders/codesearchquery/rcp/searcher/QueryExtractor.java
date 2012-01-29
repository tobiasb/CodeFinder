package org.eclipselabs.recommenders.codesearchquery.rcp.searcher;

import java.io.ByteArrayOutputStream;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ClauseExpressionImpl;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.FilePathFieldImpl;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.TypeFieldImpl;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.DotNotationTypeConverter;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.PathValueConverter;

public class QueryExtractor implements IUnitOfWork<String, XtextResource> {

    @Override
    public String exec(final XtextResource state) throws Exception {
        final TreeIterator<EObject> iter = state.getAllContents();

        do {
            final EObject o = iter.next();
            //
            System.out.println(o.getClass());

            if (o instanceof ClauseExpressionImpl) {
                final ClauseExpressionImpl impl = (ClauseExpressionImpl) o;
                final EObject field = impl.getField();

                if (field instanceof TypeFieldImpl) {

                    final DotNotationTypeConverter conv = new DotNotationTypeConverter();

                    for (int i = 0; i < impl.getValues().size(); i++) {
                        final String oldValue = impl.getValues().get(i);
                        final String newValue = conv.convertFrom(oldValue);
                        impl.getValues().set(i, newValue);
                    }
                }

                if (field instanceof FilePathFieldImpl) {
                    final PathValueConverter conv = new PathValueConverter();

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
