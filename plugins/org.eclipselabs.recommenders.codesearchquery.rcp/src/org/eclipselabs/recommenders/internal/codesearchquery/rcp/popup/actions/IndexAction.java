package org.eclipselabs.recommenders.internal.codesearchquery.rcp.popup.actions;

import java.util.List;

import org.apache.lucene.store.Directory;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.recommenders.injection.InjectionService;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.CodeIndexerIndex;
import org.eclipselabs.recommenders.internal.codesearchquery.rcp.Activator;
import org.eclipselabs.recommenders.internal.codesearchquery.rcp.indexing.IndexUpdaterJob;

import com.google.common.collect.Lists;

public class IndexAction implements IObjectActionDelegate {

    // private Shell shell;
    List<IProject> projects = null;

    /**
     * Constructor for Action1.
     */
    public IndexAction() {
        super();
    }

    /**
     * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
     */
    @Override
    public void setActivePart(final IAction action, final IWorkbenchPart targetPart) {
        // shell = targetPart.getSite().getShell();
    }

    /**
     * @see IActionDelegate#run(IAction)
     */
    @Override
    public void run(final IAction action) {
        try {
            final Long start = System.currentTimeMillis();

            final InjectionService s = InjectionService.getInstance();
            final Directory directory = s.requestInstance(Directory.class);
            final CodeIndexerIndex index = s.requestInstance(CodeIndexerIndex.class);

            final IndexUpdaterJob job = new IndexUpdaterJob(index, ResourcesPlugin.getWorkspace().getRoot());
            job.addJobChangeListener(new JobChangeAdapter() {

                @Override
                public void done(final IJobChangeEvent event) {
                    if (event.getResult().isOK()) {

                        index.printStats();
                        // index.close();

                        final Long duration = System.currentTimeMillis() - start;

                        final String msg =
                                "Index was built for " + projects.size() + " project(s). Took " + duration
                                        + " milliseconds.";

                        System.out.println(msg);
                    } else {
                        System.out.println(event.getResult().getMessage());
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
        projects = Lists.newLinkedList();

        if (selection instanceof IStructuredSelection) {

            for (final Object o : ((IStructuredSelection) selection).toArray()) {

                if (o instanceof IProject) {
                    projects.add((IProject) o);
                } else if (o instanceof PlatformObject) {
                    projects.add((IProject) ((PlatformObject) o).getAdapter(IProject.class));
                }
            }
        }
    }

}
