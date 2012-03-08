package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.queryhandler;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.BinaryExp;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ClauseExpression;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.Expression;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.LuceneQueryFactory;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.SimpleField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryFactoryImpl;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.Fields;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ExtractorHelper;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MultiElement;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterDefinition;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterElementHolder;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.SingleElement;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ParameterDefinitionImpl;

import com.google.common.collect.Lists;

public class ParameterDefinitionHandler {
    private final LuceneQueryFactory lqf = new LuceneQueryFactoryImpl();

    // private enum OrderInfo {
    // First, Middle, Last
    // }

    public Expression process(final EObject o) {
        final List<ClauseExpression> l = Lists.newArrayList();

        if (!(o instanceof ParameterDefinitionImpl))
            return null;

        return processInternal(l, (ParameterDefinitionImpl) o);
    }

    private Expression processInternal(List<ClauseExpression> l, final ParameterDefinitionImpl p) {
        List<StringBuilder> list = new NodeWalker().walk(getParameterGraph(p, true));

        if (list.size() > 0)
            return ExtractorHelper.buildExpressionTree(convert(list), BinaryExp.OR1);
        else
            return null;
    }

    public Node getParameterGraph(final ParameterDefinition p, boolean convertWildcardParameters) {
        Node startNode = null;
        Node currentNode = null;

        for (ParameterElementHolder e : p.getParameterElementholder()) {
            // OrderInfo orderInfo = getOrderInfo(p.getParameterElementholder(),
            // e);
            if (startNode == null) {
                startNode = new Node();
                currentNode = startNode;
            } else {
                currentNode.nextNode = new Node();
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

            // if (element instanceof SingleElement) {
            // handle(l, (SingleElement) element);
            // } else if (element instanceof MultiElement) {
            // handle(l, (MultiElement) element);
            // } else {
            // throw new IllegalStateException(element.eClass().getName() +
            // " is unknown");
            // }
        }

        return startNode;
    }

    // private OrderInfo getOrderInfo(List<ParameterElementHolder> list,
    // ParameterElementHolder e) {
    // final int indexOfE = list.indexOf(e);
    //
    // if (indexOfE == 0)
    // return OrderInfo.First;
    //
    // if (indexOfE == list.size() - 1)
    // return OrderInfo.Last;
    //
    // return OrderInfo.Middle;
    // }

    private String getSingleElementValue(EObject e, boolean convertWildcardParameters) {
        final String value = ((SingleElement) e).getValue().getValue();

        if (convertWildcardParameters) {
            if (value.equals(".."))
                return "*";
        }

        return value;
    }

    private List<EObject> convert(List<StringBuilder> list) {
        final List<EObject> l = Lists.newArrayList();

        for (StringBuilder sb : list) {
            ClauseExpression clause = lqf.createClauseExpression();
            SimpleField field = lqf.createSimpleField();
            field.setValue(Fields.PARAMETER_TYPES_STRUCTURAL);
            clause.setField(field);
            clause.getValues().add(sb.toString());

            l.add(clause);
        }

        return l;
    }

    // private void handle(List<ClauseExpression> l, MultiElement e) {
    // for (SingleElement element : e.getElements()) {
    // handle(l, element);
    // }
    // }
    //
    // private void handle(List<ClauseExpression> l, SingleElement e) {
    // if (!shouldConsider(e))
    // return;
    //
    // ClauseExpression clause = lqf.createClauseExpression();
    // TypeField field = lqf.createTypeField();
    // field.setValue(Fields.PARAMETER_TYPES);
    // clause.setField(field);
    // clause.getValues().add(e.getValue().getValue());
    //
    // l.add(clause);
    // }
    //
    // private boolean shouldConsider(SingleElement e) {
    // String value = e.getValue().getValue();
    // return value != null && !value.equals("*") && !value.equals("..");
    // }
}
