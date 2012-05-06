/**
 * Copyright (c) 2010, 2012 Darmstadt University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Tobias Boehm - initial API and implementation.
 */

package org.eclipse.recommenders.internal.codesearch.rcp.views;

import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.SearchResult;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.converter.DotNotationTypeConverter;
import org.eclipse.recommenders.codesearch.rcp.index.termvector.JavaTypeProvider;
import org.eclipse.recommenders.codesearch.rcp.searcher.MethodPatternQLSearcher;
import org.eclipse.recommenders.codesearch.rcp.searcher.imageProvider.TypeImageProvider;
import org.eclipse.recommenders.codesearch.rcp.searcher.proposalProvider.GenericQueryProposalProvider;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.extractors.ParseResultExtractor;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.extractors.StringQueryExtractor;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.contentassist.QueryProposalType;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.internal.LuceneQueryActivator;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.QL1StandaloneSetup;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui.contentassist.QL1ProposalProvider;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui.internal.QL1Activator;

import com.google.inject.Injector;

@SuppressWarnings("restriction")
public class MethodPatternQLEditorWrapper extends AbstractEmbeddedEditorWrapper {

    private Injector luceneInjector = null;

    public MethodPatternQLEditorWrapper() {

        final LuceneQueryActivator activator = LuceneQueryActivator.getInstance();
        luceneInjector = activator
                .getInjector(LuceneQueryActivator.ORG_ECLIPSELABS_RECOMMENDERS_CODESEARCH_RCP_DSL_LUCENEQUERY);
    }

    @Override
    void createQueryEditorInternal() {

        QL1ProposalProvider.addQueryProposalProvider(QueryProposalType.TYPE, new GenericQueryProposalProvider(
                new JavaTypeProvider(), new DotNotationTypeConverter(), new TypeImageProvider()));

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

        System.out.println(handle.getDocument().readOnly(new StringQueryExtractor()));

        IParseResult r = handle.getDocument().readOnly(new ParseResultExtractor());

        return new MethodPatternQLSearcher(luceneInjector).search(codeSearcher, r);
    }

    @Override
    public String[] getExampleQueriesInternal() {
        return new String[] { "com.google.inject.Module *(com.google.common.base.Optional)",
                "* * (java.lang.String, java.util.List)", "* * (java.lang.String, {java.util.List | java.util.Map})",
                "* *(..) throws java.lang.IOException", "String *label*(IJavaElement)",
                "String *label*(.., IJavaElement, ..)", "static * *" };
    }

    public static String getName() {
        return "Method Pattern QL";
    }

    @Override
    IUnitOfWork<Set<String>, XtextResource> getSearchTermExtractor() {
        return null;
    }
}
