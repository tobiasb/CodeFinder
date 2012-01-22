package org.eclipselabs.recommenders.internal.codesearchquery.rcp.views;

import static java.util.Collections.emptyList;
import static org.eclipse.jdt.ui.JavaElementLabelProvider.SHOW_OVERLAY_ICONS;
import static org.eclipse.jdt.ui.JavaElementLabelProvider.SHOW_PARAMETERS;
import static org.eclipse.jdt.ui.JavaElementLabelProvider.SHOW_POST_QUALIFIED;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.queryParser.ParseException;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.SimpleFSDirectory;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.ui.JavaElementLabelProvider;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextInputListener;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.recommenders.utils.names.IMethodName;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.names.VmMethodName;
import org.eclipse.recommenders.utils.names.VmTypeName;
import org.eclipse.recommenders.utils.rcp.JavaElementResolver;
import org.eclipse.recommenders.utils.rcp.RCPUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.LuceneQueryStandaloneSetup;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.internal.LuceneQueryActivator;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.CodeSearcherIndex;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.google.inject.Injector;

public class SearchQueryView extends ViewPart {
    public static final String ID = SearchQueryView.class.getName();
    protected Button triggerSearchButton;
    protected Text searchQueryText;
    protected TableViewer searchResultTable;
    private CodeSearcherIndex codeSearcher;

    private EmbeddedEditorModelAccess partialEditor;
    
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

        //createSearchQueryViewer(parent);
        createSearchQueryViewerXtext(parent);

        createSearchResultsViewer(parent);
        createTriggerSearchButton(parent);
        
        parent.pack();
    }

	private void createSearchQueryViewerXtext(Composite parent) {
        IEditedResourceProvider resourceProvider = new IEditedResourceProvider() {

            @Override
            public XtextResource createResource() {
                try {
                    LuceneQueryStandaloneSetup.doSetup();
                    ResourceSet resourceSet = new ResourceSetImpl();
                    Resource resource = resourceSet.createResource(URI.createURI("embedded.lucenequery"));

                    // ByteArrayInputStream bais = new ByteArrayInputStream("Hello Xtext!".getBytes());
                    // resource.load(bais, null);
                    // Model model = (Model) resource.getContents().get(0);

                    return (XtextResource) resource;
                } catch (Exception e) {
                    return null; // What to return, how to create a resource?
                }
            }
        };
        
        LuceneQueryActivator activator = LuceneQueryActivator.getInstance();
        Injector injector = activator
                .getInjector(LuceneQueryActivator.ORG_ECLIPSELABS_RECOMMENDERS_CODESEARCHQUERY_RCP_DSL_LUCENEQUERY);
        EmbeddedEditorFactory factory = injector.getInstance(EmbeddedEditorFactory.class);
        org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor handle = factory.newEditor(resourceProvider).withParent(
                parent);
        
//        handle.getDocument().r).readOnly(new IUnitOfWork<T, XtextResource>() {@Override
//        public T exec(XtextResource state) throws Exception {
//        	// TODO Auto-generated method stub
//        	return null;
//        }});
        
        // keep the partialEditor as instance var to read / write the edited text
        partialEditor = handle.createPartialEditor(true);
        handle.getViewer().addTextInputListener(new ITextInputListener() {

            @Override
            public void inputDocumentChanged(final IDocument oldInput, final IDocument newInput) {
                System.out.println(partialEditor.getSerializedModel());
            }

            @Override
            public void inputDocumentAboutToBeChanged(final IDocument oldInput, final IDocument newInput) {
                // no constraints...
            }
        });
        
//        EcoreUtil.getAllProperContents(handle.getDocument(), false);
	}

	private void createSearchQueryViewer(final Composite parent) {
		searchQueryText = new Text(parent, SWT.BORDER | SWT.MULTI);
        searchQueryText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.FILL_VERTICAL));
        searchQueryText.setText(Fields.USED_TYPES + ":Ljava/util/*");
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

                    @Override
                    public IStatus runInWorkspace(final IProgressMonitor monitor) throws CoreException {

                        setSearching();

                        try {
                            result.clear();
                            
                            final String path = Platform.getLocation().toString() + "/index.l";
                            final Directory index = new SimpleFSDirectory(new File(path));

                            if(!new File(path).exists()) {
                            	System.out.println("Index doesn't exist at " + path);
                            	return Status.CANCEL_STATUS;
                            }
                            
//                            DotNotationConverter conv = new DotNotationConverter();
//                            final String searchQuery = Fields.USED_TYPES + ":\"" + conv.convert(getSearchQuery()) + "\"";
                            final String searchQuery = getSearchQuery();

                            codeSearcher = new CodeSearcherIndex(index);
                            
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

    private void createSearchResultsViewer(final Composite parent) {
        searchResultTable = new TableViewer(parent);
        searchResultTable.setContentProvider(new ArrayContentProvider());
        searchResultTable.setLabelProvider(new JavaElementLabelProvider(SHOW_OVERLAY_ICONS | SHOW_POST_QUALIFIED
                | SHOW_PARAMETERS));
        searchResultTable.getControl().setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.FILL_VERTICAL));
        searchResultTable.addDoubleClickListener(new IDoubleClickListener() {

            @Override
            public void doubleClick(final DoubleClickEvent event) {
                final Optional<IJavaElement> first = RCPUtils.first(event.getSelection());
                if (first.isPresent()) {
                    try {
                        JavaUI.openInEditor(first.get());
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
//                string.append(searchQueryText.getText());
            	string.append(partialEditor.getSerializedModel());
            }
        });

        return string.toString();
    }

    public void setSearching() {
        Display.getDefault().syncExec(new Runnable() {

            @Override
            public void run() {
                //searchQueryText.setEnabled(false);
                searchResultTable.setInput(emptyList());
                triggerSearchButton.setEnabled(false);
            }
        });
    }

    public void setResult(final List<Document> result) {
        Display.getDefault().syncExec(new Runnable() {

            @Override
            public void run() {
                //searchQueryText.setEnabled(true);
            	
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
                            } 
                            else if (docType.equals(Fields.TYPE_METHOD)) {
                                final IMethodName methodName = VmMethodName.get(docId);
                                final IMethod method = JavaElementResolver.INSTANCE.toJdtMethod(methodName);
                                addIfNotNull(newInput, method);
                            } 
                            else if (docType.equals(Fields.TYPE_TRYCATCH) || docType.equals(Fields.TYPE_FIELD)) {
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
            
            private <T>void addIfNotNull(List<T> list, T element) {
            	if(element != null)
            		list.add(element);
            	//TODO: Elements are null if the workspace isn't built and the java elements couldn't be resolved
            }
        });
    }

    @Override
    public void setFocus() {
        //searchQueryText.setFocus();
    }

}
