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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAMEWITHWC", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'..'", "'('", "')'", "','", "'throws'", "'static'", "'private'", "'public'", "'final'", "'abstract'", "'protected'"
    };
    public static final int RULE_ID=5;
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


    // $ANTLR start "entryRuleType"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:116:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:117:1: ( ruleType EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:118:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType181);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType188); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:125:1: ruleType : ( RULE_NAMEWITHWC ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:129:2: ( ( RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:130:1: ( RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:130:1: ( RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:131:1: RULE_NAMEWITHWC
            {
             before(grammarAccess.getTypeAccess().getNameWithWCTerminalRuleCall()); 
            match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleType214); 
             after(grammarAccess.getTypeAccess().getNameWithWCTerminalRuleCall()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleParameterType"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:144:1: entryRuleParameterType : ruleParameterType EOF ;
    public final void entryRuleParameterType() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:145:1: ( ruleParameterType EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:146:1: ruleParameterType EOF
            {
             before(grammarAccess.getParameterTypeRule()); 
            pushFollow(FOLLOW_ruleParameterType_in_entryRuleParameterType240);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterType247); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:153:1: ruleParameterType : ( ( rule__ParameterType__Alternatives ) ) ;
    public final void ruleParameterType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:157:2: ( ( ( rule__ParameterType__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:158:1: ( ( rule__ParameterType__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:158:1: ( ( rule__ParameterType__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:159:1: ( rule__ParameterType__Alternatives )
            {
             before(grammarAccess.getParameterTypeAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:160:1: ( rule__ParameterType__Alternatives )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:160:2: rule__ParameterType__Alternatives
            {
            pushFollow(FOLLOW_rule__ParameterType__Alternatives_in_ruleParameterType273);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:172:1: entryRuleThrows : ruleThrows EOF ;
    public final void entryRuleThrows() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:173:1: ( ruleThrows EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:174:1: ruleThrows EOF
            {
             before(grammarAccess.getThrowsRule()); 
            pushFollow(FOLLOW_ruleThrows_in_entryRuleThrows300);
            ruleThrows();

            state._fsp--;

             after(grammarAccess.getThrowsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThrows307); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:181:1: ruleThrows : ( ( rule__Throws__Group__0 ) ) ;
    public final void ruleThrows() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:185:2: ( ( ( rule__Throws__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:186:1: ( ( rule__Throws__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:186:1: ( ( rule__Throws__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:187:1: ( rule__Throws__Group__0 )
            {
             before(grammarAccess.getThrowsAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:188:1: ( rule__Throws__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:188:2: rule__Throws__Group__0
            {
            pushFollow(FOLLOW_rule__Throws__Group__0_in_ruleThrows333);
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


    // $ANTLR start "entryRuleMethod"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:200:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:201:1: ( ruleMethod EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:202:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod360);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod367); 

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:209:1: ruleMethod : ( RULE_NAMEWITHWC ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:213:2: ( ( RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:214:1: ( RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:214:1: ( RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:215:1: RULE_NAMEWITHWC
            {
             before(grammarAccess.getMethodAccess().getNameWithWCTerminalRuleCall()); 
            match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleMethod393); 
             after(grammarAccess.getMethodAccess().getNameWithWCTerminalRuleCall()); 

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "rule__Modifier__Alternatives"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:228:1: rule__Modifier__Alternatives : ( ( ( rule__Modifier__ValueAssignment_0 ) ) | ( ( rule__Modifier__ValueAssignment_1 ) ) | ( ( rule__Modifier__ValueAssignment_2 ) ) | ( ( rule__Modifier__ValueAssignment_3 ) ) | ( ( rule__Modifier__ValueAssignment_4 ) ) | ( ( rule__Modifier__ValueAssignment_5 ) ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:232:1: ( ( ( rule__Modifier__ValueAssignment_0 ) ) | ( ( rule__Modifier__ValueAssignment_1 ) ) | ( ( rule__Modifier__ValueAssignment_2 ) ) | ( ( rule__Modifier__ValueAssignment_3 ) ) | ( ( rule__Modifier__ValueAssignment_4 ) ) | ( ( rule__Modifier__ValueAssignment_5 ) ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            case 20:
                {
                alt1=4;
                }
                break;
            case 21:
                {
                alt1=5;
                }
                break;
            case 22:
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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:233:1: ( ( rule__Modifier__ValueAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:233:1: ( ( rule__Modifier__ValueAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:234:1: ( rule__Modifier__ValueAssignment_0 )
                    {
                     before(grammarAccess.getModifierAccess().getValueAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:235:1: ( rule__Modifier__ValueAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:235:2: rule__Modifier__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Modifier__ValueAssignment_0_in_rule__Modifier__Alternatives428);
                    rule__Modifier__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModifierAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:239:6: ( ( rule__Modifier__ValueAssignment_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:239:6: ( ( rule__Modifier__ValueAssignment_1 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:240:1: ( rule__Modifier__ValueAssignment_1 )
                    {
                     before(grammarAccess.getModifierAccess().getValueAssignment_1()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:241:1: ( rule__Modifier__ValueAssignment_1 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:241:2: rule__Modifier__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Modifier__ValueAssignment_1_in_rule__Modifier__Alternatives446);
                    rule__Modifier__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModifierAccess().getValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:245:6: ( ( rule__Modifier__ValueAssignment_2 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:245:6: ( ( rule__Modifier__ValueAssignment_2 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:246:1: ( rule__Modifier__ValueAssignment_2 )
                    {
                     before(grammarAccess.getModifierAccess().getValueAssignment_2()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:247:1: ( rule__Modifier__ValueAssignment_2 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:247:2: rule__Modifier__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Modifier__ValueAssignment_2_in_rule__Modifier__Alternatives464);
                    rule__Modifier__ValueAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModifierAccess().getValueAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:251:6: ( ( rule__Modifier__ValueAssignment_3 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:251:6: ( ( rule__Modifier__ValueAssignment_3 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:252:1: ( rule__Modifier__ValueAssignment_3 )
                    {
                     before(grammarAccess.getModifierAccess().getValueAssignment_3()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:253:1: ( rule__Modifier__ValueAssignment_3 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:253:2: rule__Modifier__ValueAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Modifier__ValueAssignment_3_in_rule__Modifier__Alternatives482);
                    rule__Modifier__ValueAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getModifierAccess().getValueAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:257:6: ( ( rule__Modifier__ValueAssignment_4 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:257:6: ( ( rule__Modifier__ValueAssignment_4 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:258:1: ( rule__Modifier__ValueAssignment_4 )
                    {
                     before(grammarAccess.getModifierAccess().getValueAssignment_4()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:259:1: ( rule__Modifier__ValueAssignment_4 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:259:2: rule__Modifier__ValueAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Modifier__ValueAssignment_4_in_rule__Modifier__Alternatives500);
                    rule__Modifier__ValueAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getModifierAccess().getValueAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:263:6: ( ( rule__Modifier__ValueAssignment_5 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:263:6: ( ( rule__Modifier__ValueAssignment_5 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:264:1: ( rule__Modifier__ValueAssignment_5 )
                    {
                     before(grammarAccess.getModifierAccess().getValueAssignment_5()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:265:1: ( rule__Modifier__ValueAssignment_5 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:265:2: rule__Modifier__ValueAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Modifier__ValueAssignment_5_in_rule__Modifier__Alternatives518);
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


    // $ANTLR start "rule__ParameterType__Alternatives"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:274:1: rule__ParameterType__Alternatives : ( ( RULE_NAMEWITHWC ) | ( '..' ) );
    public final void rule__ParameterType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:278:1: ( ( RULE_NAMEWITHWC ) | ( '..' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_NAMEWITHWC) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:279:1: ( RULE_NAMEWITHWC )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:279:1: ( RULE_NAMEWITHWC )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:280:1: RULE_NAMEWITHWC
                    {
                     before(grammarAccess.getParameterTypeAccess().getNameWithWCTerminalRuleCall_0()); 
                    match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_rule__ParameterType__Alternatives551); 
                     after(grammarAccess.getParameterTypeAccess().getNameWithWCTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:285:6: ( '..' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:285:6: ( '..' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:286:1: '..'
                    {
                     before(grammarAccess.getParameterTypeAccess().getFullStopFullStopKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__ParameterType__Alternatives569); 
                     after(grammarAccess.getParameterTypeAccess().getFullStopFullStopKeyword_1()); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:300:1: rule__MethodPattern__Group__0 : rule__MethodPattern__Group__0__Impl rule__MethodPattern__Group__1 ;
    public final void rule__MethodPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:304:1: ( rule__MethodPattern__Group__0__Impl rule__MethodPattern__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:305:2: rule__MethodPattern__Group__0__Impl rule__MethodPattern__Group__1
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group__0__Impl_in_rule__MethodPattern__Group__0601);
            rule__MethodPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodPattern__Group__1_in_rule__MethodPattern__Group__0604);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:312:1: rule__MethodPattern__Group__0__Impl : ( ( rule__MethodPattern__ModifiersAssignment_0 )* ) ;
    public final void rule__MethodPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:316:1: ( ( ( rule__MethodPattern__ModifiersAssignment_0 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:317:1: ( ( rule__MethodPattern__ModifiersAssignment_0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:317:1: ( ( rule__MethodPattern__ModifiersAssignment_0 )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:318:1: ( rule__MethodPattern__ModifiersAssignment_0 )*
            {
             before(grammarAccess.getMethodPatternAccess().getModifiersAssignment_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:319:1: ( rule__MethodPattern__ModifiersAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=17 && LA3_0<=22)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:319:2: rule__MethodPattern__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__MethodPattern__ModifiersAssignment_0_in_rule__MethodPattern__Group__0__Impl631);
            	    rule__MethodPattern__ModifiersAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:329:1: rule__MethodPattern__Group__1 : rule__MethodPattern__Group__1__Impl rule__MethodPattern__Group__2 ;
    public final void rule__MethodPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:333:1: ( rule__MethodPattern__Group__1__Impl rule__MethodPattern__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:334:2: rule__MethodPattern__Group__1__Impl rule__MethodPattern__Group__2
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group__1__Impl_in_rule__MethodPattern__Group__1662);
            rule__MethodPattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodPattern__Group__2_in_rule__MethodPattern__Group__1665);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:341:1: rule__MethodPattern__Group__1__Impl : ( ( rule__MethodPattern__ReturnTypeAssignment_1 ) ) ;
    public final void rule__MethodPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:345:1: ( ( ( rule__MethodPattern__ReturnTypeAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:346:1: ( ( rule__MethodPattern__ReturnTypeAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:346:1: ( ( rule__MethodPattern__ReturnTypeAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:347:1: ( rule__MethodPattern__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getMethodPatternAccess().getReturnTypeAssignment_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:348:1: ( rule__MethodPattern__ReturnTypeAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:348:2: rule__MethodPattern__ReturnTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__MethodPattern__ReturnTypeAssignment_1_in_rule__MethodPattern__Group__1__Impl692);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:358:1: rule__MethodPattern__Group__2 : rule__MethodPattern__Group__2__Impl rule__MethodPattern__Group__3 ;
    public final void rule__MethodPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:362:1: ( rule__MethodPattern__Group__2__Impl rule__MethodPattern__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:363:2: rule__MethodPattern__Group__2__Impl rule__MethodPattern__Group__3
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group__2__Impl_in_rule__MethodPattern__Group__2722);
            rule__MethodPattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodPattern__Group__3_in_rule__MethodPattern__Group__2725);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:370:1: rule__MethodPattern__Group__2__Impl : ( ( rule__MethodPattern__MethodAssignment_2 ) ) ;
    public final void rule__MethodPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:374:1: ( ( ( rule__MethodPattern__MethodAssignment_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:375:1: ( ( rule__MethodPattern__MethodAssignment_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:375:1: ( ( rule__MethodPattern__MethodAssignment_2 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:376:1: ( rule__MethodPattern__MethodAssignment_2 )
            {
             before(grammarAccess.getMethodPatternAccess().getMethodAssignment_2()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:377:1: ( rule__MethodPattern__MethodAssignment_2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:377:2: rule__MethodPattern__MethodAssignment_2
            {
            pushFollow(FOLLOW_rule__MethodPattern__MethodAssignment_2_in_rule__MethodPattern__Group__2__Impl752);
            rule__MethodPattern__MethodAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMethodPatternAccess().getMethodAssignment_2()); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:387:1: rule__MethodPattern__Group__3 : rule__MethodPattern__Group__3__Impl rule__MethodPattern__Group__4 ;
    public final void rule__MethodPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:391:1: ( rule__MethodPattern__Group__3__Impl rule__MethodPattern__Group__4 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:392:2: rule__MethodPattern__Group__3__Impl rule__MethodPattern__Group__4
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group__3__Impl_in_rule__MethodPattern__Group__3782);
            rule__MethodPattern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodPattern__Group__4_in_rule__MethodPattern__Group__3785);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:399:1: rule__MethodPattern__Group__3__Impl : ( ( rule__MethodPattern__Group_3__0 )? ) ;
    public final void rule__MethodPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:403:1: ( ( ( rule__MethodPattern__Group_3__0 )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:404:1: ( ( rule__MethodPattern__Group_3__0 )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:404:1: ( ( rule__MethodPattern__Group_3__0 )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:405:1: ( rule__MethodPattern__Group_3__0 )?
            {
             before(grammarAccess.getMethodPatternAccess().getGroup_3()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:406:1: ( rule__MethodPattern__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:406:2: rule__MethodPattern__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__MethodPattern__Group_3__0_in_rule__MethodPattern__Group__3__Impl812);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:416:1: rule__MethodPattern__Group__4 : rule__MethodPattern__Group__4__Impl ;
    public final void rule__MethodPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:420:1: ( rule__MethodPattern__Group__4__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:421:2: rule__MethodPattern__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group__4__Impl_in_rule__MethodPattern__Group__4843);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:427:1: rule__MethodPattern__Group__4__Impl : ( ( rule__MethodPattern__ThrowsClauseAssignment_4 )? ) ;
    public final void rule__MethodPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:431:1: ( ( ( rule__MethodPattern__ThrowsClauseAssignment_4 )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:432:1: ( ( rule__MethodPattern__ThrowsClauseAssignment_4 )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:432:1: ( ( rule__MethodPattern__ThrowsClauseAssignment_4 )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:433:1: ( rule__MethodPattern__ThrowsClauseAssignment_4 )?
            {
             before(grammarAccess.getMethodPatternAccess().getThrowsClauseAssignment_4()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:434:1: ( rule__MethodPattern__ThrowsClauseAssignment_4 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:434:2: rule__MethodPattern__ThrowsClauseAssignment_4
                    {
                    pushFollow(FOLLOW_rule__MethodPattern__ThrowsClauseAssignment_4_in_rule__MethodPattern__Group__4__Impl870);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:454:1: rule__MethodPattern__Group_3__0 : rule__MethodPattern__Group_3__0__Impl rule__MethodPattern__Group_3__1 ;
    public final void rule__MethodPattern__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:458:1: ( rule__MethodPattern__Group_3__0__Impl rule__MethodPattern__Group_3__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:459:2: rule__MethodPattern__Group_3__0__Impl rule__MethodPattern__Group_3__1
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group_3__0__Impl_in_rule__MethodPattern__Group_3__0911);
            rule__MethodPattern__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodPattern__Group_3__1_in_rule__MethodPattern__Group_3__0914);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:466:1: rule__MethodPattern__Group_3__0__Impl : ( '(' ) ;
    public final void rule__MethodPattern__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:470:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:471:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:471:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:472:1: '('
            {
             before(grammarAccess.getMethodPatternAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,13,FOLLOW_13_in_rule__MethodPattern__Group_3__0__Impl942); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:485:1: rule__MethodPattern__Group_3__1 : rule__MethodPattern__Group_3__1__Impl rule__MethodPattern__Group_3__2 ;
    public final void rule__MethodPattern__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:489:1: ( rule__MethodPattern__Group_3__1__Impl rule__MethodPattern__Group_3__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:490:2: rule__MethodPattern__Group_3__1__Impl rule__MethodPattern__Group_3__2
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group_3__1__Impl_in_rule__MethodPattern__Group_3__1973);
            rule__MethodPattern__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodPattern__Group_3__2_in_rule__MethodPattern__Group_3__1976);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:497:1: rule__MethodPattern__Group_3__1__Impl : ( ( rule__MethodPattern__ParameterTypesAssignment_3_1 ) ) ;
    public final void rule__MethodPattern__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:501:1: ( ( ( rule__MethodPattern__ParameterTypesAssignment_3_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:502:1: ( ( rule__MethodPattern__ParameterTypesAssignment_3_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:502:1: ( ( rule__MethodPattern__ParameterTypesAssignment_3_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:503:1: ( rule__MethodPattern__ParameterTypesAssignment_3_1 )
            {
             before(grammarAccess.getMethodPatternAccess().getParameterTypesAssignment_3_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:504:1: ( rule__MethodPattern__ParameterTypesAssignment_3_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:504:2: rule__MethodPattern__ParameterTypesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__MethodPattern__ParameterTypesAssignment_3_1_in_rule__MethodPattern__Group_3__1__Impl1003);
            rule__MethodPattern__ParameterTypesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodPatternAccess().getParameterTypesAssignment_3_1()); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:514:1: rule__MethodPattern__Group_3__2 : rule__MethodPattern__Group_3__2__Impl rule__MethodPattern__Group_3__3 ;
    public final void rule__MethodPattern__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:518:1: ( rule__MethodPattern__Group_3__2__Impl rule__MethodPattern__Group_3__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:519:2: rule__MethodPattern__Group_3__2__Impl rule__MethodPattern__Group_3__3
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group_3__2__Impl_in_rule__MethodPattern__Group_3__21033);
            rule__MethodPattern__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodPattern__Group_3__3_in_rule__MethodPattern__Group_3__21036);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:526:1: rule__MethodPattern__Group_3__2__Impl : ( ( rule__MethodPattern__Group_3_2__0 )* ) ;
    public final void rule__MethodPattern__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:530:1: ( ( ( rule__MethodPattern__Group_3_2__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:531:1: ( ( rule__MethodPattern__Group_3_2__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:531:1: ( ( rule__MethodPattern__Group_3_2__0 )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:532:1: ( rule__MethodPattern__Group_3_2__0 )*
            {
             before(grammarAccess.getMethodPatternAccess().getGroup_3_2()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:533:1: ( rule__MethodPattern__Group_3_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:533:2: rule__MethodPattern__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__MethodPattern__Group_3_2__0_in_rule__MethodPattern__Group_3__2__Impl1063);
            	    rule__MethodPattern__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:543:1: rule__MethodPattern__Group_3__3 : rule__MethodPattern__Group_3__3__Impl ;
    public final void rule__MethodPattern__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:547:1: ( rule__MethodPattern__Group_3__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:548:2: rule__MethodPattern__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group_3__3__Impl_in_rule__MethodPattern__Group_3__31094);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:554:1: rule__MethodPattern__Group_3__3__Impl : ( ')' ) ;
    public final void rule__MethodPattern__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:558:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:559:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:559:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:560:1: ')'
            {
             before(grammarAccess.getMethodPatternAccess().getRightParenthesisKeyword_3_3()); 
            match(input,14,FOLLOW_14_in_rule__MethodPattern__Group_3__3__Impl1122); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:581:1: rule__MethodPattern__Group_3_2__0 : rule__MethodPattern__Group_3_2__0__Impl rule__MethodPattern__Group_3_2__1 ;
    public final void rule__MethodPattern__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:585:1: ( rule__MethodPattern__Group_3_2__0__Impl rule__MethodPattern__Group_3_2__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:586:2: rule__MethodPattern__Group_3_2__0__Impl rule__MethodPattern__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group_3_2__0__Impl_in_rule__MethodPattern__Group_3_2__01161);
            rule__MethodPattern__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodPattern__Group_3_2__1_in_rule__MethodPattern__Group_3_2__01164);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:593:1: rule__MethodPattern__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__MethodPattern__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:597:1: ( ( ',' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:598:1: ( ',' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:598:1: ( ',' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:599:1: ','
            {
             before(grammarAccess.getMethodPatternAccess().getCommaKeyword_3_2_0()); 
            match(input,15,FOLLOW_15_in_rule__MethodPattern__Group_3_2__0__Impl1192); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:612:1: rule__MethodPattern__Group_3_2__1 : rule__MethodPattern__Group_3_2__1__Impl ;
    public final void rule__MethodPattern__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:616:1: ( rule__MethodPattern__Group_3_2__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:617:2: rule__MethodPattern__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group_3_2__1__Impl_in_rule__MethodPattern__Group_3_2__11223);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:623:1: rule__MethodPattern__Group_3_2__1__Impl : ( ( rule__MethodPattern__ParameterTypesAssignment_3_2_1 ) ) ;
    public final void rule__MethodPattern__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:627:1: ( ( ( rule__MethodPattern__ParameterTypesAssignment_3_2_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:628:1: ( ( rule__MethodPattern__ParameterTypesAssignment_3_2_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:628:1: ( ( rule__MethodPattern__ParameterTypesAssignment_3_2_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:629:1: ( rule__MethodPattern__ParameterTypesAssignment_3_2_1 )
            {
             before(grammarAccess.getMethodPatternAccess().getParameterTypesAssignment_3_2_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:630:1: ( rule__MethodPattern__ParameterTypesAssignment_3_2_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:630:2: rule__MethodPattern__ParameterTypesAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__MethodPattern__ParameterTypesAssignment_3_2_1_in_rule__MethodPattern__Group_3_2__1__Impl1250);
            rule__MethodPattern__ParameterTypesAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodPatternAccess().getParameterTypesAssignment_3_2_1()); 

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


    // $ANTLR start "rule__Throws__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:644:1: rule__Throws__Group__0 : rule__Throws__Group__0__Impl rule__Throws__Group__1 ;
    public final void rule__Throws__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:648:1: ( rule__Throws__Group__0__Impl rule__Throws__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:649:2: rule__Throws__Group__0__Impl rule__Throws__Group__1
            {
            pushFollow(FOLLOW_rule__Throws__Group__0__Impl_in_rule__Throws__Group__01284);
            rule__Throws__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Throws__Group__1_in_rule__Throws__Group__01287);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:656:1: rule__Throws__Group__0__Impl : ( 'throws' ) ;
    public final void rule__Throws__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:660:1: ( ( 'throws' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:661:1: ( 'throws' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:661:1: ( 'throws' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:662:1: 'throws'
            {
             before(grammarAccess.getThrowsAccess().getThrowsKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Throws__Group__0__Impl1315); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:675:1: rule__Throws__Group__1 : rule__Throws__Group__1__Impl ;
    public final void rule__Throws__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:679:1: ( rule__Throws__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:680:2: rule__Throws__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Throws__Group__1__Impl_in_rule__Throws__Group__11346);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:686:1: rule__Throws__Group__1__Impl : ( ( rule__Throws__ThrownTypeAssignment_1 ) ) ;
    public final void rule__Throws__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:690:1: ( ( ( rule__Throws__ThrownTypeAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:691:1: ( ( rule__Throws__ThrownTypeAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:691:1: ( ( rule__Throws__ThrownTypeAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:692:1: ( rule__Throws__ThrownTypeAssignment_1 )
            {
             before(grammarAccess.getThrowsAccess().getThrownTypeAssignment_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:693:1: ( rule__Throws__ThrownTypeAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:693:2: rule__Throws__ThrownTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Throws__ThrownTypeAssignment_1_in_rule__Throws__Group__1__Impl1373);
            rule__Throws__ThrownTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getThrowsAccess().getThrownTypeAssignment_1()); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:708:1: rule__MethodPattern__ModifiersAssignment_0 : ( ruleModifier ) ;
    public final void rule__MethodPattern__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:712:1: ( ( ruleModifier ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:713:1: ( ruleModifier )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:713:1: ( ruleModifier )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:714:1: ruleModifier
            {
             before(grammarAccess.getMethodPatternAccess().getModifiersModifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleModifier_in_rule__MethodPattern__ModifiersAssignment_01412);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:723:1: rule__MethodPattern__ReturnTypeAssignment_1 : ( ruleType ) ;
    public final void rule__MethodPattern__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:727:1: ( ( ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:728:1: ( ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:728:1: ( ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:729:1: ruleType
            {
             before(grammarAccess.getMethodPatternAccess().getReturnTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__MethodPattern__ReturnTypeAssignment_11443);
            ruleType();

            state._fsp--;

             after(grammarAccess.getMethodPatternAccess().getReturnTypeTypeParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__MethodPattern__MethodAssignment_2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:738:1: rule__MethodPattern__MethodAssignment_2 : ( ruleMethod ) ;
    public final void rule__MethodPattern__MethodAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:742:1: ( ( ruleMethod ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:743:1: ( ruleMethod )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:743:1: ( ruleMethod )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:744:1: ruleMethod
            {
             before(grammarAccess.getMethodPatternAccess().getMethodMethodParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleMethod_in_rule__MethodPattern__MethodAssignment_21474);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodPatternAccess().getMethodMethodParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MethodPattern__MethodAssignment_2"


    // $ANTLR start "rule__MethodPattern__ParameterTypesAssignment_3_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:753:1: rule__MethodPattern__ParameterTypesAssignment_3_1 : ( ruleParameterType ) ;
    public final void rule__MethodPattern__ParameterTypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:757:1: ( ( ruleParameterType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:758:1: ( ruleParameterType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:758:1: ( ruleParameterType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:759:1: ruleParameterType
            {
             before(grammarAccess.getMethodPatternAccess().getParameterTypesParameterTypeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleParameterType_in_rule__MethodPattern__ParameterTypesAssignment_3_11505);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getMethodPatternAccess().getParameterTypesParameterTypeParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__MethodPattern__ParameterTypesAssignment_3_1"


    // $ANTLR start "rule__MethodPattern__ParameterTypesAssignment_3_2_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:768:1: rule__MethodPattern__ParameterTypesAssignment_3_2_1 : ( ruleParameterType ) ;
    public final void rule__MethodPattern__ParameterTypesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:772:1: ( ( ruleParameterType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:773:1: ( ruleParameterType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:773:1: ( ruleParameterType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:774:1: ruleParameterType
            {
             before(grammarAccess.getMethodPatternAccess().getParameterTypesParameterTypeParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_ruleParameterType_in_rule__MethodPattern__ParameterTypesAssignment_3_2_11536);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getMethodPatternAccess().getParameterTypesParameterTypeParserRuleCall_3_2_1_0()); 

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
    // $ANTLR end "rule__MethodPattern__ParameterTypesAssignment_3_2_1"


    // $ANTLR start "rule__MethodPattern__ThrowsClauseAssignment_4"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:783:1: rule__MethodPattern__ThrowsClauseAssignment_4 : ( ruleThrows ) ;
    public final void rule__MethodPattern__ThrowsClauseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:787:1: ( ( ruleThrows ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:788:1: ( ruleThrows )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:788:1: ( ruleThrows )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:789:1: ruleThrows
            {
             before(grammarAccess.getMethodPatternAccess().getThrowsClauseThrowsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleThrows_in_rule__MethodPattern__ThrowsClauseAssignment_41567);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:798:1: rule__Modifier__ValueAssignment_0 : ( ( 'static' ) ) ;
    public final void rule__Modifier__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:802:1: ( ( ( 'static' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:803:1: ( ( 'static' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:803:1: ( ( 'static' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:804:1: ( 'static' )
            {
             before(grammarAccess.getModifierAccess().getValueStaticKeyword_0_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:805:1: ( 'static' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:806:1: 'static'
            {
             before(grammarAccess.getModifierAccess().getValueStaticKeyword_0_0()); 
            match(input,17,FOLLOW_17_in_rule__Modifier__ValueAssignment_01603); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:821:1: rule__Modifier__ValueAssignment_1 : ( ( 'private' ) ) ;
    public final void rule__Modifier__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:825:1: ( ( ( 'private' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:826:1: ( ( 'private' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:826:1: ( ( 'private' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:827:1: ( 'private' )
            {
             before(grammarAccess.getModifierAccess().getValuePrivateKeyword_1_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:828:1: ( 'private' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:829:1: 'private'
            {
             before(grammarAccess.getModifierAccess().getValuePrivateKeyword_1_0()); 
            match(input,18,FOLLOW_18_in_rule__Modifier__ValueAssignment_11647); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:844:1: rule__Modifier__ValueAssignment_2 : ( ( 'public' ) ) ;
    public final void rule__Modifier__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:848:1: ( ( ( 'public' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:849:1: ( ( 'public' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:849:1: ( ( 'public' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:850:1: ( 'public' )
            {
             before(grammarAccess.getModifierAccess().getValuePublicKeyword_2_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:851:1: ( 'public' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:852:1: 'public'
            {
             before(grammarAccess.getModifierAccess().getValuePublicKeyword_2_0()); 
            match(input,19,FOLLOW_19_in_rule__Modifier__ValueAssignment_21691); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:867:1: rule__Modifier__ValueAssignment_3 : ( ( 'final' ) ) ;
    public final void rule__Modifier__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:871:1: ( ( ( 'final' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:872:1: ( ( 'final' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:872:1: ( ( 'final' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:873:1: ( 'final' )
            {
             before(grammarAccess.getModifierAccess().getValueFinalKeyword_3_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:874:1: ( 'final' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:875:1: 'final'
            {
             before(grammarAccess.getModifierAccess().getValueFinalKeyword_3_0()); 
            match(input,20,FOLLOW_20_in_rule__Modifier__ValueAssignment_31735); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:890:1: rule__Modifier__ValueAssignment_4 : ( ( 'abstract' ) ) ;
    public final void rule__Modifier__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:894:1: ( ( ( 'abstract' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:895:1: ( ( 'abstract' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:895:1: ( ( 'abstract' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:896:1: ( 'abstract' )
            {
             before(grammarAccess.getModifierAccess().getValueAbstractKeyword_4_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:897:1: ( 'abstract' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:898:1: 'abstract'
            {
             before(grammarAccess.getModifierAccess().getValueAbstractKeyword_4_0()); 
            match(input,21,FOLLOW_21_in_rule__Modifier__ValueAssignment_41779); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:913:1: rule__Modifier__ValueAssignment_5 : ( ( 'protected' ) ) ;
    public final void rule__Modifier__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:917:1: ( ( ( 'protected' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:918:1: ( ( 'protected' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:918:1: ( ( 'protected' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:919:1: ( 'protected' )
            {
             before(grammarAccess.getModifierAccess().getValueProtectedKeyword_5_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:920:1: ( 'protected' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:921:1: 'protected'
            {
             before(grammarAccess.getModifierAccess().getValueProtectedKeyword_5_0()); 
            match(input,22,FOLLOW_22_in_rule__Modifier__ValueAssignment_51823); 
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


    // $ANTLR start "rule__Throws__ThrownTypeAssignment_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:936:1: rule__Throws__ThrownTypeAssignment_1 : ( ruleType ) ;
    public final void rule__Throws__ThrownTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:940:1: ( ( ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:941:1: ( ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:941:1: ( ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:942:1: ruleType
            {
             before(grammarAccess.getThrowsAccess().getThrownTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Throws__ThrownTypeAssignment_11862);
            ruleType();

            state._fsp--;

             after(grammarAccess.getThrowsAccess().getThrownTypeTypeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Throws__ThrownTypeAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMethodPattern_in_entryRuleMethodPattern61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodPattern68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group__0_in_ruleMethodPattern94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__Alternatives_in_ruleModifier154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleType214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterType_in_entryRuleParameterType240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterType247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterType__Alternatives_in_ruleParameterType273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThrows_in_entryRuleThrows300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThrows307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Throws__Group__0_in_ruleThrows333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleMethod393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__ValueAssignment_0_in_rule__Modifier__Alternatives428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__ValueAssignment_1_in_rule__Modifier__Alternatives446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__ValueAssignment_2_in_rule__Modifier__Alternatives464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__ValueAssignment_3_in_rule__Modifier__Alternatives482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__ValueAssignment_4_in_rule__Modifier__Alternatives500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__ValueAssignment_5_in_rule__Modifier__Alternatives518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_rule__ParameterType__Alternatives551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ParameterType__Alternatives569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group__0__Impl_in_rule__MethodPattern__Group__0601 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group__1_in_rule__MethodPattern__Group__0604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__ModifiersAssignment_0_in_rule__MethodPattern__Group__0__Impl631 = new BitSet(new long[]{0x00000000007E0002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group__1__Impl_in_rule__MethodPattern__Group__1662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group__2_in_rule__MethodPattern__Group__1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__ReturnTypeAssignment_1_in_rule__MethodPattern__Group__1__Impl692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group__2__Impl_in_rule__MethodPattern__Group__2722 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group__3_in_rule__MethodPattern__Group__2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__MethodAssignment_2_in_rule__MethodPattern__Group__2__Impl752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group__3__Impl_in_rule__MethodPattern__Group__3782 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group__4_in_rule__MethodPattern__Group__3785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3__0_in_rule__MethodPattern__Group__3__Impl812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group__4__Impl_in_rule__MethodPattern__Group__4843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__ThrowsClauseAssignment_4_in_rule__MethodPattern__Group__4__Impl870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3__0__Impl_in_rule__MethodPattern__Group_3__0911 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3__1_in_rule__MethodPattern__Group_3__0914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MethodPattern__Group_3__0__Impl942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3__1__Impl_in_rule__MethodPattern__Group_3__1973 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3__2_in_rule__MethodPattern__Group_3__1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__ParameterTypesAssignment_3_1_in_rule__MethodPattern__Group_3__1__Impl1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3__2__Impl_in_rule__MethodPattern__Group_3__21033 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3__3_in_rule__MethodPattern__Group_3__21036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3_2__0_in_rule__MethodPattern__Group_3__2__Impl1063 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3__3__Impl_in_rule__MethodPattern__Group_3__31094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MethodPattern__Group_3__3__Impl1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3_2__0__Impl_in_rule__MethodPattern__Group_3_2__01161 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3_2__1_in_rule__MethodPattern__Group_3_2__01164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__MethodPattern__Group_3_2__0__Impl1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3_2__1__Impl_in_rule__MethodPattern__Group_3_2__11223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__ParameterTypesAssignment_3_2_1_in_rule__MethodPattern__Group_3_2__1__Impl1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Throws__Group__0__Impl_in_rule__Throws__Group__01284 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Throws__Group__1_in_rule__Throws__Group__01287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Throws__Group__0__Impl1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Throws__Group__1__Impl_in_rule__Throws__Group__11346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Throws__ThrownTypeAssignment_1_in_rule__Throws__Group__1__Impl1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__MethodPattern__ModifiersAssignment_01412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__MethodPattern__ReturnTypeAssignment_11443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__MethodPattern__MethodAssignment_21474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterType_in_rule__MethodPattern__ParameterTypesAssignment_3_11505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterType_in_rule__MethodPattern__ParameterTypesAssignment_3_2_11536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThrows_in_rule__MethodPattern__ThrowsClauseAssignment_41567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Modifier__ValueAssignment_01603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Modifier__ValueAssignment_11647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Modifier__ValueAssignment_21691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Modifier__ValueAssignment_31735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Modifier__ValueAssignment_41779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Modifier__ValueAssignment_51823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Throws__ThrownTypeAssignment_11862 = new BitSet(new long[]{0x0000000000000002L});

}