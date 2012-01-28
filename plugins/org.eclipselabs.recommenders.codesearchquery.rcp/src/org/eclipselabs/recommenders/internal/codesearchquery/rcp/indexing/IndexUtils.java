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

import static org.eclipse.recommenders.utils.Checks.cast;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.ui.SharedASTProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.CodeIndexerIndex;

public class IndexUtils {

    // XXX note, we do not delete any files yet..

    public static IStatus indexProject(final IJavaProject project, final CodeIndexerIndex indexer,
            final IProgressMonitor monitor) {

        try {
            // get all package fragments of this project (not including those of
            // the projects it depends one
            final IPackageFragmentRoot[] roots = project.getPackageFragmentRoots();
            monitor.beginTask(project.getElementName(), roots.length);
            for (final IPackageFragmentRoot root : roots) {
                for (final IJavaElement child : root.getChildren()) {
                    final IPackageFragment fragment = cast(child);
                    for (final ICompilationUnit cu : fragment.getCompilationUnits()) {
                        if (monitor.isCanceled()) {
                            return Status.CANCEL_STATUS;
                        }
                        monitor.subTask(cu.getPath().toString());
                        addOrUpdateCompilationUnitToIndex(cu, indexer);
                    }

                    // for (IClassFile clazz : fragment.getClassFiles()) {
                    // // TODO need to address this later?
                    // }
                }
                monitor.worked(1);
            }
        } catch (final JavaModelException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            monitor.done();
        }
        return Status.OK_STATUS;
    }

    public static CompilationUnit getAST(final ICompilationUnit cu) {
        return SharedASTProvider.getAST(cu, SharedASTProvider.WAIT_YES, null);
    }

    public static void addOrUpdateCompilationUnitToIndex(final ICompilationUnit cu, final CodeIndexerIndex indexer) {
        try {
            if (!shouldIndex(cu, indexer)) {
                return;
            }
            final CompilationUnit ast = getAST(cu);
            if (ast != null) {
                indexer.index(ast);
            }
        } catch (final JavaModelException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (final IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static boolean shouldIndex(final ICompilationUnit cu, final CodeIndexerIndex indexer)
            throws JavaModelException {
        final IResource resource = cu.getUnderlyingResource();
        final File location = resource.getLocation().toFile();
        if (location == null) {
            return false;
        }
        final long lastModified = location.lastModified();
        final long lastIndexed = indexer.lastIndexed(location);
        return lastIndexed < lastModified;
    }
}
