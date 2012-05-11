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
import java.util.Map;

import org.apache.lucene.queryParser.ParseException;
import org.apache.lucene.search.TopDocs;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.CodeSearcher;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.SearchResult;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.SearchResultHelper;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.QL2QueryExtractor;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.VariableExtractor;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.VariableUsage;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.validation.VariableIdentityValidator;

import com.google.common.collect.Lists;
import com.google.inject.Injector;

public class CodeSnippetQLSearcher extends AbstractQLSearcher {

    private QL2QueryExtractor ql2QueryExtractor = new QL2QueryExtractor();

    public CodeSnippetQLSearcher(Injector injector) {
        super(injector);
    }

    public SearchResult search(CodeSearcher codeSearcher, IParseResult parseResult) throws IOException, ParseException {

        VariableExtractor varExtractor = new VariableExtractor();
        Map<String, VariableUsage> map = varExtractor.getVars(parseResult.getRootASTElement());

        if(map.size() == 0)
        	return null;
        
        List<TopDocs> validScoreDocs = Lists.newArrayList();
        SearchResult result = null;

        for (int i = 0; i < map.values().size(); i++) {
            VariableUsage currVar = (VariableUsage) map.values().toArray()[i];

            EObject o = ql2QueryExtractor.createLuceneQuery(currVar);

            luceneQueryExtractor.process(o.eAllContents());

            String searchQuery = serializeLuceneQuery(o);

            System.out.println("Search: " + searchQuery);
            result = codeSearcher.lenientSearch(searchQuery);

            TopDocs validDocs = new VariableIdentityValidator().checkIdentity(codeSearcher, result.docs, currVar);

            validScoreDocs.add(validDocs);
        }

        TopDocs l = SearchResultHelper.getIntersection(validScoreDocs, result.searcher);

        return new SearchResult(null, l, result.searcher);
    }
}
