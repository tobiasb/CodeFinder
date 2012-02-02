package org.eclipselabs.recommenders.internal.codesearchquery.rcp.views;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.queryParser.ParseException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.recommenders.injection.InjectionService;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.LuceneQueryStandaloneSetup;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.contentassist.LuceneQueryProposalProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.contentassist.QueryProposalType;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.internal.LuceneQueryActivator;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.CodeSearcherIndex;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.DocumentTypeProposalProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.GenericQueryProposalProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.LuceneSearchTermExtractor;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.ModifierQueryProposalProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.LuceneQueryExtractor;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.DotNotationMethodConverter;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.DotNotationTypeConverter;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.PathValueConverter;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.utils.MethodImageProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.utils.ProjectImageProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.utils.TypeImageProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.termvector.JavaMethodProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.termvector.JavaTypeProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.termvector.ProjectNameProvider;
import org.eclipselabs.recommenders.codesearchquery.rcp.termvector.ResourcePathProvider;

import com.google.inject.Injector;

@SuppressWarnings("restriction")
public class LuceneQueryEditorWrapper extends AbstractEmbeddedEditorWrapper {

    @Override
    void createQueryEditorInternal() {
        LuceneQueryProposalProvider.addQueryProposalProvider(QueryProposalType.TYPE, new GenericQueryProposalProvider(
                new JavaTypeProvider(), new DotNotationTypeConverter(), new TypeImageProvider()));

        LuceneQueryProposalProvider.addQueryProposalProvider(QueryProposalType.METHOD,
                new GenericQueryProposalProvider(new JavaMethodProvider(), new DotNotationMethodConverter(),
                        new MethodImageProvider()));

        LuceneQueryProposalProvider.addQueryProposalProvider(QueryProposalType.FILE_PATH,
                new GenericQueryProposalProvider(new ResourcePathProvider(), new PathValueConverter()));

        LuceneQueryProposalProvider.addQueryProposalProvider(QueryProposalType.PROJECT_NAME,
                new GenericQueryProposalProvider(new ProjectNameProvider(), null, new ProjectImageProvider()));

        LuceneQueryProposalProvider.addQueryProposalProvider(QueryProposalType.MODIFIER,
                new ModifierQueryProposalProvider());

        LuceneQueryProposalProvider.addQueryProposalProvider(QueryProposalType.DOCUMENT_TYPE,
                new DocumentTypeProposalProvider());

        final IEditedResourceProvider resourceProvider = new IEditedResourceProvider() {

            @Override
            public XtextResource createResource() {
                try {
                    LuceneQueryStandaloneSetup.doSetup();
                    final ResourceSet resourceSet = new ResourceSetImpl();
                    final Resource resource = resourceSet.createResource(URI.createURI("embedded.lucenequery"));

                    return (XtextResource) resource;
                } catch (final Exception e) {
                    return null; // What to return, how to create a resource?
                }
            }
        };

        final LuceneQueryActivator activator = LuceneQueryActivator.getInstance();
        final Injector injector = activator
                .getInjector(LuceneQueryActivator.ORG_ECLIPSELABS_RECOMMENDERS_CODESEARCHQUERY_RCP_DSL_LUCENEQUERY);
        final EmbeddedEditorFactory factory = injector.getInstance(EmbeddedEditorFactory.class);
        handle = factory.newEditor(resourceProvider).withParent(parent);

        // keep the partialEditor as instance var to read / write the edited
        // text
        partialEditor = handle.createPartialEditor(true);
        // handle.getViewer().addTextInputListener(new ITextInputListener() {
        //
        // @Override
        // public void inputDocumentChanged(final IDocument oldInput, final
        // IDocument newInput) {
        // }
        //
        // @Override
        // public void inputDocumentAboutToBeChanged(final IDocument oldInput,
        // final IDocument newInput) {
        // // no constraints...
        // }
        // });
    }

    @Override
    List<Document> search() throws ParseException, CorruptIndexException, IOException {
        final String searchQuery = handle.getDocument().readOnly(new LuceneQueryExtractor());
        resetXtextQuery();

        codeSearcher = InjectionService.getInstance().requestInstance(CodeSearcherIndex.class);

        return codeSearcher.search(searchQuery);
    }

    @Override
    String[] getExampleQueriesInternal() {
        return new String[] { "UsedTypes:java.util.List",
                "ExtendedTypes:org.eclipse* AND Modifiers:public AND (UsedTypes:*ASTVisitor OR UsedTypes:*Plugin)",
                "UsedTypes:java.util.List AND Type:method" };
    }

    public static String getName() {
        return "Lucene Query Language";
    }

    @Override
    IUnitOfWork<Set<String>, XtextResource> getSEarchTermExtractor() {
        return new LuceneSearchTermExtractor();
    }
}