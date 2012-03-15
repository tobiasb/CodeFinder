package org.eclipse.recommenders.internal.codesearch.rcp.views;

import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.SearchResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.LuceneQueryFactory;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryFactoryImpl;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.internal.LuceneQueryActivator;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.QL1StandaloneSetup;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui.internal.QL2Activator;

import com.google.inject.Injector;

@SuppressWarnings("restriction")
public class CodeSnippetQLEditorWrapper extends AbstractEmbeddedEditorWrapper {

    private LuceneQueryFactory luceneQueryFactory = null;
    private Injector luceneInjector = null;

    public CodeSnippetQLEditorWrapper() {

        final LuceneQueryActivator activator = LuceneQueryActivator.getInstance();
        luceneInjector = activator
                .getInjector(LuceneQueryActivator.ORG_ECLIPSELABS_RECOMMENDERS_CODESEARCH_RCP_DSL_LUCENEQUERY);

        luceneQueryFactory = new LuceneQueryFactoryImpl();
    }

    @Override
    void createQueryEditorInternal() {
        final IEditedResourceProvider resourceProvider = new IEditedResourceProvider() {

            @Override
            public XtextResource createResource() {
                try {
                    QL1StandaloneSetup.doSetup();
                    final ResourceSet resourceSet = new ResourceSetImpl();
                    final Resource resource = resourceSet.createResource(URI.createURI("embedded.ql2"));

                    return (XtextResource) resource;
                } catch (final Exception e) {
                    return null;
                }
            }
        };

        final QL2Activator activator = QL2Activator.getInstance();
        final Injector injector = activator
                .getInjector(QL2Activator.ORG_ECLIPSELABS_RECOMMENDERS_CODESEARCH_RCP_DSLQL2_QL2);
        final EmbeddedEditorFactory factory = injector.getInstance(EmbeddedEditorFactory.class);
        handle = factory.newEditor(resourceProvider).withParent(parent);

        // keep the partialEditor as instance var to read / write the edited
        // text
        partialEditor = handle.createPartialEditor(true);
    }

    @Override
    public SearchResult search() throws Exception {

        // QL1Query q = handle.getDocument().readOnly(new QL1QueryExtractor());
        //
        // EObject e = translate(q.type, q.exp);
        //
        // LuceneQueryExtractor extr = new LuceneQueryExtractor();
        // extr.process(e.eAllContents());
        //
        // ISerializer s = luceneInjector.getInstance(ISerializer.class);
        // String searchQuery = s.serialize(e);
        //
        // return codeSearcher.search(searchQuery);
        return null;
    }

    // private EObject translate(Type type, Expression exp) {
    //
    // org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.Expression e
    // = luceneQueryFactory
    // .createExpression();
    // ClauseExpression c = luceneQueryFactory.createClauseExpression();
    // ModifierField t = luceneQueryFactory.createModifierField();
    // t.setValue(Fields.TYPE);
    // c.setField(t);
    // c.getValues().add(Fields.MODIFIER_FINAL);
    //
    // e.setValue(c);
    //
    // return e;
    // }

    @Override
    String[] getExampleQueriesInternal() {

        return new String[] { String.format("{%nA varA = *%nB varB = *%n}"),
                String.format("{%nA varA = *%nB varB = *%nvarA.foo()%nvarB.bar(varA)%n}"), String.format("(X varX)%n{%nA varA = *%nB varB = *%nvarA.foo()%nvarB.bar(varA)%n}") };
    }

    public static String getName() {
        return "Code Snippet QL";
    }

    @Override
    IUnitOfWork<Set<String>, XtextResource> getSearchTermExtractor() {
        return null;
    }
}
