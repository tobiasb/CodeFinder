/**
 * Copyright (c) 2010, 2011 Darmstadt University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Marcel Bruch - initial API and implementation.
 */
package org.eclipse.recommenders.codesearch.rcp.index.ui;

import static java.lang.String.format;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.inject.Inject;

import org.eclipse.core.internal.resources.Workspace;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.internal.core.JavaProject;
import org.eclipse.jdt.ui.SharedASTProvider;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.CodeIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.ResourcePathIndexer;
import org.eclipse.recommenders.rcp.RecommendersPlugin;
import org.eclipse.recommenders.rcp.events.JavaModelEvents.CompilationUnitAdded;
import org.eclipse.recommenders.rcp.events.JavaModelEvents.CompilationUnitRemoved;
import org.eclipse.recommenders.rcp.events.JavaModelEvents.CompilationUnitSaved;
import org.eclipse.recommenders.rcp.events.JavaModelEvents.JavaProjectOpened;
import org.eclipse.recommenders.utils.rcp.internal.RecommendersUtilsPlugin;
import org.eclipse.ui.internal.misc.StatusUtil;

import com.google.common.eventbus.Subscribe;
import com.google.common.util.concurrent.ThreadFactoryBuilder;

public class IndexUpdateService {

    private static boolean backgroundIndexerActive = true;

    public static void setBackgroundIndexerActive(final boolean isActive) {
        backgroundIndexerActive = isActive;
    }

    public static final ISchedulingRule MUTEX = new ISchedulingRule() {
        @Override
        public boolean isConflicting(final ISchedulingRule rule) {
            return rule == this;
        }

        @Override
        public boolean contains(final ISchedulingRule rule) {
            return rule == this;
        }

    };

    private final CodeIndexer indexer;

    @Inject
    public IndexUpdateService(final CodeIndexer indexer, final IWorkspaceRoot workspace) {
        this.indexer = indexer;

        if (!PreferencePage.isActive()) {
            return;
        }
        new Job("Code-search: Re-indexing workspace.") {

            ExecutorService e = Executors.newSingleThreadExecutor(new ThreadFactoryBuilder()
                    .setNameFormat("Recommenders::codesearch-indexer-%d").setPriority(Thread.MIN_PRIORITY).build());
            {
                setRule(MUTEX);
                schedule(30000);
            }

            @Override
            protected IStatus run(final IProgressMonitor monitor) {
                if (((Workspace) workspace.getWorkspace()).getBuildManager().isAutobuildBuildPending()) {
                    schedule(30000);
                    return Status.CANCEL_STATUS;
                }

                final CountDownLatch wait = new CountDownLatch(1);
                e.submit(new Runnable() {

                    @Override
                    public void run() {
                        try {
                            final IProject[] projects = workspace.getProjects();
                            monitor.beginTask("Indexing", projects.length + 1);
                            monitor.subTask("");
                            monitor.worked(1);
                            for (final IProject p : projects) {
                                if (JavaProject.hasJavaNature(p)) {
                                    if (monitor.isCanceled()) {
                                        return;
                                    }
                                    final ProjectIndexerRunnable r = new ProjectIndexerRunnable(JavaCore.create(p),
                                            indexer);
                                    final SubProgressMonitor sub = new SubProgressMonitor(monitor, 1);
                                    try {
                                        r.run(sub);
                                    } catch (final Exception e) {
                                        RecommendersUtilsPlugin.logError(e, "Exception while indexing project '%s'", p);
                                    }
                                }
                            }
                            monitor.subTask("Compacting index.");
                            indexer.compact(true);
                        } finally {
                            wait.countDown();
                        }
                    }
                });
                e.shutdown();
                try {
                    wait.await();
                } catch (final InterruptedException e1) {
                }
                monitor.done();
                return Status.OK_STATUS;
            }
        };
    }

    @Subscribe
    public void onEvent(final CompilationUnitAdded event) {
        if (PreferencePage.isActive() && backgroundIndexerActive) {
            tryIndexing(event.compilationUnit);
        }
    }

    @Subscribe
    public void onEvent(final JavaProjectOpened event) {
        if (PreferencePage.isActive() && backgroundIndexerActive) {

            final IJavaProject project = event.project;
            new Job(format("Updating code-search index for '%s'", project.getElementName())) {
                {
                    setPriority(Job.DECORATE);
                    setRule(MUTEX);
                    schedule();
                }

                @Override
                public IStatus run(final IProgressMonitor monitor) {
                    try {
                        new ProjectIndexerRunnable(project, indexer).run(monitor);
                    } catch (final Exception e) {
                        return StatusUtil.newStatus(IStatus.ERROR, "Code search project indexer failed.", e);
                    }
                    return Status.OK_STATUS;
                }

            };

        }
    }

    @Subscribe
    public void onEvent(final CompilationUnitSaved event) {
        if (PreferencePage.isActive() && backgroundIndexerActive) {
            tryIndexing(event.compilationUnit);
        }
    }

    private void tryIndexing(final ICompilationUnit cu) {
        try {
            final File file = ResourcePathIndexer.getFile(cu);
            indexer.delete(file);
            final CompilationUnit ast = SharedASTProvider.getAST(cu, SharedASTProvider.WAIT_YES, null);
            indexer.index(ast);
        } catch (final Exception e) {
            RecommendersUtilsPlugin.logError(e, "Failed to index '%s'", cu.getResource().getFullPath());
        }
    }

    @Subscribe
    public void onEvent(final CompilationUnitRemoved event) {
        if (!PreferencePage.isActive() || !backgroundIndexerActive) {
            return;
        }

        try {
            if (event.compilationUnit != null) {
                final CompilationUnit ast = SharedASTProvider.getAST(event.compilationUnit, SharedASTProvider.WAIT_YES,
                        null);
                if (ast != null) {
                    indexer.delete(ast);
                }
            }
        } catch (final IOException e) {
            RecommendersPlugin.logError(e, "error during indexing");
        }
    }

}
