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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'/'", "'.'", "'*'", "'?'", "'AND'", "'OR'", "'-'", "'NOT'", "'!'", "'('", "')'", "':'", "'\\\\'", "'FullyQualifiedName'", "'Type'", "'FriendlyName'", "'DeclaredMethods'", "'ParameterCount'", "'ReturnVariableEexpressions'", "'UsedMethods'", "'UsedMethodsInTry'", "'UsedMethodsInFinally'", "'OverriddenMethods'", "'ProjectName'", "'ResourcePath'", "'Modifiers'", "'AllDeclaredMethodNames'", "'DeclaredMethodNames'", "'DeclaredFieldNames'", "'DeclaredFieldTypes'", "'AllDeclaredFieldNames'", "'FullText'", "'FieldsRead'", "'FieldsWritten'", "'UsedFieldsInFinally'", "'UsedFieldsInTry'", "'Annotations'", "'Timestamp'", "'ImplementedTypes'", "'ExtendedTypes'", "'UsedTypes'", "'UsedTypesInTry'", "'UsedTypesInFinally'", "'ParameterTypes'", "'ReturnType'", "'AllImplementedTypes'", "'AllExtendedTypes'", "'FieldType'", "'DeclaringType'", "'CaughtType'", "'InstanceofTypes'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__62=62;
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


    // $ANTLR start "entryRuleSpecialChar"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:348:1: entryRuleSpecialChar : ruleSpecialChar EOF ;
    public final void entryRuleSpecialChar() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:349:1: ( ruleSpecialChar EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:350:1: ruleSpecialChar EOF
            {
             before(grammarAccess.getSpecialCharRule()); 
            pushFollow(FOLLOW_ruleSpecialChar_in_entryRuleSpecialChar668);
            ruleSpecialChar();

            state._fsp--;

             after(grammarAccess.getSpecialCharRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialChar675); 

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
    // $ANTLR end "entryRuleSpecialChar"


    // $ANTLR start "ruleSpecialChar"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:357:1: ruleSpecialChar : ( ( rule__SpecialChar__Alternatives ) ) ;
    public final void ruleSpecialChar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:361:2: ( ( ( rule__SpecialChar__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:362:1: ( ( rule__SpecialChar__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:362:1: ( ( rule__SpecialChar__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:363:1: ( rule__SpecialChar__Alternatives )
            {
             before(grammarAccess.getSpecialCharAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:364:1: ( rule__SpecialChar__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:364:2: rule__SpecialChar__Alternatives
            {
            pushFollow(FOLLOW_rule__SpecialChar__Alternatives_in_ruleSpecialChar701);
            rule__SpecialChar__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSpecialCharAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpecialChar"


    // $ANTLR start "entryRuleWildcard"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:376:1: entryRuleWildcard : ruleWildcard EOF ;
    public final void entryRuleWildcard() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:377:1: ( ruleWildcard EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:378:1: ruleWildcard EOF
            {
             before(grammarAccess.getWildcardRule()); 
            pushFollow(FOLLOW_ruleWildcard_in_entryRuleWildcard728);
            ruleWildcard();

            state._fsp--;

             after(grammarAccess.getWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWildcard735); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:385:1: ruleWildcard : ( ( rule__Wildcard__Alternatives ) ) ;
    public final void ruleWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:389:2: ( ( ( rule__Wildcard__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:390:1: ( ( rule__Wildcard__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:390:1: ( ( rule__Wildcard__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:391:1: ( rule__Wildcard__Alternatives )
            {
             before(grammarAccess.getWildcardAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:392:1: ( rule__Wildcard__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:392:2: rule__Wildcard__Alternatives
            {
            pushFollow(FOLLOW_rule__Wildcard__Alternatives_in_ruleWildcard761);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:404:1: entryRuleFieldName : ruleFieldName EOF ;
    public final void entryRuleFieldName() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:405:1: ( ruleFieldName EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:406:1: ruleFieldName EOF
            {
             before(grammarAccess.getFieldNameRule()); 
            pushFollow(FOLLOW_ruleFieldName_in_entryRuleFieldName788);
            ruleFieldName();

            state._fsp--;

             after(grammarAccess.getFieldNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldName795); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:413:1: ruleFieldName : ( ( rule__FieldName__Alternatives ) ) ;
    public final void ruleFieldName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:417:2: ( ( ( rule__FieldName__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:418:1: ( ( rule__FieldName__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:418:1: ( ( rule__FieldName__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:419:1: ( rule__FieldName__Alternatives )
            {
             before(grammarAccess.getFieldNameAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:420:1: ( rule__FieldName__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:420:2: rule__FieldName__Alternatives
            {
            pushFollow(FOLLOW_rule__FieldName__Alternatives_in_ruleFieldName821);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:432:1: entryRuleTypeFieldName : ruleTypeFieldName EOF ;
    public final void entryRuleTypeFieldName() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:433:1: ( ruleTypeFieldName EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:434:1: ruleTypeFieldName EOF
            {
             before(grammarAccess.getTypeFieldNameRule()); 
            pushFollow(FOLLOW_ruleTypeFieldName_in_entryRuleTypeFieldName848);
            ruleTypeFieldName();

            state._fsp--;

             after(grammarAccess.getTypeFieldNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeFieldName855); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:441:1: ruleTypeFieldName : ( ( rule__TypeFieldName__Alternatives ) ) ;
    public final void ruleTypeFieldName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:445:2: ( ( ( rule__TypeFieldName__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:446:1: ( ( rule__TypeFieldName__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:446:1: ( ( rule__TypeFieldName__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:447:1: ( rule__TypeFieldName__Alternatives )
            {
             before(grammarAccess.getTypeFieldNameAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:448:1: ( rule__TypeFieldName__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:448:2: rule__TypeFieldName__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeFieldName__Alternatives_in_ruleTypeFieldName881);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:461:1: ruleBooleanExp : ( ( rule__BooleanExp__Alternatives ) ) ;
    public final void ruleBooleanExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:465:1: ( ( ( rule__BooleanExp__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:466:1: ( ( rule__BooleanExp__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:466:1: ( ( rule__BooleanExp__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:467:1: ( rule__BooleanExp__Alternatives )
            {
             before(grammarAccess.getBooleanExpAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:468:1: ( rule__BooleanExp__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:468:2: rule__BooleanExp__Alternatives
            {
            pushFollow(FOLLOW_rule__BooleanExp__Alternatives_in_ruleBooleanExp918);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:480:1: ruleNotExpression : ( ( rule__NotExpression__Alternatives ) ) ;
    public final void ruleNotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:484:1: ( ( ( rule__NotExpression__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:485:1: ( ( rule__NotExpression__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:485:1: ( ( rule__NotExpression__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:486:1: ( rule__NotExpression__Alternatives )
            {
             before(grammarAccess.getNotExpressionAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:487:1: ( rule__NotExpression__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:487:2: rule__NotExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__NotExpression__Alternatives_in_ruleNotExpression954);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:499:1: ruleMustExpression : ( ( '+' ) ) ;
    public final void ruleMustExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:503:1: ( ( ( '+' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:504:1: ( ( '+' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:504:1: ( ( '+' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:505:1: ( '+' )
            {
             before(grammarAccess.getMustExpressionAccess().getMEnumLiteralDeclaration()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:506:1: ( '+' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:506:3: '+'
            {
            match(input,11,FOLLOW_11_in_ruleMustExpression991); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:518:1: rule__Exp2__Alternatives : ( ( ( rule__Exp2__ValueAssignment_0 ) ) | ( ( rule__Exp2__Group_1__0 ) ) );
    public final void rule__Exp2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:522:1: ( ( ( rule__Exp2__ValueAssignment_0 ) ) | ( ( rule__Exp2__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11||(LA1_0>=18 && LA1_0<=20)||(LA1_0>=25 && LA1_0<=62)) ) {
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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:523:1: ( ( rule__Exp2__ValueAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:523:1: ( ( rule__Exp2__ValueAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:524:1: ( rule__Exp2__ValueAssignment_0 )
                    {
                     before(grammarAccess.getExp2Access().getValueAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:525:1: ( rule__Exp2__ValueAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:525:2: rule__Exp2__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Exp2__ValueAssignment_0_in_rule__Exp2__Alternatives1028);
                    rule__Exp2__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExp2Access().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:529:6: ( ( rule__Exp2__Group_1__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:529:6: ( ( rule__Exp2__Group_1__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:530:1: ( rule__Exp2__Group_1__0 )
                    {
                     before(grammarAccess.getExp2Access().getGroup_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:531:1: ( rule__Exp2__Group_1__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:531:2: rule__Exp2__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Exp2__Group_1__0_in_rule__Exp2__Alternatives1046);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:540:1: rule__ClauseExpression__Alternatives_0 : ( ( ( rule__ClauseExpression__NAssignment_0_0 ) ) | ( ( rule__ClauseExpression__MAssignment_0_1 ) ) );
    public final void rule__ClauseExpression__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:544:1: ( ( ( rule__ClauseExpression__NAssignment_0_0 ) ) | ( ( rule__ClauseExpression__MAssignment_0_1 ) ) )
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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:545:1: ( ( rule__ClauseExpression__NAssignment_0_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:545:1: ( ( rule__ClauseExpression__NAssignment_0_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:546:1: ( rule__ClauseExpression__NAssignment_0_0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getNAssignment_0_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:547:1: ( rule__ClauseExpression__NAssignment_0_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:547:2: rule__ClauseExpression__NAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__NAssignment_0_0_in_rule__ClauseExpression__Alternatives_01079);
                    rule__ClauseExpression__NAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getNAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:551:6: ( ( rule__ClauseExpression__MAssignment_0_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:551:6: ( ( rule__ClauseExpression__MAssignment_0_1 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:552:1: ( rule__ClauseExpression__MAssignment_0_1 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getMAssignment_0_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:553:1: ( rule__ClauseExpression__MAssignment_0_1 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:553:2: rule__ClauseExpression__MAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__MAssignment_0_1_in_rule__ClauseExpression__Alternatives_01097);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:562:1: rule__ClauseExpression__Alternatives_1 : ( ( ( rule__ClauseExpression__ClauseAssignment_1_0 ) ) | ( ( rule__ClauseExpression__ClauseAssignment_1_1 ) ) );
    public final void rule__ClauseExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:566:1: ( ( ( rule__ClauseExpression__ClauseAssignment_1_0 ) ) | ( ( rule__ClauseExpression__ClauseAssignment_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=25 && LA3_0<=49)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=50 && LA3_0<=62)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:567:1: ( ( rule__ClauseExpression__ClauseAssignment_1_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:567:1: ( ( rule__ClauseExpression__ClauseAssignment_1_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:568:1: ( rule__ClauseExpression__ClauseAssignment_1_0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getClauseAssignment_1_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:569:1: ( rule__ClauseExpression__ClauseAssignment_1_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:569:2: rule__ClauseExpression__ClauseAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__ClauseAssignment_1_0_in_rule__ClauseExpression__Alternatives_11130);
                    rule__ClauseExpression__ClauseAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getClauseAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:573:6: ( ( rule__ClauseExpression__ClauseAssignment_1_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:573:6: ( ( rule__ClauseExpression__ClauseAssignment_1_1 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:574:1: ( rule__ClauseExpression__ClauseAssignment_1_1 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getClauseAssignment_1_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:575:1: ( rule__ClauseExpression__ClauseAssignment_1_1 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:575:2: rule__ClauseExpression__ClauseAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__ClauseAssignment_1_1_in_rule__ClauseExpression__Alternatives_11148);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:584:1: rule__Sep__Alternatives : ( ( '/' ) | ( '.' ) );
    public final void rule__Sep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:588:1: ( ( '/' ) | ( '.' ) )
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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:589:1: ( '/' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:589:1: ( '/' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:590:1: '/'
                    {
                     before(grammarAccess.getSepAccess().getSolidusKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__Sep__Alternatives1182); 
                     after(grammarAccess.getSepAccess().getSolidusKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:597:6: ( '.' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:597:6: ( '.' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:598:1: '.'
                    {
                     before(grammarAccess.getSepAccess().getFullStopKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__Sep__Alternatives1202); 
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


    // $ANTLR start "rule__SpecialChar__Alternatives"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:610:1: rule__SpecialChar__Alternatives : ( ( ( rule__SpecialChar__Group_0__0 ) ) | ( '/' ) );
    public final void rule__SpecialChar__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:614:1: ( ( ( rule__SpecialChar__Group_0__0 ) ) | ( '/' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:615:1: ( ( rule__SpecialChar__Group_0__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:615:1: ( ( rule__SpecialChar__Group_0__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:616:1: ( rule__SpecialChar__Group_0__0 )
                    {
                     before(grammarAccess.getSpecialCharAccess().getGroup_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:617:1: ( rule__SpecialChar__Group_0__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:617:2: rule__SpecialChar__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__SpecialChar__Group_0__0_in_rule__SpecialChar__Alternatives1236);
                    rule__SpecialChar__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSpecialCharAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:621:6: ( '/' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:621:6: ( '/' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:622:1: '/'
                    {
                     before(grammarAccess.getSpecialCharAccess().getSolidusKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__SpecialChar__Alternatives1255); 
                     after(grammarAccess.getSpecialCharAccess().getSolidusKeyword_1()); 

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
    // $ANTLR end "rule__SpecialChar__Alternatives"


    // $ANTLR start "rule__Wildcard__Alternatives"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:634:1: rule__Wildcard__Alternatives : ( ( '*' ) | ( '?' ) );
    public final void rule__Wildcard__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:638:1: ( ( '*' ) | ( '?' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:639:1: ( '*' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:639:1: ( '*' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:640:1: '*'
                    {
                     before(grammarAccess.getWildcardAccess().getAsteriskKeyword_0()); 
                    match(input,14,FOLLOW_14_in_rule__Wildcard__Alternatives1290); 
                     after(grammarAccess.getWildcardAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:647:6: ( '?' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:647:6: ( '?' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:648:1: '?'
                    {
                     before(grammarAccess.getWildcardAccess().getQuestionMarkKeyword_1()); 
                    match(input,15,FOLLOW_15_in_rule__Wildcard__Alternatives1310); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:660:1: rule__FieldName__Alternatives : ( ( ( rule__FieldName__FullyQualifiedNameAssignment_0 ) ) | ( ( rule__FieldName__TypeAssignment_1 ) ) | ( ( rule__FieldName__FriendlyNameAssignment_2 ) ) | ( ( rule__FieldName__DeclaredMethodsAssignment_3 ) ) | ( ( rule__FieldName__ParameterCountAssignment_4 ) ) | ( ( rule__FieldName__ReturnVariableEexpressionsAssignment_5 ) ) | ( ( rule__FieldName__UsedMethodsAssignment_6 ) ) | ( ( rule__FieldName__UsedMethodsInTryAssignment_7 ) ) | ( ( rule__FieldName__UsedMethodsInFinallyAssignment_8 ) ) | ( ( rule__FieldName__OverriddenMethodsAssignment_9 ) ) | ( ( rule__FieldName__ProjectNameAssignment_10 ) ) | ( ( rule__FieldName__ResourcePathAssignment_11 ) ) | ( ( rule__FieldName__ModifiersAssignment_12 ) ) | ( ( rule__FieldName__AllDeclaredMethodNamesAssignment_13 ) ) | ( ( rule__FieldName__DeclaredMethodNamesAssignment_14 ) ) | ( ( rule__FieldName__DeclaredFieldNamesAssignment_15 ) ) | ( ( rule__FieldName__DeclaredFieldTypesAssignment_16 ) ) | ( ( rule__FieldName__AllDeclaredFieldNamesAssignment_17 ) ) | ( ( rule__FieldName__FullTextAssignment_18 ) ) | ( ( rule__FieldName__FieldsReadAssignment_19 ) ) | ( ( rule__FieldName__FieldsWrittenAssignment_20 ) ) | ( ( rule__FieldName__UsedFieldsInFinallyAssignment_21 ) ) | ( ( rule__FieldName__UsedFieldsInTryAssignment_22 ) ) | ( ( rule__FieldName__AnnotationsAssignment_23 ) ) | ( ( rule__FieldName__TimestampAssignment_24 ) ) );
    public final void rule__FieldName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:664:1: ( ( ( rule__FieldName__FullyQualifiedNameAssignment_0 ) ) | ( ( rule__FieldName__TypeAssignment_1 ) ) | ( ( rule__FieldName__FriendlyNameAssignment_2 ) ) | ( ( rule__FieldName__DeclaredMethodsAssignment_3 ) ) | ( ( rule__FieldName__ParameterCountAssignment_4 ) ) | ( ( rule__FieldName__ReturnVariableEexpressionsAssignment_5 ) ) | ( ( rule__FieldName__UsedMethodsAssignment_6 ) ) | ( ( rule__FieldName__UsedMethodsInTryAssignment_7 ) ) | ( ( rule__FieldName__UsedMethodsInFinallyAssignment_8 ) ) | ( ( rule__FieldName__OverriddenMethodsAssignment_9 ) ) | ( ( rule__FieldName__ProjectNameAssignment_10 ) ) | ( ( rule__FieldName__ResourcePathAssignment_11 ) ) | ( ( rule__FieldName__ModifiersAssignment_12 ) ) | ( ( rule__FieldName__AllDeclaredMethodNamesAssignment_13 ) ) | ( ( rule__FieldName__DeclaredMethodNamesAssignment_14 ) ) | ( ( rule__FieldName__DeclaredFieldNamesAssignment_15 ) ) | ( ( rule__FieldName__DeclaredFieldTypesAssignment_16 ) ) | ( ( rule__FieldName__AllDeclaredFieldNamesAssignment_17 ) ) | ( ( rule__FieldName__FullTextAssignment_18 ) ) | ( ( rule__FieldName__FieldsReadAssignment_19 ) ) | ( ( rule__FieldName__FieldsWrittenAssignment_20 ) ) | ( ( rule__FieldName__UsedFieldsInFinallyAssignment_21 ) ) | ( ( rule__FieldName__UsedFieldsInTryAssignment_22 ) ) | ( ( rule__FieldName__AnnotationsAssignment_23 ) ) | ( ( rule__FieldName__TimestampAssignment_24 ) ) )
            int alt7=25;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt7=1;
                }
                break;
            case 26:
                {
                alt7=2;
                }
                break;
            case 27:
                {
                alt7=3;
                }
                break;
            case 28:
                {
                alt7=4;
                }
                break;
            case 29:
                {
                alt7=5;
                }
                break;
            case 30:
                {
                alt7=6;
                }
                break;
            case 31:
                {
                alt7=7;
                }
                break;
            case 32:
                {
                alt7=8;
                }
                break;
            case 33:
                {
                alt7=9;
                }
                break;
            case 34:
                {
                alt7=10;
                }
                break;
            case 35:
                {
                alt7=11;
                }
                break;
            case 36:
                {
                alt7=12;
                }
                break;
            case 37:
                {
                alt7=13;
                }
                break;
            case 38:
                {
                alt7=14;
                }
                break;
            case 39:
                {
                alt7=15;
                }
                break;
            case 40:
                {
                alt7=16;
                }
                break;
            case 41:
                {
                alt7=17;
                }
                break;
            case 42:
                {
                alt7=18;
                }
                break;
            case 43:
                {
                alt7=19;
                }
                break;
            case 44:
                {
                alt7=20;
                }
                break;
            case 45:
                {
                alt7=21;
                }
                break;
            case 46:
                {
                alt7=22;
                }
                break;
            case 47:
                {
                alt7=23;
                }
                break;
            case 48:
                {
                alt7=24;
                }
                break;
            case 49:
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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:665:1: ( ( rule__FieldName__FullyQualifiedNameAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:665:1: ( ( rule__FieldName__FullyQualifiedNameAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:666:1: ( rule__FieldName__FullyQualifiedNameAssignment_0 )
                    {
                     before(grammarAccess.getFieldNameAccess().getFullyQualifiedNameAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:667:1: ( rule__FieldName__FullyQualifiedNameAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:667:2: rule__FieldName__FullyQualifiedNameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FieldName__FullyQualifiedNameAssignment_0_in_rule__FieldName__Alternatives1344);
                    rule__FieldName__FullyQualifiedNameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getFullyQualifiedNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:671:6: ( ( rule__FieldName__TypeAssignment_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:671:6: ( ( rule__FieldName__TypeAssignment_1 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:672:1: ( rule__FieldName__TypeAssignment_1 )
                    {
                     before(grammarAccess.getFieldNameAccess().getTypeAssignment_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:673:1: ( rule__FieldName__TypeAssignment_1 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:673:2: rule__FieldName__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__FieldName__TypeAssignment_1_in_rule__FieldName__Alternatives1362);
                    rule__FieldName__TypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getTypeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:677:6: ( ( rule__FieldName__FriendlyNameAssignment_2 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:677:6: ( ( rule__FieldName__FriendlyNameAssignment_2 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:678:1: ( rule__FieldName__FriendlyNameAssignment_2 )
                    {
                     before(grammarAccess.getFieldNameAccess().getFriendlyNameAssignment_2()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:679:1: ( rule__FieldName__FriendlyNameAssignment_2 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:679:2: rule__FieldName__FriendlyNameAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FieldName__FriendlyNameAssignment_2_in_rule__FieldName__Alternatives1380);
                    rule__FieldName__FriendlyNameAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getFriendlyNameAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:683:6: ( ( rule__FieldName__DeclaredMethodsAssignment_3 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:683:6: ( ( rule__FieldName__DeclaredMethodsAssignment_3 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:684:1: ( rule__FieldName__DeclaredMethodsAssignment_3 )
                    {
                     before(grammarAccess.getFieldNameAccess().getDeclaredMethodsAssignment_3()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:685:1: ( rule__FieldName__DeclaredMethodsAssignment_3 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:685:2: rule__FieldName__DeclaredMethodsAssignment_3
                    {
                    pushFollow(FOLLOW_rule__FieldName__DeclaredMethodsAssignment_3_in_rule__FieldName__Alternatives1398);
                    rule__FieldName__DeclaredMethodsAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getDeclaredMethodsAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:689:6: ( ( rule__FieldName__ParameterCountAssignment_4 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:689:6: ( ( rule__FieldName__ParameterCountAssignment_4 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:690:1: ( rule__FieldName__ParameterCountAssignment_4 )
                    {
                     before(grammarAccess.getFieldNameAccess().getParameterCountAssignment_4()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:691:1: ( rule__FieldName__ParameterCountAssignment_4 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:691:2: rule__FieldName__ParameterCountAssignment_4
                    {
                    pushFollow(FOLLOW_rule__FieldName__ParameterCountAssignment_4_in_rule__FieldName__Alternatives1416);
                    rule__FieldName__ParameterCountAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getParameterCountAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:695:6: ( ( rule__FieldName__ReturnVariableEexpressionsAssignment_5 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:695:6: ( ( rule__FieldName__ReturnVariableEexpressionsAssignment_5 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:696:1: ( rule__FieldName__ReturnVariableEexpressionsAssignment_5 )
                    {
                     before(grammarAccess.getFieldNameAccess().getReturnVariableEexpressionsAssignment_5()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:697:1: ( rule__FieldName__ReturnVariableEexpressionsAssignment_5 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:697:2: rule__FieldName__ReturnVariableEexpressionsAssignment_5
                    {
                    pushFollow(FOLLOW_rule__FieldName__ReturnVariableEexpressionsAssignment_5_in_rule__FieldName__Alternatives1434);
                    rule__FieldName__ReturnVariableEexpressionsAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getReturnVariableEexpressionsAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:701:6: ( ( rule__FieldName__UsedMethodsAssignment_6 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:701:6: ( ( rule__FieldName__UsedMethodsAssignment_6 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:702:1: ( rule__FieldName__UsedMethodsAssignment_6 )
                    {
                     before(grammarAccess.getFieldNameAccess().getUsedMethodsAssignment_6()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:703:1: ( rule__FieldName__UsedMethodsAssignment_6 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:703:2: rule__FieldName__UsedMethodsAssignment_6
                    {
                    pushFollow(FOLLOW_rule__FieldName__UsedMethodsAssignment_6_in_rule__FieldName__Alternatives1452);
                    rule__FieldName__UsedMethodsAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getUsedMethodsAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:707:6: ( ( rule__FieldName__UsedMethodsInTryAssignment_7 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:707:6: ( ( rule__FieldName__UsedMethodsInTryAssignment_7 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:708:1: ( rule__FieldName__UsedMethodsInTryAssignment_7 )
                    {
                     before(grammarAccess.getFieldNameAccess().getUsedMethodsInTryAssignment_7()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:709:1: ( rule__FieldName__UsedMethodsInTryAssignment_7 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:709:2: rule__FieldName__UsedMethodsInTryAssignment_7
                    {
                    pushFollow(FOLLOW_rule__FieldName__UsedMethodsInTryAssignment_7_in_rule__FieldName__Alternatives1470);
                    rule__FieldName__UsedMethodsInTryAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getUsedMethodsInTryAssignment_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:713:6: ( ( rule__FieldName__UsedMethodsInFinallyAssignment_8 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:713:6: ( ( rule__FieldName__UsedMethodsInFinallyAssignment_8 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:714:1: ( rule__FieldName__UsedMethodsInFinallyAssignment_8 )
                    {
                     before(grammarAccess.getFieldNameAccess().getUsedMethodsInFinallyAssignment_8()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:715:1: ( rule__FieldName__UsedMethodsInFinallyAssignment_8 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:715:2: rule__FieldName__UsedMethodsInFinallyAssignment_8
                    {
                    pushFollow(FOLLOW_rule__FieldName__UsedMethodsInFinallyAssignment_8_in_rule__FieldName__Alternatives1488);
                    rule__FieldName__UsedMethodsInFinallyAssignment_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getUsedMethodsInFinallyAssignment_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:719:6: ( ( rule__FieldName__OverriddenMethodsAssignment_9 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:719:6: ( ( rule__FieldName__OverriddenMethodsAssignment_9 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:720:1: ( rule__FieldName__OverriddenMethodsAssignment_9 )
                    {
                     before(grammarAccess.getFieldNameAccess().getOverriddenMethodsAssignment_9()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:721:1: ( rule__FieldName__OverriddenMethodsAssignment_9 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:721:2: rule__FieldName__OverriddenMethodsAssignment_9
                    {
                    pushFollow(FOLLOW_rule__FieldName__OverriddenMethodsAssignment_9_in_rule__FieldName__Alternatives1506);
                    rule__FieldName__OverriddenMethodsAssignment_9();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getOverriddenMethodsAssignment_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:725:6: ( ( rule__FieldName__ProjectNameAssignment_10 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:725:6: ( ( rule__FieldName__ProjectNameAssignment_10 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:726:1: ( rule__FieldName__ProjectNameAssignment_10 )
                    {
                     before(grammarAccess.getFieldNameAccess().getProjectNameAssignment_10()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:727:1: ( rule__FieldName__ProjectNameAssignment_10 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:727:2: rule__FieldName__ProjectNameAssignment_10
                    {
                    pushFollow(FOLLOW_rule__FieldName__ProjectNameAssignment_10_in_rule__FieldName__Alternatives1524);
                    rule__FieldName__ProjectNameAssignment_10();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getProjectNameAssignment_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:731:6: ( ( rule__FieldName__ResourcePathAssignment_11 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:731:6: ( ( rule__FieldName__ResourcePathAssignment_11 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:732:1: ( rule__FieldName__ResourcePathAssignment_11 )
                    {
                     before(grammarAccess.getFieldNameAccess().getResourcePathAssignment_11()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:733:1: ( rule__FieldName__ResourcePathAssignment_11 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:733:2: rule__FieldName__ResourcePathAssignment_11
                    {
                    pushFollow(FOLLOW_rule__FieldName__ResourcePathAssignment_11_in_rule__FieldName__Alternatives1542);
                    rule__FieldName__ResourcePathAssignment_11();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getResourcePathAssignment_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:737:6: ( ( rule__FieldName__ModifiersAssignment_12 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:737:6: ( ( rule__FieldName__ModifiersAssignment_12 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:738:1: ( rule__FieldName__ModifiersAssignment_12 )
                    {
                     before(grammarAccess.getFieldNameAccess().getModifiersAssignment_12()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:739:1: ( rule__FieldName__ModifiersAssignment_12 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:739:2: rule__FieldName__ModifiersAssignment_12
                    {
                    pushFollow(FOLLOW_rule__FieldName__ModifiersAssignment_12_in_rule__FieldName__Alternatives1560);
                    rule__FieldName__ModifiersAssignment_12();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getModifiersAssignment_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:743:6: ( ( rule__FieldName__AllDeclaredMethodNamesAssignment_13 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:743:6: ( ( rule__FieldName__AllDeclaredMethodNamesAssignment_13 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:744:1: ( rule__FieldName__AllDeclaredMethodNamesAssignment_13 )
                    {
                     before(grammarAccess.getFieldNameAccess().getAllDeclaredMethodNamesAssignment_13()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:745:1: ( rule__FieldName__AllDeclaredMethodNamesAssignment_13 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:745:2: rule__FieldName__AllDeclaredMethodNamesAssignment_13
                    {
                    pushFollow(FOLLOW_rule__FieldName__AllDeclaredMethodNamesAssignment_13_in_rule__FieldName__Alternatives1578);
                    rule__FieldName__AllDeclaredMethodNamesAssignment_13();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getAllDeclaredMethodNamesAssignment_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:749:6: ( ( rule__FieldName__DeclaredMethodNamesAssignment_14 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:749:6: ( ( rule__FieldName__DeclaredMethodNamesAssignment_14 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:750:1: ( rule__FieldName__DeclaredMethodNamesAssignment_14 )
                    {
                     before(grammarAccess.getFieldNameAccess().getDeclaredMethodNamesAssignment_14()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:751:1: ( rule__FieldName__DeclaredMethodNamesAssignment_14 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:751:2: rule__FieldName__DeclaredMethodNamesAssignment_14
                    {
                    pushFollow(FOLLOW_rule__FieldName__DeclaredMethodNamesAssignment_14_in_rule__FieldName__Alternatives1596);
                    rule__FieldName__DeclaredMethodNamesAssignment_14();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getDeclaredMethodNamesAssignment_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:755:6: ( ( rule__FieldName__DeclaredFieldNamesAssignment_15 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:755:6: ( ( rule__FieldName__DeclaredFieldNamesAssignment_15 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:756:1: ( rule__FieldName__DeclaredFieldNamesAssignment_15 )
                    {
                     before(grammarAccess.getFieldNameAccess().getDeclaredFieldNamesAssignment_15()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:757:1: ( rule__FieldName__DeclaredFieldNamesAssignment_15 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:757:2: rule__FieldName__DeclaredFieldNamesAssignment_15
                    {
                    pushFollow(FOLLOW_rule__FieldName__DeclaredFieldNamesAssignment_15_in_rule__FieldName__Alternatives1614);
                    rule__FieldName__DeclaredFieldNamesAssignment_15();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getDeclaredFieldNamesAssignment_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:761:6: ( ( rule__FieldName__DeclaredFieldTypesAssignment_16 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:761:6: ( ( rule__FieldName__DeclaredFieldTypesAssignment_16 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:762:1: ( rule__FieldName__DeclaredFieldTypesAssignment_16 )
                    {
                     before(grammarAccess.getFieldNameAccess().getDeclaredFieldTypesAssignment_16()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:763:1: ( rule__FieldName__DeclaredFieldTypesAssignment_16 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:763:2: rule__FieldName__DeclaredFieldTypesAssignment_16
                    {
                    pushFollow(FOLLOW_rule__FieldName__DeclaredFieldTypesAssignment_16_in_rule__FieldName__Alternatives1632);
                    rule__FieldName__DeclaredFieldTypesAssignment_16();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getDeclaredFieldTypesAssignment_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:767:6: ( ( rule__FieldName__AllDeclaredFieldNamesAssignment_17 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:767:6: ( ( rule__FieldName__AllDeclaredFieldNamesAssignment_17 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:768:1: ( rule__FieldName__AllDeclaredFieldNamesAssignment_17 )
                    {
                     before(grammarAccess.getFieldNameAccess().getAllDeclaredFieldNamesAssignment_17()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:769:1: ( rule__FieldName__AllDeclaredFieldNamesAssignment_17 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:769:2: rule__FieldName__AllDeclaredFieldNamesAssignment_17
                    {
                    pushFollow(FOLLOW_rule__FieldName__AllDeclaredFieldNamesAssignment_17_in_rule__FieldName__Alternatives1650);
                    rule__FieldName__AllDeclaredFieldNamesAssignment_17();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getAllDeclaredFieldNamesAssignment_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:773:6: ( ( rule__FieldName__FullTextAssignment_18 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:773:6: ( ( rule__FieldName__FullTextAssignment_18 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:774:1: ( rule__FieldName__FullTextAssignment_18 )
                    {
                     before(grammarAccess.getFieldNameAccess().getFullTextAssignment_18()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:775:1: ( rule__FieldName__FullTextAssignment_18 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:775:2: rule__FieldName__FullTextAssignment_18
                    {
                    pushFollow(FOLLOW_rule__FieldName__FullTextAssignment_18_in_rule__FieldName__Alternatives1668);
                    rule__FieldName__FullTextAssignment_18();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getFullTextAssignment_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:779:6: ( ( rule__FieldName__FieldsReadAssignment_19 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:779:6: ( ( rule__FieldName__FieldsReadAssignment_19 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:780:1: ( rule__FieldName__FieldsReadAssignment_19 )
                    {
                     before(grammarAccess.getFieldNameAccess().getFieldsReadAssignment_19()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:781:1: ( rule__FieldName__FieldsReadAssignment_19 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:781:2: rule__FieldName__FieldsReadAssignment_19
                    {
                    pushFollow(FOLLOW_rule__FieldName__FieldsReadAssignment_19_in_rule__FieldName__Alternatives1686);
                    rule__FieldName__FieldsReadAssignment_19();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getFieldsReadAssignment_19()); 

                    }


                    }
                    break;
                case 21 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:785:6: ( ( rule__FieldName__FieldsWrittenAssignment_20 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:785:6: ( ( rule__FieldName__FieldsWrittenAssignment_20 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:786:1: ( rule__FieldName__FieldsWrittenAssignment_20 )
                    {
                     before(grammarAccess.getFieldNameAccess().getFieldsWrittenAssignment_20()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:787:1: ( rule__FieldName__FieldsWrittenAssignment_20 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:787:2: rule__FieldName__FieldsWrittenAssignment_20
                    {
                    pushFollow(FOLLOW_rule__FieldName__FieldsWrittenAssignment_20_in_rule__FieldName__Alternatives1704);
                    rule__FieldName__FieldsWrittenAssignment_20();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getFieldsWrittenAssignment_20()); 

                    }


                    }
                    break;
                case 22 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:791:6: ( ( rule__FieldName__UsedFieldsInFinallyAssignment_21 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:791:6: ( ( rule__FieldName__UsedFieldsInFinallyAssignment_21 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:792:1: ( rule__FieldName__UsedFieldsInFinallyAssignment_21 )
                    {
                     before(grammarAccess.getFieldNameAccess().getUsedFieldsInFinallyAssignment_21()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:793:1: ( rule__FieldName__UsedFieldsInFinallyAssignment_21 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:793:2: rule__FieldName__UsedFieldsInFinallyAssignment_21
                    {
                    pushFollow(FOLLOW_rule__FieldName__UsedFieldsInFinallyAssignment_21_in_rule__FieldName__Alternatives1722);
                    rule__FieldName__UsedFieldsInFinallyAssignment_21();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getUsedFieldsInFinallyAssignment_21()); 

                    }


                    }
                    break;
                case 23 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:797:6: ( ( rule__FieldName__UsedFieldsInTryAssignment_22 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:797:6: ( ( rule__FieldName__UsedFieldsInTryAssignment_22 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:798:1: ( rule__FieldName__UsedFieldsInTryAssignment_22 )
                    {
                     before(grammarAccess.getFieldNameAccess().getUsedFieldsInTryAssignment_22()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:799:1: ( rule__FieldName__UsedFieldsInTryAssignment_22 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:799:2: rule__FieldName__UsedFieldsInTryAssignment_22
                    {
                    pushFollow(FOLLOW_rule__FieldName__UsedFieldsInTryAssignment_22_in_rule__FieldName__Alternatives1740);
                    rule__FieldName__UsedFieldsInTryAssignment_22();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getUsedFieldsInTryAssignment_22()); 

                    }


                    }
                    break;
                case 24 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:803:6: ( ( rule__FieldName__AnnotationsAssignment_23 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:803:6: ( ( rule__FieldName__AnnotationsAssignment_23 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:804:1: ( rule__FieldName__AnnotationsAssignment_23 )
                    {
                     before(grammarAccess.getFieldNameAccess().getAnnotationsAssignment_23()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:805:1: ( rule__FieldName__AnnotationsAssignment_23 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:805:2: rule__FieldName__AnnotationsAssignment_23
                    {
                    pushFollow(FOLLOW_rule__FieldName__AnnotationsAssignment_23_in_rule__FieldName__Alternatives1758);
                    rule__FieldName__AnnotationsAssignment_23();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldNameAccess().getAnnotationsAssignment_23()); 

                    }


                    }
                    break;
                case 25 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:809:6: ( ( rule__FieldName__TimestampAssignment_24 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:809:6: ( ( rule__FieldName__TimestampAssignment_24 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:810:1: ( rule__FieldName__TimestampAssignment_24 )
                    {
                     before(grammarAccess.getFieldNameAccess().getTimestampAssignment_24()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:811:1: ( rule__FieldName__TimestampAssignment_24 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:811:2: rule__FieldName__TimestampAssignment_24
                    {
                    pushFollow(FOLLOW_rule__FieldName__TimestampAssignment_24_in_rule__FieldName__Alternatives1776);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:820:1: rule__TypeFieldName__Alternatives : ( ( ( rule__TypeFieldName__ImplementedTypesAssignment_0 ) ) | ( ( rule__TypeFieldName__ExtendedTypesAssignment_1 ) ) | ( ( rule__TypeFieldName__UsedTypesAssignment_2 ) ) | ( ( rule__TypeFieldName__UsedTypesInTryAssignment_3 ) ) | ( ( rule__TypeFieldName__UsedTypesInFinallyAssignment_4 ) ) | ( ( rule__TypeFieldName__ParameterTypesAssignment_5 ) ) | ( ( rule__TypeFieldName__ReturnTypeAssignment_6 ) ) | ( ( rule__TypeFieldName__AllImplementedTypesAssignment_7 ) ) | ( ( rule__TypeFieldName__AllExtendedTypesAssignment_8 ) ) | ( ( rule__TypeFieldName__FieldTypeAssignment_9 ) ) | ( ( rule__TypeFieldName__DeclaringTypeAssignment_10 ) ) | ( ( rule__TypeFieldName__CaughtTypeAssignment_11 ) ) | ( ( rule__TypeFieldName__InstanceofTypesAssignment_12 ) ) );
    public final void rule__TypeFieldName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:824:1: ( ( ( rule__TypeFieldName__ImplementedTypesAssignment_0 ) ) | ( ( rule__TypeFieldName__ExtendedTypesAssignment_1 ) ) | ( ( rule__TypeFieldName__UsedTypesAssignment_2 ) ) | ( ( rule__TypeFieldName__UsedTypesInTryAssignment_3 ) ) | ( ( rule__TypeFieldName__UsedTypesInFinallyAssignment_4 ) ) | ( ( rule__TypeFieldName__ParameterTypesAssignment_5 ) ) | ( ( rule__TypeFieldName__ReturnTypeAssignment_6 ) ) | ( ( rule__TypeFieldName__AllImplementedTypesAssignment_7 ) ) | ( ( rule__TypeFieldName__AllExtendedTypesAssignment_8 ) ) | ( ( rule__TypeFieldName__FieldTypeAssignment_9 ) ) | ( ( rule__TypeFieldName__DeclaringTypeAssignment_10 ) ) | ( ( rule__TypeFieldName__CaughtTypeAssignment_11 ) ) | ( ( rule__TypeFieldName__InstanceofTypesAssignment_12 ) ) )
            int alt8=13;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt8=1;
                }
                break;
            case 51:
                {
                alt8=2;
                }
                break;
            case 52:
                {
                alt8=3;
                }
                break;
            case 53:
                {
                alt8=4;
                }
                break;
            case 54:
                {
                alt8=5;
                }
                break;
            case 55:
                {
                alt8=6;
                }
                break;
            case 56:
                {
                alt8=7;
                }
                break;
            case 57:
                {
                alt8=8;
                }
                break;
            case 58:
                {
                alt8=9;
                }
                break;
            case 59:
                {
                alt8=10;
                }
                break;
            case 60:
                {
                alt8=11;
                }
                break;
            case 61:
                {
                alt8=12;
                }
                break;
            case 62:
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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:825:1: ( ( rule__TypeFieldName__ImplementedTypesAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:825:1: ( ( rule__TypeFieldName__ImplementedTypesAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:826:1: ( rule__TypeFieldName__ImplementedTypesAssignment_0 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getImplementedTypesAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:827:1: ( rule__TypeFieldName__ImplementedTypesAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:827:2: rule__TypeFieldName__ImplementedTypesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__ImplementedTypesAssignment_0_in_rule__TypeFieldName__Alternatives1809);
                    rule__TypeFieldName__ImplementedTypesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getImplementedTypesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:831:6: ( ( rule__TypeFieldName__ExtendedTypesAssignment_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:831:6: ( ( rule__TypeFieldName__ExtendedTypesAssignment_1 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:832:1: ( rule__TypeFieldName__ExtendedTypesAssignment_1 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getExtendedTypesAssignment_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:833:1: ( rule__TypeFieldName__ExtendedTypesAssignment_1 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:833:2: rule__TypeFieldName__ExtendedTypesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__ExtendedTypesAssignment_1_in_rule__TypeFieldName__Alternatives1827);
                    rule__TypeFieldName__ExtendedTypesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getExtendedTypesAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:837:6: ( ( rule__TypeFieldName__UsedTypesAssignment_2 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:837:6: ( ( rule__TypeFieldName__UsedTypesAssignment_2 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:838:1: ( rule__TypeFieldName__UsedTypesAssignment_2 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getUsedTypesAssignment_2()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:839:1: ( rule__TypeFieldName__UsedTypesAssignment_2 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:839:2: rule__TypeFieldName__UsedTypesAssignment_2
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__UsedTypesAssignment_2_in_rule__TypeFieldName__Alternatives1845);
                    rule__TypeFieldName__UsedTypesAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getUsedTypesAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:843:6: ( ( rule__TypeFieldName__UsedTypesInTryAssignment_3 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:843:6: ( ( rule__TypeFieldName__UsedTypesInTryAssignment_3 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:844:1: ( rule__TypeFieldName__UsedTypesInTryAssignment_3 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getUsedTypesInTryAssignment_3()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:845:1: ( rule__TypeFieldName__UsedTypesInTryAssignment_3 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:845:2: rule__TypeFieldName__UsedTypesInTryAssignment_3
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__UsedTypesInTryAssignment_3_in_rule__TypeFieldName__Alternatives1863);
                    rule__TypeFieldName__UsedTypesInTryAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getUsedTypesInTryAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:849:6: ( ( rule__TypeFieldName__UsedTypesInFinallyAssignment_4 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:849:6: ( ( rule__TypeFieldName__UsedTypesInFinallyAssignment_4 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:850:1: ( rule__TypeFieldName__UsedTypesInFinallyAssignment_4 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getUsedTypesInFinallyAssignment_4()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:851:1: ( rule__TypeFieldName__UsedTypesInFinallyAssignment_4 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:851:2: rule__TypeFieldName__UsedTypesInFinallyAssignment_4
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__UsedTypesInFinallyAssignment_4_in_rule__TypeFieldName__Alternatives1881);
                    rule__TypeFieldName__UsedTypesInFinallyAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getUsedTypesInFinallyAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:855:6: ( ( rule__TypeFieldName__ParameterTypesAssignment_5 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:855:6: ( ( rule__TypeFieldName__ParameterTypesAssignment_5 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:856:1: ( rule__TypeFieldName__ParameterTypesAssignment_5 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getParameterTypesAssignment_5()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:857:1: ( rule__TypeFieldName__ParameterTypesAssignment_5 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:857:2: rule__TypeFieldName__ParameterTypesAssignment_5
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__ParameterTypesAssignment_5_in_rule__TypeFieldName__Alternatives1899);
                    rule__TypeFieldName__ParameterTypesAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getParameterTypesAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:861:6: ( ( rule__TypeFieldName__ReturnTypeAssignment_6 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:861:6: ( ( rule__TypeFieldName__ReturnTypeAssignment_6 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:862:1: ( rule__TypeFieldName__ReturnTypeAssignment_6 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getReturnTypeAssignment_6()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:863:1: ( rule__TypeFieldName__ReturnTypeAssignment_6 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:863:2: rule__TypeFieldName__ReturnTypeAssignment_6
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__ReturnTypeAssignment_6_in_rule__TypeFieldName__Alternatives1917);
                    rule__TypeFieldName__ReturnTypeAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getReturnTypeAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:867:6: ( ( rule__TypeFieldName__AllImplementedTypesAssignment_7 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:867:6: ( ( rule__TypeFieldName__AllImplementedTypesAssignment_7 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:868:1: ( rule__TypeFieldName__AllImplementedTypesAssignment_7 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getAllImplementedTypesAssignment_7()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:869:1: ( rule__TypeFieldName__AllImplementedTypesAssignment_7 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:869:2: rule__TypeFieldName__AllImplementedTypesAssignment_7
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__AllImplementedTypesAssignment_7_in_rule__TypeFieldName__Alternatives1935);
                    rule__TypeFieldName__AllImplementedTypesAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getAllImplementedTypesAssignment_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:873:6: ( ( rule__TypeFieldName__AllExtendedTypesAssignment_8 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:873:6: ( ( rule__TypeFieldName__AllExtendedTypesAssignment_8 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:874:1: ( rule__TypeFieldName__AllExtendedTypesAssignment_8 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getAllExtendedTypesAssignment_8()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:875:1: ( rule__TypeFieldName__AllExtendedTypesAssignment_8 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:875:2: rule__TypeFieldName__AllExtendedTypesAssignment_8
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__AllExtendedTypesAssignment_8_in_rule__TypeFieldName__Alternatives1953);
                    rule__TypeFieldName__AllExtendedTypesAssignment_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getAllExtendedTypesAssignment_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:879:6: ( ( rule__TypeFieldName__FieldTypeAssignment_9 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:879:6: ( ( rule__TypeFieldName__FieldTypeAssignment_9 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:880:1: ( rule__TypeFieldName__FieldTypeAssignment_9 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getFieldTypeAssignment_9()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:881:1: ( rule__TypeFieldName__FieldTypeAssignment_9 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:881:2: rule__TypeFieldName__FieldTypeAssignment_9
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__FieldTypeAssignment_9_in_rule__TypeFieldName__Alternatives1971);
                    rule__TypeFieldName__FieldTypeAssignment_9();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getFieldTypeAssignment_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:885:6: ( ( rule__TypeFieldName__DeclaringTypeAssignment_10 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:885:6: ( ( rule__TypeFieldName__DeclaringTypeAssignment_10 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:886:1: ( rule__TypeFieldName__DeclaringTypeAssignment_10 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getDeclaringTypeAssignment_10()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:887:1: ( rule__TypeFieldName__DeclaringTypeAssignment_10 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:887:2: rule__TypeFieldName__DeclaringTypeAssignment_10
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__DeclaringTypeAssignment_10_in_rule__TypeFieldName__Alternatives1989);
                    rule__TypeFieldName__DeclaringTypeAssignment_10();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getDeclaringTypeAssignment_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:891:6: ( ( rule__TypeFieldName__CaughtTypeAssignment_11 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:891:6: ( ( rule__TypeFieldName__CaughtTypeAssignment_11 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:892:1: ( rule__TypeFieldName__CaughtTypeAssignment_11 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getCaughtTypeAssignment_11()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:893:1: ( rule__TypeFieldName__CaughtTypeAssignment_11 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:893:2: rule__TypeFieldName__CaughtTypeAssignment_11
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__CaughtTypeAssignment_11_in_rule__TypeFieldName__Alternatives2007);
                    rule__TypeFieldName__CaughtTypeAssignment_11();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldNameAccess().getCaughtTypeAssignment_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:897:6: ( ( rule__TypeFieldName__InstanceofTypesAssignment_12 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:897:6: ( ( rule__TypeFieldName__InstanceofTypesAssignment_12 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:898:1: ( rule__TypeFieldName__InstanceofTypesAssignment_12 )
                    {
                     before(grammarAccess.getTypeFieldNameAccess().getInstanceofTypesAssignment_12()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:899:1: ( rule__TypeFieldName__InstanceofTypesAssignment_12 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:899:2: rule__TypeFieldName__InstanceofTypesAssignment_12
                    {
                    pushFollow(FOLLOW_rule__TypeFieldName__InstanceofTypesAssignment_12_in_rule__TypeFieldName__Alternatives2025);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:908:1: rule__BooleanExp__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__BooleanExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:912:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            else if ( (LA9_0==17) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:913:1: ( ( 'AND' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:913:1: ( ( 'AND' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:914:1: ( 'AND' )
                    {
                     before(grammarAccess.getBooleanExpAccess().getAnd1EnumLiteralDeclaration_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:915:1: ( 'AND' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:915:3: 'AND'
                    {
                    match(input,16,FOLLOW_16_in_rule__BooleanExp__Alternatives2059); 

                    }

                     after(grammarAccess.getBooleanExpAccess().getAnd1EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:920:6: ( ( 'OR' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:920:6: ( ( 'OR' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:921:1: ( 'OR' )
                    {
                     before(grammarAccess.getBooleanExpAccess().getOr1EnumLiteralDeclaration_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:922:1: ( 'OR' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:922:3: 'OR'
                    {
                    match(input,17,FOLLOW_17_in_rule__BooleanExp__Alternatives2080); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:932:1: rule__NotExpression__Alternatives : ( ( ( '-' ) ) | ( ( 'NOT' ) ) | ( ( '!' ) ) );
    public final void rule__NotExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:936:1: ( ( ( '-' ) ) | ( ( 'NOT' ) ) | ( ( '!' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt10=1;
                }
                break;
            case 19:
                {
                alt10=2;
                }
                break;
            case 20:
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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:937:1: ( ( '-' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:937:1: ( ( '-' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:938:1: ( '-' )
                    {
                     before(grammarAccess.getNotExpressionAccess().getN1EnumLiteralDeclaration_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:939:1: ( '-' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:939:3: '-'
                    {
                    match(input,18,FOLLOW_18_in_rule__NotExpression__Alternatives2116); 

                    }

                     after(grammarAccess.getNotExpressionAccess().getN1EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:944:6: ( ( 'NOT' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:944:6: ( ( 'NOT' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:945:1: ( 'NOT' )
                    {
                     before(grammarAccess.getNotExpressionAccess().getN2EnumLiteralDeclaration_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:946:1: ( 'NOT' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:946:3: 'NOT'
                    {
                    match(input,19,FOLLOW_19_in_rule__NotExpression__Alternatives2137); 

                    }

                     after(grammarAccess.getNotExpressionAccess().getN2EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:951:6: ( ( '!' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:951:6: ( ( '!' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:952:1: ( '!' )
                    {
                     before(grammarAccess.getNotExpressionAccess().getN3EnumLiteralDeclaration_2()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:953:1: ( '!' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:953:3: '!'
                    {
                    match(input,20,FOLLOW_20_in_rule__NotExpression__Alternatives2158); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:965:1: rule__Exp1__Group__0 : rule__Exp1__Group__0__Impl rule__Exp1__Group__1 ;
    public final void rule__Exp1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:969:1: ( rule__Exp1__Group__0__Impl rule__Exp1__Group__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:970:2: rule__Exp1__Group__0__Impl rule__Exp1__Group__1
            {
            pushFollow(FOLLOW_rule__Exp1__Group__0__Impl_in_rule__Exp1__Group__02191);
            rule__Exp1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp1__Group__1_in_rule__Exp1__Group__02194);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:977:1: rule__Exp1__Group__0__Impl : ( ruleExp2 ) ;
    public final void rule__Exp1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:981:1: ( ( ruleExp2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:982:1: ( ruleExp2 )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:982:1: ( ruleExp2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:983:1: ruleExp2
            {
             before(grammarAccess.getExp1Access().getExp2ParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleExp2_in_rule__Exp1__Group__0__Impl2221);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:994:1: rule__Exp1__Group__1 : rule__Exp1__Group__1__Impl ;
    public final void rule__Exp1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:998:1: ( rule__Exp1__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:999:2: rule__Exp1__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Exp1__Group__1__Impl_in_rule__Exp1__Group__12250);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1005:1: rule__Exp1__Group__1__Impl : ( ( rule__Exp1__Group_1__0 )* ) ;
    public final void rule__Exp1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1009:1: ( ( ( rule__Exp1__Group_1__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1010:1: ( ( rule__Exp1__Group_1__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1010:1: ( ( rule__Exp1__Group_1__0 )* )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1011:1: ( rule__Exp1__Group_1__0 )*
            {
             before(grammarAccess.getExp1Access().getGroup_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1012:1: ( rule__Exp1__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=16 && LA11_0<=17)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1012:2: rule__Exp1__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Exp1__Group_1__0_in_rule__Exp1__Group__1__Impl2277);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1026:1: rule__Exp1__Group_1__0 : rule__Exp1__Group_1__0__Impl rule__Exp1__Group_1__1 ;
    public final void rule__Exp1__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1030:1: ( rule__Exp1__Group_1__0__Impl rule__Exp1__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1031:2: rule__Exp1__Group_1__0__Impl rule__Exp1__Group_1__1
            {
            pushFollow(FOLLOW_rule__Exp1__Group_1__0__Impl_in_rule__Exp1__Group_1__02312);
            rule__Exp1__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp1__Group_1__1_in_rule__Exp1__Group_1__02315);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1038:1: rule__Exp1__Group_1__0__Impl : ( () ) ;
    public final void rule__Exp1__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1042:1: ( ( () ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1043:1: ( () )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1043:1: ( () )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1044:1: ()
            {
             before(grammarAccess.getExp1Access().getExp1LeftAction_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1045:1: ()
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1047:1: 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1057:1: rule__Exp1__Group_1__1 : rule__Exp1__Group_1__1__Impl rule__Exp1__Group_1__2 ;
    public final void rule__Exp1__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1061:1: ( rule__Exp1__Group_1__1__Impl rule__Exp1__Group_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1062:2: rule__Exp1__Group_1__1__Impl rule__Exp1__Group_1__2
            {
            pushFollow(FOLLOW_rule__Exp1__Group_1__1__Impl_in_rule__Exp1__Group_1__12373);
            rule__Exp1__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp1__Group_1__2_in_rule__Exp1__Group_1__12376);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1069:1: rule__Exp1__Group_1__1__Impl : ( ( rule__Exp1__BAssignment_1_1 ) ) ;
    public final void rule__Exp1__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1073:1: ( ( ( rule__Exp1__BAssignment_1_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1074:1: ( ( rule__Exp1__BAssignment_1_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1074:1: ( ( rule__Exp1__BAssignment_1_1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1075:1: ( rule__Exp1__BAssignment_1_1 )
            {
             before(grammarAccess.getExp1Access().getBAssignment_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1076:1: ( rule__Exp1__BAssignment_1_1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1076:2: rule__Exp1__BAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Exp1__BAssignment_1_1_in_rule__Exp1__Group_1__1__Impl2403);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1086:1: rule__Exp1__Group_1__2 : rule__Exp1__Group_1__2__Impl ;
    public final void rule__Exp1__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1090:1: ( rule__Exp1__Group_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1091:2: rule__Exp1__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Exp1__Group_1__2__Impl_in_rule__Exp1__Group_1__22433);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1097:1: rule__Exp1__Group_1__2__Impl : ( ( rule__Exp1__RightAssignment_1_2 ) ) ;
    public final void rule__Exp1__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1101:1: ( ( ( rule__Exp1__RightAssignment_1_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1102:1: ( ( rule__Exp1__RightAssignment_1_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1102:1: ( ( rule__Exp1__RightAssignment_1_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1103:1: ( rule__Exp1__RightAssignment_1_2 )
            {
             before(grammarAccess.getExp1Access().getRightAssignment_1_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1104:1: ( rule__Exp1__RightAssignment_1_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1104:2: rule__Exp1__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Exp1__RightAssignment_1_2_in_rule__Exp1__Group_1__2__Impl2460);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1120:1: rule__Exp2__Group_1__0 : rule__Exp2__Group_1__0__Impl rule__Exp2__Group_1__1 ;
    public final void rule__Exp2__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1124:1: ( rule__Exp2__Group_1__0__Impl rule__Exp2__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1125:2: rule__Exp2__Group_1__0__Impl rule__Exp2__Group_1__1
            {
            pushFollow(FOLLOW_rule__Exp2__Group_1__0__Impl_in_rule__Exp2__Group_1__02496);
            rule__Exp2__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp2__Group_1__1_in_rule__Exp2__Group_1__02499);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1132:1: rule__Exp2__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Exp2__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1136:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1137:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1137:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1138:1: '('
            {
             before(grammarAccess.getExp2Access().getLeftParenthesisKeyword_1_0()); 
            match(input,21,FOLLOW_21_in_rule__Exp2__Group_1__0__Impl2527); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1151:1: rule__Exp2__Group_1__1 : rule__Exp2__Group_1__1__Impl rule__Exp2__Group_1__2 ;
    public final void rule__Exp2__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1155:1: ( rule__Exp2__Group_1__1__Impl rule__Exp2__Group_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1156:2: rule__Exp2__Group_1__1__Impl rule__Exp2__Group_1__2
            {
            pushFollow(FOLLOW_rule__Exp2__Group_1__1__Impl_in_rule__Exp2__Group_1__12558);
            rule__Exp2__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp2__Group_1__2_in_rule__Exp2__Group_1__12561);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1163:1: rule__Exp2__Group_1__1__Impl : ( ruleExp1 ) ;
    public final void rule__Exp2__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1167:1: ( ( ruleExp1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1168:1: ( ruleExp1 )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1168:1: ( ruleExp1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1169:1: ruleExp1
            {
             before(grammarAccess.getExp2Access().getExp1ParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleExp1_in_rule__Exp2__Group_1__1__Impl2588);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1180:1: rule__Exp2__Group_1__2 : rule__Exp2__Group_1__2__Impl ;
    public final void rule__Exp2__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1184:1: ( rule__Exp2__Group_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1185:2: rule__Exp2__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Exp2__Group_1__2__Impl_in_rule__Exp2__Group_1__22617);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1191:1: rule__Exp2__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Exp2__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1195:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1196:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1196:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1197:1: ')'
            {
             before(grammarAccess.getExp2Access().getRightParenthesisKeyword_1_2()); 
            match(input,22,FOLLOW_22_in_rule__Exp2__Group_1__2__Impl2645); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1216:1: rule__ClauseExpression__Group__0 : rule__ClauseExpression__Group__0__Impl rule__ClauseExpression__Group__1 ;
    public final void rule__ClauseExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1220:1: ( rule__ClauseExpression__Group__0__Impl rule__ClauseExpression__Group__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1221:2: rule__ClauseExpression__Group__0__Impl rule__ClauseExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group__0__Impl_in_rule__ClauseExpression__Group__02682);
            rule__ClauseExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group__1_in_rule__ClauseExpression__Group__02685);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1228:1: rule__ClauseExpression__Group__0__Impl : ( ( rule__ClauseExpression__Alternatives_0 )? ) ;
    public final void rule__ClauseExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1232:1: ( ( ( rule__ClauseExpression__Alternatives_0 )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1233:1: ( ( rule__ClauseExpression__Alternatives_0 )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1233:1: ( ( rule__ClauseExpression__Alternatives_0 )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1234:1: ( rule__ClauseExpression__Alternatives_0 )?
            {
             before(grammarAccess.getClauseExpressionAccess().getAlternatives_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1235:1: ( rule__ClauseExpression__Alternatives_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==11||(LA12_0>=18 && LA12_0<=20)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1235:2: rule__ClauseExpression__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Alternatives_0_in_rule__ClauseExpression__Group__0__Impl2712);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1245:1: rule__ClauseExpression__Group__1 : rule__ClauseExpression__Group__1__Impl ;
    public final void rule__ClauseExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1249:1: ( rule__ClauseExpression__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1250:2: rule__ClauseExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group__1__Impl_in_rule__ClauseExpression__Group__12743);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1256:1: rule__ClauseExpression__Group__1__Impl : ( ( rule__ClauseExpression__Alternatives_1 ) ) ;
    public final void rule__ClauseExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1260:1: ( ( ( rule__ClauseExpression__Alternatives_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1261:1: ( ( rule__ClauseExpression__Alternatives_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1261:1: ( ( rule__ClauseExpression__Alternatives_1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1262:1: ( rule__ClauseExpression__Alternatives_1 )
            {
             before(grammarAccess.getClauseExpressionAccess().getAlternatives_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1263:1: ( rule__ClauseExpression__Alternatives_1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1263:2: rule__ClauseExpression__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Alternatives_1_in_rule__ClauseExpression__Group__1__Impl2770);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1277:1: rule__SimpleClause__Group__0 : rule__SimpleClause__Group__0__Impl rule__SimpleClause__Group__1 ;
    public final void rule__SimpleClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1281:1: ( rule__SimpleClause__Group__0__Impl rule__SimpleClause__Group__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1282:2: rule__SimpleClause__Group__0__Impl rule__SimpleClause__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleClause__Group__0__Impl_in_rule__SimpleClause__Group__02804);
            rule__SimpleClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClause__Group__1_in_rule__SimpleClause__Group__02807);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1289:1: rule__SimpleClause__Group__0__Impl : ( ( rule__SimpleClause__FieldAssignment_0 ) ) ;
    public final void rule__SimpleClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1293:1: ( ( ( rule__SimpleClause__FieldAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1294:1: ( ( rule__SimpleClause__FieldAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1294:1: ( ( rule__SimpleClause__FieldAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1295:1: ( rule__SimpleClause__FieldAssignment_0 )
            {
             before(grammarAccess.getSimpleClauseAccess().getFieldAssignment_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1296:1: ( rule__SimpleClause__FieldAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1296:2: rule__SimpleClause__FieldAssignment_0
            {
            pushFollow(FOLLOW_rule__SimpleClause__FieldAssignment_0_in_rule__SimpleClause__Group__0__Impl2834);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1306:1: rule__SimpleClause__Group__1 : rule__SimpleClause__Group__1__Impl rule__SimpleClause__Group__2 ;
    public final void rule__SimpleClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1310:1: ( rule__SimpleClause__Group__1__Impl rule__SimpleClause__Group__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1311:2: rule__SimpleClause__Group__1__Impl rule__SimpleClause__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleClause__Group__1__Impl_in_rule__SimpleClause__Group__12864);
            rule__SimpleClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClause__Group__2_in_rule__SimpleClause__Group__12867);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1318:1: rule__SimpleClause__Group__1__Impl : ( ':' ) ;
    public final void rule__SimpleClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1322:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1323:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1323:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1324:1: ':'
            {
             before(grammarAccess.getSimpleClauseAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__SimpleClause__Group__1__Impl2895); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1337:1: rule__SimpleClause__Group__2 : rule__SimpleClause__Group__2__Impl ;
    public final void rule__SimpleClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1341:1: ( rule__SimpleClause__Group__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1342:2: rule__SimpleClause__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SimpleClause__Group__2__Impl_in_rule__SimpleClause__Group__22926);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1348:1: rule__SimpleClause__Group__2__Impl : ( ( rule__SimpleClause__ValueAssignment_2 ) ) ;
    public final void rule__SimpleClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1352:1: ( ( ( rule__SimpleClause__ValueAssignment_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1353:1: ( ( rule__SimpleClause__ValueAssignment_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1353:1: ( ( rule__SimpleClause__ValueAssignment_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1354:1: ( rule__SimpleClause__ValueAssignment_2 )
            {
             before(grammarAccess.getSimpleClauseAccess().getValueAssignment_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1355:1: ( rule__SimpleClause__ValueAssignment_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1355:2: rule__SimpleClause__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__SimpleClause__ValueAssignment_2_in_rule__SimpleClause__Group__2__Impl2953);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1371:1: rule__TypeClause__Group__0 : rule__TypeClause__Group__0__Impl rule__TypeClause__Group__1 ;
    public final void rule__TypeClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1375:1: ( rule__TypeClause__Group__0__Impl rule__TypeClause__Group__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1376:2: rule__TypeClause__Group__0__Impl rule__TypeClause__Group__1
            {
            pushFollow(FOLLOW_rule__TypeClause__Group__0__Impl_in_rule__TypeClause__Group__02989);
            rule__TypeClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeClause__Group__1_in_rule__TypeClause__Group__02992);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1383:1: rule__TypeClause__Group__0__Impl : ( ( rule__TypeClause__FieldAssignment_0 ) ) ;
    public final void rule__TypeClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1387:1: ( ( ( rule__TypeClause__FieldAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1388:1: ( ( rule__TypeClause__FieldAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1388:1: ( ( rule__TypeClause__FieldAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1389:1: ( rule__TypeClause__FieldAssignment_0 )
            {
             before(grammarAccess.getTypeClauseAccess().getFieldAssignment_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1390:1: ( rule__TypeClause__FieldAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1390:2: rule__TypeClause__FieldAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeClause__FieldAssignment_0_in_rule__TypeClause__Group__0__Impl3019);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1400:1: rule__TypeClause__Group__1 : rule__TypeClause__Group__1__Impl rule__TypeClause__Group__2 ;
    public final void rule__TypeClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1404:1: ( rule__TypeClause__Group__1__Impl rule__TypeClause__Group__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1405:2: rule__TypeClause__Group__1__Impl rule__TypeClause__Group__2
            {
            pushFollow(FOLLOW_rule__TypeClause__Group__1__Impl_in_rule__TypeClause__Group__13049);
            rule__TypeClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeClause__Group__2_in_rule__TypeClause__Group__13052);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1412:1: rule__TypeClause__Group__1__Impl : ( ':' ) ;
    public final void rule__TypeClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1416:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1417:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1417:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1418:1: ':'
            {
             before(grammarAccess.getTypeClauseAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__TypeClause__Group__1__Impl3080); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1431:1: rule__TypeClause__Group__2 : rule__TypeClause__Group__2__Impl ;
    public final void rule__TypeClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1435:1: ( rule__TypeClause__Group__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1436:2: rule__TypeClause__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeClause__Group__2__Impl_in_rule__TypeClause__Group__23111);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1442:1: rule__TypeClause__Group__2__Impl : ( ( rule__TypeClause__ValueAssignment_2 ) ) ;
    public final void rule__TypeClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1446:1: ( ( ( rule__TypeClause__ValueAssignment_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1447:1: ( ( rule__TypeClause__ValueAssignment_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1447:1: ( ( rule__TypeClause__ValueAssignment_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1448:1: ( rule__TypeClause__ValueAssignment_2 )
            {
             before(grammarAccess.getTypeClauseAccess().getValueAssignment_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1449:1: ( rule__TypeClause__ValueAssignment_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1449:2: rule__TypeClause__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__TypeClause__ValueAssignment_2_in_rule__TypeClause__Group__2__Impl3138);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1465:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1469:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1470:2: rule__Value__Group__0__Impl rule__Value__Group__1
            {
            pushFollow(FOLLOW_rule__Value__Group__0__Impl_in_rule__Value__Group__03174);
            rule__Value__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Value__Group__1_in_rule__Value__Group__03177);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1477:1: rule__Value__Group__0__Impl : ( ( ruleWildcard )? ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1481:1: ( ( ( ruleWildcard )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1482:1: ( ( ruleWildcard )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1482:1: ( ( ruleWildcard )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1483:1: ( ruleWildcard )?
            {
             before(grammarAccess.getValueAccess().getWildcardParserRuleCall_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1484:1: ( ruleWildcard )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==14) ) {
                alt13=1;
            }
            else if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1484:3: ruleWildcard
                    {
                    pushFollow(FOLLOW_ruleWildcard_in_rule__Value__Group__0__Impl3205);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1494:1: rule__Value__Group__1 : rule__Value__Group__1__Impl ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1498:1: ( rule__Value__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1499:2: rule__Value__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Value__Group__1__Impl_in_rule__Value__Group__13236);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1505:1: rule__Value__Group__1__Impl : ( ( rule__Value__Group_1__0 )? ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1509:1: ( ( ( rule__Value__Group_1__0 )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1510:1: ( ( rule__Value__Group_1__0 )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1510:1: ( ( rule__Value__Group_1__0 )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1511:1: ( rule__Value__Group_1__0 )?
            {
             before(grammarAccess.getValueAccess().getGroup_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1512:1: ( rule__Value__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1512:2: rule__Value__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Value__Group_1__0_in_rule__Value__Group__1__Impl3263);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1526:1: rule__Value__Group_1__0 : rule__Value__Group_1__0__Impl rule__Value__Group_1__1 ;
    public final void rule__Value__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1530:1: ( rule__Value__Group_1__0__Impl rule__Value__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1531:2: rule__Value__Group_1__0__Impl rule__Value__Group_1__1
            {
            pushFollow(FOLLOW_rule__Value__Group_1__0__Impl_in_rule__Value__Group_1__03298);
            rule__Value__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Value__Group_1__1_in_rule__Value__Group_1__03301);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1538:1: rule__Value__Group_1__0__Impl : ( ( rule__Value__Group_1_0__0 ) ) ;
    public final void rule__Value__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1542:1: ( ( ( rule__Value__Group_1_0__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1543:1: ( ( rule__Value__Group_1_0__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1543:1: ( ( rule__Value__Group_1_0__0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1544:1: ( rule__Value__Group_1_0__0 )
            {
             before(grammarAccess.getValueAccess().getGroup_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1545:1: ( rule__Value__Group_1_0__0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1545:2: rule__Value__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Value__Group_1_0__0_in_rule__Value__Group_1__0__Impl3328);
            rule__Value__Group_1_0__0();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getGroup_1_0()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1555:1: rule__Value__Group_1__1 : rule__Value__Group_1__1__Impl rule__Value__Group_1__2 ;
    public final void rule__Value__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1559:1: ( rule__Value__Group_1__1__Impl rule__Value__Group_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1560:2: rule__Value__Group_1__1__Impl rule__Value__Group_1__2
            {
            pushFollow(FOLLOW_rule__Value__Group_1__1__Impl_in_rule__Value__Group_1__13358);
            rule__Value__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Value__Group_1__2_in_rule__Value__Group_1__13361);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1567:1: rule__Value__Group_1__1__Impl : ( ( rule__Value__Group_1_1__0 )* ) ;
    public final void rule__Value__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1571:1: ( ( ( rule__Value__Group_1_1__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1572:1: ( ( rule__Value__Group_1_1__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1572:1: ( ( rule__Value__Group_1_1__0 )* )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1573:1: ( rule__Value__Group_1_1__0 )*
            {
             before(grammarAccess.getValueAccess().getGroup_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1574:1: ( rule__Value__Group_1_1__0 )*
            loop15:
            do {
                int alt15=2;
                switch ( input.LA(1) ) {
                case 14:
                    {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==RULE_ID) ) {
                        alt15=1;
                    }


                    }
                    break;
                case 15:
                    {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==RULE_ID) ) {
                        alt15=1;
                    }


                    }
                    break;
                case RULE_ID:
                    {
                    alt15=1;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1574:2: rule__Value__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Value__Group_1_1__0_in_rule__Value__Group_1__1__Impl3388);
            	    rule__Value__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1584:1: rule__Value__Group_1__2 : rule__Value__Group_1__2__Impl ;
    public final void rule__Value__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1588:1: ( rule__Value__Group_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1589:2: rule__Value__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Value__Group_1__2__Impl_in_rule__Value__Group_1__23419);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1595:1: rule__Value__Group_1__2__Impl : ( ( ruleWildcard )? ) ;
    public final void rule__Value__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1599:1: ( ( ( ruleWildcard )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1600:1: ( ( ruleWildcard )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1600:1: ( ( ruleWildcard )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1601:1: ( ruleWildcard )?
            {
             before(grammarAccess.getValueAccess().getWildcardParserRuleCall_1_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1602:1: ( ruleWildcard )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==14) ) {
                alt16=1;
            }
            else if ( (LA16_0==15) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1602:3: ruleWildcard
                    {
                    pushFollow(FOLLOW_ruleWildcard_in_rule__Value__Group_1__2__Impl3447);
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


    // $ANTLR start "rule__Value__Group_1_0__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1618:1: rule__Value__Group_1_0__0 : rule__Value__Group_1_0__0__Impl rule__Value__Group_1_0__1 ;
    public final void rule__Value__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1622:1: ( rule__Value__Group_1_0__0__Impl rule__Value__Group_1_0__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1623:2: rule__Value__Group_1_0__0__Impl rule__Value__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Value__Group_1_0__0__Impl_in_rule__Value__Group_1_0__03484);
            rule__Value__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Value__Group_1_0__1_in_rule__Value__Group_1_0__03487);
            rule__Value__Group_1_0__1();

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
    // $ANTLR end "rule__Value__Group_1_0__0"


    // $ANTLR start "rule__Value__Group_1_0__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1630:1: rule__Value__Group_1_0__0__Impl : ( RULE_ID ) ;
    public final void rule__Value__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1634:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1635:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1635:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1636:1: RULE_ID
            {
             before(grammarAccess.getValueAccess().getIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Value__Group_1_0__0__Impl3514); 
             after(grammarAccess.getValueAccess().getIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_1_0__0__Impl"


    // $ANTLR start "rule__Value__Group_1_0__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1647:1: rule__Value__Group_1_0__1 : rule__Value__Group_1_0__1__Impl ;
    public final void rule__Value__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1651:1: ( rule__Value__Group_1_0__1__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1652:2: rule__Value__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Value__Group_1_0__1__Impl_in_rule__Value__Group_1_0__13543);
            rule__Value__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__Value__Group_1_0__1"


    // $ANTLR start "rule__Value__Group_1_0__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1658:1: rule__Value__Group_1_0__1__Impl : ( ( ruleSpecialChar )? ) ;
    public final void rule__Value__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1662:1: ( ( ( ruleSpecialChar )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1663:1: ( ( ruleSpecialChar )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1663:1: ( ( ruleSpecialChar )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1664:1: ( ruleSpecialChar )?
            {
             before(grammarAccess.getValueAccess().getSpecialCharParserRuleCall_1_0_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1665:1: ( ruleSpecialChar )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            else if ( (LA17_0==12) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1665:3: ruleSpecialChar
                    {
                    pushFollow(FOLLOW_ruleSpecialChar_in_rule__Value__Group_1_0__1__Impl3571);
                    ruleSpecialChar();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getValueAccess().getSpecialCharParserRuleCall_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_1_0__1__Impl"


    // $ANTLR start "rule__Value__Group_1_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1679:1: rule__Value__Group_1_1__0 : rule__Value__Group_1_1__0__Impl rule__Value__Group_1_1__1 ;
    public final void rule__Value__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1683:1: ( rule__Value__Group_1_1__0__Impl rule__Value__Group_1_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1684:2: rule__Value__Group_1_1__0__Impl rule__Value__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Value__Group_1_1__0__Impl_in_rule__Value__Group_1_1__03606);
            rule__Value__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Value__Group_1_1__1_in_rule__Value__Group_1_1__03609);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1691:1: rule__Value__Group_1_1__0__Impl : ( ( ruleWildcard )? ) ;
    public final void rule__Value__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1695:1: ( ( ( ruleWildcard )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1696:1: ( ( ruleWildcard )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1696:1: ( ( ruleWildcard )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1697:1: ( ruleWildcard )?
            {
             before(grammarAccess.getValueAccess().getWildcardParserRuleCall_1_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1698:1: ( ruleWildcard )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=14 && LA18_0<=15)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1698:3: ruleWildcard
                    {
                    pushFollow(FOLLOW_ruleWildcard_in_rule__Value__Group_1_1__0__Impl3637);
                    ruleWildcard();

                    state._fsp--;


                    }
                    break;

            }

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1708:1: rule__Value__Group_1_1__1 : rule__Value__Group_1_1__1__Impl rule__Value__Group_1_1__2 ;
    public final void rule__Value__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1712:1: ( rule__Value__Group_1_1__1__Impl rule__Value__Group_1_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1713:2: rule__Value__Group_1_1__1__Impl rule__Value__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Value__Group_1_1__1__Impl_in_rule__Value__Group_1_1__13668);
            rule__Value__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Value__Group_1_1__2_in_rule__Value__Group_1_1__13671);
            rule__Value__Group_1_1__2();

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1720:1: rule__Value__Group_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Value__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1724:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1725:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1725:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1726:1: RULE_ID
            {
             before(grammarAccess.getValueAccess().getIDTerminalRuleCall_1_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Value__Group_1_1__1__Impl3698); 
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


    // $ANTLR start "rule__Value__Group_1_1__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1737:1: rule__Value__Group_1_1__2 : rule__Value__Group_1_1__2__Impl ;
    public final void rule__Value__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1741:1: ( rule__Value__Group_1_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1742:2: rule__Value__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Value__Group_1_1__2__Impl_in_rule__Value__Group_1_1__23727);
            rule__Value__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__Value__Group_1_1__2"


    // $ANTLR start "rule__Value__Group_1_1__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1748:1: rule__Value__Group_1_1__2__Impl : ( ( ruleSpecialChar )? ) ;
    public final void rule__Value__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1752:1: ( ( ( ruleSpecialChar )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1753:1: ( ( ruleSpecialChar )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1753:1: ( ( ruleSpecialChar )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1754:1: ( ruleSpecialChar )?
            {
             before(grammarAccess.getValueAccess().getSpecialCharParserRuleCall_1_1_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1755:1: ( ruleSpecialChar )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            else if ( (LA19_0==12) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1755:3: ruleSpecialChar
                    {
                    pushFollow(FOLLOW_ruleSpecialChar_in_rule__Value__Group_1_1__2__Impl3755);
                    ruleSpecialChar();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getValueAccess().getSpecialCharParserRuleCall_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_1_1__2__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1771:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1775:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1776:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__03792);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__03795);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1783:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleValue ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1787:1: ( ( ruleValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1788:1: ( ruleValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1788:1: ( ruleValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1789:1: ruleValue
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getValueParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__QualifiedNameWithWildcard__Group__0__Impl3822);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1800:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2 ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1804:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1805:2: rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__13851);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__2_in_rule__QualifiedNameWithWildcard__Group__13854);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1812:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( rule__QualifiedNameWithWildcard__Group_1__0 )* ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1816:1: ( ( ( rule__QualifiedNameWithWildcard__Group_1__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1817:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1817:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )* )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1818:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1819:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                switch ( input.LA(1) ) {
                case 14:
                    {
                    int LA20_1 = input.LA(2);

                    if ( ((LA20_1>=12 && LA20_1<=13)) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 15:
                    {
                    int LA20_2 = input.LA(2);

                    if ( ((LA20_2>=12 && LA20_2<=13)) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 12:
                case 13:
                    {
                    alt20=1;
                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1819:2: rule__QualifiedNameWithWildcard__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0_in_rule__QualifiedNameWithWildcard__Group__1__Impl3881);
            	    rule__QualifiedNameWithWildcard__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1829:1: rule__QualifiedNameWithWildcard__Group__2 : rule__QualifiedNameWithWildcard__Group__2__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1833:1: ( rule__QualifiedNameWithWildcard__Group__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1834:2: rule__QualifiedNameWithWildcard__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__2__Impl_in_rule__QualifiedNameWithWildcard__Group__23912);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1840:1: rule__QualifiedNameWithWildcard__Group__2__Impl : ( ( ruleWildcard )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1844:1: ( ( ( ruleWildcard )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1845:1: ( ( ruleWildcard )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1845:1: ( ( ruleWildcard )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1846:1: ( ruleWildcard )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getWildcardParserRuleCall_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1847:1: ( ruleWildcard )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=14 && LA21_0<=15)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1847:3: ruleWildcard
                    {
                    pushFollow(FOLLOW_ruleWildcard_in_rule__QualifiedNameWithWildcard__Group__2__Impl3940);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1863:1: rule__QualifiedNameWithWildcard__Group_1__0 : rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1867:1: ( rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1868:2: rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0__Impl_in_rule__QualifiedNameWithWildcard__Group_1__03977);
            rule__QualifiedNameWithWildcard__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1_in_rule__QualifiedNameWithWildcard__Group_1__03980);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1875:1: rule__QualifiedNameWithWildcard__Group_1__0__Impl : ( ( ruleWildcard )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1879:1: ( ( ( ruleWildcard )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1880:1: ( ( ruleWildcard )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1880:1: ( ( ruleWildcard )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1881:1: ( ruleWildcard )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getWildcardParserRuleCall_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1882:1: ( ruleWildcard )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=14 && LA22_0<=15)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1882:3: ruleWildcard
                    {
                    pushFollow(FOLLOW_ruleWildcard_in_rule__QualifiedNameWithWildcard__Group_1__0__Impl4008);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1892:1: rule__QualifiedNameWithWildcard__Group_1__1 : rule__QualifiedNameWithWildcard__Group_1__1__Impl rule__QualifiedNameWithWildcard__Group_1__2 ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1896:1: ( rule__QualifiedNameWithWildcard__Group_1__1__Impl rule__QualifiedNameWithWildcard__Group_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1897:2: rule__QualifiedNameWithWildcard__Group_1__1__Impl rule__QualifiedNameWithWildcard__Group_1__2
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1__Impl_in_rule__QualifiedNameWithWildcard__Group_1__14039);
            rule__QualifiedNameWithWildcard__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__2_in_rule__QualifiedNameWithWildcard__Group_1__14042);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1904:1: rule__QualifiedNameWithWildcard__Group_1__1__Impl : ( ruleSep ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1908:1: ( ( ruleSep ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1909:1: ( ruleSep )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1909:1: ( ruleSep )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1910:1: ruleSep
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getSepParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleSep_in_rule__QualifiedNameWithWildcard__Group_1__1__Impl4069);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1921:1: rule__QualifiedNameWithWildcard__Group_1__2 : rule__QualifiedNameWithWildcard__Group_1__2__Impl rule__QualifiedNameWithWildcard__Group_1__3 ;
    public final void rule__QualifiedNameWithWildcard__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1925:1: ( rule__QualifiedNameWithWildcard__Group_1__2__Impl rule__QualifiedNameWithWildcard__Group_1__3 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1926:2: rule__QualifiedNameWithWildcard__Group_1__2__Impl rule__QualifiedNameWithWildcard__Group_1__3
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__2__Impl_in_rule__QualifiedNameWithWildcard__Group_1__24098);
            rule__QualifiedNameWithWildcard__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__3_in_rule__QualifiedNameWithWildcard__Group_1__24101);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1933:1: rule__QualifiedNameWithWildcard__Group_1__2__Impl : ( ( ruleWildcard )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1937:1: ( ( ( ruleWildcard )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1938:1: ( ( ruleWildcard )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1938:1: ( ( ruleWildcard )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1939:1: ( ruleWildcard )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getWildcardParserRuleCall_1_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1940:1: ( ruleWildcard )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==14) ) {
                alt23=1;
            }
            else if ( (LA23_0==15) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1940:3: ruleWildcard
                    {
                    pushFollow(FOLLOW_ruleWildcard_in_rule__QualifiedNameWithWildcard__Group_1__2__Impl4129);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1950:1: rule__QualifiedNameWithWildcard__Group_1__3 : rule__QualifiedNameWithWildcard__Group_1__3__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1954:1: ( rule__QualifiedNameWithWildcard__Group_1__3__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1955:2: rule__QualifiedNameWithWildcard__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__3__Impl_in_rule__QualifiedNameWithWildcard__Group_1__34160);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1961:1: rule__QualifiedNameWithWildcard__Group_1__3__Impl : ( ruleValue ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1965:1: ( ( ruleValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1966:1: ( ruleValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1966:1: ( ruleValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1967:1: ruleValue
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getValueParserRuleCall_1_3()); 
            pushFollow(FOLLOW_ruleValue_in_rule__QualifiedNameWithWildcard__Group_1__3__Impl4187);
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


    // $ANTLR start "rule__SpecialChar__Group_0__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1986:1: rule__SpecialChar__Group_0__0 : rule__SpecialChar__Group_0__0__Impl rule__SpecialChar__Group_0__1 ;
    public final void rule__SpecialChar__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1990:1: ( rule__SpecialChar__Group_0__0__Impl rule__SpecialChar__Group_0__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1991:2: rule__SpecialChar__Group_0__0__Impl rule__SpecialChar__Group_0__1
            {
            pushFollow(FOLLOW_rule__SpecialChar__Group_0__0__Impl_in_rule__SpecialChar__Group_0__04224);
            rule__SpecialChar__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SpecialChar__Group_0__1_in_rule__SpecialChar__Group_0__04227);
            rule__SpecialChar__Group_0__1();

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
    // $ANTLR end "rule__SpecialChar__Group_0__0"


    // $ANTLR start "rule__SpecialChar__Group_0__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1998:1: rule__SpecialChar__Group_0__0__Impl : ( '\\\\' ) ;
    public final void rule__SpecialChar__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2002:1: ( ( '\\\\' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2003:1: ( '\\\\' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2003:1: ( '\\\\' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2004:1: '\\\\'
            {
             before(grammarAccess.getSpecialCharAccess().getReverseSolidusKeyword_0_0()); 
            match(input,24,FOLLOW_24_in_rule__SpecialChar__Group_0__0__Impl4255); 
             after(grammarAccess.getSpecialCharAccess().getReverseSolidusKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialChar__Group_0__0__Impl"


    // $ANTLR start "rule__SpecialChar__Group_0__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2017:1: rule__SpecialChar__Group_0__1 : rule__SpecialChar__Group_0__1__Impl ;
    public final void rule__SpecialChar__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2021:1: ( rule__SpecialChar__Group_0__1__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2022:2: rule__SpecialChar__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__SpecialChar__Group_0__1__Impl_in_rule__SpecialChar__Group_0__14286);
            rule__SpecialChar__Group_0__1__Impl();

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
    // $ANTLR end "rule__SpecialChar__Group_0__1"


    // $ANTLR start "rule__SpecialChar__Group_0__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2028:1: rule__SpecialChar__Group_0__1__Impl : ( '-' ) ;
    public final void rule__SpecialChar__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2032:1: ( ( '-' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2033:1: ( '-' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2033:1: ( '-' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2034:1: '-'
            {
             before(grammarAccess.getSpecialCharAccess().getHyphenMinusKeyword_0_1()); 
            match(input,18,FOLLOW_18_in_rule__SpecialChar__Group_0__1__Impl4314); 
             after(grammarAccess.getSpecialCharAccess().getHyphenMinusKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialChar__Group_0__1__Impl"


    // $ANTLR start "rule__Exp1__BAssignment_1_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2052:1: rule__Exp1__BAssignment_1_1 : ( ruleBooleanExp ) ;
    public final void rule__Exp1__BAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2056:1: ( ( ruleBooleanExp ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2057:1: ( ruleBooleanExp )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2057:1: ( ruleBooleanExp )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2058:1: ruleBooleanExp
            {
             before(grammarAccess.getExp1Access().getBBooleanExpEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleBooleanExp_in_rule__Exp1__BAssignment_1_14354);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2067:1: rule__Exp1__RightAssignment_1_2 : ( ruleExp2 ) ;
    public final void rule__Exp1__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2071:1: ( ( ruleExp2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2072:1: ( ruleExp2 )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2072:1: ( ruleExp2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2073:1: ruleExp2
            {
             before(grammarAccess.getExp1Access().getRightExp2ParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleExp2_in_rule__Exp1__RightAssignment_1_24385);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2082:1: rule__Exp2__ValueAssignment_0 : ( ruleClauseExpression ) ;
    public final void rule__Exp2__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2086:1: ( ( ruleClauseExpression ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2087:1: ( ruleClauseExpression )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2087:1: ( ruleClauseExpression )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2088:1: ruleClauseExpression
            {
             before(grammarAccess.getExp2Access().getValueClauseExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleClauseExpression_in_rule__Exp2__ValueAssignment_04416);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2097:1: rule__ClauseExpression__NAssignment_0_0 : ( ruleNotExpression ) ;
    public final void rule__ClauseExpression__NAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2101:1: ( ( ruleNotExpression ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2102:1: ( ruleNotExpression )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2102:1: ( ruleNotExpression )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2103:1: ruleNotExpression
            {
             before(grammarAccess.getClauseExpressionAccess().getNNotExpressionEnumRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleNotExpression_in_rule__ClauseExpression__NAssignment_0_04447);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2112:1: rule__ClauseExpression__MAssignment_0_1 : ( ruleMustExpression ) ;
    public final void rule__ClauseExpression__MAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2116:1: ( ( ruleMustExpression ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2117:1: ( ruleMustExpression )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2117:1: ( ruleMustExpression )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2118:1: ruleMustExpression
            {
             before(grammarAccess.getClauseExpressionAccess().getMMustExpressionEnumRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleMustExpression_in_rule__ClauseExpression__MAssignment_0_14478);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2127:1: rule__ClauseExpression__ClauseAssignment_1_0 : ( ruleSimpleClause ) ;
    public final void rule__ClauseExpression__ClauseAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2131:1: ( ( ruleSimpleClause ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2132:1: ( ruleSimpleClause )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2132:1: ( ruleSimpleClause )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2133:1: ruleSimpleClause
            {
             before(grammarAccess.getClauseExpressionAccess().getClauseSimpleClauseParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleSimpleClause_in_rule__ClauseExpression__ClauseAssignment_1_04509);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2142:1: rule__ClauseExpression__ClauseAssignment_1_1 : ( ruleTypeClause ) ;
    public final void rule__ClauseExpression__ClauseAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2146:1: ( ( ruleTypeClause ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2147:1: ( ruleTypeClause )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2147:1: ( ruleTypeClause )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2148:1: ruleTypeClause
            {
             before(grammarAccess.getClauseExpressionAccess().getClauseTypeClauseParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleTypeClause_in_rule__ClauseExpression__ClauseAssignment_1_14540);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2157:1: rule__SimpleClause__FieldAssignment_0 : ( ruleFieldName ) ;
    public final void rule__SimpleClause__FieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2161:1: ( ( ruleFieldName ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2162:1: ( ruleFieldName )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2162:1: ( ruleFieldName )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2163:1: ruleFieldName
            {
             before(grammarAccess.getSimpleClauseAccess().getFieldFieldNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleFieldName_in_rule__SimpleClause__FieldAssignment_04571);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2172:1: rule__SimpleClause__ValueAssignment_2 : ( ruleFieldValue ) ;
    public final void rule__SimpleClause__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2176:1: ( ( ruleFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2177:1: ( ruleFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2177:1: ( ruleFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2178:1: ruleFieldValue
            {
             before(grammarAccess.getSimpleClauseAccess().getValueFieldValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFieldValue_in_rule__SimpleClause__ValueAssignment_24602);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2187:1: rule__TypeClause__FieldAssignment_0 : ( ruleTypeFieldName ) ;
    public final void rule__TypeClause__FieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2191:1: ( ( ruleTypeFieldName ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2192:1: ( ruleTypeFieldName )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2192:1: ( ruleTypeFieldName )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2193:1: ruleTypeFieldName
            {
             before(grammarAccess.getTypeClauseAccess().getFieldTypeFieldNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTypeFieldName_in_rule__TypeClause__FieldAssignment_04633);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2202:1: rule__TypeClause__ValueAssignment_2 : ( ruleTypeValue ) ;
    public final void rule__TypeClause__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2206:1: ( ( ruleTypeValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2207:1: ( ruleTypeValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2207:1: ( ruleTypeValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2208:1: ruleTypeValue
            {
             before(grammarAccess.getTypeClauseAccess().getValueTypeValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTypeValue_in_rule__TypeClause__ValueAssignment_24664);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2217:1: rule__FieldName__FullyQualifiedNameAssignment_0 : ( ( 'FullyQualifiedName' ) ) ;
    public final void rule__FieldName__FullyQualifiedNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2221:1: ( ( ( 'FullyQualifiedName' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2222:1: ( ( 'FullyQualifiedName' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2222:1: ( ( 'FullyQualifiedName' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2223:1: ( 'FullyQualifiedName' )
            {
             before(grammarAccess.getFieldNameAccess().getFullyQualifiedNameFullyQualifiedNameKeyword_0_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2224:1: ( 'FullyQualifiedName' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2225:1: 'FullyQualifiedName'
            {
             before(grammarAccess.getFieldNameAccess().getFullyQualifiedNameFullyQualifiedNameKeyword_0_0()); 
            match(input,25,FOLLOW_25_in_rule__FieldName__FullyQualifiedNameAssignment_04700); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2240:1: rule__FieldName__TypeAssignment_1 : ( ( 'Type' ) ) ;
    public final void rule__FieldName__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2244:1: ( ( ( 'Type' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2245:1: ( ( 'Type' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2245:1: ( ( 'Type' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2246:1: ( 'Type' )
            {
             before(grammarAccess.getFieldNameAccess().getTypeTypeKeyword_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2247:1: ( 'Type' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2248:1: 'Type'
            {
             before(grammarAccess.getFieldNameAccess().getTypeTypeKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__FieldName__TypeAssignment_14744); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2263:1: rule__FieldName__FriendlyNameAssignment_2 : ( ( 'FriendlyName' ) ) ;
    public final void rule__FieldName__FriendlyNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2267:1: ( ( ( 'FriendlyName' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2268:1: ( ( 'FriendlyName' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2268:1: ( ( 'FriendlyName' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2269:1: ( 'FriendlyName' )
            {
             before(grammarAccess.getFieldNameAccess().getFriendlyNameFriendlyNameKeyword_2_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2270:1: ( 'FriendlyName' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2271:1: 'FriendlyName'
            {
             before(grammarAccess.getFieldNameAccess().getFriendlyNameFriendlyNameKeyword_2_0()); 
            match(input,27,FOLLOW_27_in_rule__FieldName__FriendlyNameAssignment_24788); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2286:1: rule__FieldName__DeclaredMethodsAssignment_3 : ( ( 'DeclaredMethods' ) ) ;
    public final void rule__FieldName__DeclaredMethodsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2290:1: ( ( ( 'DeclaredMethods' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2291:1: ( ( 'DeclaredMethods' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2291:1: ( ( 'DeclaredMethods' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2292:1: ( 'DeclaredMethods' )
            {
             before(grammarAccess.getFieldNameAccess().getDeclaredMethodsDeclaredMethodsKeyword_3_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2293:1: ( 'DeclaredMethods' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2294:1: 'DeclaredMethods'
            {
             before(grammarAccess.getFieldNameAccess().getDeclaredMethodsDeclaredMethodsKeyword_3_0()); 
            match(input,28,FOLLOW_28_in_rule__FieldName__DeclaredMethodsAssignment_34832); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2309:1: rule__FieldName__ParameterCountAssignment_4 : ( ( 'ParameterCount' ) ) ;
    public final void rule__FieldName__ParameterCountAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2313:1: ( ( ( 'ParameterCount' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2314:1: ( ( 'ParameterCount' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2314:1: ( ( 'ParameterCount' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2315:1: ( 'ParameterCount' )
            {
             before(grammarAccess.getFieldNameAccess().getParameterCountParameterCountKeyword_4_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2316:1: ( 'ParameterCount' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2317:1: 'ParameterCount'
            {
             before(grammarAccess.getFieldNameAccess().getParameterCountParameterCountKeyword_4_0()); 
            match(input,29,FOLLOW_29_in_rule__FieldName__ParameterCountAssignment_44876); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2332:1: rule__FieldName__ReturnVariableEexpressionsAssignment_5 : ( ( 'ReturnVariableEexpressions' ) ) ;
    public final void rule__FieldName__ReturnVariableEexpressionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2336:1: ( ( ( 'ReturnVariableEexpressions' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2337:1: ( ( 'ReturnVariableEexpressions' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2337:1: ( ( 'ReturnVariableEexpressions' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2338:1: ( 'ReturnVariableEexpressions' )
            {
             before(grammarAccess.getFieldNameAccess().getReturnVariableEexpressionsReturnVariableEexpressionsKeyword_5_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2339:1: ( 'ReturnVariableEexpressions' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2340:1: 'ReturnVariableEexpressions'
            {
             before(grammarAccess.getFieldNameAccess().getReturnVariableEexpressionsReturnVariableEexpressionsKeyword_5_0()); 
            match(input,30,FOLLOW_30_in_rule__FieldName__ReturnVariableEexpressionsAssignment_54920); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2355:1: rule__FieldName__UsedMethodsAssignment_6 : ( ( 'UsedMethods' ) ) ;
    public final void rule__FieldName__UsedMethodsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2359:1: ( ( ( 'UsedMethods' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2360:1: ( ( 'UsedMethods' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2360:1: ( ( 'UsedMethods' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2361:1: ( 'UsedMethods' )
            {
             before(grammarAccess.getFieldNameAccess().getUsedMethodsUsedMethodsKeyword_6_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2362:1: ( 'UsedMethods' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2363:1: 'UsedMethods'
            {
             before(grammarAccess.getFieldNameAccess().getUsedMethodsUsedMethodsKeyword_6_0()); 
            match(input,31,FOLLOW_31_in_rule__FieldName__UsedMethodsAssignment_64964); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2378:1: rule__FieldName__UsedMethodsInTryAssignment_7 : ( ( 'UsedMethodsInTry' ) ) ;
    public final void rule__FieldName__UsedMethodsInTryAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2382:1: ( ( ( 'UsedMethodsInTry' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2383:1: ( ( 'UsedMethodsInTry' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2383:1: ( ( 'UsedMethodsInTry' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2384:1: ( 'UsedMethodsInTry' )
            {
             before(grammarAccess.getFieldNameAccess().getUsedMethodsInTryUsedMethodsInTryKeyword_7_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2385:1: ( 'UsedMethodsInTry' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2386:1: 'UsedMethodsInTry'
            {
             before(grammarAccess.getFieldNameAccess().getUsedMethodsInTryUsedMethodsInTryKeyword_7_0()); 
            match(input,32,FOLLOW_32_in_rule__FieldName__UsedMethodsInTryAssignment_75008); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2401:1: rule__FieldName__UsedMethodsInFinallyAssignment_8 : ( ( 'UsedMethodsInFinally' ) ) ;
    public final void rule__FieldName__UsedMethodsInFinallyAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2405:1: ( ( ( 'UsedMethodsInFinally' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2406:1: ( ( 'UsedMethodsInFinally' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2406:1: ( ( 'UsedMethodsInFinally' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2407:1: ( 'UsedMethodsInFinally' )
            {
             before(grammarAccess.getFieldNameAccess().getUsedMethodsInFinallyUsedMethodsInFinallyKeyword_8_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2408:1: ( 'UsedMethodsInFinally' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2409:1: 'UsedMethodsInFinally'
            {
             before(grammarAccess.getFieldNameAccess().getUsedMethodsInFinallyUsedMethodsInFinallyKeyword_8_0()); 
            match(input,33,FOLLOW_33_in_rule__FieldName__UsedMethodsInFinallyAssignment_85052); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2424:1: rule__FieldName__OverriddenMethodsAssignment_9 : ( ( 'OverriddenMethods' ) ) ;
    public final void rule__FieldName__OverriddenMethodsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2428:1: ( ( ( 'OverriddenMethods' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2429:1: ( ( 'OverriddenMethods' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2429:1: ( ( 'OverriddenMethods' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2430:1: ( 'OverriddenMethods' )
            {
             before(grammarAccess.getFieldNameAccess().getOverriddenMethodsOverriddenMethodsKeyword_9_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2431:1: ( 'OverriddenMethods' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2432:1: 'OverriddenMethods'
            {
             before(grammarAccess.getFieldNameAccess().getOverriddenMethodsOverriddenMethodsKeyword_9_0()); 
            match(input,34,FOLLOW_34_in_rule__FieldName__OverriddenMethodsAssignment_95096); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2447:1: rule__FieldName__ProjectNameAssignment_10 : ( ( 'ProjectName' ) ) ;
    public final void rule__FieldName__ProjectNameAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2451:1: ( ( ( 'ProjectName' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2452:1: ( ( 'ProjectName' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2452:1: ( ( 'ProjectName' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2453:1: ( 'ProjectName' )
            {
             before(grammarAccess.getFieldNameAccess().getProjectNameProjectNameKeyword_10_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2454:1: ( 'ProjectName' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2455:1: 'ProjectName'
            {
             before(grammarAccess.getFieldNameAccess().getProjectNameProjectNameKeyword_10_0()); 
            match(input,35,FOLLOW_35_in_rule__FieldName__ProjectNameAssignment_105140); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2470:1: rule__FieldName__ResourcePathAssignment_11 : ( ( 'ResourcePath' ) ) ;
    public final void rule__FieldName__ResourcePathAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2474:1: ( ( ( 'ResourcePath' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2475:1: ( ( 'ResourcePath' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2475:1: ( ( 'ResourcePath' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2476:1: ( 'ResourcePath' )
            {
             before(grammarAccess.getFieldNameAccess().getResourcePathResourcePathKeyword_11_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2477:1: ( 'ResourcePath' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2478:1: 'ResourcePath'
            {
             before(grammarAccess.getFieldNameAccess().getResourcePathResourcePathKeyword_11_0()); 
            match(input,36,FOLLOW_36_in_rule__FieldName__ResourcePathAssignment_115184); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2493:1: rule__FieldName__ModifiersAssignment_12 : ( ( 'Modifiers' ) ) ;
    public final void rule__FieldName__ModifiersAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2497:1: ( ( ( 'Modifiers' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2498:1: ( ( 'Modifiers' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2498:1: ( ( 'Modifiers' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2499:1: ( 'Modifiers' )
            {
             before(grammarAccess.getFieldNameAccess().getModifiersModifiersKeyword_12_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2500:1: ( 'Modifiers' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2501:1: 'Modifiers'
            {
             before(grammarAccess.getFieldNameAccess().getModifiersModifiersKeyword_12_0()); 
            match(input,37,FOLLOW_37_in_rule__FieldName__ModifiersAssignment_125228); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2516:1: rule__FieldName__AllDeclaredMethodNamesAssignment_13 : ( ( 'AllDeclaredMethodNames' ) ) ;
    public final void rule__FieldName__AllDeclaredMethodNamesAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2520:1: ( ( ( 'AllDeclaredMethodNames' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2521:1: ( ( 'AllDeclaredMethodNames' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2521:1: ( ( 'AllDeclaredMethodNames' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2522:1: ( 'AllDeclaredMethodNames' )
            {
             before(grammarAccess.getFieldNameAccess().getAllDeclaredMethodNamesAllDeclaredMethodNamesKeyword_13_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2523:1: ( 'AllDeclaredMethodNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2524:1: 'AllDeclaredMethodNames'
            {
             before(grammarAccess.getFieldNameAccess().getAllDeclaredMethodNamesAllDeclaredMethodNamesKeyword_13_0()); 
            match(input,38,FOLLOW_38_in_rule__FieldName__AllDeclaredMethodNamesAssignment_135272); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2539:1: rule__FieldName__DeclaredMethodNamesAssignment_14 : ( ( 'DeclaredMethodNames' ) ) ;
    public final void rule__FieldName__DeclaredMethodNamesAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2543:1: ( ( ( 'DeclaredMethodNames' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2544:1: ( ( 'DeclaredMethodNames' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2544:1: ( ( 'DeclaredMethodNames' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2545:1: ( 'DeclaredMethodNames' )
            {
             before(grammarAccess.getFieldNameAccess().getDeclaredMethodNamesDeclaredMethodNamesKeyword_14_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2546:1: ( 'DeclaredMethodNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2547:1: 'DeclaredMethodNames'
            {
             before(grammarAccess.getFieldNameAccess().getDeclaredMethodNamesDeclaredMethodNamesKeyword_14_0()); 
            match(input,39,FOLLOW_39_in_rule__FieldName__DeclaredMethodNamesAssignment_145316); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2562:1: rule__FieldName__DeclaredFieldNamesAssignment_15 : ( ( 'DeclaredFieldNames' ) ) ;
    public final void rule__FieldName__DeclaredFieldNamesAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2566:1: ( ( ( 'DeclaredFieldNames' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2567:1: ( ( 'DeclaredFieldNames' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2567:1: ( ( 'DeclaredFieldNames' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2568:1: ( 'DeclaredFieldNames' )
            {
             before(grammarAccess.getFieldNameAccess().getDeclaredFieldNamesDeclaredFieldNamesKeyword_15_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2569:1: ( 'DeclaredFieldNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2570:1: 'DeclaredFieldNames'
            {
             before(grammarAccess.getFieldNameAccess().getDeclaredFieldNamesDeclaredFieldNamesKeyword_15_0()); 
            match(input,40,FOLLOW_40_in_rule__FieldName__DeclaredFieldNamesAssignment_155360); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2585:1: rule__FieldName__DeclaredFieldTypesAssignment_16 : ( ( 'DeclaredFieldTypes' ) ) ;
    public final void rule__FieldName__DeclaredFieldTypesAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2589:1: ( ( ( 'DeclaredFieldTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2590:1: ( ( 'DeclaredFieldTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2590:1: ( ( 'DeclaredFieldTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2591:1: ( 'DeclaredFieldTypes' )
            {
             before(grammarAccess.getFieldNameAccess().getDeclaredFieldTypesDeclaredFieldTypesKeyword_16_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2592:1: ( 'DeclaredFieldTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2593:1: 'DeclaredFieldTypes'
            {
             before(grammarAccess.getFieldNameAccess().getDeclaredFieldTypesDeclaredFieldTypesKeyword_16_0()); 
            match(input,41,FOLLOW_41_in_rule__FieldName__DeclaredFieldTypesAssignment_165404); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2608:1: rule__FieldName__AllDeclaredFieldNamesAssignment_17 : ( ( 'AllDeclaredFieldNames' ) ) ;
    public final void rule__FieldName__AllDeclaredFieldNamesAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2612:1: ( ( ( 'AllDeclaredFieldNames' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2613:1: ( ( 'AllDeclaredFieldNames' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2613:1: ( ( 'AllDeclaredFieldNames' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2614:1: ( 'AllDeclaredFieldNames' )
            {
             before(grammarAccess.getFieldNameAccess().getAllDeclaredFieldNamesAllDeclaredFieldNamesKeyword_17_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2615:1: ( 'AllDeclaredFieldNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2616:1: 'AllDeclaredFieldNames'
            {
             before(grammarAccess.getFieldNameAccess().getAllDeclaredFieldNamesAllDeclaredFieldNamesKeyword_17_0()); 
            match(input,42,FOLLOW_42_in_rule__FieldName__AllDeclaredFieldNamesAssignment_175448); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2631:1: rule__FieldName__FullTextAssignment_18 : ( ( 'FullText' ) ) ;
    public final void rule__FieldName__FullTextAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2635:1: ( ( ( 'FullText' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2636:1: ( ( 'FullText' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2636:1: ( ( 'FullText' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2637:1: ( 'FullText' )
            {
             before(grammarAccess.getFieldNameAccess().getFullTextFullTextKeyword_18_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2638:1: ( 'FullText' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2639:1: 'FullText'
            {
             before(grammarAccess.getFieldNameAccess().getFullTextFullTextKeyword_18_0()); 
            match(input,43,FOLLOW_43_in_rule__FieldName__FullTextAssignment_185492); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2654:1: rule__FieldName__FieldsReadAssignment_19 : ( ( 'FieldsRead' ) ) ;
    public final void rule__FieldName__FieldsReadAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2658:1: ( ( ( 'FieldsRead' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2659:1: ( ( 'FieldsRead' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2659:1: ( ( 'FieldsRead' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2660:1: ( 'FieldsRead' )
            {
             before(grammarAccess.getFieldNameAccess().getFieldsReadFieldsReadKeyword_19_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2661:1: ( 'FieldsRead' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2662:1: 'FieldsRead'
            {
             before(grammarAccess.getFieldNameAccess().getFieldsReadFieldsReadKeyword_19_0()); 
            match(input,44,FOLLOW_44_in_rule__FieldName__FieldsReadAssignment_195536); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2677:1: rule__FieldName__FieldsWrittenAssignment_20 : ( ( 'FieldsWritten' ) ) ;
    public final void rule__FieldName__FieldsWrittenAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2681:1: ( ( ( 'FieldsWritten' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2682:1: ( ( 'FieldsWritten' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2682:1: ( ( 'FieldsWritten' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2683:1: ( 'FieldsWritten' )
            {
             before(grammarAccess.getFieldNameAccess().getFieldsWrittenFieldsWrittenKeyword_20_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2684:1: ( 'FieldsWritten' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2685:1: 'FieldsWritten'
            {
             before(grammarAccess.getFieldNameAccess().getFieldsWrittenFieldsWrittenKeyword_20_0()); 
            match(input,45,FOLLOW_45_in_rule__FieldName__FieldsWrittenAssignment_205580); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2700:1: rule__FieldName__UsedFieldsInFinallyAssignment_21 : ( ( 'UsedFieldsInFinally' ) ) ;
    public final void rule__FieldName__UsedFieldsInFinallyAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2704:1: ( ( ( 'UsedFieldsInFinally' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2705:1: ( ( 'UsedFieldsInFinally' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2705:1: ( ( 'UsedFieldsInFinally' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2706:1: ( 'UsedFieldsInFinally' )
            {
             before(grammarAccess.getFieldNameAccess().getUsedFieldsInFinallyUsedFieldsInFinallyKeyword_21_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2707:1: ( 'UsedFieldsInFinally' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2708:1: 'UsedFieldsInFinally'
            {
             before(grammarAccess.getFieldNameAccess().getUsedFieldsInFinallyUsedFieldsInFinallyKeyword_21_0()); 
            match(input,46,FOLLOW_46_in_rule__FieldName__UsedFieldsInFinallyAssignment_215624); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2723:1: rule__FieldName__UsedFieldsInTryAssignment_22 : ( ( 'UsedFieldsInTry' ) ) ;
    public final void rule__FieldName__UsedFieldsInTryAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2727:1: ( ( ( 'UsedFieldsInTry' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2728:1: ( ( 'UsedFieldsInTry' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2728:1: ( ( 'UsedFieldsInTry' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2729:1: ( 'UsedFieldsInTry' )
            {
             before(grammarAccess.getFieldNameAccess().getUsedFieldsInTryUsedFieldsInTryKeyword_22_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2730:1: ( 'UsedFieldsInTry' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2731:1: 'UsedFieldsInTry'
            {
             before(grammarAccess.getFieldNameAccess().getUsedFieldsInTryUsedFieldsInTryKeyword_22_0()); 
            match(input,47,FOLLOW_47_in_rule__FieldName__UsedFieldsInTryAssignment_225668); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2746:1: rule__FieldName__AnnotationsAssignment_23 : ( ( 'Annotations' ) ) ;
    public final void rule__FieldName__AnnotationsAssignment_23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2750:1: ( ( ( 'Annotations' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2751:1: ( ( 'Annotations' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2751:1: ( ( 'Annotations' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2752:1: ( 'Annotations' )
            {
             before(grammarAccess.getFieldNameAccess().getAnnotationsAnnotationsKeyword_23_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2753:1: ( 'Annotations' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2754:1: 'Annotations'
            {
             before(grammarAccess.getFieldNameAccess().getAnnotationsAnnotationsKeyword_23_0()); 
            match(input,48,FOLLOW_48_in_rule__FieldName__AnnotationsAssignment_235712); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2769:1: rule__FieldName__TimestampAssignment_24 : ( ( 'Timestamp' ) ) ;
    public final void rule__FieldName__TimestampAssignment_24() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2773:1: ( ( ( 'Timestamp' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2774:1: ( ( 'Timestamp' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2774:1: ( ( 'Timestamp' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2775:1: ( 'Timestamp' )
            {
             before(grammarAccess.getFieldNameAccess().getTimestampTimestampKeyword_24_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2776:1: ( 'Timestamp' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2777:1: 'Timestamp'
            {
             before(grammarAccess.getFieldNameAccess().getTimestampTimestampKeyword_24_0()); 
            match(input,49,FOLLOW_49_in_rule__FieldName__TimestampAssignment_245756); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2792:1: rule__TypeFieldName__ImplementedTypesAssignment_0 : ( ( 'ImplementedTypes' ) ) ;
    public final void rule__TypeFieldName__ImplementedTypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2796:1: ( ( ( 'ImplementedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2797:1: ( ( 'ImplementedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2797:1: ( ( 'ImplementedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2798:1: ( 'ImplementedTypes' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getImplementedTypesImplementedTypesKeyword_0_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2799:1: ( 'ImplementedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2800:1: 'ImplementedTypes'
            {
             before(grammarAccess.getTypeFieldNameAccess().getImplementedTypesImplementedTypesKeyword_0_0()); 
            match(input,50,FOLLOW_50_in_rule__TypeFieldName__ImplementedTypesAssignment_05800); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2815:1: rule__TypeFieldName__ExtendedTypesAssignment_1 : ( ( 'ExtendedTypes' ) ) ;
    public final void rule__TypeFieldName__ExtendedTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2819:1: ( ( ( 'ExtendedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2820:1: ( ( 'ExtendedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2820:1: ( ( 'ExtendedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2821:1: ( 'ExtendedTypes' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getExtendedTypesExtendedTypesKeyword_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2822:1: ( 'ExtendedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2823:1: 'ExtendedTypes'
            {
             before(grammarAccess.getTypeFieldNameAccess().getExtendedTypesExtendedTypesKeyword_1_0()); 
            match(input,51,FOLLOW_51_in_rule__TypeFieldName__ExtendedTypesAssignment_15844); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2838:1: rule__TypeFieldName__UsedTypesAssignment_2 : ( ( 'UsedTypes' ) ) ;
    public final void rule__TypeFieldName__UsedTypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2842:1: ( ( ( 'UsedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2843:1: ( ( 'UsedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2843:1: ( ( 'UsedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2844:1: ( 'UsedTypes' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getUsedTypesUsedTypesKeyword_2_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2845:1: ( 'UsedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2846:1: 'UsedTypes'
            {
             before(grammarAccess.getTypeFieldNameAccess().getUsedTypesUsedTypesKeyword_2_0()); 
            match(input,52,FOLLOW_52_in_rule__TypeFieldName__UsedTypesAssignment_25888); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2861:1: rule__TypeFieldName__UsedTypesInTryAssignment_3 : ( ( 'UsedTypesInTry' ) ) ;
    public final void rule__TypeFieldName__UsedTypesInTryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2865:1: ( ( ( 'UsedTypesInTry' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2866:1: ( ( 'UsedTypesInTry' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2866:1: ( ( 'UsedTypesInTry' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2867:1: ( 'UsedTypesInTry' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getUsedTypesInTryUsedTypesInTryKeyword_3_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2868:1: ( 'UsedTypesInTry' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2869:1: 'UsedTypesInTry'
            {
             before(grammarAccess.getTypeFieldNameAccess().getUsedTypesInTryUsedTypesInTryKeyword_3_0()); 
            match(input,53,FOLLOW_53_in_rule__TypeFieldName__UsedTypesInTryAssignment_35932); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2884:1: rule__TypeFieldName__UsedTypesInFinallyAssignment_4 : ( ( 'UsedTypesInFinally' ) ) ;
    public final void rule__TypeFieldName__UsedTypesInFinallyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2888:1: ( ( ( 'UsedTypesInFinally' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2889:1: ( ( 'UsedTypesInFinally' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2889:1: ( ( 'UsedTypesInFinally' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2890:1: ( 'UsedTypesInFinally' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getUsedTypesInFinallyUsedTypesInFinallyKeyword_4_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2891:1: ( 'UsedTypesInFinally' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2892:1: 'UsedTypesInFinally'
            {
             before(grammarAccess.getTypeFieldNameAccess().getUsedTypesInFinallyUsedTypesInFinallyKeyword_4_0()); 
            match(input,54,FOLLOW_54_in_rule__TypeFieldName__UsedTypesInFinallyAssignment_45976); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2907:1: rule__TypeFieldName__ParameterTypesAssignment_5 : ( ( 'ParameterTypes' ) ) ;
    public final void rule__TypeFieldName__ParameterTypesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2911:1: ( ( ( 'ParameterTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2912:1: ( ( 'ParameterTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2912:1: ( ( 'ParameterTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2913:1: ( 'ParameterTypes' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getParameterTypesParameterTypesKeyword_5_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2914:1: ( 'ParameterTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2915:1: 'ParameterTypes'
            {
             before(grammarAccess.getTypeFieldNameAccess().getParameterTypesParameterTypesKeyword_5_0()); 
            match(input,55,FOLLOW_55_in_rule__TypeFieldName__ParameterTypesAssignment_56020); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2930:1: rule__TypeFieldName__ReturnTypeAssignment_6 : ( ( 'ReturnType' ) ) ;
    public final void rule__TypeFieldName__ReturnTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2934:1: ( ( ( 'ReturnType' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2935:1: ( ( 'ReturnType' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2935:1: ( ( 'ReturnType' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2936:1: ( 'ReturnType' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getReturnTypeReturnTypeKeyword_6_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2937:1: ( 'ReturnType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2938:1: 'ReturnType'
            {
             before(grammarAccess.getTypeFieldNameAccess().getReturnTypeReturnTypeKeyword_6_0()); 
            match(input,56,FOLLOW_56_in_rule__TypeFieldName__ReturnTypeAssignment_66064); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2953:1: rule__TypeFieldName__AllImplementedTypesAssignment_7 : ( ( 'AllImplementedTypes' ) ) ;
    public final void rule__TypeFieldName__AllImplementedTypesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2957:1: ( ( ( 'AllImplementedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2958:1: ( ( 'AllImplementedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2958:1: ( ( 'AllImplementedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2959:1: ( 'AllImplementedTypes' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getAllImplementedTypesAllImplementedTypesKeyword_7_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2960:1: ( 'AllImplementedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2961:1: 'AllImplementedTypes'
            {
             before(grammarAccess.getTypeFieldNameAccess().getAllImplementedTypesAllImplementedTypesKeyword_7_0()); 
            match(input,57,FOLLOW_57_in_rule__TypeFieldName__AllImplementedTypesAssignment_76108); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2976:1: rule__TypeFieldName__AllExtendedTypesAssignment_8 : ( ( 'AllExtendedTypes' ) ) ;
    public final void rule__TypeFieldName__AllExtendedTypesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2980:1: ( ( ( 'AllExtendedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2981:1: ( ( 'AllExtendedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2981:1: ( ( 'AllExtendedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2982:1: ( 'AllExtendedTypes' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getAllExtendedTypesAllExtendedTypesKeyword_8_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2983:1: ( 'AllExtendedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2984:1: 'AllExtendedTypes'
            {
             before(grammarAccess.getTypeFieldNameAccess().getAllExtendedTypesAllExtendedTypesKeyword_8_0()); 
            match(input,58,FOLLOW_58_in_rule__TypeFieldName__AllExtendedTypesAssignment_86152); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2999:1: rule__TypeFieldName__FieldTypeAssignment_9 : ( ( 'FieldType' ) ) ;
    public final void rule__TypeFieldName__FieldTypeAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3003:1: ( ( ( 'FieldType' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3004:1: ( ( 'FieldType' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3004:1: ( ( 'FieldType' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3005:1: ( 'FieldType' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getFieldTypeFieldTypeKeyword_9_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3006:1: ( 'FieldType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3007:1: 'FieldType'
            {
             before(grammarAccess.getTypeFieldNameAccess().getFieldTypeFieldTypeKeyword_9_0()); 
            match(input,59,FOLLOW_59_in_rule__TypeFieldName__FieldTypeAssignment_96196); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3022:1: rule__TypeFieldName__DeclaringTypeAssignment_10 : ( ( 'DeclaringType' ) ) ;
    public final void rule__TypeFieldName__DeclaringTypeAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3026:1: ( ( ( 'DeclaringType' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3027:1: ( ( 'DeclaringType' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3027:1: ( ( 'DeclaringType' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3028:1: ( 'DeclaringType' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getDeclaringTypeDeclaringTypeKeyword_10_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3029:1: ( 'DeclaringType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3030:1: 'DeclaringType'
            {
             before(grammarAccess.getTypeFieldNameAccess().getDeclaringTypeDeclaringTypeKeyword_10_0()); 
            match(input,60,FOLLOW_60_in_rule__TypeFieldName__DeclaringTypeAssignment_106240); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3045:1: rule__TypeFieldName__CaughtTypeAssignment_11 : ( ( 'CaughtType' ) ) ;
    public final void rule__TypeFieldName__CaughtTypeAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3049:1: ( ( ( 'CaughtType' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3050:1: ( ( 'CaughtType' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3050:1: ( ( 'CaughtType' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3051:1: ( 'CaughtType' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getCaughtTypeCaughtTypeKeyword_11_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3052:1: ( 'CaughtType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3053:1: 'CaughtType'
            {
             before(grammarAccess.getTypeFieldNameAccess().getCaughtTypeCaughtTypeKeyword_11_0()); 
            match(input,61,FOLLOW_61_in_rule__TypeFieldName__CaughtTypeAssignment_116284); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3068:1: rule__TypeFieldName__InstanceofTypesAssignment_12 : ( ( 'InstanceofTypes' ) ) ;
    public final void rule__TypeFieldName__InstanceofTypesAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3072:1: ( ( ( 'InstanceofTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3073:1: ( ( 'InstanceofTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3073:1: ( ( 'InstanceofTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3074:1: ( 'InstanceofTypes' )
            {
             before(grammarAccess.getTypeFieldNameAccess().getInstanceofTypesInstanceofTypesKeyword_12_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3075:1: ( 'InstanceofTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3076:1: 'InstanceofTypes'
            {
             before(grammarAccess.getTypeFieldNameAccess().getInstanceofTypesInstanceofTypesKeyword_12_0()); 
            match(input,62,FOLLOW_62_in_rule__TypeFieldName__InstanceofTypesAssignment_126328); 
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
    public static final BitSet FOLLOW_ruleSpecialChar_in_entryRuleSpecialChar668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialChar675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialChar__Alternatives_in_ruleSpecialChar701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcard_in_entryRuleWildcard728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWildcard735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wildcard__Alternatives_in_ruleWildcard761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldName_in_entryRuleFieldName788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldName795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__Alternatives_in_ruleFieldName821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFieldName_in_entryRuleTypeFieldName848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeFieldName855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__Alternatives_in_ruleTypeFieldName881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__Alternatives_in_ruleBooleanExp918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotExpression__Alternatives_in_ruleNotExpression954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleMustExpression991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__ValueAssignment_0_in_rule__Exp2__Alternatives1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__0_in_rule__Exp2__Alternatives1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__NAssignment_0_0_in_rule__ClauseExpression__Alternatives_01079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__MAssignment_0_1_in_rule__ClauseExpression__Alternatives_01097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ClauseAssignment_1_0_in_rule__ClauseExpression__Alternatives_11130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ClauseAssignment_1_1_in_rule__ClauseExpression__Alternatives_11148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Sep__Alternatives1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Sep__Alternatives1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialChar__Group_0__0_in_rule__SpecialChar__Alternatives1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SpecialChar__Alternatives1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Wildcard__Alternatives1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Wildcard__Alternatives1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__FullyQualifiedNameAssignment_0_in_rule__FieldName__Alternatives1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__TypeAssignment_1_in_rule__FieldName__Alternatives1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__FriendlyNameAssignment_2_in_rule__FieldName__Alternatives1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__DeclaredMethodsAssignment_3_in_rule__FieldName__Alternatives1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__ParameterCountAssignment_4_in_rule__FieldName__Alternatives1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__ReturnVariableEexpressionsAssignment_5_in_rule__FieldName__Alternatives1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__UsedMethodsAssignment_6_in_rule__FieldName__Alternatives1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__UsedMethodsInTryAssignment_7_in_rule__FieldName__Alternatives1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__UsedMethodsInFinallyAssignment_8_in_rule__FieldName__Alternatives1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__OverriddenMethodsAssignment_9_in_rule__FieldName__Alternatives1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__ProjectNameAssignment_10_in_rule__FieldName__Alternatives1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__ResourcePathAssignment_11_in_rule__FieldName__Alternatives1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__ModifiersAssignment_12_in_rule__FieldName__Alternatives1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__AllDeclaredMethodNamesAssignment_13_in_rule__FieldName__Alternatives1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__DeclaredMethodNamesAssignment_14_in_rule__FieldName__Alternatives1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__DeclaredFieldNamesAssignment_15_in_rule__FieldName__Alternatives1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__DeclaredFieldTypesAssignment_16_in_rule__FieldName__Alternatives1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__AllDeclaredFieldNamesAssignment_17_in_rule__FieldName__Alternatives1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__FullTextAssignment_18_in_rule__FieldName__Alternatives1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__FieldsReadAssignment_19_in_rule__FieldName__Alternatives1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__FieldsWrittenAssignment_20_in_rule__FieldName__Alternatives1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__UsedFieldsInFinallyAssignment_21_in_rule__FieldName__Alternatives1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__UsedFieldsInTryAssignment_22_in_rule__FieldName__Alternatives1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__AnnotationsAssignment_23_in_rule__FieldName__Alternatives1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldName__TimestampAssignment_24_in_rule__FieldName__Alternatives1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__ImplementedTypesAssignment_0_in_rule__TypeFieldName__Alternatives1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__ExtendedTypesAssignment_1_in_rule__TypeFieldName__Alternatives1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__UsedTypesAssignment_2_in_rule__TypeFieldName__Alternatives1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__UsedTypesInTryAssignment_3_in_rule__TypeFieldName__Alternatives1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__UsedTypesInFinallyAssignment_4_in_rule__TypeFieldName__Alternatives1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__ParameterTypesAssignment_5_in_rule__TypeFieldName__Alternatives1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__ReturnTypeAssignment_6_in_rule__TypeFieldName__Alternatives1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__AllImplementedTypesAssignment_7_in_rule__TypeFieldName__Alternatives1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__AllExtendedTypesAssignment_8_in_rule__TypeFieldName__Alternatives1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__FieldTypeAssignment_9_in_rule__TypeFieldName__Alternatives1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__DeclaringTypeAssignment_10_in_rule__TypeFieldName__Alternatives1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__CaughtTypeAssignment_11_in_rule__TypeFieldName__Alternatives2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFieldName__InstanceofTypesAssignment_12_in_rule__TypeFieldName__Alternatives2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BooleanExp__Alternatives2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BooleanExp__Alternatives2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__NotExpression__Alternatives2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__NotExpression__Alternatives2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__NotExpression__Alternatives2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group__0__Impl_in_rule__Exp1__Group__02191 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Exp1__Group__1_in_rule__Exp1__Group__02194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp2_in_rule__Exp1__Group__0__Impl2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group__1__Impl_in_rule__Exp1__Group__12250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__0_in_rule__Exp1__Group__1__Impl2277 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__0__Impl_in_rule__Exp1__Group_1__02312 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__1_in_rule__Exp1__Group_1__02315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__1__Impl_in_rule__Exp1__Group_1__12373 = new BitSet(new long[]{0x7FFFFFFFFE3C0800L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__2_in_rule__Exp1__Group_1__12376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__BAssignment_1_1_in_rule__Exp1__Group_1__1__Impl2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__2__Impl_in_rule__Exp1__Group_1__22433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__RightAssignment_1_2_in_rule__Exp1__Group_1__2__Impl2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__0__Impl_in_rule__Exp2__Group_1__02496 = new BitSet(new long[]{0x7FFFFFFFFE3C0800L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__1_in_rule__Exp2__Group_1__02499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Exp2__Group_1__0__Impl2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__1__Impl_in_rule__Exp2__Group_1__12558 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__2_in_rule__Exp2__Group_1__12561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp1_in_rule__Exp2__Group_1__1__Impl2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__2__Impl_in_rule__Exp2__Group_1__22617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Exp2__Group_1__2__Impl2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group__0__Impl_in_rule__ClauseExpression__Group__02682 = new BitSet(new long[]{0x7FFFFFFFFE1C0800L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group__1_in_rule__ClauseExpression__Group__02685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Alternatives_0_in_rule__ClauseExpression__Group__0__Impl2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group__1__Impl_in_rule__ClauseExpression__Group__12743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Alternatives_1_in_rule__ClauseExpression__Group__1__Impl2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClause__Group__0__Impl_in_rule__SimpleClause__Group__02804 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__SimpleClause__Group__1_in_rule__SimpleClause__Group__02807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClause__FieldAssignment_0_in_rule__SimpleClause__Group__0__Impl2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClause__Group__1__Impl_in_rule__SimpleClause__Group__12864 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__SimpleClause__Group__2_in_rule__SimpleClause__Group__12867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SimpleClause__Group__1__Impl2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClause__Group__2__Impl_in_rule__SimpleClause__Group__22926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClause__ValueAssignment_2_in_rule__SimpleClause__Group__2__Impl2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeClause__Group__0__Impl_in_rule__TypeClause__Group__02989 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__TypeClause__Group__1_in_rule__TypeClause__Group__02992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeClause__FieldAssignment_0_in_rule__TypeClause__Group__0__Impl3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeClause__Group__1__Impl_in_rule__TypeClause__Group__13049 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__TypeClause__Group__2_in_rule__TypeClause__Group__13052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TypeClause__Group__1__Impl3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeClause__Group__2__Impl_in_rule__TypeClause__Group__23111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeClause__ValueAssignment_2_in_rule__TypeClause__Group__2__Impl3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group__0__Impl_in_rule__Value__Group__03174 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__Value__Group__1_in_rule__Value__Group__03177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcard_in_rule__Value__Group__0__Impl3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group__1__Impl_in_rule__Value__Group__13236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_1__0_in_rule__Value__Group__1__Impl3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_1__0__Impl_in_rule__Value__Group_1__03298 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__Value__Group_1__1_in_rule__Value__Group_1__03301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_1_0__0_in_rule__Value__Group_1__0__Impl3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_1__1__Impl_in_rule__Value__Group_1__13358 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__Value__Group_1__2_in_rule__Value__Group_1__13361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_1_1__0_in_rule__Value__Group_1__1__Impl3388 = new BitSet(new long[]{0x000000000000C012L});
    public static final BitSet FOLLOW_rule__Value__Group_1__2__Impl_in_rule__Value__Group_1__23419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcard_in_rule__Value__Group_1__2__Impl3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_1_0__0__Impl_in_rule__Value__Group_1_0__03484 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_rule__Value__Group_1_0__1_in_rule__Value__Group_1_0__03487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Value__Group_1_0__0__Impl3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_1_0__1__Impl_in_rule__Value__Group_1_0__13543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialChar_in_rule__Value__Group_1_0__1__Impl3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_1_1__0__Impl_in_rule__Value__Group_1_1__03606 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__Value__Group_1_1__1_in_rule__Value__Group_1_1__03609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcard_in_rule__Value__Group_1_1__0__Impl3637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_1_1__1__Impl_in_rule__Value__Group_1_1__13668 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_rule__Value__Group_1_1__2_in_rule__Value__Group_1_1__13671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Value__Group_1_1__1__Impl3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_1_1__2__Impl_in_rule__Value__Group_1_1__23727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialChar_in_rule__Value__Group_1_1__2__Impl3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__03792 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__03795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__QualifiedNameWithWildcard__Group__0__Impl3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__13851 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__2_in_rule__QualifiedNameWithWildcard__Group__13854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0_in_rule__QualifiedNameWithWildcard__Group__1__Impl3881 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__2__Impl_in_rule__QualifiedNameWithWildcard__Group__23912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcard_in_rule__QualifiedNameWithWildcard__Group__2__Impl3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0__Impl_in_rule__QualifiedNameWithWildcard__Group_1__03977 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1_in_rule__QualifiedNameWithWildcard__Group_1__03980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcard_in_rule__QualifiedNameWithWildcard__Group_1__0__Impl4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1__Impl_in_rule__QualifiedNameWithWildcard__Group_1__14039 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__2_in_rule__QualifiedNameWithWildcard__Group_1__14042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSep_in_rule__QualifiedNameWithWildcard__Group_1__1__Impl4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__2__Impl_in_rule__QualifiedNameWithWildcard__Group_1__24098 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__3_in_rule__QualifiedNameWithWildcard__Group_1__24101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcard_in_rule__QualifiedNameWithWildcard__Group_1__2__Impl4129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__3__Impl_in_rule__QualifiedNameWithWildcard__Group_1__34160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__QualifiedNameWithWildcard__Group_1__3__Impl4187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialChar__Group_0__0__Impl_in_rule__SpecialChar__Group_0__04224 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__SpecialChar__Group_0__1_in_rule__SpecialChar__Group_0__04227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SpecialChar__Group_0__0__Impl4255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialChar__Group_0__1__Impl_in_rule__SpecialChar__Group_0__14286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SpecialChar__Group_0__1__Impl4314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExp_in_rule__Exp1__BAssignment_1_14354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp2_in_rule__Exp1__RightAssignment_1_24385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClauseExpression_in_rule__Exp2__ValueAssignment_04416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_rule__ClauseExpression__NAssignment_0_04447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMustExpression_in_rule__ClauseExpression__MAssignment_0_14478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleClause_in_rule__ClauseExpression__ClauseAssignment_1_04509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeClause_in_rule__ClauseExpression__ClauseAssignment_1_14540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldName_in_rule__SimpleClause__FieldAssignment_04571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldValue_in_rule__SimpleClause__ValueAssignment_24602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFieldName_in_rule__TypeClause__FieldAssignment_04633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeValue_in_rule__TypeClause__ValueAssignment_24664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FieldName__FullyQualifiedNameAssignment_04700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__FieldName__TypeAssignment_14744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__FieldName__FriendlyNameAssignment_24788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__FieldName__DeclaredMethodsAssignment_34832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FieldName__ParameterCountAssignment_44876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__FieldName__ReturnVariableEexpressionsAssignment_54920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FieldName__UsedMethodsAssignment_64964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__FieldName__UsedMethodsInTryAssignment_75008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FieldName__UsedMethodsInFinallyAssignment_85052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FieldName__OverriddenMethodsAssignment_95096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FieldName__ProjectNameAssignment_105140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FieldName__ResourcePathAssignment_115184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__FieldName__ModifiersAssignment_125228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__FieldName__AllDeclaredMethodNamesAssignment_135272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__FieldName__DeclaredMethodNamesAssignment_145316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__FieldName__DeclaredFieldNamesAssignment_155360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__FieldName__DeclaredFieldTypesAssignment_165404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__FieldName__AllDeclaredFieldNamesAssignment_175448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__FieldName__FullTextAssignment_185492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__FieldName__FieldsReadAssignment_195536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__FieldName__FieldsWrittenAssignment_205580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__FieldName__UsedFieldsInFinallyAssignment_215624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__FieldName__UsedFieldsInTryAssignment_225668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__FieldName__AnnotationsAssignment_235712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__FieldName__TimestampAssignment_245756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__TypeFieldName__ImplementedTypesAssignment_05800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__TypeFieldName__ExtendedTypesAssignment_15844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__TypeFieldName__UsedTypesAssignment_25888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__TypeFieldName__UsedTypesInTryAssignment_35932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__TypeFieldName__UsedTypesInFinallyAssignment_45976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__TypeFieldName__ParameterTypesAssignment_56020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__TypeFieldName__ReturnTypeAssignment_66064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__TypeFieldName__AllImplementedTypesAssignment_76108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__TypeFieldName__AllExtendedTypesAssignment_86152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__TypeFieldName__FieldTypeAssignment_96196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__TypeFieldName__DeclaringTypeAssignment_106240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__TypeFieldName__CaughtTypeAssignment_116284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__TypeFieldName__InstanceofTypesAssignment_126328 = new BitSet(new long[]{0x0000000000000002L});

}