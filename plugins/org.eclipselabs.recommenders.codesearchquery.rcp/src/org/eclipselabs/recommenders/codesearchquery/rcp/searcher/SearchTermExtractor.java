package org.eclipselabs.recommenders.codesearchquery.rcp.searcher;

import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ClauseExpressionImpl;

import com.google.common.collect.Sets;

public class SearchTermExtractor implements IUnitOfWork<Set<String>, XtextResource> {

    @Override
    public Set<String> exec(XtextResource state) throws Exception {

        final TreeIterator<EObject> iter = state.getAllContents();
        final Set<String> res = Sets.newHashSet();

        do {
            final EObject o = iter.next();

            if (o instanceof ClauseExpressionImpl) {
                final ClauseExpressionImpl impl = (ClauseExpressionImpl) o;

                // final String _default = value2.getDefault();
                // if (_default != null) {
                // res.add(_default.replaceAll("\\W", "").toLowerCase());
                // }

                for (int i = 0; i < impl.getValues().size(); i++) {
                    final String value = impl.getValues().get(i);

                    final String lowerCase = value.toLowerCase();
                    final String[] segments = lowerCase.split("\\W");
                    for (final String term : segments) {
                        if (term.isEmpty()) {
                            continue;
                        }
                        res.add(term);
                    }
                }
            }

        } while (iter.hasNext());

        return res;
    }

}
