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

package org.eclipse.recommenders.internal.codesearch.rcp.views.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.CodeIndexer;
import org.eclipse.recommenders.injection.InjectionService;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

public class DeleteIndexAction implements IViewActionDelegate {

    public DeleteIndexAction() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void run(final IAction action) {
        final CodeIndexer index = InjectionService.getInstance().requestInstance(CodeIndexer.class);

        index.truncateIndex();
        index.printStats();
    }

    @Override
    public void selectionChanged(final IAction action, final ISelection selection) {
        // TODO Auto-generated method stub

    }

    @Override
    public void init(IViewPart view) {
        // TODO Auto-generated method stub

    }

}
