/*
 * generated by Xtext
 */
package org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui.contentassist;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.converter.DotNotationTypeConverter;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalFactory;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.EmfHelper;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.contentassist.IQueryProposalProvider;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.contentassist.ProposalProviderHelper;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.contentassist.QueryProposalType;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.VariableExtractor;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.VariableUsage;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.MethodCall;

import com.google.common.collect.Maps;

/**
 * see
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on
 * how to customize content assistant
 */
public class QL2ProposalProvider extends AbstractQL2ProposalProvider {

    private static HashMap<QueryProposalType, IQueryProposalProvider> provider = Maps.newHashMap();

    public static void addQueryProposalProvider(QueryProposalType type, IQueryProposalProvider provider) {
        QL2ProposalProvider.provider.put(type, provider);
    }

    @Override
    public void complete_Name(EObject model, RuleCall ruleCall, ContentAssistContext context,
            ICompletionProposalAcceptor acceptor) {
        EObject root = EmfHelper.getRoot(model);
        VariableExtractor e = new VariableExtractor();

        Set<String> varNames = e.getVars(root).keySet();

        for (String varName : varNames) {
            acceptor.accept(createCompletionProposal(varName, context));
        }
    }

    @Override
    public void complete_CalledMethodName(EObject model, RuleCall ruleCall, ContentAssistContext context,
            ICompletionProposalAcceptor acceptor) {

        EObject root = EmfHelper.getRoot(model);
        VariableExtractor e = new VariableExtractor();
        Map<String, VariableUsage> vars = e.getVars(root);

        Object variableType = null;

        String nameCallee = ((MethodCall) model).getNameCallee().getValue();

        if (vars.containsKey(nameCallee)) {
            VariableUsage calleeVar = vars.get(nameCallee);

            DotNotationTypeConverter conv = new DotNotationTypeConverter();
            variableType = conv.convertFrom(calleeVar.type);

        }

        fillMethodNameProposals(context, acceptor, this, provider, variableType);
    }

    @Override
    public void complete_Type(EObject model, RuleCall ruleCall, ContentAssistContext context,
            ICompletionProposalAcceptor acceptor) {

        ProposalProviderHelper.fillProposals(QueryProposalType.TYPE, context, acceptor, this, provider);
    }

    private static void fillMethodNameProposals(ContentAssistContext context, ICompletionProposalAcceptor acceptor,
            ICompletionProposalFactory proposalFactory, HashMap<QueryProposalType, IQueryProposalProvider> providerMap,
            Object arg1) {

        IQueryProposalProvider p = providerMap.get(QueryProposalType.METHOD);

        if (p != null) {
        	p.setArgument(0, arg1);
        	
            for (String type : p.getProposals()) {
                if (type == null)
                    continue;

                String proposal = p.convert(type);

                String methodName = getRawMethodNameWithBrackets(proposal);

                acceptor.accept(proposalFactory.createCompletionProposal(methodName, new StyledString(methodName),
                        p.getImage(), context));
            }
        }
    }

    public static String getRawMethodNameWithBrackets(String qualifiedMethodName) {
        String methodWoReturnType = qualifiedMethodName.substring(0, qualifiedMethodName.indexOf("("));

        return methodWoReturnType.substring(methodWoReturnType.lastIndexOf(".") + 1) + "()";
    }
}
