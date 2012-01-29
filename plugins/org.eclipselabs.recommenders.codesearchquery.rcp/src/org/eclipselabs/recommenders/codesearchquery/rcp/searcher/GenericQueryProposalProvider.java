package org.eclipselabs.recommenders.codesearchquery.rcp.searcher;

import java.util.List;

import org.eclipse.recommenders.injection.InjectionService;
import org.eclipse.swt.graphics.Image;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.contentassist.IQueryProposalProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.IQueryPartConverter;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.utils.IImageProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.termvector.ITermVectorProvider;

public class GenericQueryProposalProvider implements IQueryProposalProvider {

    private final ITermVectorProvider termVectorProvider;
    private final IQueryPartConverter queryPartConverter;
    private final IImageProvider imageProvider;

    public GenericQueryProposalProvider(final ITermVectorProvider termVectorProvider,
            final IQueryPartConverter queryPartConverter) {
        this.termVectorProvider = termVectorProvider;
        this.queryPartConverter = queryPartConverter;
        this.imageProvider = null;
    }

    public GenericQueryProposalProvider(final ITermVectorProvider termVectorProvider,
            final IQueryPartConverter queryPartConverter, final IImageProvider imageProvider) {
        this.termVectorProvider = termVectorProvider;
        this.queryPartConverter = queryPartConverter;
        this.imageProvider = imageProvider;
    }

    @Override
    public List<String> getProposals() {

        final CodeSearcherIndex searcherIndex = InjectionService.getInstance().requestInstance(CodeSearcherIndex.class);

        termVectorProvider.load(searcherIndex);

        return termVectorProvider.getDisjunctTermVector();
    }

    @Override
    public String convert(final String source) {
        if (queryPartConverter == null) {
            return source;
        }

        return queryPartConverter.convertTo(source);
    }

    @Override
    public Image getImage() {
        if (imageProvider != null)
            return imageProvider.getImage();

        return null;
    }
}
