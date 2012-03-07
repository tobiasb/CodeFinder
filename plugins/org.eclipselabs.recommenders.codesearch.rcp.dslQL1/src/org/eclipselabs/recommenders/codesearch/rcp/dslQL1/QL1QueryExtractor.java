package org.eclipselabs.recommenders.codesearch.rcp.dslQL1;

import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.EmfFormatter;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.BinaryExp;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ClauseExpression;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.DocumentTypeField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.Exp1;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.Expression;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.LuceneQueryFactory;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ModifierField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.SimpleField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.TypeField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryFactoryImpl;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.Fields;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MethodNameImpl;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ModifierImpl;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ReturnTypeImpl;

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

        Exp1 exp1 = lqf.createExp1();
        exp1.setLeft(getMethodTypeExpression());
        exp1.setRight(transformInternal(r));
        exp1.setB(BinaryExp.AND1);

        System.out.println(EmfFormatter.objToStr(exp1, (EStructuralFeature) null));

        return exp1;
    }

    private Expression transformInternal(IParseResult r) {
        TreeIterator<EObject> iter = r.getRootASTElement().eAllContents();

        // Expression e = luceneQueryFactory.cre
        List<ClauseExpression> exps = Lists.newArrayList();

        if (!iter.hasNext())
            return null;

        do {
            final EObject o = iter.next();

            if (o instanceof ModifierImpl) {
                ClauseExpression clause = lqf.createClauseExpression();
                ModifierField field = lqf.createModifierField();
                field.setValue(Fields.MODIFIERS);
                clause.setField(field);
                clause.getValues().add(((ModifierImpl) o).getValue());

                exps.add(clause);
            } else if (o instanceof MethodNameImpl && isSpecified(((MethodNameImpl) o).getValue())) {

                ClauseExpression clause = lqf.createClauseExpression();
                SimpleField field = lqf.createSimpleField();
                field.setValue(Fields.SIMPLE_NAME);
                clause.setField(field);
                clause.getValues().add(((MethodNameImpl) o).getValue());

                exps.add(clause);
            } else if (o instanceof ReturnTypeImpl && isSpecified(((ReturnTypeImpl) o).getValue())) {
                ClauseExpression clause = lqf.createClauseExpression();
                TypeField field = lqf.createTypeField();
                field.setValue(Fields.RETURN_TYPE);
                clause.setField(field);
                clause.getValues().add(((ReturnTypeImpl) o).getValue());

                exps.add(clause);
            } else {
                System.out.println("Can't handle EObjects of type " + o.getClass().getSimpleName());
            }

        } while (iter.hasNext());

        return buildExpressionTree(exps);
    }

    private boolean isSpecified(String value) {
        return !value.equals("*");
    }

    private Expression buildExpressionTree(List<ClauseExpression> list) {
        Expression e = null;

        if (list.size() == 1) {
            e = lqf.createExpression();
            e.setValue(list.get(0));
        } else if (list.size() > 1) {
            Exp1 exp1 = lqf.createExp1();

            exp1.setLeft(buildExpressionTree(list.subList(0, 1)));
            exp1.setRight(buildExpressionTree(list.subList(1, list.size())));
            exp1.setB(BinaryExp.AND1);

            e = exp1;
        }

        return e;
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
