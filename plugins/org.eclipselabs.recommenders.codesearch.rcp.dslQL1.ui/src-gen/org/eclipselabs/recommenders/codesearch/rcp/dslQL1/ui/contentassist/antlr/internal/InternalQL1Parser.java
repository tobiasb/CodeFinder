package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.services.QL1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQL1Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAMEWITHWC", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "','", "'{'", "'}'", "'throws'", "'static'", "'private'", "'public'", "'final'", "'abstract'", "'protected'", "'..'"
    };
    public static final int RULE_ID=5;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_NAMEWITHWC=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalQL1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQL1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQL1Parser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g"; }


     
     	private QL1GrammarAccess grammarAccess;
     	
        public void setGrammarAccess(QL1GrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleMethodPattern"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:60:1: entryRuleMethodPattern : ruleMethodPattern EOF ;
    public final void entryRuleMethodPattern() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:61:1: ( ruleMethodPattern EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:62:1: ruleMethodPattern EOF
            {
             before(grammarAccess.getMethodPatternRule()); 
            pushFollow(FOLLOW_ruleMethodPattern_in_entryRuleMethodPattern61);
            ruleMethodPattern();

            state._fsp--;

             after(grammarAccess.getMethodPatternRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodPattern68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethodPattern"


    // $ANTLR start "ruleMethodPattern"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:69:1: ruleMethodPattern : ( ( rule__MethodPattern__Group__0 ) ) ;
    public final void ruleMethodPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:73:2: ( ( ( rule__MethodPattern__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:74:1: ( ( rule__MethodPattern__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:74:1: ( ( rule__MethodPattern__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:75:1: ( rule__MethodPattern__Group__0 )
            {
             before(grammarAccess.getMethodPatternAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:76:1: ( rule__MethodPattern__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:76:2: rule__MethodPattern__Group__0
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group__0_in_ruleMethodPattern94);
            rule__MethodPattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodPatternAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodPattern"


    // $ANTLR start "entryRuleModifier"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:88:1: entryRuleModifier : ruleModifier EOF ;
    public final void entryRuleModifier() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:89:1: ( ruleModifier EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:90:1: ruleModifier EOF
            {
             before(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier121);
            ruleModifier();

            state._fsp--;

             after(grammarAccess.getModifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModifier"


    // $ANTLR start "ruleModifier"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:97:1: ruleModifier : ( ( rule__Modifier__Alternatives ) ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:101:2: ( ( ( rule__Modifier__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:102:1: ( ( rule__Modifier__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:102:1: ( ( rule__Modifier__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:103:1: ( rule__Modifier__Alternatives )
            {
             before(grammarAccess.getModifierAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:104:1: ( rule__Modifier__Alternatives )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:104:2: rule__Modifier__Alternatives
            {
            pushFollow(FOLLOW_rule__Modifier__Alternatives_in_ruleModifier154);
            rule__Modifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModifierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModifier"


    // $ANTLR start "entryRuleReturnType"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:116:1: entryRuleReturnType : ruleReturnType EOF ;
    public final void entryRuleReturnType() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:117:1: ( ruleReturnType EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:118:1: ruleReturnType EOF
            {
             before(grammarAccess.getReturnTypeRule()); 
            pushFollow(FOLLOW_ruleReturnType_in_entryRuleReturnType181);
            ruleReturnType();

            state._fsp--;

             after(grammarAccess.getReturnTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnType188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReturnType"


    // $ANTLR start "ruleReturnType"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:125:1: ruleReturnType : ( ( rule__ReturnType__ValueAssignment ) ) ;
    public final void ruleReturnType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:129:2: ( ( ( rule__ReturnType__ValueAssignment ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:130:1: ( ( rule__ReturnType__ValueAssignment ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:130:1: ( ( rule__ReturnType__ValueAssignment ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:131:1: ( rule__ReturnType__ValueAssignment )
            {
             before(grammarAccess.getReturnTypeAccess().getValueAssignment()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:132:1: ( rule__ReturnType__ValueAssignment )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:132:2: rule__ReturnType__ValueAssignment
            {
            pushFollow(FOLLOW_rule__ReturnType__ValueAssignment_in_ruleReturnType214);
            rule__ReturnType__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getReturnTypeAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReturnType"


    // $ANTLR start "entryRuleParameterElement"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:144:1: entryRuleParameterElement : ruleParameterElement EOF ;
    public final void entryRuleParameterElement() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:145:1: ( ruleParameterElement EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:146:1: ruleParameterElement EOF
            {
             before(grammarAccess.getParameterElementRule()); 
            pushFollow(FOLLOW_ruleParameterElement_in_entryRuleParameterElement241);
            ruleParameterElement();

            state._fsp--;

             after(grammarAccess.getParameterElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterElement248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterElement"


    // $ANTLR start "ruleParameterElement"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:153:1: ruleParameterElement : ( ( rule__ParameterElement__Alternatives ) ) ;
    public final void ruleParameterElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:157:2: ( ( ( rule__ParameterElement__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:158:1: ( ( rule__ParameterElement__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:158:1: ( ( rule__ParameterElement__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:159:1: ( rule__ParameterElement__Alternatives )
            {
             before(grammarAccess.getParameterElementAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:160:1: ( rule__ParameterElement__Alternatives )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:160:2: rule__ParameterElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ParameterElement__Alternatives_in_ruleParameterElement274);
            rule__ParameterElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterElement"


    // $ANTLR start "entryRuleParameterType"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:172:1: entryRuleParameterType : ruleParameterType EOF ;
    public final void entryRuleParameterType() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:173:1: ( ruleParameterType EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:174:1: ruleParameterType EOF
            {
             before(grammarAccess.getParameterTypeRule()); 
            pushFollow(FOLLOW_ruleParameterType_in_entryRuleParameterType301);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterType308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterType"


    // $ANTLR start "ruleParameterType"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:181:1: ruleParameterType : ( ( rule__ParameterType__Alternatives ) ) ;
    public final void ruleParameterType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:185:2: ( ( ( rule__ParameterType__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:186:1: ( ( rule__ParameterType__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:186:1: ( ( rule__ParameterType__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:187:1: ( rule__ParameterType__Alternatives )
            {
             before(grammarAccess.getParameterTypeAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:188:1: ( rule__ParameterType__Alternatives )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:188:2: rule__ParameterType__Alternatives
            {
            pushFollow(FOLLOW_rule__ParameterType__Alternatives_in_ruleParameterType334);
            rule__ParameterType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "entryRuleThrows"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:200:1: entryRuleThrows : ruleThrows EOF ;
    public final void entryRuleThrows() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:201:1: ( ruleThrows EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:202:1: ruleThrows EOF
            {
             before(grammarAccess.getThrowsRule()); 
            pushFollow(FOLLOW_ruleThrows_in_entryRuleThrows361);
            ruleThrows();

            state._fsp--;

             after(grammarAccess.getThrowsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThrows368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleThrows"


    // $ANTLR start "ruleThrows"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:209:1: ruleThrows : ( ( rule__Throws__Group__0 ) ) ;
    public final void ruleThrows() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:213:2: ( ( ( rule__Throws__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:214:1: ( ( rule__Throws__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:214:1: ( ( rule__Throws__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:215:1: ( rule__Throws__Group__0 )
            {
             before(grammarAccess.getThrowsAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:216:1: ( rule__Throws__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:216:2: rule__Throws__Group__0
            {
            pushFollow(FOLLOW_rule__Throws__Group__0_in_ruleThrows394);
            rule__Throws__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getThrowsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleThrows"


    // $ANTLR start "entryRuleMethodName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:228:1: entryRuleMethodName : ruleMethodName EOF ;
    public final void entryRuleMethodName() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:229:1: ( ruleMethodName EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:230:1: ruleMethodName EOF
            {
             before(grammarAccess.getMethodNameRule()); 
            pushFollow(FOLLOW_ruleMethodName_in_entryRuleMethodName421);
            ruleMethodName();

            state._fsp--;

             after(grammarAccess.getMethodNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodName428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethodName"


    // $ANTLR start "ruleMethodName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:237:1: ruleMethodName : ( ( rule__MethodName__ValueAssignment ) ) ;
    public final void ruleMethodName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:241:2: ( ( ( rule__MethodName__ValueAssignment ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:242:1: ( ( rule__MethodName__ValueAssignment ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:242:1: ( ( rule__MethodName__ValueAssignment ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:243:1: ( rule__MethodName__ValueAssignment )
            {
             before(grammarAccess.getMethodNameAccess().getValueAssignment()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:244:1: ( rule__MethodName__ValueAssignment )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:244:2: rule__MethodName__ValueAssignment
            {
            pushFollow(FOLLOW_rule__MethodName__ValueAssignment_in_ruleMethodName454);
            rule__MethodName__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMethodNameAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodName"


    // $ANTLR start "rule__Modifier__Alternatives"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:256:1: rule__Modifier__Alternatives : ( ( ( rule__Modifier__ValueAssignment_0 ) ) | ( ( rule__Modifier__ValueAssignment_1 ) ) | ( ( rule__Modifier__ValueAssignment_2 ) ) | ( ( rule__Modifier__ValueAssignment_3 ) ) | ( ( rule__Modifier__ValueAssignment_4 ) ) | ( ( rule__Modifier__ValueAssignment_5 ) ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:260:1: ( ( ( rule__Modifier__ValueAssignment_0 ) ) | ( ( rule__Modifier__ValueAssignment_1 ) ) | ( ( rule__Modifier__ValueAssignment_2 ) ) | ( ( rule__Modifier__ValueAssignment_3 ) ) | ( ( rule__Modifier__ValueAssignment_4 ) ) | ( ( rule__Modifier__ValueAssignment_5 ) ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 19:
                {
                alt1=2;
                }
                break;
            case 20:
                {
                alt1=3;
                }
                break;
            case 21:
                {
                alt1=4;
                }
                break;
            case 22:
                {
                alt1=5;
                }
                break;
            case 23:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:261:1: ( ( rule__Modifier__ValueAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:261:1: ( ( rule__Modifier__ValueAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:262:1: ( rule__Modifier__ValueAssignment_0 )
                    {
                     before(grammarAccess.getModifierAccess().getValueAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:263:1: ( rule__Modifier__ValueAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:263:2: rule__Modifier__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Modifier__ValueAssignment_0_in_rule__Modifier__Alternatives490);
                    rule__Modifier__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModifierAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:267:6: ( ( rule__Modifier__ValueAssignment_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:267:6: ( ( rule__Modifier__ValueAssignment_1 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:268:1: ( rule__Modifier__ValueAssignment_1 )
                    {
                     before(grammarAccess.getModifierAccess().getValueAssignment_1()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:269:1: ( rule__Modifier__ValueAssignment_1 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:269:2: rule__Modifier__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Modifier__ValueAssignment_1_in_rule__Modifier__Alternatives508);
                    rule__Modifier__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModifierAccess().getValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:273:6: ( ( rule__Modifier__ValueAssignment_2 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:273:6: ( ( rule__Modifier__ValueAssignment_2 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:274:1: ( rule__Modifier__ValueAssignment_2 )
                    {
                     before(grammarAccess.getModifierAccess().getValueAssignment_2()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:275:1: ( rule__Modifier__ValueAssignment_2 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:275:2: rule__Modifier__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Modifier__ValueAssignment_2_in_rule__Modifier__Alternatives526);
                    rule__Modifier__ValueAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModifierAccess().getValueAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:279:6: ( ( rule__Modifier__ValueAssignment_3 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:279:6: ( ( rule__Modifier__ValueAssignment_3 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:280:1: ( rule__Modifier__ValueAssignment_3 )
                    {
                     before(grammarAccess.getModifierAccess().getValueAssignment_3()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:281:1: ( rule__Modifier__ValueAssignment_3 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:281:2: rule__Modifier__ValueAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Modifier__ValueAssignment_3_in_rule__Modifier__Alternatives544);
                    rule__Modifier__ValueAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getModifierAccess().getValueAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:285:6: ( ( rule__Modifier__ValueAssignment_4 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:285:6: ( ( rule__Modifier__ValueAssignment_4 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:286:1: ( rule__Modifier__ValueAssignment_4 )
                    {
                     before(grammarAccess.getModifierAccess().getValueAssignment_4()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:287:1: ( rule__Modifier__ValueAssignment_4 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:287:2: rule__Modifier__ValueAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Modifier__ValueAssignment_4_in_rule__Modifier__Alternatives562);
                    rule__Modifier__ValueAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getModifierAccess().getValueAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:291:6: ( ( rule__Modifier__ValueAssignment_5 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:291:6: ( ( rule__Modifier__ValueAssignment_5 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:292:1: ( rule__Modifier__ValueAssignment_5 )
                    {
                     before(grammarAccess.getModifierAccess().getValueAssignment_5()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:293:1: ( rule__Modifier__ValueAssignment_5 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:293:2: rule__Modifier__ValueAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Modifier__ValueAssignment_5_in_rule__Modifier__Alternatives580);
                    rule__Modifier__ValueAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getModifierAccess().getValueAssignment_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__Alternatives"


    // $ANTLR start "rule__ParameterElement__Alternatives"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:302:1: rule__ParameterElement__Alternatives : ( ( ( rule__ParameterElement__Group_0__0 ) ) | ( ( rule__ParameterElement__Group_1__0 ) ) );
    public final void rule__ParameterElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:306:1: ( ( ( rule__ParameterElement__Group_0__0 ) ) | ( ( rule__ParameterElement__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_NAMEWITHWC||LA2_0==24) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:307:1: ( ( rule__ParameterElement__Group_0__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:307:1: ( ( rule__ParameterElement__Group_0__0 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:308:1: ( rule__ParameterElement__Group_0__0 )
                    {
                     before(grammarAccess.getParameterElementAccess().getGroup_0()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:309:1: ( rule__ParameterElement__Group_0__0 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:309:2: rule__ParameterElement__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ParameterElement__Group_0__0_in_rule__ParameterElement__Alternatives613);
                    rule__ParameterElement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterElementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:313:6: ( ( rule__ParameterElement__Group_1__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:313:6: ( ( rule__ParameterElement__Group_1__0 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:314:1: ( rule__ParameterElement__Group_1__0 )
                    {
                     before(grammarAccess.getParameterElementAccess().getGroup_1()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:315:1: ( rule__ParameterElement__Group_1__0 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:315:2: rule__ParameterElement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ParameterElement__Group_1__0_in_rule__ParameterElement__Alternatives631);
                    rule__ParameterElement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterElementAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterElement__Alternatives"


    // $ANTLR start "rule__ParameterType__Alternatives"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:324:1: rule__ParameterType__Alternatives : ( ( ( rule__ParameterType__ValueAssignment_0 ) ) | ( ( rule__ParameterType__ValueAssignment_1 ) ) );
    public final void rule__ParameterType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:328:1: ( ( ( rule__ParameterType__ValueAssignment_0 ) ) | ( ( rule__ParameterType__ValueAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_NAMEWITHWC) ) {
                alt3=1;
            }
            else if ( (LA3_0==24) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:329:1: ( ( rule__ParameterType__ValueAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:329:1: ( ( rule__ParameterType__ValueAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:330:1: ( rule__ParameterType__ValueAssignment_0 )
                    {
                     before(grammarAccess.getParameterTypeAccess().getValueAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:331:1: ( rule__ParameterType__ValueAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:331:2: rule__ParameterType__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ParameterType__ValueAssignment_0_in_rule__ParameterType__Alternatives664);
                    rule__ParameterType__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterTypeAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:335:6: ( ( rule__ParameterType__ValueAssignment_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:335:6: ( ( rule__ParameterType__ValueAssignment_1 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:336:1: ( rule__ParameterType__ValueAssignment_1 )
                    {
                     before(grammarAccess.getParameterTypeAccess().getValueAssignment_1()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:337:1: ( rule__ParameterType__ValueAssignment_1 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:337:2: rule__ParameterType__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ParameterType__ValueAssignment_1_in_rule__ParameterType__Alternatives682);
                    rule__ParameterType__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterTypeAccess().getValueAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterType__Alternatives"


    // $ANTLR start "rule__MethodPattern__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:348:1: rule__MethodPattern__Group__0 : rule__MethodPattern__Group__0__Impl rule__MethodPattern__Group__1 ;
    public final void rule__MethodPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:352:1: ( rule__MethodPattern__Group__0__Impl rule__MethodPattern__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:353:2: rule__MethodPattern__Group__0__Impl rule__MethodPattern__Group__1
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group__0__Impl_in_rule__MethodPattern__Group__0713);
            rule__MethodPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodPattern__Group__1_in_rule__MethodPattern__Group__0716);
            rule__MethodPattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodPattern__Group__0"


    // $ANTLR start "rule__MethodPattern__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:360:1: rule__MethodPattern__Group__0__Impl : ( ( rule__MethodPattern__ModifiersAssignment_0 )* ) ;
    public final void rule__MethodPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:364:1: ( ( ( rule__MethodPattern__ModifiersAssignment_0 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:365:1: ( ( rule__MethodPattern__ModifiersAssignment_0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:365:1: ( ( rule__MethodPattern__ModifiersAssignment_0 )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:366:1: ( rule__MethodPattern__ModifiersAssignment_0 )*
            {
             before(grammarAccess.getMethodPatternAccess().getModifiersAssignment_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:367:1: ( rule__MethodPattern__ModifiersAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=18 && LA4_0<=23)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:367:2: rule__MethodPattern__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__MethodPattern__ModifiersAssignment_0_in_rule__MethodPattern__Group__0__Impl743);
            	    rule__MethodPattern__ModifiersAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getMethodPatternAccess().getModifiersAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodPattern__Group__0__Impl"


    // $ANTLR start "rule__MethodPattern__Group__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:377:1: rule__MethodPattern__Group__1 : rule__MethodPattern__Group__1__Impl rule__MethodPattern__Group__2 ;
    public final void rule__MethodPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:381:1: ( rule__MethodPattern__Group__1__Impl rule__MethodPattern__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:382:2: rule__MethodPattern__Group__1__Impl rule__MethodPattern__Group__2
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group__1__Impl_in_rule__MethodPattern__Group__1774);
            rule__MethodPattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodPattern__Group__2_in_rule__MethodPattern__Group__1777);
            rule__MethodPattern__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodPattern__Group__1"


    // $ANTLR start "rule__MethodPattern__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:389:1: rule__MethodPattern__Group__1__Impl : ( ( rule__MethodPattern__ReturnTypeAssignment_1 ) ) ;
    public final void rule__MethodPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:393:1: ( ( ( rule__MethodPattern__ReturnTypeAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:394:1: ( ( rule__MethodPattern__ReturnTypeAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:394:1: ( ( rule__MethodPattern__ReturnTypeAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:395:1: ( rule__MethodPattern__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getMethodPatternAccess().getReturnTypeAssignment_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:396:1: ( rule__MethodPattern__ReturnTypeAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:396:2: rule__MethodPattern__ReturnTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__MethodPattern__ReturnTypeAssignment_1_in_rule__MethodPattern__Group__1__Impl804);
            rule__MethodPattern__ReturnTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodPatternAccess().getReturnTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodPattern__Group__1__Impl"


    // $ANTLR start "rule__MethodPattern__Group__2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:406:1: rule__MethodPattern__Group__2 : rule__MethodPattern__Group__2__Impl rule__MethodPattern__Group__3 ;
    public final void rule__MethodPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:410:1: ( rule__MethodPattern__Group__2__Impl rule__MethodPattern__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:411:2: rule__MethodPattern__Group__2__Impl rule__MethodPattern__Group__3
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group__2__Impl_in_rule__MethodPattern__Group__2834);
            rule__MethodPattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodPattern__Group__3_in_rule__MethodPattern__Group__2837);
            rule__MethodPattern__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodPattern__Group__2"


    // $ANTLR start "rule__MethodPattern__Group__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:418:1: rule__MethodPattern__Group__2__Impl : ( ( rule__MethodPattern__MethodNameAssignment_2 ) ) ;
    public final void rule__MethodPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:422:1: ( ( ( rule__MethodPattern__MethodNameAssignment_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:423:1: ( ( rule__MethodPattern__MethodNameAssignment_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:423:1: ( ( rule__MethodPattern__MethodNameAssignment_2 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:424:1: ( rule__MethodPattern__MethodNameAssignment_2 )
            {
             before(grammarAccess.getMethodPatternAccess().getMethodNameAssignment_2()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:425:1: ( rule__MethodPattern__MethodNameAssignment_2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:425:2: rule__MethodPattern__MethodNameAssignment_2
            {
            pushFollow(FOLLOW_rule__MethodPattern__MethodNameAssignment_2_in_rule__MethodPattern__Group__2__Impl864);
            rule__MethodPattern__MethodNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMethodPatternAccess().getMethodNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodPattern__Group__2__Impl"


    // $ANTLR start "rule__MethodPattern__Group__3"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:435:1: rule__MethodPattern__Group__3 : rule__MethodPattern__Group__3__Impl rule__MethodPattern__Group__4 ;
    public final void rule__MethodPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:439:1: ( rule__MethodPattern__Group__3__Impl rule__MethodPattern__Group__4 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:440:2: rule__MethodPattern__Group__3__Impl rule__MethodPattern__Group__4
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group__3__Impl_in_rule__MethodPattern__Group__3894);
            rule__MethodPattern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodPattern__Group__4_in_rule__MethodPattern__Group__3897);
            rule__MethodPattern__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodPattern__Group__3"


    // $ANTLR start "rule__MethodPattern__Group__3__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:447:1: rule__MethodPattern__Group__3__Impl : ( ( rule__MethodPattern__Group_3__0 )? ) ;
    public final void rule__MethodPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:451:1: ( ( ( rule__MethodPattern__Group_3__0 )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:452:1: ( ( rule__MethodPattern__Group_3__0 )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:452:1: ( ( rule__MethodPattern__Group_3__0 )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:453:1: ( rule__MethodPattern__Group_3__0 )?
            {
             before(grammarAccess.getMethodPatternAccess().getGroup_3()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:454:1: ( rule__MethodPattern__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:454:2: rule__MethodPattern__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__MethodPattern__Group_3__0_in_rule__MethodPattern__Group__3__Impl924);
                    rule__MethodPattern__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodPatternAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodPattern__Group__3__Impl"


    // $ANTLR start "rule__MethodPattern__Group__4"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:464:1: rule__MethodPattern__Group__4 : rule__MethodPattern__Group__4__Impl ;
    public final void rule__MethodPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:468:1: ( rule__MethodPattern__Group__4__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:469:2: rule__MethodPattern__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group__4__Impl_in_rule__MethodPattern__Group__4955);
            rule__MethodPattern__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodPattern__Group__4"


    // $ANTLR start "rule__MethodPattern__Group__4__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:475:1: rule__MethodPattern__Group__4__Impl : ( ( rule__MethodPattern__ThrowsClauseAssignment_4 )? ) ;
    public final void rule__MethodPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:479:1: ( ( ( rule__MethodPattern__ThrowsClauseAssignment_4 )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:480:1: ( ( rule__MethodPattern__ThrowsClauseAssignment_4 )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:480:1: ( ( rule__MethodPattern__ThrowsClauseAssignment_4 )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:481:1: ( rule__MethodPattern__ThrowsClauseAssignment_4 )?
            {
             before(grammarAccess.getMethodPatternAccess().getThrowsClauseAssignment_4()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:482:1: ( rule__MethodPattern__ThrowsClauseAssignment_4 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:482:2: rule__MethodPattern__ThrowsClauseAssignment_4
                    {
                    pushFollow(FOLLOW_rule__MethodPattern__ThrowsClauseAssignment_4_in_rule__MethodPattern__Group__4__Impl982);
                    rule__MethodPattern__ThrowsClauseAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodPatternAccess().getThrowsClauseAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodPattern__Group__4__Impl"


    // $ANTLR start "rule__MethodPattern__Group_3__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:502:1: rule__MethodPattern__Group_3__0 : rule__MethodPattern__Group_3__0__Impl rule__MethodPattern__Group_3__1 ;
    public final void rule__MethodPattern__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:506:1: ( rule__MethodPattern__Group_3__0__Impl rule__MethodPattern__Group_3__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:507:2: rule__MethodPattern__Group_3__0__Impl rule__MethodPattern__Group_3__1
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group_3__0__Impl_in_rule__MethodPattern__Group_3__01023);
            rule__MethodPattern__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodPattern__Group_3__1_in_rule__MethodPattern__Group_3__01026);
            rule__MethodPattern__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodPattern__Group_3__0"


    // $ANTLR start "rule__MethodPattern__Group_3__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:514:1: rule__MethodPattern__Group_3__0__Impl : ( '(' ) ;
    public final void rule__MethodPattern__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:518:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:519:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:519:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:520:1: '('
            {
             before(grammarAccess.getMethodPatternAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,12,FOLLOW_12_in_rule__MethodPattern__Group_3__0__Impl1054); 
             after(grammarAccess.getMethodPatternAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodPattern__Group_3__0__Impl"


    // $ANTLR start "rule__MethodPattern__Group_3__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:533:1: rule__MethodPattern__Group_3__1 : rule__MethodPattern__Group_3__1__Impl rule__MethodPattern__Group_3__2 ;
    public final void rule__MethodPattern__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:537:1: ( rule__MethodPattern__Group_3__1__Impl rule__MethodPattern__Group_3__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:538:2: rule__MethodPattern__Group_3__1__Impl rule__MethodPattern__Group_3__2
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group_3__1__Impl_in_rule__MethodPattern__Group_3__11085);
            rule__MethodPattern__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodPattern__Group_3__2_in_rule__MethodPattern__Group_3__11088);
            rule__MethodPattern__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodPattern__Group_3__1"


    // $ANTLR start "rule__MethodPattern__Group_3__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:545:1: rule__MethodPattern__Group_3__1__Impl : ( ( rule__MethodPattern__ParameterElementsAssignment_3_1 ) ) ;
    public final void rule__MethodPattern__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:549:1: ( ( ( rule__MethodPattern__ParameterElementsAssignment_3_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:550:1: ( ( rule__MethodPattern__ParameterElementsAssignment_3_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:550:1: ( ( rule__MethodPattern__ParameterElementsAssignment_3_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:551:1: ( rule__MethodPattern__ParameterElementsAssignment_3_1 )
            {
             before(grammarAccess.getMethodPatternAccess().getParameterElementsAssignment_3_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:552:1: ( rule__MethodPattern__ParameterElementsAssignment_3_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:552:2: rule__MethodPattern__ParameterElementsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__MethodPattern__ParameterElementsAssignment_3_1_in_rule__MethodPattern__Group_3__1__Impl1115);
            rule__MethodPattern__ParameterElementsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodPatternAccess().getParameterElementsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodPattern__Group_3__1__Impl"


    // $ANTLR start "rule__MethodPattern__Group_3__2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:562:1: rule__MethodPattern__Group_3__2 : rule__MethodPattern__Group_3__2__Impl rule__MethodPattern__Group_3__3 ;
    public final void rule__MethodPattern__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:566:1: ( rule__MethodPattern__Group_3__2__Impl rule__MethodPattern__Group_3__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:567:2: rule__MethodPattern__Group_3__2__Impl rule__MethodPattern__Group_3__3
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group_3__2__Impl_in_rule__MethodPattern__Group_3__21145);
            rule__MethodPattern__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodPattern__Group_3__3_in_rule__MethodPattern__Group_3__21148);
            rule__MethodPattern__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodPattern__Group_3__2"


    // $ANTLR start "rule__MethodPattern__Group_3__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:574:1: rule__MethodPattern__Group_3__2__Impl : ( ( rule__MethodPattern__Group_3_2__0 )* ) ;
    public final void rule__MethodPattern__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:578:1: ( ( ( rule__MethodPattern__Group_3_2__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:579:1: ( ( rule__MethodPattern__Group_3_2__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:579:1: ( ( rule__MethodPattern__Group_3_2__0 )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:580:1: ( rule__MethodPattern__Group_3_2__0 )*
            {
             before(grammarAccess.getMethodPatternAccess().getGroup_3_2()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:581:1: ( rule__MethodPattern__Group_3_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:581:2: rule__MethodPattern__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__MethodPattern__Group_3_2__0_in_rule__MethodPattern__Group_3__2__Impl1175);
            	    rule__MethodPattern__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getMethodPatternAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodPattern__Group_3__2__Impl"


    // $ANTLR start "rule__MethodPattern__Group_3__3"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:591:1: rule__MethodPattern__Group_3__3 : rule__MethodPattern__Group_3__3__Impl ;
    public final void rule__MethodPattern__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:595:1: ( rule__MethodPattern__Group_3__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:596:2: rule__MethodPattern__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group_3__3__Impl_in_rule__MethodPattern__Group_3__31206);
            rule__MethodPattern__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodPattern__Group_3__3"


    // $ANTLR start "rule__MethodPattern__Group_3__3__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:602:1: rule__MethodPattern__Group_3__3__Impl : ( ')' ) ;
    public final void rule__MethodPattern__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:606:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:607:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:607:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:608:1: ')'
            {
             before(grammarAccess.getMethodPatternAccess().getRightParenthesisKeyword_3_3()); 
            match(input,13,FOLLOW_13_in_rule__MethodPattern__Group_3__3__Impl1234); 
             after(grammarAccess.getMethodPatternAccess().getRightParenthesisKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodPattern__Group_3__3__Impl"


    // $ANTLR start "rule__MethodPattern__Group_3_2__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:629:1: rule__MethodPattern__Group_3_2__0 : rule__MethodPattern__Group_3_2__0__Impl rule__MethodPattern__Group_3_2__1 ;
    public final void rule__MethodPattern__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:633:1: ( rule__MethodPattern__Group_3_2__0__Impl rule__MethodPattern__Group_3_2__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:634:2: rule__MethodPattern__Group_3_2__0__Impl rule__MethodPattern__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group_3_2__0__Impl_in_rule__MethodPattern__Group_3_2__01273);
            rule__MethodPattern__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodPattern__Group_3_2__1_in_rule__MethodPattern__Group_3_2__01276);
            rule__MethodPattern__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodPattern__Group_3_2__0"


    // $ANTLR start "rule__MethodPattern__Group_3_2__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:641:1: rule__MethodPattern__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__MethodPattern__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:645:1: ( ( ',' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:646:1: ( ',' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:646:1: ( ',' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:647:1: ','
            {
             before(grammarAccess.getMethodPatternAccess().getCommaKeyword_3_2_0()); 
            match(input,14,FOLLOW_14_in_rule__MethodPattern__Group_3_2__0__Impl1304); 
             after(grammarAccess.getMethodPatternAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodPattern__Group_3_2__0__Impl"


    // $ANTLR start "rule__MethodPattern__Group_3_2__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:660:1: rule__MethodPattern__Group_3_2__1 : rule__MethodPattern__Group_3_2__1__Impl ;
    public final void rule__MethodPattern__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:664:1: ( rule__MethodPattern__Group_3_2__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:665:2: rule__MethodPattern__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group_3_2__1__Impl_in_rule__MethodPattern__Group_3_2__11335);
            rule__MethodPattern__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodPattern__Group_3_2__1"


    // $ANTLR start "rule__MethodPattern__Group_3_2__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:671:1: rule__MethodPattern__Group_3_2__1__Impl : ( ( rule__MethodPattern__ParameterElementsAssignment_3_2_1 ) ) ;
    public final void rule__MethodPattern__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:675:1: ( ( ( rule__MethodPattern__ParameterElementsAssignment_3_2_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:676:1: ( ( rule__MethodPattern__ParameterElementsAssignment_3_2_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:676:1: ( ( rule__MethodPattern__ParameterElementsAssignment_3_2_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:677:1: ( rule__MethodPattern__ParameterElementsAssignment_3_2_1 )
            {
             before(grammarAccess.getMethodPatternAccess().getParameterElementsAssignment_3_2_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:678:1: ( rule__MethodPattern__ParameterElementsAssignment_3_2_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:678:2: rule__MethodPattern__ParameterElementsAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__MethodPattern__ParameterElementsAssignment_3_2_1_in_rule__MethodPattern__Group_3_2__1__Impl1362);
            rule__MethodPattern__ParameterElementsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodPatternAccess().getParameterElementsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodPattern__Group_3_2__1__Impl"


    // $ANTLR start "rule__ParameterElement__Group_0__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:692:1: rule__ParameterElement__Group_0__0 : rule__ParameterElement__Group_0__0__Impl rule__ParameterElement__Group_0__1 ;
    public final void rule__ParameterElement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:696:1: ( rule__ParameterElement__Group_0__0__Impl rule__ParameterElement__Group_0__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:697:2: rule__ParameterElement__Group_0__0__Impl rule__ParameterElement__Group_0__1
            {
            pushFollow(FOLLOW_rule__ParameterElement__Group_0__0__Impl_in_rule__ParameterElement__Group_0__01396);
            rule__ParameterElement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterElement__Group_0__1_in_rule__ParameterElement__Group_0__01399);
            rule__ParameterElement__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterElement__Group_0__0"


    // $ANTLR start "rule__ParameterElement__Group_0__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:704:1: rule__ParameterElement__Group_0__0__Impl : ( () ) ;
    public final void rule__ParameterElement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:708:1: ( ( () ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:709:1: ( () )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:709:1: ( () )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:710:1: ()
            {
             before(grammarAccess.getParameterElementAccess().getParameterElementAction_0_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:711:1: ()
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:713:1: 
            {
            }

             after(grammarAccess.getParameterElementAccess().getParameterElementAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterElement__Group_0__0__Impl"


    // $ANTLR start "rule__ParameterElement__Group_0__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:723:1: rule__ParameterElement__Group_0__1 : rule__ParameterElement__Group_0__1__Impl ;
    public final void rule__ParameterElement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:727:1: ( rule__ParameterElement__Group_0__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:728:2: rule__ParameterElement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterElement__Group_0__1__Impl_in_rule__ParameterElement__Group_0__11457);
            rule__ParameterElement__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterElement__Group_0__1"


    // $ANTLR start "rule__ParameterElement__Group_0__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:734:1: rule__ParameterElement__Group_0__1__Impl : ( ( rule__ParameterElement__ValuesAssignment_0_1 ) ) ;
    public final void rule__ParameterElement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:738:1: ( ( ( rule__ParameterElement__ValuesAssignment_0_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:739:1: ( ( rule__ParameterElement__ValuesAssignment_0_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:739:1: ( ( rule__ParameterElement__ValuesAssignment_0_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:740:1: ( rule__ParameterElement__ValuesAssignment_0_1 )
            {
             before(grammarAccess.getParameterElementAccess().getValuesAssignment_0_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:741:1: ( rule__ParameterElement__ValuesAssignment_0_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:741:2: rule__ParameterElement__ValuesAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ParameterElement__ValuesAssignment_0_1_in_rule__ParameterElement__Group_0__1__Impl1484);
            rule__ParameterElement__ValuesAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterElementAccess().getValuesAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterElement__Group_0__1__Impl"


    // $ANTLR start "rule__ParameterElement__Group_1__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:755:1: rule__ParameterElement__Group_1__0 : rule__ParameterElement__Group_1__0__Impl rule__ParameterElement__Group_1__1 ;
    public final void rule__ParameterElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:759:1: ( rule__ParameterElement__Group_1__0__Impl rule__ParameterElement__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:760:2: rule__ParameterElement__Group_1__0__Impl rule__ParameterElement__Group_1__1
            {
            pushFollow(FOLLOW_rule__ParameterElement__Group_1__0__Impl_in_rule__ParameterElement__Group_1__01518);
            rule__ParameterElement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterElement__Group_1__1_in_rule__ParameterElement__Group_1__01521);
            rule__ParameterElement__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterElement__Group_1__0"


    // $ANTLR start "rule__ParameterElement__Group_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:767:1: rule__ParameterElement__Group_1__0__Impl : ( '{' ) ;
    public final void rule__ParameterElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:771:1: ( ( '{' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:772:1: ( '{' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:772:1: ( '{' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:773:1: '{'
            {
             before(grammarAccess.getParameterElementAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,15,FOLLOW_15_in_rule__ParameterElement__Group_1__0__Impl1549); 
             after(grammarAccess.getParameterElementAccess().getLeftCurlyBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterElement__Group_1__0__Impl"


    // $ANTLR start "rule__ParameterElement__Group_1__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:786:1: rule__ParameterElement__Group_1__1 : rule__ParameterElement__Group_1__1__Impl rule__ParameterElement__Group_1__2 ;
    public final void rule__ParameterElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:790:1: ( rule__ParameterElement__Group_1__1__Impl rule__ParameterElement__Group_1__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:791:2: rule__ParameterElement__Group_1__1__Impl rule__ParameterElement__Group_1__2
            {
            pushFollow(FOLLOW_rule__ParameterElement__Group_1__1__Impl_in_rule__ParameterElement__Group_1__11580);
            rule__ParameterElement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterElement__Group_1__2_in_rule__ParameterElement__Group_1__11583);
            rule__ParameterElement__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterElement__Group_1__1"


    // $ANTLR start "rule__ParameterElement__Group_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:798:1: rule__ParameterElement__Group_1__1__Impl : ( ( rule__ParameterElement__TypesAssignment_1_1 ) ) ;
    public final void rule__ParameterElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:802:1: ( ( ( rule__ParameterElement__TypesAssignment_1_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:803:1: ( ( rule__ParameterElement__TypesAssignment_1_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:803:1: ( ( rule__ParameterElement__TypesAssignment_1_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:804:1: ( rule__ParameterElement__TypesAssignment_1_1 )
            {
             before(grammarAccess.getParameterElementAccess().getTypesAssignment_1_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:805:1: ( rule__ParameterElement__TypesAssignment_1_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:805:2: rule__ParameterElement__TypesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ParameterElement__TypesAssignment_1_1_in_rule__ParameterElement__Group_1__1__Impl1610);
            rule__ParameterElement__TypesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterElementAccess().getTypesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterElement__Group_1__1__Impl"


    // $ANTLR start "rule__ParameterElement__Group_1__2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:815:1: rule__ParameterElement__Group_1__2 : rule__ParameterElement__Group_1__2__Impl rule__ParameterElement__Group_1__3 ;
    public final void rule__ParameterElement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:819:1: ( rule__ParameterElement__Group_1__2__Impl rule__ParameterElement__Group_1__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:820:2: rule__ParameterElement__Group_1__2__Impl rule__ParameterElement__Group_1__3
            {
            pushFollow(FOLLOW_rule__ParameterElement__Group_1__2__Impl_in_rule__ParameterElement__Group_1__21640);
            rule__ParameterElement__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterElement__Group_1__3_in_rule__ParameterElement__Group_1__21643);
            rule__ParameterElement__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterElement__Group_1__2"


    // $ANTLR start "rule__ParameterElement__Group_1__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:827:1: rule__ParameterElement__Group_1__2__Impl : ( ( rule__ParameterElement__Group_1_2__0 )* ) ;
    public final void rule__ParameterElement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:831:1: ( ( ( rule__ParameterElement__Group_1_2__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:832:1: ( ( rule__ParameterElement__Group_1_2__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:832:1: ( ( rule__ParameterElement__Group_1_2__0 )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:833:1: ( rule__ParameterElement__Group_1_2__0 )*
            {
             before(grammarAccess.getParameterElementAccess().getGroup_1_2()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:834:1: ( rule__ParameterElement__Group_1_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:834:2: rule__ParameterElement__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ParameterElement__Group_1_2__0_in_rule__ParameterElement__Group_1__2__Impl1670);
            	    rule__ParameterElement__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getParameterElementAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterElement__Group_1__2__Impl"


    // $ANTLR start "rule__ParameterElement__Group_1__3"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:844:1: rule__ParameterElement__Group_1__3 : rule__ParameterElement__Group_1__3__Impl ;
    public final void rule__ParameterElement__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:848:1: ( rule__ParameterElement__Group_1__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:849:2: rule__ParameterElement__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__ParameterElement__Group_1__3__Impl_in_rule__ParameterElement__Group_1__31701);
            rule__ParameterElement__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterElement__Group_1__3"


    // $ANTLR start "rule__ParameterElement__Group_1__3__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:855:1: rule__ParameterElement__Group_1__3__Impl : ( '}' ) ;
    public final void rule__ParameterElement__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:859:1: ( ( '}' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:860:1: ( '}' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:860:1: ( '}' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:861:1: '}'
            {
             before(grammarAccess.getParameterElementAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,16,FOLLOW_16_in_rule__ParameterElement__Group_1__3__Impl1729); 
             after(grammarAccess.getParameterElementAccess().getRightCurlyBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterElement__Group_1__3__Impl"


    // $ANTLR start "rule__ParameterElement__Group_1_2__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:882:1: rule__ParameterElement__Group_1_2__0 : rule__ParameterElement__Group_1_2__0__Impl rule__ParameterElement__Group_1_2__1 ;
    public final void rule__ParameterElement__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:886:1: ( rule__ParameterElement__Group_1_2__0__Impl rule__ParameterElement__Group_1_2__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:887:2: rule__ParameterElement__Group_1_2__0__Impl rule__ParameterElement__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__ParameterElement__Group_1_2__0__Impl_in_rule__ParameterElement__Group_1_2__01768);
            rule__ParameterElement__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterElement__Group_1_2__1_in_rule__ParameterElement__Group_1_2__01771);
            rule__ParameterElement__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterElement__Group_1_2__0"


    // $ANTLR start "rule__ParameterElement__Group_1_2__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:894:1: rule__ParameterElement__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__ParameterElement__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:898:1: ( ( ',' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:899:1: ( ',' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:899:1: ( ',' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:900:1: ','
            {
             before(grammarAccess.getParameterElementAccess().getCommaKeyword_1_2_0()); 
            match(input,14,FOLLOW_14_in_rule__ParameterElement__Group_1_2__0__Impl1799); 
             after(grammarAccess.getParameterElementAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterElement__Group_1_2__0__Impl"


    // $ANTLR start "rule__ParameterElement__Group_1_2__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:913:1: rule__ParameterElement__Group_1_2__1 : rule__ParameterElement__Group_1_2__1__Impl ;
    public final void rule__ParameterElement__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:917:1: ( rule__ParameterElement__Group_1_2__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:918:2: rule__ParameterElement__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterElement__Group_1_2__1__Impl_in_rule__ParameterElement__Group_1_2__11830);
            rule__ParameterElement__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterElement__Group_1_2__1"


    // $ANTLR start "rule__ParameterElement__Group_1_2__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:924:1: rule__ParameterElement__Group_1_2__1__Impl : ( ( rule__ParameterElement__TypesAssignment_1_2_1 ) ) ;
    public final void rule__ParameterElement__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:928:1: ( ( ( rule__ParameterElement__TypesAssignment_1_2_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:929:1: ( ( rule__ParameterElement__TypesAssignment_1_2_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:929:1: ( ( rule__ParameterElement__TypesAssignment_1_2_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:930:1: ( rule__ParameterElement__TypesAssignment_1_2_1 )
            {
             before(grammarAccess.getParameterElementAccess().getTypesAssignment_1_2_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:931:1: ( rule__ParameterElement__TypesAssignment_1_2_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:931:2: rule__ParameterElement__TypesAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__ParameterElement__TypesAssignment_1_2_1_in_rule__ParameterElement__Group_1_2__1__Impl1857);
            rule__ParameterElement__TypesAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterElementAccess().getTypesAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterElement__Group_1_2__1__Impl"


    // $ANTLR start "rule__Throws__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:945:1: rule__Throws__Group__0 : rule__Throws__Group__0__Impl rule__Throws__Group__1 ;
    public final void rule__Throws__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:949:1: ( rule__Throws__Group__0__Impl rule__Throws__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:950:2: rule__Throws__Group__0__Impl rule__Throws__Group__1
            {
            pushFollow(FOLLOW_rule__Throws__Group__0__Impl_in_rule__Throws__Group__01891);
            rule__Throws__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Throws__Group__1_in_rule__Throws__Group__01894);
            rule__Throws__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Throws__Group__0"


    // $ANTLR start "rule__Throws__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:957:1: rule__Throws__Group__0__Impl : ( 'throws' ) ;
    public final void rule__Throws__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:961:1: ( ( 'throws' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:962:1: ( 'throws' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:962:1: ( 'throws' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:963:1: 'throws'
            {
             before(grammarAccess.getThrowsAccess().getThrowsKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Throws__Group__0__Impl1922); 
             after(grammarAccess.getThrowsAccess().getThrowsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Throws__Group__0__Impl"


    // $ANTLR start "rule__Throws__Group__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:976:1: rule__Throws__Group__1 : rule__Throws__Group__1__Impl ;
    public final void rule__Throws__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:980:1: ( rule__Throws__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:981:2: rule__Throws__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Throws__Group__1__Impl_in_rule__Throws__Group__11953);
            rule__Throws__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Throws__Group__1"


    // $ANTLR start "rule__Throws__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:987:1: rule__Throws__Group__1__Impl : ( ( rule__Throws__ValueAssignment_1 ) ) ;
    public final void rule__Throws__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:991:1: ( ( ( rule__Throws__ValueAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:992:1: ( ( rule__Throws__ValueAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:992:1: ( ( rule__Throws__ValueAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:993:1: ( rule__Throws__ValueAssignment_1 )
            {
             before(grammarAccess.getThrowsAccess().getValueAssignment_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:994:1: ( rule__Throws__ValueAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:994:2: rule__Throws__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Throws__ValueAssignment_1_in_rule__Throws__Group__1__Impl1980);
            rule__Throws__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getThrowsAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Throws__Group__1__Impl"


    // $ANTLR start "rule__MethodPattern__ModifiersAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1009:1: rule__MethodPattern__ModifiersAssignment_0 : ( ruleModifier ) ;
    public final void rule__MethodPattern__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1013:1: ( ( ruleModifier ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1014:1: ( ruleModifier )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1014:1: ( ruleModifier )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1015:1: ruleModifier
            {
             before(grammarAccess.getMethodPatternAccess().getModifiersModifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleModifier_in_rule__MethodPattern__ModifiersAssignment_02019);
            ruleModifier();

            state._fsp--;

             after(grammarAccess.getMethodPatternAccess().getModifiersModifierParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodPattern__ModifiersAssignment_0"


    // $ANTLR start "rule__MethodPattern__ReturnTypeAssignment_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1024:1: rule__MethodPattern__ReturnTypeAssignment_1 : ( ruleReturnType ) ;
    public final void rule__MethodPattern__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1028:1: ( ( ruleReturnType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1029:1: ( ruleReturnType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1029:1: ( ruleReturnType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1030:1: ruleReturnType
            {
             before(grammarAccess.getMethodPatternAccess().getReturnTypeReturnTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReturnType_in_rule__MethodPattern__ReturnTypeAssignment_12050);
            ruleReturnType();

            state._fsp--;

             after(grammarAccess.getMethodPatternAccess().getReturnTypeReturnTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodPattern__ReturnTypeAssignment_1"


    // $ANTLR start "rule__MethodPattern__MethodNameAssignment_2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1039:1: rule__MethodPattern__MethodNameAssignment_2 : ( ruleMethodName ) ;
    public final void rule__MethodPattern__MethodNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1043:1: ( ( ruleMethodName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1044:1: ( ruleMethodName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1044:1: ( ruleMethodName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1045:1: ruleMethodName
            {
             before(grammarAccess.getMethodPatternAccess().getMethodNameMethodNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleMethodName_in_rule__MethodPattern__MethodNameAssignment_22081);
            ruleMethodName();

            state._fsp--;

             after(grammarAccess.getMethodPatternAccess().getMethodNameMethodNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodPattern__MethodNameAssignment_2"


    // $ANTLR start "rule__MethodPattern__ParameterElementsAssignment_3_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1054:1: rule__MethodPattern__ParameterElementsAssignment_3_1 : ( ruleParameterElement ) ;
    public final void rule__MethodPattern__ParameterElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1058:1: ( ( ruleParameterElement ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1059:1: ( ruleParameterElement )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1059:1: ( ruleParameterElement )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1060:1: ruleParameterElement
            {
             before(grammarAccess.getMethodPatternAccess().getParameterElementsParameterElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleParameterElement_in_rule__MethodPattern__ParameterElementsAssignment_3_12112);
            ruleParameterElement();

            state._fsp--;

             after(grammarAccess.getMethodPatternAccess().getParameterElementsParameterElementParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodPattern__ParameterElementsAssignment_3_1"


    // $ANTLR start "rule__MethodPattern__ParameterElementsAssignment_3_2_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1069:1: rule__MethodPattern__ParameterElementsAssignment_3_2_1 : ( ruleParameterElement ) ;
    public final void rule__MethodPattern__ParameterElementsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1073:1: ( ( ruleParameterElement ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1074:1: ( ruleParameterElement )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1074:1: ( ruleParameterElement )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1075:1: ruleParameterElement
            {
             before(grammarAccess.getMethodPatternAccess().getParameterElementsParameterElementParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_ruleParameterElement_in_rule__MethodPattern__ParameterElementsAssignment_3_2_12143);
            ruleParameterElement();

            state._fsp--;

             after(grammarAccess.getMethodPatternAccess().getParameterElementsParameterElementParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodPattern__ParameterElementsAssignment_3_2_1"


    // $ANTLR start "rule__MethodPattern__ThrowsClauseAssignment_4"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1084:1: rule__MethodPattern__ThrowsClauseAssignment_4 : ( ruleThrows ) ;
    public final void rule__MethodPattern__ThrowsClauseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1088:1: ( ( ruleThrows ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1089:1: ( ruleThrows )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1089:1: ( ruleThrows )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1090:1: ruleThrows
            {
             before(grammarAccess.getMethodPatternAccess().getThrowsClauseThrowsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleThrows_in_rule__MethodPattern__ThrowsClauseAssignment_42174);
            ruleThrows();

            state._fsp--;

             after(grammarAccess.getMethodPatternAccess().getThrowsClauseThrowsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodPattern__ThrowsClauseAssignment_4"


    // $ANTLR start "rule__Modifier__ValueAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1099:1: rule__Modifier__ValueAssignment_0 : ( ( 'static' ) ) ;
    public final void rule__Modifier__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1103:1: ( ( ( 'static' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1104:1: ( ( 'static' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1104:1: ( ( 'static' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1105:1: ( 'static' )
            {
             before(grammarAccess.getModifierAccess().getValueStaticKeyword_0_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1106:1: ( 'static' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1107:1: 'static'
            {
             before(grammarAccess.getModifierAccess().getValueStaticKeyword_0_0()); 
            match(input,18,FOLLOW_18_in_rule__Modifier__ValueAssignment_02210); 
             after(grammarAccess.getModifierAccess().getValueStaticKeyword_0_0()); 

            }

             after(grammarAccess.getModifierAccess().getValueStaticKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__ValueAssignment_0"


    // $ANTLR start "rule__Modifier__ValueAssignment_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1122:1: rule__Modifier__ValueAssignment_1 : ( ( 'private' ) ) ;
    public final void rule__Modifier__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1126:1: ( ( ( 'private' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1127:1: ( ( 'private' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1127:1: ( ( 'private' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1128:1: ( 'private' )
            {
             before(grammarAccess.getModifierAccess().getValuePrivateKeyword_1_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1129:1: ( 'private' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1130:1: 'private'
            {
             before(grammarAccess.getModifierAccess().getValuePrivateKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__Modifier__ValueAssignment_12254); 
             after(grammarAccess.getModifierAccess().getValuePrivateKeyword_1_0()); 

            }

             after(grammarAccess.getModifierAccess().getValuePrivateKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__ValueAssignment_1"


    // $ANTLR start "rule__Modifier__ValueAssignment_2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1145:1: rule__Modifier__ValueAssignment_2 : ( ( 'public' ) ) ;
    public final void rule__Modifier__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1149:1: ( ( ( 'public' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1150:1: ( ( 'public' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1150:1: ( ( 'public' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1151:1: ( 'public' )
            {
             before(grammarAccess.getModifierAccess().getValuePublicKeyword_2_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1152:1: ( 'public' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1153:1: 'public'
            {
             before(grammarAccess.getModifierAccess().getValuePublicKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__Modifier__ValueAssignment_22298); 
             after(grammarAccess.getModifierAccess().getValuePublicKeyword_2_0()); 

            }

             after(grammarAccess.getModifierAccess().getValuePublicKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__ValueAssignment_2"


    // $ANTLR start "rule__Modifier__ValueAssignment_3"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1168:1: rule__Modifier__ValueAssignment_3 : ( ( 'final' ) ) ;
    public final void rule__Modifier__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1172:1: ( ( ( 'final' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1173:1: ( ( 'final' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1173:1: ( ( 'final' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1174:1: ( 'final' )
            {
             before(grammarAccess.getModifierAccess().getValueFinalKeyword_3_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1175:1: ( 'final' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1176:1: 'final'
            {
             before(grammarAccess.getModifierAccess().getValueFinalKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__Modifier__ValueAssignment_32342); 
             after(grammarAccess.getModifierAccess().getValueFinalKeyword_3_0()); 

            }

             after(grammarAccess.getModifierAccess().getValueFinalKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__ValueAssignment_3"


    // $ANTLR start "rule__Modifier__ValueAssignment_4"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1191:1: rule__Modifier__ValueAssignment_4 : ( ( 'abstract' ) ) ;
    public final void rule__Modifier__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1195:1: ( ( ( 'abstract' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1196:1: ( ( 'abstract' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1196:1: ( ( 'abstract' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1197:1: ( 'abstract' )
            {
             before(grammarAccess.getModifierAccess().getValueAbstractKeyword_4_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1198:1: ( 'abstract' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1199:1: 'abstract'
            {
             before(grammarAccess.getModifierAccess().getValueAbstractKeyword_4_0()); 
            match(input,22,FOLLOW_22_in_rule__Modifier__ValueAssignment_42386); 
             after(grammarAccess.getModifierAccess().getValueAbstractKeyword_4_0()); 

            }

             after(grammarAccess.getModifierAccess().getValueAbstractKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__ValueAssignment_4"


    // $ANTLR start "rule__Modifier__ValueAssignment_5"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1214:1: rule__Modifier__ValueAssignment_5 : ( ( 'protected' ) ) ;
    public final void rule__Modifier__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1218:1: ( ( ( 'protected' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1219:1: ( ( 'protected' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1219:1: ( ( 'protected' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1220:1: ( 'protected' )
            {
             before(grammarAccess.getModifierAccess().getValueProtectedKeyword_5_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1221:1: ( 'protected' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1222:1: 'protected'
            {
             before(grammarAccess.getModifierAccess().getValueProtectedKeyword_5_0()); 
            match(input,23,FOLLOW_23_in_rule__Modifier__ValueAssignment_52430); 
             after(grammarAccess.getModifierAccess().getValueProtectedKeyword_5_0()); 

            }

             after(grammarAccess.getModifierAccess().getValueProtectedKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modifier__ValueAssignment_5"


    // $ANTLR start "rule__ReturnType__ValueAssignment"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1237:1: rule__ReturnType__ValueAssignment : ( RULE_NAMEWITHWC ) ;
    public final void rule__ReturnType__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1241:1: ( ( RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1242:1: ( RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1242:1: ( RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1243:1: RULE_NAMEWITHWC
            {
             before(grammarAccess.getReturnTypeAccess().getValueNameWithWCTerminalRuleCall_0()); 
            match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_rule__ReturnType__ValueAssignment2469); 
             after(grammarAccess.getReturnTypeAccess().getValueNameWithWCTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnType__ValueAssignment"


    // $ANTLR start "rule__ParameterElement__ValuesAssignment_0_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1252:1: rule__ParameterElement__ValuesAssignment_0_1 : ( ruleParameterType ) ;
    public final void rule__ParameterElement__ValuesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1256:1: ( ( ruleParameterType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1257:1: ( ruleParameterType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1257:1: ( ruleParameterType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1258:1: ruleParameterType
            {
             before(grammarAccess.getParameterElementAccess().getValuesParameterTypeParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleParameterType_in_rule__ParameterElement__ValuesAssignment_0_12500);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterElementAccess().getValuesParameterTypeParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterElement__ValuesAssignment_0_1"


    // $ANTLR start "rule__ParameterElement__TypesAssignment_1_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1267:1: rule__ParameterElement__TypesAssignment_1_1 : ( ruleParameterType ) ;
    public final void rule__ParameterElement__TypesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1271:1: ( ( ruleParameterType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1272:1: ( ruleParameterType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1272:1: ( ruleParameterType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1273:1: ruleParameterType
            {
             before(grammarAccess.getParameterElementAccess().getTypesParameterTypeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleParameterType_in_rule__ParameterElement__TypesAssignment_1_12531);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterElementAccess().getTypesParameterTypeParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterElement__TypesAssignment_1_1"


    // $ANTLR start "rule__ParameterElement__TypesAssignment_1_2_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1282:1: rule__ParameterElement__TypesAssignment_1_2_1 : ( ruleParameterType ) ;
    public final void rule__ParameterElement__TypesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1286:1: ( ( ruleParameterType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1287:1: ( ruleParameterType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1287:1: ( ruleParameterType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1288:1: ruleParameterType
            {
             before(grammarAccess.getParameterElementAccess().getTypesParameterTypeParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleParameterType_in_rule__ParameterElement__TypesAssignment_1_2_12562);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterElementAccess().getTypesParameterTypeParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterElement__TypesAssignment_1_2_1"


    // $ANTLR start "rule__ParameterType__ValueAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1297:1: rule__ParameterType__ValueAssignment_0 : ( RULE_NAMEWITHWC ) ;
    public final void rule__ParameterType__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1301:1: ( ( RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1302:1: ( RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1302:1: ( RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1303:1: RULE_NAMEWITHWC
            {
             before(grammarAccess.getParameterTypeAccess().getValueNameWithWCTerminalRuleCall_0_0()); 
            match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_rule__ParameterType__ValueAssignment_02593); 
             after(grammarAccess.getParameterTypeAccess().getValueNameWithWCTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterType__ValueAssignment_0"


    // $ANTLR start "rule__ParameterType__ValueAssignment_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1312:1: rule__ParameterType__ValueAssignment_1 : ( ( '..' ) ) ;
    public final void rule__ParameterType__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1316:1: ( ( ( '..' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1317:1: ( ( '..' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1317:1: ( ( '..' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1318:1: ( '..' )
            {
             before(grammarAccess.getParameterTypeAccess().getValueFullStopFullStopKeyword_1_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1319:1: ( '..' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1320:1: '..'
            {
             before(grammarAccess.getParameterTypeAccess().getValueFullStopFullStopKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__ParameterType__ValueAssignment_12629); 
             after(grammarAccess.getParameterTypeAccess().getValueFullStopFullStopKeyword_1_0()); 

            }

             after(grammarAccess.getParameterTypeAccess().getValueFullStopFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterType__ValueAssignment_1"


    // $ANTLR start "rule__Throws__ValueAssignment_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1335:1: rule__Throws__ValueAssignment_1 : ( RULE_NAMEWITHWC ) ;
    public final void rule__Throws__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1339:1: ( ( RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1340:1: ( RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1340:1: ( RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1341:1: RULE_NAMEWITHWC
            {
             before(grammarAccess.getThrowsAccess().getValueNameWithWCTerminalRuleCall_1_0()); 
            match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_rule__Throws__ValueAssignment_12668); 
             after(grammarAccess.getThrowsAccess().getValueNameWithWCTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Throws__ValueAssignment_1"


    // $ANTLR start "rule__MethodName__ValueAssignment"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1350:1: rule__MethodName__ValueAssignment : ( RULE_NAMEWITHWC ) ;
    public final void rule__MethodName__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1354:1: ( ( RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1355:1: ( RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1355:1: ( RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1356:1: RULE_NAMEWITHWC
            {
             before(grammarAccess.getMethodNameAccess().getValueNameWithWCTerminalRuleCall_0()); 
            match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_rule__MethodName__ValueAssignment2699); 
             after(grammarAccess.getMethodNameAccess().getValueNameWithWCTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodName__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMethodPattern_in_entryRuleMethodPattern61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodPattern68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group__0_in_ruleMethodPattern94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__Alternatives_in_ruleModifier154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnType_in_entryRuleReturnType181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnType188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnType__ValueAssignment_in_ruleReturnType214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterElement_in_entryRuleParameterElement241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterElement248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Alternatives_in_ruleParameterElement274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterType_in_entryRuleParameterType301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterType308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterType__Alternatives_in_ruleParameterType334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThrows_in_entryRuleThrows361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThrows368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Throws__Group__0_in_ruleThrows394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodName_in_entryRuleMethodName421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodName428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodName__ValueAssignment_in_ruleMethodName454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__ValueAssignment_0_in_rule__Modifier__Alternatives490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__ValueAssignment_1_in_rule__Modifier__Alternatives508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__ValueAssignment_2_in_rule__Modifier__Alternatives526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__ValueAssignment_3_in_rule__Modifier__Alternatives544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__ValueAssignment_4_in_rule__Modifier__Alternatives562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__ValueAssignment_5_in_rule__Modifier__Alternatives580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_0__0_in_rule__ParameterElement__Alternatives613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1__0_in_rule__ParameterElement__Alternatives631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterType__ValueAssignment_0_in_rule__ParameterType__Alternatives664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterType__ValueAssignment_1_in_rule__ParameterType__Alternatives682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group__0__Impl_in_rule__MethodPattern__Group__0713 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group__1_in_rule__MethodPattern__Group__0716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__ModifiersAssignment_0_in_rule__MethodPattern__Group__0__Impl743 = new BitSet(new long[]{0x0000000000FC0002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group__1__Impl_in_rule__MethodPattern__Group__1774 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group__2_in_rule__MethodPattern__Group__1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__ReturnTypeAssignment_1_in_rule__MethodPattern__Group__1__Impl804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group__2__Impl_in_rule__MethodPattern__Group__2834 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group__3_in_rule__MethodPattern__Group__2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__MethodNameAssignment_2_in_rule__MethodPattern__Group__2__Impl864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group__3__Impl_in_rule__MethodPattern__Group__3894 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group__4_in_rule__MethodPattern__Group__3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3__0_in_rule__MethodPattern__Group__3__Impl924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group__4__Impl_in_rule__MethodPattern__Group__4955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__ThrowsClauseAssignment_4_in_rule__MethodPattern__Group__4__Impl982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3__0__Impl_in_rule__MethodPattern__Group_3__01023 = new BitSet(new long[]{0x0000000001008010L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3__1_in_rule__MethodPattern__Group_3__01026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__MethodPattern__Group_3__0__Impl1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3__1__Impl_in_rule__MethodPattern__Group_3__11085 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3__2_in_rule__MethodPattern__Group_3__11088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__ParameterElementsAssignment_3_1_in_rule__MethodPattern__Group_3__1__Impl1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3__2__Impl_in_rule__MethodPattern__Group_3__21145 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3__3_in_rule__MethodPattern__Group_3__21148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3_2__0_in_rule__MethodPattern__Group_3__2__Impl1175 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3__3__Impl_in_rule__MethodPattern__Group_3__31206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MethodPattern__Group_3__3__Impl1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3_2__0__Impl_in_rule__MethodPattern__Group_3_2__01273 = new BitSet(new long[]{0x0000000001008010L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3_2__1_in_rule__MethodPattern__Group_3_2__01276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MethodPattern__Group_3_2__0__Impl1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3_2__1__Impl_in_rule__MethodPattern__Group_3_2__11335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__ParameterElementsAssignment_3_2_1_in_rule__MethodPattern__Group_3_2__1__Impl1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_0__0__Impl_in_rule__ParameterElement__Group_0__01396 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_0__1_in_rule__ParameterElement__Group_0__01399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_0__1__Impl_in_rule__ParameterElement__Group_0__11457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__ValuesAssignment_0_1_in_rule__ParameterElement__Group_0__1__Impl1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1__0__Impl_in_rule__ParameterElement__Group_1__01518 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1__1_in_rule__ParameterElement__Group_1__01521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ParameterElement__Group_1__0__Impl1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1__1__Impl_in_rule__ParameterElement__Group_1__11580 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1__2_in_rule__ParameterElement__Group_1__11583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__TypesAssignment_1_1_in_rule__ParameterElement__Group_1__1__Impl1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1__2__Impl_in_rule__ParameterElement__Group_1__21640 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1__3_in_rule__ParameterElement__Group_1__21643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1_2__0_in_rule__ParameterElement__Group_1__2__Impl1670 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1__3__Impl_in_rule__ParameterElement__Group_1__31701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ParameterElement__Group_1__3__Impl1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1_2__0__Impl_in_rule__ParameterElement__Group_1_2__01768 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1_2__1_in_rule__ParameterElement__Group_1_2__01771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ParameterElement__Group_1_2__0__Impl1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1_2__1__Impl_in_rule__ParameterElement__Group_1_2__11830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__TypesAssignment_1_2_1_in_rule__ParameterElement__Group_1_2__1__Impl1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Throws__Group__0__Impl_in_rule__Throws__Group__01891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Throws__Group__1_in_rule__Throws__Group__01894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Throws__Group__0__Impl1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Throws__Group__1__Impl_in_rule__Throws__Group__11953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Throws__ValueAssignment_1_in_rule__Throws__Group__1__Impl1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__MethodPattern__ModifiersAssignment_02019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnType_in_rule__MethodPattern__ReturnTypeAssignment_12050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodName_in_rule__MethodPattern__MethodNameAssignment_22081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterElement_in_rule__MethodPattern__ParameterElementsAssignment_3_12112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterElement_in_rule__MethodPattern__ParameterElementsAssignment_3_2_12143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThrows_in_rule__MethodPattern__ThrowsClauseAssignment_42174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Modifier__ValueAssignment_02210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Modifier__ValueAssignment_12254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Modifier__ValueAssignment_22298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Modifier__ValueAssignment_32342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Modifier__ValueAssignment_42386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Modifier__ValueAssignment_52430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_rule__ReturnType__ValueAssignment2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterType_in_rule__ParameterElement__ValuesAssignment_0_12500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterType_in_rule__ParameterElement__TypesAssignment_1_12531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterType_in_rule__ParameterElement__TypesAssignment_1_2_12562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_rule__ParameterType__ValueAssignment_02593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ParameterType__ValueAssignment_12629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_rule__Throws__ValueAssignment_12668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_rule__MethodName__ValueAssignment2699 = new BitSet(new long[]{0x0000000000000002L});

}