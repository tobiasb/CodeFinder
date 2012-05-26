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

package org.eclipselabs.recommenders.codesearch.rcp.dslQL1;

import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.converter.DotNotationTypeConverter;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.converter.IQueryPartConverter;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.extractors.ExtractorHelper;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.AndExp;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.BinaryExp;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.Expression;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.LuceneQueryFactory;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryFactoryImpl;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodName;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPatternDefinition;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Modifier;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ModifierValue;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterDefinition;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ReturnType;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Throws;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ParameterTypeImpl;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.queryhandler.ParameterDefinitionHandler;

import com.google.common.collect.Lists;

public class QL1QueryExtractor {

    private final LuceneQueryFactory lqf = new LuceneQueryFactoryImpl();

    public void preProcess(IParseResult parseResult) {
        final TreeIterator<EObject> iter = parseResult.getRootASTElement().eAllContents();

        if (iter.hasNext()) {
            do {
                final EObject o = iter.next();

                // The other types, ... are taken care of by
                // LuceneQueryExtractor
                if (o instanceof ParameterTypeImpl) {
                    IQueryPartConverter conv = new DotNotationTypeConverter();

                    final String oldValue = ((ParameterTypeImpl) o).getValue();

                    if (!oldValue.equals("..")) {
                        final String newValue = conv.convertFrom(oldValue);

                        ((ParameterTypeImpl) o).setValue(newValue);
                    }
                }

            } while (iter.hasNext());
        }
    }

    public EObject transform(IParseResult r) {

        preProcess(r);

        AndExp exp1 = lqf.createAndExp();
        exp1.setLeft(ExtractorHelper.getDocumentTypeExpression(Fields.TYPE_METHOD));
        exp1.setRight(transformInternal(r));
        exp1.setAnd(BinaryExp.AND1);

        // System.out.println(EmfFormatter.objToStr(exp1, (EStructuralFeature)
        // null));

        return exp1;
    }

    public MethodPatternDefinition getMethodPatternDefinition(IParseResult r) {
        return (MethodPatternDefinition) r.getRootASTElement().eAllContents().next();
    }

    private Expression transformInternal(IParseResult r) {
        MethodPatternDefinition methodPattern = getMethodPatternDefinition(r);

        List<EObject> exps = Lists.newArrayList();

        handle(exps, methodPattern.getModifier());
        handle(exps, methodPattern.getReturnType());
        handle(exps, methodPattern.getMethodName());
        handle(exps, methodPattern.getParameterDefinition());
        handle(exps, methodPattern.getThrowsClause());

        if (exps.size() > 0) {
            return ExtractorHelper.buildExpressionTree(exps);
        } else {
            /*
             * Basically an empty query. We append another trivial
             * "document must be type method" clause to have a valid emf-tree
             */
            return ExtractorHelper.getDocumentTypeExpression(Fields.TYPE_METHOD);
        }
    }

    private void handle(List<EObject> exps, Modifier o) {
        if (o != null) {

            for (ModifierValue m : o.getModifiers()) {
                exps.add(ExtractorHelper.getModifierFieldExpression(Fields.MODIFIERS, m.getValue()));
            }
        }
    }

    private void handle(List<EObject> exps, MethodName o) {
        if (o != null && isSpecified(o.getValue())) {
            exps.add(ExtractorHelper.getSimpleFieldExpression(Fields.SIMPLE_NAME, o.getValue()));
        }
    }

    private void handle(List<EObject> exps, ReturnType o) {
        if (o != null && isSpecified(o.getValue())) {
            exps.add(ExtractorHelper.getTypeExpression(Fields.RETURN_TYPE, o.getValue()));
        }
    }

    private void handle(List<EObject> exps, Throws o) {
        if (o != null && isSpecified(o.getValue())) {
            exps.add(ExtractorHelper.getTypeExpression(Fields.CHECKED_EXCEPTIONS, o.getValue()));
        }
    }

    private void handle(List<EObject> exps, ParameterDefinition o) {
        if (o != null) {
            ParameterDefinitionHandler handler = new ParameterDefinitionHandler();
            Expression e = handler.process(o);

            if (e != null)
                exps.add(e);
        }
    }

    private boolean isSpecified(String value) {
        return value != null && !value.equals("*");
    }
}
