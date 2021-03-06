/**
 * Copyright (c) 2012 Tobias Boehm.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Tobias Boehm - initial API and implementation.
 */

/*
 * generated by Xtext
 */
package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui.contentassist;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.contentassist.IQueryProposalProvider;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.contentassist.QueryProposalType;

import com.google.common.collect.Maps;

/**
 * see
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on
 * how to customize content assistant
 */
public class QL1ProposalProvider extends AbstractQL1ProposalProvider {

    private static HashMap<QueryProposalType, IQueryProposalProvider> provider = Maps.newHashMap();

    public static void addQueryProposalProvider(QueryProposalType type, IQueryProposalProvider provider) {
        QL1ProposalProvider.provider.put(type, provider);
    }

    @Override
    public void complete_TypeFieldValue(EObject model, RuleCall ruleCall, ContentAssistContext context,
            ICompletionProposalAcceptor acceptor) {

        fillProposals(QueryProposalType.TYPE, context, acceptor);
    }

    private void fillProposals(QueryProposalType proposalType, ContentAssistContext context,
            ICompletionProposalAcceptor acceptor) {

        IQueryProposalProvider p = provider.get(proposalType);

        if (p != null) {
            for (String type : p.getProposals()) {
                if (type == null)
                    continue;

                String proposal = p.convert(type);
                acceptor.accept(createCompletionProposal(proposal, proposal, p.getImage(), context));
            }
        }
    }
}
