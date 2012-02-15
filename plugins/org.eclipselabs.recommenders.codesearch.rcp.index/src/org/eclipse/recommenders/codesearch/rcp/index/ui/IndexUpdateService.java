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

import java.io.IOException;

import javax.inject.Inject;

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
import org.eclipse.recommenders.codesearch.rcp.index.indexer.CodeIndexerIndex;
import org.eclipse.recommenders.rcp.RecommendersPlugin;
import org.eclipse.recommenders.rcp.events.JavaModelEvents.CompilationUnitAdded;
import org.eclipse.recommenders.rcp.events.JavaModelEvents.CompilationUnitRemoved;
import org.eclipse.recommenders.rcp.events.JavaModelEvents.CompilationUnitSaved;
import org.eclipse.recommenders.rcp.events.JavaModelEvents.JavaProjectOpened;

import com.google.common.eventbus.Subscribe;

public class IndexUpdateService {

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

    public static void scheduleIndexingJob(final IJavaProject javaProject, final CodeIndexerIndex indexer) {
        new Job(format("Updating code-search index for '%s'", javaProject.getElementName())) {
            {
                setPriority(Job.DECORATE);
                setRule(MUTEX);
                schedule();
            }

            @Override
            public IStatus run(final IProgressMonitor monitor) {
                return IndexUtils.indexProject(javaProject, indexer, monitor);
            }

        };
    }

    private final CodeIndexerIndex indexer;

    @Inject
    public IndexUpdateService(final CodeIndexerIndex indexer, final IWorkspaceRoot workspace) {
        this.indexer = indexer;
        new Job("Code-search: Re-indexing workspace.") {
            {
                schedule(25000);
            }

            @Override
            protected IStatus run(final IProgressMonitor monitor) {
                final IProject[] projects = workspace.getProjects();
                monitor.beginTask("Indexing", projects.length);
                for (final IProject p : projects) {
                    if (JavaProject.hasJavaNature(p)) {
                        IndexUtils.indexProject(JavaCore.create(p), indexer, new SubProgressMonitor(monitor, 1));
                    }
                    monitor.worked(1);
                }
                return Status.OK_STATUS;
            }
        };
    }

    @Subscribe
    public void onEvent(final CompilationUnitAdded event) {
        addOrUpdateCompilationUnitToIndex(event.compilationUnit);
    }

    @Subscribe
    public void onEvent(final JavaProjectOpened event) {
        if (PreferencePage.isActive()) {
            scheduleIndexingJob(event.project, indexer);
        }
    }

    @Subscribe
    public void onEvent(final CompilationUnitSaved event) {
        if (PreferencePage.isActive()) {
            addOrUpdateCompilationUnitToIndex(event.compilationUnit);
        }
    }

    @Subscribe
    public void onEvent(final CompilationUnitRemoved event) {
        if (!PreferencePage.isActive()) {
            return;
        }

        try {
            if (event.compilationUnit != null) {
                final CompilationUnit ast = IndexUtils.getAST(event.compilationUnit);
                if (ast != null) {
                    indexer.delete(ast);
                }
            }
        } catch (final IOException e) {
            RecommendersPlugin.logError(e, "error during indexing");
        }
    }

    private void addOrUpdateCompilationUnitToIndex(final ICompilationUnit cu) {
        try {

            if (!IndexUtils.shouldIndex(cu, indexer)) {
                return;
            }
            final CompilationUnit ast = IndexUtils.getAST(cu);
            if (ast != null) {
                indexer.index(ast);
            }
        } catch (final Exception e) {
            RecommendersPlugin.logError(e, "error during indexing");
        }
    }
}
