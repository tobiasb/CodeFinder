package org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.views;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.LuceneQueryStandaloneSetup;

public class EmbeddedEditor extends ViewPart {

	public EmbeddedEditor() {
	}

	@Override
	public void createPartControl(Composite parent) {
		IEditedResourceProvider resourceProvider = new IEditedResourceProvider() {
			
			@Override
			public XtextResource createResource() {
				try {
					LuceneQueryStandaloneSetup.doSetup();
					ResourceSet resourceSet = new ResourceSetImpl();
					Resource resource = resourceSet.createResource(URI.createURI("embedded.lucenequery"));
					
//					ByteArrayInputStream bais = new ByteArrayInputStream("Hello Xtext!".getBytes());
//					resource.load(bais, null);
//					Model model = (Model) resource.getContents().get(0);
					
					return (XtextResource) resource;
				} catch (Exception e) {
					return null; //What to return, how to create a resource?
				}
			}
		};
		
		EmbeddedEditorFactory factory = new EmbeddedEditorFactory();
		org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor handle = factory.newEditor(resourceProvider).withParent(parent);
	}

	@Override
	public void setFocus() {
	}

}
