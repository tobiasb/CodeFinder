package org.eclipse.recommenders.internal.codesearch.rcp.views.actions;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.CodeIndexerIndex;
import org.eclipse.recommenders.injection.InjectionService;
import org.eclipse.recommenders.internal.codesearch.rcp.Activator;
import org.eclipse.recommenders.internal.codesearch.rcp.indexing.IndexUpdaterJob;
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
            final Long start = System.currentTimeMillis();

            final CodeIndexerIndex index = InjectionService.getInstance().requestInstance(CodeIndexerIndex.class);

            final IndexUpdaterJob job = new IndexUpdaterJob(index, ResourcesPlugin.getWorkspace().getRoot());
            job.addJobChangeListener(new JobChangeAdapter() {

                @Override
                public void done(final IJobChangeEvent event) {
                    if (event.getResult().isOK()) {

                        index.printStats();

                        final Long duration = System.currentTimeMillis() - start;

                        final String msg = "Index was built for "
                                + ResourcesPlugin.getWorkspace().getRoot().getProjects().length + " project(s). Took "
                                + duration + " milliseconds.";

                        Activator.logInfo(msg);
                    } else {
                        Activator.logWarning(event.getResult().getMessage());
                    }
                }

            });
            job.schedule();
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
    public void init(IViewPart view) {
        // TODO Auto-generated method stub

    }

}
