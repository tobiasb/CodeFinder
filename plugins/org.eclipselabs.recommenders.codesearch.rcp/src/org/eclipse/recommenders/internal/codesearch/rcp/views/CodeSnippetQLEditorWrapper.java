package org.eclipse.recommenders.internal.codesearch.rcp.views;

import java.util.List;
import java.util.Set;

import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.SearchResult;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.LuceneQueryExtractor;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.LuceneQueryFactory;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryFactoryImpl;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.internal.LuceneQueryActivator;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.QL1StandaloneSetup;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.QL2QueryExtractor;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui.internal.QL2Activator;

import com.google.common.collect.Lists;
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

        QL2QueryExtractor extr = new QL2QueryExtractor();

        IParseResult r = handle.getDocument().readOnly(extr);

        EObject e = extr.transform(r);

        LuceneQueryExtractor lextr = new LuceneQueryExtractor();
        lextr.process(e.eAllContents());
        //
        ISerializer s = luceneInjector.getInstance(ISerializer.class);
        String searchQuery = s.serialize(e);

        System.out.println("Search: " + searchQuery);

        SearchResult result = codeSearcher.lenientSearch(searchQuery);
        List<ScoreDoc> validScoreDocs = Lists.newArrayList();

        ScoreDoc[] scoreDocs = new ScoreDoc[validScoreDocs.size()];
        TopDocs d = new TopDocs(validScoreDocs.size(), (ScoreDoc[]) validScoreDocs.toArray(scoreDocs),
                result.docs.getMaxScore());

        return new SearchResult(result.query, d, result.searcher);
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
                String.format("{%nA varA = *%nB varB = *%nvarA.foo()%nvarB.bar(varA)%n}"),
                String.format("(X varX)%n{%nA varA = *%nB varB = *%nvarA.foo()%nvarB.bar(varA)%n}") };
    }

    public static String getName() {
        return "Code Snippet QL";
    }

    @Override
    IUnitOfWork<Set<String>, XtextResource> getSearchTermExtractor() {
        return null;
    }
}
