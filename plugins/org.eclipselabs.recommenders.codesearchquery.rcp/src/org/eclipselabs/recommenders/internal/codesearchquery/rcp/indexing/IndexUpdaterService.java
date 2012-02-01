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
package org.eclipselabs.recommenders.internal.codesearchquery.rcp.indexing;

import java.io.IOException;

import javax.inject.Inject;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.recommenders.rcp.events.JavaModelEvents.CompilationUnitAdded;
import org.eclipse.recommenders.rcp.events.JavaModelEvents.CompilationUnitRemoved;
import org.eclipse.recommenders.rcp.events.JavaModelEvents.CompilationUnitSaved;
import org.eclipse.recommenders.rcp.events.JavaModelEvents.JavaProjectOpened;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.CodeIndexerIndex;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.IndexUpdaterServiceSettings;
import org.eclipselabs.recommenders.internal.codesearchquery.rcp.Activator;

import com.google.common.eventbus.Subscribe;

public class IndexUpdaterService {

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
        final Job job = new Job("Updating code-search index") {

            @Override
            public IStatus run(final IProgressMonitor monitor) {
                return IndexUtils.indexProject(javaProject, indexer, monitor);
            }

        };
        job.setPriority(Job.DECORATE);
        job.setRule(MUTEX);
        job.schedule(5000);

    }

    private final CodeIndexerIndex indexer;

    @Inject
    public IndexUpdaterService(final CodeIndexerIndex indexer) {
        this.indexer = indexer;
    }

    @Subscribe
    public void onEvent(final CompilationUnitAdded event) {
        if (IndexUpdaterServiceSettings.getNoDispatch()) {
            return;
        }

        addOrUpdateCompilationUnitToIndex(event.compilationUnit);
    }

    @Subscribe
    public void onEvent(final JavaProjectOpened event) {
        if (IndexUpdaterServiceSettings.getNoDispatch()) {
            return;
        }
        scheduleIndexingJob(event.project, indexer);
    }

    @Subscribe
    public void onEvent(final CompilationUnitSaved event) {
        if (IndexUpdaterServiceSettings.getNoDispatch()) {
            return;
        }

        addOrUpdateCompilationUnitToIndex(event.compilationUnit);
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
        } catch (final JavaModelException e) {
            Activator.logError(e);
        } catch (final IOException e) {
            Activator.logError(e);
        }
    }

    @Subscribe
    public void onEvent(final CompilationUnitRemoved event) {
        if (IndexUpdaterServiceSettings.getNoDispatch()) {
            return;
        }

        try {
            if (event.compilationUnit != null) {
                final CompilationUnit ast = IndexUtils.getAST(event.compilationUnit);
                if (ast != null) {
                    indexer.delete(ast);
                }
            }
        } catch (final IOException ex) {
            Activator.logError(ex);
        }
    }
}
