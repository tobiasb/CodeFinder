package org.eclipselabs.recommenders.codesearch.rcp.dslQL1;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.EmfFormatter;
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
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterDefinition;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ReturnType;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Throws;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.queryhandler.Node;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.queryhandler.ParameterDefinitionHandler;

import com.google.common.collect.Lists;

public class QL1QueryExtractor implements IUnitOfWork<IParseResult, XtextResource> {

    private final LuceneQueryFactory lqf = new LuceneQueryFactoryImpl();

    public QL1QueryExtractor() {

    }

    @Override
    public IParseResult exec(XtextResource state) throws Exception {
        IParseResult r = state.getParseResult();
        return r;
    }

    public EObject transform(IParseResult r) {

        AndExp exp1 = lqf.createAndExp();
        exp1.setLeft(getMethodTypeExpression());
        exp1.setRight(transformInternal(r));
        exp1.setAnd(BinaryExp.AND1);

        System.out.println(EmfFormatter.objToStr(exp1, (EStructuralFeature) null));

        return exp1;
    }

    public MethodPatternDefinition getMethodPatternDefinition(IParseResult r) {
        return (MethodPatternDefinition) r.getRootASTElement().eAllContents().next();
    }

    private Expression transformInternal(IParseResult r) {
        MethodPatternDefinition methodPattern = getMethodPatternDefinition(r);

        List<EObject> exps = Lists.newArrayList();

        for (Modifier m : methodPattern.getModifiers())
            handle(exps, m);

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

    private void handle(List<EObject> exps, Modifier o) {
        if (o != null) {
            ClauseExpression clause = lqf.createClauseExpression();
            ModifierField field = lqf.createModifierField();
            field.setValue(Fields.MODIFIERS);
            clause.setField(field);
            clause.getValues().add(o.getValue());

            exps.add(clause);
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

    // public boolean isRelevant(String s, ParameterDefinition p) {
    // Node n = new ParameterDefinitionHandler().getParameterGraph(p, false);
    //
    // String[] actualParams = s.split(";");
    //
    // return paramGraphFitsActualParams(n, actualParams);
    // }

    public boolean paramGraphFitsActualParams(Node paramGraph, String[] params) {

        Node currentNode = paramGraph;

        for (String param : params) {
            if (!fits(currentNode, param))
                return false;

            if (currentNode != null) {
                currentNode = currentNode.nextNode;
            }
        }

        if (currentNode != null)
            return false;

        return true;
    }

    private boolean fits(Node n, String param) {
        if (n == null)
            return false;

        if (n.typeNames.contains(param))
            return true;

        if (n.typeNames.contains("*"))
            return true;

        return false;
    }
}
