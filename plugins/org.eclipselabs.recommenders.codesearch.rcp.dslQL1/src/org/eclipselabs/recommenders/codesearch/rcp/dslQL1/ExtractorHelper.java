package org.eclipselabs.recommenders.codesearch.rcp.dslQL1;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.AndExp;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.BinaryExp;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ClauseExpression;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.Expression;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.LuceneQueryFactory;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.OrExp;
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
}
