package org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.views;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;

public class EmbeddedEditor extends ViewPart {

	public EmbeddedEditor() {
	}

	@Override
	public void createPartControl(Composite parent) {
		IEditedResourceProvider resourceProvider = new IEditedResourceProvider() {
			
			@Override
			public XtextResource createResource() {
				return null; //What to return, how to create a resource?
			}
		};
		
		EmbeddedEditorFactory factory = new EmbeddedEditorFactory();
		org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor handle = factory.newEditor(resourceProvider).withParent(parent);
	}

	@Override
	public void setFocus() {
	}

}
