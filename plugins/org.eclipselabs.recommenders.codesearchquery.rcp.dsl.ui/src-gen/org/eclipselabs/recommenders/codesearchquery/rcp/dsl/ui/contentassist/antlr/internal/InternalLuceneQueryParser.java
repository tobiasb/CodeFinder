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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ANY_OTHER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'+'", "'-'", "'AND'", "'and'", "'OR'", "'or'", "'not'", "'NOT'", "'!'", "'('", "')'", "':'", "'FullyQualifiedName'", "'Type'", "'FriendlyName'", "'DeclaredMethods'", "'ParameterCount'", "'ReturnVariableEexpressions'", "'UsedMethods'", "'UsedMethodsInTry'", "'UsedMethodsInFinally'", "'OverriddenMethods'", "'ProjectName'", "'ResourcePath'", "'Modifiers'", "'AllDeclaredMethodNames'", "'DeclaredMethodNames'", "'DeclaredFieldNames'", "'DeclaredFieldTypes'", "'AllDeclaredFieldNames'", "'FullText'", "'FieldsRead'", "'FieldsWritten'", "'UsedFieldsInFinally'", "'UsedFieldsInTry'", "'Annotations'", "'Timestamp'", "'ImplementedTypes'", "'ExtendedTypes'", "'UsedTypes'", "'UsedTypesInTry'", "'UsedTypesInFinally'", "'ParameterTypes'", "'ReturnType'", "'AllImplementedTypes'", "'AllExtendedTypes'", "'FieldType'", "'DeclaringType'", "'CaughtType'", "'InstanceofTypes'"
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
    public static final int RULE_ANY_OTHER=6;
    public static final int T__21=21;
    public static final int T__20=20;
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
    public static final int RULE_INT=7;
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
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:125:1: ruleClauseExpression : ( ( rule__ClauseExpression__Alternatives ) ) ;
    public final void ruleClauseExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:129:2: ( ( ( rule__ClauseExpression__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:130:1: ( ( rule__ClauseExpression__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:130:1: ( ( rule__ClauseExpression__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:131:1: ( rule__ClauseExpression__Alternatives )
            {
             before(grammarAccess.getClauseExpressionAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:132:1: ( rule__ClauseExpression__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:132:2: rule__ClauseExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Alternatives_in_ruleClauseExpression214);
            rule__ClauseExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getAlternatives()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:209:1: ruleFieldValue : ( ( rule__FieldValue__Alternatives ) ) ;
    public final void ruleFieldValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:213:2: ( ( ( rule__FieldValue__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:214:1: ( ( rule__FieldValue__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:214:1: ( ( rule__FieldValue__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:215:1: ( rule__FieldValue__Alternatives )
            {
             before(grammarAccess.getFieldValueAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:216:1: ( rule__FieldValue__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:216:2: rule__FieldValue__Alternatives
            {
            pushFollow(FOLLOW_rule__FieldValue__Alternatives_in_ruleFieldValue394);
            rule__FieldValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFieldValueAccess().getAlternatives()); 

            }


            }

        }
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
            pushFollow(FOLLOW_ruleTypeValue_in_entryRuleTypeValue421);
            ruleTypeValue();

            state._fsp--;

             after(grammarAccess.getTypeValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeValue428); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:237:1: ruleTypeValue : ( ( rule__TypeValue__Alternatives ) ) ;
    public final void ruleTypeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:241:2: ( ( ( rule__TypeValue__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:242:1: ( ( rule__TypeValue__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:242:1: ( ( rule__TypeValue__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:243:1: ( rule__TypeValue__Alternatives )
            {
             before(grammarAccess.getTypeValueAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:244:1: ( rule__TypeValue__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:244:2: rule__TypeValue__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeValue__Alternatives_in_ruleTypeValue454);
            rule__TypeValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeValueAccess().getAlternatives()); 

            }


            }

        }
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
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue481);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue488); 

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
            pushFollow(FOLLOW_rule__Value__Group__0_in_ruleValue514);
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


    // $ANTLR start "entryRuleFieldName"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:284:1: entryRuleFieldName : ruleFieldName EOF ;
    public final void entryRuleFieldName() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:285:1: ( ruleFieldName EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:286:1: ruleFieldName EOF
            {
             before(grammarAccess.getFieldNameRule()); 
            pushFollow(FOLLOW_ruleFieldName_in_entryRuleFieldName541);
            ruleFieldName();

            state._fsp--;

             after(grammarAccess.getFieldNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldName548); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:293:1: ruleFieldName : ( ( rule__FieldName__Alternatives ) ) ;
    public final void ruleFieldName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:297:2: ( ( ( rule__FieldName__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:298:1: ( ( rule__FieldName__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:298:1: ( ( rule__FieldName__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:299:1: ( rule__FieldName__Alternatives )
            {
             before(grammarAccess.getFieldNameAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:300:1: ( rule__FieldName__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:300:2: rule__FieldName__Alternatives
            {
            pushFollow(FOLLOW_rule__FieldName__Alternatives_in_ruleFieldName574);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:312:1: entryRuleTypeFieldName : ruleTypeFieldName EOF ;
    public final void entryRuleTypeFieldName() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:313:1: ( ruleTypeFieldName EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:314:1: ruleTypeFieldName EOF
            {
             before(grammarAccess.getTypeFieldNameRule()); 
            pushFollow(FOLLOW_ruleTypeFieldName_in_entryRuleTypeFieldName601);
            ruleTypeFieldName();

            state._fsp--;

             after(grammarAccess.getTypeFieldNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeFieldName608); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:321:1: ruleTypeFieldName : ( ( rule__TypeFieldName__Alternatives ) ) ;
    public final void ruleTypeFieldName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:325:2: ( ( ( rule__TypeFieldName__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:326:1: ( ( rule__TypeFieldName__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:326:1: ( ( rule__TypeFieldName__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:327:1: ( rule__TypeFieldName__Alternatives )
            {
             before(grammarAccess.getTypeFieldNameAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:328:1: ( rule__TypeFieldName__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:328:2: rule__TypeFieldName__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeFieldName__Alternatives_in_ruleTypeFieldName634);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:341:1: ruleBooleanExp : ( ( rule__BooleanExp__Alternatives ) ) ;
    public final void ruleBooleanExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:345:1: ( ( ( rule__BooleanExp__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:346:1: ( ( rule__BooleanExp__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:346:1: ( ( rule__BooleanExp__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:347:1: ( rule__BooleanExp__Alternatives )
            {
             before(grammarAccess.getBooleanExpAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:348:1: ( rule__BooleanExp__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:348:2: rule__BooleanExp__Alternatives
            {
            pushFollow(FOLLOW_rule__BooleanExp__Alternatives_in_ruleBooleanExp671);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:360:1: ruleNotExpression : ( ( rule__NotExpression__Alternatives ) ) ;
    public final void ruleNotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:364:1: ( ( ( rule__NotExpression__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:365:1: ( ( rule__NotExpression__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:365:1: ( ( rule__NotExpression__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:366:1: ( rule__NotExpression__Alternatives )
            {
             before(grammarAccess.getNotExpressionAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:367:1: ( rule__NotExpression__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:367:2: rule__NotExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__NotExpression__Alternatives_in_ruleNotExpression707);
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


    // $ANTLR start "rule__Exp2__Alternatives"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:378:1: rule__Exp2__Alternatives : ( ( ( rule__Exp2__ValueAssignment_0 ) ) | ( ( rule__Exp2__Group_1__0 ) ) );
    public final void rule__Exp2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:382:1: ( ( ( rule__Exp2__ValueAssignment_0 ) ) | ( ( rule__Exp2__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=17 && LA1_0<=19)||(LA1_0>=23 && LA1_0<=60)) ) {
                alt1=1;
            }
            else if ( (LA1_0==20) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:383:1: ( ( rule__Exp2__ValueAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:383:1: ( ( rule__Exp2__ValueAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:384:1: ( rule__Exp2__ValueAssignment_0 )
                    {
                     before(grammarAccess.getExp2Access().getValueAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:385:1: ( rule__Exp2__ValueAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:385:2: rule__Exp2__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Exp2__ValueAssignment_0_in_rule__Exp2__Alternatives742);
                    rule__Exp2__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExp2Access().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:389:6: ( ( rule__Exp2__Group_1__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:389:6: ( ( rule__Exp2__Group_1__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:390:1: ( rule__Exp2__Group_1__0 )
                    {
                     before(grammarAccess.getExp2Access().getGroup_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:391:1: ( rule__Exp2__Group_1__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:391:2: rule__Exp2__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Exp2__Group_1__0_in_rule__Exp2__Alternatives760);
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


    // $ANTLR start "rule__ClauseExpression__Alternatives"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:400:1: rule__ClauseExpression__Alternatives : ( ( ( rule__ClauseExpression__ClauseAssignment_0 ) ) | ( ( rule__ClauseExpression__ClauseAssignment_1 ) ) );
    public final void rule__ClauseExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:404:1: ( ( ( rule__ClauseExpression__ClauseAssignment_0 ) ) | ( ( rule__ClauseExpression__ClauseAssignment_1 ) ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case 17:
                {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=48 && LA2_1<=60)) ) {
                    alt2=2;
                }
                else if ( ((LA2_1>=23 && LA2_1<=47)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                int LA2_2 = input.LA(2);

                if ( ((LA2_2>=23 && LA2_2<=47)) ) {
                    alt2=1;
                }
                else if ( ((LA2_2>=48 && LA2_2<=60)) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                int LA2_3 = input.LA(2);

                if ( ((LA2_3>=48 && LA2_3<=60)) ) {
                    alt2=2;
                }
                else if ( ((LA2_3>=23 && LA2_3<=47)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
                {
                alt2=1;
                }
                break;
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
                {
                alt2=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:405:1: ( ( rule__ClauseExpression__ClauseAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:405:1: ( ( rule__ClauseExpression__ClauseAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:406:1: ( rule__ClauseExpression__ClauseAssignment_0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getClauseAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:407:1: ( rule__ClauseExpression__ClauseAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:407:2: rule__ClauseExpression__ClauseAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__ClauseAssignment_0_in_rule__ClauseExpression__Alternatives793);
                    rule__ClauseExpression__ClauseAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getClauseAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:411:6: ( ( rule__ClauseExpression__ClauseAssignment_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:411:6: ( ( rule__ClauseExpression__ClauseAssignment_1 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:412:1: ( rule__ClauseExpression__ClauseAssignment_1 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getClauseAssignment_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:413:1: ( rule__ClauseExpression__ClauseAssignment_1 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:413:2: rule__ClauseExpression__ClauseAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__ClauseAssignment_1_in_rule__ClauseExpression__Alternatives811);
                    rule__ClauseExpression__ClauseAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getClauseAssignment_1()); 

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
    // $ANTLR end "rule__ClauseExpression__Alternatives"


    // $ANTLR start "rule__FieldValue__Alternatives"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:422:1: rule__FieldValue__Alternatives : ( ( ruleValue ) | ( ( rule__FieldValue__Group_1__0 ) ) );
    public final void rule__FieldValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:426:1: ( ( ruleValue ) | ( ( rule__FieldValue__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_ANY_OTHER)||(LA3_0>=11 && LA3_0<=12)) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:427:1: ( ruleValue )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:427:1: ( ruleValue )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:428:1: ruleValue
                    {
                     before(grammarAccess.getFieldValueAccess().getValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleValue_in_rule__FieldValue__Alternatives844);
                    ruleValue();

                    state._fsp--;

                     after(grammarAccess.getFieldValueAccess().getValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:433:6: ( ( rule__FieldValue__Group_1__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:433:6: ( ( rule__FieldValue__Group_1__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:434:1: ( rule__FieldValue__Group_1__0 )
                    {
                     before(grammarAccess.getFieldValueAccess().getGroup_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:435:1: ( rule__FieldValue__Group_1__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:435:2: rule__FieldValue__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__FieldValue__Group_1__0_in_rule__FieldValue__Alternatives861);
                    rule__FieldValue__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldValueAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FieldValue__Alternatives"


    // $ANTLR start "rule__TypeValue__Alternatives"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:444:1: rule__TypeValue__Alternatives : ( ( ruleValue ) | ( ( rule__TypeValue__Group_1__0 ) ) );
    public final void rule__TypeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:448:1: ( ( ruleValue ) | ( ( rule__TypeValue__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_ANY_OTHER)||(LA4_0>=11 && LA4_0<=12)) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:449:1: ( ruleValue )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:449:1: ( ruleValue )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:450:1: ruleValue
                    {
                     before(grammarAccess.getTypeValueAccess().getValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleValue_in_rule__TypeValue__Alternatives894);
                    ruleValue();

                    state._fsp--;

                     after(grammarAccess.getTypeValueAccess().getValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:455:6: ( ( rule__TypeValue__Group_1__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:455:6: ( ( rule__TypeValue__Group_1__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:456:1: ( rule__TypeValue__Group_1__0 )
                    {
                     before(grammarAccess.getTypeValueAccess().getGroup_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:457:1: ( rule__TypeValue__Group_1__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:457:2: rule__TypeValue__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeValue__Group_1__0_in_rule__TypeValue__Alternatives911);
                    rule__TypeValue__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeValueAccess().getGroup_1()); 

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
    // $ANTLR end "rule__TypeValue__Alternatives"


    // $ANTLR start "rule__Value__Alternatives_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:466:1: rule__Value__Alternatives_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Value__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:470:1: ( ( '+' ) | ( '-' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:471:1: ( '+' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:471:1: ( '+' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:472:1: '+'
                    {
                     before(grammarAccess.getValueAccess().getPlusSignKeyword_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Value__Alternatives_0945); 
                     after(grammarAccess.getValueAccess().getPlusSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:479:6: ( '-' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:479:6: ( '-' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:480:1: '-'
                    {
                     before(grammarAccess.getValueAccess().getHyphenMinusKeyword_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Value__Alternatives_0965); 
                     after(grammarAccess.getValueAccess().getHyphenMinusKeyword_0_1()); 

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
    // $ANTLR end "rule__Value__Alternatives_0"


    // $ANTLR start "rule__Value__Alternatives_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:492:1: rule__Value__Alternatives_1 : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) );
    public final void rule__Value__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:496:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case RULE_STRING:
                {
                alt6=2;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:497:1: ( RULE_ID )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:497:1: ( RULE_ID )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:498:1: RULE_ID
                    {
                     before(grammarAccess.getValueAccess().getIDTerminalRuleCall_1_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Value__Alternatives_1999); 
                     after(grammarAccess.getValueAccess().getIDTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:503:6: ( RULE_STRING )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:503:6: ( RULE_STRING )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:504:1: RULE_STRING
                    {
                     before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Value__Alternatives_11016); 
                     after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:509:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:509:6: ( RULE_ANY_OTHER )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:510:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getValueAccess().getANY_OTHERTerminalRuleCall_1_2()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__Value__Alternatives_11033); 
                     after(grammarAccess.getValueAccess().getANY_OTHERTerminalRuleCall_1_2()); 

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
    // $ANTLR end "rule__Value__Alternatives_1"


    // $ANTLR start "rule__FieldName__Alternatives"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:520:1: rule__FieldName__Alternatives : ( ( ( rule__FieldName__FullyQualifiedNameAssignment_0 ) ) | ( ( rule__FieldName__TypeAssignment_1 ) ) | ( ( rule__FieldName__FriendlyNameAssignment_2 ) ) | ( ( rule__FieldName__DeclaredMethodsAssignment_3 ) ) | ( ( rule__FieldName__ParameterCountAssignment_4 ) ) | ( ( rule__FieldName__ReturnVariableEexpressionsAssignment_5 ) ) | ( ( rule__FieldName__UsedMethodsAssignment_6 ) ) | ( ( rule__FieldName__UsedMethodsInTryAssignment_7 ) ) | ( ( rule__FieldName__UsedMethodsInFinallyAssignment_8 ) ) | ( ( rule__FieldName__OverriddenMethodsAssignment_9 ) ) | ( ( rule__FieldName__ProjectNameAssignment_10 ) ) | ( ( rule__FieldName__ResourcePathAssignment_11 ) ) | ( ( rule__FieldName__ModifiersAssignment_12 ) ) | ( ( rule__FieldName__AllDeclaredMethodNamesAssignment_13 ) ) | ( ( rule__FieldName__DeclaredMethodNamesAssignment_14 ) ) | ( ( rule__FieldName__DeclaredFieldNamesAssignment_15 ) ) | ( ( rule__FieldName__DeclaredFieldTypesAssignment_16 ) ) | ( ( rule__FieldName__AllDeclaredFieldNamesAssignment_17 ) ) | ( ( rule__FieldName__FullTextAssignment_18 ) ) | ( ( rule__FieldName__FieldsReadAssignment_19 ) ) | ( ( rule__FieldName__FieldsWrittenAssignment_20 ) ) | ( ( rule__FieldName__UsedFieldsInFinallyAssignment_21 ) ) | ( ( rule__FieldName__UsedFieldsInTryAssignment_22 ) ) | ( ( rule__FieldName__AnnotationsAssignment_23 ) ) | ( ( rule__FieldName__TimestampAssignment_24 ) ) );
    public final void rule__FieldName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:524:1: ( ( ( rule__FieldName__FullyQualifiedNameAssignment_0 ) ) | ( ( rule__FieldName__TypeAssignment_1 ) ) | ( ( rule__FieldName__FriendlyNameAssignment_2 ) ) | ( ( rule__FieldName__DeclaredMethodsAssignment_3 ) ) | ( ( rule__FieldName__ParameterCountAssignment_4 ) ) | ( ( rule__FieldName__ReturnVariableEexpressionsAssignment_5 ) ) | ( ( rule__FieldName__UsedMethodsAssignment_6 ) ) | ( ( rule__FieldName__UsedMethodsInTryAssignment_7 ) ) | ( ( rule__FieldName__UsedMethodsInFinallyAssignment_8 ) ) | ( ( rule__FieldName__OverriddenMethodsAssignment_9 ) ) | ( ( rule__FieldName__ProjectNameAssignment_10 ) ) | ( ( rule__FieldName__ResourcePathAssignment_11 ) ) | ( ( rule__FieldName__ModifiersAssignment_12 ) ) | ( ( rule__FieldName__AllDeclaredMethodNamesAssignment_13 ) ) | ( ( rule__FieldName__DeclaredMethodNamesAssignment_14 ) ) | ( ( rule__FieldName__DeclaredFieldNamesAssignment_15 ) ) | ( ( rule__FieldName__DeclaredFieldTypesAssignment_16 ) ) | ( ( rule__FieldName__AllDeclaredFieldNamesAssignment_17 ) ) | ( ( rule__FieldName__FullTextAssignment_18 ) ) | ( ( rule__FieldName__FieldsReadAssignment_19 ) ) | ( ( rule__FieldName__FieldsWrittenAssignment_20 ) ) | ( ( rule__FieldName__UsedFieldsInFinallyAssignment_21 ) ) | ( ( rule__FieldName__UsedFieldsInTryAssignment_22 ) ) | ( ( rule__FieldName__AnnotationsAssignment_23 ) ) | ( ( rule__FieldName__TimestampAssignment_24 ) ) )
            int alt7=25;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt7=1;
                }
                break;
            case 24:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            case 26:
                {
                alt7=4;
                }
                break;
            case 27:
                {
                alt7=5;
                }
                break;
            case 28:
                {
                alt7=6;
                }
                break;
            case 29:
                {
                alt7=7;
                }
                break;
            case 30:
                {
                alt7=8;
                }
                break;
            case 31:
                {
                alt7=9;
                }
                break;
            case 32:
                {
                alt7=10;
                }
                break;
            case 33:
                {
                alt7=11;
                }
                break;
            case 34:
                {
                alt7=12;
                }
                break;
            case 35:
                {
                alt7=13;
                }
                break;
            case 36:
                {
                alt7=14;
                }
                break;
            case 37:
                {
                alt7=15;
                }
                break;
            case 38:
                {
                alt7=16;
                }
                break;
            case 39:
                {
                alt7=17;
                }
                break;
            case 40:
                {
                alt7=18;
                }
                break;
            case 41:
                {
                alt7=19;
                }
                break;
            case 42:
                {
                alt7=20;
                }
                break;
            case 43:
                {
                alt7=21;
                }
                break;
            case 44:
                {
                alt7=22;
                }
                break;
            case 45:
                {
                alt7=23;
                }
                break;
            case 46:
                {
                alt7=24;
                }
                break;
            case 47:
                {
                alt7=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:525:1: ( ( rule__FieldName__FullyQualifiedNameAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:525:1: ( ( rule__FieldName__FullyQualifiedNameAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:526:1: ( rule__FieldName__FullyQualifiedNameAssignment_0 )
                    {
                     before(grammarAccess.getFieldNameAccess().getFullyQualifiedNameAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:527:1: ( rule__FieldName__FullyQualifiedNameAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:527:2: rule__FieldName__FullyQualifiedNameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FieldName__FullyQualifiedNameAssignment_0_in_rule__FieldName__Alternatives1065);
                    rule__FieldName__FullyQualifiedNameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getFullyQualifiedNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:531:6: ( ( rule__FieldName__TypeAssignment_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:531:6: ( ( rule__FieldName__TypeAssignment_1 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:532:1: ( rule__FieldName__TypeAssignment_1 )
                    {
                     before(grammarAccess.getFieldNameAccess().getTypeAssignment_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:533:1: ( rule__FieldName__TypeAssignment_1 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:533:2: rule__FieldName__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__FieldName__TypeAssignment_1_in_rule__FieldName__Alternatives1083);
                    rule__FieldName__TypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getTypeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:537:6: ( ( rule__FieldName__FriendlyNameAssignment_2 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:537:6: ( ( rule__FieldName__FriendlyNameAssignment_2 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:538:1: ( rule__FieldName__FriendlyNameAssignment_2 )
                    {
                     before(grammarAccess.getFieldNameAccess().getFriendlyNameAssignment_2()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:539:1: ( rule__FieldName__FriendlyNameAssignment_2 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:539:2: rule__FieldName__FriendlyNameAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FieldName__FriendlyNameAssignment_2_in_rule__FieldName__Alternatives1101);
                    rule__FieldName__FriendlyNameAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getFriendlyNameAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:543:6: ( ( rule__FieldName__DeclaredMethodsAssignment_3 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:543:6: ( ( rule__FieldName__DeclaredMethodsAssignment_3 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:544:1: ( rule__FieldName__DeclaredMethodsAssignment_3 )
                    {
                     before(grammarAccess.getFieldNameAccess().getDeclaredMethodsAssignment_3()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:545:1: ( rule__FieldName__DeclaredMethodsAssignment_3 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:545:2: rule__FieldName__DeclaredMethodsAssignment_3
                    {
                    pushFollow(FOLLOW_rule__FieldName__DeclaredMethodsAssignment_3_in_rule__FieldName__Alternatives1119);
                    rule__FieldName__DeclaredMethodsAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getDeclaredMethodsAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:549:6: ( ( rule__FieldName__ParameterCountAssignment_4 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:549:6: ( ( rule__FieldName__ParameterCountAssignment_4 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:550:1: ( rule__FieldName__ParameterCountAssignment_4 )
                    {
                     before(grammarAccess.getFieldNameAccess().getParameterCountAssignment_4()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:551:1: ( rule__FieldName__ParameterCountAssignment_4 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:551:2: rule__FieldName__ParameterCountAssignment_4
                    {
                    pushFollow(FOLLOW_rule__FieldName__ParameterCountAssignment_4_in_rule__FieldName__Alternatives1137);
                    rule__FieldName__ParameterCountAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getParameterCountAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:555:6: ( ( rule__FieldName__ReturnVariableEexpressionsAssignment_5 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:555:6: ( ( rule__FieldName__ReturnVariableEexpressionsAssignment_5 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:556:1: ( rule__FieldName__ReturnVariableEexpressionsAssignment_5 )
                    {
                     before(grammarAccess.getFieldNameAccess().getReturnVariableEexpressionsAssignment_5()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:557:1: ( rule__FieldName__ReturnVariableEexpressionsAssignment_5 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:557:2: rule__FieldName__ReturnVariableEexpressionsAssignment_5
                    {
                    pushFollow(FOLLOW_rule__FieldName__ReturnVariableEexpressionsAssignment_5_in_rule__FieldName__Alternatives1155);
                    rule__FieldName__ReturnVariableEexpressionsAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getReturnVariableEexpressionsAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:561:6: ( ( rule__FieldName__UsedMethodsAssignment_6 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:561:6: ( ( rule__FieldName__UsedMethodsAssignment_6 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:562:1: ( rule__FieldName__UsedMethodsAssignment_6 )
                    {
                     before(grammarAccess.getFieldNameAccess().getUsedMethodsAssignment_6()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:563:1: ( rule__FieldName__UsedMethodsAssignment_6 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:563:2: rule__FieldName__UsedMethodsAssignment_6
                    {
                    pushFollow(FOLLOW_rule__FieldName__UsedMethodsAssignment_6_in_rule__FieldName__Alternatives1173);
                    rule__FieldName__UsedMethodsAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getUsedMethodsAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:567:6: ( ( rule__FieldName__UsedMethodsInTryAssignment_7 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:567:6: ( ( rule__FieldName__UsedMethodsInTryAssignment_7 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:568:1: ( rule__FieldName__UsedMethodsInTryAssignment_7 )
                    {
                     before(grammarAccess.getFieldNameAccess().getUsedMethodsInTryAssignment_7()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:569:1: ( rule__FieldName__UsedMethodsInTryAssignment_7 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:569:2: rule__FieldName__UsedMethodsInTryAssignment_7
                    {
                    pushFollow(FOLLOW_rule__FieldName__UsedMethodsInTryAssignment_7_in_rule__FieldName__Alternatives1191);
                    rule__FieldName__UsedMethodsInTryAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getUsedMethodsInTryAssignment_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:573:6: ( ( rule__FieldName__UsedMethodsInFinallyAssignment_8 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:573:6: ( ( rule__FieldName__UsedMethodsInFinallyAssignment_8 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:574:1: ( rule__FieldName__UsedMethodsInFinallyAssignment_8 )
                    {
                     before(grammarAccess.getFieldNameAccess().getUsedMethodsInFinallyAssignment_8()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:575:1: ( rule__FieldName__UsedMethodsInFinallyAssignment_8 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:575:2: rule__FieldName__UsedMethodsInFinallyAssignment_8
                    {
                    pushFollow(FOLLOW_rule__FieldName__UsedMethodsInFinallyAssignment_8_in_rule__FieldName__Alternatives1209);
                    rule__FieldName__UsedMethodsInFinallyAssignment_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getUsedMethodsInFinallyAssignment_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:579:6: ( ( rule__FieldName__OverriddenMethodsAssignment_9 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:579:6: ( ( rule__FieldName__OverriddenMethodsAssignment_9 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:580:1: ( rule__FieldName__OverriddenMethodsAssignment_9 )
                    {
                     before(grammarAccess.getFieldNameAccess().getOverriddenMethodsAssignment_9()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:581:1: ( rule__FieldName__OverriddenMethodsAssignment_9 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:581:2: rule__FieldName__OverriddenMethodsAssignment_9
                    {
                    pushFollow(FOLLOW_rule__FieldName__OverriddenMethodsAssignment_9_in_rule__FieldName__Alternatives1227);
                    rule__FieldName__OverriddenMethodsAssignment_9();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getOverriddenMethodsAssignment_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:585:6: ( ( rule__FieldName__ProjectNameAssignment_10 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:585:6: ( ( rule__FieldName__ProjectNameAssignment_10 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:586:1: ( rule__FieldName__ProjectNameAssignment_10 )
                    {
                     before(grammarAccess.getFieldNameAccess().getProjectNameAssignment_10()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:587:1: ( rule__FieldName__ProjectNameAssignment_10 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:587:2: rule__FieldName__ProjectNameAssignment_10
                    {
                    pushFollow(FOLLOW_rule__FieldName__ProjectNameAssignment_10_in_rule__FieldName__Alternatives1245);
                    rule__FieldName__ProjectNameAssignment_10();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getProjectNameAssignment_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:591:6: ( ( rule__FieldName__ResourcePathAssignment_11 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:591:6: ( ( rule__FieldName__ResourcePathAssignment_11 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:592:1: ( rule__FieldName__ResourcePathAssignment_11 )
                    {
                     before(grammarAccess.getFieldNameAccess().getResourcePathAssignment_11()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:593:1: ( rule__FieldName__ResourcePathAssignment_11 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:593:2: rule__FieldName__ResourcePathAssignment_11
                    {
                    pushFollow(FOLLOW_rule__FieldName__ResourcePathAssignment_11_in_rule__FieldName__Alternatives1263);
                    rule__FieldName__ResourcePathAssignment_11();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getResourcePathAssignment_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:597:6: ( ( rule__FieldName__ModifiersAssignment_12 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:597:6: ( ( rule__FieldName__ModifiersAssignment_12 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:598:1: ( rule__FieldName__ModifiersAssignment_12 )
                    {
                     before(grammarAccess.getFieldNameAccess().getModifiersAssignment_12()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:599:1: ( rule__FieldName__ModifiersAssignment_12 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:599:2: rule__FieldName__ModifiersAssignment_12
                    {
                    pushFollow(FOLLOW_rule__FieldName__ModifiersAssignment_12_in_rule__FieldName__Alternatives1281);
                    rule__FieldName__ModifiersAssignment_12();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getModifiersAssignment_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:603:6: ( ( rule__FieldName__AllDeclaredMethodNamesAssignment_13 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:603:6: ( ( rule__FieldName__AllDeclaredMethodNamesAssignment_13 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:604:1: ( rule__FieldName__AllDeclaredMethodNamesAssignment_13 )
                    {
                     before(grammarAccess.getFieldNameAccess().getAllDeclaredMethodNamesAssignment_13()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:605:1: ( rule__FieldName__AllDeclaredMethodNamesAssignment_13 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:605:2: rule__FieldName__AllDeclaredMethodNamesAssignment_13
                    {
                    pushFollow(FOLLOW_rule__FieldName__AllDeclaredMethodNamesAssignment_13_in_rule__FieldName__Alternatives1299);
                    rule__FieldName__AllDeclaredMethodNamesAssignment_13();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getAllDeclaredMethodNamesAssignment_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:609:6: ( ( rule__FieldName__DeclaredMethodNamesAssignment_14 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:609:6: ( ( rule__FieldName__DeclaredMethodNamesAssignment_14 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:610:1: ( rule__FieldName__DeclaredMethodNamesAssignment_14 )
                    {
                     before(grammarAccess.getFieldNameAccess().getDeclaredMethodNamesAssignment_14()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:611:1: ( rule__FieldName__DeclaredMethodNamesAssignment_14 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:611:2: rule__FieldName__DeclaredMethodNamesAssignment_14
                    {
                    pushFollow(FOLLOW_rule__FieldName__DeclaredMethodNamesAssignment_14_in_rule__FieldName__Alternatives1317);
                    rule__FieldName__DeclaredMethodNamesAssignment_14();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getDeclaredMethodNamesAssignment_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:615:6: ( ( rule__FieldName__DeclaredFieldNamesAssignment_15 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:615:6: ( ( rule__FieldName__DeclaredFieldNamesAssignment_15 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:616:1: ( rule__FieldName__DeclaredFieldNamesAssignment_15 )
                    {
                     before(grammarAccess.getFieldNameAccess().getDeclaredFieldNamesAssignment_15()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:617:1: ( rule__FieldName__DeclaredFieldNamesAssignment_15 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:617:2: rule__FieldName__DeclaredFieldNamesAssignment_15
                    {
                    pushFollow(FOLLOW_rule__FieldName__DeclaredFieldNamesAssignment_15_in_rule__FieldName__Alternatives1335);
                    rule__FieldName__DeclaredFieldNamesAssignment_15();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getDeclaredFieldNamesAssignment_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:621:6: ( ( rule__FieldName__DeclaredFieldTypesAssignment_16 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:621:6: ( ( rule__FieldName__DeclaredFieldTypesAssignment_16 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:622:1: ( rule__FieldName__DeclaredFieldTypesAssignment_16 )
                    {
                     before(grammarAccess.getFieldNameAccess().getDeclaredFieldTypesAssignment_16()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:623:1: ( rule__FieldName__DeclaredFieldTypesAssignment_16 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:623:2: rule__FieldName__DeclaredFieldTypesAssignment_16
                    {
                    pushFollow(FOLLOW_rule__FieldName__DeclaredFieldTypesAssignment_16_in_rule__FieldName__Alternatives1353);
                    rule__FieldName__DeclaredFieldTypesAssignment_16();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getDeclaredFieldTypesAssignment_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:627:6: ( ( rule__FieldName__AllDeclaredFieldNamesAssignment_17 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:627:6: ( ( rule__FieldName__AllDeclaredFieldNamesAssignment_17 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:628:1: ( rule__FieldName__AllDeclaredFieldNamesAssignment_17 )
                    {
                     before(grammarAccess.getFieldNameAccess().getAllDeclaredFieldNamesAssignment_17()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:629:1: ( rule__FieldName__AllDeclaredFieldNamesAssignment_17 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:629:2: rule__FieldName__AllDeclaredFieldNamesAssignment_17
                    {
                    pushFollow(FOLLOW_rule__FieldName__AllDeclaredFieldNamesAssignment_17_in_rule__FieldName__Alternatives1371);
                    rule__FieldName__AllDeclaredFieldNamesAssignment_17();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getAllDeclaredFieldNamesAssignment_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:633:6: ( ( rule__FieldName__FullTextAssignment_18 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:633:6: ( ( rule__FieldName__FullTextAssignment_18 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:634:1: ( rule__FieldName__FullTextAssignment_18 )
                    {
                     before(grammarAccess.getFieldNameAccess().getFullTextAssignment_18()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:635:1: ( rule__FieldName__FullTextAssignment_18 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:635:2: rule__FieldName__FullTextAssignment_18
                    {
                    pushFollow(FOLLOW_rule__FieldName__FullTextAssignment_18_in_rule__FieldName__Alternatives1389);
                    rule__FieldName__FullTextAssignment_18();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getFullTextAssignment_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:639:6: ( ( rule__FieldName__FieldsReadAssignment_19 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:639:6: ( ( rule__FieldName__FieldsReadAssignment_19 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:640:1: ( rule__FieldName__FieldsReadAssignment_19 )
                    {
                     before(grammarAccess.getFieldNameAccess().getFieldsReadAssignment_19()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:641:1: ( rule__FieldName__FieldsReadAssignment_19 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:641:2: rule__FieldName__FieldsReadAssignment_19
                    {
                    pushFollow(FOLLOW_rule__FieldName__FieldsReadAssignment_19_in_rule__FieldName__Alternatives1407);
                    rule__FieldName__FieldsReadAssignment_19();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getFieldsReadAssignment_19()); 

                    }


                    }
                    break;
                case 21 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:645:6: ( ( rule__FieldName__FieldsWrittenAssignment_20 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:645:6: ( ( rule__FieldName__FieldsWrittenAssignment_20 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:646:1: ( rule__FieldName__FieldsWrittenAssignment_20 )
                    {
                     before(grammarAccess.getFieldNameAccess().getFieldsWrittenAssignment_20()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:647:1: ( rule__FieldName__FieldsWrittenAssignment_20 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:647:2: rule__FieldName__FieldsWrittenAssignment_20
                    {
                    pushFollow(FOLLOW_rule__FieldName__FieldsWrittenAssignment_20_in_rule__FieldName__Alternatives1425);
                    rule__FieldName__FieldsWrittenAssignment_20();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getFieldsWrittenAssignment_20()); 

                    }


                    }
                    break;
                case 22 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:651:6: ( ( rule__FieldName__UsedFieldsInFinallyAssignment_21 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:651:6: ( ( rule__FieldName__UsedFieldsInFinallyAssignment_21 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:652:1: ( rule__FieldName__UsedFieldsInFinallyAssignment_21 )
                    {
                     before(grammarAccess.getFieldNameAccess().getUsedFieldsInFinallyAssignment_21()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:653:1: ( rule__FieldName__UsedFieldsInFinallyAssignment_21 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:653:2: rule__FieldName__UsedFieldsInFinallyAssignment_21
                    {
                    pushFollow(FOLLOW_rule__FieldName__UsedFieldsInFinallyAssignment_21_in_rule__FieldName__Alternatives1443);
                    rule__FieldName__UsedFieldsInFinallyAssignment_21();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getUsedFieldsInFinallyAssignment_21()); 

                    }


                    }
                    break;
                case 23 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:657:6: ( ( rule__FieldName__UsedFieldsInTryAssignment_22 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:657:6: ( ( rule__FieldName__UsedFieldsInTryAssignment_22 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:658:1: ( rule__FieldName__UsedFieldsInTryAssignment_22 )
                    {
                     before(grammarAccess.getFieldNameAccess().getUsedFieldsInTryAssignment_22()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:659:1: ( rule__FieldName__UsedFieldsInTryAssignment_22 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:659:2: rule__FieldName__UsedFieldsInTryAssignment_22
                    {
                    pushFollow(FOLLOW_rule__FieldName__UsedFieldsInTryAssignment_22_in_rule__FieldName__Alternatives1461);
                    rule__FieldName__UsedFieldsInTryAssignment_22();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getUsedFieldsInTryAssignment_22()); 

                    }


                    }
                    break;
                case 24 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:663:6: ( ( rule__FieldName__AnnotationsAssignment_23 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:663:6: ( ( rule__FieldName__AnnotationsAssignment_23 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:664:1: ( rule__FieldName__AnnotationsAssignment_23 )
                    {
                     before(grammarAccess.getFieldNameAccess().getAnnotationsAssignment_23()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:665:1: ( rule__FieldName__AnnotationsAssignment_23 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:665:2: rule__FieldName__AnnotationsAssignment_23
                    {
                    pushFollow(FOLLOW_rule__FieldName__AnnotationsAssignment_23_in_rule__FieldName__Alternatives1479);
                    rule__FieldName__AnnotationsAssignment_23();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getAnnotationsAssignment_23()); 

                    }


                    }
                    break;
                case 25 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:669:6: ( ( rule__FieldName__TimestampAssignment_24 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:669:6: ( ( rule__FieldName__TimestampAssignment_24 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:670:1: ( rule__FieldName__TimestampAssignment_24 )
                    {
                     before(grammarAccess.getFieldNameAccess().getTimestampAssignment_24()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:671:1: ( rule__FieldName__TimestampAssignment_24 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:671:2: rule__FieldName__TimestampAssignment_24
                    {
                    pushFollow(FOLLOW_rule__FieldName__TimestampAssignment_24_in_rule__FieldName__Alternatives1497);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:680:1: rule__TypeFieldName__Alternatives : ( ( ( rule__TypeFieldName__ImplementedTypesAssignment_0 ) ) | ( ( rule__TypeFieldName__ExtendedTypesAssignment_1 ) ) | ( ( rule__TypeFieldName__UsedTypesAssignment_2 ) ) | ( ( rule__TypeFieldName__UsedTypesInTryAssignment_3 ) ) | ( ( rule__TypeFieldName__UsedTypesInFinallyAssignment_4 ) ) | ( ( rule__TypeFieldName__ParameterTypesAssignment_5 ) ) | ( ( rule__TypeFieldName__ReturnTypeAssignment_6 ) ) | ( ( rule__TypeFieldName__AllImplementedTypesAssignment_7 ) ) | ( ( rule__TypeFieldName__AllExtendedTypesAssignment_8 ) ) | ( ( rule__TypeFieldName__FieldTypeAssignment_9 ) ) | ( ( rule__TypeFieldName__DeclaringTypeAssignment_10 ) ) | ( ( rule__TypeFieldName__CaughtTypeAssignment_11 ) ) | ( ( rule__TypeFieldName__InstanceofTypesAssignment_12 ) ) );
    public final void rule__TypeFieldName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:684:1: ( ( ( rule__TypeFieldName__ImplementedTypesAssignment_0 ) ) | ( ( rule__TypeFieldName__ExtendedTypesAssignment_1 ) ) | ( ( rule__TypeFieldName__UsedTypesAssignment_2 ) ) | ( ( rule__TypeFieldName__UsedTypesInTryAssignment_3 ) ) | ( ( rule__TypeFieldName__UsedTypesInFinallyAssignment_4 ) ) | ( ( rule__TypeFieldName__ParameterTypesAssignment_5 ) ) | ( ( rule__TypeFieldName__ReturnTypeAssignment_6 ) ) | ( ( rule__TypeFieldName__AllImplementedTypesAssignment_7 ) ) | ( ( rule__TypeFieldName__AllExtendedTypesAssignment_8 ) ) | ( ( rule__TypeFieldName__FieldTypeAssignment_9 ) ) | ( ( rule__TypeFieldName__DeclaringTypeAssignment_10 ) ) | ( ( rule__TypeFieldName__CaughtTypeAssignment_11 ) ) | ( ( rule__TypeFieldName__InstanceofTypesAssignment_12 ) ) )
            int alt8=13;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt8=1;
                }
                break;
            case 49:
                {
                alt8=2;
                }
                break;
            case 50:
                {
                alt8=3;
                }
                break;
            case 51:
                {
                alt8=4;
                }
                break;
            case 52:
                {
                alt8=5;
                }
                break;
            case 53:
                {
                alt8=6;
                }
                break;
            case 54:
                {
                alt8=7;
                }
                break;
            case 55:
                {
                alt8=8;
                }
                break;
            case 56:
                {
                alt8=9;
                }
                break;
            case 57:
                {
                alt8=10;
                }
                break;
            case 58:
                {
                alt8=11;
                }
                break;
            case 59:
                {
                alt8=12;
                }
                break;
            case 60:
                {
                alt8=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:685:1: ( ( rule__TypeFieldName__ImplementedTypesAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:685:1: ( ( rule__TypeFieldName__ImplementedTypesAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:686:1: ( rule__TypeFieldName__ImplementedTypesAssignment_0 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getImplementedTypesAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:687:1: ( rule__TypeFieldName__ImplementedTypesAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:687:2: rule__TypeFieldName__ImplementedTypesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__ImplementedTypesAssignment_0_in_rule__TypeFieldName__Alternatives1530);
                    rule__TypeFieldName__ImplementedTypesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getImplementedTypesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:691:6: ( ( rule__TypeFieldName__ExtendedTypesAssignment_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:691:6: ( ( rule__TypeFieldName__ExtendedTypesAssignment_1 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:692:1: ( rule__TypeFieldName__ExtendedTypesAssignment_1 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getExtendedTypesAssignment_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:693:1: ( rule__TypeFieldName__ExtendedTypesAssignment_1 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:693:2: rule__TypeFieldName__ExtendedTypesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__ExtendedTypesAssignment_1_in_rule__TypeFieldName__Alternatives1548);
                    rule__TypeFieldName__ExtendedTypesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getExtendedTypesAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:697:6: ( ( rule__TypeFieldName__UsedTypesAssignment_2 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:697:6: ( ( rule__TypeFieldName__UsedTypesAssignment_2 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:698:1: ( rule__TypeFieldName__UsedTypesAssignment_2 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getUsedTypesAssignment_2()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:699:1: ( rule__TypeFieldName__UsedTypesAssignment_2 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:699:2: rule__TypeFieldName__UsedTypesAssignment_2
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__UsedTypesAssignment_2_in_rule__TypeFieldName__Alternatives1566);
                    rule__TypeFieldName__UsedTypesAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getUsedTypesAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:703:6: ( ( rule__TypeFieldName__UsedTypesInTryAssignment_3 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:703:6: ( ( rule__TypeFieldName__UsedTypesInTryAssignment_3 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:704:1: ( rule__TypeFieldName__UsedTypesInTryAssignment_3 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getUsedTypesInTryAssignment_3()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:705:1: ( rule__TypeFieldName__UsedTypesInTryAssignment_3 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:705:2: rule__TypeFieldName__UsedTypesInTryAssignment_3
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__UsedTypesInTryAssignment_3_in_rule__TypeFieldName__Alternatives1584);
                    rule__TypeFieldName__UsedTypesInTryAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getUsedTypesInTryAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:709:6: ( ( rule__TypeFieldName__UsedTypesInFinallyAssignment_4 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:709:6: ( ( rule__TypeFieldName__UsedTypesInFinallyAssignment_4 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:710:1: ( rule__TypeFieldName__UsedTypesInFinallyAssignment_4 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getUsedTypesInFinallyAssignment_4()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:711:1: ( rule__TypeFieldName__UsedTypesInFinallyAssignment_4 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:711:2: rule__TypeFieldName__UsedTypesInFinallyAssignment_4
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__UsedTypesInFinallyAssignment_4_in_rule__TypeFieldName__Alternatives1602);
                    rule__TypeFieldName__UsedTypesInFinallyAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getUsedTypesInFinallyAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:715:6: ( ( rule__TypeFieldName__ParameterTypesAssignment_5 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:715:6: ( ( rule__TypeFieldName__ParameterTypesAssignment_5 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:716:1: ( rule__TypeFieldName__ParameterTypesAssignment_5 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getParameterTypesAssignment_5()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:717:1: ( rule__TypeFieldName__ParameterTypesAssignment_5 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:717:2: rule__TypeFieldName__ParameterTypesAssignment_5
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__ParameterTypesAssignment_5_in_rule__TypeFieldName__Alternatives1620);
                    rule__TypeFieldName__ParameterTypesAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getParameterTypesAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:721:6: ( ( rule__TypeFieldName__ReturnTypeAssignment_6 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:721:6: ( ( rule__TypeFieldName__ReturnTypeAssignment_6 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:722:1: ( rule__TypeFieldName__ReturnTypeAssignment_6 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getReturnTypeAssignment_6()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:723:1: ( rule__TypeFieldName__ReturnTypeAssignment_6 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:723:2: rule__TypeFieldName__ReturnTypeAssignment_6
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__ReturnTypeAssignment_6_in_rule__TypeFieldName__Alternatives1638);
                    rule__TypeFieldName__ReturnTypeAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getReturnTypeAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:727:6: ( ( rule__TypeFieldName__AllImplementedTypesAssignment_7 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:727:6: ( ( rule__TypeFieldName__AllImplementedTypesAssignment_7 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:728:1: ( rule__TypeFieldName__AllImplementedTypesAssignment_7 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getAllImplementedTypesAssignment_7()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:729:1: ( rule__TypeFieldName__AllImplementedTypesAssignment_7 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:729:2: rule__TypeFieldName__AllImplementedTypesAssignment_7
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__AllImplementedTypesAssignment_7_in_rule__TypeFieldName__Alternatives1656);
                    rule__TypeFieldName__AllImplementedTypesAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getAllImplementedTypesAssignment_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:733:6: ( ( rule__TypeFieldName__AllExtendedTypesAssignment_8 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:733:6: ( ( rule__TypeFieldName__AllExtendedTypesAssignment_8 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:734:1: ( rule__TypeFieldName__AllExtendedTypesAssignment_8 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getAllExtendedTypesAssignment_8()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:735:1: ( rule__TypeFieldName__AllExtendedTypesAssignment_8 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:735:2: rule__TypeFieldName__AllExtendedTypesAssignment_8
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__AllExtendedTypesAssignment_8_in_rule__TypeFieldName__Alternatives1674);
                    rule__TypeFieldName__AllExtendedTypesAssignment_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getAllExtendedTypesAssignment_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:739:6: ( ( rule__TypeFieldName__FieldTypeAssignment_9 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:739:6: ( ( rule__TypeFieldName__FieldTypeAssignment_9 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:740:1: ( rule__TypeFieldName__FieldTypeAssignment_9 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getFieldTypeAssignment_9()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:741:1: ( rule__TypeFieldName__FieldTypeAssignment_9 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:741:2: rule__TypeFieldName__FieldTypeAssignment_9
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__FieldTypeAssignment_9_in_rule__TypeFieldName__Alternatives1692);
                    rule__TypeFieldName__FieldTypeAssignment_9();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getFieldTypeAssignment_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:745:6: ( ( rule__TypeFieldName__DeclaringTypeAssignment_10 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:745:6: ( ( rule__TypeFieldName__DeclaringTypeAssignment_10 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:746:1: ( rule__TypeFieldName__DeclaringTypeAssignment_10 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getDeclaringTypeAssignment_10()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:747:1: ( rule__TypeFieldName__DeclaringTypeAssignment_10 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:747:2: rule__TypeFieldName__DeclaringTypeAssignment_10
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__DeclaringTypeAssignment_10_in_rule__TypeFieldName__Alternatives1710);
                    rule__TypeFieldName__DeclaringTypeAssignment_10();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getDeclaringTypeAssignment_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:751:6: ( ( rule__TypeFieldName__CaughtTypeAssignment_11 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:751:6: ( ( rule__TypeFieldName__CaughtTypeAssignment_11 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:752:1: ( rule__TypeFieldName__CaughtTypeAssignment_11 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getCaughtTypeAssignment_11()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:753:1: ( rule__TypeFieldName__CaughtTypeAssignment_11 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:753:2: rule__TypeFieldName__CaughtTypeAssignment_11
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__CaughtTypeAssignment_11_in_rule__TypeFieldName__Alternatives1728);
                    rule__TypeFieldName__CaughtTypeAssignment_11();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getCaughtTypeAssignment_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:757:6: ( ( rule__TypeFieldName__InstanceofTypesAssignment_12 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:757:6: ( ( rule__TypeFieldName__InstanceofTypesAssignment_12 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:758:1: ( rule__TypeFieldName__InstanceofTypesAssignment_12 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getInstanceofTypesAssignment_12()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:759:1: ( rule__TypeFieldName__InstanceofTypesAssignment_12 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:759:2: rule__TypeFieldName__InstanceofTypesAssignment_12
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__InstanceofTypesAssignment_12_in_rule__TypeFieldName__Alternatives1746);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:768:1: rule__BooleanExp__Alternatives : ( ( ( 'AND' ) ) | ( ( 'and' ) ) | ( ( 'OR' ) ) | ( ( 'or' ) ) );
    public final void rule__BooleanExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:772:1: ( ( ( 'AND' ) ) | ( ( 'and' ) ) | ( ( 'OR' ) ) | ( ( 'or' ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt9=1;
                }
                break;
            case 14:
                {
                alt9=2;
                }
                break;
            case 15:
                {
                alt9=3;
                }
                break;
            case 16:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:773:1: ( ( 'AND' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:773:1: ( ( 'AND' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:774:1: ( 'AND' )
                    {
                     before(grammarAccess.getBooleanExpAccess().getAnd1EnumLiteralDeclaration_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:775:1: ( 'AND' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:775:3: 'AND'
                    {
                    match(input,13,FOLLOW_13_in_rule__BooleanExp__Alternatives1780); 

                    }

                     after(grammarAccess.getBooleanExpAccess().getAnd1EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:780:6: ( ( 'and' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:780:6: ( ( 'and' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:781:1: ( 'and' )
                    {
                     before(grammarAccess.getBooleanExpAccess().getAnd2EnumLiteralDeclaration_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:782:1: ( 'and' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:782:3: 'and'
                    {
                    match(input,14,FOLLOW_14_in_rule__BooleanExp__Alternatives1801); 

                    }

                     after(grammarAccess.getBooleanExpAccess().getAnd2EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:787:6: ( ( 'OR' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:787:6: ( ( 'OR' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:788:1: ( 'OR' )
                    {
                     before(grammarAccess.getBooleanExpAccess().getOr1EnumLiteralDeclaration_2()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:789:1: ( 'OR' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:789:3: 'OR'
                    {
                    match(input,15,FOLLOW_15_in_rule__BooleanExp__Alternatives1822); 

                    }

                     after(grammarAccess.getBooleanExpAccess().getOr1EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:794:6: ( ( 'or' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:794:6: ( ( 'or' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:795:1: ( 'or' )
                    {
                     before(grammarAccess.getBooleanExpAccess().getOr2EnumLiteralDeclaration_3()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:796:1: ( 'or' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:796:3: 'or'
                    {
                    match(input,16,FOLLOW_16_in_rule__BooleanExp__Alternatives1843); 

                    }

                     after(grammarAccess.getBooleanExpAccess().getOr2EnumLiteralDeclaration_3()); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:806:1: rule__NotExpression__Alternatives : ( ( ( 'not' ) ) | ( ( 'NOT' ) ) | ( ( '!' ) ) );
    public final void rule__NotExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:810:1: ( ( ( 'not' ) ) | ( ( 'NOT' ) ) | ( ( '!' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt10=1;
                }
                break;
            case 18:
                {
                alt10=2;
                }
                break;
            case 19:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:811:1: ( ( 'not' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:811:1: ( ( 'not' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:812:1: ( 'not' )
                    {
                     before(grammarAccess.getNotExpressionAccess().getNot1EnumLiteralDeclaration_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:813:1: ( 'not' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:813:3: 'not'
                    {
                    match(input,17,FOLLOW_17_in_rule__NotExpression__Alternatives1879); 

                    }

                     after(grammarAccess.getNotExpressionAccess().getNot1EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:818:6: ( ( 'NOT' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:818:6: ( ( 'NOT' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:819:1: ( 'NOT' )
                    {
                     before(grammarAccess.getNotExpressionAccess().getNot2EnumLiteralDeclaration_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:820:1: ( 'NOT' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:820:3: 'NOT'
                    {
                    match(input,18,FOLLOW_18_in_rule__NotExpression__Alternatives1900); 

                    }

                     after(grammarAccess.getNotExpressionAccess().getNot2EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:825:6: ( ( '!' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:825:6: ( ( '!' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:826:1: ( '!' )
                    {
                     before(grammarAccess.getNotExpressionAccess().getNot3EnumLiteralDeclaration_2()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:827:1: ( '!' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:827:3: '!'
                    {
                    match(input,19,FOLLOW_19_in_rule__NotExpression__Alternatives1921); 

                    }

                     after(grammarAccess.getNotExpressionAccess().getNot3EnumLiteralDeclaration_2()); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:839:1: rule__Exp1__Group__0 : rule__Exp1__Group__0__Impl rule__Exp1__Group__1 ;
    public final void rule__Exp1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:843:1: ( rule__Exp1__Group__0__Impl rule__Exp1__Group__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:844:2: rule__Exp1__Group__0__Impl rule__Exp1__Group__1
            {
            pushFollow(FOLLOW_rule__Exp1__Group__0__Impl_in_rule__Exp1__Group__01954);
            rule__Exp1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp1__Group__1_in_rule__Exp1__Group__01957);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:851:1: rule__Exp1__Group__0__Impl : ( ruleExp2 ) ;
    public final void rule__Exp1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:855:1: ( ( ruleExp2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:856:1: ( ruleExp2 )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:856:1: ( ruleExp2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:857:1: ruleExp2
            {
             before(grammarAccess.getExp1Access().getExp2ParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleExp2_in_rule__Exp1__Group__0__Impl1984);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:868:1: rule__Exp1__Group__1 : rule__Exp1__Group__1__Impl ;
    public final void rule__Exp1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:872:1: ( rule__Exp1__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:873:2: rule__Exp1__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Exp1__Group__1__Impl_in_rule__Exp1__Group__12013);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:879:1: rule__Exp1__Group__1__Impl : ( ( rule__Exp1__Group_1__0 )* ) ;
    public final void rule__Exp1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:883:1: ( ( ( rule__Exp1__Group_1__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:884:1: ( ( rule__Exp1__Group_1__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:884:1: ( ( rule__Exp1__Group_1__0 )* )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:885:1: ( rule__Exp1__Group_1__0 )*
            {
             before(grammarAccess.getExp1Access().getGroup_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:886:1: ( rule__Exp1__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=13 && LA11_0<=16)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:886:2: rule__Exp1__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Exp1__Group_1__0_in_rule__Exp1__Group__1__Impl2040);
            	    rule__Exp1__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:900:1: rule__Exp1__Group_1__0 : rule__Exp1__Group_1__0__Impl rule__Exp1__Group_1__1 ;
    public final void rule__Exp1__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:904:1: ( rule__Exp1__Group_1__0__Impl rule__Exp1__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:905:2: rule__Exp1__Group_1__0__Impl rule__Exp1__Group_1__1
            {
            pushFollow(FOLLOW_rule__Exp1__Group_1__0__Impl_in_rule__Exp1__Group_1__02075);
            rule__Exp1__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp1__Group_1__1_in_rule__Exp1__Group_1__02078);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:912:1: rule__Exp1__Group_1__0__Impl : ( () ) ;
    public final void rule__Exp1__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:916:1: ( ( () ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:917:1: ( () )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:917:1: ( () )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:918:1: ()
            {
             before(grammarAccess.getExp1Access().getExp1LeftAction_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:919:1: ()
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:921:1: 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:931:1: rule__Exp1__Group_1__1 : rule__Exp1__Group_1__1__Impl rule__Exp1__Group_1__2 ;
    public final void rule__Exp1__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:935:1: ( rule__Exp1__Group_1__1__Impl rule__Exp1__Group_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:936:2: rule__Exp1__Group_1__1__Impl rule__Exp1__Group_1__2
            {
            pushFollow(FOLLOW_rule__Exp1__Group_1__1__Impl_in_rule__Exp1__Group_1__12136);
            rule__Exp1__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp1__Group_1__2_in_rule__Exp1__Group_1__12139);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:943:1: rule__Exp1__Group_1__1__Impl : ( ( rule__Exp1__BAssignment_1_1 ) ) ;
    public final void rule__Exp1__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:947:1: ( ( ( rule__Exp1__BAssignment_1_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:948:1: ( ( rule__Exp1__BAssignment_1_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:948:1: ( ( rule__Exp1__BAssignment_1_1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:949:1: ( rule__Exp1__BAssignment_1_1 )
            {
             before(grammarAccess.getExp1Access().getBAssignment_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:950:1: ( rule__Exp1__BAssignment_1_1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:950:2: rule__Exp1__BAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Exp1__BAssignment_1_1_in_rule__Exp1__Group_1__1__Impl2166);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:960:1: rule__Exp1__Group_1__2 : rule__Exp1__Group_1__2__Impl ;
    public final void rule__Exp1__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:964:1: ( rule__Exp1__Group_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:965:2: rule__Exp1__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Exp1__Group_1__2__Impl_in_rule__Exp1__Group_1__22196);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:971:1: rule__Exp1__Group_1__2__Impl : ( ( rule__Exp1__RightAssignment_1_2 ) ) ;
    public final void rule__Exp1__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:975:1: ( ( ( rule__Exp1__RightAssignment_1_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:976:1: ( ( rule__Exp1__RightAssignment_1_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:976:1: ( ( rule__Exp1__RightAssignment_1_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:977:1: ( rule__Exp1__RightAssignment_1_2 )
            {
             before(grammarAccess.getExp1Access().getRightAssignment_1_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:978:1: ( rule__Exp1__RightAssignment_1_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:978:2: rule__Exp1__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Exp1__RightAssignment_1_2_in_rule__Exp1__Group_1__2__Impl2223);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:994:1: rule__Exp2__Group_1__0 : rule__Exp2__Group_1__0__Impl rule__Exp2__Group_1__1 ;
    public final void rule__Exp2__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:998:1: ( rule__Exp2__Group_1__0__Impl rule__Exp2__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:999:2: rule__Exp2__Group_1__0__Impl rule__Exp2__Group_1__1
            {
            pushFollow(FOLLOW_rule__Exp2__Group_1__0__Impl_in_rule__Exp2__Group_1__02259);
            rule__Exp2__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp2__Group_1__1_in_rule__Exp2__Group_1__02262);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1006:1: rule__Exp2__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Exp2__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1010:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1011:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1011:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1012:1: '('
            {
             before(grammarAccess.getExp2Access().getLeftParenthesisKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__Exp2__Group_1__0__Impl2290); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1025:1: rule__Exp2__Group_1__1 : rule__Exp2__Group_1__1__Impl rule__Exp2__Group_1__2 ;
    public final void rule__Exp2__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1029:1: ( rule__Exp2__Group_1__1__Impl rule__Exp2__Group_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1030:2: rule__Exp2__Group_1__1__Impl rule__Exp2__Group_1__2
            {
            pushFollow(FOLLOW_rule__Exp2__Group_1__1__Impl_in_rule__Exp2__Group_1__12321);
            rule__Exp2__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp2__Group_1__2_in_rule__Exp2__Group_1__12324);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1037:1: rule__Exp2__Group_1__1__Impl : ( ruleExp1 ) ;
    public final void rule__Exp2__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1041:1: ( ( ruleExp1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1042:1: ( ruleExp1 )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1042:1: ( ruleExp1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1043:1: ruleExp1
            {
             before(grammarAccess.getExp2Access().getExp1ParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleExp1_in_rule__Exp2__Group_1__1__Impl2351);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1054:1: rule__Exp2__Group_1__2 : rule__Exp2__Group_1__2__Impl ;
    public final void rule__Exp2__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1058:1: ( rule__Exp2__Group_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1059:2: rule__Exp2__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Exp2__Group_1__2__Impl_in_rule__Exp2__Group_1__22380);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1065:1: rule__Exp2__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Exp2__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1069:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1070:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1070:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1071:1: ')'
            {
             before(grammarAccess.getExp2Access().getRightParenthesisKeyword_1_2()); 
            match(input,21,FOLLOW_21_in_rule__Exp2__Group_1__2__Impl2408); 
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


    // $ANTLR start "rule__SimpleClause__Group__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1090:1: rule__SimpleClause__Group__0 : rule__SimpleClause__Group__0__Impl rule__SimpleClause__Group__1 ;
    public final void rule__SimpleClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1094:1: ( rule__SimpleClause__Group__0__Impl rule__SimpleClause__Group__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1095:2: rule__SimpleClause__Group__0__Impl rule__SimpleClause__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleClause__Group__0__Impl_in_rule__SimpleClause__Group__02445);
            rule__SimpleClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClause__Group__1_in_rule__SimpleClause__Group__02448);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1102:1: rule__SimpleClause__Group__0__Impl : ( ( rule__SimpleClause__NAssignment_0 )? ) ;
    public final void rule__SimpleClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1106:1: ( ( ( rule__SimpleClause__NAssignment_0 )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1107:1: ( ( rule__SimpleClause__NAssignment_0 )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1107:1: ( ( rule__SimpleClause__NAssignment_0 )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1108:1: ( rule__SimpleClause__NAssignment_0 )?
            {
             before(grammarAccess.getSimpleClauseAccess().getNAssignment_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1109:1: ( rule__SimpleClause__NAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=17 && LA12_0<=19)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1109:2: rule__SimpleClause__NAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SimpleClause__NAssignment_0_in_rule__SimpleClause__Group__0__Impl2475);
                    rule__SimpleClause__NAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleClauseAccess().getNAssignment_0()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1119:1: rule__SimpleClause__Group__1 : rule__SimpleClause__Group__1__Impl rule__SimpleClause__Group__2 ;
    public final void rule__SimpleClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1123:1: ( rule__SimpleClause__Group__1__Impl rule__SimpleClause__Group__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1124:2: rule__SimpleClause__Group__1__Impl rule__SimpleClause__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleClause__Group__1__Impl_in_rule__SimpleClause__Group__12506);
            rule__SimpleClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClause__Group__2_in_rule__SimpleClause__Group__12509);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1131:1: rule__SimpleClause__Group__1__Impl : ( ( rule__SimpleClause__FieldAssignment_1 ) ) ;
    public final void rule__SimpleClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1135:1: ( ( ( rule__SimpleClause__FieldAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1136:1: ( ( rule__SimpleClause__FieldAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1136:1: ( ( rule__SimpleClause__FieldAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1137:1: ( rule__SimpleClause__FieldAssignment_1 )
            {
             before(grammarAccess.getSimpleClauseAccess().getFieldAssignment_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1138:1: ( rule__SimpleClause__FieldAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1138:2: rule__SimpleClause__FieldAssignment_1
            {
            pushFollow(FOLLOW_rule__SimpleClause__FieldAssignment_1_in_rule__SimpleClause__Group__1__Impl2536);
            rule__SimpleClause__FieldAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleClauseAccess().getFieldAssignment_1()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1148:1: rule__SimpleClause__Group__2 : rule__SimpleClause__Group__2__Impl rule__SimpleClause__Group__3 ;
    public final void rule__SimpleClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1152:1: ( rule__SimpleClause__Group__2__Impl rule__SimpleClause__Group__3 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1153:2: rule__SimpleClause__Group__2__Impl rule__SimpleClause__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleClause__Group__2__Impl_in_rule__SimpleClause__Group__22566);
            rule__SimpleClause__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClause__Group__3_in_rule__SimpleClause__Group__22569);
            rule__SimpleClause__Group__3();

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1160:1: rule__SimpleClause__Group__2__Impl : ( ':' ) ;
    public final void rule__SimpleClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1164:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1165:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1165:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1166:1: ':'
            {
             before(grammarAccess.getSimpleClauseAccess().getColonKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__SimpleClause__Group__2__Impl2597); 
             after(grammarAccess.getSimpleClauseAccess().getColonKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__SimpleClause__Group__3"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1179:1: rule__SimpleClause__Group__3 : rule__SimpleClause__Group__3__Impl ;
    public final void rule__SimpleClause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1183:1: ( rule__SimpleClause__Group__3__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1184:2: rule__SimpleClause__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SimpleClause__Group__3__Impl_in_rule__SimpleClause__Group__32628);
            rule__SimpleClause__Group__3__Impl();

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
    // $ANTLR end "rule__SimpleClause__Group__3"


    // $ANTLR start "rule__SimpleClause__Group__3__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1190:1: rule__SimpleClause__Group__3__Impl : ( ( rule__SimpleClause__ValueAssignment_3 ) ) ;
    public final void rule__SimpleClause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1194:1: ( ( ( rule__SimpleClause__ValueAssignment_3 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1195:1: ( ( rule__SimpleClause__ValueAssignment_3 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1195:1: ( ( rule__SimpleClause__ValueAssignment_3 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1196:1: ( rule__SimpleClause__ValueAssignment_3 )
            {
             before(grammarAccess.getSimpleClauseAccess().getValueAssignment_3()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1197:1: ( rule__SimpleClause__ValueAssignment_3 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1197:2: rule__SimpleClause__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__SimpleClause__ValueAssignment_3_in_rule__SimpleClause__Group__3__Impl2655);
            rule__SimpleClause__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSimpleClauseAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClause__Group__3__Impl"


    // $ANTLR start "rule__TypeClause__Group__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1215:1: rule__TypeClause__Group__0 : rule__TypeClause__Group__0__Impl rule__TypeClause__Group__1 ;
    public final void rule__TypeClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1219:1: ( rule__TypeClause__Group__0__Impl rule__TypeClause__Group__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1220:2: rule__TypeClause__Group__0__Impl rule__TypeClause__Group__1
            {
            pushFollow(FOLLOW_rule__TypeClause__Group__0__Impl_in_rule__TypeClause__Group__02693);
            rule__TypeClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeClause__Group__1_in_rule__TypeClause__Group__02696);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1227:1: rule__TypeClause__Group__0__Impl : ( ( rule__TypeClause__NAssignment_0 )? ) ;
    public final void rule__TypeClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1231:1: ( ( ( rule__TypeClause__NAssignment_0 )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1232:1: ( ( rule__TypeClause__NAssignment_0 )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1232:1: ( ( rule__TypeClause__NAssignment_0 )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1233:1: ( rule__TypeClause__NAssignment_0 )?
            {
             before(grammarAccess.getTypeClauseAccess().getNAssignment_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1234:1: ( rule__TypeClause__NAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=17 && LA13_0<=19)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1234:2: rule__TypeClause__NAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TypeClause__NAssignment_0_in_rule__TypeClause__Group__0__Impl2723);
                    rule__TypeClause__NAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeClauseAccess().getNAssignment_0()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1244:1: rule__TypeClause__Group__1 : rule__TypeClause__Group__1__Impl rule__TypeClause__Group__2 ;
    public final void rule__TypeClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1248:1: ( rule__TypeClause__Group__1__Impl rule__TypeClause__Group__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1249:2: rule__TypeClause__Group__1__Impl rule__TypeClause__Group__2
            {
            pushFollow(FOLLOW_rule__TypeClause__Group__1__Impl_in_rule__TypeClause__Group__12754);
            rule__TypeClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeClause__Group__2_in_rule__TypeClause__Group__12757);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1256:1: rule__TypeClause__Group__1__Impl : ( ( rule__TypeClause__FieldAssignment_1 ) ) ;
    public final void rule__TypeClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1260:1: ( ( ( rule__TypeClause__FieldAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1261:1: ( ( rule__TypeClause__FieldAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1261:1: ( ( rule__TypeClause__FieldAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1262:1: ( rule__TypeClause__FieldAssignment_1 )
            {
             before(grammarAccess.getTypeClauseAccess().getFieldAssignment_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1263:1: ( rule__TypeClause__FieldAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1263:2: rule__TypeClause__FieldAssignment_1
            {
            pushFollow(FOLLOW_rule__TypeClause__FieldAssignment_1_in_rule__TypeClause__Group__1__Impl2784);
            rule__TypeClause__FieldAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeClauseAccess().getFieldAssignment_1()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1273:1: rule__TypeClause__Group__2 : rule__TypeClause__Group__2__Impl rule__TypeClause__Group__3 ;
    public final void rule__TypeClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1277:1: ( rule__TypeClause__Group__2__Impl rule__TypeClause__Group__3 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1278:2: rule__TypeClause__Group__2__Impl rule__TypeClause__Group__3
            {
            pushFollow(FOLLOW_rule__TypeClause__Group__2__Impl_in_rule__TypeClause__Group__22814);
            rule__TypeClause__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeClause__Group__3_in_rule__TypeClause__Group__22817);
            rule__TypeClause__Group__3();

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1285:1: rule__TypeClause__Group__2__Impl : ( ':' ) ;
    public final void rule__TypeClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1289:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1290:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1290:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1291:1: ':'
            {
             before(grammarAccess.getTypeClauseAccess().getColonKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__TypeClause__Group__2__Impl2845); 
             after(grammarAccess.getTypeClauseAccess().getColonKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__TypeClause__Group__3"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1304:1: rule__TypeClause__Group__3 : rule__TypeClause__Group__3__Impl ;
    public final void rule__TypeClause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1308:1: ( rule__TypeClause__Group__3__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1309:2: rule__TypeClause__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TypeClause__Group__3__Impl_in_rule__TypeClause__Group__32876);
            rule__TypeClause__Group__3__Impl();

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
    // $ANTLR end "rule__TypeClause__Group__3"


    // $ANTLR start "rule__TypeClause__Group__3__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1315:1: rule__TypeClause__Group__3__Impl : ( ( rule__TypeClause__ValueAssignment_3 ) ) ;
    public final void rule__TypeClause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1319:1: ( ( ( rule__TypeClause__ValueAssignment_3 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1320:1: ( ( rule__TypeClause__ValueAssignment_3 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1320:1: ( ( rule__TypeClause__ValueAssignment_3 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1321:1: ( rule__TypeClause__ValueAssignment_3 )
            {
             before(grammarAccess.getTypeClauseAccess().getValueAssignment_3()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1322:1: ( rule__TypeClause__ValueAssignment_3 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1322:2: rule__TypeClause__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__TypeClause__ValueAssignment_3_in_rule__TypeClause__Group__3__Impl2903);
            rule__TypeClause__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTypeClauseAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeClause__Group__3__Impl"


    // $ANTLR start "rule__FieldValue__Group_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1340:1: rule__FieldValue__Group_1__0 : rule__FieldValue__Group_1__0__Impl rule__FieldValue__Group_1__1 ;
    public final void rule__FieldValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1344:1: ( rule__FieldValue__Group_1__0__Impl rule__FieldValue__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1345:2: rule__FieldValue__Group_1__0__Impl rule__FieldValue__Group_1__1
            {
            pushFollow(FOLLOW_rule__FieldValue__Group_1__0__Impl_in_rule__FieldValue__Group_1__02941);
            rule__FieldValue__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldValue__Group_1__1_in_rule__FieldValue__Group_1__02944);
            rule__FieldValue__Group_1__1();

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
    // $ANTLR end "rule__FieldValue__Group_1__0"


    // $ANTLR start "rule__FieldValue__Group_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1352:1: rule__FieldValue__Group_1__0__Impl : ( '(' ) ;
    public final void rule__FieldValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1356:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1357:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1357:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1358:1: '('
            {
             before(grammarAccess.getFieldValueAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__FieldValue__Group_1__0__Impl2972); 
             after(grammarAccess.getFieldValueAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldValue__Group_1__0__Impl"


    // $ANTLR start "rule__FieldValue__Group_1__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1371:1: rule__FieldValue__Group_1__1 : rule__FieldValue__Group_1__1__Impl rule__FieldValue__Group_1__2 ;
    public final void rule__FieldValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1375:1: ( rule__FieldValue__Group_1__1__Impl rule__FieldValue__Group_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1376:2: rule__FieldValue__Group_1__1__Impl rule__FieldValue__Group_1__2
            {
            pushFollow(FOLLOW_rule__FieldValue__Group_1__1__Impl_in_rule__FieldValue__Group_1__13003);
            rule__FieldValue__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldValue__Group_1__2_in_rule__FieldValue__Group_1__13006);
            rule__FieldValue__Group_1__2();

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
    // $ANTLR end "rule__FieldValue__Group_1__1"


    // $ANTLR start "rule__FieldValue__Group_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1383:1: rule__FieldValue__Group_1__1__Impl : ( ( ruleValue )* ) ;
    public final void rule__FieldValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1387:1: ( ( ( ruleValue )* ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1388:1: ( ( ruleValue )* )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1388:1: ( ( ruleValue )* )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1389:1: ( ruleValue )*
            {
             before(grammarAccess.getFieldValueAccess().getValueParserRuleCall_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1390:1: ( ruleValue )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_ANY_OTHER)||(LA14_0>=11 && LA14_0<=12)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1390:3: ruleValue
            	    {
            	    pushFollow(FOLLOW_ruleValue_in_rule__FieldValue__Group_1__1__Impl3034);
            	    ruleValue();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getFieldValueAccess().getValueParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldValue__Group_1__1__Impl"


    // $ANTLR start "rule__FieldValue__Group_1__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1400:1: rule__FieldValue__Group_1__2 : rule__FieldValue__Group_1__2__Impl ;
    public final void rule__FieldValue__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1404:1: ( rule__FieldValue__Group_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1405:2: rule__FieldValue__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__FieldValue__Group_1__2__Impl_in_rule__FieldValue__Group_1__23065);
            rule__FieldValue__Group_1__2__Impl();

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
    // $ANTLR end "rule__FieldValue__Group_1__2"


    // $ANTLR start "rule__FieldValue__Group_1__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1411:1: rule__FieldValue__Group_1__2__Impl : ( ')' ) ;
    public final void rule__FieldValue__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1415:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1416:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1416:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1417:1: ')'
            {
             before(grammarAccess.getFieldValueAccess().getRightParenthesisKeyword_1_2()); 
            match(input,21,FOLLOW_21_in_rule__FieldValue__Group_1__2__Impl3093); 
             after(grammarAccess.getFieldValueAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldValue__Group_1__2__Impl"


    // $ANTLR start "rule__TypeValue__Group_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1436:1: rule__TypeValue__Group_1__0 : rule__TypeValue__Group_1__0__Impl rule__TypeValue__Group_1__1 ;
    public final void rule__TypeValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1440:1: ( rule__TypeValue__Group_1__0__Impl rule__TypeValue__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1441:2: rule__TypeValue__Group_1__0__Impl rule__TypeValue__Group_1__1
            {
            pushFollow(FOLLOW_rule__TypeValue__Group_1__0__Impl_in_rule__TypeValue__Group_1__03130);
            rule__TypeValue__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeValue__Group_1__1_in_rule__TypeValue__Group_1__03133);
            rule__TypeValue__Group_1__1();

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
    // $ANTLR end "rule__TypeValue__Group_1__0"


    // $ANTLR start "rule__TypeValue__Group_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1448:1: rule__TypeValue__Group_1__0__Impl : ( '(' ) ;
    public final void rule__TypeValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1452:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1453:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1453:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1454:1: '('
            {
             before(grammarAccess.getTypeValueAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__TypeValue__Group_1__0__Impl3161); 
             after(grammarAccess.getTypeValueAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeValue__Group_1__0__Impl"


    // $ANTLR start "rule__TypeValue__Group_1__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1467:1: rule__TypeValue__Group_1__1 : rule__TypeValue__Group_1__1__Impl rule__TypeValue__Group_1__2 ;
    public final void rule__TypeValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1471:1: ( rule__TypeValue__Group_1__1__Impl rule__TypeValue__Group_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1472:2: rule__TypeValue__Group_1__1__Impl rule__TypeValue__Group_1__2
            {
            pushFollow(FOLLOW_rule__TypeValue__Group_1__1__Impl_in_rule__TypeValue__Group_1__13192);
            rule__TypeValue__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeValue__Group_1__2_in_rule__TypeValue__Group_1__13195);
            rule__TypeValue__Group_1__2();

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
    // $ANTLR end "rule__TypeValue__Group_1__1"


    // $ANTLR start "rule__TypeValue__Group_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1479:1: rule__TypeValue__Group_1__1__Impl : ( ( ruleValue )* ) ;
    public final void rule__TypeValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1483:1: ( ( ( ruleValue )* ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1484:1: ( ( ruleValue )* )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1484:1: ( ( ruleValue )* )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1485:1: ( ruleValue )*
            {
             before(grammarAccess.getTypeValueAccess().getValueParserRuleCall_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1486:1: ( ruleValue )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_ANY_OTHER)||(LA15_0>=11 && LA15_0<=12)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1486:3: ruleValue
            	    {
            	    pushFollow(FOLLOW_ruleValue_in_rule__TypeValue__Group_1__1__Impl3223);
            	    ruleValue();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getTypeValueAccess().getValueParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeValue__Group_1__1__Impl"


    // $ANTLR start "rule__TypeValue__Group_1__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1496:1: rule__TypeValue__Group_1__2 : rule__TypeValue__Group_1__2__Impl ;
    public final void rule__TypeValue__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1500:1: ( rule__TypeValue__Group_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1501:2: rule__TypeValue__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeValue__Group_1__2__Impl_in_rule__TypeValue__Group_1__23254);
            rule__TypeValue__Group_1__2__Impl();

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
    // $ANTLR end "rule__TypeValue__Group_1__2"


    // $ANTLR start "rule__TypeValue__Group_1__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1507:1: rule__TypeValue__Group_1__2__Impl : ( ')' ) ;
    public final void rule__TypeValue__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1511:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1512:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1512:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1513:1: ')'
            {
             before(grammarAccess.getTypeValueAccess().getRightParenthesisKeyword_1_2()); 
            match(input,21,FOLLOW_21_in_rule__TypeValue__Group_1__2__Impl3282); 
             after(grammarAccess.getTypeValueAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeValue__Group_1__2__Impl"


    // $ANTLR start "rule__Value__Group__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1532:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1536:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1537:2: rule__Value__Group__0__Impl rule__Value__Group__1
            {
            pushFollow(FOLLOW_rule__Value__Group__0__Impl_in_rule__Value__Group__03319);
            rule__Value__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Value__Group__1_in_rule__Value__Group__03322);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1544:1: rule__Value__Group__0__Impl : ( ( rule__Value__Alternatives_0 )? ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1548:1: ( ( ( rule__Value__Alternatives_0 )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1549:1: ( ( rule__Value__Alternatives_0 )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1549:1: ( ( rule__Value__Alternatives_0 )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1550:1: ( rule__Value__Alternatives_0 )?
            {
             before(grammarAccess.getValueAccess().getAlternatives_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1551:1: ( rule__Value__Alternatives_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=11 && LA16_0<=12)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1551:2: rule__Value__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__Value__Alternatives_0_in_rule__Value__Group__0__Impl3349);
                    rule__Value__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getValueAccess().getAlternatives_0()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1561:1: rule__Value__Group__1 : rule__Value__Group__1__Impl ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1565:1: ( rule__Value__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1566:2: rule__Value__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Value__Group__1__Impl_in_rule__Value__Group__13380);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1572:1: rule__Value__Group__1__Impl : ( ( rule__Value__Alternatives_1 ) ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1576:1: ( ( ( rule__Value__Alternatives_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1577:1: ( ( rule__Value__Alternatives_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1577:1: ( ( rule__Value__Alternatives_1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1578:1: ( rule__Value__Alternatives_1 )
            {
             before(grammarAccess.getValueAccess().getAlternatives_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1579:1: ( rule__Value__Alternatives_1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1579:2: rule__Value__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_1_in_rule__Value__Group__1__Impl3407);
            rule__Value__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Exp1__BAssignment_1_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1594:1: rule__Exp1__BAssignment_1_1 : ( ruleBooleanExp ) ;
    public final void rule__Exp1__BAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1598:1: ( ( ruleBooleanExp ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1599:1: ( ruleBooleanExp )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1599:1: ( ruleBooleanExp )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1600:1: ruleBooleanExp
            {
             before(grammarAccess.getExp1Access().getBBooleanExpEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleBooleanExp_in_rule__Exp1__BAssignment_1_13446);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1609:1: rule__Exp1__RightAssignment_1_2 : ( ruleExp2 ) ;
    public final void rule__Exp1__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1613:1: ( ( ruleExp2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1614:1: ( ruleExp2 )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1614:1: ( ruleExp2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1615:1: ruleExp2
            {
             before(grammarAccess.getExp1Access().getRightExp2ParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleExp2_in_rule__Exp1__RightAssignment_1_23477);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1624:1: rule__Exp2__ValueAssignment_0 : ( ruleClauseExpression ) ;
    public final void rule__Exp2__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1628:1: ( ( ruleClauseExpression ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1629:1: ( ruleClauseExpression )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1629:1: ( ruleClauseExpression )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1630:1: ruleClauseExpression
            {
             before(grammarAccess.getExp2Access().getValueClauseExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleClauseExpression_in_rule__Exp2__ValueAssignment_03508);
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


    // $ANTLR start "rule__ClauseExpression__ClauseAssignment_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1639:1: rule__ClauseExpression__ClauseAssignment_0 : ( ruleSimpleClause ) ;
    public final void rule__ClauseExpression__ClauseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1643:1: ( ( ruleSimpleClause ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1644:1: ( ruleSimpleClause )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1644:1: ( ruleSimpleClause )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1645:1: ruleSimpleClause
            {
             before(grammarAccess.getClauseExpressionAccess().getClauseSimpleClauseParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSimpleClause_in_rule__ClauseExpression__ClauseAssignment_03539);
            ruleSimpleClause();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getClauseSimpleClauseParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ClauseAssignment_0"


    // $ANTLR start "rule__ClauseExpression__ClauseAssignment_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1654:1: rule__ClauseExpression__ClauseAssignment_1 : ( ruleTypeClause ) ;
    public final void rule__ClauseExpression__ClauseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1658:1: ( ( ruleTypeClause ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1659:1: ( ruleTypeClause )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1659:1: ( ruleTypeClause )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1660:1: ruleTypeClause
            {
             before(grammarAccess.getClauseExpressionAccess().getClauseTypeClauseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeClause_in_rule__ClauseExpression__ClauseAssignment_13570);
            ruleTypeClause();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getClauseTypeClauseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ClauseAssignment_1"


    // $ANTLR start "rule__SimpleClause__NAssignment_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1669:1: rule__SimpleClause__NAssignment_0 : ( ruleNotExpression ) ;
    public final void rule__SimpleClause__NAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1673:1: ( ( ruleNotExpression ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1674:1: ( ruleNotExpression )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1674:1: ( ruleNotExpression )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1675:1: ruleNotExpression
            {
             before(grammarAccess.getSimpleClauseAccess().getNNotExpressionEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNotExpression_in_rule__SimpleClause__NAssignment_03601);
            ruleNotExpression();

            state._fsp--;

             after(grammarAccess.getSimpleClauseAccess().getNNotExpressionEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClause__NAssignment_0"


    // $ANTLR start "rule__SimpleClause__FieldAssignment_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1684:1: rule__SimpleClause__FieldAssignment_1 : ( ruleFieldName ) ;
    public final void rule__SimpleClause__FieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1688:1: ( ( ruleFieldName ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1689:1: ( ruleFieldName )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1689:1: ( ruleFieldName )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1690:1: ruleFieldName
            {
             before(grammarAccess.getSimpleClauseAccess().getFieldFieldNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFieldName_in_rule__SimpleClause__FieldAssignment_13632);
            ruleFieldName();

            state._fsp--;

             after(grammarAccess.getSimpleClauseAccess().getFieldFieldNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClause__FieldAssignment_1"


    // $ANTLR start "rule__SimpleClause__ValueAssignment_3"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1699:1: rule__SimpleClause__ValueAssignment_3 : ( ruleFieldValue ) ;
    public final void rule__SimpleClause__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1703:1: ( ( ruleFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1704:1: ( ruleFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1704:1: ( ruleFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1705:1: ruleFieldValue
            {
             before(grammarAccess.getSimpleClauseAccess().getValueFieldValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFieldValue_in_rule__SimpleClause__ValueAssignment_33663);
            ruleFieldValue();

            state._fsp--;

             after(grammarAccess.getSimpleClauseAccess().getValueFieldValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClause__ValueAssignment_3"


    // $ANTLR start "rule__TypeClause__NAssignment_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1714:1: rule__TypeClause__NAssignment_0 : ( ruleNotExpression ) ;
    public final void rule__TypeClause__NAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1718:1: ( ( ruleNotExpression ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1719:1: ( ruleNotExpression )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1719:1: ( ruleNotExpression )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1720:1: ruleNotExpression
            {
             before(grammarAccess.getTypeClauseAccess().getNNotExpressionEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNotExpression_in_rule__TypeClause__NAssignment_03694);
            ruleNotExpression();

            state._fsp--;

             after(grammarAccess.getTypeClauseAccess().getNNotExpressionEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeClause__NAssignment_0"


    // $ANTLR start "rule__TypeClause__FieldAssignment_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1729:1: rule__TypeClause__FieldAssignment_1 : ( ruleTypeFieldName ) ;
    public final void rule__TypeClause__FieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1733:1: ( ( ruleTypeFieldName ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1734:1: ( ruleTypeFieldName )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1734:1: ( ruleTypeFieldName )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1735:1: ruleTypeFieldName
            {
             before(grammarAccess.getTypeClauseAccess().getFieldTypeFieldNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeFieldName_in_rule__TypeClause__FieldAssignment_13725);
            ruleTypeFieldName();

            state._fsp--;

             after(grammarAccess.getTypeClauseAccess().getFieldTypeFieldNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeClause__FieldAssignment_1"


    // $ANTLR start "rule__TypeClause__ValueAssignment_3"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1744:1: rule__TypeClause__ValueAssignment_3 : ( ruleTypeValue ) ;
    public final void rule__TypeClause__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1748:1: ( ( ruleTypeValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1749:1: ( ruleTypeValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1749:1: ( ruleTypeValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1750:1: ruleTypeValue
            {
             before(grammarAccess.getTypeClauseAccess().getValueTypeValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeValue_in_rule__TypeClause__ValueAssignment_33756);
            ruleTypeValue();

            state._fsp--;

             after(grammarAccess.getTypeClauseAccess().getValueTypeValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeClause__ValueAssignment_3"


    // $ANTLR start "rule__FieldName__FullyQualifiedNameAssignment_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1759:1: rule__FieldName__FullyQualifiedNameAssignment_0 : ( ( 'FullyQualifiedName' ) ) ;
    public final void rule__FieldName__FullyQualifiedNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1763:1: ( ( ( 'FullyQualifiedName' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1764:1: ( ( 'FullyQualifiedName' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1764:1: ( ( 'FullyQualifiedName' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1765:1: ( 'FullyQualifiedName' )
            {
             before(grammarAccess.getFieldNameAccess().getFullyQualifiedNameFullyQualifiedNameKeyword_0_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1766:1: ( 'FullyQualifiedName' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1767:1: 'FullyQualifiedName'
            {
             before(grammarAccess.getFieldNameAccess().getFullyQualifiedNameFullyQualifiedNameKeyword_0_0()); 
            match(input,23,FOLLOW_23_in_rule__FieldName__FullyQualifiedNameAssignment_03792); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1782:1: rule__FieldName__TypeAssignment_1 : ( ( 'Type' ) ) ;
    public final void rule__FieldName__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1786:1: ( ( ( 'Type' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1787:1: ( ( 'Type' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1787:1: ( ( 'Type' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1788:1: ( 'Type' )
            {
             before(grammarAccess.getFieldNameAccess().getTypeTypeKeyword_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1789:1: ( 'Type' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1790:1: 'Type'
            {
             before(grammarAccess.getFieldNameAccess().getTypeTypeKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__FieldName__TypeAssignment_13836); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1805:1: rule__FieldName__FriendlyNameAssignment_2 : ( ( 'FriendlyName' ) ) ;
    public final void rule__FieldName__FriendlyNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1809:1: ( ( ( 'FriendlyName' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1810:1: ( ( 'FriendlyName' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1810:1: ( ( 'FriendlyName' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1811:1: ( 'FriendlyName' )
            {
             before(grammarAccess.getFieldNameAccess().getFriendlyNameFriendlyNameKeyword_2_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1812:1: ( 'FriendlyName' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1813:1: 'FriendlyName'
            {
             before(grammarAccess.getFieldNameAccess().getFriendlyNameFriendlyNameKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__FieldName__FriendlyNameAssignment_23880); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1828:1: rule__FieldName__DeclaredMethodsAssignment_3 : ( ( 'DeclaredMethods' ) ) ;
    public final void rule__FieldName__DeclaredMethodsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1832:1: ( ( ( 'DeclaredMethods' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1833:1: ( ( 'DeclaredMethods' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1833:1: ( ( 'DeclaredMethods' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1834:1: ( 'DeclaredMethods' )
            {
             before(grammarAccess.getFieldNameAccess().getDeclaredMethodsDeclaredMethodsKeyword_3_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1835:1: ( 'DeclaredMethods' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1836:1: 'DeclaredMethods'
            {
             before(grammarAccess.getFieldNameAccess().getDeclaredMethodsDeclaredMethodsKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__FieldName__DeclaredMethodsAssignment_33924); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1851:1: rule__FieldName__ParameterCountAssignment_4 : ( ( 'ParameterCount' ) ) ;
    public final void rule__FieldName__ParameterCountAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1855:1: ( ( ( 'ParameterCount' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1856:1: ( ( 'ParameterCount' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1856:1: ( ( 'ParameterCount' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1857:1: ( 'ParameterCount' )
            {
             before(grammarAccess.getFieldNameAccess().getParameterCountParameterCountKeyword_4_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1858:1: ( 'ParameterCount' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1859:1: 'ParameterCount'
            {
             before(grammarAccess.getFieldNameAccess().getParameterCountParameterCountKeyword_4_0()); 
            match(input,27,FOLLOW_27_in_rule__FieldName__ParameterCountAssignment_43968); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1874:1: rule__FieldName__ReturnVariableEexpressionsAssignment_5 : ( ( 'ReturnVariableEexpressions' ) ) ;
    public final void rule__FieldName__ReturnVariableEexpressionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1878:1: ( ( ( 'ReturnVariableEexpressions' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1879:1: ( ( 'ReturnVariableEexpressions' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1879:1: ( ( 'ReturnVariableEexpressions' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1880:1: ( 'ReturnVariableEexpressions' )
            {
             before(grammarAccess.getFieldNameAccess().getReturnVariableEexpressionsReturnVariableEexpressionsKeyword_5_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1881:1: ( 'ReturnVariableEexpressions' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1882:1: 'ReturnVariableEexpressions'
            {
             before(grammarAccess.getFieldNameAccess().getReturnVariableEexpressionsReturnVariableEexpressionsKeyword_5_0()); 
            match(input,28,FOLLOW_28_in_rule__FieldName__ReturnVariableEexpressionsAssignment_54012); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1897:1: rule__FieldName__UsedMethodsAssignment_6 : ( ( 'UsedMethods' ) ) ;
    public final void rule__FieldName__UsedMethodsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1901:1: ( ( ( 'UsedMethods' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1902:1: ( ( 'UsedMethods' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1902:1: ( ( 'UsedMethods' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1903:1: ( 'UsedMethods' )
            {
             before(grammarAccess.getFieldNameAccess().getUsedMethodsUsedMethodsKeyword_6_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1904:1: ( 'UsedMethods' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1905:1: 'UsedMethods'
            {
             before(grammarAccess.getFieldNameAccess().getUsedMethodsUsedMethodsKeyword_6_0()); 
            match(input,29,FOLLOW_29_in_rule__FieldName__UsedMethodsAssignment_64056); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1920:1: rule__FieldName__UsedMethodsInTryAssignment_7 : ( ( 'UsedMethodsInTry' ) ) ;
    public final void rule__FieldName__UsedMethodsInTryAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1924:1: ( ( ( 'UsedMethodsInTry' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1925:1: ( ( 'UsedMethodsInTry' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1925:1: ( ( 'UsedMethodsInTry' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1926:1: ( 'UsedMethodsInTry' )
            {
             before(grammarAccess.getFieldNameAccess().getUsedMethodsInTryUsedMethodsInTryKeyword_7_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1927:1: ( 'UsedMethodsInTry' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1928:1: 'UsedMethodsInTry'
            {
             before(grammarAccess.getFieldNameAccess().getUsedMethodsInTryUsedMethodsInTryKeyword_7_0()); 
            match(input,30,FOLLOW_30_in_rule__FieldName__UsedMethodsInTryAssignment_74100); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1943:1: rule__FieldName__UsedMethodsInFinallyAssignment_8 : ( ( 'UsedMethodsInFinally' ) ) ;
    public final void rule__FieldName__UsedMethodsInFinallyAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1947:1: ( ( ( 'UsedMethodsInFinally' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1948:1: ( ( 'UsedMethodsInFinally' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1948:1: ( ( 'UsedMethodsInFinally' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1949:1: ( 'UsedMethodsInFinally' )
            {
             before(grammarAccess.getFieldNameAccess().getUsedMethodsInFinallyUsedMethodsInFinallyKeyword_8_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1950:1: ( 'UsedMethodsInFinally' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1951:1: 'UsedMethodsInFinally'
            {
             before(grammarAccess.getFieldNameAccess().getUsedMethodsInFinallyUsedMethodsInFinallyKeyword_8_0()); 
            match(input,31,FOLLOW_31_in_rule__FieldName__UsedMethodsInFinallyAssignment_84144); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1966:1: rule__FieldName__OverriddenMethodsAssignment_9 : ( ( 'OverriddenMethods' ) ) ;
    public final void rule__FieldName__OverriddenMethodsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1970:1: ( ( ( 'OverriddenMethods' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1971:1: ( ( 'OverriddenMethods' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1971:1: ( ( 'OverriddenMethods' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1972:1: ( 'OverriddenMethods' )
            {
             before(grammarAccess.getFieldNameAccess().getOverriddenMethodsOverriddenMethodsKeyword_9_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1973:1: ( 'OverriddenMethods' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1974:1: 'OverriddenMethods'
            {
             before(grammarAccess.getFieldNameAccess().getOverriddenMethodsOverriddenMethodsKeyword_9_0()); 
            match(input,32,FOLLOW_32_in_rule__FieldName__OverriddenMethodsAssignment_94188); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1989:1: rule__FieldName__ProjectNameAssignment_10 : ( ( 'ProjectName' ) ) ;
    public final void rule__FieldName__ProjectNameAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1993:1: ( ( ( 'ProjectName' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1994:1: ( ( 'ProjectName' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1994:1: ( ( 'ProjectName' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1995:1: ( 'ProjectName' )
            {
             before(grammarAccess.getFieldNameAccess().getProjectNameProjectNameKeyword_10_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1996:1: ( 'ProjectName' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1997:1: 'ProjectName'
            {
             before(grammarAccess.getFieldNameAccess().getProjectNameProjectNameKeyword_10_0()); 
            match(input,33,FOLLOW_33_in_rule__FieldName__ProjectNameAssignment_104232); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2012:1: rule__FieldName__ResourcePathAssignment_11 : ( ( 'ResourcePath' ) ) ;
    public final void rule__FieldName__ResourcePathAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2016:1: ( ( ( 'ResourcePath' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2017:1: ( ( 'ResourcePath' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2017:1: ( ( 'ResourcePath' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2018:1: ( 'ResourcePath' )
            {
             before(grammarAccess.getFieldNameAccess().getResourcePathResourcePathKeyword_11_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2019:1: ( 'ResourcePath' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2020:1: 'ResourcePath'
            {
             before(grammarAccess.getFieldNameAccess().getResourcePathResourcePathKeyword_11_0()); 
            match(input,34,FOLLOW_34_in_rule__FieldName__ResourcePathAssignment_114276); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2035:1: rule__FieldName__ModifiersAssignment_12 : ( ( 'Modifiers' ) ) ;
    public final void rule__FieldName__ModifiersAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2039:1: ( ( ( 'Modifiers' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2040:1: ( ( 'Modifiers' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2040:1: ( ( 'Modifiers' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2041:1: ( 'Modifiers' )
            {
             before(grammarAccess.getFieldNameAccess().getModifiersModifiersKeyword_12_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2042:1: ( 'Modifiers' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2043:1: 'Modifiers'
            {
             before(grammarAccess.getFieldNameAccess().getModifiersModifiersKeyword_12_0()); 
            match(input,35,FOLLOW_35_in_rule__FieldName__ModifiersAssignment_124320); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2058:1: rule__FieldName__AllDeclaredMethodNamesAssignment_13 : ( ( 'AllDeclaredMethodNames' ) ) ;
    public final void rule__FieldName__AllDeclaredMethodNamesAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2062:1: ( ( ( 'AllDeclaredMethodNames' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2063:1: ( ( 'AllDeclaredMethodNames' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2063:1: ( ( 'AllDeclaredMethodNames' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2064:1: ( 'AllDeclaredMethodNames' )
            {
             before(grammarAccess.getFieldNameAccess().getAllDeclaredMethodNamesAllDeclaredMethodNamesKeyword_13_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2065:1: ( 'AllDeclaredMethodNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2066:1: 'AllDeclaredMethodNames'
            {
             before(grammarAccess.getFieldNameAccess().getAllDeclaredMethodNamesAllDeclaredMethodNamesKeyword_13_0()); 
            match(input,36,FOLLOW_36_in_rule__FieldName__AllDeclaredMethodNamesAssignment_134364); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2081:1: rule__FieldName__DeclaredMethodNamesAssignment_14 : ( ( 'DeclaredMethodNames' ) ) ;
    public final void rule__FieldName__DeclaredMethodNamesAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2085:1: ( ( ( 'DeclaredMethodNames' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2086:1: ( ( 'DeclaredMethodNames' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2086:1: ( ( 'DeclaredMethodNames' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2087:1: ( 'DeclaredMethodNames' )
            {
             before(grammarAccess.getFieldNameAccess().getDeclaredMethodNamesDeclaredMethodNamesKeyword_14_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2088:1: ( 'DeclaredMethodNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2089:1: 'DeclaredMethodNames'
            {
             before(grammarAccess.getFieldNameAccess().getDeclaredMethodNamesDeclaredMethodNamesKeyword_14_0()); 
            match(input,37,FOLLOW_37_in_rule__FieldName__DeclaredMethodNamesAssignment_144408); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2104:1: rule__FieldName__DeclaredFieldNamesAssignment_15 : ( ( 'DeclaredFieldNames' ) ) ;
    public final void rule__FieldName__DeclaredFieldNamesAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2108:1: ( ( ( 'DeclaredFieldNames' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2109:1: ( ( 'DeclaredFieldNames' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2109:1: ( ( 'DeclaredFieldNames' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2110:1: ( 'DeclaredFieldNames' )
            {
             before(grammarAccess.getFieldNameAccess().getDeclaredFieldNamesDeclaredFieldNamesKeyword_15_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2111:1: ( 'DeclaredFieldNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2112:1: 'DeclaredFieldNames'
            {
             before(grammarAccess.getFieldNameAccess().getDeclaredFieldNamesDeclaredFieldNamesKeyword_15_0()); 
            match(input,38,FOLLOW_38_in_rule__FieldName__DeclaredFieldNamesAssignment_154452); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2127:1: rule__FieldName__DeclaredFieldTypesAssignment_16 : ( ( 'DeclaredFieldTypes' ) ) ;
    public final void rule__FieldName__DeclaredFieldTypesAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2131:1: ( ( ( 'DeclaredFieldTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2132:1: ( ( 'DeclaredFieldTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2132:1: ( ( 'DeclaredFieldTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2133:1: ( 'DeclaredFieldTypes' )
            {
             before(grammarAccess.getFieldNameAccess().getDeclaredFieldTypesDeclaredFieldTypesKeyword_16_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2134:1: ( 'DeclaredFieldTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2135:1: 'DeclaredFieldTypes'
            {
             before(grammarAccess.getFieldNameAccess().getDeclaredFieldTypesDeclaredFieldTypesKeyword_16_0()); 
            match(input,39,FOLLOW_39_in_rule__FieldName__DeclaredFieldTypesAssignment_164496); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2150:1: rule__FieldName__AllDeclaredFieldNamesAssignment_17 : ( ( 'AllDeclaredFieldNames' ) ) ;
    public final void rule__FieldName__AllDeclaredFieldNamesAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2154:1: ( ( ( 'AllDeclaredFieldNames' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2155:1: ( ( 'AllDeclaredFieldNames' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2155:1: ( ( 'AllDeclaredFieldNames' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2156:1: ( 'AllDeclaredFieldNames' )
            {
             before(grammarAccess.getFieldNameAccess().getAllDeclaredFieldNamesAllDeclaredFieldNamesKeyword_17_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2157:1: ( 'AllDeclaredFieldNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2158:1: 'AllDeclaredFieldNames'
            {
             before(grammarAccess.getFieldNameAccess().getAllDeclaredFieldNamesAllDeclaredFieldNamesKeyword_17_0()); 
            match(input,40,FOLLOW_40_in_rule__FieldName__AllDeclaredFieldNamesAssignment_174540); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2173:1: rule__FieldName__FullTextAssignment_18 : ( ( 'FullText' ) ) ;
    public final void rule__FieldName__FullTextAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2177:1: ( ( ( 'FullText' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2178:1: ( ( 'FullText' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2178:1: ( ( 'FullText' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2179:1: ( 'FullText' )
            {
             before(grammarAccess.getFieldNameAccess().getFullTextFullTextKeyword_18_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2180:1: ( 'FullText' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2181:1: 'FullText'
            {
             before(grammarAccess.getFieldNameAccess().getFullTextFullTextKeyword_18_0()); 
            match(input,41,FOLLOW_41_in_rule__FieldName__FullTextAssignment_184584); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2196:1: rule__FieldName__FieldsReadAssignment_19 : ( ( 'FieldsRead' ) ) ;
    public final void rule__FieldName__FieldsReadAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2200:1: ( ( ( 'FieldsRead' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2201:1: ( ( 'FieldsRead' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2201:1: ( ( 'FieldsRead' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2202:1: ( 'FieldsRead' )
            {
             before(grammarAccess.getFieldNameAccess().getFieldsReadFieldsReadKeyword_19_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2203:1: ( 'FieldsRead' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2204:1: 'FieldsRead'
            {
             before(grammarAccess.getFieldNameAccess().getFieldsReadFieldsReadKeyword_19_0()); 
            match(input,42,FOLLOW_42_in_rule__FieldName__FieldsReadAssignment_194628); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2219:1: rule__FieldName__FieldsWrittenAssignment_20 : ( ( 'FieldsWritten' ) ) ;
    public final void rule__FieldName__FieldsWrittenAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2223:1: ( ( ( 'FieldsWritten' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2224:1: ( ( 'FieldsWritten' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2224:1: ( ( 'FieldsWritten' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2225:1: ( 'FieldsWritten' )
            {
             before(grammarAccess.getFieldNameAccess().getFieldsWrittenFieldsWrittenKeyword_20_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2226:1: ( 'FieldsWritten' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2227:1: 'FieldsWritten'
            {
             before(grammarAccess.getFieldNameAccess().getFieldsWrittenFieldsWrittenKeyword_20_0()); 
            match(input,43,FOLLOW_43_in_rule__FieldName__FieldsWrittenAssignment_204672); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2242:1: rule__FieldName__UsedFieldsInFinallyAssignment_21 : ( ( 'UsedFieldsInFinally' ) ) ;
    public final void rule__FieldName__UsedFieldsInFinallyAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2246:1: ( ( ( 'UsedFieldsInFinally' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2247:1: ( ( 'UsedFieldsInFinally' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2247:1: ( ( 'UsedFieldsInFinally' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2248:1: ( 'UsedFieldsInFinally' )
            {
             before(grammarAccess.getFieldNameAccess().getUsedFieldsInFinallyUsedFieldsInFinallyKeyword_21_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2249:1: ( 'UsedFieldsInFinally' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2250:1: 'UsedFieldsInFinally'
            {
             before(grammarAccess.getFieldNameAccess().getUsedFieldsInFinallyUsedFieldsInFinallyKeyword_21_0()); 
            match(input,44,FOLLOW_44_in_rule__FieldName__UsedFieldsInFinallyAssignment_214716); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2265:1: rule__FieldName__UsedFieldsInTryAssignment_22 : ( ( 'UsedFieldsInTry' ) ) ;
    public final void rule__FieldName__UsedFieldsInTryAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2269:1: ( ( ( 'UsedFieldsInTry' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2270:1: ( ( 'UsedFieldsInTry' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2270:1: ( ( 'UsedFieldsInTry' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2271:1: ( 'UsedFieldsInTry' )
            {
             before(grammarAccess.getFieldNameAccess().getUsedFieldsInTryUsedFieldsInTryKeyword_22_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2272:1: ( 'UsedFieldsInTry' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2273:1: 'UsedFieldsInTry'
            {
             before(grammarAccess.getFieldNameAccess().getUsedFieldsInTryUsedFieldsInTryKeyword_22_0()); 
            match(input,45,FOLLOW_45_in_rule__FieldName__UsedFieldsInTryAssignment_224760); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2288:1: rule__FieldName__AnnotationsAssignment_23 : ( ( 'Annotations' ) ) ;
    public final void rule__FieldName__AnnotationsAssignment_23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2292:1: ( ( ( 'Annotations' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2293:1: ( ( 'Annotations' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2293:1: ( ( 'Annotations' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2294:1: ( 'Annotations' )
            {
             before(grammarAccess.getFieldNameAccess().getAnnotationsAnnotationsKeyword_23_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2295:1: ( 'Annotations' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2296:1: 'Annotations'
            {
             before(grammarAccess.getFieldNameAccess().getAnnotationsAnnotationsKeyword_23_0()); 
            match(input,46,FOLLOW_46_in_rule__FieldName__AnnotationsAssignment_234804); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2311:1: rule__FieldName__TimestampAssignment_24 : ( ( 'Timestamp' ) ) ;
    public final void rule__FieldName__TimestampAssignment_24() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2315:1: ( ( ( 'Timestamp' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2316:1: ( ( 'Timestamp' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2316:1: ( ( 'Timestamp' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2317:1: ( 'Timestamp' )
            {
             before(grammarAccess.getFieldNameAccess().getTimestampTimestampKeyword_24_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2318:1: ( 'Timestamp' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2319:1: 'Timestamp'
            {
             before(grammarAccess.getFieldNameAccess().getTimestampTimestampKeyword_24_0()); 
            match(input,47,FOLLOW_47_in_rule__FieldName__TimestampAssignment_244848); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2334:1: rule__TypeFieldName__ImplementedTypesAssignment_0 : ( ( 'ImplementedTypes' ) ) ;
    public final void rule__TypeFieldName__ImplementedTypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2338:1: ( ( ( 'ImplementedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2339:1: ( ( 'ImplementedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2339:1: ( ( 'ImplementedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2340:1: ( 'ImplementedTypes' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getImplementedTypesImplementedTypesKeyword_0_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2341:1: ( 'ImplementedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2342:1: 'ImplementedTypes'
            {
             before(grammarAccess.getTypeFieldNameAccess().getImplementedTypesImplementedTypesKeyword_0_0()); 
            match(input,48,FOLLOW_48_in_rule__TypeFieldName__ImplementedTypesAssignment_04892); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2357:1: rule__TypeFieldName__ExtendedTypesAssignment_1 : ( ( 'ExtendedTypes' ) ) ;
    public final void rule__TypeFieldName__ExtendedTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2361:1: ( ( ( 'ExtendedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2362:1: ( ( 'ExtendedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2362:1: ( ( 'ExtendedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2363:1: ( 'ExtendedTypes' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getExtendedTypesExtendedTypesKeyword_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2364:1: ( 'ExtendedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2365:1: 'ExtendedTypes'
            {
             before(grammarAccess.getTypeFieldNameAccess().getExtendedTypesExtendedTypesKeyword_1_0()); 
            match(input,49,FOLLOW_49_in_rule__TypeFieldName__ExtendedTypesAssignment_14936); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2380:1: rule__TypeFieldName__UsedTypesAssignment_2 : ( ( 'UsedTypes' ) ) ;
    public final void rule__TypeFieldName__UsedTypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2384:1: ( ( ( 'UsedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2385:1: ( ( 'UsedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2385:1: ( ( 'UsedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2386:1: ( 'UsedTypes' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getUsedTypesUsedTypesKeyword_2_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2387:1: ( 'UsedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2388:1: 'UsedTypes'
            {
             before(grammarAccess.getTypeFieldNameAccess().getUsedTypesUsedTypesKeyword_2_0()); 
            match(input,50,FOLLOW_50_in_rule__TypeFieldName__UsedTypesAssignment_24980); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2403:1: rule__TypeFieldName__UsedTypesInTryAssignment_3 : ( ( 'UsedTypesInTry' ) ) ;
    public final void rule__TypeFieldName__UsedTypesInTryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2407:1: ( ( ( 'UsedTypesInTry' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2408:1: ( ( 'UsedTypesInTry' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2408:1: ( ( 'UsedTypesInTry' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2409:1: ( 'UsedTypesInTry' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getUsedTypesInTryUsedTypesInTryKeyword_3_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2410:1: ( 'UsedTypesInTry' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2411:1: 'UsedTypesInTry'
            {
             before(grammarAccess.getTypeFieldNameAccess().getUsedTypesInTryUsedTypesInTryKeyword_3_0()); 
            match(input,51,FOLLOW_51_in_rule__TypeFieldName__UsedTypesInTryAssignment_35024); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2426:1: rule__TypeFieldName__UsedTypesInFinallyAssignment_4 : ( ( 'UsedTypesInFinally' ) ) ;
    public final void rule__TypeFieldName__UsedTypesInFinallyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2430:1: ( ( ( 'UsedTypesInFinally' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2431:1: ( ( 'UsedTypesInFinally' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2431:1: ( ( 'UsedTypesInFinally' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2432:1: ( 'UsedTypesInFinally' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getUsedTypesInFinallyUsedTypesInFinallyKeyword_4_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2433:1: ( 'UsedTypesInFinally' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2434:1: 'UsedTypesInFinally'
            {
             before(grammarAccess.getTypeFieldNameAccess().getUsedTypesInFinallyUsedTypesInFinallyKeyword_4_0()); 
            match(input,52,FOLLOW_52_in_rule__TypeFieldName__UsedTypesInFinallyAssignment_45068); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2449:1: rule__TypeFieldName__ParameterTypesAssignment_5 : ( ( 'ParameterTypes' ) ) ;
    public final void rule__TypeFieldName__ParameterTypesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2453:1: ( ( ( 'ParameterTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2454:1: ( ( 'ParameterTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2454:1: ( ( 'ParameterTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2455:1: ( 'ParameterTypes' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getParameterTypesParameterTypesKeyword_5_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2456:1: ( 'ParameterTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2457:1: 'ParameterTypes'
            {
             before(grammarAccess.getTypeFieldNameAccess().getParameterTypesParameterTypesKeyword_5_0()); 
            match(input,53,FOLLOW_53_in_rule__TypeFieldName__ParameterTypesAssignment_55112); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2472:1: rule__TypeFieldName__ReturnTypeAssignment_6 : ( ( 'ReturnType' ) ) ;
    public final void rule__TypeFieldName__ReturnTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2476:1: ( ( ( 'ReturnType' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2477:1: ( ( 'ReturnType' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2477:1: ( ( 'ReturnType' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2478:1: ( 'ReturnType' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getReturnTypeReturnTypeKeyword_6_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2479:1: ( 'ReturnType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2480:1: 'ReturnType'
            {
             before(grammarAccess.getTypeFieldNameAccess().getReturnTypeReturnTypeKeyword_6_0()); 
            match(input,54,FOLLOW_54_in_rule__TypeFieldName__ReturnTypeAssignment_65156); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2495:1: rule__TypeFieldName__AllImplementedTypesAssignment_7 : ( ( 'AllImplementedTypes' ) ) ;
    public final void rule__TypeFieldName__AllImplementedTypesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2499:1: ( ( ( 'AllImplementedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2500:1: ( ( 'AllImplementedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2500:1: ( ( 'AllImplementedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2501:1: ( 'AllImplementedTypes' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getAllImplementedTypesAllImplementedTypesKeyword_7_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2502:1: ( 'AllImplementedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2503:1: 'AllImplementedTypes'
            {
             before(grammarAccess.getTypeFieldNameAccess().getAllImplementedTypesAllImplementedTypesKeyword_7_0()); 
            match(input,55,FOLLOW_55_in_rule__TypeFieldName__AllImplementedTypesAssignment_75200); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2518:1: rule__TypeFieldName__AllExtendedTypesAssignment_8 : ( ( 'AllExtendedTypes' ) ) ;
    public final void rule__TypeFieldName__AllExtendedTypesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2522:1: ( ( ( 'AllExtendedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2523:1: ( ( 'AllExtendedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2523:1: ( ( 'AllExtendedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2524:1: ( 'AllExtendedTypes' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getAllExtendedTypesAllExtendedTypesKeyword_8_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2525:1: ( 'AllExtendedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2526:1: 'AllExtendedTypes'
            {
             before(grammarAccess.getTypeFieldNameAccess().getAllExtendedTypesAllExtendedTypesKeyword_8_0()); 
            match(input,56,FOLLOW_56_in_rule__TypeFieldName__AllExtendedTypesAssignment_85244); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2541:1: rule__TypeFieldName__FieldTypeAssignment_9 : ( ( 'FieldType' ) ) ;
    public final void rule__TypeFieldName__FieldTypeAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2545:1: ( ( ( 'FieldType' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2546:1: ( ( 'FieldType' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2546:1: ( ( 'FieldType' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2547:1: ( 'FieldType' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getFieldTypeFieldTypeKeyword_9_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2548:1: ( 'FieldType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2549:1: 'FieldType'
            {
             before(grammarAccess.getTypeFieldNameAccess().getFieldTypeFieldTypeKeyword_9_0()); 
            match(input,57,FOLLOW_57_in_rule__TypeFieldName__FieldTypeAssignment_95288); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2564:1: rule__TypeFieldName__DeclaringTypeAssignment_10 : ( ( 'DeclaringType' ) ) ;
    public final void rule__TypeFieldName__DeclaringTypeAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2568:1: ( ( ( 'DeclaringType' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2569:1: ( ( 'DeclaringType' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2569:1: ( ( 'DeclaringType' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2570:1: ( 'DeclaringType' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getDeclaringTypeDeclaringTypeKeyword_10_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2571:1: ( 'DeclaringType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2572:1: 'DeclaringType'
            {
             before(grammarAccess.getTypeFieldNameAccess().getDeclaringTypeDeclaringTypeKeyword_10_0()); 
            match(input,58,FOLLOW_58_in_rule__TypeFieldName__DeclaringTypeAssignment_105332); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2587:1: rule__TypeFieldName__CaughtTypeAssignment_11 : ( ( 'CaughtType' ) ) ;
    public final void rule__TypeFieldName__CaughtTypeAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2591:1: ( ( ( 'CaughtType' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2592:1: ( ( 'CaughtType' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2592:1: ( ( 'CaughtType' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2593:1: ( 'CaughtType' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getCaughtTypeCaughtTypeKeyword_11_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2594:1: ( 'CaughtType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2595:1: 'CaughtType'
            {
             before(grammarAccess.getTypeFieldNameAccess().getCaughtTypeCaughtTypeKeyword_11_0()); 
            match(input,59,FOLLOW_59_in_rule__TypeFieldName__CaughtTypeAssignment_115376); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2610:1: rule__TypeFieldName__InstanceofTypesAssignment_12 : ( ( 'InstanceofTypes' ) ) ;
    public final void rule__TypeFieldName__InstanceofTypesAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2614:1: ( ( ( 'InstanceofTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2615:1: ( ( 'InstanceofTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2615:1: ( ( 'InstanceofTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2616:1: ( 'InstanceofTypes' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getInstanceofTypesInstanceofTypesKeyword_12_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2617:1: ( 'InstanceofTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2618:1: 'InstanceofTypes'
            {
             before(grammarAccess.getTypeFieldNameAccess().getInstanceofTypesInstanceofTypesKeyword_12_0()); 
            match(input,60,FOLLOW_60_in_rule__TypeFieldName__InstanceofTypesAssignment_125420); 
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
    public static final BitSet FOLLOW_rule__ClauseExpression__Alternatives_in_ruleClauseExpression214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleClause_in_entryRuleSimpleClause241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleClause248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClause__Group__0_in_ruleSimpleClause274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeClause_in_entryRuleTypeClause301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeClause308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeClause__Group__0_in_ruleTypeClause334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldValue_in_entryRuleFieldValue361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldValue368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldValue__Alternatives_in_ruleFieldValue394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeValue_in_entryRuleTypeValue421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeValue428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeValue__Alternatives_in_ruleTypeValue454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group__0_in_ruleValue514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldName_in_entryRuleFieldName541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldName548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__Alternatives_in_ruleFieldName574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFieldName_in_entryRuleTypeFieldName601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeFieldName608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__Alternatives_in_ruleTypeFieldName634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__Alternatives_in_ruleBooleanExp671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotExpression__Alternatives_in_ruleNotExpression707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__ValueAssignment_0_in_rule__Exp2__Alternatives742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__0_in_rule__Exp2__Alternatives760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ClauseAssignment_0_in_rule__ClauseExpression__Alternatives793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ClauseAssignment_1_in_rule__ClauseExpression__Alternatives811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__FieldValue__Alternatives844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldValue__Group_1__0_in_rule__FieldValue__Alternatives861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__TypeValue__Alternatives894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeValue__Group_1__0_in_rule__TypeValue__Alternatives911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Value__Alternatives_0945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Value__Alternatives_0965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Value__Alternatives_1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Value__Alternatives_11016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__Value__Alternatives_11033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__FullyQualifiedNameAssignment_0_in_rule__FieldName__Alternatives1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__TypeAssignment_1_in_rule__FieldName__Alternatives1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__FriendlyNameAssignment_2_in_rule__FieldName__Alternatives1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__DeclaredMethodsAssignment_3_in_rule__FieldName__Alternatives1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__ParameterCountAssignment_4_in_rule__FieldName__Alternatives1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__ReturnVariableEexpressionsAssignment_5_in_rule__FieldName__Alternatives1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__UsedMethodsAssignment_6_in_rule__FieldName__Alternatives1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__UsedMethodsInTryAssignment_7_in_rule__FieldName__Alternatives1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__UsedMethodsInFinallyAssignment_8_in_rule__FieldName__Alternatives1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__OverriddenMethodsAssignment_9_in_rule__FieldName__Alternatives1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__ProjectNameAssignment_10_in_rule__FieldName__Alternatives1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__ResourcePathAssignment_11_in_rule__FieldName__Alternatives1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__ModifiersAssignment_12_in_rule__FieldName__Alternatives1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__AllDeclaredMethodNamesAssignment_13_in_rule__FieldName__Alternatives1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__DeclaredMethodNamesAssignment_14_in_rule__FieldName__Alternatives1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__DeclaredFieldNamesAssignment_15_in_rule__FieldName__Alternatives1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__DeclaredFieldTypesAssignment_16_in_rule__FieldName__Alternatives1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__AllDeclaredFieldNamesAssignment_17_in_rule__FieldName__Alternatives1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__FullTextAssignment_18_in_rule__FieldName__Alternatives1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__FieldsReadAssignment_19_in_rule__FieldName__Alternatives1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__FieldsWrittenAssignment_20_in_rule__FieldName__Alternatives1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__UsedFieldsInFinallyAssignment_21_in_rule__FieldName__Alternatives1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__UsedFieldsInTryAssignment_22_in_rule__FieldName__Alternatives1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__AnnotationsAssignment_23_in_rule__FieldName__Alternatives1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__TimestampAssignment_24_in_rule__FieldName__Alternatives1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__ImplementedTypesAssignment_0_in_rule__TypeFieldName__Alternatives1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__ExtendedTypesAssignment_1_in_rule__TypeFieldName__Alternatives1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__UsedTypesAssignment_2_in_rule__TypeFieldName__Alternatives1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__UsedTypesInTryAssignment_3_in_rule__TypeFieldName__Alternatives1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__UsedTypesInFinallyAssignment_4_in_rule__TypeFieldName__Alternatives1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__ParameterTypesAssignment_5_in_rule__TypeFieldName__Alternatives1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__ReturnTypeAssignment_6_in_rule__TypeFieldName__Alternatives1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__AllImplementedTypesAssignment_7_in_rule__TypeFieldName__Alternatives1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__AllExtendedTypesAssignment_8_in_rule__TypeFieldName__Alternatives1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__FieldTypeAssignment_9_in_rule__TypeFieldName__Alternatives1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__DeclaringTypeAssignment_10_in_rule__TypeFieldName__Alternatives1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__CaughtTypeAssignment_11_in_rule__TypeFieldName__Alternatives1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__InstanceofTypesAssignment_12_in_rule__TypeFieldName__Alternatives1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BooleanExp__Alternatives1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BooleanExp__Alternatives1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BooleanExp__Alternatives1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BooleanExp__Alternatives1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NotExpression__Alternatives1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__NotExpression__Alternatives1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__NotExpression__Alternatives1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group__0__Impl_in_rule__Exp1__Group__01954 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_rule__Exp1__Group__1_in_rule__Exp1__Group__01957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp2_in_rule__Exp1__Group__0__Impl1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group__1__Impl_in_rule__Exp1__Group__12013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__0_in_rule__Exp1__Group__1__Impl2040 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__0__Impl_in_rule__Exp1__Group_1__02075 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__1_in_rule__Exp1__Group_1__02078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__1__Impl_in_rule__Exp1__Group_1__12136 = new BitSet(new long[]{0x1FFFFFFFFF9E0000L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__2_in_rule__Exp1__Group_1__12139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__BAssignment_1_1_in_rule__Exp1__Group_1__1__Impl2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__2__Impl_in_rule__Exp1__Group_1__22196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__RightAssignment_1_2_in_rule__Exp1__Group_1__2__Impl2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__0__Impl_in_rule__Exp2__Group_1__02259 = new BitSet(new long[]{0x1FFFFFFFFF9E0000L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__1_in_rule__Exp2__Group_1__02262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Exp2__Group_1__0__Impl2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__1__Impl_in_rule__Exp2__Group_1__12321 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__2_in_rule__Exp2__Group_1__12324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp1_in_rule__Exp2__Group_1__1__Impl2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__2__Impl_in_rule__Exp2__Group_1__22380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Exp2__Group_1__2__Impl2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClause__Group__0__Impl_in_rule__SimpleClause__Group__02445 = new BitSet(new long[]{0x0000FFFFFF8E0000L});
    public static final BitSet FOLLOW_rule__SimpleClause__Group__1_in_rule__SimpleClause__Group__02448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClause__NAssignment_0_in_rule__SimpleClause__Group__0__Impl2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClause__Group__1__Impl_in_rule__SimpleClause__Group__12506 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SimpleClause__Group__2_in_rule__SimpleClause__Group__12509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClause__FieldAssignment_1_in_rule__SimpleClause__Group__1__Impl2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClause__Group__2__Impl_in_rule__SimpleClause__Group__22566 = new BitSet(new long[]{0x0000000000101870L});
    public static final BitSet FOLLOW_rule__SimpleClause__Group__3_in_rule__SimpleClause__Group__22569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SimpleClause__Group__2__Impl2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClause__Group__3__Impl_in_rule__SimpleClause__Group__32628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClause__ValueAssignment_3_in_rule__SimpleClause__Group__3__Impl2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeClause__Group__0__Impl_in_rule__TypeClause__Group__02693 = new BitSet(new long[]{0x1FFFFFFFFF8E0000L});
    public static final BitSet FOLLOW_rule__TypeClause__Group__1_in_rule__TypeClause__Group__02696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeClause__NAssignment_0_in_rule__TypeClause__Group__0__Impl2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeClause__Group__1__Impl_in_rule__TypeClause__Group__12754 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TypeClause__Group__2_in_rule__TypeClause__Group__12757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeClause__FieldAssignment_1_in_rule__TypeClause__Group__1__Impl2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeClause__Group__2__Impl_in_rule__TypeClause__Group__22814 = new BitSet(new long[]{0x0000000000101870L});
    public static final BitSet FOLLOW_rule__TypeClause__Group__3_in_rule__TypeClause__Group__22817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TypeClause__Group__2__Impl2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeClause__Group__3__Impl_in_rule__TypeClause__Group__32876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeClause__ValueAssignment_3_in_rule__TypeClause__Group__3__Impl2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldValue__Group_1__0__Impl_in_rule__FieldValue__Group_1__02941 = new BitSet(new long[]{0x0000000000201870L});
    public static final BitSet FOLLOW_rule__FieldValue__Group_1__1_in_rule__FieldValue__Group_1__02944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__FieldValue__Group_1__0__Impl2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldValue__Group_1__1__Impl_in_rule__FieldValue__Group_1__13003 = new BitSet(new long[]{0x0000000000201870L});
    public static final BitSet FOLLOW_rule__FieldValue__Group_1__2_in_rule__FieldValue__Group_1__13006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__FieldValue__Group_1__1__Impl3034 = new BitSet(new long[]{0x0000000000001872L});
    public static final BitSet FOLLOW_rule__FieldValue__Group_1__2__Impl_in_rule__FieldValue__Group_1__23065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FieldValue__Group_1__2__Impl3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeValue__Group_1__0__Impl_in_rule__TypeValue__Group_1__03130 = new BitSet(new long[]{0x0000000000201870L});
    public static final BitSet FOLLOW_rule__TypeValue__Group_1__1_in_rule__TypeValue__Group_1__03133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__TypeValue__Group_1__0__Impl3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeValue__Group_1__1__Impl_in_rule__TypeValue__Group_1__13192 = new BitSet(new long[]{0x0000000000201870L});
    public static final BitSet FOLLOW_rule__TypeValue__Group_1__2_in_rule__TypeValue__Group_1__13195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__TypeValue__Group_1__1__Impl3223 = new BitSet(new long[]{0x0000000000001872L});
    public static final BitSet FOLLOW_rule__TypeValue__Group_1__2__Impl_in_rule__TypeValue__Group_1__23254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TypeValue__Group_1__2__Impl3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group__0__Impl_in_rule__Value__Group__03319 = new BitSet(new long[]{0x0000000000001870L});
    public static final BitSet FOLLOW_rule__Value__Group__1_in_rule__Value__Group__03322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_0_in_rule__Value__Group__0__Impl3349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group__1__Impl_in_rule__Value__Group__13380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_1_in_rule__Value__Group__1__Impl3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExp_in_rule__Exp1__BAssignment_1_13446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp2_in_rule__Exp1__RightAssignment_1_23477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClauseExpression_in_rule__Exp2__ValueAssignment_03508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleClause_in_rule__ClauseExpression__ClauseAssignment_03539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeClause_in_rule__ClauseExpression__ClauseAssignment_13570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_rule__SimpleClause__NAssignment_03601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldName_in_rule__SimpleClause__FieldAssignment_13632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldValue_in_rule__SimpleClause__ValueAssignment_33663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_rule__TypeClause__NAssignment_03694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFieldName_in_rule__TypeClause__FieldAssignment_13725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeValue_in_rule__TypeClause__ValueAssignment_33756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FieldName__FullyQualifiedNameAssignment_03792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__FieldName__TypeAssignment_13836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FieldName__FriendlyNameAssignment_23880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__FieldName__DeclaredMethodsAssignment_33924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__FieldName__ParameterCountAssignment_43968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__FieldName__ReturnVariableEexpressionsAssignment_54012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FieldName__UsedMethodsAssignment_64056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__FieldName__UsedMethodsInTryAssignment_74100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FieldName__UsedMethodsInFinallyAssignment_84144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__FieldName__OverriddenMethodsAssignment_94188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FieldName__ProjectNameAssignment_104232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FieldName__ResourcePathAssignment_114276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FieldName__ModifiersAssignment_124320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FieldName__AllDeclaredMethodNamesAssignment_134364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__FieldName__DeclaredMethodNamesAssignment_144408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__FieldName__DeclaredFieldNamesAssignment_154452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__FieldName__DeclaredFieldTypesAssignment_164496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__FieldName__AllDeclaredFieldNamesAssignment_174540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__FieldName__FullTextAssignment_184584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__FieldName__FieldsReadAssignment_194628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__FieldName__FieldsWrittenAssignment_204672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__FieldName__UsedFieldsInFinallyAssignment_214716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__FieldName__UsedFieldsInTryAssignment_224760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__FieldName__AnnotationsAssignment_234804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__FieldName__TimestampAssignment_244848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__TypeFieldName__ImplementedTypesAssignment_04892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__TypeFieldName__ExtendedTypesAssignment_14936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__TypeFieldName__UsedTypesAssignment_24980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__TypeFieldName__UsedTypesInTryAssignment_35024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__TypeFieldName__UsedTypesInFinallyAssignment_45068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__TypeFieldName__ParameterTypesAssignment_55112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__TypeFieldName__ReturnTypeAssignment_65156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__TypeFieldName__AllImplementedTypesAssignment_75200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__TypeFieldName__AllExtendedTypesAssignment_85244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__TypeFieldName__FieldTypeAssignment_95288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__TypeFieldName__DeclaringTypeAssignment_105332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__TypeFieldName__CaughtTypeAssignment_115376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__TypeFieldName__InstanceofTypesAssignment_125420 = new BitSet(new long[]{0x0000000000000002L});

}