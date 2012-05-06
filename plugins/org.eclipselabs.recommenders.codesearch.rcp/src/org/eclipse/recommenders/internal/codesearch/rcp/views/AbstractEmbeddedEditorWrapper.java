package org.eclipse.recommenders.internal.codesearch.rcp.views;

import java.util.Set;

import org.eclipse.recommenders.codesearch.rcp.index.searcher.CodeSearcher;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.SearchResult;
import org.eclipse.recommenders.injection.InjectionService;
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

import com.google.common.collect.Lists;

@SuppressWarnings("restriction")
public abstract class AbstractEmbeddedEditorWrapper {

    protected EmbeddedEditorModelAccess partialEditor;
    protected EmbeddedEditor handle;
    protected Composite parent;
    protected Combo exampleCombo;
    protected CodeSearcher codeSearcher;
    protected ISearchView searchView;

    abstract void createQueryEditorInternal();

    public AbstractEmbeddedEditorWrapper() {
        codeSearcher = InjectionService.getInstance().requestInstance(CodeSearcher.class);
    }

    public void createQueryEditor(final Composite parent, final Combo exampleCombo, final ISearchView searchView) {
        this.parent = parent;
        this.searchView = searchView;

        exampleCombo.setItems(getExampleQueries());
        exampleCombo.select(0);

        if (parent.getChildren().length > 0) {
            parent.getChildren()[0].dispose();
        }

        createQueryEditorInternal();

        parent.getChildren()[0].addKeyListener(new KeyListener() {

            @Override
            public void keyPressed(final KeyEvent e) {
                if(((e.stateMask & SWT.CTRL) == SWT.CTRL) && (e.keyCode == '\r'))
                {
                	try {
						searchView.doSearch();
						e.doit = false;
					} catch (Exception e1) {
                      Activator.log(e1);
					}
                }
            }
            
			@Override
			public void keyReleased(KeyEvent e) {
			}
        });

        parent.layout();
        parent.getParent().layout();
    }

    abstract String[] getExampleQueriesInternal();

    private String[] getExampleQueries() {
        final String[] providedExamples = getExampleQueriesInternal();
        final String[] items = new String[providedExamples.length + 1];
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

    abstract SearchResult search() throws Exception;

    abstract IUnitOfWork<Set<String>, XtextResource> getSearchTermExtractor();

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
