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
package org.eclipse.recommenders.codesearch.rcp.index.extdoc;

import static java.lang.String.format;

import java.util.List;

import org.apache.lucene.document.Document;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.TopDocs;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.rcp.RecommendersPlugin;
import org.eclipse.recommenders.utils.Names;
import org.eclipse.recommenders.utils.Tuple;
import org.eclipse.recommenders.utils.names.VmMethodName;
import org.eclipse.recommenders.utils.rcp.JavaElementResolver;
import org.eclipse.recommenders.utils.rcp.RCPUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import com.google.common.base.Optional;

public final class Renderer implements Runnable {

    private final JavaElementResolver jdtResolver;

    private final Tuple<TopDocs, IndexSearcher> searchResults;
    private final Composite parent;
    private final String typeName;
    private final String searchDuration;
    private final List<String> searchterms;

    public Renderer(final Tuple<TopDocs, IndexSearcher> searchResults, final Composite parent, final String typeName,
            final String searchDuration, final JavaElementResolver jdtResolver, final List<String> searchterms) {
        this.searchResults = searchResults;
        this.parent = parent;
        this.typeName = typeName;
        this.searchDuration = searchDuration;
        this.jdtResolver = jdtResolver;
        this.searchterms = searchterms;
    }

    @Override
    public void run() {
        final Composite container = new Composite(parent, SWT.NONE);
        container.setLayout(new GridLayout());
        container.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
        final Label l = new Label(container, SWT.NONE);
        final String msg = format("found %s examples for type '%s'. Search took %s.",
                searchResults.getFirst().totalHits, Names.vm2srcSimpleTypeName(typeName), searchDuration);
        l.setText(msg);

        final TableViewer v = new TableViewer(container, SWT.VIRTUAL);
        v.setLabelProvider(new LabelProvider(jdtResolver, searchterms, searchResults));
        v.setContentProvider(new ContentProvider(searchResults, jdtResolver));
        // v.setUseHashlookup(true);
        v.setInput(searchResults);
        // v.getTable().setLinesVisible(true);
        v.setItemCount(searchResults.getFirst().scoreDocs.length);
        v.getControl().setLayoutData(GridDataFactory.fillDefaults().hint(300, 200).grab(true, false).create());
        v.addDoubleClickListener(new IDoubleClickListener() {

            @Override
            public void doubleClick(final DoubleClickEvent event) {
                final Optional<Document> doc = RCPUtils.first(event.getSelection());
                if (doc.isPresent()) {
                    final String string = doc.get().get(Fields.DECLARING_METHOD);
                    if (string == null) {
                        MessageDialog.openError(new Shell(), "Indexing error.",
                                "declaring method for document is null: " + doc);
                        return;
                    }
                    final VmMethodName recMethod = VmMethodName.get(string);
                    final Optional<IMethod> jdtMethod = jdtResolver.toJdtMethod(recMethod);
                    if (jdtMethod.isPresent()) {
                        try {
                            JavaUI.openInEditor(jdtMethod.get());
                        } catch (final Exception e) {
                            RecommendersPlugin.logError(e, "Failed to open method declaration in editor");
                        }
                    }
                }

            }
        });
    }
}