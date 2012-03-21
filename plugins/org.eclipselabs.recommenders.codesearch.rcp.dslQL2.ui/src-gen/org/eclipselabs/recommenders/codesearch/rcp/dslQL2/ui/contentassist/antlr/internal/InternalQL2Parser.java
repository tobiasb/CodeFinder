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


    // $ANTLR start "entryRuleType"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:285:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:286:1: ( ruleType EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:287:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType547);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType554); if (state.failed) return ;

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:294:1: ruleType : ( ( rule__Type__ValueAssignment ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:298:2: ( ( ( rule__Type__ValueAssignment ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:299:1: ( ( rule__Type__ValueAssignment ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:299:1: ( ( rule__Type__ValueAssignment ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:300:1: ( rule__Type__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getValueAssignment()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:301:1: ( rule__Type__ValueAssignment )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:301:2: rule__Type__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Type__ValueAssignment_in_ruleType580);
            rule__Type__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:313:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:314:1: ( ruleName EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:315:1: ruleName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRule()); 
            }
            pushFollow(FOLLOW_ruleName_in_entryRuleName607);
            ruleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleName614); if (state.failed) return ;

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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:322:1: ruleName : ( ( rule__Name__ValueAssignment ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:326:2: ( ( ( rule__Name__ValueAssignment ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:327:1: ( ( rule__Name__ValueAssignment ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:327:1: ( ( rule__Name__ValueAssignment ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:328:1: ( rule__Name__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameAccess().getValueAssignment()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:329:1: ( rule__Name__ValueAssignment )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:329:2: rule__Name__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Name__ValueAssignment_in_ruleName640);
            rule__Name__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleWildcardNameConcatenated"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:341:1: entryRuleWildcardNameConcatenated : ruleWildcardNameConcatenated EOF ;
    public final void entryRuleWildcardNameConcatenated() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:342:1: ( ruleWildcardNameConcatenated EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:343:1: ruleWildcardNameConcatenated EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNameConcatenatedRule()); 
            }
            pushFollow(FOLLOW_ruleWildcardNameConcatenated_in_entryRuleWildcardNameConcatenated667);
            ruleWildcardNameConcatenated();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWildcardNameConcatenatedRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWildcardNameConcatenated674); if (state.failed) return ;

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
    // $ANTLR end "entryRuleWildcardNameConcatenated"


    // $ANTLR start "ruleWildcardNameConcatenated"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:350:1: ruleWildcardNameConcatenated : ( ( rule__WildcardNameConcatenated__Group__0 ) ) ;
    public final void ruleWildcardNameConcatenated() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:354:2: ( ( ( rule__WildcardNameConcatenated__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:355:1: ( ( rule__WildcardNameConcatenated__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:355:1: ( ( rule__WildcardNameConcatenated__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:356:1: ( rule__WildcardNameConcatenated__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNameConcatenatedAccess().getGroup()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:357:1: ( rule__WildcardNameConcatenated__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:357:2: rule__WildcardNameConcatenated__Group__0
            {
            pushFollow(FOLLOW_rule__WildcardNameConcatenated__Group__0_in_ruleWildcardNameConcatenated700);
            rule__WildcardNameConcatenated__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWildcardNameConcatenatedAccess().getGroup()); 
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
    // $ANTLR end "ruleWildcardNameConcatenated"


    // $ANTLR start "entryRuleWildcardName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:369:1: entryRuleWildcardName : ruleWildcardName EOF ;
    public final void entryRuleWildcardName() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:370:1: ( ruleWildcardName EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:371:1: ruleWildcardName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNameRule()); 
            }
            pushFollow(FOLLOW_ruleWildcardName_in_entryRuleWildcardName727);
            ruleWildcardName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWildcardNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWildcardName734); if (state.failed) return ;

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:378:1: ruleWildcardName : ( ( ( rule__WildcardName__Alternatives ) ) ( ( rule__WildcardName__Alternatives )* ) ) ;
    public final void ruleWildcardName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:382:2: ( ( ( ( rule__WildcardName__Alternatives ) ) ( ( rule__WildcardName__Alternatives )* ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:383:1: ( ( ( rule__WildcardName__Alternatives ) ) ( ( rule__WildcardName__Alternatives )* ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:383:1: ( ( ( rule__WildcardName__Alternatives ) ) ( ( rule__WildcardName__Alternatives )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:384:1: ( ( rule__WildcardName__Alternatives ) ) ( ( rule__WildcardName__Alternatives )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:384:1: ( ( rule__WildcardName__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:385:1: ( rule__WildcardName__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNameAccess().getAlternatives()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:386:1: ( rule__WildcardName__Alternatives )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:386:2: rule__WildcardName__Alternatives
            {
            pushFollow(FOLLOW_rule__WildcardName__Alternatives_in_ruleWildcardName762);
            rule__WildcardName__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWildcardNameAccess().getAlternatives()); 
            }

            }

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:389:1: ( ( rule__WildcardName__Alternatives )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:390:1: ( rule__WildcardName__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNameAccess().getAlternatives()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:391:1: ( rule__WildcardName__Alternatives )*
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
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:391:2: rule__WildcardName__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__WildcardName__Alternatives_in_ruleWildcardName774);
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


    // $ANTLR start "rule__Statement__Alternatives"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:404:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:408:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) )
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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:409:1: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:409:1: ( ( rule__Statement__Group_0__0 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:410:1: ( rule__Statement__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_0()); 
                    }
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:411:1: ( rule__Statement__Group_0__0 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:411:2: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Alternatives813);
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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:415:6: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:415:6: ( ( rule__Statement__Group_1__0 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:416:1: ( rule__Statement__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_1()); 
                    }
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:417:1: ( rule__Statement__Group_1__0 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:417:2: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives831);
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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:421:6: ( ( rule__Statement__Group_2__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:421:6: ( ( rule__Statement__Group_2__0 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:422:1: ( rule__Statement__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_2()); 
                    }
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:423:1: ( rule__Statement__Group_2__0 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:423:2: rule__Statement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_2__0_in_rule__Statement__Alternatives849);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:432:1: rule__Statement__Alternatives_0_1 : ( ( ruleVarInitialisation ) | ( ruleVarNullLiteral ) | ( ruleVarDeclaration ) );
    public final void rule__Statement__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:436:1: ( ( ruleVarInitialisation ) | ( ruleVarNullLiteral ) | ( ruleVarDeclaration ) )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:437:1: ( ruleVarInitialisation )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:437:1: ( ruleVarInitialisation )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:438:1: ruleVarInitialisation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getVarInitialisationParserRuleCall_0_1_0()); 
                    }
                    pushFollow(FOLLOW_ruleVarInitialisation_in_rule__Statement__Alternatives_0_1882);
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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:443:6: ( ruleVarNullLiteral )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:443:6: ( ruleVarNullLiteral )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:444:1: ruleVarNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getVarNullLiteralParserRuleCall_0_1_1()); 
                    }
                    pushFollow(FOLLOW_ruleVarNullLiteral_in_rule__Statement__Alternatives_0_1899);
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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:449:6: ( ruleVarDeclaration )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:449:6: ( ruleVarDeclaration )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:450:1: ruleVarDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getVarDeclarationParserRuleCall_0_1_2()); 
                    }
                    pushFollow(FOLLOW_ruleVarDeclaration_in_rule__Statement__Alternatives_0_1916);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:460:1: rule__WildcardName__Alternatives : ( ( RULE_ID ) | ( '*' ) | ( '?' ) );
    public final void rule__WildcardName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:464:1: ( ( RULE_ID ) | ( '*' ) | ( '?' ) )
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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:465:1: ( RULE_ID )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:465:1: ( RULE_ID )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:466:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWildcardNameAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WildcardName__Alternatives948); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWildcardNameAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:471:6: ( '*' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:471:6: ( '*' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:472:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWildcardNameAccess().getAsteriskKeyword_1()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__WildcardName__Alternatives966); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWildcardNameAccess().getAsteriskKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:479:6: ( '?' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:479:6: ( '?' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:480:1: '?'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWildcardNameAccess().getQuestionMarkKeyword_2()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__WildcardName__Alternatives986); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:494:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:498:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:499:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01018);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01021);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:506:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:510:1: ( ( () ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:511:1: ( () )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:511:1: ( () )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:512:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getModelAction_0()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:513:1: ()
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:515:1: 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:525:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:529:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:530:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11079);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11082);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:537:1: rule__Model__Group__1__Impl : ( ( rule__Model__Group_1__0 )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:541:1: ( ( ( rule__Model__Group_1__0 )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:542:1: ( ( rule__Model__Group_1__0 )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:542:1: ( ( rule__Model__Group_1__0 )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:543:1: ( rule__Model__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:544:1: ( rule__Model__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:544:2: rule__Model__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_1__0_in_rule__Model__Group__1__Impl1109);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:554:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:558:1: ( rule__Model__Group__2__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:559:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21140);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:565:1: rule__Model__Group__2__Impl : ( ( rule__Model__Group_2__0 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:569:1: ( ( ( rule__Model__Group_2__0 )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:570:1: ( ( rule__Model__Group_2__0 )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:570:1: ( ( rule__Model__Group_2__0 )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:571:1: ( rule__Model__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup_2()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:572:1: ( rule__Model__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:572:2: rule__Model__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_2__0_in_rule__Model__Group__2__Impl1167);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:588:1: rule__Model__Group_1__0 : rule__Model__Group_1__0__Impl rule__Model__Group_1__1 ;
    public final void rule__Model__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:592:1: ( rule__Model__Group_1__0__Impl rule__Model__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:593:2: rule__Model__Group_1__0__Impl rule__Model__Group_1__1
            {
            pushFollow(FOLLOW_rule__Model__Group_1__0__Impl_in_rule__Model__Group_1__01204);
            rule__Model__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_1__1_in_rule__Model__Group_1__01207);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:600:1: rule__Model__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Model__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:604:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:605:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:605:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:606:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,13,FOLLOW_13_in_rule__Model__Group_1__0__Impl1235); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:619:1: rule__Model__Group_1__1 : rule__Model__Group_1__1__Impl rule__Model__Group_1__2 ;
    public final void rule__Model__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:623:1: ( rule__Model__Group_1__1__Impl rule__Model__Group_1__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:624:2: rule__Model__Group_1__1__Impl rule__Model__Group_1__2
            {
            pushFollow(FOLLOW_rule__Model__Group_1__1__Impl_in_rule__Model__Group_1__11266);
            rule__Model__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_1__2_in_rule__Model__Group_1__11269);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:631:1: rule__Model__Group_1__1__Impl : ( ( rule__Model__VarsAssignment_1_1 ) ) ;
    public final void rule__Model__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:635:1: ( ( ( rule__Model__VarsAssignment_1_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:636:1: ( ( rule__Model__VarsAssignment_1_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:636:1: ( ( rule__Model__VarsAssignment_1_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:637:1: ( rule__Model__VarsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getVarsAssignment_1_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:638:1: ( rule__Model__VarsAssignment_1_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:638:2: rule__Model__VarsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Model__VarsAssignment_1_1_in_rule__Model__Group_1__1__Impl1296);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:648:1: rule__Model__Group_1__2 : rule__Model__Group_1__2__Impl rule__Model__Group_1__3 ;
    public final void rule__Model__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:652:1: ( rule__Model__Group_1__2__Impl rule__Model__Group_1__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:653:2: rule__Model__Group_1__2__Impl rule__Model__Group_1__3
            {
            pushFollow(FOLLOW_rule__Model__Group_1__2__Impl_in_rule__Model__Group_1__21326);
            rule__Model__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_1__3_in_rule__Model__Group_1__21329);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:660:1: rule__Model__Group_1__2__Impl : ( ( rule__Model__Group_1_2__0 )* ) ;
    public final void rule__Model__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:664:1: ( ( ( rule__Model__Group_1_2__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:665:1: ( ( rule__Model__Group_1_2__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:665:1: ( ( rule__Model__Group_1_2__0 )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:666:1: ( rule__Model__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup_1_2()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:667:1: ( rule__Model__Group_1_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:667:2: rule__Model__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Model__Group_1_2__0_in_rule__Model__Group_1__2__Impl1356);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:677:1: rule__Model__Group_1__3 : rule__Model__Group_1__3__Impl ;
    public final void rule__Model__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:681:1: ( rule__Model__Group_1__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:682:2: rule__Model__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_1__3__Impl_in_rule__Model__Group_1__31387);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:688:1: rule__Model__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Model__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:692:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:693:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:693:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:694:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRightParenthesisKeyword_1_3()); 
            }
            match(input,14,FOLLOW_14_in_rule__Model__Group_1__3__Impl1415); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:715:1: rule__Model__Group_1_2__0 : rule__Model__Group_1_2__0__Impl rule__Model__Group_1_2__1 ;
    public final void rule__Model__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:719:1: ( rule__Model__Group_1_2__0__Impl rule__Model__Group_1_2__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:720:2: rule__Model__Group_1_2__0__Impl rule__Model__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Model__Group_1_2__0__Impl_in_rule__Model__Group_1_2__01454);
            rule__Model__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_1_2__1_in_rule__Model__Group_1_2__01457);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:727:1: rule__Model__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:731:1: ( ( ',' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:732:1: ( ',' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:732:1: ( ',' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:733:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__Model__Group_1_2__0__Impl1485); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:746:1: rule__Model__Group_1_2__1 : rule__Model__Group_1_2__1__Impl ;
    public final void rule__Model__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:750:1: ( rule__Model__Group_1_2__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:751:2: rule__Model__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_1_2__1__Impl_in_rule__Model__Group_1_2__11516);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:757:1: rule__Model__Group_1_2__1__Impl : ( ( rule__Model__VarsAssignment_1_2_1 ) ) ;
    public final void rule__Model__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:761:1: ( ( ( rule__Model__VarsAssignment_1_2_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:762:1: ( ( rule__Model__VarsAssignment_1_2_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:762:1: ( ( rule__Model__VarsAssignment_1_2_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:763:1: ( rule__Model__VarsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getVarsAssignment_1_2_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:764:1: ( rule__Model__VarsAssignment_1_2_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:764:2: rule__Model__VarsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__Model__VarsAssignment_1_2_1_in_rule__Model__Group_1_2__1__Impl1543);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:778:1: rule__Model__Group_2__0 : rule__Model__Group_2__0__Impl rule__Model__Group_2__1 ;
    public final void rule__Model__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:782:1: ( rule__Model__Group_2__0__Impl rule__Model__Group_2__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:783:2: rule__Model__Group_2__0__Impl rule__Model__Group_2__1
            {
            pushFollow(FOLLOW_rule__Model__Group_2__0__Impl_in_rule__Model__Group_2__01577);
            rule__Model__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_2__1_in_rule__Model__Group_2__01580);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:790:1: rule__Model__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Model__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:794:1: ( ( '{' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:795:1: ( '{' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:795:1: ( '{' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:796:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__Model__Group_2__0__Impl1608); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:809:1: rule__Model__Group_2__1 : rule__Model__Group_2__1__Impl rule__Model__Group_2__2 ;
    public final void rule__Model__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:813:1: ( rule__Model__Group_2__1__Impl rule__Model__Group_2__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:814:2: rule__Model__Group_2__1__Impl rule__Model__Group_2__2
            {
            pushFollow(FOLLOW_rule__Model__Group_2__1__Impl_in_rule__Model__Group_2__11639);
            rule__Model__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_2__2_in_rule__Model__Group_2__11642);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:821:1: rule__Model__Group_2__1__Impl : ( ( rule__Model__StatementsAssignment_2_1 )* ) ;
    public final void rule__Model__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:825:1: ( ( ( rule__Model__StatementsAssignment_2_1 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:826:1: ( ( rule__Model__StatementsAssignment_2_1 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:826:1: ( ( rule__Model__StatementsAssignment_2_1 )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:827:1: ( rule__Model__StatementsAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getStatementsAssignment_2_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:828:1: ( rule__Model__StatementsAssignment_2_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=18 && LA8_0<=20)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:828:2: rule__Model__StatementsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__StatementsAssignment_2_1_in_rule__Model__Group_2__1__Impl1669);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:838:1: rule__Model__Group_2__2 : rule__Model__Group_2__2__Impl ;
    public final void rule__Model__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:842:1: ( rule__Model__Group_2__2__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:843:2: rule__Model__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_2__2__Impl_in_rule__Model__Group_2__21700);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:849:1: rule__Model__Group_2__2__Impl : ( '}' ) ;
    public final void rule__Model__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:853:1: ( ( '}' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:854:1: ( '}' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:854:1: ( '}' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:855:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_2_2()); 
            }
            match(input,17,FOLLOW_17_in_rule__Model__Group_2__2__Impl1728); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:874:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:878:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:879:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__01765);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__01768);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:886:1: rule__Statement__Group_0__0__Impl : ( 'var' ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:890:1: ( ( 'var' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:891:1: ( 'var' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:891:1: ( 'var' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:892:1: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getVarKeyword_0_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Statement__Group_0__0__Impl1796); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:905:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:909:1: ( rule__Statement__Group_0__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:910:2: rule__Statement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__11827);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:916:1: rule__Statement__Group_0__1__Impl : ( ( rule__Statement__Alternatives_0_1 ) ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:920:1: ( ( ( rule__Statement__Alternatives_0_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:921:1: ( ( rule__Statement__Alternatives_0_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:921:1: ( ( rule__Statement__Alternatives_0_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:922:1: ( rule__Statement__Alternatives_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives_0_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:923:1: ( rule__Statement__Alternatives_0_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:923:2: rule__Statement__Alternatives_0_1
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_0_1_in_rule__Statement__Group_0__1__Impl1854);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:937:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:941:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:942:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__01888);
            rule__Statement__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__01891);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:949:1: rule__Statement__Group_1__0__Impl : ( 'call' ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:953:1: ( ( 'call' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:954:1: ( 'call' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:954:1: ( 'call' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:955:1: 'call'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getCallKeyword_1_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Statement__Group_1__0__Impl1919); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:968:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:972:1: ( rule__Statement__Group_1__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:973:2: rule__Statement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__11950);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:979:1: rule__Statement__Group_1__1__Impl : ( ruleMethodCall ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:983:1: ( ( ruleMethodCall ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:984:1: ( ruleMethodCall )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:984:1: ( ruleMethodCall )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:985:1: ruleMethodCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getMethodCallParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleMethodCall_in_rule__Statement__Group_1__1__Impl1977);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1000:1: rule__Statement__Group_2__0 : rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 ;
    public final void rule__Statement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1004:1: ( rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1005:2: rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__0__Impl_in_rule__Statement__Group_2__02010);
            rule__Statement__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_2__1_in_rule__Statement__Group_2__02013);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1012:1: rule__Statement__Group_2__0__Impl : ( 'scall' ) ;
    public final void rule__Statement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1016:1: ( ( 'scall' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1017:1: ( 'scall' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1017:1: ( 'scall' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1018:1: 'scall'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getScallKeyword_2_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Statement__Group_2__0__Impl2041); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1031:1: rule__Statement__Group_2__1 : rule__Statement__Group_2__1__Impl ;
    public final void rule__Statement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1035:1: ( rule__Statement__Group_2__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1036:2: rule__Statement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__1__Impl_in_rule__Statement__Group_2__12072);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1042:1: rule__Statement__Group_2__1__Impl : ( ruleStaticMethodCall ) ;
    public final void rule__Statement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1046:1: ( ( ruleStaticMethodCall ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1047:1: ( ruleStaticMethodCall )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1047:1: ( ruleStaticMethodCall )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1048:1: ruleStaticMethodCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStaticMethodCallParserRuleCall_2_1()); 
            }
            pushFollow(FOLLOW_ruleStaticMethodCall_in_rule__Statement__Group_2__1__Impl2099);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1063:1: rule__VarInitialisation__Group__0 : rule__VarInitialisation__Group__0__Impl rule__VarInitialisation__Group__1 ;
    public final void rule__VarInitialisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1067:1: ( rule__VarInitialisation__Group__0__Impl rule__VarInitialisation__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1068:2: rule__VarInitialisation__Group__0__Impl rule__VarInitialisation__Group__1
            {
            pushFollow(FOLLOW_rule__VarInitialisation__Group__0__Impl_in_rule__VarInitialisation__Group__02132);
            rule__VarInitialisation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarInitialisation__Group__1_in_rule__VarInitialisation__Group__02135);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1075:1: rule__VarInitialisation__Group__0__Impl : ( ( rule__VarInitialisation__TypeAssignment_0 ) ) ;
    public final void rule__VarInitialisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1079:1: ( ( ( rule__VarInitialisation__TypeAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1080:1: ( ( rule__VarInitialisation__TypeAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1080:1: ( ( rule__VarInitialisation__TypeAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1081:1: ( rule__VarInitialisation__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInitialisationAccess().getTypeAssignment_0()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1082:1: ( rule__VarInitialisation__TypeAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1082:2: rule__VarInitialisation__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__VarInitialisation__TypeAssignment_0_in_rule__VarInitialisation__Group__0__Impl2162);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1092:1: rule__VarInitialisation__Group__1 : rule__VarInitialisation__Group__1__Impl rule__VarInitialisation__Group__2 ;
    public final void rule__VarInitialisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1096:1: ( rule__VarInitialisation__Group__1__Impl rule__VarInitialisation__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1097:2: rule__VarInitialisation__Group__1__Impl rule__VarInitialisation__Group__2
            {
            pushFollow(FOLLOW_rule__VarInitialisation__Group__1__Impl_in_rule__VarInitialisation__Group__12192);
            rule__VarInitialisation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarInitialisation__Group__2_in_rule__VarInitialisation__Group__12195);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1104:1: rule__VarInitialisation__Group__1__Impl : ( ( rule__VarInitialisation__NameAssignment_1 ) ) ;
    public final void rule__VarInitialisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1108:1: ( ( ( rule__VarInitialisation__NameAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1109:1: ( ( rule__VarInitialisation__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1109:1: ( ( rule__VarInitialisation__NameAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1110:1: ( rule__VarInitialisation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInitialisationAccess().getNameAssignment_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1111:1: ( rule__VarInitialisation__NameAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1111:2: rule__VarInitialisation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VarInitialisation__NameAssignment_1_in_rule__VarInitialisation__Group__1__Impl2222);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1121:1: rule__VarInitialisation__Group__2 : rule__VarInitialisation__Group__2__Impl rule__VarInitialisation__Group__3 ;
    public final void rule__VarInitialisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1125:1: ( rule__VarInitialisation__Group__2__Impl rule__VarInitialisation__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1126:2: rule__VarInitialisation__Group__2__Impl rule__VarInitialisation__Group__3
            {
            pushFollow(FOLLOW_rule__VarInitialisation__Group__2__Impl_in_rule__VarInitialisation__Group__22252);
            rule__VarInitialisation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarInitialisation__Group__3_in_rule__VarInitialisation__Group__22255);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1133:1: rule__VarInitialisation__Group__2__Impl : ( '=' ) ;
    public final void rule__VarInitialisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1137:1: ( ( '=' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1138:1: ( '=' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1138:1: ( '=' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1139:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInitialisationAccess().getEqualsSignKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__VarInitialisation__Group__2__Impl2283); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1152:1: rule__VarInitialisation__Group__3 : rule__VarInitialisation__Group__3__Impl ;
    public final void rule__VarInitialisation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1156:1: ( rule__VarInitialisation__Group__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1157:2: rule__VarInitialisation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VarInitialisation__Group__3__Impl_in_rule__VarInitialisation__Group__32314);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1163:1: rule__VarInitialisation__Group__3__Impl : ( '*' ) ;
    public final void rule__VarInitialisation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1167:1: ( ( '*' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1168:1: ( '*' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1168:1: ( '*' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1169:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInitialisationAccess().getAsteriskKeyword_3()); 
            }
            match(input,11,FOLLOW_11_in_rule__VarInitialisation__Group__3__Impl2342); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1190:1: rule__VarNullLiteral__Group__0 : rule__VarNullLiteral__Group__0__Impl rule__VarNullLiteral__Group__1 ;
    public final void rule__VarNullLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1194:1: ( rule__VarNullLiteral__Group__0__Impl rule__VarNullLiteral__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1195:2: rule__VarNullLiteral__Group__0__Impl rule__VarNullLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__VarNullLiteral__Group__0__Impl_in_rule__VarNullLiteral__Group__02381);
            rule__VarNullLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarNullLiteral__Group__1_in_rule__VarNullLiteral__Group__02384);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1202:1: rule__VarNullLiteral__Group__0__Impl : ( ( rule__VarNullLiteral__TypeAssignment_0 ) ) ;
    public final void rule__VarNullLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1206:1: ( ( ( rule__VarNullLiteral__TypeAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1207:1: ( ( rule__VarNullLiteral__TypeAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1207:1: ( ( rule__VarNullLiteral__TypeAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1208:1: ( rule__VarNullLiteral__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarNullLiteralAccess().getTypeAssignment_0()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1209:1: ( rule__VarNullLiteral__TypeAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1209:2: rule__VarNullLiteral__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__VarNullLiteral__TypeAssignment_0_in_rule__VarNullLiteral__Group__0__Impl2411);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1219:1: rule__VarNullLiteral__Group__1 : rule__VarNullLiteral__Group__1__Impl rule__VarNullLiteral__Group__2 ;
    public final void rule__VarNullLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1223:1: ( rule__VarNullLiteral__Group__1__Impl rule__VarNullLiteral__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1224:2: rule__VarNullLiteral__Group__1__Impl rule__VarNullLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__VarNullLiteral__Group__1__Impl_in_rule__VarNullLiteral__Group__12441);
            rule__VarNullLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarNullLiteral__Group__2_in_rule__VarNullLiteral__Group__12444);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1231:1: rule__VarNullLiteral__Group__1__Impl : ( ( rule__VarNullLiteral__NameAssignment_1 ) ) ;
    public final void rule__VarNullLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1235:1: ( ( ( rule__VarNullLiteral__NameAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1236:1: ( ( rule__VarNullLiteral__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1236:1: ( ( rule__VarNullLiteral__NameAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1237:1: ( rule__VarNullLiteral__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarNullLiteralAccess().getNameAssignment_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1238:1: ( rule__VarNullLiteral__NameAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1238:2: rule__VarNullLiteral__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VarNullLiteral__NameAssignment_1_in_rule__VarNullLiteral__Group__1__Impl2471);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1248:1: rule__VarNullLiteral__Group__2 : rule__VarNullLiteral__Group__2__Impl rule__VarNullLiteral__Group__3 ;
    public final void rule__VarNullLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1252:1: ( rule__VarNullLiteral__Group__2__Impl rule__VarNullLiteral__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1253:2: rule__VarNullLiteral__Group__2__Impl rule__VarNullLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__VarNullLiteral__Group__2__Impl_in_rule__VarNullLiteral__Group__22501);
            rule__VarNullLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarNullLiteral__Group__3_in_rule__VarNullLiteral__Group__22504);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1260:1: rule__VarNullLiteral__Group__2__Impl : ( '=' ) ;
    public final void rule__VarNullLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1264:1: ( ( '=' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1265:1: ( '=' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1265:1: ( '=' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1266:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarNullLiteralAccess().getEqualsSignKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__VarNullLiteral__Group__2__Impl2532); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1279:1: rule__VarNullLiteral__Group__3 : rule__VarNullLiteral__Group__3__Impl ;
    public final void rule__VarNullLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1283:1: ( rule__VarNullLiteral__Group__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1284:2: rule__VarNullLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VarNullLiteral__Group__3__Impl_in_rule__VarNullLiteral__Group__32563);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1290:1: rule__VarNullLiteral__Group__3__Impl : ( 'null' ) ;
    public final void rule__VarNullLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1294:1: ( ( 'null' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1295:1: ( 'null' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1295:1: ( 'null' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1296:1: 'null'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarNullLiteralAccess().getNullKeyword_3()); 
            }
            match(input,22,FOLLOW_22_in_rule__VarNullLiteral__Group__3__Impl2591); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1317:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1321:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1322:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__VarDeclaration__Group__0__Impl_in_rule__VarDeclaration__Group__02630);
            rule__VarDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarDeclaration__Group__1_in_rule__VarDeclaration__Group__02633);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1329:1: rule__VarDeclaration__Group__0__Impl : ( ( rule__VarDeclaration__TypeAssignment_0 ) ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1333:1: ( ( ( rule__VarDeclaration__TypeAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1334:1: ( ( rule__VarDeclaration__TypeAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1334:1: ( ( rule__VarDeclaration__TypeAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1335:1: ( rule__VarDeclaration__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getTypeAssignment_0()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1336:1: ( rule__VarDeclaration__TypeAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1336:2: rule__VarDeclaration__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__VarDeclaration__TypeAssignment_0_in_rule__VarDeclaration__Group__0__Impl2660);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1346:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1350:1: ( rule__VarDeclaration__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1351:2: rule__VarDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VarDeclaration__Group__1__Impl_in_rule__VarDeclaration__Group__12690);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1357:1: rule__VarDeclaration__Group__1__Impl : ( ( rule__VarDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1361:1: ( ( ( rule__VarDeclaration__NameAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1362:1: ( ( rule__VarDeclaration__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1362:1: ( ( rule__VarDeclaration__NameAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1363:1: ( rule__VarDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getNameAssignment_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1364:1: ( rule__VarDeclaration__NameAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1364:2: rule__VarDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VarDeclaration__NameAssignment_1_in_rule__VarDeclaration__Group__1__Impl2717);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1378:1: rule__VarDeclarationParam__Group__0 : rule__VarDeclarationParam__Group__0__Impl rule__VarDeclarationParam__Group__1 ;
    public final void rule__VarDeclarationParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1382:1: ( rule__VarDeclarationParam__Group__0__Impl rule__VarDeclarationParam__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1383:2: rule__VarDeclarationParam__Group__0__Impl rule__VarDeclarationParam__Group__1
            {
            pushFollow(FOLLOW_rule__VarDeclarationParam__Group__0__Impl_in_rule__VarDeclarationParam__Group__02751);
            rule__VarDeclarationParam__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarDeclarationParam__Group__1_in_rule__VarDeclarationParam__Group__02754);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1390:1: rule__VarDeclarationParam__Group__0__Impl : ( ( rule__VarDeclarationParam__TypeAssignment_0 ) ) ;
    public final void rule__VarDeclarationParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1394:1: ( ( ( rule__VarDeclarationParam__TypeAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1395:1: ( ( rule__VarDeclarationParam__TypeAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1395:1: ( ( rule__VarDeclarationParam__TypeAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1396:1: ( rule__VarDeclarationParam__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationParamAccess().getTypeAssignment_0()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1397:1: ( rule__VarDeclarationParam__TypeAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1397:2: rule__VarDeclarationParam__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__VarDeclarationParam__TypeAssignment_0_in_rule__VarDeclarationParam__Group__0__Impl2781);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1407:1: rule__VarDeclarationParam__Group__1 : rule__VarDeclarationParam__Group__1__Impl ;
    public final void rule__VarDeclarationParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1411:1: ( rule__VarDeclarationParam__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1412:2: rule__VarDeclarationParam__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VarDeclarationParam__Group__1__Impl_in_rule__VarDeclarationParam__Group__12811);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1418:1: rule__VarDeclarationParam__Group__1__Impl : ( ( rule__VarDeclarationParam__NameAssignment_1 ) ) ;
    public final void rule__VarDeclarationParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1422:1: ( ( ( rule__VarDeclarationParam__NameAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1423:1: ( ( rule__VarDeclarationParam__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1423:1: ( ( rule__VarDeclarationParam__NameAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1424:1: ( rule__VarDeclarationParam__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationParamAccess().getNameAssignment_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1425:1: ( rule__VarDeclarationParam__NameAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1425:2: rule__VarDeclarationParam__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VarDeclarationParam__NameAssignment_1_in_rule__VarDeclarationParam__Group__1__Impl2838);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1439:1: rule__MethodCall__Group__0 : rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 ;
    public final void rule__MethodCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1443:1: ( rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1444:2: rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__0__Impl_in_rule__MethodCall__Group__02872);
            rule__MethodCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MethodCall__Group__1_in_rule__MethodCall__Group__02875);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1451:1: rule__MethodCall__Group__0__Impl : ( ( rule__MethodCall__NameCalleeAssignment_0 ) ) ;
    public final void rule__MethodCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1455:1: ( ( ( rule__MethodCall__NameCalleeAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1456:1: ( ( rule__MethodCall__NameCalleeAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1456:1: ( ( rule__MethodCall__NameCalleeAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1457:1: ( rule__MethodCall__NameCalleeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getNameCalleeAssignment_0()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1458:1: ( rule__MethodCall__NameCalleeAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1458:2: rule__MethodCall__NameCalleeAssignment_0
            {
            pushFollow(FOLLOW_rule__MethodCall__NameCalleeAssignment_0_in_rule__MethodCall__Group__0__Impl2902);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1468:1: rule__MethodCall__Group__1 : rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2 ;
    public final void rule__MethodCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1472:1: ( rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1473:2: rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__1__Impl_in_rule__MethodCall__Group__12932);
            rule__MethodCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MethodCall__Group__2_in_rule__MethodCall__Group__12935);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1480:1: rule__MethodCall__Group__1__Impl : ( '.' ) ;
    public final void rule__MethodCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1484:1: ( ( '.' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1485:1: ( '.' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1485:1: ( '.' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1486:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getFullStopKeyword_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__MethodCall__Group__1__Impl2963); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1499:1: rule__MethodCall__Group__2 : rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3 ;
    public final void rule__MethodCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1503:1: ( rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1504:2: rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__2__Impl_in_rule__MethodCall__Group__22994);
            rule__MethodCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MethodCall__Group__3_in_rule__MethodCall__Group__22997);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1511:1: rule__MethodCall__Group__2__Impl : ( ( rule__MethodCall__MethodAssignment_2 ) ) ;
    public final void rule__MethodCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1515:1: ( ( ( rule__MethodCall__MethodAssignment_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1516:1: ( ( rule__MethodCall__MethodAssignment_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1516:1: ( ( rule__MethodCall__MethodAssignment_2 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1517:1: ( rule__MethodCall__MethodAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getMethodAssignment_2()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1518:1: ( rule__MethodCall__MethodAssignment_2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1518:2: rule__MethodCall__MethodAssignment_2
            {
            pushFollow(FOLLOW_rule__MethodCall__MethodAssignment_2_in_rule__MethodCall__Group__2__Impl3024);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1528:1: rule__MethodCall__Group__3 : rule__MethodCall__Group__3__Impl rule__MethodCall__Group__4 ;
    public final void rule__MethodCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1532:1: ( rule__MethodCall__Group__3__Impl rule__MethodCall__Group__4 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1533:2: rule__MethodCall__Group__3__Impl rule__MethodCall__Group__4
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__3__Impl_in_rule__MethodCall__Group__33054);
            rule__MethodCall__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MethodCall__Group__4_in_rule__MethodCall__Group__33057);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1540:1: rule__MethodCall__Group__3__Impl : ( '(' ) ;
    public final void rule__MethodCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1544:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1545:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1545:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1546:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,13,FOLLOW_13_in_rule__MethodCall__Group__3__Impl3085); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1559:1: rule__MethodCall__Group__4 : rule__MethodCall__Group__4__Impl rule__MethodCall__Group__5 ;
    public final void rule__MethodCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1563:1: ( rule__MethodCall__Group__4__Impl rule__MethodCall__Group__5 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1564:2: rule__MethodCall__Group__4__Impl rule__MethodCall__Group__5
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__4__Impl_in_rule__MethodCall__Group__43116);
            rule__MethodCall__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MethodCall__Group__5_in_rule__MethodCall__Group__43119);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1571:1: rule__MethodCall__Group__4__Impl : ( ( rule__MethodCall__NameCallerAssignment_4 )? ) ;
    public final void rule__MethodCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1575:1: ( ( ( rule__MethodCall__NameCallerAssignment_4 )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1576:1: ( ( rule__MethodCall__NameCallerAssignment_4 )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1576:1: ( ( rule__MethodCall__NameCallerAssignment_4 )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1577:1: ( rule__MethodCall__NameCallerAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getNameCallerAssignment_4()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1578:1: ( rule__MethodCall__NameCallerAssignment_4 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1578:2: rule__MethodCall__NameCallerAssignment_4
                    {
                    pushFollow(FOLLOW_rule__MethodCall__NameCallerAssignment_4_in_rule__MethodCall__Group__4__Impl3146);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1588:1: rule__MethodCall__Group__5 : rule__MethodCall__Group__5__Impl ;
    public final void rule__MethodCall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1592:1: ( rule__MethodCall__Group__5__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1593:2: rule__MethodCall__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__5__Impl_in_rule__MethodCall__Group__53177);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1599:1: rule__MethodCall__Group__5__Impl : ( ')' ) ;
    public final void rule__MethodCall__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1603:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1604:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1604:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1605:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,14,FOLLOW_14_in_rule__MethodCall__Group__5__Impl3205); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1630:1: rule__StaticMethodCall__Group__0 : rule__StaticMethodCall__Group__0__Impl rule__StaticMethodCall__Group__1 ;
    public final void rule__StaticMethodCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1634:1: ( rule__StaticMethodCall__Group__0__Impl rule__StaticMethodCall__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1635:2: rule__StaticMethodCall__Group__0__Impl rule__StaticMethodCall__Group__1
            {
            pushFollow(FOLLOW_rule__StaticMethodCall__Group__0__Impl_in_rule__StaticMethodCall__Group__03248);
            rule__StaticMethodCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StaticMethodCall__Group__1_in_rule__StaticMethodCall__Group__03251);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1642:1: rule__StaticMethodCall__Group__0__Impl : ( ( rule__StaticMethodCall__MethodAssignment_0 ) ) ;
    public final void rule__StaticMethodCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1646:1: ( ( ( rule__StaticMethodCall__MethodAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1647:1: ( ( rule__StaticMethodCall__MethodAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1647:1: ( ( rule__StaticMethodCall__MethodAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1648:1: ( rule__StaticMethodCall__MethodAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticMethodCallAccess().getMethodAssignment_0()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1649:1: ( rule__StaticMethodCall__MethodAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1649:2: rule__StaticMethodCall__MethodAssignment_0
            {
            pushFollow(FOLLOW_rule__StaticMethodCall__MethodAssignment_0_in_rule__StaticMethodCall__Group__0__Impl3278);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1659:1: rule__StaticMethodCall__Group__1 : rule__StaticMethodCall__Group__1__Impl rule__StaticMethodCall__Group__2 ;
    public final void rule__StaticMethodCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1663:1: ( rule__StaticMethodCall__Group__1__Impl rule__StaticMethodCall__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1664:2: rule__StaticMethodCall__Group__1__Impl rule__StaticMethodCall__Group__2
            {
            pushFollow(FOLLOW_rule__StaticMethodCall__Group__1__Impl_in_rule__StaticMethodCall__Group__13308);
            rule__StaticMethodCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StaticMethodCall__Group__2_in_rule__StaticMethodCall__Group__13311);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1671:1: rule__StaticMethodCall__Group__1__Impl : ( '(' ) ;
    public final void rule__StaticMethodCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1675:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1676:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1676:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1677:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticMethodCallAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,13,FOLLOW_13_in_rule__StaticMethodCall__Group__1__Impl3339); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1690:1: rule__StaticMethodCall__Group__2 : rule__StaticMethodCall__Group__2__Impl rule__StaticMethodCall__Group__3 ;
    public final void rule__StaticMethodCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1694:1: ( rule__StaticMethodCall__Group__2__Impl rule__StaticMethodCall__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1695:2: rule__StaticMethodCall__Group__2__Impl rule__StaticMethodCall__Group__3
            {
            pushFollow(FOLLOW_rule__StaticMethodCall__Group__2__Impl_in_rule__StaticMethodCall__Group__23370);
            rule__StaticMethodCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StaticMethodCall__Group__3_in_rule__StaticMethodCall__Group__23373);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1702:1: rule__StaticMethodCall__Group__2__Impl : ( ( rule__StaticMethodCall__NameAssignment_2 ) ) ;
    public final void rule__StaticMethodCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1706:1: ( ( ( rule__StaticMethodCall__NameAssignment_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1707:1: ( ( rule__StaticMethodCall__NameAssignment_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1707:1: ( ( rule__StaticMethodCall__NameAssignment_2 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1708:1: ( rule__StaticMethodCall__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticMethodCallAccess().getNameAssignment_2()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1709:1: ( rule__StaticMethodCall__NameAssignment_2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1709:2: rule__StaticMethodCall__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__StaticMethodCall__NameAssignment_2_in_rule__StaticMethodCall__Group__2__Impl3400);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1719:1: rule__StaticMethodCall__Group__3 : rule__StaticMethodCall__Group__3__Impl ;
    public final void rule__StaticMethodCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1723:1: ( rule__StaticMethodCall__Group__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1724:2: rule__StaticMethodCall__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StaticMethodCall__Group__3__Impl_in_rule__StaticMethodCall__Group__33430);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1730:1: rule__StaticMethodCall__Group__3__Impl : ( ')' ) ;
    public final void rule__StaticMethodCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1734:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1735:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1735:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1736:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticMethodCallAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,14,FOLLOW_14_in_rule__StaticMethodCall__Group__3__Impl3458); if (state.failed) return ;
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


    // $ANTLR start "rule__WildcardNameConcatenated__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1757:1: rule__WildcardNameConcatenated__Group__0 : rule__WildcardNameConcatenated__Group__0__Impl rule__WildcardNameConcatenated__Group__1 ;
    public final void rule__WildcardNameConcatenated__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1761:1: ( rule__WildcardNameConcatenated__Group__0__Impl rule__WildcardNameConcatenated__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1762:2: rule__WildcardNameConcatenated__Group__0__Impl rule__WildcardNameConcatenated__Group__1
            {
            pushFollow(FOLLOW_rule__WildcardNameConcatenated__Group__0__Impl_in_rule__WildcardNameConcatenated__Group__03497);
            rule__WildcardNameConcatenated__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__WildcardNameConcatenated__Group__1_in_rule__WildcardNameConcatenated__Group__03500);
            rule__WildcardNameConcatenated__Group__1();

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
    // $ANTLR end "rule__WildcardNameConcatenated__Group__0"


    // $ANTLR start "rule__WildcardNameConcatenated__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1769:1: rule__WildcardNameConcatenated__Group__0__Impl : ( ruleWildcardName ) ;
    public final void rule__WildcardNameConcatenated__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1773:1: ( ( ruleWildcardName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1774:1: ( ruleWildcardName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1774:1: ( ruleWildcardName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1775:1: ruleWildcardName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNameConcatenatedAccess().getWildcardNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleWildcardName_in_rule__WildcardNameConcatenated__Group__0__Impl3527);
            ruleWildcardName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWildcardNameConcatenatedAccess().getWildcardNameParserRuleCall_0()); 
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
    // $ANTLR end "rule__WildcardNameConcatenated__Group__0__Impl"


    // $ANTLR start "rule__WildcardNameConcatenated__Group__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1786:1: rule__WildcardNameConcatenated__Group__1 : rule__WildcardNameConcatenated__Group__1__Impl ;
    public final void rule__WildcardNameConcatenated__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1790:1: ( rule__WildcardNameConcatenated__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1791:2: rule__WildcardNameConcatenated__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WildcardNameConcatenated__Group__1__Impl_in_rule__WildcardNameConcatenated__Group__13556);
            rule__WildcardNameConcatenated__Group__1__Impl();

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
    // $ANTLR end "rule__WildcardNameConcatenated__Group__1"


    // $ANTLR start "rule__WildcardNameConcatenated__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1797:1: rule__WildcardNameConcatenated__Group__1__Impl : ( ( rule__WildcardNameConcatenated__Group_1__0 )* ) ;
    public final void rule__WildcardNameConcatenated__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1801:1: ( ( ( rule__WildcardNameConcatenated__Group_1__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1802:1: ( ( rule__WildcardNameConcatenated__Group_1__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1802:1: ( ( rule__WildcardNameConcatenated__Group_1__0 )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1803:1: ( rule__WildcardNameConcatenated__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNameConcatenatedAccess().getGroup_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1804:1: ( rule__WildcardNameConcatenated__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1804:2: rule__WildcardNameConcatenated__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__WildcardNameConcatenated__Group_1__0_in_rule__WildcardNameConcatenated__Group__1__Impl3583);
            	    rule__WildcardNameConcatenated__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWildcardNameConcatenatedAccess().getGroup_1()); 
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
    // $ANTLR end "rule__WildcardNameConcatenated__Group__1__Impl"


    // $ANTLR start "rule__WildcardNameConcatenated__Group_1__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1818:1: rule__WildcardNameConcatenated__Group_1__0 : rule__WildcardNameConcatenated__Group_1__0__Impl rule__WildcardNameConcatenated__Group_1__1 ;
    public final void rule__WildcardNameConcatenated__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1822:1: ( rule__WildcardNameConcatenated__Group_1__0__Impl rule__WildcardNameConcatenated__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1823:2: rule__WildcardNameConcatenated__Group_1__0__Impl rule__WildcardNameConcatenated__Group_1__1
            {
            pushFollow(FOLLOW_rule__WildcardNameConcatenated__Group_1__0__Impl_in_rule__WildcardNameConcatenated__Group_1__03618);
            rule__WildcardNameConcatenated__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__WildcardNameConcatenated__Group_1__1_in_rule__WildcardNameConcatenated__Group_1__03621);
            rule__WildcardNameConcatenated__Group_1__1();

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
    // $ANTLR end "rule__WildcardNameConcatenated__Group_1__0"


    // $ANTLR start "rule__WildcardNameConcatenated__Group_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1830:1: rule__WildcardNameConcatenated__Group_1__0__Impl : ( '.' ) ;
    public final void rule__WildcardNameConcatenated__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1834:1: ( ( '.' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1835:1: ( '.' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1835:1: ( '.' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1836:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNameConcatenatedAccess().getFullStopKeyword_1_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__WildcardNameConcatenated__Group_1__0__Impl3649); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWildcardNameConcatenatedAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__WildcardNameConcatenated__Group_1__0__Impl"


    // $ANTLR start "rule__WildcardNameConcatenated__Group_1__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1849:1: rule__WildcardNameConcatenated__Group_1__1 : rule__WildcardNameConcatenated__Group_1__1__Impl ;
    public final void rule__WildcardNameConcatenated__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1853:1: ( rule__WildcardNameConcatenated__Group_1__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1854:2: rule__WildcardNameConcatenated__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__WildcardNameConcatenated__Group_1__1__Impl_in_rule__WildcardNameConcatenated__Group_1__13680);
            rule__WildcardNameConcatenated__Group_1__1__Impl();

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
    // $ANTLR end "rule__WildcardNameConcatenated__Group_1__1"


    // $ANTLR start "rule__WildcardNameConcatenated__Group_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1860:1: rule__WildcardNameConcatenated__Group_1__1__Impl : ( ruleWildcardName ) ;
    public final void rule__WildcardNameConcatenated__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1864:1: ( ( ruleWildcardName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1865:1: ( ruleWildcardName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1865:1: ( ruleWildcardName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1866:1: ruleWildcardName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNameConcatenatedAccess().getWildcardNameParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleWildcardName_in_rule__WildcardNameConcatenated__Group_1__1__Impl3707);
            ruleWildcardName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWildcardNameConcatenatedAccess().getWildcardNameParserRuleCall_1_1()); 
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
    // $ANTLR end "rule__WildcardNameConcatenated__Group_1__1__Impl"


    // $ANTLR start "rule__Model__VarsAssignment_1_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1882:1: rule__Model__VarsAssignment_1_1 : ( ruleVarDeclarationParam ) ;
    public final void rule__Model__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1886:1: ( ( ruleVarDeclarationParam ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1887:1: ( ruleVarDeclarationParam )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1887:1: ( ruleVarDeclarationParam )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1888:1: ruleVarDeclarationParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getVarsVarDeclarationParamParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleVarDeclarationParam_in_rule__Model__VarsAssignment_1_13745);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1897:1: rule__Model__VarsAssignment_1_2_1 : ( ruleVarDeclarationParam ) ;
    public final void rule__Model__VarsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1901:1: ( ( ruleVarDeclarationParam ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1902:1: ( ruleVarDeclarationParam )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1902:1: ( ruleVarDeclarationParam )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1903:1: ruleVarDeclarationParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getVarsVarDeclarationParamParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleVarDeclarationParam_in_rule__Model__VarsAssignment_1_2_13776);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1912:1: rule__Model__StatementsAssignment_2_1 : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1916:1: ( ( ruleStatement ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1917:1: ( ruleStatement )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1917:1: ( ruleStatement )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1918:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Model__StatementsAssignment_2_13807);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1927:1: rule__VarInitialisation__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__VarInitialisation__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1931:1: ( ( ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1932:1: ( ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1932:1: ( ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1933:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInitialisationAccess().getTypeTypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__VarInitialisation__TypeAssignment_03838);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarInitialisationAccess().getTypeTypeParserRuleCall_0_0()); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1942:1: rule__VarInitialisation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VarInitialisation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1946:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1947:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1947:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1948:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInitialisationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarInitialisation__NameAssignment_13869); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1957:1: rule__VarNullLiteral__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__VarNullLiteral__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1961:1: ( ( ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1962:1: ( ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1962:1: ( ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1963:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarNullLiteralAccess().getTypeTypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__VarNullLiteral__TypeAssignment_03900);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarNullLiteralAccess().getTypeTypeParserRuleCall_0_0()); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1972:1: rule__VarNullLiteral__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VarNullLiteral__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1976:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1977:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1977:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1978:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarNullLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarNullLiteral__NameAssignment_13931); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1987:1: rule__VarDeclaration__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__VarDeclaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1991:1: ( ( ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1992:1: ( ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1992:1: ( ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1993:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__VarDeclaration__TypeAssignment_03962);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2002:1: rule__VarDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VarDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2006:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2007:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2007:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2008:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDeclaration__NameAssignment_13993); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2017:1: rule__VarDeclarationParam__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__VarDeclarationParam__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2021:1: ( ( ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2022:1: ( ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2022:1: ( ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2023:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationParamAccess().getTypeTypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__VarDeclarationParam__TypeAssignment_04024);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationParamAccess().getTypeTypeParserRuleCall_0_0()); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2032:1: rule__VarDeclarationParam__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VarDeclarationParam__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2036:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2037:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2037:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2038:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationParamAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDeclarationParam__NameAssignment_14055); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2047:1: rule__MethodCall__NameCalleeAssignment_0 : ( ruleName ) ;
    public final void rule__MethodCall__NameCalleeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2051:1: ( ( ruleName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2052:1: ( ruleName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2052:1: ( ruleName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2053:1: ruleName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getNameCalleeNameParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleName_in_rule__MethodCall__NameCalleeAssignment_04086);
            ruleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getNameCalleeNameParserRuleCall_0_0()); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2062:1: rule__MethodCall__MethodAssignment_2 : ( ruleWildcardName ) ;
    public final void rule__MethodCall__MethodAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2066:1: ( ( ruleWildcardName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2067:1: ( ruleWildcardName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2067:1: ( ruleWildcardName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2068:1: ruleWildcardName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getMethodWildcardNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleWildcardName_in_rule__MethodCall__MethodAssignment_24117);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2077:1: rule__MethodCall__NameCallerAssignment_4 : ( ruleName ) ;
    public final void rule__MethodCall__NameCallerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2081:1: ( ( ruleName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2082:1: ( ruleName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2082:1: ( ruleName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2083:1: ruleName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getNameCallerNameParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleName_in_rule__MethodCall__NameCallerAssignment_44148);
            ruleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getNameCallerNameParserRuleCall_4_0()); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2092:1: rule__StaticMethodCall__MethodAssignment_0 : ( ruleWildcardNameConcatenated ) ;
    public final void rule__StaticMethodCall__MethodAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2096:1: ( ( ruleWildcardNameConcatenated ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2097:1: ( ruleWildcardNameConcatenated )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2097:1: ( ruleWildcardNameConcatenated )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2098:1: ruleWildcardNameConcatenated
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticMethodCallAccess().getMethodWildcardNameConcatenatedParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleWildcardNameConcatenated_in_rule__StaticMethodCall__MethodAssignment_04179);
            ruleWildcardNameConcatenated();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticMethodCallAccess().getMethodWildcardNameConcatenatedParserRuleCall_0_0()); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2107:1: rule__StaticMethodCall__NameAssignment_2 : ( ruleName ) ;
    public final void rule__StaticMethodCall__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2111:1: ( ( ruleName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2112:1: ( ruleName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2112:1: ( ruleName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2113:1: ruleName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticMethodCallAccess().getNameNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleName_in_rule__StaticMethodCall__NameAssignment_24210);
            ruleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticMethodCallAccess().getNameNameParserRuleCall_2_0()); 
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


    // $ANTLR start "rule__Type__ValueAssignment"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2122:1: rule__Type__ValueAssignment : ( ruleWildcardNameConcatenated ) ;
    public final void rule__Type__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2126:1: ( ( ruleWildcardNameConcatenated ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2127:1: ( ruleWildcardNameConcatenated )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2127:1: ( ruleWildcardNameConcatenated )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2128:1: ruleWildcardNameConcatenated
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getValueWildcardNameConcatenatedParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleWildcardNameConcatenated_in_rule__Type__ValueAssignment4241);
            ruleWildcardNameConcatenated();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getValueWildcardNameConcatenatedParserRuleCall_0()); 
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
    // $ANTLR end "rule__Type__ValueAssignment"


    // $ANTLR start "rule__Name__ValueAssignment"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2137:1: rule__Name__ValueAssignment : ( RULE_ID ) ;
    public final void rule__Name__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2141:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2142:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2142:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2143:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameAccess().getValueIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Name__ValueAssignment4272); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameAccess().getValueIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__Name__ValueAssignment"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\22\uffff";
    static final String DFA3_eofS =
        "\4\uffff\1\11\12\uffff\1\11\2\uffff";
    static final String DFA3_minS =
        "\10\4\1\13\1\uffff\3\4\2\uffff\3\4";
    static final String DFA3_maxS =
        "\1\14\6\27\1\14\1\26\1\uffff\3\27\2\uffff\3\27";
    static final String DFA3_acceptS =
        "\11\uffff\1\3\3\uffff\1\1\1\2\3\uffff";
    static final String DFA3_specialS =
        "\22\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\6\uffff\1\2\1\3",
            "\1\4\6\uffff\1\5\1\6\12\uffff\1\7",
            "\1\4\6\uffff\1\5\1\6\12\uffff\1\7",
            "\1\4\6\uffff\1\5\1\6\12\uffff\1\7",
            "\1\4\6\uffff\1\5\1\6\4\uffff\4\11\1\10\1\uffff\1\7",
            "\1\4\6\uffff\1\5\1\6\12\uffff\1\7",
            "\1\4\6\uffff\1\5\1\6\12\uffff\1\7",
            "\1\12\6\uffff\1\13\1\14",
            "\1\15\12\uffff\1\16",
            "",
            "\1\17\6\uffff\1\20\1\21\12\uffff\1\7",
            "\1\17\6\uffff\1\20\1\21\12\uffff\1\7",
            "\1\17\6\uffff\1\20\1\21\12\uffff\1\7",
            "",
            "",
            "\1\17\6\uffff\1\20\1\21\4\uffff\4\11\1\10\1\uffff\1\7",
            "\1\17\6\uffff\1\20\1\21\12\uffff\1\7",
            "\1\17\6\uffff\1\20\1\21\12\uffff\1\7"
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
            return "432:1: rule__Statement__Alternatives_0_1 : ( ( ruleVarInitialisation ) | ( ruleVarNullLiteral ) | ( ruleVarDeclaration ) );";
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
    public static final BitSet FOLLOW_ruleType_in_entryRuleType547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__ValueAssignment_in_ruleType580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__ValueAssignment_in_ruleName640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardNameConcatenated_in_entryRuleWildcardNameConcatenated667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWildcardNameConcatenated674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WildcardNameConcatenated__Group__0_in_ruleWildcardNameConcatenated700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardName_in_entryRuleWildcardName727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWildcardName734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WildcardName__Alternatives_in_ruleWildcardName762 = new BitSet(new long[]{0x0000000000001812L});
    public static final BitSet FOLLOW_rule__WildcardName__Alternatives_in_ruleWildcardName774 = new BitSet(new long[]{0x0000000000001812L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Alternatives813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__0_in_rule__Statement__Alternatives849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInitialisation_in_rule__Statement__Alternatives_0_1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarNullLiteral_in_rule__Statement__Alternatives_0_1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_rule__Statement__Alternatives_0_1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WildcardName__Alternatives948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__WildcardName__Alternatives966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__WildcardName__Alternatives986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01018 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11079 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__0_in_rule__Model__Group__1__Impl1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_2__0_in_rule__Model__Group__2__Impl1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__0__Impl_in_rule__Model__Group_1__01204 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_rule__Model__Group_1__1_in_rule__Model__Group_1__01207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Model__Group_1__0__Impl1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__1__Impl_in_rule__Model__Group_1__11266 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Model__Group_1__2_in_rule__Model__Group_1__11269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__VarsAssignment_1_1_in_rule__Model__Group_1__1__Impl1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__2__Impl_in_rule__Model__Group_1__21326 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Model__Group_1__3_in_rule__Model__Group_1__21329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1_2__0_in_rule__Model__Group_1__2__Impl1356 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__3__Impl_in_rule__Model__Group_1__31387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Model__Group_1__3__Impl1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1_2__0__Impl_in_rule__Model__Group_1_2__01454 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_rule__Model__Group_1_2__1_in_rule__Model__Group_1_2__01457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Model__Group_1_2__0__Impl1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1_2__1__Impl_in_rule__Model__Group_1_2__11516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__VarsAssignment_1_2_1_in_rule__Model__Group_1_2__1__Impl1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_2__0__Impl_in_rule__Model__Group_2__01577 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_rule__Model__Group_2__1_in_rule__Model__Group_2__01580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Model__Group_2__0__Impl1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_2__1__Impl_in_rule__Model__Group_2__11639 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_rule__Model__Group_2__2_in_rule__Model__Group_2__11642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__StatementsAssignment_2_1_in_rule__Model__Group_2__1__Impl1669 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_rule__Model__Group_2__2__Impl_in_rule__Model__Group_2__21700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Model__Group_2__2__Impl1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__01765 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__01768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Statement__Group_0__0__Impl1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__11827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_0_1_in_rule__Statement__Group_0__1__Impl1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__01888 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__01891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Statement__Group_1__0__Impl1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__11950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodCall_in_rule__Statement__Group_1__1__Impl1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__0__Impl_in_rule__Statement__Group_2__02010 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__1_in_rule__Statement__Group_2__02013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Statement__Group_2__0__Impl2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__1__Impl_in_rule__Statement__Group_2__12072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticMethodCall_in_rule__Statement__Group_2__1__Impl2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__0__Impl_in_rule__VarInitialisation__Group__02132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__1_in_rule__VarInitialisation__Group__02135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInitialisation__TypeAssignment_0_in_rule__VarInitialisation__Group__0__Impl2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__1__Impl_in_rule__VarInitialisation__Group__12192 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__2_in_rule__VarInitialisation__Group__12195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInitialisation__NameAssignment_1_in_rule__VarInitialisation__Group__1__Impl2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__2__Impl_in_rule__VarInitialisation__Group__22252 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__3_in_rule__VarInitialisation__Group__22255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__VarInitialisation__Group__2__Impl2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__3__Impl_in_rule__VarInitialisation__Group__32314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__VarInitialisation__Group__3__Impl2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarNullLiteral__Group__0__Impl_in_rule__VarNullLiteral__Group__02381 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarNullLiteral__Group__1_in_rule__VarNullLiteral__Group__02384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarNullLiteral__TypeAssignment_0_in_rule__VarNullLiteral__Group__0__Impl2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarNullLiteral__Group__1__Impl_in_rule__VarNullLiteral__Group__12441 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__VarNullLiteral__Group__2_in_rule__VarNullLiteral__Group__12444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarNullLiteral__NameAssignment_1_in_rule__VarNullLiteral__Group__1__Impl2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarNullLiteral__Group__2__Impl_in_rule__VarNullLiteral__Group__22501 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__VarNullLiteral__Group__3_in_rule__VarNullLiteral__Group__22504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__VarNullLiteral__Group__2__Impl2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarNullLiteral__Group__3__Impl_in_rule__VarNullLiteral__Group__32563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__VarNullLiteral__Group__3__Impl2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__Group__0__Impl_in_rule__VarDeclaration__Group__02630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarDeclaration__Group__1_in_rule__VarDeclaration__Group__02633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__TypeAssignment_0_in_rule__VarDeclaration__Group__0__Impl2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__Group__1__Impl_in_rule__VarDeclaration__Group__12690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__NameAssignment_1_in_rule__VarDeclaration__Group__1__Impl2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclarationParam__Group__0__Impl_in_rule__VarDeclarationParam__Group__02751 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarDeclarationParam__Group__1_in_rule__VarDeclarationParam__Group__02754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclarationParam__TypeAssignment_0_in_rule__VarDeclarationParam__Group__0__Impl2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclarationParam__Group__1__Impl_in_rule__VarDeclarationParam__Group__12811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclarationParam__NameAssignment_1_in_rule__VarDeclarationParam__Group__1__Impl2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__0__Impl_in_rule__MethodCall__Group__02872 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__1_in_rule__MethodCall__Group__02875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__NameCalleeAssignment_0_in_rule__MethodCall__Group__0__Impl2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__1__Impl_in_rule__MethodCall__Group__12932 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__2_in_rule__MethodCall__Group__12935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MethodCall__Group__1__Impl2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__2__Impl_in_rule__MethodCall__Group__22994 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__3_in_rule__MethodCall__Group__22997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__MethodAssignment_2_in_rule__MethodCall__Group__2__Impl3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__3__Impl_in_rule__MethodCall__Group__33054 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__4_in_rule__MethodCall__Group__33057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MethodCall__Group__3__Impl3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__4__Impl_in_rule__MethodCall__Group__43116 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__5_in_rule__MethodCall__Group__43119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__NameCallerAssignment_4_in_rule__MethodCall__Group__4__Impl3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__5__Impl_in_rule__MethodCall__Group__53177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MethodCall__Group__5__Impl3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticMethodCall__Group__0__Impl_in_rule__StaticMethodCall__Group__03248 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__StaticMethodCall__Group__1_in_rule__StaticMethodCall__Group__03251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticMethodCall__MethodAssignment_0_in_rule__StaticMethodCall__Group__0__Impl3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticMethodCall__Group__1__Impl_in_rule__StaticMethodCall__Group__13308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StaticMethodCall__Group__2_in_rule__StaticMethodCall__Group__13311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__StaticMethodCall__Group__1__Impl3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticMethodCall__Group__2__Impl_in_rule__StaticMethodCall__Group__23370 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__StaticMethodCall__Group__3_in_rule__StaticMethodCall__Group__23373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticMethodCall__NameAssignment_2_in_rule__StaticMethodCall__Group__2__Impl3400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticMethodCall__Group__3__Impl_in_rule__StaticMethodCall__Group__33430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__StaticMethodCall__Group__3__Impl3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WildcardNameConcatenated__Group__0__Impl_in_rule__WildcardNameConcatenated__Group__03497 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__WildcardNameConcatenated__Group__1_in_rule__WildcardNameConcatenated__Group__03500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardName_in_rule__WildcardNameConcatenated__Group__0__Impl3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WildcardNameConcatenated__Group__1__Impl_in_rule__WildcardNameConcatenated__Group__13556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WildcardNameConcatenated__Group_1__0_in_rule__WildcardNameConcatenated__Group__1__Impl3583 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__WildcardNameConcatenated__Group_1__0__Impl_in_rule__WildcardNameConcatenated__Group_1__03618 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_rule__WildcardNameConcatenated__Group_1__1_in_rule__WildcardNameConcatenated__Group_1__03621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__WildcardNameConcatenated__Group_1__0__Impl3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WildcardNameConcatenated__Group_1__1__Impl_in_rule__WildcardNameConcatenated__Group_1__13680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardName_in_rule__WildcardNameConcatenated__Group_1__1__Impl3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclarationParam_in_rule__Model__VarsAssignment_1_13745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclarationParam_in_rule__Model__VarsAssignment_1_2_13776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Model__StatementsAssignment_2_13807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__VarInitialisation__TypeAssignment_03838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarInitialisation__NameAssignment_13869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__VarNullLiteral__TypeAssignment_03900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarNullLiteral__NameAssignment_13931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__VarDeclaration__TypeAssignment_03962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDeclaration__NameAssignment_13993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__VarDeclarationParam__TypeAssignment_04024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDeclarationParam__NameAssignment_14055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__MethodCall__NameCalleeAssignment_04086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardName_in_rule__MethodCall__MethodAssignment_24117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__MethodCall__NameCallerAssignment_44148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardNameConcatenated_in_rule__StaticMethodCall__MethodAssignment_04179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__StaticMethodCall__NameAssignment_24210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardNameConcatenated_in_rule__Type__ValueAssignment4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Name__ValueAssignment4272 = new BitSet(new long[]{0x0000000000000002L});

}