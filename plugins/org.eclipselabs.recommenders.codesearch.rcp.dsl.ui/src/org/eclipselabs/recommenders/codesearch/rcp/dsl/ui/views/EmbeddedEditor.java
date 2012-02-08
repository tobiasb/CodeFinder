package org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.views;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextInputListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.LuceneQueryStandaloneSetup;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.internal.LuceneQueryActivator;

import com.google.inject.Injector;

public class EmbeddedEditor extends ViewPart {

    private EmbeddedEditorModelAccess partialEditor;

    public EmbeddedEditor() {
    }

    @SuppressWarnings("restriction")
    @Override
    public void createPartControl(final Composite parent) {
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
                .getInjector(LuceneQueryActivator.ORG_ECLIPSELABS_RECOMMENDERS_codesearch_RCP_DSL_LUCENEQUERY);
        EmbeddedEditorFactory factory = injector.getInstance(EmbeddedEditorFactory.class);
        org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor handle = factory.newEditor(resourceProvider).withParent(
                parent);
        // keep the partialEditor as instance var to read / write the edited text
        partialEditor = handle.createPartialEditor(true);
        handle.getViewer().addTextInputListener(new ITextInputListener() {

            @Override
            public void inputDocumentChanged(final IDocument oldInput, final IDocument newInput) {
                // XXX: trigger lucene query in here? Whenever the user entered a new character?
            }

            @Override
            public void inputDocumentAboutToBeChanged(final IDocument oldInput, final IDocument newInput) {
                // no constraints...
            }
        });
    }

    @Override
    public void setFocus() {
    }

}
