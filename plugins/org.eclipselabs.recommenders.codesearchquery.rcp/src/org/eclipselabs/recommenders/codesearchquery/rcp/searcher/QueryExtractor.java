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

                    final DotNotationConverter conv = new DotNotationConverter();

                    final String oldValue = impl.getValue();
                    final String newValue = conv.convertFrom(oldValue);

                    impl.setValue(newValue);
                }

                if (field instanceof FilePathFieldImpl) {
                    final PathValueConverter conv = new PathValueConverter();

                    final String oldValue = impl.getValue();
                    final String newValue = conv.convertFrom(oldValue);

                    impl.setValue(newValue);
                }
            }

        } while (iter.hasNext());

        final ByteArrayOutputStream stream = new ByteArrayOutputStream();
        state.save(stream, null);
        return stream.toString();
    }

}
