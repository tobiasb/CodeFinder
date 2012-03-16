package org.eclipselabs.recommenders.codesearch.rcp.dslQL2;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.IQueryExtractor;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.AndExp;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.BinaryExp;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ClauseExpression;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.DocumentTypeField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.Expression;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.LuceneQueryFactory;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.TypeField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryFactoryImpl;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.Fields;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ExtractorHelper;

import com.google.common.collect.Lists;

public class QL2QueryExtractor implements IUnitOfWork<IParseResult, XtextResource>, IQueryExtractor {

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

    public EObject transform(IParseResult r) {
        Map<String, VariableUsage> map = new VariableExtractor().getVars(r.getRootASTElement());

        AndExp exp1 = lqf.createAndExp();
        exp1.setLeft(getVarUsageTypeExpression());
        exp1.setRight(transformInternal(r, map));
        exp1.setAnd(BinaryExp.AND1);

        // Set<VariableUsage> d = new
        // VariableExtractor().getVars(r.getRootASTElement());

        // System.out.println(EmfFormatter.objToStr(exp1, (EStructuralFeature)
        // null));

        return exp1;
    }

    private Expression transformInternal(IParseResult r, Map<String, VariableUsage> map) {

        List<EObject> exps = Lists.newArrayList();

        for (VariableUsage var : map.values()) {
            ClauseExpression clause = lqf.createClauseExpression();
            TypeField field = lqf.createTypeField();
            field.setValue(Fields.VARIABLE_TYPE);
            clause.setField(field);
            clause.getValues().add(var.type);

            exps.add(clause);
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
