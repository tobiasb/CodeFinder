/**
 * Copyright (c) 2010, 2012 Darmstadt University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Tobias Boehm - initial API and implementation.
 */

package org.eclipse.recommenders.codesearch.rcp.searcher.proposalProvider;

import java.util.List;

import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.contentassist.IQueryProposalProvider;

import com.google.common.collect.Lists;

public class DocumentTypeProposalProvider implements IQueryProposalProvider {

    @Override
    public List<String> getProposals() {
        final List<String> list = Lists.newArrayList();

        list.add(Fields.TYPE_CLASS);
        list.add(Fields.TYPE_METHOD);
        list.add(Fields.TYPE_FIELD);
        list.add(Fields.TYPE_TRYCATCH);
        list.add(Fields.TYPE_VARUSAGE);

        return list;
    }

    @Override
    public String convert(final String source) {
        return source;
    }

    @Override
    public Image getImage() {
        return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FILE);
    }

    @Override
    public void setArgument(int index, Object o) {
        // Not used
    }
}
