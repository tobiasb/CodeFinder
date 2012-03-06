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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAMEWITHWC", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'..'", "'('", "')'", "','", "'{'", "'}'", "'throws'", "'static'", "'private'", "'public'", "'final'", "'abstract'", "'protected'"
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


    // $ANTLR start "entryRuleParameterElement"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:144:1: entryRuleParameterElement : ruleParameterElement EOF ;
    public final void entryRuleParameterElement() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:145:1: ( ruleParameterElement EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:146:1: ruleParameterElement EOF
            {
             before(grammarAccess.getParameterElementRule()); 
            pushFollow(FOLLOW_ruleParameterElement_in_entryRuleParameterElement240);
            ruleParameterElement();

            state._fsp--;

             after(grammarAccess.getParameterElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterElement247); 

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
            pushFollow(FOLLOW_rule__ParameterElement__Alternatives_in_ruleParameterElement273);
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
            pushFollow(FOLLOW_ruleParameterType_in_entryRuleParameterType300);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterType307); 

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
            pushFollow(FOLLOW_rule__ParameterType__Alternatives_in_ruleParameterType333);
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
            pushFollow(FOLLOW_ruleThrows_in_entryRuleThrows360);
            ruleThrows();

            state._fsp--;

             after(grammarAccess.getThrowsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThrows367); 

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
            pushFollow(FOLLOW_rule__Throws__Group__0_in_ruleThrows393);
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
            pushFollow(FOLLOW_ruleMethodName_in_entryRuleMethodName420);
            ruleMethodName();

            state._fsp--;

             after(grammarAccess.getMethodNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodName427); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:237:1: ruleMethodName : ( RULE_NAMEWITHWC ) ;
    public final void ruleMethodName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:241:2: ( ( RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:242:1: ( RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:242:1: ( RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:243:1: RULE_NAMEWITHWC
            {
             before(grammarAccess.getMethodNameAccess().getNameWithWCTerminalRuleCall()); 
            match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleMethodName453); 
             after(grammarAccess.getMethodNameAccess().getNameWithWCTerminalRuleCall()); 

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
            case 19:
                {
                alt1=1;
                }
                break;
            case 20:
                {
                alt1=2;
                }
                break;
            case 21:
                {
                alt1=3;
                }
                break;
            case 22:
                {
                alt1=4;
                }
                break;
            case 23:
                {
                alt1=5;
                }
                break;
            case 24:
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
                    pushFollow(FOLLOW_rule__Modifier__ValueAssignment_0_in_rule__Modifier__Alternatives488);
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
                    pushFollow(FOLLOW_rule__Modifier__ValueAssignment_1_in_rule__Modifier__Alternatives506);
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
                    pushFollow(FOLLOW_rule__Modifier__ValueAssignment_2_in_rule__Modifier__Alternatives524);
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
                    pushFollow(FOLLOW_rule__Modifier__ValueAssignment_3_in_rule__Modifier__Alternatives542);
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
                    pushFollow(FOLLOW_rule__Modifier__ValueAssignment_4_in_rule__Modifier__Alternatives560);
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
                    pushFollow(FOLLOW_rule__Modifier__ValueAssignment_5_in_rule__Modifier__Alternatives578);
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

            if ( (LA2_0==RULE_NAMEWITHWC||LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
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
                    pushFollow(FOLLOW_rule__ParameterElement__Group_0__0_in_rule__ParameterElement__Alternatives611);
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
                    pushFollow(FOLLOW_rule__ParameterElement__Group_1__0_in_rule__ParameterElement__Alternatives629);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:324:1: rule__ParameterType__Alternatives : ( ( RULE_NAMEWITHWC ) | ( '..' ) );
    public final void rule__ParameterType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:328:1: ( ( RULE_NAMEWITHWC ) | ( '..' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_NAMEWITHWC) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:329:1: ( RULE_NAMEWITHWC )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:329:1: ( RULE_NAMEWITHWC )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:330:1: RULE_NAMEWITHWC
                    {
                     before(grammarAccess.getParameterTypeAccess().getNameWithWCTerminalRuleCall_0()); 
                    match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_rule__ParameterType__Alternatives662); 
                     after(grammarAccess.getParameterTypeAccess().getNameWithWCTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:335:6: ( '..' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:335:6: ( '..' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:336:1: '..'
                    {
                     before(grammarAccess.getParameterTypeAccess().getFullStopFullStopKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__ParameterType__Alternatives680); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:350:1: rule__MethodPattern__Group__0 : rule__MethodPattern__Group__0__Impl rule__MethodPattern__Group__1 ;
    public final void rule__MethodPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:354:1: ( rule__MethodPattern__Group__0__Impl rule__MethodPattern__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:355:2: rule__MethodPattern__Group__0__Impl rule__MethodPattern__Group__1
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group__0__Impl_in_rule__MethodPattern__Group__0712);
            rule__MethodPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodPattern__Group__1_in_rule__MethodPattern__Group__0715);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:362:1: rule__MethodPattern__Group__0__Impl : ( ( rule__MethodPattern__ModifiersAssignment_0 )* ) ;
    public final void rule__MethodPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:366:1: ( ( ( rule__MethodPattern__ModifiersAssignment_0 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:367:1: ( ( rule__MethodPattern__ModifiersAssignment_0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:367:1: ( ( rule__MethodPattern__ModifiersAssignment_0 )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:368:1: ( rule__MethodPattern__ModifiersAssignment_0 )*
            {
             before(grammarAccess.getMethodPatternAccess().getModifiersAssignment_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:369:1: ( rule__MethodPattern__ModifiersAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=19 && LA4_0<=24)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:369:2: rule__MethodPattern__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__MethodPattern__ModifiersAssignment_0_in_rule__MethodPattern__Group__0__Impl742);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:379:1: rule__MethodPattern__Group__1 : rule__MethodPattern__Group__1__Impl rule__MethodPattern__Group__2 ;
    public final void rule__MethodPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:383:1: ( rule__MethodPattern__Group__1__Impl rule__MethodPattern__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:384:2: rule__MethodPattern__Group__1__Impl rule__MethodPattern__Group__2
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group__1__Impl_in_rule__MethodPattern__Group__1773);
            rule__MethodPattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodPattern__Group__2_in_rule__MethodPattern__Group__1776);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:391:1: rule__MethodPattern__Group__1__Impl : ( ( rule__MethodPattern__ReturnTypeAssignment_1 ) ) ;
    public final void rule__MethodPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:395:1: ( ( ( rule__MethodPattern__ReturnTypeAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:396:1: ( ( rule__MethodPattern__ReturnTypeAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:396:1: ( ( rule__MethodPattern__ReturnTypeAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:397:1: ( rule__MethodPattern__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getMethodPatternAccess().getReturnTypeAssignment_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:398:1: ( rule__MethodPattern__ReturnTypeAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:398:2: rule__MethodPattern__ReturnTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__MethodPattern__ReturnTypeAssignment_1_in_rule__MethodPattern__Group__1__Impl803);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:408:1: rule__MethodPattern__Group__2 : rule__MethodPattern__Group__2__Impl rule__MethodPattern__Group__3 ;
    public final void rule__MethodPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:412:1: ( rule__MethodPattern__Group__2__Impl rule__MethodPattern__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:413:2: rule__MethodPattern__Group__2__Impl rule__MethodPattern__Group__3
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group__2__Impl_in_rule__MethodPattern__Group__2833);
            rule__MethodPattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodPattern__Group__3_in_rule__MethodPattern__Group__2836);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:420:1: rule__MethodPattern__Group__2__Impl : ( ( rule__MethodPattern__MethodNameAssignment_2 ) ) ;
    public final void rule__MethodPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:424:1: ( ( ( rule__MethodPattern__MethodNameAssignment_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:425:1: ( ( rule__MethodPattern__MethodNameAssignment_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:425:1: ( ( rule__MethodPattern__MethodNameAssignment_2 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:426:1: ( rule__MethodPattern__MethodNameAssignment_2 )
            {
             before(grammarAccess.getMethodPatternAccess().getMethodNameAssignment_2()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:427:1: ( rule__MethodPattern__MethodNameAssignment_2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:427:2: rule__MethodPattern__MethodNameAssignment_2
            {
            pushFollow(FOLLOW_rule__MethodPattern__MethodNameAssignment_2_in_rule__MethodPattern__Group__2__Impl863);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:437:1: rule__MethodPattern__Group__3 : rule__MethodPattern__Group__3__Impl rule__MethodPattern__Group__4 ;
    public final void rule__MethodPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:441:1: ( rule__MethodPattern__Group__3__Impl rule__MethodPattern__Group__4 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:442:2: rule__MethodPattern__Group__3__Impl rule__MethodPattern__Group__4
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group__3__Impl_in_rule__MethodPattern__Group__3893);
            rule__MethodPattern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodPattern__Group__4_in_rule__MethodPattern__Group__3896);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:449:1: rule__MethodPattern__Group__3__Impl : ( ( rule__MethodPattern__Group_3__0 )? ) ;
    public final void rule__MethodPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:453:1: ( ( ( rule__MethodPattern__Group_3__0 )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:454:1: ( ( rule__MethodPattern__Group_3__0 )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:454:1: ( ( rule__MethodPattern__Group_3__0 )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:455:1: ( rule__MethodPattern__Group_3__0 )?
            {
             before(grammarAccess.getMethodPatternAccess().getGroup_3()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:456:1: ( rule__MethodPattern__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:456:2: rule__MethodPattern__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__MethodPattern__Group_3__0_in_rule__MethodPattern__Group__3__Impl923);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:466:1: rule__MethodPattern__Group__4 : rule__MethodPattern__Group__4__Impl ;
    public final void rule__MethodPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:470:1: ( rule__MethodPattern__Group__4__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:471:2: rule__MethodPattern__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group__4__Impl_in_rule__MethodPattern__Group__4954);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:477:1: rule__MethodPattern__Group__4__Impl : ( ( rule__MethodPattern__ThrowsClauseAssignment_4 )? ) ;
    public final void rule__MethodPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:481:1: ( ( ( rule__MethodPattern__ThrowsClauseAssignment_4 )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:482:1: ( ( rule__MethodPattern__ThrowsClauseAssignment_4 )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:482:1: ( ( rule__MethodPattern__ThrowsClauseAssignment_4 )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:483:1: ( rule__MethodPattern__ThrowsClauseAssignment_4 )?
            {
             before(grammarAccess.getMethodPatternAccess().getThrowsClauseAssignment_4()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:484:1: ( rule__MethodPattern__ThrowsClauseAssignment_4 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:484:2: rule__MethodPattern__ThrowsClauseAssignment_4
                    {
                    pushFollow(FOLLOW_rule__MethodPattern__ThrowsClauseAssignment_4_in_rule__MethodPattern__Group__4__Impl981);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:504:1: rule__MethodPattern__Group_3__0 : rule__MethodPattern__Group_3__0__Impl rule__MethodPattern__Group_3__1 ;
    public final void rule__MethodPattern__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:508:1: ( rule__MethodPattern__Group_3__0__Impl rule__MethodPattern__Group_3__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:509:2: rule__MethodPattern__Group_3__0__Impl rule__MethodPattern__Group_3__1
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group_3__0__Impl_in_rule__MethodPattern__Group_3__01022);
            rule__MethodPattern__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodPattern__Group_3__1_in_rule__MethodPattern__Group_3__01025);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:516:1: rule__MethodPattern__Group_3__0__Impl : ( '(' ) ;
    public final void rule__MethodPattern__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:520:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:521:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:521:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:522:1: '('
            {
             before(grammarAccess.getMethodPatternAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,13,FOLLOW_13_in_rule__MethodPattern__Group_3__0__Impl1053); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:535:1: rule__MethodPattern__Group_3__1 : rule__MethodPattern__Group_3__1__Impl rule__MethodPattern__Group_3__2 ;
    public final void rule__MethodPattern__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:539:1: ( rule__MethodPattern__Group_3__1__Impl rule__MethodPattern__Group_3__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:540:2: rule__MethodPattern__Group_3__1__Impl rule__MethodPattern__Group_3__2
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group_3__1__Impl_in_rule__MethodPattern__Group_3__11084);
            rule__MethodPattern__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodPattern__Group_3__2_in_rule__MethodPattern__Group_3__11087);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:547:1: rule__MethodPattern__Group_3__1__Impl : ( ( rule__MethodPattern__ParameterElementsAssignment_3_1 ) ) ;
    public final void rule__MethodPattern__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:551:1: ( ( ( rule__MethodPattern__ParameterElementsAssignment_3_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:552:1: ( ( rule__MethodPattern__ParameterElementsAssignment_3_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:552:1: ( ( rule__MethodPattern__ParameterElementsAssignment_3_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:553:1: ( rule__MethodPattern__ParameterElementsAssignment_3_1 )
            {
             before(grammarAccess.getMethodPatternAccess().getParameterElementsAssignment_3_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:554:1: ( rule__MethodPattern__ParameterElementsAssignment_3_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:554:2: rule__MethodPattern__ParameterElementsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__MethodPattern__ParameterElementsAssignment_3_1_in_rule__MethodPattern__Group_3__1__Impl1114);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:564:1: rule__MethodPattern__Group_3__2 : rule__MethodPattern__Group_3__2__Impl rule__MethodPattern__Group_3__3 ;
    public final void rule__MethodPattern__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:568:1: ( rule__MethodPattern__Group_3__2__Impl rule__MethodPattern__Group_3__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:569:2: rule__MethodPattern__Group_3__2__Impl rule__MethodPattern__Group_3__3
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group_3__2__Impl_in_rule__MethodPattern__Group_3__21144);
            rule__MethodPattern__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodPattern__Group_3__3_in_rule__MethodPattern__Group_3__21147);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:576:1: rule__MethodPattern__Group_3__2__Impl : ( ( rule__MethodPattern__Group_3_2__0 )* ) ;
    public final void rule__MethodPattern__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:580:1: ( ( ( rule__MethodPattern__Group_3_2__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:581:1: ( ( rule__MethodPattern__Group_3_2__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:581:1: ( ( rule__MethodPattern__Group_3_2__0 )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:582:1: ( rule__MethodPattern__Group_3_2__0 )*
            {
             before(grammarAccess.getMethodPatternAccess().getGroup_3_2()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:583:1: ( rule__MethodPattern__Group_3_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:583:2: rule__MethodPattern__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__MethodPattern__Group_3_2__0_in_rule__MethodPattern__Group_3__2__Impl1174);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:593:1: rule__MethodPattern__Group_3__3 : rule__MethodPattern__Group_3__3__Impl ;
    public final void rule__MethodPattern__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:597:1: ( rule__MethodPattern__Group_3__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:598:2: rule__MethodPattern__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group_3__3__Impl_in_rule__MethodPattern__Group_3__31205);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:604:1: rule__MethodPattern__Group_3__3__Impl : ( ')' ) ;
    public final void rule__MethodPattern__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:608:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:609:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:609:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:610:1: ')'
            {
             before(grammarAccess.getMethodPatternAccess().getRightParenthesisKeyword_3_3()); 
            match(input,14,FOLLOW_14_in_rule__MethodPattern__Group_3__3__Impl1233); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:631:1: rule__MethodPattern__Group_3_2__0 : rule__MethodPattern__Group_3_2__0__Impl rule__MethodPattern__Group_3_2__1 ;
    public final void rule__MethodPattern__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:635:1: ( rule__MethodPattern__Group_3_2__0__Impl rule__MethodPattern__Group_3_2__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:636:2: rule__MethodPattern__Group_3_2__0__Impl rule__MethodPattern__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group_3_2__0__Impl_in_rule__MethodPattern__Group_3_2__01272);
            rule__MethodPattern__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodPattern__Group_3_2__1_in_rule__MethodPattern__Group_3_2__01275);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:643:1: rule__MethodPattern__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__MethodPattern__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:647:1: ( ( ',' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:648:1: ( ',' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:648:1: ( ',' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:649:1: ','
            {
             before(grammarAccess.getMethodPatternAccess().getCommaKeyword_3_2_0()); 
            match(input,15,FOLLOW_15_in_rule__MethodPattern__Group_3_2__0__Impl1303); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:662:1: rule__MethodPattern__Group_3_2__1 : rule__MethodPattern__Group_3_2__1__Impl ;
    public final void rule__MethodPattern__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:666:1: ( rule__MethodPattern__Group_3_2__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:667:2: rule__MethodPattern__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__MethodPattern__Group_3_2__1__Impl_in_rule__MethodPattern__Group_3_2__11334);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:673:1: rule__MethodPattern__Group_3_2__1__Impl : ( ( rule__MethodPattern__ParameterElementsAssignment_3_2_1 ) ) ;
    public final void rule__MethodPattern__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:677:1: ( ( ( rule__MethodPattern__ParameterElementsAssignment_3_2_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:678:1: ( ( rule__MethodPattern__ParameterElementsAssignment_3_2_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:678:1: ( ( rule__MethodPattern__ParameterElementsAssignment_3_2_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:679:1: ( rule__MethodPattern__ParameterElementsAssignment_3_2_1 )
            {
             before(grammarAccess.getMethodPatternAccess().getParameterElementsAssignment_3_2_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:680:1: ( rule__MethodPattern__ParameterElementsAssignment_3_2_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:680:2: rule__MethodPattern__ParameterElementsAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__MethodPattern__ParameterElementsAssignment_3_2_1_in_rule__MethodPattern__Group_3_2__1__Impl1361);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:694:1: rule__ParameterElement__Group_0__0 : rule__ParameterElement__Group_0__0__Impl rule__ParameterElement__Group_0__1 ;
    public final void rule__ParameterElement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:698:1: ( rule__ParameterElement__Group_0__0__Impl rule__ParameterElement__Group_0__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:699:2: rule__ParameterElement__Group_0__0__Impl rule__ParameterElement__Group_0__1
            {
            pushFollow(FOLLOW_rule__ParameterElement__Group_0__0__Impl_in_rule__ParameterElement__Group_0__01395);
            rule__ParameterElement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterElement__Group_0__1_in_rule__ParameterElement__Group_0__01398);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:706:1: rule__ParameterElement__Group_0__0__Impl : ( () ) ;
    public final void rule__ParameterElement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:710:1: ( ( () ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:711:1: ( () )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:711:1: ( () )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:712:1: ()
            {
             before(grammarAccess.getParameterElementAccess().getParameterElementAction_0_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:713:1: ()
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:715:1: 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:725:1: rule__ParameterElement__Group_0__1 : rule__ParameterElement__Group_0__1__Impl ;
    public final void rule__ParameterElement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:729:1: ( rule__ParameterElement__Group_0__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:730:2: rule__ParameterElement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterElement__Group_0__1__Impl_in_rule__ParameterElement__Group_0__11456);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:736:1: rule__ParameterElement__Group_0__1__Impl : ( ruleParameterType ) ;
    public final void rule__ParameterElement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:740:1: ( ( ruleParameterType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:741:1: ( ruleParameterType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:741:1: ( ruleParameterType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:742:1: ruleParameterType
            {
             before(grammarAccess.getParameterElementAccess().getParameterTypeParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleParameterType_in_rule__ParameterElement__Group_0__1__Impl1483);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterElementAccess().getParameterTypeParserRuleCall_0_1()); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:757:1: rule__ParameterElement__Group_1__0 : rule__ParameterElement__Group_1__0__Impl rule__ParameterElement__Group_1__1 ;
    public final void rule__ParameterElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:761:1: ( rule__ParameterElement__Group_1__0__Impl rule__ParameterElement__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:762:2: rule__ParameterElement__Group_1__0__Impl rule__ParameterElement__Group_1__1
            {
            pushFollow(FOLLOW_rule__ParameterElement__Group_1__0__Impl_in_rule__ParameterElement__Group_1__01516);
            rule__ParameterElement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterElement__Group_1__1_in_rule__ParameterElement__Group_1__01519);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:769:1: rule__ParameterElement__Group_1__0__Impl : ( '{' ) ;
    public final void rule__ParameterElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:773:1: ( ( '{' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:774:1: ( '{' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:774:1: ( '{' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:775:1: '{'
            {
             before(grammarAccess.getParameterElementAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__ParameterElement__Group_1__0__Impl1547); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:788:1: rule__ParameterElement__Group_1__1 : rule__ParameterElement__Group_1__1__Impl rule__ParameterElement__Group_1__2 ;
    public final void rule__ParameterElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:792:1: ( rule__ParameterElement__Group_1__1__Impl rule__ParameterElement__Group_1__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:793:2: rule__ParameterElement__Group_1__1__Impl rule__ParameterElement__Group_1__2
            {
            pushFollow(FOLLOW_rule__ParameterElement__Group_1__1__Impl_in_rule__ParameterElement__Group_1__11578);
            rule__ParameterElement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterElement__Group_1__2_in_rule__ParameterElement__Group_1__11581);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:800:1: rule__ParameterElement__Group_1__1__Impl : ( ( rule__ParameterElement__TypesAssignment_1_1 ) ) ;
    public final void rule__ParameterElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:804:1: ( ( ( rule__ParameterElement__TypesAssignment_1_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:805:1: ( ( rule__ParameterElement__TypesAssignment_1_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:805:1: ( ( rule__ParameterElement__TypesAssignment_1_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:806:1: ( rule__ParameterElement__TypesAssignment_1_1 )
            {
             before(grammarAccess.getParameterElementAccess().getTypesAssignment_1_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:807:1: ( rule__ParameterElement__TypesAssignment_1_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:807:2: rule__ParameterElement__TypesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ParameterElement__TypesAssignment_1_1_in_rule__ParameterElement__Group_1__1__Impl1608);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:817:1: rule__ParameterElement__Group_1__2 : rule__ParameterElement__Group_1__2__Impl rule__ParameterElement__Group_1__3 ;
    public final void rule__ParameterElement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:821:1: ( rule__ParameterElement__Group_1__2__Impl rule__ParameterElement__Group_1__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:822:2: rule__ParameterElement__Group_1__2__Impl rule__ParameterElement__Group_1__3
            {
            pushFollow(FOLLOW_rule__ParameterElement__Group_1__2__Impl_in_rule__ParameterElement__Group_1__21638);
            rule__ParameterElement__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterElement__Group_1__3_in_rule__ParameterElement__Group_1__21641);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:829:1: rule__ParameterElement__Group_1__2__Impl : ( ( rule__ParameterElement__Group_1_2__0 )* ) ;
    public final void rule__ParameterElement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:833:1: ( ( ( rule__ParameterElement__Group_1_2__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:834:1: ( ( rule__ParameterElement__Group_1_2__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:834:1: ( ( rule__ParameterElement__Group_1_2__0 )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:835:1: ( rule__ParameterElement__Group_1_2__0 )*
            {
             before(grammarAccess.getParameterElementAccess().getGroup_1_2()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:836:1: ( rule__ParameterElement__Group_1_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:836:2: rule__ParameterElement__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ParameterElement__Group_1_2__0_in_rule__ParameterElement__Group_1__2__Impl1668);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:846:1: rule__ParameterElement__Group_1__3 : rule__ParameterElement__Group_1__3__Impl ;
    public final void rule__ParameterElement__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:850:1: ( rule__ParameterElement__Group_1__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:851:2: rule__ParameterElement__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__ParameterElement__Group_1__3__Impl_in_rule__ParameterElement__Group_1__31699);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:857:1: rule__ParameterElement__Group_1__3__Impl : ( '}' ) ;
    public final void rule__ParameterElement__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:861:1: ( ( '}' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:862:1: ( '}' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:862:1: ( '}' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:863:1: '}'
            {
             before(grammarAccess.getParameterElementAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,17,FOLLOW_17_in_rule__ParameterElement__Group_1__3__Impl1727); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:884:1: rule__ParameterElement__Group_1_2__0 : rule__ParameterElement__Group_1_2__0__Impl rule__ParameterElement__Group_1_2__1 ;
    public final void rule__ParameterElement__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:888:1: ( rule__ParameterElement__Group_1_2__0__Impl rule__ParameterElement__Group_1_2__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:889:2: rule__ParameterElement__Group_1_2__0__Impl rule__ParameterElement__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__ParameterElement__Group_1_2__0__Impl_in_rule__ParameterElement__Group_1_2__01766);
            rule__ParameterElement__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterElement__Group_1_2__1_in_rule__ParameterElement__Group_1_2__01769);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:896:1: rule__ParameterElement__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__ParameterElement__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:900:1: ( ( ',' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:901:1: ( ',' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:901:1: ( ',' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:902:1: ','
            {
             before(grammarAccess.getParameterElementAccess().getCommaKeyword_1_2_0()); 
            match(input,15,FOLLOW_15_in_rule__ParameterElement__Group_1_2__0__Impl1797); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:915:1: rule__ParameterElement__Group_1_2__1 : rule__ParameterElement__Group_1_2__1__Impl ;
    public final void rule__ParameterElement__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:919:1: ( rule__ParameterElement__Group_1_2__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:920:2: rule__ParameterElement__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterElement__Group_1_2__1__Impl_in_rule__ParameterElement__Group_1_2__11828);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:926:1: rule__ParameterElement__Group_1_2__1__Impl : ( ( rule__ParameterElement__TypesAssignment_1_2_1 ) ) ;
    public final void rule__ParameterElement__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:930:1: ( ( ( rule__ParameterElement__TypesAssignment_1_2_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:931:1: ( ( rule__ParameterElement__TypesAssignment_1_2_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:931:1: ( ( rule__ParameterElement__TypesAssignment_1_2_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:932:1: ( rule__ParameterElement__TypesAssignment_1_2_1 )
            {
             before(grammarAccess.getParameterElementAccess().getTypesAssignment_1_2_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:933:1: ( rule__ParameterElement__TypesAssignment_1_2_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:933:2: rule__ParameterElement__TypesAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__ParameterElement__TypesAssignment_1_2_1_in_rule__ParameterElement__Group_1_2__1__Impl1855);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:947:1: rule__Throws__Group__0 : rule__Throws__Group__0__Impl rule__Throws__Group__1 ;
    public final void rule__Throws__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:951:1: ( rule__Throws__Group__0__Impl rule__Throws__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:952:2: rule__Throws__Group__0__Impl rule__Throws__Group__1
            {
            pushFollow(FOLLOW_rule__Throws__Group__0__Impl_in_rule__Throws__Group__01889);
            rule__Throws__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Throws__Group__1_in_rule__Throws__Group__01892);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:959:1: rule__Throws__Group__0__Impl : ( 'throws' ) ;
    public final void rule__Throws__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:963:1: ( ( 'throws' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:964:1: ( 'throws' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:964:1: ( 'throws' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:965:1: 'throws'
            {
             before(grammarAccess.getThrowsAccess().getThrowsKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Throws__Group__0__Impl1920); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:978:1: rule__Throws__Group__1 : rule__Throws__Group__1__Impl ;
    public final void rule__Throws__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:982:1: ( rule__Throws__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:983:2: rule__Throws__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Throws__Group__1__Impl_in_rule__Throws__Group__11951);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:989:1: rule__Throws__Group__1__Impl : ( ( rule__Throws__ThrownTypeAssignment_1 ) ) ;
    public final void rule__Throws__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:993:1: ( ( ( rule__Throws__ThrownTypeAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:994:1: ( ( rule__Throws__ThrownTypeAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:994:1: ( ( rule__Throws__ThrownTypeAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:995:1: ( rule__Throws__ThrownTypeAssignment_1 )
            {
             before(grammarAccess.getThrowsAccess().getThrownTypeAssignment_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:996:1: ( rule__Throws__ThrownTypeAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:996:2: rule__Throws__ThrownTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Throws__ThrownTypeAssignment_1_in_rule__Throws__Group__1__Impl1978);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1011:1: rule__MethodPattern__ModifiersAssignment_0 : ( ruleModifier ) ;
    public final void rule__MethodPattern__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1015:1: ( ( ruleModifier ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1016:1: ( ruleModifier )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1016:1: ( ruleModifier )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1017:1: ruleModifier
            {
             before(grammarAccess.getMethodPatternAccess().getModifiersModifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleModifier_in_rule__MethodPattern__ModifiersAssignment_02017);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1026:1: rule__MethodPattern__ReturnTypeAssignment_1 : ( ruleType ) ;
    public final void rule__MethodPattern__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1030:1: ( ( ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1031:1: ( ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1031:1: ( ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1032:1: ruleType
            {
             before(grammarAccess.getMethodPatternAccess().getReturnTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__MethodPattern__ReturnTypeAssignment_12048);
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


    // $ANTLR start "rule__MethodPattern__MethodNameAssignment_2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1041:1: rule__MethodPattern__MethodNameAssignment_2 : ( ruleMethodName ) ;
    public final void rule__MethodPattern__MethodNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1045:1: ( ( ruleMethodName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1046:1: ( ruleMethodName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1046:1: ( ruleMethodName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1047:1: ruleMethodName
            {
             before(grammarAccess.getMethodPatternAccess().getMethodNameMethodNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleMethodName_in_rule__MethodPattern__MethodNameAssignment_22079);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1056:1: rule__MethodPattern__ParameterElementsAssignment_3_1 : ( ruleParameterElement ) ;
    public final void rule__MethodPattern__ParameterElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1060:1: ( ( ruleParameterElement ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1061:1: ( ruleParameterElement )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1061:1: ( ruleParameterElement )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1062:1: ruleParameterElement
            {
             before(grammarAccess.getMethodPatternAccess().getParameterElementsParameterElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleParameterElement_in_rule__MethodPattern__ParameterElementsAssignment_3_12110);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1071:1: rule__MethodPattern__ParameterElementsAssignment_3_2_1 : ( ruleParameterElement ) ;
    public final void rule__MethodPattern__ParameterElementsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1075:1: ( ( ruleParameterElement ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1076:1: ( ruleParameterElement )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1076:1: ( ruleParameterElement )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1077:1: ruleParameterElement
            {
             before(grammarAccess.getMethodPatternAccess().getParameterElementsParameterElementParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_ruleParameterElement_in_rule__MethodPattern__ParameterElementsAssignment_3_2_12141);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1086:1: rule__MethodPattern__ThrowsClauseAssignment_4 : ( ruleThrows ) ;
    public final void rule__MethodPattern__ThrowsClauseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1090:1: ( ( ruleThrows ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1091:1: ( ruleThrows )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1091:1: ( ruleThrows )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1092:1: ruleThrows
            {
             before(grammarAccess.getMethodPatternAccess().getThrowsClauseThrowsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleThrows_in_rule__MethodPattern__ThrowsClauseAssignment_42172);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1101:1: rule__Modifier__ValueAssignment_0 : ( ( 'static' ) ) ;
    public final void rule__Modifier__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1105:1: ( ( ( 'static' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1106:1: ( ( 'static' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1106:1: ( ( 'static' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1107:1: ( 'static' )
            {
             before(grammarAccess.getModifierAccess().getValueStaticKeyword_0_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1108:1: ( 'static' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1109:1: 'static'
            {
             before(grammarAccess.getModifierAccess().getValueStaticKeyword_0_0()); 
            match(input,19,FOLLOW_19_in_rule__Modifier__ValueAssignment_02208); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1124:1: rule__Modifier__ValueAssignment_1 : ( ( 'private' ) ) ;
    public final void rule__Modifier__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1128:1: ( ( ( 'private' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1129:1: ( ( 'private' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1129:1: ( ( 'private' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1130:1: ( 'private' )
            {
             before(grammarAccess.getModifierAccess().getValuePrivateKeyword_1_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1131:1: ( 'private' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1132:1: 'private'
            {
             before(grammarAccess.getModifierAccess().getValuePrivateKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__Modifier__ValueAssignment_12252); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1147:1: rule__Modifier__ValueAssignment_2 : ( ( 'public' ) ) ;
    public final void rule__Modifier__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1151:1: ( ( ( 'public' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1152:1: ( ( 'public' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1152:1: ( ( 'public' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1153:1: ( 'public' )
            {
             before(grammarAccess.getModifierAccess().getValuePublicKeyword_2_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1154:1: ( 'public' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1155:1: 'public'
            {
             before(grammarAccess.getModifierAccess().getValuePublicKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Modifier__ValueAssignment_22296); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1170:1: rule__Modifier__ValueAssignment_3 : ( ( 'final' ) ) ;
    public final void rule__Modifier__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1174:1: ( ( ( 'final' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1175:1: ( ( 'final' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1175:1: ( ( 'final' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1176:1: ( 'final' )
            {
             before(grammarAccess.getModifierAccess().getValueFinalKeyword_3_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1177:1: ( 'final' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1178:1: 'final'
            {
             before(grammarAccess.getModifierAccess().getValueFinalKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Modifier__ValueAssignment_32340); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1193:1: rule__Modifier__ValueAssignment_4 : ( ( 'abstract' ) ) ;
    public final void rule__Modifier__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1197:1: ( ( ( 'abstract' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1198:1: ( ( 'abstract' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1198:1: ( ( 'abstract' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1199:1: ( 'abstract' )
            {
             before(grammarAccess.getModifierAccess().getValueAbstractKeyword_4_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1200:1: ( 'abstract' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1201:1: 'abstract'
            {
             before(grammarAccess.getModifierAccess().getValueAbstractKeyword_4_0()); 
            match(input,23,FOLLOW_23_in_rule__Modifier__ValueAssignment_42384); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1216:1: rule__Modifier__ValueAssignment_5 : ( ( 'protected' ) ) ;
    public final void rule__Modifier__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1220:1: ( ( ( 'protected' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1221:1: ( ( 'protected' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1221:1: ( ( 'protected' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1222:1: ( 'protected' )
            {
             before(grammarAccess.getModifierAccess().getValueProtectedKeyword_5_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1223:1: ( 'protected' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1224:1: 'protected'
            {
             before(grammarAccess.getModifierAccess().getValueProtectedKeyword_5_0()); 
            match(input,24,FOLLOW_24_in_rule__Modifier__ValueAssignment_52428); 
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


    // $ANTLR start "rule__ParameterElement__TypesAssignment_1_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1239:1: rule__ParameterElement__TypesAssignment_1_1 : ( ruleParameterType ) ;
    public final void rule__ParameterElement__TypesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1243:1: ( ( ruleParameterType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1244:1: ( ruleParameterType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1244:1: ( ruleParameterType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1245:1: ruleParameterType
            {
             before(grammarAccess.getParameterElementAccess().getTypesParameterTypeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleParameterType_in_rule__ParameterElement__TypesAssignment_1_12467);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1254:1: rule__ParameterElement__TypesAssignment_1_2_1 : ( ruleParameterType ) ;
    public final void rule__ParameterElement__TypesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1258:1: ( ( ruleParameterType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1259:1: ( ruleParameterType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1259:1: ( ruleParameterType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1260:1: ruleParameterType
            {
             before(grammarAccess.getParameterElementAccess().getTypesParameterTypeParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleParameterType_in_rule__ParameterElement__TypesAssignment_1_2_12498);
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


    // $ANTLR start "rule__Throws__ThrownTypeAssignment_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1269:1: rule__Throws__ThrownTypeAssignment_1 : ( ruleType ) ;
    public final void rule__Throws__ThrownTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1273:1: ( ( ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1274:1: ( ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1274:1: ( ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1275:1: ruleType
            {
             before(grammarAccess.getThrowsAccess().getThrownTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Throws__ThrownTypeAssignment_12529);
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
    public static final BitSet FOLLOW_ruleParameterElement_in_entryRuleParameterElement240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterElement247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Alternatives_in_ruleParameterElement273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterType_in_entryRuleParameterType300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterType307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterType__Alternatives_in_ruleParameterType333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThrows_in_entryRuleThrows360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThrows367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Throws__Group__0_in_ruleThrows393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodName_in_entryRuleMethodName420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodName427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleMethodName453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__ValueAssignment_0_in_rule__Modifier__Alternatives488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__ValueAssignment_1_in_rule__Modifier__Alternatives506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__ValueAssignment_2_in_rule__Modifier__Alternatives524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__ValueAssignment_3_in_rule__Modifier__Alternatives542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__ValueAssignment_4_in_rule__Modifier__Alternatives560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__ValueAssignment_5_in_rule__Modifier__Alternatives578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_0__0_in_rule__ParameterElement__Alternatives611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1__0_in_rule__ParameterElement__Alternatives629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_rule__ParameterType__Alternatives662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ParameterType__Alternatives680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group__0__Impl_in_rule__MethodPattern__Group__0712 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group__1_in_rule__MethodPattern__Group__0715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__ModifiersAssignment_0_in_rule__MethodPattern__Group__0__Impl742 = new BitSet(new long[]{0x0000000001F80002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group__1__Impl_in_rule__MethodPattern__Group__1773 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group__2_in_rule__MethodPattern__Group__1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__ReturnTypeAssignment_1_in_rule__MethodPattern__Group__1__Impl803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group__2__Impl_in_rule__MethodPattern__Group__2833 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group__3_in_rule__MethodPattern__Group__2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__MethodNameAssignment_2_in_rule__MethodPattern__Group__2__Impl863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group__3__Impl_in_rule__MethodPattern__Group__3893 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group__4_in_rule__MethodPattern__Group__3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3__0_in_rule__MethodPattern__Group__3__Impl923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group__4__Impl_in_rule__MethodPattern__Group__4954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__ThrowsClauseAssignment_4_in_rule__MethodPattern__Group__4__Impl981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3__0__Impl_in_rule__MethodPattern__Group_3__01022 = new BitSet(new long[]{0x0000000000011010L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3__1_in_rule__MethodPattern__Group_3__01025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MethodPattern__Group_3__0__Impl1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3__1__Impl_in_rule__MethodPattern__Group_3__11084 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3__2_in_rule__MethodPattern__Group_3__11087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__ParameterElementsAssignment_3_1_in_rule__MethodPattern__Group_3__1__Impl1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3__2__Impl_in_rule__MethodPattern__Group_3__21144 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3__3_in_rule__MethodPattern__Group_3__21147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3_2__0_in_rule__MethodPattern__Group_3__2__Impl1174 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3__3__Impl_in_rule__MethodPattern__Group_3__31205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MethodPattern__Group_3__3__Impl1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3_2__0__Impl_in_rule__MethodPattern__Group_3_2__01272 = new BitSet(new long[]{0x0000000000011010L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3_2__1_in_rule__MethodPattern__Group_3_2__01275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__MethodPattern__Group_3_2__0__Impl1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__Group_3_2__1__Impl_in_rule__MethodPattern__Group_3_2__11334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPattern__ParameterElementsAssignment_3_2_1_in_rule__MethodPattern__Group_3_2__1__Impl1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_0__0__Impl_in_rule__ParameterElement__Group_0__01395 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_0__1_in_rule__ParameterElement__Group_0__01398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_0__1__Impl_in_rule__ParameterElement__Group_0__11456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterType_in_rule__ParameterElement__Group_0__1__Impl1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1__0__Impl_in_rule__ParameterElement__Group_1__01516 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1__1_in_rule__ParameterElement__Group_1__01519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ParameterElement__Group_1__0__Impl1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1__1__Impl_in_rule__ParameterElement__Group_1__11578 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1__2_in_rule__ParameterElement__Group_1__11581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__TypesAssignment_1_1_in_rule__ParameterElement__Group_1__1__Impl1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1__2__Impl_in_rule__ParameterElement__Group_1__21638 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1__3_in_rule__ParameterElement__Group_1__21641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1_2__0_in_rule__ParameterElement__Group_1__2__Impl1668 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1__3__Impl_in_rule__ParameterElement__Group_1__31699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ParameterElement__Group_1__3__Impl1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1_2__0__Impl_in_rule__ParameterElement__Group_1_2__01766 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1_2__1_in_rule__ParameterElement__Group_1_2__01769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ParameterElement__Group_1_2__0__Impl1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__Group_1_2__1__Impl_in_rule__ParameterElement__Group_1_2__11828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElement__TypesAssignment_1_2_1_in_rule__ParameterElement__Group_1_2__1__Impl1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Throws__Group__0__Impl_in_rule__Throws__Group__01889 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Throws__Group__1_in_rule__Throws__Group__01892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Throws__Group__0__Impl1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Throws__Group__1__Impl_in_rule__Throws__Group__11951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Throws__ThrownTypeAssignment_1_in_rule__Throws__Group__1__Impl1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__MethodPattern__ModifiersAssignment_02017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__MethodPattern__ReturnTypeAssignment_12048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodName_in_rule__MethodPattern__MethodNameAssignment_22079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterElement_in_rule__MethodPattern__ParameterElementsAssignment_3_12110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterElement_in_rule__MethodPattern__ParameterElementsAssignment_3_2_12141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThrows_in_rule__MethodPattern__ThrowsClauseAssignment_42172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Modifier__ValueAssignment_02208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Modifier__ValueAssignment_12252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Modifier__ValueAssignment_22296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Modifier__ValueAssignment_32340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Modifier__ValueAssignment_42384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Modifier__ValueAssignment_52428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterType_in_rule__ParameterElement__TypesAssignment_1_12467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterType_in_rule__ParameterElement__TypesAssignment_1_2_12498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Throws__ThrownTypeAssignment_12529 = new BitSet(new long[]{0x0000000000000002L});

}