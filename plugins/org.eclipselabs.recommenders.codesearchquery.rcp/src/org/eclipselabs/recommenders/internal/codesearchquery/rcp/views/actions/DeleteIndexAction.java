package org.eclipselabs.recommenders.internal.codesearchquery.rcp.views.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.recommenders.injection.InjectionService;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.CodeIndexerIndex;

public class DeleteIndexAction implements IViewActionDelegate {

    public DeleteIndexAction() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void run(final IAction action) {
        final CodeIndexerIndex index = InjectionService.getInstance().requestInstance(CodeIndexerIndex.class);

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
