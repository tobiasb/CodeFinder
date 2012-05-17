/**
 * Copyright (c) 2010, 2012 Darmstadt University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Tobias Boehm - initial API and implementation.
 */

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

        if (p != null) {
        	p.setArgument(0, arg1);
        
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
