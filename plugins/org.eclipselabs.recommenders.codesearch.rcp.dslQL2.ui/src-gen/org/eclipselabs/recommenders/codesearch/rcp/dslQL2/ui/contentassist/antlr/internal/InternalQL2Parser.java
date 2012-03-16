package org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui.contentassist.antlr.internal; 

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
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.services.QL2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalQL2Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAME", "RULE_NAMEWITHWC", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'('", "')'", "','", "'val'", "'var'", "'call'", "'='", "'*'", "'.'", "'()'"
    };
    public static final int RULE_ID=6;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_NAMEWITHWC=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__19=19;
    public static final int RULE_STRING=8;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int RULE_NAME=4;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalQL2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQL2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQL2Parser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g"; }


     
     	private QL2GrammarAccess grammarAccess;
     	
        public void setGrammarAccess(QL2GrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:62:1: ( ruleModel EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:63:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel67);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:70:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:74:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:75:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:75:1: ( ( rule__Model__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:76:1: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:77:1: ( rule__Model__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:77:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel100);
            rule__Model__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatement"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:89:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:90:1: ( ruleStatement EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:91:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement127);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:98:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:102:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:103:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:103:1: ( ( rule__Statement__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:104:1: ( rule__Statement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:105:1: ( rule__Statement__Alternatives )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:105:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement160);
            rule__Statement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleVarDeclaration"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:117:1: entryRuleVarDeclaration : ruleVarDeclaration EOF ;
    public final void entryRuleVarDeclaration() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:118:1: ( ruleVarDeclaration EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:119:1: ruleVarDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVarDeclaration_in_entryRuleVarDeclaration187);
            ruleVarDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDeclaration194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:126:1: ruleVarDeclaration : ( ( rule__VarDeclaration__Group__0 ) ) ;
    public final void ruleVarDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:130:2: ( ( ( rule__VarDeclaration__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:131:1: ( ( rule__VarDeclaration__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:131:1: ( ( rule__VarDeclaration__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:132:1: ( rule__VarDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getGroup()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:133:1: ( rule__VarDeclaration__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:133:2: rule__VarDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__VarDeclaration__Group__0_in_ruleVarDeclaration220);
            rule__VarDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "entryRuleVarInitialisation"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:145:1: entryRuleVarInitialisation : ruleVarInitialisation EOF ;
    public final void entryRuleVarInitialisation() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:146:1: ( ruleVarInitialisation EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:147:1: ruleVarInitialisation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInitialisationRule()); 
            }
            pushFollow(FOLLOW_ruleVarInitialisation_in_entryRuleVarInitialisation247);
            ruleVarInitialisation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarInitialisationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarInitialisation254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVarInitialisation"


    // $ANTLR start "ruleVarInitialisation"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:154:1: ruleVarInitialisation : ( ( rule__VarInitialisation__Group__0 ) ) ;
    public final void ruleVarInitialisation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:158:2: ( ( ( rule__VarInitialisation__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:159:1: ( ( rule__VarInitialisation__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:159:1: ( ( rule__VarInitialisation__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:160:1: ( rule__VarInitialisation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInitialisationAccess().getGroup()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:161:1: ( rule__VarInitialisation__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:161:2: rule__VarInitialisation__Group__0
            {
            pushFollow(FOLLOW_rule__VarInitialisation__Group__0_in_ruleVarInitialisation280);
            rule__VarInitialisation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarInitialisationAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleVarInitialisation"


    // $ANTLR start "entryRuleVarDeclarationParam"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:173:1: entryRuleVarDeclarationParam : ruleVarDeclarationParam EOF ;
    public final void entryRuleVarDeclarationParam() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:174:1: ( ruleVarDeclarationParam EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:175:1: ruleVarDeclarationParam EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationParamRule()); 
            }
            pushFollow(FOLLOW_ruleVarDeclarationParam_in_entryRuleVarDeclarationParam307);
            ruleVarDeclarationParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationParamRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDeclarationParam314); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVarDeclarationParam"


    // $ANTLR start "ruleVarDeclarationParam"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:182:1: ruleVarDeclarationParam : ( ( rule__VarDeclarationParam__Group__0 ) ) ;
    public final void ruleVarDeclarationParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:186:2: ( ( ( rule__VarDeclarationParam__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:187:1: ( ( rule__VarDeclarationParam__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:187:1: ( ( rule__VarDeclarationParam__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:188:1: ( rule__VarDeclarationParam__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationParamAccess().getGroup()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:189:1: ( rule__VarDeclarationParam__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:189:2: rule__VarDeclarationParam__Group__0
            {
            pushFollow(FOLLOW_rule__VarDeclarationParam__Group__0_in_ruleVarDeclarationParam340);
            rule__VarDeclarationParam__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationParamAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleVarDeclarationParam"


    // $ANTLR start "entryRuleMethodCall"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:201:1: entryRuleMethodCall : ruleMethodCall EOF ;
    public final void entryRuleMethodCall() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:202:1: ( ruleMethodCall EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:203:1: ruleMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallRule()); 
            }
            pushFollow(FOLLOW_ruleMethodCall_in_entryRuleMethodCall367);
            ruleMethodCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodCall374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMethodCall"


    // $ANTLR start "ruleMethodCall"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:210:1: ruleMethodCall : ( ( rule__MethodCall__Group__0 ) ) ;
    public final void ruleMethodCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:214:2: ( ( ( rule__MethodCall__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:215:1: ( ( rule__MethodCall__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:215:1: ( ( rule__MethodCall__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:216:1: ( rule__MethodCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getGroup()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:217:1: ( rule__MethodCall__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:217:2: rule__MethodCall__Group__0
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__0_in_ruleMethodCall400);
            rule__MethodCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleMethodCall"


    // $ANTLR start "rule__Statement__Alternatives"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:229:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:233:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) )
            int alt1=3;
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
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:234:1: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:234:1: ( ( rule__Statement__Group_0__0 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:235:1: ( rule__Statement__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_0()); 
                    }
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:236:1: ( rule__Statement__Group_0__0 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:236:2: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Alternatives436);
                    rule__Statement__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:240:6: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:240:6: ( ( rule__Statement__Group_1__0 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:241:1: ( rule__Statement__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_1()); 
                    }
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:242:1: ( rule__Statement__Group_1__0 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:242:2: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives454);
                    rule__Statement__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:246:6: ( ( rule__Statement__Group_2__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:246:6: ( ( rule__Statement__Group_2__0 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:247:1: ( rule__Statement__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_2()); 
                    }
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:248:1: ( rule__Statement__Group_2__0 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:248:2: rule__Statement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_2__0_in_rule__Statement__Alternatives472);
                    rule__Statement__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_2()); 
                    }

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:259:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:263:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:264:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0503);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0506);
            rule__Model__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:271:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:275:1: ( ( () ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:276:1: ( () )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:276:1: ( () )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:277:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getModelAction_0()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:278:1: ()
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:280:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getModelAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:290:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:294:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:295:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1564);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1567);
            rule__Model__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:302:1: rule__Model__Group__1__Impl : ( ( rule__Model__Group_1__0 )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:306:1: ( ( ( rule__Model__Group_1__0 )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:307:1: ( ( rule__Model__Group_1__0 )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:307:1: ( ( rule__Model__Group_1__0 )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:308:1: ( rule__Model__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:309:1: ( rule__Model__Group_1__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:309:2: rule__Model__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_1__0_in_rule__Model__Group__1__Impl594);
                    rule__Model__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:319:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:323:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:324:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2625);
            rule__Model__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2628);
            rule__Model__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:331:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:335:1: ( ( '{' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:336:1: ( '{' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:336:1: ( '{' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:337:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,13,FOLLOW_13_in_rule__Model__Group__2__Impl656); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            }

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:350:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:354:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:355:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3687);
            rule__Model__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3690);
            rule__Model__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:362:1: rule__Model__Group__3__Impl : ( ( rule__Model__StatementsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:366:1: ( ( ( rule__Model__StatementsAssignment_3 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:367:1: ( ( rule__Model__StatementsAssignment_3 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:367:1: ( ( rule__Model__StatementsAssignment_3 )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:368:1: ( rule__Model__StatementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getStatementsAssignment_3()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:369:1: ( rule__Model__StatementsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=18 && LA3_0<=20)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:369:2: rule__Model__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__StatementsAssignment_3_in_rule__Model__Group__3__Impl717);
            	    rule__Model__StatementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getStatementsAssignment_3()); 
            }

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:379:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:383:1: ( rule__Model__Group__4__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:384:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4748);
            rule__Model__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:390:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:394:1: ( ( '}' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:395:1: ( '}' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:395:1: ( '}' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:396:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,14,FOLLOW_14_in_rule__Model__Group__4__Impl776); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            }

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group_1__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:419:1: rule__Model__Group_1__0 : rule__Model__Group_1__0__Impl rule__Model__Group_1__1 ;
    public final void rule__Model__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:423:1: ( rule__Model__Group_1__0__Impl rule__Model__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:424:2: rule__Model__Group_1__0__Impl rule__Model__Group_1__1
            {
            pushFollow(FOLLOW_rule__Model__Group_1__0__Impl_in_rule__Model__Group_1__0817);
            rule__Model__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_1__1_in_rule__Model__Group_1__0820);
            rule__Model__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1__0"


    // $ANTLR start "rule__Model__Group_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:431:1: rule__Model__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Model__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:435:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:436:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:436:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:437:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__Model__Group_1__0__Impl848); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getLeftParenthesisKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__Model__Group_1__0__Impl"


    // $ANTLR start "rule__Model__Group_1__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:450:1: rule__Model__Group_1__1 : rule__Model__Group_1__1__Impl rule__Model__Group_1__2 ;
    public final void rule__Model__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:454:1: ( rule__Model__Group_1__1__Impl rule__Model__Group_1__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:455:2: rule__Model__Group_1__1__Impl rule__Model__Group_1__2
            {
            pushFollow(FOLLOW_rule__Model__Group_1__1__Impl_in_rule__Model__Group_1__1879);
            rule__Model__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_1__2_in_rule__Model__Group_1__1882);
            rule__Model__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1__1"


    // $ANTLR start "rule__Model__Group_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:462:1: rule__Model__Group_1__1__Impl : ( ( rule__Model__VarsAssignment_1_1 ) ) ;
    public final void rule__Model__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:466:1: ( ( ( rule__Model__VarsAssignment_1_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:467:1: ( ( rule__Model__VarsAssignment_1_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:467:1: ( ( rule__Model__VarsAssignment_1_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:468:1: ( rule__Model__VarsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getVarsAssignment_1_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:469:1: ( rule__Model__VarsAssignment_1_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:469:2: rule__Model__VarsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Model__VarsAssignment_1_1_in_rule__Model__Group_1__1__Impl909);
            rule__Model__VarsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getVarsAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__Model__Group_1__1__Impl"


    // $ANTLR start "rule__Model__Group_1__2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:479:1: rule__Model__Group_1__2 : rule__Model__Group_1__2__Impl rule__Model__Group_1__3 ;
    public final void rule__Model__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:483:1: ( rule__Model__Group_1__2__Impl rule__Model__Group_1__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:484:2: rule__Model__Group_1__2__Impl rule__Model__Group_1__3
            {
            pushFollow(FOLLOW_rule__Model__Group_1__2__Impl_in_rule__Model__Group_1__2939);
            rule__Model__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_1__3_in_rule__Model__Group_1__2942);
            rule__Model__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1__2"


    // $ANTLR start "rule__Model__Group_1__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:491:1: rule__Model__Group_1__2__Impl : ( ( rule__Model__Group_1_2__0 )* ) ;
    public final void rule__Model__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:495:1: ( ( ( rule__Model__Group_1_2__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:496:1: ( ( rule__Model__Group_1_2__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:496:1: ( ( rule__Model__Group_1_2__0 )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:497:1: ( rule__Model__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup_1_2()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:498:1: ( rule__Model__Group_1_2__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:498:2: rule__Model__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Model__Group_1_2__0_in_rule__Model__Group_1__2__Impl969);
            	    rule__Model__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup_1_2()); 
            }

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
    // $ANTLR end "rule__Model__Group_1__2__Impl"


    // $ANTLR start "rule__Model__Group_1__3"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:508:1: rule__Model__Group_1__3 : rule__Model__Group_1__3__Impl ;
    public final void rule__Model__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:512:1: ( rule__Model__Group_1__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:513:2: rule__Model__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_1__3__Impl_in_rule__Model__Group_1__31000);
            rule__Model__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1__3"


    // $ANTLR start "rule__Model__Group_1__3__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:519:1: rule__Model__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Model__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:523:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:524:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:524:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:525:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRightParenthesisKeyword_1_3()); 
            }
            match(input,16,FOLLOW_16_in_rule__Model__Group_1__3__Impl1028); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getRightParenthesisKeyword_1_3()); 
            }

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
    // $ANTLR end "rule__Model__Group_1__3__Impl"


    // $ANTLR start "rule__Model__Group_1_2__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:546:1: rule__Model__Group_1_2__0 : rule__Model__Group_1_2__0__Impl rule__Model__Group_1_2__1 ;
    public final void rule__Model__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:550:1: ( rule__Model__Group_1_2__0__Impl rule__Model__Group_1_2__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:551:2: rule__Model__Group_1_2__0__Impl rule__Model__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Model__Group_1_2__0__Impl_in_rule__Model__Group_1_2__01067);
            rule__Model__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_1_2__1_in_rule__Model__Group_1_2__01070);
            rule__Model__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1_2__0"


    // $ANTLR start "rule__Model__Group_1_2__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:558:1: rule__Model__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:562:1: ( ( ',' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:563:1: ( ',' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:563:1: ( ',' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:564:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Model__Group_1_2__0__Impl1098); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getCommaKeyword_1_2_0()); 
            }

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
    // $ANTLR end "rule__Model__Group_1_2__0__Impl"


    // $ANTLR start "rule__Model__Group_1_2__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:577:1: rule__Model__Group_1_2__1 : rule__Model__Group_1_2__1__Impl ;
    public final void rule__Model__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:581:1: ( rule__Model__Group_1_2__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:582:2: rule__Model__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_1_2__1__Impl_in_rule__Model__Group_1_2__11129);
            rule__Model__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1_2__1"


    // $ANTLR start "rule__Model__Group_1_2__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:588:1: rule__Model__Group_1_2__1__Impl : ( ( rule__Model__VarsAssignment_1_2_1 ) ) ;
    public final void rule__Model__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:592:1: ( ( ( rule__Model__VarsAssignment_1_2_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:593:1: ( ( rule__Model__VarsAssignment_1_2_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:593:1: ( ( rule__Model__VarsAssignment_1_2_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:594:1: ( rule__Model__VarsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getVarsAssignment_1_2_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:595:1: ( rule__Model__VarsAssignment_1_2_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:595:2: rule__Model__VarsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__Model__VarsAssignment_1_2_1_in_rule__Model__Group_1_2__1__Impl1156);
            rule__Model__VarsAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getVarsAssignment_1_2_1()); 
            }

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
    // $ANTLR end "rule__Model__Group_1_2__1__Impl"


    // $ANTLR start "rule__Statement__Group_0__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:609:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:613:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:614:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__01190);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__01193);
            rule__Statement__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__0"


    // $ANTLR start "rule__Statement__Group_0__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:621:1: rule__Statement__Group_0__0__Impl : ( 'val' ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:625:1: ( ( 'val' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:626:1: ( 'val' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:626:1: ( 'val' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:627:1: 'val'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getValKeyword_0_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Statement__Group_0__0__Impl1221); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getValKeyword_0_0()); 
            }

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
    // $ANTLR end "rule__Statement__Group_0__0__Impl"


    // $ANTLR start "rule__Statement__Group_0__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:640:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:644:1: ( rule__Statement__Group_0__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:645:2: rule__Statement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__11252);
            rule__Statement__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__1"


    // $ANTLR start "rule__Statement__Group_0__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:651:1: rule__Statement__Group_0__1__Impl : ( ruleVarDeclaration ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:655:1: ( ( ruleVarDeclaration ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:656:1: ( ruleVarDeclaration )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:656:1: ( ruleVarDeclaration )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:657:1: ruleVarDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getVarDeclarationParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleVarDeclaration_in_rule__Statement__Group_0__1__Impl1279);
            ruleVarDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getVarDeclarationParserRuleCall_0_1()); 
            }

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
    // $ANTLR end "rule__Statement__Group_0__1__Impl"


    // $ANTLR start "rule__Statement__Group_1__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:672:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:676:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:677:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__01312);
            rule__Statement__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__01315);
            rule__Statement__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__0"


    // $ANTLR start "rule__Statement__Group_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:684:1: rule__Statement__Group_1__0__Impl : ( 'var' ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:688:1: ( ( 'var' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:689:1: ( 'var' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:689:1: ( 'var' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:690:1: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getVarKeyword_1_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Statement__Group_1__0__Impl1343); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getVarKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__Statement__Group_1__0__Impl"


    // $ANTLR start "rule__Statement__Group_1__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:703:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:707:1: ( rule__Statement__Group_1__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:708:2: rule__Statement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__11374);
            rule__Statement__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__1"


    // $ANTLR start "rule__Statement__Group_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:714:1: rule__Statement__Group_1__1__Impl : ( ruleVarInitialisation ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:718:1: ( ( ruleVarInitialisation ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:719:1: ( ruleVarInitialisation )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:719:1: ( ruleVarInitialisation )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:720:1: ruleVarInitialisation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getVarInitialisationParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleVarInitialisation_in_rule__Statement__Group_1__1__Impl1401);
            ruleVarInitialisation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getVarInitialisationParserRuleCall_1_1()); 
            }

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
    // $ANTLR end "rule__Statement__Group_1__1__Impl"


    // $ANTLR start "rule__Statement__Group_2__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:735:1: rule__Statement__Group_2__0 : rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 ;
    public final void rule__Statement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:739:1: ( rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:740:2: rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__0__Impl_in_rule__Statement__Group_2__01434);
            rule__Statement__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_2__1_in_rule__Statement__Group_2__01437);
            rule__Statement__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__0"


    // $ANTLR start "rule__Statement__Group_2__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:747:1: rule__Statement__Group_2__0__Impl : ( 'call' ) ;
    public final void rule__Statement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:751:1: ( ( 'call' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:752:1: ( 'call' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:752:1: ( 'call' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:753:1: 'call'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getCallKeyword_2_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Statement__Group_2__0__Impl1465); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getCallKeyword_2_0()); 
            }

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
    // $ANTLR end "rule__Statement__Group_2__0__Impl"


    // $ANTLR start "rule__Statement__Group_2__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:766:1: rule__Statement__Group_2__1 : rule__Statement__Group_2__1__Impl ;
    public final void rule__Statement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:770:1: ( rule__Statement__Group_2__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:771:2: rule__Statement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__1__Impl_in_rule__Statement__Group_2__11496);
            rule__Statement__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__1"


    // $ANTLR start "rule__Statement__Group_2__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:777:1: rule__Statement__Group_2__1__Impl : ( ruleMethodCall ) ;
    public final void rule__Statement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:781:1: ( ( ruleMethodCall ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:782:1: ( ruleMethodCall )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:782:1: ( ruleMethodCall )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:783:1: ruleMethodCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getMethodCallParserRuleCall_2_1()); 
            }
            pushFollow(FOLLOW_ruleMethodCall_in_rule__Statement__Group_2__1__Impl1523);
            ruleMethodCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getMethodCallParserRuleCall_2_1()); 
            }

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
    // $ANTLR end "rule__Statement__Group_2__1__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:798:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:802:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:803:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__VarDeclaration__Group__0__Impl_in_rule__VarDeclaration__Group__01556);
            rule__VarDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarDeclaration__Group__1_in_rule__VarDeclaration__Group__01559);
            rule__VarDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__0"


    // $ANTLR start "rule__VarDeclaration__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:810:1: rule__VarDeclaration__Group__0__Impl : ( ( rule__VarDeclaration__TypeAssignment_0 ) ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:814:1: ( ( ( rule__VarDeclaration__TypeAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:815:1: ( ( rule__VarDeclaration__TypeAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:815:1: ( ( rule__VarDeclaration__TypeAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:816:1: ( rule__VarDeclaration__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getTypeAssignment_0()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:817:1: ( rule__VarDeclaration__TypeAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:817:2: rule__VarDeclaration__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__VarDeclaration__TypeAssignment_0_in_rule__VarDeclaration__Group__0__Impl1586);
            rule__VarDeclaration__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationAccess().getTypeAssignment_0()); 
            }

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
    // $ANTLR end "rule__VarDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:827:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:831:1: ( rule__VarDeclaration__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:832:2: rule__VarDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VarDeclaration__Group__1__Impl_in_rule__VarDeclaration__Group__11616);
            rule__VarDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__1"


    // $ANTLR start "rule__VarDeclaration__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:838:1: rule__VarDeclaration__Group__1__Impl : ( ( rule__VarDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:842:1: ( ( ( rule__VarDeclaration__NameAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:843:1: ( ( rule__VarDeclaration__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:843:1: ( ( rule__VarDeclaration__NameAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:844:1: ( rule__VarDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getNameAssignment_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:845:1: ( rule__VarDeclaration__NameAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:845:2: rule__VarDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VarDeclaration__NameAssignment_1_in_rule__VarDeclaration__Group__1__Impl1643);
            rule__VarDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationAccess().getNameAssignment_1()); 
            }

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
    // $ANTLR end "rule__VarDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VarInitialisation__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:859:1: rule__VarInitialisation__Group__0 : rule__VarInitialisation__Group__0__Impl rule__VarInitialisation__Group__1 ;
    public final void rule__VarInitialisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:863:1: ( rule__VarInitialisation__Group__0__Impl rule__VarInitialisation__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:864:2: rule__VarInitialisation__Group__0__Impl rule__VarInitialisation__Group__1
            {
            pushFollow(FOLLOW_rule__VarInitialisation__Group__0__Impl_in_rule__VarInitialisation__Group__01677);
            rule__VarInitialisation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarInitialisation__Group__1_in_rule__VarInitialisation__Group__01680);
            rule__VarInitialisation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarInitialisation__Group__0"


    // $ANTLR start "rule__VarInitialisation__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:871:1: rule__VarInitialisation__Group__0__Impl : ( ( rule__VarInitialisation__TypeAssignment_0 ) ) ;
    public final void rule__VarInitialisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:875:1: ( ( ( rule__VarInitialisation__TypeAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:876:1: ( ( rule__VarInitialisation__TypeAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:876:1: ( ( rule__VarInitialisation__TypeAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:877:1: ( rule__VarInitialisation__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInitialisationAccess().getTypeAssignment_0()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:878:1: ( rule__VarInitialisation__TypeAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:878:2: rule__VarInitialisation__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__VarInitialisation__TypeAssignment_0_in_rule__VarInitialisation__Group__0__Impl1707);
            rule__VarInitialisation__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarInitialisationAccess().getTypeAssignment_0()); 
            }

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
    // $ANTLR end "rule__VarInitialisation__Group__0__Impl"


    // $ANTLR start "rule__VarInitialisation__Group__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:888:1: rule__VarInitialisation__Group__1 : rule__VarInitialisation__Group__1__Impl rule__VarInitialisation__Group__2 ;
    public final void rule__VarInitialisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:892:1: ( rule__VarInitialisation__Group__1__Impl rule__VarInitialisation__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:893:2: rule__VarInitialisation__Group__1__Impl rule__VarInitialisation__Group__2
            {
            pushFollow(FOLLOW_rule__VarInitialisation__Group__1__Impl_in_rule__VarInitialisation__Group__11737);
            rule__VarInitialisation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarInitialisation__Group__2_in_rule__VarInitialisation__Group__11740);
            rule__VarInitialisation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarInitialisation__Group__1"


    // $ANTLR start "rule__VarInitialisation__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:900:1: rule__VarInitialisation__Group__1__Impl : ( ( rule__VarInitialisation__NameAssignment_1 ) ) ;
    public final void rule__VarInitialisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:904:1: ( ( ( rule__VarInitialisation__NameAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:905:1: ( ( rule__VarInitialisation__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:905:1: ( ( rule__VarInitialisation__NameAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:906:1: ( rule__VarInitialisation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInitialisationAccess().getNameAssignment_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:907:1: ( rule__VarInitialisation__NameAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:907:2: rule__VarInitialisation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VarInitialisation__NameAssignment_1_in_rule__VarInitialisation__Group__1__Impl1767);
            rule__VarInitialisation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarInitialisationAccess().getNameAssignment_1()); 
            }

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
    // $ANTLR end "rule__VarInitialisation__Group__1__Impl"


    // $ANTLR start "rule__VarInitialisation__Group__2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:917:1: rule__VarInitialisation__Group__2 : rule__VarInitialisation__Group__2__Impl rule__VarInitialisation__Group__3 ;
    public final void rule__VarInitialisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:921:1: ( rule__VarInitialisation__Group__2__Impl rule__VarInitialisation__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:922:2: rule__VarInitialisation__Group__2__Impl rule__VarInitialisation__Group__3
            {
            pushFollow(FOLLOW_rule__VarInitialisation__Group__2__Impl_in_rule__VarInitialisation__Group__21797);
            rule__VarInitialisation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarInitialisation__Group__3_in_rule__VarInitialisation__Group__21800);
            rule__VarInitialisation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarInitialisation__Group__2"


    // $ANTLR start "rule__VarInitialisation__Group__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:929:1: rule__VarInitialisation__Group__2__Impl : ( '=' ) ;
    public final void rule__VarInitialisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:933:1: ( ( '=' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:934:1: ( '=' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:934:1: ( '=' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:935:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInitialisationAccess().getEqualsSignKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__VarInitialisation__Group__2__Impl1828); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarInitialisationAccess().getEqualsSignKeyword_2()); 
            }

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
    // $ANTLR end "rule__VarInitialisation__Group__2__Impl"


    // $ANTLR start "rule__VarInitialisation__Group__3"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:948:1: rule__VarInitialisation__Group__3 : rule__VarInitialisation__Group__3__Impl ;
    public final void rule__VarInitialisation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:952:1: ( rule__VarInitialisation__Group__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:953:2: rule__VarInitialisation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VarInitialisation__Group__3__Impl_in_rule__VarInitialisation__Group__31859);
            rule__VarInitialisation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarInitialisation__Group__3"


    // $ANTLR start "rule__VarInitialisation__Group__3__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:959:1: rule__VarInitialisation__Group__3__Impl : ( '*' ) ;
    public final void rule__VarInitialisation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:963:1: ( ( '*' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:964:1: ( '*' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:964:1: ( '*' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:965:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInitialisationAccess().getAsteriskKeyword_3()); 
            }
            match(input,22,FOLLOW_22_in_rule__VarInitialisation__Group__3__Impl1887); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarInitialisationAccess().getAsteriskKeyword_3()); 
            }

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
    // $ANTLR end "rule__VarInitialisation__Group__3__Impl"


    // $ANTLR start "rule__VarDeclarationParam__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:986:1: rule__VarDeclarationParam__Group__0 : rule__VarDeclarationParam__Group__0__Impl rule__VarDeclarationParam__Group__1 ;
    public final void rule__VarDeclarationParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:990:1: ( rule__VarDeclarationParam__Group__0__Impl rule__VarDeclarationParam__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:991:2: rule__VarDeclarationParam__Group__0__Impl rule__VarDeclarationParam__Group__1
            {
            pushFollow(FOLLOW_rule__VarDeclarationParam__Group__0__Impl_in_rule__VarDeclarationParam__Group__01926);
            rule__VarDeclarationParam__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarDeclarationParam__Group__1_in_rule__VarDeclarationParam__Group__01929);
            rule__VarDeclarationParam__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclarationParam__Group__0"


    // $ANTLR start "rule__VarDeclarationParam__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:998:1: rule__VarDeclarationParam__Group__0__Impl : ( ( rule__VarDeclarationParam__TypeAssignment_0 ) ) ;
    public final void rule__VarDeclarationParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1002:1: ( ( ( rule__VarDeclarationParam__TypeAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1003:1: ( ( rule__VarDeclarationParam__TypeAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1003:1: ( ( rule__VarDeclarationParam__TypeAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1004:1: ( rule__VarDeclarationParam__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationParamAccess().getTypeAssignment_0()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1005:1: ( rule__VarDeclarationParam__TypeAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1005:2: rule__VarDeclarationParam__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__VarDeclarationParam__TypeAssignment_0_in_rule__VarDeclarationParam__Group__0__Impl1956);
            rule__VarDeclarationParam__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationParamAccess().getTypeAssignment_0()); 
            }

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
    // $ANTLR end "rule__VarDeclarationParam__Group__0__Impl"


    // $ANTLR start "rule__VarDeclarationParam__Group__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1015:1: rule__VarDeclarationParam__Group__1 : rule__VarDeclarationParam__Group__1__Impl ;
    public final void rule__VarDeclarationParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1019:1: ( rule__VarDeclarationParam__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1020:2: rule__VarDeclarationParam__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VarDeclarationParam__Group__1__Impl_in_rule__VarDeclarationParam__Group__11986);
            rule__VarDeclarationParam__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclarationParam__Group__1"


    // $ANTLR start "rule__VarDeclarationParam__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1026:1: rule__VarDeclarationParam__Group__1__Impl : ( ( rule__VarDeclarationParam__NameAssignment_1 ) ) ;
    public final void rule__VarDeclarationParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1030:1: ( ( ( rule__VarDeclarationParam__NameAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1031:1: ( ( rule__VarDeclarationParam__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1031:1: ( ( rule__VarDeclarationParam__NameAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1032:1: ( rule__VarDeclarationParam__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationParamAccess().getNameAssignment_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1033:1: ( rule__VarDeclarationParam__NameAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1033:2: rule__VarDeclarationParam__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VarDeclarationParam__NameAssignment_1_in_rule__VarDeclarationParam__Group__1__Impl2013);
            rule__VarDeclarationParam__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationParamAccess().getNameAssignment_1()); 
            }

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
    // $ANTLR end "rule__VarDeclarationParam__Group__1__Impl"


    // $ANTLR start "rule__MethodCall__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1047:1: rule__MethodCall__Group__0 : rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 ;
    public final void rule__MethodCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1051:1: ( rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1052:2: rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__0__Impl_in_rule__MethodCall__Group__02047);
            rule__MethodCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MethodCall__Group__1_in_rule__MethodCall__Group__02050);
            rule__MethodCall__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__0"


    // $ANTLR start "rule__MethodCall__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1059:1: rule__MethodCall__Group__0__Impl : ( ( rule__MethodCall__NameAssignment_0 ) ) ;
    public final void rule__MethodCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1063:1: ( ( ( rule__MethodCall__NameAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1064:1: ( ( rule__MethodCall__NameAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1064:1: ( ( rule__MethodCall__NameAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1065:1: ( rule__MethodCall__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getNameAssignment_0()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1066:1: ( rule__MethodCall__NameAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1066:2: rule__MethodCall__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__MethodCall__NameAssignment_0_in_rule__MethodCall__Group__0__Impl2077);
            rule__MethodCall__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getNameAssignment_0()); 
            }

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
    // $ANTLR end "rule__MethodCall__Group__0__Impl"


    // $ANTLR start "rule__MethodCall__Group__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1076:1: rule__MethodCall__Group__1 : rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2 ;
    public final void rule__MethodCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1080:1: ( rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1081:2: rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__1__Impl_in_rule__MethodCall__Group__12107);
            rule__MethodCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MethodCall__Group__2_in_rule__MethodCall__Group__12110);
            rule__MethodCall__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__1"


    // $ANTLR start "rule__MethodCall__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1088:1: rule__MethodCall__Group__1__Impl : ( '.' ) ;
    public final void rule__MethodCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1092:1: ( ( '.' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1093:1: ( '.' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1093:1: ( '.' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1094:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getFullStopKeyword_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__MethodCall__Group__1__Impl2138); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getFullStopKeyword_1()); 
            }

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
    // $ANTLR end "rule__MethodCall__Group__1__Impl"


    // $ANTLR start "rule__MethodCall__Group__2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1107:1: rule__MethodCall__Group__2 : rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3 ;
    public final void rule__MethodCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1111:1: ( rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1112:2: rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__2__Impl_in_rule__MethodCall__Group__22169);
            rule__MethodCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MethodCall__Group__3_in_rule__MethodCall__Group__22172);
            rule__MethodCall__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__2"


    // $ANTLR start "rule__MethodCall__Group__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1119:1: rule__MethodCall__Group__2__Impl : ( ( rule__MethodCall__MethodAssignment_2 ) ) ;
    public final void rule__MethodCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1123:1: ( ( ( rule__MethodCall__MethodAssignment_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1124:1: ( ( rule__MethodCall__MethodAssignment_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1124:1: ( ( rule__MethodCall__MethodAssignment_2 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1125:1: ( rule__MethodCall__MethodAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getMethodAssignment_2()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1126:1: ( rule__MethodCall__MethodAssignment_2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1126:2: rule__MethodCall__MethodAssignment_2
            {
            pushFollow(FOLLOW_rule__MethodCall__MethodAssignment_2_in_rule__MethodCall__Group__2__Impl2199);
            rule__MethodCall__MethodAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getMethodAssignment_2()); 
            }

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
    // $ANTLR end "rule__MethodCall__Group__2__Impl"


    // $ANTLR start "rule__MethodCall__Group__3"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1136:1: rule__MethodCall__Group__3 : rule__MethodCall__Group__3__Impl ;
    public final void rule__MethodCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1140:1: ( rule__MethodCall__Group__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1141:2: rule__MethodCall__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__3__Impl_in_rule__MethodCall__Group__32229);
            rule__MethodCall__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__3"


    // $ANTLR start "rule__MethodCall__Group__3__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1147:1: rule__MethodCall__Group__3__Impl : ( '()' ) ;
    public final void rule__MethodCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1151:1: ( ( '()' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1152:1: ( '()' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1152:1: ( '()' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1153:1: '()'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getLeftParenthesisRightParenthesisKeyword_3()); 
            }
            match(input,24,FOLLOW_24_in_rule__MethodCall__Group__3__Impl2257); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getLeftParenthesisRightParenthesisKeyword_3()); 
            }

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
    // $ANTLR end "rule__MethodCall__Group__3__Impl"


    // $ANTLR start "rule__Model__VarsAssignment_1_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1175:1: rule__Model__VarsAssignment_1_1 : ( ruleVarDeclarationParam ) ;
    public final void rule__Model__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1179:1: ( ( ruleVarDeclarationParam ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1180:1: ( ruleVarDeclarationParam )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1180:1: ( ruleVarDeclarationParam )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1181:1: ruleVarDeclarationParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getVarsVarDeclarationParamParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleVarDeclarationParam_in_rule__Model__VarsAssignment_1_12301);
            ruleVarDeclarationParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getVarsVarDeclarationParamParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__Model__VarsAssignment_1_1"


    // $ANTLR start "rule__Model__VarsAssignment_1_2_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1190:1: rule__Model__VarsAssignment_1_2_1 : ( ruleVarDeclarationParam ) ;
    public final void rule__Model__VarsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1194:1: ( ( ruleVarDeclarationParam ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1195:1: ( ruleVarDeclarationParam )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1195:1: ( ruleVarDeclarationParam )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1196:1: ruleVarDeclarationParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getVarsVarDeclarationParamParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleVarDeclarationParam_in_rule__Model__VarsAssignment_1_2_12332);
            ruleVarDeclarationParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getVarsVarDeclarationParamParserRuleCall_1_2_1_0()); 
            }

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
    // $ANTLR end "rule__Model__VarsAssignment_1_2_1"


    // $ANTLR start "rule__Model__StatementsAssignment_3"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1205:1: rule__Model__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1209:1: ( ( ruleStatement ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1210:1: ( ruleStatement )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1210:1: ( ruleStatement )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1211:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Model__StatementsAssignment_32363);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__Model__StatementsAssignment_3"


    // $ANTLR start "rule__VarDeclaration__TypeAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1220:1: rule__VarDeclaration__TypeAssignment_0 : ( RULE_NAME ) ;
    public final void rule__VarDeclaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1224:1: ( ( RULE_NAME ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1225:1: ( RULE_NAME )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1225:1: ( RULE_NAME )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1226:1: RULE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getTypeNameTerminalRuleCall_0_0()); 
            }
            match(input,RULE_NAME,FOLLOW_RULE_NAME_in_rule__VarDeclaration__TypeAssignment_02394); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationAccess().getTypeNameTerminalRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__VarDeclaration__TypeAssignment_0"


    // $ANTLR start "rule__VarDeclaration__NameAssignment_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1235:1: rule__VarDeclaration__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__VarDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1239:1: ( ( RULE_NAME ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1240:1: ( RULE_NAME )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1240:1: ( RULE_NAME )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1241:1: RULE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getNameNameTerminalRuleCall_1_0()); 
            }
            match(input,RULE_NAME,FOLLOW_RULE_NAME_in_rule__VarDeclaration__NameAssignment_12425); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationAccess().getNameNameTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__VarDeclaration__NameAssignment_1"


    // $ANTLR start "rule__VarInitialisation__TypeAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1250:1: rule__VarInitialisation__TypeAssignment_0 : ( RULE_NAME ) ;
    public final void rule__VarInitialisation__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1254:1: ( ( RULE_NAME ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1255:1: ( RULE_NAME )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1255:1: ( RULE_NAME )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1256:1: RULE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInitialisationAccess().getTypeNameTerminalRuleCall_0_0()); 
            }
            match(input,RULE_NAME,FOLLOW_RULE_NAME_in_rule__VarInitialisation__TypeAssignment_02456); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarInitialisationAccess().getTypeNameTerminalRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__VarInitialisation__TypeAssignment_0"


    // $ANTLR start "rule__VarInitialisation__NameAssignment_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1265:1: rule__VarInitialisation__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__VarInitialisation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1269:1: ( ( RULE_NAME ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1270:1: ( RULE_NAME )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1270:1: ( RULE_NAME )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1271:1: RULE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInitialisationAccess().getNameNameTerminalRuleCall_1_0()); 
            }
            match(input,RULE_NAME,FOLLOW_RULE_NAME_in_rule__VarInitialisation__NameAssignment_12487); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarInitialisationAccess().getNameNameTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__VarInitialisation__NameAssignment_1"


    // $ANTLR start "rule__VarDeclarationParam__TypeAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1280:1: rule__VarDeclarationParam__TypeAssignment_0 : ( RULE_NAME ) ;
    public final void rule__VarDeclarationParam__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1284:1: ( ( RULE_NAME ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1285:1: ( RULE_NAME )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1285:1: ( RULE_NAME )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1286:1: RULE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationParamAccess().getTypeNameTerminalRuleCall_0_0()); 
            }
            match(input,RULE_NAME,FOLLOW_RULE_NAME_in_rule__VarDeclarationParam__TypeAssignment_02518); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationParamAccess().getTypeNameTerminalRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__VarDeclarationParam__TypeAssignment_0"


    // $ANTLR start "rule__VarDeclarationParam__NameAssignment_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1295:1: rule__VarDeclarationParam__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__VarDeclarationParam__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1299:1: ( ( RULE_NAME ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1300:1: ( RULE_NAME )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1300:1: ( RULE_NAME )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1301:1: RULE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationParamAccess().getNameNameTerminalRuleCall_1_0()); 
            }
            match(input,RULE_NAME,FOLLOW_RULE_NAME_in_rule__VarDeclarationParam__NameAssignment_12549); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationParamAccess().getNameNameTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__VarDeclarationParam__NameAssignment_1"


    // $ANTLR start "rule__MethodCall__NameAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1310:1: rule__MethodCall__NameAssignment_0 : ( RULE_NAME ) ;
    public final void rule__MethodCall__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1314:1: ( ( RULE_NAME ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1315:1: ( RULE_NAME )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1315:1: ( RULE_NAME )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1316:1: RULE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getNameNameTerminalRuleCall_0_0()); 
            }
            match(input,RULE_NAME,FOLLOW_RULE_NAME_in_rule__MethodCall__NameAssignment_02580); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getNameNameTerminalRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__MethodCall__NameAssignment_0"


    // $ANTLR start "rule__MethodCall__MethodAssignment_2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1325:1: rule__MethodCall__MethodAssignment_2 : ( RULE_NAME ) ;
    public final void rule__MethodCall__MethodAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1329:1: ( ( RULE_NAME ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1330:1: ( RULE_NAME )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1330:1: ( RULE_NAME )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1331:1: RULE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getMethodNameTerminalRuleCall_2_0()); 
            }
            match(input,RULE_NAME,FOLLOW_RULE_NAME_in_rule__MethodCall__MethodAssignment_22611); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getMethodNameTerminalRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__MethodCall__MethodAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_entryRuleVarDeclaration187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDeclaration194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__Group__0_in_ruleVarDeclaration220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInitialisation_in_entryRuleVarInitialisation247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarInitialisation254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__0_in_ruleVarInitialisation280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclarationParam_in_entryRuleVarDeclarationParam307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDeclarationParam314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclarationParam__Group__0_in_ruleVarDeclarationParam340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodCall_in_entryRuleMethodCall367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodCall374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__0_in_ruleMethodCall400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Alternatives436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__0_in_rule__Statement__Alternatives472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0503 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1564 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__0_in_rule__Model__Group__1__Impl594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2625 = new BitSet(new long[]{0x00000000001C4000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Model__Group__2__Impl656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3687 = new BitSet(new long[]{0x00000000001C4000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__StatementsAssignment_3_in_rule__Model__Group__3__Impl717 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Model__Group__4__Impl776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__0__Impl_in_rule__Model__Group_1__0817 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group_1__1_in_rule__Model__Group_1__0820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Model__Group_1__0__Impl848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__1__Impl_in_rule__Model__Group_1__1879 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Model__Group_1__2_in_rule__Model__Group_1__1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__VarsAssignment_1_1_in_rule__Model__Group_1__1__Impl909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__2__Impl_in_rule__Model__Group_1__2939 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Model__Group_1__3_in_rule__Model__Group_1__2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1_2__0_in_rule__Model__Group_1__2__Impl969 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__3__Impl_in_rule__Model__Group_1__31000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Model__Group_1__3__Impl1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1_2__0__Impl_in_rule__Model__Group_1_2__01067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group_1_2__1_in_rule__Model__Group_1_2__01070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Model__Group_1_2__0__Impl1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1_2__1__Impl_in_rule__Model__Group_1_2__11129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__VarsAssignment_1_2_1_in_rule__Model__Group_1_2__1__Impl1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__01190 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__01193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Statement__Group_0__0__Impl1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__11252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_rule__Statement__Group_0__1__Impl1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__01312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__01315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Statement__Group_1__0__Impl1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__11374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInitialisation_in_rule__Statement__Group_1__1__Impl1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__0__Impl_in_rule__Statement__Group_2__01434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__1_in_rule__Statement__Group_2__01437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Statement__Group_2__0__Impl1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__1__Impl_in_rule__Statement__Group_2__11496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodCall_in_rule__Statement__Group_2__1__Impl1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__Group__0__Impl_in_rule__VarDeclaration__Group__01556 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarDeclaration__Group__1_in_rule__VarDeclaration__Group__01559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__TypeAssignment_0_in_rule__VarDeclaration__Group__0__Impl1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__Group__1__Impl_in_rule__VarDeclaration__Group__11616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__NameAssignment_1_in_rule__VarDeclaration__Group__1__Impl1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__0__Impl_in_rule__VarInitialisation__Group__01677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__1_in_rule__VarInitialisation__Group__01680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInitialisation__TypeAssignment_0_in_rule__VarInitialisation__Group__0__Impl1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__1__Impl_in_rule__VarInitialisation__Group__11737 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__2_in_rule__VarInitialisation__Group__11740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInitialisation__NameAssignment_1_in_rule__VarInitialisation__Group__1__Impl1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__2__Impl_in_rule__VarInitialisation__Group__21797 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__3_in_rule__VarInitialisation__Group__21800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__VarInitialisation__Group__2__Impl1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__3__Impl_in_rule__VarInitialisation__Group__31859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__VarInitialisation__Group__3__Impl1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclarationParam__Group__0__Impl_in_rule__VarDeclarationParam__Group__01926 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarDeclarationParam__Group__1_in_rule__VarDeclarationParam__Group__01929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclarationParam__TypeAssignment_0_in_rule__VarDeclarationParam__Group__0__Impl1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclarationParam__Group__1__Impl_in_rule__VarDeclarationParam__Group__11986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclarationParam__NameAssignment_1_in_rule__VarDeclarationParam__Group__1__Impl2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__0__Impl_in_rule__MethodCall__Group__02047 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__1_in_rule__MethodCall__Group__02050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__NameAssignment_0_in_rule__MethodCall__Group__0__Impl2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__1__Impl_in_rule__MethodCall__Group__12107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__2_in_rule__MethodCall__Group__12110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MethodCall__Group__1__Impl2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__2__Impl_in_rule__MethodCall__Group__22169 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__3_in_rule__MethodCall__Group__22172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__MethodAssignment_2_in_rule__MethodCall__Group__2__Impl2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__3__Impl_in_rule__MethodCall__Group__32229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MethodCall__Group__3__Impl2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclarationParam_in_rule__Model__VarsAssignment_1_12301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclarationParam_in_rule__Model__VarsAssignment_1_2_12332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Model__StatementsAssignment_32363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_rule__VarDeclaration__TypeAssignment_02394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_rule__VarDeclaration__NameAssignment_12425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_rule__VarInitialisation__TypeAssignment_02456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_rule__VarInitialisation__NameAssignment_12487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_rule__VarDeclarationParam__TypeAssignment_02518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_rule__VarDeclarationParam__NameAssignment_12549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_rule__MethodCall__NameAssignment_02580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_rule__MethodCall__MethodAssignment_22611 = new BitSet(new long[]{0x0000000000000002L});

}