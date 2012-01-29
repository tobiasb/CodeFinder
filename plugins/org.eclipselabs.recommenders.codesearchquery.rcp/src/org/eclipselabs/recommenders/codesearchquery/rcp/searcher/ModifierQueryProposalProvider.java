package org.eclipselabs.recommenders.codesearchquery.rcp.searcher;

import java.util.List;

import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.PlatformUI;
import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.contentassist.IQueryProposalProvider;

import com.google.common.collect.Lists;

public class ModifierQueryProposalProvider implements IQueryProposalProvider {

    @Override
    public List<String> getProposals() {
        final List<String> list = Lists.newArrayList();

        list.add(Fields.MODIFIER_ABSTRACT);
        list.add(Fields.MODIFIER_FINAL);
        list.add(Fields.MODIFIER_PRIVATE);
        list.add(Fields.MODIFIER_PROTECTED);
        list.add(Fields.MODIFIER_PUBLIC);
        list.add(Fields.MODIFIER_STATIC);

        return list;
    }

    @Override
    public String convert(final String source) {
        return source;
    }

    @Override
    public Image getImage() {
        return PlatformUI.getWorkbench().getSharedImages()
                .getImage(org.eclipse.ui.ide.IDE.SharedImages.IMG_OBJS_BKMRK_TSK);
    }

}
