package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IFieldIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IMethodIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.ITryCatchBlockIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;

public class TimestampIndexer extends AbstractIndexer implements IClassIndexer,
		IMethodIndexer, IFieldIndexer, ITryCatchBlockIndexer {

	private static final DateFormat format = new SimpleDateFormat("yyyyMMddHHmmssSSS");

	public static DateFormat getDateFormat() {
		return format;
	}
	
	@Override
	public void index(Document document, TryStatement tryStatement,
			CatchClause catchClause) {
		addAnalyzedField(document, Fields.TIMESTAMP, getTimeString());
	}

	@Override
	public void index(Document document, FieldDeclaration field) {
		addAnalyzedField(document, Fields.TIMESTAMP, getTimeString());
	}

	@Override
	public void index(Document document, MethodDeclaration method) {
		addAnalyzedField(document, Fields.TIMESTAMP, getTimeString());
	}

	@Override
	public void index(Document document, TypeDeclaration type) {
		addAnalyzedField(document, Fields.TIMESTAMP, getTimeString());
	}

	private String getTimeString() {
		return format.format(new Date());
	}
}
