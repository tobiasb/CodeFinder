package org.eclipselabs.recommenders.internal.codesearchquery.rcp.views;

import static java.util.Collections.emptyList;
import static org.eclipse.jdt.ui.JavaElementLabelProvider.SHOW_OVERLAY_ICONS;
import static org.eclipse.jdt.ui.JavaElementLabelProvider.SHOW_PARAMETERS;
import static org.eclipse.jdt.ui.JavaElementLabelProvider.SHOW_POST_QUALIFIED;
import static org.eclipse.recommenders.utils.Checks.cast;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.queryParser.ParseException;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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
import org.eclipse.recommenders.injection.InjectionService;
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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.LuceneQueryStandaloneSetup;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ClauseExpression;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Expression;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.contentassist.LuceneQueryProposalProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.contentassist.QueryProposalType;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.internal.LuceneQueryActivator;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.CodeSearcherIndex;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.DocumentTypeProposalProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.GenericQueryProposalProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.ModifierQueryProposalProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.QueryExtractor;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.DotNotationTypeConverter;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.DotNotationMethodConverter;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.PathValueConverter;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.utils.MethodImageProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.utils.ProjectImageProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.utils.TypeImageProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.termvector.JavaMethodProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.termvector.JavaTypeProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.termvector.ProjectNameProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.termvector.ResourcePathProvider;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.inject.Injector;

public class SearchQueryView extends ViewPart {
    public static final String ID = SearchQueryView.class.getName();
    protected Button triggerSearchButton;
    protected Text searchQueryText;
    protected TableViewer searchResultTable;
    private CodeSearcherIndex codeSearcher;

    private EmbeddedEditorModelAccess partialEditor;
    private EmbeddedEditor handle;

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

        createSearchQueryViewerXtext(parent);

        createSearchResultsViewer(parent);
        createTriggerSearchButton(parent);

