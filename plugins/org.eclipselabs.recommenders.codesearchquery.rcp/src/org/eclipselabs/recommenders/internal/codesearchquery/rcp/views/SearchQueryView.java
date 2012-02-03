package org.eclipselabs.recommenders.internal.codesearchquery.rcp.views;

import static java.util.Collections.emptyList;
import static org.eclipse.jdt.ui.JavaElementLabelProvider.SHOW_OVERLAY_ICONS;
import static org.eclipse.jdt.ui.JavaElementLabelProvider.SHOW_PARAMETERS;
import static org.eclipse.jdt.ui.JavaElementLabelProvider.SHOW_POST_QUALIFIED;
import static org.eclipse.recommenders.utils.Checks.cast;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.lucene.document.Document;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.internal.ui.javaeditor.EditorUtility;
import org.eclipse.jdt.internal.ui.javaeditor.JavaEditor;
import org.eclipse.jdt.ui.JavaElementLabelProvider;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jdt.ui.SharedASTProvider;
import org.eclipse.jface.text.ITextPresentationListener;
import org.eclipse.jface.text.TextPresentation;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.recommenders.utils.annotations.Experimental;
import org.eclipse.recommenders.utils.names.IMethodName;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.names.VmMethodName;
import org.eclipse.recommenders.utils.names.VmTypeName;
import org.eclipse.recommenders.utils.rcp.JavaElementResolver;
import org.eclipse.recommenders.utils.rcp.RCPUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;
import org.eclipselabs.recommenders.internal.codesearchquery.rcp.Activator;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;

@SuppressWarnings("restriction")
public class SearchQueryView extends ViewPart implements ISearchView {
    public static final String ID = SearchQueryView.class.getName();
    protected Button triggerSearchButton;
    protected Text searchQueryText;
    protected TableViewer searchResultTable;
    private Combo exampleCombo;
    final List<Document> result = Lists.newArrayList();

    private int selectedLanguageIndex = 0;
    private AbstractEmbeddedEditorWrapper currentEditor = null;

    public SearchQueryView() {
        super();
    }

    @Override
    public void init(final IViewSite site) throws PartInitException {
        super.init(site);
    }

    @Override
    public void createPartControl(final Composite parent) {
        parent.setLayout(new GridLayout(2, true));

        Composite compositeForEditor = createCompositeForEditor(parent);

        createSearchResultsViewer(parent);
        createTriggerSearchButton(parent);

        createSearchExampleCombobox(parent);

        // Default editor
        currentEditor = new LuceneQueryEditorWrapper();
        currentEditor.createQueryEditor(compositeForEditor, exampleCombo, this);

        createLanguageSelectionComboBox(parent, compositeForEditor);

        parent.pack();
    }

    private Composite createCompositeForEditor(final Composite parent) {
        Composite compositeForEditor = new Composite(parent, SWT.NONE);

        GridLayout layout = new GridLayout(1, true);
        layout.marginWidth = 0;
        layout.marginHeight = 0;

        compositeForEditor.setLayout(layout);

        GridData gridData = new GridData(GridData.FILL_BOTH);
        compositeForEditor.setLayoutData(gridData);

        return compositeForEditor;
    }

