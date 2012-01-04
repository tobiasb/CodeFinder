package org.eclipselabs.recommenders.codesearchquery.rcp.views;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.KeywordAnalyzer;
import org.apache.lucene.analysis.SimpleAnalyzer;
import org.apache.lucene.analysis.StopAnalyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.queryParser.MultiFieldQueryParser;
import org.apache.lucene.queryParser.ParseException;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopScoreDocCollector;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.SimpleFSDirectory;
import org.apache.lucene.util.StringHelper;
import org.apache.lucene.util.Version;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.osgi.service.environment.EnvironmentInfo;
import org.eclipse.recommenders.utils.names.IFieldName;
import org.eclipse.recommenders.utils.names.IMethodName;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.names.VmMethodName;
import org.eclipse.recommenders.utils.names.VmTypeName;
import org.eclipse.recommenders.utils.rcp.JavaElementResolver;
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
import org.eclipselabs.recommenders.codesearchquery.rcp.Activator;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;

import com.google.common.collect.Lists;

public class SearchQueryView extends ViewPart {
    public static final String ID = SearchQueryView.class.getName();
	protected Button triggerSearchButton;
	protected Text searchQueryText;
	protected Text searchResultText;
	private final String newLine = System.getProperty("line.separator");
	
	private IndexSearcher searcher = null;
	
	public SearchQueryView() {
		super();
	}
	
	@Override
	public void init(IViewSite site) throws PartInitException {
		super.init(site);
	}
	
	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new GridLayout(2, true));
				
		searchQueryText = new Text(parent, SWT.BORDER | SWT.MULTI);
		searchQueryText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.FILL_VERTICAL));
		
		searchResultText = new Text(parent, SWT.BORDER | SWT.MULTI);
//		searchResultText.setEnabled(false); // results: hence, readonly
		searchResultText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.FILL_VERTICAL));
		
		triggerSearchButton = new Button(parent, SWT.PUSH);
		triggerSearchButton.setText("Search");
		triggerSearchButton.setLayoutData(new GridData());
		triggerSearchButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				final List<ScoreDoc> result = Lists.newArrayList();
				
				//Search
		        final WorkspaceJob job = new WorkspaceJob("Searching...") {

					@Override
					public IStatus runInWorkspace(IProgressMonitor monitor)
							throws CoreException {

						setSearching();

						try {
							String path = Platform.getLocation().toString() + "/index.l";
							Directory index = new SimpleFSDirectory(new File(path));
	
							searcher = new IndexSearcher(index, true);

							Analyzer a = new KeywordAnalyzer();
							String searchQuery = getSearchQuery();
							Query q = new QueryParser(Version.LUCENE_29, Fields.FULLY_QUALIFIED_NAME, a).parse(searchQuery);
														
							TopScoreDocCollector collector = TopScoreDocCollector.create(
									10, true);
							searcher.search(q, collector);
							result.clear();

							System.out.println("Searching for: " + q.toString());
							
							for(ScoreDoc doc : collector.topDocs().scoreDocs) {
								result.add(doc);
							}
							
						} catch (CorruptIndexException e1) {
							e1.printStackTrace();
							return Status.CANCEL_STATUS;
						} catch (IOException e1) {
							e1.printStackTrace();
							return Status.CANCEL_STATUS;
						}catch (ParseException e) {
							e.printStackTrace();
							return Status.CANCEL_STATUS;
						}
						
		                return Status.OK_STATUS;
					}
		        
		        };
		        
		        job.addJobChangeListener(new JobChangeAdapter() {
		        	@Override
		        	public void done(IJobChangeEvent event) {
		        		setResult(result);
						try {
							searcher.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
		        	}
		        });
		        
		        job.schedule();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		
		parent.pack();
	}
	
	public String getSearchQuery() {
		final StringBuilder string = new StringBuilder();
		
		Display.getDefault().syncExec(new Runnable() {
			
            @Override
            public void run() {
        		string.append(searchQueryText.getText());
            }
        });
		
		return string.toString();
	}
	
	public void setSearching() {
		Display.getDefault().syncExec(new Runnable() {

            @Override
            public void run() {
        		searchQueryText.setEnabled(false);
        		searchResultText.setText("");
        		triggerSearchButton.setEnabled(false);
            }
        });
	}
	
	public void setResult(final List<ScoreDoc> result) {
		Display.getDefault().syncExec(new Runnable() {

            @Override
            public void run() {
        		searchQueryText.setEnabled(true);
        		
        		StringBuilder sb = new StringBuilder();
        		
        		for(ScoreDoc scoreDoc : result) {
					try {
						Document doc = searcher.doc(scoreDoc.doc);
						
						String docId = doc.get(Fields.FULLY_QUALIFIED_NAME);
						String docType = doc.get(Fields.TYPE);
						String declaringType = doc.get(Fields.DECLARING_TYPE);
						
						try {
							if(docType.equals(Fields.TYPE_CLASS)) {
								ITypeName typeName = VmTypeName.get(docId); 
								IType type = JavaElementResolver.INSTANCE.toJdtType(typeName);
	
			        			sb.append("Class: " + type.getFullyQualifiedName());
							} else if(docType.equals(Fields.TYPE_METHOD)) {
								IMethodName methodName = VmMethodName.get(docId);
								IMethod method = JavaElementResolver.INSTANCE.toJdtMethod(methodName);
	
			        			sb.append("Method in Class: " + method.getHandleIdentifier());
							} else if(docType.equals(Fields.TYPE_TRYCATCH) ||
									 docType.equals(Fields.TYPE_FIELD)) {
								ITypeName typeName = VmTypeName.get(declaringType); 
								IType type = JavaElementResolver.INSTANCE.toJdtType(typeName);
	
			        			sb.append(docType + " declared in Class: " + type.getFullyQualifiedName());
							}
						}
						catch(Exception ex) {
		        			sb.append("Unknown " + docType + ": " + docId);
						}
						
						sb.append(newLine);
					} catch (Exception e) {
						e.printStackTrace();
					}
        		}
        		
        		searchResultText.setText(sb.toString());
        		
        		triggerSearchButton.setEnabled(true);
            }
        });
	}
    
	@Override
	public void setFocus() {
		searchQueryText.setFocus();
	}

}
