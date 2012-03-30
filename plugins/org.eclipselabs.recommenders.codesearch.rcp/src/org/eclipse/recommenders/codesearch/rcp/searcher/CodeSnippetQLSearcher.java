package org.eclipse.recommenders.codesearch.rcp.searcher;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Fieldable;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.queryParser.ParseException;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.CodeSearcher;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.SearchResult;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.SearchResultHelper;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.QL2QueryExtractor;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.VariableExtractor;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.VariableParameterUsage;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.VariableUsage;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.inject.Injector;

public class CodeSnippetQLSearcher extends AbstractQLSearcher {

    private QL2QueryExtractor ql2QueryExtractor = new QL2QueryExtractor();

    public CodeSnippetQLSearcher(Injector injector) {
        super(injector);
    }

    public SearchResult search(CodeSearcher codeSearcher, IParseResult parseResult) throws IOException, ParseException {

        VariableExtractor varExtractor = new VariableExtractor();
        Map<String, VariableUsage> map = varExtractor.getVars(parseResult.getRootASTElement());

        List<TopDocs> validScoreDocs = Lists.newArrayList();
        SearchResult result = null;

        for (int i = 0; i < map.values().size(); i++) {
            VariableUsage currVar = (VariableUsage) map.values().toArray()[i];

            EObject o = ql2QueryExtractor.createLuceneQuery(currVar);

            luceneQueryExtractor.process(o.eAllContents());

            String searchQuery = serializeLuceneQuery(o);

            System.out.println("Search: " + searchQuery);
            result = codeSearcher.lenientSearch(searchQuery);

            TopDocs validDocs = checkIdentity(codeSearcher, result.docs, currVar);

            validScoreDocs.add(validDocs);
        }

        TopDocs l = SearchResultHelper.getIntersection(validScoreDocs, result.searcher);

        return new SearchResult(null, l, result.searcher);
    }

    private TopDocs checkIdentity(CodeSearcher codeSearcher, TopDocs docs, VariableUsage var)
            throws CorruptIndexException, IOException {

        List<ScoreDoc> validDocs = Lists.newArrayList();

        for (ScoreDoc scoreDoc : docs.scoreDocs) {
            Document doc = codeSearcher.getDocument(scoreDoc.doc);

            if (isValid(doc, var)) {
                validDocs.add(scoreDoc);
            }
        }

        return SearchResultHelper.asTopDocs(validDocs);
    }

    private boolean isValid(Document doc, VariableUsage var) {

        Map<String, List<VariableParameterUsage>> m1 = getVarParamUsagesByQueryVarName(var);
        Map<String, List<String>> m2 = getVarParamUsagesByVarName(doc);

        for (List<VariableParameterUsage> l : m1.values()) {
            if (!hasCorrespondingVarSet(l, m2))
                return false;
        }

        return true;
    }

    private boolean hasCorrespondingVarSet(List<VariableParameterUsage> m1, Map<String, List<String>> m2) {
        for (List<String> s : m2.values()) {
            if (matches(m1, s))
                return true;
        }

        return false;
    }

    private boolean matches(List<VariableParameterUsage> m1, List<String> m2) {

        for (VariableParameterUsage p : m1) {
            boolean found = false;

            for (String s : m2) {
                if (matches(p, s))
                    found = true;
            }

            if (!found)
                return false;
        }

        return true;
    }

    private boolean matches(VariableParameterUsage p, String methodSignature) {
        return methodSignature.contains(p.method);
    }

    private Map<String, List<String>> getVarParamUsagesByVarName(Document doc) {
        Map<String, List<String>> m = Maps.newHashMap();

        for (Fieldable f : doc.getFieldables(Fields.USED_AS_PARAMETER_IN_METHODS)) {
            String methodName = f.stringValue().split("\\|")[0];
            String origVarName = f.stringValue().split("\\|")[1];

            if (!m.containsKey(origVarName)) {
                m.put(origVarName, new ArrayList<String>());
            }

            m.get(origVarName).add(methodName);
        }

        return m;
    }

    private Map<String, List<VariableParameterUsage>> getVarParamUsagesByQueryVarName(VariableUsage var) {
        Map<String, List<VariableParameterUsage>> m = Maps.newHashMap();

        for (VariableParameterUsage parUsage : var.parameterUsages) {
            if (!m.containsKey(parUsage.targetVariable.name)) {
                m.put(parUsage.targetVariable.name, new ArrayList<VariableParameterUsage>());
            }

            m.get(parUsage.targetVariable.name).add(parUsage);
        }

        return m;
    }
}
