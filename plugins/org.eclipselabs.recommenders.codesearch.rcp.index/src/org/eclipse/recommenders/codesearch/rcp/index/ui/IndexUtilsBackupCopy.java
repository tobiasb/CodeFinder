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
import static org.eclipse.recommenders.codesearch.rcp.index.indexer.ResourcePathIndexer.getFile;
import static org.eclipse.recommenders.codesearch.rcp.index.indexer.ResourcePathIndexer.getPath;
import static org.eclipse.recommenders.utils.Checks.cast;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.apache.lucene.document.Document;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IClassFile;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeRoot;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.internal.core.JarPackageFragmentRoot;
import org.eclipse.jdt.internal.core.SourceMapper;
import org.eclipse.jdt.ui.JavaElementLabels;
import org.eclipse.jdt.ui.SharedASTProvider;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.CodeIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.ResourcePathIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.TimestampIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.utils.CompilationUnitHelper;
import org.eclipse.recommenders.rcp.RecommendersPlugin;

import com.google.common.base.Optional;
import com.google.common.io.ByteStreams;
import com.google.common.io.Files;

public class IndexUtilsBackupCopy {

    // XXX note, we do not delete any files yet..

    @SuppressWarnings("restriction")
    public static IStatus indexProject(final IJavaProject project, final CodeIndexer indexer,
            final IProgressMonitor monitor) {
        try {
            // get all package fragments of this project (not including those of
            // the projects it depends one
            final IPackageFragmentRoot[] roots = project.getPackageFragmentRoots();
            monitor.beginTask("", roots.length);
            for (final IPackageFragmentRoot root : roots) {
                final File location = getFile(root);
                monitor.subTask("testing " + location);
                if (monitor.isCanceled()) {
                    return Status.CANCEL_STATUS;
                }
                if (isCurrent(root, indexer)) {
                    continue;
                }

                if (isBinaryArchive(root)) {
                    final JarPackageFragmentRoot jarRoot = (JarPackageFragmentRoot) root;
                    final SourceMapper sourceMapper = jarRoot.getSourceMapper();

                    if (sourceMapper == null) {
                        continue;
                    }
                    deleteOldDocumentsForFile(indexer, location);

                    for (final IJavaElement child : root.getChildren()) {
                        final IPackageFragment fragment = cast(child);
                        // SourceMapper sourceMapper =
                        // ((JarPackageFragmentRoot)root).getSourceMapper();
                        for (final IClassFile clazz : fragment.getClassFiles()) {
                            if (clazz.getElementName().contains("$")) {
                                continue;
                            }
                            final IType type = clazz.getType();
                            if (type == null) {
                                continue;
                            }

                            final String simpleSourceFileName = type.getElementName() + ".java";
                            final char[] source = sourceMapper.findSource(type, simpleSourceFileName);
                            if (source != null) {
                                final String unitName = type.getFullyQualifiedName().replace('.', '/') + ".java";
                                final IJavaProject javaProject = root.getJavaProject();
                                final CompilationUnit cu = CompilationUnitHelper.parse(source, unitName, javaProject);
                                cu.setProperty("location", getFile(root));
                                cu.setProperty("project", javaProject);
                                monitor.subTask(root.getPath() + "!" + unitName);
                                indexer.add(cu);
                                // analyzeClassFile(indexer, monitor, location,
                                // cu);
                            }
                        }
                    }

                    // final Optional<ZipFile> opt =
                    // getAttachedSourceArchive(root);
                    // if (opt.isPresent()) {
                    // RecommendersUtilsPlugin.log(StatusUtil.newStatus(IStatus.INFO,
                    // "Scanning zip "
                    // + opt.get().getName(), null));
                    // analyzeSourcesInZip(opt.get(), root, indexer, monitor);
                    // try {
                    // opt.get().close();
                    // } catch (final IOException e) {
                    // RecommendersUtilsPlugin.logError(e,
                    // "failed to close zip stream??");
                    // }
                    // }
                    addMarkerDocument(indexer, location);
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

    private static void analyzeClassFile(final CodeIndexer indexer, final IProgressMonitor monitor,
            final File location, final IClassFile cu) throws JavaModelException {
        if (monitor.isCanceled()) {
            return;
        }
        final String name = cu.getElementName();
        if (name.contains("$")) {
            return;
        }
        final String source = cu.getSource();
        final CompilationUnit ast = getAST(cu);
        if (ast != null) {
            monitor.subTask(location + "!"
                    + JavaElementLabels.getElementLabel(cu, JavaElementLabels.ALL_FULLY_QUALIFIED));
            indexer.add(ast);
        }
    }

    private static void deleteOldDocumentsForFile(final CodeIndexer indexer, final File location) throws IOException {
        // delete *all* old files for given resource
        indexer.delete(location);
    }

    private static void addMarkerDocument(final CodeIndexer indexer, final File location) throws IOException {
        final Document visited = new Document();
        CodeIndexer.addFieldToDocument(visited, Fields.RESOURCE_PATH, ResourcePathIndexer.getPath(location));
        CodeIndexer.addFieldToDocument(visited, Fields.TIMESTAMP, TimestampIndexer.getTimeString());
        indexer.addDocument(visited);
    }

    private static boolean isCurrent(final IPackageFragmentRoot root, final CodeIndexer indexer) {
        final File file = getFile(root);
        final long lastModified = file.lastModified();
        final long lastIndexed = indexer.lastIndexed(file);
        return lastModified < lastIndexed;
    }

    private static void analyzeSourcesInSourceFolder(final CodeIndexer indexer, final IProgressMonitor monitor,
            final IPackageFragmentRoot root) throws JavaModelException {
        for (final IJavaElement child : root.getChildren()) {
            final IPackageFragment fragment = cast(child);
            for (final ICompilationUnit cu : fragment.getCompilationUnits()) {
                if (monitor.isCanceled()) {
                    return;
                }
                monitor.subTask(getPath(cu));
                addOrUpdateCompilationUnitToIndex(cu, indexer);
            }
        }
    }

    private static void analyzeSourcesInZip(final ZipFile zipFile, final IPackageFragmentRoot root,
            final CodeIndexer indexer, final IProgressMonitor monitor) {
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
                cu.setProperty("location", getFile(root));
                cu.setProperty("project", javaProject);
                monitor.subTask(root.getPath() + "!" + next.getName());
                indexer.index(cu);
            }
        } catch (final Exception e) {
            RecommendersPlugin.logError(e, "error during indexing");
        }
    }

    private static Optional<ZipFile> getAttachedSourceArchive(final IPackageFragmentRoot root) {
        try {
            final IClasspathEntry cp = root.getResolvedClasspathEntry();
            final IPath path = cp.getSourceAttachmentPath();
            System.out.println("source path:" + path);
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

    public static void addOrUpdateCompilationUnitToIndex(final ITypeRoot cu, final CodeIndexer indexer) {
        try {
            if (!shouldIndex(cu, indexer)) {
                return;
            }
            final CompilationUnit ast = getAST(cu);
            if (ast != null) {
                indexer.delete(getFile(cu));
                indexer.index(ast);
            }
        } catch (final Exception e) {
            RecommendersPlugin.logError(e, "Error during code search indexing");
        }
    }

    public static boolean shouldIndex(final ITypeRoot cu, final CodeIndexer indexer) throws JavaModelException {
        final File file = getFile(cu);
        final long lastModified = file.lastModified();
        final long lastIndexed = indexer.lastIndexed(file);
        return lastIndexed < lastModified;
    }

}
