/**
 * Copyright (c) 2012 Tobias Boehm.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Tobias Boehm - initial API and implementation.
 */

package org.eclipselabs.recommenders.test.codesearch.rcp.dslQL2;

import java.util.List;

import org.eclipse.recommenders.codesearch.rcp.index.indexer.DeclaringMethodIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.DeclaringTypeIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.DocumentTypeIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.JavaElementHandleIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.ResourcePathIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.VariableDefinitionIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.VariableNameIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.VariableParameterUsageIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.VariableTargetUsageIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.VariableTypeIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IIndexer;
import org.eclipselabs.recommenders.test.codesearch.QLTestBase;
import org.junit.Ignore;

import com.google.common.collect.Lists;

@Ignore("This is a base class")
public class QL2TestBase extends QLTestBase {

    protected List<IIndexer> getVarUsageIndexer() {
        final List<IIndexer> list = Lists.newArrayList();
        list.add(new DeclaringMethodIndexer());
        list.add(new DeclaringTypeIndexer());
        list.add(new DocumentTypeIndexer());
        list.add(new JavaElementHandleIndexer());
        list.add(new ResourcePathIndexer());
        list.add(new VariableDefinitionIndexer());
        list.add(new VariableNameIndexer());
        list.add(new VariableParameterUsageIndexer());
        list.add(new VariableTargetUsageIndexer());
        list.add(new VariableTypeIndexer());

        return list;
    }
}