    private void createSearchExampleCombobox(final Composite parent) {
        exampleCombo = new Combo(parent, SWT.READ_ONLY);
        GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
        gridData.horizontalSpan = 1;

        exampleCombo.setLayoutData(gridData);
        exampleCombo.addSelectionListener(new SelectionListener() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                if (exampleCombo.getSelectionIndex() > 0) {
                    currentEditor.setSearchQuery(exampleCombo.getItems()[exampleCombo.getSelectionIndex()]);
                    exampleCombo.select(0);
                }
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
            }
        });
    }

    private void createLanguageSelectionComboBox(final Composite parent, final Composite createEmbeddedEditorInComposite) {
        final Combo combo = new Combo(parent, SWT.READ_ONLY);
        GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
        gridData.horizontalSpan = 1;

        combo.setItems(new String[] { LuceneQueryEditorWrapper.getName(), QL1EditorWrapper.getName() });
        combo.setLayoutData(gridData);
        combo.select(selectedLanguageIndex);
        combo.addSelectionListener(new SelectionListener() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                selectedLanguageIndex = combo.getSelectionIndex();

                if (selectedLanguageIndex == 0) {
                    currentEditor = new LuceneQueryEditorWrapper();
                    currentEditor
                            .createQueryEditor(createEmbeddedEditorInComposite, exampleCombo, SearchQueryView.this);
                } else if (selectedLanguageIndex == 1) {
                    currentEditor = new QL1EditorWrapper();
                    currentEditor
                            .createQueryEditor(createEmbeddedEditorInComposite, exampleCombo, SearchQueryView.this);
                }
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
            }
        });
    }

    private void createTriggerSearchButton(final Composite parent) {
        triggerSearchButton = new Button(parent, SWT.PUSH);
        triggerSearchButton.setText("Search");
        GridData gridData = new GridData();
        gridData.horizontalSpan = 2;
        triggerSearchButton.setLayoutData(gridData);
        triggerSearchButton.addSelectionListener(new SelectionListener() {

            @Override
            public void widgetSelected(final SelectionEvent e) {
                try {
                    doSearch();
                } catch (Exception e1) {
                    Activator.logError(e1);
                }
            }

            @Override
            public void widgetDefaultSelected(final SelectionEvent e) {
            }
        });
    }

    private void createSearchResultsViewer(final Composite parent) {
        searchResultTable = new TableViewer(parent);
        searchResultTable.setContentProvider(new ArrayContentProvider());
        searchResultTable.setLabelProvider(new JavaElementLabelProvider(SHOW_OVERLAY_ICONS | SHOW_POST_QUALIFIED
                | SHOW_PARAMETERS));
        GridData gridData = new GridData(GridData.FILL_HORIZONTAL | GridData.FILL_VERTICAL);
        gridData.horizontalSpan = 1;
        searchResultTable.getControl().setLayoutData(gridData);
        searchResultTable.addDoubleClickListener(new IDoubleClickListener() {

            @Override
            @Experimental
            public void doubleClick(final DoubleClickEvent event) {

                final Optional<IJavaElement> first = RCPUtils.first(event.getSelection());
                if (first.isPresent()) {
                    try {
                        final JavaEditor editor = cast(JavaUI.openInEditor(first.get()));
                        final SourceViewer s = (SourceViewer) editor.getViewer();
                        final XtextDocument document = currentEditor.getDocument();

                        IUnitOfWork<Set<String>, XtextResource> searchTermExtractor = currentEditor
                                .getSEarchTermExtractor();

                        if (searchTermExtractor != null) {
                            final Set<String> searchTerms = document.readOnly(searchTermExtractor);

                            s.addTextPresentationListener(new ITextPresentationListener() {

                                @Override
                                public void applyTextPresentation(final TextPresentation textPresentation) {
                                    final ICompilationUnit cu = (ICompilationUnit) EditorUtility
                                            .getActiveEditorJavaInput();
                                    final Color foreground = JavaUI.getColorManager().getColor(new RGB(255, 0, 0));
                                    // final Color white =
                                    // JavaUI.getColorManager().getColor(new
                                    // RGB(255, 255, 255));
                                    final Color background = JavaUI.getColorManager().getColor(new RGB(255, 255, 128));
                                    final Color heuristic = JavaUI.getColorManager().getColor(new RGB(220, 245, 139));
                                    SharedASTProvider.getAST(cu, SharedASTProvider.WAIT_YES, null).accept(
                                            new ASTVisitor() {
                                                @Override
                                                public boolean visit(final SimpleName node) {
                                                    final String word = node.getIdentifier().toLowerCase();
                                                    for (final String searchterm : searchTerms) {
                                                        final Color gray = Display.getDefault().getSystemColor(
                                                                SWT.COLOR_GRAY);
                                                        if (word.equals(searchterm)) {
                                                            setHighlightStyleForNode(textPresentation, foreground,
                                                                    background, node);
                                                        } else if (word.contains(searchterm)) {
                                                            setHighlightStyleForNode(textPresentation, heuristic, gray,
                                                                    node);
                                                        }

                                                    }
                                                    return true;
                                                }

                                                private void setHighlightStyleForNode(
                                                        final TextPresentation textPresentation,
                                                        final Color foreground, final Color background,
                                                        final ASTNode node) {
                                                    final int start = node.getStartPosition();
                                                    final int length = node.getLength();
                                                    calculateRanges(textPresentation, start, length, foreground,
                                                            background);
                                                }

                                                @SuppressWarnings("unchecked")
                                                private void calculateRanges(final TextPresentation textPresentation,
                                                        final int start, final int length, final Color foreground,
                                                        final Color background) {
                                                    final Iterator<StyleRange> srIterator = textPresentation
                                                            .getAllStyleRangeIterator();
                                                    while (srIterator.hasNext()) {
                                                        final StyleRange current = srIterator.next();
                                                        if (current.start > start
                                                                && current.start + current.length > start + length
                                                                && current.start < start + length) {
                                                            textPresentation.mergeStyleRange(new StyleRange(
                                                                    current.start, start + length - current.start,
                                                                    foreground, background));
                                                        } else if (current.start >= start
                                                                && current.start + current.length <= start + length) {
                                                            current.background = background;
                                                            current.foreground = foreground;
                                                        } else if (current.start < start
                                                                && current.start + current.length > start + length) {
                                                            textPresentation.mergeStyleRange(new StyleRange(start,
                                                                    length, foreground, background));
                                                        } else if (current.start < start
                                                                && current.length + current.start < start + length
                                                                && current.start + current.length > start) {
                                                            textPresentation.mergeStyleRange(new StyleRange(start,
                                                                    start + length - current.start + current.length,
                                                                    foreground, background));
                                                        }
                                                    }
                                                };
                                            });

                                }
                            });
                            s.invalidateTextPresentation();
                        }

                    } catch (final PartInitException e) {
                        Activator.logError(e);
                    } catch (final JavaModelException e) {
                        Activator.logError(e);
                    }
                }

            }
        });
    }

    public void setSearching() {
        Display.getDefault().syncExec(new Runnable() {

            @Override
            public void run() {
                // searchQueryText.setEnabled(false);
                searchResultTable.setInput(emptyList());
                triggerSearchButton.setEnabled(false);
            }
        });
    }

    public void setResult(final List<Document> result) {
        Display.getDefault().syncExec(new Runnable() {

            @Override
            public void run() {
                // searchQueryText.setEnabled(true);

                triggerSearchButton.setEnabled(true);

                final List<IJavaElement> newInput = Lists.newArrayList();

                for (final Document doc : result) {
                    try {
                        final String docId = doc.get(Fields.FULLY_QUALIFIED_NAME);
                        final String docType = doc.get(Fields.TYPE);
                        final String declaringType = doc.get(Fields.DECLARING_TYPE);

                        try {
                            if (docType.equals(Fields.TYPE_CLASS)) {
                                final ITypeName typeName = VmTypeName.get(docId);
                                final IType type = JavaElementResolver.INSTANCE.toJdtType(typeName);
                                addIfNotNull(newInput, type);
                            } else if (docType.equals(Fields.TYPE_METHOD)) {
                                final IMethodName methodName = VmMethodName.get(docId);
                                final IMethod method = JavaElementResolver.INSTANCE.toJdtMethod(methodName);
                                addIfNotNull(newInput, method);
                            } else if (docType.equals(Fields.TYPE_TRYCATCH) || docType.equals(Fields.TYPE_FIELD)) {
                                final ITypeName typeName = VmTypeName.get(declaringType);
                                final IType type = JavaElementResolver.INSTANCE.toJdtType(typeName);
                                addIfNotNull(newInput, type);
                            }
                        } catch (final Exception ex) {
                        }

                    } catch (final Exception e) {
                        e.printStackTrace();
                    }
                }

                searchResultTable.setInput(newInput);
            }

            private <T> void addIfNotNull(final List<T> list, final T element) {
                if (element != null) {
                    list.add(element);
                    // Elements are null if the workspace isn't built and
                    // the java elements couldn't be resolved
                }
            }
        });
    }

    @Override
    public void setFocus() {
        // searchQueryText.setFocus();
    }

    @Override
    public void doSearch() throws Exception {
        Display.getDefault().syncExec(new Runnable() {

            @Override
            public void run() {
                // Search
                final WorkspaceJob job = new WorkspaceJob("Searching...") {

                    @Override
                    public IStatus runInWorkspace(final IProgressMonitor monitor) throws CoreException {

                        setSearching();

                        try {
                            result.clear();

                            if (currentEditor != null) {
                                result.addAll(currentEditor.search());
                            }
                        } catch (final Exception e) {
                            Activator.logError(e);
                            return Status.CANCEL_STATUS;
                        }

                        return Status.OK_STATUS;
                    }
                };

                job.addJobChangeListener(new JobChangeAdapter() {
                    @Override
                    public void done(final IJobChangeEvent event) {
                        setResult(result);
                    }
                });

                job.schedule();
            }
        });

    }

    @Override
    public void setSearchEnabled(boolean value) {
        triggerSearchButton.setEnabled(value);
    }

}
