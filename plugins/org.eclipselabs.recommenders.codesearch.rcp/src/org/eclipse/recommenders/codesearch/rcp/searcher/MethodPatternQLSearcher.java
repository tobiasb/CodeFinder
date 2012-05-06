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

package org.eclipse.recommenders.codesearch.rcp.searcher;

import java.io.IOException;
import java.util.List;

import org.apache.lucene.document.Document;
import org.apache.lucene.queryParser.ParseException;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.CodeSearcher;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.SearchResult;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.QL1QueryExtractor;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterDefinition;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.queryhandler.Node;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.queryhandler.ParameterDefinitionHandler;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.queryhandler.ParameterValidator;

import com.google.common.collect.Lists;
import com.google.inject.Injector;

public class MethodPatternQLSearcher extends AbstractQLSearcher {

    public MethodPatternQLSearcher(Injector injector) {
        super(injector);
    }

    @Override
    public SearchResult search(CodeSearcher codeSearcher, IParseResult parseResult) throws IOException, ParseException {

        QL1QueryExtractor ql1QueryExtractor = new QL1QueryExtractor();

        EObject e = ql1QueryExtractor.transform(parseResult);

        luceneQueryExtractor.process(e.eAllContents());

        String searchQuery = serializeLuceneQuery(e);

        System.out.println("Search: " + searchQuery);

        SearchResult result = codeSearcher.lenientSearch(searchQuery);
        List<ScoreDoc> validScoreDocs = Lists.newArrayList();

        for (int i = result.scoreDocs().length - 1; i >= 0; i--) {
            Document d = result.scoreDoc(i);

            ParameterDefinition pd = ql1QueryExtractor.getMethodPatternDefinition(parseResult).getParameterDefinition();

            if (pd != null && pd.getParameterElementholder().size() > 0) {
                String actualParams = d.getFieldable(Fields.PARAMETER_TYPES_STRUCTURAL).stringValue();
                Node paramGraph = new ParameterDefinitionHandler().getParameterGraph(pd, false);

                if (ParameterValidator.paramGraphFitsActualParams(paramGraph, actualParams.split(";"))) {
                    validScoreDocs.add(result.docs.scoreDocs[i]);
                }
            } else {
                validScoreDocs.add(result.docs.scoreDocs[i]);
            }
        }
        ScoreDoc[] scoreDocs = new ScoreDoc[validScoreDocs.size()];
        TopDocs d = new TopDocs(validScoreDocs.size(), (ScoreDoc[]) validScoreDocs.toArray(scoreDocs),
                result.docs.getMaxScore());

        return new SearchResult(result.query, d, result.searcher);
    }

}
