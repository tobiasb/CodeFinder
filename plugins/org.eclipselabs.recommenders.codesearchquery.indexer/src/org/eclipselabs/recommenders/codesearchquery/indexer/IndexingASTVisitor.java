package org.eclipselabs.recommenders.codesearchquery.indexer;

import java.io.IOException;
import java.util.Set;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipselabs.recommenders.codesearchquery.indexer.lucene.ILuceneIndexable;
import org.eclipselabs.recommenders.codesearchquery.indexer.lucene.LuceneIndex;
import org.eclipse.recommenders.utils.names.IMethodName;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.names.VmTypeName;

import com.google.common.base.Joiner;
import com.google.common.collect.Sets;

public abstract class IndexingASTVisitor extends ASTVisitor implements
		ILuceneIndexable {

	private String m_name;
	private LuceneIndex m_index = null;
	// private Map<String, List<String>> fields = null;

	protected final Joiner joiner = Joiner.on(",").skipNulls();

	public void setName(String id) {
		m_name = id;
	}

	public Document createDocument() {
		Document doc = new Document();

		doc.add(new Field("name", m_name, Field.Store.YES, Field.Index.ANALYZED));

		doc.add(new Field("type", getDocumentType(), Field.Store.YES,
				Field.Index.ANALYZED));

		return doc;
	}

	public IndexingASTVisitor(LuceneIndex index) {
		m_index = index;
	}

	protected LuceneIndex getIndex() {
		return m_index;
	}

	protected boolean isPrimitiveOrArrayOrNullOrObjectOrString(
			final ITypeName type) {
		return type == null || type.isPrimitiveType() || type.isArrayType()
				|| type == VmTypeName.OBJECT || type == VmTypeName.STRING;
	}

	public void index(ASTNode node) {

		node.accept(this);

		createAndPopulateDocument();
	}

	protected abstract void populateDocument(Document d);

	protected <T> Set<String> getNames(Set<T> set) {
		final Set<String> target = Sets.newHashSet();

		for (Object o : set) {
			if (o instanceof IMethodName) {
				target.add(((IMethodName) o).getIdentifier());
			} else if (o instanceof ITypeName) {
				target.add(((ITypeName) o).getIdentifier());
			} else {
				System.out.println("debug other type: "
						+ (o == null ? null : o.getClass()));
			}
		}

		return target;
	}

	protected final void createAndPopulateDocument() {
		Document doc = createDocument();

		populateDocument(doc);

		try {
			getIndex().addDocument(doc);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
