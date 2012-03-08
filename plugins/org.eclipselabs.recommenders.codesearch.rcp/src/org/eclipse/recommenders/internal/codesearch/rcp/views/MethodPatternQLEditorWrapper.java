package org.eclipse.recommenders.internal.codesearch.rcp.views;

import java.util.List;
import java.util.Set;

import org.apache.lucene.document.Document;
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
import org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.Fields;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.internal.LuceneQueryActivator;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.QL1QueryExtractor;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.QL1StandaloneSetup;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterDefinition;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.queryhandler.Node;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.queryhandler.ParameterDefinitionHandler;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui.internal.QL1Activator;

import com.google.common.collect.Lists;
import com.google.inject.Injector;

@SuppressWarnings("restriction")
public class MethodPatternQLEditorWrapper extends AbstractEmbeddedEditorWrapper {

    private LuceneQueryFactory luceneQueryFactory = null;
    private Injector luceneInjector = null;

    public MethodPatternQLEditorWrapper() {

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
                    final Resource resource = resourceSet.createResource(URI.createURI("embedded.ql1"));

                    return (XtextResource) resource;
                } catch (final Exception e) {
                    return null;
                }
            }
        };

        final QL1Activator activator = QL1Activator.getInstance();
        final Injector injector = activator
                .getInjector(QL1Activator.ORG_ECLIPSELABS_RECOMMENDERS_CODESEARCH_RCP_DSLQL1_QL1);
        final EmbeddedEditorFactory factory = injector.getInstance(EmbeddedEditorFactory.class);
        handle = factory.newEditor(resourceProvider).withParent(parent);

        // keep the partialEditor as instance var to read / write the edited
        // text
        partialEditor = handle.createPartialEditor(true);
    }

    @Override
    public SearchResult search() throws Exception {

        QL1QueryExtractor extr = new QL1QueryExtractor();

        IParseResult r = handle.getDocument().readOnly(extr);

        EObject e = extr.transform(r);
        //
        // EObject e = translate(q.type, q.exp);

        //
        LuceneQueryExtractor lextr = new LuceneQueryExtractor();
        lextr.process(e.eAllContents());
        //
        ISerializer s = luceneInjector.getInstance(ISerializer.class);
        String searchQuery = s.serialize(e);
        //

        System.out.println("Search: " + searchQuery);

        SearchResult result = codeSearcher.lenientSearch(searchQuery);
        List<ScoreDoc> validScoreDocs = Lists.newArrayList();

        for (int i = result.scoreDocs().length - 1; i >= 0; i--) {
            Document d = result.scoreDoc(i);

            String actualParams = d.getFieldable(Fields.PARAMETER_TYPES_STRUCTURAL).stringValue();
            ParameterDefinition pd = extr.getMethodPatternDefinition(r).getParameterDefinition();
            Node paramGraph = new ParameterDefinitionHandler().getParameterGraph(pd, false);

            if (extr.paramGraphFitsActualParams(paramGraph, actualParams.split(";"))) {
                validScoreDocs.add(result.docs.scoreDocs[i]);
            }
        }
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
        return new String[] { "* * (Ljava/lang/String, Ljava/util/List)",
                "* * (Ljava/lang/String, {Ljava/util/List | Ljava/util/Map})", "* *(..) throws java.lang.IOException",
                "String *label*(IJavaElement)", "String *label*(.., IJavaElement, ..)", "static * *" };
    }

    public static String getName() {
        return "Method Pattern QL";
    }

    @Override
    IUnitOfWork<Set<String>, XtextResource> getSearchTermExtractor() {
        return null;
    }
}
