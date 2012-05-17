package org.eclipse.recommenders.codesearch.rcp.index.indexer;

public class CodeIndexerConfigBean {
	final private boolean deleteDocumentFirst;
	final private float documentBoost;
	
	public CodeIndexerConfigBean(boolean deleteDocumentFirst, float documentBoost) {
		this.deleteDocumentFirst = deleteDocumentFirst;
		this.documentBoost = documentBoost;
	}
	
	public boolean isDeleteDocumentFirst() {
		return deleteDocumentFirst;
	}

	public float getDocumentBoost() {
		return documentBoost;
	}
}
