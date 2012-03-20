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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'?'", "'('", "')'", "','", "'{'", "'}'", "'var'", "'call'", "'scall'", "'='", "'null'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

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


    // $ANTLR start "entryRuleVarInitialisation"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:117:1: entryRuleVarInitialisation : ruleVarInitialisation EOF ;
    public final void entryRuleVarInitialisation() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:118:1: ( ruleVarInitialisation EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:119:1: ruleVarInitialisation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInitialisationRule()); 
            }
            pushFollow(FOLLOW_ruleVarInitialisation_in_entryRuleVarInitialisation187);
            ruleVarInitialisation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarInitialisationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarInitialisation194); if (state.failed) return ;

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:126:1: ruleVarInitialisation : ( ( rule__VarInitialisation__Group__0 ) ) ;
    public final void ruleVarInitialisation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:130:2: ( ( ( rule__VarInitialisation__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:131:1: ( ( rule__VarInitialisation__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:131:1: ( ( rule__VarInitialisation__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:132:1: ( rule__VarInitialisation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInitialisationAccess().getGroup()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:133:1: ( rule__VarInitialisation__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:133:2: rule__VarInitialisation__Group__0
            {
            pushFollow(FOLLOW_rule__VarInitialisation__Group__0_in_ruleVarInitialisation220);
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


    // $ANTLR start "entryRuleVarNullLiteral"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:145:1: entryRuleVarNullLiteral : ruleVarNullLiteral EOF ;
    public final void entryRuleVarNullLiteral() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:146:1: ( ruleVarNullLiteral EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:147:1: ruleVarNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleVarNullLiteral_in_entryRuleVarNullLiteral247);
            ruleVarNullLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarNullLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarNullLiteral254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVarNullLiteral"


    // $ANTLR start "ruleVarNullLiteral"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:154:1: ruleVarNullLiteral : ( ( rule__VarNullLiteral__Group__0 ) ) ;
    public final void ruleVarNullLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:158:2: ( ( ( rule__VarNullLiteral__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:159:1: ( ( rule__VarNullLiteral__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:159:1: ( ( rule__VarNullLiteral__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:160:1: ( rule__VarNullLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarNullLiteralAccess().getGroup()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:161:1: ( rule__VarNullLiteral__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:161:2: rule__VarNullLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__VarNullLiteral__Group__0_in_ruleVarNullLiteral280);
            rule__VarNullLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarNullLiteralAccess().getGroup()); 
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
    // $ANTLR end "ruleVarNullLiteral"


    // $ANTLR start "entryRuleVarDeclaration"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:173:1: entryRuleVarDeclaration : ruleVarDeclaration EOF ;
    public final void entryRuleVarDeclaration() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:174:1: ( ruleVarDeclaration EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:175:1: ruleVarDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVarDeclaration_in_entryRuleVarDeclaration307);
            ruleVarDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDeclaration314); if (state.failed) return ;

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:182:1: ruleVarDeclaration : ( ( rule__VarDeclaration__Group__0 ) ) ;
    public final void ruleVarDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:186:2: ( ( ( rule__VarDeclaration__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:187:1: ( ( rule__VarDeclaration__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:187:1: ( ( rule__VarDeclaration__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:188:1: ( rule__VarDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getGroup()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:189:1: ( rule__VarDeclaration__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:189:2: rule__VarDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__VarDeclaration__Group__0_in_ruleVarDeclaration340);
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


    // $ANTLR start "entryRuleVarDeclarationParam"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:201:1: entryRuleVarDeclarationParam : ruleVarDeclarationParam EOF ;
    public final void entryRuleVarDeclarationParam() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:202:1: ( ruleVarDeclarationParam EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:203:1: ruleVarDeclarationParam EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationParamRule()); 
            }
            pushFollow(FOLLOW_ruleVarDeclarationParam_in_entryRuleVarDeclarationParam367);
            ruleVarDeclarationParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationParamRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDeclarationParam374); if (state.failed) return ;

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:210:1: ruleVarDeclarationParam : ( ( rule__VarDeclarationParam__Group__0 ) ) ;
    public final void ruleVarDeclarationParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:214:2: ( ( ( rule__VarDeclarationParam__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:215:1: ( ( rule__VarDeclarationParam__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:215:1: ( ( rule__VarDeclarationParam__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:216:1: ( rule__VarDeclarationParam__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationParamAccess().getGroup()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:217:1: ( rule__VarDeclarationParam__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:217:2: rule__VarDeclarationParam__Group__0
            {
            pushFollow(FOLLOW_rule__VarDeclarationParam__Group__0_in_ruleVarDeclarationParam400);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:229:1: entryRuleMethodCall : ruleMethodCall EOF ;
    public final void entryRuleMethodCall() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:230:1: ( ruleMethodCall EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:231:1: ruleMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallRule()); 
            }
            pushFollow(FOLLOW_ruleMethodCall_in_entryRuleMethodCall427);
            ruleMethodCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodCall434); if (state.failed) return ;

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:238:1: ruleMethodCall : ( ( rule__MethodCall__Group__0 ) ) ;
    public final void ruleMethodCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:242:2: ( ( ( rule__MethodCall__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:243:1: ( ( rule__MethodCall__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:243:1: ( ( rule__MethodCall__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:244:1: ( rule__MethodCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getGroup()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:245:1: ( rule__MethodCall__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:245:2: rule__MethodCall__Group__0
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__0_in_ruleMethodCall460);
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


    // $ANTLR start "entryRuleStaticMethodCall"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:257:1: entryRuleStaticMethodCall : ruleStaticMethodCall EOF ;
    public final void entryRuleStaticMethodCall() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:258:1: ( ruleStaticMethodCall EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:259:1: ruleStaticMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticMethodCallRule()); 
            }
            pushFollow(FOLLOW_ruleStaticMethodCall_in_entryRuleStaticMethodCall487);
            ruleStaticMethodCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticMethodCallRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticMethodCall494); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStaticMethodCall"


    // $ANTLR start "ruleStaticMethodCall"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:266:1: ruleStaticMethodCall : ( ( rule__StaticMethodCall__Group__0 ) ) ;
    public final void ruleStaticMethodCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:270:2: ( ( ( rule__StaticMethodCall__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:271:1: ( ( rule__StaticMethodCall__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:271:1: ( ( rule__StaticMethodCall__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:272:1: ( rule__StaticMethodCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticMethodCallAccess().getGroup()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:273:1: ( rule__StaticMethodCall__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:273:2: rule__StaticMethodCall__Group__0
            {
            pushFollow(FOLLOW_rule__StaticMethodCall__Group__0_in_ruleStaticMethodCall520);
            rule__StaticMethodCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticMethodCallAccess().getGroup()); 
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
    // $ANTLR end "ruleStaticMethodCall"


    // $ANTLR start "entryRuleWildcardName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:285:1: entryRuleWildcardName : ruleWildcardName EOF ;
    public final void entryRuleWildcardName() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:286:1: ( ruleWildcardName EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:287:1: ruleWildcardName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNameRule()); 
            }
            pushFollow(FOLLOW_ruleWildcardName_in_entryRuleWildcardName547);
            ruleWildcardName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWildcardNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWildcardName554); if (state.failed) return ;

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
    // $ANTLR end "entryRuleWildcardName"


    // $ANTLR start "ruleWildcardName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:294:1: ruleWildcardName : ( ( ( rule__WildcardName__Alternatives ) ) ( ( rule__WildcardName__Alternatives )* ) ) ;
    public final void ruleWildcardName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:298:2: ( ( ( ( rule__WildcardName__Alternatives ) ) ( ( rule__WildcardName__Alternatives )* ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:299:1: ( ( ( rule__WildcardName__Alternatives ) ) ( ( rule__WildcardName__Alternatives )* ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:299:1: ( ( ( rule__WildcardName__Alternatives ) ) ( ( rule__WildcardName__Alternatives )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:300:1: ( ( rule__WildcardName__Alternatives ) ) ( ( rule__WildcardName__Alternatives )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:300:1: ( ( rule__WildcardName__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:301:1: ( rule__WildcardName__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNameAccess().getAlternatives()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:302:1: ( rule__WildcardName__Alternatives )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:302:2: rule__WildcardName__Alternatives
            {
            pushFollow(FOLLOW_rule__WildcardName__Alternatives_in_ruleWildcardName582);
            rule__WildcardName__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWildcardNameAccess().getAlternatives()); 
            }

            }

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:305:1: ( ( rule__WildcardName__Alternatives )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:306:1: ( rule__WildcardName__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNameAccess().getAlternatives()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:307:1: ( rule__WildcardName__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==EOF) ) {
                        int LA1_4 = input.LA(3);

                        if ( (LA1_4==EOF) ) {
                            alt1=1;
                        }


                    }
                    else if ( (LA1_2==RULE_ID||(LA1_2>=11 && LA1_2<=13)||LA1_2==23) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:307:2: rule__WildcardName__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__WildcardName__Alternatives_in_ruleWildcardName594);
            	    rule__WildcardName__Alternatives();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWildcardNameAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleWildcardName"


    // $ANTLR start "entryRuleStaticMethodName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:320:1: entryRuleStaticMethodName : ruleStaticMethodName EOF ;
    public final void entryRuleStaticMethodName() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:321:1: ( ruleStaticMethodName EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:322:1: ruleStaticMethodName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticMethodNameRule()); 
            }
            pushFollow(FOLLOW_ruleStaticMethodName_in_entryRuleStaticMethodName624);
            ruleStaticMethodName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticMethodNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticMethodName631); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStaticMethodName"


    // $ANTLR start "ruleStaticMethodName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:329:1: ruleStaticMethodName : ( ( rule__StaticMethodName__Group__0 ) ) ;
    public final void ruleStaticMethodName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:333:2: ( ( ( rule__StaticMethodName__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:334:1: ( ( rule__StaticMethodName__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:334:1: ( ( rule__StaticMethodName__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:335:1: ( rule__StaticMethodName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticMethodNameAccess().getGroup()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:336:1: ( rule__StaticMethodName__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:336:2: rule__StaticMethodName__Group__0
            {
            pushFollow(FOLLOW_rule__StaticMethodName__Group__0_in_ruleStaticMethodName657);
            rule__StaticMethodName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticMethodNameAccess().getGroup()); 
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
    // $ANTLR end "ruleStaticMethodName"


    // $ANTLR start "rule__Statement__Alternatives"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:348:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:352:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:353:1: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:353:1: ( ( rule__Statement__Group_0__0 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:354:1: ( rule__Statement__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_0()); 
                    }
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:355:1: ( rule__Statement__Group_0__0 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:355:2: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Alternatives693);
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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:359:6: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:359:6: ( ( rule__Statement__Group_1__0 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:360:1: ( rule__Statement__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_1()); 
                    }
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:361:1: ( rule__Statement__Group_1__0 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:361:2: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives711);
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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:365:6: ( ( rule__Statement__Group_2__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:365:6: ( ( rule__Statement__Group_2__0 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:366:1: ( rule__Statement__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_2()); 
                    }
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:367:1: ( rule__Statement__Group_2__0 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:367:2: rule__Statement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_2__0_in_rule__Statement__Alternatives729);
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


    // $ANTLR start "rule__Statement__Alternatives_0_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:376:1: rule__Statement__Alternatives_0_1 : ( ( ruleVarInitialisation ) | ( ruleVarNullLiteral ) | ( ruleVarDeclaration ) );
    public final void rule__Statement__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:380:1: ( ( ruleVarInitialisation ) | ( ruleVarNullLiteral ) | ( ruleVarDeclaration ) )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:381:1: ( ruleVarInitialisation )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:381:1: ( ruleVarInitialisation )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:382:1: ruleVarInitialisation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getVarInitialisationParserRuleCall_0_1_0()); 
                    }
                    pushFollow(FOLLOW_ruleVarInitialisation_in_rule__Statement__Alternatives_0_1762);
                    ruleVarInitialisation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getVarInitialisationParserRuleCall_0_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:387:6: ( ruleVarNullLiteral )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:387:6: ( ruleVarNullLiteral )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:388:1: ruleVarNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getVarNullLiteralParserRuleCall_0_1_1()); 
                    }
                    pushFollow(FOLLOW_ruleVarNullLiteral_in_rule__Statement__Alternatives_0_1779);
                    ruleVarNullLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getVarNullLiteralParserRuleCall_0_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:393:6: ( ruleVarDeclaration )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:393:6: ( ruleVarDeclaration )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:394:1: ruleVarDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getVarDeclarationParserRuleCall_0_1_2()); 
                    }
                    pushFollow(FOLLOW_ruleVarDeclaration_in_rule__Statement__Alternatives_0_1796);
                    ruleVarDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getVarDeclarationParserRuleCall_0_1_2()); 
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
    // $ANTLR end "rule__Statement__Alternatives_0_1"


    // $ANTLR start "rule__WildcardName__Alternatives"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:404:1: rule__WildcardName__Alternatives : ( ( RULE_ID ) | ( '*' ) | ( '?' ) );
    public final void rule__WildcardName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:408:1: ( ( RULE_ID ) | ( '*' ) | ( '?' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 11:
                {
                alt4=2;
                }
                break;
            case 12:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:409:1: ( RULE_ID )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:409:1: ( RULE_ID )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:410:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWildcardNameAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WildcardName__Alternatives828); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWildcardNameAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:415:6: ( '*' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:415:6: ( '*' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:416:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWildcardNameAccess().getAsteriskKeyword_1()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__WildcardName__Alternatives846); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWildcardNameAccess().getAsteriskKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:423:6: ( '?' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:423:6: ( '?' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:424:1: '?'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWildcardNameAccess().getQuestionMarkKeyword_2()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__WildcardName__Alternatives866); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWildcardNameAccess().getQuestionMarkKeyword_2()); 
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
    // $ANTLR end "rule__WildcardName__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:438:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:442:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:443:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0898);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0901);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:450:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:454:1: ( ( () ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:455:1: ( () )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:455:1: ( () )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:456:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getModelAction_0()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:457:1: ()
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:459:1: 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:469:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:473:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:474:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1959);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1962);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:481:1: rule__Model__Group__1__Impl : ( ( rule__Model__Group_1__0 )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:485:1: ( ( ( rule__Model__Group_1__0 )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:486:1: ( ( rule__Model__Group_1__0 )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:486:1: ( ( rule__Model__Group_1__0 )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:487:1: ( rule__Model__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:488:1: ( rule__Model__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:488:2: rule__Model__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_1__0_in_rule__Model__Group__1__Impl989);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:498:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:502:1: ( rule__Model__Group__2__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:503:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21020);
            rule__Model__Group__2__Impl();

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:509:1: rule__Model__Group__2__Impl : ( ( rule__Model__Group_2__0 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:513:1: ( ( ( rule__Model__Group_2__0 )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:514:1: ( ( rule__Model__Group_2__0 )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:514:1: ( ( rule__Model__Group_2__0 )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:515:1: ( rule__Model__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup_2()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:516:1: ( rule__Model__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:516:2: rule__Model__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_2__0_in_rule__Model__Group__2__Impl1047);
                    rule__Model__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup_2()); 
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


    // $ANTLR start "rule__Model__Group_1__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:532:1: rule__Model__Group_1__0 : rule__Model__Group_1__0__Impl rule__Model__Group_1__1 ;
    public final void rule__Model__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:536:1: ( rule__Model__Group_1__0__Impl rule__Model__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:537:2: rule__Model__Group_1__0__Impl rule__Model__Group_1__1
            {
            pushFollow(FOLLOW_rule__Model__Group_1__0__Impl_in_rule__Model__Group_1__01084);
            rule__Model__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_1__1_in_rule__Model__Group_1__01087);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:544:1: rule__Model__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Model__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:548:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:549:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:549:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:550:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,13,FOLLOW_13_in_rule__Model__Group_1__0__Impl1115); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:563:1: rule__Model__Group_1__1 : rule__Model__Group_1__1__Impl rule__Model__Group_1__2 ;
    public final void rule__Model__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:567:1: ( rule__Model__Group_1__1__Impl rule__Model__Group_1__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:568:2: rule__Model__Group_1__1__Impl rule__Model__Group_1__2
            {
            pushFollow(FOLLOW_rule__Model__Group_1__1__Impl_in_rule__Model__Group_1__11146);
            rule__Model__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_1__2_in_rule__Model__Group_1__11149);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:575:1: rule__Model__Group_1__1__Impl : ( ( rule__Model__VarsAssignment_1_1 ) ) ;
    public final void rule__Model__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:579:1: ( ( ( rule__Model__VarsAssignment_1_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:580:1: ( ( rule__Model__VarsAssignment_1_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:580:1: ( ( rule__Model__VarsAssignment_1_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:581:1: ( rule__Model__VarsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getVarsAssignment_1_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:582:1: ( rule__Model__VarsAssignment_1_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:582:2: rule__Model__VarsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Model__VarsAssignment_1_1_in_rule__Model__Group_1__1__Impl1176);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:592:1: rule__Model__Group_1__2 : rule__Model__Group_1__2__Impl rule__Model__Group_1__3 ;
    public final void rule__Model__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:596:1: ( rule__Model__Group_1__2__Impl rule__Model__Group_1__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:597:2: rule__Model__Group_1__2__Impl rule__Model__Group_1__3
            {
            pushFollow(FOLLOW_rule__Model__Group_1__2__Impl_in_rule__Model__Group_1__21206);
            rule__Model__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_1__3_in_rule__Model__Group_1__21209);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:604:1: rule__Model__Group_1__2__Impl : ( ( rule__Model__Group_1_2__0 )* ) ;
    public final void rule__Model__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:608:1: ( ( ( rule__Model__Group_1_2__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:609:1: ( ( rule__Model__Group_1_2__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:609:1: ( ( rule__Model__Group_1_2__0 )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:610:1: ( rule__Model__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup_1_2()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:611:1: ( rule__Model__Group_1_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:611:2: rule__Model__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Model__Group_1_2__0_in_rule__Model__Group_1__2__Impl1236);
            	    rule__Model__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:621:1: rule__Model__Group_1__3 : rule__Model__Group_1__3__Impl ;
    public final void rule__Model__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:625:1: ( rule__Model__Group_1__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:626:2: rule__Model__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_1__3__Impl_in_rule__Model__Group_1__31267);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:632:1: rule__Model__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Model__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:636:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:637:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:637:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:638:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRightParenthesisKeyword_1_3()); 
            }
            match(input,14,FOLLOW_14_in_rule__Model__Group_1__3__Impl1295); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:659:1: rule__Model__Group_1_2__0 : rule__Model__Group_1_2__0__Impl rule__Model__Group_1_2__1 ;
    public final void rule__Model__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:663:1: ( rule__Model__Group_1_2__0__Impl rule__Model__Group_1_2__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:664:2: rule__Model__Group_1_2__0__Impl rule__Model__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Model__Group_1_2__0__Impl_in_rule__Model__Group_1_2__01334);
            rule__Model__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_1_2__1_in_rule__Model__Group_1_2__01337);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:671:1: rule__Model__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:675:1: ( ( ',' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:676:1: ( ',' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:676:1: ( ',' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:677:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__Model__Group_1_2__0__Impl1365); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:690:1: rule__Model__Group_1_2__1 : rule__Model__Group_1_2__1__Impl ;
    public final void rule__Model__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:694:1: ( rule__Model__Group_1_2__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:695:2: rule__Model__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_1_2__1__Impl_in_rule__Model__Group_1_2__11396);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:701:1: rule__Model__Group_1_2__1__Impl : ( ( rule__Model__VarsAssignment_1_2_1 ) ) ;
    public final void rule__Model__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:705:1: ( ( ( rule__Model__VarsAssignment_1_2_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:706:1: ( ( rule__Model__VarsAssignment_1_2_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:706:1: ( ( rule__Model__VarsAssignment_1_2_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:707:1: ( rule__Model__VarsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getVarsAssignment_1_2_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:708:1: ( rule__Model__VarsAssignment_1_2_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:708:2: rule__Model__VarsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__Model__VarsAssignment_1_2_1_in_rule__Model__Group_1_2__1__Impl1423);
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


    // $ANTLR start "rule__Model__Group_2__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:722:1: rule__Model__Group_2__0 : rule__Model__Group_2__0__Impl rule__Model__Group_2__1 ;
    public final void rule__Model__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:726:1: ( rule__Model__Group_2__0__Impl rule__Model__Group_2__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:727:2: rule__Model__Group_2__0__Impl rule__Model__Group_2__1
            {
            pushFollow(FOLLOW_rule__Model__Group_2__0__Impl_in_rule__Model__Group_2__01457);
            rule__Model__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_2__1_in_rule__Model__Group_2__01460);
            rule__Model__Group_2__1();

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
    // $ANTLR end "rule__Model__Group_2__0"


    // $ANTLR start "rule__Model__Group_2__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:734:1: rule__Model__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Model__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:738:1: ( ( '{' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:739:1: ( '{' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:739:1: ( '{' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:740:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__Model__Group_2__0__Impl1488); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2_0()); 
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
    // $ANTLR end "rule__Model__Group_2__0__Impl"


    // $ANTLR start "rule__Model__Group_2__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:753:1: rule__Model__Group_2__1 : rule__Model__Group_2__1__Impl rule__Model__Group_2__2 ;
    public final void rule__Model__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:757:1: ( rule__Model__Group_2__1__Impl rule__Model__Group_2__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:758:2: rule__Model__Group_2__1__Impl rule__Model__Group_2__2
            {
            pushFollow(FOLLOW_rule__Model__Group_2__1__Impl_in_rule__Model__Group_2__11519);
            rule__Model__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_2__2_in_rule__Model__Group_2__11522);
            rule__Model__Group_2__2();

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
    // $ANTLR end "rule__Model__Group_2__1"


    // $ANTLR start "rule__Model__Group_2__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:765:1: rule__Model__Group_2__1__Impl : ( ( rule__Model__StatementsAssignment_2_1 )* ) ;
    public final void rule__Model__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:769:1: ( ( ( rule__Model__StatementsAssignment_2_1 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:770:1: ( ( rule__Model__StatementsAssignment_2_1 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:770:1: ( ( rule__Model__StatementsAssignment_2_1 )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:771:1: ( rule__Model__StatementsAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getStatementsAssignment_2_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:772:1: ( rule__Model__StatementsAssignment_2_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=18 && LA8_0<=20)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:772:2: rule__Model__StatementsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__StatementsAssignment_2_1_in_rule__Model__Group_2__1__Impl1549);
            	    rule__Model__StatementsAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getStatementsAssignment_2_1()); 
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
    // $ANTLR end "rule__Model__Group_2__1__Impl"


    // $ANTLR start "rule__Model__Group_2__2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:782:1: rule__Model__Group_2__2 : rule__Model__Group_2__2__Impl ;
    public final void rule__Model__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:786:1: ( rule__Model__Group_2__2__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:787:2: rule__Model__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_2__2__Impl_in_rule__Model__Group_2__21580);
            rule__Model__Group_2__2__Impl();

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
    // $ANTLR end "rule__Model__Group_2__2"


    // $ANTLR start "rule__Model__Group_2__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:793:1: rule__Model__Group_2__2__Impl : ( '}' ) ;
    public final void rule__Model__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:797:1: ( ( '}' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:798:1: ( '}' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:798:1: ( '}' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:799:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_2_2()); 
            }
            match(input,17,FOLLOW_17_in_rule__Model__Group_2__2__Impl1608); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_2_2()); 
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
    // $ANTLR end "rule__Model__Group_2__2__Impl"


    // $ANTLR start "rule__Statement__Group_0__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:818:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:822:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:823:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__01645);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__01648);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:830:1: rule__Statement__Group_0__0__Impl : ( 'var' ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:834:1: ( ( 'var' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:835:1: ( 'var' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:835:1: ( 'var' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:836:1: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getVarKeyword_0_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Statement__Group_0__0__Impl1676); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getVarKeyword_0_0()); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:849:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:853:1: ( rule__Statement__Group_0__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:854:2: rule__Statement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__11707);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:860:1: rule__Statement__Group_0__1__Impl : ( ( rule__Statement__Alternatives_0_1 ) ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:864:1: ( ( ( rule__Statement__Alternatives_0_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:865:1: ( ( rule__Statement__Alternatives_0_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:865:1: ( ( rule__Statement__Alternatives_0_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:866:1: ( rule__Statement__Alternatives_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives_0_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:867:1: ( rule__Statement__Alternatives_0_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:867:2: rule__Statement__Alternatives_0_1
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_0_1_in_rule__Statement__Group_0__1__Impl1734);
            rule__Statement__Alternatives_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAlternatives_0_1()); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:881:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:885:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:886:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__01768);
            rule__Statement__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__01771);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:893:1: rule__Statement__Group_1__0__Impl : ( 'call' ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:897:1: ( ( 'call' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:898:1: ( 'call' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:898:1: ( 'call' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:899:1: 'call'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getCallKeyword_1_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Statement__Group_1__0__Impl1799); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getCallKeyword_1_0()); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:912:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:916:1: ( rule__Statement__Group_1__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:917:2: rule__Statement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__11830);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:923:1: rule__Statement__Group_1__1__Impl : ( ruleMethodCall ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:927:1: ( ( ruleMethodCall ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:928:1: ( ruleMethodCall )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:928:1: ( ruleMethodCall )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:929:1: ruleMethodCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getMethodCallParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleMethodCall_in_rule__Statement__Group_1__1__Impl1857);
            ruleMethodCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getMethodCallParserRuleCall_1_1()); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:944:1: rule__Statement__Group_2__0 : rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 ;
    public final void rule__Statement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:948:1: ( rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:949:2: rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__0__Impl_in_rule__Statement__Group_2__01890);
            rule__Statement__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_2__1_in_rule__Statement__Group_2__01893);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:956:1: rule__Statement__Group_2__0__Impl : ( 'scall' ) ;
    public final void rule__Statement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:960:1: ( ( 'scall' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:961:1: ( 'scall' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:961:1: ( 'scall' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:962:1: 'scall'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getScallKeyword_2_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Statement__Group_2__0__Impl1921); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getScallKeyword_2_0()); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:975:1: rule__Statement__Group_2__1 : rule__Statement__Group_2__1__Impl ;
    public final void rule__Statement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:979:1: ( rule__Statement__Group_2__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:980:2: rule__Statement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__1__Impl_in_rule__Statement__Group_2__11952);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:986:1: rule__Statement__Group_2__1__Impl : ( ruleStaticMethodCall ) ;
    public final void rule__Statement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:990:1: ( ( ruleStaticMethodCall ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:991:1: ( ruleStaticMethodCall )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:991:1: ( ruleStaticMethodCall )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:992:1: ruleStaticMethodCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStaticMethodCallParserRuleCall_2_1()); 
            }
            pushFollow(FOLLOW_ruleStaticMethodCall_in_rule__Statement__Group_2__1__Impl1979);
            ruleStaticMethodCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStaticMethodCallParserRuleCall_2_1()); 
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


    // $ANTLR start "rule__VarInitialisation__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1007:1: rule__VarInitialisation__Group__0 : rule__VarInitialisation__Group__0__Impl rule__VarInitialisation__Group__1 ;
    public final void rule__VarInitialisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1011:1: ( rule__VarInitialisation__Group__0__Impl rule__VarInitialisation__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1012:2: rule__VarInitialisation__Group__0__Impl rule__VarInitialisation__Group__1
            {
            pushFollow(FOLLOW_rule__VarInitialisation__Group__0__Impl_in_rule__VarInitialisation__Group__02012);
            rule__VarInitialisation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarInitialisation__Group__1_in_rule__VarInitialisation__Group__02015);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1019:1: rule__VarInitialisation__Group__0__Impl : ( ( rule__VarInitialisation__TypeAssignment_0 ) ) ;
    public final void rule__VarInitialisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1023:1: ( ( ( rule__VarInitialisation__TypeAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1024:1: ( ( rule__VarInitialisation__TypeAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1024:1: ( ( rule__VarInitialisation__TypeAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1025:1: ( rule__VarInitialisation__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInitialisationAccess().getTypeAssignment_0()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1026:1: ( rule__VarInitialisation__TypeAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1026:2: rule__VarInitialisation__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__VarInitialisation__TypeAssignment_0_in_rule__VarInitialisation__Group__0__Impl2042);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1036:1: rule__VarInitialisation__Group__1 : rule__VarInitialisation__Group__1__Impl rule__VarInitialisation__Group__2 ;
    public final void rule__VarInitialisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1040:1: ( rule__VarInitialisation__Group__1__Impl rule__VarInitialisation__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1041:2: rule__VarInitialisation__Group__1__Impl rule__VarInitialisation__Group__2
            {
            pushFollow(FOLLOW_rule__VarInitialisation__Group__1__Impl_in_rule__VarInitialisation__Group__12072);
            rule__VarInitialisation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarInitialisation__Group__2_in_rule__VarInitialisation__Group__12075);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1048:1: rule__VarInitialisation__Group__1__Impl : ( ( rule__VarInitialisation__NameAssignment_1 ) ) ;
    public final void rule__VarInitialisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1052:1: ( ( ( rule__VarInitialisation__NameAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1053:1: ( ( rule__VarInitialisation__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1053:1: ( ( rule__VarInitialisation__NameAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1054:1: ( rule__VarInitialisation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInitialisationAccess().getNameAssignment_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1055:1: ( rule__VarInitialisation__NameAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1055:2: rule__VarInitialisation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VarInitialisation__NameAssignment_1_in_rule__VarInitialisation__Group__1__Impl2102);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1065:1: rule__VarInitialisation__Group__2 : rule__VarInitialisation__Group__2__Impl rule__VarInitialisation__Group__3 ;
    public final void rule__VarInitialisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1069:1: ( rule__VarInitialisation__Group__2__Impl rule__VarInitialisation__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1070:2: rule__VarInitialisation__Group__2__Impl rule__VarInitialisation__Group__3
            {
            pushFollow(FOLLOW_rule__VarInitialisation__Group__2__Impl_in_rule__VarInitialisation__Group__22132);
            rule__VarInitialisation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarInitialisation__Group__3_in_rule__VarInitialisation__Group__22135);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1077:1: rule__VarInitialisation__Group__2__Impl : ( '=' ) ;
    public final void rule__VarInitialisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1081:1: ( ( '=' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1082:1: ( '=' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1082:1: ( '=' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1083:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInitialisationAccess().getEqualsSignKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__VarInitialisation__Group__2__Impl2163); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1096:1: rule__VarInitialisation__Group__3 : rule__VarInitialisation__Group__3__Impl ;
    public final void rule__VarInitialisation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1100:1: ( rule__VarInitialisation__Group__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1101:2: rule__VarInitialisation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VarInitialisation__Group__3__Impl_in_rule__VarInitialisation__Group__32194);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1107:1: rule__VarInitialisation__Group__3__Impl : ( '*' ) ;
    public final void rule__VarInitialisation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1111:1: ( ( '*' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1112:1: ( '*' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1112:1: ( '*' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1113:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInitialisationAccess().getAsteriskKeyword_3()); 
            }
            match(input,11,FOLLOW_11_in_rule__VarInitialisation__Group__3__Impl2222); if (state.failed) return ;
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


    // $ANTLR start "rule__VarNullLiteral__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1134:1: rule__VarNullLiteral__Group__0 : rule__VarNullLiteral__Group__0__Impl rule__VarNullLiteral__Group__1 ;
    public final void rule__VarNullLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1138:1: ( rule__VarNullLiteral__Group__0__Impl rule__VarNullLiteral__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1139:2: rule__VarNullLiteral__Group__0__Impl rule__VarNullLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__VarNullLiteral__Group__0__Impl_in_rule__VarNullLiteral__Group__02261);
            rule__VarNullLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarNullLiteral__Group__1_in_rule__VarNullLiteral__Group__02264);
            rule__VarNullLiteral__Group__1();

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
    // $ANTLR end "rule__VarNullLiteral__Group__0"


    // $ANTLR start "rule__VarNullLiteral__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1146:1: rule__VarNullLiteral__Group__0__Impl : ( ( rule__VarNullLiteral__TypeAssignment_0 ) ) ;
    public final void rule__VarNullLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1150:1: ( ( ( rule__VarNullLiteral__TypeAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1151:1: ( ( rule__VarNullLiteral__TypeAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1151:1: ( ( rule__VarNullLiteral__TypeAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1152:1: ( rule__VarNullLiteral__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarNullLiteralAccess().getTypeAssignment_0()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1153:1: ( rule__VarNullLiteral__TypeAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1153:2: rule__VarNullLiteral__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__VarNullLiteral__TypeAssignment_0_in_rule__VarNullLiteral__Group__0__Impl2291);
            rule__VarNullLiteral__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarNullLiteralAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__VarNullLiteral__Group__0__Impl"


    // $ANTLR start "rule__VarNullLiteral__Group__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1163:1: rule__VarNullLiteral__Group__1 : rule__VarNullLiteral__Group__1__Impl rule__VarNullLiteral__Group__2 ;
    public final void rule__VarNullLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1167:1: ( rule__VarNullLiteral__Group__1__Impl rule__VarNullLiteral__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1168:2: rule__VarNullLiteral__Group__1__Impl rule__VarNullLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__VarNullLiteral__Group__1__Impl_in_rule__VarNullLiteral__Group__12321);
            rule__VarNullLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarNullLiteral__Group__2_in_rule__VarNullLiteral__Group__12324);
            rule__VarNullLiteral__Group__2();

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
    // $ANTLR end "rule__VarNullLiteral__Group__1"


    // $ANTLR start "rule__VarNullLiteral__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1175:1: rule__VarNullLiteral__Group__1__Impl : ( ( rule__VarNullLiteral__NameAssignment_1 ) ) ;
    public final void rule__VarNullLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1179:1: ( ( ( rule__VarNullLiteral__NameAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1180:1: ( ( rule__VarNullLiteral__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1180:1: ( ( rule__VarNullLiteral__NameAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1181:1: ( rule__VarNullLiteral__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarNullLiteralAccess().getNameAssignment_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1182:1: ( rule__VarNullLiteral__NameAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1182:2: rule__VarNullLiteral__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VarNullLiteral__NameAssignment_1_in_rule__VarNullLiteral__Group__1__Impl2351);
            rule__VarNullLiteral__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarNullLiteralAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__VarNullLiteral__Group__1__Impl"


    // $ANTLR start "rule__VarNullLiteral__Group__2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1192:1: rule__VarNullLiteral__Group__2 : rule__VarNullLiteral__Group__2__Impl rule__VarNullLiteral__Group__3 ;
    public final void rule__VarNullLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1196:1: ( rule__VarNullLiteral__Group__2__Impl rule__VarNullLiteral__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1197:2: rule__VarNullLiteral__Group__2__Impl rule__VarNullLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__VarNullLiteral__Group__2__Impl_in_rule__VarNullLiteral__Group__22381);
            rule__VarNullLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarNullLiteral__Group__3_in_rule__VarNullLiteral__Group__22384);
            rule__VarNullLiteral__Group__3();

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
    // $ANTLR end "rule__VarNullLiteral__Group__2"


    // $ANTLR start "rule__VarNullLiteral__Group__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1204:1: rule__VarNullLiteral__Group__2__Impl : ( '=' ) ;
    public final void rule__VarNullLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1208:1: ( ( '=' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1209:1: ( '=' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1209:1: ( '=' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1210:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarNullLiteralAccess().getEqualsSignKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__VarNullLiteral__Group__2__Impl2412); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarNullLiteralAccess().getEqualsSignKeyword_2()); 
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
    // $ANTLR end "rule__VarNullLiteral__Group__2__Impl"


    // $ANTLR start "rule__VarNullLiteral__Group__3"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1223:1: rule__VarNullLiteral__Group__3 : rule__VarNullLiteral__Group__3__Impl ;
    public final void rule__VarNullLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1227:1: ( rule__VarNullLiteral__Group__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1228:2: rule__VarNullLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VarNullLiteral__Group__3__Impl_in_rule__VarNullLiteral__Group__32443);
            rule__VarNullLiteral__Group__3__Impl();

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
    // $ANTLR end "rule__VarNullLiteral__Group__3"


    // $ANTLR start "rule__VarNullLiteral__Group__3__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1234:1: rule__VarNullLiteral__Group__3__Impl : ( 'null' ) ;
    public final void rule__VarNullLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1238:1: ( ( 'null' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1239:1: ( 'null' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1239:1: ( 'null' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1240:1: 'null'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarNullLiteralAccess().getNullKeyword_3()); 
            }
            match(input,22,FOLLOW_22_in_rule__VarNullLiteral__Group__3__Impl2471); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarNullLiteralAccess().getNullKeyword_3()); 
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
    // $ANTLR end "rule__VarNullLiteral__Group__3__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1261:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1265:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1266:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__VarDeclaration__Group__0__Impl_in_rule__VarDeclaration__Group__02510);
            rule__VarDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarDeclaration__Group__1_in_rule__VarDeclaration__Group__02513);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1273:1: rule__VarDeclaration__Group__0__Impl : ( ( rule__VarDeclaration__TypeAssignment_0 ) ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1277:1: ( ( ( rule__VarDeclaration__TypeAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1278:1: ( ( rule__VarDeclaration__TypeAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1278:1: ( ( rule__VarDeclaration__TypeAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1279:1: ( rule__VarDeclaration__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getTypeAssignment_0()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1280:1: ( rule__VarDeclaration__TypeAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1280:2: rule__VarDeclaration__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__VarDeclaration__TypeAssignment_0_in_rule__VarDeclaration__Group__0__Impl2540);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1290:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1294:1: ( rule__VarDeclaration__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1295:2: rule__VarDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VarDeclaration__Group__1__Impl_in_rule__VarDeclaration__Group__12570);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1301:1: rule__VarDeclaration__Group__1__Impl : ( ( rule__VarDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1305:1: ( ( ( rule__VarDeclaration__NameAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1306:1: ( ( rule__VarDeclaration__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1306:1: ( ( rule__VarDeclaration__NameAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1307:1: ( rule__VarDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getNameAssignment_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1308:1: ( rule__VarDeclaration__NameAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1308:2: rule__VarDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VarDeclaration__NameAssignment_1_in_rule__VarDeclaration__Group__1__Impl2597);
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


    // $ANTLR start "rule__VarDeclarationParam__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1322:1: rule__VarDeclarationParam__Group__0 : rule__VarDeclarationParam__Group__0__Impl rule__VarDeclarationParam__Group__1 ;
    public final void rule__VarDeclarationParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1326:1: ( rule__VarDeclarationParam__Group__0__Impl rule__VarDeclarationParam__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1327:2: rule__VarDeclarationParam__Group__0__Impl rule__VarDeclarationParam__Group__1
            {
            pushFollow(FOLLOW_rule__VarDeclarationParam__Group__0__Impl_in_rule__VarDeclarationParam__Group__02631);
            rule__VarDeclarationParam__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarDeclarationParam__Group__1_in_rule__VarDeclarationParam__Group__02634);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1334:1: rule__VarDeclarationParam__Group__0__Impl : ( ( rule__VarDeclarationParam__TypeAssignment_0 ) ) ;
    public final void rule__VarDeclarationParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1338:1: ( ( ( rule__VarDeclarationParam__TypeAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1339:1: ( ( rule__VarDeclarationParam__TypeAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1339:1: ( ( rule__VarDeclarationParam__TypeAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1340:1: ( rule__VarDeclarationParam__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationParamAccess().getTypeAssignment_0()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1341:1: ( rule__VarDeclarationParam__TypeAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1341:2: rule__VarDeclarationParam__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__VarDeclarationParam__TypeAssignment_0_in_rule__VarDeclarationParam__Group__0__Impl2661);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1351:1: rule__VarDeclarationParam__Group__1 : rule__VarDeclarationParam__Group__1__Impl ;
    public final void rule__VarDeclarationParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1355:1: ( rule__VarDeclarationParam__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1356:2: rule__VarDeclarationParam__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VarDeclarationParam__Group__1__Impl_in_rule__VarDeclarationParam__Group__12691);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1362:1: rule__VarDeclarationParam__Group__1__Impl : ( ( rule__VarDeclarationParam__NameAssignment_1 ) ) ;
    public final void rule__VarDeclarationParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1366:1: ( ( ( rule__VarDeclarationParam__NameAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1367:1: ( ( rule__VarDeclarationParam__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1367:1: ( ( rule__VarDeclarationParam__NameAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1368:1: ( rule__VarDeclarationParam__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationParamAccess().getNameAssignment_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1369:1: ( rule__VarDeclarationParam__NameAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1369:2: rule__VarDeclarationParam__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VarDeclarationParam__NameAssignment_1_in_rule__VarDeclarationParam__Group__1__Impl2718);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1383:1: rule__MethodCall__Group__0 : rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 ;
    public final void rule__MethodCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1387:1: ( rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1388:2: rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__0__Impl_in_rule__MethodCall__Group__02752);
            rule__MethodCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MethodCall__Group__1_in_rule__MethodCall__Group__02755);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1395:1: rule__MethodCall__Group__0__Impl : ( ( rule__MethodCall__NameCalleeAssignment_0 ) ) ;
    public final void rule__MethodCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1399:1: ( ( ( rule__MethodCall__NameCalleeAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1400:1: ( ( rule__MethodCall__NameCalleeAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1400:1: ( ( rule__MethodCall__NameCalleeAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1401:1: ( rule__MethodCall__NameCalleeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getNameCalleeAssignment_0()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1402:1: ( rule__MethodCall__NameCalleeAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1402:2: rule__MethodCall__NameCalleeAssignment_0
            {
            pushFollow(FOLLOW_rule__MethodCall__NameCalleeAssignment_0_in_rule__MethodCall__Group__0__Impl2782);
            rule__MethodCall__NameCalleeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getNameCalleeAssignment_0()); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1412:1: rule__MethodCall__Group__1 : rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2 ;
    public final void rule__MethodCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1416:1: ( rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1417:2: rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__1__Impl_in_rule__MethodCall__Group__12812);
            rule__MethodCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MethodCall__Group__2_in_rule__MethodCall__Group__12815);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1424:1: rule__MethodCall__Group__1__Impl : ( '.' ) ;
    public final void rule__MethodCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1428:1: ( ( '.' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1429:1: ( '.' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1429:1: ( '.' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1430:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getFullStopKeyword_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__MethodCall__Group__1__Impl2843); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1443:1: rule__MethodCall__Group__2 : rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3 ;
    public final void rule__MethodCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1447:1: ( rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1448:2: rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__2__Impl_in_rule__MethodCall__Group__22874);
            rule__MethodCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MethodCall__Group__3_in_rule__MethodCall__Group__22877);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1455:1: rule__MethodCall__Group__2__Impl : ( ( rule__MethodCall__MethodAssignment_2 ) ) ;
    public final void rule__MethodCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1459:1: ( ( ( rule__MethodCall__MethodAssignment_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1460:1: ( ( rule__MethodCall__MethodAssignment_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1460:1: ( ( rule__MethodCall__MethodAssignment_2 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1461:1: ( rule__MethodCall__MethodAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getMethodAssignment_2()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1462:1: ( rule__MethodCall__MethodAssignment_2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1462:2: rule__MethodCall__MethodAssignment_2
            {
            pushFollow(FOLLOW_rule__MethodCall__MethodAssignment_2_in_rule__MethodCall__Group__2__Impl2904);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1472:1: rule__MethodCall__Group__3 : rule__MethodCall__Group__3__Impl rule__MethodCall__Group__4 ;
    public final void rule__MethodCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1476:1: ( rule__MethodCall__Group__3__Impl rule__MethodCall__Group__4 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1477:2: rule__MethodCall__Group__3__Impl rule__MethodCall__Group__4
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__3__Impl_in_rule__MethodCall__Group__32934);
            rule__MethodCall__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MethodCall__Group__4_in_rule__MethodCall__Group__32937);
            rule__MethodCall__Group__4();

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1484:1: rule__MethodCall__Group__3__Impl : ( '(' ) ;
    public final void rule__MethodCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1488:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1489:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1489:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1490:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,13,FOLLOW_13_in_rule__MethodCall__Group__3__Impl2965); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getLeftParenthesisKeyword_3()); 
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


    // $ANTLR start "rule__MethodCall__Group__4"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1503:1: rule__MethodCall__Group__4 : rule__MethodCall__Group__4__Impl rule__MethodCall__Group__5 ;
    public final void rule__MethodCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1507:1: ( rule__MethodCall__Group__4__Impl rule__MethodCall__Group__5 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1508:2: rule__MethodCall__Group__4__Impl rule__MethodCall__Group__5
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__4__Impl_in_rule__MethodCall__Group__42996);
            rule__MethodCall__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MethodCall__Group__5_in_rule__MethodCall__Group__42999);
            rule__MethodCall__Group__5();

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
    // $ANTLR end "rule__MethodCall__Group__4"


    // $ANTLR start "rule__MethodCall__Group__4__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1515:1: rule__MethodCall__Group__4__Impl : ( ( rule__MethodCall__NameCallerAssignment_4 )? ) ;
    public final void rule__MethodCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1519:1: ( ( ( rule__MethodCall__NameCallerAssignment_4 )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1520:1: ( ( rule__MethodCall__NameCallerAssignment_4 )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1520:1: ( ( rule__MethodCall__NameCallerAssignment_4 )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1521:1: ( rule__MethodCall__NameCallerAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getNameCallerAssignment_4()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1522:1: ( rule__MethodCall__NameCallerAssignment_4 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1522:2: rule__MethodCall__NameCallerAssignment_4
                    {
                    pushFollow(FOLLOW_rule__MethodCall__NameCallerAssignment_4_in_rule__MethodCall__Group__4__Impl3026);
                    rule__MethodCall__NameCallerAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getNameCallerAssignment_4()); 
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
    // $ANTLR end "rule__MethodCall__Group__4__Impl"


    // $ANTLR start "rule__MethodCall__Group__5"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1532:1: rule__MethodCall__Group__5 : rule__MethodCall__Group__5__Impl ;
    public final void rule__MethodCall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1536:1: ( rule__MethodCall__Group__5__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1537:2: rule__MethodCall__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__5__Impl_in_rule__MethodCall__Group__53057);
            rule__MethodCall__Group__5__Impl();

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
    // $ANTLR end "rule__MethodCall__Group__5"


    // $ANTLR start "rule__MethodCall__Group__5__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1543:1: rule__MethodCall__Group__5__Impl : ( ')' ) ;
    public final void rule__MethodCall__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1547:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1548:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1548:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1549:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,14,FOLLOW_14_in_rule__MethodCall__Group__5__Impl3085); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getRightParenthesisKeyword_5()); 
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
    // $ANTLR end "rule__MethodCall__Group__5__Impl"


    // $ANTLR start "rule__StaticMethodCall__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1574:1: rule__StaticMethodCall__Group__0 : rule__StaticMethodCall__Group__0__Impl rule__StaticMethodCall__Group__1 ;
    public final void rule__StaticMethodCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1578:1: ( rule__StaticMethodCall__Group__0__Impl rule__StaticMethodCall__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1579:2: rule__StaticMethodCall__Group__0__Impl rule__StaticMethodCall__Group__1
            {
            pushFollow(FOLLOW_rule__StaticMethodCall__Group__0__Impl_in_rule__StaticMethodCall__Group__03128);
            rule__StaticMethodCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StaticMethodCall__Group__1_in_rule__StaticMethodCall__Group__03131);
            rule__StaticMethodCall__Group__1();

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
    // $ANTLR end "rule__StaticMethodCall__Group__0"


    // $ANTLR start "rule__StaticMethodCall__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1586:1: rule__StaticMethodCall__Group__0__Impl : ( ( rule__StaticMethodCall__MethodAssignment_0 ) ) ;
    public final void rule__StaticMethodCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1590:1: ( ( ( rule__StaticMethodCall__MethodAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1591:1: ( ( rule__StaticMethodCall__MethodAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1591:1: ( ( rule__StaticMethodCall__MethodAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1592:1: ( rule__StaticMethodCall__MethodAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticMethodCallAccess().getMethodAssignment_0()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1593:1: ( rule__StaticMethodCall__MethodAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1593:2: rule__StaticMethodCall__MethodAssignment_0
            {
            pushFollow(FOLLOW_rule__StaticMethodCall__MethodAssignment_0_in_rule__StaticMethodCall__Group__0__Impl3158);
            rule__StaticMethodCall__MethodAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticMethodCallAccess().getMethodAssignment_0()); 
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
    // $ANTLR end "rule__StaticMethodCall__Group__0__Impl"


    // $ANTLR start "rule__StaticMethodCall__Group__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1603:1: rule__StaticMethodCall__Group__1 : rule__StaticMethodCall__Group__1__Impl rule__StaticMethodCall__Group__2 ;
    public final void rule__StaticMethodCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1607:1: ( rule__StaticMethodCall__Group__1__Impl rule__StaticMethodCall__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1608:2: rule__StaticMethodCall__Group__1__Impl rule__StaticMethodCall__Group__2
            {
            pushFollow(FOLLOW_rule__StaticMethodCall__Group__1__Impl_in_rule__StaticMethodCall__Group__13188);
            rule__StaticMethodCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StaticMethodCall__Group__2_in_rule__StaticMethodCall__Group__13191);
            rule__StaticMethodCall__Group__2();

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
    // $ANTLR end "rule__StaticMethodCall__Group__1"


    // $ANTLR start "rule__StaticMethodCall__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1615:1: rule__StaticMethodCall__Group__1__Impl : ( '(' ) ;
    public final void rule__StaticMethodCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1619:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1620:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1620:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1621:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticMethodCallAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,13,FOLLOW_13_in_rule__StaticMethodCall__Group__1__Impl3219); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticMethodCallAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__StaticMethodCall__Group__1__Impl"


    // $ANTLR start "rule__StaticMethodCall__Group__2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1634:1: rule__StaticMethodCall__Group__2 : rule__StaticMethodCall__Group__2__Impl rule__StaticMethodCall__Group__3 ;
    public final void rule__StaticMethodCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1638:1: ( rule__StaticMethodCall__Group__2__Impl rule__StaticMethodCall__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1639:2: rule__StaticMethodCall__Group__2__Impl rule__StaticMethodCall__Group__3
            {
            pushFollow(FOLLOW_rule__StaticMethodCall__Group__2__Impl_in_rule__StaticMethodCall__Group__23250);
            rule__StaticMethodCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StaticMethodCall__Group__3_in_rule__StaticMethodCall__Group__23253);
            rule__StaticMethodCall__Group__3();

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
    // $ANTLR end "rule__StaticMethodCall__Group__2"


    // $ANTLR start "rule__StaticMethodCall__Group__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1646:1: rule__StaticMethodCall__Group__2__Impl : ( ( rule__StaticMethodCall__NameAssignment_2 ) ) ;
    public final void rule__StaticMethodCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1650:1: ( ( ( rule__StaticMethodCall__NameAssignment_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1651:1: ( ( rule__StaticMethodCall__NameAssignment_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1651:1: ( ( rule__StaticMethodCall__NameAssignment_2 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1652:1: ( rule__StaticMethodCall__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticMethodCallAccess().getNameAssignment_2()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1653:1: ( rule__StaticMethodCall__NameAssignment_2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1653:2: rule__StaticMethodCall__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__StaticMethodCall__NameAssignment_2_in_rule__StaticMethodCall__Group__2__Impl3280);
            rule__StaticMethodCall__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticMethodCallAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__StaticMethodCall__Group__2__Impl"


    // $ANTLR start "rule__StaticMethodCall__Group__3"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1663:1: rule__StaticMethodCall__Group__3 : rule__StaticMethodCall__Group__3__Impl ;
    public final void rule__StaticMethodCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1667:1: ( rule__StaticMethodCall__Group__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1668:2: rule__StaticMethodCall__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StaticMethodCall__Group__3__Impl_in_rule__StaticMethodCall__Group__33310);
            rule__StaticMethodCall__Group__3__Impl();

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
    // $ANTLR end "rule__StaticMethodCall__Group__3"


    // $ANTLR start "rule__StaticMethodCall__Group__3__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1674:1: rule__StaticMethodCall__Group__3__Impl : ( ')' ) ;
    public final void rule__StaticMethodCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1678:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1679:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1679:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1680:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticMethodCallAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,14,FOLLOW_14_in_rule__StaticMethodCall__Group__3__Impl3338); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticMethodCallAccess().getRightParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__StaticMethodCall__Group__3__Impl"


    // $ANTLR start "rule__StaticMethodName__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1701:1: rule__StaticMethodName__Group__0 : rule__StaticMethodName__Group__0__Impl rule__StaticMethodName__Group__1 ;
    public final void rule__StaticMethodName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1705:1: ( rule__StaticMethodName__Group__0__Impl rule__StaticMethodName__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1706:2: rule__StaticMethodName__Group__0__Impl rule__StaticMethodName__Group__1
            {
            pushFollow(FOLLOW_rule__StaticMethodName__Group__0__Impl_in_rule__StaticMethodName__Group__03377);
            rule__StaticMethodName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StaticMethodName__Group__1_in_rule__StaticMethodName__Group__03380);
            rule__StaticMethodName__Group__1();

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
    // $ANTLR end "rule__StaticMethodName__Group__0"


    // $ANTLR start "rule__StaticMethodName__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1713:1: rule__StaticMethodName__Group__0__Impl : ( ruleWildcardName ) ;
    public final void rule__StaticMethodName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1717:1: ( ( ruleWildcardName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1718:1: ( ruleWildcardName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1718:1: ( ruleWildcardName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1719:1: ruleWildcardName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticMethodNameAccess().getWildcardNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleWildcardName_in_rule__StaticMethodName__Group__0__Impl3407);
            ruleWildcardName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticMethodNameAccess().getWildcardNameParserRuleCall_0()); 
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
    // $ANTLR end "rule__StaticMethodName__Group__0__Impl"


    // $ANTLR start "rule__StaticMethodName__Group__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1730:1: rule__StaticMethodName__Group__1 : rule__StaticMethodName__Group__1__Impl ;
    public final void rule__StaticMethodName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1734:1: ( rule__StaticMethodName__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1735:2: rule__StaticMethodName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StaticMethodName__Group__1__Impl_in_rule__StaticMethodName__Group__13436);
            rule__StaticMethodName__Group__1__Impl();

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
    // $ANTLR end "rule__StaticMethodName__Group__1"


    // $ANTLR start "rule__StaticMethodName__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1741:1: rule__StaticMethodName__Group__1__Impl : ( ( ( rule__StaticMethodName__Group_1__0 ) ) ( ( rule__StaticMethodName__Group_1__0 )* ) ) ;
    public final void rule__StaticMethodName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1745:1: ( ( ( ( rule__StaticMethodName__Group_1__0 ) ) ( ( rule__StaticMethodName__Group_1__0 )* ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1746:1: ( ( ( rule__StaticMethodName__Group_1__0 ) ) ( ( rule__StaticMethodName__Group_1__0 )* ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1746:1: ( ( ( rule__StaticMethodName__Group_1__0 ) ) ( ( rule__StaticMethodName__Group_1__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1747:1: ( ( rule__StaticMethodName__Group_1__0 ) ) ( ( rule__StaticMethodName__Group_1__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1747:1: ( ( rule__StaticMethodName__Group_1__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1748:1: ( rule__StaticMethodName__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticMethodNameAccess().getGroup_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1749:1: ( rule__StaticMethodName__Group_1__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1749:2: rule__StaticMethodName__Group_1__0
            {
            pushFollow(FOLLOW_rule__StaticMethodName__Group_1__0_in_rule__StaticMethodName__Group__1__Impl3465);
            rule__StaticMethodName__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticMethodNameAccess().getGroup_1()); 
            }

            }

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1752:1: ( ( rule__StaticMethodName__Group_1__0 )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1753:1: ( rule__StaticMethodName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticMethodNameAccess().getGroup_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1754:1: ( rule__StaticMethodName__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1754:2: rule__StaticMethodName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__StaticMethodName__Group_1__0_in_rule__StaticMethodName__Group__1__Impl3477);
            	    rule__StaticMethodName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticMethodNameAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__StaticMethodName__Group__1__Impl"


    // $ANTLR start "rule__StaticMethodName__Group_1__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1769:1: rule__StaticMethodName__Group_1__0 : rule__StaticMethodName__Group_1__0__Impl rule__StaticMethodName__Group_1__1 ;
    public final void rule__StaticMethodName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1773:1: ( rule__StaticMethodName__Group_1__0__Impl rule__StaticMethodName__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1774:2: rule__StaticMethodName__Group_1__0__Impl rule__StaticMethodName__Group_1__1
            {
            pushFollow(FOLLOW_rule__StaticMethodName__Group_1__0__Impl_in_rule__StaticMethodName__Group_1__03514);
            rule__StaticMethodName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StaticMethodName__Group_1__1_in_rule__StaticMethodName__Group_1__03517);
            rule__StaticMethodName__Group_1__1();

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
    // $ANTLR end "rule__StaticMethodName__Group_1__0"


    // $ANTLR start "rule__StaticMethodName__Group_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1781:1: rule__StaticMethodName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__StaticMethodName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1785:1: ( ( '.' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1786:1: ( '.' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1786:1: ( '.' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1787:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticMethodNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__StaticMethodName__Group_1__0__Impl3545); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticMethodNameAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__StaticMethodName__Group_1__0__Impl"


    // $ANTLR start "rule__StaticMethodName__Group_1__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1800:1: rule__StaticMethodName__Group_1__1 : rule__StaticMethodName__Group_1__1__Impl ;
    public final void rule__StaticMethodName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1804:1: ( rule__StaticMethodName__Group_1__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1805:2: rule__StaticMethodName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__StaticMethodName__Group_1__1__Impl_in_rule__StaticMethodName__Group_1__13576);
            rule__StaticMethodName__Group_1__1__Impl();

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
    // $ANTLR end "rule__StaticMethodName__Group_1__1"


    // $ANTLR start "rule__StaticMethodName__Group_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1811:1: rule__StaticMethodName__Group_1__1__Impl : ( ruleWildcardName ) ;
    public final void rule__StaticMethodName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1815:1: ( ( ruleWildcardName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1816:1: ( ruleWildcardName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1816:1: ( ruleWildcardName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1817:1: ruleWildcardName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticMethodNameAccess().getWildcardNameParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleWildcardName_in_rule__StaticMethodName__Group_1__1__Impl3603);
            ruleWildcardName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticMethodNameAccess().getWildcardNameParserRuleCall_1_1()); 
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
    // $ANTLR end "rule__StaticMethodName__Group_1__1__Impl"


    // $ANTLR start "rule__Model__VarsAssignment_1_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1833:1: rule__Model__VarsAssignment_1_1 : ( ruleVarDeclarationParam ) ;
    public final void rule__Model__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1837:1: ( ( ruleVarDeclarationParam ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1838:1: ( ruleVarDeclarationParam )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1838:1: ( ruleVarDeclarationParam )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1839:1: ruleVarDeclarationParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getVarsVarDeclarationParamParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleVarDeclarationParam_in_rule__Model__VarsAssignment_1_13641);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1848:1: rule__Model__VarsAssignment_1_2_1 : ( ruleVarDeclarationParam ) ;
    public final void rule__Model__VarsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1852:1: ( ( ruleVarDeclarationParam ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1853:1: ( ruleVarDeclarationParam )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1853:1: ( ruleVarDeclarationParam )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1854:1: ruleVarDeclarationParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getVarsVarDeclarationParamParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleVarDeclarationParam_in_rule__Model__VarsAssignment_1_2_13672);
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


    // $ANTLR start "rule__Model__StatementsAssignment_2_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1863:1: rule__Model__StatementsAssignment_2_1 : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1867:1: ( ( ruleStatement ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1868:1: ( ruleStatement )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1868:1: ( ruleStatement )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1869:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Model__StatementsAssignment_2_13703);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__Model__StatementsAssignment_2_1"


    // $ANTLR start "rule__VarInitialisation__TypeAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1878:1: rule__VarInitialisation__TypeAssignment_0 : ( ruleWildcardName ) ;
    public final void rule__VarInitialisation__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1882:1: ( ( ruleWildcardName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1883:1: ( ruleWildcardName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1883:1: ( ruleWildcardName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1884:1: ruleWildcardName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInitialisationAccess().getTypeWildcardNameParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleWildcardName_in_rule__VarInitialisation__TypeAssignment_03734);
            ruleWildcardName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarInitialisationAccess().getTypeWildcardNameParserRuleCall_0_0()); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1893:1: rule__VarInitialisation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VarInitialisation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1897:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1898:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1898:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1899:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInitialisationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarInitialisation__NameAssignment_13765); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarInitialisationAccess().getNameIDTerminalRuleCall_1_0()); 
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


    // $ANTLR start "rule__VarNullLiteral__TypeAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1908:1: rule__VarNullLiteral__TypeAssignment_0 : ( ruleWildcardName ) ;
    public final void rule__VarNullLiteral__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1912:1: ( ( ruleWildcardName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1913:1: ( ruleWildcardName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1913:1: ( ruleWildcardName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1914:1: ruleWildcardName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarNullLiteralAccess().getTypeWildcardNameParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleWildcardName_in_rule__VarNullLiteral__TypeAssignment_03796);
            ruleWildcardName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarNullLiteralAccess().getTypeWildcardNameParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__VarNullLiteral__TypeAssignment_0"


    // $ANTLR start "rule__VarNullLiteral__NameAssignment_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1923:1: rule__VarNullLiteral__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VarNullLiteral__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1927:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1928:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1928:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1929:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarNullLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarNullLiteral__NameAssignment_13827); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarNullLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__VarNullLiteral__NameAssignment_1"


    // $ANTLR start "rule__VarDeclaration__TypeAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1938:1: rule__VarDeclaration__TypeAssignment_0 : ( ruleWildcardName ) ;
    public final void rule__VarDeclaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1942:1: ( ( ruleWildcardName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1943:1: ( ruleWildcardName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1943:1: ( ruleWildcardName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1944:1: ruleWildcardName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getTypeWildcardNameParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleWildcardName_in_rule__VarDeclaration__TypeAssignment_03858);
            ruleWildcardName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationAccess().getTypeWildcardNameParserRuleCall_0_0()); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1953:1: rule__VarDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VarDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1957:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1958:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1958:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1959:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDeclaration__NameAssignment_13889); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
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


    // $ANTLR start "rule__VarDeclarationParam__TypeAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1968:1: rule__VarDeclarationParam__TypeAssignment_0 : ( ruleWildcardName ) ;
    public final void rule__VarDeclarationParam__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1972:1: ( ( ruleWildcardName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1973:1: ( ruleWildcardName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1973:1: ( ruleWildcardName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1974:1: ruleWildcardName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationParamAccess().getTypeWildcardNameParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleWildcardName_in_rule__VarDeclarationParam__TypeAssignment_03920);
            ruleWildcardName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationParamAccess().getTypeWildcardNameParserRuleCall_0_0()); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1983:1: rule__VarDeclarationParam__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VarDeclarationParam__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1987:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1988:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1988:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1989:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationParamAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDeclarationParam__NameAssignment_13951); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationParamAccess().getNameIDTerminalRuleCall_1_0()); 
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


    // $ANTLR start "rule__MethodCall__NameCalleeAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1998:1: rule__MethodCall__NameCalleeAssignment_0 : ( RULE_ID ) ;
    public final void rule__MethodCall__NameCalleeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2002:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2003:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2003:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2004:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getNameCalleeIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MethodCall__NameCalleeAssignment_03982); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getNameCalleeIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__MethodCall__NameCalleeAssignment_0"


    // $ANTLR start "rule__MethodCall__MethodAssignment_2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2013:1: rule__MethodCall__MethodAssignment_2 : ( ruleWildcardName ) ;
    public final void rule__MethodCall__MethodAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2017:1: ( ( ruleWildcardName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2018:1: ( ruleWildcardName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2018:1: ( ruleWildcardName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2019:1: ruleWildcardName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getMethodWildcardNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleWildcardName_in_rule__MethodCall__MethodAssignment_24013);
            ruleWildcardName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getMethodWildcardNameParserRuleCall_2_0()); 
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


    // $ANTLR start "rule__MethodCall__NameCallerAssignment_4"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2028:1: rule__MethodCall__NameCallerAssignment_4 : ( RULE_ID ) ;
    public final void rule__MethodCall__NameCallerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2032:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2033:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2033:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2034:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getNameCallerIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MethodCall__NameCallerAssignment_44044); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getNameCallerIDTerminalRuleCall_4_0()); 
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
    // $ANTLR end "rule__MethodCall__NameCallerAssignment_4"


    // $ANTLR start "rule__StaticMethodCall__MethodAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2043:1: rule__StaticMethodCall__MethodAssignment_0 : ( ruleStaticMethodName ) ;
    public final void rule__StaticMethodCall__MethodAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2047:1: ( ( ruleStaticMethodName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2048:1: ( ruleStaticMethodName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2048:1: ( ruleStaticMethodName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2049:1: ruleStaticMethodName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticMethodCallAccess().getMethodStaticMethodNameParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleStaticMethodName_in_rule__StaticMethodCall__MethodAssignment_04075);
            ruleStaticMethodName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticMethodCallAccess().getMethodStaticMethodNameParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__StaticMethodCall__MethodAssignment_0"


    // $ANTLR start "rule__StaticMethodCall__NameAssignment_2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2058:1: rule__StaticMethodCall__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__StaticMethodCall__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2062:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2063:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2063:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2064:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticMethodCallAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StaticMethodCall__NameAssignment_24106); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticMethodCallAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__StaticMethodCall__NameAssignment_2"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\13\uffff";
    static final String DFA3_eofS =
        "\4\uffff\1\7\6\uffff";
    static final String DFA3_minS =
        "\7\4\1\uffff\1\13\2\uffff";
    static final String DFA3_maxS =
        "\4\14\1\25\2\14\1\uffff\1\26\2\uffff";
    static final String DFA3_acceptS =
        "\7\uffff\1\3\1\uffff\1\1\1\2";
    static final String DFA3_specialS =
        "\13\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\6\uffff\1\2\1\3",
            "\1\4\6\uffff\1\5\1\6",
            "\1\4\6\uffff\1\5\1\6",
            "\1\4\6\uffff\1\5\1\6",
            "\1\4\6\uffff\1\5\1\6\4\uffff\4\7\1\10",
            "\1\4\6\uffff\1\5\1\6",
            "\1\4\6\uffff\1\5\1\6",
            "",
            "\1\11\12\uffff\1\12",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "376:1: rule__Statement__Alternatives_0_1 : ( ( ruleVarInitialisation ) | ( ruleVarNullLiteral ) | ( ruleVarDeclaration ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInitialisation_in_entryRuleVarInitialisation187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarInitialisation194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__0_in_ruleVarInitialisation220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarNullLiteral_in_entryRuleVarNullLiteral247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarNullLiteral254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarNullLiteral__Group__0_in_ruleVarNullLiteral280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_entryRuleVarDeclaration307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDeclaration314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__Group__0_in_ruleVarDeclaration340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclarationParam_in_entryRuleVarDeclarationParam367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDeclarationParam374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclarationParam__Group__0_in_ruleVarDeclarationParam400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodCall_in_entryRuleMethodCall427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodCall434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__0_in_ruleMethodCall460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticMethodCall_in_entryRuleStaticMethodCall487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticMethodCall494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticMethodCall__Group__0_in_ruleStaticMethodCall520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardName_in_entryRuleWildcardName547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWildcardName554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WildcardName__Alternatives_in_ruleWildcardName582 = new BitSet(new long[]{0x0000000000001812L});
    public static final BitSet FOLLOW_rule__WildcardName__Alternatives_in_ruleWildcardName594 = new BitSet(new long[]{0x0000000000001812L});
    public static final BitSet FOLLOW_ruleStaticMethodName_in_entryRuleStaticMethodName624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticMethodName631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticMethodName__Group__0_in_ruleStaticMethodName657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Alternatives693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__0_in_rule__Statement__Alternatives729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInitialisation_in_rule__Statement__Alternatives_0_1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarNullLiteral_in_rule__Statement__Alternatives_0_1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_rule__Statement__Alternatives_0_1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WildcardName__Alternatives828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__WildcardName__Alternatives846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__WildcardName__Alternatives866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0898 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1959 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__0_in_rule__Model__Group__1__Impl989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_2__0_in_rule__Model__Group__2__Impl1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__0__Impl_in_rule__Model__Group_1__01084 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_rule__Model__Group_1__1_in_rule__Model__Group_1__01087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Model__Group_1__0__Impl1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__1__Impl_in_rule__Model__Group_1__11146 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Model__Group_1__2_in_rule__Model__Group_1__11149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__VarsAssignment_1_1_in_rule__Model__Group_1__1__Impl1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__2__Impl_in_rule__Model__Group_1__21206 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Model__Group_1__3_in_rule__Model__Group_1__21209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1_2__0_in_rule__Model__Group_1__2__Impl1236 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__3__Impl_in_rule__Model__Group_1__31267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Model__Group_1__3__Impl1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1_2__0__Impl_in_rule__Model__Group_1_2__01334 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_rule__Model__Group_1_2__1_in_rule__Model__Group_1_2__01337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Model__Group_1_2__0__Impl1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1_2__1__Impl_in_rule__Model__Group_1_2__11396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__VarsAssignment_1_2_1_in_rule__Model__Group_1_2__1__Impl1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_2__0__Impl_in_rule__Model__Group_2__01457 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_rule__Model__Group_2__1_in_rule__Model__Group_2__01460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Model__Group_2__0__Impl1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_2__1__Impl_in_rule__Model__Group_2__11519 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_rule__Model__Group_2__2_in_rule__Model__Group_2__11522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__StatementsAssignment_2_1_in_rule__Model__Group_2__1__Impl1549 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_rule__Model__Group_2__2__Impl_in_rule__Model__Group_2__21580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Model__Group_2__2__Impl1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__01645 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__01648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Statement__Group_0__0__Impl1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__11707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_0_1_in_rule__Statement__Group_0__1__Impl1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__01768 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__01771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Statement__Group_1__0__Impl1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__11830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodCall_in_rule__Statement__Group_1__1__Impl1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__0__Impl_in_rule__Statement__Group_2__01890 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__1_in_rule__Statement__Group_2__01893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Statement__Group_2__0__Impl1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__1__Impl_in_rule__Statement__Group_2__11952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticMethodCall_in_rule__Statement__Group_2__1__Impl1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__0__Impl_in_rule__VarInitialisation__Group__02012 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__1_in_rule__VarInitialisation__Group__02015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInitialisation__TypeAssignment_0_in_rule__VarInitialisation__Group__0__Impl2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__1__Impl_in_rule__VarInitialisation__Group__12072 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__2_in_rule__VarInitialisation__Group__12075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInitialisation__NameAssignment_1_in_rule__VarInitialisation__Group__1__Impl2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__2__Impl_in_rule__VarInitialisation__Group__22132 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__3_in_rule__VarInitialisation__Group__22135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__VarInitialisation__Group__2__Impl2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__3__Impl_in_rule__VarInitialisation__Group__32194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__VarInitialisation__Group__3__Impl2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarNullLiteral__Group__0__Impl_in_rule__VarNullLiteral__Group__02261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarNullLiteral__Group__1_in_rule__VarNullLiteral__Group__02264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarNullLiteral__TypeAssignment_0_in_rule__VarNullLiteral__Group__0__Impl2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarNullLiteral__Group__1__Impl_in_rule__VarNullLiteral__Group__12321 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__VarNullLiteral__Group__2_in_rule__VarNullLiteral__Group__12324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarNullLiteral__NameAssignment_1_in_rule__VarNullLiteral__Group__1__Impl2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarNullLiteral__Group__2__Impl_in_rule__VarNullLiteral__Group__22381 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__VarNullLiteral__Group__3_in_rule__VarNullLiteral__Group__22384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__VarNullLiteral__Group__2__Impl2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarNullLiteral__Group__3__Impl_in_rule__VarNullLiteral__Group__32443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__VarNullLiteral__Group__3__Impl2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__Group__0__Impl_in_rule__VarDeclaration__Group__02510 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarDeclaration__Group__1_in_rule__VarDeclaration__Group__02513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__TypeAssignment_0_in_rule__VarDeclaration__Group__0__Impl2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__Group__1__Impl_in_rule__VarDeclaration__Group__12570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__NameAssignment_1_in_rule__VarDeclaration__Group__1__Impl2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclarationParam__Group__0__Impl_in_rule__VarDeclarationParam__Group__02631 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarDeclarationParam__Group__1_in_rule__VarDeclarationParam__Group__02634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclarationParam__TypeAssignment_0_in_rule__VarDeclarationParam__Group__0__Impl2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclarationParam__Group__1__Impl_in_rule__VarDeclarationParam__Group__12691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclarationParam__NameAssignment_1_in_rule__VarDeclarationParam__Group__1__Impl2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__0__Impl_in_rule__MethodCall__Group__02752 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__1_in_rule__MethodCall__Group__02755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__NameCalleeAssignment_0_in_rule__MethodCall__Group__0__Impl2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__1__Impl_in_rule__MethodCall__Group__12812 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__2_in_rule__MethodCall__Group__12815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MethodCall__Group__1__Impl2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__2__Impl_in_rule__MethodCall__Group__22874 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__3_in_rule__MethodCall__Group__22877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__MethodAssignment_2_in_rule__MethodCall__Group__2__Impl2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__3__Impl_in_rule__MethodCall__Group__32934 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__4_in_rule__MethodCall__Group__32937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MethodCall__Group__3__Impl2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__4__Impl_in_rule__MethodCall__Group__42996 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__5_in_rule__MethodCall__Group__42999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__NameCallerAssignment_4_in_rule__MethodCall__Group__4__Impl3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__5__Impl_in_rule__MethodCall__Group__53057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MethodCall__Group__5__Impl3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticMethodCall__Group__0__Impl_in_rule__StaticMethodCall__Group__03128 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__StaticMethodCall__Group__1_in_rule__StaticMethodCall__Group__03131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticMethodCall__MethodAssignment_0_in_rule__StaticMethodCall__Group__0__Impl3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticMethodCall__Group__1__Impl_in_rule__StaticMethodCall__Group__13188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StaticMethodCall__Group__2_in_rule__StaticMethodCall__Group__13191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__StaticMethodCall__Group__1__Impl3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticMethodCall__Group__2__Impl_in_rule__StaticMethodCall__Group__23250 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__StaticMethodCall__Group__3_in_rule__StaticMethodCall__Group__23253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticMethodCall__NameAssignment_2_in_rule__StaticMethodCall__Group__2__Impl3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticMethodCall__Group__3__Impl_in_rule__StaticMethodCall__Group__33310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__StaticMethodCall__Group__3__Impl3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticMethodName__Group__0__Impl_in_rule__StaticMethodName__Group__03377 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__StaticMethodName__Group__1_in_rule__StaticMethodName__Group__03380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardName_in_rule__StaticMethodName__Group__0__Impl3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticMethodName__Group__1__Impl_in_rule__StaticMethodName__Group__13436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticMethodName__Group_1__0_in_rule__StaticMethodName__Group__1__Impl3465 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__StaticMethodName__Group_1__0_in_rule__StaticMethodName__Group__1__Impl3477 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__StaticMethodName__Group_1__0__Impl_in_rule__StaticMethodName__Group_1__03514 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_rule__StaticMethodName__Group_1__1_in_rule__StaticMethodName__Group_1__03517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__StaticMethodName__Group_1__0__Impl3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticMethodName__Group_1__1__Impl_in_rule__StaticMethodName__Group_1__13576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardName_in_rule__StaticMethodName__Group_1__1__Impl3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclarationParam_in_rule__Model__VarsAssignment_1_13641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclarationParam_in_rule__Model__VarsAssignment_1_2_13672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Model__StatementsAssignment_2_13703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardName_in_rule__VarInitialisation__TypeAssignment_03734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarInitialisation__NameAssignment_13765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardName_in_rule__VarNullLiteral__TypeAssignment_03796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarNullLiteral__NameAssignment_13827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardName_in_rule__VarDeclaration__TypeAssignment_03858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDeclaration__NameAssignment_13889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardName_in_rule__VarDeclarationParam__TypeAssignment_03920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDeclarationParam__NameAssignment_13951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MethodCall__NameCalleeAssignment_03982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardName_in_rule__MethodCall__MethodAssignment_24013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MethodCall__NameCallerAssignment_44044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticMethodName_in_rule__StaticMethodCall__MethodAssignment_04075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StaticMethodCall__NameAssignment_24106 = new BitSet(new long[]{0x0000000000000002L});

}