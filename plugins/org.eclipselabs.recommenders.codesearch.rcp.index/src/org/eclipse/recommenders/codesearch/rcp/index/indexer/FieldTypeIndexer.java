/**
 * Copyright (c) 2010, 2012 Darmstadt University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Tobias Boehm - initial API and implementation.
 */

package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IFieldIndexer;

import com.google.common.base.Optional;

public class FieldTypeIndexer implements IFieldIndexer {

    @Override
    public void indexField(final Document document, final FieldDeclaration field) {
        final Optional<String> opt = BindingHelper.getIdentifier(field);
        if (opt.isPresent()) {
        	CodeIndexer.addFieldToDocument(document, Fields.FIELD_TYPE, opt.get());
        }
    }

}
