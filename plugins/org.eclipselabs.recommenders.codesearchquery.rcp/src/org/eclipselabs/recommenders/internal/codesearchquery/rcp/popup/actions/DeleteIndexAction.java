package org.eclipselabs.recommenders.internal.codesearchquery.rcp.popup.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.recommenders.injection.InjectionService;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.CodeIndexerIndex;

public class DeleteIndexAction implements IObjectActionDelegate {

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
    public void setActivePart(final IAction action, final IWorkbenchPart targetPart) {
        // TODO Auto-generated method stub

    }

}
