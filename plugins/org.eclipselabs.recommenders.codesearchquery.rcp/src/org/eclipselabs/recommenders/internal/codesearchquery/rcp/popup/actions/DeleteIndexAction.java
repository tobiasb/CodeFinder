package org.eclipselabs.recommenders.internal.codesearchquery.rcp.popup.actions;

import java.io.IOException;

import org.apache.lucene.store.Directory;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.recommenders.injection.InjectionService;
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
            Directory directory = InjectionService.getInstance().requestInstance(Directory.class);
			final CodeIndexerIndex index = new CodeIndexerIndex(directory);
			
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
