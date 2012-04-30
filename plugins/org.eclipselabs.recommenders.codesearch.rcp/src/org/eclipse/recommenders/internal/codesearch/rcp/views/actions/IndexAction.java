package org.eclipse.recommenders.internal.codesearch.rcp.views.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.recommenders.internal.codesearch.rcp.Activator;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

public class IndexAction implements IViewActionDelegate {

    // private Shell shell;
    // List<IProject> projects = null;

    /**
     * Constructor for Action1.
     */
    public IndexAction() {
        super();
    }

    /**
     * @see IActionDelegate#run(IAction)
     */
    @Override
    public void run(final IAction action) {
        try {
//            final CodeIndexer index = InjectionService.getInstance().requestInstance(CodeIndexer.class);

            MessageDialog.openError(new Shell(), "Action not available anymore.",
                    "this action moved to index plugin :)");
        } catch (final Exception ex) {
            Activator.logError(ex, "Error");
        }
    }

    /**
     * @see IActionDelegate#selectionChanged(IAction, ISelection)
     */
    @Override
    public void selectionChanged(final IAction action, final ISelection selection) {
        // projects = Lists.newLinkedList();
        //
        // if (selection instanceof IStructuredSelection) {
        //
        // for (final Object o : ((IStructuredSelection) selection).toArray()) {
        //
        // if (o instanceof IProject) {
        // projects.add((IProject) o);
        // } else if (o instanceof PlatformObject) {
        // projects.add((IProject) ((PlatformObject)
        // o).getAdapter(IProject.class));
        // }
        // }
        // }
    }

    @Override
    public void init(final IViewPart view) {
        // TODO Auto-generated method stub

    }

}
