package org.eclipselabs.recommenders.internal.codesearchquery.rcp.views;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.queryParser.ParseException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.builder.internal.Activator;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.CodeSearcherIndex;

import com.google.common.collect.Lists;

@SuppressWarnings("restriction")
public abstract class AbstractEmbeddedEditorWrapper {

    protected EmbeddedEditorModelAccess partialEditor;
    protected EmbeddedEditor handle;
    protected Composite parent;
    protected Combo exampleCombo;
    protected CodeSearcherIndex codeSearcher;

    abstract void createQueryEditorInternal();

    public void createQueryEditor(final Composite parent, final Combo exampleCombo, final ISearchView searchView) {
        this.parent = parent;

        exampleCombo.setItems(getExampleQueries());
        exampleCombo.select(0);

        if (parent.getChildren().length > 0) {
            parent.getChildren()[0].dispose();
        }

        createQueryEditorInternal();

        parent.getChildren()[0].addKeyListener(new KeyListener() {

            boolean ctrlPressed = false;

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.keyCode == SWT.CTRL)
                    ctrlPressed = false;
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.keyCode == SWT.CTRL)
                    ctrlPressed = true;

                if (e.character == '\r' && ctrlPressed) {
                    try {
                        searchView.doSearch();
                    } catch (Exception e1) {
                        Activator.log(e1);
                    }
                }
            }
        });

        parent.layout();
        parent.getParent().layout();
    }

    abstract String[] getExampleQueriesInternal();

    private String[] getExampleQueries() {
        String[] providedExamples = getExampleQueriesInternal();
        String[] items = new String[providedExamples.length + 1];
        return Lists.asList("Select Example Query...", providedExamples).toArray(items);
    }

    protected void resetXtextQuery() {
        Display.getDefault().syncExec(new Runnable() {

            @Override
            public void run() {
                // TODO refactor: there should be a better way
                // When we convert from dot- to L/-notation we actually modify
                // the model. The next stmt is to undo that
                handle.getDocument().set(handle.getDocument().get().trim());
            }
        });
    }

    abstract List<Document> search() throws ParseException, CorruptIndexException, IOException;

    abstract IUnitOfWork<Set<String>, XtextResource> getSEarchTermExtractor();

    public String getSearchQuery() {
        final StringBuilder string = new StringBuilder();

        Display.getDefault().syncExec(new Runnable() {

            @Override
            public void run() {
                // string.append(searchQueryText.getText());
                string.append(partialEditor.getSerializedModel());
            }
        });

        return string.toString();
    }

    public void setSearchQuery(final String q) {

        Display.getDefault().syncExec(new Runnable() {

            @Override
            public void run() {
                handle.getDocument().set(q);
            }
        });
    }

    public XtextDocument getDocument() {
        return handle.getDocument();
    }
}