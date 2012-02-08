package org.eclipse.recommenders.codesearch.rcp.searcher;

import java.util.List;

import org.eclipse.recommenders.codesearch.rcp.index.searcher.CodeSearcherIndex;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.converter.IQueryPartConverter;
import org.eclipse.recommenders.codesearch.rcp.index.termvector.ITermVectorProvider;
import org.eclipse.recommenders.codesearch.rcp.searcher.utils.IImageProvider;
import org.eclipse.recommenders.injection.InjectionService;
import org.eclipse.recommenders.internal.codesearch.rcp.Activator;
import org.eclipse.swt.graphics.Image;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.contentassist.IQueryProposalProvider;

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

        final Long start = System.currentTimeMillis();
        termVectorProvider.load(searcherIndex);
        List<String> disjunctTermVector = termVectorProvider.getDisjunctTermVector();
        final Long duration = System.currentTimeMillis() - start;

        Activator.logInfo("Loading proposals took %sms", duration);

        return disjunctTermVector;
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
