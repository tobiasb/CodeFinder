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

@SuppressWarnings("all")
public class InternalQL2Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAMEWITHWC", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'('", "')'", "','", "'='", "'*'", "'.'", "'()'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__20=20;
    public static final int RULE_NAMEWITHWC=4;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=9;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:61:1: ( ruleModel EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:76:1: ( rule__Model__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:88:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:89:1: ( ruleStatement EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:90:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement121);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement128); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:97:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:101:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:102:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:102:1: ( ( rule__Statement__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:103:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:104:1: ( rule__Statement__Alternatives )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:104:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement154);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleVarDef"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:116:1: entryRuleVarDef : ruleVarDef EOF ;
    public final void entryRuleVarDef() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:117:1: ( ruleVarDef EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:118:1: ruleVarDef EOF
            {
             before(grammarAccess.getVarDefRule()); 
            pushFollow(FOLLOW_ruleVarDef_in_entryRuleVarDef181);
            ruleVarDef();

            state._fsp--;

             after(grammarAccess.getVarDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDef188); 

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
    // $ANTLR end "entryRuleVarDef"


    // $ANTLR start "ruleVarDef"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:125:1: ruleVarDef : ( ( rule__VarDef__Alternatives ) ) ;
    public final void ruleVarDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:129:2: ( ( ( rule__VarDef__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:130:1: ( ( rule__VarDef__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:130:1: ( ( rule__VarDef__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:131:1: ( rule__VarDef__Alternatives )
            {
             before(grammarAccess.getVarDefAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:132:1: ( rule__VarDef__Alternatives )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:132:2: rule__VarDef__Alternatives
            {
            pushFollow(FOLLOW_rule__VarDef__Alternatives_in_ruleVarDef214);
            rule__VarDef__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVarDefAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarDef"


    // $ANTLR start "entryRuleVarInitialisation"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:144:1: entryRuleVarInitialisation : ruleVarInitialisation EOF ;
    public final void entryRuleVarInitialisation() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:145:1: ( ruleVarInitialisation EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:146:1: ruleVarInitialisation EOF
            {
             before(grammarAccess.getVarInitialisationRule()); 
            pushFollow(FOLLOW_ruleVarInitialisation_in_entryRuleVarInitialisation241);
            ruleVarInitialisation();

            state._fsp--;

             after(grammarAccess.getVarInitialisationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarInitialisation248); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:153:1: ruleVarInitialisation : ( ( rule__VarInitialisation__Group__0 ) ) ;
    public final void ruleVarInitialisation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:157:2: ( ( ( rule__VarInitialisation__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:158:1: ( ( rule__VarInitialisation__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:158:1: ( ( rule__VarInitialisation__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:159:1: ( rule__VarInitialisation__Group__0 )
            {
             before(grammarAccess.getVarInitialisationAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:160:1: ( rule__VarInitialisation__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:160:2: rule__VarInitialisation__Group__0
            {
            pushFollow(FOLLOW_rule__VarInitialisation__Group__0_in_ruleVarInitialisation274);
            rule__VarInitialisation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarInitialisationAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleVarDeclaration"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:172:1: entryRuleVarDeclaration : ruleVarDeclaration EOF ;
    public final void entryRuleVarDeclaration() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:173:1: ( ruleVarDeclaration EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:174:1: ruleVarDeclaration EOF
            {
             before(grammarAccess.getVarDeclarationRule()); 
            pushFollow(FOLLOW_ruleVarDeclaration_in_entryRuleVarDeclaration301);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getVarDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDeclaration308); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:181:1: ruleVarDeclaration : ( ( rule__VarDeclaration__Group__0 ) ) ;
    public final void ruleVarDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:185:2: ( ( ( rule__VarDeclaration__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:186:1: ( ( rule__VarDeclaration__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:186:1: ( ( rule__VarDeclaration__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:187:1: ( rule__VarDeclaration__Group__0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:188:1: ( rule__VarDeclaration__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:188:2: rule__VarDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__VarDeclaration__Group__0_in_ruleVarDeclaration334);
            rule__VarDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getGroup()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:200:1: entryRuleMethodCall : ruleMethodCall EOF ;
    public final void entryRuleMethodCall() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:201:1: ( ruleMethodCall EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:202:1: ruleMethodCall EOF
            {
             before(grammarAccess.getMethodCallRule()); 
            pushFollow(FOLLOW_ruleMethodCall_in_entryRuleMethodCall361);
            ruleMethodCall();

            state._fsp--;

             after(grammarAccess.getMethodCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodCall368); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:209:1: ruleMethodCall : ( ( rule__MethodCall__Group__0 ) ) ;
    public final void ruleMethodCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:213:2: ( ( ( rule__MethodCall__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:214:1: ( ( rule__MethodCall__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:214:1: ( ( rule__MethodCall__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:215:1: ( rule__MethodCall__Group__0 )
            {
             before(grammarAccess.getMethodCallAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:216:1: ( rule__MethodCall__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:216:2: rule__MethodCall__Group__0
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__0_in_ruleMethodCall394);
            rule__MethodCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodCallAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleVarName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:228:1: entryRuleVarName : ruleVarName EOF ;
    public final void entryRuleVarName() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:229:1: ( ruleVarName EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:230:1: ruleVarName EOF
            {
             before(grammarAccess.getVarNameRule()); 
            pushFollow(FOLLOW_ruleVarName_in_entryRuleVarName421);
            ruleVarName();

            state._fsp--;

             after(grammarAccess.getVarNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarName428); 

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
    // $ANTLR end "entryRuleVarName"


    // $ANTLR start "ruleVarName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:237:1: ruleVarName : ( RULE_NAMEWITHWC ) ;
    public final void ruleVarName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:241:2: ( ( RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:242:1: ( RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:242:1: ( RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:243:1: RULE_NAMEWITHWC
            {
             before(grammarAccess.getVarNameAccess().getNameWithWCTerminalRuleCall()); 
            match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleVarName454); 
             after(grammarAccess.getVarNameAccess().getNameWithWCTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarName"


    // $ANTLR start "entryRuleType"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:256:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:257:1: ( ruleType EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:258:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType480);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType487); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:265:1: ruleType : ( RULE_NAMEWITHWC ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:269:2: ( ( RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:270:1: ( RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:270:1: ( RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:271:1: RULE_NAMEWITHWC
            {
             before(grammarAccess.getTypeAccess().getNameWithWCTerminalRuleCall()); 
            match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleType513); 
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


    // $ANTLR start "rule__Statement__Alternatives"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:284:1: rule__Statement__Alternatives : ( ( ruleVarDef ) | ( ruleMethodCall ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:288:1: ( ( ruleVarDef ) | ( ruleMethodCall ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_NAMEWITHWC) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==19) ) {
                    alt1=2;
                }
                else if ( (LA1_1==RULE_NAMEWITHWC) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:289:1: ( ruleVarDef )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:289:1: ( ruleVarDef )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:290:1: ruleVarDef
                    {
                     before(grammarAccess.getStatementAccess().getVarDefParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleVarDef_in_rule__Statement__Alternatives548);
                    ruleVarDef();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getVarDefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:295:6: ( ruleMethodCall )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:295:6: ( ruleMethodCall )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:296:1: ruleMethodCall
                    {
                     before(grammarAccess.getStatementAccess().getMethodCallParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMethodCall_in_rule__Statement__Alternatives565);
                    ruleMethodCall();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getMethodCallParserRuleCall_1()); 

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


    // $ANTLR start "rule__VarDef__Alternatives"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:306:1: rule__VarDef__Alternatives : ( ( ( rule__VarDef__VarsAssignment_0 ) ) | ( ( rule__VarDef__VarsAssignment_1 ) ) );
    public final void rule__VarDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:310:1: ( ( ( rule__VarDef__VarsAssignment_0 ) ) | ( ( rule__VarDef__VarsAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_NAMEWITHWC) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_NAMEWITHWC) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==EOF||LA2_2==RULE_NAMEWITHWC||LA2_2==13) ) {
                        alt2=2;
                    }
                    else if ( (LA2_2==17) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:311:1: ( ( rule__VarDef__VarsAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:311:1: ( ( rule__VarDef__VarsAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:312:1: ( rule__VarDef__VarsAssignment_0 )
                    {
                     before(grammarAccess.getVarDefAccess().getVarsAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:313:1: ( rule__VarDef__VarsAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:313:2: rule__VarDef__VarsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__VarDef__VarsAssignment_0_in_rule__VarDef__Alternatives597);
                    rule__VarDef__VarsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVarDefAccess().getVarsAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:317:6: ( ( rule__VarDef__VarsAssignment_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:317:6: ( ( rule__VarDef__VarsAssignment_1 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:318:1: ( rule__VarDef__VarsAssignment_1 )
                    {
                     before(grammarAccess.getVarDefAccess().getVarsAssignment_1()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:319:1: ( rule__VarDef__VarsAssignment_1 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:319:2: rule__VarDef__VarsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__VarDef__VarsAssignment_1_in_rule__VarDef__Alternatives615);
                    rule__VarDef__VarsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVarDefAccess().getVarsAssignment_1()); 

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
    // $ANTLR end "rule__VarDef__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:330:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:334:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:335:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0646);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0649);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:342:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:346:1: ( ( () ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:347:1: ( () )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:347:1: ( () )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:348:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:349:1: ()
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:351:1: 
            {
            }

             after(grammarAccess.getModelAccess().getModelAction_0()); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:361:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:365:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:366:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1707);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1710);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:373:1: rule__Model__Group__1__Impl : ( ( rule__Model__Group_1__0 )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:377:1: ( ( ( rule__Model__Group_1__0 )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:378:1: ( ( rule__Model__Group_1__0 )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:378:1: ( ( rule__Model__Group_1__0 )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:379:1: ( rule__Model__Group_1__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:380:1: ( rule__Model__Group_1__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:380:2: rule__Model__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_1__0_in_rule__Model__Group__1__Impl737);
                    rule__Model__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_1()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:390:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:394:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:395:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2768);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2771);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:402:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:406:1: ( ( '{' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:407:1: ( '{' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:407:1: ( '{' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:408:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Model__Group__2__Impl799); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:421:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:425:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:426:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3830);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3833);
            rule__Model__Group__4();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:433:1: rule__Model__Group__3__Impl : ( ( rule__Model__StatementsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:437:1: ( ( ( rule__Model__StatementsAssignment_3 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:438:1: ( ( rule__Model__StatementsAssignment_3 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:438:1: ( ( rule__Model__StatementsAssignment_3 )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:439:1: ( rule__Model__StatementsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getStatementsAssignment_3()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:440:1: ( rule__Model__StatementsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_NAMEWITHWC) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:440:2: rule__Model__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__StatementsAssignment_3_in_rule__Model__Group__3__Impl860);
            	    rule__Model__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getStatementsAssignment_3()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:450:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:454:1: ( rule__Model__Group__4__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:455:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4891);
            rule__Model__Group__4__Impl();

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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:461:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:465:1: ( ( '}' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:466:1: ( '}' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:466:1: ( '}' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:467:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Model__Group__4__Impl919); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:490:1: rule__Model__Group_1__0 : rule__Model__Group_1__0__Impl rule__Model__Group_1__1 ;
    public final void rule__Model__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:494:1: ( rule__Model__Group_1__0__Impl rule__Model__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:495:2: rule__Model__Group_1__0__Impl rule__Model__Group_1__1
            {
            pushFollow(FOLLOW_rule__Model__Group_1__0__Impl_in_rule__Model__Group_1__0960);
            rule__Model__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_1__1_in_rule__Model__Group_1__0963);
            rule__Model__Group_1__1();

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
    // $ANTLR end "rule__Model__Group_1__0"


    // $ANTLR start "rule__Model__Group_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:502:1: rule__Model__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Model__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:506:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:507:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:507:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:508:1: '('
            {
             before(grammarAccess.getModelAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,14,FOLLOW_14_in_rule__Model__Group_1__0__Impl991); 
             after(grammarAccess.getModelAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:521:1: rule__Model__Group_1__1 : rule__Model__Group_1__1__Impl rule__Model__Group_1__2 ;
    public final void rule__Model__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:525:1: ( rule__Model__Group_1__1__Impl rule__Model__Group_1__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:526:2: rule__Model__Group_1__1__Impl rule__Model__Group_1__2
            {
            pushFollow(FOLLOW_rule__Model__Group_1__1__Impl_in_rule__Model__Group_1__11022);
            rule__Model__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_1__2_in_rule__Model__Group_1__11025);
            rule__Model__Group_1__2();

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
    // $ANTLR end "rule__Model__Group_1__1"


    // $ANTLR start "rule__Model__Group_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:533:1: rule__Model__Group_1__1__Impl : ( ( rule__Model__VarsAssignment_1_1 ) ) ;
    public final void rule__Model__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:537:1: ( ( ( rule__Model__VarsAssignment_1_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:538:1: ( ( rule__Model__VarsAssignment_1_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:538:1: ( ( rule__Model__VarsAssignment_1_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:539:1: ( rule__Model__VarsAssignment_1_1 )
            {
             before(grammarAccess.getModelAccess().getVarsAssignment_1_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:540:1: ( rule__Model__VarsAssignment_1_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:540:2: rule__Model__VarsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Model__VarsAssignment_1_1_in_rule__Model__Group_1__1__Impl1052);
            rule__Model__VarsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getVarsAssignment_1_1()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:550:1: rule__Model__Group_1__2 : rule__Model__Group_1__2__Impl rule__Model__Group_1__3 ;
    public final void rule__Model__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:554:1: ( rule__Model__Group_1__2__Impl rule__Model__Group_1__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:555:2: rule__Model__Group_1__2__Impl rule__Model__Group_1__3
            {
            pushFollow(FOLLOW_rule__Model__Group_1__2__Impl_in_rule__Model__Group_1__21082);
            rule__Model__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_1__3_in_rule__Model__Group_1__21085);
            rule__Model__Group_1__3();

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
    // $ANTLR end "rule__Model__Group_1__2"


    // $ANTLR start "rule__Model__Group_1__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:562:1: rule__Model__Group_1__2__Impl : ( ( rule__Model__Group_1_2__0 )* ) ;
    public final void rule__Model__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:566:1: ( ( ( rule__Model__Group_1_2__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:567:1: ( ( rule__Model__Group_1_2__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:567:1: ( ( rule__Model__Group_1_2__0 )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:568:1: ( rule__Model__Group_1_2__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_1_2()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:569:1: ( rule__Model__Group_1_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:569:2: rule__Model__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Model__Group_1_2__0_in_rule__Model__Group_1__2__Impl1112);
            	    rule__Model__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_1_2()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:579:1: rule__Model__Group_1__3 : rule__Model__Group_1__3__Impl ;
    public final void rule__Model__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:583:1: ( rule__Model__Group_1__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:584:2: rule__Model__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_1__3__Impl_in_rule__Model__Group_1__31143);
            rule__Model__Group_1__3__Impl();

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
    // $ANTLR end "rule__Model__Group_1__3"


    // $ANTLR start "rule__Model__Group_1__3__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:590:1: rule__Model__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Model__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:594:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:595:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:595:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:596:1: ')'
            {
             before(grammarAccess.getModelAccess().getRightParenthesisKeyword_1_3()); 
            match(input,15,FOLLOW_15_in_rule__Model__Group_1__3__Impl1171); 
             after(grammarAccess.getModelAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:617:1: rule__Model__Group_1_2__0 : rule__Model__Group_1_2__0__Impl rule__Model__Group_1_2__1 ;
    public final void rule__Model__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:621:1: ( rule__Model__Group_1_2__0__Impl rule__Model__Group_1_2__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:622:2: rule__Model__Group_1_2__0__Impl rule__Model__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Model__Group_1_2__0__Impl_in_rule__Model__Group_1_2__01210);
            rule__Model__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_1_2__1_in_rule__Model__Group_1_2__01213);
            rule__Model__Group_1_2__1();

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
    // $ANTLR end "rule__Model__Group_1_2__0"


    // $ANTLR start "rule__Model__Group_1_2__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:629:1: rule__Model__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:633:1: ( ( ',' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:634:1: ( ',' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:634:1: ( ',' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:635:1: ','
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_1_2_0()); 
            match(input,16,FOLLOW_16_in_rule__Model__Group_1_2__0__Impl1241); 
             after(grammarAccess.getModelAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:648:1: rule__Model__Group_1_2__1 : rule__Model__Group_1_2__1__Impl ;
    public final void rule__Model__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:652:1: ( rule__Model__Group_1_2__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:653:2: rule__Model__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_1_2__1__Impl_in_rule__Model__Group_1_2__11272);
            rule__Model__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__Model__Group_1_2__1"


    // $ANTLR start "rule__Model__Group_1_2__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:659:1: rule__Model__Group_1_2__1__Impl : ( ( rule__Model__VarsAssignment_1_2_1 ) ) ;
    public final void rule__Model__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:663:1: ( ( ( rule__Model__VarsAssignment_1_2_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:664:1: ( ( rule__Model__VarsAssignment_1_2_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:664:1: ( ( rule__Model__VarsAssignment_1_2_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:665:1: ( rule__Model__VarsAssignment_1_2_1 )
            {
             before(grammarAccess.getModelAccess().getVarsAssignment_1_2_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:666:1: ( rule__Model__VarsAssignment_1_2_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:666:2: rule__Model__VarsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__Model__VarsAssignment_1_2_1_in_rule__Model__Group_1_2__1__Impl1299);
            rule__Model__VarsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getVarsAssignment_1_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__VarInitialisation__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:680:1: rule__VarInitialisation__Group__0 : rule__VarInitialisation__Group__0__Impl rule__VarInitialisation__Group__1 ;
    public final void rule__VarInitialisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:684:1: ( rule__VarInitialisation__Group__0__Impl rule__VarInitialisation__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:685:2: rule__VarInitialisation__Group__0__Impl rule__VarInitialisation__Group__1
            {
            pushFollow(FOLLOW_rule__VarInitialisation__Group__0__Impl_in_rule__VarInitialisation__Group__01333);
            rule__VarInitialisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarInitialisation__Group__1_in_rule__VarInitialisation__Group__01336);
            rule__VarInitialisation__Group__1();

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
    // $ANTLR end "rule__VarInitialisation__Group__0"


    // $ANTLR start "rule__VarInitialisation__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:692:1: rule__VarInitialisation__Group__0__Impl : ( ( rule__VarInitialisation__TypeAssignment_0 ) ) ;
    public final void rule__VarInitialisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:696:1: ( ( ( rule__VarInitialisation__TypeAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:697:1: ( ( rule__VarInitialisation__TypeAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:697:1: ( ( rule__VarInitialisation__TypeAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:698:1: ( rule__VarInitialisation__TypeAssignment_0 )
            {
             before(grammarAccess.getVarInitialisationAccess().getTypeAssignment_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:699:1: ( rule__VarInitialisation__TypeAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:699:2: rule__VarInitialisation__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__VarInitialisation__TypeAssignment_0_in_rule__VarInitialisation__Group__0__Impl1363);
            rule__VarInitialisation__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVarInitialisationAccess().getTypeAssignment_0()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:709:1: rule__VarInitialisation__Group__1 : rule__VarInitialisation__Group__1__Impl rule__VarInitialisation__Group__2 ;
    public final void rule__VarInitialisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:713:1: ( rule__VarInitialisation__Group__1__Impl rule__VarInitialisation__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:714:2: rule__VarInitialisation__Group__1__Impl rule__VarInitialisation__Group__2
            {
            pushFollow(FOLLOW_rule__VarInitialisation__Group__1__Impl_in_rule__VarInitialisation__Group__11393);
            rule__VarInitialisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarInitialisation__Group__2_in_rule__VarInitialisation__Group__11396);
            rule__VarInitialisation__Group__2();

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
    // $ANTLR end "rule__VarInitialisation__Group__1"


    // $ANTLR start "rule__VarInitialisation__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:721:1: rule__VarInitialisation__Group__1__Impl : ( ( rule__VarInitialisation__NameAssignment_1 ) ) ;
    public final void rule__VarInitialisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:725:1: ( ( ( rule__VarInitialisation__NameAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:726:1: ( ( rule__VarInitialisation__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:726:1: ( ( rule__VarInitialisation__NameAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:727:1: ( rule__VarInitialisation__NameAssignment_1 )
            {
             before(grammarAccess.getVarInitialisationAccess().getNameAssignment_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:728:1: ( rule__VarInitialisation__NameAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:728:2: rule__VarInitialisation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VarInitialisation__NameAssignment_1_in_rule__VarInitialisation__Group__1__Impl1423);
            rule__VarInitialisation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVarInitialisationAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:738:1: rule__VarInitialisation__Group__2 : rule__VarInitialisation__Group__2__Impl rule__VarInitialisation__Group__3 ;
    public final void rule__VarInitialisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:742:1: ( rule__VarInitialisation__Group__2__Impl rule__VarInitialisation__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:743:2: rule__VarInitialisation__Group__2__Impl rule__VarInitialisation__Group__3
            {
            pushFollow(FOLLOW_rule__VarInitialisation__Group__2__Impl_in_rule__VarInitialisation__Group__21453);
            rule__VarInitialisation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarInitialisation__Group__3_in_rule__VarInitialisation__Group__21456);
            rule__VarInitialisation__Group__3();

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
    // $ANTLR end "rule__VarInitialisation__Group__2"


    // $ANTLR start "rule__VarInitialisation__Group__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:750:1: rule__VarInitialisation__Group__2__Impl : ( '=' ) ;
    public final void rule__VarInitialisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:754:1: ( ( '=' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:755:1: ( '=' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:755:1: ( '=' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:756:1: '='
            {
             before(grammarAccess.getVarInitialisationAccess().getEqualsSignKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__VarInitialisation__Group__2__Impl1484); 
             after(grammarAccess.getVarInitialisationAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:769:1: rule__VarInitialisation__Group__3 : rule__VarInitialisation__Group__3__Impl ;
    public final void rule__VarInitialisation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:773:1: ( rule__VarInitialisation__Group__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:774:2: rule__VarInitialisation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VarInitialisation__Group__3__Impl_in_rule__VarInitialisation__Group__31515);
            rule__VarInitialisation__Group__3__Impl();

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
    // $ANTLR end "rule__VarInitialisation__Group__3"


    // $ANTLR start "rule__VarInitialisation__Group__3__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:780:1: rule__VarInitialisation__Group__3__Impl : ( '*' ) ;
    public final void rule__VarInitialisation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:784:1: ( ( '*' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:785:1: ( '*' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:785:1: ( '*' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:786:1: '*'
            {
             before(grammarAccess.getVarInitialisationAccess().getAsteriskKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__VarInitialisation__Group__3__Impl1543); 
             after(grammarAccess.getVarInitialisationAccess().getAsteriskKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__VarDeclaration__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:807:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:811:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:812:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__VarDeclaration__Group__0__Impl_in_rule__VarDeclaration__Group__01582);
            rule__VarDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarDeclaration__Group__1_in_rule__VarDeclaration__Group__01585);
            rule__VarDeclaration__Group__1();

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
    // $ANTLR end "rule__VarDeclaration__Group__0"


    // $ANTLR start "rule__VarDeclaration__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:819:1: rule__VarDeclaration__Group__0__Impl : ( ( rule__VarDeclaration__TypeAssignment_0 ) ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:823:1: ( ( ( rule__VarDeclaration__TypeAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:824:1: ( ( rule__VarDeclaration__TypeAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:824:1: ( ( rule__VarDeclaration__TypeAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:825:1: ( rule__VarDeclaration__TypeAssignment_0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getTypeAssignment_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:826:1: ( rule__VarDeclaration__TypeAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:826:2: rule__VarDeclaration__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__VarDeclaration__TypeAssignment_0_in_rule__VarDeclaration__Group__0__Impl1612);
            rule__VarDeclaration__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getTypeAssignment_0()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:836:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:840:1: ( rule__VarDeclaration__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:841:2: rule__VarDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VarDeclaration__Group__1__Impl_in_rule__VarDeclaration__Group__11642);
            rule__VarDeclaration__Group__1__Impl();

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
    // $ANTLR end "rule__VarDeclaration__Group__1"


    // $ANTLR start "rule__VarDeclaration__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:847:1: rule__VarDeclaration__Group__1__Impl : ( ( rule__VarDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:851:1: ( ( ( rule__VarDeclaration__NameAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:852:1: ( ( rule__VarDeclaration__NameAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:852:1: ( ( rule__VarDeclaration__NameAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:853:1: ( rule__VarDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVarDeclarationAccess().getNameAssignment_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:854:1: ( rule__VarDeclaration__NameAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:854:2: rule__VarDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VarDeclaration__NameAssignment_1_in_rule__VarDeclaration__Group__1__Impl1669);
            rule__VarDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:868:1: rule__MethodCall__Group__0 : rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 ;
    public final void rule__MethodCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:872:1: ( rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:873:2: rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__0__Impl_in_rule__MethodCall__Group__01703);
            rule__MethodCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodCall__Group__1_in_rule__MethodCall__Group__01706);
            rule__MethodCall__Group__1();

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
    // $ANTLR end "rule__MethodCall__Group__0"


    // $ANTLR start "rule__MethodCall__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:880:1: rule__MethodCall__Group__0__Impl : ( ( rule__MethodCall__NameAssignment_0 ) ) ;
    public final void rule__MethodCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:884:1: ( ( ( rule__MethodCall__NameAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:885:1: ( ( rule__MethodCall__NameAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:885:1: ( ( rule__MethodCall__NameAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:886:1: ( rule__MethodCall__NameAssignment_0 )
            {
             before(grammarAccess.getMethodCallAccess().getNameAssignment_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:887:1: ( rule__MethodCall__NameAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:887:2: rule__MethodCall__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__MethodCall__NameAssignment_0_in_rule__MethodCall__Group__0__Impl1733);
            rule__MethodCall__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodCallAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:897:1: rule__MethodCall__Group__1 : rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2 ;
    public final void rule__MethodCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:901:1: ( rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:902:2: rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__1__Impl_in_rule__MethodCall__Group__11763);
            rule__MethodCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodCall__Group__2_in_rule__MethodCall__Group__11766);
            rule__MethodCall__Group__2();

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
    // $ANTLR end "rule__MethodCall__Group__1"


    // $ANTLR start "rule__MethodCall__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:909:1: rule__MethodCall__Group__1__Impl : ( '.' ) ;
    public final void rule__MethodCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:913:1: ( ( '.' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:914:1: ( '.' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:914:1: ( '.' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:915:1: '.'
            {
             before(grammarAccess.getMethodCallAccess().getFullStopKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__MethodCall__Group__1__Impl1794); 
             after(grammarAccess.getMethodCallAccess().getFullStopKeyword_1()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:928:1: rule__MethodCall__Group__2 : rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3 ;
    public final void rule__MethodCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:932:1: ( rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:933:2: rule__MethodCall__Group__2__Impl rule__MethodCall__Group__3
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__2__Impl_in_rule__MethodCall__Group__21825);
            rule__MethodCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodCall__Group__3_in_rule__MethodCall__Group__21828);
            rule__MethodCall__Group__3();

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
    // $ANTLR end "rule__MethodCall__Group__2"


    // $ANTLR start "rule__MethodCall__Group__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:940:1: rule__MethodCall__Group__2__Impl : ( ( rule__MethodCall__MethodAssignment_2 ) ) ;
    public final void rule__MethodCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:944:1: ( ( ( rule__MethodCall__MethodAssignment_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:945:1: ( ( rule__MethodCall__MethodAssignment_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:945:1: ( ( rule__MethodCall__MethodAssignment_2 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:946:1: ( rule__MethodCall__MethodAssignment_2 )
            {
             before(grammarAccess.getMethodCallAccess().getMethodAssignment_2()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:947:1: ( rule__MethodCall__MethodAssignment_2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:947:2: rule__MethodCall__MethodAssignment_2
            {
            pushFollow(FOLLOW_rule__MethodCall__MethodAssignment_2_in_rule__MethodCall__Group__2__Impl1855);
            rule__MethodCall__MethodAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMethodCallAccess().getMethodAssignment_2()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:957:1: rule__MethodCall__Group__3 : rule__MethodCall__Group__3__Impl ;
    public final void rule__MethodCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:961:1: ( rule__MethodCall__Group__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:962:2: rule__MethodCall__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MethodCall__Group__3__Impl_in_rule__MethodCall__Group__31885);
            rule__MethodCall__Group__3__Impl();

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
    // $ANTLR end "rule__MethodCall__Group__3"


    // $ANTLR start "rule__MethodCall__Group__3__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:968:1: rule__MethodCall__Group__3__Impl : ( '()' ) ;
    public final void rule__MethodCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:972:1: ( ( '()' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:973:1: ( '()' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:973:1: ( '()' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:974:1: '()'
            {
             before(grammarAccess.getMethodCallAccess().getLeftParenthesisRightParenthesisKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__MethodCall__Group__3__Impl1913); 
             after(grammarAccess.getMethodCallAccess().getLeftParenthesisRightParenthesisKeyword_3()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:996:1: rule__Model__VarsAssignment_1_1 : ( ruleVarDeclaration ) ;
    public final void rule__Model__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1000:1: ( ( ruleVarDeclaration ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1001:1: ( ruleVarDeclaration )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1001:1: ( ruleVarDeclaration )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1002:1: ruleVarDeclaration
            {
             before(grammarAccess.getModelAccess().getVarsVarDeclarationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleVarDeclaration_in_rule__Model__VarsAssignment_1_11957);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getVarsVarDeclarationParserRuleCall_1_1_0()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1011:1: rule__Model__VarsAssignment_1_2_1 : ( ruleVarDeclaration ) ;
    public final void rule__Model__VarsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1015:1: ( ( ruleVarDeclaration ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1016:1: ( ruleVarDeclaration )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1016:1: ( ruleVarDeclaration )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1017:1: ruleVarDeclaration
            {
             before(grammarAccess.getModelAccess().getVarsVarDeclarationParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleVarDeclaration_in_rule__Model__VarsAssignment_1_2_11988);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getVarsVarDeclarationParserRuleCall_1_2_1_0()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1026:1: rule__Model__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1030:1: ( ( ruleStatement ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1031:1: ( ruleStatement )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1031:1: ( ruleStatement )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1032:1: ruleStatement
            {
             before(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Model__StatementsAssignment_32019);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__VarDef__VarsAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1041:1: rule__VarDef__VarsAssignment_0 : ( ruleVarInitialisation ) ;
    public final void rule__VarDef__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1045:1: ( ( ruleVarInitialisation ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1046:1: ( ruleVarInitialisation )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1046:1: ( ruleVarInitialisation )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1047:1: ruleVarInitialisation
            {
             before(grammarAccess.getVarDefAccess().getVarsVarInitialisationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVarInitialisation_in_rule__VarDef__VarsAssignment_02050);
            ruleVarInitialisation();

            state._fsp--;

             after(grammarAccess.getVarDefAccess().getVarsVarInitialisationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDef__VarsAssignment_0"


    // $ANTLR start "rule__VarDef__VarsAssignment_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1056:1: rule__VarDef__VarsAssignment_1 : ( ruleVarDeclaration ) ;
    public final void rule__VarDef__VarsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1060:1: ( ( ruleVarDeclaration ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1061:1: ( ruleVarDeclaration )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1061:1: ( ruleVarDeclaration )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1062:1: ruleVarDeclaration
            {
             before(grammarAccess.getVarDefAccess().getVarsVarDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVarDeclaration_in_rule__VarDef__VarsAssignment_12081);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getVarDefAccess().getVarsVarDeclarationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDef__VarsAssignment_1"


    // $ANTLR start "rule__VarInitialisation__TypeAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1071:1: rule__VarInitialisation__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__VarInitialisation__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1075:1: ( ( ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1076:1: ( ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1076:1: ( ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1077:1: ruleType
            {
             before(grammarAccess.getVarInitialisationAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__VarInitialisation__TypeAssignment_02112);
            ruleType();

            state._fsp--;

             after(grammarAccess.getVarInitialisationAccess().getTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1086:1: rule__VarInitialisation__NameAssignment_1 : ( ruleVarName ) ;
    public final void rule__VarInitialisation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1090:1: ( ( ruleVarName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1091:1: ( ruleVarName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1091:1: ( ruleVarName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1092:1: ruleVarName
            {
             before(grammarAccess.getVarInitialisationAccess().getNameVarNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVarName_in_rule__VarInitialisation__NameAssignment_12143);
            ruleVarName();

            state._fsp--;

             after(grammarAccess.getVarInitialisationAccess().getNameVarNameParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__VarDeclaration__TypeAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1101:1: rule__VarDeclaration__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__VarDeclaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1105:1: ( ( ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1106:1: ( ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1106:1: ( ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1107:1: ruleType
            {
             before(grammarAccess.getVarDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__VarDeclaration__TypeAssignment_02174);
            ruleType();

            state._fsp--;

             after(grammarAccess.getVarDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1116:1: rule__VarDeclaration__NameAssignment_1 : ( ruleVarName ) ;
    public final void rule__VarDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1120:1: ( ( ruleVarName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1121:1: ( ruleVarName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1121:1: ( ruleVarName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1122:1: ruleVarName
            {
             before(grammarAccess.getVarDeclarationAccess().getNameVarNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVarName_in_rule__VarDeclaration__NameAssignment_12205);
            ruleVarName();

            state._fsp--;

             after(grammarAccess.getVarDeclarationAccess().getNameVarNameParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__MethodCall__NameAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1131:1: rule__MethodCall__NameAssignment_0 : ( ruleVarName ) ;
    public final void rule__MethodCall__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1135:1: ( ( ruleVarName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1136:1: ( ruleVarName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1136:1: ( ruleVarName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1137:1: ruleVarName
            {
             before(grammarAccess.getMethodCallAccess().getNameVarNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVarName_in_rule__MethodCall__NameAssignment_02236);
            ruleVarName();

            state._fsp--;

             after(grammarAccess.getMethodCallAccess().getNameVarNameParserRuleCall_0_0()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1146:1: rule__MethodCall__MethodAssignment_2 : ( RULE_NAMEWITHWC ) ;
    public final void rule__MethodCall__MethodAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1150:1: ( ( RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1151:1: ( RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1151:1: ( RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/ui/contentassist/antlr/internal/InternalQL2.g:1152:1: RULE_NAMEWITHWC
            {
             before(grammarAccess.getMethodCallAccess().getMethodNameWithWCTerminalRuleCall_2_0()); 
            match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_rule__MethodCall__MethodAssignment_22267); 
             after(grammarAccess.getMethodCallAccess().getMethodNameWithWCTerminalRuleCall_2_0()); 

            }


            }

        }
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


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDef_in_entryRuleVarDef181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDef188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDef__Alternatives_in_ruleVarDef214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInitialisation_in_entryRuleVarInitialisation241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarInitialisation248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__0_in_ruleVarInitialisation274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_entryRuleVarDeclaration301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDeclaration308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__Group__0_in_ruleVarDeclaration334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodCall_in_entryRuleMethodCall361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodCall368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__0_in_ruleMethodCall394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarName_in_entryRuleVarName421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarName428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleVarName454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleType513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDef_in_rule__Statement__Alternatives548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodCall_in_rule__Statement__Alternatives565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDef__VarsAssignment_0_in_rule__VarDef__Alternatives597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDef__VarsAssignment_1_in_rule__VarDef__Alternatives615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0646 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1707 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__0_in_rule__Model__Group__1__Impl737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2768 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Model__Group__2__Impl799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3830 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__StatementsAssignment_3_in_rule__Model__Group__3__Impl860 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Model__Group__4__Impl919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__0__Impl_in_rule__Model__Group_1__0960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group_1__1_in_rule__Model__Group_1__0963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Model__Group_1__0__Impl991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__1__Impl_in_rule__Model__Group_1__11022 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Model__Group_1__2_in_rule__Model__Group_1__11025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__VarsAssignment_1_1_in_rule__Model__Group_1__1__Impl1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__2__Impl_in_rule__Model__Group_1__21082 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Model__Group_1__3_in_rule__Model__Group_1__21085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1_2__0_in_rule__Model__Group_1__2__Impl1112 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__3__Impl_in_rule__Model__Group_1__31143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Model__Group_1__3__Impl1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1_2__0__Impl_in_rule__Model__Group_1_2__01210 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group_1_2__1_in_rule__Model__Group_1_2__01213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Model__Group_1_2__0__Impl1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1_2__1__Impl_in_rule__Model__Group_1_2__11272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__VarsAssignment_1_2_1_in_rule__Model__Group_1_2__1__Impl1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__0__Impl_in_rule__VarInitialisation__Group__01333 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__1_in_rule__VarInitialisation__Group__01336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInitialisation__TypeAssignment_0_in_rule__VarInitialisation__Group__0__Impl1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__1__Impl_in_rule__VarInitialisation__Group__11393 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__2_in_rule__VarInitialisation__Group__11396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInitialisation__NameAssignment_1_in_rule__VarInitialisation__Group__1__Impl1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__2__Impl_in_rule__VarInitialisation__Group__21453 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__3_in_rule__VarInitialisation__Group__21456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__VarInitialisation__Group__2__Impl1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarInitialisation__Group__3__Impl_in_rule__VarInitialisation__Group__31515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__VarInitialisation__Group__3__Impl1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__Group__0__Impl_in_rule__VarDeclaration__Group__01582 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarDeclaration__Group__1_in_rule__VarDeclaration__Group__01585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__TypeAssignment_0_in_rule__VarDeclaration__Group__0__Impl1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__Group__1__Impl_in_rule__VarDeclaration__Group__11642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDeclaration__NameAssignment_1_in_rule__VarDeclaration__Group__1__Impl1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__0__Impl_in_rule__MethodCall__Group__01703 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__1_in_rule__MethodCall__Group__01706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__NameAssignment_0_in_rule__MethodCall__Group__0__Impl1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__1__Impl_in_rule__MethodCall__Group__11763 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__2_in_rule__MethodCall__Group__11766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MethodCall__Group__1__Impl1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__2__Impl_in_rule__MethodCall__Group__21825 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__3_in_rule__MethodCall__Group__21828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__MethodAssignment_2_in_rule__MethodCall__Group__2__Impl1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodCall__Group__3__Impl_in_rule__MethodCall__Group__31885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MethodCall__Group__3__Impl1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_rule__Model__VarsAssignment_1_11957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_rule__Model__VarsAssignment_1_2_11988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Model__StatementsAssignment_32019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInitialisation_in_rule__VarDef__VarsAssignment_02050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_rule__VarDef__VarsAssignment_12081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__VarInitialisation__TypeAssignment_02112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarName_in_rule__VarInitialisation__NameAssignment_12143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__VarDeclaration__TypeAssignment_02174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarName_in_rule__VarDeclaration__NameAssignment_12205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarName_in_rule__MethodCall__NameAssignment_02236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_rule__MethodCall__MethodAssignment_22267 = new BitSet(new long[]{0x0000000000000002L});

}