        parent.pack();
    }

    @SuppressWarnings("restriction")
    private void createSearchQueryViewerXtext(final Composite parent) {

        LuceneQueryProposalProvider.addQueryProposalProvider(QueryProposalType.TYPE, new GenericQueryProposalProvider(
                new JavaTypeProvider(), new DotNotationTypeConverter(), new TypeImageProvider()));

        LuceneQueryProposalProvider.addQueryProposalProvider(QueryProposalType.METHOD,
                new GenericQueryProposalProvider(new JavaMethodProvider(), new DotNotationMethodConverter(),
                        new MethodImageProvider()));

        LuceneQueryProposalProvider.addQueryProposalProvider(QueryProposalType.FILE_PATH,
                new GenericQueryProposalProvider(new ResourcePathProvider(), new PathValueConverter()));

        LuceneQueryProposalProvider.addQueryProposalProvider(QueryProposalType.PROJECT_NAME,
                new GenericQueryProposalProvider(new ProjectNameProvider(), null, new ProjectImageProvider()));

        LuceneQueryProposalProvider.addQueryProposalProvider(QueryProposalType.MODIFIER,
                new ModifierQueryProposalProvider());

        LuceneQueryProposalProvider.addQueryProposalProvider(QueryProposalType.DOCUMENT_TYPE,
                new DocumentTypeProposalProvider());

        final IEditedResourceProvider resourceProvider = new IEditedResourceProvider() {

            @Override
            public XtextResource createResource() {
                try {
                    LuceneQueryStandaloneSetup.doSetup();
                    final ResourceSet resourceSet = new ResourceSetImpl();
                    final Resource resource = resourceSet.createResource(URI.createURI("embedded.lucenequery"));

                    return (XtextResource) resource;
                } catch (final Exception e) {
                    return null; // What to return, how to create a resource?
                }
            }
        };

        final LuceneQueryActivator activator = LuceneQueryActivator.getInstance();
        final Injector injector = activator
                .getInjector(LuceneQueryActivator.ORG_ECLIPSELABS_RECOMMENDERS_CODESEARCHQUERY_RCP_DSL_LUCENEQUERY);
        final EmbeddedEditorFactory factory = injector.getInstance(EmbeddedEditorFactory.class);
        handle = factory.newEditor(resourceProvider).withParent(parent);

        // keep the partialEditor as instance var to read / write the edited
        // text
        partialEditor = handle.createPartialEditor(true);
        // handle.getViewer().addTextInputListener(new ITextInputListener() {
        //
        // @Override
        // public void inputDocumentChanged(final IDocument oldInput, final
        // IDocument newInput) {
        // }
        //
        // @Override
        // public void inputDocumentAboutToBeChanged(final IDocument oldInput,
        // final IDocument newInput) {
        // // no constraints...
        // }
        // });

        handle.getDocument().set("UsedTypes:java.util.List");
    }

    private void createTriggerSearchButton(final Composite parent) {
        triggerSearchButton = new Button(parent, SWT.PUSH);
        triggerSearchButton.setText("Search");
        triggerSearchButton.setLayoutData(new GridData());
        triggerSearchButton.addSelectionListener(new SelectionListener() {

            @Override
            public void widgetSelected(final SelectionEvent e) {

                final List<Document> result = Lists.newArrayList();

                // Search
                final WorkspaceJob job = new WorkspaceJob("Searching...") {

                    @SuppressWarnings("restriction")
                    @Override
                    public IStatus runInWorkspace(final IProgressMonitor monitor) throws CoreException {

                        setSearching();

                        try {
                            result.clear();

                            final String searchQuery = handle.getDocument().readOnly(new QueryExtractor());
                            resetXtextQuery();

                            codeSearcher = InjectionService.getInstance().requestInstance(CodeSearcherIndex.class);

                            result.addAll(codeSearcher.search(searchQuery));
                        } catch (final CorruptIndexException e1) {
                            e1.printStackTrace();
                            return Status.CANCEL_STATUS;
                        } catch (final IOException e1) {
                            e1.printStackTrace();
                            return Status.CANCEL_STATUS;
                        } catch (final ParseException e) {
                            e.printStackTrace();
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

            @Override
            public void widgetDefaultSelected(final SelectionEvent e) {
            }
        });
    }

    private void resetXtextQuery() {
        Display.getDefault().syncExec(new Runnable() {

            @Override
            public void run() {
                // TODO refactor: there should be a better way
                // When we convert from dot- to L/-notation we actually modify
                // the model. The next stmt is to undo that
                handle.getDocument().set(handle.getDocument().get());
            }
        });
    }

    private void createSearchResultsViewer(final Composite parent) {
        searchResultTable = new TableViewer(parent);
        searchResultTable.setContentProvider(new ArrayContentProvider());
        searchResultTable.setLabelProvider(new JavaElementLabelProvider(SHOW_OVERLAY_ICONS | SHOW_POST_QUALIFIED
                | SHOW_PARAMETERS));
        searchResultTable.getControl().setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.FILL_VERTICAL));
        searchResultTable.addDoubleClickListener(new IDoubleClickListener() {

            @Override
            @Experimental
            public void doubleClick(final DoubleClickEvent event) {

                final Optional<IJavaElement> first = RCPUtils.first(event.getSelection());
                if (first.isPresent()) {
                    try {
                        final JavaEditor editor = cast(JavaUI.openInEditor(first.get()));
                        final SourceViewer s = (SourceViewer) editor.getViewer();
                        final XtextDocument document = handle.getDocument();
                        final Set<String> searchTerms = document
                                .readOnly(new IUnitOfWork<Set<String>, XtextResource>() {

                                    @Override
                                    public Set<String> exec(final XtextResource state) throws Exception {
                                        final IParseResult parse = state.getParseResult();
                                        final EObject rootASTElement = parse.getRootASTElement();
                                        // TODO Auto-generated method stub
                                        final Expression luceneQuery = (Expression) rootASTElement;
                                        final ClauseExpression value2 = luceneQuery.getValue();
                                        final EObject field = value2.getField();

                                        final String _default = value2.getDefault();
                                        final Set<String> res = Sets.newHashSet();
                                        if (_default != null) {
                                            res.add(_default.replaceAll("\\W", "").toLowerCase());
                                        }
                                        for (final String v : value2.getValues()) {
                                            final String lowerCase = v.toLowerCase();
                                            final String[] segments = lowerCase.split("\\W");
                                            for (final String term : segments) {
                                                if (term.isEmpty()) {
                                                    continue;
                                                }
                                                res.add(term);
                                            }
                                        }
                                        return res;
                                    }
                                });

                        s.addTextPresentationListener(new ITextPresentationListener() {

                            @Override
                            public void applyTextPresentation(final TextPresentation textPresentation) {
                                final ICompilationUnit cu = (ICompilationUnit) EditorUtility.getActiveEditorJavaInput();
                                final Color foreground = JavaUI.getColorManager().getColor(new RGB(255, 0, 0));
                                final Color white = JavaUI.getColorManager().getColor(new RGB(255, 255, 255));
                                final Color background = JavaUI.getColorManager().getColor(new RGB(255, 255, 128));
                                final Color heuristic = JavaUI.getColorManager().getColor(new RGB(220, 245, 139));
                                SharedASTProvider.getAST(cu, SharedASTProvider.WAIT_YES, null).accept(new ASTVisitor() {
                                    @Override
                                    public boolean visit(final SimpleName node) {
                                        final String word = node.getIdentifier().toLowerCase();
                                        for (final String searchterm : searchTerms) {
                                            final Color gray = Display.getDefault().getSystemColor(SWT.COLOR_GRAY);
                                            if (word.equals(searchterm)) {
                                                setHighlightStyleForNode(textPresentation, foreground, background, node);
                                            } else if (word.contains(searchterm)) {
                                                setHighlightStyleForNode(textPresentation, heuristic, gray, node);
                                            }

                                        }
                                        return true;
                                    }

                                    private void setHighlightStyleForNode(final TextPresentation textPresentation,
                                            final Color foreground, final Color background, final ASTNode node) {
                                        final int start = node.getStartPosition();
                                        final int length = node.getLength();
                                        calculateRanges(textPresentation, start, length, foreground, background);
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
                                                textPresentation.mergeStyleRange(new StyleRange(current.start, start
                                                        + length - current.start, foreground, background));
                                            } else if (current.start >= start
                                                    && current.start + current.length <= start + length) {
                                                current.background = background;
                                                current.foreground = foreground;
                                            } else if (current.start < start
                                                    && current.start + current.length > start + length) {
                                                textPresentation.mergeStyleRange(new StyleRange(start, length,
                                                        foreground, background));
                                            } else if (current.start < start
                                                    && current.length + current.start < start + length
                                                    && current.start + current.length > start) {
                                                textPresentation.mergeStyleRange(new StyleRange(start, start + length
                                                        - current.start + current.length, foreground, background));
                                            }
                                        }
                                    };
                                });

                            }
                        });
                        s.invalidateTextPresentation();

                    } catch (final PartInitException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (final JavaModelException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

            }
        });
    }

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
                    // TODO: Elements are null if the workspace isn't built and
                    // the java elements couldn't be resolved
                }
            }
        });
    }

    @Override
    public void setFocus() {
        // searchQueryText.setFocus();
    }

}
