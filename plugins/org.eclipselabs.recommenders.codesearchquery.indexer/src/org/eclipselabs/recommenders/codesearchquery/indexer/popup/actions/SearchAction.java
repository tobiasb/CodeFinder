package org.eclipselabs.recommenders.codesearchquery.indexer.popup.actions;

import java.io.File;
import java.io.IOException;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.BooleanClause.Occur;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.search.TopScoreDocCollector;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.SimpleFSDirectory;
import org.apache.lucene.util.Version;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipselabs.recommenders.codesearchquery.indexer.Fields;

public class SearchAction implements IObjectActionDelegate {

	public SearchAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(IAction action) {

		try {
			StandardAnalyzer analyzer = new StandardAnalyzer(Version.LUCENE_30);
			Directory index = new SimpleFSDirectory(new File("o:/index.l"));

			// 2. query
			String querystr = "String";

			// the "title" arg specifies the default field to use
			// when no field is explicitly specified in the query.			
			TermQuery term1 = new TermQuery(new Term(Fields.RETURN_TYPE, "Ltest/bla/Test"));
			TermQuery term2 = new TermQuery(new Term(Fields.USED_TYPES, "Ljava/util/Map"));
			
			BooleanQuery q = new BooleanQuery();
			q.add(term1, Occur.MUST);
			q.add(term2, Occur.SHOULD);

			System.out.println("Searching for: " + q.toString());
			
			// 3. search
			int hitsPerPage = 10;
			IndexSearcher searcher = new IndexSearcher(index, true);
			TopScoreDocCollector collector = TopScoreDocCollector.create(
					hitsPerPage, true);
			searcher.search(q, collector);
			ScoreDoc[] hits = collector.topDocs().scoreDocs;

			// 4. display results
			System.out.println("Found " + hits.length + " hits.");
			for (int i = 0; i < hits.length; ++i) {
				int docId = hits[i].doc;
				Document d = searcher.doc(docId);
				System.out.println((i + 1) + ". " + d.get(Fields.TYPE) + " " + d.get(Fields.FRIENDLY_NAME));
			}

			// searcher can only be closed when there
			// is no need to access the documents any more.
			searcher.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub

	}

}
