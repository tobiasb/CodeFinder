package org.eclipselabs.recommenders.codesearchquery.rcp.popup.actions;

import java.io.File;
import java.util.List;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.store.SimpleFSDirectory;
import org.apache.lucene.util.Version;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipselabs.recommenders.codesearchquery.rcp.Activator;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.LuceneIndex;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.visitor.CompilationUnitVisitor;

import com.google.common.collect.Lists;

public class IndexAction implements IObjectActionDelegate {

    //private Shell shell;
    private List<IProject> projects = null;

    /**
     * Constructor for Action1.
     */
    public IndexAction() {
        super();
    }

    /**
     * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
     */
    @Override
    public void setActivePart(IAction action, IWorkbenchPart targetPart) {
        //shell = targetPart.getSite().getShell();
    }

    /**
     * @see IActionDelegate#run(IAction)
     */
    @Override
    public void run(IAction action) {
    	try {
	        final Long start = System.currentTimeMillis();
//	        final LuceneIndex index = Activator.injector.getInstance(LuceneIndex.class);
	        String path = Platform.getLocation().toString() + "/index.l";
	        final LuceneIndex index = new LuceneIndex(new SimpleFSDirectory(new File(path)), new StandardAnalyzer(Version.LUCENE_29));
	                
	        final WorkspaceJob job = new WorkspaceJob("Indexing sources...") {
	            
	            @Override
	            public IStatus runInWorkspace(final IProgressMonitor monitor) throws CoreException {
	   
	                try {
	                    index.printStats();
	                    
	                    for (IProject p : projects) {
	                        try {
	                            
	                            IPackageFragment[] packages = JavaCore.create(p).getPackageFragments();
	        
	                            for (IPackageFragment mypackage : packages) {
	                                if (mypackage.getKind() == IPackageFragmentRoot.K_SOURCE) {
	                                    for (ICompilationUnit unit : mypackage.getCompilationUnits()) {
	                                        // Now create the AST for the ICompilationUnits
	                                        try {
	                                            Activator.logInfo("Indexing ICompilationUnit %1$s ...", unit.getPath());
	                                            
	                                            CompilationUnit cu = parse(unit);
	                                            CompilationUnitVisitor visitor = new CompilationUnitVisitor(index);
	                                            visitor.addIndexer(CompilationUnitVisitor.getAllIndexer());
	        
	                                            cu.accept(visitor);
	                                        }catch(Exception e) {
	                                            Activator.logWarning(e, "ICompilationUnit %1$s has not been indexed successfully", unit.getPath());
	                                        }
	                                    }
	                                }
	                            }
	                        } catch(Exception e) {
	                            /* Do nothing */
	                        }
	                    }
	                    
	                    return Status.OK_STATUS;
	                } catch(Exception e) {
	                    return Status.OK_STATUS;
	                }
	            }
	        };
	        job.addJobChangeListener(new JobChangeAdapter() {
	           
	            @Override
	            public void done(final IJobChangeEvent event) {
	                if (event.getResult().isOK()) {
	   
	                    index.printStats();
	                    index.close();
	                    
	                    Long duration = System.currentTimeMillis() - start;
	   
	                    String msg = "Index was built for " + projects.size()
	                            + " project(s). Took " + duration + " milliseconds.";
	                    
	                    System.out.println(msg);
	                } else {
	                    System.out.println(event.getResult().getMessage());
	                }
	            }
	   
	        });
	        job.schedule();;
    	} catch(Exception ex) {
            Activator.logError(ex, "Error");
    	}
    }

    private static CompilationUnit parse(ICompilationUnit unit) {
        ASTParser parser = ASTParser.newParser(AST.JLS3);
        parser.setKind(ASTParser.K_COMPILATION_UNIT);
        parser.setSource(unit);
        parser.setResolveBindings(true);
        return (CompilationUnit) parser.createAST(null); // parse
    }

    /**
     * @see IActionDelegate#selectionChanged(IAction, ISelection)
     */
    @Override
    public void selectionChanged(IAction action, ISelection selection) {
        projects = Lists.newLinkedList();

        if (selection instanceof IStructuredSelection) {

            for (Object o : ((IStructuredSelection) selection).toArray()) {

                if (o instanceof IProject) {
                    projects.add((IProject) o);
                } else if (o instanceof PlatformObject) {
                    projects.add((IProject) ((PlatformObject) o).getAdapter(IProject.class));
                }
            }
        }
    }

}
