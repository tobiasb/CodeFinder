package org.eclipselabs.recommenders.codesearch.rcp.dslQL2;

import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.AndExp;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.BinaryExp;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ClauseExpression;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.DefinitionType;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.DocumentTypeField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.Expression;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.LuceneQueryFactory;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.MethodField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.TypeField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryFactoryImpl;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.Fields;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ExtractorHelper;

import com.google.common.collect.Lists;

public class QL2QueryExtractor implements IUnitOfWork<IParseResult, XtextResource> {

    private final LuceneQueryFactory lqf = new LuceneQueryFactoryImpl();

    @Override
    public IParseResult exec(XtextResource state) throws Exception {
        final TreeIterator<EObject> iter = state.getAllContents();

        // if (iter.hasNext()) {
        // do {
        // final EObject o = iter.next();
        //
        // // The other types, ... are taken care of by
        // // LuceneQueryExtractor
        // if (o instanceof ParameterTypeImpl) {
        // IQueryPartConverter conv = new DotNotationTypeConverter();
        //
        // final String oldValue = ((ParameterTypeImpl) o).getValue();
        // final String newValue = conv.convertFrom(oldValue);
        // ((ParameterTypeImpl) o).setValue(newValue);
        // }
        //
        // } while (iter.hasNext());
        // }

        IParseResult r = state.getParseResult();
        return r;
    }

    public EObject transform(VariableUsage v) {
        // Map<String, VariableUsage> map = new
        // VariableExtractor().getVars(r.getRootASTElement());

        AndExp exp1 = lqf.createAndExp();
        exp1.setLeft(getVarUsageTypeExpression());
        exp1.setRight(transformInternal(v));
        exp1.setAnd(BinaryExp.AND1);

        // Set<VariableUsage> d = new
        // VariableExtractor().getVars(r.getRootASTElement());

        // System.out.println(EmfFormatter.objToStr(exp1, (EStructuralFeature)
        // null));

        return exp1;
    }

    private Expression transformInternal(VariableUsage v) {

        List<EObject> exps = Lists.newArrayList();

        exps.add(getVariableTypeExpression(v));
        exps.add(getDefinitionTypeExpression(v));

        for (String calledMethod : v.calledMethodsOnVariable) {
            exps.add(getCalledMethodExpression(calledMethod));
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

    private ClauseExpression getCalledMethodExpression(String calledMethod) {
        ClauseExpression c = lqf.createClauseExpression();
        MethodField f = lqf.createMethodField();
        f.setValue(Fields.USED_AS_TAGET_FOR_METHODS);
        c.setField(f);
        c.getValues().add("*" + calledMethod);
        return c;
    }

    private ClauseExpression getDefinitionTypeExpression(VariableUsage v) {
        ClauseExpression clause = lqf.createClauseExpression();
        DefinitionType field = lqf.createDefinitionType();
        field.setValue(Fields.VARIABLE_DEFINITION);
        clause.setField(field);
        clause.getValues().add(v.origin);
        return clause;
    }

    private ClauseExpression getVariableTypeExpression(VariableUsage v) {
        ClauseExpression clause = lqf.createClauseExpression();
        TypeField field = lqf.createTypeField();
        field.setValue(Fields.VARIABLE_TYPE);
        clause.setField(field);
        clause.getValues().add(v.type);
        return clause;
    }

    private Expression getVarUsageTypeExpression() {

        Expression left = lqf.createExpression();
        ClauseExpression clause = lqf.createClauseExpression();
        DocumentTypeField type = lqf.createDocumentTypeField();
        type.setValue(Fields.TYPE);
        clause.setField(type);
        clause.getValues().add(Fields.TYPE_VARUSAGE);
        left.setValue(clause);

        return left;
    }
}
