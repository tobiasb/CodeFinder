package org.eclipselabs.recommenders.codesearch.rcp.dslQL2;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.extractors.ExtractorHelper;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.AndExp;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.BinaryExp;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ClauseExpression;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.Expression;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.LuceneQueryFactory;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.MethodField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryFactoryImpl;

import com.google.common.collect.Lists;

public class QL2QueryExtractor {

    private final LuceneQueryFactory lqf = new LuceneQueryFactoryImpl();

    public EObject createLuceneQuery(VariableUsage v) {

        AndExp exp1 = lqf.createAndExp();
        exp1.setLeft(getVarUsageTypeExpression());
        exp1.setRight(transformInternal(v));
        exp1.setAnd(BinaryExp.AND1);

        // System.out.println(EmfFormatter.objToStr(exp1, (EStructuralFeature)
        // null));

        return exp1;
    }

    private Expression transformInternal(VariableUsage v) {

        List<EObject> exps = Lists.newArrayList();

        exps.add(getVariableTypeExpression(v));
        exps.add(getDefinitionTypeExpression(v));

        for (String calledMethod : v.calledMethodsOnVariable) {
            exps.add(getUsedAsTargetMethodExpression(calledMethod));
        }

        for (VariableParameterUsage varParamUsage : v.parameterUsages) {
            exps.add(getUsedAsParameterExpression(varParamUsage));
        }

        if (exps.size() > 0) {
            return ExtractorHelper.buildExpressionTree(exps);
        } else {
            /*
             * Basically an empty query. We append another trivial
             * "document must be type varusage" clause to have a valid emf-tree
             */
            return getVarUsageTypeExpression();
        }
    }

    private ClauseExpression getUsedAsTargetMethodExpression(String calledMethodName) {
        return ExtractorHelper.getMethodFieldExpression(Fields.USED_AS_TAGET_FOR_METHODS, "*" + calledMethodName);
    }

    private ClauseExpression getUsedAsParameterExpression(VariableParameterUsage varParamUsage) {
        ClauseExpression c = lqf.createClauseExpression();
        MethodField f = lqf.createMethodField();
        f.setValue(Fields.USED_AS_PARAMETER_IN_METHODS);
        c.setField(f);

        if (varParamUsage.targetVariable != null)
            c.getValues().add("*" + varParamUsage.targetVariable.type + "." + varParamUsage.method);
        else
            c.getValues().add("*" + varParamUsage.method);
        return c;
    }

    private ClauseExpression getDefinitionTypeExpression(VariableUsage v) {
        return ExtractorHelper.getDefinitionTypeExpression(Fields.VARIABLE_DEFINITION, v.origin);
    }

    private ClauseExpression getVariableTypeExpression(VariableUsage v) {
        return ExtractorHelper.getTypeExpression(Fields.VARIABLE_TYPE, v.type);
    }

    private Expression getVarUsageTypeExpression() {
        return ExtractorHelper.getDocumentTypeExpression(Fields.TYPE_VARUSAGE);
    }
}
