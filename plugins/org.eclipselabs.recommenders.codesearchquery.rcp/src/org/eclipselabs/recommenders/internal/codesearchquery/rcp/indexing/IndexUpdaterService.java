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
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.ui.SharedASTProvider;
import org.eclipse.recommenders.rcp.events.JavaModelEvents.CompilationUnitAdded;
import org.eclipse.recommenders.rcp.events.JavaModelEvents.CompilationUnitRemoved;
import org.eclipse.recommenders.rcp.events.JavaModelEvents.CompilationUnitSaved;
import org.eclipse.recommenders.rcp.events.JavaModelEvents.JavaProjectOpened;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.CodeIndexerIndex;

import com.google.common.eventbus.Subscribe;

public class IndexUpdaterService {

    private final CodeIndexerIndex indexer;

    @Inject
    public IndexUpdaterService(final CodeIndexerIndex indexer) {
        this.indexer = indexer;
    }

    @Subscribe
    public void onEvent(final CompilationUnitAdded event) {
        addOrUpdateCompilationUnitToIndex(event.compilationUnit);
    }

    @Subscribe
    public void onEvent(final JavaProjectOpened event) {
        Job job = new Job("Updating code-search index") {

            @Override
            public IStatus run(final IProgressMonitor monitor) {
                IJavaProject project = event.project;
                return IndexUtils.indexProject(project, indexer, monitor);
            }

        };
        job.setPriority(Job.DECORATE);
        job.setRule(null);
        job.schedule();
    }

    @Subscribe
    public void onEvent(final CompilationUnitSaved event) {
        addOrUpdateCompilationUnitToIndex(event.compilationUnit);
    }

    private void addOrUpdateCompilationUnitToIndex(final ICompilationUnit cu) {
        try {

            if (!IndexUtils.shouldIndex(cu, indexer)) {
                return;
            }
            CompilationUnit ast = SharedASTProvider.getAST(cu, SharedASTProvider.WAIT_YES, null);
            if (ast != null) {
                indexer.index(ast);
            }
        } catch (JavaModelException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Subscribe
    public void onEvent(final CompilationUnitRemoved event) {
        System.out.println("no delete support by indexer");
    }
}
