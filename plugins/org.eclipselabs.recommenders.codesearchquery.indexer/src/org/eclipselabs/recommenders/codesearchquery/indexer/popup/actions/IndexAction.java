package org.eclipselabs.recommenders.codesearchquery.indexer.popup.actions;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipselabs.recommenders.codesearchquery.indexer.CompilationUnitVisitor;
import org.eclipselabs.recommenders.codesearchquery.indexer.lucene.LuceneIndex;

import com.google.common.collect.Lists;

public class IndexAction implements IObjectActionDelegate {

    private Shell shell;
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
        shell = targetPart.getSite().getShell();
    }

    /**
     * @see IActionDelegate#run(IAction)
     */
    @Override
    public void run(IAction action) {
        try {
            LuceneIndex index = LuceneIndex.createNewIndex();

            for (IProject p : projects) {
                IPackageFragment[] packages = JavaCore.create(p).getPackageFragments();

                for (IPackageFragment mypackage : packages) {
                    if (mypackage.getKind() == IPackageFragmentRoot.K_SOURCE) {
                        for (ICompilationUnit unit : mypackage.getCompilationUnits()) {
                            // Now create the AST for the ICompilationUnits
                            CompilationUnit cu = parse(unit);
                            CompilationUnitVisitor visitor = new CompilationUnitVisitor(index);

                            cu.accept(visitor);
                        }
                    }
                }
            }

            index.close();

            MessageDialog.openInformation(shell, "Indexer", "Index was executed for " + projects.size()
                    + " project(s).");

        } catch (JavaModelException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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
