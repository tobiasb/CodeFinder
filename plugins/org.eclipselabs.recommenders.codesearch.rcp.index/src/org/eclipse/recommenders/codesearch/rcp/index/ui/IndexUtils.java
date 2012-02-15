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

import static com.google.common.base.Optional.absent;
import static com.google.common.base.Optional.of;
import static org.eclipse.recommenders.utils.Checks.cast;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IClasspathEntry;
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
import org.eclipse.recommenders.codesearch.rcp.index.indexer.utils.CompilationUnitHelper;
import org.eclipse.recommenders.rcp.RecommendersPlugin;

import com.google.common.base.Optional;
import com.google.common.io.ByteStreams;
import com.google.common.io.Files;

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
                if (isCurrent(root, indexer)) {
                    continue;
                }
                // delete *all* old files for given resource
                indexer.delete(computeLocation(root));

                if (isBinaryArchive(root)) {
                    final Optional<ZipFile> opt = getAttachedSourceArchive(root);
                    if (opt.isPresent()) {
                        analyzeSourcesInZip(opt.get(), root, indexer, monitor);
                        try {
                            opt.get().close();
                        } catch (final IOException e) {
                            // silently ignore
                        }
                    }
                } else {
                    analyzeSourcesInSourceFolder(indexer, monitor, root);
                }
                indexer.commit();
                monitor.worked(1);
            }
        } catch (final Exception e) {
            RecommendersPlugin.logError(e, "Error during code search indexing");
        } finally {
            indexer.commit();
            monitor.done();

        }
        return Status.OK_STATUS;
    }

    private static boolean isCurrent(final IPackageFragmentRoot root, final CodeIndexerIndex indexer) {
        final File file = computeLocation(root);
        final long lastModified = file.lastModified();
        final long lastIndexed = indexer.lastIndexed(file);
        return lastModified < lastIndexed;
    }

    private static void analyzeSourcesInSourceFolder(final CodeIndexerIndex indexer, final IProgressMonitor monitor,
            final IPackageFragmentRoot root) throws JavaModelException {
        for (final IJavaElement child : root.getChildren()) {
            final IPackageFragment fragment = cast(child);
            for (final ICompilationUnit cu : fragment.getCompilationUnits()) {
                monitor.subTask(computeLocation(cu).getAbsolutePath());
                addOrUpdateCompilationUnitToIndex(cu, indexer);
            }
        }
    }

    private static void analyzeSourcesInZip(final ZipFile zipFile, final IPackageFragmentRoot root,
            final CodeIndexerIndex indexer, final IProgressMonitor monitor) {
        try {

            final Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                final ZipEntry next = entries.nextElement();
                if (!next.getName().endsWith(".java")) {
                    continue;
                }
                final InputStream is = zipFile.getInputStream(next);
                final byte[] bytes = ByteStreams.toByteArray(is);
                final char[] content = new String(bytes, "UTF-8").toCharArray();
                final IJavaProject javaProject = root.getJavaProject();
                final String unitName = javaProject.getElementName() + "/" + next.getName();
                final CompilationUnit cu = CompilationUnitHelper.parse(content, unitName, javaProject);
                cu.setProperty("location", computeLocation(root));
                cu.setProperty("project", javaProject);
                monitor.subTask(root.getPath() + "!" + next.getName());
                indexer.index(cu);
            }
        } catch (final Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static Optional<ZipFile> getAttachedSourceArchive(final IPackageFragmentRoot root) {
        try {
            final IClasspathEntry cp = root.getResolvedClasspathEntry();
            final IPath path = cp.getSourceAttachmentPath();
            if (path == null) {
                return absent();
            }
            final File file = path.toFile();
            if (!file.exists() || file.isDirectory()) {
                return absent();
            }
            // jsut get it into memory to make the scan faster
            Files.toByteArray(file);
            return of(new ZipFile(file));
        } catch (final Exception e) {
            RecommendersPlugin.logError(e, "failed to read attached source file.");
            return absent();
        }
    }

    private static boolean isBinaryArchive(final IPackageFragmentRoot root) throws JavaModelException {
        return root.isArchive() && root.getKind() == IPackageFragmentRoot.K_BINARY; // redundant?
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
        final File file = computeLocation(cu);
        final long lastModified = file.lastModified();
        final long lastIndexed = indexer.lastIndexed(file);
        return lastIndexed < lastModified;
    }

    public static File computeLocation(final ITypeRoot root) {

        final IResource resource = root.getResource();
        final IPath path;
        if (resource == null) {
            path = root.getPath();
        } else {
            path = resource.getRawLocation();
        }
        return path.toFile();
    }

    public static File computeLocation(final IPackageFragmentRoot root) {

        final IResource resource = root.getResource();
        final IPath path;
        if (resource == null) {
            path = root.getPath();
        } else {
            path = resource.getRawLocation();
        }
        return path.toFile();
    }

}
