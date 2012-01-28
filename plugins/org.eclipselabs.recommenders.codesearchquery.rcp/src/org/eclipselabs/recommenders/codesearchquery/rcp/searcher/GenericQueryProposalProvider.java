package org.eclipselabs.recommenders.codesearchquery.rcp.searcher;

import java.io.IOException;
import java.util.List;

import org.apache.lucene.store.Directory;
import org.eclipse.recommenders.injection.InjectionService;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.contentassist.IQueryProposalProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.IQueryPartConverter;
import org.eclipselabs.recommenders.codesearchquery.rcp.termvector.ITermVectorProvider;

public class GenericQueryProposalProvider implements IQueryProposalProvider {

    private final ITermVectorProvider termVectorProvider;
    private final IQueryPartConverter queryPartConverter;

    public GenericQueryProposalProvider(final ITermVectorProvider termVectorProvider,
            final IQueryPartConverter queryPartConverter) {
        this.termVectorProvider = termVectorProvider;
        this.queryPartConverter = queryPartConverter;
    }

    @Override
    public List<String> getProposals() {

        try {

            final Directory directory = InjectionService.getInstance().requestInstance(Directory.class);

            final CodeSearcherIndex searcherIndex = new CodeSearcherIndex(directory);

            termVectorProvider.load(searcherIndex);

            return termVectorProvider.getDisjunctTermVector();
        } catch (final IOException e) {
            return null;
        }
    }

    @Override
    public String convert(final String source) {
        if (queryPartConverter == null) {
            return source;
        }

        return queryPartConverter.convertTo(source);
    }
}
