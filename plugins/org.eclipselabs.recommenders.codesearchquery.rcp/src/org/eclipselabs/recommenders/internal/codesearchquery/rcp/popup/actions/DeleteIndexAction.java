package org.eclipselabs.recommenders.internal.codesearchquery.rcp.popup.actions;

import java.io.File;
import java.io.IOException;

import org.apache.lucene.store.SimpleFSDirectory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.CodeIndexerIndex;
import org.eclipselabs.recommenders.internal.codesearchquery.rcp.Activator;

public class DeleteIndexAction implements IObjectActionDelegate {

	public DeleteIndexAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(IAction action) {
        try {
        	String path = Platform.getLocation().toString() + "/index.l";
			final CodeIndexerIndex index = new CodeIndexerIndex(new SimpleFSDirectory(new File(path)));
			
			index.truncateIndex();
			index.close();
		} catch (IOException e) {
            Activator.logError(e, "Error");
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
		
	}

}
