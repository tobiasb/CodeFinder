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

import static org.eclipse.recommenders.utils.Checks.cast;

import java.io.File;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IClassFile;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.ITypeRoot;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.ui.SharedASTProvider;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.CodeIndexerIndex;
import org.eclipse.recommenders.rcp.RecommendersPlugin;

public class IndexUtils {

    // XXX note, we do not delete any files yet..

    public static IStatus indexProject(final IJavaProject project, final CodeIndexerIndex indexer,
            final IProgressMonitor monitor) {

        try {
            // get all package fragments of this project (not including those of
            // the projects it depends one
            final IPackageFragmentRoot[] roots = project.getPackageFragmentRoots();
            monitor.beginTask("", roots.length);
            for (final IPackageFragmentRoot root : roots) {
                if (root.isArchive() && root.getResolvedClasspathEntry().getSourceAttachmentPath() == null) {
                    // if (K_BINARY == root.getKind()) {
                    continue;
                }
                if (monitor.isCanceled()) {
                    return Status.CANCEL_STATUS;
                }

                for (final IJavaElement child : root.getChildren()) {
                    final IPackageFragment fragment = cast(child);
                    for (final ICompilationUnit cu : fragment.getCompilationUnits()) {
                        if (monitor.isCanceled()) {
                            return Status.CANCEL_STATUS;
                        }
                        monitor.subTask(computeLocation(cu));
                        addOrUpdateCompilationUnitToIndex(cu, indexer);
                    }

                    for (final IClassFile clazz : fragment.getClassFiles()) {
                        if (clazz.getElementName().contains("$")) {
                            continue;
                        }
                        if (monitor.isCanceled()) {
                            return Status.CANCEL_STATUS;
                        }
                        monitor.subTask(computeLocation(clazz));
                        addOrUpdateCompilationUnitToIndex(clazz, indexer);
                    }
                    indexer.commit();
                }
                monitor.worked(1);
            }
        } catch (final JavaModelException e) {
            RecommendersPlugin.logError(e, "Error during code search indexing");
        } finally {
            indexer.commit();
            monitor.done();

        }
        return Status.OK_STATUS;
    }

    public static CompilationUnit getAST(final ITypeRoot cu) {
        return SharedASTProvider.getAST(cu, SharedASTProvider.WAIT_YES, null);
    }

    public static void addOrUpdateCompilationUnitToIndex(final ITypeRoot cu, final CodeIndexerIndex indexer) {
        try {
            if (!shouldIndex(cu, indexer)) {
                return;
            }
            final CompilationUnit ast = getAST(cu);
            if (ast != null) {
                indexer.index(ast);
            }
        } catch (final Exception e) {
            RecommendersPlugin.logError(e, "Error during code search indexing");
        }
    }

    public static boolean shouldIndex(final ITypeRoot cu, final CodeIndexerIndex indexer) throws JavaModelException {
        final String location = computeLocation(cu);
        final File file = new File(StringUtils.substringBefore(location, "!"));
        final long lastModified = file.lastModified();
        final long lastIndexed = indexer.lastIndexed(location);
        return lastIndexed < lastModified;
    }

    public static String computeLocation(final ITypeRoot root) {
        final IResource resource = root.getResource();
        if (resource == null) {
            final String l = root instanceof IClassFile ? ((IClassFile) root).getType().getFullyQualifiedName()
                    : "<unknown>";
            return root.getPath().toPortableString() + "!" + l;
        } else {
            return resource.getFullPath().toPortableString();
        }
    }
}
