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

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.internal.core.JavaProject;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.CodeIndexerIndex;
import org.eclipselabs.recommenders.internal.codesearchquery.rcp.Activator;

@SuppressWarnings("restriction")
public class IndexUpdaterJob extends Job {

    private final CodeIndexerIndex indexer;
    private final IWorkspaceRoot workspace;

    public IndexUpdaterJob(final CodeIndexerIndex indexer, final IWorkspaceRoot workspace) {
        super("Updating code-search index...");
        setPriority(DECORATE);
        this.indexer = indexer;
        this.workspace = workspace;
    }

    @Override
    public IStatus run(final IProgressMonitor monitor) {
        try {
            monitor.beginTask("Indexing", workspace.getProjects().length + 1);
            // don't start from zero ;)
            monitor.worked(1);
            for (IProject p : workspace.getProjects()) {
                if (!JavaProject.hasJavaNature(p)) {
                    continue;
                }

                IJavaProject javaProject = JavaCore.create(p);
                IStatus res = IndexUtils.indexProject(javaProject, indexer, new SubProgressMonitor(monitor, 1));
                if (!res.isOK()) {
                    Activator.log(res);
                }
                monitor.worked(1);
            }
            return Status.OK_STATUS;
        } catch (Exception e) {
            return Status.OK_STATUS;
        } finally {
            monitor.done();

            indexer.commit();
        }
    }
}