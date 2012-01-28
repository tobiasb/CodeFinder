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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAMEWITHWC", "RULE_INT", "RULE_PATHWITHWC", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'private'", "'public'", "'static'", "'final'", "'abstract'", "'protected'", "'class'", "'method'", "'field'", "'trycatch'", "'-'", "'NOT'", "'!'", "'+'", "'AND'", "'OR'", "'('", "')'", "':'", "'ImplementedTypes'", "'ExtendedTypes'", "'UsedTypes'", "'UsedTypesInTry'", "'UsedTypesInFinally'", "'ParameterTypes'", "'ReturnType'", "'InstanceofTypes'", "'AllImplementedTypes'", "'AllExtendedTypes'", "'FieldType'", "'CaughtType'", "'DeclaredFieldTypes'", "'DeclaringType'", "'UsedMethods'", "'UsedMethodsInTry'", "'UsedMethodsInFinally'", "'OverriddenMethods'", "'ResourcePath'", "'ParameterCount'", "'Modifiers'", "'Timestamp'", "'Type'", "'ProjectName'", "'Annotations'", "'FullyQualifiedName'", "'FriendlyName'", "'DeclaredMethods'", "'ReturnVariableEexpressions'", "'AllDeclaredMethodNames'", "'DeclaredMethodNames'", "'DeclaredFieldNames'", "'AllDeclaredFieldNames'", "'FullText'", "'FieldsRead'", "'FieldsWritten'", "'UsedFieldsInFinally'", "'UsedFieldsInTry'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=7;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
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
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
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
    public static final int RULE_PATHWITHWC=6;
    public static final int RULE_NAMEWITHWC=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=8;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;

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


    // $ANTLR start "entryRuleTypeField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:144:1: entryRuleTypeField : ruleTypeField EOF ;
    public final void entryRuleTypeField() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:145:1: ( ruleTypeField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:146:1: ruleTypeField EOF
            {
             before(grammarAccess.getTypeFieldRule()); 
            pushFollow(FOLLOW_ruleTypeField_in_entryRuleTypeField241);
            ruleTypeField();

            state._fsp--;

             after(grammarAccess.getTypeFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeField248); 

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
    // $ANTLR end "entryRuleTypeField"


    // $ANTLR start "ruleTypeField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:153:1: ruleTypeField : ( ( rule__TypeField__Alternatives ) ) ;
    public final void ruleTypeField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:157:2: ( ( ( rule__TypeField__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:158:1: ( ( rule__TypeField__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:158:1: ( ( rule__TypeField__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:159:1: ( rule__TypeField__Alternatives )
            {
             before(grammarAccess.getTypeFieldAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:160:1: ( rule__TypeField__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:160:2: rule__TypeField__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeField__Alternatives_in_ruleTypeField274);
            rule__TypeField__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeFieldAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeField"


    // $ANTLR start "entryRuleMethodField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:172:1: entryRuleMethodField : ruleMethodField EOF ;
    public final void entryRuleMethodField() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:173:1: ( ruleMethodField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:174:1: ruleMethodField EOF
            {
             before(grammarAccess.getMethodFieldRule()); 
            pushFollow(FOLLOW_ruleMethodField_in_entryRuleMethodField301);
            ruleMethodField();

            state._fsp--;

             after(grammarAccess.getMethodFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodField308); 

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
    // $ANTLR end "entryRuleMethodField"


    // $ANTLR start "ruleMethodField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:181:1: ruleMethodField : ( ( rule__MethodField__Alternatives ) ) ;
    public final void ruleMethodField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:185:2: ( ( ( rule__MethodField__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:186:1: ( ( rule__MethodField__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:186:1: ( ( rule__MethodField__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:187:1: ( rule__MethodField__Alternatives )
            {
             before(grammarAccess.getMethodFieldAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:188:1: ( rule__MethodField__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:188:2: rule__MethodField__Alternatives
            {
            pushFollow(FOLLOW_rule__MethodField__Alternatives_in_ruleMethodField334);
            rule__MethodField__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMethodFieldAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodField"


    // $ANTLR start "entryRuleFilePathField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:200:1: entryRuleFilePathField : ruleFilePathField EOF ;
    public final void entryRuleFilePathField() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:201:1: ( ruleFilePathField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:202:1: ruleFilePathField EOF
            {
             before(grammarAccess.getFilePathFieldRule()); 
            pushFollow(FOLLOW_ruleFilePathField_in_entryRuleFilePathField361);
            ruleFilePathField();

            state._fsp--;

             after(grammarAccess.getFilePathFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilePathField368); 

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
    // $ANTLR end "entryRuleFilePathField"


    // $ANTLR start "ruleFilePathField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:209:1: ruleFilePathField : ( ( rule__FilePathField__ResourcePathAssignment ) ) ;
    public final void ruleFilePathField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:213:2: ( ( ( rule__FilePathField__ResourcePathAssignment ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:214:1: ( ( rule__FilePathField__ResourcePathAssignment ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:214:1: ( ( rule__FilePathField__ResourcePathAssignment ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:215:1: ( rule__FilePathField__ResourcePathAssignment )
            {
             before(grammarAccess.getFilePathFieldAccess().getResourcePathAssignment()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:216:1: ( rule__FilePathField__ResourcePathAssignment )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:216:2: rule__FilePathField__ResourcePathAssignment
            {
            pushFollow(FOLLOW_rule__FilePathField__ResourcePathAssignment_in_ruleFilePathField394);
            rule__FilePathField__ResourcePathAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFilePathFieldAccess().getResourcePathAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilePathField"


    // $ANTLR start "entryRuleNumberField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:228:1: entryRuleNumberField : ruleNumberField EOF ;
    public final void entryRuleNumberField() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:229:1: ( ruleNumberField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:230:1: ruleNumberField EOF
            {
             before(grammarAccess.getNumberFieldRule()); 
            pushFollow(FOLLOW_ruleNumberField_in_entryRuleNumberField421);
            ruleNumberField();

            state._fsp--;

             after(grammarAccess.getNumberFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberField428); 

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
    // $ANTLR end "entryRuleNumberField"


    // $ANTLR start "ruleNumberField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:237:1: ruleNumberField : ( ( rule__NumberField__ParameterCountAssignment ) ) ;
    public final void ruleNumberField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:241:2: ( ( ( rule__NumberField__ParameterCountAssignment ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:242:1: ( ( rule__NumberField__ParameterCountAssignment ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:242:1: ( ( rule__NumberField__ParameterCountAssignment ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:243:1: ( rule__NumberField__ParameterCountAssignment )
            {
             before(grammarAccess.getNumberFieldAccess().getParameterCountAssignment()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:244:1: ( rule__NumberField__ParameterCountAssignment )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:244:2: rule__NumberField__ParameterCountAssignment
            {
            pushFollow(FOLLOW_rule__NumberField__ParameterCountAssignment_in_ruleNumberField454);
            rule__NumberField__ParameterCountAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberFieldAccess().getParameterCountAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberField"


    // $ANTLR start "entryRuleModifierField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:256:1: entryRuleModifierField : ruleModifierField EOF ;
    public final void entryRuleModifierField() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:257:1: ( ruleModifierField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:258:1: ruleModifierField EOF
            {
             before(grammarAccess.getModifierFieldRule()); 
            pushFollow(FOLLOW_ruleModifierField_in_entryRuleModifierField481);
            ruleModifierField();

            state._fsp--;

             after(grammarAccess.getModifierFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifierField488); 

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
    // $ANTLR end "entryRuleModifierField"


    // $ANTLR start "ruleModifierField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:265:1: ruleModifierField : ( ( rule__ModifierField__ModifiersAssignment ) ) ;
    public final void ruleModifierField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:269:2: ( ( ( rule__ModifierField__ModifiersAssignment ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:270:1: ( ( rule__ModifierField__ModifiersAssignment ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:270:1: ( ( rule__ModifierField__ModifiersAssignment ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:271:1: ( rule__ModifierField__ModifiersAssignment )
            {
             before(grammarAccess.getModifierFieldAccess().getModifiersAssignment()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:272:1: ( rule__ModifierField__ModifiersAssignment )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:272:2: rule__ModifierField__ModifiersAssignment
            {
            pushFollow(FOLLOW_rule__ModifierField__ModifiersAssignment_in_ruleModifierField514);
            rule__ModifierField__ModifiersAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModifierFieldAccess().getModifiersAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModifierField"


    // $ANTLR start "entryRuleTimeField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:284:1: entryRuleTimeField : ruleTimeField EOF ;
    public final void entryRuleTimeField() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:285:1: ( ruleTimeField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:286:1: ruleTimeField EOF
            {
             before(grammarAccess.getTimeFieldRule()); 
            pushFollow(FOLLOW_ruleTimeField_in_entryRuleTimeField541);
            ruleTimeField();

            state._fsp--;

             after(grammarAccess.getTimeFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeField548); 

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
    // $ANTLR end "entryRuleTimeField"


    // $ANTLR start "ruleTimeField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:293:1: ruleTimeField : ( ( rule__TimeField__TimestampAssignment ) ) ;
    public final void ruleTimeField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:297:2: ( ( ( rule__TimeField__TimestampAssignment ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:298:1: ( ( rule__TimeField__TimestampAssignment ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:298:1: ( ( rule__TimeField__TimestampAssignment ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:299:1: ( rule__TimeField__TimestampAssignment )
            {
             before(grammarAccess.getTimeFieldAccess().getTimestampAssignment()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:300:1: ( rule__TimeField__TimestampAssignment )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:300:2: rule__TimeField__TimestampAssignment
            {
            pushFollow(FOLLOW_rule__TimeField__TimestampAssignment_in_ruleTimeField574);
            rule__TimeField__TimestampAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTimeFieldAccess().getTimestampAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeField"


    // $ANTLR start "entryRuleDocumentTypeField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:312:1: entryRuleDocumentTypeField : ruleDocumentTypeField EOF ;
    public final void entryRuleDocumentTypeField() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:313:1: ( ruleDocumentTypeField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:314:1: ruleDocumentTypeField EOF
            {
             before(grammarAccess.getDocumentTypeFieldRule()); 
            pushFollow(FOLLOW_ruleDocumentTypeField_in_entryRuleDocumentTypeField601);
            ruleDocumentTypeField();

            state._fsp--;

             after(grammarAccess.getDocumentTypeFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocumentTypeField608); 

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
    // $ANTLR end "entryRuleDocumentTypeField"


    // $ANTLR start "ruleDocumentTypeField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:321:1: ruleDocumentTypeField : ( ( rule__DocumentTypeField__TypeAssignment ) ) ;
    public final void ruleDocumentTypeField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:325:2: ( ( ( rule__DocumentTypeField__TypeAssignment ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:326:1: ( ( rule__DocumentTypeField__TypeAssignment ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:326:1: ( ( rule__DocumentTypeField__TypeAssignment ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:327:1: ( rule__DocumentTypeField__TypeAssignment )
            {
             before(grammarAccess.getDocumentTypeFieldAccess().getTypeAssignment()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:328:1: ( rule__DocumentTypeField__TypeAssignment )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:328:2: rule__DocumentTypeField__TypeAssignment
            {
            pushFollow(FOLLOW_rule__DocumentTypeField__TypeAssignment_in_ruleDocumentTypeField634);
            rule__DocumentTypeField__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDocumentTypeFieldAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDocumentTypeField"


    // $ANTLR start "entryRuleProjectNameField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:340:1: entryRuleProjectNameField : ruleProjectNameField EOF ;
    public final void entryRuleProjectNameField() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:341:1: ( ruleProjectNameField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:342:1: ruleProjectNameField EOF
            {
             before(grammarAccess.getProjectNameFieldRule()); 
            pushFollow(FOLLOW_ruleProjectNameField_in_entryRuleProjectNameField661);
            ruleProjectNameField();

            state._fsp--;

             after(grammarAccess.getProjectNameFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjectNameField668); 

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
    // $ANTLR end "entryRuleProjectNameField"


    // $ANTLR start "ruleProjectNameField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:349:1: ruleProjectNameField : ( ( rule__ProjectNameField__ProjectNameAssignment ) ) ;
    public final void ruleProjectNameField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:353:2: ( ( ( rule__ProjectNameField__ProjectNameAssignment ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:354:1: ( ( rule__ProjectNameField__ProjectNameAssignment ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:354:1: ( ( rule__ProjectNameField__ProjectNameAssignment ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:355:1: ( rule__ProjectNameField__ProjectNameAssignment )
            {
             before(grammarAccess.getProjectNameFieldAccess().getProjectNameAssignment()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:356:1: ( rule__ProjectNameField__ProjectNameAssignment )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:356:2: rule__ProjectNameField__ProjectNameAssignment
            {
            pushFollow(FOLLOW_rule__ProjectNameField__ProjectNameAssignment_in_ruleProjectNameField694);
            rule__ProjectNameField__ProjectNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProjectNameFieldAccess().getProjectNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProjectNameField"


    // $ANTLR start "entryRuleAnnotationField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:368:1: entryRuleAnnotationField : ruleAnnotationField EOF ;
    public final void entryRuleAnnotationField() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:369:1: ( ruleAnnotationField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:370:1: ruleAnnotationField EOF
            {
             before(grammarAccess.getAnnotationFieldRule()); 
            pushFollow(FOLLOW_ruleAnnotationField_in_entryRuleAnnotationField721);
            ruleAnnotationField();

            state._fsp--;

             after(grammarAccess.getAnnotationFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationField728); 

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
    // $ANTLR end "entryRuleAnnotationField"


    // $ANTLR start "ruleAnnotationField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:377:1: ruleAnnotationField : ( ( rule__AnnotationField__AnnotationsAssignment ) ) ;
    public final void ruleAnnotationField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:381:2: ( ( ( rule__AnnotationField__AnnotationsAssignment ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:382:1: ( ( rule__AnnotationField__AnnotationsAssignment ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:382:1: ( ( rule__AnnotationField__AnnotationsAssignment ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:383:1: ( rule__AnnotationField__AnnotationsAssignment )
            {
             before(grammarAccess.getAnnotationFieldAccess().getAnnotationsAssignment()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:384:1: ( rule__AnnotationField__AnnotationsAssignment )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:384:2: rule__AnnotationField__AnnotationsAssignment
            {
            pushFollow(FOLLOW_rule__AnnotationField__AnnotationsAssignment_in_ruleAnnotationField754);
            rule__AnnotationField__AnnotationsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationFieldAccess().getAnnotationsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotationField"


    // $ANTLR start "entryRuleSimpleField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:396:1: entryRuleSimpleField : ruleSimpleField EOF ;
    public final void entryRuleSimpleField() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:397:1: ( ruleSimpleField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:398:1: ruleSimpleField EOF
            {
             before(grammarAccess.getSimpleFieldRule()); 
            pushFollow(FOLLOW_ruleSimpleField_in_entryRuleSimpleField781);
            ruleSimpleField();

            state._fsp--;

             after(grammarAccess.getSimpleFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleField788); 

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
    // $ANTLR end "entryRuleSimpleField"


    // $ANTLR start "ruleSimpleField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:405:1: ruleSimpleField : ( ( rule__SimpleField__Alternatives ) ) ;
    public final void ruleSimpleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:409:2: ( ( ( rule__SimpleField__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:410:1: ( ( rule__SimpleField__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:410:1: ( ( rule__SimpleField__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:411:1: ( rule__SimpleField__Alternatives )
            {
             before(grammarAccess.getSimpleFieldAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:412:1: ( rule__SimpleField__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:412:2: rule__SimpleField__Alternatives
            {
            pushFollow(FOLLOW_rule__SimpleField__Alternatives_in_ruleSimpleField814);
            rule__SimpleField__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimpleFieldAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleField"


    // $ANTLR start "entryRuleSimpleFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:424:1: entryRuleSimpleFieldValue : ruleSimpleFieldValue EOF ;
    public final void entryRuleSimpleFieldValue() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:425:1: ( ruleSimpleFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:426:1: ruleSimpleFieldValue EOF
            {
             before(grammarAccess.getSimpleFieldValueRule()); 
            pushFollow(FOLLOW_ruleSimpleFieldValue_in_entryRuleSimpleFieldValue841);
            ruleSimpleFieldValue();

            state._fsp--;

             after(grammarAccess.getSimpleFieldValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleFieldValue848); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:433:1: ruleSimpleFieldValue : ( RULE_NAMEWITHWC ) ;
    public final void ruleSimpleFieldValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:437:2: ( ( RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:438:1: ( RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:438:1: ( RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:439:1: RULE_NAMEWITHWC
            {
             before(grammarAccess.getSimpleFieldValueAccess().getNameWithWCTerminalRuleCall()); 
            match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleSimpleFieldValue874); 
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


    // $ANTLR start "entryRuleMethodFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:452:1: entryRuleMethodFieldValue : ruleMethodFieldValue EOF ;
    public final void entryRuleMethodFieldValue() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:453:1: ( ruleMethodFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:454:1: ruleMethodFieldValue EOF
            {
             before(grammarAccess.getMethodFieldValueRule()); 
            pushFollow(FOLLOW_ruleMethodFieldValue_in_entryRuleMethodFieldValue900);
            ruleMethodFieldValue();

            state._fsp--;

             after(grammarAccess.getMethodFieldValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodFieldValue907); 

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
    // $ANTLR end "entryRuleMethodFieldValue"


    // $ANTLR start "ruleMethodFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:461:1: ruleMethodFieldValue : ( RULE_NAMEWITHWC ) ;
    public final void ruleMethodFieldValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:465:2: ( ( RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:466:1: ( RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:466:1: ( RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:467:1: RULE_NAMEWITHWC
            {
             before(grammarAccess.getMethodFieldValueAccess().getNameWithWCTerminalRuleCall()); 
            match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleMethodFieldValue933); 
             after(grammarAccess.getMethodFieldValueAccess().getNameWithWCTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodFieldValue"


    // $ANTLR start "entryRuleProjectNameFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:480:1: entryRuleProjectNameFieldValue : ruleProjectNameFieldValue EOF ;
    public final void entryRuleProjectNameFieldValue() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:481:1: ( ruleProjectNameFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:482:1: ruleProjectNameFieldValue EOF
            {
             before(grammarAccess.getProjectNameFieldValueRule()); 
            pushFollow(FOLLOW_ruleProjectNameFieldValue_in_entryRuleProjectNameFieldValue959);
            ruleProjectNameFieldValue();

            state._fsp--;

             after(grammarAccess.getProjectNameFieldValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjectNameFieldValue966); 

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
    // $ANTLR end "entryRuleProjectNameFieldValue"


    // $ANTLR start "ruleProjectNameFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:489:1: ruleProjectNameFieldValue : ( RULE_NAMEWITHWC ) ;
    public final void ruleProjectNameFieldValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:493:2: ( ( RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:494:1: ( RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:494:1: ( RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:495:1: RULE_NAMEWITHWC
            {
             before(grammarAccess.getProjectNameFieldValueAccess().getNameWithWCTerminalRuleCall()); 
            match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleProjectNameFieldValue992); 
             after(grammarAccess.getProjectNameFieldValueAccess().getNameWithWCTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProjectNameFieldValue"


    // $ANTLR start "entryRuleNumberFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:508:1: entryRuleNumberFieldValue : ruleNumberFieldValue EOF ;
    public final void entryRuleNumberFieldValue() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:509:1: ( ruleNumberFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:510:1: ruleNumberFieldValue EOF
            {
             before(grammarAccess.getNumberFieldValueRule()); 
            pushFollow(FOLLOW_ruleNumberFieldValue_in_entryRuleNumberFieldValue1018);
            ruleNumberFieldValue();

            state._fsp--;

             after(grammarAccess.getNumberFieldValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberFieldValue1025); 

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
    // $ANTLR end "entryRuleNumberFieldValue"


    // $ANTLR start "ruleNumberFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:517:1: ruleNumberFieldValue : ( RULE_INT ) ;
    public final void ruleNumberFieldValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:521:2: ( ( RULE_INT ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:522:1: ( RULE_INT )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:522:1: ( RULE_INT )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:523:1: RULE_INT
            {
             before(grammarAccess.getNumberFieldValueAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumberFieldValue1051); 
             after(grammarAccess.getNumberFieldValueAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberFieldValue"


    // $ANTLR start "entryRuleModifierFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:536:1: entryRuleModifierFieldValue : ruleModifierFieldValue EOF ;
    public final void entryRuleModifierFieldValue() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:537:1: ( ruleModifierFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:538:1: ruleModifierFieldValue EOF
            {
             before(grammarAccess.getModifierFieldValueRule()); 
            pushFollow(FOLLOW_ruleModifierFieldValue_in_entryRuleModifierFieldValue1077);
            ruleModifierFieldValue();

            state._fsp--;

             after(grammarAccess.getModifierFieldValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifierFieldValue1084); 

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
    // $ANTLR end "entryRuleModifierFieldValue"


    // $ANTLR start "ruleModifierFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:545:1: ruleModifierFieldValue : ( ( rule__ModifierFieldValue__Alternatives ) ) ;
    public final void ruleModifierFieldValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:549:2: ( ( ( rule__ModifierFieldValue__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:550:1: ( ( rule__ModifierFieldValue__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:550:1: ( ( rule__ModifierFieldValue__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:551:1: ( rule__ModifierFieldValue__Alternatives )
            {
             before(grammarAccess.getModifierFieldValueAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:552:1: ( rule__ModifierFieldValue__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:552:2: rule__ModifierFieldValue__Alternatives
            {
            pushFollow(FOLLOW_rule__ModifierFieldValue__Alternatives_in_ruleModifierFieldValue1110);
            rule__ModifierFieldValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModifierFieldValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModifierFieldValue"


    // $ANTLR start "entryRuleTimeFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:564:1: entryRuleTimeFieldValue : ruleTimeFieldValue EOF ;
    public final void entryRuleTimeFieldValue() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:565:1: ( ruleTimeFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:566:1: ruleTimeFieldValue EOF
            {
             before(grammarAccess.getTimeFieldValueRule()); 
            pushFollow(FOLLOW_ruleTimeFieldValue_in_entryRuleTimeFieldValue1137);
            ruleTimeFieldValue();

            state._fsp--;

             after(grammarAccess.getTimeFieldValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeFieldValue1144); 

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
    // $ANTLR end "entryRuleTimeFieldValue"


    // $ANTLR start "ruleTimeFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:573:1: ruleTimeFieldValue : ( RULE_NAMEWITHWC ) ;
    public final void ruleTimeFieldValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:577:2: ( ( RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:578:1: ( RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:578:1: ( RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:579:1: RULE_NAMEWITHWC
            {
             before(grammarAccess.getTimeFieldValueAccess().getNameWithWCTerminalRuleCall()); 
            match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleTimeFieldValue1170); 
             after(grammarAccess.getTimeFieldValueAccess().getNameWithWCTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeFieldValue"


    // $ANTLR start "entryRuleDocumentTypeFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:592:1: entryRuleDocumentTypeFieldValue : ruleDocumentTypeFieldValue EOF ;
    public final void entryRuleDocumentTypeFieldValue() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:593:1: ( ruleDocumentTypeFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:594:1: ruleDocumentTypeFieldValue EOF
            {
             before(grammarAccess.getDocumentTypeFieldValueRule()); 
            pushFollow(FOLLOW_ruleDocumentTypeFieldValue_in_entryRuleDocumentTypeFieldValue1196);
            ruleDocumentTypeFieldValue();

            state._fsp--;

             after(grammarAccess.getDocumentTypeFieldValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocumentTypeFieldValue1203); 

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
    // $ANTLR end "entryRuleDocumentTypeFieldValue"


    // $ANTLR start "ruleDocumentTypeFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:601:1: ruleDocumentTypeFieldValue : ( ( rule__DocumentTypeFieldValue__Alternatives ) ) ;
    public final void ruleDocumentTypeFieldValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:605:2: ( ( ( rule__DocumentTypeFieldValue__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:606:1: ( ( rule__DocumentTypeFieldValue__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:606:1: ( ( rule__DocumentTypeFieldValue__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:607:1: ( rule__DocumentTypeFieldValue__Alternatives )
            {
             before(grammarAccess.getDocumentTypeFieldValueAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:608:1: ( rule__DocumentTypeFieldValue__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:608:2: rule__DocumentTypeFieldValue__Alternatives
            {
            pushFollow(FOLLOW_rule__DocumentTypeFieldValue__Alternatives_in_ruleDocumentTypeFieldValue1229);
            rule__DocumentTypeFieldValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDocumentTypeFieldValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDocumentTypeFieldValue"


    // $ANTLR start "entryRuleAnnotationFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:620:1: entryRuleAnnotationFieldValue : ruleAnnotationFieldValue EOF ;
    public final void entryRuleAnnotationFieldValue() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:621:1: ( ruleAnnotationFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:622:1: ruleAnnotationFieldValue EOF
            {
             before(grammarAccess.getAnnotationFieldValueRule()); 
            pushFollow(FOLLOW_ruleAnnotationFieldValue_in_entryRuleAnnotationFieldValue1256);
            ruleAnnotationFieldValue();

            state._fsp--;

             after(grammarAccess.getAnnotationFieldValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationFieldValue1263); 

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
    // $ANTLR end "entryRuleAnnotationFieldValue"


    // $ANTLR start "ruleAnnotationFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:629:1: ruleAnnotationFieldValue : ( RULE_NAMEWITHWC ) ;
    public final void ruleAnnotationFieldValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:633:2: ( ( RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:634:1: ( RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:634:1: ( RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:635:1: RULE_NAMEWITHWC
            {
             before(grammarAccess.getAnnotationFieldValueAccess().getNameWithWCTerminalRuleCall()); 
            match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleAnnotationFieldValue1289); 
             after(grammarAccess.getAnnotationFieldValueAccess().getNameWithWCTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotationFieldValue"


    // $ANTLR start "entryRuleTypeFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:648:1: entryRuleTypeFieldValue : ruleTypeFieldValue EOF ;
    public final void entryRuleTypeFieldValue() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:649:1: ( ruleTypeFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:650:1: ruleTypeFieldValue EOF
            {
             before(grammarAccess.getTypeFieldValueRule()); 
            pushFollow(FOLLOW_ruleTypeFieldValue_in_entryRuleTypeFieldValue1315);
            ruleTypeFieldValue();

            state._fsp--;

             after(grammarAccess.getTypeFieldValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeFieldValue1322); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:657:1: ruleTypeFieldValue : ( RULE_NAMEWITHWC ) ;
    public final void ruleTypeFieldValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:661:2: ( ( RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:662:1: ( RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:662:1: ( RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:663:1: RULE_NAMEWITHWC
            {
             before(grammarAccess.getTypeFieldValueAccess().getNameWithWCTerminalRuleCall()); 
            match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleTypeFieldValue1348); 
             after(grammarAccess.getTypeFieldValueAccess().getNameWithWCTerminalRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleFilePathFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:676:1: entryRuleFilePathFieldValue : ruleFilePathFieldValue EOF ;
    public final void entryRuleFilePathFieldValue() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:677:1: ( ruleFilePathFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:678:1: ruleFilePathFieldValue EOF
            {
             before(grammarAccess.getFilePathFieldValueRule()); 
            pushFollow(FOLLOW_ruleFilePathFieldValue_in_entryRuleFilePathFieldValue1374);
            ruleFilePathFieldValue();

            state._fsp--;

             after(grammarAccess.getFilePathFieldValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilePathFieldValue1381); 

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
    // $ANTLR end "entryRuleFilePathFieldValue"


    // $ANTLR start "ruleFilePathFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:685:1: ruleFilePathFieldValue : ( RULE_PATHWITHWC ) ;
    public final void ruleFilePathFieldValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:689:2: ( ( RULE_PATHWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:690:1: ( RULE_PATHWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:690:1: ( RULE_PATHWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:691:1: RULE_PATHWITHWC
            {
             before(grammarAccess.getFilePathFieldValueAccess().getPathWithWCTerminalRuleCall()); 
            match(input,RULE_PATHWITHWC,FOLLOW_RULE_PATHWITHWC_in_ruleFilePathFieldValue1407); 
             after(grammarAccess.getFilePathFieldValueAccess().getPathWithWCTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilePathFieldValue"


    // $ANTLR start "entryRuleUnaryExpression"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:704:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:705:1: ( ruleUnaryExpression EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:706:1: ruleUnaryExpression EOF
            {
             before(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression1433);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression1440); 

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
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:713:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Alternatives ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:717:2: ( ( ( rule__UnaryExpression__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:718:1: ( ( rule__UnaryExpression__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:718:1: ( ( rule__UnaryExpression__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:719:1: ( rule__UnaryExpression__Alternatives )
            {
             before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:720:1: ( rule__UnaryExpression__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:720:2: rule__UnaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Alternatives_in_ruleUnaryExpression1466);
            rule__UnaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "ruleBinaryExp"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:733:1: ruleBinaryExp : ( ( rule__BinaryExp__Alternatives ) ) ;
    public final void ruleBinaryExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:737:1: ( ( ( rule__BinaryExp__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:738:1: ( ( rule__BinaryExp__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:738:1: ( ( rule__BinaryExp__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:739:1: ( rule__BinaryExp__Alternatives )
            {
             before(grammarAccess.getBinaryExpAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:740:1: ( rule__BinaryExp__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:740:2: rule__BinaryExp__Alternatives
            {
            pushFollow(FOLLOW_rule__BinaryExp__Alternatives_in_ruleBinaryExp1503);
            rule__BinaryExp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryExp"


    // $ANTLR start "rule__Exp2__Alternatives"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:751:1: rule__Exp2__Alternatives : ( ( ( rule__Exp2__ValueAssignment_0 ) ) | ( ( rule__Exp2__Group_1__0 ) ) );
    public final void rule__Exp2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:755:1: ( ( ( rule__Exp2__ValueAssignment_0 ) ) | ( ( rule__Exp2__Group_1__0 ) ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case 23:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_NAMEWITHWC||(LA1_1>=32 && LA1_1<=69)) ) {
                    alt1=1;
                }
                else if ( (LA1_1==29) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==RULE_NAMEWITHWC||(LA1_2>=32 && LA1_2<=69)) ) {
                    alt1=1;
                }
                else if ( (LA1_2==29) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 25:
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3==29) ) {
                    alt1=2;
                }
                else if ( (LA1_3==RULE_NAMEWITHWC||(LA1_3>=32 && LA1_3<=69)) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                int LA1_4 = input.LA(2);

                if ( (LA1_4==RULE_NAMEWITHWC||(LA1_4>=32 && LA1_4<=69)) ) {
                    alt1=1;
                }
                else if ( (LA1_4==29) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NAMEWITHWC:
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
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
                {
                alt1=1;
                }
                break;
            case 29:
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:756:1: ( ( rule__Exp2__ValueAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:756:1: ( ( rule__Exp2__ValueAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:757:1: ( rule__Exp2__ValueAssignment_0 )
                    {
                     before(grammarAccess.getExp2Access().getValueAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:758:1: ( rule__Exp2__ValueAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:758:2: rule__Exp2__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Exp2__ValueAssignment_0_in_rule__Exp2__Alternatives1538);
                    rule__Exp2__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExp2Access().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:762:6: ( ( rule__Exp2__Group_1__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:762:6: ( ( rule__Exp2__Group_1__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:763:1: ( rule__Exp2__Group_1__0 )
                    {
                     before(grammarAccess.getExp2Access().getGroup_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:764:1: ( rule__Exp2__Group_1__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:764:2: rule__Exp2__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Exp2__Group_1__0_in_rule__Exp2__Alternatives1556);
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


    // $ANTLR start "rule__ClauseExpression__Alternatives_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:773:1: rule__ClauseExpression__Alternatives_1 : ( ( ( rule__ClauseExpression__DefaultAssignment_1_0 ) ) | ( ( rule__ClauseExpression__Alternatives_1_1 ) ) );
    public final void rule__ClauseExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:777:1: ( ( ( rule__ClauseExpression__DefaultAssignment_1_0 ) ) | ( ( rule__ClauseExpression__Alternatives_1_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_NAMEWITHWC) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=32 && LA2_0<=69)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:778:1: ( ( rule__ClauseExpression__DefaultAssignment_1_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:778:1: ( ( rule__ClauseExpression__DefaultAssignment_1_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:779:1: ( rule__ClauseExpression__DefaultAssignment_1_0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getDefaultAssignment_1_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:780:1: ( rule__ClauseExpression__DefaultAssignment_1_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:780:2: rule__ClauseExpression__DefaultAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__DefaultAssignment_1_0_in_rule__ClauseExpression__Alternatives_11589);
                    rule__ClauseExpression__DefaultAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getDefaultAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:784:6: ( ( rule__ClauseExpression__Alternatives_1_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:784:6: ( ( rule__ClauseExpression__Alternatives_1_1 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:785:1: ( rule__ClauseExpression__Alternatives_1_1 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:786:1: ( rule__ClauseExpression__Alternatives_1_1 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:786:2: rule__ClauseExpression__Alternatives_1_1
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Alternatives_1_1_in_rule__ClauseExpression__Alternatives_11607);
                    rule__ClauseExpression__Alternatives_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1()); 

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


    // $ANTLR start "rule__ClauseExpression__Alternatives_1_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:795:1: rule__ClauseExpression__Alternatives_1_1 : ( ( ( rule__ClauseExpression__Group_1_1_0__0 ) ) | ( ( rule__ClauseExpression__Group_1_1_1__0 ) ) | ( ( rule__ClauseExpression__Group_1_1_2__0 ) ) | ( ( rule__ClauseExpression__Group_1_1_3__0 ) ) | ( ( rule__ClauseExpression__Group_1_1_4__0 ) ) | ( ( rule__ClauseExpression__Group_1_1_5__0 ) ) | ( ( rule__ClauseExpression__Group_1_1_6__0 ) ) | ( ( rule__ClauseExpression__Group_1_1_7__0 ) ) | ( ( rule__ClauseExpression__Group_1_1_8__0 ) ) | ( ( rule__ClauseExpression__Group_1_1_9__0 ) ) );
    public final void rule__ClauseExpression__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:799:1: ( ( ( rule__ClauseExpression__Group_1_1_0__0 ) ) | ( ( rule__ClauseExpression__Group_1_1_1__0 ) ) | ( ( rule__ClauseExpression__Group_1_1_2__0 ) ) | ( ( rule__ClauseExpression__Group_1_1_3__0 ) ) | ( ( rule__ClauseExpression__Group_1_1_4__0 ) ) | ( ( rule__ClauseExpression__Group_1_1_5__0 ) ) | ( ( rule__ClauseExpression__Group_1_1_6__0 ) ) | ( ( rule__ClauseExpression__Group_1_1_7__0 ) ) | ( ( rule__ClauseExpression__Group_1_1_8__0 ) ) | ( ( rule__ClauseExpression__Group_1_1_9__0 ) ) )
            int alt3=10;
            switch ( input.LA(1) ) {
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
                {
                alt3=1;
                }
                break;
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
                {
                alt3=2;
                }
                break;
            case 46:
            case 47:
            case 48:
            case 49:
                {
                alt3=3;
                }
                break;
            case 50:
                {
                alt3=4;
                }
                break;
            case 51:
                {
                alt3=5;
                }
                break;
            case 52:
                {
                alt3=6;
                }
                break;
            case 53:
                {
                alt3=7;
                }
                break;
            case 54:
                {
                alt3=8;
                }
                break;
            case 55:
                {
                alt3=9;
                }
                break;
            case 56:
                {
                alt3=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:800:1: ( ( rule__ClauseExpression__Group_1_1_0__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:800:1: ( ( rule__ClauseExpression__Group_1_1_0__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:801:1: ( rule__ClauseExpression__Group_1_1_0__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:802:1: ( rule__ClauseExpression__Group_1_1_0__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:802:2: rule__ClauseExpression__Group_1_1_0__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_0__0_in_rule__ClauseExpression__Alternatives_1_11640);
                    rule__ClauseExpression__Group_1_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:806:6: ( ( rule__ClauseExpression__Group_1_1_1__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:806:6: ( ( rule__ClauseExpression__Group_1_1_1__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:807:1: ( rule__ClauseExpression__Group_1_1_1__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:808:1: ( rule__ClauseExpression__Group_1_1_1__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:808:2: rule__ClauseExpression__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_1__0_in_rule__ClauseExpression__Alternatives_1_11658);
                    rule__ClauseExpression__Group_1_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:812:6: ( ( rule__ClauseExpression__Group_1_1_2__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:812:6: ( ( rule__ClauseExpression__Group_1_1_2__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:813:1: ( rule__ClauseExpression__Group_1_1_2__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_2()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:814:1: ( rule__ClauseExpression__Group_1_1_2__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:814:2: rule__ClauseExpression__Group_1_1_2__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_2__0_in_rule__ClauseExpression__Alternatives_1_11676);
                    rule__ClauseExpression__Group_1_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:818:6: ( ( rule__ClauseExpression__Group_1_1_3__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:818:6: ( ( rule__ClauseExpression__Group_1_1_3__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:819:1: ( rule__ClauseExpression__Group_1_1_3__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_3()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:820:1: ( rule__ClauseExpression__Group_1_1_3__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:820:2: rule__ClauseExpression__Group_1_1_3__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_3__0_in_rule__ClauseExpression__Alternatives_1_11694);
                    rule__ClauseExpression__Group_1_1_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:824:6: ( ( rule__ClauseExpression__Group_1_1_4__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:824:6: ( ( rule__ClauseExpression__Group_1_1_4__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:825:1: ( rule__ClauseExpression__Group_1_1_4__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_4()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:826:1: ( rule__ClauseExpression__Group_1_1_4__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:826:2: rule__ClauseExpression__Group_1_1_4__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_4__0_in_rule__ClauseExpression__Alternatives_1_11712);
                    rule__ClauseExpression__Group_1_1_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:830:6: ( ( rule__ClauseExpression__Group_1_1_5__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:830:6: ( ( rule__ClauseExpression__Group_1_1_5__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:831:1: ( rule__ClauseExpression__Group_1_1_5__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_5()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:832:1: ( rule__ClauseExpression__Group_1_1_5__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:832:2: rule__ClauseExpression__Group_1_1_5__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_5__0_in_rule__ClauseExpression__Alternatives_1_11730);
                    rule__ClauseExpression__Group_1_1_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:836:6: ( ( rule__ClauseExpression__Group_1_1_6__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:836:6: ( ( rule__ClauseExpression__Group_1_1_6__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:837:1: ( rule__ClauseExpression__Group_1_1_6__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_6()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:838:1: ( rule__ClauseExpression__Group_1_1_6__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:838:2: rule__ClauseExpression__Group_1_1_6__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_6__0_in_rule__ClauseExpression__Alternatives_1_11748);
                    rule__ClauseExpression__Group_1_1_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:842:6: ( ( rule__ClauseExpression__Group_1_1_7__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:842:6: ( ( rule__ClauseExpression__Group_1_1_7__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:843:1: ( rule__ClauseExpression__Group_1_1_7__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_7()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:844:1: ( rule__ClauseExpression__Group_1_1_7__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:844:2: rule__ClauseExpression__Group_1_1_7__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_7__0_in_rule__ClauseExpression__Alternatives_1_11766);
                    rule__ClauseExpression__Group_1_1_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:848:6: ( ( rule__ClauseExpression__Group_1_1_8__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:848:6: ( ( rule__ClauseExpression__Group_1_1_8__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:849:1: ( rule__ClauseExpression__Group_1_1_8__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_8()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:850:1: ( rule__ClauseExpression__Group_1_1_8__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:850:2: rule__ClauseExpression__Group_1_1_8__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_8__0_in_rule__ClauseExpression__Alternatives_1_11784);
                    rule__ClauseExpression__Group_1_1_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:854:6: ( ( rule__ClauseExpression__Group_1_1_9__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:854:6: ( ( rule__ClauseExpression__Group_1_1_9__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:855:1: ( rule__ClauseExpression__Group_1_1_9__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_9()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:856:1: ( rule__ClauseExpression__Group_1_1_9__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:856:2: rule__ClauseExpression__Group_1_1_9__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_9__0_in_rule__ClauseExpression__Alternatives_1_11802);
                    rule__ClauseExpression__Group_1_1_9__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_9()); 

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
    // $ANTLR end "rule__ClauseExpression__Alternatives_1_1"


    // $ANTLR start "rule__TypeField__Alternatives"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:865:1: rule__TypeField__Alternatives : ( ( ( rule__TypeField__ImplementedTypesAssignment_0 ) ) | ( ( rule__TypeField__ExtendedTypesAssignment_1 ) ) | ( ( rule__TypeField__UsedTypesAssignment_2 ) ) | ( ( rule__TypeField__UsedTypesInTryAssignment_3 ) ) | ( ( rule__TypeField__UsedTypesInFinallyAssignment_4 ) ) | ( ( rule__TypeField__ParameterTypesAssignment_5 ) ) | ( ( rule__TypeField__ReturnTypeAssignment_6 ) ) | ( ( rule__TypeField__InstanceofTypesAssignment_7 ) ) | ( ( rule__TypeField__AllImplementedTypesAssignment_8 ) ) | ( ( rule__TypeField__AllExtendedTypesAssignment_9 ) ) | ( ( rule__TypeField__FieldTypeAssignment_10 ) ) | ( ( rule__TypeField__CaughtTypeAssignment_11 ) ) | ( ( rule__TypeField__DeclaredFieldTypesAssignment_12 ) ) | ( ( rule__TypeField__DeclaringTypeAssignment_13 ) ) );
    public final void rule__TypeField__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:869:1: ( ( ( rule__TypeField__ImplementedTypesAssignment_0 ) ) | ( ( rule__TypeField__ExtendedTypesAssignment_1 ) ) | ( ( rule__TypeField__UsedTypesAssignment_2 ) ) | ( ( rule__TypeField__UsedTypesInTryAssignment_3 ) ) | ( ( rule__TypeField__UsedTypesInFinallyAssignment_4 ) ) | ( ( rule__TypeField__ParameterTypesAssignment_5 ) ) | ( ( rule__TypeField__ReturnTypeAssignment_6 ) ) | ( ( rule__TypeField__InstanceofTypesAssignment_7 ) ) | ( ( rule__TypeField__AllImplementedTypesAssignment_8 ) ) | ( ( rule__TypeField__AllExtendedTypesAssignment_9 ) ) | ( ( rule__TypeField__FieldTypeAssignment_10 ) ) | ( ( rule__TypeField__CaughtTypeAssignment_11 ) ) | ( ( rule__TypeField__DeclaredFieldTypesAssignment_12 ) ) | ( ( rule__TypeField__DeclaringTypeAssignment_13 ) ) )
            int alt4=14;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt4=1;
                }
                break;
            case 33:
                {
                alt4=2;
                }
                break;
            case 34:
                {
                alt4=3;
                }
                break;
            case 35:
                {
                alt4=4;
                }
                break;
            case 36:
                {
                alt4=5;
                }
                break;
            case 37:
                {
                alt4=6;
                }
                break;
            case 38:
                {
                alt4=7;
                }
                break;
            case 39:
                {
                alt4=8;
                }
                break;
            case 40:
                {
                alt4=9;
                }
                break;
            case 41:
                {
                alt4=10;
                }
                break;
            case 42:
                {
                alt4=11;
                }
                break;
            case 43:
                {
                alt4=12;
                }
                break;
            case 44:
                {
                alt4=13;
                }
                break;
            case 45:
                {
                alt4=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:870:1: ( ( rule__TypeField__ImplementedTypesAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:870:1: ( ( rule__TypeField__ImplementedTypesAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:871:1: ( rule__TypeField__ImplementedTypesAssignment_0 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getImplementedTypesAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:872:1: ( rule__TypeField__ImplementedTypesAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:872:2: rule__TypeField__ImplementedTypesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TypeField__ImplementedTypesAssignment_0_in_rule__TypeField__Alternatives1835);
                    rule__TypeField__ImplementedTypesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getImplementedTypesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:876:6: ( ( rule__TypeField__ExtendedTypesAssignment_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:876:6: ( ( rule__TypeField__ExtendedTypesAssignment_1 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:877:1: ( rule__TypeField__ExtendedTypesAssignment_1 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getExtendedTypesAssignment_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:878:1: ( rule__TypeField__ExtendedTypesAssignment_1 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:878:2: rule__TypeField__ExtendedTypesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeField__ExtendedTypesAssignment_1_in_rule__TypeField__Alternatives1853);
                    rule__TypeField__ExtendedTypesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getExtendedTypesAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:882:6: ( ( rule__TypeField__UsedTypesAssignment_2 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:882:6: ( ( rule__TypeField__UsedTypesAssignment_2 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:883:1: ( rule__TypeField__UsedTypesAssignment_2 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getUsedTypesAssignment_2()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:884:1: ( rule__TypeField__UsedTypesAssignment_2 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:884:2: rule__TypeField__UsedTypesAssignment_2
                    {
                    pushFollow(FOLLOW_rule__TypeField__UsedTypesAssignment_2_in_rule__TypeField__Alternatives1871);
                    rule__TypeField__UsedTypesAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getUsedTypesAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:888:6: ( ( rule__TypeField__UsedTypesInTryAssignment_3 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:888:6: ( ( rule__TypeField__UsedTypesInTryAssignment_3 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:889:1: ( rule__TypeField__UsedTypesInTryAssignment_3 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getUsedTypesInTryAssignment_3()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:890:1: ( rule__TypeField__UsedTypesInTryAssignment_3 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:890:2: rule__TypeField__UsedTypesInTryAssignment_3
                    {
                    pushFollow(FOLLOW_rule__TypeField__UsedTypesInTryAssignment_3_in_rule__TypeField__Alternatives1889);
                    rule__TypeField__UsedTypesInTryAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getUsedTypesInTryAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:894:6: ( ( rule__TypeField__UsedTypesInFinallyAssignment_4 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:894:6: ( ( rule__TypeField__UsedTypesInFinallyAssignment_4 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:895:1: ( rule__TypeField__UsedTypesInFinallyAssignment_4 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getUsedTypesInFinallyAssignment_4()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:896:1: ( rule__TypeField__UsedTypesInFinallyAssignment_4 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:896:2: rule__TypeField__UsedTypesInFinallyAssignment_4
                    {
                    pushFollow(FOLLOW_rule__TypeField__UsedTypesInFinallyAssignment_4_in_rule__TypeField__Alternatives1907);
                    rule__TypeField__UsedTypesInFinallyAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getUsedTypesInFinallyAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:900:6: ( ( rule__TypeField__ParameterTypesAssignment_5 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:900:6: ( ( rule__TypeField__ParameterTypesAssignment_5 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:901:1: ( rule__TypeField__ParameterTypesAssignment_5 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getParameterTypesAssignment_5()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:902:1: ( rule__TypeField__ParameterTypesAssignment_5 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:902:2: rule__TypeField__ParameterTypesAssignment_5
                    {
                    pushFollow(FOLLOW_rule__TypeField__ParameterTypesAssignment_5_in_rule__TypeField__Alternatives1925);
                    rule__TypeField__ParameterTypesAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getParameterTypesAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:906:6: ( ( rule__TypeField__ReturnTypeAssignment_6 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:906:6: ( ( rule__TypeField__ReturnTypeAssignment_6 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:907:1: ( rule__TypeField__ReturnTypeAssignment_6 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getReturnTypeAssignment_6()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:908:1: ( rule__TypeField__ReturnTypeAssignment_6 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:908:2: rule__TypeField__ReturnTypeAssignment_6
                    {
                    pushFollow(FOLLOW_rule__TypeField__ReturnTypeAssignment_6_in_rule__TypeField__Alternatives1943);
                    rule__TypeField__ReturnTypeAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getReturnTypeAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:912:6: ( ( rule__TypeField__InstanceofTypesAssignment_7 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:912:6: ( ( rule__TypeField__InstanceofTypesAssignment_7 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:913:1: ( rule__TypeField__InstanceofTypesAssignment_7 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getInstanceofTypesAssignment_7()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:914:1: ( rule__TypeField__InstanceofTypesAssignment_7 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:914:2: rule__TypeField__InstanceofTypesAssignment_7
                    {
                    pushFollow(FOLLOW_rule__TypeField__InstanceofTypesAssignment_7_in_rule__TypeField__Alternatives1961);
                    rule__TypeField__InstanceofTypesAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getInstanceofTypesAssignment_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:918:6: ( ( rule__TypeField__AllImplementedTypesAssignment_8 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:918:6: ( ( rule__TypeField__AllImplementedTypesAssignment_8 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:919:1: ( rule__TypeField__AllImplementedTypesAssignment_8 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getAllImplementedTypesAssignment_8()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:920:1: ( rule__TypeField__AllImplementedTypesAssignment_8 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:920:2: rule__TypeField__AllImplementedTypesAssignment_8
                    {
                    pushFollow(FOLLOW_rule__TypeField__AllImplementedTypesAssignment_8_in_rule__TypeField__Alternatives1979);
                    rule__TypeField__AllImplementedTypesAssignment_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getAllImplementedTypesAssignment_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:924:6: ( ( rule__TypeField__AllExtendedTypesAssignment_9 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:924:6: ( ( rule__TypeField__AllExtendedTypesAssignment_9 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:925:1: ( rule__TypeField__AllExtendedTypesAssignment_9 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getAllExtendedTypesAssignment_9()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:926:1: ( rule__TypeField__AllExtendedTypesAssignment_9 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:926:2: rule__TypeField__AllExtendedTypesAssignment_9
                    {
                    pushFollow(FOLLOW_rule__TypeField__AllExtendedTypesAssignment_9_in_rule__TypeField__Alternatives1997);
                    rule__TypeField__AllExtendedTypesAssignment_9();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getAllExtendedTypesAssignment_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:930:6: ( ( rule__TypeField__FieldTypeAssignment_10 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:930:6: ( ( rule__TypeField__FieldTypeAssignment_10 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:931:1: ( rule__TypeField__FieldTypeAssignment_10 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getFieldTypeAssignment_10()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:932:1: ( rule__TypeField__FieldTypeAssignment_10 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:932:2: rule__TypeField__FieldTypeAssignment_10
                    {
                    pushFollow(FOLLOW_rule__TypeField__FieldTypeAssignment_10_in_rule__TypeField__Alternatives2015);
                    rule__TypeField__FieldTypeAssignment_10();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getFieldTypeAssignment_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:936:6: ( ( rule__TypeField__CaughtTypeAssignment_11 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:936:6: ( ( rule__TypeField__CaughtTypeAssignment_11 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:937:1: ( rule__TypeField__CaughtTypeAssignment_11 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getCaughtTypeAssignment_11()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:938:1: ( rule__TypeField__CaughtTypeAssignment_11 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:938:2: rule__TypeField__CaughtTypeAssignment_11
                    {
                    pushFollow(FOLLOW_rule__TypeField__CaughtTypeAssignment_11_in_rule__TypeField__Alternatives2033);
                    rule__TypeField__CaughtTypeAssignment_11();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getCaughtTypeAssignment_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:942:6: ( ( rule__TypeField__DeclaredFieldTypesAssignment_12 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:942:6: ( ( rule__TypeField__DeclaredFieldTypesAssignment_12 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:943:1: ( rule__TypeField__DeclaredFieldTypesAssignment_12 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getDeclaredFieldTypesAssignment_12()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:944:1: ( rule__TypeField__DeclaredFieldTypesAssignment_12 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:944:2: rule__TypeField__DeclaredFieldTypesAssignment_12
                    {
                    pushFollow(FOLLOW_rule__TypeField__DeclaredFieldTypesAssignment_12_in_rule__TypeField__Alternatives2051);
                    rule__TypeField__DeclaredFieldTypesAssignment_12();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getDeclaredFieldTypesAssignment_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:948:6: ( ( rule__TypeField__DeclaringTypeAssignment_13 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:948:6: ( ( rule__TypeField__DeclaringTypeAssignment_13 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:949:1: ( rule__TypeField__DeclaringTypeAssignment_13 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getDeclaringTypeAssignment_13()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:950:1: ( rule__TypeField__DeclaringTypeAssignment_13 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:950:2: rule__TypeField__DeclaringTypeAssignment_13
                    {
                    pushFollow(FOLLOW_rule__TypeField__DeclaringTypeAssignment_13_in_rule__TypeField__Alternatives2069);
                    rule__TypeField__DeclaringTypeAssignment_13();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getDeclaringTypeAssignment_13()); 

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
    // $ANTLR end "rule__TypeField__Alternatives"


    // $ANTLR start "rule__MethodField__Alternatives"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:959:1: rule__MethodField__Alternatives : ( ( ( rule__MethodField__UsedMethodsAssignment_0 ) ) | ( ( rule__MethodField__UsedMethodsInTryAssignment_1 ) ) | ( ( rule__MethodField__UsedMethodsInFinallyAssignment_2 ) ) | ( ( rule__MethodField__OverriddenMethodsAssignment_3 ) ) );
    public final void rule__MethodField__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:963:1: ( ( ( rule__MethodField__UsedMethodsAssignment_0 ) ) | ( ( rule__MethodField__UsedMethodsInTryAssignment_1 ) ) | ( ( rule__MethodField__UsedMethodsInFinallyAssignment_2 ) ) | ( ( rule__MethodField__OverriddenMethodsAssignment_3 ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt5=1;
                }
                break;
            case 47:
                {
                alt5=2;
                }
                break;
            case 48:
                {
                alt5=3;
                }
                break;
            case 49:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:964:1: ( ( rule__MethodField__UsedMethodsAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:964:1: ( ( rule__MethodField__UsedMethodsAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:965:1: ( rule__MethodField__UsedMethodsAssignment_0 )
                    {
                     before(grammarAccess.getMethodFieldAccess().getUsedMethodsAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:966:1: ( rule__MethodField__UsedMethodsAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:966:2: rule__MethodField__UsedMethodsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__MethodField__UsedMethodsAssignment_0_in_rule__MethodField__Alternatives2102);
                    rule__MethodField__UsedMethodsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodFieldAccess().getUsedMethodsAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:970:6: ( ( rule__MethodField__UsedMethodsInTryAssignment_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:970:6: ( ( rule__MethodField__UsedMethodsInTryAssignment_1 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:971:1: ( rule__MethodField__UsedMethodsInTryAssignment_1 )
                    {
                     before(grammarAccess.getMethodFieldAccess().getUsedMethodsInTryAssignment_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:972:1: ( rule__MethodField__UsedMethodsInTryAssignment_1 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:972:2: rule__MethodField__UsedMethodsInTryAssignment_1
                    {
                    pushFollow(FOLLOW_rule__MethodField__UsedMethodsInTryAssignment_1_in_rule__MethodField__Alternatives2120);
                    rule__MethodField__UsedMethodsInTryAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodFieldAccess().getUsedMethodsInTryAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:976:6: ( ( rule__MethodField__UsedMethodsInFinallyAssignment_2 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:976:6: ( ( rule__MethodField__UsedMethodsInFinallyAssignment_2 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:977:1: ( rule__MethodField__UsedMethodsInFinallyAssignment_2 )
                    {
                     before(grammarAccess.getMethodFieldAccess().getUsedMethodsInFinallyAssignment_2()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:978:1: ( rule__MethodField__UsedMethodsInFinallyAssignment_2 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:978:2: rule__MethodField__UsedMethodsInFinallyAssignment_2
                    {
                    pushFollow(FOLLOW_rule__MethodField__UsedMethodsInFinallyAssignment_2_in_rule__MethodField__Alternatives2138);
                    rule__MethodField__UsedMethodsInFinallyAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodFieldAccess().getUsedMethodsInFinallyAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:982:6: ( ( rule__MethodField__OverriddenMethodsAssignment_3 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:982:6: ( ( rule__MethodField__OverriddenMethodsAssignment_3 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:983:1: ( rule__MethodField__OverriddenMethodsAssignment_3 )
                    {
                     before(grammarAccess.getMethodFieldAccess().getOverriddenMethodsAssignment_3()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:984:1: ( rule__MethodField__OverriddenMethodsAssignment_3 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:984:2: rule__MethodField__OverriddenMethodsAssignment_3
                    {
                    pushFollow(FOLLOW_rule__MethodField__OverriddenMethodsAssignment_3_in_rule__MethodField__Alternatives2156);
                    rule__MethodField__OverriddenMethodsAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodFieldAccess().getOverriddenMethodsAssignment_3()); 

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
    // $ANTLR end "rule__MethodField__Alternatives"


    // $ANTLR start "rule__SimpleField__Alternatives"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:993:1: rule__SimpleField__Alternatives : ( ( ( rule__SimpleField__FullyQualifiedNameAssignment_0 ) ) | ( ( rule__SimpleField__FriendlyNameAssignment_1 ) ) | ( ( rule__SimpleField__DeclaredMethodsAssignment_2 ) ) | ( ( rule__SimpleField__ReturnVariableEexpressionsAssignment_3 ) ) | ( ( rule__SimpleField__AllDeclaredMethodNamesAssignment_4 ) ) | ( ( rule__SimpleField__DeclaredMethodNamesAssignment_5 ) ) | ( ( rule__SimpleField__DeclaredFieldNamesAssignment_6 ) ) | ( ( rule__SimpleField__AllDeclaredFieldNamesAssignment_7 ) ) | ( ( rule__SimpleField__FullTextAssignment_8 ) ) | ( ( rule__SimpleField__FieldsReadAssignment_9 ) ) | ( ( rule__SimpleField__FieldsWrittenAssignment_10 ) ) | ( ( rule__SimpleField__UsedFieldsInFinallyAssignment_11 ) ) | ( ( rule__SimpleField__UsedFieldsInTryAssignment_12 ) ) );
    public final void rule__SimpleField__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:997:1: ( ( ( rule__SimpleField__FullyQualifiedNameAssignment_0 ) ) | ( ( rule__SimpleField__FriendlyNameAssignment_1 ) ) | ( ( rule__SimpleField__DeclaredMethodsAssignment_2 ) ) | ( ( rule__SimpleField__ReturnVariableEexpressionsAssignment_3 ) ) | ( ( rule__SimpleField__AllDeclaredMethodNamesAssignment_4 ) ) | ( ( rule__SimpleField__DeclaredMethodNamesAssignment_5 ) ) | ( ( rule__SimpleField__DeclaredFieldNamesAssignment_6 ) ) | ( ( rule__SimpleField__AllDeclaredFieldNamesAssignment_7 ) ) | ( ( rule__SimpleField__FullTextAssignment_8 ) ) | ( ( rule__SimpleField__FieldsReadAssignment_9 ) ) | ( ( rule__SimpleField__FieldsWrittenAssignment_10 ) ) | ( ( rule__SimpleField__UsedFieldsInFinallyAssignment_11 ) ) | ( ( rule__SimpleField__UsedFieldsInTryAssignment_12 ) ) )
            int alt6=13;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt6=1;
                }
                break;
            case 58:
                {
                alt6=2;
                }
                break;
            case 59:
                {
                alt6=3;
                }
                break;
            case 60:
                {
                alt6=4;
                }
                break;
            case 61:
                {
                alt6=5;
                }
                break;
            case 62:
                {
                alt6=6;
                }
                break;
            case 63:
                {
                alt6=7;
                }
                break;
            case 64:
                {
                alt6=8;
                }
                break;
            case 65:
                {
                alt6=9;
                }
                break;
            case 66:
                {
                alt6=10;
                }
                break;
            case 67:
                {
                alt6=11;
                }
                break;
            case 68:
                {
                alt6=12;
                }
                break;
            case 69:
                {
                alt6=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:998:1: ( ( rule__SimpleField__FullyQualifiedNameAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:998:1: ( ( rule__SimpleField__FullyQualifiedNameAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:999:1: ( rule__SimpleField__FullyQualifiedNameAssignment_0 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getFullyQualifiedNameAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1000:1: ( rule__SimpleField__FullyQualifiedNameAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1000:2: rule__SimpleField__FullyQualifiedNameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SimpleField__FullyQualifiedNameAssignment_0_in_rule__SimpleField__Alternatives2189);
                    rule__SimpleField__FullyQualifiedNameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getFullyQualifiedNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1004:6: ( ( rule__SimpleField__FriendlyNameAssignment_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1004:6: ( ( rule__SimpleField__FriendlyNameAssignment_1 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1005:1: ( rule__SimpleField__FriendlyNameAssignment_1 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getFriendlyNameAssignment_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1006:1: ( rule__SimpleField__FriendlyNameAssignment_1 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1006:2: rule__SimpleField__FriendlyNameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SimpleField__FriendlyNameAssignment_1_in_rule__SimpleField__Alternatives2207);
                    rule__SimpleField__FriendlyNameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getFriendlyNameAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1010:6: ( ( rule__SimpleField__DeclaredMethodsAssignment_2 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1010:6: ( ( rule__SimpleField__DeclaredMethodsAssignment_2 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1011:1: ( rule__SimpleField__DeclaredMethodsAssignment_2 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getDeclaredMethodsAssignment_2()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1012:1: ( rule__SimpleField__DeclaredMethodsAssignment_2 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1012:2: rule__SimpleField__DeclaredMethodsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SimpleField__DeclaredMethodsAssignment_2_in_rule__SimpleField__Alternatives2225);
                    rule__SimpleField__DeclaredMethodsAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getDeclaredMethodsAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1016:6: ( ( rule__SimpleField__ReturnVariableEexpressionsAssignment_3 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1016:6: ( ( rule__SimpleField__ReturnVariableEexpressionsAssignment_3 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1017:1: ( rule__SimpleField__ReturnVariableEexpressionsAssignment_3 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getReturnVariableEexpressionsAssignment_3()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1018:1: ( rule__SimpleField__ReturnVariableEexpressionsAssignment_3 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1018:2: rule__SimpleField__ReturnVariableEexpressionsAssignment_3
                    {
                    pushFollow(FOLLOW_rule__SimpleField__ReturnVariableEexpressionsAssignment_3_in_rule__SimpleField__Alternatives2243);
                    rule__SimpleField__ReturnVariableEexpressionsAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getReturnVariableEexpressionsAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1022:6: ( ( rule__SimpleField__AllDeclaredMethodNamesAssignment_4 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1022:6: ( ( rule__SimpleField__AllDeclaredMethodNamesAssignment_4 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1023:1: ( rule__SimpleField__AllDeclaredMethodNamesAssignment_4 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getAllDeclaredMethodNamesAssignment_4()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1024:1: ( rule__SimpleField__AllDeclaredMethodNamesAssignment_4 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1024:2: rule__SimpleField__AllDeclaredMethodNamesAssignment_4
                    {
                    pushFollow(FOLLOW_rule__SimpleField__AllDeclaredMethodNamesAssignment_4_in_rule__SimpleField__Alternatives2261);
                    rule__SimpleField__AllDeclaredMethodNamesAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getAllDeclaredMethodNamesAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1028:6: ( ( rule__SimpleField__DeclaredMethodNamesAssignment_5 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1028:6: ( ( rule__SimpleField__DeclaredMethodNamesAssignment_5 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1029:1: ( rule__SimpleField__DeclaredMethodNamesAssignment_5 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getDeclaredMethodNamesAssignment_5()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1030:1: ( rule__SimpleField__DeclaredMethodNamesAssignment_5 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1030:2: rule__SimpleField__DeclaredMethodNamesAssignment_5
                    {
                    pushFollow(FOLLOW_rule__SimpleField__DeclaredMethodNamesAssignment_5_in_rule__SimpleField__Alternatives2279);
                    rule__SimpleField__DeclaredMethodNamesAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getDeclaredMethodNamesAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1034:6: ( ( rule__SimpleField__DeclaredFieldNamesAssignment_6 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1034:6: ( ( rule__SimpleField__DeclaredFieldNamesAssignment_6 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1035:1: ( rule__SimpleField__DeclaredFieldNamesAssignment_6 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getDeclaredFieldNamesAssignment_6()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1036:1: ( rule__SimpleField__DeclaredFieldNamesAssignment_6 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1036:2: rule__SimpleField__DeclaredFieldNamesAssignment_6
                    {
                    pushFollow(FOLLOW_rule__SimpleField__DeclaredFieldNamesAssignment_6_in_rule__SimpleField__Alternatives2297);
                    rule__SimpleField__DeclaredFieldNamesAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getDeclaredFieldNamesAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1040:6: ( ( rule__SimpleField__AllDeclaredFieldNamesAssignment_7 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1040:6: ( ( rule__SimpleField__AllDeclaredFieldNamesAssignment_7 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1041:1: ( rule__SimpleField__AllDeclaredFieldNamesAssignment_7 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getAllDeclaredFieldNamesAssignment_7()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1042:1: ( rule__SimpleField__AllDeclaredFieldNamesAssignment_7 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1042:2: rule__SimpleField__AllDeclaredFieldNamesAssignment_7
                    {
                    pushFollow(FOLLOW_rule__SimpleField__AllDeclaredFieldNamesAssignment_7_in_rule__SimpleField__Alternatives2315);
                    rule__SimpleField__AllDeclaredFieldNamesAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getAllDeclaredFieldNamesAssignment_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1046:6: ( ( rule__SimpleField__FullTextAssignment_8 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1046:6: ( ( rule__SimpleField__FullTextAssignment_8 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1047:1: ( rule__SimpleField__FullTextAssignment_8 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getFullTextAssignment_8()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1048:1: ( rule__SimpleField__FullTextAssignment_8 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1048:2: rule__SimpleField__FullTextAssignment_8
                    {
                    pushFollow(FOLLOW_rule__SimpleField__FullTextAssignment_8_in_rule__SimpleField__Alternatives2333);
                    rule__SimpleField__FullTextAssignment_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getFullTextAssignment_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1052:6: ( ( rule__SimpleField__FieldsReadAssignment_9 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1052:6: ( ( rule__SimpleField__FieldsReadAssignment_9 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1053:1: ( rule__SimpleField__FieldsReadAssignment_9 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getFieldsReadAssignment_9()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1054:1: ( rule__SimpleField__FieldsReadAssignment_9 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1054:2: rule__SimpleField__FieldsReadAssignment_9
                    {
                    pushFollow(FOLLOW_rule__SimpleField__FieldsReadAssignment_9_in_rule__SimpleField__Alternatives2351);
                    rule__SimpleField__FieldsReadAssignment_9();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getFieldsReadAssignment_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1058:6: ( ( rule__SimpleField__FieldsWrittenAssignment_10 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1058:6: ( ( rule__SimpleField__FieldsWrittenAssignment_10 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1059:1: ( rule__SimpleField__FieldsWrittenAssignment_10 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getFieldsWrittenAssignment_10()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1060:1: ( rule__SimpleField__FieldsWrittenAssignment_10 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1060:2: rule__SimpleField__FieldsWrittenAssignment_10
                    {
                    pushFollow(FOLLOW_rule__SimpleField__FieldsWrittenAssignment_10_in_rule__SimpleField__Alternatives2369);
                    rule__SimpleField__FieldsWrittenAssignment_10();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getFieldsWrittenAssignment_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1064:6: ( ( rule__SimpleField__UsedFieldsInFinallyAssignment_11 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1064:6: ( ( rule__SimpleField__UsedFieldsInFinallyAssignment_11 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1065:1: ( rule__SimpleField__UsedFieldsInFinallyAssignment_11 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getUsedFieldsInFinallyAssignment_11()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1066:1: ( rule__SimpleField__UsedFieldsInFinallyAssignment_11 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1066:2: rule__SimpleField__UsedFieldsInFinallyAssignment_11
                    {
                    pushFollow(FOLLOW_rule__SimpleField__UsedFieldsInFinallyAssignment_11_in_rule__SimpleField__Alternatives2387);
                    rule__SimpleField__UsedFieldsInFinallyAssignment_11();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getUsedFieldsInFinallyAssignment_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1070:6: ( ( rule__SimpleField__UsedFieldsInTryAssignment_12 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1070:6: ( ( rule__SimpleField__UsedFieldsInTryAssignment_12 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1071:1: ( rule__SimpleField__UsedFieldsInTryAssignment_12 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getUsedFieldsInTryAssignment_12()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1072:1: ( rule__SimpleField__UsedFieldsInTryAssignment_12 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1072:2: rule__SimpleField__UsedFieldsInTryAssignment_12
                    {
                    pushFollow(FOLLOW_rule__SimpleField__UsedFieldsInTryAssignment_12_in_rule__SimpleField__Alternatives2405);
                    rule__SimpleField__UsedFieldsInTryAssignment_12();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getUsedFieldsInTryAssignment_12()); 

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
    // $ANTLR end "rule__SimpleField__Alternatives"


    // $ANTLR start "rule__ModifierFieldValue__Alternatives"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1081:1: rule__ModifierFieldValue__Alternatives : ( ( 'private' ) | ( 'public' ) | ( 'static' ) | ( 'final' ) | ( 'abstract' ) | ( 'protected' ) );
    public final void rule__ModifierFieldValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1085:1: ( ( 'private' ) | ( 'public' ) | ( 'static' ) | ( 'final' ) | ( 'abstract' ) | ( 'protected' ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 15:
                {
                alt7=3;
                }
                break;
            case 16:
                {
                alt7=4;
                }
                break;
            case 17:
                {
                alt7=5;
                }
                break;
            case 18:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1086:1: ( 'private' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1086:1: ( 'private' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1087:1: 'private'
                    {
                     before(grammarAccess.getModifierFieldValueAccess().getPrivateKeyword_0()); 
                    match(input,13,FOLLOW_13_in_rule__ModifierFieldValue__Alternatives2439); 
                     after(grammarAccess.getModifierFieldValueAccess().getPrivateKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1094:6: ( 'public' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1094:6: ( 'public' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1095:1: 'public'
                    {
                     before(grammarAccess.getModifierFieldValueAccess().getPublicKeyword_1()); 
                    match(input,14,FOLLOW_14_in_rule__ModifierFieldValue__Alternatives2459); 
                     after(grammarAccess.getModifierFieldValueAccess().getPublicKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1102:6: ( 'static' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1102:6: ( 'static' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1103:1: 'static'
                    {
                     before(grammarAccess.getModifierFieldValueAccess().getStaticKeyword_2()); 
                    match(input,15,FOLLOW_15_in_rule__ModifierFieldValue__Alternatives2479); 
                     after(grammarAccess.getModifierFieldValueAccess().getStaticKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1110:6: ( 'final' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1110:6: ( 'final' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1111:1: 'final'
                    {
                     before(grammarAccess.getModifierFieldValueAccess().getFinalKeyword_3()); 
                    match(input,16,FOLLOW_16_in_rule__ModifierFieldValue__Alternatives2499); 
                     after(grammarAccess.getModifierFieldValueAccess().getFinalKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1118:6: ( 'abstract' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1118:6: ( 'abstract' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1119:1: 'abstract'
                    {
                     before(grammarAccess.getModifierFieldValueAccess().getAbstractKeyword_4()); 
                    match(input,17,FOLLOW_17_in_rule__ModifierFieldValue__Alternatives2519); 
                     after(grammarAccess.getModifierFieldValueAccess().getAbstractKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1126:6: ( 'protected' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1126:6: ( 'protected' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1127:1: 'protected'
                    {
                     before(grammarAccess.getModifierFieldValueAccess().getProtectedKeyword_5()); 
                    match(input,18,FOLLOW_18_in_rule__ModifierFieldValue__Alternatives2539); 
                     after(grammarAccess.getModifierFieldValueAccess().getProtectedKeyword_5()); 

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
    // $ANTLR end "rule__ModifierFieldValue__Alternatives"


    // $ANTLR start "rule__DocumentTypeFieldValue__Alternatives"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1139:1: rule__DocumentTypeFieldValue__Alternatives : ( ( 'class' ) | ( 'method' ) | ( 'field' ) | ( 'trycatch' ) );
    public final void rule__DocumentTypeFieldValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1143:1: ( ( 'class' ) | ( 'method' ) | ( 'field' ) | ( 'trycatch' ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 21:
                {
                alt8=3;
                }
                break;
            case 22:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1144:1: ( 'class' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1144:1: ( 'class' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1145:1: 'class'
                    {
                     before(grammarAccess.getDocumentTypeFieldValueAccess().getClassKeyword_0()); 
                    match(input,19,FOLLOW_19_in_rule__DocumentTypeFieldValue__Alternatives2574); 
                     after(grammarAccess.getDocumentTypeFieldValueAccess().getClassKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1152:6: ( 'method' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1152:6: ( 'method' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1153:1: 'method'
                    {
                     before(grammarAccess.getDocumentTypeFieldValueAccess().getMethodKeyword_1()); 
                    match(input,20,FOLLOW_20_in_rule__DocumentTypeFieldValue__Alternatives2594); 
                     after(grammarAccess.getDocumentTypeFieldValueAccess().getMethodKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1160:6: ( 'field' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1160:6: ( 'field' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1161:1: 'field'
                    {
                     before(grammarAccess.getDocumentTypeFieldValueAccess().getFieldKeyword_2()); 
                    match(input,21,FOLLOW_21_in_rule__DocumentTypeFieldValue__Alternatives2614); 
                     after(grammarAccess.getDocumentTypeFieldValueAccess().getFieldKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1168:6: ( 'trycatch' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1168:6: ( 'trycatch' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1169:1: 'trycatch'
                    {
                     before(grammarAccess.getDocumentTypeFieldValueAccess().getTrycatchKeyword_3()); 
                    match(input,22,FOLLOW_22_in_rule__DocumentTypeFieldValue__Alternatives2634); 
                     after(grammarAccess.getDocumentTypeFieldValueAccess().getTrycatchKeyword_3()); 

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
    // $ANTLR end "rule__DocumentTypeFieldValue__Alternatives"


    // $ANTLR start "rule__UnaryExpression__Alternatives"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1181:1: rule__UnaryExpression__Alternatives : ( ( '-' ) | ( 'NOT' ) | ( '!' ) | ( '+' ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1185:1: ( ( '-' ) | ( 'NOT' ) | ( '!' ) | ( '+' ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt9=1;
                }
                break;
            case 24:
                {
                alt9=2;
                }
                break;
            case 25:
                {
                alt9=3;
                }
                break;
            case 26:
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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1186:1: ( '-' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1186:1: ( '-' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1187:1: '-'
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getHyphenMinusKeyword_0()); 
                    match(input,23,FOLLOW_23_in_rule__UnaryExpression__Alternatives2669); 
                     after(grammarAccess.getUnaryExpressionAccess().getHyphenMinusKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1194:6: ( 'NOT' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1194:6: ( 'NOT' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1195:1: 'NOT'
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getNOTKeyword_1()); 
                    match(input,24,FOLLOW_24_in_rule__UnaryExpression__Alternatives2689); 
                     after(grammarAccess.getUnaryExpressionAccess().getNOTKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1202:6: ( '!' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1202:6: ( '!' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1203:1: '!'
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getExclamationMarkKeyword_2()); 
                    match(input,25,FOLLOW_25_in_rule__UnaryExpression__Alternatives2709); 
                     after(grammarAccess.getUnaryExpressionAccess().getExclamationMarkKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1210:6: ( '+' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1210:6: ( '+' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1211:1: '+'
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getPlusSignKeyword_3()); 
                    match(input,26,FOLLOW_26_in_rule__UnaryExpression__Alternatives2729); 
                     after(grammarAccess.getUnaryExpressionAccess().getPlusSignKeyword_3()); 

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
    // $ANTLR end "rule__UnaryExpression__Alternatives"


    // $ANTLR start "rule__BinaryExp__Alternatives"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1223:1: rule__BinaryExp__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__BinaryExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1227:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            else if ( (LA10_0==28) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1228:1: ( ( 'AND' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1228:1: ( ( 'AND' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1229:1: ( 'AND' )
                    {
                     before(grammarAccess.getBinaryExpAccess().getAnd1EnumLiteralDeclaration_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1230:1: ( 'AND' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1230:3: 'AND'
                    {
                    match(input,27,FOLLOW_27_in_rule__BinaryExp__Alternatives2764); 

                    }

                     after(grammarAccess.getBinaryExpAccess().getAnd1EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1235:6: ( ( 'OR' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1235:6: ( ( 'OR' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1236:1: ( 'OR' )
                    {
                     before(grammarAccess.getBinaryExpAccess().getOr1EnumLiteralDeclaration_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1237:1: ( 'OR' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1237:3: 'OR'
                    {
                    match(input,28,FOLLOW_28_in_rule__BinaryExp__Alternatives2785); 

                    }

                     after(grammarAccess.getBinaryExpAccess().getOr1EnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__BinaryExp__Alternatives"


    // $ANTLR start "rule__Exp1__Group__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1249:1: rule__Exp1__Group__0 : rule__Exp1__Group__0__Impl rule__Exp1__Group__1 ;
    public final void rule__Exp1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1253:1: ( rule__Exp1__Group__0__Impl rule__Exp1__Group__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1254:2: rule__Exp1__Group__0__Impl rule__Exp1__Group__1
            {
            pushFollow(FOLLOW_rule__Exp1__Group__0__Impl_in_rule__Exp1__Group__02818);
            rule__Exp1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp1__Group__1_in_rule__Exp1__Group__02821);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1261:1: rule__Exp1__Group__0__Impl : ( ruleExp2 ) ;
    public final void rule__Exp1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1265:1: ( ( ruleExp2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1266:1: ( ruleExp2 )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1266:1: ( ruleExp2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1267:1: ruleExp2
            {
             before(grammarAccess.getExp1Access().getExp2ParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleExp2_in_rule__Exp1__Group__0__Impl2848);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1278:1: rule__Exp1__Group__1 : rule__Exp1__Group__1__Impl ;
    public final void rule__Exp1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1282:1: ( rule__Exp1__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1283:2: rule__Exp1__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Exp1__Group__1__Impl_in_rule__Exp1__Group__12877);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1289:1: rule__Exp1__Group__1__Impl : ( ( rule__Exp1__Group_1__0 )? ) ;
    public final void rule__Exp1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1293:1: ( ( ( rule__Exp1__Group_1__0 )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1294:1: ( ( rule__Exp1__Group_1__0 )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1294:1: ( ( rule__Exp1__Group_1__0 )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1295:1: ( rule__Exp1__Group_1__0 )?
            {
             before(grammarAccess.getExp1Access().getGroup_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1296:1: ( rule__Exp1__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_NAMEWITHWC||(LA11_0>=23 && LA11_0<=29)||(LA11_0>=32 && LA11_0<=69)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1296:2: rule__Exp1__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Exp1__Group_1__0_in_rule__Exp1__Group__1__Impl2904);
                    rule__Exp1__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1310:1: rule__Exp1__Group_1__0 : rule__Exp1__Group_1__0__Impl rule__Exp1__Group_1__1 ;
    public final void rule__Exp1__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1314:1: ( rule__Exp1__Group_1__0__Impl rule__Exp1__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1315:2: rule__Exp1__Group_1__0__Impl rule__Exp1__Group_1__1
            {
            pushFollow(FOLLOW_rule__Exp1__Group_1__0__Impl_in_rule__Exp1__Group_1__02939);
            rule__Exp1__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp1__Group_1__1_in_rule__Exp1__Group_1__02942);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1322:1: rule__Exp1__Group_1__0__Impl : ( () ) ;
    public final void rule__Exp1__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1326:1: ( ( () ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1327:1: ( () )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1327:1: ( () )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1328:1: ()
            {
             before(grammarAccess.getExp1Access().getExp1LeftAction_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1329:1: ()
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1331:1: 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1341:1: rule__Exp1__Group_1__1 : rule__Exp1__Group_1__1__Impl rule__Exp1__Group_1__2 ;
    public final void rule__Exp1__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1345:1: ( rule__Exp1__Group_1__1__Impl rule__Exp1__Group_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1346:2: rule__Exp1__Group_1__1__Impl rule__Exp1__Group_1__2
            {
            pushFollow(FOLLOW_rule__Exp1__Group_1__1__Impl_in_rule__Exp1__Group_1__13000);
            rule__Exp1__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp1__Group_1__2_in_rule__Exp1__Group_1__13003);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1353:1: rule__Exp1__Group_1__1__Impl : ( ( rule__Exp1__BAssignment_1_1 )? ) ;
    public final void rule__Exp1__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1357:1: ( ( ( rule__Exp1__BAssignment_1_1 )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1358:1: ( ( rule__Exp1__BAssignment_1_1 )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1358:1: ( ( rule__Exp1__BAssignment_1_1 )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1359:1: ( rule__Exp1__BAssignment_1_1 )?
            {
             before(grammarAccess.getExp1Access().getBAssignment_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1360:1: ( rule__Exp1__BAssignment_1_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=27 && LA12_0<=28)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1360:2: rule__Exp1__BAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Exp1__BAssignment_1_1_in_rule__Exp1__Group_1__1__Impl3030);
                    rule__Exp1__BAssignment_1_1();

                    state._fsp--;


                    }
                    break;

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1370:1: rule__Exp1__Group_1__2 : rule__Exp1__Group_1__2__Impl ;
    public final void rule__Exp1__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1374:1: ( rule__Exp1__Group_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1375:2: rule__Exp1__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Exp1__Group_1__2__Impl_in_rule__Exp1__Group_1__23061);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1381:1: rule__Exp1__Group_1__2__Impl : ( ( rule__Exp1__RightAssignment_1_2 ) ) ;
    public final void rule__Exp1__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1385:1: ( ( ( rule__Exp1__RightAssignment_1_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1386:1: ( ( rule__Exp1__RightAssignment_1_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1386:1: ( ( rule__Exp1__RightAssignment_1_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1387:1: ( rule__Exp1__RightAssignment_1_2 )
            {
             before(grammarAccess.getExp1Access().getRightAssignment_1_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1388:1: ( rule__Exp1__RightAssignment_1_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1388:2: rule__Exp1__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Exp1__RightAssignment_1_2_in_rule__Exp1__Group_1__2__Impl3088);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1404:1: rule__Exp2__Group_1__0 : rule__Exp2__Group_1__0__Impl rule__Exp2__Group_1__1 ;
    public final void rule__Exp2__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1408:1: ( rule__Exp2__Group_1__0__Impl rule__Exp2__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1409:2: rule__Exp2__Group_1__0__Impl rule__Exp2__Group_1__1
            {
            pushFollow(FOLLOW_rule__Exp2__Group_1__0__Impl_in_rule__Exp2__Group_1__03124);
            rule__Exp2__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp2__Group_1__1_in_rule__Exp2__Group_1__03127);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1416:1: rule__Exp2__Group_1__0__Impl : ( ( ruleUnaryExpression )? ) ;
    public final void rule__Exp2__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1420:1: ( ( ( ruleUnaryExpression )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1421:1: ( ( ruleUnaryExpression )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1421:1: ( ( ruleUnaryExpression )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1422:1: ( ruleUnaryExpression )?
            {
             before(grammarAccess.getExp2Access().getUnaryExpressionParserRuleCall_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1423:1: ( ruleUnaryExpression )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=23 && LA13_0<=26)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1423:3: ruleUnaryExpression
                    {
                    pushFollow(FOLLOW_ruleUnaryExpression_in_rule__Exp2__Group_1__0__Impl3155);
                    ruleUnaryExpression();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExp2Access().getUnaryExpressionParserRuleCall_1_0()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1433:1: rule__Exp2__Group_1__1 : rule__Exp2__Group_1__1__Impl rule__Exp2__Group_1__2 ;
    public final void rule__Exp2__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1437:1: ( rule__Exp2__Group_1__1__Impl rule__Exp2__Group_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1438:2: rule__Exp2__Group_1__1__Impl rule__Exp2__Group_1__2
            {
            pushFollow(FOLLOW_rule__Exp2__Group_1__1__Impl_in_rule__Exp2__Group_1__13186);
            rule__Exp2__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp2__Group_1__2_in_rule__Exp2__Group_1__13189);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1445:1: rule__Exp2__Group_1__1__Impl : ( '(' ) ;
    public final void rule__Exp2__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1449:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1450:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1450:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1451:1: '('
            {
             before(grammarAccess.getExp2Access().getLeftParenthesisKeyword_1_1()); 
            match(input,29,FOLLOW_29_in_rule__Exp2__Group_1__1__Impl3217); 
             after(grammarAccess.getExp2Access().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1464:1: rule__Exp2__Group_1__2 : rule__Exp2__Group_1__2__Impl rule__Exp2__Group_1__3 ;
    public final void rule__Exp2__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1468:1: ( rule__Exp2__Group_1__2__Impl rule__Exp2__Group_1__3 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1469:2: rule__Exp2__Group_1__2__Impl rule__Exp2__Group_1__3
            {
            pushFollow(FOLLOW_rule__Exp2__Group_1__2__Impl_in_rule__Exp2__Group_1__23248);
            rule__Exp2__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp2__Group_1__3_in_rule__Exp2__Group_1__23251);
            rule__Exp2__Group_1__3();

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1476:1: rule__Exp2__Group_1__2__Impl : ( ruleExp1 ) ;
    public final void rule__Exp2__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1480:1: ( ( ruleExp1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1481:1: ( ruleExp1 )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1481:1: ( ruleExp1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1482:1: ruleExp1
            {
             before(grammarAccess.getExp2Access().getExp1ParserRuleCall_1_2()); 
            pushFollow(FOLLOW_ruleExp1_in_rule__Exp2__Group_1__2__Impl3278);
            ruleExp1();

            state._fsp--;

             after(grammarAccess.getExp2Access().getExp1ParserRuleCall_1_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Exp2__Group_1__3"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1493:1: rule__Exp2__Group_1__3 : rule__Exp2__Group_1__3__Impl ;
    public final void rule__Exp2__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1497:1: ( rule__Exp2__Group_1__3__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1498:2: rule__Exp2__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Exp2__Group_1__3__Impl_in_rule__Exp2__Group_1__33307);
            rule__Exp2__Group_1__3__Impl();

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
    // $ANTLR end "rule__Exp2__Group_1__3"


    // $ANTLR start "rule__Exp2__Group_1__3__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1504:1: rule__Exp2__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Exp2__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1508:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1509:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1509:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1510:1: ')'
            {
             before(grammarAccess.getExp2Access().getRightParenthesisKeyword_1_3()); 
            match(input,30,FOLLOW_30_in_rule__Exp2__Group_1__3__Impl3335); 
             after(grammarAccess.getExp2Access().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp2__Group_1__3__Impl"


    // $ANTLR start "rule__ClauseExpression__Group__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1531:1: rule__ClauseExpression__Group__0 : rule__ClauseExpression__Group__0__Impl rule__ClauseExpression__Group__1 ;
    public final void rule__ClauseExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1535:1: ( rule__ClauseExpression__Group__0__Impl rule__ClauseExpression__Group__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1536:2: rule__ClauseExpression__Group__0__Impl rule__ClauseExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group__0__Impl_in_rule__ClauseExpression__Group__03374);
            rule__ClauseExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group__1_in_rule__ClauseExpression__Group__03377);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1543:1: rule__ClauseExpression__Group__0__Impl : ( ( ruleUnaryExpression )? ) ;
    public final void rule__ClauseExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1547:1: ( ( ( ruleUnaryExpression )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1548:1: ( ( ruleUnaryExpression )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1548:1: ( ( ruleUnaryExpression )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1549:1: ( ruleUnaryExpression )?
            {
             before(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1550:1: ( ruleUnaryExpression )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=23 && LA14_0<=26)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1550:3: ruleUnaryExpression
                    {
                    pushFollow(FOLLOW_ruleUnaryExpression_in_rule__ClauseExpression__Group__0__Impl3405);
                    ruleUnaryExpression();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_0()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1560:1: rule__ClauseExpression__Group__1 : rule__ClauseExpression__Group__1__Impl ;
    public final void rule__ClauseExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1564:1: ( rule__ClauseExpression__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1565:2: rule__ClauseExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group__1__Impl_in_rule__ClauseExpression__Group__13436);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1571:1: rule__ClauseExpression__Group__1__Impl : ( ( rule__ClauseExpression__Alternatives_1 ) ) ;
    public final void rule__ClauseExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1575:1: ( ( ( rule__ClauseExpression__Alternatives_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1576:1: ( ( rule__ClauseExpression__Alternatives_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1576:1: ( ( rule__ClauseExpression__Alternatives_1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1577:1: ( rule__ClauseExpression__Alternatives_1 )
            {
             before(grammarAccess.getClauseExpressionAccess().getAlternatives_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1578:1: ( rule__ClauseExpression__Alternatives_1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1578:2: rule__ClauseExpression__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Alternatives_1_in_rule__ClauseExpression__Group__1__Impl3463);
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


    // $ANTLR start "rule__ClauseExpression__Group_1_1_0__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1592:1: rule__ClauseExpression__Group_1_1_0__0 : rule__ClauseExpression__Group_1_1_0__0__Impl rule__ClauseExpression__Group_1_1_0__1 ;
    public final void rule__ClauseExpression__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1596:1: ( rule__ClauseExpression__Group_1_1_0__0__Impl rule__ClauseExpression__Group_1_1_0__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1597:2: rule__ClauseExpression__Group_1_1_0__0__Impl rule__ClauseExpression__Group_1_1_0__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_0__0__Impl_in_rule__ClauseExpression__Group_1_1_0__03497);
            rule__ClauseExpression__Group_1_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_0__1_in_rule__ClauseExpression__Group_1_1_0__03500);
            rule__ClauseExpression__Group_1_1_0__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_0__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_0__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1604:1: rule__ClauseExpression__Group_1_1_0__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_1_0_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1608:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_1_0_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1609:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_0_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1609:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_0_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1610:1: ( rule__ClauseExpression__FieldAssignment_1_1_0_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_0_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1611:1: ( rule__ClauseExpression__FieldAssignment_1_1_0_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1611:2: rule__ClauseExpression__FieldAssignment_1_1_0_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_0_0_in_rule__ClauseExpression__Group_1_1_0__0__Impl3527);
            rule__ClauseExpression__FieldAssignment_1_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_0__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_0__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1621:1: rule__ClauseExpression__Group_1_1_0__1 : rule__ClauseExpression__Group_1_1_0__1__Impl rule__ClauseExpression__Group_1_1_0__2 ;
    public final void rule__ClauseExpression__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1625:1: ( rule__ClauseExpression__Group_1_1_0__1__Impl rule__ClauseExpression__Group_1_1_0__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1626:2: rule__ClauseExpression__Group_1_1_0__1__Impl rule__ClauseExpression__Group_1_1_0__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_0__1__Impl_in_rule__ClauseExpression__Group_1_1_0__13557);
            rule__ClauseExpression__Group_1_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_0__2_in_rule__ClauseExpression__Group_1_1_0__13560);
            rule__ClauseExpression__Group_1_1_0__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_0__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_0__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1633:1: rule__ClauseExpression__Group_1_1_0__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1637:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1638:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1638:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1639:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_0_1()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_1_0__1__Impl3588); 
             after(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_0__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_0__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1652:1: rule__ClauseExpression__Group_1_1_0__2 : rule__ClauseExpression__Group_1_1_0__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1656:1: ( rule__ClauseExpression__Group_1_1_0__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1657:2: rule__ClauseExpression__Group_1_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_0__2__Impl_in_rule__ClauseExpression__Group_1_1_0__23619);
            rule__ClauseExpression__Group_1_1_0__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_0__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_0__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1663:1: rule__ClauseExpression__Group_1_1_0__2__Impl : ( ( rule__ClauseExpression__ValueAssignment_1_1_0_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1667:1: ( ( ( rule__ClauseExpression__ValueAssignment_1_1_0_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1668:1: ( ( rule__ClauseExpression__ValueAssignment_1_1_0_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1668:1: ( ( rule__ClauseExpression__ValueAssignment_1_1_0_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1669:1: ( rule__ClauseExpression__ValueAssignment_1_1_0_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_1_0_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1670:1: ( rule__ClauseExpression__ValueAssignment_1_1_0_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1670:2: rule__ClauseExpression__ValueAssignment_1_1_0_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValueAssignment_1_1_0_2_in_rule__ClauseExpression__Group_1_1_0__2__Impl3646);
            rule__ClauseExpression__ValueAssignment_1_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_0__2__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1686:1: rule__ClauseExpression__Group_1_1_1__0 : rule__ClauseExpression__Group_1_1_1__0__Impl rule__ClauseExpression__Group_1_1_1__1 ;
    public final void rule__ClauseExpression__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1690:1: ( rule__ClauseExpression__Group_1_1_1__0__Impl rule__ClauseExpression__Group_1_1_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1691:2: rule__ClauseExpression__Group_1_1_1__0__Impl rule__ClauseExpression__Group_1_1_1__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_1__0__Impl_in_rule__ClauseExpression__Group_1_1_1__03682);
            rule__ClauseExpression__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_1__1_in_rule__ClauseExpression__Group_1_1_1__03685);
            rule__ClauseExpression__Group_1_1_1__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_1__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1698:1: rule__ClauseExpression__Group_1_1_1__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_1_1_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1702:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_1_1_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1703:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_1_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1703:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_1_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1704:1: ( rule__ClauseExpression__FieldAssignment_1_1_1_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1705:1: ( rule__ClauseExpression__FieldAssignment_1_1_1_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1705:2: rule__ClauseExpression__FieldAssignment_1_1_1_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_1_0_in_rule__ClauseExpression__Group_1_1_1__0__Impl3712);
            rule__ClauseExpression__FieldAssignment_1_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_1__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1715:1: rule__ClauseExpression__Group_1_1_1__1 : rule__ClauseExpression__Group_1_1_1__1__Impl rule__ClauseExpression__Group_1_1_1__2 ;
    public final void rule__ClauseExpression__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1719:1: ( rule__ClauseExpression__Group_1_1_1__1__Impl rule__ClauseExpression__Group_1_1_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1720:2: rule__ClauseExpression__Group_1_1_1__1__Impl rule__ClauseExpression__Group_1_1_1__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_1__1__Impl_in_rule__ClauseExpression__Group_1_1_1__13742);
            rule__ClauseExpression__Group_1_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_1__2_in_rule__ClauseExpression__Group_1_1_1__13745);
            rule__ClauseExpression__Group_1_1_1__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_1__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1727:1: rule__ClauseExpression__Group_1_1_1__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1731:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1732:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1732:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1733:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_1_1()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_1_1__1__Impl3773); 
             after(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_1__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1746:1: rule__ClauseExpression__Group_1_1_1__2 : rule__ClauseExpression__Group_1_1_1__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1750:1: ( rule__ClauseExpression__Group_1_1_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1751:2: rule__ClauseExpression__Group_1_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_1__2__Impl_in_rule__ClauseExpression__Group_1_1_1__23804);
            rule__ClauseExpression__Group_1_1_1__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_1__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_1__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1757:1: rule__ClauseExpression__Group_1_1_1__2__Impl : ( ( rule__ClauseExpression__ValueAssignment_1_1_1_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1761:1: ( ( ( rule__ClauseExpression__ValueAssignment_1_1_1_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1762:1: ( ( rule__ClauseExpression__ValueAssignment_1_1_1_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1762:1: ( ( rule__ClauseExpression__ValueAssignment_1_1_1_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1763:1: ( rule__ClauseExpression__ValueAssignment_1_1_1_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_1_1_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1764:1: ( rule__ClauseExpression__ValueAssignment_1_1_1_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1764:2: rule__ClauseExpression__ValueAssignment_1_1_1_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValueAssignment_1_1_1_2_in_rule__ClauseExpression__Group_1_1_1__2__Impl3831);
            rule__ClauseExpression__ValueAssignment_1_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_1__2__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_2__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1780:1: rule__ClauseExpression__Group_1_1_2__0 : rule__ClauseExpression__Group_1_1_2__0__Impl rule__ClauseExpression__Group_1_1_2__1 ;
    public final void rule__ClauseExpression__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1784:1: ( rule__ClauseExpression__Group_1_1_2__0__Impl rule__ClauseExpression__Group_1_1_2__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1785:2: rule__ClauseExpression__Group_1_1_2__0__Impl rule__ClauseExpression__Group_1_1_2__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_2__0__Impl_in_rule__ClauseExpression__Group_1_1_2__03867);
            rule__ClauseExpression__Group_1_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_2__1_in_rule__ClauseExpression__Group_1_1_2__03870);
            rule__ClauseExpression__Group_1_1_2__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_2__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_2__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1792:1: rule__ClauseExpression__Group_1_1_2__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_1_2_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1796:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_1_2_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1797:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_2_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1797:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_2_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1798:1: ( rule__ClauseExpression__FieldAssignment_1_1_2_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_2_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1799:1: ( rule__ClauseExpression__FieldAssignment_1_1_2_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1799:2: rule__ClauseExpression__FieldAssignment_1_1_2_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_2_0_in_rule__ClauseExpression__Group_1_1_2__0__Impl3897);
            rule__ClauseExpression__FieldAssignment_1_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_2__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_2__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1809:1: rule__ClauseExpression__Group_1_1_2__1 : rule__ClauseExpression__Group_1_1_2__1__Impl rule__ClauseExpression__Group_1_1_2__2 ;
    public final void rule__ClauseExpression__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1813:1: ( rule__ClauseExpression__Group_1_1_2__1__Impl rule__ClauseExpression__Group_1_1_2__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1814:2: rule__ClauseExpression__Group_1_1_2__1__Impl rule__ClauseExpression__Group_1_1_2__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_2__1__Impl_in_rule__ClauseExpression__Group_1_1_2__13927);
            rule__ClauseExpression__Group_1_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_2__2_in_rule__ClauseExpression__Group_1_1_2__13930);
            rule__ClauseExpression__Group_1_1_2__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_2__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_2__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1821:1: rule__ClauseExpression__Group_1_1_2__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1825:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1826:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1826:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1827:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_2_1()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_1_2__1__Impl3958); 
             after(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_2__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_2__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1840:1: rule__ClauseExpression__Group_1_1_2__2 : rule__ClauseExpression__Group_1_1_2__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1844:1: ( rule__ClauseExpression__Group_1_1_2__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1845:2: rule__ClauseExpression__Group_1_1_2__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_2__2__Impl_in_rule__ClauseExpression__Group_1_1_2__23989);
            rule__ClauseExpression__Group_1_1_2__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_2__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_2__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1851:1: rule__ClauseExpression__Group_1_1_2__2__Impl : ( ( rule__ClauseExpression__ValueAssignment_1_1_2_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1855:1: ( ( ( rule__ClauseExpression__ValueAssignment_1_1_2_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1856:1: ( ( rule__ClauseExpression__ValueAssignment_1_1_2_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1856:1: ( ( rule__ClauseExpression__ValueAssignment_1_1_2_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1857:1: ( rule__ClauseExpression__ValueAssignment_1_1_2_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_1_2_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1858:1: ( rule__ClauseExpression__ValueAssignment_1_1_2_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1858:2: rule__ClauseExpression__ValueAssignment_1_1_2_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValueAssignment_1_1_2_2_in_rule__ClauseExpression__Group_1_1_2__2__Impl4016);
            rule__ClauseExpression__ValueAssignment_1_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_2__2__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_3__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1874:1: rule__ClauseExpression__Group_1_1_3__0 : rule__ClauseExpression__Group_1_1_3__0__Impl rule__ClauseExpression__Group_1_1_3__1 ;
    public final void rule__ClauseExpression__Group_1_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1878:1: ( rule__ClauseExpression__Group_1_1_3__0__Impl rule__ClauseExpression__Group_1_1_3__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1879:2: rule__ClauseExpression__Group_1_1_3__0__Impl rule__ClauseExpression__Group_1_1_3__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_3__0__Impl_in_rule__ClauseExpression__Group_1_1_3__04052);
            rule__ClauseExpression__Group_1_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_3__1_in_rule__ClauseExpression__Group_1_1_3__04055);
            rule__ClauseExpression__Group_1_1_3__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_3__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_3__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1886:1: rule__ClauseExpression__Group_1_1_3__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_1_3_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1890:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_1_3_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1891:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_3_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1891:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_3_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1892:1: ( rule__ClauseExpression__FieldAssignment_1_1_3_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_3_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1893:1: ( rule__ClauseExpression__FieldAssignment_1_1_3_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1893:2: rule__ClauseExpression__FieldAssignment_1_1_3_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_3_0_in_rule__ClauseExpression__Group_1_1_3__0__Impl4082);
            rule__ClauseExpression__FieldAssignment_1_1_3_0();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_3__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_3__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1903:1: rule__ClauseExpression__Group_1_1_3__1 : rule__ClauseExpression__Group_1_1_3__1__Impl rule__ClauseExpression__Group_1_1_3__2 ;
    public final void rule__ClauseExpression__Group_1_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1907:1: ( rule__ClauseExpression__Group_1_1_3__1__Impl rule__ClauseExpression__Group_1_1_3__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1908:2: rule__ClauseExpression__Group_1_1_3__1__Impl rule__ClauseExpression__Group_1_1_3__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_3__1__Impl_in_rule__ClauseExpression__Group_1_1_3__14112);
            rule__ClauseExpression__Group_1_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_3__2_in_rule__ClauseExpression__Group_1_1_3__14115);
            rule__ClauseExpression__Group_1_1_3__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_3__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_3__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1915:1: rule__ClauseExpression__Group_1_1_3__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1919:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1920:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1920:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1921:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_3_1()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_1_3__1__Impl4143); 
             after(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_3__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_3__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1934:1: rule__ClauseExpression__Group_1_1_3__2 : rule__ClauseExpression__Group_1_1_3__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1938:1: ( rule__ClauseExpression__Group_1_1_3__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1939:2: rule__ClauseExpression__Group_1_1_3__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_3__2__Impl_in_rule__ClauseExpression__Group_1_1_3__24174);
            rule__ClauseExpression__Group_1_1_3__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_3__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_3__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1945:1: rule__ClauseExpression__Group_1_1_3__2__Impl : ( ( rule__ClauseExpression__ValueAssignment_1_1_3_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1949:1: ( ( ( rule__ClauseExpression__ValueAssignment_1_1_3_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1950:1: ( ( rule__ClauseExpression__ValueAssignment_1_1_3_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1950:1: ( ( rule__ClauseExpression__ValueAssignment_1_1_3_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1951:1: ( rule__ClauseExpression__ValueAssignment_1_1_3_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_1_3_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1952:1: ( rule__ClauseExpression__ValueAssignment_1_1_3_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1952:2: rule__ClauseExpression__ValueAssignment_1_1_3_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValueAssignment_1_1_3_2_in_rule__ClauseExpression__Group_1_1_3__2__Impl4201);
            rule__ClauseExpression__ValueAssignment_1_1_3_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_1_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_3__2__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_4__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1968:1: rule__ClauseExpression__Group_1_1_4__0 : rule__ClauseExpression__Group_1_1_4__0__Impl rule__ClauseExpression__Group_1_1_4__1 ;
    public final void rule__ClauseExpression__Group_1_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1972:1: ( rule__ClauseExpression__Group_1_1_4__0__Impl rule__ClauseExpression__Group_1_1_4__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1973:2: rule__ClauseExpression__Group_1_1_4__0__Impl rule__ClauseExpression__Group_1_1_4__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_4__0__Impl_in_rule__ClauseExpression__Group_1_1_4__04237);
            rule__ClauseExpression__Group_1_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_4__1_in_rule__ClauseExpression__Group_1_1_4__04240);
            rule__ClauseExpression__Group_1_1_4__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_4__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_4__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1980:1: rule__ClauseExpression__Group_1_1_4__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_1_4_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1984:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_1_4_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1985:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_4_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1985:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_4_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1986:1: ( rule__ClauseExpression__FieldAssignment_1_1_4_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_4_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1987:1: ( rule__ClauseExpression__FieldAssignment_1_1_4_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1987:2: rule__ClauseExpression__FieldAssignment_1_1_4_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_4_0_in_rule__ClauseExpression__Group_1_1_4__0__Impl4267);
            rule__ClauseExpression__FieldAssignment_1_1_4_0();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_4__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_4__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1997:1: rule__ClauseExpression__Group_1_1_4__1 : rule__ClauseExpression__Group_1_1_4__1__Impl rule__ClauseExpression__Group_1_1_4__2 ;
    public final void rule__ClauseExpression__Group_1_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2001:1: ( rule__ClauseExpression__Group_1_1_4__1__Impl rule__ClauseExpression__Group_1_1_4__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2002:2: rule__ClauseExpression__Group_1_1_4__1__Impl rule__ClauseExpression__Group_1_1_4__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_4__1__Impl_in_rule__ClauseExpression__Group_1_1_4__14297);
            rule__ClauseExpression__Group_1_1_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_4__2_in_rule__ClauseExpression__Group_1_1_4__14300);
            rule__ClauseExpression__Group_1_1_4__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_4__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_4__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2009:1: rule__ClauseExpression__Group_1_1_4__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2013:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2014:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2014:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2015:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_4_1()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_1_4__1__Impl4328); 
             after(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_4__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_4__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2028:1: rule__ClauseExpression__Group_1_1_4__2 : rule__ClauseExpression__Group_1_1_4__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2032:1: ( rule__ClauseExpression__Group_1_1_4__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2033:2: rule__ClauseExpression__Group_1_1_4__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_4__2__Impl_in_rule__ClauseExpression__Group_1_1_4__24359);
            rule__ClauseExpression__Group_1_1_4__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_4__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_4__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2039:1: rule__ClauseExpression__Group_1_1_4__2__Impl : ( ( rule__ClauseExpression__ValueAssignment_1_1_4_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2043:1: ( ( ( rule__ClauseExpression__ValueAssignment_1_1_4_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2044:1: ( ( rule__ClauseExpression__ValueAssignment_1_1_4_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2044:1: ( ( rule__ClauseExpression__ValueAssignment_1_1_4_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2045:1: ( rule__ClauseExpression__ValueAssignment_1_1_4_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_1_4_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2046:1: ( rule__ClauseExpression__ValueAssignment_1_1_4_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2046:2: rule__ClauseExpression__ValueAssignment_1_1_4_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValueAssignment_1_1_4_2_in_rule__ClauseExpression__Group_1_1_4__2__Impl4386);
            rule__ClauseExpression__ValueAssignment_1_1_4_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_1_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_4__2__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_5__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2062:1: rule__ClauseExpression__Group_1_1_5__0 : rule__ClauseExpression__Group_1_1_5__0__Impl rule__ClauseExpression__Group_1_1_5__1 ;
    public final void rule__ClauseExpression__Group_1_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2066:1: ( rule__ClauseExpression__Group_1_1_5__0__Impl rule__ClauseExpression__Group_1_1_5__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2067:2: rule__ClauseExpression__Group_1_1_5__0__Impl rule__ClauseExpression__Group_1_1_5__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_5__0__Impl_in_rule__ClauseExpression__Group_1_1_5__04422);
            rule__ClauseExpression__Group_1_1_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_5__1_in_rule__ClauseExpression__Group_1_1_5__04425);
            rule__ClauseExpression__Group_1_1_5__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_5__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_5__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2074:1: rule__ClauseExpression__Group_1_1_5__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_1_5_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2078:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_1_5_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2079:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_5_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2079:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_5_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2080:1: ( rule__ClauseExpression__FieldAssignment_1_1_5_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_5_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2081:1: ( rule__ClauseExpression__FieldAssignment_1_1_5_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2081:2: rule__ClauseExpression__FieldAssignment_1_1_5_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_5_0_in_rule__ClauseExpression__Group_1_1_5__0__Impl4452);
            rule__ClauseExpression__FieldAssignment_1_1_5_0();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_5__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_5__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2091:1: rule__ClauseExpression__Group_1_1_5__1 : rule__ClauseExpression__Group_1_1_5__1__Impl rule__ClauseExpression__Group_1_1_5__2 ;
    public final void rule__ClauseExpression__Group_1_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2095:1: ( rule__ClauseExpression__Group_1_1_5__1__Impl rule__ClauseExpression__Group_1_1_5__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2096:2: rule__ClauseExpression__Group_1_1_5__1__Impl rule__ClauseExpression__Group_1_1_5__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_5__1__Impl_in_rule__ClauseExpression__Group_1_1_5__14482);
            rule__ClauseExpression__Group_1_1_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_5__2_in_rule__ClauseExpression__Group_1_1_5__14485);
            rule__ClauseExpression__Group_1_1_5__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_5__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_5__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2103:1: rule__ClauseExpression__Group_1_1_5__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2107:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2108:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2108:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2109:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_5_1()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_1_5__1__Impl4513); 
             after(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_5__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_5__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2122:1: rule__ClauseExpression__Group_1_1_5__2 : rule__ClauseExpression__Group_1_1_5__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2126:1: ( rule__ClauseExpression__Group_1_1_5__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2127:2: rule__ClauseExpression__Group_1_1_5__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_5__2__Impl_in_rule__ClauseExpression__Group_1_1_5__24544);
            rule__ClauseExpression__Group_1_1_5__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_5__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_5__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2133:1: rule__ClauseExpression__Group_1_1_5__2__Impl : ( ( rule__ClauseExpression__ValueAssignment_1_1_5_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2137:1: ( ( ( rule__ClauseExpression__ValueAssignment_1_1_5_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2138:1: ( ( rule__ClauseExpression__ValueAssignment_1_1_5_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2138:1: ( ( rule__ClauseExpression__ValueAssignment_1_1_5_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2139:1: ( rule__ClauseExpression__ValueAssignment_1_1_5_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_1_5_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2140:1: ( rule__ClauseExpression__ValueAssignment_1_1_5_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2140:2: rule__ClauseExpression__ValueAssignment_1_1_5_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValueAssignment_1_1_5_2_in_rule__ClauseExpression__Group_1_1_5__2__Impl4571);
            rule__ClauseExpression__ValueAssignment_1_1_5_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_1_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_5__2__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_6__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2156:1: rule__ClauseExpression__Group_1_1_6__0 : rule__ClauseExpression__Group_1_1_6__0__Impl rule__ClauseExpression__Group_1_1_6__1 ;
    public final void rule__ClauseExpression__Group_1_1_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2160:1: ( rule__ClauseExpression__Group_1_1_6__0__Impl rule__ClauseExpression__Group_1_1_6__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2161:2: rule__ClauseExpression__Group_1_1_6__0__Impl rule__ClauseExpression__Group_1_1_6__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_6__0__Impl_in_rule__ClauseExpression__Group_1_1_6__04607);
            rule__ClauseExpression__Group_1_1_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_6__1_in_rule__ClauseExpression__Group_1_1_6__04610);
            rule__ClauseExpression__Group_1_1_6__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_6__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_6__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2168:1: rule__ClauseExpression__Group_1_1_6__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_1_6_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2172:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_1_6_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2173:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_6_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2173:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_6_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2174:1: ( rule__ClauseExpression__FieldAssignment_1_1_6_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_6_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2175:1: ( rule__ClauseExpression__FieldAssignment_1_1_6_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2175:2: rule__ClauseExpression__FieldAssignment_1_1_6_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_6_0_in_rule__ClauseExpression__Group_1_1_6__0__Impl4637);
            rule__ClauseExpression__FieldAssignment_1_1_6_0();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_6__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_6__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2185:1: rule__ClauseExpression__Group_1_1_6__1 : rule__ClauseExpression__Group_1_1_6__1__Impl rule__ClauseExpression__Group_1_1_6__2 ;
    public final void rule__ClauseExpression__Group_1_1_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2189:1: ( rule__ClauseExpression__Group_1_1_6__1__Impl rule__ClauseExpression__Group_1_1_6__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2190:2: rule__ClauseExpression__Group_1_1_6__1__Impl rule__ClauseExpression__Group_1_1_6__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_6__1__Impl_in_rule__ClauseExpression__Group_1_1_6__14667);
            rule__ClauseExpression__Group_1_1_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_6__2_in_rule__ClauseExpression__Group_1_1_6__14670);
            rule__ClauseExpression__Group_1_1_6__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_6__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_6__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2197:1: rule__ClauseExpression__Group_1_1_6__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_1_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2201:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2202:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2202:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2203:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_6_1()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_1_6__1__Impl4698); 
             after(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_6__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_6__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2216:1: rule__ClauseExpression__Group_1_1_6__2 : rule__ClauseExpression__Group_1_1_6__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2220:1: ( rule__ClauseExpression__Group_1_1_6__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2221:2: rule__ClauseExpression__Group_1_1_6__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_6__2__Impl_in_rule__ClauseExpression__Group_1_1_6__24729);
            rule__ClauseExpression__Group_1_1_6__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_6__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_6__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2227:1: rule__ClauseExpression__Group_1_1_6__2__Impl : ( ( rule__ClauseExpression__ValueAssignment_1_1_6_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2231:1: ( ( ( rule__ClauseExpression__ValueAssignment_1_1_6_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2232:1: ( ( rule__ClauseExpression__ValueAssignment_1_1_6_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2232:1: ( ( rule__ClauseExpression__ValueAssignment_1_1_6_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2233:1: ( rule__ClauseExpression__ValueAssignment_1_1_6_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_1_6_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2234:1: ( rule__ClauseExpression__ValueAssignment_1_1_6_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2234:2: rule__ClauseExpression__ValueAssignment_1_1_6_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValueAssignment_1_1_6_2_in_rule__ClauseExpression__Group_1_1_6__2__Impl4756);
            rule__ClauseExpression__ValueAssignment_1_1_6_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_1_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_6__2__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_7__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2250:1: rule__ClauseExpression__Group_1_1_7__0 : rule__ClauseExpression__Group_1_1_7__0__Impl rule__ClauseExpression__Group_1_1_7__1 ;
    public final void rule__ClauseExpression__Group_1_1_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2254:1: ( rule__ClauseExpression__Group_1_1_7__0__Impl rule__ClauseExpression__Group_1_1_7__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2255:2: rule__ClauseExpression__Group_1_1_7__0__Impl rule__ClauseExpression__Group_1_1_7__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_7__0__Impl_in_rule__ClauseExpression__Group_1_1_7__04792);
            rule__ClauseExpression__Group_1_1_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_7__1_in_rule__ClauseExpression__Group_1_1_7__04795);
            rule__ClauseExpression__Group_1_1_7__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_7__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_7__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2262:1: rule__ClauseExpression__Group_1_1_7__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_1_7_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2266:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_1_7_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2267:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_7_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2267:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_7_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2268:1: ( rule__ClauseExpression__FieldAssignment_1_1_7_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_7_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2269:1: ( rule__ClauseExpression__FieldAssignment_1_1_7_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2269:2: rule__ClauseExpression__FieldAssignment_1_1_7_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_7_0_in_rule__ClauseExpression__Group_1_1_7__0__Impl4822);
            rule__ClauseExpression__FieldAssignment_1_1_7_0();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_7__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_7__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2279:1: rule__ClauseExpression__Group_1_1_7__1 : rule__ClauseExpression__Group_1_1_7__1__Impl rule__ClauseExpression__Group_1_1_7__2 ;
    public final void rule__ClauseExpression__Group_1_1_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2283:1: ( rule__ClauseExpression__Group_1_1_7__1__Impl rule__ClauseExpression__Group_1_1_7__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2284:2: rule__ClauseExpression__Group_1_1_7__1__Impl rule__ClauseExpression__Group_1_1_7__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_7__1__Impl_in_rule__ClauseExpression__Group_1_1_7__14852);
            rule__ClauseExpression__Group_1_1_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_7__2_in_rule__ClauseExpression__Group_1_1_7__14855);
            rule__ClauseExpression__Group_1_1_7__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_7__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_7__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2291:1: rule__ClauseExpression__Group_1_1_7__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_1_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2295:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2296:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2296:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2297:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_7_1()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_1_7__1__Impl4883); 
             after(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_7__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_7__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2310:1: rule__ClauseExpression__Group_1_1_7__2 : rule__ClauseExpression__Group_1_1_7__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2314:1: ( rule__ClauseExpression__Group_1_1_7__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2315:2: rule__ClauseExpression__Group_1_1_7__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_7__2__Impl_in_rule__ClauseExpression__Group_1_1_7__24914);
            rule__ClauseExpression__Group_1_1_7__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_7__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_7__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2321:1: rule__ClauseExpression__Group_1_1_7__2__Impl : ( ( rule__ClauseExpression__ValueAssignment_1_1_7_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2325:1: ( ( ( rule__ClauseExpression__ValueAssignment_1_1_7_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2326:1: ( ( rule__ClauseExpression__ValueAssignment_1_1_7_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2326:1: ( ( rule__ClauseExpression__ValueAssignment_1_1_7_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2327:1: ( rule__ClauseExpression__ValueAssignment_1_1_7_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_1_7_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2328:1: ( rule__ClauseExpression__ValueAssignment_1_1_7_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2328:2: rule__ClauseExpression__ValueAssignment_1_1_7_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValueAssignment_1_1_7_2_in_rule__ClauseExpression__Group_1_1_7__2__Impl4941);
            rule__ClauseExpression__ValueAssignment_1_1_7_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_1_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_7__2__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_8__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2344:1: rule__ClauseExpression__Group_1_1_8__0 : rule__ClauseExpression__Group_1_1_8__0__Impl rule__ClauseExpression__Group_1_1_8__1 ;
    public final void rule__ClauseExpression__Group_1_1_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2348:1: ( rule__ClauseExpression__Group_1_1_8__0__Impl rule__ClauseExpression__Group_1_1_8__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2349:2: rule__ClauseExpression__Group_1_1_8__0__Impl rule__ClauseExpression__Group_1_1_8__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_8__0__Impl_in_rule__ClauseExpression__Group_1_1_8__04977);
            rule__ClauseExpression__Group_1_1_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_8__1_in_rule__ClauseExpression__Group_1_1_8__04980);
            rule__ClauseExpression__Group_1_1_8__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_8__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_8__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2356:1: rule__ClauseExpression__Group_1_1_8__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_1_8_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2360:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_1_8_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2361:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_8_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2361:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_8_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2362:1: ( rule__ClauseExpression__FieldAssignment_1_1_8_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_8_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2363:1: ( rule__ClauseExpression__FieldAssignment_1_1_8_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2363:2: rule__ClauseExpression__FieldAssignment_1_1_8_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_8_0_in_rule__ClauseExpression__Group_1_1_8__0__Impl5007);
            rule__ClauseExpression__FieldAssignment_1_1_8_0();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_8__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_8__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2373:1: rule__ClauseExpression__Group_1_1_8__1 : rule__ClauseExpression__Group_1_1_8__1__Impl rule__ClauseExpression__Group_1_1_8__2 ;
    public final void rule__ClauseExpression__Group_1_1_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2377:1: ( rule__ClauseExpression__Group_1_1_8__1__Impl rule__ClauseExpression__Group_1_1_8__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2378:2: rule__ClauseExpression__Group_1_1_8__1__Impl rule__ClauseExpression__Group_1_1_8__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_8__1__Impl_in_rule__ClauseExpression__Group_1_1_8__15037);
            rule__ClauseExpression__Group_1_1_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_8__2_in_rule__ClauseExpression__Group_1_1_8__15040);
            rule__ClauseExpression__Group_1_1_8__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_8__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_8__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2385:1: rule__ClauseExpression__Group_1_1_8__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_1_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2389:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2390:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2390:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2391:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_8_1()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_1_8__1__Impl5068); 
             after(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_8__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_8__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2404:1: rule__ClauseExpression__Group_1_1_8__2 : rule__ClauseExpression__Group_1_1_8__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2408:1: ( rule__ClauseExpression__Group_1_1_8__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2409:2: rule__ClauseExpression__Group_1_1_8__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_8__2__Impl_in_rule__ClauseExpression__Group_1_1_8__25099);
            rule__ClauseExpression__Group_1_1_8__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_8__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_8__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2415:1: rule__ClauseExpression__Group_1_1_8__2__Impl : ( ( rule__ClauseExpression__ValueAssignment_1_1_8_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2419:1: ( ( ( rule__ClauseExpression__ValueAssignment_1_1_8_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2420:1: ( ( rule__ClauseExpression__ValueAssignment_1_1_8_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2420:1: ( ( rule__ClauseExpression__ValueAssignment_1_1_8_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2421:1: ( rule__ClauseExpression__ValueAssignment_1_1_8_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_1_8_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2422:1: ( rule__ClauseExpression__ValueAssignment_1_1_8_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2422:2: rule__ClauseExpression__ValueAssignment_1_1_8_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValueAssignment_1_1_8_2_in_rule__ClauseExpression__Group_1_1_8__2__Impl5126);
            rule__ClauseExpression__ValueAssignment_1_1_8_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_1_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_8__2__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_9__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2438:1: rule__ClauseExpression__Group_1_1_9__0 : rule__ClauseExpression__Group_1_1_9__0__Impl rule__ClauseExpression__Group_1_1_9__1 ;
    public final void rule__ClauseExpression__Group_1_1_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2442:1: ( rule__ClauseExpression__Group_1_1_9__0__Impl rule__ClauseExpression__Group_1_1_9__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2443:2: rule__ClauseExpression__Group_1_1_9__0__Impl rule__ClauseExpression__Group_1_1_9__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_9__0__Impl_in_rule__ClauseExpression__Group_1_1_9__05162);
            rule__ClauseExpression__Group_1_1_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_9__1_in_rule__ClauseExpression__Group_1_1_9__05165);
            rule__ClauseExpression__Group_1_1_9__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_9__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_9__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2450:1: rule__ClauseExpression__Group_1_1_9__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_1_9_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2454:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_1_9_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2455:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_9_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2455:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_9_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2456:1: ( rule__ClauseExpression__FieldAssignment_1_1_9_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_9_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2457:1: ( rule__ClauseExpression__FieldAssignment_1_1_9_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2457:2: rule__ClauseExpression__FieldAssignment_1_1_9_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_9_0_in_rule__ClauseExpression__Group_1_1_9__0__Impl5192);
            rule__ClauseExpression__FieldAssignment_1_1_9_0();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_9__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_9__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2467:1: rule__ClauseExpression__Group_1_1_9__1 : rule__ClauseExpression__Group_1_1_9__1__Impl rule__ClauseExpression__Group_1_1_9__2 ;
    public final void rule__ClauseExpression__Group_1_1_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2471:1: ( rule__ClauseExpression__Group_1_1_9__1__Impl rule__ClauseExpression__Group_1_1_9__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2472:2: rule__ClauseExpression__Group_1_1_9__1__Impl rule__ClauseExpression__Group_1_1_9__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_9__1__Impl_in_rule__ClauseExpression__Group_1_1_9__15222);
            rule__ClauseExpression__Group_1_1_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_9__2_in_rule__ClauseExpression__Group_1_1_9__15225);
            rule__ClauseExpression__Group_1_1_9__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_9__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_9__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2479:1: rule__ClauseExpression__Group_1_1_9__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_1_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2483:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2484:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2484:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2485:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_9_1()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_1_9__1__Impl5253); 
             after(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_9__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_9__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2498:1: rule__ClauseExpression__Group_1_1_9__2 : rule__ClauseExpression__Group_1_1_9__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2502:1: ( rule__ClauseExpression__Group_1_1_9__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2503:2: rule__ClauseExpression__Group_1_1_9__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_9__2__Impl_in_rule__ClauseExpression__Group_1_1_9__25284);
            rule__ClauseExpression__Group_1_1_9__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_9__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_9__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2509:1: rule__ClauseExpression__Group_1_1_9__2__Impl : ( ( rule__ClauseExpression__ValueAssignment_1_1_9_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2513:1: ( ( ( rule__ClauseExpression__ValueAssignment_1_1_9_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2514:1: ( ( rule__ClauseExpression__ValueAssignment_1_1_9_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2514:1: ( ( rule__ClauseExpression__ValueAssignment_1_1_9_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2515:1: ( rule__ClauseExpression__ValueAssignment_1_1_9_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_1_9_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2516:1: ( rule__ClauseExpression__ValueAssignment_1_1_9_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2516:2: rule__ClauseExpression__ValueAssignment_1_1_9_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValueAssignment_1_1_9_2_in_rule__ClauseExpression__Group_1_1_9__2__Impl5311);
            rule__ClauseExpression__ValueAssignment_1_1_9_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_1_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_9__2__Impl"


    // $ANTLR start "rule__Exp1__BAssignment_1_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2533:1: rule__Exp1__BAssignment_1_1 : ( ruleBinaryExp ) ;
    public final void rule__Exp1__BAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2537:1: ( ( ruleBinaryExp ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2538:1: ( ruleBinaryExp )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2538:1: ( ruleBinaryExp )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2539:1: ruleBinaryExp
            {
             before(grammarAccess.getExp1Access().getBBinaryExpEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleBinaryExp_in_rule__Exp1__BAssignment_1_15352);
            ruleBinaryExp();

            state._fsp--;

             after(grammarAccess.getExp1Access().getBBinaryExpEnumRuleCall_1_1_0()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2548:1: rule__Exp1__RightAssignment_1_2 : ( ruleExp1 ) ;
    public final void rule__Exp1__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2552:1: ( ( ruleExp1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2553:1: ( ruleExp1 )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2553:1: ( ruleExp1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2554:1: ruleExp1
            {
             before(grammarAccess.getExp1Access().getRightExp1ParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleExp1_in_rule__Exp1__RightAssignment_1_25383);
            ruleExp1();

            state._fsp--;

             after(grammarAccess.getExp1Access().getRightExp1ParserRuleCall_1_2_0()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2563:1: rule__Exp2__ValueAssignment_0 : ( ruleClauseExpression ) ;
    public final void rule__Exp2__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2567:1: ( ( ruleClauseExpression ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2568:1: ( ruleClauseExpression )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2568:1: ( ruleClauseExpression )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2569:1: ruleClauseExpression
            {
             before(grammarAccess.getExp2Access().getValueClauseExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleClauseExpression_in_rule__Exp2__ValueAssignment_05414);
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


    // $ANTLR start "rule__ClauseExpression__DefaultAssignment_1_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2578:1: rule__ClauseExpression__DefaultAssignment_1_0 : ( ruleSimpleFieldValue ) ;
    public final void rule__ClauseExpression__DefaultAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2582:1: ( ( ruleSimpleFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2583:1: ( ruleSimpleFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2583:1: ( ruleSimpleFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2584:1: ruleSimpleFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getDefaultSimpleFieldValueParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleSimpleFieldValue_in_rule__ClauseExpression__DefaultAssignment_1_05445);
            ruleSimpleFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getDefaultSimpleFieldValueParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__DefaultAssignment_1_0"


    // $ANTLR start "rule__ClauseExpression__FieldAssignment_1_1_0_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2593:1: rule__ClauseExpression__FieldAssignment_1_1_0_0 : ( ruleSimpleField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2597:1: ( ( ruleSimpleField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2598:1: ( ruleSimpleField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2598:1: ( ruleSimpleField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2599:1: ruleSimpleField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldSimpleFieldParserRuleCall_1_1_0_0_0()); 
            pushFollow(FOLLOW_ruleSimpleField_in_rule__ClauseExpression__FieldAssignment_1_1_0_05476);
            ruleSimpleField();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getFieldSimpleFieldParserRuleCall_1_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__FieldAssignment_1_1_0_0"


    // $ANTLR start "rule__ClauseExpression__ValueAssignment_1_1_0_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2608:1: rule__ClauseExpression__ValueAssignment_1_1_0_2 : ( ruleSimpleFieldValue ) ;
    public final void rule__ClauseExpression__ValueAssignment_1_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2612:1: ( ( ruleSimpleFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2613:1: ( ruleSimpleFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2613:1: ( ruleSimpleFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2614:1: ruleSimpleFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValueSimpleFieldValueParserRuleCall_1_1_0_2_0()); 
            pushFollow(FOLLOW_ruleSimpleFieldValue_in_rule__ClauseExpression__ValueAssignment_1_1_0_25507);
            ruleSimpleFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValueSimpleFieldValueParserRuleCall_1_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValueAssignment_1_1_0_2"


    // $ANTLR start "rule__ClauseExpression__FieldAssignment_1_1_1_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2623:1: rule__ClauseExpression__FieldAssignment_1_1_1_0 : ( ruleTypeField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2627:1: ( ( ruleTypeField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2628:1: ( ruleTypeField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2628:1: ( ruleTypeField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2629:1: ruleTypeField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldTypeFieldParserRuleCall_1_1_1_0_0()); 
            pushFollow(FOLLOW_ruleTypeField_in_rule__ClauseExpression__FieldAssignment_1_1_1_05538);
            ruleTypeField();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getFieldTypeFieldParserRuleCall_1_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__FieldAssignment_1_1_1_0"


    // $ANTLR start "rule__ClauseExpression__ValueAssignment_1_1_1_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2638:1: rule__ClauseExpression__ValueAssignment_1_1_1_2 : ( ruleTypeFieldValue ) ;
    public final void rule__ClauseExpression__ValueAssignment_1_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2642:1: ( ( ruleTypeFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2643:1: ( ruleTypeFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2643:1: ( ruleTypeFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2644:1: ruleTypeFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValueTypeFieldValueParserRuleCall_1_1_1_2_0()); 
            pushFollow(FOLLOW_ruleTypeFieldValue_in_rule__ClauseExpression__ValueAssignment_1_1_1_25569);
            ruleTypeFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValueTypeFieldValueParserRuleCall_1_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValueAssignment_1_1_1_2"


    // $ANTLR start "rule__ClauseExpression__FieldAssignment_1_1_2_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2653:1: rule__ClauseExpression__FieldAssignment_1_1_2_0 : ( ruleMethodField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2657:1: ( ( ruleMethodField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2658:1: ( ruleMethodField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2658:1: ( ruleMethodField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2659:1: ruleMethodField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldMethodFieldParserRuleCall_1_1_2_0_0()); 
            pushFollow(FOLLOW_ruleMethodField_in_rule__ClauseExpression__FieldAssignment_1_1_2_05600);
            ruleMethodField();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getFieldMethodFieldParserRuleCall_1_1_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__FieldAssignment_1_1_2_0"


    // $ANTLR start "rule__ClauseExpression__ValueAssignment_1_1_2_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2668:1: rule__ClauseExpression__ValueAssignment_1_1_2_2 : ( ruleMethodFieldValue ) ;
    public final void rule__ClauseExpression__ValueAssignment_1_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2672:1: ( ( ruleMethodFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2673:1: ( ruleMethodFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2673:1: ( ruleMethodFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2674:1: ruleMethodFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValueMethodFieldValueParserRuleCall_1_1_2_2_0()); 
            pushFollow(FOLLOW_ruleMethodFieldValue_in_rule__ClauseExpression__ValueAssignment_1_1_2_25631);
            ruleMethodFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValueMethodFieldValueParserRuleCall_1_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValueAssignment_1_1_2_2"


    // $ANTLR start "rule__ClauseExpression__FieldAssignment_1_1_3_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2683:1: rule__ClauseExpression__FieldAssignment_1_1_3_0 : ( ruleFilePathField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2687:1: ( ( ruleFilePathField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2688:1: ( ruleFilePathField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2688:1: ( ruleFilePathField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2689:1: ruleFilePathField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldFilePathFieldParserRuleCall_1_1_3_0_0()); 
            pushFollow(FOLLOW_ruleFilePathField_in_rule__ClauseExpression__FieldAssignment_1_1_3_05662);
            ruleFilePathField();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getFieldFilePathFieldParserRuleCall_1_1_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__FieldAssignment_1_1_3_0"


    // $ANTLR start "rule__ClauseExpression__ValueAssignment_1_1_3_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2698:1: rule__ClauseExpression__ValueAssignment_1_1_3_2 : ( ruleFilePathFieldValue ) ;
    public final void rule__ClauseExpression__ValueAssignment_1_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2702:1: ( ( ruleFilePathFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2703:1: ( ruleFilePathFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2703:1: ( ruleFilePathFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2704:1: ruleFilePathFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValueFilePathFieldValueParserRuleCall_1_1_3_2_0()); 
            pushFollow(FOLLOW_ruleFilePathFieldValue_in_rule__ClauseExpression__ValueAssignment_1_1_3_25693);
            ruleFilePathFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValueFilePathFieldValueParserRuleCall_1_1_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValueAssignment_1_1_3_2"


    // $ANTLR start "rule__ClauseExpression__FieldAssignment_1_1_4_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2713:1: rule__ClauseExpression__FieldAssignment_1_1_4_0 : ( ruleNumberField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_1_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2717:1: ( ( ruleNumberField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2718:1: ( ruleNumberField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2718:1: ( ruleNumberField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2719:1: ruleNumberField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldNumberFieldParserRuleCall_1_1_4_0_0()); 
            pushFollow(FOLLOW_ruleNumberField_in_rule__ClauseExpression__FieldAssignment_1_1_4_05724);
            ruleNumberField();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getFieldNumberFieldParserRuleCall_1_1_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__FieldAssignment_1_1_4_0"


    // $ANTLR start "rule__ClauseExpression__ValueAssignment_1_1_4_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2728:1: rule__ClauseExpression__ValueAssignment_1_1_4_2 : ( ruleNumberFieldValue ) ;
    public final void rule__ClauseExpression__ValueAssignment_1_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2732:1: ( ( ruleNumberFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2733:1: ( ruleNumberFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2733:1: ( ruleNumberFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2734:1: ruleNumberFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValueNumberFieldValueParserRuleCall_1_1_4_2_0()); 
            pushFollow(FOLLOW_ruleNumberFieldValue_in_rule__ClauseExpression__ValueAssignment_1_1_4_25755);
            ruleNumberFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValueNumberFieldValueParserRuleCall_1_1_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValueAssignment_1_1_4_2"


    // $ANTLR start "rule__ClauseExpression__FieldAssignment_1_1_5_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2743:1: rule__ClauseExpression__FieldAssignment_1_1_5_0 : ( ruleModifierField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_1_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2747:1: ( ( ruleModifierField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2748:1: ( ruleModifierField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2748:1: ( ruleModifierField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2749:1: ruleModifierField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldModifierFieldParserRuleCall_1_1_5_0_0()); 
            pushFollow(FOLLOW_ruleModifierField_in_rule__ClauseExpression__FieldAssignment_1_1_5_05786);
            ruleModifierField();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getFieldModifierFieldParserRuleCall_1_1_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__FieldAssignment_1_1_5_0"


    // $ANTLR start "rule__ClauseExpression__ValueAssignment_1_1_5_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2758:1: rule__ClauseExpression__ValueAssignment_1_1_5_2 : ( ruleModifierFieldValue ) ;
    public final void rule__ClauseExpression__ValueAssignment_1_1_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2762:1: ( ( ruleModifierFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2763:1: ( ruleModifierFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2763:1: ( ruleModifierFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2764:1: ruleModifierFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValueModifierFieldValueParserRuleCall_1_1_5_2_0()); 
            pushFollow(FOLLOW_ruleModifierFieldValue_in_rule__ClauseExpression__ValueAssignment_1_1_5_25817);
            ruleModifierFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValueModifierFieldValueParserRuleCall_1_1_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValueAssignment_1_1_5_2"


    // $ANTLR start "rule__ClauseExpression__FieldAssignment_1_1_6_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2773:1: rule__ClauseExpression__FieldAssignment_1_1_6_0 : ( ruleTimeField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_1_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2777:1: ( ( ruleTimeField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2778:1: ( ruleTimeField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2778:1: ( ruleTimeField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2779:1: ruleTimeField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldTimeFieldParserRuleCall_1_1_6_0_0()); 
            pushFollow(FOLLOW_ruleTimeField_in_rule__ClauseExpression__FieldAssignment_1_1_6_05848);
            ruleTimeField();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getFieldTimeFieldParserRuleCall_1_1_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__FieldAssignment_1_1_6_0"


    // $ANTLR start "rule__ClauseExpression__ValueAssignment_1_1_6_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2788:1: rule__ClauseExpression__ValueAssignment_1_1_6_2 : ( ruleTimeFieldValue ) ;
    public final void rule__ClauseExpression__ValueAssignment_1_1_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2792:1: ( ( ruleTimeFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2793:1: ( ruleTimeFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2793:1: ( ruleTimeFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2794:1: ruleTimeFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValueTimeFieldValueParserRuleCall_1_1_6_2_0()); 
            pushFollow(FOLLOW_ruleTimeFieldValue_in_rule__ClauseExpression__ValueAssignment_1_1_6_25879);
            ruleTimeFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValueTimeFieldValueParserRuleCall_1_1_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValueAssignment_1_1_6_2"


    // $ANTLR start "rule__ClauseExpression__FieldAssignment_1_1_7_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2803:1: rule__ClauseExpression__FieldAssignment_1_1_7_0 : ( ruleDocumentTypeField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_1_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2807:1: ( ( ruleDocumentTypeField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2808:1: ( ruleDocumentTypeField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2808:1: ( ruleDocumentTypeField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2809:1: ruleDocumentTypeField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldDocumentTypeFieldParserRuleCall_1_1_7_0_0()); 
            pushFollow(FOLLOW_ruleDocumentTypeField_in_rule__ClauseExpression__FieldAssignment_1_1_7_05910);
            ruleDocumentTypeField();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getFieldDocumentTypeFieldParserRuleCall_1_1_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__FieldAssignment_1_1_7_0"


    // $ANTLR start "rule__ClauseExpression__ValueAssignment_1_1_7_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2818:1: rule__ClauseExpression__ValueAssignment_1_1_7_2 : ( ruleDocumentTypeFieldValue ) ;
    public final void rule__ClauseExpression__ValueAssignment_1_1_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2822:1: ( ( ruleDocumentTypeFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2823:1: ( ruleDocumentTypeFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2823:1: ( ruleDocumentTypeFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2824:1: ruleDocumentTypeFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValueDocumentTypeFieldValueParserRuleCall_1_1_7_2_0()); 
            pushFollow(FOLLOW_ruleDocumentTypeFieldValue_in_rule__ClauseExpression__ValueAssignment_1_1_7_25941);
            ruleDocumentTypeFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValueDocumentTypeFieldValueParserRuleCall_1_1_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValueAssignment_1_1_7_2"


    // $ANTLR start "rule__ClauseExpression__FieldAssignment_1_1_8_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2833:1: rule__ClauseExpression__FieldAssignment_1_1_8_0 : ( ruleProjectNameField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_1_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2837:1: ( ( ruleProjectNameField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2838:1: ( ruleProjectNameField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2838:1: ( ruleProjectNameField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2839:1: ruleProjectNameField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldProjectNameFieldParserRuleCall_1_1_8_0_0()); 
            pushFollow(FOLLOW_ruleProjectNameField_in_rule__ClauseExpression__FieldAssignment_1_1_8_05972);
            ruleProjectNameField();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getFieldProjectNameFieldParserRuleCall_1_1_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__FieldAssignment_1_1_8_0"


    // $ANTLR start "rule__ClauseExpression__ValueAssignment_1_1_8_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2848:1: rule__ClauseExpression__ValueAssignment_1_1_8_2 : ( ruleProjectNameFieldValue ) ;
    public final void rule__ClauseExpression__ValueAssignment_1_1_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2852:1: ( ( ruleProjectNameFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2853:1: ( ruleProjectNameFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2853:1: ( ruleProjectNameFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2854:1: ruleProjectNameFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValueProjectNameFieldValueParserRuleCall_1_1_8_2_0()); 
            pushFollow(FOLLOW_ruleProjectNameFieldValue_in_rule__ClauseExpression__ValueAssignment_1_1_8_26003);
            ruleProjectNameFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValueProjectNameFieldValueParserRuleCall_1_1_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValueAssignment_1_1_8_2"


    // $ANTLR start "rule__ClauseExpression__FieldAssignment_1_1_9_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2863:1: rule__ClauseExpression__FieldAssignment_1_1_9_0 : ( ruleAnnotationField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_1_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2867:1: ( ( ruleAnnotationField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2868:1: ( ruleAnnotationField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2868:1: ( ruleAnnotationField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2869:1: ruleAnnotationField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAnnotationFieldParserRuleCall_1_1_9_0_0()); 
            pushFollow(FOLLOW_ruleAnnotationField_in_rule__ClauseExpression__FieldAssignment_1_1_9_06034);
            ruleAnnotationField();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getFieldAnnotationFieldParserRuleCall_1_1_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__FieldAssignment_1_1_9_0"


    // $ANTLR start "rule__ClauseExpression__ValueAssignment_1_1_9_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2878:1: rule__ClauseExpression__ValueAssignment_1_1_9_2 : ( ruleAnnotationFieldValue ) ;
    public final void rule__ClauseExpression__ValueAssignment_1_1_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2882:1: ( ( ruleAnnotationFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2883:1: ( ruleAnnotationFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2883:1: ( ruleAnnotationFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2884:1: ruleAnnotationFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValueAnnotationFieldValueParserRuleCall_1_1_9_2_0()); 
            pushFollow(FOLLOW_ruleAnnotationFieldValue_in_rule__ClauseExpression__ValueAssignment_1_1_9_26065);
            ruleAnnotationFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValueAnnotationFieldValueParserRuleCall_1_1_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValueAssignment_1_1_9_2"


    // $ANTLR start "rule__TypeField__ImplementedTypesAssignment_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2893:1: rule__TypeField__ImplementedTypesAssignment_0 : ( ( 'ImplementedTypes' ) ) ;
    public final void rule__TypeField__ImplementedTypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2897:1: ( ( ( 'ImplementedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2898:1: ( ( 'ImplementedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2898:1: ( ( 'ImplementedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2899:1: ( 'ImplementedTypes' )
            {
             before(grammarAccess.getTypeFieldAccess().getImplementedTypesImplementedTypesKeyword_0_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2900:1: ( 'ImplementedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2901:1: 'ImplementedTypes'
            {
             before(grammarAccess.getTypeFieldAccess().getImplementedTypesImplementedTypesKeyword_0_0()); 
            match(input,32,FOLLOW_32_in_rule__TypeField__ImplementedTypesAssignment_06101); 
             after(grammarAccess.getTypeFieldAccess().getImplementedTypesImplementedTypesKeyword_0_0()); 

            }

             after(grammarAccess.getTypeFieldAccess().getImplementedTypesImplementedTypesKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeField__ImplementedTypesAssignment_0"


    // $ANTLR start "rule__TypeField__ExtendedTypesAssignment_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2916:1: rule__TypeField__ExtendedTypesAssignment_1 : ( ( 'ExtendedTypes' ) ) ;
    public final void rule__TypeField__ExtendedTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2920:1: ( ( ( 'ExtendedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2921:1: ( ( 'ExtendedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2921:1: ( ( 'ExtendedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2922:1: ( 'ExtendedTypes' )
            {
             before(grammarAccess.getTypeFieldAccess().getExtendedTypesExtendedTypesKeyword_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2923:1: ( 'ExtendedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2924:1: 'ExtendedTypes'
            {
             before(grammarAccess.getTypeFieldAccess().getExtendedTypesExtendedTypesKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__TypeField__ExtendedTypesAssignment_16145); 
             after(grammarAccess.getTypeFieldAccess().getExtendedTypesExtendedTypesKeyword_1_0()); 

            }

             after(grammarAccess.getTypeFieldAccess().getExtendedTypesExtendedTypesKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeField__ExtendedTypesAssignment_1"


    // $ANTLR start "rule__TypeField__UsedTypesAssignment_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2939:1: rule__TypeField__UsedTypesAssignment_2 : ( ( 'UsedTypes' ) ) ;
    public final void rule__TypeField__UsedTypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2943:1: ( ( ( 'UsedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2944:1: ( ( 'UsedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2944:1: ( ( 'UsedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2945:1: ( 'UsedTypes' )
            {
             before(grammarAccess.getTypeFieldAccess().getUsedTypesUsedTypesKeyword_2_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2946:1: ( 'UsedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2947:1: 'UsedTypes'
            {
             before(grammarAccess.getTypeFieldAccess().getUsedTypesUsedTypesKeyword_2_0()); 
            match(input,34,FOLLOW_34_in_rule__TypeField__UsedTypesAssignment_26189); 
             after(grammarAccess.getTypeFieldAccess().getUsedTypesUsedTypesKeyword_2_0()); 

            }

             after(grammarAccess.getTypeFieldAccess().getUsedTypesUsedTypesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeField__UsedTypesAssignment_2"


    // $ANTLR start "rule__TypeField__UsedTypesInTryAssignment_3"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2962:1: rule__TypeField__UsedTypesInTryAssignment_3 : ( ( 'UsedTypesInTry' ) ) ;
    public final void rule__TypeField__UsedTypesInTryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2966:1: ( ( ( 'UsedTypesInTry' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2967:1: ( ( 'UsedTypesInTry' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2967:1: ( ( 'UsedTypesInTry' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2968:1: ( 'UsedTypesInTry' )
            {
             before(grammarAccess.getTypeFieldAccess().getUsedTypesInTryUsedTypesInTryKeyword_3_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2969:1: ( 'UsedTypesInTry' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2970:1: 'UsedTypesInTry'
            {
             before(grammarAccess.getTypeFieldAccess().getUsedTypesInTryUsedTypesInTryKeyword_3_0()); 
            match(input,35,FOLLOW_35_in_rule__TypeField__UsedTypesInTryAssignment_36233); 
             after(grammarAccess.getTypeFieldAccess().getUsedTypesInTryUsedTypesInTryKeyword_3_0()); 

            }

             after(grammarAccess.getTypeFieldAccess().getUsedTypesInTryUsedTypesInTryKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeField__UsedTypesInTryAssignment_3"


    // $ANTLR start "rule__TypeField__UsedTypesInFinallyAssignment_4"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2985:1: rule__TypeField__UsedTypesInFinallyAssignment_4 : ( ( 'UsedTypesInFinally' ) ) ;
    public final void rule__TypeField__UsedTypesInFinallyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2989:1: ( ( ( 'UsedTypesInFinally' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2990:1: ( ( 'UsedTypesInFinally' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2990:1: ( ( 'UsedTypesInFinally' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2991:1: ( 'UsedTypesInFinally' )
            {
             before(grammarAccess.getTypeFieldAccess().getUsedTypesInFinallyUsedTypesInFinallyKeyword_4_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2992:1: ( 'UsedTypesInFinally' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2993:1: 'UsedTypesInFinally'
            {
             before(grammarAccess.getTypeFieldAccess().getUsedTypesInFinallyUsedTypesInFinallyKeyword_4_0()); 
            match(input,36,FOLLOW_36_in_rule__TypeField__UsedTypesInFinallyAssignment_46277); 
             after(grammarAccess.getTypeFieldAccess().getUsedTypesInFinallyUsedTypesInFinallyKeyword_4_0()); 

            }

             after(grammarAccess.getTypeFieldAccess().getUsedTypesInFinallyUsedTypesInFinallyKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeField__UsedTypesInFinallyAssignment_4"


    // $ANTLR start "rule__TypeField__ParameterTypesAssignment_5"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3008:1: rule__TypeField__ParameterTypesAssignment_5 : ( ( 'ParameterTypes' ) ) ;
    public final void rule__TypeField__ParameterTypesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3012:1: ( ( ( 'ParameterTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3013:1: ( ( 'ParameterTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3013:1: ( ( 'ParameterTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3014:1: ( 'ParameterTypes' )
            {
             before(grammarAccess.getTypeFieldAccess().getParameterTypesParameterTypesKeyword_5_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3015:1: ( 'ParameterTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3016:1: 'ParameterTypes'
            {
             before(grammarAccess.getTypeFieldAccess().getParameterTypesParameterTypesKeyword_5_0()); 
            match(input,37,FOLLOW_37_in_rule__TypeField__ParameterTypesAssignment_56321); 
             after(grammarAccess.getTypeFieldAccess().getParameterTypesParameterTypesKeyword_5_0()); 

            }

             after(grammarAccess.getTypeFieldAccess().getParameterTypesParameterTypesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeField__ParameterTypesAssignment_5"


    // $ANTLR start "rule__TypeField__ReturnTypeAssignment_6"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3031:1: rule__TypeField__ReturnTypeAssignment_6 : ( ( 'ReturnType' ) ) ;
    public final void rule__TypeField__ReturnTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3035:1: ( ( ( 'ReturnType' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3036:1: ( ( 'ReturnType' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3036:1: ( ( 'ReturnType' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3037:1: ( 'ReturnType' )
            {
             before(grammarAccess.getTypeFieldAccess().getReturnTypeReturnTypeKeyword_6_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3038:1: ( 'ReturnType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3039:1: 'ReturnType'
            {
             before(grammarAccess.getTypeFieldAccess().getReturnTypeReturnTypeKeyword_6_0()); 
            match(input,38,FOLLOW_38_in_rule__TypeField__ReturnTypeAssignment_66365); 
             after(grammarAccess.getTypeFieldAccess().getReturnTypeReturnTypeKeyword_6_0()); 

            }

             after(grammarAccess.getTypeFieldAccess().getReturnTypeReturnTypeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeField__ReturnTypeAssignment_6"


    // $ANTLR start "rule__TypeField__InstanceofTypesAssignment_7"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3054:1: rule__TypeField__InstanceofTypesAssignment_7 : ( ( 'InstanceofTypes' ) ) ;
    public final void rule__TypeField__InstanceofTypesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3058:1: ( ( ( 'InstanceofTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3059:1: ( ( 'InstanceofTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3059:1: ( ( 'InstanceofTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3060:1: ( 'InstanceofTypes' )
            {
             before(grammarAccess.getTypeFieldAccess().getInstanceofTypesInstanceofTypesKeyword_7_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3061:1: ( 'InstanceofTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3062:1: 'InstanceofTypes'
            {
             before(grammarAccess.getTypeFieldAccess().getInstanceofTypesInstanceofTypesKeyword_7_0()); 
            match(input,39,FOLLOW_39_in_rule__TypeField__InstanceofTypesAssignment_76409); 
             after(grammarAccess.getTypeFieldAccess().getInstanceofTypesInstanceofTypesKeyword_7_0()); 

            }

             after(grammarAccess.getTypeFieldAccess().getInstanceofTypesInstanceofTypesKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeField__InstanceofTypesAssignment_7"


    // $ANTLR start "rule__TypeField__AllImplementedTypesAssignment_8"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3077:1: rule__TypeField__AllImplementedTypesAssignment_8 : ( ( 'AllImplementedTypes' ) ) ;
    public final void rule__TypeField__AllImplementedTypesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3081:1: ( ( ( 'AllImplementedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3082:1: ( ( 'AllImplementedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3082:1: ( ( 'AllImplementedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3083:1: ( 'AllImplementedTypes' )
            {
             before(grammarAccess.getTypeFieldAccess().getAllImplementedTypesAllImplementedTypesKeyword_8_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3084:1: ( 'AllImplementedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3085:1: 'AllImplementedTypes'
            {
             before(grammarAccess.getTypeFieldAccess().getAllImplementedTypesAllImplementedTypesKeyword_8_0()); 
            match(input,40,FOLLOW_40_in_rule__TypeField__AllImplementedTypesAssignment_86453); 
             after(grammarAccess.getTypeFieldAccess().getAllImplementedTypesAllImplementedTypesKeyword_8_0()); 

            }

             after(grammarAccess.getTypeFieldAccess().getAllImplementedTypesAllImplementedTypesKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeField__AllImplementedTypesAssignment_8"


    // $ANTLR start "rule__TypeField__AllExtendedTypesAssignment_9"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3100:1: rule__TypeField__AllExtendedTypesAssignment_9 : ( ( 'AllExtendedTypes' ) ) ;
    public final void rule__TypeField__AllExtendedTypesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3104:1: ( ( ( 'AllExtendedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3105:1: ( ( 'AllExtendedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3105:1: ( ( 'AllExtendedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3106:1: ( 'AllExtendedTypes' )
            {
             before(grammarAccess.getTypeFieldAccess().getAllExtendedTypesAllExtendedTypesKeyword_9_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3107:1: ( 'AllExtendedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3108:1: 'AllExtendedTypes'
            {
             before(grammarAccess.getTypeFieldAccess().getAllExtendedTypesAllExtendedTypesKeyword_9_0()); 
            match(input,41,FOLLOW_41_in_rule__TypeField__AllExtendedTypesAssignment_96497); 
             after(grammarAccess.getTypeFieldAccess().getAllExtendedTypesAllExtendedTypesKeyword_9_0()); 

            }

             after(grammarAccess.getTypeFieldAccess().getAllExtendedTypesAllExtendedTypesKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeField__AllExtendedTypesAssignment_9"


    // $ANTLR start "rule__TypeField__FieldTypeAssignment_10"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3123:1: rule__TypeField__FieldTypeAssignment_10 : ( ( 'FieldType' ) ) ;
    public final void rule__TypeField__FieldTypeAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3127:1: ( ( ( 'FieldType' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3128:1: ( ( 'FieldType' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3128:1: ( ( 'FieldType' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3129:1: ( 'FieldType' )
            {
             before(grammarAccess.getTypeFieldAccess().getFieldTypeFieldTypeKeyword_10_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3130:1: ( 'FieldType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3131:1: 'FieldType'
            {
             before(grammarAccess.getTypeFieldAccess().getFieldTypeFieldTypeKeyword_10_0()); 
            match(input,42,FOLLOW_42_in_rule__TypeField__FieldTypeAssignment_106541); 
             after(grammarAccess.getTypeFieldAccess().getFieldTypeFieldTypeKeyword_10_0()); 

            }

             after(grammarAccess.getTypeFieldAccess().getFieldTypeFieldTypeKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeField__FieldTypeAssignment_10"


    // $ANTLR start "rule__TypeField__CaughtTypeAssignment_11"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3146:1: rule__TypeField__CaughtTypeAssignment_11 : ( ( 'CaughtType' ) ) ;
    public final void rule__TypeField__CaughtTypeAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3150:1: ( ( ( 'CaughtType' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3151:1: ( ( 'CaughtType' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3151:1: ( ( 'CaughtType' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3152:1: ( 'CaughtType' )
            {
             before(grammarAccess.getTypeFieldAccess().getCaughtTypeCaughtTypeKeyword_11_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3153:1: ( 'CaughtType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3154:1: 'CaughtType'
            {
             before(grammarAccess.getTypeFieldAccess().getCaughtTypeCaughtTypeKeyword_11_0()); 
            match(input,43,FOLLOW_43_in_rule__TypeField__CaughtTypeAssignment_116585); 
             after(grammarAccess.getTypeFieldAccess().getCaughtTypeCaughtTypeKeyword_11_0()); 

            }

             after(grammarAccess.getTypeFieldAccess().getCaughtTypeCaughtTypeKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeField__CaughtTypeAssignment_11"


    // $ANTLR start "rule__TypeField__DeclaredFieldTypesAssignment_12"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3169:1: rule__TypeField__DeclaredFieldTypesAssignment_12 : ( ( 'DeclaredFieldTypes' ) ) ;
    public final void rule__TypeField__DeclaredFieldTypesAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3173:1: ( ( ( 'DeclaredFieldTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3174:1: ( ( 'DeclaredFieldTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3174:1: ( ( 'DeclaredFieldTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3175:1: ( 'DeclaredFieldTypes' )
            {
             before(grammarAccess.getTypeFieldAccess().getDeclaredFieldTypesDeclaredFieldTypesKeyword_12_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3176:1: ( 'DeclaredFieldTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3177:1: 'DeclaredFieldTypes'
            {
             before(grammarAccess.getTypeFieldAccess().getDeclaredFieldTypesDeclaredFieldTypesKeyword_12_0()); 
            match(input,44,FOLLOW_44_in_rule__TypeField__DeclaredFieldTypesAssignment_126629); 
             after(grammarAccess.getTypeFieldAccess().getDeclaredFieldTypesDeclaredFieldTypesKeyword_12_0()); 

            }

             after(grammarAccess.getTypeFieldAccess().getDeclaredFieldTypesDeclaredFieldTypesKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeField__DeclaredFieldTypesAssignment_12"


    // $ANTLR start "rule__TypeField__DeclaringTypeAssignment_13"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3192:1: rule__TypeField__DeclaringTypeAssignment_13 : ( ( 'DeclaringType' ) ) ;
    public final void rule__TypeField__DeclaringTypeAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3196:1: ( ( ( 'DeclaringType' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3197:1: ( ( 'DeclaringType' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3197:1: ( ( 'DeclaringType' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3198:1: ( 'DeclaringType' )
            {
             before(grammarAccess.getTypeFieldAccess().getDeclaringTypeDeclaringTypeKeyword_13_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3199:1: ( 'DeclaringType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3200:1: 'DeclaringType'
            {
             before(grammarAccess.getTypeFieldAccess().getDeclaringTypeDeclaringTypeKeyword_13_0()); 
            match(input,45,FOLLOW_45_in_rule__TypeField__DeclaringTypeAssignment_136673); 
             after(grammarAccess.getTypeFieldAccess().getDeclaringTypeDeclaringTypeKeyword_13_0()); 

            }

             after(grammarAccess.getTypeFieldAccess().getDeclaringTypeDeclaringTypeKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeField__DeclaringTypeAssignment_13"


    // $ANTLR start "rule__MethodField__UsedMethodsAssignment_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3215:1: rule__MethodField__UsedMethodsAssignment_0 : ( ( 'UsedMethods' ) ) ;
    public final void rule__MethodField__UsedMethodsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3219:1: ( ( ( 'UsedMethods' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3220:1: ( ( 'UsedMethods' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3220:1: ( ( 'UsedMethods' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3221:1: ( 'UsedMethods' )
            {
             before(grammarAccess.getMethodFieldAccess().getUsedMethodsUsedMethodsKeyword_0_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3222:1: ( 'UsedMethods' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3223:1: 'UsedMethods'
            {
             before(grammarAccess.getMethodFieldAccess().getUsedMethodsUsedMethodsKeyword_0_0()); 
            match(input,46,FOLLOW_46_in_rule__MethodField__UsedMethodsAssignment_06717); 
             after(grammarAccess.getMethodFieldAccess().getUsedMethodsUsedMethodsKeyword_0_0()); 

            }

             after(grammarAccess.getMethodFieldAccess().getUsedMethodsUsedMethodsKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodField__UsedMethodsAssignment_0"


    // $ANTLR start "rule__MethodField__UsedMethodsInTryAssignment_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3238:1: rule__MethodField__UsedMethodsInTryAssignment_1 : ( ( 'UsedMethodsInTry' ) ) ;
    public final void rule__MethodField__UsedMethodsInTryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3242:1: ( ( ( 'UsedMethodsInTry' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3243:1: ( ( 'UsedMethodsInTry' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3243:1: ( ( 'UsedMethodsInTry' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3244:1: ( 'UsedMethodsInTry' )
            {
             before(grammarAccess.getMethodFieldAccess().getUsedMethodsInTryUsedMethodsInTryKeyword_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3245:1: ( 'UsedMethodsInTry' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3246:1: 'UsedMethodsInTry'
            {
             before(grammarAccess.getMethodFieldAccess().getUsedMethodsInTryUsedMethodsInTryKeyword_1_0()); 
            match(input,47,FOLLOW_47_in_rule__MethodField__UsedMethodsInTryAssignment_16761); 
             after(grammarAccess.getMethodFieldAccess().getUsedMethodsInTryUsedMethodsInTryKeyword_1_0()); 

            }

             after(grammarAccess.getMethodFieldAccess().getUsedMethodsInTryUsedMethodsInTryKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodField__UsedMethodsInTryAssignment_1"


    // $ANTLR start "rule__MethodField__UsedMethodsInFinallyAssignment_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3261:1: rule__MethodField__UsedMethodsInFinallyAssignment_2 : ( ( 'UsedMethodsInFinally' ) ) ;
    public final void rule__MethodField__UsedMethodsInFinallyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3265:1: ( ( ( 'UsedMethodsInFinally' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3266:1: ( ( 'UsedMethodsInFinally' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3266:1: ( ( 'UsedMethodsInFinally' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3267:1: ( 'UsedMethodsInFinally' )
            {
             before(grammarAccess.getMethodFieldAccess().getUsedMethodsInFinallyUsedMethodsInFinallyKeyword_2_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3268:1: ( 'UsedMethodsInFinally' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3269:1: 'UsedMethodsInFinally'
            {
             before(grammarAccess.getMethodFieldAccess().getUsedMethodsInFinallyUsedMethodsInFinallyKeyword_2_0()); 
            match(input,48,FOLLOW_48_in_rule__MethodField__UsedMethodsInFinallyAssignment_26805); 
             after(grammarAccess.getMethodFieldAccess().getUsedMethodsInFinallyUsedMethodsInFinallyKeyword_2_0()); 

            }

             after(grammarAccess.getMethodFieldAccess().getUsedMethodsInFinallyUsedMethodsInFinallyKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodField__UsedMethodsInFinallyAssignment_2"


    // $ANTLR start "rule__MethodField__OverriddenMethodsAssignment_3"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3284:1: rule__MethodField__OverriddenMethodsAssignment_3 : ( ( 'OverriddenMethods' ) ) ;
    public final void rule__MethodField__OverriddenMethodsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3288:1: ( ( ( 'OverriddenMethods' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3289:1: ( ( 'OverriddenMethods' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3289:1: ( ( 'OverriddenMethods' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3290:1: ( 'OverriddenMethods' )
            {
             before(grammarAccess.getMethodFieldAccess().getOverriddenMethodsOverriddenMethodsKeyword_3_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3291:1: ( 'OverriddenMethods' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3292:1: 'OverriddenMethods'
            {
             before(grammarAccess.getMethodFieldAccess().getOverriddenMethodsOverriddenMethodsKeyword_3_0()); 
            match(input,49,FOLLOW_49_in_rule__MethodField__OverriddenMethodsAssignment_36849); 
             after(grammarAccess.getMethodFieldAccess().getOverriddenMethodsOverriddenMethodsKeyword_3_0()); 

            }

             after(grammarAccess.getMethodFieldAccess().getOverriddenMethodsOverriddenMethodsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodField__OverriddenMethodsAssignment_3"


    // $ANTLR start "rule__FilePathField__ResourcePathAssignment"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3307:1: rule__FilePathField__ResourcePathAssignment : ( ( 'ResourcePath' ) ) ;
    public final void rule__FilePathField__ResourcePathAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3311:1: ( ( ( 'ResourcePath' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3312:1: ( ( 'ResourcePath' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3312:1: ( ( 'ResourcePath' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3313:1: ( 'ResourcePath' )
            {
             before(grammarAccess.getFilePathFieldAccess().getResourcePathResourcePathKeyword_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3314:1: ( 'ResourcePath' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3315:1: 'ResourcePath'
            {
             before(grammarAccess.getFilePathFieldAccess().getResourcePathResourcePathKeyword_0()); 
            match(input,50,FOLLOW_50_in_rule__FilePathField__ResourcePathAssignment6893); 
             after(grammarAccess.getFilePathFieldAccess().getResourcePathResourcePathKeyword_0()); 

            }

             after(grammarAccess.getFilePathFieldAccess().getResourcePathResourcePathKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilePathField__ResourcePathAssignment"


    // $ANTLR start "rule__NumberField__ParameterCountAssignment"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3330:1: rule__NumberField__ParameterCountAssignment : ( ( 'ParameterCount' ) ) ;
    public final void rule__NumberField__ParameterCountAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3334:1: ( ( ( 'ParameterCount' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3335:1: ( ( 'ParameterCount' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3335:1: ( ( 'ParameterCount' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3336:1: ( 'ParameterCount' )
            {
             before(grammarAccess.getNumberFieldAccess().getParameterCountParameterCountKeyword_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3337:1: ( 'ParameterCount' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3338:1: 'ParameterCount'
            {
             before(grammarAccess.getNumberFieldAccess().getParameterCountParameterCountKeyword_0()); 
            match(input,51,FOLLOW_51_in_rule__NumberField__ParameterCountAssignment6937); 
             after(grammarAccess.getNumberFieldAccess().getParameterCountParameterCountKeyword_0()); 

            }

             after(grammarAccess.getNumberFieldAccess().getParameterCountParameterCountKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberField__ParameterCountAssignment"


    // $ANTLR start "rule__ModifierField__ModifiersAssignment"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3353:1: rule__ModifierField__ModifiersAssignment : ( ( 'Modifiers' ) ) ;
    public final void rule__ModifierField__ModifiersAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3357:1: ( ( ( 'Modifiers' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3358:1: ( ( 'Modifiers' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3358:1: ( ( 'Modifiers' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3359:1: ( 'Modifiers' )
            {
             before(grammarAccess.getModifierFieldAccess().getModifiersModifiersKeyword_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3360:1: ( 'Modifiers' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3361:1: 'Modifiers'
            {
             before(grammarAccess.getModifierFieldAccess().getModifiersModifiersKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__ModifierField__ModifiersAssignment6981); 
             after(grammarAccess.getModifierFieldAccess().getModifiersModifiersKeyword_0()); 

            }

             after(grammarAccess.getModifierFieldAccess().getModifiersModifiersKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifierField__ModifiersAssignment"


    // $ANTLR start "rule__TimeField__TimestampAssignment"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3376:1: rule__TimeField__TimestampAssignment : ( ( 'Timestamp' ) ) ;
    public final void rule__TimeField__TimestampAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3380:1: ( ( ( 'Timestamp' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3381:1: ( ( 'Timestamp' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3381:1: ( ( 'Timestamp' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3382:1: ( 'Timestamp' )
            {
             before(grammarAccess.getTimeFieldAccess().getTimestampTimestampKeyword_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3383:1: ( 'Timestamp' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3384:1: 'Timestamp'
            {
             before(grammarAccess.getTimeFieldAccess().getTimestampTimestampKeyword_0()); 
            match(input,53,FOLLOW_53_in_rule__TimeField__TimestampAssignment7025); 
             after(grammarAccess.getTimeFieldAccess().getTimestampTimestampKeyword_0()); 

            }

             after(grammarAccess.getTimeFieldAccess().getTimestampTimestampKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeField__TimestampAssignment"


    // $ANTLR start "rule__DocumentTypeField__TypeAssignment"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3399:1: rule__DocumentTypeField__TypeAssignment : ( ( 'Type' ) ) ;
    public final void rule__DocumentTypeField__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3403:1: ( ( ( 'Type' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3404:1: ( ( 'Type' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3404:1: ( ( 'Type' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3405:1: ( 'Type' )
            {
             before(grammarAccess.getDocumentTypeFieldAccess().getTypeTypeKeyword_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3406:1: ( 'Type' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3407:1: 'Type'
            {
             before(grammarAccess.getDocumentTypeFieldAccess().getTypeTypeKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__DocumentTypeField__TypeAssignment7069); 
             after(grammarAccess.getDocumentTypeFieldAccess().getTypeTypeKeyword_0()); 

            }

             after(grammarAccess.getDocumentTypeFieldAccess().getTypeTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentTypeField__TypeAssignment"


    // $ANTLR start "rule__ProjectNameField__ProjectNameAssignment"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3422:1: rule__ProjectNameField__ProjectNameAssignment : ( ( 'ProjectName' ) ) ;
    public final void rule__ProjectNameField__ProjectNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3426:1: ( ( ( 'ProjectName' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3427:1: ( ( 'ProjectName' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3427:1: ( ( 'ProjectName' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3428:1: ( 'ProjectName' )
            {
             before(grammarAccess.getProjectNameFieldAccess().getProjectNameProjectNameKeyword_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3429:1: ( 'ProjectName' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3430:1: 'ProjectName'
            {
             before(grammarAccess.getProjectNameFieldAccess().getProjectNameProjectNameKeyword_0()); 
            match(input,55,FOLLOW_55_in_rule__ProjectNameField__ProjectNameAssignment7113); 
             after(grammarAccess.getProjectNameFieldAccess().getProjectNameProjectNameKeyword_0()); 

            }

             after(grammarAccess.getProjectNameFieldAccess().getProjectNameProjectNameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectNameField__ProjectNameAssignment"


    // $ANTLR start "rule__AnnotationField__AnnotationsAssignment"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3445:1: rule__AnnotationField__AnnotationsAssignment : ( ( 'Annotations' ) ) ;
    public final void rule__AnnotationField__AnnotationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3449:1: ( ( ( 'Annotations' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3450:1: ( ( 'Annotations' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3450:1: ( ( 'Annotations' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3451:1: ( 'Annotations' )
            {
             before(grammarAccess.getAnnotationFieldAccess().getAnnotationsAnnotationsKeyword_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3452:1: ( 'Annotations' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3453:1: 'Annotations'
            {
             before(grammarAccess.getAnnotationFieldAccess().getAnnotationsAnnotationsKeyword_0()); 
            match(input,56,FOLLOW_56_in_rule__AnnotationField__AnnotationsAssignment7157); 
             after(grammarAccess.getAnnotationFieldAccess().getAnnotationsAnnotationsKeyword_0()); 

            }

             after(grammarAccess.getAnnotationFieldAccess().getAnnotationsAnnotationsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationField__AnnotationsAssignment"


    // $ANTLR start "rule__SimpleField__FullyQualifiedNameAssignment_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3468:1: rule__SimpleField__FullyQualifiedNameAssignment_0 : ( ( 'FullyQualifiedName' ) ) ;
    public final void rule__SimpleField__FullyQualifiedNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3472:1: ( ( ( 'FullyQualifiedName' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3473:1: ( ( 'FullyQualifiedName' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3473:1: ( ( 'FullyQualifiedName' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3474:1: ( 'FullyQualifiedName' )
            {
             before(grammarAccess.getSimpleFieldAccess().getFullyQualifiedNameFullyQualifiedNameKeyword_0_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3475:1: ( 'FullyQualifiedName' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3476:1: 'FullyQualifiedName'
            {
             before(grammarAccess.getSimpleFieldAccess().getFullyQualifiedNameFullyQualifiedNameKeyword_0_0()); 
            match(input,57,FOLLOW_57_in_rule__SimpleField__FullyQualifiedNameAssignment_07201); 
             after(grammarAccess.getSimpleFieldAccess().getFullyQualifiedNameFullyQualifiedNameKeyword_0_0()); 

            }

             after(grammarAccess.getSimpleFieldAccess().getFullyQualifiedNameFullyQualifiedNameKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleField__FullyQualifiedNameAssignment_0"


    // $ANTLR start "rule__SimpleField__FriendlyNameAssignment_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3491:1: rule__SimpleField__FriendlyNameAssignment_1 : ( ( 'FriendlyName' ) ) ;
    public final void rule__SimpleField__FriendlyNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3495:1: ( ( ( 'FriendlyName' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3496:1: ( ( 'FriendlyName' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3496:1: ( ( 'FriendlyName' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3497:1: ( 'FriendlyName' )
            {
             before(grammarAccess.getSimpleFieldAccess().getFriendlyNameFriendlyNameKeyword_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3498:1: ( 'FriendlyName' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3499:1: 'FriendlyName'
            {
             before(grammarAccess.getSimpleFieldAccess().getFriendlyNameFriendlyNameKeyword_1_0()); 
            match(input,58,FOLLOW_58_in_rule__SimpleField__FriendlyNameAssignment_17245); 
             after(grammarAccess.getSimpleFieldAccess().getFriendlyNameFriendlyNameKeyword_1_0()); 

            }

             after(grammarAccess.getSimpleFieldAccess().getFriendlyNameFriendlyNameKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleField__FriendlyNameAssignment_1"


    // $ANTLR start "rule__SimpleField__DeclaredMethodsAssignment_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3514:1: rule__SimpleField__DeclaredMethodsAssignment_2 : ( ( 'DeclaredMethods' ) ) ;
    public final void rule__SimpleField__DeclaredMethodsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3518:1: ( ( ( 'DeclaredMethods' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3519:1: ( ( 'DeclaredMethods' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3519:1: ( ( 'DeclaredMethods' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3520:1: ( 'DeclaredMethods' )
            {
             before(grammarAccess.getSimpleFieldAccess().getDeclaredMethodsDeclaredMethodsKeyword_2_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3521:1: ( 'DeclaredMethods' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3522:1: 'DeclaredMethods'
            {
             before(grammarAccess.getSimpleFieldAccess().getDeclaredMethodsDeclaredMethodsKeyword_2_0()); 
            match(input,59,FOLLOW_59_in_rule__SimpleField__DeclaredMethodsAssignment_27289); 
             after(grammarAccess.getSimpleFieldAccess().getDeclaredMethodsDeclaredMethodsKeyword_2_0()); 

            }

             after(grammarAccess.getSimpleFieldAccess().getDeclaredMethodsDeclaredMethodsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleField__DeclaredMethodsAssignment_2"


    // $ANTLR start "rule__SimpleField__ReturnVariableEexpressionsAssignment_3"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3537:1: rule__SimpleField__ReturnVariableEexpressionsAssignment_3 : ( ( 'ReturnVariableEexpressions' ) ) ;
    public final void rule__SimpleField__ReturnVariableEexpressionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3541:1: ( ( ( 'ReturnVariableEexpressions' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3542:1: ( ( 'ReturnVariableEexpressions' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3542:1: ( ( 'ReturnVariableEexpressions' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3543:1: ( 'ReturnVariableEexpressions' )
            {
             before(grammarAccess.getSimpleFieldAccess().getReturnVariableEexpressionsReturnVariableEexpressionsKeyword_3_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3544:1: ( 'ReturnVariableEexpressions' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3545:1: 'ReturnVariableEexpressions'
            {
             before(grammarAccess.getSimpleFieldAccess().getReturnVariableEexpressionsReturnVariableEexpressionsKeyword_3_0()); 
            match(input,60,FOLLOW_60_in_rule__SimpleField__ReturnVariableEexpressionsAssignment_37333); 
             after(grammarAccess.getSimpleFieldAccess().getReturnVariableEexpressionsReturnVariableEexpressionsKeyword_3_0()); 

            }

             after(grammarAccess.getSimpleFieldAccess().getReturnVariableEexpressionsReturnVariableEexpressionsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleField__ReturnVariableEexpressionsAssignment_3"


    // $ANTLR start "rule__SimpleField__AllDeclaredMethodNamesAssignment_4"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3560:1: rule__SimpleField__AllDeclaredMethodNamesAssignment_4 : ( ( 'AllDeclaredMethodNames' ) ) ;
    public final void rule__SimpleField__AllDeclaredMethodNamesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3564:1: ( ( ( 'AllDeclaredMethodNames' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3565:1: ( ( 'AllDeclaredMethodNames' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3565:1: ( ( 'AllDeclaredMethodNames' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3566:1: ( 'AllDeclaredMethodNames' )
            {
             before(grammarAccess.getSimpleFieldAccess().getAllDeclaredMethodNamesAllDeclaredMethodNamesKeyword_4_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3567:1: ( 'AllDeclaredMethodNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3568:1: 'AllDeclaredMethodNames'
            {
             before(grammarAccess.getSimpleFieldAccess().getAllDeclaredMethodNamesAllDeclaredMethodNamesKeyword_4_0()); 
            match(input,61,FOLLOW_61_in_rule__SimpleField__AllDeclaredMethodNamesAssignment_47377); 
             after(grammarAccess.getSimpleFieldAccess().getAllDeclaredMethodNamesAllDeclaredMethodNamesKeyword_4_0()); 

            }

             after(grammarAccess.getSimpleFieldAccess().getAllDeclaredMethodNamesAllDeclaredMethodNamesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleField__AllDeclaredMethodNamesAssignment_4"


    // $ANTLR start "rule__SimpleField__DeclaredMethodNamesAssignment_5"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3583:1: rule__SimpleField__DeclaredMethodNamesAssignment_5 : ( ( 'DeclaredMethodNames' ) ) ;
    public final void rule__SimpleField__DeclaredMethodNamesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3587:1: ( ( ( 'DeclaredMethodNames' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3588:1: ( ( 'DeclaredMethodNames' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3588:1: ( ( 'DeclaredMethodNames' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3589:1: ( 'DeclaredMethodNames' )
            {
             before(grammarAccess.getSimpleFieldAccess().getDeclaredMethodNamesDeclaredMethodNamesKeyword_5_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3590:1: ( 'DeclaredMethodNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3591:1: 'DeclaredMethodNames'
            {
             before(grammarAccess.getSimpleFieldAccess().getDeclaredMethodNamesDeclaredMethodNamesKeyword_5_0()); 
            match(input,62,FOLLOW_62_in_rule__SimpleField__DeclaredMethodNamesAssignment_57421); 
             after(grammarAccess.getSimpleFieldAccess().getDeclaredMethodNamesDeclaredMethodNamesKeyword_5_0()); 

            }

             after(grammarAccess.getSimpleFieldAccess().getDeclaredMethodNamesDeclaredMethodNamesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleField__DeclaredMethodNamesAssignment_5"


    // $ANTLR start "rule__SimpleField__DeclaredFieldNamesAssignment_6"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3606:1: rule__SimpleField__DeclaredFieldNamesAssignment_6 : ( ( 'DeclaredFieldNames' ) ) ;
    public final void rule__SimpleField__DeclaredFieldNamesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3610:1: ( ( ( 'DeclaredFieldNames' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3611:1: ( ( 'DeclaredFieldNames' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3611:1: ( ( 'DeclaredFieldNames' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3612:1: ( 'DeclaredFieldNames' )
            {
             before(grammarAccess.getSimpleFieldAccess().getDeclaredFieldNamesDeclaredFieldNamesKeyword_6_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3613:1: ( 'DeclaredFieldNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3614:1: 'DeclaredFieldNames'
            {
             before(grammarAccess.getSimpleFieldAccess().getDeclaredFieldNamesDeclaredFieldNamesKeyword_6_0()); 
            match(input,63,FOLLOW_63_in_rule__SimpleField__DeclaredFieldNamesAssignment_67465); 
             after(grammarAccess.getSimpleFieldAccess().getDeclaredFieldNamesDeclaredFieldNamesKeyword_6_0()); 

            }

             after(grammarAccess.getSimpleFieldAccess().getDeclaredFieldNamesDeclaredFieldNamesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleField__DeclaredFieldNamesAssignment_6"


    // $ANTLR start "rule__SimpleField__AllDeclaredFieldNamesAssignment_7"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3629:1: rule__SimpleField__AllDeclaredFieldNamesAssignment_7 : ( ( 'AllDeclaredFieldNames' ) ) ;
    public final void rule__SimpleField__AllDeclaredFieldNamesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3633:1: ( ( ( 'AllDeclaredFieldNames' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3634:1: ( ( 'AllDeclaredFieldNames' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3634:1: ( ( 'AllDeclaredFieldNames' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3635:1: ( 'AllDeclaredFieldNames' )
            {
             before(grammarAccess.getSimpleFieldAccess().getAllDeclaredFieldNamesAllDeclaredFieldNamesKeyword_7_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3636:1: ( 'AllDeclaredFieldNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3637:1: 'AllDeclaredFieldNames'
            {
             before(grammarAccess.getSimpleFieldAccess().getAllDeclaredFieldNamesAllDeclaredFieldNamesKeyword_7_0()); 
            match(input,64,FOLLOW_64_in_rule__SimpleField__AllDeclaredFieldNamesAssignment_77509); 
             after(grammarAccess.getSimpleFieldAccess().getAllDeclaredFieldNamesAllDeclaredFieldNamesKeyword_7_0()); 

            }

             after(grammarAccess.getSimpleFieldAccess().getAllDeclaredFieldNamesAllDeclaredFieldNamesKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleField__AllDeclaredFieldNamesAssignment_7"


    // $ANTLR start "rule__SimpleField__FullTextAssignment_8"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3652:1: rule__SimpleField__FullTextAssignment_8 : ( ( 'FullText' ) ) ;
    public final void rule__SimpleField__FullTextAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3656:1: ( ( ( 'FullText' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3657:1: ( ( 'FullText' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3657:1: ( ( 'FullText' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3658:1: ( 'FullText' )
            {
             before(grammarAccess.getSimpleFieldAccess().getFullTextFullTextKeyword_8_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3659:1: ( 'FullText' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3660:1: 'FullText'
            {
             before(grammarAccess.getSimpleFieldAccess().getFullTextFullTextKeyword_8_0()); 
            match(input,65,FOLLOW_65_in_rule__SimpleField__FullTextAssignment_87553); 
             after(grammarAccess.getSimpleFieldAccess().getFullTextFullTextKeyword_8_0()); 

            }

             after(grammarAccess.getSimpleFieldAccess().getFullTextFullTextKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleField__FullTextAssignment_8"


    // $ANTLR start "rule__SimpleField__FieldsReadAssignment_9"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3675:1: rule__SimpleField__FieldsReadAssignment_9 : ( ( 'FieldsRead' ) ) ;
    public final void rule__SimpleField__FieldsReadAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3679:1: ( ( ( 'FieldsRead' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3680:1: ( ( 'FieldsRead' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3680:1: ( ( 'FieldsRead' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3681:1: ( 'FieldsRead' )
            {
             before(grammarAccess.getSimpleFieldAccess().getFieldsReadFieldsReadKeyword_9_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3682:1: ( 'FieldsRead' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3683:1: 'FieldsRead'
            {
             before(grammarAccess.getSimpleFieldAccess().getFieldsReadFieldsReadKeyword_9_0()); 
            match(input,66,FOLLOW_66_in_rule__SimpleField__FieldsReadAssignment_97597); 
             after(grammarAccess.getSimpleFieldAccess().getFieldsReadFieldsReadKeyword_9_0()); 

            }

             after(grammarAccess.getSimpleFieldAccess().getFieldsReadFieldsReadKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleField__FieldsReadAssignment_9"


    // $ANTLR start "rule__SimpleField__FieldsWrittenAssignment_10"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3698:1: rule__SimpleField__FieldsWrittenAssignment_10 : ( ( 'FieldsWritten' ) ) ;
    public final void rule__SimpleField__FieldsWrittenAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3702:1: ( ( ( 'FieldsWritten' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3703:1: ( ( 'FieldsWritten' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3703:1: ( ( 'FieldsWritten' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3704:1: ( 'FieldsWritten' )
            {
             before(grammarAccess.getSimpleFieldAccess().getFieldsWrittenFieldsWrittenKeyword_10_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3705:1: ( 'FieldsWritten' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3706:1: 'FieldsWritten'
            {
             before(grammarAccess.getSimpleFieldAccess().getFieldsWrittenFieldsWrittenKeyword_10_0()); 
            match(input,67,FOLLOW_67_in_rule__SimpleField__FieldsWrittenAssignment_107641); 
             after(grammarAccess.getSimpleFieldAccess().getFieldsWrittenFieldsWrittenKeyword_10_0()); 

            }

             after(grammarAccess.getSimpleFieldAccess().getFieldsWrittenFieldsWrittenKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleField__FieldsWrittenAssignment_10"


    // $ANTLR start "rule__SimpleField__UsedFieldsInFinallyAssignment_11"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3721:1: rule__SimpleField__UsedFieldsInFinallyAssignment_11 : ( ( 'UsedFieldsInFinally' ) ) ;
    public final void rule__SimpleField__UsedFieldsInFinallyAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3725:1: ( ( ( 'UsedFieldsInFinally' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3726:1: ( ( 'UsedFieldsInFinally' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3726:1: ( ( 'UsedFieldsInFinally' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3727:1: ( 'UsedFieldsInFinally' )
            {
             before(grammarAccess.getSimpleFieldAccess().getUsedFieldsInFinallyUsedFieldsInFinallyKeyword_11_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3728:1: ( 'UsedFieldsInFinally' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3729:1: 'UsedFieldsInFinally'
            {
             before(grammarAccess.getSimpleFieldAccess().getUsedFieldsInFinallyUsedFieldsInFinallyKeyword_11_0()); 
            match(input,68,FOLLOW_68_in_rule__SimpleField__UsedFieldsInFinallyAssignment_117685); 
             after(grammarAccess.getSimpleFieldAccess().getUsedFieldsInFinallyUsedFieldsInFinallyKeyword_11_0()); 

            }

             after(grammarAccess.getSimpleFieldAccess().getUsedFieldsInFinallyUsedFieldsInFinallyKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleField__UsedFieldsInFinallyAssignment_11"


    // $ANTLR start "rule__SimpleField__UsedFieldsInTryAssignment_12"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3744:1: rule__SimpleField__UsedFieldsInTryAssignment_12 : ( ( 'UsedFieldsInTry' ) ) ;
    public final void rule__SimpleField__UsedFieldsInTryAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3748:1: ( ( ( 'UsedFieldsInTry' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3749:1: ( ( 'UsedFieldsInTry' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3749:1: ( ( 'UsedFieldsInTry' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3750:1: ( 'UsedFieldsInTry' )
            {
             before(grammarAccess.getSimpleFieldAccess().getUsedFieldsInTryUsedFieldsInTryKeyword_12_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3751:1: ( 'UsedFieldsInTry' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3752:1: 'UsedFieldsInTry'
            {
             before(grammarAccess.getSimpleFieldAccess().getUsedFieldsInTryUsedFieldsInTryKeyword_12_0()); 
            match(input,69,FOLLOW_69_in_rule__SimpleField__UsedFieldsInTryAssignment_127729); 
             after(grammarAccess.getSimpleFieldAccess().getUsedFieldsInTryUsedFieldsInTryKeyword_12_0()); 

            }

             after(grammarAccess.getSimpleFieldAccess().getUsedFieldsInTryUsedFieldsInTryKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleField__UsedFieldsInTryAssignment_12"

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
    public static final BitSet FOLLOW_ruleTypeField_in_entryRuleTypeField241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeField248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__Alternatives_in_ruleTypeField274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodField_in_entryRuleMethodField301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodField308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodField__Alternatives_in_ruleMethodField334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilePathField_in_entryRuleFilePathField361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilePathField368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilePathField__ResourcePathAssignment_in_ruleFilePathField394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberField_in_entryRuleNumberField421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberField428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberField__ParameterCountAssignment_in_ruleNumberField454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierField_in_entryRuleModifierField481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifierField488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifierField__ModifiersAssignment_in_ruleModifierField514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeField_in_entryRuleTimeField541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeField548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeField__TimestampAssignment_in_ruleTimeField574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentTypeField_in_entryRuleDocumentTypeField601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocumentTypeField608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentTypeField__TypeAssignment_in_ruleDocumentTypeField634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectNameField_in_entryRuleProjectNameField661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjectNameField668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectNameField__ProjectNameAssignment_in_ruleProjectNameField694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationField_in_entryRuleAnnotationField721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationField728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationField__AnnotationsAssignment_in_ruleAnnotationField754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleField_in_entryRuleSimpleField781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleField788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__Alternatives_in_ruleSimpleField814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFieldValue_in_entryRuleSimpleFieldValue841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleFieldValue848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleSimpleFieldValue874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodFieldValue_in_entryRuleMethodFieldValue900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodFieldValue907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleMethodFieldValue933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectNameFieldValue_in_entryRuleProjectNameFieldValue959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjectNameFieldValue966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleProjectNameFieldValue992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberFieldValue_in_entryRuleNumberFieldValue1018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberFieldValue1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumberFieldValue1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierFieldValue_in_entryRuleModifierFieldValue1077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifierFieldValue1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifierFieldValue__Alternatives_in_ruleModifierFieldValue1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeFieldValue_in_entryRuleTimeFieldValue1137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeFieldValue1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleTimeFieldValue1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentTypeFieldValue_in_entryRuleDocumentTypeFieldValue1196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocumentTypeFieldValue1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentTypeFieldValue__Alternatives_in_ruleDocumentTypeFieldValue1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationFieldValue_in_entryRuleAnnotationFieldValue1256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationFieldValue1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleAnnotationFieldValue1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFieldValue_in_entryRuleTypeFieldValue1315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeFieldValue1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleTypeFieldValue1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilePathFieldValue_in_entryRuleFilePathFieldValue1374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilePathFieldValue1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PATHWITHWC_in_ruleFilePathFieldValue1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression1433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Alternatives_in_ruleUnaryExpression1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryExp__Alternatives_in_ruleBinaryExp1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__ValueAssignment_0_in_rule__Exp2__Alternatives1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__0_in_rule__Exp2__Alternatives1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__DefaultAssignment_1_0_in_rule__ClauseExpression__Alternatives_11589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Alternatives_1_1_in_rule__ClauseExpression__Alternatives_11607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_0__0_in_rule__ClauseExpression__Alternatives_1_11640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_1__0_in_rule__ClauseExpression__Alternatives_1_11658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_2__0_in_rule__ClauseExpression__Alternatives_1_11676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_3__0_in_rule__ClauseExpression__Alternatives_1_11694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_4__0_in_rule__ClauseExpression__Alternatives_1_11712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_5__0_in_rule__ClauseExpression__Alternatives_1_11730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_6__0_in_rule__ClauseExpression__Alternatives_1_11748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_7__0_in_rule__ClauseExpression__Alternatives_1_11766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_8__0_in_rule__ClauseExpression__Alternatives_1_11784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_9__0_in_rule__ClauseExpression__Alternatives_1_11802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__ImplementedTypesAssignment_0_in_rule__TypeField__Alternatives1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__ExtendedTypesAssignment_1_in_rule__TypeField__Alternatives1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__UsedTypesAssignment_2_in_rule__TypeField__Alternatives1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__UsedTypesInTryAssignment_3_in_rule__TypeField__Alternatives1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__UsedTypesInFinallyAssignment_4_in_rule__TypeField__Alternatives1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__ParameterTypesAssignment_5_in_rule__TypeField__Alternatives1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__ReturnTypeAssignment_6_in_rule__TypeField__Alternatives1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__InstanceofTypesAssignment_7_in_rule__TypeField__Alternatives1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__AllImplementedTypesAssignment_8_in_rule__TypeField__Alternatives1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__AllExtendedTypesAssignment_9_in_rule__TypeField__Alternatives1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__FieldTypeAssignment_10_in_rule__TypeField__Alternatives2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__CaughtTypeAssignment_11_in_rule__TypeField__Alternatives2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__DeclaredFieldTypesAssignment_12_in_rule__TypeField__Alternatives2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__DeclaringTypeAssignment_13_in_rule__TypeField__Alternatives2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodField__UsedMethodsAssignment_0_in_rule__MethodField__Alternatives2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodField__UsedMethodsInTryAssignment_1_in_rule__MethodField__Alternatives2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodField__UsedMethodsInFinallyAssignment_2_in_rule__MethodField__Alternatives2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodField__OverriddenMethodsAssignment_3_in_rule__MethodField__Alternatives2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__FullyQualifiedNameAssignment_0_in_rule__SimpleField__Alternatives2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__FriendlyNameAssignment_1_in_rule__SimpleField__Alternatives2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__DeclaredMethodsAssignment_2_in_rule__SimpleField__Alternatives2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__ReturnVariableEexpressionsAssignment_3_in_rule__SimpleField__Alternatives2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__AllDeclaredMethodNamesAssignment_4_in_rule__SimpleField__Alternatives2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__DeclaredMethodNamesAssignment_5_in_rule__SimpleField__Alternatives2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__DeclaredFieldNamesAssignment_6_in_rule__SimpleField__Alternatives2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__AllDeclaredFieldNamesAssignment_7_in_rule__SimpleField__Alternatives2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__FullTextAssignment_8_in_rule__SimpleField__Alternatives2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__FieldsReadAssignment_9_in_rule__SimpleField__Alternatives2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__FieldsWrittenAssignment_10_in_rule__SimpleField__Alternatives2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__UsedFieldsInFinallyAssignment_11_in_rule__SimpleField__Alternatives2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__UsedFieldsInTryAssignment_12_in_rule__SimpleField__Alternatives2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ModifierFieldValue__Alternatives2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ModifierFieldValue__Alternatives2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ModifierFieldValue__Alternatives2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ModifierFieldValue__Alternatives2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ModifierFieldValue__Alternatives2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ModifierFieldValue__Alternatives2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DocumentTypeFieldValue__Alternatives2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DocumentTypeFieldValue__Alternatives2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DocumentTypeFieldValue__Alternatives2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DocumentTypeFieldValue__Alternatives2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__UnaryExpression__Alternatives2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__UnaryExpression__Alternatives2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__UnaryExpression__Alternatives2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__UnaryExpression__Alternatives2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BinaryExp__Alternatives2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BinaryExp__Alternatives2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group__0__Impl_in_rule__Exp1__Group__02818 = new BitSet(new long[]{0xFFFFFFFF3F800010L,0x000000000000003FL});
    public static final BitSet FOLLOW_rule__Exp1__Group__1_in_rule__Exp1__Group__02821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp2_in_rule__Exp1__Group__0__Impl2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group__1__Impl_in_rule__Exp1__Group__12877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__0_in_rule__Exp1__Group__1__Impl2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__0__Impl_in_rule__Exp1__Group_1__02939 = new BitSet(new long[]{0xFFFFFFFF3F800010L,0x000000000000003FL});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__1_in_rule__Exp1__Group_1__02942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__1__Impl_in_rule__Exp1__Group_1__13000 = new BitSet(new long[]{0xFFFFFFFF3F800010L,0x000000000000003FL});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__2_in_rule__Exp1__Group_1__13003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__BAssignment_1_1_in_rule__Exp1__Group_1__1__Impl3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__2__Impl_in_rule__Exp1__Group_1__23061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__RightAssignment_1_2_in_rule__Exp1__Group_1__2__Impl3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__0__Impl_in_rule__Exp2__Group_1__03124 = new BitSet(new long[]{0xFFFFFFFF3F800010L,0x000000000000003FL});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__1_in_rule__Exp2__Group_1__03127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__Exp2__Group_1__0__Impl3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__1__Impl_in_rule__Exp2__Group_1__13186 = new BitSet(new long[]{0xFFFFFFFF3F800010L,0x000000000000003FL});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__2_in_rule__Exp2__Group_1__13189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Exp2__Group_1__1__Impl3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__2__Impl_in_rule__Exp2__Group_1__23248 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__3_in_rule__Exp2__Group_1__23251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp1_in_rule__Exp2__Group_1__2__Impl3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__3__Impl_in_rule__Exp2__Group_1__33307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Exp2__Group_1__3__Impl3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group__0__Impl_in_rule__ClauseExpression__Group__03374 = new BitSet(new long[]{0xFFFFFFFF07800010L,0x000000000000003FL});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group__1_in_rule__ClauseExpression__Group__03377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__ClauseExpression__Group__0__Impl3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group__1__Impl_in_rule__ClauseExpression__Group__13436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Alternatives_1_in_rule__ClauseExpression__Group__1__Impl3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_0__0__Impl_in_rule__ClauseExpression__Group_1_1_0__03497 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_0__1_in_rule__ClauseExpression__Group_1_1_0__03500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_0_0_in_rule__ClauseExpression__Group_1_1_0__0__Impl3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_0__1__Impl_in_rule__ClauseExpression__Group_1_1_0__13557 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_0__2_in_rule__ClauseExpression__Group_1_1_0__13560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_1_0__1__Impl3588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_0__2__Impl_in_rule__ClauseExpression__Group_1_1_0__23619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValueAssignment_1_1_0_2_in_rule__ClauseExpression__Group_1_1_0__2__Impl3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_1__0__Impl_in_rule__ClauseExpression__Group_1_1_1__03682 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_1__1_in_rule__ClauseExpression__Group_1_1_1__03685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_1_0_in_rule__ClauseExpression__Group_1_1_1__0__Impl3712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_1__1__Impl_in_rule__ClauseExpression__Group_1_1_1__13742 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_1__2_in_rule__ClauseExpression__Group_1_1_1__13745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_1_1__1__Impl3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_1__2__Impl_in_rule__ClauseExpression__Group_1_1_1__23804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValueAssignment_1_1_1_2_in_rule__ClauseExpression__Group_1_1_1__2__Impl3831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_2__0__Impl_in_rule__ClauseExpression__Group_1_1_2__03867 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_2__1_in_rule__ClauseExpression__Group_1_1_2__03870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_2_0_in_rule__ClauseExpression__Group_1_1_2__0__Impl3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_2__1__Impl_in_rule__ClauseExpression__Group_1_1_2__13927 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_2__2_in_rule__ClauseExpression__Group_1_1_2__13930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_1_2__1__Impl3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_2__2__Impl_in_rule__ClauseExpression__Group_1_1_2__23989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValueAssignment_1_1_2_2_in_rule__ClauseExpression__Group_1_1_2__2__Impl4016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_3__0__Impl_in_rule__ClauseExpression__Group_1_1_3__04052 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_3__1_in_rule__ClauseExpression__Group_1_1_3__04055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_3_0_in_rule__ClauseExpression__Group_1_1_3__0__Impl4082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_3__1__Impl_in_rule__ClauseExpression__Group_1_1_3__14112 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_3__2_in_rule__ClauseExpression__Group_1_1_3__14115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_1_3__1__Impl4143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_3__2__Impl_in_rule__ClauseExpression__Group_1_1_3__24174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValueAssignment_1_1_3_2_in_rule__ClauseExpression__Group_1_1_3__2__Impl4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_4__0__Impl_in_rule__ClauseExpression__Group_1_1_4__04237 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_4__1_in_rule__ClauseExpression__Group_1_1_4__04240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_4_0_in_rule__ClauseExpression__Group_1_1_4__0__Impl4267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_4__1__Impl_in_rule__ClauseExpression__Group_1_1_4__14297 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_4__2_in_rule__ClauseExpression__Group_1_1_4__14300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_1_4__1__Impl4328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_4__2__Impl_in_rule__ClauseExpression__Group_1_1_4__24359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValueAssignment_1_1_4_2_in_rule__ClauseExpression__Group_1_1_4__2__Impl4386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_5__0__Impl_in_rule__ClauseExpression__Group_1_1_5__04422 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_5__1_in_rule__ClauseExpression__Group_1_1_5__04425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_5_0_in_rule__ClauseExpression__Group_1_1_5__0__Impl4452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_5__1__Impl_in_rule__ClauseExpression__Group_1_1_5__14482 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_5__2_in_rule__ClauseExpression__Group_1_1_5__14485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_1_5__1__Impl4513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_5__2__Impl_in_rule__ClauseExpression__Group_1_1_5__24544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValueAssignment_1_1_5_2_in_rule__ClauseExpression__Group_1_1_5__2__Impl4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_6__0__Impl_in_rule__ClauseExpression__Group_1_1_6__04607 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_6__1_in_rule__ClauseExpression__Group_1_1_6__04610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_6_0_in_rule__ClauseExpression__Group_1_1_6__0__Impl4637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_6__1__Impl_in_rule__ClauseExpression__Group_1_1_6__14667 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_6__2_in_rule__ClauseExpression__Group_1_1_6__14670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_1_6__1__Impl4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_6__2__Impl_in_rule__ClauseExpression__Group_1_1_6__24729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValueAssignment_1_1_6_2_in_rule__ClauseExpression__Group_1_1_6__2__Impl4756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_7__0__Impl_in_rule__ClauseExpression__Group_1_1_7__04792 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_7__1_in_rule__ClauseExpression__Group_1_1_7__04795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_7_0_in_rule__ClauseExpression__Group_1_1_7__0__Impl4822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_7__1__Impl_in_rule__ClauseExpression__Group_1_1_7__14852 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_7__2_in_rule__ClauseExpression__Group_1_1_7__14855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_1_7__1__Impl4883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_7__2__Impl_in_rule__ClauseExpression__Group_1_1_7__24914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValueAssignment_1_1_7_2_in_rule__ClauseExpression__Group_1_1_7__2__Impl4941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_8__0__Impl_in_rule__ClauseExpression__Group_1_1_8__04977 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_8__1_in_rule__ClauseExpression__Group_1_1_8__04980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_8_0_in_rule__ClauseExpression__Group_1_1_8__0__Impl5007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_8__1__Impl_in_rule__ClauseExpression__Group_1_1_8__15037 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_8__2_in_rule__ClauseExpression__Group_1_1_8__15040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_1_8__1__Impl5068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_8__2__Impl_in_rule__ClauseExpression__Group_1_1_8__25099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValueAssignment_1_1_8_2_in_rule__ClauseExpression__Group_1_1_8__2__Impl5126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_9__0__Impl_in_rule__ClauseExpression__Group_1_1_9__05162 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_9__1_in_rule__ClauseExpression__Group_1_1_9__05165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_9_0_in_rule__ClauseExpression__Group_1_1_9__0__Impl5192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_9__1__Impl_in_rule__ClauseExpression__Group_1_1_9__15222 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_9__2_in_rule__ClauseExpression__Group_1_1_9__15225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_1_9__1__Impl5253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_9__2__Impl_in_rule__ClauseExpression__Group_1_1_9__25284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValueAssignment_1_1_9_2_in_rule__ClauseExpression__Group_1_1_9__2__Impl5311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryExp_in_rule__Exp1__BAssignment_1_15352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp1_in_rule__Exp1__RightAssignment_1_25383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClauseExpression_in_rule__Exp2__ValueAssignment_05414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFieldValue_in_rule__ClauseExpression__DefaultAssignment_1_05445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleField_in_rule__ClauseExpression__FieldAssignment_1_1_0_05476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFieldValue_in_rule__ClauseExpression__ValueAssignment_1_1_0_25507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeField_in_rule__ClauseExpression__FieldAssignment_1_1_1_05538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFieldValue_in_rule__ClauseExpression__ValueAssignment_1_1_1_25569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodField_in_rule__ClauseExpression__FieldAssignment_1_1_2_05600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodFieldValue_in_rule__ClauseExpression__ValueAssignment_1_1_2_25631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilePathField_in_rule__ClauseExpression__FieldAssignment_1_1_3_05662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilePathFieldValue_in_rule__ClauseExpression__ValueAssignment_1_1_3_25693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberField_in_rule__ClauseExpression__FieldAssignment_1_1_4_05724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberFieldValue_in_rule__ClauseExpression__ValueAssignment_1_1_4_25755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierField_in_rule__ClauseExpression__FieldAssignment_1_1_5_05786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierFieldValue_in_rule__ClauseExpression__ValueAssignment_1_1_5_25817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeField_in_rule__ClauseExpression__FieldAssignment_1_1_6_05848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeFieldValue_in_rule__ClauseExpression__ValueAssignment_1_1_6_25879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentTypeField_in_rule__ClauseExpression__FieldAssignment_1_1_7_05910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentTypeFieldValue_in_rule__ClauseExpression__ValueAssignment_1_1_7_25941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectNameField_in_rule__ClauseExpression__FieldAssignment_1_1_8_05972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectNameFieldValue_in_rule__ClauseExpression__ValueAssignment_1_1_8_26003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationField_in_rule__ClauseExpression__FieldAssignment_1_1_9_06034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationFieldValue_in_rule__ClauseExpression__ValueAssignment_1_1_9_26065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TypeField__ImplementedTypesAssignment_06101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__TypeField__ExtendedTypesAssignment_16145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__TypeField__UsedTypesAssignment_26189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__TypeField__UsedTypesInTryAssignment_36233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__TypeField__UsedTypesInFinallyAssignment_46277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__TypeField__ParameterTypesAssignment_56321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__TypeField__ReturnTypeAssignment_66365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TypeField__InstanceofTypesAssignment_76409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__TypeField__AllImplementedTypesAssignment_86453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__TypeField__AllExtendedTypesAssignment_96497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__TypeField__FieldTypeAssignment_106541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__TypeField__CaughtTypeAssignment_116585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__TypeField__DeclaredFieldTypesAssignment_126629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__TypeField__DeclaringTypeAssignment_136673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__MethodField__UsedMethodsAssignment_06717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__MethodField__UsedMethodsInTryAssignment_16761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__MethodField__UsedMethodsInFinallyAssignment_26805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__MethodField__OverriddenMethodsAssignment_36849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__FilePathField__ResourcePathAssignment6893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__NumberField__ParameterCountAssignment6937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ModifierField__ModifiersAssignment6981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__TimeField__TimestampAssignment7025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__DocumentTypeField__TypeAssignment7069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__ProjectNameField__ProjectNameAssignment7113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__AnnotationField__AnnotationsAssignment7157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__SimpleField__FullyQualifiedNameAssignment_07201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__SimpleField__FriendlyNameAssignment_17245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__SimpleField__DeclaredMethodsAssignment_27289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__SimpleField__ReturnVariableEexpressionsAssignment_37333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__SimpleField__AllDeclaredMethodNamesAssignment_47377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__SimpleField__DeclaredMethodNamesAssignment_57421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__SimpleField__DeclaredFieldNamesAssignment_67465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__SimpleField__AllDeclaredFieldNamesAssignment_77509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__SimpleField__FullTextAssignment_87553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__SimpleField__FieldsReadAssignment_97597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__SimpleField__FieldsWrittenAssignment_107641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__SimpleField__UsedFieldsInFinallyAssignment_117685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__SimpleField__UsedFieldsInTryAssignment_127729 = new BitSet(new long[]{0x0000000000000002L});

}