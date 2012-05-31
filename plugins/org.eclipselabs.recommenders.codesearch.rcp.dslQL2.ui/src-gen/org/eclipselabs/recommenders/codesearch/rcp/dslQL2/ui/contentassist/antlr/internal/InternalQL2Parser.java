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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'?'", "'('", "')'", "','", "'{'", "'}'", "'var'", "'call'", "'scall'", "'='", "'null'", "'new'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int T__24=24;
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


    // $ANTLR start "entryRuleVarDeclarationParam"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:117:1: entryRuleVarDeclarationParam : ruleVarDeclarationParam EOF ;
    public final void entryRuleVarDeclarationParam() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:118:1: ( ruleVarDeclarationParam EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:119:1: ruleVarDeclarationParam EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationParamRule()); 
            }
            pushFollow(FOLLOW_ruleVarDeclarationParam_in_entryRuleVarDeclarationParam187);
            ruleVarDeclarationParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationParamRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDeclarationParam194); if (state.failed) return ;

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:126:1: ruleVarDeclarationParam : ( ( rule__VarDeclarationParam__Group__0 ) ) ;
    public final void ruleVarDeclarationParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:130:2: ( ( ( rule__VarDeclarationParam__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:131:1: ( ( rule__VarDeclarationParam__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:131:1: ( ( rule__VarDeclarationParam__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:132:1: ( rule__VarDeclarationParam__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationParamAccess().getGroup()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:133:1: ( rule__VarDeclarationParam__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:133:2: rule__VarDeclarationParam__Group__0
            {
            pushFollow(FOLLOW_rule__VarDeclarationParam__Group__0_in_ruleVarDeclarationParam220);
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


    // $ANTLR start "entryRuleVarAssignment"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:173:1: entryRuleVarAssignment : ruleVarAssignment EOF ;
    public final void entryRuleVarAssignment() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:174:1: ( ruleVarAssignment EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:175:1: ruleVarAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleVarAssignment_in_entryRuleVarAssignment307);
            ruleVarAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarAssignment314); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVarAssignment"


    // $ANTLR start "ruleVarAssignment"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:182:1: ruleVarAssignment : ( ( rule__VarAssignment__Group__0 ) ) ;
    public final void ruleVarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:186:2: ( ( ( rule__VarAssignment__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:187:1: ( ( rule__VarAssignment__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:187:1: ( ( rule__VarAssignment__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:188:1: ( rule__VarAssignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignmentAccess().getGroup()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:189:1: ( rule__VarAssignment__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:189:2: rule__VarAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__VarAssignment__Group__0_in_ruleVarAssignment340);
            rule__VarAssignment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignmentAccess().getGroup()); 
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
    // $ANTLR end "ruleVarAssignment"


    // $ANTLR start "entryRuleVarInstanceCreation"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:201:1: entryRuleVarInstanceCreation : ruleVarInstanceCreation EOF ;
    public final void entryRuleVarInstanceCreation() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:202:1: ( ruleVarInstanceCreation EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:203:1: ruleVarInstanceCreation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInstanceCreationRule()); 
            }
            pushFollow(FOLLOW_ruleVarInstanceCreation_in_entryRuleVarInstanceCreation367);
            ruleVarInstanceCreation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarInstanceCreationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarInstanceCreation374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVarInstanceCreation"


    // $ANTLR start "ruleVarInstanceCreation"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:210:1: ruleVarInstanceCreation : ( ( rule__VarInstanceCreation__Group__0 ) ) ;
    public final void ruleVarInstanceCreation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:214:2: ( ( ( rule__VarInstanceCreation__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:215:1: ( ( rule__VarInstanceCreation__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:215:1: ( ( rule__VarInstanceCreation__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:216:1: ( rule__VarInstanceCreation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInstanceCreationAccess().getGroup()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:217:1: ( rule__VarInstanceCreation__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:217:2: rule__VarInstanceCreation__Group__0
            {
            pushFollow(FOLLOW_rule__VarInstanceCreation__Group__0_in_ruleVarInstanceCreation400);
            rule__VarInstanceCreation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarInstanceCreationAccess().getGroup()); 
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
    // $ANTLR end "ruleVarInstanceCreation"


    // $ANTLR start "entryRuleVarDeclaration"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:229:1: entryRuleVarDeclaration : ruleVarDeclaration EOF ;
    public final void entryRuleVarDeclaration() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:230:1: ( ruleVarDeclaration EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:231:1: ruleVarDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVarDeclaration_in_entryRuleVarDeclaration427);
            ruleVarDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDeclaration434); if (state.failed) return ;

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:238:1: ruleVarDeclaration : ( ( rule__VarDeclaration__Group__0 ) ) ;
    public final void ruleVarDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:242:2: ( ( ( rule__VarDeclaration__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:243:1: ( ( rule__VarDeclaration__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:243:1: ( ( rule__VarDeclaration__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:244:1: ( rule__VarDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getGroup()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:245:1: ( rule__VarDeclaration__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:245:2: rule__VarDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__VarDeclaration__Group__0_in_ruleVarDeclaration460);
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


    // $ANTLR start "entryRuleMethodCall"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:257:1: entryRuleMethodCall : ruleMethodCall EOF ;
    public final void entryRuleMethodCall() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:258:1: ( ruleMethodCall EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:259:1: ruleMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallRule()); 
            }
            pushFollow(FOLLOW_ruleMethodCall_in_entryRuleMethodCall487);
            ruleMethodCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodCall494); if (state.failed) return ;

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:266:1: ruleMethodCall : ( ( rule__MethodCall__Group__0 ) ) ;
    public final void ruleMethodCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:270:2: ( ( ( rule__MethodCall__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:271:1: ( ( rule__MethodCall__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:271:1: ( ( rule__MethodCall__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:272:1: ( rule__MethodCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getGroup()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:273:1: ( rule__MethodCall__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:273:2: rule__MethodCall__Group__0
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__0_in_ruleMethodCall520);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:285:1: entryRuleStaticMethodCall : ruleStaticMethodCall EOF ;
    public final void entryRuleStaticMethodCall() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:286:1: ( ruleStaticMethodCall EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:287:1: ruleStaticMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticMethodCallRule()); 
            }
            pushFollow(FOLLOW_ruleStaticMethodCall_in_entryRuleStaticMethodCall547);
            ruleStaticMethodCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticMethodCallRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticMethodCall554); if (state.failed) return ;

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:294:1: ruleStaticMethodCall : ( ( rule__StaticMethodCall__Group__0 ) ) ;
    public final void ruleStaticMethodCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:298:2: ( ( ( rule__StaticMethodCall__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:299:1: ( ( rule__StaticMethodCall__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:299:1: ( ( rule__StaticMethodCall__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:300:1: ( rule__StaticMethodCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticMethodCallAccess().getGroup()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:301:1: ( rule__StaticMethodCall__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:301:2: rule__StaticMethodCall__Group__0
            {
            pushFollow(FOLLOW_rule__StaticMethodCall__Group__0_in_ruleStaticMethodCall580);
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


    // $ANTLR start "entryRuleCalledMethodName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:313:1: entryRuleCalledMethodName : ruleCalledMethodName EOF ;
    public final void entryRuleCalledMethodName() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:314:1: ( ruleCalledMethodName EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:315:1: ruleCalledMethodName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalledMethodNameRule()); 
            }
            pushFollow(FOLLOW_ruleCalledMethodName_in_entryRuleCalledMethodName607);
            ruleCalledMethodName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCalledMethodNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCalledMethodName614); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCalledMethodName"


    // $ANTLR start "ruleCalledMethodName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:322:1: ruleCalledMethodName : ( ( rule__CalledMethodName__ValueAssignment ) ) ;
    public final void ruleCalledMethodName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:326:2: ( ( ( rule__CalledMethodName__ValueAssignment ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:327:1: ( ( rule__CalledMethodName__ValueAssignment ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:327:1: ( ( rule__CalledMethodName__ValueAssignment ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:328:1: ( rule__CalledMethodName__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalledMethodNameAccess().getValueAssignment()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:329:1: ( rule__CalledMethodName__ValueAssignment )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:329:2: rule__CalledMethodName__ValueAssignment
            {
            pushFollow(FOLLOW_rule__CalledMethodName__ValueAssignment_in_ruleCalledMethodName640);
            rule__CalledMethodName__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCalledMethodNameAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleCalledMethodName"


    // $ANTLR start "entryRuleType"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:341:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:342:1: ( ruleType EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:343:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType667);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType674); if (state.failed) return ;

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:350:1: ruleType : ( ( rule__Type__ValueAssignment ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:354:2: ( ( ( rule__Type__ValueAssignment ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:355:1: ( ( rule__Type__ValueAssignment ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:355:1: ( ( rule__Type__ValueAssignment ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:356:1: ( rule__Type__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getValueAssignment()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:357:1: ( rule__Type__ValueAssignment )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:357:2: rule__Type__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Type__ValueAssignment_in_ruleType700);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:369:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:370:1: ( ruleName EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:371:1: ruleName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRule()); 
            }
            pushFollow(FOLLOW_ruleName_in_entryRuleName727);
            ruleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleName734); if (state.failed) return ;

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:378:1: ruleName : ( ( rule__Name__ValueAssignment ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:382:2: ( ( ( rule__Name__ValueAssignment ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:383:1: ( ( rule__Name__ValueAssignment ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:383:1: ( ( rule__Name__ValueAssignment ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:384:1: ( rule__Name__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameAccess().getValueAssignment()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:385:1: ( rule__Name__ValueAssignment )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:385:2: rule__Name__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Name__ValueAssignment_in_ruleName760);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:397:1: entryRuleWildcardNameConcatenated : ruleWildcardNameConcatenated EOF ;
    public final void entryRuleWildcardNameConcatenated() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:398:1: ( ruleWildcardNameConcatenated EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:399:1: ruleWildcardNameConcatenated EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNameConcatenatedRule()); 
            }
            pushFollow(FOLLOW_ruleWildcardNameConcatenated_in_entryRuleWildcardNameConcatenated787);
            ruleWildcardNameConcatenated();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWildcardNameConcatenatedRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWildcardNameConcatenated794); if (state.failed) return ;

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:406:1: ruleWildcardNameConcatenated : ( ( rule__WildcardNameConcatenated__Group__0 ) ) ;
    public final void ruleWildcardNameConcatenated() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:410:2: ( ( ( rule__WildcardNameConcatenated__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:411:1: ( ( rule__WildcardNameConcatenated__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:411:1: ( ( rule__WildcardNameConcatenated__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:412:1: ( rule__WildcardNameConcatenated__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNameConcatenatedAccess().getGroup()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:413:1: ( rule__WildcardNameConcatenated__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:413:2: rule__WildcardNameConcatenated__Group__0
            {
            pushFollow(FOLLOW_rule__WildcardNameConcatenated__Group__0_in_ruleWildcardNameConcatenated820);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:425:1: entryRuleWildcardName : ruleWildcardName EOF ;
    public final void entryRuleWildcardName() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:426:1: ( ruleWildcardName EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:427:1: ruleWildcardName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNameRule()); 
            }
            pushFollow(FOLLOW_ruleWildcardName_in_entryRuleWildcardName847);
            ruleWildcardName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWildcardNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWildcardName854); if (state.failed) return ;

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:434:1: ruleWildcardName : ( ( ( rule__WildcardName__Alternatives ) ) ( ( rule__WildcardName__Alternatives )* ) ) ;
    public final void ruleWildcardName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:438:2: ( ( ( ( rule__WildcardName__Alternatives ) ) ( ( rule__WildcardName__Alternatives )* ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:439:1: ( ( ( rule__WildcardName__Alternatives ) ) ( ( rule__WildcardName__Alternatives )* ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:439:1: ( ( ( rule__WildcardName__Alternatives ) ) ( ( rule__WildcardName__Alternatives )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:440:1: ( ( rule__WildcardName__Alternatives ) ) ( ( rule__WildcardName__Alternatives )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:440:1: ( ( rule__WildcardName__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:441:1: ( rule__WildcardName__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNameAccess().getAlternatives()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:442:1: ( rule__WildcardName__Alternatives )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:442:2: rule__WildcardName__Alternatives
            {
            pushFollow(FOLLOW_rule__WildcardName__Alternatives_in_ruleWildcardName882);
            rule__WildcardName__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWildcardNameAccess().getAlternatives()); 
            }

            }

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:445:1: ( ( rule__WildcardName__Alternatives )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:446:1: ( rule__WildcardName__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNameAccess().getAlternatives()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:447:1: ( rule__WildcardName__Alternatives )*
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
                    else if ( (LA1_2==RULE_ID||(LA1_2>=11 && LA1_2<=13)||LA1_2==24) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:447:2: rule__WildcardName__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__WildcardName__Alternatives_in_ruleWildcardName894);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:460:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:464:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) )
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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:465:1: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:465:1: ( ( rule__Statement__Group_0__0 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:466:1: ( rule__Statement__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_0()); 
                    }
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:467:1: ( rule__Statement__Group_0__0 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:467:2: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Alternatives933);
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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:471:6: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:471:6: ( ( rule__Statement__Group_1__0 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:472:1: ( rule__Statement__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_1()); 
                    }
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:473:1: ( rule__Statement__Group_1__0 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:473:2: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives951);
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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:477:6: ( ( rule__Statement__Group_2__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:477:6: ( ( rule__Statement__Group_2__0 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:478:1: ( rule__Statement__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_2()); 
                    }
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:479:1: ( rule__Statement__Group_2__0 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:479:2: rule__Statement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_2__0_in_rule__Statement__Alternatives969);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:488:1: rule__Statement__Alternatives_0_1 : ( ( ruleVarAssignment ) | ( ruleVarInstanceCreation ) | ( ruleVarNullLiteral ) | ( ruleVarDeclaration ) );
    public final void rule__Statement__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:492:1: ( ( ruleVarAssignment ) | ( ruleVarInstanceCreation ) | ( ruleVarNullLiteral ) | ( ruleVarDeclaration ) )
            int alt3=4;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:493:1: ( ruleVarAssignment )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:493:1: ( ruleVarAssignment )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:494:1: ruleVarAssignment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getVarAssignmentParserRuleCall_0_1_0()); 
                    }
                    pushFollow(FOLLOW_ruleVarAssignment_in_rule__Statement__Alternatives_0_11002);
                    ruleVarAssignment();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getVarAssignmentParserRuleCall_0_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:499:6: ( ruleVarInstanceCreation )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:499:6: ( ruleVarInstanceCreation )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:500:1: ruleVarInstanceCreation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getVarInstanceCreationParserRuleCall_0_1_1()); 
                    }
                    pushFollow(FOLLOW_ruleVarInstanceCreation_in_rule__Statement__Alternatives_0_11019);
                    ruleVarInstanceCreation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getVarInstanceCreationParserRuleCall_0_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:505:6: ( ruleVarNullLiteral )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:505:6: ( ruleVarNullLiteral )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:506:1: ruleVarNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getVarNullLiteralParserRuleCall_0_1_2()); 
                    }
                    pushFollow(FOLLOW_ruleVarNullLiteral_in_rule__Statement__Alternatives_0_11036);
                    ruleVarNullLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getVarNullLiteralParserRuleCall_0_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:511:6: ( ruleVarDeclaration )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:511:6: ( ruleVarDeclaration )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:512:1: ruleVarDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getVarDeclarationParserRuleCall_0_1_3()); 
                    }
                    pushFollow(FOLLOW_ruleVarDeclaration_in_rule__Statement__Alternatives_0_11053);
                    ruleVarDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getVarDeclarationParserRuleCall_0_1_3()); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:522:1: rule__WildcardName__Alternatives : ( ( RULE_ID ) | ( '*' ) | ( '?' ) );
    public final void rule__WildcardName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:526:1: ( ( RULE_ID ) | ( '*' ) | ( '?' ) )
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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:527:1: ( RULE_ID )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:527:1: ( RULE_ID )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:528:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWildcardNameAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WildcardName__Alternatives1085); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWildcardNameAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:533:6: ( '*' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:533:6: ( '*' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:534:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWildcardNameAccess().getAsteriskKeyword_1()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__WildcardName__Alternatives1103); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWildcardNameAccess().getAsteriskKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:541:6: ( '?' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:541:6: ( '?' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:542:1: '?'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWildcardNameAccess().getQuestionMarkKeyword_2()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__WildcardName__Alternatives1123); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:556:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:560:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:561:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01155);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01158);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:568:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:572:1: ( ( () ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:573:1: ( () )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:573:1: ( () )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:574:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getModelAction_0()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:575:1: ()
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:577:1: 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:587:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:591:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:592:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11216);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11219);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:599:1: rule__Model__Group__1__Impl : ( ( rule__Model__Group_1__0 )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:603:1: ( ( ( rule__Model__Group_1__0 )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:604:1: ( ( rule__Model__Group_1__0 )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:604:1: ( ( rule__Model__Group_1__0 )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:605:1: ( rule__Model__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:606:1: ( rule__Model__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:606:2: rule__Model__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_1__0_in_rule__Model__Group__1__Impl1246);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:616:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:620:1: ( rule__Model__Group__2__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:621:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21277);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:627:1: rule__Model__Group__2__Impl : ( ( rule__Model__Group_2__0 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:631:1: ( ( ( rule__Model__Group_2__0 )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:632:1: ( ( rule__Model__Group_2__0 )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:632:1: ( ( rule__Model__Group_2__0 )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:633:1: ( rule__Model__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup_2()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:634:1: ( rule__Model__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:634:2: rule__Model__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_2__0_in_rule__Model__Group__2__Impl1304);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:650:1: rule__Model__Group_1__0 : rule__Model__Group_1__0__Impl rule__Model__Group_1__1 ;
    public final void rule__Model__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:654:1: ( rule__Model__Group_1__0__Impl rule__Model__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:655:2: rule__Model__Group_1__0__Impl rule__Model__Group_1__1
            {
            pushFollow(FOLLOW_rule__Model__Group_1__0__Impl_in_rule__Model__Group_1__01341);
            rule__Model__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_1__1_in_rule__Model__Group_1__01344);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:662:1: rule__Model__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Model__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:666:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:667:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:667:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:668:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,13,FOLLOW_13_in_rule__Model__Group_1__0__Impl1372); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:681:1: rule__Model__Group_1__1 : rule__Model__Group_1__1__Impl rule__Model__Group_1__2 ;
    public final void rule__Model__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:685:1: ( rule__Model__Group_1__1__Impl rule__Model__Group_1__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:686:2: rule__Model__Group_1__1__Impl rule__Model__Group_1__2
            {
            pushFollow(FOLLOW_rule__Model__Group_1__1__Impl_in_rule__Model__Group_1__11403);
            rule__Model__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_1__2_in_rule__Model__Group_1__11406);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:693:1: rule__Model__Group_1__1__Impl : ( ( rule__Model__Group_1_1__0 )? ) ;
    public final void rule__Model__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:697:1: ( ( ( rule__Model__Group_1_1__0 )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:698:1: ( ( rule__Model__Group_1_1__0 )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:698:1: ( ( rule__Model__Group_1_1__0 )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:699:1: ( rule__Model__Group_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup_1_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:700:1: ( rule__Model__Group_1_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||(LA7_0>=11 && LA7_0<=12)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:700:2: rule__Model__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_1_1__0_in_rule__Model__Group_1__1__Impl1433);
                    rule__Model__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup_1_1()); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:710:1: rule__Model__Group_1__2 : rule__Model__Group_1__2__Impl ;
    public final void rule__Model__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:714:1: ( rule__Model__Group_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:715:2: rule__Model__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_1__2__Impl_in_rule__Model__Group_1__21464);
            rule__Model__Group_1__2__Impl();

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:721:1: rule__Model__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Model__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:725:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:726:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:726:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:727:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,14,FOLLOW_14_in_rule__Model__Group_1__2__Impl1492); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getRightParenthesisKeyword_1_2()); 
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


    // $ANTLR start "rule__Model__Group_1_1__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:746:1: rule__Model__Group_1_1__0 : rule__Model__Group_1_1__0__Impl rule__Model__Group_1_1__1 ;
    public final void rule__Model__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:750:1: ( rule__Model__Group_1_1__0__Impl rule__Model__Group_1_1__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:751:2: rule__Model__Group_1_1__0__Impl rule__Model__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Model__Group_1_1__0__Impl_in_rule__Model__Group_1_1__01529);
            rule__Model__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_1_1__1_in_rule__Model__Group_1_1__01532);
            rule__Model__Group_1_1__1();

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
    // $ANTLR end "rule__Model__Group_1_1__0"


    // $ANTLR start "rule__Model__Group_1_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:758:1: rule__Model__Group_1_1__0__Impl : ( ( rule__Model__VarsAssignment_1_1_0 ) ) ;
    public final void rule__Model__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:762:1: ( ( ( rule__Model__VarsAssignment_1_1_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:763:1: ( ( rule__Model__VarsAssignment_1_1_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:763:1: ( ( rule__Model__VarsAssignment_1_1_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:764:1: ( rule__Model__VarsAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getVarsAssignment_1_1_0()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:765:1: ( rule__Model__VarsAssignment_1_1_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:765:2: rule__Model__VarsAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__Model__VarsAssignment_1_1_0_in_rule__Model__Group_1_1__0__Impl1559);
            rule__Model__VarsAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getVarsAssignment_1_1_0()); 
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
    // $ANTLR end "rule__Model__Group_1_1__0__Impl"


    // $ANTLR start "rule__Model__Group_1_1__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:775:1: rule__Model__Group_1_1__1 : rule__Model__Group_1_1__1__Impl ;
    public final void rule__Model__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:779:1: ( rule__Model__Group_1_1__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:780:2: rule__Model__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_1_1__1__Impl_in_rule__Model__Group_1_1__11589);
            rule__Model__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__Model__Group_1_1__1"


    // $ANTLR start "rule__Model__Group_1_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:786:1: rule__Model__Group_1_1__1__Impl : ( ( rule__Model__Group_1_1_1__0 )* ) ;
    public final void rule__Model__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:790:1: ( ( ( rule__Model__Group_1_1_1__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:791:1: ( ( rule__Model__Group_1_1_1__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:791:1: ( ( rule__Model__Group_1_1_1__0 )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:792:1: ( rule__Model__Group_1_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup_1_1_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:793:1: ( rule__Model__Group_1_1_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:793:2: rule__Model__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Model__Group_1_1_1__0_in_rule__Model__Group_1_1__1__Impl1616);
            	    rule__Model__Group_1_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup_1_1_1()); 
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
    // $ANTLR end "rule__Model__Group_1_1__1__Impl"


    // $ANTLR start "rule__Model__Group_1_1_1__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:807:1: rule__Model__Group_1_1_1__0 : rule__Model__Group_1_1_1__0__Impl rule__Model__Group_1_1_1__1 ;
    public final void rule__Model__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:811:1: ( rule__Model__Group_1_1_1__0__Impl rule__Model__Group_1_1_1__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:812:2: rule__Model__Group_1_1_1__0__Impl rule__Model__Group_1_1_1__1
            {
            pushFollow(FOLLOW_rule__Model__Group_1_1_1__0__Impl_in_rule__Model__Group_1_1_1__01651);
            rule__Model__Group_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_1_1_1__1_in_rule__Model__Group_1_1_1__01654);
            rule__Model__Group_1_1_1__1();

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
    // $ANTLR end "rule__Model__Group_1_1_1__0"


    // $ANTLR start "rule__Model__Group_1_1_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:819:1: rule__Model__Group_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:823:1: ( ( ',' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:824:1: ( ',' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:824:1: ( ',' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:825:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getCommaKeyword_1_1_1_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__Model__Group_1_1_1__0__Impl1682); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getCommaKeyword_1_1_1_0()); 
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
    // $ANTLR end "rule__Model__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__Model__Group_1_1_1__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:838:1: rule__Model__Group_1_1_1__1 : rule__Model__Group_1_1_1__1__Impl ;
    public final void rule__Model__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:842:1: ( rule__Model__Group_1_1_1__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:843:2: rule__Model__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_1_1_1__1__Impl_in_rule__Model__Group_1_1_1__11713);
            rule__Model__Group_1_1_1__1__Impl();

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
    // $ANTLR end "rule__Model__Group_1_1_1__1"


    // $ANTLR start "rule__Model__Group_1_1_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:849:1: rule__Model__Group_1_1_1__1__Impl : ( ( rule__Model__VarsAssignment_1_1_1_1 ) ) ;
    public final void rule__Model__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:853:1: ( ( ( rule__Model__VarsAssignment_1_1_1_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:854:1: ( ( rule__Model__VarsAssignment_1_1_1_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:854:1: ( ( rule__Model__VarsAssignment_1_1_1_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:855:1: ( rule__Model__VarsAssignment_1_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getVarsAssignment_1_1_1_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:856:1: ( rule__Model__VarsAssignment_1_1_1_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:856:2: rule__Model__VarsAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_rule__Model__VarsAssignment_1_1_1_1_in_rule__Model__Group_1_1_1__1__Impl1740);
            rule__Model__VarsAssignment_1_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getVarsAssignment_1_1_1_1()); 
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
    // $ANTLR end "rule__Model__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__Model__Group_2__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:870:1: rule__Model__Group_2__0 : rule__Model__Group_2__0__Impl rule__Model__Group_2__1 ;
    public final void rule__Model__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:874:1: ( rule__Model__Group_2__0__Impl rule__Model__Group_2__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:875:2: rule__Model__Group_2__0__Impl rule__Model__Group_2__1
            {
            pushFollow(FOLLOW_rule__Model__Group_2__0__Impl_in_rule__Model__Group_2__01774);
            rule__Model__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_2__1_in_rule__Model__Group_2__01777);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:882:1: rule__Model__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Model__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:886:1: ( ( '{' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:887:1: ( '{' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:887:1: ( '{' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:888:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__Model__Group_2__0__Impl1805); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:901:1: rule__Model__Group_2__1 : rule__Model__Group_2__1__Impl rule__Model__Group_2__2 ;
    public final void rule__Model__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:905:1: ( rule__Model__Group_2__1__Impl rule__Model__Group_2__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:906:2: rule__Model__Group_2__1__Impl rule__Model__Group_2__2
            {
            pushFollow(FOLLOW_rule__Model__Group_2__1__Impl_in_rule__Model__Group_2__11836);
            rule__Model__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_2__2_in_rule__Model__Group_2__11839);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:913:1: rule__Model__Group_2__1__Impl : ( ( rule__Model__StatementsAssignment_2_1 )* ) ;
    public final void rule__Model__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:917:1: ( ( ( rule__Model__StatementsAssignment_2_1 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:918:1: ( ( rule__Model__StatementsAssignment_2_1 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:918:1: ( ( rule__Model__StatementsAssignment_2_1 )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:919:1: ( rule__Model__StatementsAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getStatementsAssignment_2_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:920:1: ( rule__Model__StatementsAssignment_2_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=18 && LA9_0<=20)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:920:2: rule__Model__StatementsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__StatementsAssignment_2_1_in_rule__Model__Group_2__1__Impl1866);
            	    rule__Model__StatementsAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:930:1: rule__Model__Group_2__2 : rule__Model__Group_2__2__Impl ;
    public final void rule__Model__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:934:1: ( rule__Model__Group_2__2__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:935:2: rule__Model__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_2__2__Impl_in_rule__Model__Group_2__21897);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:941:1: rule__Model__Group_2__2__Impl : ( '}' ) ;
    public final void rule__Model__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:945:1: ( ( '}' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:946:1: ( '}' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:946:1: ( '}' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:947:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_2_2()); 
            }
            match(input,17,FOLLOW_17_in_rule__Model__Group_2__2__Impl1925); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:966:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:970:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:971:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__01962);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__01965);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:978:1: rule__Statement__Group_0__0__Impl : ( 'var' ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:982:1: ( ( 'var' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:983:1: ( 'var' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:983:1: ( 'var' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:984:1: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getVarKeyword_0_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Statement__Group_0__0__Impl1993); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:997:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1001:1: ( rule__Statement__Group_0__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1002:2: rule__Statement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__12024);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1008:1: rule__Statement__Group_0__1__Impl : ( ( rule__Statement__Alternatives_0_1 ) ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1012:1: ( ( ( rule__Statement__Alternatives_0_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1013:1: ( ( rule__Statement__Alternatives_0_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1013:1: ( ( rule__Statement__Alternatives_0_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1014:1: ( rule__Statement__Alternatives_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives_0_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1015:1: ( rule__Statement__Alternatives_0_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1015:2: rule__Statement__Alternatives_0_1
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_0_1_in_rule__Statement__Group_0__1__Impl2051);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1029:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1033:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1034:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__02085);
            rule__Statement__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__02088);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1041:1: rule__Statement__Group_1__0__Impl : ( 'call' ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1045:1: ( ( 'call' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1046:1: ( 'call' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1046:1: ( 'call' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1047:1: 'call'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getCallKeyword_1_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Statement__Group_1__0__Impl2116); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1060:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1064:1: ( rule__Statement__Group_1__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1065:2: rule__Statement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__12147);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1071:1: rule__Statement__Group_1__1__Impl : ( ruleMethodCall ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1075:1: ( ( ruleMethodCall ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1076:1: ( ruleMethodCall )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1076:1: ( ruleMethodCall )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1077:1: ruleMethodCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getMethodCallParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleMethodCall_in_rule__Statement__Group_1__1__Impl2174);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1092:1: rule__Statement__Group_2__0 : rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 ;
    public final void rule__Statement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1096:1: ( rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1097:2: rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__0__Impl_in_rule__Statement__Group_2__02207);
            rule__Statement__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_2__1_in_rule__Statement__Group_2__02210);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1104:1: rule__Statement__Group_2__0__Impl : ( 'scall' ) ;
    public final void rule__Statement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1108:1: ( ( 'scall' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1109:1: ( 'scall' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1109:1: ( 'scall' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1110:1: 'scall'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getScallKeyword_2_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Statement__Group_2__0__Impl2238); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1123:1: rule__Statement__Group_2__1 : rule__Statement__Group_2__1__Impl ;
    public final void rule__Statement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1127:1: ( rule__Statement__Group_2__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1128:2: rule__Statement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__1__Impl_in_rule__Statement__Group_2__12269);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1134:1: rule__Statement__Group_2__1__Impl : ( ruleStaticMethodCall ) ;
    public final void rule__Statement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1138:1: ( ( ruleStaticMethodCall ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1139:1: ( ruleStaticMethodCall )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1139:1: ( ruleStaticMethodCall )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1140:1: ruleStaticMethodCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStaticMethodCallParserRuleCall_2_1()); 
            }
            pushFollow(FOLLOW_ruleStaticMethodCall_in_rule__Statement__Group_2__1__Impl2296);
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


    // $ANTLR start "rule__VarDeclarationParam__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1155:1: rule__VarDeclarationParam__Group__0 : rule__VarDeclarationParam__Group__0__Impl rule__VarDeclarationParam__Group__1 ;
    public final void rule__VarDeclarationParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1159:1: ( rule__VarDeclarationParam__Group__0__Impl rule__VarDeclarationParam__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1160:2: rule__VarDeclarationParam__Group__0__Impl rule__VarDeclarationParam__Group__1
            {
            pushFollow(FOLLOW_rule__VarDeclarationParam__Group__0__Impl_in_rule__VarDeclarationParam__Group__02329);
            rule__VarDeclarationParam__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarDeclarationParam__Group__1_in_rule__VarDeclarationParam__Group__02332);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1167:1: rule__VarDeclarationParam__Group__0__Impl : ( ( rule__VarDeclarationParam__TypeAssignment_0 ) ) ;
    public final void rule__VarDeclarationParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1171:1: ( ( ( rule__VarDeclarationParam__TypeAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1172:1: ( ( rule__VarDeclarationParam__TypeAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1172:1: ( ( rule__VarDeclarationParam__TypeAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1173:1: ( rule__VarDeclarationParam__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationParamAccess().getTypeAssignment_0()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1174:1: ( rule__VarDeclarationParam__TypeAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1174:2: rule__VarDeclarationParam__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__VarDeclarationParam__TypeAssignment_0_in_rule__VarDeclarationParam__Group__0__Impl2359);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1184:1: rule__VarDeclarationParam__Group__1 : rule__VarDeclarationParam__Group__1__Impl ;
    public final void rule__VarDeclarationParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1188:1: ( rule__VarDeclarationParam__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1189:2: rule__VarDeclarationParam__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VarDeclarationParam__Group__1__Impl_in_rule__VarDeclarationParam__Group__12389);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1195:1: rule__VarDeclarationParam__Group__1__Impl : ( ( rule__VarDeclarationParam__NameAssignment_1 ) ) ;
    public final void rule__VarDeclarationParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1199:1: ( ( ( rule__VarDeclarationParam__NameAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1200:1: ( ( rule__VarDeclarationParam__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1200:1: ( ( rule__VarDeclarationParam__NameAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1201:1: ( rule__VarDeclarationParam__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationParamAccess().getNameAssignment_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1202:1: ( rule__VarDeclarationParam__NameAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1202:2: rule__VarDeclarationParam__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VarDeclarationParam__NameAssignment_1_in_rule__VarDeclarationParam__Group__1__Impl2416);
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


    // $ANTLR start "rule__VarNullLiteral__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1216:1: rule__VarNullLiteral__Group__0 : rule__VarNullLiteral__Group__0__Impl rule__VarNullLiteral__Group__1 ;
    public final void rule__VarNullLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1220:1: ( rule__VarNullLiteral__Group__0__Impl rule__VarNullLiteral__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1221:2: rule__VarNullLiteral__Group__0__Impl rule__VarNullLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__VarNullLiteral__Group__0__Impl_in_rule__VarNullLiteral__Group__02450);
            rule__VarNullLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarNullLiteral__Group__1_in_rule__VarNullLiteral__Group__02453);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1228:1: rule__VarNullLiteral__Group__0__Impl : ( ( rule__VarNullLiteral__TypeAssignment_0 ) ) ;
    public final void rule__VarNullLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1232:1: ( ( ( rule__VarNullLiteral__TypeAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1233:1: ( ( rule__VarNullLiteral__TypeAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1233:1: ( ( rule__VarNullLiteral__TypeAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1234:1: ( rule__VarNullLiteral__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarNullLiteralAccess().getTypeAssignment_0()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1235:1: ( rule__VarNullLiteral__TypeAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1235:2: rule__VarNullLiteral__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__VarNullLiteral__TypeAssignment_0_in_rule__VarNullLiteral__Group__0__Impl2480);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1245:1: rule__VarNullLiteral__Group__1 : rule__VarNullLiteral__Group__1__Impl rule__VarNullLiteral__Group__2 ;
    public final void rule__VarNullLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1249:1: ( rule__VarNullLiteral__Group__1__Impl rule__VarNullLiteral__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1250:2: rule__VarNullLiteral__Group__1__Impl rule__VarNullLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__VarNullLiteral__Group__1__Impl_in_rule__VarNullLiteral__Group__12510);
            rule__VarNullLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarNullLiteral__Group__2_in_rule__VarNullLiteral__Group__12513);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1257:1: rule__VarNullLiteral__Group__1__Impl : ( ( rule__VarNullLiteral__NameAssignment_1 ) ) ;
    public final void rule__VarNullLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1261:1: ( ( ( rule__VarNullLiteral__NameAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1262:1: ( ( rule__VarNullLiteral__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1262:1: ( ( rule__VarNullLiteral__NameAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1263:1: ( rule__VarNullLiteral__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarNullLiteralAccess().getNameAssignment_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1264:1: ( rule__VarNullLiteral__NameAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1264:2: rule__VarNullLiteral__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VarNullLiteral__NameAssignment_1_in_rule__VarNullLiteral__Group__1__Impl2540);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1274:1: rule__VarNullLiteral__Group__2 : rule__VarNullLiteral__Group__2__Impl rule__VarNullLiteral__Group__3 ;
    public final void rule__VarNullLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1278:1: ( rule__VarNullLiteral__Group__2__Impl rule__VarNullLiteral__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1279:2: rule__VarNullLiteral__Group__2__Impl rule__VarNullLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__VarNullLiteral__Group__2__Impl_in_rule__VarNullLiteral__Group__22570);
            rule__VarNullLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarNullLiteral__Group__3_in_rule__VarNullLiteral__Group__22573);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1286:1: rule__VarNullLiteral__Group__2__Impl : ( '=' ) ;
    public final void rule__VarNullLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1290:1: ( ( '=' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1291:1: ( '=' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1291:1: ( '=' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1292:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarNullLiteralAccess().getEqualsSignKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__VarNullLiteral__Group__2__Impl2601); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1305:1: rule__VarNullLiteral__Group__3 : rule__VarNullLiteral__Group__3__Impl ;
    public final void rule__VarNullLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1309:1: ( rule__VarNullLiteral__Group__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1310:2: rule__VarNullLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VarNullLiteral__Group__3__Impl_in_rule__VarNullLiteral__Group__32632);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1316:1: rule__VarNullLiteral__Group__3__Impl : ( 'null' ) ;
    public final void rule__VarNullLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1320:1: ( ( 'null' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1321:1: ( 'null' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1321:1: ( 'null' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1322:1: 'null'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarNullLiteralAccess().getNullKeyword_3()); 
            }
            match(input,22,FOLLOW_22_in_rule__VarNullLiteral__Group__3__Impl2660); if (state.failed) return ;
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


    // $ANTLR start "rule__VarAssignment__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1343:1: rule__VarAssignment__Group__0 : rule__VarAssignment__Group__0__Impl rule__VarAssignment__Group__1 ;
    public final void rule__VarAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1347:1: ( rule__VarAssignment__Group__0__Impl rule__VarAssignment__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1348:2: rule__VarAssignment__Group__0__Impl rule__VarAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__VarAssignment__Group__0__Impl_in_rule__VarAssignment__Group__02699);
            rule__VarAssignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarAssignment__Group__1_in_rule__VarAssignment__Group__02702);
            rule__VarAssignment__Group__1();

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
    // $ANTLR end "rule__VarAssignment__Group__0"


    // $ANTLR start "rule__VarAssignment__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1355:1: rule__VarAssignment__Group__0__Impl : ( ( rule__VarAssignment__TypeAssignment_0 ) ) ;
    public final void rule__VarAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1359:1: ( ( ( rule__VarAssignment__TypeAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1360:1: ( ( rule__VarAssignment__TypeAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1360:1: ( ( rule__VarAssignment__TypeAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1361:1: ( rule__VarAssignment__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignmentAccess().getTypeAssignment_0()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1362:1: ( rule__VarAssignment__TypeAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1362:2: rule__VarAssignment__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__VarAssignment__TypeAssignment_0_in_rule__VarAssignment__Group__0__Impl2729);
            rule__VarAssignment__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignmentAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__VarAssignment__Group__0__Impl"


    // $ANTLR start "rule__VarAssignment__Group__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1372:1: rule__VarAssignment__Group__1 : rule__VarAssignment__Group__1__Impl rule__VarAssignment__Group__2 ;
    public final void rule__VarAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1376:1: ( rule__VarAssignment__Group__1__Impl rule__VarAssignment__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1377:2: rule__VarAssignment__Group__1__Impl rule__VarAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__VarAssignment__Group__1__Impl_in_rule__VarAssignment__Group__12759);
            rule__VarAssignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarAssignment__Group__2_in_rule__VarAssignment__Group__12762);
            rule__VarAssignment__Group__2();

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
    // $ANTLR end "rule__VarAssignment__Group__1"


    // $ANTLR start "rule__VarAssignment__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1384:1: rule__VarAssignment__Group__1__Impl : ( ( rule__VarAssignment__NameAssignment_1 ) ) ;
    public final void rule__VarAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1388:1: ( ( ( rule__VarAssignment__NameAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1389:1: ( ( rule__VarAssignment__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1389:1: ( ( rule__VarAssignment__NameAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1390:1: ( rule__VarAssignment__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignmentAccess().getNameAssignment_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1391:1: ( rule__VarAssignment__NameAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1391:2: rule__VarAssignment__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VarAssignment__NameAssignment_1_in_rule__VarAssignment__Group__1__Impl2789);
            rule__VarAssignment__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignmentAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__VarAssignment__Group__1__Impl"


    // $ANTLR start "rule__VarAssignment__Group__2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1401:1: rule__VarAssignment__Group__2 : rule__VarAssignment__Group__2__Impl rule__VarAssignment__Group__3 ;
    public final void rule__VarAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1405:1: ( rule__VarAssignment__Group__2__Impl rule__VarAssignment__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1406:2: rule__VarAssignment__Group__2__Impl rule__VarAssignment__Group__3
            {
            pushFollow(FOLLOW_rule__VarAssignment__Group__2__Impl_in_rule__VarAssignment__Group__22819);
            rule__VarAssignment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarAssignment__Group__3_in_rule__VarAssignment__Group__22822);
            rule__VarAssignment__Group__3();

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
    // $ANTLR end "rule__VarAssignment__Group__2"


    // $ANTLR start "rule__VarAssignment__Group__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1413:1: rule__VarAssignment__Group__2__Impl : ( '=' ) ;
    public final void rule__VarAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1417:1: ( ( '=' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1418:1: ( '=' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1418:1: ( '=' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1419:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignmentAccess().getEqualsSignKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__VarAssignment__Group__2__Impl2850); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignmentAccess().getEqualsSignKeyword_2()); 
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
    // $ANTLR end "rule__VarAssignment__Group__2__Impl"


    // $ANTLR start "rule__VarAssignment__Group__3"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1432:1: rule__VarAssignment__Group__3 : rule__VarAssignment__Group__3__Impl ;
    public final void rule__VarAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1436:1: ( rule__VarAssignment__Group__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1437:2: rule__VarAssignment__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VarAssignment__Group__3__Impl_in_rule__VarAssignment__Group__32881);
            rule__VarAssignment__Group__3__Impl();

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
    // $ANTLR end "rule__VarAssignment__Group__3"


    // $ANTLR start "rule__VarAssignment__Group__3__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1443:1: rule__VarAssignment__Group__3__Impl : ( '*' ) ;
    public final void rule__VarAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1447:1: ( ( '*' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1448:1: ( '*' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1448:1: ( '*' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1449:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignmentAccess().getAsteriskKeyword_3()); 
            }
            match(input,11,FOLLOW_11_in_rule__VarAssignment__Group__3__Impl2909); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignmentAccess().getAsteriskKeyword_3()); 
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
    // $ANTLR end "rule__VarAssignment__Group__3__Impl"


    // $ANTLR start "rule__VarInstanceCreation__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1470:1: rule__VarInstanceCreation__Group__0 : rule__VarInstanceCreation__Group__0__Impl rule__VarInstanceCreation__Group__1 ;
    public final void rule__VarInstanceCreation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1474:1: ( rule__VarInstanceCreation__Group__0__Impl rule__VarInstanceCreation__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1475:2: rule__VarInstanceCreation__Group__0__Impl rule__VarInstanceCreation__Group__1
            {
            pushFollow(FOLLOW_rule__VarInstanceCreation__Group__0__Impl_in_rule__VarInstanceCreation__Group__02948);
            rule__VarInstanceCreation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarInstanceCreation__Group__1_in_rule__VarInstanceCreation__Group__02951);
            rule__VarInstanceCreation__Group__1();

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
    // $ANTLR end "rule__VarInstanceCreation__Group__0"


    // $ANTLR start "rule__VarInstanceCreation__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1482:1: rule__VarInstanceCreation__Group__0__Impl : ( ( rule__VarInstanceCreation__TypeAssignment_0 ) ) ;
    public final void rule__VarInstanceCreation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1486:1: ( ( ( rule__VarInstanceCreation__TypeAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1487:1: ( ( rule__VarInstanceCreation__TypeAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1487:1: ( ( rule__VarInstanceCreation__TypeAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1488:1: ( rule__VarInstanceCreation__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInstanceCreationAccess().getTypeAssignment_0()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1489:1: ( rule__VarInstanceCreation__TypeAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1489:2: rule__VarInstanceCreation__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__VarInstanceCreation__TypeAssignment_0_in_rule__VarInstanceCreation__Group__0__Impl2978);
            rule__VarInstanceCreation__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarInstanceCreationAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__VarInstanceCreation__Group__0__Impl"


    // $ANTLR start "rule__VarInstanceCreation__Group__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1499:1: rule__VarInstanceCreation__Group__1 : rule__VarInstanceCreation__Group__1__Impl rule__VarInstanceCreation__Group__2 ;
    public final void rule__VarInstanceCreation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1503:1: ( rule__VarInstanceCreation__Group__1__Impl rule__VarInstanceCreation__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1504:2: rule__VarInstanceCreation__Group__1__Impl rule__VarInstanceCreation__Group__2
            {
            pushFollow(FOLLOW_rule__VarInstanceCreation__Group__1__Impl_in_rule__VarInstanceCreation__Group__13008);
            rule__VarInstanceCreation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarInstanceCreation__Group__2_in_rule__VarInstanceCreation__Group__13011);
            rule__VarInstanceCreation__Group__2();

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
    // $ANTLR end "rule__VarInstanceCreation__Group__1"


    // $ANTLR start "rule__VarInstanceCreation__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1511:1: rule__VarInstanceCreation__Group__1__Impl : ( ( rule__VarInstanceCreation__NameAssignment_1 ) ) ;
    public final void rule__VarInstanceCreation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1515:1: ( ( ( rule__VarInstanceCreation__NameAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1516:1: ( ( rule__VarInstanceCreation__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1516:1: ( ( rule__VarInstanceCreation__NameAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1517:1: ( rule__VarInstanceCreation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInstanceCreationAccess().getNameAssignment_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1518:1: ( rule__VarInstanceCreation__NameAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1518:2: rule__VarInstanceCreation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VarInstanceCreation__NameAssignment_1_in_rule__VarInstanceCreation__Group__1__Impl3038);
            rule__VarInstanceCreation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarInstanceCreationAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__VarInstanceCreation__Group__1__Impl"


    // $ANTLR start "rule__VarInstanceCreation__Group__2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1528:1: rule__VarInstanceCreation__Group__2 : rule__VarInstanceCreation__Group__2__Impl rule__VarInstanceCreation__Group__3 ;
    public final void rule__VarInstanceCreation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1532:1: ( rule__VarInstanceCreation__Group__2__Impl rule__VarInstanceCreation__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1533:2: rule__VarInstanceCreation__Group__2__Impl rule__VarInstanceCreation__Group__3
            {
            pushFollow(FOLLOW_rule__VarInstanceCreation__Group__2__Impl_in_rule__VarInstanceCreation__Group__23068);
            rule__VarInstanceCreation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarInstanceCreation__Group__3_in_rule__VarInstanceCreation__Group__23071);
            rule__VarInstanceCreation__Group__3();

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
    // $ANTLR end "rule__VarInstanceCreation__Group__2"


    // $ANTLR start "rule__VarInstanceCreation__Group__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1540:1: rule__VarInstanceCreation__Group__2__Impl : ( '=' ) ;
    public final void rule__VarInstanceCreation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1544:1: ( ( '=' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1545:1: ( '=' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1545:1: ( '=' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1546:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInstanceCreationAccess().getEqualsSignKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__VarInstanceCreation__Group__2__Impl3099); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarInstanceCreationAccess().getEqualsSignKeyword_2()); 
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
    // $ANTLR end "rule__VarInstanceCreation__Group__2__Impl"


    // $ANTLR start "rule__VarInstanceCreation__Group__3"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1559:1: rule__VarInstanceCreation__Group__3 : rule__VarInstanceCreation__Group__3__Impl ;
    public final void rule__VarInstanceCreation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1563:1: ( rule__VarInstanceCreation__Group__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1564:2: rule__VarInstanceCreation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VarInstanceCreation__Group__3__Impl_in_rule__VarInstanceCreation__Group__33130);
            rule__VarInstanceCreation__Group__3__Impl();

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
    // $ANTLR end "rule__VarInstanceCreation__Group__3"


    // $ANTLR start "rule__VarInstanceCreation__Group__3__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1570:1: rule__VarInstanceCreation__Group__3__Impl : ( 'new' ) ;
    public final void rule__VarInstanceCreation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1574:1: ( ( 'new' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1575:1: ( 'new' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1575:1: ( 'new' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1576:1: 'new'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInstanceCreationAccess().getNewKeyword_3()); 
            }
            match(input,23,FOLLOW_23_in_rule__VarInstanceCreation__Group__3__Impl3158); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarInstanceCreationAccess().getNewKeyword_3()); 
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
    // $ANTLR end "rule__VarInstanceCreation__Group__3__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1597:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1601:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1602:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__VarDeclaration__Group__0__Impl_in_rule__VarDeclaration__Group__03197);
            rule__VarDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VarDeclaration__Group__1_in_rule__VarDeclaration__Group__03200);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1609:1: rule__VarDeclaration__Group__0__Impl : ( ( rule__VarDeclaration__TypeAssignment_0 ) ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1613:1: ( ( ( rule__VarDeclaration__TypeAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1614:1: ( ( rule__VarDeclaration__TypeAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1614:1: ( ( rule__VarDeclaration__TypeAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1615:1: ( rule__VarDeclaration__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getTypeAssignment_0()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1616:1: ( rule__VarDeclaration__TypeAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1616:2: rule__VarDeclaration__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__VarDeclaration__TypeAssignment_0_in_rule__VarDeclaration__Group__0__Impl3227);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1626:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1630:1: ( rule__VarDeclaration__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1631:2: rule__VarDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VarDeclaration__Group__1__Impl_in_rule__VarDeclaration__Group__13257);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1637:1: rule__VarDeclaration__Group__1__Impl : ( ( rule__VarDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1641:1: ( ( ( rule__VarDeclaration__NameAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1642:1: ( ( rule__VarDeclaration__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1642:1: ( ( rule__VarDeclaration__NameAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1643:1: ( rule__VarDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getNameAssignment_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1644:1: ( rule__VarDeclaration__NameAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1644:2: rule__VarDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VarDeclaration__NameAssignment_1_in_rule__VarDeclaration__Group__1__Impl3284);
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


    // $ANTLR start "rule__MethodCall__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1658:1: rule__MethodCall__Group__0 : rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 ;
    public final void rule__MethodCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1662:1: ( rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1663:2: rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__0__Impl_in_rule__MethodCall__Group__03318);
            rule__MethodCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MethodCall__Group__1_in_rule__MethodCall__Group__03321);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1670:1: rule__MethodCall__Group__0__Impl : ( ( rule__MethodCall__NameCalleeAssignment_0 ) ) ;
    public final void rule__MethodCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1674:1: ( ( ( rule__MethodCall__NameCalleeAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1675:1: ( ( rule__MethodCall__NameCalleeAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1675:1: ( ( rule__MethodCall__NameCalleeAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1676:1: ( rule__MethodCall__NameCalleeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getNameCalleeAssignment_0()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1677:1: ( rule__MethodCall__NameCalleeAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1677:2: rule__MethodCall__NameCalleeAssignment_0
            {
            pushFollow(FOLLOW_rule__MethodCall__NameCalleeAssignment_0_in_rule__MethodCall__Group__0__Impl3348);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1687:1: rule__MethodCall__Group__1 : rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2 ;
    public final void rule__MethodCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1691:1: ( rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1692:2: rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__1__Impl_in_rule__MethodCall__Group__13378);
            rule__MethodCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MethodCall__Group__2_in_rule__MethodCall__Group__13381);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1699:1: rule__MethodCall__Group__1__Impl : ( '.' ) ;
    public final void rule__MethodCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1703:1: ( ( '.' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1704:1: ( '.' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1704:1: ( '.' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1705:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getFullStopKeyword_1()); 
            }
            match(input,24,FOLLOW_24_in_rule__MethodCall__Group__1__Impl3409); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1718:1: rule__MethodCall__Group__2 : rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3 ;
    public final void rule__MethodCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1722:1: ( rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1723:2: rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__2__Impl_in_rule__MethodCall__Group__23440);
            rule__MethodCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MethodCall__Group__3_in_rule__MethodCall__Group__23443);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1730:1: rule__MethodCall__Group__2__Impl : ( ( rule__MethodCall__MethodAssignment_2 ) ) ;
    public final void rule__MethodCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1734:1: ( ( ( rule__MethodCall__MethodAssignment_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1735:1: ( ( rule__MethodCall__MethodAssignment_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1735:1: ( ( rule__MethodCall__MethodAssignment_2 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1736:1: ( rule__MethodCall__MethodAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getMethodAssignment_2()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1737:1: ( rule__MethodCall__MethodAssignment_2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1737:2: rule__MethodCall__MethodAssignment_2
            {
            pushFollow(FOLLOW_rule__MethodCall__MethodAssignment_2_in_rule__MethodCall__Group__2__Impl3470);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1747:1: rule__MethodCall__Group__3 : rule__MethodCall__Group__3__Impl rule__MethodCall__Group__4 ;
    public final void rule__MethodCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1751:1: ( rule__MethodCall__Group__3__Impl rule__MethodCall__Group__4 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1752:2: rule__MethodCall__Group__3__Impl rule__MethodCall__Group__4
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__3__Impl_in_rule__MethodCall__Group__33500);
            rule__MethodCall__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MethodCall__Group__4_in_rule__MethodCall__Group__33503);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1759:1: rule__MethodCall__Group__3__Impl : ( '(' ) ;
    public final void rule__MethodCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1763:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1764:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1764:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1765:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,13,FOLLOW_13_in_rule__MethodCall__Group__3__Impl3531); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1778:1: rule__MethodCall__Group__4 : rule__MethodCall__Group__4__Impl rule__MethodCall__Group__5 ;
    public final void rule__MethodCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1782:1: ( rule__MethodCall__Group__4__Impl rule__MethodCall__Group__5 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1783:2: rule__MethodCall__Group__4__Impl rule__MethodCall__Group__5
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__4__Impl_in_rule__MethodCall__Group__43562);
            rule__MethodCall__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MethodCall__Group__5_in_rule__MethodCall__Group__43565);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1790:1: rule__MethodCall__Group__4__Impl : ( ( rule__MethodCall__NameCallerAssignment_4 )? ) ;
    public final void rule__MethodCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1794:1: ( ( ( rule__MethodCall__NameCallerAssignment_4 )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1795:1: ( ( rule__MethodCall__NameCallerAssignment_4 )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1795:1: ( ( rule__MethodCall__NameCallerAssignment_4 )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1796:1: ( rule__MethodCall__NameCallerAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getNameCallerAssignment_4()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1797:1: ( rule__MethodCall__NameCallerAssignment_4 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1797:2: rule__MethodCall__NameCallerAssignment_4
                    {
                    pushFollow(FOLLOW_rule__MethodCall__NameCallerAssignment_4_in_rule__MethodCall__Group__4__Impl3592);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1807:1: rule__MethodCall__Group__5 : rule__MethodCall__Group__5__Impl ;
    public final void rule__MethodCall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1811:1: ( rule__MethodCall__Group__5__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1812:2: rule__MethodCall__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__5__Impl_in_rule__MethodCall__Group__53623);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1818:1: rule__MethodCall__Group__5__Impl : ( ')' ) ;
    public final void rule__MethodCall__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1822:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1823:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1823:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1824:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,14,FOLLOW_14_in_rule__MethodCall__Group__5__Impl3651); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1849:1: rule__StaticMethodCall__Group__0 : rule__StaticMethodCall__Group__0__Impl rule__StaticMethodCall__Group__1 ;
    public final void rule__StaticMethodCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1853:1: ( rule__StaticMethodCall__Group__0__Impl rule__StaticMethodCall__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1854:2: rule__StaticMethodCall__Group__0__Impl rule__StaticMethodCall__Group__1
            {
            pushFollow(FOLLOW_rule__StaticMethodCall__Group__0__Impl_in_rule__StaticMethodCall__Group__03694);
            rule__StaticMethodCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StaticMethodCall__Group__1_in_rule__StaticMethodCall__Group__03697);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1861:1: rule__StaticMethodCall__Group__0__Impl : ( ( rule__StaticMethodCall__MethodAssignment_0 ) ) ;
    public final void rule__StaticMethodCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1865:1: ( ( ( rule__StaticMethodCall__MethodAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1866:1: ( ( rule__StaticMethodCall__MethodAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1866:1: ( ( rule__StaticMethodCall__MethodAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1867:1: ( rule__StaticMethodCall__MethodAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticMethodCallAccess().getMethodAssignment_0()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1868:1: ( rule__StaticMethodCall__MethodAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1868:2: rule__StaticMethodCall__MethodAssignment_0
            {
            pushFollow(FOLLOW_rule__StaticMethodCall__MethodAssignment_0_in_rule__StaticMethodCall__Group__0__Impl3724);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1878:1: rule__StaticMethodCall__Group__1 : rule__StaticMethodCall__Group__1__Impl rule__StaticMethodCall__Group__2 ;
    public final void rule__StaticMethodCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1882:1: ( rule__StaticMethodCall__Group__1__Impl rule__StaticMethodCall__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1883:2: rule__StaticMethodCall__Group__1__Impl rule__StaticMethodCall__Group__2
            {
            pushFollow(FOLLOW_rule__StaticMethodCall__Group__1__Impl_in_rule__StaticMethodCall__Group__13754);
            rule__StaticMethodCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StaticMethodCall__Group__2_in_rule__StaticMethodCall__Group__13757);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1890:1: rule__StaticMethodCall__Group__1__Impl : ( '(' ) ;
    public final void rule__StaticMethodCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1894:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1895:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1895:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1896:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticMethodCallAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,13,FOLLOW_13_in_rule__StaticMethodCall__Group__1__Impl3785); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1909:1: rule__StaticMethodCall__Group__2 : rule__StaticMethodCall__Group__2__Impl rule__StaticMethodCall__Group__3 ;
    public final void rule__StaticMethodCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1913:1: ( rule__StaticMethodCall__Group__2__Impl rule__StaticMethodCall__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1914:2: rule__StaticMethodCall__Group__2__Impl rule__StaticMethodCall__Group__3
            {
            pushFollow(FOLLOW_rule__StaticMethodCall__Group__2__Impl_in_rule__StaticMethodCall__Group__23816);
            rule__StaticMethodCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StaticMethodCall__Group__3_in_rule__StaticMethodCall__Group__23819);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1921:1: rule__StaticMethodCall__Group__2__Impl : ( ( rule__StaticMethodCall__NameAssignment_2 ) ) ;
    public final void rule__StaticMethodCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1925:1: ( ( ( rule__StaticMethodCall__NameAssignment_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1926:1: ( ( rule__StaticMethodCall__NameAssignment_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1926:1: ( ( rule__StaticMethodCall__NameAssignment_2 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1927:1: ( rule__StaticMethodCall__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticMethodCallAccess().getNameAssignment_2()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1928:1: ( rule__StaticMethodCall__NameAssignment_2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1928:2: rule__StaticMethodCall__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__StaticMethodCall__NameAssignment_2_in_rule__StaticMethodCall__Group__2__Impl3846);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1938:1: rule__StaticMethodCall__Group__3 : rule__StaticMethodCall__Group__3__Impl ;
    public final void rule__StaticMethodCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1942:1: ( rule__StaticMethodCall__Group__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1943:2: rule__StaticMethodCall__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StaticMethodCall__Group__3__Impl_in_rule__StaticMethodCall__Group__33876);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1949:1: rule__StaticMethodCall__Group__3__Impl : ( ')' ) ;
    public final void rule__StaticMethodCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1953:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1954:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1954:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1955:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticMethodCallAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,14,FOLLOW_14_in_rule__StaticMethodCall__Group__3__Impl3904); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1976:1: rule__WildcardNameConcatenated__Group__0 : rule__WildcardNameConcatenated__Group__0__Impl rule__WildcardNameConcatenated__Group__1 ;
    public final void rule__WildcardNameConcatenated__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1980:1: ( rule__WildcardNameConcatenated__Group__0__Impl rule__WildcardNameConcatenated__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1981:2: rule__WildcardNameConcatenated__Group__0__Impl rule__WildcardNameConcatenated__Group__1
            {
            pushFollow(FOLLOW_rule__WildcardNameConcatenated__Group__0__Impl_in_rule__WildcardNameConcatenated__Group__03943);
            rule__WildcardNameConcatenated__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__WildcardNameConcatenated__Group__1_in_rule__WildcardNameConcatenated__Group__03946);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1988:1: rule__WildcardNameConcatenated__Group__0__Impl : ( ruleWildcardName ) ;
    public final void rule__WildcardNameConcatenated__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1992:1: ( ( ruleWildcardName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1993:1: ( ruleWildcardName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1993:1: ( ruleWildcardName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1994:1: ruleWildcardName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNameConcatenatedAccess().getWildcardNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleWildcardName_in_rule__WildcardNameConcatenated__Group__0__Impl3973);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2005:1: rule__WildcardNameConcatenated__Group__1 : rule__WildcardNameConcatenated__Group__1__Impl ;
    public final void rule__WildcardNameConcatenated__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2009:1: ( rule__WildcardNameConcatenated__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2010:2: rule__WildcardNameConcatenated__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WildcardNameConcatenated__Group__1__Impl_in_rule__WildcardNameConcatenated__Group__14002);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2016:1: rule__WildcardNameConcatenated__Group__1__Impl : ( ( rule__WildcardNameConcatenated__Group_1__0 )* ) ;
    public final void rule__WildcardNameConcatenated__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2020:1: ( ( ( rule__WildcardNameConcatenated__Group_1__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2021:1: ( ( rule__WildcardNameConcatenated__Group_1__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2021:1: ( ( rule__WildcardNameConcatenated__Group_1__0 )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2022:1: ( rule__WildcardNameConcatenated__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNameConcatenatedAccess().getGroup_1()); 
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2023:1: ( rule__WildcardNameConcatenated__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2023:2: rule__WildcardNameConcatenated__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__WildcardNameConcatenated__Group_1__0_in_rule__WildcardNameConcatenated__Group__1__Impl4029);
            	    rule__WildcardNameConcatenated__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2037:1: rule__WildcardNameConcatenated__Group_1__0 : rule__WildcardNameConcatenated__Group_1__0__Impl rule__WildcardNameConcatenated__Group_1__1 ;
    public final void rule__WildcardNameConcatenated__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2041:1: ( rule__WildcardNameConcatenated__Group_1__0__Impl rule__WildcardNameConcatenated__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2042:2: rule__WildcardNameConcatenated__Group_1__0__Impl rule__WildcardNameConcatenated__Group_1__1
            {
            pushFollow(FOLLOW_rule__WildcardNameConcatenated__Group_1__0__Impl_in_rule__WildcardNameConcatenated__Group_1__04064);
            rule__WildcardNameConcatenated__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__WildcardNameConcatenated__Group_1__1_in_rule__WildcardNameConcatenated__Group_1__04067);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2049:1: rule__WildcardNameConcatenated__Group_1__0__Impl : ( '.' ) ;
    public final void rule__WildcardNameConcatenated__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2053:1: ( ( '.' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2054:1: ( '.' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2054:1: ( '.' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2055:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNameConcatenatedAccess().getFullStopKeyword_1_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__WildcardNameConcatenated__Group_1__0__Impl4095); if (state.failed) return ;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2068:1: rule__WildcardNameConcatenated__Group_1__1 : rule__WildcardNameConcatenated__Group_1__1__Impl ;
    public final void rule__WildcardNameConcatenated__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2072:1: ( rule__WildcardNameConcatenated__Group_1__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2073:2: rule__WildcardNameConcatenated__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__WildcardNameConcatenated__Group_1__1__Impl_in_rule__WildcardNameConcatenated__Group_1__14126);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2079:1: rule__WildcardNameConcatenated__Group_1__1__Impl : ( ruleWildcardName ) ;
    public final void rule__WildcardNameConcatenated__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2083:1: ( ( ruleWildcardName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2084:1: ( ruleWildcardName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2084:1: ( ruleWildcardName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2085:1: ruleWildcardName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNameConcatenatedAccess().getWildcardNameParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleWildcardName_in_rule__WildcardNameConcatenated__Group_1__1__Impl4153);
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


    // $ANTLR start "rule__Model__VarsAssignment_1_1_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2101:1: rule__Model__VarsAssignment_1_1_0 : ( ruleVarDeclarationParam ) ;
    public final void rule__Model__VarsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2105:1: ( ( ruleVarDeclarationParam ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2106:1: ( ruleVarDeclarationParam )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2106:1: ( ruleVarDeclarationParam )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2107:1: ruleVarDeclarationParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getVarsVarDeclarationParamParserRuleCall_1_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleVarDeclarationParam_in_rule__Model__VarsAssignment_1_1_04191);
            ruleVarDeclarationParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getVarsVarDeclarationParamParserRuleCall_1_1_0_0()); 
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
    // $ANTLR end "rule__Model__VarsAssignment_1_1_0"


    // $ANTLR start "rule__Model__VarsAssignment_1_1_1_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2116:1: rule__Model__VarsAssignment_1_1_1_1 : ( ruleVarDeclarationParam ) ;
    public final void rule__Model__VarsAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2120:1: ( ( ruleVarDeclarationParam ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2121:1: ( ruleVarDeclarationParam )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2121:1: ( ruleVarDeclarationParam )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2122:1: ruleVarDeclarationParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getVarsVarDeclarationParamParserRuleCall_1_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleVarDeclarationParam_in_rule__Model__VarsAssignment_1_1_1_14222);
            ruleVarDeclarationParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getVarsVarDeclarationParamParserRuleCall_1_1_1_1_0()); 
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
    // $ANTLR end "rule__Model__VarsAssignment_1_1_1_1"


    // $ANTLR start "rule__Model__StatementsAssignment_2_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2131:1: rule__Model__StatementsAssignment_2_1 : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2135:1: ( ( ruleStatement ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2136:1: ( ruleStatement )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2136:1: ( ruleStatement )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2137:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Model__StatementsAssignment_2_14253);
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


    // $ANTLR start "rule__VarDeclarationParam__TypeAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2146:1: rule__VarDeclarationParam__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__VarDeclarationParam__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2150:1: ( ( ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2151:1: ( ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2151:1: ( ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2152:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationParamAccess().getTypeTypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__VarDeclarationParam__TypeAssignment_04284);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2161:1: rule__VarDeclarationParam__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VarDeclarationParam__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2165:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2166:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2166:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2167:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationParamAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDeclarationParam__NameAssignment_14315); if (state.failed) return ;
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


    // $ANTLR start "rule__VarNullLiteral__TypeAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2176:1: rule__VarNullLiteral__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__VarNullLiteral__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2180:1: ( ( ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2181:1: ( ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2181:1: ( ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2182:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarNullLiteralAccess().getTypeTypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__VarNullLiteral__TypeAssignment_04346);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2191:1: rule__VarNullLiteral__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VarNullLiteral__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2195:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2196:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2196:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2197:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarNullLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarNullLiteral__NameAssignment_14377); if (state.failed) return ;
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


    // $ANTLR start "rule__VarAssignment__TypeAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2206:1: rule__VarAssignment__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__VarAssignment__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2210:1: ( ( ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2211:1: ( ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2211:1: ( ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2212:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignmentAccess().getTypeTypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__VarAssignment__TypeAssignment_04408);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignmentAccess().getTypeTypeParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__VarAssignment__TypeAssignment_0"


    // $ANTLR start "rule__VarAssignment__NameAssignment_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2221:1: rule__VarAssignment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VarAssignment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2225:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2226:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2226:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2227:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignmentAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarAssignment__NameAssignment_14439); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignmentAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__VarAssignment__NameAssignment_1"


    // $ANTLR start "rule__VarInstanceCreation__TypeAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2236:1: rule__VarInstanceCreation__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__VarInstanceCreation__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2240:1: ( ( ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2241:1: ( ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2241:1: ( ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2242:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInstanceCreationAccess().getTypeTypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__VarInstanceCreation__TypeAssignment_04470);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarInstanceCreationAccess().getTypeTypeParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__VarInstanceCreation__TypeAssignment_0"


    // $ANTLR start "rule__VarInstanceCreation__NameAssignment_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2251:1: rule__VarInstanceCreation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VarInstanceCreation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2255:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2256:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2256:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2257:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarInstanceCreationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarInstanceCreation__NameAssignment_14501); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarInstanceCreationAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__VarInstanceCreation__NameAssignment_1"


    // $ANTLR start "rule__VarDeclaration__TypeAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2266:1: rule__VarDeclaration__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__VarDeclaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2270:1: ( ( ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2271:1: ( ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2271:1: ( ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2272:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__VarDeclaration__TypeAssignment_04532);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2281:1: rule__VarDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VarDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2285:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2286:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2286:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2287:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDeclaration__NameAssignment_14563); if (state.failed) return ;
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


    // $ANTLR start "rule__MethodCall__NameCalleeAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2296:1: rule__MethodCall__NameCalleeAssignment_0 : ( ruleName ) ;
    public final void rule__MethodCall__NameCalleeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2300:1: ( ( ruleName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2301:1: ( ruleName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2301:1: ( ruleName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2302:1: ruleName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getNameCalleeNameParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleName_in_rule__MethodCall__NameCalleeAssignment_04594);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2311:1: rule__MethodCall__MethodAssignment_2 : ( ruleCalledMethodName ) ;
    public final void rule__MethodCall__MethodAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2315:1: ( ( ruleCalledMethodName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2316:1: ( ruleCalledMethodName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2316:1: ( ruleCalledMethodName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2317:1: ruleCalledMethodName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getMethodCalledMethodNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleCalledMethodName_in_rule__MethodCall__MethodAssignment_24625);
            ruleCalledMethodName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getMethodCalledMethodNameParserRuleCall_2_0()); 
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2326:1: rule__MethodCall__NameCallerAssignment_4 : ( ruleName ) ;
    public final void rule__MethodCall__NameCallerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2330:1: ( ( ruleName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2331:1: ( ruleName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2331:1: ( ruleName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2332:1: ruleName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getNameCallerNameParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleName_in_rule__MethodCall__NameCallerAssignment_44656);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2341:1: rule__StaticMethodCall__MethodAssignment_0 : ( ruleWildcardNameConcatenated ) ;
    public final void rule__StaticMethodCall__MethodAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2345:1: ( ( ruleWildcardNameConcatenated ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2346:1: ( ruleWildcardNameConcatenated )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2346:1: ( ruleWildcardNameConcatenated )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2347:1: ruleWildcardNameConcatenated
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticMethodCallAccess().getMethodWildcardNameConcatenatedParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleWildcardNameConcatenated_in_rule__StaticMethodCall__MethodAssignment_04687);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2356:1: rule__StaticMethodCall__NameAssignment_2 : ( ruleName ) ;
    public final void rule__StaticMethodCall__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2360:1: ( ( ruleName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2361:1: ( ruleName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2361:1: ( ruleName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2362:1: ruleName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticMethodCallAccess().getNameNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleName_in_rule__StaticMethodCall__NameAssignment_24718);
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


    // $ANTLR start "rule__CalledMethodName__ValueAssignment"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2371:1: rule__CalledMethodName__ValueAssignment : ( ruleWildcardName ) ;
    public final void rule__CalledMethodName__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2375:1: ( ( ruleWildcardName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2376:1: ( ruleWildcardName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2376:1: ( ruleWildcardName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2377:1: ruleWildcardName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalledMethodNameAccess().getValueWildcardNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleWildcardName_in_rule__CalledMethodName__ValueAssignment4749);
            ruleWildcardName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCalledMethodNameAccess().getValueWildcardNameParserRuleCall_0()); 
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
    // $ANTLR end "rule__CalledMethodName__ValueAssignment"


    // $ANTLR start "rule__Type__ValueAssignment"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2386:1: rule__Type__ValueAssignment : ( ruleWildcardNameConcatenated ) ;
    public final void rule__Type__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2390:1: ( ( ruleWildcardNameConcatenated ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2391:1: ( ruleWildcardNameConcatenated )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2391:1: ( ruleWildcardNameConcatenated )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2392:1: ruleWildcardNameConcatenated
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getValueWildcardNameConcatenatedParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleWildcardNameConcatenated_in_rule__Type__ValueAssignment4780);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2401:1: rule__Name__ValueAssignment : ( RULE_ID ) ;
    public final void rule__Name__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2405:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2406:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2406:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:2407:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameAccess().getValueIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Name__ValueAssignment4811); if (state.failed) return ;
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
        "\23\uffff";
    static final String DFA3_eofS =
        "\4\uffff\1\11\13\uffff\1\11\2\uffff";
    static final String DFA3_minS =
        "\10\4\1\13\1\uffff\3\4\3\uffff\3\4";
    static final String DFA3_maxS =
        "\1\14\6\30\1\14\1\27\1\uffff\3\30\3\uffff\3\30";
    static final String DFA3_acceptS =
        "\11\uffff\1\4\3\uffff\1\1\1\2\1\3\3\uffff";
    static final String DFA3_specialS =
        "\23\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\6\uffff\1\2\1\3",
            "\1\4\6\uffff\1\5\1\6\13\uffff\1\7",
            "\1\4\6\uffff\1\5\1\6\13\uffff\1\7",
            "\1\4\6\uffff\1\5\1\6\13\uffff\1\7",
            "\1\4\6\uffff\1\5\1\6\4\uffff\4\11\1\10\2\uffff\1\7",
            "\1\4\6\uffff\1\5\1\6\13\uffff\1\7",
            "\1\4\6\uffff\1\5\1\6\13\uffff\1\7",
            "\1\12\6\uffff\1\13\1\14",
            "\1\15\12\uffff\1\17\1\16",
            "",
            "\1\20\6\uffff\1\21\1\22\13\uffff\1\7",
            "\1\20\6\uffff\1\21\1\22\13\uffff\1\7",
            "\1\20\6\uffff\1\21\1\22\13\uffff\1\7",
            "",
            "",
            "",
            "\1\20\6\uffff\1\21\1\22\4\uffff\4\11\1\10\2\uffff\1\7",
            "\1\20\6\uffff\1\21\1\22\13\uffff\1\7",
            "\1\20\6\uffff\1\21\1\22\13\uffff\1\7"
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
            return "488:1: rule__Statement__Alternatives_0_1 : ( ( ruleVarAssignment ) | ( ruleVarInstanceCreation ) | ( ruleVarNullLiteral ) | ( ruleVarDeclaration ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclarationParam_in_entryRuleVarDeclarationParam187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDeclarationParam194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclarationParam__Group__0_in_ruleVarDeclarationParam220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarNullLiteral_in_entryRuleVarNullLiteral247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarNullLiteral254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarNullLiteral__Group__0_in_ruleVarNullLiteral280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarAssignment_in_entryRuleVarAssignment307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarAssignment314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarAssignment__Group__0_in_ruleVarAssignment340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInstanceCreation_in_entryRuleVarInstanceCreation367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarInstanceCreation374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInstanceCreation__Group__0_in_ruleVarInstanceCreation400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_entryRuleVarDeclaration427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDeclaration434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__Group__0_in_ruleVarDeclaration460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodCall_in_entryRuleMethodCall487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodCall494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__0_in_ruleMethodCall520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticMethodCall_in_entryRuleStaticMethodCall547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticMethodCall554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticMethodCall__Group__0_in_ruleStaticMethodCall580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalledMethodName_in_entryRuleCalledMethodName607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCalledMethodName614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CalledMethodName__ValueAssignment_in_ruleCalledMethodName640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__ValueAssignment_in_ruleType700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__ValueAssignment_in_ruleName760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardNameConcatenated_in_entryRuleWildcardNameConcatenated787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWildcardNameConcatenated794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WildcardNameConcatenated__Group__0_in_ruleWildcardNameConcatenated820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardName_in_entryRuleWildcardName847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWildcardName854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WildcardName__Alternatives_in_ruleWildcardName882 = new BitSet(new long[]{0x0000000000001812L});
    public static final BitSet FOLLOW_rule__WildcardName__Alternatives_in_ruleWildcardName894 = new BitSet(new long[]{0x0000000000001812L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Alternatives933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__0_in_rule__Statement__Alternatives969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarAssignment_in_rule__Statement__Alternatives_0_11002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInstanceCreation_in_rule__Statement__Alternatives_0_11019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarNullLiteral_in_rule__Statement__Alternatives_0_11036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_rule__Statement__Alternatives_0_11053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WildcardName__Alternatives1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__WildcardName__Alternatives1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__WildcardName__Alternatives1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01155 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11216 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__0_in_rule__Model__Group__1__Impl1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_2__0_in_rule__Model__Group__2__Impl1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__0__Impl_in_rule__Model__Group_1__01341 = new BitSet(new long[]{0x0000000000005810L});
    public static final BitSet FOLLOW_rule__Model__Group_1__1_in_rule__Model__Group_1__01344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Model__Group_1__0__Impl1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__1__Impl_in_rule__Model__Group_1__11403 = new BitSet(new long[]{0x0000000000005810L});
    public static final BitSet FOLLOW_rule__Model__Group_1__2_in_rule__Model__Group_1__11406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1_1__0_in_rule__Model__Group_1__1__Impl1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__2__Impl_in_rule__Model__Group_1__21464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Model__Group_1__2__Impl1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1_1__0__Impl_in_rule__Model__Group_1_1__01529 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Model__Group_1_1__1_in_rule__Model__Group_1_1__01532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__VarsAssignment_1_1_0_in_rule__Model__Group_1_1__0__Impl1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1_1__1__Impl_in_rule__Model__Group_1_1__11589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1_1_1__0_in_rule__Model__Group_1_1__1__Impl1616 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Model__Group_1_1_1__0__Impl_in_rule__Model__Group_1_1_1__01651 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_rule__Model__Group_1_1_1__1_in_rule__Model__Group_1_1_1__01654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Model__Group_1_1_1__0__Impl1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1_1_1__1__Impl_in_rule__Model__Group_1_1_1__11713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__VarsAssignment_1_1_1_1_in_rule__Model__Group_1_1_1__1__Impl1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_2__0__Impl_in_rule__Model__Group_2__01774 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_rule__Model__Group_2__1_in_rule__Model__Group_2__01777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Model__Group_2__0__Impl1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_2__1__Impl_in_rule__Model__Group_2__11836 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_rule__Model__Group_2__2_in_rule__Model__Group_2__11839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__StatementsAssignment_2_1_in_rule__Model__Group_2__1__Impl1866 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_rule__Model__Group_2__2__Impl_in_rule__Model__Group_2__21897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Model__Group_2__2__Impl1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__01962 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__01965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Statement__Group_0__0__Impl1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__12024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_0_1_in_rule__Statement__Group_0__1__Impl2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__02085 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__02088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Statement__Group_1__0__Impl2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__12147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodCall_in_rule__Statement__Group_1__1__Impl2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__0__Impl_in_rule__Statement__Group_2__02207 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__1_in_rule__Statement__Group_2__02210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Statement__Group_2__0__Impl2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__1__Impl_in_rule__Statement__Group_2__12269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticMethodCall_in_rule__Statement__Group_2__1__Impl2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclarationParam__Group__0__Impl_in_rule__VarDeclarationParam__Group__02329 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarDeclarationParam__Group__1_in_rule__VarDeclarationParam__Group__02332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclarationParam__TypeAssignment_0_in_rule__VarDeclarationParam__Group__0__Impl2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclarationParam__Group__1__Impl_in_rule__VarDeclarationParam__Group__12389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclarationParam__NameAssignment_1_in_rule__VarDeclarationParam__Group__1__Impl2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarNullLiteral__Group__0__Impl_in_rule__VarNullLiteral__Group__02450 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarNullLiteral__Group__1_in_rule__VarNullLiteral__Group__02453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarNullLiteral__TypeAssignment_0_in_rule__VarNullLiteral__Group__0__Impl2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarNullLiteral__Group__1__Impl_in_rule__VarNullLiteral__Group__12510 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__VarNullLiteral__Group__2_in_rule__VarNullLiteral__Group__12513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarNullLiteral__NameAssignment_1_in_rule__VarNullLiteral__Group__1__Impl2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarNullLiteral__Group__2__Impl_in_rule__VarNullLiteral__Group__22570 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__VarNullLiteral__Group__3_in_rule__VarNullLiteral__Group__22573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__VarNullLiteral__Group__2__Impl2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarNullLiteral__Group__3__Impl_in_rule__VarNullLiteral__Group__32632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__VarNullLiteral__Group__3__Impl2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarAssignment__Group__0__Impl_in_rule__VarAssignment__Group__02699 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarAssignment__Group__1_in_rule__VarAssignment__Group__02702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarAssignment__TypeAssignment_0_in_rule__VarAssignment__Group__0__Impl2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarAssignment__Group__1__Impl_in_rule__VarAssignment__Group__12759 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__VarAssignment__Group__2_in_rule__VarAssignment__Group__12762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarAssignment__NameAssignment_1_in_rule__VarAssignment__Group__1__Impl2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarAssignment__Group__2__Impl_in_rule__VarAssignment__Group__22819 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__VarAssignment__Group__3_in_rule__VarAssignment__Group__22822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__VarAssignment__Group__2__Impl2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarAssignment__Group__3__Impl_in_rule__VarAssignment__Group__32881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__VarAssignment__Group__3__Impl2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInstanceCreation__Group__0__Impl_in_rule__VarInstanceCreation__Group__02948 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarInstanceCreation__Group__1_in_rule__VarInstanceCreation__Group__02951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInstanceCreation__TypeAssignment_0_in_rule__VarInstanceCreation__Group__0__Impl2978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInstanceCreation__Group__1__Impl_in_rule__VarInstanceCreation__Group__13008 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__VarInstanceCreation__Group__2_in_rule__VarInstanceCreation__Group__13011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInstanceCreation__NameAssignment_1_in_rule__VarInstanceCreation__Group__1__Impl3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInstanceCreation__Group__2__Impl_in_rule__VarInstanceCreation__Group__23068 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__VarInstanceCreation__Group__3_in_rule__VarInstanceCreation__Group__23071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__VarInstanceCreation__Group__2__Impl3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInstanceCreation__Group__3__Impl_in_rule__VarInstanceCreation__Group__33130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__VarInstanceCreation__Group__3__Impl3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__Group__0__Impl_in_rule__VarDeclaration__Group__03197 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarDeclaration__Group__1_in_rule__VarDeclaration__Group__03200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__TypeAssignment_0_in_rule__VarDeclaration__Group__0__Impl3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__Group__1__Impl_in_rule__VarDeclaration__Group__13257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__NameAssignment_1_in_rule__VarDeclaration__Group__1__Impl3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__0__Impl_in_rule__MethodCall__Group__03318 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__1_in_rule__MethodCall__Group__03321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__NameCalleeAssignment_0_in_rule__MethodCall__Group__0__Impl3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__1__Impl_in_rule__MethodCall__Group__13378 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__2_in_rule__MethodCall__Group__13381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MethodCall__Group__1__Impl3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__2__Impl_in_rule__MethodCall__Group__23440 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__3_in_rule__MethodCall__Group__23443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__MethodAssignment_2_in_rule__MethodCall__Group__2__Impl3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__3__Impl_in_rule__MethodCall__Group__33500 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__4_in_rule__MethodCall__Group__33503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MethodCall__Group__3__Impl3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__4__Impl_in_rule__MethodCall__Group__43562 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__5_in_rule__MethodCall__Group__43565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__NameCallerAssignment_4_in_rule__MethodCall__Group__4__Impl3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__5__Impl_in_rule__MethodCall__Group__53623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MethodCall__Group__5__Impl3651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticMethodCall__Group__0__Impl_in_rule__StaticMethodCall__Group__03694 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__StaticMethodCall__Group__1_in_rule__StaticMethodCall__Group__03697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticMethodCall__MethodAssignment_0_in_rule__StaticMethodCall__Group__0__Impl3724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticMethodCall__Group__1__Impl_in_rule__StaticMethodCall__Group__13754 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StaticMethodCall__Group__2_in_rule__StaticMethodCall__Group__13757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__StaticMethodCall__Group__1__Impl3785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticMethodCall__Group__2__Impl_in_rule__StaticMethodCall__Group__23816 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__StaticMethodCall__Group__3_in_rule__StaticMethodCall__Group__23819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticMethodCall__NameAssignment_2_in_rule__StaticMethodCall__Group__2__Impl3846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticMethodCall__Group__3__Impl_in_rule__StaticMethodCall__Group__33876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__StaticMethodCall__Group__3__Impl3904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WildcardNameConcatenated__Group__0__Impl_in_rule__WildcardNameConcatenated__Group__03943 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__WildcardNameConcatenated__Group__1_in_rule__WildcardNameConcatenated__Group__03946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardName_in_rule__WildcardNameConcatenated__Group__0__Impl3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WildcardNameConcatenated__Group__1__Impl_in_rule__WildcardNameConcatenated__Group__14002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WildcardNameConcatenated__Group_1__0_in_rule__WildcardNameConcatenated__Group__1__Impl4029 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__WildcardNameConcatenated__Group_1__0__Impl_in_rule__WildcardNameConcatenated__Group_1__04064 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_rule__WildcardNameConcatenated__Group_1__1_in_rule__WildcardNameConcatenated__Group_1__04067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__WildcardNameConcatenated__Group_1__0__Impl4095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WildcardNameConcatenated__Group_1__1__Impl_in_rule__WildcardNameConcatenated__Group_1__14126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardName_in_rule__WildcardNameConcatenated__Group_1__1__Impl4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclarationParam_in_rule__Model__VarsAssignment_1_1_04191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclarationParam_in_rule__Model__VarsAssignment_1_1_1_14222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Model__StatementsAssignment_2_14253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__VarDeclarationParam__TypeAssignment_04284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDeclarationParam__NameAssignment_14315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__VarNullLiteral__TypeAssignment_04346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarNullLiteral__NameAssignment_14377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__VarAssignment__TypeAssignment_04408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarAssignment__NameAssignment_14439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__VarInstanceCreation__TypeAssignment_04470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarInstanceCreation__NameAssignment_14501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__VarDeclaration__TypeAssignment_04532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDeclaration__NameAssignment_14563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__MethodCall__NameCalleeAssignment_04594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalledMethodName_in_rule__MethodCall__MethodAssignment_24625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__MethodCall__NameCallerAssignment_44656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardNameConcatenated_in_rule__StaticMethodCall__MethodAssignment_04687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__StaticMethodCall__NameAssignment_24718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardName_in_rule__CalledMethodName__ValueAssignment4749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardNameConcatenated_in_rule__Type__ValueAssignment4780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Name__ValueAssignment4811 = new BitSet(new long[]{0x0000000000000002L});

}