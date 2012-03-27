package org.eclipse.recommenders.codesearch.rcp.searcher.proposalProvider;

import java.util.List;
import java.util.Map;

import org.eclipse.recommenders.codesearch.rcp.index.searcher.CodeSearcher;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.converter.IQueryPartConverter;
import org.eclipse.recommenders.codesearch.rcp.index.termvector.ITermVectorProvider;
import org.eclipse.recommenders.codesearch.rcp.searcher.imageProvider.IImageProvider;
import org.eclipse.recommenders.injection.InjectionService;
import org.eclipse.swt.graphics.Image;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.contentassist.IQueryProposalProvider;

import com.google.common.collect.Maps;

public class GenericQueryProposalProvider implements IQueryProposalProvider {

    private final ITermVectorProvider termVectorProvider;
    private final IQueryPartConverter queryPartConverter;
    private final IImageProvider imageProvider;
    private final Map<Integer, Object> argumentsMap = Maps.newHashMap();

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

        final CodeSearcher searcherIndex = InjectionService.getInstance().requestInstance(CodeSearcher.class);

        termVectorProvider.load(searcherIndex, argumentsMap);
        List<String> disjunctTermVector = termVectorProvider.getDisjunctTermVector();

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

    protected Object getArgument(int index) {
        return this.argumentsMap.get(index);
    }

    @Override
    public void setArgument(int index, Object o) {
        this.argumentsMap.put(index, o);
    }
}
