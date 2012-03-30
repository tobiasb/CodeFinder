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
import org.eclipselabs.recommenders.codesearch.rcp.dsl.extractors.LuceneQueryExtractor;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.QL2QueryExtractor;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.VariableExtractor;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.VariableUsage;

import com.google.common.collect.Lists;
import com.google.inject.Injector;

public class CodeSnippetQLSearcher extends AbstractQLSearcher {
    public CodeSnippetQLSearcher(Injector injector) {
        super(injector);
    }

    public SearchResult search(CodeSearcher codeSearcher, IParseResult parseResult) throws IOException, ParseException {

        Map<String, VariableUsage> map = new VariableExtractor().getVars(parseResult.getRootASTElement());

        List<TopDocs> validScoreDocs = Lists.newArrayList();
        SearchResult result = null;

        QL2QueryExtractor extr = new QL2QueryExtractor();

        for (int i = 0; i < map.values().size(); i++) {
            VariableUsage currVar = (VariableUsage) map.values().toArray()[i];

            EObject o = extr.transform(currVar);

            LuceneQueryExtractor lextr = new LuceneQueryExtractor();
            lextr.process(o.eAllContents());

            String searchQuery = serializeLuceneQuery(o);

            System.out.println("Search: " + searchQuery);
            result = codeSearcher.lenientSearch(searchQuery);

            validScoreDocs.add(result.docs);
        }

        TopDocs l = SearchResultHelper.getIntersection(validScoreDocs, result.searcher);

        return new SearchResult(null, l, result.searcher);
    }
}
