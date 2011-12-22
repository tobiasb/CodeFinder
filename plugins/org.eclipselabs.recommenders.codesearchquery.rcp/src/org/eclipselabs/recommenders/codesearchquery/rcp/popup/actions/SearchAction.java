package org.eclipselabs.recommenders.codesearchquery.rcp.popup.actions;

import java.io.File;
import java.io.IOException;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.BooleanClause.Occur;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.search.TopScoreDocCollector;
import org.apache.lucene.search.WildcardQuery;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.SimpleFSDirectory;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipselabs.recommenders.codesearchquery.rcp.Activator;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;

public class SearchAction implements IObjectActionDelegate {

	public SearchAction() {
	}

	@Override
	public void run(IAction action) {

		try {			
			Directory index = new SimpleFSDirectory(new File("d:/index.l")); //Activator.injector.getInstance(Directory.class);//
			
			Query term1 = new TermQuery(new Term(Fields.RETURN_TYPE, "Ljava/util/List"));
            Query term2 = new WildcardQuery(new Term(Fields.RETURN_TYPE, "Ltest/bla/Test"));
            Query term3 = new WildcardQuery(new Term(Fields.USED_TYPES, "Ljava/util/Map"));
			
            BooleanQuery q1 = new BooleanQuery();
            q1.add(term2, Occur.MUST);
            q1.add(term3, Occur.MUST);
            
            
            
			BooleanQuery q = new BooleanQuery();
			q.add(new TermQuery(new Term(Fields.MODIFIERS, Fields.MODIFIER_ABSTRACT)), Occur.MUST);
			q.add(new TermQuery(new Term(Fields.TYPE, Fields.TYPE_CLASS)), Occur.MUST);
//            q.add(term2, Occur.SHOULD);
//            q.add(term3, Occur.SHOULD);
						
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
			System.out.println("Found " + hits.length + " hits (Total: " + collector.getTotalHits() + ").");
			for (int i = 0; i < hits.length; ++i) {
				int docId = hits[i].doc;
				Document d = searcher.doc(docId);
				System.out.println((i + 1) + ". " + d.get(Fields.TYPE) + " " + d.get(Fields.FULLY_QUALIFIED_NAME));
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
