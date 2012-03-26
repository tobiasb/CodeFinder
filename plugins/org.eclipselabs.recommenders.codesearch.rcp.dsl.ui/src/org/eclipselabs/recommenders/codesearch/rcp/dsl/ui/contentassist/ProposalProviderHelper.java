package org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.contentassist;

import java.util.HashMap;

import org.eclipse.jface.viewers.StyledString;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalFactory;

public class ProposalProviderHelper {
    public static void fillProposals(QueryProposalType proposalType, ContentAssistContext context,
            ICompletionProposalAcceptor acceptor, ICompletionProposalFactory proposalFactory,
            HashMap<QueryProposalType, IQueryProposalProvider> providerMap) {

        fillProposals(proposalType, context, acceptor, proposalFactory, providerMap, null);
    }

    public static void fillProposals(QueryProposalType proposalType, ContentAssistContext context,
            ICompletionProposalAcceptor acceptor, ICompletionProposalFactory proposalFactory,
            HashMap<QueryProposalType, IQueryProposalProvider> providerMap, Object arg1) {

        IQueryProposalProvider p = providerMap.get(proposalType);
        p.setArgument(0, arg1);

        if (p != null) {
            for (String type : p.getProposals()) {
                if (type == null)
                    continue;

                String proposal = p.convert(type);
                acceptor.accept(proposalFactory.createCompletionProposal(proposal, new StyledString(proposal),
                        p.getImage(), context));
            }
        }
    }
}