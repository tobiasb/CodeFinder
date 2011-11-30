package org.eclipselabs.recommenders.codesearchquery.indexer;

import java.io.IOException;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.NumericField;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.recommenders.utils.names.IMethodName;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.names.VmTypeName;
import org.eclipselabs.recommenders.codesearchquery.indexer.lucene.ILuceneIndexable;
import org.eclipselabs.recommenders.codesearchquery.indexer.lucene.LuceneIndex;

import com.google.common.base.Joiner;
import com.google.common.collect.Sets;

public abstract class IndexingASTVisitor extends ASTVisitor implements
		ILuceneIndexable {

	private String m_id;
    private String m_name;
	private LuceneIndex m_index = null;
	// private Map<String, List<String>> fields = null;

	protected final Joiner joiner = Joiner.on(",").skipNulls();

    public String getId() {
        return m_id;
    }
    
	public void setId(String id) {
		m_id = id;
	}

    public String getName() {
        return m_name;
    }
    
    public void setName(String name) {
        m_name = name;
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
			target.add(getName(o));
		}

		return target;
	}

    protected <T> String getName(T o) {
        String target = "";

        if(o == null) {
        }
        if (o instanceof IMethodName) {
            target = ((IMethodName) o).getIdentifier();
        } else if (o instanceof ITypeName) {
            target = ((ITypeName) o).getIdentifier();
        } else {
            //System.out.println("debug other type: "  + (o == null ? null : o.getClass()));
        }

        return target;
    }
	
	protected void debugOut(String msg, String origin) {
	    System.out.println(getDocumentType() + " " + getName() + ": " + msg + " (" + origin + ")");
	}

	protected final void createAndPopulateDocument() {
		Document doc = new Document();
        
        doc.add(new NumericField(Fields.INT_TIMESTAMP).setLongValue(new Date().getTime()));

		addToDocument(doc, Fields.ID, getId());
        addToDocument(doc, Fields.TYPE, getDocumentType());
        addToDocument(doc, Fields.FRIENDLY_NAME, getId());

		populateDocument(doc);

		try {
			getIndex().addDocument(doc);
		} catch (IOException e) {
			e.printStackTrace(); //TODO: fixme
		}
	}
	
	protected void addToDocument(Document doc, String fieldName, String fieldValue) {
        doc.add(new Field(fieldName, fieldValue,
                Field.Store.YES, Field.Index.NOT_ANALYZED_NO_NORMS));
	}
    
    protected void addToDocument(Document doc, String fieldName, Collection<String> fieldValues) {
        for(String value : fieldValues) {
            addToDocument(doc, fieldName, value);
        }
    }
}
