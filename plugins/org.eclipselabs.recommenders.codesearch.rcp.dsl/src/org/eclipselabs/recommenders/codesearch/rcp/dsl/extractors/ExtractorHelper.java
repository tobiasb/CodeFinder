package org.eclipselabs.recommenders.codesearch.rcp.dsl.extractors;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.AndExp;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.BinaryExp;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ClauseExpression;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.DefinitionType;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.DocumentTypeField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.Expression;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.LuceneQueryFactory;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.MethodField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ModifierField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.OrExp;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.SimpleField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.TypeField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryFactoryImpl;

public class ExtractorHelper {
    private static final LuceneQueryFactory lqf = new LuceneQueryFactoryImpl();

    public static Expression buildExpressionTree(List<EObject> list) {
        return buildExpressionTree(list, BinaryExp.AND1);
    }

    public static Expression buildExpressionTree(List<EObject> list, BinaryExp bin) {
        Expression e = null;

        if (list.size() == 1) {
            EObject singleObject = list.get(0);

            if (singleObject instanceof ClauseExpression) {
                e = lqf.createExpression();
                e.setValue((ClauseExpression) singleObject);
            } else if (singleObject instanceof Expression) {
                e = (Expression) singleObject;
            }
        } else if (list.size() > 1) {
            if (bin == BinaryExp.AND1) {

                AndExp exp1 = lqf.createAndExp();
                exp1.setAnd(bin);

                e = exp1;
            } else {
                OrExp exp1 = lqf.createOrExp();
                exp1.setOr(bin);

                e = exp1;
            }

            e.setLeft(buildExpressionTree(list.subList(0, 1), bin));
            e.setRight(buildExpressionTree(list.subList(1, list.size()), bin));
        }

        return e;
    }

    public static Expression getDocumentTypeExpression(String documentType) {

        Expression left = lqf.createExpression();
        ClauseExpression clause = lqf.createClauseExpression();
        DocumentTypeField type = lqf.createDocumentTypeField();
        type.setValue(Fields.TYPE);
        clause.setField(type);
        clause.getValues().add(documentType);
        left.setValue(clause);

        return left;
    }

    public static ClauseExpression getMethodFieldExpression(String fieldString, String valueString) {
        ClauseExpression c = lqf.createClauseExpression();
        MethodField f = lqf.createMethodField();
        f.setValue(fieldString);
        c.setField(f);
        c.getValues().add(valueString);
        return c;
    }

    public static ClauseExpression getTypeExpression(String fieldString, String valueString) {
        ClauseExpression clause = lqf.createClauseExpression();
        TypeField field = lqf.createTypeField();
        field.setValue(fieldString);
        clause.setField(field);
        clause.getValues().add(valueString);
        return clause;
    }

    public static ClauseExpression getModifierFieldExpression(String fieldString, String valueString) {
        ClauseExpression clause = lqf.createClauseExpression();
        ModifierField field = lqf.createModifierField();
        field.setValue(fieldString);
        clause.setField(field);
        clause.getValues().add(valueString);
        return clause;
    }

    public static ClauseExpression getSimpleFieldExpression(String fieldString, String valueString) {
        ClauseExpression clause = lqf.createClauseExpression();
        SimpleField field = lqf.createSimpleField();
        field.setValue(fieldString);
        clause.setField(field);
        clause.getValues().add(valueString);
        return clause;
    }

    public static ClauseExpression getDefinitionTypeExpression(String fieldString, String valueString) {
        ClauseExpression clause = lqf.createClauseExpression();
        DefinitionType field = lqf.createDefinitionType();
        field.setValue(fieldString);
        clause.setField(field);
        clause.getValues().add(valueString);
        return clause;
    }
}
