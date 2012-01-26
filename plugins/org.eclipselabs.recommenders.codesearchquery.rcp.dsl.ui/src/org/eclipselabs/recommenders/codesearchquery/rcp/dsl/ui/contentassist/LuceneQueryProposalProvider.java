/*
* generated by Xtext
*/
package org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.contentassist;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.FieldNameImpl;

import com.google.common.collect.Maps;

/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
public class LuceneQueryProposalProvider extends AbstractLuceneQueryProposalProvider {
	
	private static HashMap<QueryProposalType, IQueryProposalProvider> provider = Maps.newHashMap();
	
	public LuceneQueryProposalProvider() {
		
	}
	
	public static void addQueryProposalProvider(QueryProposalType type, IQueryProposalProvider provider) {
		LuceneQueryProposalProvider.provider.put(type, provider);
	}
	
	@Override
	public void complete_TypeValue(EObject model, RuleCall ruleCall,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("complete_TypeValue: context: " + context.getSelectedText() + " " + context.getPrefix());
		
		IQueryProposalProvider p = provider.get(QueryProposalType.TYPE);
		
		if(p != null) {
			for(String type : p.getProposals()) {
				acceptor.accept(createCompletionProposal(p.convert(type), context));
			}
		}
	}
	
	@Override
	public void complete_FieldValue(EObject model, RuleCall ruleCall,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		FieldNameImpl fieldNameImpl = (FieldNameImpl)context.getPreviousModel().eContents().get(0);

		QueryProposalType type = getProposalType(fieldNameImpl);
		IQueryProposalProvider p = provider.get(type);
		
		if(p != null) {
			for(String s : p.getProposals()) {
				acceptor.accept(createCompletionProposal(p.convert(s), context));
			}
		}
		
		System.out.println("complete_FieldValue: context: " + context.getSelectedText() + " " + context.getPrefix());		
	}
	
	public static QueryProposalType getProposalType(FieldNameImpl fieldNameImpl) {
		if(fieldNameImpl.getModifiers() != null)
			return QueryProposalType.MODIFIER;
		
		if(fieldNameImpl.getResourcePath() != null)
			return QueryProposalType.RESOURCE_PATH; 

		return null;
	}
}
