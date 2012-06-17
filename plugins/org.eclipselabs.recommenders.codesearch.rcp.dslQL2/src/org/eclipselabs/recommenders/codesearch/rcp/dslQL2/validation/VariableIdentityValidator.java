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

package org.eclipselabs.recommenders.codesearch.rcp.dslQL2.validation;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.CodeSearcher;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.SearchResultHelper;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.VariableParameterUsage;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.VariableUsage;

import com.google.common.collect.Lists;

public class VariableIdentityValidator {

    public TopDocs checkIdentity(CodeSearcher codeSearcher, TopDocs docs, VariableUsage var)
            throws CorruptIndexException, IOException {

        List<ScoreDoc> validDocs = Lists.newArrayList();

        for (ScoreDoc scoreDoc : docs.scoreDocs) {
            Document doc = codeSearcher.getDocument(scoreDoc.doc);

            if (isValid(doc, var)) {
                validDocs.add(scoreDoc);
            }
        }

        return SearchResultHelper.asTopDocs(validDocs);
    }

    private boolean isValid(Document doc, VariableUsage var) {
        Map<String, List<VariableParameterUsage>> m1 = ValidatorHelper.getVarParamUsagesByVarName(var);
        Map<String, List<String>> m2 = ValidatorHelper.getVarParamUsagesByVarName(doc);

        for (List<VariableParameterUsage> l : m1.values()) {
            if (!hasCorrespondingVarSet(l, m2))
                return false;
        }

        return true;
    }

    private boolean hasCorrespondingVarSet(List<VariableParameterUsage> m1, Map<String, List<String>> m2) {
        for (List<String> s : m2.values()) {
            if (matches(m1, s))
                return true;
        }

        return false;
    }

    private boolean matches(List<VariableParameterUsage> m1, List<String> m2) {
        for (VariableParameterUsage p : m1) {
            boolean found = false;

            for (String s : m2) {
                if (matches(p, s))
                    found = true;
            }

            if (!found)
                return false;
        }

        return true;
    }

    private boolean matches(VariableParameterUsage p, String methodSignature) {
        return methodSignature.contains(p.method);
    }
}
