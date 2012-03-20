package org.eclipse.recommenders.codesearch.rcp.index.searcher;

import java.util.List;

import org.apache.lucene.document.Document;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;

import com.google.common.collect.Lists;

public class SearchResultHelper {
    public static TopDocs getIntersection(List<TopDocs> validScoreDocs, IndexSearcher searcher) {
        if (validScoreDocs.size() == 0)
            return new TopDocs(0, new ScoreDoc[0], 0);

        TopDocs result = validScoreDocs.get(0);

        for (int i = 1; i < validScoreDocs.size(); i++) {
            result = getIntersection(result, validScoreDocs.get(i), searcher);
        }

        return result;
    }

    public static TopDocs getIntersection(TopDocs t1, TopDocs t2, IndexSearcher searcher) {
        List<ScoreDoc> list = Lists.newArrayList();

        for (ScoreDoc d1 : t1.scoreDocs) {
            for (ScoreDoc d2 : t2.scoreDocs) {
                if (areEqual(d1, d2, searcher)) {
                    list.add(d1);
                    break;
                }
            }
        }

        ScoreDoc[] resultDocs = new ScoreDoc[list.size()];
        return new TopDocs(list.size(), list.toArray(resultDocs), 0);
    }

    private static boolean areEqual(ScoreDoc d1, ScoreDoc d2, IndexSearcher searcher) {
        try {
            Document doc1 = searcher.doc(d1.doc);
            Document doc2 = searcher.doc(d2.doc);

            return doc1.get(Fields.DECLARING_METHOD) != null && doc2.get(Fields.DECLARING_METHOD) != null
                    && doc1.get(Fields.DECLARING_METHOD).equals(doc2.get(Fields.DECLARING_METHOD));
        } catch (Exception ex) {
            return false;
        }
    }

    // public static <T> List<T> intersection(List<T> list1, List<T> list2) {
    // List<T> list = new ArrayList<T>();
    //
    // for (T t : list1) {
    // if (list2.contains(t)) {
    // list.add(t);
    // }
    // }
    //
    // return list;
    // }
}
