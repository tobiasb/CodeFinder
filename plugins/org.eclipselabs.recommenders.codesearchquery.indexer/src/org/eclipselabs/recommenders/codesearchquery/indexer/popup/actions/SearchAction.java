package org.eclipselabs.recommenders.codesearchquery.indexer.popup.actions;

import java.io.IOException;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.BooleanClause.Occur;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.PrefixQuery;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.search.TopScoreDocCollector;
import org.apache.lucene.search.WildcardQuery;
import org.apache.lucene.store.Directory;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipselabs.recommenders.codesearchquery.indexer.Activator;
import org.eclipselabs.recommenders.codesearchquery.indexer.Fields;

public class SearchAction implements IObjectActionDelegate {

	public SearchAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(IAction action) {

		try {			
			Directory index = Activator.injector.getInstance(Directory.class);// new SimpleFSDirectory(new File("o:/index.l"));
			
			Query term1 = new TermQuery(new Term(Fields.RETURN_TYPE, "Ljava/util/List"));
            Query term2 = new WildcardQuery(new Term(Fields.CALLED_METHODS, "*String.format*"));
			Query term3 = new PrefixQuery(new Term(Fields.USED_TYPES, "*" + IStatusLineManager.class.getSimpleName()));
			
			BooleanQuery q = new BooleanQuery();
			//q.add(term1, Occur.SHOULD);
            //q.add(term2, Occur.MUST);
			q.add(term3, Occur.MUST);
			
			System.out.println("Searching for: " + q.toString());
			
			// 3. search
			int hitsPerPage = 10;
			IndexSearcher searcher = new IndexSearcher(index, true);
			
			Activator.logInfo("Index has %1$s documents", searcher.getIndexReader().numDocs());
			
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
				System.out.println(d);
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
