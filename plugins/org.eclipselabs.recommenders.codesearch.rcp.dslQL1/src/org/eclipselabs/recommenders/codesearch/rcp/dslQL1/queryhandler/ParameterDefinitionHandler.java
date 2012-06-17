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

package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.queryhandler;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.extractors.ExtractorHelper;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.BinaryExp;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ClauseExpression;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.Expression;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.LuceneQueryFactory;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.NumberField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.SimpleField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryFactoryImpl;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MultiElement;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterDefinition;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterElementHolder;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.SingleElement;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ParameterDefinitionImpl;

import com.google.common.collect.Lists;

public class ParameterDefinitionHandler {
    private final LuceneQueryFactory lqf = new LuceneQueryFactoryImpl();

    public Expression process(final EObject o) {
        final List<ClauseExpression> l = Lists.newArrayList();

        if (!(o instanceof ParameterDefinitionImpl))
            return null;

        return processInternal(l, (ParameterDefinitionImpl) o);
    }

    private Expression processInternal(List<ClauseExpression> l, final ParameterDefinitionImpl p) {
        List<StringBuilder> parameterOptions = new NodeWalker().walk(getParameterGraph(p, true));

        if (parameterOptions.size() > 0) {
            return ExtractorHelper.buildExpressionTree(convertToClauseExpressions(parameterOptions), BinaryExp.OR1);
        } else {
            return getZeroParametersExpression();
        }
    }

    public Node getParameterGraph(final ParameterDefinition p, boolean convertWildcardParameters) {
        Node startNode = null;
        Node currentNode = null;

        for (ParameterElementHolder e : p.getParameterElementholder()) {

            if (startNode == null) {
                startNode = new Node();
                currentNode = startNode;
            } else {
                currentNode.nextNode = new Node();
                currentNode.nextNode.prevNode = currentNode;
                currentNode = currentNode.nextNode;
            }

            EObject element = e.getElement();
            if (element instanceof SingleElement) {
                currentNode.typeNames.add(getSingleElementValue(element, convertWildcardParameters));
            } else if (element instanceof MultiElement) {
                for (SingleElement selement : ((MultiElement) element).getElements()) {
                    currentNode.typeNames.add(getSingleElementValue(selement, convertWildcardParameters));
                }
            } else {
                throw new IllegalStateException(element.eClass().getName() + " is unknown");
            }
        }

        return startNode;
    }

    private String getSingleElementValue(EObject e, boolean convertWildcardParameters) {
        final String value = ((SingleElement) e).getValue().getValue();

        if (convertWildcardParameters) {
            if (value.equals(".."))
                return "*";
        }

        return value;
    }

    private List<EObject> convertToClauseExpressions(List<StringBuilder> parameterOptions) {
        final List<EObject> l = Lists.newArrayList();

        for (StringBuilder sb : parameterOptions) {
            ClauseExpression clause = lqf.createClauseExpression();
            SimpleField field = lqf.createSimpleField();
            field.setValue(Fields.PARAMETER_TYPES_STRUCTURAL);
            clause.setField(field);
            clause.getValues().add(sb.toString());

            l.add(clause);
        }

        return l;
    }

    private Expression getZeroParametersExpression() {
        Expression exp = lqf.createExpression();
        ClauseExpression clause = lqf.createClauseExpression();
        NumberField type = lqf.createNumberField();
        type.setValue(Fields.PARAMETER_COUNT);
        clause.setField(type);
        clause.getValues().add(String.valueOf(0));
        exp.setValue(clause);

        return exp;
    }
}
