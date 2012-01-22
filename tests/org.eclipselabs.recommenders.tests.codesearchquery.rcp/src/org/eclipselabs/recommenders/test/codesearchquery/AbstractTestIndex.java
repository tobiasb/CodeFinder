package org.eclipselabs.recommenders.test.codesearchquery;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.lucene.document.Document;
import org.apache.lucene.store.RAMDirectory;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.recommenders.tests.jdt.JavaProjectFixture;
import org.eclipse.recommenders.utils.Tuple;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.CodeIndexerIndex;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.utils.CompilationUnitHelper;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.CodeSearcherIndex;

import com.google.common.collect.Lists;

public class AbstractTestIndex {

	private CodeIndexerIndex index = null;
	private List<Document> docs = Lists.newArrayList();
	private Document currentDoc = null;
	
	public AbstractTestIndex() {
	}
	
	public AbstractTestIndex newIndex() throws IOException {
		if(index != null)
			finish();
		
		index = new CodeIndexerIndex(new RAMDirectory());
		
		return this;
	}
	
	public CodeIndexerIndex getIndexer() {
		return index;
	}
	
	public CodeSearcherIndex getSearchIndexer() throws IOException {
		return new CodeSearcherIndex(getIndexer().getIndex());
	}
	
	public AbstractTestIndex newDocs() {
		docs.clear();
		
		return this;
	}
	
	public AbstractTestIndex newDoc() {
		if(currentDoc != null)
			docs.add(currentDoc);
		
		currentDoc = new Document();
		
		return this;
	}
	
	public AbstractTestIndex addField(String fieldName, String fieldValue) {
		if(currentDoc == null)
			currentDoc = new Document();
		
		CodeIndexerIndex.addAnalyzedField(currentDoc, fieldName, fieldValue);
		
		return this;
	}
	
	public AbstractTestIndex finish() throws IOException {
		if(currentDoc != null)
			docs.add(currentDoc);
		
		currentDoc = null;

		index.addDocuments(docs);
		
		index.commit();
		
		newDocs();
		
		return this;
	}
	
	protected CompilationUnit getSampleCompilationUnit() throws Exception {

		JavaProjectFixture fixture = new JavaProjectFixture(ResourcesPlugin.getWorkspace(), "testProject");
		Tuple<ICompilationUnit, Set<Integer>> struct = fixture.createFileAndParseWithMarkers("public class MyInstanceOfClass {}", "MyClass.java");
		
		CompilationUnit cu = CompilationUnitHelper.parse(struct.getFirst());
		
		return cu;
	}
	
	protected ICompilationUnit getSampleICompilationUnit() throws Exception {

		JavaProjectFixture fixture = new JavaProjectFixture(ResourcesPlugin.getWorkspace(), "testProject");
		Tuple<ICompilationUnit, Set<Integer>> struct = fixture.createFileAndParseWithMarkers("public class MyInstanceOfClass {}", "MyClass.java");
		
		ICompilationUnit cu = struct.getFirst();
		
		return cu;
	}
}
