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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAMEWITHWC", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'void'", "'('", "')'", "','", "'{'", "'}'", "'|'", "'throws'", "'static'", "'private'", "'public'", "'final'", "'abstract'", "'protected'", "'..'"
    };
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__25=25;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:69:1: ruleMethodPattern : ( ( rule__MethodPattern__DefinitionAssignment ) ) ;
    public final void ruleMethodPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:73:2: ( ( ( rule__MethodPattern__DefinitionAssignment ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:74:1: ( ( rule__MethodPattern__DefinitionAssignment ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:74:1: ( ( rule__MethodPattern__DefinitionAssignment ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:75:1: ( rule__MethodPattern__DefinitionAssignment )
            {
             before(grammarAccess.getMethodPatternAccess().getDefinitionAssignment()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:76:1: ( rule__MethodPattern__DefinitionAssignment )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:76:2: rule__MethodPattern__DefinitionAssignment
            {
            pushFollow(FOLLOW_rule__MethodPattern__DefinitionAssignment_in_ruleMethodPattern94);
            rule__MethodPattern__DefinitionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMethodPatternAccess().getDefinitionAssignment()); 

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


    // $ANTLR start "entryRuleMethodPatternDefinition"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:88:1: entryRuleMethodPatternDefinition : ruleMethodPatternDefinition EOF ;
    public final void entryRuleMethodPatternDefinition() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:89:1: ( ruleMethodPatternDefinition EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:90:1: ruleMethodPatternDefinition EOF
            {
             before(grammarAccess.getMethodPatternDefinitionRule()); 
            pushFollow(FOLLOW_ruleMethodPatternDefinition_in_entryRuleMethodPatternDefinition121);
            ruleMethodPatternDefinition();

            state._fsp--;

             after(grammarAccess.getMethodPatternDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodPatternDefinition128); 

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
    // $ANTLR end "entryRuleMethodPatternDefinition"


    // $ANTLR start "ruleMethodPatternDefinition"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:97:1: ruleMethodPatternDefinition : ( ( rule__MethodPatternDefinition__Group__0 ) ) ;
    public final void ruleMethodPatternDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:101:2: ( ( ( rule__MethodPatternDefinition__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:102:1: ( ( rule__MethodPatternDefinition__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:102:1: ( ( rule__MethodPatternDefinition__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:103:1: ( rule__MethodPatternDefinition__Group__0 )
            {
             before(grammarAccess.getMethodPatternDefinitionAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:104:1: ( rule__MethodPatternDefinition__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:104:2: rule__MethodPatternDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__MethodPatternDefinition__Group__0_in_ruleMethodPatternDefinition154);
            rule__MethodPatternDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodPatternDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleMethodPatternDefinition"


    // $ANTLR start "entryRuleParameterDefinition"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:116:1: entryRuleParameterDefinition : ruleParameterDefinition EOF ;
    public final void entryRuleParameterDefinition() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:117:1: ( ruleParameterDefinition EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:118:1: ruleParameterDefinition EOF
            {
             before(grammarAccess.getParameterDefinitionRule()); 
            pushFollow(FOLLOW_ruleParameterDefinition_in_entryRuleParameterDefinition181);
            ruleParameterDefinition();

            state._fsp--;

             after(grammarAccess.getParameterDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDefinition188); 

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
    // $ANTLR end "entryRuleParameterDefinition"


    // $ANTLR start "ruleParameterDefinition"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:125:1: ruleParameterDefinition : ( ( rule__ParameterDefinition__Group__0 ) ) ;
    public final void ruleParameterDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:129:2: ( ( ( rule__ParameterDefinition__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:130:1: ( ( rule__ParameterDefinition__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:130:1: ( ( rule__ParameterDefinition__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:131:1: ( rule__ParameterDefinition__Group__0 )
            {
             before(grammarAccess.getParameterDefinitionAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:132:1: ( rule__ParameterDefinition__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:132:2: rule__ParameterDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__ParameterDefinition__Group__0_in_ruleParameterDefinition214);
            rule__ParameterDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleParameterDefinition"


    // $ANTLR start "entryRuleModifierDefinition"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:144:1: entryRuleModifierDefinition : ruleModifierDefinition EOF ;
    public final void entryRuleModifierDefinition() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:145:1: ( ruleModifierDefinition EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:146:1: ruleModifierDefinition EOF
            {
             before(grammarAccess.getModifierDefinitionRule()); 
            pushFollow(FOLLOW_ruleModifierDefinition_in_entryRuleModifierDefinition241);
            ruleModifierDefinition();

            state._fsp--;

             after(grammarAccess.getModifierDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifierDefinition248); 

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
    // $ANTLR end "entryRuleModifierDefinition"


    // $ANTLR start "ruleModifierDefinition"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:153:1: ruleModifierDefinition : ( ( rule__ModifierDefinition__Group__0 ) ) ;
    public final void ruleModifierDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:157:2: ( ( ( rule__ModifierDefinition__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:158:1: ( ( rule__ModifierDefinition__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:158:1: ( ( rule__ModifierDefinition__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:159:1: ( rule__ModifierDefinition__Group__0 )
            {
             before(grammarAccess.getModifierDefinitionAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:160:1: ( rule__ModifierDefinition__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:160:2: rule__ModifierDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__ModifierDefinition__Group__0_in_ruleModifierDefinition274);
            rule__ModifierDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModifierDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleModifierDefinition"


    // $ANTLR start "entryRuleModifier"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:172:1: entryRuleModifier : ruleModifier EOF ;
    public final void entryRuleModifier() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:173:1: ( ruleModifier EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:174:1: ruleModifier EOF
            {
             before(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier301);
            ruleModifier();

            state._fsp--;

             after(grammarAccess.getModifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier308); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:181:1: ruleModifier : ( ( rule__Modifier__Alternatives ) ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:185:2: ( ( ( rule__Modifier__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:186:1: ( ( rule__Modifier__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:186:1: ( ( rule__Modifier__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:187:1: ( rule__Modifier__Alternatives )
            {
             before(grammarAccess.getModifierAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:188:1: ( rule__Modifier__Alternatives )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:188:2: rule__Modifier__Alternatives
            {
            pushFollow(FOLLOW_rule__Modifier__Alternatives_in_ruleModifier334);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:200:1: entryRuleReturnType : ruleReturnType EOF ;
    public final void entryRuleReturnType() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:201:1: ( ruleReturnType EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:202:1: ruleReturnType EOF
            {
             before(grammarAccess.getReturnTypeRule()); 
            pushFollow(FOLLOW_ruleReturnType_in_entryRuleReturnType361);
            ruleReturnType();

            state._fsp--;

             after(grammarAccess.getReturnTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnType368); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:209:1: ruleReturnType : ( ( rule__ReturnType__ValueAssignment ) ) ;
    public final void ruleReturnType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:213:2: ( ( ( rule__ReturnType__ValueAssignment ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:214:1: ( ( rule__ReturnType__ValueAssignment ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:214:1: ( ( rule__ReturnType__ValueAssignment ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:215:1: ( rule__ReturnType__ValueAssignment )
            {
             before(grammarAccess.getReturnTypeAccess().getValueAssignment()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:216:1: ( rule__ReturnType__ValueAssignment )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:216:2: rule__ReturnType__ValueAssignment
            {
            pushFollow(FOLLOW_rule__ReturnType__ValueAssignment_in_ruleReturnType394);
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


    // $ANTLR start "entryRuleParameterElementHolder"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:228:1: entryRuleParameterElementHolder : ruleParameterElementHolder EOF ;
    public final void entryRuleParameterElementHolder() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:229:1: ( ruleParameterElementHolder EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:230:1: ruleParameterElementHolder EOF
            {
             before(grammarAccess.getParameterElementHolderRule()); 
            pushFollow(FOLLOW_ruleParameterElementHolder_in_entryRuleParameterElementHolder421);
            ruleParameterElementHolder();

            state._fsp--;

             after(grammarAccess.getParameterElementHolderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterElementHolder428); 

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
    // $ANTLR end "entryRuleParameterElementHolder"


    // $ANTLR start "ruleParameterElementHolder"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:237:1: ruleParameterElementHolder : ( ( rule__ParameterElementHolder__Alternatives ) ) ;
    public final void ruleParameterElementHolder() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:241:2: ( ( ( rule__ParameterElementHolder__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:242:1: ( ( rule__ParameterElementHolder__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:242:1: ( ( rule__ParameterElementHolder__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:243:1: ( rule__ParameterElementHolder__Alternatives )
            {
             before(grammarAccess.getParameterElementHolderAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:244:1: ( rule__ParameterElementHolder__Alternatives )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:244:2: rule__ParameterElementHolder__Alternatives
            {
            pushFollow(FOLLOW_rule__ParameterElementHolder__Alternatives_in_ruleParameterElementHolder454);
            rule__ParameterElementHolder__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterElementHolderAccess().getAlternatives()); 

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
    // $ANTLR end "ruleParameterElementHolder"


    // $ANTLR start "entryRuleSingleElement"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:256:1: entryRuleSingleElement : ruleSingleElement EOF ;
    public final void entryRuleSingleElement() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:257:1: ( ruleSingleElement EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:258:1: ruleSingleElement EOF
            {
             before(grammarAccess.getSingleElementRule()); 
            pushFollow(FOLLOW_ruleSingleElement_in_entryRuleSingleElement481);
            ruleSingleElement();

            state._fsp--;

             after(grammarAccess.getSingleElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleElement488); 

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
    // $ANTLR end "entryRuleSingleElement"


    // $ANTLR start "ruleSingleElement"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:265:1: ruleSingleElement : ( ( rule__SingleElement__ValueAssignment ) ) ;
    public final void ruleSingleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:269:2: ( ( ( rule__SingleElement__ValueAssignment ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:270:1: ( ( rule__SingleElement__ValueAssignment ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:270:1: ( ( rule__SingleElement__ValueAssignment ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:271:1: ( rule__SingleElement__ValueAssignment )
            {
             before(grammarAccess.getSingleElementAccess().getValueAssignment()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:272:1: ( rule__SingleElement__ValueAssignment )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:272:2: rule__SingleElement__ValueAssignment
            {
            pushFollow(FOLLOW_rule__SingleElement__ValueAssignment_in_ruleSingleElement514);
            rule__SingleElement__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSingleElementAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleSingleElement"


    // $ANTLR start "entryRuleMultiElement"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:284:1: entryRuleMultiElement : ruleMultiElement EOF ;
    public final void entryRuleMultiElement() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:285:1: ( ruleMultiElement EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:286:1: ruleMultiElement EOF
            {
             before(grammarAccess.getMultiElementRule()); 
            pushFollow(FOLLOW_ruleMultiElement_in_entryRuleMultiElement541);
            ruleMultiElement();

            state._fsp--;

             after(grammarAccess.getMultiElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiElement548); 

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
    // $ANTLR end "entryRuleMultiElement"


    // $ANTLR start "ruleMultiElement"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:293:1: ruleMultiElement : ( ( rule__MultiElement__Group__0 ) ) ;
    public final void ruleMultiElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:297:2: ( ( ( rule__MultiElement__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:298:1: ( ( rule__MultiElement__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:298:1: ( ( rule__MultiElement__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:299:1: ( rule__MultiElement__Group__0 )
            {
             before(grammarAccess.getMultiElementAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:300:1: ( rule__MultiElement__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:300:2: rule__MultiElement__Group__0
            {
            pushFollow(FOLLOW_rule__MultiElement__Group__0_in_ruleMultiElement574);
            rule__MultiElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiElementAccess().getGroup()); 

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
    // $ANTLR end "ruleMultiElement"


    // $ANTLR start "entryRuleParameterType"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:312:1: entryRuleParameterType : ruleParameterType EOF ;
    public final void entryRuleParameterType() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:313:1: ( ruleParameterType EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:314:1: ruleParameterType EOF
            {
             before(grammarAccess.getParameterTypeRule()); 
            pushFollow(FOLLOW_ruleParameterType_in_entryRuleParameterType601);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterType608); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:321:1: ruleParameterType : ( ( rule__ParameterType__Alternatives ) ) ;
    public final void ruleParameterType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:325:2: ( ( ( rule__ParameterType__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:326:1: ( ( rule__ParameterType__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:326:1: ( ( rule__ParameterType__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:327:1: ( rule__ParameterType__Alternatives )
            {
             before(grammarAccess.getParameterTypeAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:328:1: ( rule__ParameterType__Alternatives )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:328:2: rule__ParameterType__Alternatives
            {
            pushFollow(FOLLOW_rule__ParameterType__Alternatives_in_ruleParameterType634);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:340:1: entryRuleThrows : ruleThrows EOF ;
    public final void entryRuleThrows() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:341:1: ( ruleThrows EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:342:1: ruleThrows EOF
            {
             before(grammarAccess.getThrowsRule()); 
            pushFollow(FOLLOW_ruleThrows_in_entryRuleThrows661);
            ruleThrows();

            state._fsp--;

             after(grammarAccess.getThrowsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThrows668); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:349:1: ruleThrows : ( ( rule__Throws__Group__0 ) ) ;
    public final void ruleThrows() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:353:2: ( ( ( rule__Throws__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:354:1: ( ( rule__Throws__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:354:1: ( ( rule__Throws__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:355:1: ( rule__Throws__Group__0 )
            {
             before(grammarAccess.getThrowsAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:356:1: ( rule__Throws__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:356:2: rule__Throws__Group__0
            {
            pushFollow(FOLLOW_rule__Throws__Group__0_in_ruleThrows694);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:368:1: entryRuleMethodName : ruleMethodName EOF ;
    public final void entryRuleMethodName() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:369:1: ( ruleMethodName EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:370:1: ruleMethodName EOF
            {
             before(grammarAccess.getMethodNameRule()); 
            pushFollow(FOLLOW_ruleMethodName_in_entryRuleMethodName721);
            ruleMethodName();

            state._fsp--;

             after(grammarAccess.getMethodNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodName728); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:377:1: ruleMethodName : ( ( rule__MethodName__ValueAssignment ) ) ;
    public final void ruleMethodName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:381:2: ( ( ( rule__MethodName__ValueAssignment ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:382:1: ( ( rule__MethodName__ValueAssignment ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:382:1: ( ( rule__MethodName__ValueAssignment ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:383:1: ( rule__MethodName__ValueAssignment )
            {
             before(grammarAccess.getMethodNameAccess().getValueAssignment()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:384:1: ( rule__MethodName__ValueAssignment )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:384:2: rule__MethodName__ValueAssignment
            {
            pushFollow(FOLLOW_rule__MethodName__ValueAssignment_in_ruleMethodName754);
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


    // $ANTLR start "entryRuleSimpleFieldValue"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:396:1: entryRuleSimpleFieldValue : ruleSimpleFieldValue EOF ;
    public final void entryRuleSimpleFieldValue() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:397:1: ( ruleSimpleFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:398:1: ruleSimpleFieldValue EOF
            {
             before(grammarAccess.getSimpleFieldValueRule()); 
            pushFollow(FOLLOW_ruleSimpleFieldValue_in_entryRuleSimpleFieldValue781);
            ruleSimpleFieldValue();

            state._fsp--;

             after(grammarAccess.getSimpleFieldValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleFieldValue788); 

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
    // $ANTLR end "entryRuleSimpleFieldValue"


    // $ANTLR start "ruleSimpleFieldValue"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:405:1: ruleSimpleFieldValue : ( RULE_NAMEWITHWC ) ;
    public final void ruleSimpleFieldValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:409:2: ( ( RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:410:1: ( RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:410:1: ( RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:411:1: RULE_NAMEWITHWC
            {
             before(grammarAccess.getSimpleFieldValueAccess().getNameWithWCTerminalRuleCall()); 
            match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleSimpleFieldValue814); 
             after(grammarAccess.getSimpleFieldValueAccess().getNameWithWCTerminalRuleCall()); 

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
    // $ANTLR end "ruleSimpleFieldValue"


    // $ANTLR start "entryRuleTypeFieldValue"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:424:1: entryRuleTypeFieldValue : ruleTypeFieldValue EOF ;
    public final void entryRuleTypeFieldValue() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:425:1: ( ruleTypeFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:426:1: ruleTypeFieldValue EOF
            {
             before(grammarAccess.getTypeFieldValueRule()); 
            pushFollow(FOLLOW_ruleTypeFieldValue_in_entryRuleTypeFieldValue840);
            ruleTypeFieldValue();

            state._fsp--;

             after(grammarAccess.getTypeFieldValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeFieldValue847); 

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
    // $ANTLR end "entryRuleTypeFieldValue"


    // $ANTLR start "ruleTypeFieldValue"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:433:1: ruleTypeFieldValue : ( ( rule__TypeFieldValue__Alternatives ) ) ;
    public final void ruleTypeFieldValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:437:2: ( ( ( rule__TypeFieldValue__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:438:1: ( ( rule__TypeFieldValue__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:438:1: ( ( rule__TypeFieldValue__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:439:1: ( rule__TypeFieldValue__Alternatives )
            {
             before(grammarAccess.getTypeFieldValueAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:440:1: ( rule__TypeFieldValue__Alternatives )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:440:2: rule__TypeFieldValue__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeFieldValue__Alternatives_in_ruleTypeFieldValue873);
            rule__TypeFieldValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeFieldValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTypeFieldValue"


    // $ANTLR start "rule__Modifier__Alternatives"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:452:1: rule__Modifier__Alternatives : ( ( ( rule__Modifier__ValueAssignment_0 ) ) | ( ( rule__Modifier__ValueAssignment_1 ) ) | ( ( rule__Modifier__ValueAssignment_2 ) ) | ( ( rule__Modifier__ValueAssignment_3 ) ) | ( ( rule__Modifier__ValueAssignment_4 ) ) | ( ( rule__Modifier__ValueAssignment_5 ) ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:456:1: ( ( ( rule__Modifier__ValueAssignment_0 ) ) | ( ( rule__Modifier__ValueAssignment_1 ) ) | ( ( rule__Modifier__ValueAssignment_2 ) ) | ( ( rule__Modifier__ValueAssignment_3 ) ) | ( ( rule__Modifier__ValueAssignment_4 ) ) | ( ( rule__Modifier__ValueAssignment_5 ) ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt1=1;
                }
                break;
            case 21:
                {
                alt1=2;
                }
                break;
            case 22:
                {
                alt1=3;
                }
                break;
            case 23:
                {
                alt1=4;
                }
                break;
            case 24:
                {
                alt1=5;
                }
                break;
            case 25:
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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:457:1: ( ( rule__Modifier__ValueAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:457:1: ( ( rule__Modifier__ValueAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:458:1: ( rule__Modifier__ValueAssignment_0 )
                    {
                     before(grammarAccess.getModifierAccess().getValueAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:459:1: ( rule__Modifier__ValueAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:459:2: rule__Modifier__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Modifier__ValueAssignment_0_in_rule__Modifier__Alternatives909);
                    rule__Modifier__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModifierAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:463:6: ( ( rule__Modifier__ValueAssignment_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:463:6: ( ( rule__Modifier__ValueAssignment_1 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:464:1: ( rule__Modifier__ValueAssignment_1 )
                    {
                     before(grammarAccess.getModifierAccess().getValueAssignment_1()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:465:1: ( rule__Modifier__ValueAssignment_1 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:465:2: rule__Modifier__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Modifier__ValueAssignment_1_in_rule__Modifier__Alternatives927);
                    rule__Modifier__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModifierAccess().getValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:469:6: ( ( rule__Modifier__ValueAssignment_2 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:469:6: ( ( rule__Modifier__ValueAssignment_2 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:470:1: ( rule__Modifier__ValueAssignment_2 )
                    {
                     before(grammarAccess.getModifierAccess().getValueAssignment_2()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:471:1: ( rule__Modifier__ValueAssignment_2 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:471:2: rule__Modifier__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Modifier__ValueAssignment_2_in_rule__Modifier__Alternatives945);
                    rule__Modifier__ValueAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModifierAccess().getValueAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:475:6: ( ( rule__Modifier__ValueAssignment_3 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:475:6: ( ( rule__Modifier__ValueAssignment_3 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:476:1: ( rule__Modifier__ValueAssignment_3 )
                    {
                     before(grammarAccess.getModifierAccess().getValueAssignment_3()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:477:1: ( rule__Modifier__ValueAssignment_3 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:477:2: rule__Modifier__ValueAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Modifier__ValueAssignment_3_in_rule__Modifier__Alternatives963);
                    rule__Modifier__ValueAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getModifierAccess().getValueAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:481:6: ( ( rule__Modifier__ValueAssignment_4 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:481:6: ( ( rule__Modifier__ValueAssignment_4 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:482:1: ( rule__Modifier__ValueAssignment_4 )
                    {
                     before(grammarAccess.getModifierAccess().getValueAssignment_4()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:483:1: ( rule__Modifier__ValueAssignment_4 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:483:2: rule__Modifier__ValueAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Modifier__ValueAssignment_4_in_rule__Modifier__Alternatives981);
                    rule__Modifier__ValueAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getModifierAccess().getValueAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:487:6: ( ( rule__Modifier__ValueAssignment_5 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:487:6: ( ( rule__Modifier__ValueAssignment_5 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:488:1: ( rule__Modifier__ValueAssignment_5 )
                    {
                     before(grammarAccess.getModifierAccess().getValueAssignment_5()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:489:1: ( rule__Modifier__ValueAssignment_5 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:489:2: rule__Modifier__ValueAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Modifier__ValueAssignment_5_in_rule__Modifier__Alternatives999);
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


    // $ANTLR start "rule__ParameterElementHolder__Alternatives"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:498:1: rule__ParameterElementHolder__Alternatives : ( ( ( rule__ParameterElementHolder__ElementAssignment_0 ) ) | ( ( rule__ParameterElementHolder__ElementAssignment_1 ) ) );
    public final void rule__ParameterElementHolder__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:502:1: ( ( ( rule__ParameterElementHolder__ElementAssignment_0 ) ) | ( ( rule__ParameterElementHolder__ElementAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_NAMEWITHWC||LA2_0==12||LA2_0==26) ) {
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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:503:1: ( ( rule__ParameterElementHolder__ElementAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:503:1: ( ( rule__ParameterElementHolder__ElementAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:504:1: ( rule__ParameterElementHolder__ElementAssignment_0 )
                    {
                     before(grammarAccess.getParameterElementHolderAccess().getElementAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:505:1: ( rule__ParameterElementHolder__ElementAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:505:2: rule__ParameterElementHolder__ElementAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ParameterElementHolder__ElementAssignment_0_in_rule__ParameterElementHolder__Alternatives1032);
                    rule__ParameterElementHolder__ElementAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterElementHolderAccess().getElementAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:509:6: ( ( rule__ParameterElementHolder__ElementAssignment_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:509:6: ( ( rule__ParameterElementHolder__ElementAssignment_1 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:510:1: ( rule__ParameterElementHolder__ElementAssignment_1 )
                    {
                     before(grammarAccess.getParameterElementHolderAccess().getElementAssignment_1()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:511:1: ( rule__ParameterElementHolder__ElementAssignment_1 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:511:2: rule__ParameterElementHolder__ElementAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ParameterElementHolder__ElementAssignment_1_in_rule__ParameterElementHolder__Alternatives1050);
                    rule__ParameterElementHolder__ElementAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterElementHolderAccess().getElementAssignment_1()); 

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
    // $ANTLR end "rule__ParameterElementHolder__Alternatives"


    // $ANTLR start "rule__ParameterType__Alternatives"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:520:1: rule__ParameterType__Alternatives : ( ( ( rule__ParameterType__ValueAssignment_0 ) ) | ( ( rule__ParameterType__ValueAssignment_1 ) ) );
    public final void rule__ParameterType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:524:1: ( ( ( rule__ParameterType__ValueAssignment_0 ) ) | ( ( rule__ParameterType__ValueAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_NAMEWITHWC||LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==26) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:525:1: ( ( rule__ParameterType__ValueAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:525:1: ( ( rule__ParameterType__ValueAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:526:1: ( rule__ParameterType__ValueAssignment_0 )
                    {
                     before(grammarAccess.getParameterTypeAccess().getValueAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:527:1: ( rule__ParameterType__ValueAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:527:2: rule__ParameterType__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ParameterType__ValueAssignment_0_in_rule__ParameterType__Alternatives1083);
                    rule__ParameterType__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterTypeAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:531:6: ( ( rule__ParameterType__ValueAssignment_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:531:6: ( ( rule__ParameterType__ValueAssignment_1 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:532:1: ( rule__ParameterType__ValueAssignment_1 )
                    {
                     before(grammarAccess.getParameterTypeAccess().getValueAssignment_1()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:533:1: ( rule__ParameterType__ValueAssignment_1 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:533:2: rule__ParameterType__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ParameterType__ValueAssignment_1_in_rule__ParameterType__Alternatives1101);
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


    // $ANTLR start "rule__TypeFieldValue__Alternatives"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:542:1: rule__TypeFieldValue__Alternatives : ( ( 'void' ) | ( RULE_NAMEWITHWC ) );
    public final void rule__TypeFieldValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:546:1: ( ( 'void' ) | ( RULE_NAMEWITHWC ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_NAMEWITHWC) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:547:1: ( 'void' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:547:1: ( 'void' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:548:1: 'void'
                    {
                     before(grammarAccess.getTypeFieldValueAccess().getVoidKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__TypeFieldValue__Alternatives1135); 
                     after(grammarAccess.getTypeFieldValueAccess().getVoidKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:555:6: ( RULE_NAMEWITHWC )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:555:6: ( RULE_NAMEWITHWC )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:556:1: RULE_NAMEWITHWC
                    {
                     before(grammarAccess.getTypeFieldValueAccess().getNameWithWCTerminalRuleCall_1()); 
                    match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_rule__TypeFieldValue__Alternatives1154); 
                     after(grammarAccess.getTypeFieldValueAccess().getNameWithWCTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__TypeFieldValue__Alternatives"


    // $ANTLR start "rule__MethodPatternDefinition__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:568:1: rule__MethodPatternDefinition__Group__0 : rule__MethodPatternDefinition__Group__0__Impl rule__MethodPatternDefinition__Group__1 ;
    public final void rule__MethodPatternDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:572:1: ( rule__MethodPatternDefinition__Group__0__Impl rule__MethodPatternDefinition__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:573:2: rule__MethodPatternDefinition__Group__0__Impl rule__MethodPatternDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__MethodPatternDefinition__Group__0__Impl_in_rule__MethodPatternDefinition__Group__01184);
            rule__MethodPatternDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodPatternDefinition__Group__1_in_rule__MethodPatternDefinition__Group__01187);
            rule__MethodPatternDefinition__Group__1();

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
    // $ANTLR end "rule__MethodPatternDefinition__Group__0"


    // $ANTLR start "rule__MethodPatternDefinition__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:580:1: rule__MethodPatternDefinition__Group__0__Impl : ( ( rule__MethodPatternDefinition__ModifierDefinitionAssignment_0 ) ) ;
    public final void rule__MethodPatternDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:584:1: ( ( ( rule__MethodPatternDefinition__ModifierDefinitionAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:585:1: ( ( rule__MethodPatternDefinition__ModifierDefinitionAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:585:1: ( ( rule__MethodPatternDefinition__ModifierDefinitionAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:586:1: ( rule__MethodPatternDefinition__ModifierDefinitionAssignment_0 )
            {
             before(grammarAccess.getMethodPatternDefinitionAccess().getModifierDefinitionAssignment_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:587:1: ( rule__MethodPatternDefinition__ModifierDefinitionAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:587:2: rule__MethodPatternDefinition__ModifierDefinitionAssignment_0
            {
            pushFollow(FOLLOW_rule__MethodPatternDefinition__ModifierDefinitionAssignment_0_in_rule__MethodPatternDefinition__Group__0__Impl1214);
            rule__MethodPatternDefinition__ModifierDefinitionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodPatternDefinitionAccess().getModifierDefinitionAssignment_0()); 

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
    // $ANTLR end "rule__MethodPatternDefinition__Group__0__Impl"


    // $ANTLR start "rule__MethodPatternDefinition__Group__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:597:1: rule__MethodPatternDefinition__Group__1 : rule__MethodPatternDefinition__Group__1__Impl rule__MethodPatternDefinition__Group__2 ;
    public final void rule__MethodPatternDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:601:1: ( rule__MethodPatternDefinition__Group__1__Impl rule__MethodPatternDefinition__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:602:2: rule__MethodPatternDefinition__Group__1__Impl rule__MethodPatternDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__MethodPatternDefinition__Group__1__Impl_in_rule__MethodPatternDefinition__Group__11244);
            rule__MethodPatternDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodPatternDefinition__Group__2_in_rule__MethodPatternDefinition__Group__11247);
            rule__MethodPatternDefinition__Group__2();

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
    // $ANTLR end "rule__MethodPatternDefinition__Group__1"


    // $ANTLR start "rule__MethodPatternDefinition__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:609:1: rule__MethodPatternDefinition__Group__1__Impl : ( ( rule__MethodPatternDefinition__ReturnTypeAssignment_1 ) ) ;
    public final void rule__MethodPatternDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:613:1: ( ( ( rule__MethodPatternDefinition__ReturnTypeAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:614:1: ( ( rule__MethodPatternDefinition__ReturnTypeAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:614:1: ( ( rule__MethodPatternDefinition__ReturnTypeAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:615:1: ( rule__MethodPatternDefinition__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getMethodPatternDefinitionAccess().getReturnTypeAssignment_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:616:1: ( rule__MethodPatternDefinition__ReturnTypeAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:616:2: rule__MethodPatternDefinition__ReturnTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__MethodPatternDefinition__ReturnTypeAssignment_1_in_rule__MethodPatternDefinition__Group__1__Impl1274);
            rule__MethodPatternDefinition__ReturnTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodPatternDefinitionAccess().getReturnTypeAssignment_1()); 

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
    // $ANTLR end "rule__MethodPatternDefinition__Group__1__Impl"


    // $ANTLR start "rule__MethodPatternDefinition__Group__2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:626:1: rule__MethodPatternDefinition__Group__2 : rule__MethodPatternDefinition__Group__2__Impl rule__MethodPatternDefinition__Group__3 ;
    public final void rule__MethodPatternDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:630:1: ( rule__MethodPatternDefinition__Group__2__Impl rule__MethodPatternDefinition__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:631:2: rule__MethodPatternDefinition__Group__2__Impl rule__MethodPatternDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__MethodPatternDefinition__Group__2__Impl_in_rule__MethodPatternDefinition__Group__21304);
            rule__MethodPatternDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodPatternDefinition__Group__3_in_rule__MethodPatternDefinition__Group__21307);
            rule__MethodPatternDefinition__Group__3();

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
    // $ANTLR end "rule__MethodPatternDefinition__Group__2"


    // $ANTLR start "rule__MethodPatternDefinition__Group__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:638:1: rule__MethodPatternDefinition__Group__2__Impl : ( ( rule__MethodPatternDefinition__MethodNameAssignment_2 ) ) ;
    public final void rule__MethodPatternDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:642:1: ( ( ( rule__MethodPatternDefinition__MethodNameAssignment_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:643:1: ( ( rule__MethodPatternDefinition__MethodNameAssignment_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:643:1: ( ( rule__MethodPatternDefinition__MethodNameAssignment_2 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:644:1: ( rule__MethodPatternDefinition__MethodNameAssignment_2 )
            {
             before(grammarAccess.getMethodPatternDefinitionAccess().getMethodNameAssignment_2()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:645:1: ( rule__MethodPatternDefinition__MethodNameAssignment_2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:645:2: rule__MethodPatternDefinition__MethodNameAssignment_2
            {
            pushFollow(FOLLOW_rule__MethodPatternDefinition__MethodNameAssignment_2_in_rule__MethodPatternDefinition__Group__2__Impl1334);
            rule__MethodPatternDefinition__MethodNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMethodPatternDefinitionAccess().getMethodNameAssignment_2()); 

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
    // $ANTLR end "rule__MethodPatternDefinition__Group__2__Impl"


    // $ANTLR start "rule__MethodPatternDefinition__Group__3"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:655:1: rule__MethodPatternDefinition__Group__3 : rule__MethodPatternDefinition__Group__3__Impl rule__MethodPatternDefinition__Group__4 ;
    public final void rule__MethodPatternDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:659:1: ( rule__MethodPatternDefinition__Group__3__Impl rule__MethodPatternDefinition__Group__4 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:660:2: rule__MethodPatternDefinition__Group__3__Impl rule__MethodPatternDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__MethodPatternDefinition__Group__3__Impl_in_rule__MethodPatternDefinition__Group__31364);
            rule__MethodPatternDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodPatternDefinition__Group__4_in_rule__MethodPatternDefinition__Group__31367);
            rule__MethodPatternDefinition__Group__4();

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
    // $ANTLR end "rule__MethodPatternDefinition__Group__3"


    // $ANTLR start "rule__MethodPatternDefinition__Group__3__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:667:1: rule__MethodPatternDefinition__Group__3__Impl : ( ( rule__MethodPatternDefinition__ParameterDefinitionAssignment_3 )? ) ;
    public final void rule__MethodPatternDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:671:1: ( ( ( rule__MethodPatternDefinition__ParameterDefinitionAssignment_3 )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:672:1: ( ( rule__MethodPatternDefinition__ParameterDefinitionAssignment_3 )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:672:1: ( ( rule__MethodPatternDefinition__ParameterDefinitionAssignment_3 )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:673:1: ( rule__MethodPatternDefinition__ParameterDefinitionAssignment_3 )?
            {
             before(grammarAccess.getMethodPatternDefinitionAccess().getParameterDefinitionAssignment_3()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:674:1: ( rule__MethodPatternDefinition__ParameterDefinitionAssignment_3 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:674:2: rule__MethodPatternDefinition__ParameterDefinitionAssignment_3
                    {
                    pushFollow(FOLLOW_rule__MethodPatternDefinition__ParameterDefinitionAssignment_3_in_rule__MethodPatternDefinition__Group__3__Impl1394);
                    rule__MethodPatternDefinition__ParameterDefinitionAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodPatternDefinitionAccess().getParameterDefinitionAssignment_3()); 

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
    // $ANTLR end "rule__MethodPatternDefinition__Group__3__Impl"


    // $ANTLR start "rule__MethodPatternDefinition__Group__4"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:684:1: rule__MethodPatternDefinition__Group__4 : rule__MethodPatternDefinition__Group__4__Impl ;
    public final void rule__MethodPatternDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:688:1: ( rule__MethodPatternDefinition__Group__4__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:689:2: rule__MethodPatternDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__MethodPatternDefinition__Group__4__Impl_in_rule__MethodPatternDefinition__Group__41425);
            rule__MethodPatternDefinition__Group__4__Impl();

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
    // $ANTLR end "rule__MethodPatternDefinition__Group__4"


    // $ANTLR start "rule__MethodPatternDefinition__Group__4__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:695:1: rule__MethodPatternDefinition__Group__4__Impl : ( ( rule__MethodPatternDefinition__ThrowsClauseAssignment_4 )? ) ;
    public final void rule__MethodPatternDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:699:1: ( ( ( rule__MethodPatternDefinition__ThrowsClauseAssignment_4 )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:700:1: ( ( rule__MethodPatternDefinition__ThrowsClauseAssignment_4 )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:700:1: ( ( rule__MethodPatternDefinition__ThrowsClauseAssignment_4 )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:701:1: ( rule__MethodPatternDefinition__ThrowsClauseAssignment_4 )?
            {
             before(grammarAccess.getMethodPatternDefinitionAccess().getThrowsClauseAssignment_4()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:702:1: ( rule__MethodPatternDefinition__ThrowsClauseAssignment_4 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:702:2: rule__MethodPatternDefinition__ThrowsClauseAssignment_4
                    {
                    pushFollow(FOLLOW_rule__MethodPatternDefinition__ThrowsClauseAssignment_4_in_rule__MethodPatternDefinition__Group__4__Impl1452);
                    rule__MethodPatternDefinition__ThrowsClauseAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodPatternDefinitionAccess().getThrowsClauseAssignment_4()); 

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
    // $ANTLR end "rule__MethodPatternDefinition__Group__4__Impl"


    // $ANTLR start "rule__ParameterDefinition__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:722:1: rule__ParameterDefinition__Group__0 : rule__ParameterDefinition__Group__0__Impl rule__ParameterDefinition__Group__1 ;
    public final void rule__ParameterDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:726:1: ( rule__ParameterDefinition__Group__0__Impl rule__ParameterDefinition__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:727:2: rule__ParameterDefinition__Group__0__Impl rule__ParameterDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterDefinition__Group__0__Impl_in_rule__ParameterDefinition__Group__01493);
            rule__ParameterDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterDefinition__Group__1_in_rule__ParameterDefinition__Group__01496);
            rule__ParameterDefinition__Group__1();

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
    // $ANTLR end "rule__ParameterDefinition__Group__0"


    // $ANTLR start "rule__ParameterDefinition__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:734:1: rule__ParameterDefinition__Group__0__Impl : ( '(' ) ;
    public final void rule__ParameterDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:738:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:739:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:739:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:740:1: '('
            {
             before(grammarAccess.getParameterDefinitionAccess().getLeftParenthesisKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__ParameterDefinition__Group__0__Impl1524); 
             after(grammarAccess.getParameterDefinitionAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__ParameterDefinition__Group__0__Impl"


    // $ANTLR start "rule__ParameterDefinition__Group__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:753:1: rule__ParameterDefinition__Group__1 : rule__ParameterDefinition__Group__1__Impl rule__ParameterDefinition__Group__2 ;
    public final void rule__ParameterDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:757:1: ( rule__ParameterDefinition__Group__1__Impl rule__ParameterDefinition__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:758:2: rule__ParameterDefinition__Group__1__Impl rule__ParameterDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__ParameterDefinition__Group__1__Impl_in_rule__ParameterDefinition__Group__11555);
            rule__ParameterDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterDefinition__Group__2_in_rule__ParameterDefinition__Group__11558);
            rule__ParameterDefinition__Group__2();

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
    // $ANTLR end "rule__ParameterDefinition__Group__1"


    // $ANTLR start "rule__ParameterDefinition__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:765:1: rule__ParameterDefinition__Group__1__Impl : ( ( rule__ParameterDefinition__ParameterElementholderAssignment_1 ) ) ;
    public final void rule__ParameterDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:769:1: ( ( ( rule__ParameterDefinition__ParameterElementholderAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:770:1: ( ( rule__ParameterDefinition__ParameterElementholderAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:770:1: ( ( rule__ParameterDefinition__ParameterElementholderAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:771:1: ( rule__ParameterDefinition__ParameterElementholderAssignment_1 )
            {
             before(grammarAccess.getParameterDefinitionAccess().getParameterElementholderAssignment_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:772:1: ( rule__ParameterDefinition__ParameterElementholderAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:772:2: rule__ParameterDefinition__ParameterElementholderAssignment_1
            {
            pushFollow(FOLLOW_rule__ParameterDefinition__ParameterElementholderAssignment_1_in_rule__ParameterDefinition__Group__1__Impl1585);
            rule__ParameterDefinition__ParameterElementholderAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterDefinitionAccess().getParameterElementholderAssignment_1()); 

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
    // $ANTLR end "rule__ParameterDefinition__Group__1__Impl"


    // $ANTLR start "rule__ParameterDefinition__Group__2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:782:1: rule__ParameterDefinition__Group__2 : rule__ParameterDefinition__Group__2__Impl rule__ParameterDefinition__Group__3 ;
    public final void rule__ParameterDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:786:1: ( rule__ParameterDefinition__Group__2__Impl rule__ParameterDefinition__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:787:2: rule__ParameterDefinition__Group__2__Impl rule__ParameterDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__ParameterDefinition__Group__2__Impl_in_rule__ParameterDefinition__Group__21615);
            rule__ParameterDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterDefinition__Group__3_in_rule__ParameterDefinition__Group__21618);
            rule__ParameterDefinition__Group__3();

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
    // $ANTLR end "rule__ParameterDefinition__Group__2"


    // $ANTLR start "rule__ParameterDefinition__Group__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:794:1: rule__ParameterDefinition__Group__2__Impl : ( ( rule__ParameterDefinition__Group_2__0 )* ) ;
    public final void rule__ParameterDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:798:1: ( ( ( rule__ParameterDefinition__Group_2__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:799:1: ( ( rule__ParameterDefinition__Group_2__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:799:1: ( ( rule__ParameterDefinition__Group_2__0 )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:800:1: ( rule__ParameterDefinition__Group_2__0 )*
            {
             before(grammarAccess.getParameterDefinitionAccess().getGroup_2()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:801:1: ( rule__ParameterDefinition__Group_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:801:2: rule__ParameterDefinition__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ParameterDefinition__Group_2__0_in_rule__ParameterDefinition__Group__2__Impl1645);
            	    rule__ParameterDefinition__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getParameterDefinitionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ParameterDefinition__Group__2__Impl"


    // $ANTLR start "rule__ParameterDefinition__Group__3"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:811:1: rule__ParameterDefinition__Group__3 : rule__ParameterDefinition__Group__3__Impl ;
    public final void rule__ParameterDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:815:1: ( rule__ParameterDefinition__Group__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:816:2: rule__ParameterDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ParameterDefinition__Group__3__Impl_in_rule__ParameterDefinition__Group__31676);
            rule__ParameterDefinition__Group__3__Impl();

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
    // $ANTLR end "rule__ParameterDefinition__Group__3"


    // $ANTLR start "rule__ParameterDefinition__Group__3__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:822:1: rule__ParameterDefinition__Group__3__Impl : ( ')' ) ;
    public final void rule__ParameterDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:826:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:827:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:827:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:828:1: ')'
            {
             before(grammarAccess.getParameterDefinitionAccess().getRightParenthesisKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__ParameterDefinition__Group__3__Impl1704); 
             after(grammarAccess.getParameterDefinitionAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__ParameterDefinition__Group__3__Impl"


    // $ANTLR start "rule__ParameterDefinition__Group_2__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:849:1: rule__ParameterDefinition__Group_2__0 : rule__ParameterDefinition__Group_2__0__Impl rule__ParameterDefinition__Group_2__1 ;
    public final void rule__ParameterDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:853:1: ( rule__ParameterDefinition__Group_2__0__Impl rule__ParameterDefinition__Group_2__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:854:2: rule__ParameterDefinition__Group_2__0__Impl rule__ParameterDefinition__Group_2__1
            {
            pushFollow(FOLLOW_rule__ParameterDefinition__Group_2__0__Impl_in_rule__ParameterDefinition__Group_2__01743);
            rule__ParameterDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterDefinition__Group_2__1_in_rule__ParameterDefinition__Group_2__01746);
            rule__ParameterDefinition__Group_2__1();

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
    // $ANTLR end "rule__ParameterDefinition__Group_2__0"


    // $ANTLR start "rule__ParameterDefinition__Group_2__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:861:1: rule__ParameterDefinition__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ParameterDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:865:1: ( ( ',' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:866:1: ( ',' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:866:1: ( ',' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:867:1: ','
            {
             before(grammarAccess.getParameterDefinitionAccess().getCommaKeyword_2_0()); 
            match(input,15,FOLLOW_15_in_rule__ParameterDefinition__Group_2__0__Impl1774); 
             after(grammarAccess.getParameterDefinitionAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__ParameterDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__ParameterDefinition__Group_2__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:880:1: rule__ParameterDefinition__Group_2__1 : rule__ParameterDefinition__Group_2__1__Impl ;
    public final void rule__ParameterDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:884:1: ( rule__ParameterDefinition__Group_2__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:885:2: rule__ParameterDefinition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterDefinition__Group_2__1__Impl_in_rule__ParameterDefinition__Group_2__11805);
            rule__ParameterDefinition__Group_2__1__Impl();

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
    // $ANTLR end "rule__ParameterDefinition__Group_2__1"


    // $ANTLR start "rule__ParameterDefinition__Group_2__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:891:1: rule__ParameterDefinition__Group_2__1__Impl : ( ( rule__ParameterDefinition__ParameterElementholderAssignment_2_1 ) ) ;
    public final void rule__ParameterDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:895:1: ( ( ( rule__ParameterDefinition__ParameterElementholderAssignment_2_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:896:1: ( ( rule__ParameterDefinition__ParameterElementholderAssignment_2_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:896:1: ( ( rule__ParameterDefinition__ParameterElementholderAssignment_2_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:897:1: ( rule__ParameterDefinition__ParameterElementholderAssignment_2_1 )
            {
             before(grammarAccess.getParameterDefinitionAccess().getParameterElementholderAssignment_2_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:898:1: ( rule__ParameterDefinition__ParameterElementholderAssignment_2_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:898:2: rule__ParameterDefinition__ParameterElementholderAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ParameterDefinition__ParameterElementholderAssignment_2_1_in_rule__ParameterDefinition__Group_2__1__Impl1832);
            rule__ParameterDefinition__ParameterElementholderAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterDefinitionAccess().getParameterElementholderAssignment_2_1()); 

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
    // $ANTLR end "rule__ParameterDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__ModifierDefinition__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:912:1: rule__ModifierDefinition__Group__0 : rule__ModifierDefinition__Group__0__Impl rule__ModifierDefinition__Group__1 ;
    public final void rule__ModifierDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:916:1: ( rule__ModifierDefinition__Group__0__Impl rule__ModifierDefinition__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:917:2: rule__ModifierDefinition__Group__0__Impl rule__ModifierDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__ModifierDefinition__Group__0__Impl_in_rule__ModifierDefinition__Group__01866);
            rule__ModifierDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModifierDefinition__Group__1_in_rule__ModifierDefinition__Group__01869);
            rule__ModifierDefinition__Group__1();

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
    // $ANTLR end "rule__ModifierDefinition__Group__0"


    // $ANTLR start "rule__ModifierDefinition__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:924:1: rule__ModifierDefinition__Group__0__Impl : ( () ) ;
    public final void rule__ModifierDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:928:1: ( ( () ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:929:1: ( () )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:929:1: ( () )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:930:1: ()
            {
             before(grammarAccess.getModifierDefinitionAccess().getModifierDefinitionAction_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:931:1: ()
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:933:1: 
            {
            }

             after(grammarAccess.getModifierDefinitionAccess().getModifierDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifierDefinition__Group__0__Impl"


    // $ANTLR start "rule__ModifierDefinition__Group__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:943:1: rule__ModifierDefinition__Group__1 : rule__ModifierDefinition__Group__1__Impl ;
    public final void rule__ModifierDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:947:1: ( rule__ModifierDefinition__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:948:2: rule__ModifierDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ModifierDefinition__Group__1__Impl_in_rule__ModifierDefinition__Group__11927);
            rule__ModifierDefinition__Group__1__Impl();

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
    // $ANTLR end "rule__ModifierDefinition__Group__1"


    // $ANTLR start "rule__ModifierDefinition__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:954:1: rule__ModifierDefinition__Group__1__Impl : ( ( rule__ModifierDefinition__ModifiersAssignment_1 )* ) ;
    public final void rule__ModifierDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:958:1: ( ( ( rule__ModifierDefinition__ModifiersAssignment_1 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:959:1: ( ( rule__ModifierDefinition__ModifiersAssignment_1 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:959:1: ( ( rule__ModifierDefinition__ModifiersAssignment_1 )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:960:1: ( rule__ModifierDefinition__ModifiersAssignment_1 )*
            {
             before(grammarAccess.getModifierDefinitionAccess().getModifiersAssignment_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:961:1: ( rule__ModifierDefinition__ModifiersAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=20 && LA8_0<=25)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:961:2: rule__ModifierDefinition__ModifiersAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__ModifierDefinition__ModifiersAssignment_1_in_rule__ModifierDefinition__Group__1__Impl1954);
            	    rule__ModifierDefinition__ModifiersAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModifierDefinitionAccess().getModifiersAssignment_1()); 

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
    // $ANTLR end "rule__ModifierDefinition__Group__1__Impl"


    // $ANTLR start "rule__MultiElement__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:975:1: rule__MultiElement__Group__0 : rule__MultiElement__Group__0__Impl rule__MultiElement__Group__1 ;
    public final void rule__MultiElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:979:1: ( rule__MultiElement__Group__0__Impl rule__MultiElement__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:980:2: rule__MultiElement__Group__0__Impl rule__MultiElement__Group__1
            {
            pushFollow(FOLLOW_rule__MultiElement__Group__0__Impl_in_rule__MultiElement__Group__01989);
            rule__MultiElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiElement__Group__1_in_rule__MultiElement__Group__01992);
            rule__MultiElement__Group__1();

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
    // $ANTLR end "rule__MultiElement__Group__0"


    // $ANTLR start "rule__MultiElement__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:987:1: rule__MultiElement__Group__0__Impl : ( '{' ) ;
    public final void rule__MultiElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:991:1: ( ( '{' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:992:1: ( '{' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:992:1: ( '{' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:993:1: '{'
            {
             before(grammarAccess.getMultiElementAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__MultiElement__Group__0__Impl2020); 
             after(grammarAccess.getMultiElementAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__MultiElement__Group__0__Impl"


    // $ANTLR start "rule__MultiElement__Group__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1006:1: rule__MultiElement__Group__1 : rule__MultiElement__Group__1__Impl rule__MultiElement__Group__2 ;
    public final void rule__MultiElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1010:1: ( rule__MultiElement__Group__1__Impl rule__MultiElement__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1011:2: rule__MultiElement__Group__1__Impl rule__MultiElement__Group__2
            {
            pushFollow(FOLLOW_rule__MultiElement__Group__1__Impl_in_rule__MultiElement__Group__12051);
            rule__MultiElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiElement__Group__2_in_rule__MultiElement__Group__12054);
            rule__MultiElement__Group__2();

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
    // $ANTLR end "rule__MultiElement__Group__1"


    // $ANTLR start "rule__MultiElement__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1018:1: rule__MultiElement__Group__1__Impl : ( ( rule__MultiElement__ElementsAssignment_1 ) ) ;
    public final void rule__MultiElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1022:1: ( ( ( rule__MultiElement__ElementsAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1023:1: ( ( rule__MultiElement__ElementsAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1023:1: ( ( rule__MultiElement__ElementsAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1024:1: ( rule__MultiElement__ElementsAssignment_1 )
            {
             before(grammarAccess.getMultiElementAccess().getElementsAssignment_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1025:1: ( rule__MultiElement__ElementsAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1025:2: rule__MultiElement__ElementsAssignment_1
            {
            pushFollow(FOLLOW_rule__MultiElement__ElementsAssignment_1_in_rule__MultiElement__Group__1__Impl2081);
            rule__MultiElement__ElementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiElementAccess().getElementsAssignment_1()); 

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
    // $ANTLR end "rule__MultiElement__Group__1__Impl"


    // $ANTLR start "rule__MultiElement__Group__2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1035:1: rule__MultiElement__Group__2 : rule__MultiElement__Group__2__Impl rule__MultiElement__Group__3 ;
    public final void rule__MultiElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1039:1: ( rule__MultiElement__Group__2__Impl rule__MultiElement__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1040:2: rule__MultiElement__Group__2__Impl rule__MultiElement__Group__3
            {
            pushFollow(FOLLOW_rule__MultiElement__Group__2__Impl_in_rule__MultiElement__Group__22111);
            rule__MultiElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiElement__Group__3_in_rule__MultiElement__Group__22114);
            rule__MultiElement__Group__3();

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
    // $ANTLR end "rule__MultiElement__Group__2"


    // $ANTLR start "rule__MultiElement__Group__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1047:1: rule__MultiElement__Group__2__Impl : ( ( rule__MultiElement__Group_2__0 )* ) ;
    public final void rule__MultiElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1051:1: ( ( ( rule__MultiElement__Group_2__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1052:1: ( ( rule__MultiElement__Group_2__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1052:1: ( ( rule__MultiElement__Group_2__0 )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1053:1: ( rule__MultiElement__Group_2__0 )*
            {
             before(grammarAccess.getMultiElementAccess().getGroup_2()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1054:1: ( rule__MultiElement__Group_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1054:2: rule__MultiElement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__MultiElement__Group_2__0_in_rule__MultiElement__Group__2__Impl2141);
            	    rule__MultiElement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getMultiElementAccess().getGroup_2()); 

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
    // $ANTLR end "rule__MultiElement__Group__2__Impl"


    // $ANTLR start "rule__MultiElement__Group__3"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1064:1: rule__MultiElement__Group__3 : rule__MultiElement__Group__3__Impl ;
    public final void rule__MultiElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1068:1: ( rule__MultiElement__Group__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1069:2: rule__MultiElement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MultiElement__Group__3__Impl_in_rule__MultiElement__Group__32172);
            rule__MultiElement__Group__3__Impl();

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
    // $ANTLR end "rule__MultiElement__Group__3"


    // $ANTLR start "rule__MultiElement__Group__3__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1075:1: rule__MultiElement__Group__3__Impl : ( '}' ) ;
    public final void rule__MultiElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1079:1: ( ( '}' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1080:1: ( '}' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1080:1: ( '}' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1081:1: '}'
            {
             before(grammarAccess.getMultiElementAccess().getRightCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__MultiElement__Group__3__Impl2200); 
             after(grammarAccess.getMultiElementAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__MultiElement__Group__3__Impl"


    // $ANTLR start "rule__MultiElement__Group_2__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1102:1: rule__MultiElement__Group_2__0 : rule__MultiElement__Group_2__0__Impl rule__MultiElement__Group_2__1 ;
    public final void rule__MultiElement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1106:1: ( rule__MultiElement__Group_2__0__Impl rule__MultiElement__Group_2__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1107:2: rule__MultiElement__Group_2__0__Impl rule__MultiElement__Group_2__1
            {
            pushFollow(FOLLOW_rule__MultiElement__Group_2__0__Impl_in_rule__MultiElement__Group_2__02239);
            rule__MultiElement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiElement__Group_2__1_in_rule__MultiElement__Group_2__02242);
            rule__MultiElement__Group_2__1();

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
    // $ANTLR end "rule__MultiElement__Group_2__0"


    // $ANTLR start "rule__MultiElement__Group_2__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1114:1: rule__MultiElement__Group_2__0__Impl : ( '|' ) ;
    public final void rule__MultiElement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1118:1: ( ( '|' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1119:1: ( '|' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1119:1: ( '|' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1120:1: '|'
            {
             before(grammarAccess.getMultiElementAccess().getVerticalLineKeyword_2_0()); 
            match(input,18,FOLLOW_18_in_rule__MultiElement__Group_2__0__Impl2270); 
             after(grammarAccess.getMultiElementAccess().getVerticalLineKeyword_2_0()); 

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
    // $ANTLR end "rule__MultiElement__Group_2__0__Impl"


    // $ANTLR start "rule__MultiElement__Group_2__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1133:1: rule__MultiElement__Group_2__1 : rule__MultiElement__Group_2__1__Impl ;
    public final void rule__MultiElement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1137:1: ( rule__MultiElement__Group_2__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1138:2: rule__MultiElement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiElement__Group_2__1__Impl_in_rule__MultiElement__Group_2__12301);
            rule__MultiElement__Group_2__1__Impl();

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
    // $ANTLR end "rule__MultiElement__Group_2__1"


    // $ANTLR start "rule__MultiElement__Group_2__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1144:1: rule__MultiElement__Group_2__1__Impl : ( ( rule__MultiElement__ElementsAssignment_2_1 ) ) ;
    public final void rule__MultiElement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1148:1: ( ( ( rule__MultiElement__ElementsAssignment_2_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1149:1: ( ( rule__MultiElement__ElementsAssignment_2_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1149:1: ( ( rule__MultiElement__ElementsAssignment_2_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1150:1: ( rule__MultiElement__ElementsAssignment_2_1 )
            {
             before(grammarAccess.getMultiElementAccess().getElementsAssignment_2_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1151:1: ( rule__MultiElement__ElementsAssignment_2_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1151:2: rule__MultiElement__ElementsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__MultiElement__ElementsAssignment_2_1_in_rule__MultiElement__Group_2__1__Impl2328);
            rule__MultiElement__ElementsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiElementAccess().getElementsAssignment_2_1()); 

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
    // $ANTLR end "rule__MultiElement__Group_2__1__Impl"


    // $ANTLR start "rule__Throws__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1165:1: rule__Throws__Group__0 : rule__Throws__Group__0__Impl rule__Throws__Group__1 ;
    public final void rule__Throws__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1169:1: ( rule__Throws__Group__0__Impl rule__Throws__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1170:2: rule__Throws__Group__0__Impl rule__Throws__Group__1
            {
            pushFollow(FOLLOW_rule__Throws__Group__0__Impl_in_rule__Throws__Group__02362);
            rule__Throws__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Throws__Group__1_in_rule__Throws__Group__02365);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1177:1: rule__Throws__Group__0__Impl : ( 'throws' ) ;
    public final void rule__Throws__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1181:1: ( ( 'throws' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1182:1: ( 'throws' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1182:1: ( 'throws' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1183:1: 'throws'
            {
             before(grammarAccess.getThrowsAccess().getThrowsKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Throws__Group__0__Impl2393); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1196:1: rule__Throws__Group__1 : rule__Throws__Group__1__Impl ;
    public final void rule__Throws__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1200:1: ( rule__Throws__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1201:2: rule__Throws__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Throws__Group__1__Impl_in_rule__Throws__Group__12424);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1207:1: rule__Throws__Group__1__Impl : ( ( rule__Throws__ValueAssignment_1 ) ) ;
    public final void rule__Throws__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1211:1: ( ( ( rule__Throws__ValueAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1212:1: ( ( rule__Throws__ValueAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1212:1: ( ( rule__Throws__ValueAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1213:1: ( rule__Throws__ValueAssignment_1 )
            {
             before(grammarAccess.getThrowsAccess().getValueAssignment_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1214:1: ( rule__Throws__ValueAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1214:2: rule__Throws__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Throws__ValueAssignment_1_in_rule__Throws__Group__1__Impl2451);
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


    // $ANTLR start "rule__MethodPattern__DefinitionAssignment"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1229:1: rule__MethodPattern__DefinitionAssignment : ( ruleMethodPatternDefinition ) ;
    public final void rule__MethodPattern__DefinitionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1233:1: ( ( ruleMethodPatternDefinition ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1234:1: ( ruleMethodPatternDefinition )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1234:1: ( ruleMethodPatternDefinition )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1235:1: ruleMethodPatternDefinition
            {
             before(grammarAccess.getMethodPatternAccess().getDefinitionMethodPatternDefinitionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMethodPatternDefinition_in_rule__MethodPattern__DefinitionAssignment2490);
            ruleMethodPatternDefinition();

            state._fsp--;

             after(grammarAccess.getMethodPatternAccess().getDefinitionMethodPatternDefinitionParserRuleCall_0()); 

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
    // $ANTLR end "rule__MethodPattern__DefinitionAssignment"


    // $ANTLR start "rule__MethodPatternDefinition__ModifierDefinitionAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1244:1: rule__MethodPatternDefinition__ModifierDefinitionAssignment_0 : ( ruleModifierDefinition ) ;
    public final void rule__MethodPatternDefinition__ModifierDefinitionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1248:1: ( ( ruleModifierDefinition ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1249:1: ( ruleModifierDefinition )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1249:1: ( ruleModifierDefinition )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1250:1: ruleModifierDefinition
            {
             before(grammarAccess.getMethodPatternDefinitionAccess().getModifierDefinitionModifierDefinitionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleModifierDefinition_in_rule__MethodPatternDefinition__ModifierDefinitionAssignment_02521);
            ruleModifierDefinition();

            state._fsp--;

             after(grammarAccess.getMethodPatternDefinitionAccess().getModifierDefinitionModifierDefinitionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__MethodPatternDefinition__ModifierDefinitionAssignment_0"


    // $ANTLR start "rule__MethodPatternDefinition__ReturnTypeAssignment_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1259:1: rule__MethodPatternDefinition__ReturnTypeAssignment_1 : ( ruleReturnType ) ;
    public final void rule__MethodPatternDefinition__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1263:1: ( ( ruleReturnType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1264:1: ( ruleReturnType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1264:1: ( ruleReturnType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1265:1: ruleReturnType
            {
             before(grammarAccess.getMethodPatternDefinitionAccess().getReturnTypeReturnTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReturnType_in_rule__MethodPatternDefinition__ReturnTypeAssignment_12552);
            ruleReturnType();

            state._fsp--;

             after(grammarAccess.getMethodPatternDefinitionAccess().getReturnTypeReturnTypeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__MethodPatternDefinition__ReturnTypeAssignment_1"


    // $ANTLR start "rule__MethodPatternDefinition__MethodNameAssignment_2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1274:1: rule__MethodPatternDefinition__MethodNameAssignment_2 : ( ruleMethodName ) ;
    public final void rule__MethodPatternDefinition__MethodNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1278:1: ( ( ruleMethodName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1279:1: ( ruleMethodName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1279:1: ( ruleMethodName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1280:1: ruleMethodName
            {
             before(grammarAccess.getMethodPatternDefinitionAccess().getMethodNameMethodNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleMethodName_in_rule__MethodPatternDefinition__MethodNameAssignment_22583);
            ruleMethodName();

            state._fsp--;

             after(grammarAccess.getMethodPatternDefinitionAccess().getMethodNameMethodNameParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MethodPatternDefinition__MethodNameAssignment_2"


    // $ANTLR start "rule__MethodPatternDefinition__ParameterDefinitionAssignment_3"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1289:1: rule__MethodPatternDefinition__ParameterDefinitionAssignment_3 : ( ruleParameterDefinition ) ;
    public final void rule__MethodPatternDefinition__ParameterDefinitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1293:1: ( ( ruleParameterDefinition ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1294:1: ( ruleParameterDefinition )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1294:1: ( ruleParameterDefinition )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1295:1: ruleParameterDefinition
            {
             before(grammarAccess.getMethodPatternDefinitionAccess().getParameterDefinitionParameterDefinitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleParameterDefinition_in_rule__MethodPatternDefinition__ParameterDefinitionAssignment_32614);
            ruleParameterDefinition();

            state._fsp--;

             after(grammarAccess.getMethodPatternDefinitionAccess().getParameterDefinitionParameterDefinitionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__MethodPatternDefinition__ParameterDefinitionAssignment_3"


    // $ANTLR start "rule__MethodPatternDefinition__ThrowsClauseAssignment_4"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1304:1: rule__MethodPatternDefinition__ThrowsClauseAssignment_4 : ( ruleThrows ) ;
    public final void rule__MethodPatternDefinition__ThrowsClauseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1308:1: ( ( ruleThrows ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1309:1: ( ruleThrows )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1309:1: ( ruleThrows )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1310:1: ruleThrows
            {
             before(grammarAccess.getMethodPatternDefinitionAccess().getThrowsClauseThrowsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleThrows_in_rule__MethodPatternDefinition__ThrowsClauseAssignment_42645);
            ruleThrows();

            state._fsp--;

             after(grammarAccess.getMethodPatternDefinitionAccess().getThrowsClauseThrowsParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__MethodPatternDefinition__ThrowsClauseAssignment_4"


    // $ANTLR start "rule__ParameterDefinition__ParameterElementholderAssignment_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1319:1: rule__ParameterDefinition__ParameterElementholderAssignment_1 : ( ruleParameterElementHolder ) ;
    public final void rule__ParameterDefinition__ParameterElementholderAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1323:1: ( ( ruleParameterElementHolder ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1324:1: ( ruleParameterElementHolder )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1324:1: ( ruleParameterElementHolder )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1325:1: ruleParameterElementHolder
            {
             before(grammarAccess.getParameterDefinitionAccess().getParameterElementholderParameterElementHolderParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParameterElementHolder_in_rule__ParameterDefinition__ParameterElementholderAssignment_12676);
            ruleParameterElementHolder();

            state._fsp--;

             after(grammarAccess.getParameterDefinitionAccess().getParameterElementholderParameterElementHolderParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ParameterDefinition__ParameterElementholderAssignment_1"


    // $ANTLR start "rule__ParameterDefinition__ParameterElementholderAssignment_2_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1334:1: rule__ParameterDefinition__ParameterElementholderAssignment_2_1 : ( ruleParameterElementHolder ) ;
    public final void rule__ParameterDefinition__ParameterElementholderAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1338:1: ( ( ruleParameterElementHolder ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1339:1: ( ruleParameterElementHolder )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1339:1: ( ruleParameterElementHolder )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1340:1: ruleParameterElementHolder
            {
             before(grammarAccess.getParameterDefinitionAccess().getParameterElementholderParameterElementHolderParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleParameterElementHolder_in_rule__ParameterDefinition__ParameterElementholderAssignment_2_12707);
            ruleParameterElementHolder();

            state._fsp--;

             after(grammarAccess.getParameterDefinitionAccess().getParameterElementholderParameterElementHolderParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ParameterDefinition__ParameterElementholderAssignment_2_1"


    // $ANTLR start "rule__ModifierDefinition__ModifiersAssignment_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1349:1: rule__ModifierDefinition__ModifiersAssignment_1 : ( ruleModifier ) ;
    public final void rule__ModifierDefinition__ModifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1353:1: ( ( ruleModifier ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1354:1: ( ruleModifier )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1354:1: ( ruleModifier )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1355:1: ruleModifier
            {
             before(grammarAccess.getModifierDefinitionAccess().getModifiersModifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleModifier_in_rule__ModifierDefinition__ModifiersAssignment_12738);
            ruleModifier();

            state._fsp--;

             after(grammarAccess.getModifierDefinitionAccess().getModifiersModifierParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ModifierDefinition__ModifiersAssignment_1"


    // $ANTLR start "rule__Modifier__ValueAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1364:1: rule__Modifier__ValueAssignment_0 : ( ( 'static' ) ) ;
    public final void rule__Modifier__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1368:1: ( ( ( 'static' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1369:1: ( ( 'static' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1369:1: ( ( 'static' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1370:1: ( 'static' )
            {
             before(grammarAccess.getModifierAccess().getValueStaticKeyword_0_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1371:1: ( 'static' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1372:1: 'static'
            {
             before(grammarAccess.getModifierAccess().getValueStaticKeyword_0_0()); 
            match(input,20,FOLLOW_20_in_rule__Modifier__ValueAssignment_02774); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1387:1: rule__Modifier__ValueAssignment_1 : ( ( 'private' ) ) ;
    public final void rule__Modifier__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1391:1: ( ( ( 'private' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1392:1: ( ( 'private' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1392:1: ( ( 'private' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1393:1: ( 'private' )
            {
             before(grammarAccess.getModifierAccess().getValuePrivateKeyword_1_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1394:1: ( 'private' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1395:1: 'private'
            {
             before(grammarAccess.getModifierAccess().getValuePrivateKeyword_1_0()); 
            match(input,21,FOLLOW_21_in_rule__Modifier__ValueAssignment_12818); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1410:1: rule__Modifier__ValueAssignment_2 : ( ( 'public' ) ) ;
    public final void rule__Modifier__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1414:1: ( ( ( 'public' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1415:1: ( ( 'public' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1415:1: ( ( 'public' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1416:1: ( 'public' )
            {
             before(grammarAccess.getModifierAccess().getValuePublicKeyword_2_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1417:1: ( 'public' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1418:1: 'public'
            {
             before(grammarAccess.getModifierAccess().getValuePublicKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__Modifier__ValueAssignment_22862); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1433:1: rule__Modifier__ValueAssignment_3 : ( ( 'final' ) ) ;
    public final void rule__Modifier__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1437:1: ( ( ( 'final' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1438:1: ( ( 'final' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1438:1: ( ( 'final' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1439:1: ( 'final' )
            {
             before(grammarAccess.getModifierAccess().getValueFinalKeyword_3_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1440:1: ( 'final' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1441:1: 'final'
            {
             before(grammarAccess.getModifierAccess().getValueFinalKeyword_3_0()); 
            match(input,23,FOLLOW_23_in_rule__Modifier__ValueAssignment_32906); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1456:1: rule__Modifier__ValueAssignment_4 : ( ( 'abstract' ) ) ;
    public final void rule__Modifier__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1460:1: ( ( ( 'abstract' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1461:1: ( ( 'abstract' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1461:1: ( ( 'abstract' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1462:1: ( 'abstract' )
            {
             before(grammarAccess.getModifierAccess().getValueAbstractKeyword_4_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1463:1: ( 'abstract' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1464:1: 'abstract'
            {
             before(grammarAccess.getModifierAccess().getValueAbstractKeyword_4_0()); 
            match(input,24,FOLLOW_24_in_rule__Modifier__ValueAssignment_42950); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1479:1: rule__Modifier__ValueAssignment_5 : ( ( 'protected' ) ) ;
    public final void rule__Modifier__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1483:1: ( ( ( 'protected' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1484:1: ( ( 'protected' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1484:1: ( ( 'protected' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1485:1: ( 'protected' )
            {
             before(grammarAccess.getModifierAccess().getValueProtectedKeyword_5_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1486:1: ( 'protected' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1487:1: 'protected'
            {
             before(grammarAccess.getModifierAccess().getValueProtectedKeyword_5_0()); 
            match(input,25,FOLLOW_25_in_rule__Modifier__ValueAssignment_52994); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1502:1: rule__ReturnType__ValueAssignment : ( ruleTypeFieldValue ) ;
    public final void rule__ReturnType__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1506:1: ( ( ruleTypeFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1507:1: ( ruleTypeFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1507:1: ( ruleTypeFieldValue )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1508:1: ruleTypeFieldValue
            {
             before(grammarAccess.getReturnTypeAccess().getValueTypeFieldValueParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTypeFieldValue_in_rule__ReturnType__ValueAssignment3033);
            ruleTypeFieldValue();

            state._fsp--;

             after(grammarAccess.getReturnTypeAccess().getValueTypeFieldValueParserRuleCall_0()); 

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


    // $ANTLR start "rule__ParameterElementHolder__ElementAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1517:1: rule__ParameterElementHolder__ElementAssignment_0 : ( ruleSingleElement ) ;
    public final void rule__ParameterElementHolder__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1521:1: ( ( ruleSingleElement ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1522:1: ( ruleSingleElement )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1522:1: ( ruleSingleElement )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1523:1: ruleSingleElement
            {
             before(grammarAccess.getParameterElementHolderAccess().getElementSingleElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSingleElement_in_rule__ParameterElementHolder__ElementAssignment_03064);
            ruleSingleElement();

            state._fsp--;

             after(grammarAccess.getParameterElementHolderAccess().getElementSingleElementParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ParameterElementHolder__ElementAssignment_0"


    // $ANTLR start "rule__ParameterElementHolder__ElementAssignment_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1532:1: rule__ParameterElementHolder__ElementAssignment_1 : ( ruleMultiElement ) ;
    public final void rule__ParameterElementHolder__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1536:1: ( ( ruleMultiElement ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1537:1: ( ruleMultiElement )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1537:1: ( ruleMultiElement )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1538:1: ruleMultiElement
            {
             before(grammarAccess.getParameterElementHolderAccess().getElementMultiElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMultiElement_in_rule__ParameterElementHolder__ElementAssignment_13095);
            ruleMultiElement();

            state._fsp--;

             after(grammarAccess.getParameterElementHolderAccess().getElementMultiElementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ParameterElementHolder__ElementAssignment_1"


    // $ANTLR start "rule__SingleElement__ValueAssignment"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1547:1: rule__SingleElement__ValueAssignment : ( ruleParameterType ) ;
    public final void rule__SingleElement__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1551:1: ( ( ruleParameterType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1552:1: ( ruleParameterType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1552:1: ( ruleParameterType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1553:1: ruleParameterType
            {
             before(grammarAccess.getSingleElementAccess().getValueParameterTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleParameterType_in_rule__SingleElement__ValueAssignment3126);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getSingleElementAccess().getValueParameterTypeParserRuleCall_0()); 

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
    // $ANTLR end "rule__SingleElement__ValueAssignment"


    // $ANTLR start "rule__MultiElement__ElementsAssignment_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1562:1: rule__MultiElement__ElementsAssignment_1 : ( ruleSingleElement ) ;
    public final void rule__MultiElement__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1566:1: ( ( ruleSingleElement ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1567:1: ( ruleSingleElement )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1567:1: ( ruleSingleElement )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1568:1: ruleSingleElement
            {
             before(grammarAccess.getMultiElementAccess().getElementsSingleElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSingleElement_in_rule__MultiElement__ElementsAssignment_13157);
            ruleSingleElement();

            state._fsp--;

             after(grammarAccess.getMultiElementAccess().getElementsSingleElementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__MultiElement__ElementsAssignment_1"


    // $ANTLR start "rule__MultiElement__ElementsAssignment_2_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1577:1: rule__MultiElement__ElementsAssignment_2_1 : ( ruleSingleElement ) ;
    public final void rule__MultiElement__ElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1581:1: ( ( ruleSingleElement ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1582:1: ( ruleSingleElement )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1582:1: ( ruleSingleElement )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1583:1: ruleSingleElement
            {
             before(grammarAccess.getMultiElementAccess().getElementsSingleElementParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleSingleElement_in_rule__MultiElement__ElementsAssignment_2_13188);
            ruleSingleElement();

            state._fsp--;

             after(grammarAccess.getMultiElementAccess().getElementsSingleElementParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__MultiElement__ElementsAssignment_2_1"


    // $ANTLR start "rule__ParameterType__ValueAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1592:1: rule__ParameterType__ValueAssignment_0 : ( ruleTypeFieldValue ) ;
    public final void rule__ParameterType__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1596:1: ( ( ruleTypeFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1597:1: ( ruleTypeFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1597:1: ( ruleTypeFieldValue )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1598:1: ruleTypeFieldValue
            {
             before(grammarAccess.getParameterTypeAccess().getValueTypeFieldValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTypeFieldValue_in_rule__ParameterType__ValueAssignment_03219);
            ruleTypeFieldValue();

            state._fsp--;

             after(grammarAccess.getParameterTypeAccess().getValueTypeFieldValueParserRuleCall_0_0()); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1607:1: rule__ParameterType__ValueAssignment_1 : ( ( '..' ) ) ;
    public final void rule__ParameterType__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1611:1: ( ( ( '..' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1612:1: ( ( '..' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1612:1: ( ( '..' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1613:1: ( '..' )
            {
             before(grammarAccess.getParameterTypeAccess().getValueFullStopFullStopKeyword_1_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1614:1: ( '..' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1615:1: '..'
            {
             before(grammarAccess.getParameterTypeAccess().getValueFullStopFullStopKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__ParameterType__ValueAssignment_13255); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1630:1: rule__Throws__ValueAssignment_1 : ( ruleTypeFieldValue ) ;
    public final void rule__Throws__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1634:1: ( ( ruleTypeFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1635:1: ( ruleTypeFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1635:1: ( ruleTypeFieldValue )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1636:1: ruleTypeFieldValue
            {
             before(grammarAccess.getThrowsAccess().getValueTypeFieldValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeFieldValue_in_rule__Throws__ValueAssignment_13294);
            ruleTypeFieldValue();

            state._fsp--;

             after(grammarAccess.getThrowsAccess().getValueTypeFieldValueParserRuleCall_1_0()); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1645:1: rule__MethodName__ValueAssignment : ( ruleSimpleFieldValue ) ;
    public final void rule__MethodName__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1649:1: ( ( ruleSimpleFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1650:1: ( ruleSimpleFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1650:1: ( ruleSimpleFieldValue )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1651:1: ruleSimpleFieldValue
            {
             before(grammarAccess.getMethodNameAccess().getValueSimpleFieldValueParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSimpleFieldValue_in_rule__MethodName__ValueAssignment3325);
            ruleSimpleFieldValue();

            state._fsp--;

             after(grammarAccess.getMethodNameAccess().getValueSimpleFieldValueParserRuleCall_0()); 

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
    public static final BitSet FOLLOW_rule__MethodPattern__DefinitionAssignment_in_ruleMethodPattern94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodPatternDefinition_in_entryRuleMethodPatternDefinition121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodPatternDefinition128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPatternDefinition__Group__0_in_ruleMethodPatternDefinition154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDefinition_in_entryRuleParameterDefinition181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDefinition188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDefinition__Group__0_in_ruleParameterDefinition214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierDefinition_in_entryRuleModifierDefinition241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifierDefinition248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifierDefinition__Group__0_in_ruleModifierDefinition274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__Alternatives_in_ruleModifier334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnType_in_entryRuleReturnType361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnType368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnType__ValueAssignment_in_ruleReturnType394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterElementHolder_in_entryRuleParameterElementHolder421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterElementHolder428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElementHolder__Alternatives_in_ruleParameterElementHolder454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleElement_in_entryRuleSingleElement481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleElement488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleElement__ValueAssignment_in_ruleSingleElement514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiElement_in_entryRuleMultiElement541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiElement548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiElement__Group__0_in_ruleMultiElement574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterType_in_entryRuleParameterType601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterType608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterType__Alternatives_in_ruleParameterType634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThrows_in_entryRuleThrows661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThrows668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Throws__Group__0_in_ruleThrows694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodName_in_entryRuleMethodName721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodName728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodName__ValueAssignment_in_ruleMethodName754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFieldValue_in_entryRuleSimpleFieldValue781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleFieldValue788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleSimpleFieldValue814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFieldValue_in_entryRuleTypeFieldValue840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeFieldValue847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldValue__Alternatives_in_ruleTypeFieldValue873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__ValueAssignment_0_in_rule__Modifier__Alternatives909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__ValueAssignment_1_in_rule__Modifier__Alternatives927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__ValueAssignment_2_in_rule__Modifier__Alternatives945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__ValueAssignment_3_in_rule__Modifier__Alternatives963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__ValueAssignment_4_in_rule__Modifier__Alternatives981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__ValueAssignment_5_in_rule__Modifier__Alternatives999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElementHolder__ElementAssignment_0_in_rule__ParameterElementHolder__Alternatives1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterElementHolder__ElementAssignment_1_in_rule__ParameterElementHolder__Alternatives1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterType__ValueAssignment_0_in_rule__ParameterType__Alternatives1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterType__ValueAssignment_1_in_rule__ParameterType__Alternatives1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__TypeFieldValue__Alternatives1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_rule__TypeFieldValue__Alternatives1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPatternDefinition__Group__0__Impl_in_rule__MethodPatternDefinition__Group__01184 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__MethodPatternDefinition__Group__1_in_rule__MethodPatternDefinition__Group__01187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPatternDefinition__ModifierDefinitionAssignment_0_in_rule__MethodPatternDefinition__Group__0__Impl1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPatternDefinition__Group__1__Impl_in_rule__MethodPatternDefinition__Group__11244 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MethodPatternDefinition__Group__2_in_rule__MethodPatternDefinition__Group__11247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPatternDefinition__ReturnTypeAssignment_1_in_rule__MethodPatternDefinition__Group__1__Impl1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPatternDefinition__Group__2__Impl_in_rule__MethodPatternDefinition__Group__21304 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_rule__MethodPatternDefinition__Group__3_in_rule__MethodPatternDefinition__Group__21307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPatternDefinition__MethodNameAssignment_2_in_rule__MethodPatternDefinition__Group__2__Impl1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPatternDefinition__Group__3__Impl_in_rule__MethodPatternDefinition__Group__31364 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_rule__MethodPatternDefinition__Group__4_in_rule__MethodPatternDefinition__Group__31367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPatternDefinition__ParameterDefinitionAssignment_3_in_rule__MethodPatternDefinition__Group__3__Impl1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPatternDefinition__Group__4__Impl_in_rule__MethodPatternDefinition__Group__41425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodPatternDefinition__ThrowsClauseAssignment_4_in_rule__MethodPatternDefinition__Group__4__Impl1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDefinition__Group__0__Impl_in_rule__ParameterDefinition__Group__01493 = new BitSet(new long[]{0x0000000004011010L});
    public static final BitSet FOLLOW_rule__ParameterDefinition__Group__1_in_rule__ParameterDefinition__Group__01496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ParameterDefinition__Group__0__Impl1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDefinition__Group__1__Impl_in_rule__ParameterDefinition__Group__11555 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__ParameterDefinition__Group__2_in_rule__ParameterDefinition__Group__11558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDefinition__ParameterElementholderAssignment_1_in_rule__ParameterDefinition__Group__1__Impl1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDefinition__Group__2__Impl_in_rule__ParameterDefinition__Group__21615 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__ParameterDefinition__Group__3_in_rule__ParameterDefinition__Group__21618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDefinition__Group_2__0_in_rule__ParameterDefinition__Group__2__Impl1645 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__ParameterDefinition__Group__3__Impl_in_rule__ParameterDefinition__Group__31676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ParameterDefinition__Group__3__Impl1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDefinition__Group_2__0__Impl_in_rule__ParameterDefinition__Group_2__01743 = new BitSet(new long[]{0x0000000004011010L});
    public static final BitSet FOLLOW_rule__ParameterDefinition__Group_2__1_in_rule__ParameterDefinition__Group_2__01746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ParameterDefinition__Group_2__0__Impl1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDefinition__Group_2__1__Impl_in_rule__ParameterDefinition__Group_2__11805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDefinition__ParameterElementholderAssignment_2_1_in_rule__ParameterDefinition__Group_2__1__Impl1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifierDefinition__Group__0__Impl_in_rule__ModifierDefinition__Group__01866 = new BitSet(new long[]{0x0000000003F00000L});
    public static final BitSet FOLLOW_rule__ModifierDefinition__Group__1_in_rule__ModifierDefinition__Group__01869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifierDefinition__Group__1__Impl_in_rule__ModifierDefinition__Group__11927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifierDefinition__ModifiersAssignment_1_in_rule__ModifierDefinition__Group__1__Impl1954 = new BitSet(new long[]{0x0000000003F00002L});
    public static final BitSet FOLLOW_rule__MultiElement__Group__0__Impl_in_rule__MultiElement__Group__01989 = new BitSet(new long[]{0x0000000004001010L});
    public static final BitSet FOLLOW_rule__MultiElement__Group__1_in_rule__MultiElement__Group__01992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__MultiElement__Group__0__Impl2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiElement__Group__1__Impl_in_rule__MultiElement__Group__12051 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__MultiElement__Group__2_in_rule__MultiElement__Group__12054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiElement__ElementsAssignment_1_in_rule__MultiElement__Group__1__Impl2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiElement__Group__2__Impl_in_rule__MultiElement__Group__22111 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__MultiElement__Group__3_in_rule__MultiElement__Group__22114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiElement__Group_2__0_in_rule__MultiElement__Group__2__Impl2141 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__MultiElement__Group__3__Impl_in_rule__MultiElement__Group__32172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MultiElement__Group__3__Impl2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiElement__Group_2__0__Impl_in_rule__MultiElement__Group_2__02239 = new BitSet(new long[]{0x0000000004001010L});
    public static final BitSet FOLLOW_rule__MultiElement__Group_2__1_in_rule__MultiElement__Group_2__02242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MultiElement__Group_2__0__Impl2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiElement__Group_2__1__Impl_in_rule__MultiElement__Group_2__12301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiElement__ElementsAssignment_2_1_in_rule__MultiElement__Group_2__1__Impl2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Throws__Group__0__Impl_in_rule__Throws__Group__02362 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__Throws__Group__1_in_rule__Throws__Group__02365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Throws__Group__0__Impl2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Throws__Group__1__Impl_in_rule__Throws__Group__12424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Throws__ValueAssignment_1_in_rule__Throws__Group__1__Impl2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodPatternDefinition_in_rule__MethodPattern__DefinitionAssignment2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierDefinition_in_rule__MethodPatternDefinition__ModifierDefinitionAssignment_02521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnType_in_rule__MethodPatternDefinition__ReturnTypeAssignment_12552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodName_in_rule__MethodPatternDefinition__MethodNameAssignment_22583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDefinition_in_rule__MethodPatternDefinition__ParameterDefinitionAssignment_32614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThrows_in_rule__MethodPatternDefinition__ThrowsClauseAssignment_42645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterElementHolder_in_rule__ParameterDefinition__ParameterElementholderAssignment_12676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterElementHolder_in_rule__ParameterDefinition__ParameterElementholderAssignment_2_12707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__ModifierDefinition__ModifiersAssignment_12738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Modifier__ValueAssignment_02774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Modifier__ValueAssignment_12818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Modifier__ValueAssignment_22862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Modifier__ValueAssignment_32906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Modifier__ValueAssignment_42950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Modifier__ValueAssignment_52994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFieldValue_in_rule__ReturnType__ValueAssignment3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleElement_in_rule__ParameterElementHolder__ElementAssignment_03064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiElement_in_rule__ParameterElementHolder__ElementAssignment_13095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterType_in_rule__SingleElement__ValueAssignment3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleElement_in_rule__MultiElement__ElementsAssignment_13157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleElement_in_rule__MultiElement__ElementsAssignment_2_13188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFieldValue_in_rule__ParameterType__ValueAssignment_03219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ParameterType__ValueAssignment_13255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFieldValue_in_rule__Throws__ValueAssignment_13294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFieldValue_in_rule__MethodName__ValueAssignment3325 = new BitSet(new long[]{0x0000000000000002L});

}