package org.eclipselabs.recommenders.codesearchquery.rcp.searcher;

import java.util.List;

import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.contentassist.IQueryProposalProvider;

import com.google.common.collect.Lists;

public class DocumentTypeProposalProvider implements IQueryProposalProvider {

    @Override
    public List<String> getProposals() {
        final List<String> list = Lists.newArrayList();

        list.add(Fields.TYPE_CLASS);
        list.add(Fields.TYPE_METHOD);
        list.add(Fields.TYPE_FIELD);
        list.add(Fields.TYPE_TRYCATCH);

        return list;
    }

    @Override
    public String convert(final String source) {
        return source;
    }

}