package org.eclipselabs.recommenders.codesearch.rcp.dslQL1;

import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.converter.DotNotationTypeConverter;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.converter.IQueryPartConverter;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.AndExp;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.BinaryExp;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ClauseExpression;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.DocumentTypeField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.Expression;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.LuceneQueryFactory;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ModifierField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.SimpleField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.TypeField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryFactoryImpl;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.Fields;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodName;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPatternDefinition;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Modifier;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ModifierDefinition;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterDefinition;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ReturnType;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Throws;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ParameterTypeImpl;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.queryhandler.ParameterDefinitionHandler;

import com.google.common.collect.Lists;

public class QL1QueryExtractor implements IUnitOfWork<IParseResult, XtextResource> {

    private final LuceneQueryFactory lqf = new LuceneQueryFactoryImpl();

    @Override
    public IParseResult exec(XtextResource state) throws Exception {
        final TreeIterator<EObject> iter = state.getAllContents();

        if (iter.hasNext()) {
            do {
                final EObject o = iter.next();

                // The other types, ... are taken care of by
                // LuceneQueryExtractor
                if (o instanceof ParameterTypeImpl) {
                    IQueryPartConverter conv = new DotNotationTypeConverter();

                    final String oldValue = ((ParameterTypeImpl) o).getValue();
                    final String newValue = conv.convertFrom(oldValue);
                    ((ParameterTypeImpl) o).setValue(newValue);
                }

            } while (iter.hasNext());
        }

        IParseResult r = state.getParseResult();
        return r;
    }

    public EObject transform(IParseResult r) {

        AndExp exp1 = lqf.createAndExp();
        exp1.setLeft(getMethodTypeExpression());
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

        handle(exps, methodPattern.getModifierDefinition());
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
            return getMethodTypeExpression();
        }
    }

    private void handle(List<EObject> exps, ModifierDefinition o) {
        if (o != null) {

            for (Modifier m : o.getModifiers()) {
                ClauseExpression clause = lqf.createClauseExpression();
                ModifierField field = lqf.createModifierField();
                field.setValue(Fields.MODIFIERS);
                clause.setField(field);
                clause.getValues().add(m.getValue());

                exps.add(clause);
            }
        }
    }

    private void handle(List<EObject> exps, MethodName o) {
        if (o != null && isSpecified(o.getValue())) {
            ClauseExpression clause = lqf.createClauseExpression();
            SimpleField field = lqf.createSimpleField();
            field.setValue(Fields.SIMPLE_NAME);
            clause.setField(field);
            clause.getValues().add(o.getValue());

            exps.add(clause);
        }
    }

    private void handle(List<EObject> exps, ReturnType o) {
        if (o != null && isSpecified(o.getValue())) {
            ClauseExpression clause = lqf.createClauseExpression();
            TypeField field = lqf.createTypeField();
            field.setValue(Fields.RETURN_TYPE);
            clause.setField(field);
            clause.getValues().add(o.getValue());

            exps.add(clause);
        }
    }

    private void handle(List<EObject> exps, Throws o) {
        if (o != null && isSpecified(o.getValue())) {
            ClauseExpression clause = lqf.createClauseExpression();
            TypeField field = lqf.createTypeField();
            field.setValue(Fields.CHECKED_EXCEPTIONS);
            clause.setField(field);
            clause.getValues().add(o.getValue());

            exps.add(clause);
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
        return !value.equals("*");
    }

    private Expression getMethodTypeExpression() {

        Expression left = lqf.createExpression();
        ClauseExpression clause = lqf.createClauseExpression();
        DocumentTypeField type = lqf.createDocumentTypeField();
        type.setValue(Fields.TYPE);
        clause.setField(type);
        clause.getValues().add(Fields.TYPE_METHOD);
        left.setValue(clause);

        return left;
    }
}
