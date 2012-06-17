/**
 * Copyright (c) 2012 Tobias Boehm.
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

public class DefinitionProposalProvider implements IQueryProposalProvider {

    @Override
    public List<String> getProposals() {
        final List<String> list = Lists.newArrayList();

        list.add(Fields.DEFINITION_INSTANCE_CREATION);
        list.add(Fields.DEFINITION_ASSIGNMENT);
        list.add(Fields.DEFINITION_NULLLITERAL);
        list.add(Fields.DEFINITION_PARAMETER);
        list.add(Fields.DEFINITION_UNINITIALIZED);

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
