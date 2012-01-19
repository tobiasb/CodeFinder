package org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.contentassist.antlr.internal; 

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
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.services.LuceneQueryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLuceneQueryParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'/'", "'.'", "'*'", "'?'", "'AND'", "'OR'", "'-'", "'NOT'", "'!'", "'('", "')'", "':'", "'FullyQualifiedName'", "'Type'", "'FriendlyName'", "'DeclaredMethods'", "'ParameterCount'", "'ReturnVariableEexpressions'", "'UsedMethods'", "'UsedMethodsInTry'", "'UsedMethodsInFinally'", "'OverriddenMethods'", "'ProjectName'", "'ResourcePath'", "'Modifiers'", "'AllDeclaredMethodNames'", "'DeclaredMethodNames'", "'DeclaredFieldNames'", "'DeclaredFieldTypes'", "'AllDeclaredFieldNames'", "'FullText'", "'FieldsRead'", "'FieldsWritten'", "'UsedFieldsInFinally'", "'UsedFieldsInTry'", "'Annotations'", "'Timestamp'", "'ImplementedTypes'", "'ExtendedTypes'", "'UsedTypes'", "'UsedTypesInTry'", "'UsedTypesInFinally'", "'ParameterTypes'", "'ReturnType'", "'AllImplementedTypes'", "'AllExtendedTypes'", "'FieldType'", "'DeclaringType'", "'CaughtType'", "'InstanceofTypes'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalLuceneQueryParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLuceneQueryParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLuceneQueryParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g"; }


     
     	private LuceneQueryGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(LuceneQueryGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleExp1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:60:1: entryRuleExp1 : ruleExp1 EOF ;
    public final void entryRuleExp1() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:61:1: ( ruleExp1 EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:62:1: ruleExp1 EOF
            {
             before(grammarAccess.getExp1Rule()); 
            pushFollow(FOLLOW_ruleExp1_in_entryRuleExp161);
            ruleExp1();

            state._fsp--;

             after(grammarAccess.getExp1Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExp168); 

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
    // $ANTLR end "entryRuleExp1"


    // $ANTLR start "ruleExp1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:69:1: ruleExp1 : ( ( rule__Exp1__Group__0 ) ) ;
    public final void ruleExp1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:73:2: ( ( ( rule__Exp1__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:74:1: ( ( rule__Exp1__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:74:1: ( ( rule__Exp1__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:75:1: ( rule__Exp1__Group__0 )
            {
             before(grammarAccess.getExp1Access().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:76:1: ( rule__Exp1__Group__0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:76:2: rule__Exp1__Group__0
            {
            pushFollow(FOLLOW_rule__Exp1__Group__0_in_ruleExp194);
            rule__Exp1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExp1Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExp1"


    // $ANTLR start "entryRuleExp2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:88:1: entryRuleExp2 : ruleExp2 EOF ;
    public final void entryRuleExp2() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:89:1: ( ruleExp2 EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:90:1: ruleExp2 EOF
            {
             before(grammarAccess.getExp2Rule()); 
            pushFollow(FOLLOW_ruleExp2_in_entryRuleExp2121);
            ruleExp2();

            state._fsp--;

             after(grammarAccess.getExp2Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExp2128); 

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
    // $ANTLR end "entryRuleExp2"


    // $ANTLR start "ruleExp2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:97:1: ruleExp2 : ( ( rule__Exp2__Alternatives ) ) ;
    public final void ruleExp2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:101:2: ( ( ( rule__Exp2__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:102:1: ( ( rule__Exp2__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:102:1: ( ( rule__Exp2__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:103:1: ( rule__Exp2__Alternatives )
            {
             before(grammarAccess.getExp2Access().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:104:1: ( rule__Exp2__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:104:2: rule__Exp2__Alternatives
            {
            pushFollow(FOLLOW_rule__Exp2__Alternatives_in_ruleExp2154);
            rule__Exp2__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExp2Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExp2"


    // $ANTLR start "entryRuleClauseExpression"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:116:1: entryRuleClauseExpression : ruleClauseExpression EOF ;
    public final void entryRuleClauseExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:117:1: ( ruleClauseExpression EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:118:1: ruleClauseExpression EOF
            {
             before(grammarAccess.getClauseExpressionRule()); 
            pushFollow(FOLLOW_ruleClauseExpression_in_entryRuleClauseExpression181);
            ruleClauseExpression();

            state._fsp--;

             after(grammarAccess.getClauseExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClauseExpression188); 

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
    // $ANTLR end "entryRuleClauseExpression"


    // $ANTLR start "ruleClauseExpression"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:125:1: ruleClauseExpression : ( ( rule__ClauseExpression__Group__0 ) ) ;
    public final void ruleClauseExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:129:2: ( ( ( rule__ClauseExpression__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:130:1: ( ( rule__ClauseExpression__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:130:1: ( ( rule__ClauseExpression__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:131:1: ( rule__ClauseExpression__Group__0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:132:1: ( rule__ClauseExpression__Group__0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:132:2: rule__ClauseExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group__0_in_ruleClauseExpression214);
            rule__ClauseExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClauseExpression"


    // $ANTLR start "entryRuleSimpleClause"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:144:1: entryRuleSimpleClause : ruleSimpleClause EOF ;
    public final void entryRuleSimpleClause() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:145:1: ( ruleSimpleClause EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:146:1: ruleSimpleClause EOF
            {
             before(grammarAccess.getSimpleClauseRule()); 
            pushFollow(FOLLOW_ruleSimpleClause_in_entryRuleSimpleClause241);
            ruleSimpleClause();

            state._fsp--;

             after(grammarAccess.getSimpleClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleClause248); 

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
    // $ANTLR end "entryRuleSimpleClause"


    // $ANTLR start "ruleSimpleClause"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:153:1: ruleSimpleClause : ( ( rule__SimpleClause__Group__0 ) ) ;
    public final void ruleSimpleClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:157:2: ( ( ( rule__SimpleClause__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:158:1: ( ( rule__SimpleClause__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:158:1: ( ( rule__SimpleClause__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:159:1: ( rule__SimpleClause__Group__0 )
            {
             before(grammarAccess.getSimpleClauseAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:160:1: ( rule__SimpleClause__Group__0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:160:2: rule__SimpleClause__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleClause__Group__0_in_ruleSimpleClause274);
            rule__SimpleClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleClauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleClause"


    // $ANTLR start "entryRuleTypeClause"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:172:1: entryRuleTypeClause : ruleTypeClause EOF ;
    public final void entryRuleTypeClause() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:173:1: ( ruleTypeClause EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:174:1: ruleTypeClause EOF
            {
             before(grammarAccess.getTypeClauseRule()); 
            pushFollow(FOLLOW_ruleTypeClause_in_entryRuleTypeClause301);
            ruleTypeClause();

            state._fsp--;

             after(grammarAccess.getTypeClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeClause308); 

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
    // $ANTLR end "entryRuleTypeClause"


    // $ANTLR start "ruleTypeClause"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:181:1: ruleTypeClause : ( ( rule__TypeClause__Group__0 ) ) ;
    public final void ruleTypeClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:185:2: ( ( ( rule__TypeClause__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:186:1: ( ( rule__TypeClause__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:186:1: ( ( rule__TypeClause__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:187:1: ( rule__TypeClause__Group__0 )
            {
             before(grammarAccess.getTypeClauseAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:188:1: ( rule__TypeClause__Group__0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:188:2: rule__TypeClause__Group__0
            {
            pushFollow(FOLLOW_rule__TypeClause__Group__0_in_ruleTypeClause334);
            rule__TypeClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeClauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeClause"


    // $ANTLR start "entryRuleFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:200:1: entryRuleFieldValue : ruleFieldValue EOF ;
    public final void entryRuleFieldValue() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:201:1: ( ruleFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:202:1: ruleFieldValue EOF
            {
             before(grammarAccess.getFieldValueRule()); 
            pushFollow(FOLLOW_ruleFieldValue_in_entryRuleFieldValue361);
            ruleFieldValue();

            state._fsp--;

             after(grammarAccess.getFieldValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldValue368); 

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
    // $ANTLR end "entryRuleFieldValue"


    // $ANTLR start "ruleFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:209:1: ruleFieldValue : ( ruleValue ) ;
    public final void ruleFieldValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:213:2: ( ( ruleValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:214:1: ( ruleValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:214:1: ( ruleValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:215:1: ruleValue
            {
             before(grammarAccess.getFieldValueAccess().getValueParserRuleCall()); 
            pushFollow(FOLLOW_ruleValue_in_ruleFieldValue394);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getFieldValueAccess().getValueParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldValue"


    // $ANTLR start "entryRuleTypeValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:228:1: entryRuleTypeValue : ruleTypeValue EOF ;
    public final void entryRuleTypeValue() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:229:1: ( ruleTypeValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:230:1: ruleTypeValue EOF
            {
             before(grammarAccess.getTypeValueRule()); 
            pushFollow(FOLLOW_ruleTypeValue_in_entryRuleTypeValue420);
            ruleTypeValue();

            state._fsp--;

             after(grammarAccess.getTypeValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeValue427); 

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
    // $ANTLR end "entryRuleTypeValue"


    // $ANTLR start "ruleTypeValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:237:1: ruleTypeValue : ( ruleQualifiedNameWithWildcard ) ;
    public final void ruleTypeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:241:2: ( ( ruleQualifiedNameWithWildcard ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:242:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:242:1: ( ruleQualifiedNameWithWildcard )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:243:1: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getTypeValueAccess().getQualifiedNameWithWildcardParserRuleCall()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleTypeValue453);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getTypeValueAccess().getQualifiedNameWithWildcardParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeValue"


    // $ANTLR start "entryRuleValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:256:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:257:1: ( ruleValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:258:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue479);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue486); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:265:1: ruleValue : ( ( rule__Value__Group__0 ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:269:2: ( ( ( rule__Value__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:270:1: ( ( rule__Value__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:270:1: ( ( rule__Value__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:271:1: ( rule__Value__Group__0 )
            {
             before(grammarAccess.getValueAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:272:1: ( rule__Value__Group__0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:272:2: rule__Value__Group__0
            {
            pushFollow(FOLLOW_rule__Value__Group__0_in_ruleValue512);
            rule__Value__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:284:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:288:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:289:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard544);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard551); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:299:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:304:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:305:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:305:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:306:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:307:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:307:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard581);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleSep"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:320:1: entryRuleSep : ruleSep EOF ;
    public final void entryRuleSep() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:321:1: ( ruleSep EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:322:1: ruleSep EOF
            {
             before(grammarAccess.getSepRule()); 
            pushFollow(FOLLOW_ruleSep_in_entryRuleSep608);
            ruleSep();

            state._fsp--;

             after(grammarAccess.getSepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSep615); 

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
    // $ANTLR end "entryRuleSep"


    // $ANTLR start "ruleSep"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:329:1: ruleSep : ( ( rule__Sep__Alternatives ) ) ;
    public final void ruleSep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:333:2: ( ( ( rule__Sep__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:334:1: ( ( rule__Sep__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:334:1: ( ( rule__Sep__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:335:1: ( rule__Sep__Alternatives )
            {
             before(grammarAccess.getSepAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:336:1: ( rule__Sep__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:336:2: rule__Sep__Alternatives
            {
            pushFollow(FOLLOW_rule__Sep__Alternatives_in_ruleSep641);
            rule__Sep__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSepAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSep"


    // $ANTLR start "entryRuleWildcard"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:348:1: entryRuleWildcard : ruleWildcard EOF ;
    public final void entryRuleWildcard() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:349:1: ( ruleWildcard EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:350:1: ruleWildcard EOF
            {
             before(grammarAccess.getWildcardRule()); 
            pushFollow(FOLLOW_ruleWildcard_in_entryRuleWildcard668);
            ruleWildcard();

            state._fsp--;

             after(grammarAccess.getWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWildcard675); 

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
    // $ANTLR end "entryRuleWildcard"


    // $ANTLR start "ruleWildcard"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:357:1: ruleWildcard : ( ( rule__Wildcard__Alternatives ) ) ;
    public final void ruleWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:361:2: ( ( ( rule__Wildcard__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:362:1: ( ( rule__Wildcard__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:362:1: ( ( rule__Wildcard__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:363:1: ( rule__Wildcard__Alternatives )
            {
             before(grammarAccess.getWildcardAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:364:1: ( rule__Wildcard__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:364:2: rule__Wildcard__Alternatives
            {
            pushFollow(FOLLOW_rule__Wildcard__Alternatives_in_ruleWildcard701);
            rule__Wildcard__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWildcardAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWildcard"


    // $ANTLR start "entryRuleFieldName"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:376:1: entryRuleFieldName : ruleFieldName EOF ;
    public final void entryRuleFieldName() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:377:1: ( ruleFieldName EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:378:1: ruleFieldName EOF
            {
             before(grammarAccess.getFieldNameRule()); 
            pushFollow(FOLLOW_ruleFieldName_in_entryRuleFieldName728);
            ruleFieldName();

            state._fsp--;

             after(grammarAccess.getFieldNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldName735); 

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
    // $ANTLR end "entryRuleFieldName"


    // $ANTLR start "ruleFieldName"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:385:1: ruleFieldName : ( ( rule__FieldName__Alternatives ) ) ;
    public final void ruleFieldName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:389:2: ( ( ( rule__FieldName__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:390:1: ( ( rule__FieldName__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:390:1: ( ( rule__FieldName__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:391:1: ( rule__FieldName__Alternatives )
            {
             before(grammarAccess.getFieldNameAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:392:1: ( rule__FieldName__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:392:2: rule__FieldName__Alternatives
            {
            pushFollow(FOLLOW_rule__FieldName__Alternatives_in_ruleFieldName761);
            rule__FieldName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFieldNameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldName"


    // $ANTLR start "entryRuleTypeFieldName"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:404:1: entryRuleTypeFieldName : ruleTypeFieldName EOF ;
    public final void entryRuleTypeFieldName() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:405:1: ( ruleTypeFieldName EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:406:1: ruleTypeFieldName EOF
            {
             before(grammarAccess.getTypeFieldNameRule()); 
            pushFollow(FOLLOW_ruleTypeFieldName_in_entryRuleTypeFieldName788);
            ruleTypeFieldName();

            state._fsp--;

             after(grammarAccess.getTypeFieldNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeFieldName795); 

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
    // $ANTLR end "entryRuleTypeFieldName"


    // $ANTLR start "ruleTypeFieldName"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:413:1: ruleTypeFieldName : ( ( rule__TypeFieldName__Alternatives ) ) ;
    public final void ruleTypeFieldName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:417:2: ( ( ( rule__TypeFieldName__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:418:1: ( ( rule__TypeFieldName__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:418:1: ( ( rule__TypeFieldName__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:419:1: ( rule__TypeFieldName__Alternatives )
            {
             before(grammarAccess.getTypeFieldNameAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:420:1: ( rule__TypeFieldName__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:420:2: rule__TypeFieldName__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeFieldName__Alternatives_in_ruleTypeFieldName821);
            rule__TypeFieldName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeFieldNameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeFieldName"


    // $ANTLR start "ruleBooleanExp"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:433:1: ruleBooleanExp : ( ( rule__BooleanExp__Alternatives ) ) ;
    public final void ruleBooleanExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:437:1: ( ( ( rule__BooleanExp__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:438:1: ( ( rule__BooleanExp__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:438:1: ( ( rule__BooleanExp__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:439:1: ( rule__BooleanExp__Alternatives )
            {
             before(grammarAccess.getBooleanExpAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:440:1: ( rule__BooleanExp__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:440:2: rule__BooleanExp__Alternatives
            {
            pushFollow(FOLLOW_rule__BooleanExp__Alternatives_in_ruleBooleanExp858);
            rule__BooleanExp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanExpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanExp"


    // $ANTLR start "ruleNotExpression"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:452:1: ruleNotExpression : ( ( rule__NotExpression__Alternatives ) ) ;
    public final void ruleNotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:456:1: ( ( ( rule__NotExpression__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:457:1: ( ( rule__NotExpression__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:457:1: ( ( rule__NotExpression__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:458:1: ( rule__NotExpression__Alternatives )
            {
             before(grammarAccess.getNotExpressionAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:459:1: ( rule__NotExpression__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:459:2: rule__NotExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__NotExpression__Alternatives_in_ruleNotExpression894);
            rule__NotExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNotExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "ruleMustExpression"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:471:1: ruleMustExpression : ( ( '+' ) ) ;
    public final void ruleMustExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:475:1: ( ( ( '+' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:476:1: ( ( '+' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:476:1: ( ( '+' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:477:1: ( '+' )
            {
             before(grammarAccess.getMustExpressionAccess().getMEnumLiteralDeclaration()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:478:1: ( '+' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:478:3: '+'
            {
            match(input,11,FOLLOW_11_in_ruleMustExpression931); 

            }

             after(grammarAccess.getMustExpressionAccess().getMEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMustExpression"


    // $ANTLR start "rule__Exp2__Alternatives"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:490:1: rule__Exp2__Alternatives : ( ( ( rule__Exp2__ValueAssignment_0 ) ) | ( ( rule__Exp2__Group_1__0 ) ) );
    public final void rule__Exp2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:494:1: ( ( ( rule__Exp2__ValueAssignment_0 ) ) | ( ( rule__Exp2__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11||(LA1_0>=18 && LA1_0<=20)||(LA1_0>=24 && LA1_0<=61)) ) {
                alt1=1;
            }
            else if ( (LA1_0==21) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:495:1: ( ( rule__Exp2__ValueAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:495:1: ( ( rule__Exp2__ValueAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:496:1: ( rule__Exp2__ValueAssignment_0 )
                    {
                     before(grammarAccess.getExp2Access().getValueAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:497:1: ( rule__Exp2__ValueAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:497:2: rule__Exp2__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Exp2__ValueAssignment_0_in_rule__Exp2__Alternatives968);
                    rule__Exp2__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExp2Access().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:501:6: ( ( rule__Exp2__Group_1__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:501:6: ( ( rule__Exp2__Group_1__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:502:1: ( rule__Exp2__Group_1__0 )
                    {
                     before(grammarAccess.getExp2Access().getGroup_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:503:1: ( rule__Exp2__Group_1__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:503:2: rule__Exp2__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Exp2__Group_1__0_in_rule__Exp2__Alternatives986);
                    rule__Exp2__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExp2Access().getGroup_1()); 

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
    // $ANTLR end "rule__Exp2__Alternatives"


    // $ANTLR start "rule__ClauseExpression__Alternatives_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:512:1: rule__ClauseExpression__Alternatives_0 : ( ( ( rule__ClauseExpression__NAssignment_0_0 ) ) | ( ( rule__ClauseExpression__MAssignment_0_1 ) ) );
    public final void rule__ClauseExpression__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:516:1: ( ( ( rule__ClauseExpression__NAssignment_0_0 ) ) | ( ( rule__ClauseExpression__MAssignment_0_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=18 && LA2_0<=20)) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:517:1: ( ( rule__ClauseExpression__NAssignment_0_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:517:1: ( ( rule__ClauseExpression__NAssignment_0_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:518:1: ( rule__ClauseExpression__NAssignment_0_0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getNAssignment_0_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:519:1: ( rule__ClauseExpression__NAssignment_0_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:519:2: rule__ClauseExpression__NAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__NAssignment_0_0_in_rule__ClauseExpression__Alternatives_01019);
                    rule__ClauseExpression__NAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getNAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:523:6: ( ( rule__ClauseExpression__MAssignment_0_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:523:6: ( ( rule__ClauseExpression__MAssignment_0_1 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:524:1: ( rule__ClauseExpression__MAssignment_0_1 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getMAssignment_0_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:525:1: ( rule__ClauseExpression__MAssignment_0_1 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:525:2: rule__ClauseExpression__MAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__MAssignment_0_1_in_rule__ClauseExpression__Alternatives_01037);
                    rule__ClauseExpression__MAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getMAssignment_0_1()); 

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
    // $ANTLR end "rule__ClauseExpression__Alternatives_0"


    // $ANTLR start "rule__ClauseExpression__Alternatives_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:534:1: rule__ClauseExpression__Alternatives_1 : ( ( ( rule__ClauseExpression__ClauseAssignment_1_0 ) ) | ( ( rule__ClauseExpression__ClauseAssignment_1_1 ) ) );
    public final void rule__ClauseExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:538:1: ( ( ( rule__ClauseExpression__ClauseAssignment_1_0 ) ) | ( ( rule__ClauseExpression__ClauseAssignment_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=24 && LA3_0<=48)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=49 && LA3_0<=61)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:539:1: ( ( rule__ClauseExpression__ClauseAssignment_1_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:539:1: ( ( rule__ClauseExpression__ClauseAssignment_1_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:540:1: ( rule__ClauseExpression__ClauseAssignment_1_0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getClauseAssignment_1_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:541:1: ( rule__ClauseExpression__ClauseAssignment_1_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:541:2: rule__ClauseExpression__ClauseAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__ClauseAssignment_1_0_in_rule__ClauseExpression__Alternatives_11070);
                    rule__ClauseExpression__ClauseAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getClauseAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:545:6: ( ( rule__ClauseExpression__ClauseAssignment_1_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:545:6: ( ( rule__ClauseExpression__ClauseAssignment_1_1 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:546:1: ( rule__ClauseExpression__ClauseAssignment_1_1 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getClauseAssignment_1_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:547:1: ( rule__ClauseExpression__ClauseAssignment_1_1 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:547:2: rule__ClauseExpression__ClauseAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__ClauseAssignment_1_1_in_rule__ClauseExpression__Alternatives_11088);
                    rule__ClauseExpression__ClauseAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getClauseAssignment_1_1()); 

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
    // $ANTLR end "rule__ClauseExpression__Alternatives_1"


    // $ANTLR start "rule__Sep__Alternatives"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:556:1: rule__Sep__Alternatives : ( ( '/' ) | ( '.' ) );
    public final void rule__Sep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:560:1: ( ( '/' ) | ( '.' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:561:1: ( '/' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:561:1: ( '/' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:562:1: '/'
                    {
                     before(grammarAccess.getSepAccess().getSolidusKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__Sep__Alternatives1122); 
                     after(grammarAccess.getSepAccess().getSolidusKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:569:6: ( '.' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:569:6: ( '.' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:570:1: '.'
                    {
                     before(grammarAccess.getSepAccess().getFullStopKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__Sep__Alternatives1142); 
                     after(grammarAccess.getSepAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__Sep__Alternatives"


    // $ANTLR start "rule__Wildcard__Alternatives"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:582:1: rule__Wildcard__Alternatives : ( ( '*' ) | ( '?' ) );
    public final void rule__Wildcard__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:586:1: ( ( '*' ) | ( '?' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:587:1: ( '*' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:587:1: ( '*' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:588:1: '*'
                    {
                     before(grammarAccess.getWildcardAccess().getAsteriskKeyword_0()); 
                    match(input,14,FOLLOW_14_in_rule__Wildcard__Alternatives1177); 
                     after(grammarAccess.getWildcardAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:595:6: ( '?' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:595:6: ( '?' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:596:1: '?'
                    {
                     before(grammarAccess.getWildcardAccess().getQuestionMarkKeyword_1()); 
                    match(input,15,FOLLOW_15_in_rule__Wildcard__Alternatives1197); 
                     after(grammarAccess.getWildcardAccess().getQuestionMarkKeyword_1()); 

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
    // $ANTLR end "rule__Wildcard__Alternatives"


    // $ANTLR start "rule__FieldName__Alternatives"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:608:1: rule__FieldName__Alternatives : ( ( ( rule__FieldName__FullyQualifiedNameAssignment_0 ) ) | ( ( rule__FieldName__TypeAssignment_1 ) ) | ( ( rule__FieldName__FriendlyNameAssignment_2 ) ) | ( ( rule__FieldName__DeclaredMethodsAssignment_3 ) ) | ( ( rule__FieldName__ParameterCountAssignment_4 ) ) | ( ( rule__FieldName__ReturnVariableEexpressionsAssignment_5 ) ) | ( ( rule__FieldName__UsedMethodsAssignment_6 ) ) | ( ( rule__FieldName__UsedMethodsInTryAssignment_7 ) ) | ( ( rule__FieldName__UsedMethodsInFinallyAssignment_8 ) ) | ( ( rule__FieldName__OverriddenMethodsAssignment_9 ) ) | ( ( rule__FieldName__ProjectNameAssignment_10 ) ) | ( ( rule__FieldName__ResourcePathAssignment_11 ) ) | ( ( rule__FieldName__ModifiersAssignment_12 ) ) | ( ( rule__FieldName__AllDeclaredMethodNamesAssignment_13 ) ) | ( ( rule__FieldName__DeclaredMethodNamesAssignment_14 ) ) | ( ( rule__FieldName__DeclaredFieldNamesAssignment_15 ) ) | ( ( rule__FieldName__DeclaredFieldTypesAssignment_16 ) ) | ( ( rule__FieldName__AllDeclaredFieldNamesAssignment_17 ) ) | ( ( rule__FieldName__FullTextAssignment_18 ) ) | ( ( rule__FieldName__FieldsReadAssignment_19 ) ) | ( ( rule__FieldName__FieldsWrittenAssignment_20 ) ) | ( ( rule__FieldName__UsedFieldsInFinallyAssignment_21 ) ) | ( ( rule__FieldName__UsedFieldsInTryAssignment_22 ) ) | ( ( rule__FieldName__AnnotationsAssignment_23 ) ) | ( ( rule__FieldName__TimestampAssignment_24 ) ) );
    public final void rule__FieldName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:612:1: ( ( ( rule__FieldName__FullyQualifiedNameAssignment_0 ) ) | ( ( rule__FieldName__TypeAssignment_1 ) ) | ( ( rule__FieldName__FriendlyNameAssignment_2 ) ) | ( ( rule__FieldName__DeclaredMethodsAssignment_3 ) ) | ( ( rule__FieldName__ParameterCountAssignment_4 ) ) | ( ( rule__FieldName__ReturnVariableEexpressionsAssignment_5 ) ) | ( ( rule__FieldName__UsedMethodsAssignment_6 ) ) | ( ( rule__FieldName__UsedMethodsInTryAssignment_7 ) ) | ( ( rule__FieldName__UsedMethodsInFinallyAssignment_8 ) ) | ( ( rule__FieldName__OverriddenMethodsAssignment_9 ) ) | ( ( rule__FieldName__ProjectNameAssignment_10 ) ) | ( ( rule__FieldName__ResourcePathAssignment_11 ) ) | ( ( rule__FieldName__ModifiersAssignment_12 ) ) | ( ( rule__FieldName__AllDeclaredMethodNamesAssignment_13 ) ) | ( ( rule__FieldName__DeclaredMethodNamesAssignment_14 ) ) | ( ( rule__FieldName__DeclaredFieldNamesAssignment_15 ) ) | ( ( rule__FieldName__DeclaredFieldTypesAssignment_16 ) ) | ( ( rule__FieldName__AllDeclaredFieldNamesAssignment_17 ) ) | ( ( rule__FieldName__FullTextAssignment_18 ) ) | ( ( rule__FieldName__FieldsReadAssignment_19 ) ) | ( ( rule__FieldName__FieldsWrittenAssignment_20 ) ) | ( ( rule__FieldName__UsedFieldsInFinallyAssignment_21 ) ) | ( ( rule__FieldName__UsedFieldsInTryAssignment_22 ) ) | ( ( rule__FieldName__AnnotationsAssignment_23 ) ) | ( ( rule__FieldName__TimestampAssignment_24 ) ) )
            int alt6=25;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            case 27:
                {
                alt6=4;
                }
                break;
            case 28:
                {
                alt6=5;
                }
                break;
            case 29:
                {
                alt6=6;
                }
                break;
            case 30:
                {
                alt6=7;
                }
                break;
            case 31:
                {
                alt6=8;
                }
                break;
            case 32:
                {
                alt6=9;
                }
                break;
            case 33:
                {
                alt6=10;
                }
                break;
            case 34:
                {
                alt6=11;
                }
                break;
            case 35:
                {
                alt6=12;
                }
                break;
            case 36:
                {
                alt6=13;
                }
                break;
            case 37:
                {
                alt6=14;
                }
                break;
            case 38:
                {
                alt6=15;
                }
                break;
            case 39:
                {
                alt6=16;
                }
                break;
            case 40:
                {
                alt6=17;
                }
                break;
            case 41:
                {
                alt6=18;
                }
                break;
            case 42:
                {
                alt6=19;
                }
                break;
            case 43:
                {
                alt6=20;
                }
                break;
            case 44:
                {
                alt6=21;
                }
                break;
            case 45:
                {
                alt6=22;
                }
                break;
            case 46:
                {
                alt6=23;
                }
                break;
            case 47:
                {
                alt6=24;
                }
                break;
            case 48:
                {
                alt6=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:613:1: ( ( rule__FieldName__FullyQualifiedNameAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:613:1: ( ( rule__FieldName__FullyQualifiedNameAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:614:1: ( rule__FieldName__FullyQualifiedNameAssignment_0 )
                    {
                     before(grammarAccess.getFieldNameAccess().getFullyQualifiedNameAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:615:1: ( rule__FieldName__FullyQualifiedNameAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:615:2: rule__FieldName__FullyQualifiedNameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FieldName__FullyQualifiedNameAssignment_0_in_rule__FieldName__Alternatives1231);
                    rule__FieldName__FullyQualifiedNameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getFullyQualifiedNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:619:6: ( ( rule__FieldName__TypeAssignment_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:619:6: ( ( rule__FieldName__TypeAssignment_1 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:620:1: ( rule__FieldName__TypeAssignment_1 )
                    {
                     before(grammarAccess.getFieldNameAccess().getTypeAssignment_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:621:1: ( rule__FieldName__TypeAssignment_1 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:621:2: rule__FieldName__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__FieldName__TypeAssignment_1_in_rule__FieldName__Alternatives1249);
                    rule__FieldName__TypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getTypeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:625:6: ( ( rule__FieldName__FriendlyNameAssignment_2 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:625:6: ( ( rule__FieldName__FriendlyNameAssignment_2 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:626:1: ( rule__FieldName__FriendlyNameAssignment_2 )
                    {
                     before(grammarAccess.getFieldNameAccess().getFriendlyNameAssignment_2()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:627:1: ( rule__FieldName__FriendlyNameAssignment_2 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:627:2: rule__FieldName__FriendlyNameAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FieldName__FriendlyNameAssignment_2_in_rule__FieldName__Alternatives1267);
                    rule__FieldName__FriendlyNameAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getFriendlyNameAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:631:6: ( ( rule__FieldName__DeclaredMethodsAssignment_3 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:631:6: ( ( rule__FieldName__DeclaredMethodsAssignment_3 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:632:1: ( rule__FieldName__DeclaredMethodsAssignment_3 )
                    {
                     before(grammarAccess.getFieldNameAccess().getDeclaredMethodsAssignment_3()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:633:1: ( rule__FieldName__DeclaredMethodsAssignment_3 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:633:2: rule__FieldName__DeclaredMethodsAssignment_3
                    {
                    pushFollow(FOLLOW_rule__FieldName__DeclaredMethodsAssignment_3_in_rule__FieldName__Alternatives1285);
                    rule__FieldName__DeclaredMethodsAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getDeclaredMethodsAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:637:6: ( ( rule__FieldName__ParameterCountAssignment_4 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:637:6: ( ( rule__FieldName__ParameterCountAssignment_4 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:638:1: ( rule__FieldName__ParameterCountAssignment_4 )
                    {
                     before(grammarAccess.getFieldNameAccess().getParameterCountAssignment_4()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:639:1: ( rule__FieldName__ParameterCountAssignment_4 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:639:2: rule__FieldName__ParameterCountAssignment_4
                    {
                    pushFollow(FOLLOW_rule__FieldName__ParameterCountAssignment_4_in_rule__FieldName__Alternatives1303);
                    rule__FieldName__ParameterCountAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getParameterCountAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:643:6: ( ( rule__FieldName__ReturnVariableEexpressionsAssignment_5 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:643:6: ( ( rule__FieldName__ReturnVariableEexpressionsAssignment_5 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:644:1: ( rule__FieldName__ReturnVariableEexpressionsAssignment_5 )
                    {
                     before(grammarAccess.getFieldNameAccess().getReturnVariableEexpressionsAssignment_5()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:645:1: ( rule__FieldName__ReturnVariableEexpressionsAssignment_5 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:645:2: rule__FieldName__ReturnVariableEexpressionsAssignment_5
                    {
                    pushFollow(FOLLOW_rule__FieldName__ReturnVariableEexpressionsAssignment_5_in_rule__FieldName__Alternatives1321);
                    rule__FieldName__ReturnVariableEexpressionsAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getReturnVariableEexpressionsAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:649:6: ( ( rule__FieldName__UsedMethodsAssignment_6 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:649:6: ( ( rule__FieldName__UsedMethodsAssignment_6 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:650:1: ( rule__FieldName__UsedMethodsAssignment_6 )
                    {
                     before(grammarAccess.getFieldNameAccess().getUsedMethodsAssignment_6()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:651:1: ( rule__FieldName__UsedMethodsAssignment_6 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:651:2: rule__FieldName__UsedMethodsAssignment_6
                    {
                    pushFollow(FOLLOW_rule__FieldName__UsedMethodsAssignment_6_in_rule__FieldName__Alternatives1339);
                    rule__FieldName__UsedMethodsAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getUsedMethodsAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:655:6: ( ( rule__FieldName__UsedMethodsInTryAssignment_7 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:655:6: ( ( rule__FieldName__UsedMethodsInTryAssignment_7 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:656:1: ( rule__FieldName__UsedMethodsInTryAssignment_7 )
                    {
                     before(grammarAccess.getFieldNameAccess().getUsedMethodsInTryAssignment_7()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:657:1: ( rule__FieldName__UsedMethodsInTryAssignment_7 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:657:2: rule__FieldName__UsedMethodsInTryAssignment_7
                    {
                    pushFollow(FOLLOW_rule__FieldName__UsedMethodsInTryAssignment_7_in_rule__FieldName__Alternatives1357);
                    rule__FieldName__UsedMethodsInTryAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getUsedMethodsInTryAssignment_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:661:6: ( ( rule__FieldName__UsedMethodsInFinallyAssignment_8 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:661:6: ( ( rule__FieldName__UsedMethodsInFinallyAssignment_8 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:662:1: ( rule__FieldName__UsedMethodsInFinallyAssignment_8 )
                    {
                     before(grammarAccess.getFieldNameAccess().getUsedMethodsInFinallyAssignment_8()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:663:1: ( rule__FieldName__UsedMethodsInFinallyAssignment_8 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:663:2: rule__FieldName__UsedMethodsInFinallyAssignment_8
                    {
                    pushFollow(FOLLOW_rule__FieldName__UsedMethodsInFinallyAssignment_8_in_rule__FieldName__Alternatives1375);
                    rule__FieldName__UsedMethodsInFinallyAssignment_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getUsedMethodsInFinallyAssignment_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:667:6: ( ( rule__FieldName__OverriddenMethodsAssignment_9 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:667:6: ( ( rule__FieldName__OverriddenMethodsAssignment_9 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:668:1: ( rule__FieldName__OverriddenMethodsAssignment_9 )
                    {
                     before(grammarAccess.getFieldNameAccess().getOverriddenMethodsAssignment_9()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:669:1: ( rule__FieldName__OverriddenMethodsAssignment_9 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:669:2: rule__FieldName__OverriddenMethodsAssignment_9
                    {
                    pushFollow(FOLLOW_rule__FieldName__OverriddenMethodsAssignment_9_in_rule__FieldName__Alternatives1393);
                    rule__FieldName__OverriddenMethodsAssignment_9();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getOverriddenMethodsAssignment_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:673:6: ( ( rule__FieldName__ProjectNameAssignment_10 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:673:6: ( ( rule__FieldName__ProjectNameAssignment_10 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:674:1: ( rule__FieldName__ProjectNameAssignment_10 )
                    {
                     before(grammarAccess.getFieldNameAccess().getProjectNameAssignment_10()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:675:1: ( rule__FieldName__ProjectNameAssignment_10 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:675:2: rule__FieldName__ProjectNameAssignment_10
                    {
                    pushFollow(FOLLOW_rule__FieldName__ProjectNameAssignment_10_in_rule__FieldName__Alternatives1411);
                    rule__FieldName__ProjectNameAssignment_10();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getProjectNameAssignment_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:679:6: ( ( rule__FieldName__ResourcePathAssignment_11 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:679:6: ( ( rule__FieldName__ResourcePathAssignment_11 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:680:1: ( rule__FieldName__ResourcePathAssignment_11 )
                    {
                     before(grammarAccess.getFieldNameAccess().getResourcePathAssignment_11()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:681:1: ( rule__FieldName__ResourcePathAssignment_11 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:681:2: rule__FieldName__ResourcePathAssignment_11
                    {
                    pushFollow(FOLLOW_rule__FieldName__ResourcePathAssignment_11_in_rule__FieldName__Alternatives1429);
                    rule__FieldName__ResourcePathAssignment_11();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getResourcePathAssignment_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:685:6: ( ( rule__FieldName__ModifiersAssignment_12 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:685:6: ( ( rule__FieldName__ModifiersAssignment_12 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:686:1: ( rule__FieldName__ModifiersAssignment_12 )
                    {
                     before(grammarAccess.getFieldNameAccess().getModifiersAssignment_12()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:687:1: ( rule__FieldName__ModifiersAssignment_12 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:687:2: rule__FieldName__ModifiersAssignment_12
                    {
                    pushFollow(FOLLOW_rule__FieldName__ModifiersAssignment_12_in_rule__FieldName__Alternatives1447);
                    rule__FieldName__ModifiersAssignment_12();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getModifiersAssignment_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:691:6: ( ( rule__FieldName__AllDeclaredMethodNamesAssignment_13 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:691:6: ( ( rule__FieldName__AllDeclaredMethodNamesAssignment_13 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:692:1: ( rule__FieldName__AllDeclaredMethodNamesAssignment_13 )
                    {
                     before(grammarAccess.getFieldNameAccess().getAllDeclaredMethodNamesAssignment_13()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:693:1: ( rule__FieldName__AllDeclaredMethodNamesAssignment_13 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:693:2: rule__FieldName__AllDeclaredMethodNamesAssignment_13
                    {
                    pushFollow(FOLLOW_rule__FieldName__AllDeclaredMethodNamesAssignment_13_in_rule__FieldName__Alternatives1465);
                    rule__FieldName__AllDeclaredMethodNamesAssignment_13();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getAllDeclaredMethodNamesAssignment_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:697:6: ( ( rule__FieldName__DeclaredMethodNamesAssignment_14 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:697:6: ( ( rule__FieldName__DeclaredMethodNamesAssignment_14 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:698:1: ( rule__FieldName__DeclaredMethodNamesAssignment_14 )
                    {
                     before(grammarAccess.getFieldNameAccess().getDeclaredMethodNamesAssignment_14()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:699:1: ( rule__FieldName__DeclaredMethodNamesAssignment_14 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:699:2: rule__FieldName__DeclaredMethodNamesAssignment_14
                    {
                    pushFollow(FOLLOW_rule__FieldName__DeclaredMethodNamesAssignment_14_in_rule__FieldName__Alternatives1483);
                    rule__FieldName__DeclaredMethodNamesAssignment_14();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getDeclaredMethodNamesAssignment_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:703:6: ( ( rule__FieldName__DeclaredFieldNamesAssignment_15 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:703:6: ( ( rule__FieldName__DeclaredFieldNamesAssignment_15 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:704:1: ( rule__FieldName__DeclaredFieldNamesAssignment_15 )
                    {
                     before(grammarAccess.getFieldNameAccess().getDeclaredFieldNamesAssignment_15()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:705:1: ( rule__FieldName__DeclaredFieldNamesAssignment_15 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:705:2: rule__FieldName__DeclaredFieldNamesAssignment_15
                    {
                    pushFollow(FOLLOW_rule__FieldName__DeclaredFieldNamesAssignment_15_in_rule__FieldName__Alternatives1501);
                    rule__FieldName__DeclaredFieldNamesAssignment_15();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getDeclaredFieldNamesAssignment_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:709:6: ( ( rule__FieldName__DeclaredFieldTypesAssignment_16 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:709:6: ( ( rule__FieldName__DeclaredFieldTypesAssignment_16 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:710:1: ( rule__FieldName__DeclaredFieldTypesAssignment_16 )
                    {
                     before(grammarAccess.getFieldNameAccess().getDeclaredFieldTypesAssignment_16()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:711:1: ( rule__FieldName__DeclaredFieldTypesAssignment_16 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:711:2: rule__FieldName__DeclaredFieldTypesAssignment_16
                    {
                    pushFollow(FOLLOW_rule__FieldName__DeclaredFieldTypesAssignment_16_in_rule__FieldName__Alternatives1519);
                    rule__FieldName__DeclaredFieldTypesAssignment_16();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getDeclaredFieldTypesAssignment_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:715:6: ( ( rule__FieldName__AllDeclaredFieldNamesAssignment_17 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:715:6: ( ( rule__FieldName__AllDeclaredFieldNamesAssignment_17 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:716:1: ( rule__FieldName__AllDeclaredFieldNamesAssignment_17 )
                    {
                     before(grammarAccess.getFieldNameAccess().getAllDeclaredFieldNamesAssignment_17()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:717:1: ( rule__FieldName__AllDeclaredFieldNamesAssignment_17 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:717:2: rule__FieldName__AllDeclaredFieldNamesAssignment_17
                    {
                    pushFollow(FOLLOW_rule__FieldName__AllDeclaredFieldNamesAssignment_17_in_rule__FieldName__Alternatives1537);
                    rule__FieldName__AllDeclaredFieldNamesAssignment_17();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getAllDeclaredFieldNamesAssignment_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:721:6: ( ( rule__FieldName__FullTextAssignment_18 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:721:6: ( ( rule__FieldName__FullTextAssignment_18 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:722:1: ( rule__FieldName__FullTextAssignment_18 )
                    {
                     before(grammarAccess.getFieldNameAccess().getFullTextAssignment_18()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:723:1: ( rule__FieldName__FullTextAssignment_18 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:723:2: rule__FieldName__FullTextAssignment_18
                    {
                    pushFollow(FOLLOW_rule__FieldName__FullTextAssignment_18_in_rule__FieldName__Alternatives1555);
                    rule__FieldName__FullTextAssignment_18();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getFullTextAssignment_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:727:6: ( ( rule__FieldName__FieldsReadAssignment_19 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:727:6: ( ( rule__FieldName__FieldsReadAssignment_19 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:728:1: ( rule__FieldName__FieldsReadAssignment_19 )
                    {
                     before(grammarAccess.getFieldNameAccess().getFieldsReadAssignment_19()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:729:1: ( rule__FieldName__FieldsReadAssignment_19 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:729:2: rule__FieldName__FieldsReadAssignment_19
                    {
                    pushFollow(FOLLOW_rule__FieldName__FieldsReadAssignment_19_in_rule__FieldName__Alternatives1573);
                    rule__FieldName__FieldsReadAssignment_19();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getFieldsReadAssignment_19()); 

                    }


                    }
                    break;
                case 21 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:733:6: ( ( rule__FieldName__FieldsWrittenAssignment_20 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:733:6: ( ( rule__FieldName__FieldsWrittenAssignment_20 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:734:1: ( rule__FieldName__FieldsWrittenAssignment_20 )
                    {
                     before(grammarAccess.getFieldNameAccess().getFieldsWrittenAssignment_20()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:735:1: ( rule__FieldName__FieldsWrittenAssignment_20 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:735:2: rule__FieldName__FieldsWrittenAssignment_20
                    {
                    pushFollow(FOLLOW_rule__FieldName__FieldsWrittenAssignment_20_in_rule__FieldName__Alternatives1591);
                    rule__FieldName__FieldsWrittenAssignment_20();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getFieldsWrittenAssignment_20()); 

                    }


                    }
                    break;
                case 22 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:739:6: ( ( rule__FieldName__UsedFieldsInFinallyAssignment_21 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:739:6: ( ( rule__FieldName__UsedFieldsInFinallyAssignment_21 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:740:1: ( rule__FieldName__UsedFieldsInFinallyAssignment_21 )
                    {
                     before(grammarAccess.getFieldNameAccess().getUsedFieldsInFinallyAssignment_21()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:741:1: ( rule__FieldName__UsedFieldsInFinallyAssignment_21 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:741:2: rule__FieldName__UsedFieldsInFinallyAssignment_21
                    {
                    pushFollow(FOLLOW_rule__FieldName__UsedFieldsInFinallyAssignment_21_in_rule__FieldName__Alternatives1609);
                    rule__FieldName__UsedFieldsInFinallyAssignment_21();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getUsedFieldsInFinallyAssignment_21()); 

                    }


                    }
                    break;
                case 23 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:745:6: ( ( rule__FieldName__UsedFieldsInTryAssignment_22 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:745:6: ( ( rule__FieldName__UsedFieldsInTryAssignment_22 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:746:1: ( rule__FieldName__UsedFieldsInTryAssignment_22 )
                    {
                     before(grammarAccess.getFieldNameAccess().getUsedFieldsInTryAssignment_22()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:747:1: ( rule__FieldName__UsedFieldsInTryAssignment_22 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:747:2: rule__FieldName__UsedFieldsInTryAssignment_22
                    {
                    pushFollow(FOLLOW_rule__FieldName__UsedFieldsInTryAssignment_22_in_rule__FieldName__Alternatives1627);
                    rule__FieldName__UsedFieldsInTryAssignment_22();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getUsedFieldsInTryAssignment_22()); 

                    }


                    }
                    break;
                case 24 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:751:6: ( ( rule__FieldName__AnnotationsAssignment_23 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:751:6: ( ( rule__FieldName__AnnotationsAssignment_23 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:752:1: ( rule__FieldName__AnnotationsAssignment_23 )
                    {
                     before(grammarAccess.getFieldNameAccess().getAnnotationsAssignment_23()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:753:1: ( rule__FieldName__AnnotationsAssignment_23 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:753:2: rule__FieldName__AnnotationsAssignment_23
                    {
                    pushFollow(FOLLOW_rule__FieldName__AnnotationsAssignment_23_in_rule__FieldName__Alternatives1645);
                    rule__FieldName__AnnotationsAssignment_23();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getAnnotationsAssignment_23()); 

                    }


                    }
                    break;
                case 25 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:757:6: ( ( rule__FieldName__TimestampAssignment_24 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:757:6: ( ( rule__FieldName__TimestampAssignment_24 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:758:1: ( rule__FieldName__TimestampAssignment_24 )
                    {
                     before(grammarAccess.getFieldNameAccess().getTimestampAssignment_24()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:759:1: ( rule__FieldName__TimestampAssignment_24 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:759:2: rule__FieldName__TimestampAssignment_24
                    {
                    pushFollow(FOLLOW_rule__FieldName__TimestampAssignment_24_in_rule__FieldName__Alternatives1663);
                    rule__FieldName__TimestampAssignment_24();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getTimestampAssignment_24()); 

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
    // $ANTLR end "rule__FieldName__Alternatives"


    // $ANTLR start "rule__TypeFieldName__Alternatives"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:768:1: rule__TypeFieldName__Alternatives : ( ( ( rule__TypeFieldName__ImplementedTypesAssignment_0 ) ) | ( ( rule__TypeFieldName__ExtendedTypesAssignment_1 ) ) | ( ( rule__TypeFieldName__UsedTypesAssignment_2 ) ) | ( ( rule__TypeFieldName__UsedTypesInTryAssignment_3 ) ) | ( ( rule__TypeFieldName__UsedTypesInFinallyAssignment_4 ) ) | ( ( rule__TypeFieldName__ParameterTypesAssignment_5 ) ) | ( ( rule__TypeFieldName__ReturnTypeAssignment_6 ) ) | ( ( rule__TypeFieldName__AllImplementedTypesAssignment_7 ) ) | ( ( rule__TypeFieldName__AllExtendedTypesAssignment_8 ) ) | ( ( rule__TypeFieldName__FieldTypeAssignment_9 ) ) | ( ( rule__TypeFieldName__DeclaringTypeAssignment_10 ) ) | ( ( rule__TypeFieldName__CaughtTypeAssignment_11 ) ) | ( ( rule__TypeFieldName__InstanceofTypesAssignment_12 ) ) );
    public final void rule__TypeFieldName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:772:1: ( ( ( rule__TypeFieldName__ImplementedTypesAssignment_0 ) ) | ( ( rule__TypeFieldName__ExtendedTypesAssignment_1 ) ) | ( ( rule__TypeFieldName__UsedTypesAssignment_2 ) ) | ( ( rule__TypeFieldName__UsedTypesInTryAssignment_3 ) ) | ( ( rule__TypeFieldName__UsedTypesInFinallyAssignment_4 ) ) | ( ( rule__TypeFieldName__ParameterTypesAssignment_5 ) ) | ( ( rule__TypeFieldName__ReturnTypeAssignment_6 ) ) | ( ( rule__TypeFieldName__AllImplementedTypesAssignment_7 ) ) | ( ( rule__TypeFieldName__AllExtendedTypesAssignment_8 ) ) | ( ( rule__TypeFieldName__FieldTypeAssignment_9 ) ) | ( ( rule__TypeFieldName__DeclaringTypeAssignment_10 ) ) | ( ( rule__TypeFieldName__CaughtTypeAssignment_11 ) ) | ( ( rule__TypeFieldName__InstanceofTypesAssignment_12 ) ) )
            int alt7=13;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt7=1;
                }
                break;
            case 50:
                {
                alt7=2;
                }
                break;
            case 51:
                {
                alt7=3;
                }
                break;
            case 52:
                {
                alt7=4;
                }
                break;
            case 53:
                {
                alt7=5;
                }
                break;
            case 54:
                {
                alt7=6;
                }
                break;
            case 55:
                {
                alt7=7;
                }
                break;
            case 56:
                {
                alt7=8;
                }
                break;
            case 57:
                {
                alt7=9;
                }
                break;
            case 58:
                {
                alt7=10;
                }
                break;
            case 59:
                {
                alt7=11;
                }
                break;
            case 60:
                {
                alt7=12;
                }
                break;
            case 61:
                {
                alt7=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:773:1: ( ( rule__TypeFieldName__ImplementedTypesAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:773:1: ( ( rule__TypeFieldName__ImplementedTypesAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:774:1: ( rule__TypeFieldName__ImplementedTypesAssignment_0 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getImplementedTypesAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:775:1: ( rule__TypeFieldName__ImplementedTypesAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:775:2: rule__TypeFieldName__ImplementedTypesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__ImplementedTypesAssignment_0_in_rule__TypeFieldName__Alternatives1696);
                    rule__TypeFieldName__ImplementedTypesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getImplementedTypesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:779:6: ( ( rule__TypeFieldName__ExtendedTypesAssignment_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:779:6: ( ( rule__TypeFieldName__ExtendedTypesAssignment_1 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:780:1: ( rule__TypeFieldName__ExtendedTypesAssignment_1 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getExtendedTypesAssignment_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:781:1: ( rule__TypeFieldName__ExtendedTypesAssignment_1 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:781:2: rule__TypeFieldName__ExtendedTypesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__ExtendedTypesAssignment_1_in_rule__TypeFieldName__Alternatives1714);
                    rule__TypeFieldName__ExtendedTypesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getExtendedTypesAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:785:6: ( ( rule__TypeFieldName__UsedTypesAssignment_2 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:785:6: ( ( rule__TypeFieldName__UsedTypesAssignment_2 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:786:1: ( rule__TypeFieldName__UsedTypesAssignment_2 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getUsedTypesAssignment_2()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:787:1: ( rule__TypeFieldName__UsedTypesAssignment_2 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:787:2: rule__TypeFieldName__UsedTypesAssignment_2
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__UsedTypesAssignment_2_in_rule__TypeFieldName__Alternatives1732);
                    rule__TypeFieldName__UsedTypesAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getUsedTypesAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:791:6: ( ( rule__TypeFieldName__UsedTypesInTryAssignment_3 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:791:6: ( ( rule__TypeFieldName__UsedTypesInTryAssignment_3 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:792:1: ( rule__TypeFieldName__UsedTypesInTryAssignment_3 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getUsedTypesInTryAssignment_3()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:793:1: ( rule__TypeFieldName__UsedTypesInTryAssignment_3 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:793:2: rule__TypeFieldName__UsedTypesInTryAssignment_3
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__UsedTypesInTryAssignment_3_in_rule__TypeFieldName__Alternatives1750);
                    rule__TypeFieldName__UsedTypesInTryAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getUsedTypesInTryAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:797:6: ( ( rule__TypeFieldName__UsedTypesInFinallyAssignment_4 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:797:6: ( ( rule__TypeFieldName__UsedTypesInFinallyAssignment_4 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:798:1: ( rule__TypeFieldName__UsedTypesInFinallyAssignment_4 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getUsedTypesInFinallyAssignment_4()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:799:1: ( rule__TypeFieldName__UsedTypesInFinallyAssignment_4 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:799:2: rule__TypeFieldName__UsedTypesInFinallyAssignment_4
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__UsedTypesInFinallyAssignment_4_in_rule__TypeFieldName__Alternatives1768);
                    rule__TypeFieldName__UsedTypesInFinallyAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getUsedTypesInFinallyAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:803:6: ( ( rule__TypeFieldName__ParameterTypesAssignment_5 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:803:6: ( ( rule__TypeFieldName__ParameterTypesAssignment_5 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:804:1: ( rule__TypeFieldName__ParameterTypesAssignment_5 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getParameterTypesAssignment_5()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:805:1: ( rule__TypeFieldName__ParameterTypesAssignment_5 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:805:2: rule__TypeFieldName__ParameterTypesAssignment_5
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__ParameterTypesAssignment_5_in_rule__TypeFieldName__Alternatives1786);
                    rule__TypeFieldName__ParameterTypesAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getParameterTypesAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:809:6: ( ( rule__TypeFieldName__ReturnTypeAssignment_6 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:809:6: ( ( rule__TypeFieldName__ReturnTypeAssignment_6 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:810:1: ( rule__TypeFieldName__ReturnTypeAssignment_6 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getReturnTypeAssignment_6()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:811:1: ( rule__TypeFieldName__ReturnTypeAssignment_6 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:811:2: rule__TypeFieldName__ReturnTypeAssignment_6
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__ReturnTypeAssignment_6_in_rule__TypeFieldName__Alternatives1804);
                    rule__TypeFieldName__ReturnTypeAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getReturnTypeAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:815:6: ( ( rule__TypeFieldName__AllImplementedTypesAssignment_7 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:815:6: ( ( rule__TypeFieldName__AllImplementedTypesAssignment_7 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:816:1: ( rule__TypeFieldName__AllImplementedTypesAssignment_7 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getAllImplementedTypesAssignment_7()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:817:1: ( rule__TypeFieldName__AllImplementedTypesAssignment_7 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:817:2: rule__TypeFieldName__AllImplementedTypesAssignment_7
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__AllImplementedTypesAssignment_7_in_rule__TypeFieldName__Alternatives1822);
                    rule__TypeFieldName__AllImplementedTypesAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getAllImplementedTypesAssignment_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:821:6: ( ( rule__TypeFieldName__AllExtendedTypesAssignment_8 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:821:6: ( ( rule__TypeFieldName__AllExtendedTypesAssignment_8 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:822:1: ( rule__TypeFieldName__AllExtendedTypesAssignment_8 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getAllExtendedTypesAssignment_8()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:823:1: ( rule__TypeFieldName__AllExtendedTypesAssignment_8 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:823:2: rule__TypeFieldName__AllExtendedTypesAssignment_8
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__AllExtendedTypesAssignment_8_in_rule__TypeFieldName__Alternatives1840);
                    rule__TypeFieldName__AllExtendedTypesAssignment_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getAllExtendedTypesAssignment_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:827:6: ( ( rule__TypeFieldName__FieldTypeAssignment_9 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:827:6: ( ( rule__TypeFieldName__FieldTypeAssignment_9 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:828:1: ( rule__TypeFieldName__FieldTypeAssignment_9 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getFieldTypeAssignment_9()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:829:1: ( rule__TypeFieldName__FieldTypeAssignment_9 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:829:2: rule__TypeFieldName__FieldTypeAssignment_9
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__FieldTypeAssignment_9_in_rule__TypeFieldName__Alternatives1858);
                    rule__TypeFieldName__FieldTypeAssignment_9();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getFieldTypeAssignment_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:833:6: ( ( rule__TypeFieldName__DeclaringTypeAssignment_10 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:833:6: ( ( rule__TypeFieldName__DeclaringTypeAssignment_10 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:834:1: ( rule__TypeFieldName__DeclaringTypeAssignment_10 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getDeclaringTypeAssignment_10()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:835:1: ( rule__TypeFieldName__DeclaringTypeAssignment_10 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:835:2: rule__TypeFieldName__DeclaringTypeAssignment_10
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__DeclaringTypeAssignment_10_in_rule__TypeFieldName__Alternatives1876);
                    rule__TypeFieldName__DeclaringTypeAssignment_10();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getDeclaringTypeAssignment_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:839:6: ( ( rule__TypeFieldName__CaughtTypeAssignment_11 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:839:6: ( ( rule__TypeFieldName__CaughtTypeAssignment_11 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:840:1: ( rule__TypeFieldName__CaughtTypeAssignment_11 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getCaughtTypeAssignment_11()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:841:1: ( rule__TypeFieldName__CaughtTypeAssignment_11 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:841:2: rule__TypeFieldName__CaughtTypeAssignment_11
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__CaughtTypeAssignment_11_in_rule__TypeFieldName__Alternatives1894);
                    rule__TypeFieldName__CaughtTypeAssignment_11();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getCaughtTypeAssignment_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:845:6: ( ( rule__TypeFieldName__InstanceofTypesAssignment_12 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:845:6: ( ( rule__TypeFieldName__InstanceofTypesAssignment_12 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:846:1: ( rule__TypeFieldName__InstanceofTypesAssignment_12 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getInstanceofTypesAssignment_12()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:847:1: ( rule__TypeFieldName__InstanceofTypesAssignment_12 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:847:2: rule__TypeFieldName__InstanceofTypesAssignment_12
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__InstanceofTypesAssignment_12_in_rule__TypeFieldName__Alternatives1912);
                    rule__TypeFieldName__InstanceofTypesAssignment_12();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getInstanceofTypesAssignment_12()); 

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
    // $ANTLR end "rule__TypeFieldName__Alternatives"


    // $ANTLR start "rule__BooleanExp__Alternatives"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:856:1: rule__BooleanExp__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__BooleanExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:860:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            else if ( (LA8_0==17) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:861:1: ( ( 'AND' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:861:1: ( ( 'AND' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:862:1: ( 'AND' )
                    {
                     before(grammarAccess.getBooleanExpAccess().getAnd1EnumLiteralDeclaration_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:863:1: ( 'AND' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:863:3: 'AND'
                    {
                    match(input,16,FOLLOW_16_in_rule__BooleanExp__Alternatives1946); 

                    }

                     after(grammarAccess.getBooleanExpAccess().getAnd1EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:868:6: ( ( 'OR' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:868:6: ( ( 'OR' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:869:1: ( 'OR' )
                    {
                     before(grammarAccess.getBooleanExpAccess().getOr1EnumLiteralDeclaration_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:870:1: ( 'OR' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:870:3: 'OR'
                    {
                    match(input,17,FOLLOW_17_in_rule__BooleanExp__Alternatives1967); 

                    }

                     after(grammarAccess.getBooleanExpAccess().getOr1EnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__BooleanExp__Alternatives"


    // $ANTLR start "rule__NotExpression__Alternatives"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:880:1: rule__NotExpression__Alternatives : ( ( ( '-' ) ) | ( ( 'NOT' ) ) | ( ( '!' ) ) );
    public final void rule__NotExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:884:1: ( ( ( '-' ) ) | ( ( 'NOT' ) ) | ( ( '!' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt9=1;
                }
                break;
            case 19:
                {
                alt9=2;
                }
                break;
            case 20:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:885:1: ( ( '-' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:885:1: ( ( '-' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:886:1: ( '-' )
                    {
                     before(grammarAccess.getNotExpressionAccess().getN1EnumLiteralDeclaration_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:887:1: ( '-' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:887:3: '-'
                    {
                    match(input,18,FOLLOW_18_in_rule__NotExpression__Alternatives2003); 

                    }

                     after(grammarAccess.getNotExpressionAccess().getN1EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:892:6: ( ( 'NOT' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:892:6: ( ( 'NOT' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:893:1: ( 'NOT' )
                    {
                     before(grammarAccess.getNotExpressionAccess().getN2EnumLiteralDeclaration_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:894:1: ( 'NOT' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:894:3: 'NOT'
                    {
                    match(input,19,FOLLOW_19_in_rule__NotExpression__Alternatives2024); 

                    }

                     after(grammarAccess.getNotExpressionAccess().getN2EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:899:6: ( ( '!' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:899:6: ( ( '!' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:900:1: ( '!' )
                    {
                     before(grammarAccess.getNotExpressionAccess().getN3EnumLiteralDeclaration_2()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:901:1: ( '!' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:901:3: '!'
                    {
                    match(input,20,FOLLOW_20_in_rule__NotExpression__Alternatives2045); 

                    }

                     after(grammarAccess.getNotExpressionAccess().getN3EnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__NotExpression__Alternatives"


    // $ANTLR start "rule__Exp1__Group__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:913:1: rule__Exp1__Group__0 : rule__Exp1__Group__0__Impl rule__Exp1__Group__1 ;
    public final void rule__Exp1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:917:1: ( rule__Exp1__Group__0__Impl rule__Exp1__Group__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:918:2: rule__Exp1__Group__0__Impl rule__Exp1__Group__1
            {
            pushFollow(FOLLOW_rule__Exp1__Group__0__Impl_in_rule__Exp1__Group__02078);
            rule__Exp1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp1__Group__1_in_rule__Exp1__Group__02081);
            rule__Exp1__Group__1();

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
    // $ANTLR end "rule__Exp1__Group__0"


    // $ANTLR start "rule__Exp1__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:925:1: rule__Exp1__Group__0__Impl : ( ruleExp2 ) ;
    public final void rule__Exp1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:929:1: ( ( ruleExp2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:930:1: ( ruleExp2 )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:930:1: ( ruleExp2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:931:1: ruleExp2
            {
             before(grammarAccess.getExp1Access().getExp2ParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleExp2_in_rule__Exp1__Group__0__Impl2108);
            ruleExp2();

            state._fsp--;

             after(grammarAccess.getExp1Access().getExp2ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp1__Group__0__Impl"


    // $ANTLR start "rule__Exp1__Group__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:942:1: rule__Exp1__Group__1 : rule__Exp1__Group__1__Impl ;
    public final void rule__Exp1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:946:1: ( rule__Exp1__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:947:2: rule__Exp1__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Exp1__Group__1__Impl_in_rule__Exp1__Group__12137);
            rule__Exp1__Group__1__Impl();

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
    // $ANTLR end "rule__Exp1__Group__1"


    // $ANTLR start "rule__Exp1__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:953:1: rule__Exp1__Group__1__Impl : ( ( rule__Exp1__Group_1__0 )* ) ;
    public final void rule__Exp1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:957:1: ( ( ( rule__Exp1__Group_1__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:958:1: ( ( rule__Exp1__Group_1__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:958:1: ( ( rule__Exp1__Group_1__0 )* )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:959:1: ( rule__Exp1__Group_1__0 )*
            {
             before(grammarAccess.getExp1Access().getGroup_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:960:1: ( rule__Exp1__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=16 && LA10_0<=17)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:960:2: rule__Exp1__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Exp1__Group_1__0_in_rule__Exp1__Group__1__Impl2164);
            	    rule__Exp1__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getExp1Access().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp1__Group__1__Impl"


    // $ANTLR start "rule__Exp1__Group_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:974:1: rule__Exp1__Group_1__0 : rule__Exp1__Group_1__0__Impl rule__Exp1__Group_1__1 ;
    public final void rule__Exp1__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:978:1: ( rule__Exp1__Group_1__0__Impl rule__Exp1__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:979:2: rule__Exp1__Group_1__0__Impl rule__Exp1__Group_1__1
            {
            pushFollow(FOLLOW_rule__Exp1__Group_1__0__Impl_in_rule__Exp1__Group_1__02199);
            rule__Exp1__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp1__Group_1__1_in_rule__Exp1__Group_1__02202);
            rule__Exp1__Group_1__1();

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
    // $ANTLR end "rule__Exp1__Group_1__0"


    // $ANTLR start "rule__Exp1__Group_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:986:1: rule__Exp1__Group_1__0__Impl : ( () ) ;
    public final void rule__Exp1__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:990:1: ( ( () ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:991:1: ( () )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:991:1: ( () )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:992:1: ()
            {
             before(grammarAccess.getExp1Access().getExp1LeftAction_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:993:1: ()
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:995:1: 
            {
            }

             after(grammarAccess.getExp1Access().getExp1LeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp1__Group_1__0__Impl"


    // $ANTLR start "rule__Exp1__Group_1__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1005:1: rule__Exp1__Group_1__1 : rule__Exp1__Group_1__1__Impl rule__Exp1__Group_1__2 ;
    public final void rule__Exp1__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1009:1: ( rule__Exp1__Group_1__1__Impl rule__Exp1__Group_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1010:2: rule__Exp1__Group_1__1__Impl rule__Exp1__Group_1__2
            {
            pushFollow(FOLLOW_rule__Exp1__Group_1__1__Impl_in_rule__Exp1__Group_1__12260);
            rule__Exp1__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp1__Group_1__2_in_rule__Exp1__Group_1__12263);
            rule__Exp1__Group_1__2();

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
    // $ANTLR end "rule__Exp1__Group_1__1"


    // $ANTLR start "rule__Exp1__Group_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1017:1: rule__Exp1__Group_1__1__Impl : ( ( rule__Exp1__BAssignment_1_1 ) ) ;
    public final void rule__Exp1__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1021:1: ( ( ( rule__Exp1__BAssignment_1_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1022:1: ( ( rule__Exp1__BAssignment_1_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1022:1: ( ( rule__Exp1__BAssignment_1_1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1023:1: ( rule__Exp1__BAssignment_1_1 )
            {
             before(grammarAccess.getExp1Access().getBAssignment_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1024:1: ( rule__Exp1__BAssignment_1_1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1024:2: rule__Exp1__BAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Exp1__BAssignment_1_1_in_rule__Exp1__Group_1__1__Impl2290);
            rule__Exp1__BAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExp1Access().getBAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp1__Group_1__1__Impl"


    // $ANTLR start "rule__Exp1__Group_1__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1034:1: rule__Exp1__Group_1__2 : rule__Exp1__Group_1__2__Impl ;
    public final void rule__Exp1__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1038:1: ( rule__Exp1__Group_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1039:2: rule__Exp1__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Exp1__Group_1__2__Impl_in_rule__Exp1__Group_1__22320);
            rule__Exp1__Group_1__2__Impl();

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
    // $ANTLR end "rule__Exp1__Group_1__2"


    // $ANTLR start "rule__Exp1__Group_1__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1045:1: rule__Exp1__Group_1__2__Impl : ( ( rule__Exp1__RightAssignment_1_2 ) ) ;
    public final void rule__Exp1__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1049:1: ( ( ( rule__Exp1__RightAssignment_1_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1050:1: ( ( rule__Exp1__RightAssignment_1_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1050:1: ( ( rule__Exp1__RightAssignment_1_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1051:1: ( rule__Exp1__RightAssignment_1_2 )
            {
             before(grammarAccess.getExp1Access().getRightAssignment_1_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1052:1: ( rule__Exp1__RightAssignment_1_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1052:2: rule__Exp1__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Exp1__RightAssignment_1_2_in_rule__Exp1__Group_1__2__Impl2347);
            rule__Exp1__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExp1Access().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp1__Group_1__2__Impl"


    // $ANTLR start "rule__Exp2__Group_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1068:1: rule__Exp2__Group_1__0 : rule__Exp2__Group_1__0__Impl rule__Exp2__Group_1__1 ;
    public final void rule__Exp2__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1072:1: ( rule__Exp2__Group_1__0__Impl rule__Exp2__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1073:2: rule__Exp2__Group_1__0__Impl rule__Exp2__Group_1__1
            {
            pushFollow(FOLLOW_rule__Exp2__Group_1__0__Impl_in_rule__Exp2__Group_1__02383);
            rule__Exp2__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp2__Group_1__1_in_rule__Exp2__Group_1__02386);
            rule__Exp2__Group_1__1();

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
    // $ANTLR end "rule__Exp2__Group_1__0"


    // $ANTLR start "rule__Exp2__Group_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1080:1: rule__Exp2__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Exp2__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1084:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1085:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1085:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1086:1: '('
            {
             before(grammarAccess.getExp2Access().getLeftParenthesisKeyword_1_0()); 
            match(input,21,FOLLOW_21_in_rule__Exp2__Group_1__0__Impl2414); 
             after(grammarAccess.getExp2Access().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp2__Group_1__0__Impl"


    // $ANTLR start "rule__Exp2__Group_1__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1099:1: rule__Exp2__Group_1__1 : rule__Exp2__Group_1__1__Impl rule__Exp2__Group_1__2 ;
    public final void rule__Exp2__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1103:1: ( rule__Exp2__Group_1__1__Impl rule__Exp2__Group_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1104:2: rule__Exp2__Group_1__1__Impl rule__Exp2__Group_1__2
            {
            pushFollow(FOLLOW_rule__Exp2__Group_1__1__Impl_in_rule__Exp2__Group_1__12445);
            rule__Exp2__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp2__Group_1__2_in_rule__Exp2__Group_1__12448);
            rule__Exp2__Group_1__2();

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
    // $ANTLR end "rule__Exp2__Group_1__1"


    // $ANTLR start "rule__Exp2__Group_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1111:1: rule__Exp2__Group_1__1__Impl : ( ruleExp1 ) ;
    public final void rule__Exp2__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1115:1: ( ( ruleExp1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1116:1: ( ruleExp1 )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1116:1: ( ruleExp1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1117:1: ruleExp1
            {
             before(grammarAccess.getExp2Access().getExp1ParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleExp1_in_rule__Exp2__Group_1__1__Impl2475);
            ruleExp1();

            state._fsp--;

             after(grammarAccess.getExp2Access().getExp1ParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp2__Group_1__1__Impl"


    // $ANTLR start "rule__Exp2__Group_1__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1128:1: rule__Exp2__Group_1__2 : rule__Exp2__Group_1__2__Impl ;
    public final void rule__Exp2__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1132:1: ( rule__Exp2__Group_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1133:2: rule__Exp2__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Exp2__Group_1__2__Impl_in_rule__Exp2__Group_1__22504);
            rule__Exp2__Group_1__2__Impl();

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
    // $ANTLR end "rule__Exp2__Group_1__2"


    // $ANTLR start "rule__Exp2__Group_1__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1139:1: rule__Exp2__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Exp2__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1143:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1144:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1144:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1145:1: ')'
            {
             before(grammarAccess.getExp2Access().getRightParenthesisKeyword_1_2()); 
            match(input,22,FOLLOW_22_in_rule__Exp2__Group_1__2__Impl2532); 
             after(grammarAccess.getExp2Access().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp2__Group_1__2__Impl"


    // $ANTLR start "rule__ClauseExpression__Group__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1164:1: rule__ClauseExpression__Group__0 : rule__ClauseExpression__Group__0__Impl rule__ClauseExpression__Group__1 ;
    public final void rule__ClauseExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1168:1: ( rule__ClauseExpression__Group__0__Impl rule__ClauseExpression__Group__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1169:2: rule__ClauseExpression__Group__0__Impl rule__ClauseExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group__0__Impl_in_rule__ClauseExpression__Group__02569);
            rule__ClauseExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group__1_in_rule__ClauseExpression__Group__02572);
            rule__ClauseExpression__Group__1();

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
    // $ANTLR end "rule__ClauseExpression__Group__0"


    // $ANTLR start "rule__ClauseExpression__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1176:1: rule__ClauseExpression__Group__0__Impl : ( ( rule__ClauseExpression__Alternatives_0 )? ) ;
    public final void rule__ClauseExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1180:1: ( ( ( rule__ClauseExpression__Alternatives_0 )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1181:1: ( ( rule__ClauseExpression__Alternatives_0 )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1181:1: ( ( rule__ClauseExpression__Alternatives_0 )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1182:1: ( rule__ClauseExpression__Alternatives_0 )?
            {
             before(grammarAccess.getClauseExpressionAccess().getAlternatives_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1183:1: ( rule__ClauseExpression__Alternatives_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==11||(LA11_0>=18 && LA11_0<=20)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1183:2: rule__ClauseExpression__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Alternatives_0_in_rule__ClauseExpression__Group__0__Impl2599);
                    rule__ClauseExpression__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClauseExpressionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1193:1: rule__ClauseExpression__Group__1 : rule__ClauseExpression__Group__1__Impl ;
    public final void rule__ClauseExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1197:1: ( rule__ClauseExpression__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1198:2: rule__ClauseExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group__1__Impl_in_rule__ClauseExpression__Group__12630);
            rule__ClauseExpression__Group__1__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group__1"


    // $ANTLR start "rule__ClauseExpression__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1204:1: rule__ClauseExpression__Group__1__Impl : ( ( rule__ClauseExpression__Alternatives_1 ) ) ;
    public final void rule__ClauseExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1208:1: ( ( ( rule__ClauseExpression__Alternatives_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1209:1: ( ( rule__ClauseExpression__Alternatives_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1209:1: ( ( rule__ClauseExpression__Alternatives_1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1210:1: ( rule__ClauseExpression__Alternatives_1 )
            {
             before(grammarAccess.getClauseExpressionAccess().getAlternatives_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1211:1: ( rule__ClauseExpression__Alternatives_1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1211:2: rule__ClauseExpression__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Alternatives_1_in_rule__ClauseExpression__Group__1__Impl2657);
            rule__ClauseExpression__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group__1__Impl"


    // $ANTLR start "rule__SimpleClause__Group__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1225:1: rule__SimpleClause__Group__0 : rule__SimpleClause__Group__0__Impl rule__SimpleClause__Group__1 ;
    public final void rule__SimpleClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1229:1: ( rule__SimpleClause__Group__0__Impl rule__SimpleClause__Group__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1230:2: rule__SimpleClause__Group__0__Impl rule__SimpleClause__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleClause__Group__0__Impl_in_rule__SimpleClause__Group__02691);
            rule__SimpleClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClause__Group__1_in_rule__SimpleClause__Group__02694);
            rule__SimpleClause__Group__1();

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
    // $ANTLR end "rule__SimpleClause__Group__0"


    // $ANTLR start "rule__SimpleClause__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1237:1: rule__SimpleClause__Group__0__Impl : ( ( rule__SimpleClause__FieldAssignment_0 ) ) ;
    public final void rule__SimpleClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1241:1: ( ( ( rule__SimpleClause__FieldAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1242:1: ( ( rule__SimpleClause__FieldAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1242:1: ( ( rule__SimpleClause__FieldAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1243:1: ( rule__SimpleClause__FieldAssignment_0 )
            {
             before(grammarAccess.getSimpleClauseAccess().getFieldAssignment_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1244:1: ( rule__SimpleClause__FieldAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1244:2: rule__SimpleClause__FieldAssignment_0
            {
            pushFollow(FOLLOW_rule__SimpleClause__FieldAssignment_0_in_rule__SimpleClause__Group__0__Impl2721);
            rule__SimpleClause__FieldAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleClauseAccess().getFieldAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClause__Group__0__Impl"


    // $ANTLR start "rule__SimpleClause__Group__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1254:1: rule__SimpleClause__Group__1 : rule__SimpleClause__Group__1__Impl rule__SimpleClause__Group__2 ;
    public final void rule__SimpleClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1258:1: ( rule__SimpleClause__Group__1__Impl rule__SimpleClause__Group__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1259:2: rule__SimpleClause__Group__1__Impl rule__SimpleClause__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleClause__Group__1__Impl_in_rule__SimpleClause__Group__12751);
            rule__SimpleClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClause__Group__2_in_rule__SimpleClause__Group__12754);
            rule__SimpleClause__Group__2();

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
    // $ANTLR end "rule__SimpleClause__Group__1"


    // $ANTLR start "rule__SimpleClause__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1266:1: rule__SimpleClause__Group__1__Impl : ( ':' ) ;
    public final void rule__SimpleClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1270:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1271:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1271:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1272:1: ':'
            {
             before(grammarAccess.getSimpleClauseAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__SimpleClause__Group__1__Impl2782); 
             after(grammarAccess.getSimpleClauseAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClause__Group__1__Impl"


    // $ANTLR start "rule__SimpleClause__Group__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1285:1: rule__SimpleClause__Group__2 : rule__SimpleClause__Group__2__Impl ;
    public final void rule__SimpleClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1289:1: ( rule__SimpleClause__Group__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1290:2: rule__SimpleClause__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SimpleClause__Group__2__Impl_in_rule__SimpleClause__Group__22813);
            rule__SimpleClause__Group__2__Impl();

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
    // $ANTLR end "rule__SimpleClause__Group__2"


    // $ANTLR start "rule__SimpleClause__Group__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1296:1: rule__SimpleClause__Group__2__Impl : ( ( rule__SimpleClause__ValueAssignment_2 ) ) ;
    public final void rule__SimpleClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1300:1: ( ( ( rule__SimpleClause__ValueAssignment_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1301:1: ( ( rule__SimpleClause__ValueAssignment_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1301:1: ( ( rule__SimpleClause__ValueAssignment_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1302:1: ( rule__SimpleClause__ValueAssignment_2 )
            {
             before(grammarAccess.getSimpleClauseAccess().getValueAssignment_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1303:1: ( rule__SimpleClause__ValueAssignment_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1303:2: rule__SimpleClause__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__SimpleClause__ValueAssignment_2_in_rule__SimpleClause__Group__2__Impl2840);
            rule__SimpleClause__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleClauseAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClause__Group__2__Impl"


    // $ANTLR start "rule__TypeClause__Group__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1319:1: rule__TypeClause__Group__0 : rule__TypeClause__Group__0__Impl rule__TypeClause__Group__1 ;
    public final void rule__TypeClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1323:1: ( rule__TypeClause__Group__0__Impl rule__TypeClause__Group__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1324:2: rule__TypeClause__Group__0__Impl rule__TypeClause__Group__1
            {
            pushFollow(FOLLOW_rule__TypeClause__Group__0__Impl_in_rule__TypeClause__Group__02876);
            rule__TypeClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeClause__Group__1_in_rule__TypeClause__Group__02879);
            rule__TypeClause__Group__1();

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
    // $ANTLR end "rule__TypeClause__Group__0"


    // $ANTLR start "rule__TypeClause__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1331:1: rule__TypeClause__Group__0__Impl : ( ( rule__TypeClause__FieldAssignment_0 ) ) ;
    public final void rule__TypeClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1335:1: ( ( ( rule__TypeClause__FieldAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1336:1: ( ( rule__TypeClause__FieldAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1336:1: ( ( rule__TypeClause__FieldAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1337:1: ( rule__TypeClause__FieldAssignment_0 )
            {
             before(grammarAccess.getTypeClauseAccess().getFieldAssignment_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1338:1: ( rule__TypeClause__FieldAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1338:2: rule__TypeClause__FieldAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeClause__FieldAssignment_0_in_rule__TypeClause__Group__0__Impl2906);
            rule__TypeClause__FieldAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeClauseAccess().getFieldAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeClause__Group__0__Impl"


    // $ANTLR start "rule__TypeClause__Group__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1348:1: rule__TypeClause__Group__1 : rule__TypeClause__Group__1__Impl rule__TypeClause__Group__2 ;
    public final void rule__TypeClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1352:1: ( rule__TypeClause__Group__1__Impl rule__TypeClause__Group__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1353:2: rule__TypeClause__Group__1__Impl rule__TypeClause__Group__2
            {
            pushFollow(FOLLOW_rule__TypeClause__Group__1__Impl_in_rule__TypeClause__Group__12936);
            rule__TypeClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeClause__Group__2_in_rule__TypeClause__Group__12939);
            rule__TypeClause__Group__2();

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
    // $ANTLR end "rule__TypeClause__Group__1"


    // $ANTLR start "rule__TypeClause__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1360:1: rule__TypeClause__Group__1__Impl : ( ':' ) ;
    public final void rule__TypeClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1364:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1365:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1365:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1366:1: ':'
            {
             before(grammarAccess.getTypeClauseAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__TypeClause__Group__1__Impl2967); 
             after(grammarAccess.getTypeClauseAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeClause__Group__1__Impl"


    // $ANTLR start "rule__TypeClause__Group__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1379:1: rule__TypeClause__Group__2 : rule__TypeClause__Group__2__Impl ;
    public final void rule__TypeClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1383:1: ( rule__TypeClause__Group__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1384:2: rule__TypeClause__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeClause__Group__2__Impl_in_rule__TypeClause__Group__22998);
            rule__TypeClause__Group__2__Impl();

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
    // $ANTLR end "rule__TypeClause__Group__2"


    // $ANTLR start "rule__TypeClause__Group__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1390:1: rule__TypeClause__Group__2__Impl : ( ( rule__TypeClause__ValueAssignment_2 ) ) ;
    public final void rule__TypeClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1394:1: ( ( ( rule__TypeClause__ValueAssignment_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1395:1: ( ( rule__TypeClause__ValueAssignment_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1395:1: ( ( rule__TypeClause__ValueAssignment_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1396:1: ( rule__TypeClause__ValueAssignment_2 )
            {
             before(grammarAccess.getTypeClauseAccess().getValueAssignment_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1397:1: ( rule__TypeClause__ValueAssignment_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1397:2: rule__TypeClause__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__TypeClause__ValueAssignment_2_in_rule__TypeClause__Group__2__Impl3025);
            rule__TypeClause__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeClauseAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeClause__Group__2__Impl"


    // $ANTLR start "rule__Value__Group__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1413:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1417:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1418:2: rule__Value__Group__0__Impl rule__Value__Group__1
            {
            pushFollow(FOLLOW_rule__Value__Group__0__Impl_in_rule__Value__Group__03061);
            rule__Value__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Value__Group__1_in_rule__Value__Group__03064);
            rule__Value__Group__1();

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
    // $ANTLR end "rule__Value__Group__0"


    // $ANTLR start "rule__Value__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1425:1: rule__Value__Group__0__Impl : ( ( ruleWildcard )? ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1429:1: ( ( ( ruleWildcard )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1430:1: ( ( ruleWildcard )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1430:1: ( ( ruleWildcard )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1431:1: ( ruleWildcard )?
            {
             before(grammarAccess.getValueAccess().getWildcardParserRuleCall_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1432:1: ( ruleWildcard )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            else if ( (LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1432:3: ruleWildcard
                    {
                    pushFollow(FOLLOW_ruleWildcard_in_rule__Value__Group__0__Impl3092);
                    ruleWildcard();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getValueAccess().getWildcardParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__0__Impl"


    // $ANTLR start "rule__Value__Group__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1442:1: rule__Value__Group__1 : rule__Value__Group__1__Impl ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1446:1: ( rule__Value__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1447:2: rule__Value__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Value__Group__1__Impl_in_rule__Value__Group__13123);
            rule__Value__Group__1__Impl();

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
    // $ANTLR end "rule__Value__Group__1"


    // $ANTLR start "rule__Value__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1453:1: rule__Value__Group__1__Impl : ( ( rule__Value__Group_1__0 )? ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1457:1: ( ( ( rule__Value__Group_1__0 )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1458:1: ( ( rule__Value__Group_1__0 )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1458:1: ( ( rule__Value__Group_1__0 )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1459:1: ( rule__Value__Group_1__0 )?
            {
             before(grammarAccess.getValueAccess().getGroup_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1460:1: ( rule__Value__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1460:2: rule__Value__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Value__Group_1__0_in_rule__Value__Group__1__Impl3150);
                    rule__Value__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getValueAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__1__Impl"


    // $ANTLR start "rule__Value__Group_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1474:1: rule__Value__Group_1__0 : rule__Value__Group_1__0__Impl rule__Value__Group_1__1 ;
    public final void rule__Value__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1478:1: ( rule__Value__Group_1__0__Impl rule__Value__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1479:2: rule__Value__Group_1__0__Impl rule__Value__Group_1__1
            {
            pushFollow(FOLLOW_rule__Value__Group_1__0__Impl_in_rule__Value__Group_1__03185);
            rule__Value__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Value__Group_1__1_in_rule__Value__Group_1__03188);
            rule__Value__Group_1__1();

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
    // $ANTLR end "rule__Value__Group_1__0"


    // $ANTLR start "rule__Value__Group_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1486:1: rule__Value__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__Value__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1490:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1491:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1491:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1492:1: RULE_ID
            {
             before(grammarAccess.getValueAccess().getIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Value__Group_1__0__Impl3215); 
             after(grammarAccess.getValueAccess().getIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_1__0__Impl"


    // $ANTLR start "rule__Value__Group_1__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1503:1: rule__Value__Group_1__1 : rule__Value__Group_1__1__Impl rule__Value__Group_1__2 ;
    public final void rule__Value__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1507:1: ( rule__Value__Group_1__1__Impl rule__Value__Group_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1508:2: rule__Value__Group_1__1__Impl rule__Value__Group_1__2
            {
            pushFollow(FOLLOW_rule__Value__Group_1__1__Impl_in_rule__Value__Group_1__13244);
            rule__Value__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Value__Group_1__2_in_rule__Value__Group_1__13247);
            rule__Value__Group_1__2();

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
    // $ANTLR end "rule__Value__Group_1__1"


    // $ANTLR start "rule__Value__Group_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1515:1: rule__Value__Group_1__1__Impl : ( ( rule__Value__Group_1_1__0 )* ) ;
    public final void rule__Value__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1519:1: ( ( ( rule__Value__Group_1_1__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1520:1: ( ( rule__Value__Group_1_1__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1520:1: ( ( rule__Value__Group_1_1__0 )* )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1521:1: ( rule__Value__Group_1_1__0 )*
            {
             before(grammarAccess.getValueAccess().getGroup_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1522:1: ( rule__Value__Group_1_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==14) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==RULE_ID) ) {
                        alt14=1;
                    }


                }
                else if ( (LA14_0==15) ) {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==RULE_ID) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1522:2: rule__Value__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Value__Group_1_1__0_in_rule__Value__Group_1__1__Impl3274);
            	    rule__Value__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getValueAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_1__1__Impl"


    // $ANTLR start "rule__Value__Group_1__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1532:1: rule__Value__Group_1__2 : rule__Value__Group_1__2__Impl ;
    public final void rule__Value__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1536:1: ( rule__Value__Group_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1537:2: rule__Value__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Value__Group_1__2__Impl_in_rule__Value__Group_1__23305);
            rule__Value__Group_1__2__Impl();

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
    // $ANTLR end "rule__Value__Group_1__2"


    // $ANTLR start "rule__Value__Group_1__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1543:1: rule__Value__Group_1__2__Impl : ( ( ruleWildcard )? ) ;
    public final void rule__Value__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1547:1: ( ( ( ruleWildcard )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1548:1: ( ( ruleWildcard )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1548:1: ( ( ruleWildcard )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1549:1: ( ruleWildcard )?
            {
             before(grammarAccess.getValueAccess().getWildcardParserRuleCall_1_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1550:1: ( ruleWildcard )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==14) ) {
                alt15=1;
            }
            else if ( (LA15_0==15) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1550:3: ruleWildcard
                    {
                    pushFollow(FOLLOW_ruleWildcard_in_rule__Value__Group_1__2__Impl3333);
                    ruleWildcard();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getValueAccess().getWildcardParserRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_1__2__Impl"


    // $ANTLR start "rule__Value__Group_1_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1566:1: rule__Value__Group_1_1__0 : rule__Value__Group_1_1__0__Impl rule__Value__Group_1_1__1 ;
    public final void rule__Value__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1570:1: ( rule__Value__Group_1_1__0__Impl rule__Value__Group_1_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1571:2: rule__Value__Group_1_1__0__Impl rule__Value__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Value__Group_1_1__0__Impl_in_rule__Value__Group_1_1__03370);
            rule__Value__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Value__Group_1_1__1_in_rule__Value__Group_1_1__03373);
            rule__Value__Group_1_1__1();

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
    // $ANTLR end "rule__Value__Group_1_1__0"


    // $ANTLR start "rule__Value__Group_1_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1578:1: rule__Value__Group_1_1__0__Impl : ( ruleWildcard ) ;
    public final void rule__Value__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1582:1: ( ( ruleWildcard ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1583:1: ( ruleWildcard )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1583:1: ( ruleWildcard )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1584:1: ruleWildcard
            {
             before(grammarAccess.getValueAccess().getWildcardParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleWildcard_in_rule__Value__Group_1_1__0__Impl3400);
            ruleWildcard();

            state._fsp--;

             after(grammarAccess.getValueAccess().getWildcardParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_1_1__0__Impl"


    // $ANTLR start "rule__Value__Group_1_1__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1595:1: rule__Value__Group_1_1__1 : rule__Value__Group_1_1__1__Impl ;
    public final void rule__Value__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1599:1: ( rule__Value__Group_1_1__1__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1600:2: rule__Value__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Value__Group_1_1__1__Impl_in_rule__Value__Group_1_1__13429);
            rule__Value__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__Value__Group_1_1__1"


    // $ANTLR start "rule__Value__Group_1_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1606:1: rule__Value__Group_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Value__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1610:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1611:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1611:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1612:1: RULE_ID
            {
             before(grammarAccess.getValueAccess().getIDTerminalRuleCall_1_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Value__Group_1_1__1__Impl3456); 
             after(grammarAccess.getValueAccess().getIDTerminalRuleCall_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_1_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1627:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1631:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1632:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__03489);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__03492);
            rule__QualifiedNameWithWildcard__Group__1();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1639:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleValue ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1643:1: ( ( ruleValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1644:1: ( ruleValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1644:1: ( ruleValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1645:1: ruleValue
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getValueParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__QualifiedNameWithWildcard__Group__0__Impl3519);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getValueParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1656:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2 ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1660:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1661:2: rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__13548);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__2_in_rule__QualifiedNameWithWildcard__Group__13551);
            rule__QualifiedNameWithWildcard__Group__2();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1668:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( rule__QualifiedNameWithWildcard__Group_1__0 )* ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1672:1: ( ( ( rule__QualifiedNameWithWildcard__Group_1__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1673:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1673:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )* )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1674:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1675:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                switch ( input.LA(1) ) {
                case 14:
                    {
                    int LA16_1 = input.LA(2);

                    if ( ((LA16_1>=12 && LA16_1<=13)) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 15:
                    {
                    int LA16_2 = input.LA(2);

                    if ( ((LA16_2>=12 && LA16_2<=13)) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 12:
                case 13:
                    {
                    alt16=1;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1675:2: rule__QualifiedNameWithWildcard__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0_in_rule__QualifiedNameWithWildcard__Group__1__Impl3578);
            	    rule__QualifiedNameWithWildcard__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1685:1: rule__QualifiedNameWithWildcard__Group__2 : rule__QualifiedNameWithWildcard__Group__2__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1689:1: ( rule__QualifiedNameWithWildcard__Group__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1690:2: rule__QualifiedNameWithWildcard__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__2__Impl_in_rule__QualifiedNameWithWildcard__Group__23609);
            rule__QualifiedNameWithWildcard__Group__2__Impl();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__2"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1696:1: rule__QualifiedNameWithWildcard__Group__2__Impl : ( ( ruleWildcard )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1700:1: ( ( ( ruleWildcard )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1701:1: ( ( ruleWildcard )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1701:1: ( ( ruleWildcard )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1702:1: ( ruleWildcard )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getWildcardParserRuleCall_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1703:1: ( ruleWildcard )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=14 && LA17_0<=15)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1703:3: ruleWildcard
                    {
                    pushFollow(FOLLOW_ruleWildcard_in_rule__QualifiedNameWithWildcard__Group__2__Impl3637);
                    ruleWildcard();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getWildcardParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__2__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1719:1: rule__QualifiedNameWithWildcard__Group_1__0 : rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1723:1: ( rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1724:2: rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0__Impl_in_rule__QualifiedNameWithWildcard__Group_1__03674);
            rule__QualifiedNameWithWildcard__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1_in_rule__QualifiedNameWithWildcard__Group_1__03677);
            rule__QualifiedNameWithWildcard__Group_1__1();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group_1__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1731:1: rule__QualifiedNameWithWildcard__Group_1__0__Impl : ( ( ruleWildcard )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1735:1: ( ( ( ruleWildcard )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1736:1: ( ( ruleWildcard )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1736:1: ( ( ruleWildcard )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1737:1: ( ruleWildcard )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getWildcardParserRuleCall_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1738:1: ( ruleWildcard )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=14 && LA18_0<=15)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1738:3: ruleWildcard
                    {
                    pushFollow(FOLLOW_ruleWildcard_in_rule__QualifiedNameWithWildcard__Group_1__0__Impl3705);
                    ruleWildcard();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group_1__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1748:1: rule__QualifiedNameWithWildcard__Group_1__1 : rule__QualifiedNameWithWildcard__Group_1__1__Impl rule__QualifiedNameWithWildcard__Group_1__2 ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1752:1: ( rule__QualifiedNameWithWildcard__Group_1__1__Impl rule__QualifiedNameWithWildcard__Group_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1753:2: rule__QualifiedNameWithWildcard__Group_1__1__Impl rule__QualifiedNameWithWildcard__Group_1__2
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1__Impl_in_rule__QualifiedNameWithWildcard__Group_1__13736);
            rule__QualifiedNameWithWildcard__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__2_in_rule__QualifiedNameWithWildcard__Group_1__13739);
            rule__QualifiedNameWithWildcard__Group_1__2();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group_1__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1760:1: rule__QualifiedNameWithWildcard__Group_1__1__Impl : ( ruleSep ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1764:1: ( ( ruleSep ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1765:1: ( ruleSep )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1765:1: ( ruleSep )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1766:1: ruleSep
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getSepParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleSep_in_rule__QualifiedNameWithWildcard__Group_1__1__Impl3766);
            ruleSep();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getSepParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group_1__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1777:1: rule__QualifiedNameWithWildcard__Group_1__2 : rule__QualifiedNameWithWildcard__Group_1__2__Impl rule__QualifiedNameWithWildcard__Group_1__3 ;
    public final void rule__QualifiedNameWithWildcard__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1781:1: ( rule__QualifiedNameWithWildcard__Group_1__2__Impl rule__QualifiedNameWithWildcard__Group_1__3 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1782:2: rule__QualifiedNameWithWildcard__Group_1__2__Impl rule__QualifiedNameWithWildcard__Group_1__3
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__2__Impl_in_rule__QualifiedNameWithWildcard__Group_1__23795);
            rule__QualifiedNameWithWildcard__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__3_in_rule__QualifiedNameWithWildcard__Group_1__23798);
            rule__QualifiedNameWithWildcard__Group_1__3();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group_1__2"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group_1__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1789:1: rule__QualifiedNameWithWildcard__Group_1__2__Impl : ( ( ruleWildcard )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1793:1: ( ( ( ruleWildcard )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1794:1: ( ( ruleWildcard )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1794:1: ( ( ruleWildcard )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1795:1: ( ruleWildcard )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getWildcardParserRuleCall_1_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1796:1: ( ruleWildcard )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==14) ) {
                alt19=1;
            }
            else if ( (LA19_0==15) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1796:3: ruleWildcard
                    {
                    pushFollow(FOLLOW_ruleWildcard_in_rule__QualifiedNameWithWildcard__Group_1__2__Impl3826);
                    ruleWildcard();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getWildcardParserRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group_1__2__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group_1__3"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1806:1: rule__QualifiedNameWithWildcard__Group_1__3 : rule__QualifiedNameWithWildcard__Group_1__3__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1810:1: ( rule__QualifiedNameWithWildcard__Group_1__3__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1811:2: rule__QualifiedNameWithWildcard__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__3__Impl_in_rule__QualifiedNameWithWildcard__Group_1__33857);
            rule__QualifiedNameWithWildcard__Group_1__3__Impl();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group_1__3"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group_1__3__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1817:1: rule__QualifiedNameWithWildcard__Group_1__3__Impl : ( ruleValue ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1821:1: ( ( ruleValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1822:1: ( ruleValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1822:1: ( ruleValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1823:1: ruleValue
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getValueParserRuleCall_1_3()); 
            pushFollow(FOLLOW_ruleValue_in_rule__QualifiedNameWithWildcard__Group_1__3__Impl3884);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getValueParserRuleCall_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group_1__3__Impl"


    // $ANTLR start "rule__Exp1__BAssignment_1_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1843:1: rule__Exp1__BAssignment_1_1 : ( ruleBooleanExp ) ;
    public final void rule__Exp1__BAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1847:1: ( ( ruleBooleanExp ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1848:1: ( ruleBooleanExp )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1848:1: ( ruleBooleanExp )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1849:1: ruleBooleanExp
            {
             before(grammarAccess.getExp1Access().getBBooleanExpEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleBooleanExp_in_rule__Exp1__BAssignment_1_13926);
            ruleBooleanExp();

            state._fsp--;

             after(grammarAccess.getExp1Access().getBBooleanExpEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp1__BAssignment_1_1"


    // $ANTLR start "rule__Exp1__RightAssignment_1_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1858:1: rule__Exp1__RightAssignment_1_2 : ( ruleExp2 ) ;
    public final void rule__Exp1__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1862:1: ( ( ruleExp2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1863:1: ( ruleExp2 )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1863:1: ( ruleExp2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1864:1: ruleExp2
            {
             before(grammarAccess.getExp1Access().getRightExp2ParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleExp2_in_rule__Exp1__RightAssignment_1_23957);
            ruleExp2();

            state._fsp--;

             after(grammarAccess.getExp1Access().getRightExp2ParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp1__RightAssignment_1_2"


    // $ANTLR start "rule__Exp2__ValueAssignment_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1873:1: rule__Exp2__ValueAssignment_0 : ( ruleClauseExpression ) ;
    public final void rule__Exp2__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1877:1: ( ( ruleClauseExpression ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1878:1: ( ruleClauseExpression )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1878:1: ( ruleClauseExpression )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1879:1: ruleClauseExpression
            {
             before(grammarAccess.getExp2Access().getValueClauseExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleClauseExpression_in_rule__Exp2__ValueAssignment_03988);
            ruleClauseExpression();

            state._fsp--;

             after(grammarAccess.getExp2Access().getValueClauseExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp2__ValueAssignment_0"


    // $ANTLR start "rule__ClauseExpression__NAssignment_0_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1888:1: rule__ClauseExpression__NAssignment_0_0 : ( ruleNotExpression ) ;
    public final void rule__ClauseExpression__NAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1892:1: ( ( ruleNotExpression ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1893:1: ( ruleNotExpression )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1893:1: ( ruleNotExpression )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1894:1: ruleNotExpression
            {
             before(grammarAccess.getClauseExpressionAccess().getNNotExpressionEnumRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleNotExpression_in_rule__ClauseExpression__NAssignment_0_04019);
            ruleNotExpression();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getNNotExpressionEnumRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__NAssignment_0_0"


    // $ANTLR start "rule__ClauseExpression__MAssignment_0_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1903:1: rule__ClauseExpression__MAssignment_0_1 : ( ruleMustExpression ) ;
    public final void rule__ClauseExpression__MAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1907:1: ( ( ruleMustExpression ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1908:1: ( ruleMustExpression )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1908:1: ( ruleMustExpression )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1909:1: ruleMustExpression
            {
             before(grammarAccess.getClauseExpressionAccess().getMMustExpressionEnumRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleMustExpression_in_rule__ClauseExpression__MAssignment_0_14050);
            ruleMustExpression();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getMMustExpressionEnumRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__MAssignment_0_1"


    // $ANTLR start "rule__ClauseExpression__ClauseAssignment_1_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1918:1: rule__ClauseExpression__ClauseAssignment_1_0 : ( ruleSimpleClause ) ;
    public final void rule__ClauseExpression__ClauseAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1922:1: ( ( ruleSimpleClause ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1923:1: ( ruleSimpleClause )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1923:1: ( ruleSimpleClause )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1924:1: ruleSimpleClause
            {
             before(grammarAccess.getClauseExpressionAccess().getClauseSimpleClauseParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleSimpleClause_in_rule__ClauseExpression__ClauseAssignment_1_04081);
            ruleSimpleClause();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getClauseSimpleClauseParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ClauseAssignment_1_0"


    // $ANTLR start "rule__ClauseExpression__ClauseAssignment_1_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1933:1: rule__ClauseExpression__ClauseAssignment_1_1 : ( ruleTypeClause ) ;
    public final void rule__ClauseExpression__ClauseAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1937:1: ( ( ruleTypeClause ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1938:1: ( ruleTypeClause )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1938:1: ( ruleTypeClause )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1939:1: ruleTypeClause
            {
             before(grammarAccess.getClauseExpressionAccess().getClauseTypeClauseParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleTypeClause_in_rule__ClauseExpression__ClauseAssignment_1_14112);
            ruleTypeClause();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getClauseTypeClauseParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ClauseAssignment_1_1"


    // $ANTLR start "rule__SimpleClause__FieldAssignment_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1948:1: rule__SimpleClause__FieldAssignment_0 : ( ruleFieldName ) ;
    public final void rule__SimpleClause__FieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1952:1: ( ( ruleFieldName ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1953:1: ( ruleFieldName )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1953:1: ( ruleFieldName )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1954:1: ruleFieldName
            {
             before(grammarAccess.getSimpleClauseAccess().getFieldFieldNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleFieldName_in_rule__SimpleClause__FieldAssignment_04143);
            ruleFieldName();

            state._fsp--;

             after(grammarAccess.getSimpleClauseAccess().getFieldFieldNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClause__FieldAssignment_0"


    // $ANTLR start "rule__SimpleClause__ValueAssignment_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1963:1: rule__SimpleClause__ValueAssignment_2 : ( ruleFieldValue ) ;
    public final void rule__SimpleClause__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1967:1: ( ( ruleFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1968:1: ( ruleFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1968:1: ( ruleFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1969:1: ruleFieldValue
            {
             before(grammarAccess.getSimpleClauseAccess().getValueFieldValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFieldValue_in_rule__SimpleClause__ValueAssignment_24174);
            ruleFieldValue();

            state._fsp--;

             after(grammarAccess.getSimpleClauseAccess().getValueFieldValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClause__ValueAssignment_2"


    // $ANTLR start "rule__TypeClause__FieldAssignment_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1978:1: rule__TypeClause__FieldAssignment_0 : ( ruleTypeFieldName ) ;
    public final void rule__TypeClause__FieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1982:1: ( ( ruleTypeFieldName ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1983:1: ( ruleTypeFieldName )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1983:1: ( ruleTypeFieldName )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1984:1: ruleTypeFieldName
            {
             before(grammarAccess.getTypeClauseAccess().getFieldTypeFieldNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTypeFieldName_in_rule__TypeClause__FieldAssignment_04205);
            ruleTypeFieldName();

            state._fsp--;

             after(grammarAccess.getTypeClauseAccess().getFieldTypeFieldNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeClause__FieldAssignment_0"


    // $ANTLR start "rule__TypeClause__ValueAssignment_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1993:1: rule__TypeClause__ValueAssignment_2 : ( ruleTypeValue ) ;
    public final void rule__TypeClause__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1997:1: ( ( ruleTypeValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1998:1: ( ruleTypeValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1998:1: ( ruleTypeValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1999:1: ruleTypeValue
            {
             before(grammarAccess.getTypeClauseAccess().getValueTypeValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTypeValue_in_rule__TypeClause__ValueAssignment_24236);
            ruleTypeValue();

            state._fsp--;

             after(grammarAccess.getTypeClauseAccess().getValueTypeValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeClause__ValueAssignment_2"


    // $ANTLR start "rule__FieldName__FullyQualifiedNameAssignment_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2008:1: rule__FieldName__FullyQualifiedNameAssignment_0 : ( ( 'FullyQualifiedName' ) ) ;
    public final void rule__FieldName__FullyQualifiedNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2012:1: ( ( ( 'FullyQualifiedName' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2013:1: ( ( 'FullyQualifiedName' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2013:1: ( ( 'FullyQualifiedName' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2014:1: ( 'FullyQualifiedName' )
            {
             before(grammarAccess.getFieldNameAccess().getFullyQualifiedNameFullyQualifiedNameKeyword_0_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2015:1: ( 'FullyQualifiedName' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2016:1: 'FullyQualifiedName'
            {
             before(grammarAccess.getFieldNameAccess().getFullyQualifiedNameFullyQualifiedNameKeyword_0_0()); 
            match(input,24,FOLLOW_24_in_rule__FieldName__FullyQualifiedNameAssignment_04272); 
             after(grammarAccess.getFieldNameAccess().getFullyQualifiedNameFullyQualifiedNameKeyword_0_0()); 

            }

             after(grammarAccess.getFieldNameAccess().getFullyQualifiedNameFullyQualifiedNameKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldName__FullyQualifiedNameAssignment_0"


    // $ANTLR start "rule__FieldName__TypeAssignment_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2031:1: rule__FieldName__TypeAssignment_1 : ( ( 'Type' ) ) ;
    public final void rule__FieldName__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2035:1: ( ( ( 'Type' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2036:1: ( ( 'Type' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2036:1: ( ( 'Type' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2037:1: ( 'Type' )
            {
             before(grammarAccess.getFieldNameAccess().getTypeTypeKeyword_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2038:1: ( 'Type' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2039:1: 'Type'
            {
             before(grammarAccess.getFieldNameAccess().getTypeTypeKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__FieldName__TypeAssignment_14316); 
             after(grammarAccess.getFieldNameAccess().getTypeTypeKeyword_1_0()); 

            }

             after(grammarAccess.getFieldNameAccess().getTypeTypeKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldName__TypeAssignment_1"


    // $ANTLR start "rule__FieldName__FriendlyNameAssignment_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2054:1: rule__FieldName__FriendlyNameAssignment_2 : ( ( 'FriendlyName' ) ) ;
    public final void rule__FieldName__FriendlyNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2058:1: ( ( ( 'FriendlyName' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2059:1: ( ( 'FriendlyName' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2059:1: ( ( 'FriendlyName' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2060:1: ( 'FriendlyName' )
            {
             before(grammarAccess.getFieldNameAccess().getFriendlyNameFriendlyNameKeyword_2_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2061:1: ( 'FriendlyName' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2062:1: 'FriendlyName'
            {
             before(grammarAccess.getFieldNameAccess().getFriendlyNameFriendlyNameKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__FieldName__FriendlyNameAssignment_24360); 
             after(grammarAccess.getFieldNameAccess().getFriendlyNameFriendlyNameKeyword_2_0()); 

            }

             after(grammarAccess.getFieldNameAccess().getFriendlyNameFriendlyNameKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldName__FriendlyNameAssignment_2"


    // $ANTLR start "rule__FieldName__DeclaredMethodsAssignment_3"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2077:1: rule__FieldName__DeclaredMethodsAssignment_3 : ( ( 'DeclaredMethods' ) ) ;
    public final void rule__FieldName__DeclaredMethodsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2081:1: ( ( ( 'DeclaredMethods' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2082:1: ( ( 'DeclaredMethods' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2082:1: ( ( 'DeclaredMethods' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2083:1: ( 'DeclaredMethods' )
            {
             before(grammarAccess.getFieldNameAccess().getDeclaredMethodsDeclaredMethodsKeyword_3_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2084:1: ( 'DeclaredMethods' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2085:1: 'DeclaredMethods'
            {
             before(grammarAccess.getFieldNameAccess().getDeclaredMethodsDeclaredMethodsKeyword_3_0()); 
            match(input,27,FOLLOW_27_in_rule__FieldName__DeclaredMethodsAssignment_34404); 
             after(grammarAccess.getFieldNameAccess().getDeclaredMethodsDeclaredMethodsKeyword_3_0()); 

            }

             after(grammarAccess.getFieldNameAccess().getDeclaredMethodsDeclaredMethodsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldName__DeclaredMethodsAssignment_3"


    // $ANTLR start "rule__FieldName__ParameterCountAssignment_4"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2100:1: rule__FieldName__ParameterCountAssignment_4 : ( ( 'ParameterCount' ) ) ;
    public final void rule__FieldName__ParameterCountAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2104:1: ( ( ( 'ParameterCount' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2105:1: ( ( 'ParameterCount' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2105:1: ( ( 'ParameterCount' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2106:1: ( 'ParameterCount' )
            {
             before(grammarAccess.getFieldNameAccess().getParameterCountParameterCountKeyword_4_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2107:1: ( 'ParameterCount' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2108:1: 'ParameterCount'
            {
             before(grammarAccess.getFieldNameAccess().getParameterCountParameterCountKeyword_4_0()); 
            match(input,28,FOLLOW_28_in_rule__FieldName__ParameterCountAssignment_44448); 
             after(grammarAccess.getFieldNameAccess().getParameterCountParameterCountKeyword_4_0()); 

            }

             after(grammarAccess.getFieldNameAccess().getParameterCountParameterCountKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldName__ParameterCountAssignment_4"


    // $ANTLR start "rule__FieldName__ReturnVariableEexpressionsAssignment_5"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2123:1: rule__FieldName__ReturnVariableEexpressionsAssignment_5 : ( ( 'ReturnVariableEexpressions' ) ) ;
    public final void rule__FieldName__ReturnVariableEexpressionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2127:1: ( ( ( 'ReturnVariableEexpressions' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2128:1: ( ( 'ReturnVariableEexpressions' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2128:1: ( ( 'ReturnVariableEexpressions' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2129:1: ( 'ReturnVariableEexpressions' )
            {
             before(grammarAccess.getFieldNameAccess().getReturnVariableEexpressionsReturnVariableEexpressionsKeyword_5_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2130:1: ( 'ReturnVariableEexpressions' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2131:1: 'ReturnVariableEexpressions'
            {
             before(grammarAccess.getFieldNameAccess().getReturnVariableEexpressionsReturnVariableEexpressionsKeyword_5_0()); 
            match(input,29,FOLLOW_29_in_rule__FieldName__ReturnVariableEexpressionsAssignment_54492); 
             after(grammarAccess.getFieldNameAccess().getReturnVariableEexpressionsReturnVariableEexpressionsKeyword_5_0()); 

            }

             after(grammarAccess.getFieldNameAccess().getReturnVariableEexpressionsReturnVariableEexpressionsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldName__ReturnVariableEexpressionsAssignment_5"


    // $ANTLR start "rule__FieldName__UsedMethodsAssignment_6"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2146:1: rule__FieldName__UsedMethodsAssignment_6 : ( ( 'UsedMethods' ) ) ;
    public final void rule__FieldName__UsedMethodsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2150:1: ( ( ( 'UsedMethods' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2151:1: ( ( 'UsedMethods' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2151:1: ( ( 'UsedMethods' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2152:1: ( 'UsedMethods' )
            {
             before(grammarAccess.getFieldNameAccess().getUsedMethodsUsedMethodsKeyword_6_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2153:1: ( 'UsedMethods' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2154:1: 'UsedMethods'
            {
             before(grammarAccess.getFieldNameAccess().getUsedMethodsUsedMethodsKeyword_6_0()); 
            match(input,30,FOLLOW_30_in_rule__FieldName__UsedMethodsAssignment_64536); 
             after(grammarAccess.getFieldNameAccess().getUsedMethodsUsedMethodsKeyword_6_0()); 

            }

             after(grammarAccess.getFieldNameAccess().getUsedMethodsUsedMethodsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldName__UsedMethodsAssignment_6"


    // $ANTLR start "rule__FieldName__UsedMethodsInTryAssignment_7"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2169:1: rule__FieldName__UsedMethodsInTryAssignment_7 : ( ( 'UsedMethodsInTry' ) ) ;
    public final void rule__FieldName__UsedMethodsInTryAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2173:1: ( ( ( 'UsedMethodsInTry' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2174:1: ( ( 'UsedMethodsInTry' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2174:1: ( ( 'UsedMethodsInTry' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2175:1: ( 'UsedMethodsInTry' )
            {
             before(grammarAccess.getFieldNameAccess().getUsedMethodsInTryUsedMethodsInTryKeyword_7_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2176:1: ( 'UsedMethodsInTry' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2177:1: 'UsedMethodsInTry'
            {
             before(grammarAccess.getFieldNameAccess().getUsedMethodsInTryUsedMethodsInTryKeyword_7_0()); 
            match(input,31,FOLLOW_31_in_rule__FieldName__UsedMethodsInTryAssignment_74580); 
             after(grammarAccess.getFieldNameAccess().getUsedMethodsInTryUsedMethodsInTryKeyword_7_0()); 

            }

             after(grammarAccess.getFieldNameAccess().getUsedMethodsInTryUsedMethodsInTryKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldName__UsedMethodsInTryAssignment_7"


    // $ANTLR start "rule__FieldName__UsedMethodsInFinallyAssignment_8"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2192:1: rule__FieldName__UsedMethodsInFinallyAssignment_8 : ( ( 'UsedMethodsInFinally' ) ) ;
    public final void rule__FieldName__UsedMethodsInFinallyAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2196:1: ( ( ( 'UsedMethodsInFinally' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2197:1: ( ( 'UsedMethodsInFinally' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2197:1: ( ( 'UsedMethodsInFinally' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2198:1: ( 'UsedMethodsInFinally' )
            {
             before(grammarAccess.getFieldNameAccess().getUsedMethodsInFinallyUsedMethodsInFinallyKeyword_8_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2199:1: ( 'UsedMethodsInFinally' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2200:1: 'UsedMethodsInFinally'
            {
             before(grammarAccess.getFieldNameAccess().getUsedMethodsInFinallyUsedMethodsInFinallyKeyword_8_0()); 
            match(input,32,FOLLOW_32_in_rule__FieldName__UsedMethodsInFinallyAssignment_84624); 
             after(grammarAccess.getFieldNameAccess().getUsedMethodsInFinallyUsedMethodsInFinallyKeyword_8_0()); 

            }

             after(grammarAccess.getFieldNameAccess().getUsedMethodsInFinallyUsedMethodsInFinallyKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldName__UsedMethodsInFinallyAssignment_8"


    // $ANTLR start "rule__FieldName__OverriddenMethodsAssignment_9"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2215:1: rule__FieldName__OverriddenMethodsAssignment_9 : ( ( 'OverriddenMethods' ) ) ;
    public final void rule__FieldName__OverriddenMethodsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2219:1: ( ( ( 'OverriddenMethods' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2220:1: ( ( 'OverriddenMethods' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2220:1: ( ( 'OverriddenMethods' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2221:1: ( 'OverriddenMethods' )
            {
             before(grammarAccess.getFieldNameAccess().getOverriddenMethodsOverriddenMethodsKeyword_9_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2222:1: ( 'OverriddenMethods' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2223:1: 'OverriddenMethods'
            {
             before(grammarAccess.getFieldNameAccess().getOverriddenMethodsOverriddenMethodsKeyword_9_0()); 
            match(input,33,FOLLOW_33_in_rule__FieldName__OverriddenMethodsAssignment_94668); 
             after(grammarAccess.getFieldNameAccess().getOverriddenMethodsOverriddenMethodsKeyword_9_0()); 

            }

             after(grammarAccess.getFieldNameAccess().getOverriddenMethodsOverriddenMethodsKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldName__OverriddenMethodsAssignment_9"


    // $ANTLR start "rule__FieldName__ProjectNameAssignment_10"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2238:1: rule__FieldName__ProjectNameAssignment_10 : ( ( 'ProjectName' ) ) ;
    public final void rule__FieldName__ProjectNameAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2242:1: ( ( ( 'ProjectName' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2243:1: ( ( 'ProjectName' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2243:1: ( ( 'ProjectName' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2244:1: ( 'ProjectName' )
            {
             before(grammarAccess.getFieldNameAccess().getProjectNameProjectNameKeyword_10_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2245:1: ( 'ProjectName' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2246:1: 'ProjectName'
            {
             before(grammarAccess.getFieldNameAccess().getProjectNameProjectNameKeyword_10_0()); 
            match(input,34,FOLLOW_34_in_rule__FieldName__ProjectNameAssignment_104712); 
             after(grammarAccess.getFieldNameAccess().getProjectNameProjectNameKeyword_10_0()); 

            }

             after(grammarAccess.getFieldNameAccess().getProjectNameProjectNameKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldName__ProjectNameAssignment_10"


    // $ANTLR start "rule__FieldName__ResourcePathAssignment_11"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2261:1: rule__FieldName__ResourcePathAssignment_11 : ( ( 'ResourcePath' ) ) ;
    public final void rule__FieldName__ResourcePathAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2265:1: ( ( ( 'ResourcePath' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2266:1: ( ( 'ResourcePath' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2266:1: ( ( 'ResourcePath' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2267:1: ( 'ResourcePath' )
            {
             before(grammarAccess.getFieldNameAccess().getResourcePathResourcePathKeyword_11_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2268:1: ( 'ResourcePath' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2269:1: 'ResourcePath'
            {
             before(grammarAccess.getFieldNameAccess().getResourcePathResourcePathKeyword_11_0()); 
            match(input,35,FOLLOW_35_in_rule__FieldName__ResourcePathAssignment_114756); 
             after(grammarAccess.getFieldNameAccess().getResourcePathResourcePathKeyword_11_0()); 

            }

             after(grammarAccess.getFieldNameAccess().getResourcePathResourcePathKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldName__ResourcePathAssignment_11"


    // $ANTLR start "rule__FieldName__ModifiersAssignment_12"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2284:1: rule__FieldName__ModifiersAssignment_12 : ( ( 'Modifiers' ) ) ;
    public final void rule__FieldName__ModifiersAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2288:1: ( ( ( 'Modifiers' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2289:1: ( ( 'Modifiers' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2289:1: ( ( 'Modifiers' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2290:1: ( 'Modifiers' )
            {
             before(grammarAccess.getFieldNameAccess().getModifiersModifiersKeyword_12_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2291:1: ( 'Modifiers' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2292:1: 'Modifiers'
            {
             before(grammarAccess.getFieldNameAccess().getModifiersModifiersKeyword_12_0()); 
            match(input,36,FOLLOW_36_in_rule__FieldName__ModifiersAssignment_124800); 
             after(grammarAccess.getFieldNameAccess().getModifiersModifiersKeyword_12_0()); 

            }

             after(grammarAccess.getFieldNameAccess().getModifiersModifiersKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldName__ModifiersAssignment_12"


    // $ANTLR start "rule__FieldName__AllDeclaredMethodNamesAssignment_13"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2307:1: rule__FieldName__AllDeclaredMethodNamesAssignment_13 : ( ( 'AllDeclaredMethodNames' ) ) ;
    public final void rule__FieldName__AllDeclaredMethodNamesAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2311:1: ( ( ( 'AllDeclaredMethodNames' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2312:1: ( ( 'AllDeclaredMethodNames' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2312:1: ( ( 'AllDeclaredMethodNames' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2313:1: ( 'AllDeclaredMethodNames' )
            {
             before(grammarAccess.getFieldNameAccess().getAllDeclaredMethodNamesAllDeclaredMethodNamesKeyword_13_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2314:1: ( 'AllDeclaredMethodNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2315:1: 'AllDeclaredMethodNames'
            {
             before(grammarAccess.getFieldNameAccess().getAllDeclaredMethodNamesAllDeclaredMethodNamesKeyword_13_0()); 
            match(input,37,FOLLOW_37_in_rule__FieldName__AllDeclaredMethodNamesAssignment_134844); 
             after(grammarAccess.getFieldNameAccess().getAllDeclaredMethodNamesAllDeclaredMethodNamesKeyword_13_0()); 

            }

             after(grammarAccess.getFieldNameAccess().getAllDeclaredMethodNamesAllDeclaredMethodNamesKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldName__AllDeclaredMethodNamesAssignment_13"


    // $ANTLR start "rule__FieldName__DeclaredMethodNamesAssignment_14"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2330:1: rule__FieldName__DeclaredMethodNamesAssignment_14 : ( ( 'DeclaredMethodNames' ) ) ;
    public final void rule__FieldName__DeclaredMethodNamesAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2334:1: ( ( ( 'DeclaredMethodNames' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2335:1: ( ( 'DeclaredMethodNames' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2335:1: ( ( 'DeclaredMethodNames' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2336:1: ( 'DeclaredMethodNames' )
            {
             before(grammarAccess.getFieldNameAccess().getDeclaredMethodNamesDeclaredMethodNamesKeyword_14_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2337:1: ( 'DeclaredMethodNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2338:1: 'DeclaredMethodNames'
            {
             before(grammarAccess.getFieldNameAccess().getDeclaredMethodNamesDeclaredMethodNamesKeyword_14_0()); 
            match(input,38,FOLLOW_38_in_rule__FieldName__DeclaredMethodNamesAssignment_144888); 
             after(grammarAccess.getFieldNameAccess().getDeclaredMethodNamesDeclaredMethodNamesKeyword_14_0()); 

            }

             after(grammarAccess.getFieldNameAccess().getDeclaredMethodNamesDeclaredMethodNamesKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldName__DeclaredMethodNamesAssignment_14"


    // $ANTLR start "rule__FieldName__DeclaredFieldNamesAssignment_15"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2353:1: rule__FieldName__DeclaredFieldNamesAssignment_15 : ( ( 'DeclaredFieldNames' ) ) ;
    public final void rule__FieldName__DeclaredFieldNamesAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2357:1: ( ( ( 'DeclaredFieldNames' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2358:1: ( ( 'DeclaredFieldNames' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2358:1: ( ( 'DeclaredFieldNames' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2359:1: ( 'DeclaredFieldNames' )
            {
             before(grammarAccess.getFieldNameAccess().getDeclaredFieldNamesDeclaredFieldNamesKeyword_15_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2360:1: ( 'DeclaredFieldNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2361:1: 'DeclaredFieldNames'
            {
             before(grammarAccess.getFieldNameAccess().getDeclaredFieldNamesDeclaredFieldNamesKeyword_15_0()); 
            match(input,39,FOLLOW_39_in_rule__FieldName__DeclaredFieldNamesAssignment_154932); 
             after(grammarAccess.getFieldNameAccess().getDeclaredFieldNamesDeclaredFieldNamesKeyword_15_0()); 

            }

             after(grammarAccess.getFieldNameAccess().getDeclaredFieldNamesDeclaredFieldNamesKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldName__DeclaredFieldNamesAssignment_15"


    // $ANTLR start "rule__FieldName__DeclaredFieldTypesAssignment_16"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2376:1: rule__FieldName__DeclaredFieldTypesAssignment_16 : ( ( 'DeclaredFieldTypes' ) ) ;
    public final void rule__FieldName__DeclaredFieldTypesAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2380:1: ( ( ( 'DeclaredFieldTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2381:1: ( ( 'DeclaredFieldTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2381:1: ( ( 'DeclaredFieldTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2382:1: ( 'DeclaredFieldTypes' )
            {
             before(grammarAccess.getFieldNameAccess().getDeclaredFieldTypesDeclaredFieldTypesKeyword_16_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2383:1: ( 'DeclaredFieldTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2384:1: 'DeclaredFieldTypes'
            {
             before(grammarAccess.getFieldNameAccess().getDeclaredFieldTypesDeclaredFieldTypesKeyword_16_0()); 
            match(input,40,FOLLOW_40_in_rule__FieldName__DeclaredFieldTypesAssignment_164976); 
             after(grammarAccess.getFieldNameAccess().getDeclaredFieldTypesDeclaredFieldTypesKeyword_16_0()); 

            }

             after(grammarAccess.getFieldNameAccess().getDeclaredFieldTypesDeclaredFieldTypesKeyword_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldName__DeclaredFieldTypesAssignment_16"


    // $ANTLR start "rule__FieldName__AllDeclaredFieldNamesAssignment_17"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2399:1: rule__FieldName__AllDeclaredFieldNamesAssignment_17 : ( ( 'AllDeclaredFieldNames' ) ) ;
    public final void rule__FieldName__AllDeclaredFieldNamesAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2403:1: ( ( ( 'AllDeclaredFieldNames' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2404:1: ( ( 'AllDeclaredFieldNames' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2404:1: ( ( 'AllDeclaredFieldNames' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2405:1: ( 'AllDeclaredFieldNames' )
            {
             before(grammarAccess.getFieldNameAccess().getAllDeclaredFieldNamesAllDeclaredFieldNamesKeyword_17_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2406:1: ( 'AllDeclaredFieldNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2407:1: 'AllDeclaredFieldNames'
            {
             before(grammarAccess.getFieldNameAccess().getAllDeclaredFieldNamesAllDeclaredFieldNamesKeyword_17_0()); 
            match(input,41,FOLLOW_41_in_rule__FieldName__AllDeclaredFieldNamesAssignment_175020); 
             after(grammarAccess.getFieldNameAccess().getAllDeclaredFieldNamesAllDeclaredFieldNamesKeyword_17_0()); 

            }

             after(grammarAccess.getFieldNameAccess().getAllDeclaredFieldNamesAllDeclaredFieldNamesKeyword_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldName__AllDeclaredFieldNamesAssignment_17"


    // $ANTLR start "rule__FieldName__FullTextAssignment_18"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2422:1: rule__FieldName__FullTextAssignment_18 : ( ( 'FullText' ) ) ;
    public final void rule__FieldName__FullTextAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2426:1: ( ( ( 'FullText' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2427:1: ( ( 'FullText' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2427:1: ( ( 'FullText' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2428:1: ( 'FullText' )
            {
             before(grammarAccess.getFieldNameAccess().getFullTextFullTextKeyword_18_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2429:1: ( 'FullText' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2430:1: 'FullText'
            {
             before(grammarAccess.getFieldNameAccess().getFullTextFullTextKeyword_18_0()); 
            match(input,42,FOLLOW_42_in_rule__FieldName__FullTextAssignment_185064); 
             after(grammarAccess.getFieldNameAccess().getFullTextFullTextKeyword_18_0()); 

            }

             after(grammarAccess.getFieldNameAccess().getFullTextFullTextKeyword_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldName__FullTextAssignment_18"


    // $ANTLR start "rule__FieldName__FieldsReadAssignment_19"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2445:1: rule__FieldName__FieldsReadAssignment_19 : ( ( 'FieldsRead' ) ) ;
    public final void rule__FieldName__FieldsReadAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2449:1: ( ( ( 'FieldsRead' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2450:1: ( ( 'FieldsRead' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2450:1: ( ( 'FieldsRead' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2451:1: ( 'FieldsRead' )
            {
             before(grammarAccess.getFieldNameAccess().getFieldsReadFieldsReadKeyword_19_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2452:1: ( 'FieldsRead' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2453:1: 'FieldsRead'
            {
             before(grammarAccess.getFieldNameAccess().getFieldsReadFieldsReadKeyword_19_0()); 
            match(input,43,FOLLOW_43_in_rule__FieldName__FieldsReadAssignment_195108); 
             after(grammarAccess.getFieldNameAccess().getFieldsReadFieldsReadKeyword_19_0()); 

            }

             after(grammarAccess.getFieldNameAccess().getFieldsReadFieldsReadKeyword_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldName__FieldsReadAssignment_19"


    // $ANTLR start "rule__FieldName__FieldsWrittenAssignment_20"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2468:1: rule__FieldName__FieldsWrittenAssignment_20 : ( ( 'FieldsWritten' ) ) ;
    public final void rule__FieldName__FieldsWrittenAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2472:1: ( ( ( 'FieldsWritten' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2473:1: ( ( 'FieldsWritten' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2473:1: ( ( 'FieldsWritten' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2474:1: ( 'FieldsWritten' )
            {
             before(grammarAccess.getFieldNameAccess().getFieldsWrittenFieldsWrittenKeyword_20_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2475:1: ( 'FieldsWritten' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2476:1: 'FieldsWritten'
            {
             before(grammarAccess.getFieldNameAccess().getFieldsWrittenFieldsWrittenKeyword_20_0()); 
            match(input,44,FOLLOW_44_in_rule__FieldName__FieldsWrittenAssignment_205152); 
             after(grammarAccess.getFieldNameAccess().getFieldsWrittenFieldsWrittenKeyword_20_0()); 

            }

             after(grammarAccess.getFieldNameAccess().getFieldsWrittenFieldsWrittenKeyword_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldName__FieldsWrittenAssignment_20"


    // $ANTLR start "rule__FieldName__UsedFieldsInFinallyAssignment_21"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2491:1: rule__FieldName__UsedFieldsInFinallyAssignment_21 : ( ( 'UsedFieldsInFinally' ) ) ;
    public final void rule__FieldName__UsedFieldsInFinallyAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2495:1: ( ( ( 'UsedFieldsInFinally' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2496:1: ( ( 'UsedFieldsInFinally' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2496:1: ( ( 'UsedFieldsInFinally' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2497:1: ( 'UsedFieldsInFinally' )
            {
             before(grammarAccess.getFieldNameAccess().getUsedFieldsInFinallyUsedFieldsInFinallyKeyword_21_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2498:1: ( 'UsedFieldsInFinally' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2499:1: 'UsedFieldsInFinally'
            {
             before(grammarAccess.getFieldNameAccess().getUsedFieldsInFinallyUsedFieldsInFinallyKeyword_21_0()); 
            match(input,45,FOLLOW_45_in_rule__FieldName__UsedFieldsInFinallyAssignment_215196); 
             after(grammarAccess.getFieldNameAccess().getUsedFieldsInFinallyUsedFieldsInFinallyKeyword_21_0()); 

            }

             after(grammarAccess.getFieldNameAccess().getUsedFieldsInFinallyUsedFieldsInFinallyKeyword_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldName__UsedFieldsInFinallyAssignment_21"


    // $ANTLR start "rule__FieldName__UsedFieldsInTryAssignment_22"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2514:1: rule__FieldName__UsedFieldsInTryAssignment_22 : ( ( 'UsedFieldsInTry' ) ) ;
    public final void rule__FieldName__UsedFieldsInTryAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2518:1: ( ( ( 'UsedFieldsInTry' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2519:1: ( ( 'UsedFieldsInTry' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2519:1: ( ( 'UsedFieldsInTry' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2520:1: ( 'UsedFieldsInTry' )
            {
             before(grammarAccess.getFieldNameAccess().getUsedFieldsInTryUsedFieldsInTryKeyword_22_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2521:1: ( 'UsedFieldsInTry' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2522:1: 'UsedFieldsInTry'
            {
             before(grammarAccess.getFieldNameAccess().getUsedFieldsInTryUsedFieldsInTryKeyword_22_0()); 
            match(input,46,FOLLOW_46_in_rule__FieldName__UsedFieldsInTryAssignment_225240); 
             after(grammarAccess.getFieldNameAccess().getUsedFieldsInTryUsedFieldsInTryKeyword_22_0()); 

            }

             after(grammarAccess.getFieldNameAccess().getUsedFieldsInTryUsedFieldsInTryKeyword_22_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldName__UsedFieldsInTryAssignment_22"


    // $ANTLR start "rule__FieldName__AnnotationsAssignment_23"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2537:1: rule__FieldName__AnnotationsAssignment_23 : ( ( 'Annotations' ) ) ;
    public final void rule__FieldName__AnnotationsAssignment_23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2541:1: ( ( ( 'Annotations' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2542:1: ( ( 'Annotations' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2542:1: ( ( 'Annotations' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2543:1: ( 'Annotations' )
            {
             before(grammarAccess.getFieldNameAccess().getAnnotationsAnnotationsKeyword_23_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2544:1: ( 'Annotations' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2545:1: 'Annotations'
            {
             before(grammarAccess.getFieldNameAccess().getAnnotationsAnnotationsKeyword_23_0()); 
            match(input,47,FOLLOW_47_in_rule__FieldName__AnnotationsAssignment_235284); 
             after(grammarAccess.getFieldNameAccess().getAnnotationsAnnotationsKeyword_23_0()); 

            }

             after(grammarAccess.getFieldNameAccess().getAnnotationsAnnotationsKeyword_23_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldName__AnnotationsAssignment_23"


    // $ANTLR start "rule__FieldName__TimestampAssignment_24"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2560:1: rule__FieldName__TimestampAssignment_24 : ( ( 'Timestamp' ) ) ;
    public final void rule__FieldName__TimestampAssignment_24() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2564:1: ( ( ( 'Timestamp' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2565:1: ( ( 'Timestamp' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2565:1: ( ( 'Timestamp' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2566:1: ( 'Timestamp' )
            {
             before(grammarAccess.getFieldNameAccess().getTimestampTimestampKeyword_24_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2567:1: ( 'Timestamp' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2568:1: 'Timestamp'
            {
             before(grammarAccess.getFieldNameAccess().getTimestampTimestampKeyword_24_0()); 
            match(input,48,FOLLOW_48_in_rule__FieldName__TimestampAssignment_245328); 
             after(grammarAccess.getFieldNameAccess().getTimestampTimestampKeyword_24_0()); 

            }

             after(grammarAccess.getFieldNameAccess().getTimestampTimestampKeyword_24_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldName__TimestampAssignment_24"


    // $ANTLR start "rule__TypeFieldName__ImplementedTypesAssignment_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2583:1: rule__TypeFieldName__ImplementedTypesAssignment_0 : ( ( 'ImplementedTypes' ) ) ;
    public final void rule__TypeFieldName__ImplementedTypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2587:1: ( ( ( 'ImplementedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2588:1: ( ( 'ImplementedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2588:1: ( ( 'ImplementedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2589:1: ( 'ImplementedTypes' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getImplementedTypesImplementedTypesKeyword_0_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2590:1: ( 'ImplementedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2591:1: 'ImplementedTypes'
            {
             before(grammarAccess.getTypeFieldNameAccess().getImplementedTypesImplementedTypesKeyword_0_0()); 
            match(input,49,FOLLOW_49_in_rule__TypeFieldName__ImplementedTypesAssignment_05372); 
             after(grammarAccess.getTypeFieldNameAccess().getImplementedTypesImplementedTypesKeyword_0_0()); 

            }

             after(grammarAccess.getTypeFieldNameAccess().getImplementedTypesImplementedTypesKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeFieldName__ImplementedTypesAssignment_0"


    // $ANTLR start "rule__TypeFieldName__ExtendedTypesAssignment_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2606:1: rule__TypeFieldName__ExtendedTypesAssignment_1 : ( ( 'ExtendedTypes' ) ) ;
    public final void rule__TypeFieldName__ExtendedTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2610:1: ( ( ( 'ExtendedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2611:1: ( ( 'ExtendedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2611:1: ( ( 'ExtendedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2612:1: ( 'ExtendedTypes' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getExtendedTypesExtendedTypesKeyword_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2613:1: ( 'ExtendedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2614:1: 'ExtendedTypes'
            {
             before(grammarAccess.getTypeFieldNameAccess().getExtendedTypesExtendedTypesKeyword_1_0()); 
            match(input,50,FOLLOW_50_in_rule__TypeFieldName__ExtendedTypesAssignment_15416); 
             after(grammarAccess.getTypeFieldNameAccess().getExtendedTypesExtendedTypesKeyword_1_0()); 

            }

             after(grammarAccess.getTypeFieldNameAccess().getExtendedTypesExtendedTypesKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeFieldName__ExtendedTypesAssignment_1"


    // $ANTLR start "rule__TypeFieldName__UsedTypesAssignment_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2629:1: rule__TypeFieldName__UsedTypesAssignment_2 : ( ( 'UsedTypes' ) ) ;
    public final void rule__TypeFieldName__UsedTypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2633:1: ( ( ( 'UsedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2634:1: ( ( 'UsedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2634:1: ( ( 'UsedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2635:1: ( 'UsedTypes' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getUsedTypesUsedTypesKeyword_2_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2636:1: ( 'UsedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2637:1: 'UsedTypes'
            {
             before(grammarAccess.getTypeFieldNameAccess().getUsedTypesUsedTypesKeyword_2_0()); 
            match(input,51,FOLLOW_51_in_rule__TypeFieldName__UsedTypesAssignment_25460); 
             after(grammarAccess.getTypeFieldNameAccess().getUsedTypesUsedTypesKeyword_2_0()); 

            }

             after(grammarAccess.getTypeFieldNameAccess().getUsedTypesUsedTypesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeFieldName__UsedTypesAssignment_2"


    // $ANTLR start "rule__TypeFieldName__UsedTypesInTryAssignment_3"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2652:1: rule__TypeFieldName__UsedTypesInTryAssignment_3 : ( ( 'UsedTypesInTry' ) ) ;
    public final void rule__TypeFieldName__UsedTypesInTryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2656:1: ( ( ( 'UsedTypesInTry' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2657:1: ( ( 'UsedTypesInTry' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2657:1: ( ( 'UsedTypesInTry' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2658:1: ( 'UsedTypesInTry' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getUsedTypesInTryUsedTypesInTryKeyword_3_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2659:1: ( 'UsedTypesInTry' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2660:1: 'UsedTypesInTry'
            {
             before(grammarAccess.getTypeFieldNameAccess().getUsedTypesInTryUsedTypesInTryKeyword_3_0()); 
            match(input,52,FOLLOW_52_in_rule__TypeFieldName__UsedTypesInTryAssignment_35504); 
             after(grammarAccess.getTypeFieldNameAccess().getUsedTypesInTryUsedTypesInTryKeyword_3_0()); 

            }

             after(grammarAccess.getTypeFieldNameAccess().getUsedTypesInTryUsedTypesInTryKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeFieldName__UsedTypesInTryAssignment_3"


    // $ANTLR start "rule__TypeFieldName__UsedTypesInFinallyAssignment_4"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2675:1: rule__TypeFieldName__UsedTypesInFinallyAssignment_4 : ( ( 'UsedTypesInFinally' ) ) ;
    public final void rule__TypeFieldName__UsedTypesInFinallyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2679:1: ( ( ( 'UsedTypesInFinally' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2680:1: ( ( 'UsedTypesInFinally' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2680:1: ( ( 'UsedTypesInFinally' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2681:1: ( 'UsedTypesInFinally' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getUsedTypesInFinallyUsedTypesInFinallyKeyword_4_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2682:1: ( 'UsedTypesInFinally' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2683:1: 'UsedTypesInFinally'
            {
             before(grammarAccess.getTypeFieldNameAccess().getUsedTypesInFinallyUsedTypesInFinallyKeyword_4_0()); 
            match(input,53,FOLLOW_53_in_rule__TypeFieldName__UsedTypesInFinallyAssignment_45548); 
             after(grammarAccess.getTypeFieldNameAccess().getUsedTypesInFinallyUsedTypesInFinallyKeyword_4_0()); 

            }

             after(grammarAccess.getTypeFieldNameAccess().getUsedTypesInFinallyUsedTypesInFinallyKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeFieldName__UsedTypesInFinallyAssignment_4"


    // $ANTLR start "rule__TypeFieldName__ParameterTypesAssignment_5"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2698:1: rule__TypeFieldName__ParameterTypesAssignment_5 : ( ( 'ParameterTypes' ) ) ;
    public final void rule__TypeFieldName__ParameterTypesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2702:1: ( ( ( 'ParameterTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2703:1: ( ( 'ParameterTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2703:1: ( ( 'ParameterTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2704:1: ( 'ParameterTypes' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getParameterTypesParameterTypesKeyword_5_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2705:1: ( 'ParameterTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2706:1: 'ParameterTypes'
            {
             before(grammarAccess.getTypeFieldNameAccess().getParameterTypesParameterTypesKeyword_5_0()); 
            match(input,54,FOLLOW_54_in_rule__TypeFieldName__ParameterTypesAssignment_55592); 
             after(grammarAccess.getTypeFieldNameAccess().getParameterTypesParameterTypesKeyword_5_0()); 

            }

             after(grammarAccess.getTypeFieldNameAccess().getParameterTypesParameterTypesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeFieldName__ParameterTypesAssignment_5"


    // $ANTLR start "rule__TypeFieldName__ReturnTypeAssignment_6"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2721:1: rule__TypeFieldName__ReturnTypeAssignment_6 : ( ( 'ReturnType' ) ) ;
    public final void rule__TypeFieldName__ReturnTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2725:1: ( ( ( 'ReturnType' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2726:1: ( ( 'ReturnType' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2726:1: ( ( 'ReturnType' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2727:1: ( 'ReturnType' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getReturnTypeReturnTypeKeyword_6_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2728:1: ( 'ReturnType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2729:1: 'ReturnType'
            {
             before(grammarAccess.getTypeFieldNameAccess().getReturnTypeReturnTypeKeyword_6_0()); 
            match(input,55,FOLLOW_55_in_rule__TypeFieldName__ReturnTypeAssignment_65636); 
             after(grammarAccess.getTypeFieldNameAccess().getReturnTypeReturnTypeKeyword_6_0()); 

            }

             after(grammarAccess.getTypeFieldNameAccess().getReturnTypeReturnTypeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeFieldName__ReturnTypeAssignment_6"


    // $ANTLR start "rule__TypeFieldName__AllImplementedTypesAssignment_7"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2744:1: rule__TypeFieldName__AllImplementedTypesAssignment_7 : ( ( 'AllImplementedTypes' ) ) ;
    public final void rule__TypeFieldName__AllImplementedTypesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2748:1: ( ( ( 'AllImplementedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2749:1: ( ( 'AllImplementedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2749:1: ( ( 'AllImplementedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2750:1: ( 'AllImplementedTypes' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getAllImplementedTypesAllImplementedTypesKeyword_7_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2751:1: ( 'AllImplementedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2752:1: 'AllImplementedTypes'
            {
             before(grammarAccess.getTypeFieldNameAccess().getAllImplementedTypesAllImplementedTypesKeyword_7_0()); 
            match(input,56,FOLLOW_56_in_rule__TypeFieldName__AllImplementedTypesAssignment_75680); 
             after(grammarAccess.getTypeFieldNameAccess().getAllImplementedTypesAllImplementedTypesKeyword_7_0()); 

            }

             after(grammarAccess.getTypeFieldNameAccess().getAllImplementedTypesAllImplementedTypesKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeFieldName__AllImplementedTypesAssignment_7"


    // $ANTLR start "rule__TypeFieldName__AllExtendedTypesAssignment_8"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2767:1: rule__TypeFieldName__AllExtendedTypesAssignment_8 : ( ( 'AllExtendedTypes' ) ) ;
    public final void rule__TypeFieldName__AllExtendedTypesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2771:1: ( ( ( 'AllExtendedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2772:1: ( ( 'AllExtendedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2772:1: ( ( 'AllExtendedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2773:1: ( 'AllExtendedTypes' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getAllExtendedTypesAllExtendedTypesKeyword_8_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2774:1: ( 'AllExtendedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2775:1: 'AllExtendedTypes'
            {
             before(grammarAccess.getTypeFieldNameAccess().getAllExtendedTypesAllExtendedTypesKeyword_8_0()); 
            match(input,57,FOLLOW_57_in_rule__TypeFieldName__AllExtendedTypesAssignment_85724); 
             after(grammarAccess.getTypeFieldNameAccess().getAllExtendedTypesAllExtendedTypesKeyword_8_0()); 

            }

             after(grammarAccess.getTypeFieldNameAccess().getAllExtendedTypesAllExtendedTypesKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeFieldName__AllExtendedTypesAssignment_8"


    // $ANTLR start "rule__TypeFieldName__FieldTypeAssignment_9"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2790:1: rule__TypeFieldName__FieldTypeAssignment_9 : ( ( 'FieldType' ) ) ;
    public final void rule__TypeFieldName__FieldTypeAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2794:1: ( ( ( 'FieldType' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2795:1: ( ( 'FieldType' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2795:1: ( ( 'FieldType' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2796:1: ( 'FieldType' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getFieldTypeFieldTypeKeyword_9_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2797:1: ( 'FieldType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2798:1: 'FieldType'
            {
             before(grammarAccess.getTypeFieldNameAccess().getFieldTypeFieldTypeKeyword_9_0()); 
            match(input,58,FOLLOW_58_in_rule__TypeFieldName__FieldTypeAssignment_95768); 
             after(grammarAccess.getTypeFieldNameAccess().getFieldTypeFieldTypeKeyword_9_0()); 

            }

             after(grammarAccess.getTypeFieldNameAccess().getFieldTypeFieldTypeKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeFieldName__FieldTypeAssignment_9"


    // $ANTLR start "rule__TypeFieldName__DeclaringTypeAssignment_10"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2813:1: rule__TypeFieldName__DeclaringTypeAssignment_10 : ( ( 'DeclaringType' ) ) ;
    public final void rule__TypeFieldName__DeclaringTypeAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2817:1: ( ( ( 'DeclaringType' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2818:1: ( ( 'DeclaringType' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2818:1: ( ( 'DeclaringType' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2819:1: ( 'DeclaringType' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getDeclaringTypeDeclaringTypeKeyword_10_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2820:1: ( 'DeclaringType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2821:1: 'DeclaringType'
            {
             before(grammarAccess.getTypeFieldNameAccess().getDeclaringTypeDeclaringTypeKeyword_10_0()); 
            match(input,59,FOLLOW_59_in_rule__TypeFieldName__DeclaringTypeAssignment_105812); 
             after(grammarAccess.getTypeFieldNameAccess().getDeclaringTypeDeclaringTypeKeyword_10_0()); 

            }

             after(grammarAccess.getTypeFieldNameAccess().getDeclaringTypeDeclaringTypeKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeFieldName__DeclaringTypeAssignment_10"


    // $ANTLR start "rule__TypeFieldName__CaughtTypeAssignment_11"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2836:1: rule__TypeFieldName__CaughtTypeAssignment_11 : ( ( 'CaughtType' ) ) ;
    public final void rule__TypeFieldName__CaughtTypeAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2840:1: ( ( ( 'CaughtType' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2841:1: ( ( 'CaughtType' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2841:1: ( ( 'CaughtType' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2842:1: ( 'CaughtType' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getCaughtTypeCaughtTypeKeyword_11_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2843:1: ( 'CaughtType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2844:1: 'CaughtType'
            {
             before(grammarAccess.getTypeFieldNameAccess().getCaughtTypeCaughtTypeKeyword_11_0()); 
            match(input,60,FOLLOW_60_in_rule__TypeFieldName__CaughtTypeAssignment_115856); 
             after(grammarAccess.getTypeFieldNameAccess().getCaughtTypeCaughtTypeKeyword_11_0()); 

            }

             after(grammarAccess.getTypeFieldNameAccess().getCaughtTypeCaughtTypeKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeFieldName__CaughtTypeAssignment_11"


    // $ANTLR start "rule__TypeFieldName__InstanceofTypesAssignment_12"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2859:1: rule__TypeFieldName__InstanceofTypesAssignment_12 : ( ( 'InstanceofTypes' ) ) ;
    public final void rule__TypeFieldName__InstanceofTypesAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2863:1: ( ( ( 'InstanceofTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2864:1: ( ( 'InstanceofTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2864:1: ( ( 'InstanceofTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2865:1: ( 'InstanceofTypes' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getInstanceofTypesInstanceofTypesKeyword_12_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2866:1: ( 'InstanceofTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2867:1: 'InstanceofTypes'
            {
             before(grammarAccess.getTypeFieldNameAccess().getInstanceofTypesInstanceofTypesKeyword_12_0()); 
            match(input,61,FOLLOW_61_in_rule__TypeFieldName__InstanceofTypesAssignment_125900); 
             after(grammarAccess.getTypeFieldNameAccess().getInstanceofTypesInstanceofTypesKeyword_12_0()); 

            }

             after(grammarAccess.getTypeFieldNameAccess().getInstanceofTypesInstanceofTypesKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeFieldName__InstanceofTypesAssignment_12"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleExp1_in_entryRuleExp161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExp168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group__0_in_ruleExp194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp2_in_entryRuleExp2121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExp2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__Alternatives_in_ruleExp2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClauseExpression_in_entryRuleClauseExpression181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClauseExpression188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group__0_in_ruleClauseExpression214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleClause_in_entryRuleSimpleClause241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleClause248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClause__Group__0_in_ruleSimpleClause274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeClause_in_entryRuleTypeClause301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeClause308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeClause__Group__0_in_ruleTypeClause334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldValue_in_entryRuleFieldValue361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldValue368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleFieldValue394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeValue_in_entryRuleTypeValue420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeValue427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleTypeValue453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group__0_in_ruleValue512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSep_in_entryRuleSep608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSep615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sep__Alternatives_in_ruleSep641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcard_in_entryRuleWildcard668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWildcard675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wildcard__Alternatives_in_ruleWildcard701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldName_in_entryRuleFieldName728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldName735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__Alternatives_in_ruleFieldName761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFieldName_in_entryRuleTypeFieldName788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeFieldName795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__Alternatives_in_ruleTypeFieldName821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__Alternatives_in_ruleBooleanExp858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotExpression__Alternatives_in_ruleNotExpression894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleMustExpression931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__ValueAssignment_0_in_rule__Exp2__Alternatives968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__0_in_rule__Exp2__Alternatives986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__NAssignment_0_0_in_rule__ClauseExpression__Alternatives_01019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__MAssignment_0_1_in_rule__ClauseExpression__Alternatives_01037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ClauseAssignment_1_0_in_rule__ClauseExpression__Alternatives_11070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ClauseAssignment_1_1_in_rule__ClauseExpression__Alternatives_11088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Sep__Alternatives1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Sep__Alternatives1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Wildcard__Alternatives1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Wildcard__Alternatives1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__FullyQualifiedNameAssignment_0_in_rule__FieldName__Alternatives1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__TypeAssignment_1_in_rule__FieldName__Alternatives1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__FriendlyNameAssignment_2_in_rule__FieldName__Alternatives1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__DeclaredMethodsAssignment_3_in_rule__FieldName__Alternatives1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__ParameterCountAssignment_4_in_rule__FieldName__Alternatives1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__ReturnVariableEexpressionsAssignment_5_in_rule__FieldName__Alternatives1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__UsedMethodsAssignment_6_in_rule__FieldName__Alternatives1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__UsedMethodsInTryAssignment_7_in_rule__FieldName__Alternatives1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__UsedMethodsInFinallyAssignment_8_in_rule__FieldName__Alternatives1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__OverriddenMethodsAssignment_9_in_rule__FieldName__Alternatives1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__ProjectNameAssignment_10_in_rule__FieldName__Alternatives1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__ResourcePathAssignment_11_in_rule__FieldName__Alternatives1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__ModifiersAssignment_12_in_rule__FieldName__Alternatives1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__AllDeclaredMethodNamesAssignment_13_in_rule__FieldName__Alternatives1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__DeclaredMethodNamesAssignment_14_in_rule__FieldName__Alternatives1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__DeclaredFieldNamesAssignment_15_in_rule__FieldName__Alternatives1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__DeclaredFieldTypesAssignment_16_in_rule__FieldName__Alternatives1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__AllDeclaredFieldNamesAssignment_17_in_rule__FieldName__Alternatives1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__FullTextAssignment_18_in_rule__FieldName__Alternatives1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__FieldsReadAssignment_19_in_rule__FieldName__Alternatives1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__FieldsWrittenAssignment_20_in_rule__FieldName__Alternatives1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__UsedFieldsInFinallyAssignment_21_in_rule__FieldName__Alternatives1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__UsedFieldsInTryAssignment_22_in_rule__FieldName__Alternatives1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__AnnotationsAssignment_23_in_rule__FieldName__Alternatives1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__TimestampAssignment_24_in_rule__FieldName__Alternatives1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__ImplementedTypesAssignment_0_in_rule__TypeFieldName__Alternatives1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__ExtendedTypesAssignment_1_in_rule__TypeFieldName__Alternatives1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__UsedTypesAssignment_2_in_rule__TypeFieldName__Alternatives1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__UsedTypesInTryAssignment_3_in_rule__TypeFieldName__Alternatives1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__UsedTypesInFinallyAssignment_4_in_rule__TypeFieldName__Alternatives1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__ParameterTypesAssignment_5_in_rule__TypeFieldName__Alternatives1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__ReturnTypeAssignment_6_in_rule__TypeFieldName__Alternatives1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__AllImplementedTypesAssignment_7_in_rule__TypeFieldName__Alternatives1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__AllExtendedTypesAssignment_8_in_rule__TypeFieldName__Alternatives1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__FieldTypeAssignment_9_in_rule__TypeFieldName__Alternatives1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__DeclaringTypeAssignment_10_in_rule__TypeFieldName__Alternatives1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__CaughtTypeAssignment_11_in_rule__TypeFieldName__Alternatives1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__InstanceofTypesAssignment_12_in_rule__TypeFieldName__Alternatives1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BooleanExp__Alternatives1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BooleanExp__Alternatives1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__NotExpression__Alternatives2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__NotExpression__Alternatives2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__NotExpression__Alternatives2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group__0__Impl_in_rule__Exp1__Group__02078 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Exp1__Group__1_in_rule__Exp1__Group__02081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp2_in_rule__Exp1__Group__0__Impl2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group__1__Impl_in_rule__Exp1__Group__12137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__0_in_rule__Exp1__Group__1__Impl2164 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__0__Impl_in_rule__Exp1__Group_1__02199 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__1_in_rule__Exp1__Group_1__02202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__1__Impl_in_rule__Exp1__Group_1__12260 = new BitSet(new long[]{0x3FFFFFFFFF3C0800L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__2_in_rule__Exp1__Group_1__12263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__BAssignment_1_1_in_rule__Exp1__Group_1__1__Impl2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__2__Impl_in_rule__Exp1__Group_1__22320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__RightAssignment_1_2_in_rule__Exp1__Group_1__2__Impl2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__0__Impl_in_rule__Exp2__Group_1__02383 = new BitSet(new long[]{0x3FFFFFFFFF3C0800L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__1_in_rule__Exp2__Group_1__02386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Exp2__Group_1__0__Impl2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__1__Impl_in_rule__Exp2__Group_1__12445 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__2_in_rule__Exp2__Group_1__12448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp1_in_rule__Exp2__Group_1__1__Impl2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__2__Impl_in_rule__Exp2__Group_1__22504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Exp2__Group_1__2__Impl2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group__0__Impl_in_rule__ClauseExpression__Group__02569 = new BitSet(new long[]{0x3FFFFFFFFF1C0800L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group__1_in_rule__ClauseExpression__Group__02572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Alternatives_0_in_rule__ClauseExpression__Group__0__Impl2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group__1__Impl_in_rule__ClauseExpression__Group__12630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Alternatives_1_in_rule__ClauseExpression__Group__1__Impl2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClause__Group__0__Impl_in_rule__SimpleClause__Group__02691 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__SimpleClause__Group__1_in_rule__SimpleClause__Group__02694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClause__FieldAssignment_0_in_rule__SimpleClause__Group__0__Impl2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClause__Group__1__Impl_in_rule__SimpleClause__Group__12751 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__SimpleClause__Group__2_in_rule__SimpleClause__Group__12754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SimpleClause__Group__1__Impl2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClause__Group__2__Impl_in_rule__SimpleClause__Group__22813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClause__ValueAssignment_2_in_rule__SimpleClause__Group__2__Impl2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeClause__Group__0__Impl_in_rule__TypeClause__Group__02876 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__TypeClause__Group__1_in_rule__TypeClause__Group__02879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeClause__FieldAssignment_0_in_rule__TypeClause__Group__0__Impl2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeClause__Group__1__Impl_in_rule__TypeClause__Group__12936 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__TypeClause__Group__2_in_rule__TypeClause__Group__12939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TypeClause__Group__1__Impl2967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeClause__Group__2__Impl_in_rule__TypeClause__Group__22998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeClause__ValueAssignment_2_in_rule__TypeClause__Group__2__Impl3025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group__0__Impl_in_rule__Value__Group__03061 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__Value__Group__1_in_rule__Value__Group__03064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcard_in_rule__Value__Group__0__Impl3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group__1__Impl_in_rule__Value__Group__13123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_1__0_in_rule__Value__Group__1__Impl3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_1__0__Impl_in_rule__Value__Group_1__03185 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Value__Group_1__1_in_rule__Value__Group_1__03188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Value__Group_1__0__Impl3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_1__1__Impl_in_rule__Value__Group_1__13244 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Value__Group_1__2_in_rule__Value__Group_1__13247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_1_1__0_in_rule__Value__Group_1__1__Impl3274 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__Value__Group_1__2__Impl_in_rule__Value__Group_1__23305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcard_in_rule__Value__Group_1__2__Impl3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_1_1__0__Impl_in_rule__Value__Group_1_1__03370 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Value__Group_1_1__1_in_rule__Value__Group_1_1__03373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcard_in_rule__Value__Group_1_1__0__Impl3400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_1_1__1__Impl_in_rule__Value__Group_1_1__13429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Value__Group_1_1__1__Impl3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__03489 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__03492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__QualifiedNameWithWildcard__Group__0__Impl3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__13548 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__2_in_rule__QualifiedNameWithWildcard__Group__13551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0_in_rule__QualifiedNameWithWildcard__Group__1__Impl3578 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__2__Impl_in_rule__QualifiedNameWithWildcard__Group__23609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcard_in_rule__QualifiedNameWithWildcard__Group__2__Impl3637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0__Impl_in_rule__QualifiedNameWithWildcard__Group_1__03674 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1_in_rule__QualifiedNameWithWildcard__Group_1__03677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcard_in_rule__QualifiedNameWithWildcard__Group_1__0__Impl3705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1__Impl_in_rule__QualifiedNameWithWildcard__Group_1__13736 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__2_in_rule__QualifiedNameWithWildcard__Group_1__13739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSep_in_rule__QualifiedNameWithWildcard__Group_1__1__Impl3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__2__Impl_in_rule__QualifiedNameWithWildcard__Group_1__23795 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__3_in_rule__QualifiedNameWithWildcard__Group_1__23798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcard_in_rule__QualifiedNameWithWildcard__Group_1__2__Impl3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__3__Impl_in_rule__QualifiedNameWithWildcard__Group_1__33857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__QualifiedNameWithWildcard__Group_1__3__Impl3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExp_in_rule__Exp1__BAssignment_1_13926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp2_in_rule__Exp1__RightAssignment_1_23957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClauseExpression_in_rule__Exp2__ValueAssignment_03988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_rule__ClauseExpression__NAssignment_0_04019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMustExpression_in_rule__ClauseExpression__MAssignment_0_14050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleClause_in_rule__ClauseExpression__ClauseAssignment_1_04081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeClause_in_rule__ClauseExpression__ClauseAssignment_1_14112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldName_in_rule__SimpleClause__FieldAssignment_04143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldValue_in_rule__SimpleClause__ValueAssignment_24174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFieldName_in_rule__TypeClause__FieldAssignment_04205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeValue_in_rule__TypeClause__ValueAssignment_24236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__FieldName__FullyQualifiedNameAssignment_04272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FieldName__TypeAssignment_14316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__FieldName__FriendlyNameAssignment_24360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__FieldName__DeclaredMethodsAssignment_34404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__FieldName__ParameterCountAssignment_44448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FieldName__ReturnVariableEexpressionsAssignment_54492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__FieldName__UsedMethodsAssignment_64536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FieldName__UsedMethodsInTryAssignment_74580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__FieldName__UsedMethodsInFinallyAssignment_84624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FieldName__OverriddenMethodsAssignment_94668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FieldName__ProjectNameAssignment_104712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FieldName__ResourcePathAssignment_114756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FieldName__ModifiersAssignment_124800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__FieldName__AllDeclaredMethodNamesAssignment_134844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__FieldName__DeclaredMethodNamesAssignment_144888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__FieldName__DeclaredFieldNamesAssignment_154932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__FieldName__DeclaredFieldTypesAssignment_164976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__FieldName__AllDeclaredFieldNamesAssignment_175020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__FieldName__FullTextAssignment_185064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__FieldName__FieldsReadAssignment_195108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__FieldName__FieldsWrittenAssignment_205152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__FieldName__UsedFieldsInFinallyAssignment_215196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__FieldName__UsedFieldsInTryAssignment_225240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__FieldName__AnnotationsAssignment_235284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__FieldName__TimestampAssignment_245328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__TypeFieldName__ImplementedTypesAssignment_05372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__TypeFieldName__ExtendedTypesAssignment_15416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__TypeFieldName__UsedTypesAssignment_25460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__TypeFieldName__UsedTypesInTryAssignment_35504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__TypeFieldName__UsedTypesInFinallyAssignment_45548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__TypeFieldName__ParameterTypesAssignment_55592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__TypeFieldName__ReturnTypeAssignment_65636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__TypeFieldName__AllImplementedTypesAssignment_75680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__TypeFieldName__AllExtendedTypesAssignment_85724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__TypeFieldName__FieldTypeAssignment_95768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__TypeFieldName__DeclaringTypeAssignment_105812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__TypeFieldName__CaughtTypeAssignment_115856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__TypeFieldName__InstanceofTypesAssignment_125900 = new BitSet(new long[]{0x0000000000000002L});

}