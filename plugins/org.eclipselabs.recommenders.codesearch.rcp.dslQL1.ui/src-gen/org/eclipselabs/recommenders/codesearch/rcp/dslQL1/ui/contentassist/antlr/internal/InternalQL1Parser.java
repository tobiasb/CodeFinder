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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAMEWITHWC", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'where'", "'Containing'", "'('", "')'", "'and'", "'or'", "'is'", "'has'", "','", "'Methods'", "'Types'", "'IsStatic'", "'IsPrivate'", "'IsPublic'", "'IsFinal'", "'IsAbstract'", "'IsProtected'", "'Name'", "'CalledMethods'", "'!'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
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
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
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




    // $ANTLR start "entryRuleFirst"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:60:1: entryRuleFirst : ruleFirst EOF ;
    public final void entryRuleFirst() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:61:1: ( ruleFirst EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:62:1: ruleFirst EOF
            {
             before(grammarAccess.getFirstRule()); 
            pushFollow(FOLLOW_ruleFirst_in_entryRuleFirst61);
            ruleFirst();

            state._fsp--;

             after(grammarAccess.getFirstRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFirst68); 

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
    // $ANTLR end "entryRuleFirst"


    // $ANTLR start "ruleFirst"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:69:1: ruleFirst : ( ( rule__First__Group__0 ) ) ;
    public final void ruleFirst() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:73:2: ( ( ( rule__First__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:74:1: ( ( rule__First__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:74:1: ( ( rule__First__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:75:1: ( rule__First__Group__0 )
            {
             before(grammarAccess.getFirstAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:76:1: ( rule__First__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:76:2: rule__First__Group__0
            {
            pushFollow(FOLLOW_rule__First__Group__0_in_ruleFirst94);
            rule__First__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFirstAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFirst"


    // $ANTLR start "entryRuleContains"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:88:1: entryRuleContains : ruleContains EOF ;
    public final void entryRuleContains() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:89:1: ( ruleContains EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:90:1: ruleContains EOF
            {
             before(grammarAccess.getContainsRule()); 
            pushFollow(FOLLOW_ruleContains_in_entryRuleContains121);
            ruleContains();

            state._fsp--;

             after(grammarAccess.getContainsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContains128); 

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
    // $ANTLR end "entryRuleContains"


    // $ANTLR start "ruleContains"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:97:1: ruleContains : ( ( rule__Contains__Group__0 ) ) ;
    public final void ruleContains() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:101:2: ( ( ( rule__Contains__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:102:1: ( ( rule__Contains__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:102:1: ( ( rule__Contains__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:103:1: ( rule__Contains__Group__0 )
            {
             before(grammarAccess.getContainsAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:104:1: ( rule__Contains__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:104:2: rule__Contains__Group__0
            {
            pushFollow(FOLLOW_rule__Contains__Group__0_in_ruleContains154);
            rule__Contains__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContains"


    // $ANTLR start "entryRuleOrExpr"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:116:1: entryRuleOrExpr : ruleOrExpr EOF ;
    public final void entryRuleOrExpr() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:117:1: ( ruleOrExpr EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:118:1: ruleOrExpr EOF
            {
             before(grammarAccess.getOrExprRule()); 
            pushFollow(FOLLOW_ruleOrExpr_in_entryRuleOrExpr181);
            ruleOrExpr();

            state._fsp--;

             after(grammarAccess.getOrExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpr188); 

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
    // $ANTLR end "entryRuleOrExpr"


    // $ANTLR start "ruleOrExpr"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:125:1: ruleOrExpr : ( ( rule__OrExpr__Group__0 ) ) ;
    public final void ruleOrExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:129:2: ( ( ( rule__OrExpr__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:130:1: ( ( rule__OrExpr__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:130:1: ( ( rule__OrExpr__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:131:1: ( rule__OrExpr__Group__0 )
            {
             before(grammarAccess.getOrExprAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:132:1: ( rule__OrExpr__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:132:2: rule__OrExpr__Group__0
            {
            pushFollow(FOLLOW_rule__OrExpr__Group__0_in_ruleOrExpr214);
            rule__OrExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRuleAndExpr"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:144:1: entryRuleAndExpr : ruleAndExpr EOF ;
    public final void entryRuleAndExpr() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:145:1: ( ruleAndExpr EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:146:1: ruleAndExpr EOF
            {
             before(grammarAccess.getAndExprRule()); 
            pushFollow(FOLLOW_ruleAndExpr_in_entryRuleAndExpr241);
            ruleAndExpr();

            state._fsp--;

             after(grammarAccess.getAndExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpr248); 

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
    // $ANTLR end "entryRuleAndExpr"


    // $ANTLR start "ruleAndExpr"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:153:1: ruleAndExpr : ( ( rule__AndExpr__Group__0 ) ) ;
    public final void ruleAndExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:157:2: ( ( ( rule__AndExpr__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:158:1: ( ( rule__AndExpr__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:158:1: ( ( rule__AndExpr__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:159:1: ( rule__AndExpr__Group__0 )
            {
             before(grammarAccess.getAndExprAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:160:1: ( rule__AndExpr__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:160:2: rule__AndExpr__Group__0
            {
            pushFollow(FOLLOW_rule__AndExpr__Group__0_in_ruleAndExpr274);
            rule__AndExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRulePrimary"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:172:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:173:1: ( rulePrimary EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:174:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary301);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary308); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:181:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:185:2: ( ( ( rule__Primary__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:186:1: ( ( rule__Primary__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:186:1: ( ( rule__Primary__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:187:1: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:188:1: ( rule__Primary__Alternatives )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:188:2: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_rule__Primary__Alternatives_in_rulePrimary334);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleFieldExpr"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:200:1: entryRuleFieldExpr : ruleFieldExpr EOF ;
    public final void entryRuleFieldExpr() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:201:1: ( ruleFieldExpr EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:202:1: ruleFieldExpr EOF
            {
             before(grammarAccess.getFieldExprRule()); 
            pushFollow(FOLLOW_ruleFieldExpr_in_entryRuleFieldExpr361);
            ruleFieldExpr();

            state._fsp--;

             after(grammarAccess.getFieldExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldExpr368); 

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
    // $ANTLR end "entryRuleFieldExpr"


    // $ANTLR start "ruleFieldExpr"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:209:1: ruleFieldExpr : ( ( rule__FieldExpr__Alternatives ) ) ;
    public final void ruleFieldExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:213:2: ( ( ( rule__FieldExpr__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:214:1: ( ( rule__FieldExpr__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:214:1: ( ( rule__FieldExpr__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:215:1: ( rule__FieldExpr__Alternatives )
            {
             before(grammarAccess.getFieldExprAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:216:1: ( rule__FieldExpr__Alternatives )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:216:2: rule__FieldExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__FieldExpr__Alternatives_in_ruleFieldExpr394);
            rule__FieldExpr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFieldExprAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldExpr"


    // $ANTLR start "entryRuleType"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:228:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:229:1: ( ruleType EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:230:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType421);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType428); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:237:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:241:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:242:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:242:1: ( ( rule__Type__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:243:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:244:1: ( rule__Type__Alternatives )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:244:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType454);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleSingleValueField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:256:1: entryRuleSingleValueField : ruleSingleValueField EOF ;
    public final void entryRuleSingleValueField() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:257:1: ( ruleSingleValueField EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:258:1: ruleSingleValueField EOF
            {
             before(grammarAccess.getSingleValueFieldRule()); 
            pushFollow(FOLLOW_ruleSingleValueField_in_entryRuleSingleValueField481);
            ruleSingleValueField();

            state._fsp--;

             after(grammarAccess.getSingleValueFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleValueField488); 

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
    // $ANTLR end "entryRuleSingleValueField"


    // $ANTLR start "ruleSingleValueField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:265:1: ruleSingleValueField : ( ( rule__SingleValueField__Group__0 ) ) ;
    public final void ruleSingleValueField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:269:2: ( ( ( rule__SingleValueField__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:270:1: ( ( rule__SingleValueField__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:270:1: ( ( rule__SingleValueField__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:271:1: ( rule__SingleValueField__Group__0 )
            {
             before(grammarAccess.getSingleValueFieldAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:272:1: ( rule__SingleValueField__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:272:2: rule__SingleValueField__Group__0
            {
            pushFollow(FOLLOW_rule__SingleValueField__Group__0_in_ruleSingleValueField514);
            rule__SingleValueField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleValueFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleValueField"


    // $ANTLR start "entryRuleMultiValueField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:284:1: entryRuleMultiValueField : ruleMultiValueField EOF ;
    public final void entryRuleMultiValueField() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:285:1: ( ruleMultiValueField EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:286:1: ruleMultiValueField EOF
            {
             before(grammarAccess.getMultiValueFieldRule()); 
            pushFollow(FOLLOW_ruleMultiValueField_in_entryRuleMultiValueField541);
            ruleMultiValueField();

            state._fsp--;

             after(grammarAccess.getMultiValueFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiValueField548); 

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
    // $ANTLR end "entryRuleMultiValueField"


    // $ANTLR start "ruleMultiValueField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:293:1: ruleMultiValueField : ( ( rule__MultiValueField__Group__0 ) ) ;
    public final void ruleMultiValueField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:297:2: ( ( ( rule__MultiValueField__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:298:1: ( ( rule__MultiValueField__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:298:1: ( ( rule__MultiValueField__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:299:1: ( rule__MultiValueField__Group__0 )
            {
             before(grammarAccess.getMultiValueFieldAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:300:1: ( rule__MultiValueField__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:300:2: rule__MultiValueField__Group__0
            {
            pushFollow(FOLLOW_rule__MultiValueField__Group__0_in_ruleMultiValueField574);
            rule__MultiValueField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiValueFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiValueField"


    // $ANTLR start "entryRuleBooleanField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:312:1: entryRuleBooleanField : ruleBooleanField EOF ;
    public final void entryRuleBooleanField() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:313:1: ( ruleBooleanField EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:314:1: ruleBooleanField EOF
            {
             before(grammarAccess.getBooleanFieldRule()); 
            pushFollow(FOLLOW_ruleBooleanField_in_entryRuleBooleanField601);
            ruleBooleanField();

            state._fsp--;

             after(grammarAccess.getBooleanFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanField608); 

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
    // $ANTLR end "entryRuleBooleanField"


    // $ANTLR start "ruleBooleanField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:321:1: ruleBooleanField : ( ( rule__BooleanField__Group__0 ) ) ;
    public final void ruleBooleanField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:325:2: ( ( ( rule__BooleanField__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:326:1: ( ( rule__BooleanField__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:326:1: ( ( rule__BooleanField__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:327:1: ( rule__BooleanField__Group__0 )
            {
             before(grammarAccess.getBooleanFieldAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:328:1: ( rule__BooleanField__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:328:2: rule__BooleanField__Group__0
            {
            pushFollow(FOLLOW_rule__BooleanField__Group__0_in_ruleBooleanField634);
            rule__BooleanField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanField"


    // $ANTLR start "entryRuleSingleValueFieldName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:340:1: entryRuleSingleValueFieldName : ruleSingleValueFieldName EOF ;
    public final void entryRuleSingleValueFieldName() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:341:1: ( ruleSingleValueFieldName EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:342:1: ruleSingleValueFieldName EOF
            {
             before(grammarAccess.getSingleValueFieldNameRule()); 
            pushFollow(FOLLOW_ruleSingleValueFieldName_in_entryRuleSingleValueFieldName661);
            ruleSingleValueFieldName();

            state._fsp--;

             after(grammarAccess.getSingleValueFieldNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleValueFieldName668); 

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
    // $ANTLR end "entryRuleSingleValueFieldName"


    // $ANTLR start "ruleSingleValueFieldName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:349:1: ruleSingleValueFieldName : ( ( rule__SingleValueFieldName__ValueAssignment ) ) ;
    public final void ruleSingleValueFieldName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:353:2: ( ( ( rule__SingleValueFieldName__ValueAssignment ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:354:1: ( ( rule__SingleValueFieldName__ValueAssignment ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:354:1: ( ( rule__SingleValueFieldName__ValueAssignment ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:355:1: ( rule__SingleValueFieldName__ValueAssignment )
            {
             before(grammarAccess.getSingleValueFieldNameAccess().getValueAssignment()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:356:1: ( rule__SingleValueFieldName__ValueAssignment )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:356:2: rule__SingleValueFieldName__ValueAssignment
            {
            pushFollow(FOLLOW_rule__SingleValueFieldName__ValueAssignment_in_ruleSingleValueFieldName694);
            rule__SingleValueFieldName__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSingleValueFieldNameAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleValueFieldName"


    // $ANTLR start "entryRuleMultiValueFieldName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:368:1: entryRuleMultiValueFieldName : ruleMultiValueFieldName EOF ;
    public final void entryRuleMultiValueFieldName() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:369:1: ( ruleMultiValueFieldName EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:370:1: ruleMultiValueFieldName EOF
            {
             before(grammarAccess.getMultiValueFieldNameRule()); 
            pushFollow(FOLLOW_ruleMultiValueFieldName_in_entryRuleMultiValueFieldName721);
            ruleMultiValueFieldName();

            state._fsp--;

             after(grammarAccess.getMultiValueFieldNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiValueFieldName728); 

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
    // $ANTLR end "entryRuleMultiValueFieldName"


    // $ANTLR start "ruleMultiValueFieldName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:377:1: ruleMultiValueFieldName : ( ( rule__MultiValueFieldName__ValueAssignment ) ) ;
    public final void ruleMultiValueFieldName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:381:2: ( ( ( rule__MultiValueFieldName__ValueAssignment ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:382:1: ( ( rule__MultiValueFieldName__ValueAssignment ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:382:1: ( ( rule__MultiValueFieldName__ValueAssignment ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:383:1: ( rule__MultiValueFieldName__ValueAssignment )
            {
             before(grammarAccess.getMultiValueFieldNameAccess().getValueAssignment()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:384:1: ( rule__MultiValueFieldName__ValueAssignment )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:384:2: rule__MultiValueFieldName__ValueAssignment
            {
            pushFollow(FOLLOW_rule__MultiValueFieldName__ValueAssignment_in_ruleMultiValueFieldName754);
            rule__MultiValueFieldName__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMultiValueFieldNameAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiValueFieldName"


    // $ANTLR start "entryRuleNegation"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:396:1: entryRuleNegation : ruleNegation EOF ;
    public final void entryRuleNegation() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:397:1: ( ruleNegation EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:398:1: ruleNegation EOF
            {
             before(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation781);
            ruleNegation();

            state._fsp--;

             after(grammarAccess.getNegationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation788); 

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
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:405:1: ruleNegation : ( ( rule__Negation__ValueAssignment ) ) ;
    public final void ruleNegation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:409:2: ( ( ( rule__Negation__ValueAssignment ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:410:1: ( ( rule__Negation__ValueAssignment ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:410:1: ( ( rule__Negation__ValueAssignment ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:411:1: ( rule__Negation__ValueAssignment )
            {
             before(grammarAccess.getNegationAccess().getValueAssignment()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:412:1: ( rule__Negation__ValueAssignment )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:412:2: rule__Negation__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Negation__ValueAssignment_in_ruleNegation814);
            rule__Negation__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNegationAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegation"


    // $ANTLR start "rule__Primary__Alternatives"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:426:1: rule__Primary__Alternatives : ( ( ruleFieldExpr ) | ( ( rule__Primary__Group_1__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:430:1: ( ( ruleFieldExpr ) | ( ( rule__Primary__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=23 && LA1_0<=31)) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:431:1: ( ruleFieldExpr )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:431:1: ( ruleFieldExpr )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:432:1: ruleFieldExpr
                    {
                     before(grammarAccess.getPrimaryAccess().getFieldExprParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFieldExpr_in_rule__Primary__Alternatives852);
                    ruleFieldExpr();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getFieldExprParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:437:6: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:437:6: ( ( rule__Primary__Group_1__0 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:438:1: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:439:1: ( rule__Primary__Group_1__0 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:439:2: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_1__0_in_rule__Primary__Alternatives869);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__FieldExpr__Alternatives"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:448:1: rule__FieldExpr__Alternatives : ( ( ruleSingleValueField ) | ( ruleMultiValueField ) | ( ruleBooleanField ) );
    public final void rule__FieldExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:452:1: ( ( ruleSingleValueField ) | ( ruleMultiValueField ) | ( ruleBooleanField ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt2=1;
                }
                break;
            case 30:
                {
                alt2=2;
                }
                break;
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 31:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:453:1: ( ruleSingleValueField )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:453:1: ( ruleSingleValueField )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:454:1: ruleSingleValueField
                    {
                     before(grammarAccess.getFieldExprAccess().getSingleValueFieldParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSingleValueField_in_rule__FieldExpr__Alternatives902);
                    ruleSingleValueField();

                    state._fsp--;

                     after(grammarAccess.getFieldExprAccess().getSingleValueFieldParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:459:6: ( ruleMultiValueField )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:459:6: ( ruleMultiValueField )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:460:1: ruleMultiValueField
                    {
                     before(grammarAccess.getFieldExprAccess().getMultiValueFieldParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMultiValueField_in_rule__FieldExpr__Alternatives919);
                    ruleMultiValueField();

                    state._fsp--;

                     after(grammarAccess.getFieldExprAccess().getMultiValueFieldParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:465:6: ( ruleBooleanField )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:465:6: ( ruleBooleanField )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:466:1: ruleBooleanField
                    {
                     before(grammarAccess.getFieldExprAccess().getBooleanFieldParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBooleanField_in_rule__FieldExpr__Alternatives936);
                    ruleBooleanField();

                    state._fsp--;

                     after(grammarAccess.getFieldExprAccess().getBooleanFieldParserRuleCall_2()); 

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
    // $ANTLR end "rule__FieldExpr__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:476:1: rule__Type__Alternatives : ( ( ( rule__Type__ValueAssignment_0 ) ) | ( ( rule__Type__MethodAssignment_1 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:480:1: ( ( ( rule__Type__ValueAssignment_0 ) ) | ( ( rule__Type__MethodAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            else if ( (LA3_0==22) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:481:1: ( ( rule__Type__ValueAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:481:1: ( ( rule__Type__ValueAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:482:1: ( rule__Type__ValueAssignment_0 )
                    {
                     before(grammarAccess.getTypeAccess().getValueAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:483:1: ( rule__Type__ValueAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:483:2: rule__Type__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Type__ValueAssignment_0_in_rule__Type__Alternatives968);
                    rule__Type__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:487:6: ( ( rule__Type__MethodAssignment_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:487:6: ( ( rule__Type__MethodAssignment_1 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:488:1: ( rule__Type__MethodAssignment_1 )
                    {
                     before(grammarAccess.getTypeAccess().getMethodAssignment_1()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:489:1: ( rule__Type__MethodAssignment_1 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:489:2: rule__Type__MethodAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Type__MethodAssignment_1_in_rule__Type__Alternatives986);
                    rule__Type__MethodAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getMethodAssignment_1()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__MultiValueField__Alternatives_2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:498:1: rule__MultiValueField__Alternatives_2 : ( ( ( rule__MultiValueField__ValuesAssignment_2_0 ) ) | ( ( rule__MultiValueField__Group_2_1__0 ) ) );
    public final void rule__MultiValueField__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:502:1: ( ( ( rule__MultiValueField__ValuesAssignment_2_0 ) ) | ( ( rule__MultiValueField__Group_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_NAMEWITHWC) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:503:1: ( ( rule__MultiValueField__ValuesAssignment_2_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:503:1: ( ( rule__MultiValueField__ValuesAssignment_2_0 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:504:1: ( rule__MultiValueField__ValuesAssignment_2_0 )
                    {
                     before(grammarAccess.getMultiValueFieldAccess().getValuesAssignment_2_0()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:505:1: ( rule__MultiValueField__ValuesAssignment_2_0 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:505:2: rule__MultiValueField__ValuesAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__MultiValueField__ValuesAssignment_2_0_in_rule__MultiValueField__Alternatives_21019);
                    rule__MultiValueField__ValuesAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiValueFieldAccess().getValuesAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:509:6: ( ( rule__MultiValueField__Group_2_1__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:509:6: ( ( rule__MultiValueField__Group_2_1__0 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:510:1: ( rule__MultiValueField__Group_2_1__0 )
                    {
                     before(grammarAccess.getMultiValueFieldAccess().getGroup_2_1()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:511:1: ( rule__MultiValueField__Group_2_1__0 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:511:2: rule__MultiValueField__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__MultiValueField__Group_2_1__0_in_rule__MultiValueField__Alternatives_21037);
                    rule__MultiValueField__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiValueFieldAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__MultiValueField__Alternatives_2"


    // $ANTLR start "rule__BooleanField__Alternatives_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:520:1: rule__BooleanField__Alternatives_1 : ( ( ( rule__BooleanField__ValueAssignment_1_0 ) ) | ( ( rule__BooleanField__ValueAssignment_1_1 ) ) | ( ( rule__BooleanField__ValueAssignment_1_2 ) ) | ( ( rule__BooleanField__ValueAssignment_1_3 ) ) | ( ( rule__BooleanField__ValueAssignment_1_4 ) ) | ( ( rule__BooleanField__ValueAssignment_1_5 ) ) );
    public final void rule__BooleanField__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:524:1: ( ( ( rule__BooleanField__ValueAssignment_1_0 ) ) | ( ( rule__BooleanField__ValueAssignment_1_1 ) ) | ( ( rule__BooleanField__ValueAssignment_1_2 ) ) | ( ( rule__BooleanField__ValueAssignment_1_3 ) ) | ( ( rule__BooleanField__ValueAssignment_1_4 ) ) | ( ( rule__BooleanField__ValueAssignment_1_5 ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case 25:
                {
                alt5=3;
                }
                break;
            case 26:
                {
                alt5=4;
                }
                break;
            case 27:
                {
                alt5=5;
                }
                break;
            case 28:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:525:1: ( ( rule__BooleanField__ValueAssignment_1_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:525:1: ( ( rule__BooleanField__ValueAssignment_1_0 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:526:1: ( rule__BooleanField__ValueAssignment_1_0 )
                    {
                     before(grammarAccess.getBooleanFieldAccess().getValueAssignment_1_0()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:527:1: ( rule__BooleanField__ValueAssignment_1_0 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:527:2: rule__BooleanField__ValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__BooleanField__ValueAssignment_1_0_in_rule__BooleanField__Alternatives_11070);
                    rule__BooleanField__ValueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanFieldAccess().getValueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:531:6: ( ( rule__BooleanField__ValueAssignment_1_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:531:6: ( ( rule__BooleanField__ValueAssignment_1_1 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:532:1: ( rule__BooleanField__ValueAssignment_1_1 )
                    {
                     before(grammarAccess.getBooleanFieldAccess().getValueAssignment_1_1()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:533:1: ( rule__BooleanField__ValueAssignment_1_1 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:533:2: rule__BooleanField__ValueAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__BooleanField__ValueAssignment_1_1_in_rule__BooleanField__Alternatives_11088);
                    rule__BooleanField__ValueAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanFieldAccess().getValueAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:537:6: ( ( rule__BooleanField__ValueAssignment_1_2 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:537:6: ( ( rule__BooleanField__ValueAssignment_1_2 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:538:1: ( rule__BooleanField__ValueAssignment_1_2 )
                    {
                     before(grammarAccess.getBooleanFieldAccess().getValueAssignment_1_2()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:539:1: ( rule__BooleanField__ValueAssignment_1_2 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:539:2: rule__BooleanField__ValueAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__BooleanField__ValueAssignment_1_2_in_rule__BooleanField__Alternatives_11106);
                    rule__BooleanField__ValueAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanFieldAccess().getValueAssignment_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:543:6: ( ( rule__BooleanField__ValueAssignment_1_3 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:543:6: ( ( rule__BooleanField__ValueAssignment_1_3 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:544:1: ( rule__BooleanField__ValueAssignment_1_3 )
                    {
                     before(grammarAccess.getBooleanFieldAccess().getValueAssignment_1_3()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:545:1: ( rule__BooleanField__ValueAssignment_1_3 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:545:2: rule__BooleanField__ValueAssignment_1_3
                    {
                    pushFollow(FOLLOW_rule__BooleanField__ValueAssignment_1_3_in_rule__BooleanField__Alternatives_11124);
                    rule__BooleanField__ValueAssignment_1_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanFieldAccess().getValueAssignment_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:549:6: ( ( rule__BooleanField__ValueAssignment_1_4 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:549:6: ( ( rule__BooleanField__ValueAssignment_1_4 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:550:1: ( rule__BooleanField__ValueAssignment_1_4 )
                    {
                     before(grammarAccess.getBooleanFieldAccess().getValueAssignment_1_4()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:551:1: ( rule__BooleanField__ValueAssignment_1_4 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:551:2: rule__BooleanField__ValueAssignment_1_4
                    {
                    pushFollow(FOLLOW_rule__BooleanField__ValueAssignment_1_4_in_rule__BooleanField__Alternatives_11142);
                    rule__BooleanField__ValueAssignment_1_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanFieldAccess().getValueAssignment_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:555:6: ( ( rule__BooleanField__ValueAssignment_1_5 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:555:6: ( ( rule__BooleanField__ValueAssignment_1_5 ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:556:1: ( rule__BooleanField__ValueAssignment_1_5 )
                    {
                     before(grammarAccess.getBooleanFieldAccess().getValueAssignment_1_5()); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:557:1: ( rule__BooleanField__ValueAssignment_1_5 )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:557:2: rule__BooleanField__ValueAssignment_1_5
                    {
                    pushFollow(FOLLOW_rule__BooleanField__ValueAssignment_1_5_in_rule__BooleanField__Alternatives_11160);
                    rule__BooleanField__ValueAssignment_1_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanFieldAccess().getValueAssignment_1_5()); 

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
    // $ANTLR end "rule__BooleanField__Alternatives_1"


    // $ANTLR start "rule__First__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:569:1: rule__First__Group__0 : rule__First__Group__0__Impl rule__First__Group__1 ;
    public final void rule__First__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:573:1: ( rule__First__Group__0__Impl rule__First__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:574:2: rule__First__Group__0__Impl rule__First__Group__1
            {
            pushFollow(FOLLOW_rule__First__Group__0__Impl_in_rule__First__Group__01192);
            rule__First__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__First__Group__1_in_rule__First__Group__01195);
            rule__First__Group__1();

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
    // $ANTLR end "rule__First__Group__0"


    // $ANTLR start "rule__First__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:581:1: rule__First__Group__0__Impl : ( ( rule__First__TypeAssignment_0 ) ) ;
    public final void rule__First__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:585:1: ( ( ( rule__First__TypeAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:586:1: ( ( rule__First__TypeAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:586:1: ( ( rule__First__TypeAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:587:1: ( rule__First__TypeAssignment_0 )
            {
             before(grammarAccess.getFirstAccess().getTypeAssignment_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:588:1: ( rule__First__TypeAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:588:2: rule__First__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__First__TypeAssignment_0_in_rule__First__Group__0__Impl1222);
            rule__First__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFirstAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__First__Group__0__Impl"


    // $ANTLR start "rule__First__Group__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:598:1: rule__First__Group__1 : rule__First__Group__1__Impl rule__First__Group__2 ;
    public final void rule__First__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:602:1: ( rule__First__Group__1__Impl rule__First__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:603:2: rule__First__Group__1__Impl rule__First__Group__2
            {
            pushFollow(FOLLOW_rule__First__Group__1__Impl_in_rule__First__Group__11252);
            rule__First__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__First__Group__2_in_rule__First__Group__11255);
            rule__First__Group__2();

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
    // $ANTLR end "rule__First__Group__1"


    // $ANTLR start "rule__First__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:610:1: rule__First__Group__1__Impl : ( 'where' ) ;
    public final void rule__First__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:614:1: ( ( 'where' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:615:1: ( 'where' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:615:1: ( 'where' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:616:1: 'where'
            {
             before(grammarAccess.getFirstAccess().getWhereKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__First__Group__1__Impl1283); 
             after(grammarAccess.getFirstAccess().getWhereKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__First__Group__1__Impl"


    // $ANTLR start "rule__First__Group__2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:629:1: rule__First__Group__2 : rule__First__Group__2__Impl rule__First__Group__3 ;
    public final void rule__First__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:633:1: ( rule__First__Group__2__Impl rule__First__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:634:2: rule__First__Group__2__Impl rule__First__Group__3
            {
            pushFollow(FOLLOW_rule__First__Group__2__Impl_in_rule__First__Group__21314);
            rule__First__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__First__Group__3_in_rule__First__Group__21317);
            rule__First__Group__3();

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
    // $ANTLR end "rule__First__Group__2"


    // $ANTLR start "rule__First__Group__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:641:1: rule__First__Group__2__Impl : ( ( rule__First__EAssignment_2 ) ) ;
    public final void rule__First__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:645:1: ( ( ( rule__First__EAssignment_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:646:1: ( ( rule__First__EAssignment_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:646:1: ( ( rule__First__EAssignment_2 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:647:1: ( rule__First__EAssignment_2 )
            {
             before(grammarAccess.getFirstAccess().getEAssignment_2()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:648:1: ( rule__First__EAssignment_2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:648:2: rule__First__EAssignment_2
            {
            pushFollow(FOLLOW_rule__First__EAssignment_2_in_rule__First__Group__2__Impl1344);
            rule__First__EAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFirstAccess().getEAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__First__Group__2__Impl"


    // $ANTLR start "rule__First__Group__3"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:658:1: rule__First__Group__3 : rule__First__Group__3__Impl ;
    public final void rule__First__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:662:1: ( rule__First__Group__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:663:2: rule__First__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__First__Group__3__Impl_in_rule__First__Group__31374);
            rule__First__Group__3__Impl();

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
    // $ANTLR end "rule__First__Group__3"


    // $ANTLR start "rule__First__Group__3__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:669:1: rule__First__Group__3__Impl : ( ( rule__First__Group_3__0 )? ) ;
    public final void rule__First__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:673:1: ( ( ( rule__First__Group_3__0 )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:674:1: ( ( rule__First__Group_3__0 )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:674:1: ( ( rule__First__Group_3__0 )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:675:1: ( rule__First__Group_3__0 )?
            {
             before(grammarAccess.getFirstAccess().getGroup_3()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:676:1: ( rule__First__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:676:2: rule__First__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__First__Group_3__0_in_rule__First__Group__3__Impl1401);
                    rule__First__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFirstAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__First__Group__3__Impl"


    // $ANTLR start "rule__First__Group_3__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:694:1: rule__First__Group_3__0 : rule__First__Group_3__0__Impl rule__First__Group_3__1 ;
    public final void rule__First__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:698:1: ( rule__First__Group_3__0__Impl rule__First__Group_3__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:699:2: rule__First__Group_3__0__Impl rule__First__Group_3__1
            {
            pushFollow(FOLLOW_rule__First__Group_3__0__Impl_in_rule__First__Group_3__01440);
            rule__First__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__First__Group_3__1_in_rule__First__Group_3__01443);
            rule__First__Group_3__1();

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
    // $ANTLR end "rule__First__Group_3__0"


    // $ANTLR start "rule__First__Group_3__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:706:1: rule__First__Group_3__0__Impl : ( 'Containing' ) ;
    public final void rule__First__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:710:1: ( ( 'Containing' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:711:1: ( 'Containing' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:711:1: ( 'Containing' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:712:1: 'Containing'
            {
             before(grammarAccess.getFirstAccess().getContainingKeyword_3_0()); 
            match(input,13,FOLLOW_13_in_rule__First__Group_3__0__Impl1471); 
             after(grammarAccess.getFirstAccess().getContainingKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__First__Group_3__0__Impl"


    // $ANTLR start "rule__First__Group_3__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:725:1: rule__First__Group_3__1 : rule__First__Group_3__1__Impl rule__First__Group_3__2 ;
    public final void rule__First__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:729:1: ( rule__First__Group_3__1__Impl rule__First__Group_3__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:730:2: rule__First__Group_3__1__Impl rule__First__Group_3__2
            {
            pushFollow(FOLLOW_rule__First__Group_3__1__Impl_in_rule__First__Group_3__11502);
            rule__First__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__First__Group_3__2_in_rule__First__Group_3__11505);
            rule__First__Group_3__2();

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
    // $ANTLR end "rule__First__Group_3__1"


    // $ANTLR start "rule__First__Group_3__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:737:1: rule__First__Group_3__1__Impl : ( '(' ) ;
    public final void rule__First__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:741:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:742:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:742:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:743:1: '('
            {
             before(grammarAccess.getFirstAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,14,FOLLOW_14_in_rule__First__Group_3__1__Impl1533); 
             after(grammarAccess.getFirstAccess().getLeftParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__First__Group_3__1__Impl"


    // $ANTLR start "rule__First__Group_3__2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:756:1: rule__First__Group_3__2 : rule__First__Group_3__2__Impl rule__First__Group_3__3 ;
    public final void rule__First__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:760:1: ( rule__First__Group_3__2__Impl rule__First__Group_3__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:761:2: rule__First__Group_3__2__Impl rule__First__Group_3__3
            {
            pushFollow(FOLLOW_rule__First__Group_3__2__Impl_in_rule__First__Group_3__21564);
            rule__First__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__First__Group_3__3_in_rule__First__Group_3__21567);
            rule__First__Group_3__3();

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
    // $ANTLR end "rule__First__Group_3__2"


    // $ANTLR start "rule__First__Group_3__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:768:1: rule__First__Group_3__2__Impl : ( ( rule__First__CAssignment_3_2 ) ) ;
    public final void rule__First__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:772:1: ( ( ( rule__First__CAssignment_3_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:773:1: ( ( rule__First__CAssignment_3_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:773:1: ( ( rule__First__CAssignment_3_2 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:774:1: ( rule__First__CAssignment_3_2 )
            {
             before(grammarAccess.getFirstAccess().getCAssignment_3_2()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:775:1: ( rule__First__CAssignment_3_2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:775:2: rule__First__CAssignment_3_2
            {
            pushFollow(FOLLOW_rule__First__CAssignment_3_2_in_rule__First__Group_3__2__Impl1594);
            rule__First__CAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getFirstAccess().getCAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__First__Group_3__2__Impl"


    // $ANTLR start "rule__First__Group_3__3"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:785:1: rule__First__Group_3__3 : rule__First__Group_3__3__Impl rule__First__Group_3__4 ;
    public final void rule__First__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:789:1: ( rule__First__Group_3__3__Impl rule__First__Group_3__4 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:790:2: rule__First__Group_3__3__Impl rule__First__Group_3__4
            {
            pushFollow(FOLLOW_rule__First__Group_3__3__Impl_in_rule__First__Group_3__31624);
            rule__First__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__First__Group_3__4_in_rule__First__Group_3__31627);
            rule__First__Group_3__4();

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
    // $ANTLR end "rule__First__Group_3__3"


    // $ANTLR start "rule__First__Group_3__3__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:797:1: rule__First__Group_3__3__Impl : ( ')' ) ;
    public final void rule__First__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:801:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:802:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:802:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:803:1: ')'
            {
             before(grammarAccess.getFirstAccess().getRightParenthesisKeyword_3_3()); 
            match(input,15,FOLLOW_15_in_rule__First__Group_3__3__Impl1655); 
             after(grammarAccess.getFirstAccess().getRightParenthesisKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__First__Group_3__3__Impl"


    // $ANTLR start "rule__First__Group_3__4"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:816:1: rule__First__Group_3__4 : rule__First__Group_3__4__Impl ;
    public final void rule__First__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:820:1: ( rule__First__Group_3__4__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:821:2: rule__First__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__First__Group_3__4__Impl_in_rule__First__Group_3__41686);
            rule__First__Group_3__4__Impl();

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
    // $ANTLR end "rule__First__Group_3__4"


    // $ANTLR start "rule__First__Group_3__4__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:827:1: rule__First__Group_3__4__Impl : ( ( rule__First__Group_3_4__0 )* ) ;
    public final void rule__First__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:831:1: ( ( ( rule__First__Group_3_4__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:832:1: ( ( rule__First__Group_3_4__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:832:1: ( ( rule__First__Group_3_4__0 )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:833:1: ( rule__First__Group_3_4__0 )*
            {
             before(grammarAccess.getFirstAccess().getGroup_3_4()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:834:1: ( rule__First__Group_3_4__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:834:2: rule__First__Group_3_4__0
            	    {
            	    pushFollow(FOLLOW_rule__First__Group_3_4__0_in_rule__First__Group_3__4__Impl1713);
            	    rule__First__Group_3_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getFirstAccess().getGroup_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__First__Group_3__4__Impl"


    // $ANTLR start "rule__First__Group_3_4__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:854:1: rule__First__Group_3_4__0 : rule__First__Group_3_4__0__Impl rule__First__Group_3_4__1 ;
    public final void rule__First__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:858:1: ( rule__First__Group_3_4__0__Impl rule__First__Group_3_4__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:859:2: rule__First__Group_3_4__0__Impl rule__First__Group_3_4__1
            {
            pushFollow(FOLLOW_rule__First__Group_3_4__0__Impl_in_rule__First__Group_3_4__01754);
            rule__First__Group_3_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__First__Group_3_4__1_in_rule__First__Group_3_4__01757);
            rule__First__Group_3_4__1();

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
    // $ANTLR end "rule__First__Group_3_4__0"


    // $ANTLR start "rule__First__Group_3_4__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:866:1: rule__First__Group_3_4__0__Impl : ( 'and' ) ;
    public final void rule__First__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:870:1: ( ( 'and' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:871:1: ( 'and' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:871:1: ( 'and' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:872:1: 'and'
            {
             before(grammarAccess.getFirstAccess().getAndKeyword_3_4_0()); 
            match(input,16,FOLLOW_16_in_rule__First__Group_3_4__0__Impl1785); 
             after(grammarAccess.getFirstAccess().getAndKeyword_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__First__Group_3_4__0__Impl"


    // $ANTLR start "rule__First__Group_3_4__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:885:1: rule__First__Group_3_4__1 : rule__First__Group_3_4__1__Impl rule__First__Group_3_4__2 ;
    public final void rule__First__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:889:1: ( rule__First__Group_3_4__1__Impl rule__First__Group_3_4__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:890:2: rule__First__Group_3_4__1__Impl rule__First__Group_3_4__2
            {
            pushFollow(FOLLOW_rule__First__Group_3_4__1__Impl_in_rule__First__Group_3_4__11816);
            rule__First__Group_3_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__First__Group_3_4__2_in_rule__First__Group_3_4__11819);
            rule__First__Group_3_4__2();

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
    // $ANTLR end "rule__First__Group_3_4__1"


    // $ANTLR start "rule__First__Group_3_4__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:897:1: rule__First__Group_3_4__1__Impl : ( '(' ) ;
    public final void rule__First__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:901:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:902:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:902:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:903:1: '('
            {
             before(grammarAccess.getFirstAccess().getLeftParenthesisKeyword_3_4_1()); 
            match(input,14,FOLLOW_14_in_rule__First__Group_3_4__1__Impl1847); 
             after(grammarAccess.getFirstAccess().getLeftParenthesisKeyword_3_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__First__Group_3_4__1__Impl"


    // $ANTLR start "rule__First__Group_3_4__2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:916:1: rule__First__Group_3_4__2 : rule__First__Group_3_4__2__Impl rule__First__Group_3_4__3 ;
    public final void rule__First__Group_3_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:920:1: ( rule__First__Group_3_4__2__Impl rule__First__Group_3_4__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:921:2: rule__First__Group_3_4__2__Impl rule__First__Group_3_4__3
            {
            pushFollow(FOLLOW_rule__First__Group_3_4__2__Impl_in_rule__First__Group_3_4__21878);
            rule__First__Group_3_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__First__Group_3_4__3_in_rule__First__Group_3_4__21881);
            rule__First__Group_3_4__3();

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
    // $ANTLR end "rule__First__Group_3_4__2"


    // $ANTLR start "rule__First__Group_3_4__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:928:1: rule__First__Group_3_4__2__Impl : ( ( rule__First__CAssignment_3_4_2 ) ) ;
    public final void rule__First__Group_3_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:932:1: ( ( ( rule__First__CAssignment_3_4_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:933:1: ( ( rule__First__CAssignment_3_4_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:933:1: ( ( rule__First__CAssignment_3_4_2 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:934:1: ( rule__First__CAssignment_3_4_2 )
            {
             before(grammarAccess.getFirstAccess().getCAssignment_3_4_2()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:935:1: ( rule__First__CAssignment_3_4_2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:935:2: rule__First__CAssignment_3_4_2
            {
            pushFollow(FOLLOW_rule__First__CAssignment_3_4_2_in_rule__First__Group_3_4__2__Impl1908);
            rule__First__CAssignment_3_4_2();

            state._fsp--;


            }

             after(grammarAccess.getFirstAccess().getCAssignment_3_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__First__Group_3_4__2__Impl"


    // $ANTLR start "rule__First__Group_3_4__3"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:945:1: rule__First__Group_3_4__3 : rule__First__Group_3_4__3__Impl ;
    public final void rule__First__Group_3_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:949:1: ( rule__First__Group_3_4__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:950:2: rule__First__Group_3_4__3__Impl
            {
            pushFollow(FOLLOW_rule__First__Group_3_4__3__Impl_in_rule__First__Group_3_4__31938);
            rule__First__Group_3_4__3__Impl();

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
    // $ANTLR end "rule__First__Group_3_4__3"


    // $ANTLR start "rule__First__Group_3_4__3__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:956:1: rule__First__Group_3_4__3__Impl : ( ')' ) ;
    public final void rule__First__Group_3_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:960:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:961:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:961:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:962:1: ')'
            {
             before(grammarAccess.getFirstAccess().getRightParenthesisKeyword_3_4_3()); 
            match(input,15,FOLLOW_15_in_rule__First__Group_3_4__3__Impl1966); 
             after(grammarAccess.getFirstAccess().getRightParenthesisKeyword_3_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__First__Group_3_4__3__Impl"


    // $ANTLR start "rule__Contains__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:983:1: rule__Contains__Group__0 : rule__Contains__Group__0__Impl rule__Contains__Group__1 ;
    public final void rule__Contains__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:987:1: ( rule__Contains__Group__0__Impl rule__Contains__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:988:2: rule__Contains__Group__0__Impl rule__Contains__Group__1
            {
            pushFollow(FOLLOW_rule__Contains__Group__0__Impl_in_rule__Contains__Group__02005);
            rule__Contains__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Contains__Group__1_in_rule__Contains__Group__02008);
            rule__Contains__Group__1();

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
    // $ANTLR end "rule__Contains__Group__0"


    // $ANTLR start "rule__Contains__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:995:1: rule__Contains__Group__0__Impl : ( ( rule__Contains__TypeAssignment_0 ) ) ;
    public final void rule__Contains__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:999:1: ( ( ( rule__Contains__TypeAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1000:1: ( ( rule__Contains__TypeAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1000:1: ( ( rule__Contains__TypeAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1001:1: ( rule__Contains__TypeAssignment_0 )
            {
             before(grammarAccess.getContainsAccess().getTypeAssignment_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1002:1: ( rule__Contains__TypeAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1002:2: rule__Contains__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Contains__TypeAssignment_0_in_rule__Contains__Group__0__Impl2035);
            rule__Contains__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getContainsAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contains__Group__0__Impl"


    // $ANTLR start "rule__Contains__Group__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1012:1: rule__Contains__Group__1 : rule__Contains__Group__1__Impl rule__Contains__Group__2 ;
    public final void rule__Contains__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1016:1: ( rule__Contains__Group__1__Impl rule__Contains__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1017:2: rule__Contains__Group__1__Impl rule__Contains__Group__2
            {
            pushFollow(FOLLOW_rule__Contains__Group__1__Impl_in_rule__Contains__Group__12065);
            rule__Contains__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Contains__Group__2_in_rule__Contains__Group__12068);
            rule__Contains__Group__2();

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
    // $ANTLR end "rule__Contains__Group__1"


    // $ANTLR start "rule__Contains__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1024:1: rule__Contains__Group__1__Impl : ( 'where' ) ;
    public final void rule__Contains__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1028:1: ( ( 'where' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1029:1: ( 'where' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1029:1: ( 'where' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1030:1: 'where'
            {
             before(grammarAccess.getContainsAccess().getWhereKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__Contains__Group__1__Impl2096); 
             after(grammarAccess.getContainsAccess().getWhereKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contains__Group__1__Impl"


    // $ANTLR start "rule__Contains__Group__2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1043:1: rule__Contains__Group__2 : rule__Contains__Group__2__Impl ;
    public final void rule__Contains__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1047:1: ( rule__Contains__Group__2__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1048:2: rule__Contains__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Contains__Group__2__Impl_in_rule__Contains__Group__22127);
            rule__Contains__Group__2__Impl();

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
    // $ANTLR end "rule__Contains__Group__2"


    // $ANTLR start "rule__Contains__Group__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1054:1: rule__Contains__Group__2__Impl : ( ( rule__Contains__EAssignment_2 ) ) ;
    public final void rule__Contains__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1058:1: ( ( ( rule__Contains__EAssignment_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1059:1: ( ( rule__Contains__EAssignment_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1059:1: ( ( rule__Contains__EAssignment_2 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1060:1: ( rule__Contains__EAssignment_2 )
            {
             before(grammarAccess.getContainsAccess().getEAssignment_2()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1061:1: ( rule__Contains__EAssignment_2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1061:2: rule__Contains__EAssignment_2
            {
            pushFollow(FOLLOW_rule__Contains__EAssignment_2_in_rule__Contains__Group__2__Impl2154);
            rule__Contains__EAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContainsAccess().getEAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contains__Group__2__Impl"


    // $ANTLR start "rule__OrExpr__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1077:1: rule__OrExpr__Group__0 : rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1 ;
    public final void rule__OrExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1081:1: ( rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1082:2: rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1
            {
            pushFollow(FOLLOW_rule__OrExpr__Group__0__Impl_in_rule__OrExpr__Group__02190);
            rule__OrExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpr__Group__1_in_rule__OrExpr__Group__02193);
            rule__OrExpr__Group__1();

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
    // $ANTLR end "rule__OrExpr__Group__0"


    // $ANTLR start "rule__OrExpr__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1089:1: rule__OrExpr__Group__0__Impl : ( ruleAndExpr ) ;
    public final void rule__OrExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1093:1: ( ( ruleAndExpr ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1094:1: ( ruleAndExpr )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1094:1: ( ruleAndExpr )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1095:1: ruleAndExpr
            {
             before(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAndExpr_in_rule__OrExpr__Group__0__Impl2220);
            ruleAndExpr();

            state._fsp--;

             after(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group__0__Impl"


    // $ANTLR start "rule__OrExpr__Group__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1106:1: rule__OrExpr__Group__1 : rule__OrExpr__Group__1__Impl ;
    public final void rule__OrExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1110:1: ( rule__OrExpr__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1111:2: rule__OrExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpr__Group__1__Impl_in_rule__OrExpr__Group__12249);
            rule__OrExpr__Group__1__Impl();

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
    // $ANTLR end "rule__OrExpr__Group__1"


    // $ANTLR start "rule__OrExpr__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1117:1: rule__OrExpr__Group__1__Impl : ( ( rule__OrExpr__Group_1__0 )* ) ;
    public final void rule__OrExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1121:1: ( ( ( rule__OrExpr__Group_1__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1122:1: ( ( rule__OrExpr__Group_1__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1122:1: ( ( rule__OrExpr__Group_1__0 )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1123:1: ( rule__OrExpr__Group_1__0 )*
            {
             before(grammarAccess.getOrExprAccess().getGroup_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1124:1: ( rule__OrExpr__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1124:2: rule__OrExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrExpr__Group_1__0_in_rule__OrExpr__Group__1__Impl2276);
            	    rule__OrExpr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getOrExprAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group__1__Impl"


    // $ANTLR start "rule__OrExpr__Group_1__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1138:1: rule__OrExpr__Group_1__0 : rule__OrExpr__Group_1__0__Impl rule__OrExpr__Group_1__1 ;
    public final void rule__OrExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1142:1: ( rule__OrExpr__Group_1__0__Impl rule__OrExpr__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1143:2: rule__OrExpr__Group_1__0__Impl rule__OrExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrExpr__Group_1__0__Impl_in_rule__OrExpr__Group_1__02311);
            rule__OrExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpr__Group_1__1_in_rule__OrExpr__Group_1__02314);
            rule__OrExpr__Group_1__1();

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
    // $ANTLR end "rule__OrExpr__Group_1__0"


    // $ANTLR start "rule__OrExpr__Group_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1150:1: rule__OrExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1154:1: ( ( () ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1155:1: ( () )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1155:1: ( () )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1156:1: ()
            {
             before(grammarAccess.getOrExprAccess().getOrExprLeftAction_1_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1157:1: ()
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1159:1: 
            {
            }

             after(grammarAccess.getOrExprAccess().getOrExprLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpr__Group_1__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1169:1: rule__OrExpr__Group_1__1 : rule__OrExpr__Group_1__1__Impl rule__OrExpr__Group_1__2 ;
    public final void rule__OrExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1173:1: ( rule__OrExpr__Group_1__1__Impl rule__OrExpr__Group_1__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1174:2: rule__OrExpr__Group_1__1__Impl rule__OrExpr__Group_1__2
            {
            pushFollow(FOLLOW_rule__OrExpr__Group_1__1__Impl_in_rule__OrExpr__Group_1__12372);
            rule__OrExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpr__Group_1__2_in_rule__OrExpr__Group_1__12375);
            rule__OrExpr__Group_1__2();

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
    // $ANTLR end "rule__OrExpr__Group_1__1"


    // $ANTLR start "rule__OrExpr__Group_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1181:1: rule__OrExpr__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__OrExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1185:1: ( ( 'or' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1186:1: ( 'or' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1186:1: ( 'or' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1187:1: 'or'
            {
             before(grammarAccess.getOrExprAccess().getOrKeyword_1_1()); 
            match(input,17,FOLLOW_17_in_rule__OrExpr__Group_1__1__Impl2403); 
             after(grammarAccess.getOrExprAccess().getOrKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpr__Group_1__2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1200:1: rule__OrExpr__Group_1__2 : rule__OrExpr__Group_1__2__Impl ;
    public final void rule__OrExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1204:1: ( rule__OrExpr__Group_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1205:2: rule__OrExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__OrExpr__Group_1__2__Impl_in_rule__OrExpr__Group_1__22434);
            rule__OrExpr__Group_1__2__Impl();

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
    // $ANTLR end "rule__OrExpr__Group_1__2"


    // $ANTLR start "rule__OrExpr__Group_1__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1211:1: rule__OrExpr__Group_1__2__Impl : ( ( rule__OrExpr__RightAssignment_1_2 ) ) ;
    public final void rule__OrExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1215:1: ( ( ( rule__OrExpr__RightAssignment_1_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1216:1: ( ( rule__OrExpr__RightAssignment_1_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1216:1: ( ( rule__OrExpr__RightAssignment_1_2 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1217:1: ( rule__OrExpr__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrExprAccess().getRightAssignment_1_2()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1218:1: ( rule__OrExpr__RightAssignment_1_2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1218:2: rule__OrExpr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__OrExpr__RightAssignment_1_2_in_rule__OrExpr__Group_1__2__Impl2461);
            rule__OrExpr__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrExprAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group_1__2__Impl"


    // $ANTLR start "rule__AndExpr__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1234:1: rule__AndExpr__Group__0 : rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1 ;
    public final void rule__AndExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1238:1: ( rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1239:2: rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1
            {
            pushFollow(FOLLOW_rule__AndExpr__Group__0__Impl_in_rule__AndExpr__Group__02497);
            rule__AndExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpr__Group__1_in_rule__AndExpr__Group__02500);
            rule__AndExpr__Group__1();

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
    // $ANTLR end "rule__AndExpr__Group__0"


    // $ANTLR start "rule__AndExpr__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1246:1: rule__AndExpr__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__AndExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1250:1: ( ( rulePrimary ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1251:1: ( rulePrimary )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1251:1: ( rulePrimary )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1252:1: rulePrimary
            {
             before(grammarAccess.getAndExprAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__AndExpr__Group__0__Impl2527);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getAndExprAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpr__Group__0__Impl"


    // $ANTLR start "rule__AndExpr__Group__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1263:1: rule__AndExpr__Group__1 : rule__AndExpr__Group__1__Impl ;
    public final void rule__AndExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1267:1: ( rule__AndExpr__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1268:2: rule__AndExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpr__Group__1__Impl_in_rule__AndExpr__Group__12556);
            rule__AndExpr__Group__1__Impl();

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
    // $ANTLR end "rule__AndExpr__Group__1"


    // $ANTLR start "rule__AndExpr__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1274:1: rule__AndExpr__Group__1__Impl : ( ( rule__AndExpr__Group_1__0 )* ) ;
    public final void rule__AndExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1278:1: ( ( ( rule__AndExpr__Group_1__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1279:1: ( ( rule__AndExpr__Group_1__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1279:1: ( ( rule__AndExpr__Group_1__0 )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1280:1: ( rule__AndExpr__Group_1__0 )*
            {
             before(grammarAccess.getAndExprAccess().getGroup_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1281:1: ( rule__AndExpr__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1281:2: rule__AndExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndExpr__Group_1__0_in_rule__AndExpr__Group__1__Impl2583);
            	    rule__AndExpr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getAndExprAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpr__Group__1__Impl"


    // $ANTLR start "rule__AndExpr__Group_1__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1295:1: rule__AndExpr__Group_1__0 : rule__AndExpr__Group_1__0__Impl rule__AndExpr__Group_1__1 ;
    public final void rule__AndExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1299:1: ( rule__AndExpr__Group_1__0__Impl rule__AndExpr__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1300:2: rule__AndExpr__Group_1__0__Impl rule__AndExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1__0__Impl_in_rule__AndExpr__Group_1__02618);
            rule__AndExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpr__Group_1__1_in_rule__AndExpr__Group_1__02621);
            rule__AndExpr__Group_1__1();

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
    // $ANTLR end "rule__AndExpr__Group_1__0"


    // $ANTLR start "rule__AndExpr__Group_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1307:1: rule__AndExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1311:1: ( ( () ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1312:1: ( () )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1312:1: ( () )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1313:1: ()
            {
             before(grammarAccess.getAndExprAccess().getMultiplicationLeftAction_1_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1314:1: ()
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1316:1: 
            {
            }

             after(grammarAccess.getAndExprAccess().getMultiplicationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpr__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpr__Group_1__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1326:1: rule__AndExpr__Group_1__1 : rule__AndExpr__Group_1__1__Impl rule__AndExpr__Group_1__2 ;
    public final void rule__AndExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1330:1: ( rule__AndExpr__Group_1__1__Impl rule__AndExpr__Group_1__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1331:2: rule__AndExpr__Group_1__1__Impl rule__AndExpr__Group_1__2
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1__1__Impl_in_rule__AndExpr__Group_1__12679);
            rule__AndExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpr__Group_1__2_in_rule__AndExpr__Group_1__12682);
            rule__AndExpr__Group_1__2();

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
    // $ANTLR end "rule__AndExpr__Group_1__1"


    // $ANTLR start "rule__AndExpr__Group_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1338:1: rule__AndExpr__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__AndExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1342:1: ( ( 'and' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1343:1: ( 'and' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1343:1: ( 'and' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1344:1: 'and'
            {
             before(grammarAccess.getAndExprAccess().getAndKeyword_1_1()); 
            match(input,16,FOLLOW_16_in_rule__AndExpr__Group_1__1__Impl2710); 
             after(grammarAccess.getAndExprAccess().getAndKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpr__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpr__Group_1__2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1357:1: rule__AndExpr__Group_1__2 : rule__AndExpr__Group_1__2__Impl ;
    public final void rule__AndExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1361:1: ( rule__AndExpr__Group_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1362:2: rule__AndExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1__2__Impl_in_rule__AndExpr__Group_1__22741);
            rule__AndExpr__Group_1__2__Impl();

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
    // $ANTLR end "rule__AndExpr__Group_1__2"


    // $ANTLR start "rule__AndExpr__Group_1__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1368:1: rule__AndExpr__Group_1__2__Impl : ( ( rule__AndExpr__RightAssignment_1_2 ) ) ;
    public final void rule__AndExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1372:1: ( ( ( rule__AndExpr__RightAssignment_1_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1373:1: ( ( rule__AndExpr__RightAssignment_1_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1373:1: ( ( rule__AndExpr__RightAssignment_1_2 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1374:1: ( rule__AndExpr__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndExprAccess().getRightAssignment_1_2()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1375:1: ( rule__AndExpr__RightAssignment_1_2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1375:2: rule__AndExpr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AndExpr__RightAssignment_1_2_in_rule__AndExpr__Group_1__2__Impl2768);
            rule__AndExpr__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndExprAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpr__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1391:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1395:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1396:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__0__Impl_in_rule__Primary__Group_1__02804);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_1__1_in_rule__Primary__Group_1__02807);
            rule__Primary__Group_1__1();

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
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1403:1: rule__Primary__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1407:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1408:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1408:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1409:1: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,14,FOLLOW_14_in_rule__Primary__Group_1__0__Impl2835); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1422:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1426:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1427:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__1__Impl_in_rule__Primary__Group_1__12866);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_1__2_in_rule__Primary__Group_1__12869);
            rule__Primary__Group_1__2();

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
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1434:1: rule__Primary__Group_1__1__Impl : ( ruleOrExpr ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1438:1: ( ( ruleOrExpr ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1439:1: ( ruleOrExpr )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1439:1: ( ruleOrExpr )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1440:1: ruleOrExpr
            {
             before(grammarAccess.getPrimaryAccess().getOrExprParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleOrExpr_in_rule__Primary__Group_1__1__Impl2896);
            ruleOrExpr();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getOrExprParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1451:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1455:1: ( rule__Primary__Group_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1456:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__2__Impl_in_rule__Primary__Group_1__22925);
            rule__Primary__Group_1__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1462:1: rule__Primary__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1466:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1467:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1467:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1468:1: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); 
            match(input,15,FOLLOW_15_in_rule__Primary__Group_1__2__Impl2953); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__SingleValueField__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1487:1: rule__SingleValueField__Group__0 : rule__SingleValueField__Group__0__Impl rule__SingleValueField__Group__1 ;
    public final void rule__SingleValueField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1491:1: ( rule__SingleValueField__Group__0__Impl rule__SingleValueField__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1492:2: rule__SingleValueField__Group__0__Impl rule__SingleValueField__Group__1
            {
            pushFollow(FOLLOW_rule__SingleValueField__Group__0__Impl_in_rule__SingleValueField__Group__02990);
            rule__SingleValueField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleValueField__Group__1_in_rule__SingleValueField__Group__02993);
            rule__SingleValueField__Group__1();

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
    // $ANTLR end "rule__SingleValueField__Group__0"


    // $ANTLR start "rule__SingleValueField__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1499:1: rule__SingleValueField__Group__0__Impl : ( ( rule__SingleValueField__NameAssignment_0 ) ) ;
    public final void rule__SingleValueField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1503:1: ( ( ( rule__SingleValueField__NameAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1504:1: ( ( rule__SingleValueField__NameAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1504:1: ( ( rule__SingleValueField__NameAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1505:1: ( rule__SingleValueField__NameAssignment_0 )
            {
             before(grammarAccess.getSingleValueFieldAccess().getNameAssignment_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1506:1: ( rule__SingleValueField__NameAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1506:2: rule__SingleValueField__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SingleValueField__NameAssignment_0_in_rule__SingleValueField__Group__0__Impl3020);
            rule__SingleValueField__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSingleValueFieldAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValueField__Group__0__Impl"


    // $ANTLR start "rule__SingleValueField__Group__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1516:1: rule__SingleValueField__Group__1 : rule__SingleValueField__Group__1__Impl rule__SingleValueField__Group__2 ;
    public final void rule__SingleValueField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1520:1: ( rule__SingleValueField__Group__1__Impl rule__SingleValueField__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1521:2: rule__SingleValueField__Group__1__Impl rule__SingleValueField__Group__2
            {
            pushFollow(FOLLOW_rule__SingleValueField__Group__1__Impl_in_rule__SingleValueField__Group__13050);
            rule__SingleValueField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleValueField__Group__2_in_rule__SingleValueField__Group__13053);
            rule__SingleValueField__Group__2();

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
    // $ANTLR end "rule__SingleValueField__Group__1"


    // $ANTLR start "rule__SingleValueField__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1528:1: rule__SingleValueField__Group__1__Impl : ( ( rule__SingleValueField__NAssignment_1 )? ) ;
    public final void rule__SingleValueField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1532:1: ( ( ( rule__SingleValueField__NAssignment_1 )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1533:1: ( ( rule__SingleValueField__NAssignment_1 )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1533:1: ( ( rule__SingleValueField__NAssignment_1 )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1534:1: ( rule__SingleValueField__NAssignment_1 )?
            {
             before(grammarAccess.getSingleValueFieldAccess().getNAssignment_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1535:1: ( rule__SingleValueField__NAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1535:2: rule__SingleValueField__NAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SingleValueField__NAssignment_1_in_rule__SingleValueField__Group__1__Impl3080);
                    rule__SingleValueField__NAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleValueFieldAccess().getNAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValueField__Group__1__Impl"


    // $ANTLR start "rule__SingleValueField__Group__2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1545:1: rule__SingleValueField__Group__2 : rule__SingleValueField__Group__2__Impl rule__SingleValueField__Group__3 ;
    public final void rule__SingleValueField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1549:1: ( rule__SingleValueField__Group__2__Impl rule__SingleValueField__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1550:2: rule__SingleValueField__Group__2__Impl rule__SingleValueField__Group__3
            {
            pushFollow(FOLLOW_rule__SingleValueField__Group__2__Impl_in_rule__SingleValueField__Group__23111);
            rule__SingleValueField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleValueField__Group__3_in_rule__SingleValueField__Group__23114);
            rule__SingleValueField__Group__3();

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
    // $ANTLR end "rule__SingleValueField__Group__2"


    // $ANTLR start "rule__SingleValueField__Group__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1557:1: rule__SingleValueField__Group__2__Impl : ( 'is' ) ;
    public final void rule__SingleValueField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1561:1: ( ( 'is' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1562:1: ( 'is' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1562:1: ( 'is' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1563:1: 'is'
            {
             before(grammarAccess.getSingleValueFieldAccess().getIsKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__SingleValueField__Group__2__Impl3142); 
             after(grammarAccess.getSingleValueFieldAccess().getIsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValueField__Group__2__Impl"


    // $ANTLR start "rule__SingleValueField__Group__3"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1576:1: rule__SingleValueField__Group__3 : rule__SingleValueField__Group__3__Impl ;
    public final void rule__SingleValueField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1580:1: ( rule__SingleValueField__Group__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1581:2: rule__SingleValueField__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SingleValueField__Group__3__Impl_in_rule__SingleValueField__Group__33173);
            rule__SingleValueField__Group__3__Impl();

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
    // $ANTLR end "rule__SingleValueField__Group__3"


    // $ANTLR start "rule__SingleValueField__Group__3__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1587:1: rule__SingleValueField__Group__3__Impl : ( ( rule__SingleValueField__ValueAssignment_3 ) ) ;
    public final void rule__SingleValueField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1591:1: ( ( ( rule__SingleValueField__ValueAssignment_3 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1592:1: ( ( rule__SingleValueField__ValueAssignment_3 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1592:1: ( ( rule__SingleValueField__ValueAssignment_3 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1593:1: ( rule__SingleValueField__ValueAssignment_3 )
            {
             before(grammarAccess.getSingleValueFieldAccess().getValueAssignment_3()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1594:1: ( rule__SingleValueField__ValueAssignment_3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1594:2: rule__SingleValueField__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__SingleValueField__ValueAssignment_3_in_rule__SingleValueField__Group__3__Impl3200);
            rule__SingleValueField__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSingleValueFieldAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValueField__Group__3__Impl"


    // $ANTLR start "rule__MultiValueField__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1612:1: rule__MultiValueField__Group__0 : rule__MultiValueField__Group__0__Impl rule__MultiValueField__Group__1 ;
    public final void rule__MultiValueField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1616:1: ( rule__MultiValueField__Group__0__Impl rule__MultiValueField__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1617:2: rule__MultiValueField__Group__0__Impl rule__MultiValueField__Group__1
            {
            pushFollow(FOLLOW_rule__MultiValueField__Group__0__Impl_in_rule__MultiValueField__Group__03238);
            rule__MultiValueField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiValueField__Group__1_in_rule__MultiValueField__Group__03241);
            rule__MultiValueField__Group__1();

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
    // $ANTLR end "rule__MultiValueField__Group__0"


    // $ANTLR start "rule__MultiValueField__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1624:1: rule__MultiValueField__Group__0__Impl : ( ( rule__MultiValueField__NameAssignment_0 ) ) ;
    public final void rule__MultiValueField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1628:1: ( ( ( rule__MultiValueField__NameAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1629:1: ( ( rule__MultiValueField__NameAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1629:1: ( ( rule__MultiValueField__NameAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1630:1: ( rule__MultiValueField__NameAssignment_0 )
            {
             before(grammarAccess.getMultiValueFieldAccess().getNameAssignment_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1631:1: ( rule__MultiValueField__NameAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1631:2: rule__MultiValueField__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__MultiValueField__NameAssignment_0_in_rule__MultiValueField__Group__0__Impl3268);
            rule__MultiValueField__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiValueFieldAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValueField__Group__0__Impl"


    // $ANTLR start "rule__MultiValueField__Group__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1641:1: rule__MultiValueField__Group__1 : rule__MultiValueField__Group__1__Impl rule__MultiValueField__Group__2 ;
    public final void rule__MultiValueField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1645:1: ( rule__MultiValueField__Group__1__Impl rule__MultiValueField__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1646:2: rule__MultiValueField__Group__1__Impl rule__MultiValueField__Group__2
            {
            pushFollow(FOLLOW_rule__MultiValueField__Group__1__Impl_in_rule__MultiValueField__Group__13298);
            rule__MultiValueField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiValueField__Group__2_in_rule__MultiValueField__Group__13301);
            rule__MultiValueField__Group__2();

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
    // $ANTLR end "rule__MultiValueField__Group__1"


    // $ANTLR start "rule__MultiValueField__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1653:1: rule__MultiValueField__Group__1__Impl : ( 'has' ) ;
    public final void rule__MultiValueField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1657:1: ( ( 'has' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1658:1: ( 'has' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1658:1: ( 'has' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1659:1: 'has'
            {
             before(grammarAccess.getMultiValueFieldAccess().getHasKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__MultiValueField__Group__1__Impl3329); 
             after(grammarAccess.getMultiValueFieldAccess().getHasKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValueField__Group__1__Impl"


    // $ANTLR start "rule__MultiValueField__Group__2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1672:1: rule__MultiValueField__Group__2 : rule__MultiValueField__Group__2__Impl ;
    public final void rule__MultiValueField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1676:1: ( rule__MultiValueField__Group__2__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1677:2: rule__MultiValueField__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MultiValueField__Group__2__Impl_in_rule__MultiValueField__Group__23360);
            rule__MultiValueField__Group__2__Impl();

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
    // $ANTLR end "rule__MultiValueField__Group__2"


    // $ANTLR start "rule__MultiValueField__Group__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1683:1: rule__MultiValueField__Group__2__Impl : ( ( rule__MultiValueField__Alternatives_2 ) ) ;
    public final void rule__MultiValueField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1687:1: ( ( ( rule__MultiValueField__Alternatives_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1688:1: ( ( rule__MultiValueField__Alternatives_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1688:1: ( ( rule__MultiValueField__Alternatives_2 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1689:1: ( rule__MultiValueField__Alternatives_2 )
            {
             before(grammarAccess.getMultiValueFieldAccess().getAlternatives_2()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1690:1: ( rule__MultiValueField__Alternatives_2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1690:2: rule__MultiValueField__Alternatives_2
            {
            pushFollow(FOLLOW_rule__MultiValueField__Alternatives_2_in_rule__MultiValueField__Group__2__Impl3387);
            rule__MultiValueField__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiValueFieldAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValueField__Group__2__Impl"


    // $ANTLR start "rule__MultiValueField__Group_2_1__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1706:1: rule__MultiValueField__Group_2_1__0 : rule__MultiValueField__Group_2_1__0__Impl rule__MultiValueField__Group_2_1__1 ;
    public final void rule__MultiValueField__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1710:1: ( rule__MultiValueField__Group_2_1__0__Impl rule__MultiValueField__Group_2_1__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1711:2: rule__MultiValueField__Group_2_1__0__Impl rule__MultiValueField__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__MultiValueField__Group_2_1__0__Impl_in_rule__MultiValueField__Group_2_1__03423);
            rule__MultiValueField__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiValueField__Group_2_1__1_in_rule__MultiValueField__Group_2_1__03426);
            rule__MultiValueField__Group_2_1__1();

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
    // $ANTLR end "rule__MultiValueField__Group_2_1__0"


    // $ANTLR start "rule__MultiValueField__Group_2_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1718:1: rule__MultiValueField__Group_2_1__0__Impl : ( '(' ) ;
    public final void rule__MultiValueField__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1722:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1723:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1723:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1724:1: '('
            {
             before(grammarAccess.getMultiValueFieldAccess().getLeftParenthesisKeyword_2_1_0()); 
            match(input,14,FOLLOW_14_in_rule__MultiValueField__Group_2_1__0__Impl3454); 
             after(grammarAccess.getMultiValueFieldAccess().getLeftParenthesisKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValueField__Group_2_1__0__Impl"


    // $ANTLR start "rule__MultiValueField__Group_2_1__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1737:1: rule__MultiValueField__Group_2_1__1 : rule__MultiValueField__Group_2_1__1__Impl rule__MultiValueField__Group_2_1__2 ;
    public final void rule__MultiValueField__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1741:1: ( rule__MultiValueField__Group_2_1__1__Impl rule__MultiValueField__Group_2_1__2 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1742:2: rule__MultiValueField__Group_2_1__1__Impl rule__MultiValueField__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__MultiValueField__Group_2_1__1__Impl_in_rule__MultiValueField__Group_2_1__13485);
            rule__MultiValueField__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiValueField__Group_2_1__2_in_rule__MultiValueField__Group_2_1__13488);
            rule__MultiValueField__Group_2_1__2();

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
    // $ANTLR end "rule__MultiValueField__Group_2_1__1"


    // $ANTLR start "rule__MultiValueField__Group_2_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1749:1: rule__MultiValueField__Group_2_1__1__Impl : ( ( rule__MultiValueField__ValuesAssignment_2_1_1 ) ) ;
    public final void rule__MultiValueField__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1753:1: ( ( ( rule__MultiValueField__ValuesAssignment_2_1_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1754:1: ( ( rule__MultiValueField__ValuesAssignment_2_1_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1754:1: ( ( rule__MultiValueField__ValuesAssignment_2_1_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1755:1: ( rule__MultiValueField__ValuesAssignment_2_1_1 )
            {
             before(grammarAccess.getMultiValueFieldAccess().getValuesAssignment_2_1_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1756:1: ( rule__MultiValueField__ValuesAssignment_2_1_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1756:2: rule__MultiValueField__ValuesAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__MultiValueField__ValuesAssignment_2_1_1_in_rule__MultiValueField__Group_2_1__1__Impl3515);
            rule__MultiValueField__ValuesAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiValueFieldAccess().getValuesAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValueField__Group_2_1__1__Impl"


    // $ANTLR start "rule__MultiValueField__Group_2_1__2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1766:1: rule__MultiValueField__Group_2_1__2 : rule__MultiValueField__Group_2_1__2__Impl rule__MultiValueField__Group_2_1__3 ;
    public final void rule__MultiValueField__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1770:1: ( rule__MultiValueField__Group_2_1__2__Impl rule__MultiValueField__Group_2_1__3 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1771:2: rule__MultiValueField__Group_2_1__2__Impl rule__MultiValueField__Group_2_1__3
            {
            pushFollow(FOLLOW_rule__MultiValueField__Group_2_1__2__Impl_in_rule__MultiValueField__Group_2_1__23545);
            rule__MultiValueField__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiValueField__Group_2_1__3_in_rule__MultiValueField__Group_2_1__23548);
            rule__MultiValueField__Group_2_1__3();

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
    // $ANTLR end "rule__MultiValueField__Group_2_1__2"


    // $ANTLR start "rule__MultiValueField__Group_2_1__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1778:1: rule__MultiValueField__Group_2_1__2__Impl : ( ( rule__MultiValueField__Group_2_1_2__0 )* ) ;
    public final void rule__MultiValueField__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1782:1: ( ( ( rule__MultiValueField__Group_2_1_2__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1783:1: ( ( rule__MultiValueField__Group_2_1_2__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1783:1: ( ( rule__MultiValueField__Group_2_1_2__0 )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1784:1: ( rule__MultiValueField__Group_2_1_2__0 )*
            {
             before(grammarAccess.getMultiValueFieldAccess().getGroup_2_1_2()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1785:1: ( rule__MultiValueField__Group_2_1_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1785:2: rule__MultiValueField__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__MultiValueField__Group_2_1_2__0_in_rule__MultiValueField__Group_2_1__2__Impl3575);
            	    rule__MultiValueField__Group_2_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMultiValueFieldAccess().getGroup_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValueField__Group_2_1__2__Impl"


    // $ANTLR start "rule__MultiValueField__Group_2_1__3"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1795:1: rule__MultiValueField__Group_2_1__3 : rule__MultiValueField__Group_2_1__3__Impl ;
    public final void rule__MultiValueField__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1799:1: ( rule__MultiValueField__Group_2_1__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1800:2: rule__MultiValueField__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_rule__MultiValueField__Group_2_1__3__Impl_in_rule__MultiValueField__Group_2_1__33606);
            rule__MultiValueField__Group_2_1__3__Impl();

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
    // $ANTLR end "rule__MultiValueField__Group_2_1__3"


    // $ANTLR start "rule__MultiValueField__Group_2_1__3__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1806:1: rule__MultiValueField__Group_2_1__3__Impl : ( ')' ) ;
    public final void rule__MultiValueField__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1810:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1811:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1811:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1812:1: ')'
            {
             before(grammarAccess.getMultiValueFieldAccess().getRightParenthesisKeyword_2_1_3()); 
            match(input,15,FOLLOW_15_in_rule__MultiValueField__Group_2_1__3__Impl3634); 
             after(grammarAccess.getMultiValueFieldAccess().getRightParenthesisKeyword_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValueField__Group_2_1__3__Impl"


    // $ANTLR start "rule__MultiValueField__Group_2_1_2__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1833:1: rule__MultiValueField__Group_2_1_2__0 : rule__MultiValueField__Group_2_1_2__0__Impl rule__MultiValueField__Group_2_1_2__1 ;
    public final void rule__MultiValueField__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1837:1: ( rule__MultiValueField__Group_2_1_2__0__Impl rule__MultiValueField__Group_2_1_2__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1838:2: rule__MultiValueField__Group_2_1_2__0__Impl rule__MultiValueField__Group_2_1_2__1
            {
            pushFollow(FOLLOW_rule__MultiValueField__Group_2_1_2__0__Impl_in_rule__MultiValueField__Group_2_1_2__03673);
            rule__MultiValueField__Group_2_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiValueField__Group_2_1_2__1_in_rule__MultiValueField__Group_2_1_2__03676);
            rule__MultiValueField__Group_2_1_2__1();

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
    // $ANTLR end "rule__MultiValueField__Group_2_1_2__0"


    // $ANTLR start "rule__MultiValueField__Group_2_1_2__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1845:1: rule__MultiValueField__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__MultiValueField__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1849:1: ( ( ',' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1850:1: ( ',' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1850:1: ( ',' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1851:1: ','
            {
             before(grammarAccess.getMultiValueFieldAccess().getCommaKeyword_2_1_2_0()); 
            match(input,20,FOLLOW_20_in_rule__MultiValueField__Group_2_1_2__0__Impl3704); 
             after(grammarAccess.getMultiValueFieldAccess().getCommaKeyword_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValueField__Group_2_1_2__0__Impl"


    // $ANTLR start "rule__MultiValueField__Group_2_1_2__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1864:1: rule__MultiValueField__Group_2_1_2__1 : rule__MultiValueField__Group_2_1_2__1__Impl ;
    public final void rule__MultiValueField__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1868:1: ( rule__MultiValueField__Group_2_1_2__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1869:2: rule__MultiValueField__Group_2_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiValueField__Group_2_1_2__1__Impl_in_rule__MultiValueField__Group_2_1_2__13735);
            rule__MultiValueField__Group_2_1_2__1__Impl();

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
    // $ANTLR end "rule__MultiValueField__Group_2_1_2__1"


    // $ANTLR start "rule__MultiValueField__Group_2_1_2__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1875:1: rule__MultiValueField__Group_2_1_2__1__Impl : ( ( rule__MultiValueField__ValuesAssignment_2_1_2_1 ) ) ;
    public final void rule__MultiValueField__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1879:1: ( ( ( rule__MultiValueField__ValuesAssignment_2_1_2_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1880:1: ( ( rule__MultiValueField__ValuesAssignment_2_1_2_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1880:1: ( ( rule__MultiValueField__ValuesAssignment_2_1_2_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1881:1: ( rule__MultiValueField__ValuesAssignment_2_1_2_1 )
            {
             before(grammarAccess.getMultiValueFieldAccess().getValuesAssignment_2_1_2_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1882:1: ( rule__MultiValueField__ValuesAssignment_2_1_2_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1882:2: rule__MultiValueField__ValuesAssignment_2_1_2_1
            {
            pushFollow(FOLLOW_rule__MultiValueField__ValuesAssignment_2_1_2_1_in_rule__MultiValueField__Group_2_1_2__1__Impl3762);
            rule__MultiValueField__ValuesAssignment_2_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiValueFieldAccess().getValuesAssignment_2_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValueField__Group_2_1_2__1__Impl"


    // $ANTLR start "rule__BooleanField__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1896:1: rule__BooleanField__Group__0 : rule__BooleanField__Group__0__Impl rule__BooleanField__Group__1 ;
    public final void rule__BooleanField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1900:1: ( rule__BooleanField__Group__0__Impl rule__BooleanField__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1901:2: rule__BooleanField__Group__0__Impl rule__BooleanField__Group__1
            {
            pushFollow(FOLLOW_rule__BooleanField__Group__0__Impl_in_rule__BooleanField__Group__03796);
            rule__BooleanField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanField__Group__1_in_rule__BooleanField__Group__03799);
            rule__BooleanField__Group__1();

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
    // $ANTLR end "rule__BooleanField__Group__0"


    // $ANTLR start "rule__BooleanField__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1908:1: rule__BooleanField__Group__0__Impl : ( ( rule__BooleanField__NAssignment_0 )? ) ;
    public final void rule__BooleanField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1912:1: ( ( ( rule__BooleanField__NAssignment_0 )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1913:1: ( ( rule__BooleanField__NAssignment_0 )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1913:1: ( ( rule__BooleanField__NAssignment_0 )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1914:1: ( rule__BooleanField__NAssignment_0 )?
            {
             before(grammarAccess.getBooleanFieldAccess().getNAssignment_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1915:1: ( rule__BooleanField__NAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1915:2: rule__BooleanField__NAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BooleanField__NAssignment_0_in_rule__BooleanField__Group__0__Impl3826);
                    rule__BooleanField__NAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBooleanFieldAccess().getNAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanField__Group__0__Impl"


    // $ANTLR start "rule__BooleanField__Group__1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1925:1: rule__BooleanField__Group__1 : rule__BooleanField__Group__1__Impl ;
    public final void rule__BooleanField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1929:1: ( rule__BooleanField__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1930:2: rule__BooleanField__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BooleanField__Group__1__Impl_in_rule__BooleanField__Group__13857);
            rule__BooleanField__Group__1__Impl();

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
    // $ANTLR end "rule__BooleanField__Group__1"


    // $ANTLR start "rule__BooleanField__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1936:1: rule__BooleanField__Group__1__Impl : ( ( rule__BooleanField__Alternatives_1 ) ) ;
    public final void rule__BooleanField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1940:1: ( ( ( rule__BooleanField__Alternatives_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1941:1: ( ( rule__BooleanField__Alternatives_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1941:1: ( ( rule__BooleanField__Alternatives_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1942:1: ( rule__BooleanField__Alternatives_1 )
            {
             before(grammarAccess.getBooleanFieldAccess().getAlternatives_1()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1943:1: ( rule__BooleanField__Alternatives_1 )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1943:2: rule__BooleanField__Alternatives_1
            {
            pushFollow(FOLLOW_rule__BooleanField__Alternatives_1_in_rule__BooleanField__Group__1__Impl3884);
            rule__BooleanField__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanFieldAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanField__Group__1__Impl"


    // $ANTLR start "rule__First__TypeAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1958:1: rule__First__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__First__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1962:1: ( ( ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1963:1: ( ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1963:1: ( ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1964:1: ruleType
            {
             before(grammarAccess.getFirstAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__First__TypeAssignment_03923);
            ruleType();

            state._fsp--;

             after(grammarAccess.getFirstAccess().getTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__First__TypeAssignment_0"


    // $ANTLR start "rule__First__EAssignment_2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1973:1: rule__First__EAssignment_2 : ( ruleOrExpr ) ;
    public final void rule__First__EAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1977:1: ( ( ruleOrExpr ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1978:1: ( ruleOrExpr )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1978:1: ( ruleOrExpr )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1979:1: ruleOrExpr
            {
             before(grammarAccess.getFirstAccess().getEOrExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleOrExpr_in_rule__First__EAssignment_23954);
            ruleOrExpr();

            state._fsp--;

             after(grammarAccess.getFirstAccess().getEOrExprParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__First__EAssignment_2"


    // $ANTLR start "rule__First__CAssignment_3_2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1988:1: rule__First__CAssignment_3_2 : ( ruleContains ) ;
    public final void rule__First__CAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1992:1: ( ( ruleContains ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1993:1: ( ruleContains )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1993:1: ( ruleContains )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1994:1: ruleContains
            {
             before(grammarAccess.getFirstAccess().getCContainsParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleContains_in_rule__First__CAssignment_3_23985);
            ruleContains();

            state._fsp--;

             after(grammarAccess.getFirstAccess().getCContainsParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__First__CAssignment_3_2"


    // $ANTLR start "rule__First__CAssignment_3_4_2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2003:1: rule__First__CAssignment_3_4_2 : ( ruleContains ) ;
    public final void rule__First__CAssignment_3_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2007:1: ( ( ruleContains ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2008:1: ( ruleContains )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2008:1: ( ruleContains )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2009:1: ruleContains
            {
             before(grammarAccess.getFirstAccess().getCContainsParserRuleCall_3_4_2_0()); 
            pushFollow(FOLLOW_ruleContains_in_rule__First__CAssignment_3_4_24016);
            ruleContains();

            state._fsp--;

             after(grammarAccess.getFirstAccess().getCContainsParserRuleCall_3_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__First__CAssignment_3_4_2"


    // $ANTLR start "rule__Contains__TypeAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2018:1: rule__Contains__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Contains__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2022:1: ( ( ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2023:1: ( ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2023:1: ( ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2024:1: ruleType
            {
             before(grammarAccess.getContainsAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Contains__TypeAssignment_04047);
            ruleType();

            state._fsp--;

             after(grammarAccess.getContainsAccess().getTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contains__TypeAssignment_0"


    // $ANTLR start "rule__Contains__EAssignment_2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2033:1: rule__Contains__EAssignment_2 : ( ruleOrExpr ) ;
    public final void rule__Contains__EAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2037:1: ( ( ruleOrExpr ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2038:1: ( ruleOrExpr )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2038:1: ( ruleOrExpr )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2039:1: ruleOrExpr
            {
             before(grammarAccess.getContainsAccess().getEOrExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleOrExpr_in_rule__Contains__EAssignment_24078);
            ruleOrExpr();

            state._fsp--;

             after(grammarAccess.getContainsAccess().getEOrExprParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contains__EAssignment_2"


    // $ANTLR start "rule__OrExpr__RightAssignment_1_2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2048:1: rule__OrExpr__RightAssignment_1_2 : ( ruleAndExpr ) ;
    public final void rule__OrExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2052:1: ( ( ruleAndExpr ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2053:1: ( ruleAndExpr )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2053:1: ( ruleAndExpr )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2054:1: ruleAndExpr
            {
             before(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAndExpr_in_rule__OrExpr__RightAssignment_1_24109);
            ruleAndExpr();

            state._fsp--;

             after(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__RightAssignment_1_2"


    // $ANTLR start "rule__AndExpr__RightAssignment_1_2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2063:1: rule__AndExpr__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__AndExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2067:1: ( ( rulePrimary ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2068:1: ( rulePrimary )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2068:1: ( rulePrimary )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2069:1: rulePrimary
            {
             before(grammarAccess.getAndExprAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__AndExpr__RightAssignment_1_24140);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getAndExprAccess().getRightPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpr__RightAssignment_1_2"


    // $ANTLR start "rule__Type__ValueAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2078:1: rule__Type__ValueAssignment_0 : ( ( 'Methods' ) ) ;
    public final void rule__Type__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2082:1: ( ( ( 'Methods' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2083:1: ( ( 'Methods' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2083:1: ( ( 'Methods' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2084:1: ( 'Methods' )
            {
             before(grammarAccess.getTypeAccess().getValueMethodsKeyword_0_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2085:1: ( 'Methods' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2086:1: 'Methods'
            {
             before(grammarAccess.getTypeAccess().getValueMethodsKeyword_0_0()); 
            match(input,21,FOLLOW_21_in_rule__Type__ValueAssignment_04176); 
             after(grammarAccess.getTypeAccess().getValueMethodsKeyword_0_0()); 

            }

             after(grammarAccess.getTypeAccess().getValueMethodsKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ValueAssignment_0"


    // $ANTLR start "rule__Type__MethodAssignment_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2101:1: rule__Type__MethodAssignment_1 : ( ( 'Types' ) ) ;
    public final void rule__Type__MethodAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2105:1: ( ( ( 'Types' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2106:1: ( ( 'Types' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2106:1: ( ( 'Types' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2107:1: ( 'Types' )
            {
             before(grammarAccess.getTypeAccess().getMethodTypesKeyword_1_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2108:1: ( 'Types' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2109:1: 'Types'
            {
             before(grammarAccess.getTypeAccess().getMethodTypesKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Type__MethodAssignment_14220); 
             after(grammarAccess.getTypeAccess().getMethodTypesKeyword_1_0()); 

            }

             after(grammarAccess.getTypeAccess().getMethodTypesKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__MethodAssignment_1"


    // $ANTLR start "rule__SingleValueField__NameAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2124:1: rule__SingleValueField__NameAssignment_0 : ( ruleSingleValueFieldName ) ;
    public final void rule__SingleValueField__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2128:1: ( ( ruleSingleValueFieldName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2129:1: ( ruleSingleValueFieldName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2129:1: ( ruleSingleValueFieldName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2130:1: ruleSingleValueFieldName
            {
             before(grammarAccess.getSingleValueFieldAccess().getNameSingleValueFieldNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSingleValueFieldName_in_rule__SingleValueField__NameAssignment_04259);
            ruleSingleValueFieldName();

            state._fsp--;

             after(grammarAccess.getSingleValueFieldAccess().getNameSingleValueFieldNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValueField__NameAssignment_0"


    // $ANTLR start "rule__SingleValueField__NAssignment_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2139:1: rule__SingleValueField__NAssignment_1 : ( ruleNegation ) ;
    public final void rule__SingleValueField__NAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2143:1: ( ( ruleNegation ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2144:1: ( ruleNegation )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2144:1: ( ruleNegation )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2145:1: ruleNegation
            {
             before(grammarAccess.getSingleValueFieldAccess().getNNegationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNegation_in_rule__SingleValueField__NAssignment_14290);
            ruleNegation();

            state._fsp--;

             after(grammarAccess.getSingleValueFieldAccess().getNNegationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValueField__NAssignment_1"


    // $ANTLR start "rule__SingleValueField__ValueAssignment_3"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2154:1: rule__SingleValueField__ValueAssignment_3 : ( RULE_NAMEWITHWC ) ;
    public final void rule__SingleValueField__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2158:1: ( ( RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2159:1: ( RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2159:1: ( RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2160:1: RULE_NAMEWITHWC
            {
             before(grammarAccess.getSingleValueFieldAccess().getValueNameWithWCTerminalRuleCall_3_0()); 
            match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_rule__SingleValueField__ValueAssignment_34321); 
             after(grammarAccess.getSingleValueFieldAccess().getValueNameWithWCTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValueField__ValueAssignment_3"


    // $ANTLR start "rule__MultiValueField__NameAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2169:1: rule__MultiValueField__NameAssignment_0 : ( ruleMultiValueFieldName ) ;
    public final void rule__MultiValueField__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2173:1: ( ( ruleMultiValueFieldName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2174:1: ( ruleMultiValueFieldName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2174:1: ( ruleMultiValueFieldName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2175:1: ruleMultiValueFieldName
            {
             before(grammarAccess.getMultiValueFieldAccess().getNameMultiValueFieldNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMultiValueFieldName_in_rule__MultiValueField__NameAssignment_04352);
            ruleMultiValueFieldName();

            state._fsp--;

             after(grammarAccess.getMultiValueFieldAccess().getNameMultiValueFieldNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValueField__NameAssignment_0"


    // $ANTLR start "rule__MultiValueField__ValuesAssignment_2_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2184:1: rule__MultiValueField__ValuesAssignment_2_0 : ( RULE_NAMEWITHWC ) ;
    public final void rule__MultiValueField__ValuesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2188:1: ( ( RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2189:1: ( RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2189:1: ( RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2190:1: RULE_NAMEWITHWC
            {
             before(grammarAccess.getMultiValueFieldAccess().getValuesNameWithWCTerminalRuleCall_2_0_0()); 
            match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_rule__MultiValueField__ValuesAssignment_2_04383); 
             after(grammarAccess.getMultiValueFieldAccess().getValuesNameWithWCTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValueField__ValuesAssignment_2_0"


    // $ANTLR start "rule__MultiValueField__ValuesAssignment_2_1_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2199:1: rule__MultiValueField__ValuesAssignment_2_1_1 : ( RULE_NAMEWITHWC ) ;
    public final void rule__MultiValueField__ValuesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2203:1: ( ( RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2204:1: ( RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2204:1: ( RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2205:1: RULE_NAMEWITHWC
            {
             before(grammarAccess.getMultiValueFieldAccess().getValuesNameWithWCTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_rule__MultiValueField__ValuesAssignment_2_1_14414); 
             after(grammarAccess.getMultiValueFieldAccess().getValuesNameWithWCTerminalRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValueField__ValuesAssignment_2_1_1"


    // $ANTLR start "rule__MultiValueField__ValuesAssignment_2_1_2_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2214:1: rule__MultiValueField__ValuesAssignment_2_1_2_1 : ( RULE_NAMEWITHWC ) ;
    public final void rule__MultiValueField__ValuesAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2218:1: ( ( RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2219:1: ( RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2219:1: ( RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2220:1: RULE_NAMEWITHWC
            {
             before(grammarAccess.getMultiValueFieldAccess().getValuesNameWithWCTerminalRuleCall_2_1_2_1_0()); 
            match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_rule__MultiValueField__ValuesAssignment_2_1_2_14445); 
             after(grammarAccess.getMultiValueFieldAccess().getValuesNameWithWCTerminalRuleCall_2_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValueField__ValuesAssignment_2_1_2_1"


    // $ANTLR start "rule__BooleanField__NAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2229:1: rule__BooleanField__NAssignment_0 : ( ruleNegation ) ;
    public final void rule__BooleanField__NAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2233:1: ( ( ruleNegation ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2234:1: ( ruleNegation )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2234:1: ( ruleNegation )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2235:1: ruleNegation
            {
             before(grammarAccess.getBooleanFieldAccess().getNNegationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNegation_in_rule__BooleanField__NAssignment_04476);
            ruleNegation();

            state._fsp--;

             after(grammarAccess.getBooleanFieldAccess().getNNegationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanField__NAssignment_0"


    // $ANTLR start "rule__BooleanField__ValueAssignment_1_0"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2244:1: rule__BooleanField__ValueAssignment_1_0 : ( ( 'IsStatic' ) ) ;
    public final void rule__BooleanField__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2248:1: ( ( ( 'IsStatic' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2249:1: ( ( 'IsStatic' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2249:1: ( ( 'IsStatic' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2250:1: ( 'IsStatic' )
            {
             before(grammarAccess.getBooleanFieldAccess().getValueIsStaticKeyword_1_0_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2251:1: ( 'IsStatic' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2252:1: 'IsStatic'
            {
             before(grammarAccess.getBooleanFieldAccess().getValueIsStaticKeyword_1_0_0()); 
            match(input,23,FOLLOW_23_in_rule__BooleanField__ValueAssignment_1_04512); 
             after(grammarAccess.getBooleanFieldAccess().getValueIsStaticKeyword_1_0_0()); 

            }

             after(grammarAccess.getBooleanFieldAccess().getValueIsStaticKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanField__ValueAssignment_1_0"


    // $ANTLR start "rule__BooleanField__ValueAssignment_1_1"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2267:1: rule__BooleanField__ValueAssignment_1_1 : ( ( 'IsPrivate' ) ) ;
    public final void rule__BooleanField__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2271:1: ( ( ( 'IsPrivate' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2272:1: ( ( 'IsPrivate' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2272:1: ( ( 'IsPrivate' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2273:1: ( 'IsPrivate' )
            {
             before(grammarAccess.getBooleanFieldAccess().getValueIsPrivateKeyword_1_1_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2274:1: ( 'IsPrivate' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2275:1: 'IsPrivate'
            {
             before(grammarAccess.getBooleanFieldAccess().getValueIsPrivateKeyword_1_1_0()); 
            match(input,24,FOLLOW_24_in_rule__BooleanField__ValueAssignment_1_14556); 
             after(grammarAccess.getBooleanFieldAccess().getValueIsPrivateKeyword_1_1_0()); 

            }

             after(grammarAccess.getBooleanFieldAccess().getValueIsPrivateKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanField__ValueAssignment_1_1"


    // $ANTLR start "rule__BooleanField__ValueAssignment_1_2"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2290:1: rule__BooleanField__ValueAssignment_1_2 : ( ( 'IsPublic' ) ) ;
    public final void rule__BooleanField__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2294:1: ( ( ( 'IsPublic' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2295:1: ( ( 'IsPublic' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2295:1: ( ( 'IsPublic' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2296:1: ( 'IsPublic' )
            {
             before(grammarAccess.getBooleanFieldAccess().getValueIsPublicKeyword_1_2_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2297:1: ( 'IsPublic' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2298:1: 'IsPublic'
            {
             before(grammarAccess.getBooleanFieldAccess().getValueIsPublicKeyword_1_2_0()); 
            match(input,25,FOLLOW_25_in_rule__BooleanField__ValueAssignment_1_24600); 
             after(grammarAccess.getBooleanFieldAccess().getValueIsPublicKeyword_1_2_0()); 

            }

             after(grammarAccess.getBooleanFieldAccess().getValueIsPublicKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanField__ValueAssignment_1_2"


    // $ANTLR start "rule__BooleanField__ValueAssignment_1_3"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2313:1: rule__BooleanField__ValueAssignment_1_3 : ( ( 'IsFinal' ) ) ;
    public final void rule__BooleanField__ValueAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2317:1: ( ( ( 'IsFinal' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2318:1: ( ( 'IsFinal' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2318:1: ( ( 'IsFinal' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2319:1: ( 'IsFinal' )
            {
             before(grammarAccess.getBooleanFieldAccess().getValueIsFinalKeyword_1_3_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2320:1: ( 'IsFinal' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2321:1: 'IsFinal'
            {
             before(grammarAccess.getBooleanFieldAccess().getValueIsFinalKeyword_1_3_0()); 
            match(input,26,FOLLOW_26_in_rule__BooleanField__ValueAssignment_1_34644); 
             after(grammarAccess.getBooleanFieldAccess().getValueIsFinalKeyword_1_3_0()); 

            }

             after(grammarAccess.getBooleanFieldAccess().getValueIsFinalKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanField__ValueAssignment_1_3"


    // $ANTLR start "rule__BooleanField__ValueAssignment_1_4"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2336:1: rule__BooleanField__ValueAssignment_1_4 : ( ( 'IsAbstract' ) ) ;
    public final void rule__BooleanField__ValueAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2340:1: ( ( ( 'IsAbstract' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2341:1: ( ( 'IsAbstract' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2341:1: ( ( 'IsAbstract' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2342:1: ( 'IsAbstract' )
            {
             before(grammarAccess.getBooleanFieldAccess().getValueIsAbstractKeyword_1_4_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2343:1: ( 'IsAbstract' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2344:1: 'IsAbstract'
            {
             before(grammarAccess.getBooleanFieldAccess().getValueIsAbstractKeyword_1_4_0()); 
            match(input,27,FOLLOW_27_in_rule__BooleanField__ValueAssignment_1_44688); 
             after(grammarAccess.getBooleanFieldAccess().getValueIsAbstractKeyword_1_4_0()); 

            }

             after(grammarAccess.getBooleanFieldAccess().getValueIsAbstractKeyword_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanField__ValueAssignment_1_4"


    // $ANTLR start "rule__BooleanField__ValueAssignment_1_5"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2359:1: rule__BooleanField__ValueAssignment_1_5 : ( ( 'IsProtected' ) ) ;
    public final void rule__BooleanField__ValueAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2363:1: ( ( ( 'IsProtected' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2364:1: ( ( 'IsProtected' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2364:1: ( ( 'IsProtected' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2365:1: ( 'IsProtected' )
            {
             before(grammarAccess.getBooleanFieldAccess().getValueIsProtectedKeyword_1_5_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2366:1: ( 'IsProtected' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2367:1: 'IsProtected'
            {
             before(grammarAccess.getBooleanFieldAccess().getValueIsProtectedKeyword_1_5_0()); 
            match(input,28,FOLLOW_28_in_rule__BooleanField__ValueAssignment_1_54732); 
             after(grammarAccess.getBooleanFieldAccess().getValueIsProtectedKeyword_1_5_0()); 

            }

             after(grammarAccess.getBooleanFieldAccess().getValueIsProtectedKeyword_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanField__ValueAssignment_1_5"


    // $ANTLR start "rule__SingleValueFieldName__ValueAssignment"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2382:1: rule__SingleValueFieldName__ValueAssignment : ( ( 'Name' ) ) ;
    public final void rule__SingleValueFieldName__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2386:1: ( ( ( 'Name' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2387:1: ( ( 'Name' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2387:1: ( ( 'Name' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2388:1: ( 'Name' )
            {
             before(grammarAccess.getSingleValueFieldNameAccess().getValueNameKeyword_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2389:1: ( 'Name' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2390:1: 'Name'
            {
             before(grammarAccess.getSingleValueFieldNameAccess().getValueNameKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__SingleValueFieldName__ValueAssignment4776); 
             after(grammarAccess.getSingleValueFieldNameAccess().getValueNameKeyword_0()); 

            }

             after(grammarAccess.getSingleValueFieldNameAccess().getValueNameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValueFieldName__ValueAssignment"


    // $ANTLR start "rule__MultiValueFieldName__ValueAssignment"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2405:1: rule__MultiValueFieldName__ValueAssignment : ( ( 'CalledMethods' ) ) ;
    public final void rule__MultiValueFieldName__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2409:1: ( ( ( 'CalledMethods' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2410:1: ( ( 'CalledMethods' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2410:1: ( ( 'CalledMethods' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2411:1: ( 'CalledMethods' )
            {
             before(grammarAccess.getMultiValueFieldNameAccess().getValueCalledMethodsKeyword_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2412:1: ( 'CalledMethods' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2413:1: 'CalledMethods'
            {
             before(grammarAccess.getMultiValueFieldNameAccess().getValueCalledMethodsKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__MultiValueFieldName__ValueAssignment4820); 
             after(grammarAccess.getMultiValueFieldNameAccess().getValueCalledMethodsKeyword_0()); 

            }

             after(grammarAccess.getMultiValueFieldNameAccess().getValueCalledMethodsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValueFieldName__ValueAssignment"


    // $ANTLR start "rule__Negation__ValueAssignment"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2428:1: rule__Negation__ValueAssignment : ( ( '!' ) ) ;
    public final void rule__Negation__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2432:1: ( ( ( '!' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2433:1: ( ( '!' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2433:1: ( ( '!' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2434:1: ( '!' )
            {
             before(grammarAccess.getNegationAccess().getValueExclamationMarkKeyword_0()); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2435:1: ( '!' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2436:1: '!'
            {
             before(grammarAccess.getNegationAccess().getValueExclamationMarkKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Negation__ValueAssignment4864); 
             after(grammarAccess.getNegationAccess().getValueExclamationMarkKeyword_0()); 

            }

             after(grammarAccess.getNegationAccess().getValueExclamationMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleFirst_in_entryRuleFirst61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFirst68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__First__Group__0_in_ruleFirst94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContains_in_entryRuleContains121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContains128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contains__Group__0_in_ruleContains154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_entryRuleOrExpr181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpr188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group__0_in_ruleOrExpr214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_entryRuleAndExpr241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpr248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__0_in_ruleAndExpr274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Alternatives_in_rulePrimary334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldExpr_in_entryRuleFieldExpr361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldExpr368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldExpr__Alternatives_in_ruleFieldExpr394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleValueField_in_entryRuleSingleValueField481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleValueField488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleValueField__Group__0_in_ruleSingleValueField514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValueField_in_entryRuleMultiValueField541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiValueField548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValueField__Group__0_in_ruleMultiValueField574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanField_in_entryRuleBooleanField601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanField608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanField__Group__0_in_ruleBooleanField634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleValueFieldName_in_entryRuleSingleValueFieldName661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleValueFieldName668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleValueFieldName__ValueAssignment_in_ruleSingleValueFieldName694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValueFieldName_in_entryRuleMultiValueFieldName721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiValueFieldName728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValueFieldName__ValueAssignment_in_ruleMultiValueFieldName754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__ValueAssignment_in_ruleNegation814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldExpr_in_rule__Primary__Alternatives852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__0_in_rule__Primary__Alternatives869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleValueField_in_rule__FieldExpr__Alternatives902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValueField_in_rule__FieldExpr__Alternatives919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanField_in_rule__FieldExpr__Alternatives936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__ValueAssignment_0_in_rule__Type__Alternatives968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__MethodAssignment_1_in_rule__Type__Alternatives986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValueField__ValuesAssignment_2_0_in_rule__MultiValueField__Alternatives_21019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValueField__Group_2_1__0_in_rule__MultiValueField__Alternatives_21037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanField__ValueAssignment_1_0_in_rule__BooleanField__Alternatives_11070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanField__ValueAssignment_1_1_in_rule__BooleanField__Alternatives_11088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanField__ValueAssignment_1_2_in_rule__BooleanField__Alternatives_11106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanField__ValueAssignment_1_3_in_rule__BooleanField__Alternatives_11124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanField__ValueAssignment_1_4_in_rule__BooleanField__Alternatives_11142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanField__ValueAssignment_1_5_in_rule__BooleanField__Alternatives_11160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__First__Group__0__Impl_in_rule__First__Group__01192 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__First__Group__1_in_rule__First__Group__01195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__First__TypeAssignment_0_in_rule__First__Group__0__Impl1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__First__Group__1__Impl_in_rule__First__Group__11252 = new BitSet(new long[]{0x00000000FF804000L});
    public static final BitSet FOLLOW_rule__First__Group__2_in_rule__First__Group__11255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__First__Group__1__Impl1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__First__Group__2__Impl_in_rule__First__Group__21314 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__First__Group__3_in_rule__First__Group__21317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__First__EAssignment_2_in_rule__First__Group__2__Impl1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__First__Group__3__Impl_in_rule__First__Group__31374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__First__Group_3__0_in_rule__First__Group__3__Impl1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__First__Group_3__0__Impl_in_rule__First__Group_3__01440 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__First__Group_3__1_in_rule__First__Group_3__01443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__First__Group_3__0__Impl1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__First__Group_3__1__Impl_in_rule__First__Group_3__11502 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__First__Group_3__2_in_rule__First__Group_3__11505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__First__Group_3__1__Impl1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__First__Group_3__2__Impl_in_rule__First__Group_3__21564 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__First__Group_3__3_in_rule__First__Group_3__21567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__First__CAssignment_3_2_in_rule__First__Group_3__2__Impl1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__First__Group_3__3__Impl_in_rule__First__Group_3__31624 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__First__Group_3__4_in_rule__First__Group_3__31627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__First__Group_3__3__Impl1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__First__Group_3__4__Impl_in_rule__First__Group_3__41686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__First__Group_3_4__0_in_rule__First__Group_3__4__Impl1713 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__First__Group_3_4__0__Impl_in_rule__First__Group_3_4__01754 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__First__Group_3_4__1_in_rule__First__Group_3_4__01757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__First__Group_3_4__0__Impl1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__First__Group_3_4__1__Impl_in_rule__First__Group_3_4__11816 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__First__Group_3_4__2_in_rule__First__Group_3_4__11819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__First__Group_3_4__1__Impl1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__First__Group_3_4__2__Impl_in_rule__First__Group_3_4__21878 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__First__Group_3_4__3_in_rule__First__Group_3_4__21881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__First__CAssignment_3_4_2_in_rule__First__Group_3_4__2__Impl1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__First__Group_3_4__3__Impl_in_rule__First__Group_3_4__31938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__First__Group_3_4__3__Impl1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contains__Group__0__Impl_in_rule__Contains__Group__02005 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Contains__Group__1_in_rule__Contains__Group__02008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contains__TypeAssignment_0_in_rule__Contains__Group__0__Impl2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contains__Group__1__Impl_in_rule__Contains__Group__12065 = new BitSet(new long[]{0x00000000FF804000L});
    public static final BitSet FOLLOW_rule__Contains__Group__2_in_rule__Contains__Group__12068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Contains__Group__1__Impl2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contains__Group__2__Impl_in_rule__Contains__Group__22127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contains__EAssignment_2_in_rule__Contains__Group__2__Impl2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group__0__Impl_in_rule__OrExpr__Group__02190 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__OrExpr__Group__1_in_rule__OrExpr__Group__02193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_rule__OrExpr__Group__0__Impl2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group__1__Impl_in_rule__OrExpr__Group__12249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__0_in_rule__OrExpr__Group__1__Impl2276 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__0__Impl_in_rule__OrExpr__Group_1__02311 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__1_in_rule__OrExpr__Group_1__02314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__1__Impl_in_rule__OrExpr__Group_1__12372 = new BitSet(new long[]{0x00000000FF804000L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__2_in_rule__OrExpr__Group_1__12375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__OrExpr__Group_1__1__Impl2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__Group_1__2__Impl_in_rule__OrExpr__Group_1__22434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpr__RightAssignment_1_2_in_rule__OrExpr__Group_1__2__Impl2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__0__Impl_in_rule__AndExpr__Group__02497 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__1_in_rule__AndExpr__Group__02500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__AndExpr__Group__0__Impl2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__1__Impl_in_rule__AndExpr__Group__12556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__0_in_rule__AndExpr__Group__1__Impl2583 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__0__Impl_in_rule__AndExpr__Group_1__02618 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__1_in_rule__AndExpr__Group_1__02621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__1__Impl_in_rule__AndExpr__Group_1__12679 = new BitSet(new long[]{0x00000000FF804000L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__2_in_rule__AndExpr__Group_1__12682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AndExpr__Group_1__1__Impl2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__2__Impl_in_rule__AndExpr__Group_1__22741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__RightAssignment_1_2_in_rule__AndExpr__Group_1__2__Impl2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__0__Impl_in_rule__Primary__Group_1__02804 = new BitSet(new long[]{0x00000000FF804000L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__1_in_rule__Primary__Group_1__02807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Primary__Group_1__0__Impl2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__1__Impl_in_rule__Primary__Group_1__12866 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__2_in_rule__Primary__Group_1__12869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_rule__Primary__Group_1__1__Impl2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__2__Impl_in_rule__Primary__Group_1__22925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Primary__Group_1__2__Impl2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleValueField__Group__0__Impl_in_rule__SingleValueField__Group__02990 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_rule__SingleValueField__Group__1_in_rule__SingleValueField__Group__02993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleValueField__NameAssignment_0_in_rule__SingleValueField__Group__0__Impl3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleValueField__Group__1__Impl_in_rule__SingleValueField__Group__13050 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_rule__SingleValueField__Group__2_in_rule__SingleValueField__Group__13053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleValueField__NAssignment_1_in_rule__SingleValueField__Group__1__Impl3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleValueField__Group__2__Impl_in_rule__SingleValueField__Group__23111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SingleValueField__Group__3_in_rule__SingleValueField__Group__23114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SingleValueField__Group__2__Impl3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleValueField__Group__3__Impl_in_rule__SingleValueField__Group__33173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleValueField__ValueAssignment_3_in_rule__SingleValueField__Group__3__Impl3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValueField__Group__0__Impl_in_rule__MultiValueField__Group__03238 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__MultiValueField__Group__1_in_rule__MultiValueField__Group__03241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValueField__NameAssignment_0_in_rule__MultiValueField__Group__0__Impl3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValueField__Group__1__Impl_in_rule__MultiValueField__Group__13298 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__MultiValueField__Group__2_in_rule__MultiValueField__Group__13301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MultiValueField__Group__1__Impl3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValueField__Group__2__Impl_in_rule__MultiValueField__Group__23360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValueField__Alternatives_2_in_rule__MultiValueField__Group__2__Impl3387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValueField__Group_2_1__0__Impl_in_rule__MultiValueField__Group_2_1__03423 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MultiValueField__Group_2_1__1_in_rule__MultiValueField__Group_2_1__03426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MultiValueField__Group_2_1__0__Impl3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValueField__Group_2_1__1__Impl_in_rule__MultiValueField__Group_2_1__13485 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_rule__MultiValueField__Group_2_1__2_in_rule__MultiValueField__Group_2_1__13488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValueField__ValuesAssignment_2_1_1_in_rule__MultiValueField__Group_2_1__1__Impl3515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValueField__Group_2_1__2__Impl_in_rule__MultiValueField__Group_2_1__23545 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_rule__MultiValueField__Group_2_1__3_in_rule__MultiValueField__Group_2_1__23548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValueField__Group_2_1_2__0_in_rule__MultiValueField__Group_2_1__2__Impl3575 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__MultiValueField__Group_2_1__3__Impl_in_rule__MultiValueField__Group_2_1__33606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__MultiValueField__Group_2_1__3__Impl3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValueField__Group_2_1_2__0__Impl_in_rule__MultiValueField__Group_2_1_2__03673 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MultiValueField__Group_2_1_2__1_in_rule__MultiValueField__Group_2_1_2__03676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MultiValueField__Group_2_1_2__0__Impl3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValueField__Group_2_1_2__1__Impl_in_rule__MultiValueField__Group_2_1_2__13735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValueField__ValuesAssignment_2_1_2_1_in_rule__MultiValueField__Group_2_1_2__1__Impl3762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanField__Group__0__Impl_in_rule__BooleanField__Group__03796 = new BitSet(new long[]{0x00000000FF800000L});
    public static final BitSet FOLLOW_rule__BooleanField__Group__1_in_rule__BooleanField__Group__03799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanField__NAssignment_0_in_rule__BooleanField__Group__0__Impl3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanField__Group__1__Impl_in_rule__BooleanField__Group__13857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanField__Alternatives_1_in_rule__BooleanField__Group__1__Impl3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__First__TypeAssignment_03923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_rule__First__EAssignment_23954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContains_in_rule__First__CAssignment_3_23985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContains_in_rule__First__CAssignment_3_4_24016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Contains__TypeAssignment_04047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_rule__Contains__EAssignment_24078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_rule__OrExpr__RightAssignment_1_24109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__AndExpr__RightAssignment_1_24140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Type__ValueAssignment_04176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Type__MethodAssignment_14220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleValueFieldName_in_rule__SingleValueField__NameAssignment_04259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_rule__SingleValueField__NAssignment_14290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_rule__SingleValueField__ValueAssignment_34321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValueFieldName_in_rule__MultiValueField__NameAssignment_04352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_rule__MultiValueField__ValuesAssignment_2_04383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_rule__MultiValueField__ValuesAssignment_2_1_14414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_rule__MultiValueField__ValuesAssignment_2_1_2_14445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_rule__BooleanField__NAssignment_04476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BooleanField__ValueAssignment_1_04512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BooleanField__ValueAssignment_1_14556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BooleanField__ValueAssignment_1_24600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BooleanField__ValueAssignment_1_34644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BooleanField__ValueAssignment_1_44688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BooleanField__ValueAssignment_1_54732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SingleValueFieldName__ValueAssignment4776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MultiValueFieldName__ValueAssignment4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Negation__ValueAssignment4864 = new BitSet(new long[]{0x0000000000000002L});

}