package org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.contentassist;

import java.util.List;

import org.eclipse.swt.graphics.Image;

public interface IQueryProposalProvider {
    public List<String> getProposals();

    public String convert(String source);

    public Image getImage();
}
