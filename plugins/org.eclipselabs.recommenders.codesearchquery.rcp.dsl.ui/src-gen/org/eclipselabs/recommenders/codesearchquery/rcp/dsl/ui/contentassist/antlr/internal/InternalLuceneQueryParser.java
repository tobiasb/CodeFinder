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

                if ( (LA1_1==29) ) {
                    alt1=2;
                }
                else if ( ((LA1_1>=32 && LA1_1<=69)) ) {
                    alt1=1;
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

                if ( (LA1_2==29) ) {
                    alt1=2;
                }
                else if ( ((LA1_2>=32 && LA1_2<=69)) ) {
                    alt1=1;
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

                if ( ((LA1_3>=32 && LA1_3<=69)) ) {
                    alt1=1;
                }
                else if ( (LA1_3==29) ) {
                    alt1=2;
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

                if ( (LA1_4==29) ) {
                    alt1=2;
                }
                else if ( ((LA1_4>=32 && LA1_4<=69)) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 4, input);

                    throw nvae;
                }
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:773:1: rule__ClauseExpression__Alternatives_1 : ( ( ( rule__ClauseExpression__Group_1_0__0 ) ) | ( ( rule__ClauseExpression__Group_1_1__0 ) ) | ( ( rule__ClauseExpression__Group_1_2__0 ) ) | ( ( rule__ClauseExpression__Group_1_3__0 ) ) | ( ( rule__ClauseExpression__Group_1_4__0 ) ) | ( ( rule__ClauseExpression__Group_1_5__0 ) ) | ( ( rule__ClauseExpression__Group_1_6__0 ) ) | ( ( rule__ClauseExpression__Group_1_7__0 ) ) | ( ( rule__ClauseExpression__Group_1_8__0 ) ) | ( ( rule__ClauseExpression__Group_1_9__0 ) ) );
    public final void rule__ClauseExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:777:1: ( ( ( rule__ClauseExpression__Group_1_0__0 ) ) | ( ( rule__ClauseExpression__Group_1_1__0 ) ) | ( ( rule__ClauseExpression__Group_1_2__0 ) ) | ( ( rule__ClauseExpression__Group_1_3__0 ) ) | ( ( rule__ClauseExpression__Group_1_4__0 ) ) | ( ( rule__ClauseExpression__Group_1_5__0 ) ) | ( ( rule__ClauseExpression__Group_1_6__0 ) ) | ( ( rule__ClauseExpression__Group_1_7__0 ) ) | ( ( rule__ClauseExpression__Group_1_8__0 ) ) | ( ( rule__ClauseExpression__Group_1_9__0 ) ) )
            int alt2=10;
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
                alt2=1;
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
                alt2=2;
                }
                break;
            case 46:
            case 47:
            case 48:
            case 49:
                {
                alt2=3;
                }
                break;
            case 50:
                {
                alt2=4;
                }
                break;
            case 51:
                {
                alt2=5;
                }
                break;
            case 52:
                {
                alt2=6;
                }
                break;
            case 53:
                {
                alt2=7;
                }
                break;
            case 54:
                {
                alt2=8;
                }
                break;
            case 55:
                {
                alt2=9;
                }
                break;
            case 56:
                {
                alt2=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:778:1: ( ( rule__ClauseExpression__Group_1_0__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:778:1: ( ( rule__ClauseExpression__Group_1_0__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:779:1: ( rule__ClauseExpression__Group_1_0__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:780:1: ( rule__ClauseExpression__Group_1_0__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:780:2: rule__ClauseExpression__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_0__0_in_rule__ClauseExpression__Alternatives_11589);
                    rule__ClauseExpression__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:784:6: ( ( rule__ClauseExpression__Group_1_1__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:784:6: ( ( rule__ClauseExpression__Group_1_1__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:785:1: ( rule__ClauseExpression__Group_1_1__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:786:1: ( rule__ClauseExpression__Group_1_1__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:786:2: rule__ClauseExpression__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1__0_in_rule__ClauseExpression__Alternatives_11607);
                    rule__ClauseExpression__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:790:6: ( ( rule__ClauseExpression__Group_1_2__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:790:6: ( ( rule__ClauseExpression__Group_1_2__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:791:1: ( rule__ClauseExpression__Group_1_2__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_2()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:792:1: ( rule__ClauseExpression__Group_1_2__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:792:2: rule__ClauseExpression__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_2__0_in_rule__ClauseExpression__Alternatives_11625);
                    rule__ClauseExpression__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:796:6: ( ( rule__ClauseExpression__Group_1_3__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:796:6: ( ( rule__ClauseExpression__Group_1_3__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:797:1: ( rule__ClauseExpression__Group_1_3__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_3()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:798:1: ( rule__ClauseExpression__Group_1_3__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:798:2: rule__ClauseExpression__Group_1_3__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_3__0_in_rule__ClauseExpression__Alternatives_11643);
                    rule__ClauseExpression__Group_1_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:802:6: ( ( rule__ClauseExpression__Group_1_4__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:802:6: ( ( rule__ClauseExpression__Group_1_4__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:803:1: ( rule__ClauseExpression__Group_1_4__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_4()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:804:1: ( rule__ClauseExpression__Group_1_4__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:804:2: rule__ClauseExpression__Group_1_4__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_4__0_in_rule__ClauseExpression__Alternatives_11661);
                    rule__ClauseExpression__Group_1_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:808:6: ( ( rule__ClauseExpression__Group_1_5__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:808:6: ( ( rule__ClauseExpression__Group_1_5__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:809:1: ( rule__ClauseExpression__Group_1_5__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_5()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:810:1: ( rule__ClauseExpression__Group_1_5__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:810:2: rule__ClauseExpression__Group_1_5__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_5__0_in_rule__ClauseExpression__Alternatives_11679);
                    rule__ClauseExpression__Group_1_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:814:6: ( ( rule__ClauseExpression__Group_1_6__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:814:6: ( ( rule__ClauseExpression__Group_1_6__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:815:1: ( rule__ClauseExpression__Group_1_6__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_6()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:816:1: ( rule__ClauseExpression__Group_1_6__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:816:2: rule__ClauseExpression__Group_1_6__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_6__0_in_rule__ClauseExpression__Alternatives_11697);
                    rule__ClauseExpression__Group_1_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:820:6: ( ( rule__ClauseExpression__Group_1_7__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:820:6: ( ( rule__ClauseExpression__Group_1_7__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:821:1: ( rule__ClauseExpression__Group_1_7__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_7()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:822:1: ( rule__ClauseExpression__Group_1_7__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:822:2: rule__ClauseExpression__Group_1_7__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_7__0_in_rule__ClauseExpression__Alternatives_11715);
                    rule__ClauseExpression__Group_1_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:826:6: ( ( rule__ClauseExpression__Group_1_8__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:826:6: ( ( rule__ClauseExpression__Group_1_8__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:827:1: ( rule__ClauseExpression__Group_1_8__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_8()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:828:1: ( rule__ClauseExpression__Group_1_8__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:828:2: rule__ClauseExpression__Group_1_8__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_8__0_in_rule__ClauseExpression__Alternatives_11733);
                    rule__ClauseExpression__Group_1_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:832:6: ( ( rule__ClauseExpression__Group_1_9__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:832:6: ( ( rule__ClauseExpression__Group_1_9__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:833:1: ( rule__ClauseExpression__Group_1_9__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_9()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:834:1: ( rule__ClauseExpression__Group_1_9__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:834:2: rule__ClauseExpression__Group_1_9__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_9__0_in_rule__ClauseExpression__Alternatives_11751);
                    rule__ClauseExpression__Group_1_9__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_9()); 

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


    // $ANTLR start "rule__TypeField__Alternatives"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:843:1: rule__TypeField__Alternatives : ( ( ( rule__TypeField__ImplementedTypesAssignment_0 ) ) | ( ( rule__TypeField__ExtendedTypesAssignment_1 ) ) | ( ( rule__TypeField__UsedTypesAssignment_2 ) ) | ( ( rule__TypeField__UsedTypesInTryAssignment_3 ) ) | ( ( rule__TypeField__UsedTypesInFinallyAssignment_4 ) ) | ( ( rule__TypeField__ParameterTypesAssignment_5 ) ) | ( ( rule__TypeField__ReturnTypeAssignment_6 ) ) | ( ( rule__TypeField__InstanceofTypesAssignment_7 ) ) | ( ( rule__TypeField__AllImplementedTypesAssignment_8 ) ) | ( ( rule__TypeField__AllExtendedTypesAssignment_9 ) ) | ( ( rule__TypeField__FieldTypeAssignment_10 ) ) | ( ( rule__TypeField__CaughtTypeAssignment_11 ) ) | ( ( rule__TypeField__DeclaredFieldTypesAssignment_12 ) ) | ( ( rule__TypeField__DeclaringTypeAssignment_13 ) ) );
    public final void rule__TypeField__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:847:1: ( ( ( rule__TypeField__ImplementedTypesAssignment_0 ) ) | ( ( rule__TypeField__ExtendedTypesAssignment_1 ) ) | ( ( rule__TypeField__UsedTypesAssignment_2 ) ) | ( ( rule__TypeField__UsedTypesInTryAssignment_3 ) ) | ( ( rule__TypeField__UsedTypesInFinallyAssignment_4 ) ) | ( ( rule__TypeField__ParameterTypesAssignment_5 ) ) | ( ( rule__TypeField__ReturnTypeAssignment_6 ) ) | ( ( rule__TypeField__InstanceofTypesAssignment_7 ) ) | ( ( rule__TypeField__AllImplementedTypesAssignment_8 ) ) | ( ( rule__TypeField__AllExtendedTypesAssignment_9 ) ) | ( ( rule__TypeField__FieldTypeAssignment_10 ) ) | ( ( rule__TypeField__CaughtTypeAssignment_11 ) ) | ( ( rule__TypeField__DeclaredFieldTypesAssignment_12 ) ) | ( ( rule__TypeField__DeclaringTypeAssignment_13 ) ) )
            int alt3=14;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt3=1;
                }
                break;
            case 33:
                {
                alt3=2;
                }
                break;
            case 34:
                {
                alt3=3;
                }
                break;
            case 35:
                {
                alt3=4;
                }
                break;
            case 36:
                {
                alt3=5;
                }
                break;
            case 37:
                {
                alt3=6;
                }
                break;
            case 38:
                {
                alt3=7;
                }
                break;
            case 39:
                {
                alt3=8;
                }
                break;
            case 40:
                {
                alt3=9;
                }
                break;
            case 41:
                {
                alt3=10;
                }
                break;
            case 42:
                {
                alt3=11;
                }
                break;
            case 43:
                {
                alt3=12;
                }
                break;
            case 44:
                {
                alt3=13;
                }
                break;
            case 45:
                {
                alt3=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:848:1: ( ( rule__TypeField__ImplementedTypesAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:848:1: ( ( rule__TypeField__ImplementedTypesAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:849:1: ( rule__TypeField__ImplementedTypesAssignment_0 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getImplementedTypesAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:850:1: ( rule__TypeField__ImplementedTypesAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:850:2: rule__TypeField__ImplementedTypesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TypeField__ImplementedTypesAssignment_0_in_rule__TypeField__Alternatives1784);
                    rule__TypeField__ImplementedTypesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getImplementedTypesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:854:6: ( ( rule__TypeField__ExtendedTypesAssignment_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:854:6: ( ( rule__TypeField__ExtendedTypesAssignment_1 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:855:1: ( rule__TypeField__ExtendedTypesAssignment_1 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getExtendedTypesAssignment_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:856:1: ( rule__TypeField__ExtendedTypesAssignment_1 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:856:2: rule__TypeField__ExtendedTypesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeField__ExtendedTypesAssignment_1_in_rule__TypeField__Alternatives1802);
                    rule__TypeField__ExtendedTypesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getExtendedTypesAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:860:6: ( ( rule__TypeField__UsedTypesAssignment_2 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:860:6: ( ( rule__TypeField__UsedTypesAssignment_2 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:861:1: ( rule__TypeField__UsedTypesAssignment_2 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getUsedTypesAssignment_2()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:862:1: ( rule__TypeField__UsedTypesAssignment_2 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:862:2: rule__TypeField__UsedTypesAssignment_2
                    {
                    pushFollow(FOLLOW_rule__TypeField__UsedTypesAssignment_2_in_rule__TypeField__Alternatives1820);
                    rule__TypeField__UsedTypesAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getUsedTypesAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:866:6: ( ( rule__TypeField__UsedTypesInTryAssignment_3 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:866:6: ( ( rule__TypeField__UsedTypesInTryAssignment_3 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:867:1: ( rule__TypeField__UsedTypesInTryAssignment_3 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getUsedTypesInTryAssignment_3()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:868:1: ( rule__TypeField__UsedTypesInTryAssignment_3 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:868:2: rule__TypeField__UsedTypesInTryAssignment_3
                    {
                    pushFollow(FOLLOW_rule__TypeField__UsedTypesInTryAssignment_3_in_rule__TypeField__Alternatives1838);
                    rule__TypeField__UsedTypesInTryAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getUsedTypesInTryAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:872:6: ( ( rule__TypeField__UsedTypesInFinallyAssignment_4 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:872:6: ( ( rule__TypeField__UsedTypesInFinallyAssignment_4 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:873:1: ( rule__TypeField__UsedTypesInFinallyAssignment_4 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getUsedTypesInFinallyAssignment_4()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:874:1: ( rule__TypeField__UsedTypesInFinallyAssignment_4 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:874:2: rule__TypeField__UsedTypesInFinallyAssignment_4
                    {
                    pushFollow(FOLLOW_rule__TypeField__UsedTypesInFinallyAssignment_4_in_rule__TypeField__Alternatives1856);
                    rule__TypeField__UsedTypesInFinallyAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getUsedTypesInFinallyAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:878:6: ( ( rule__TypeField__ParameterTypesAssignment_5 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:878:6: ( ( rule__TypeField__ParameterTypesAssignment_5 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:879:1: ( rule__TypeField__ParameterTypesAssignment_5 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getParameterTypesAssignment_5()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:880:1: ( rule__TypeField__ParameterTypesAssignment_5 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:880:2: rule__TypeField__ParameterTypesAssignment_5
                    {
                    pushFollow(FOLLOW_rule__TypeField__ParameterTypesAssignment_5_in_rule__TypeField__Alternatives1874);
                    rule__TypeField__ParameterTypesAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getParameterTypesAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:884:6: ( ( rule__TypeField__ReturnTypeAssignment_6 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:884:6: ( ( rule__TypeField__ReturnTypeAssignment_6 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:885:1: ( rule__TypeField__ReturnTypeAssignment_6 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getReturnTypeAssignment_6()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:886:1: ( rule__TypeField__ReturnTypeAssignment_6 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:886:2: rule__TypeField__ReturnTypeAssignment_6
                    {
                    pushFollow(FOLLOW_rule__TypeField__ReturnTypeAssignment_6_in_rule__TypeField__Alternatives1892);
                    rule__TypeField__ReturnTypeAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getReturnTypeAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:890:6: ( ( rule__TypeField__InstanceofTypesAssignment_7 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:890:6: ( ( rule__TypeField__InstanceofTypesAssignment_7 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:891:1: ( rule__TypeField__InstanceofTypesAssignment_7 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getInstanceofTypesAssignment_7()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:892:1: ( rule__TypeField__InstanceofTypesAssignment_7 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:892:2: rule__TypeField__InstanceofTypesAssignment_7
                    {
                    pushFollow(FOLLOW_rule__TypeField__InstanceofTypesAssignment_7_in_rule__TypeField__Alternatives1910);
                    rule__TypeField__InstanceofTypesAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getInstanceofTypesAssignment_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:896:6: ( ( rule__TypeField__AllImplementedTypesAssignment_8 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:896:6: ( ( rule__TypeField__AllImplementedTypesAssignment_8 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:897:1: ( rule__TypeField__AllImplementedTypesAssignment_8 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getAllImplementedTypesAssignment_8()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:898:1: ( rule__TypeField__AllImplementedTypesAssignment_8 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:898:2: rule__TypeField__AllImplementedTypesAssignment_8
                    {
                    pushFollow(FOLLOW_rule__TypeField__AllImplementedTypesAssignment_8_in_rule__TypeField__Alternatives1928);
                    rule__TypeField__AllImplementedTypesAssignment_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getAllImplementedTypesAssignment_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:902:6: ( ( rule__TypeField__AllExtendedTypesAssignment_9 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:902:6: ( ( rule__TypeField__AllExtendedTypesAssignment_9 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:903:1: ( rule__TypeField__AllExtendedTypesAssignment_9 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getAllExtendedTypesAssignment_9()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:904:1: ( rule__TypeField__AllExtendedTypesAssignment_9 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:904:2: rule__TypeField__AllExtendedTypesAssignment_9
                    {
                    pushFollow(FOLLOW_rule__TypeField__AllExtendedTypesAssignment_9_in_rule__TypeField__Alternatives1946);
                    rule__TypeField__AllExtendedTypesAssignment_9();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getAllExtendedTypesAssignment_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:908:6: ( ( rule__TypeField__FieldTypeAssignment_10 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:908:6: ( ( rule__TypeField__FieldTypeAssignment_10 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:909:1: ( rule__TypeField__FieldTypeAssignment_10 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getFieldTypeAssignment_10()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:910:1: ( rule__TypeField__FieldTypeAssignment_10 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:910:2: rule__TypeField__FieldTypeAssignment_10
                    {
                    pushFollow(FOLLOW_rule__TypeField__FieldTypeAssignment_10_in_rule__TypeField__Alternatives1964);
                    rule__TypeField__FieldTypeAssignment_10();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getFieldTypeAssignment_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:914:6: ( ( rule__TypeField__CaughtTypeAssignment_11 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:914:6: ( ( rule__TypeField__CaughtTypeAssignment_11 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:915:1: ( rule__TypeField__CaughtTypeAssignment_11 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getCaughtTypeAssignment_11()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:916:1: ( rule__TypeField__CaughtTypeAssignment_11 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:916:2: rule__TypeField__CaughtTypeAssignment_11
                    {
                    pushFollow(FOLLOW_rule__TypeField__CaughtTypeAssignment_11_in_rule__TypeField__Alternatives1982);
                    rule__TypeField__CaughtTypeAssignment_11();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getCaughtTypeAssignment_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:920:6: ( ( rule__TypeField__DeclaredFieldTypesAssignment_12 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:920:6: ( ( rule__TypeField__DeclaredFieldTypesAssignment_12 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:921:1: ( rule__TypeField__DeclaredFieldTypesAssignment_12 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getDeclaredFieldTypesAssignment_12()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:922:1: ( rule__TypeField__DeclaredFieldTypesAssignment_12 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:922:2: rule__TypeField__DeclaredFieldTypesAssignment_12
                    {
                    pushFollow(FOLLOW_rule__TypeField__DeclaredFieldTypesAssignment_12_in_rule__TypeField__Alternatives2000);
                    rule__TypeField__DeclaredFieldTypesAssignment_12();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getDeclaredFieldTypesAssignment_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:926:6: ( ( rule__TypeField__DeclaringTypeAssignment_13 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:926:6: ( ( rule__TypeField__DeclaringTypeAssignment_13 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:927:1: ( rule__TypeField__DeclaringTypeAssignment_13 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getDeclaringTypeAssignment_13()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:928:1: ( rule__TypeField__DeclaringTypeAssignment_13 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:928:2: rule__TypeField__DeclaringTypeAssignment_13
                    {
                    pushFollow(FOLLOW_rule__TypeField__DeclaringTypeAssignment_13_in_rule__TypeField__Alternatives2018);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:937:1: rule__MethodField__Alternatives : ( ( ( rule__MethodField__UsedMethodsAssignment_0 ) ) | ( ( rule__MethodField__UsedMethodsInTryAssignment_1 ) ) | ( ( rule__MethodField__UsedMethodsInFinallyAssignment_2 ) ) | ( ( rule__MethodField__OverriddenMethodsAssignment_3 ) ) );
    public final void rule__MethodField__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:941:1: ( ( ( rule__MethodField__UsedMethodsAssignment_0 ) ) | ( ( rule__MethodField__UsedMethodsInTryAssignment_1 ) ) | ( ( rule__MethodField__UsedMethodsInFinallyAssignment_2 ) ) | ( ( rule__MethodField__OverriddenMethodsAssignment_3 ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt4=1;
                }
                break;
            case 47:
                {
                alt4=2;
                }
                break;
            case 48:
                {
                alt4=3;
                }
                break;
            case 49:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:942:1: ( ( rule__MethodField__UsedMethodsAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:942:1: ( ( rule__MethodField__UsedMethodsAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:943:1: ( rule__MethodField__UsedMethodsAssignment_0 )
                    {
                     before(grammarAccess.getMethodFieldAccess().getUsedMethodsAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:944:1: ( rule__MethodField__UsedMethodsAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:944:2: rule__MethodField__UsedMethodsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__MethodField__UsedMethodsAssignment_0_in_rule__MethodField__Alternatives2051);
                    rule__MethodField__UsedMethodsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodFieldAccess().getUsedMethodsAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:948:6: ( ( rule__MethodField__UsedMethodsInTryAssignment_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:948:6: ( ( rule__MethodField__UsedMethodsInTryAssignment_1 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:949:1: ( rule__MethodField__UsedMethodsInTryAssignment_1 )
                    {
                     before(grammarAccess.getMethodFieldAccess().getUsedMethodsInTryAssignment_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:950:1: ( rule__MethodField__UsedMethodsInTryAssignment_1 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:950:2: rule__MethodField__UsedMethodsInTryAssignment_1
                    {
                    pushFollow(FOLLOW_rule__MethodField__UsedMethodsInTryAssignment_1_in_rule__MethodField__Alternatives2069);
                    rule__MethodField__UsedMethodsInTryAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodFieldAccess().getUsedMethodsInTryAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:954:6: ( ( rule__MethodField__UsedMethodsInFinallyAssignment_2 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:954:6: ( ( rule__MethodField__UsedMethodsInFinallyAssignment_2 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:955:1: ( rule__MethodField__UsedMethodsInFinallyAssignment_2 )
                    {
                     before(grammarAccess.getMethodFieldAccess().getUsedMethodsInFinallyAssignment_2()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:956:1: ( rule__MethodField__UsedMethodsInFinallyAssignment_2 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:956:2: rule__MethodField__UsedMethodsInFinallyAssignment_2
                    {
                    pushFollow(FOLLOW_rule__MethodField__UsedMethodsInFinallyAssignment_2_in_rule__MethodField__Alternatives2087);
                    rule__MethodField__UsedMethodsInFinallyAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodFieldAccess().getUsedMethodsInFinallyAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:960:6: ( ( rule__MethodField__OverriddenMethodsAssignment_3 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:960:6: ( ( rule__MethodField__OverriddenMethodsAssignment_3 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:961:1: ( rule__MethodField__OverriddenMethodsAssignment_3 )
                    {
                     before(grammarAccess.getMethodFieldAccess().getOverriddenMethodsAssignment_3()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:962:1: ( rule__MethodField__OverriddenMethodsAssignment_3 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:962:2: rule__MethodField__OverriddenMethodsAssignment_3
                    {
                    pushFollow(FOLLOW_rule__MethodField__OverriddenMethodsAssignment_3_in_rule__MethodField__Alternatives2105);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:971:1: rule__SimpleField__Alternatives : ( ( ( rule__SimpleField__FullyQualifiedNameAssignment_0 ) ) | ( ( rule__SimpleField__FriendlyNameAssignment_1 ) ) | ( ( rule__SimpleField__DeclaredMethodsAssignment_2 ) ) | ( ( rule__SimpleField__ReturnVariableEexpressionsAssignment_3 ) ) | ( ( rule__SimpleField__AllDeclaredMethodNamesAssignment_4 ) ) | ( ( rule__SimpleField__DeclaredMethodNamesAssignment_5 ) ) | ( ( rule__SimpleField__DeclaredFieldNamesAssignment_6 ) ) | ( ( rule__SimpleField__AllDeclaredFieldNamesAssignment_7 ) ) | ( ( rule__SimpleField__FullTextAssignment_8 ) ) | ( ( rule__SimpleField__FieldsReadAssignment_9 ) ) | ( ( rule__SimpleField__FieldsWrittenAssignment_10 ) ) | ( ( rule__SimpleField__UsedFieldsInFinallyAssignment_11 ) ) | ( ( rule__SimpleField__UsedFieldsInTryAssignment_12 ) ) );
    public final void rule__SimpleField__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:975:1: ( ( ( rule__SimpleField__FullyQualifiedNameAssignment_0 ) ) | ( ( rule__SimpleField__FriendlyNameAssignment_1 ) ) | ( ( rule__SimpleField__DeclaredMethodsAssignment_2 ) ) | ( ( rule__SimpleField__ReturnVariableEexpressionsAssignment_3 ) ) | ( ( rule__SimpleField__AllDeclaredMethodNamesAssignment_4 ) ) | ( ( rule__SimpleField__DeclaredMethodNamesAssignment_5 ) ) | ( ( rule__SimpleField__DeclaredFieldNamesAssignment_6 ) ) | ( ( rule__SimpleField__AllDeclaredFieldNamesAssignment_7 ) ) | ( ( rule__SimpleField__FullTextAssignment_8 ) ) | ( ( rule__SimpleField__FieldsReadAssignment_9 ) ) | ( ( rule__SimpleField__FieldsWrittenAssignment_10 ) ) | ( ( rule__SimpleField__UsedFieldsInFinallyAssignment_11 ) ) | ( ( rule__SimpleField__UsedFieldsInTryAssignment_12 ) ) )
            int alt5=13;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt5=1;
                }
                break;
            case 58:
                {
                alt5=2;
                }
                break;
            case 59:
                {
                alt5=3;
                }
                break;
            case 60:
                {
                alt5=4;
                }
                break;
            case 61:
                {
                alt5=5;
                }
                break;
            case 62:
                {
                alt5=6;
                }
                break;
            case 63:
                {
                alt5=7;
                }
                break;
            case 64:
                {
                alt5=8;
                }
                break;
            case 65:
                {
                alt5=9;
                }
                break;
            case 66:
                {
                alt5=10;
                }
                break;
            case 67:
                {
                alt5=11;
                }
                break;
            case 68:
                {
                alt5=12;
                }
                break;
            case 69:
                {
                alt5=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:976:1: ( ( rule__SimpleField__FullyQualifiedNameAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:976:1: ( ( rule__SimpleField__FullyQualifiedNameAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:977:1: ( rule__SimpleField__FullyQualifiedNameAssignment_0 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getFullyQualifiedNameAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:978:1: ( rule__SimpleField__FullyQualifiedNameAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:978:2: rule__SimpleField__FullyQualifiedNameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SimpleField__FullyQualifiedNameAssignment_0_in_rule__SimpleField__Alternatives2138);
                    rule__SimpleField__FullyQualifiedNameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getFullyQualifiedNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:982:6: ( ( rule__SimpleField__FriendlyNameAssignment_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:982:6: ( ( rule__SimpleField__FriendlyNameAssignment_1 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:983:1: ( rule__SimpleField__FriendlyNameAssignment_1 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getFriendlyNameAssignment_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:984:1: ( rule__SimpleField__FriendlyNameAssignment_1 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:984:2: rule__SimpleField__FriendlyNameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SimpleField__FriendlyNameAssignment_1_in_rule__SimpleField__Alternatives2156);
                    rule__SimpleField__FriendlyNameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getFriendlyNameAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:988:6: ( ( rule__SimpleField__DeclaredMethodsAssignment_2 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:988:6: ( ( rule__SimpleField__DeclaredMethodsAssignment_2 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:989:1: ( rule__SimpleField__DeclaredMethodsAssignment_2 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getDeclaredMethodsAssignment_2()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:990:1: ( rule__SimpleField__DeclaredMethodsAssignment_2 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:990:2: rule__SimpleField__DeclaredMethodsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SimpleField__DeclaredMethodsAssignment_2_in_rule__SimpleField__Alternatives2174);
                    rule__SimpleField__DeclaredMethodsAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getDeclaredMethodsAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:994:6: ( ( rule__SimpleField__ReturnVariableEexpressionsAssignment_3 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:994:6: ( ( rule__SimpleField__ReturnVariableEexpressionsAssignment_3 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:995:1: ( rule__SimpleField__ReturnVariableEexpressionsAssignment_3 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getReturnVariableEexpressionsAssignment_3()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:996:1: ( rule__SimpleField__ReturnVariableEexpressionsAssignment_3 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:996:2: rule__SimpleField__ReturnVariableEexpressionsAssignment_3
                    {
                    pushFollow(FOLLOW_rule__SimpleField__ReturnVariableEexpressionsAssignment_3_in_rule__SimpleField__Alternatives2192);
                    rule__SimpleField__ReturnVariableEexpressionsAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getReturnVariableEexpressionsAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1000:6: ( ( rule__SimpleField__AllDeclaredMethodNamesAssignment_4 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1000:6: ( ( rule__SimpleField__AllDeclaredMethodNamesAssignment_4 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1001:1: ( rule__SimpleField__AllDeclaredMethodNamesAssignment_4 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getAllDeclaredMethodNamesAssignment_4()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1002:1: ( rule__SimpleField__AllDeclaredMethodNamesAssignment_4 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1002:2: rule__SimpleField__AllDeclaredMethodNamesAssignment_4
                    {
                    pushFollow(FOLLOW_rule__SimpleField__AllDeclaredMethodNamesAssignment_4_in_rule__SimpleField__Alternatives2210);
                    rule__SimpleField__AllDeclaredMethodNamesAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getAllDeclaredMethodNamesAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1006:6: ( ( rule__SimpleField__DeclaredMethodNamesAssignment_5 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1006:6: ( ( rule__SimpleField__DeclaredMethodNamesAssignment_5 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1007:1: ( rule__SimpleField__DeclaredMethodNamesAssignment_5 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getDeclaredMethodNamesAssignment_5()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1008:1: ( rule__SimpleField__DeclaredMethodNamesAssignment_5 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1008:2: rule__SimpleField__DeclaredMethodNamesAssignment_5
                    {
                    pushFollow(FOLLOW_rule__SimpleField__DeclaredMethodNamesAssignment_5_in_rule__SimpleField__Alternatives2228);
                    rule__SimpleField__DeclaredMethodNamesAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getDeclaredMethodNamesAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1012:6: ( ( rule__SimpleField__DeclaredFieldNamesAssignment_6 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1012:6: ( ( rule__SimpleField__DeclaredFieldNamesAssignment_6 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1013:1: ( rule__SimpleField__DeclaredFieldNamesAssignment_6 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getDeclaredFieldNamesAssignment_6()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1014:1: ( rule__SimpleField__DeclaredFieldNamesAssignment_6 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1014:2: rule__SimpleField__DeclaredFieldNamesAssignment_6
                    {
                    pushFollow(FOLLOW_rule__SimpleField__DeclaredFieldNamesAssignment_6_in_rule__SimpleField__Alternatives2246);
                    rule__SimpleField__DeclaredFieldNamesAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getDeclaredFieldNamesAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1018:6: ( ( rule__SimpleField__AllDeclaredFieldNamesAssignment_7 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1018:6: ( ( rule__SimpleField__AllDeclaredFieldNamesAssignment_7 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1019:1: ( rule__SimpleField__AllDeclaredFieldNamesAssignment_7 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getAllDeclaredFieldNamesAssignment_7()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1020:1: ( rule__SimpleField__AllDeclaredFieldNamesAssignment_7 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1020:2: rule__SimpleField__AllDeclaredFieldNamesAssignment_7
                    {
                    pushFollow(FOLLOW_rule__SimpleField__AllDeclaredFieldNamesAssignment_7_in_rule__SimpleField__Alternatives2264);
                    rule__SimpleField__AllDeclaredFieldNamesAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getAllDeclaredFieldNamesAssignment_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1024:6: ( ( rule__SimpleField__FullTextAssignment_8 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1024:6: ( ( rule__SimpleField__FullTextAssignment_8 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1025:1: ( rule__SimpleField__FullTextAssignment_8 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getFullTextAssignment_8()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1026:1: ( rule__SimpleField__FullTextAssignment_8 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1026:2: rule__SimpleField__FullTextAssignment_8
                    {
                    pushFollow(FOLLOW_rule__SimpleField__FullTextAssignment_8_in_rule__SimpleField__Alternatives2282);
                    rule__SimpleField__FullTextAssignment_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getFullTextAssignment_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1030:6: ( ( rule__SimpleField__FieldsReadAssignment_9 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1030:6: ( ( rule__SimpleField__FieldsReadAssignment_9 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1031:1: ( rule__SimpleField__FieldsReadAssignment_9 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getFieldsReadAssignment_9()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1032:1: ( rule__SimpleField__FieldsReadAssignment_9 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1032:2: rule__SimpleField__FieldsReadAssignment_9
                    {
                    pushFollow(FOLLOW_rule__SimpleField__FieldsReadAssignment_9_in_rule__SimpleField__Alternatives2300);
                    rule__SimpleField__FieldsReadAssignment_9();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getFieldsReadAssignment_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1036:6: ( ( rule__SimpleField__FieldsWrittenAssignment_10 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1036:6: ( ( rule__SimpleField__FieldsWrittenAssignment_10 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1037:1: ( rule__SimpleField__FieldsWrittenAssignment_10 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getFieldsWrittenAssignment_10()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1038:1: ( rule__SimpleField__FieldsWrittenAssignment_10 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1038:2: rule__SimpleField__FieldsWrittenAssignment_10
                    {
                    pushFollow(FOLLOW_rule__SimpleField__FieldsWrittenAssignment_10_in_rule__SimpleField__Alternatives2318);
                    rule__SimpleField__FieldsWrittenAssignment_10();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getFieldsWrittenAssignment_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1042:6: ( ( rule__SimpleField__UsedFieldsInFinallyAssignment_11 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1042:6: ( ( rule__SimpleField__UsedFieldsInFinallyAssignment_11 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1043:1: ( rule__SimpleField__UsedFieldsInFinallyAssignment_11 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getUsedFieldsInFinallyAssignment_11()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1044:1: ( rule__SimpleField__UsedFieldsInFinallyAssignment_11 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1044:2: rule__SimpleField__UsedFieldsInFinallyAssignment_11
                    {
                    pushFollow(FOLLOW_rule__SimpleField__UsedFieldsInFinallyAssignment_11_in_rule__SimpleField__Alternatives2336);
                    rule__SimpleField__UsedFieldsInFinallyAssignment_11();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getUsedFieldsInFinallyAssignment_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1048:6: ( ( rule__SimpleField__UsedFieldsInTryAssignment_12 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1048:6: ( ( rule__SimpleField__UsedFieldsInTryAssignment_12 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1049:1: ( rule__SimpleField__UsedFieldsInTryAssignment_12 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getUsedFieldsInTryAssignment_12()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1050:1: ( rule__SimpleField__UsedFieldsInTryAssignment_12 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1050:2: rule__SimpleField__UsedFieldsInTryAssignment_12
                    {
                    pushFollow(FOLLOW_rule__SimpleField__UsedFieldsInTryAssignment_12_in_rule__SimpleField__Alternatives2354);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1059:1: rule__ModifierFieldValue__Alternatives : ( ( 'private' ) | ( 'public' ) | ( 'static' ) | ( 'final' ) | ( 'abstract' ) | ( 'protected' ) );
    public final void rule__ModifierFieldValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1063:1: ( ( 'private' ) | ( 'public' ) | ( 'static' ) | ( 'final' ) | ( 'abstract' ) | ( 'protected' ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            case 16:
                {
                alt6=4;
                }
                break;
            case 17:
                {
                alt6=5;
                }
                break;
            case 18:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1064:1: ( 'private' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1064:1: ( 'private' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1065:1: 'private'
                    {
                     before(grammarAccess.getModifierFieldValueAccess().getPrivateKeyword_0()); 
                    match(input,13,FOLLOW_13_in_rule__ModifierFieldValue__Alternatives2388); 
                     after(grammarAccess.getModifierFieldValueAccess().getPrivateKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1072:6: ( 'public' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1072:6: ( 'public' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1073:1: 'public'
                    {
                     before(grammarAccess.getModifierFieldValueAccess().getPublicKeyword_1()); 
                    match(input,14,FOLLOW_14_in_rule__ModifierFieldValue__Alternatives2408); 
                     after(grammarAccess.getModifierFieldValueAccess().getPublicKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1080:6: ( 'static' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1080:6: ( 'static' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1081:1: 'static'
                    {
                     before(grammarAccess.getModifierFieldValueAccess().getStaticKeyword_2()); 
                    match(input,15,FOLLOW_15_in_rule__ModifierFieldValue__Alternatives2428); 
                     after(grammarAccess.getModifierFieldValueAccess().getStaticKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1088:6: ( 'final' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1088:6: ( 'final' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1089:1: 'final'
                    {
                     before(grammarAccess.getModifierFieldValueAccess().getFinalKeyword_3()); 
                    match(input,16,FOLLOW_16_in_rule__ModifierFieldValue__Alternatives2448); 
                     after(grammarAccess.getModifierFieldValueAccess().getFinalKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1096:6: ( 'abstract' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1096:6: ( 'abstract' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1097:1: 'abstract'
                    {
                     before(grammarAccess.getModifierFieldValueAccess().getAbstractKeyword_4()); 
                    match(input,17,FOLLOW_17_in_rule__ModifierFieldValue__Alternatives2468); 
                     after(grammarAccess.getModifierFieldValueAccess().getAbstractKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1104:6: ( 'protected' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1104:6: ( 'protected' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1105:1: 'protected'
                    {
                     before(grammarAccess.getModifierFieldValueAccess().getProtectedKeyword_5()); 
                    match(input,18,FOLLOW_18_in_rule__ModifierFieldValue__Alternatives2488); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1117:1: rule__DocumentTypeFieldValue__Alternatives : ( ( 'class' ) | ( 'method' ) | ( 'field' ) | ( 'trycatch' ) );
    public final void rule__DocumentTypeFieldValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1121:1: ( ( 'class' ) | ( 'method' ) | ( 'field' ) | ( 'trycatch' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 21:
                {
                alt7=3;
                }
                break;
            case 22:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1122:1: ( 'class' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1122:1: ( 'class' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1123:1: 'class'
                    {
                     before(grammarAccess.getDocumentTypeFieldValueAccess().getClassKeyword_0()); 
                    match(input,19,FOLLOW_19_in_rule__DocumentTypeFieldValue__Alternatives2523); 
                     after(grammarAccess.getDocumentTypeFieldValueAccess().getClassKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1130:6: ( 'method' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1130:6: ( 'method' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1131:1: 'method'
                    {
                     before(grammarAccess.getDocumentTypeFieldValueAccess().getMethodKeyword_1()); 
                    match(input,20,FOLLOW_20_in_rule__DocumentTypeFieldValue__Alternatives2543); 
                     after(grammarAccess.getDocumentTypeFieldValueAccess().getMethodKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1138:6: ( 'field' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1138:6: ( 'field' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1139:1: 'field'
                    {
                     before(grammarAccess.getDocumentTypeFieldValueAccess().getFieldKeyword_2()); 
                    match(input,21,FOLLOW_21_in_rule__DocumentTypeFieldValue__Alternatives2563); 
                     after(grammarAccess.getDocumentTypeFieldValueAccess().getFieldKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1146:6: ( 'trycatch' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1146:6: ( 'trycatch' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1147:1: 'trycatch'
                    {
                     before(grammarAccess.getDocumentTypeFieldValueAccess().getTrycatchKeyword_3()); 
                    match(input,22,FOLLOW_22_in_rule__DocumentTypeFieldValue__Alternatives2583); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1159:1: rule__UnaryExpression__Alternatives : ( ( '-' ) | ( 'NOT' ) | ( '!' ) | ( '+' ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1163:1: ( ( '-' ) | ( 'NOT' ) | ( '!' ) | ( '+' ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt8=1;
                }
                break;
            case 24:
                {
                alt8=2;
                }
                break;
            case 25:
                {
                alt8=3;
                }
                break;
            case 26:
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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1164:1: ( '-' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1164:1: ( '-' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1165:1: '-'
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getHyphenMinusKeyword_0()); 
                    match(input,23,FOLLOW_23_in_rule__UnaryExpression__Alternatives2618); 
                     after(grammarAccess.getUnaryExpressionAccess().getHyphenMinusKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1172:6: ( 'NOT' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1172:6: ( 'NOT' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1173:1: 'NOT'
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getNOTKeyword_1()); 
                    match(input,24,FOLLOW_24_in_rule__UnaryExpression__Alternatives2638); 
                     after(grammarAccess.getUnaryExpressionAccess().getNOTKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1180:6: ( '!' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1180:6: ( '!' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1181:1: '!'
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getExclamationMarkKeyword_2()); 
                    match(input,25,FOLLOW_25_in_rule__UnaryExpression__Alternatives2658); 
                     after(grammarAccess.getUnaryExpressionAccess().getExclamationMarkKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1188:6: ( '+' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1188:6: ( '+' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1189:1: '+'
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getPlusSignKeyword_3()); 
                    match(input,26,FOLLOW_26_in_rule__UnaryExpression__Alternatives2678); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1201:1: rule__BinaryExp__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__BinaryExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1205:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            else if ( (LA9_0==28) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1206:1: ( ( 'AND' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1206:1: ( ( 'AND' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1207:1: ( 'AND' )
                    {
                     before(grammarAccess.getBinaryExpAccess().getAnd1EnumLiteralDeclaration_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1208:1: ( 'AND' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1208:3: 'AND'
                    {
                    match(input,27,FOLLOW_27_in_rule__BinaryExp__Alternatives2713); 

                    }

                     after(grammarAccess.getBinaryExpAccess().getAnd1EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1213:6: ( ( 'OR' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1213:6: ( ( 'OR' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1214:1: ( 'OR' )
                    {
                     before(grammarAccess.getBinaryExpAccess().getOr1EnumLiteralDeclaration_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1215:1: ( 'OR' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1215:3: 'OR'
                    {
                    match(input,28,FOLLOW_28_in_rule__BinaryExp__Alternatives2734); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1227:1: rule__Exp1__Group__0 : rule__Exp1__Group__0__Impl rule__Exp1__Group__1 ;
    public final void rule__Exp1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1231:1: ( rule__Exp1__Group__0__Impl rule__Exp1__Group__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1232:2: rule__Exp1__Group__0__Impl rule__Exp1__Group__1
            {
            pushFollow(FOLLOW_rule__Exp1__Group__0__Impl_in_rule__Exp1__Group__02767);
            rule__Exp1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp1__Group__1_in_rule__Exp1__Group__02770);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1239:1: rule__Exp1__Group__0__Impl : ( ruleExp2 ) ;
    public final void rule__Exp1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1243:1: ( ( ruleExp2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1244:1: ( ruleExp2 )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1244:1: ( ruleExp2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1245:1: ruleExp2
            {
             before(grammarAccess.getExp1Access().getExp2ParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleExp2_in_rule__Exp1__Group__0__Impl2797);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1256:1: rule__Exp1__Group__1 : rule__Exp1__Group__1__Impl ;
    public final void rule__Exp1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1260:1: ( rule__Exp1__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1261:2: rule__Exp1__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Exp1__Group__1__Impl_in_rule__Exp1__Group__12826);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1267:1: rule__Exp1__Group__1__Impl : ( ( rule__Exp1__Group_1__0 )? ) ;
    public final void rule__Exp1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1271:1: ( ( ( rule__Exp1__Group_1__0 )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1272:1: ( ( rule__Exp1__Group_1__0 )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1272:1: ( ( rule__Exp1__Group_1__0 )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1273:1: ( rule__Exp1__Group_1__0 )?
            {
             before(grammarAccess.getExp1Access().getGroup_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1274:1: ( rule__Exp1__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=23 && LA10_0<=29)||(LA10_0>=32 && LA10_0<=69)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1274:2: rule__Exp1__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Exp1__Group_1__0_in_rule__Exp1__Group__1__Impl2853);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1288:1: rule__Exp1__Group_1__0 : rule__Exp1__Group_1__0__Impl rule__Exp1__Group_1__1 ;
    public final void rule__Exp1__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1292:1: ( rule__Exp1__Group_1__0__Impl rule__Exp1__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1293:2: rule__Exp1__Group_1__0__Impl rule__Exp1__Group_1__1
            {
            pushFollow(FOLLOW_rule__Exp1__Group_1__0__Impl_in_rule__Exp1__Group_1__02888);
            rule__Exp1__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp1__Group_1__1_in_rule__Exp1__Group_1__02891);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1300:1: rule__Exp1__Group_1__0__Impl : ( () ) ;
    public final void rule__Exp1__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1304:1: ( ( () ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1305:1: ( () )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1305:1: ( () )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1306:1: ()
            {
             before(grammarAccess.getExp1Access().getExp1LeftAction_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1307:1: ()
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1309:1: 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1319:1: rule__Exp1__Group_1__1 : rule__Exp1__Group_1__1__Impl rule__Exp1__Group_1__2 ;
    public final void rule__Exp1__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1323:1: ( rule__Exp1__Group_1__1__Impl rule__Exp1__Group_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1324:2: rule__Exp1__Group_1__1__Impl rule__Exp1__Group_1__2
            {
            pushFollow(FOLLOW_rule__Exp1__Group_1__1__Impl_in_rule__Exp1__Group_1__12949);
            rule__Exp1__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp1__Group_1__2_in_rule__Exp1__Group_1__12952);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1331:1: rule__Exp1__Group_1__1__Impl : ( ( rule__Exp1__BAssignment_1_1 )? ) ;
    public final void rule__Exp1__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1335:1: ( ( ( rule__Exp1__BAssignment_1_1 )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1336:1: ( ( rule__Exp1__BAssignment_1_1 )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1336:1: ( ( rule__Exp1__BAssignment_1_1 )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1337:1: ( rule__Exp1__BAssignment_1_1 )?
            {
             before(grammarAccess.getExp1Access().getBAssignment_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1338:1: ( rule__Exp1__BAssignment_1_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=27 && LA11_0<=28)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1338:2: rule__Exp1__BAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Exp1__BAssignment_1_1_in_rule__Exp1__Group_1__1__Impl2979);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1348:1: rule__Exp1__Group_1__2 : rule__Exp1__Group_1__2__Impl ;
    public final void rule__Exp1__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1352:1: ( rule__Exp1__Group_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1353:2: rule__Exp1__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Exp1__Group_1__2__Impl_in_rule__Exp1__Group_1__23010);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1359:1: rule__Exp1__Group_1__2__Impl : ( ( rule__Exp1__RightAssignment_1_2 ) ) ;
    public final void rule__Exp1__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1363:1: ( ( ( rule__Exp1__RightAssignment_1_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1364:1: ( ( rule__Exp1__RightAssignment_1_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1364:1: ( ( rule__Exp1__RightAssignment_1_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1365:1: ( rule__Exp1__RightAssignment_1_2 )
            {
             before(grammarAccess.getExp1Access().getRightAssignment_1_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1366:1: ( rule__Exp1__RightAssignment_1_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1366:2: rule__Exp1__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Exp1__RightAssignment_1_2_in_rule__Exp1__Group_1__2__Impl3037);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1382:1: rule__Exp2__Group_1__0 : rule__Exp2__Group_1__0__Impl rule__Exp2__Group_1__1 ;
    public final void rule__Exp2__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1386:1: ( rule__Exp2__Group_1__0__Impl rule__Exp2__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1387:2: rule__Exp2__Group_1__0__Impl rule__Exp2__Group_1__1
            {
            pushFollow(FOLLOW_rule__Exp2__Group_1__0__Impl_in_rule__Exp2__Group_1__03073);
            rule__Exp2__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp2__Group_1__1_in_rule__Exp2__Group_1__03076);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1394:1: rule__Exp2__Group_1__0__Impl : ( ( ruleUnaryExpression )? ) ;
    public final void rule__Exp2__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1398:1: ( ( ( ruleUnaryExpression )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1399:1: ( ( ruleUnaryExpression )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1399:1: ( ( ruleUnaryExpression )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1400:1: ( ruleUnaryExpression )?
            {
             before(grammarAccess.getExp2Access().getUnaryExpressionParserRuleCall_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1401:1: ( ruleUnaryExpression )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=23 && LA12_0<=26)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1401:3: ruleUnaryExpression
                    {
                    pushFollow(FOLLOW_ruleUnaryExpression_in_rule__Exp2__Group_1__0__Impl3104);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1411:1: rule__Exp2__Group_1__1 : rule__Exp2__Group_1__1__Impl rule__Exp2__Group_1__2 ;
    public final void rule__Exp2__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1415:1: ( rule__Exp2__Group_1__1__Impl rule__Exp2__Group_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1416:2: rule__Exp2__Group_1__1__Impl rule__Exp2__Group_1__2
            {
            pushFollow(FOLLOW_rule__Exp2__Group_1__1__Impl_in_rule__Exp2__Group_1__13135);
            rule__Exp2__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp2__Group_1__2_in_rule__Exp2__Group_1__13138);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1423:1: rule__Exp2__Group_1__1__Impl : ( '(' ) ;
    public final void rule__Exp2__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1427:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1428:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1428:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1429:1: '('
            {
             before(grammarAccess.getExp2Access().getLeftParenthesisKeyword_1_1()); 
            match(input,29,FOLLOW_29_in_rule__Exp2__Group_1__1__Impl3166); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1442:1: rule__Exp2__Group_1__2 : rule__Exp2__Group_1__2__Impl rule__Exp2__Group_1__3 ;
    public final void rule__Exp2__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1446:1: ( rule__Exp2__Group_1__2__Impl rule__Exp2__Group_1__3 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1447:2: rule__Exp2__Group_1__2__Impl rule__Exp2__Group_1__3
            {
            pushFollow(FOLLOW_rule__Exp2__Group_1__2__Impl_in_rule__Exp2__Group_1__23197);
            rule__Exp2__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp2__Group_1__3_in_rule__Exp2__Group_1__23200);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1454:1: rule__Exp2__Group_1__2__Impl : ( ruleExp1 ) ;
    public final void rule__Exp2__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1458:1: ( ( ruleExp1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1459:1: ( ruleExp1 )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1459:1: ( ruleExp1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1460:1: ruleExp1
            {
             before(grammarAccess.getExp2Access().getExp1ParserRuleCall_1_2()); 
            pushFollow(FOLLOW_ruleExp1_in_rule__Exp2__Group_1__2__Impl3227);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1471:1: rule__Exp2__Group_1__3 : rule__Exp2__Group_1__3__Impl ;
    public final void rule__Exp2__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1475:1: ( rule__Exp2__Group_1__3__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1476:2: rule__Exp2__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Exp2__Group_1__3__Impl_in_rule__Exp2__Group_1__33256);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1482:1: rule__Exp2__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Exp2__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1486:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1487:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1487:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1488:1: ')'
            {
             before(grammarAccess.getExp2Access().getRightParenthesisKeyword_1_3()); 
            match(input,30,FOLLOW_30_in_rule__Exp2__Group_1__3__Impl3284); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1509:1: rule__ClauseExpression__Group__0 : rule__ClauseExpression__Group__0__Impl rule__ClauseExpression__Group__1 ;
    public final void rule__ClauseExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1513:1: ( rule__ClauseExpression__Group__0__Impl rule__ClauseExpression__Group__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1514:2: rule__ClauseExpression__Group__0__Impl rule__ClauseExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group__0__Impl_in_rule__ClauseExpression__Group__03323);
            rule__ClauseExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group__1_in_rule__ClauseExpression__Group__03326);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1521:1: rule__ClauseExpression__Group__0__Impl : ( ( ruleUnaryExpression )? ) ;
    public final void rule__ClauseExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1525:1: ( ( ( ruleUnaryExpression )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1526:1: ( ( ruleUnaryExpression )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1526:1: ( ( ruleUnaryExpression )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1527:1: ( ruleUnaryExpression )?
            {
             before(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1528:1: ( ruleUnaryExpression )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=23 && LA13_0<=26)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1528:3: ruleUnaryExpression
                    {
                    pushFollow(FOLLOW_ruleUnaryExpression_in_rule__ClauseExpression__Group__0__Impl3354);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1538:1: rule__ClauseExpression__Group__1 : rule__ClauseExpression__Group__1__Impl ;
    public final void rule__ClauseExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1542:1: ( rule__ClauseExpression__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1543:2: rule__ClauseExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group__1__Impl_in_rule__ClauseExpression__Group__13385);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1549:1: rule__ClauseExpression__Group__1__Impl : ( ( rule__ClauseExpression__Alternatives_1 ) ) ;
    public final void rule__ClauseExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1553:1: ( ( ( rule__ClauseExpression__Alternatives_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1554:1: ( ( rule__ClauseExpression__Alternatives_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1554:1: ( ( rule__ClauseExpression__Alternatives_1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1555:1: ( rule__ClauseExpression__Alternatives_1 )
            {
             before(grammarAccess.getClauseExpressionAccess().getAlternatives_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1556:1: ( rule__ClauseExpression__Alternatives_1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1556:2: rule__ClauseExpression__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Alternatives_1_in_rule__ClauseExpression__Group__1__Impl3412);
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


    // $ANTLR start "rule__ClauseExpression__Group_1_0__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1570:1: rule__ClauseExpression__Group_1_0__0 : rule__ClauseExpression__Group_1_0__0__Impl rule__ClauseExpression__Group_1_0__1 ;
    public final void rule__ClauseExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1574:1: ( rule__ClauseExpression__Group_1_0__0__Impl rule__ClauseExpression__Group_1_0__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1575:2: rule__ClauseExpression__Group_1_0__0__Impl rule__ClauseExpression__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_0__0__Impl_in_rule__ClauseExpression__Group_1_0__03446);
            rule__ClauseExpression__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_0__1_in_rule__ClauseExpression__Group_1_0__03449);
            rule__ClauseExpression__Group_1_0__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_0__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_0__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1582:1: rule__ClauseExpression__Group_1_0__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_0_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1586:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_0_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1587:1: ( ( rule__ClauseExpression__FieldAssignment_1_0_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1587:1: ( ( rule__ClauseExpression__FieldAssignment_1_0_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1588:1: ( rule__ClauseExpression__FieldAssignment_1_0_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_0_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1589:1: ( rule__ClauseExpression__FieldAssignment_1_0_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1589:2: rule__ClauseExpression__FieldAssignment_1_0_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_0_0_in_rule__ClauseExpression__Group_1_0__0__Impl3476);
            rule__ClauseExpression__FieldAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_0__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1599:1: rule__ClauseExpression__Group_1_0__1 : rule__ClauseExpression__Group_1_0__1__Impl rule__ClauseExpression__Group_1_0__2 ;
    public final void rule__ClauseExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1603:1: ( rule__ClauseExpression__Group_1_0__1__Impl rule__ClauseExpression__Group_1_0__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1604:2: rule__ClauseExpression__Group_1_0__1__Impl rule__ClauseExpression__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_0__1__Impl_in_rule__ClauseExpression__Group_1_0__13506);
            rule__ClauseExpression__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_0__2_in_rule__ClauseExpression__Group_1_0__13509);
            rule__ClauseExpression__Group_1_0__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_0__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_0__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1611:1: rule__ClauseExpression__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1615:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1616:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1616:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1617:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_0_1()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_0__1__Impl3537); 
             after(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_0__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_0__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1630:1: rule__ClauseExpression__Group_1_0__2 : rule__ClauseExpression__Group_1_0__2__Impl ;
    public final void rule__ClauseExpression__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1634:1: ( rule__ClauseExpression__Group_1_0__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1635:2: rule__ClauseExpression__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_0__2__Impl_in_rule__ClauseExpression__Group_1_0__23568);
            rule__ClauseExpression__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_0__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_0__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1641:1: rule__ClauseExpression__Group_1_0__2__Impl : ( ( rule__ClauseExpression__ValueAssignment_1_0_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1645:1: ( ( ( rule__ClauseExpression__ValueAssignment_1_0_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1646:1: ( ( rule__ClauseExpression__ValueAssignment_1_0_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1646:1: ( ( rule__ClauseExpression__ValueAssignment_1_0_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1647:1: ( rule__ClauseExpression__ValueAssignment_1_0_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_0_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1648:1: ( rule__ClauseExpression__ValueAssignment_1_0_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1648:2: rule__ClauseExpression__ValueAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValueAssignment_1_0_2_in_rule__ClauseExpression__Group_1_0__2__Impl3595);
            rule__ClauseExpression__ValueAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_0__2__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1664:1: rule__ClauseExpression__Group_1_1__0 : rule__ClauseExpression__Group_1_1__0__Impl rule__ClauseExpression__Group_1_1__1 ;
    public final void rule__ClauseExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1668:1: ( rule__ClauseExpression__Group_1_1__0__Impl rule__ClauseExpression__Group_1_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1669:2: rule__ClauseExpression__Group_1_1__0__Impl rule__ClauseExpression__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1__0__Impl_in_rule__ClauseExpression__Group_1_1__03631);
            rule__ClauseExpression__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1__1_in_rule__ClauseExpression__Group_1_1__03634);
            rule__ClauseExpression__Group_1_1__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1676:1: rule__ClauseExpression__Group_1_1__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_1_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1680:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_1_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1681:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1681:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1682:1: ( rule__ClauseExpression__FieldAssignment_1_1_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1683:1: ( rule__ClauseExpression__FieldAssignment_1_1_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1683:2: rule__ClauseExpression__FieldAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_0_in_rule__ClauseExpression__Group_1_1__0__Impl3661);
            rule__ClauseExpression__FieldAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1693:1: rule__ClauseExpression__Group_1_1__1 : rule__ClauseExpression__Group_1_1__1__Impl rule__ClauseExpression__Group_1_1__2 ;
    public final void rule__ClauseExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1697:1: ( rule__ClauseExpression__Group_1_1__1__Impl rule__ClauseExpression__Group_1_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1698:2: rule__ClauseExpression__Group_1_1__1__Impl rule__ClauseExpression__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1__1__Impl_in_rule__ClauseExpression__Group_1_1__13691);
            rule__ClauseExpression__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1__2_in_rule__ClauseExpression__Group_1_1__13694);
            rule__ClauseExpression__Group_1_1__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1705:1: rule__ClauseExpression__Group_1_1__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1709:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1710:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1710:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1711:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_1()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_1__1__Impl3722); 
             after(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1724:1: rule__ClauseExpression__Group_1_1__2 : rule__ClauseExpression__Group_1_1__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1728:1: ( rule__ClauseExpression__Group_1_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1729:2: rule__ClauseExpression__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1__2__Impl_in_rule__ClauseExpression__Group_1_1__23753);
            rule__ClauseExpression__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_1__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1735:1: rule__ClauseExpression__Group_1_1__2__Impl : ( ( rule__ClauseExpression__ValueAssignment_1_1_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1739:1: ( ( ( rule__ClauseExpression__ValueAssignment_1_1_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1740:1: ( ( rule__ClauseExpression__ValueAssignment_1_1_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1740:1: ( ( rule__ClauseExpression__ValueAssignment_1_1_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1741:1: ( rule__ClauseExpression__ValueAssignment_1_1_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_1_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1742:1: ( rule__ClauseExpression__ValueAssignment_1_1_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1742:2: rule__ClauseExpression__ValueAssignment_1_1_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValueAssignment_1_1_2_in_rule__ClauseExpression__Group_1_1__2__Impl3780);
            rule__ClauseExpression__ValueAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1__2__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_2__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1758:1: rule__ClauseExpression__Group_1_2__0 : rule__ClauseExpression__Group_1_2__0__Impl rule__ClauseExpression__Group_1_2__1 ;
    public final void rule__ClauseExpression__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1762:1: ( rule__ClauseExpression__Group_1_2__0__Impl rule__ClauseExpression__Group_1_2__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1763:2: rule__ClauseExpression__Group_1_2__0__Impl rule__ClauseExpression__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_2__0__Impl_in_rule__ClauseExpression__Group_1_2__03816);
            rule__ClauseExpression__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_2__1_in_rule__ClauseExpression__Group_1_2__03819);
            rule__ClauseExpression__Group_1_2__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_2__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_2__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1770:1: rule__ClauseExpression__Group_1_2__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_2_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1774:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_2_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1775:1: ( ( rule__ClauseExpression__FieldAssignment_1_2_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1775:1: ( ( rule__ClauseExpression__FieldAssignment_1_2_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1776:1: ( rule__ClauseExpression__FieldAssignment_1_2_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_2_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1777:1: ( rule__ClauseExpression__FieldAssignment_1_2_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1777:2: rule__ClauseExpression__FieldAssignment_1_2_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_2_0_in_rule__ClauseExpression__Group_1_2__0__Impl3846);
            rule__ClauseExpression__FieldAssignment_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_2__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_2__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1787:1: rule__ClauseExpression__Group_1_2__1 : rule__ClauseExpression__Group_1_2__1__Impl rule__ClauseExpression__Group_1_2__2 ;
    public final void rule__ClauseExpression__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1791:1: ( rule__ClauseExpression__Group_1_2__1__Impl rule__ClauseExpression__Group_1_2__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1792:2: rule__ClauseExpression__Group_1_2__1__Impl rule__ClauseExpression__Group_1_2__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_2__1__Impl_in_rule__ClauseExpression__Group_1_2__13876);
            rule__ClauseExpression__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_2__2_in_rule__ClauseExpression__Group_1_2__13879);
            rule__ClauseExpression__Group_1_2__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_2__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_2__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1799:1: rule__ClauseExpression__Group_1_2__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1803:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1804:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1804:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1805:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_2_1()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_2__1__Impl3907); 
             after(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_2__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_2__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1818:1: rule__ClauseExpression__Group_1_2__2 : rule__ClauseExpression__Group_1_2__2__Impl ;
    public final void rule__ClauseExpression__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1822:1: ( rule__ClauseExpression__Group_1_2__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1823:2: rule__ClauseExpression__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_2__2__Impl_in_rule__ClauseExpression__Group_1_2__23938);
            rule__ClauseExpression__Group_1_2__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_2__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_2__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1829:1: rule__ClauseExpression__Group_1_2__2__Impl : ( ( rule__ClauseExpression__ValueAssignment_1_2_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1833:1: ( ( ( rule__ClauseExpression__ValueAssignment_1_2_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1834:1: ( ( rule__ClauseExpression__ValueAssignment_1_2_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1834:1: ( ( rule__ClauseExpression__ValueAssignment_1_2_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1835:1: ( rule__ClauseExpression__ValueAssignment_1_2_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_2_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1836:1: ( rule__ClauseExpression__ValueAssignment_1_2_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1836:2: rule__ClauseExpression__ValueAssignment_1_2_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValueAssignment_1_2_2_in_rule__ClauseExpression__Group_1_2__2__Impl3965);
            rule__ClauseExpression__ValueAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_2__2__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_3__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1852:1: rule__ClauseExpression__Group_1_3__0 : rule__ClauseExpression__Group_1_3__0__Impl rule__ClauseExpression__Group_1_3__1 ;
    public final void rule__ClauseExpression__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1856:1: ( rule__ClauseExpression__Group_1_3__0__Impl rule__ClauseExpression__Group_1_3__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1857:2: rule__ClauseExpression__Group_1_3__0__Impl rule__ClauseExpression__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_3__0__Impl_in_rule__ClauseExpression__Group_1_3__04001);
            rule__ClauseExpression__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_3__1_in_rule__ClauseExpression__Group_1_3__04004);
            rule__ClauseExpression__Group_1_3__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_3__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_3__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1864:1: rule__ClauseExpression__Group_1_3__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_3_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1868:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_3_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1869:1: ( ( rule__ClauseExpression__FieldAssignment_1_3_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1869:1: ( ( rule__ClauseExpression__FieldAssignment_1_3_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1870:1: ( rule__ClauseExpression__FieldAssignment_1_3_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_3_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1871:1: ( rule__ClauseExpression__FieldAssignment_1_3_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1871:2: rule__ClauseExpression__FieldAssignment_1_3_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_3_0_in_rule__ClauseExpression__Group_1_3__0__Impl4031);
            rule__ClauseExpression__FieldAssignment_1_3_0();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_3__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_3__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1881:1: rule__ClauseExpression__Group_1_3__1 : rule__ClauseExpression__Group_1_3__1__Impl rule__ClauseExpression__Group_1_3__2 ;
    public final void rule__ClauseExpression__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1885:1: ( rule__ClauseExpression__Group_1_3__1__Impl rule__ClauseExpression__Group_1_3__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1886:2: rule__ClauseExpression__Group_1_3__1__Impl rule__ClauseExpression__Group_1_3__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_3__1__Impl_in_rule__ClauseExpression__Group_1_3__14061);
            rule__ClauseExpression__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_3__2_in_rule__ClauseExpression__Group_1_3__14064);
            rule__ClauseExpression__Group_1_3__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_3__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_3__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1893:1: rule__ClauseExpression__Group_1_3__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1897:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1898:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1898:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1899:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_3_1()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_3__1__Impl4092); 
             after(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_3__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_3__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1912:1: rule__ClauseExpression__Group_1_3__2 : rule__ClauseExpression__Group_1_3__2__Impl ;
    public final void rule__ClauseExpression__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1916:1: ( rule__ClauseExpression__Group_1_3__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1917:2: rule__ClauseExpression__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_3__2__Impl_in_rule__ClauseExpression__Group_1_3__24123);
            rule__ClauseExpression__Group_1_3__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_3__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_3__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1923:1: rule__ClauseExpression__Group_1_3__2__Impl : ( ( rule__ClauseExpression__ValueAssignment_1_3_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1927:1: ( ( ( rule__ClauseExpression__ValueAssignment_1_3_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1928:1: ( ( rule__ClauseExpression__ValueAssignment_1_3_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1928:1: ( ( rule__ClauseExpression__ValueAssignment_1_3_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1929:1: ( rule__ClauseExpression__ValueAssignment_1_3_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_3_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1930:1: ( rule__ClauseExpression__ValueAssignment_1_3_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1930:2: rule__ClauseExpression__ValueAssignment_1_3_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValueAssignment_1_3_2_in_rule__ClauseExpression__Group_1_3__2__Impl4150);
            rule__ClauseExpression__ValueAssignment_1_3_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_3__2__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_4__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1946:1: rule__ClauseExpression__Group_1_4__0 : rule__ClauseExpression__Group_1_4__0__Impl rule__ClauseExpression__Group_1_4__1 ;
    public final void rule__ClauseExpression__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1950:1: ( rule__ClauseExpression__Group_1_4__0__Impl rule__ClauseExpression__Group_1_4__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1951:2: rule__ClauseExpression__Group_1_4__0__Impl rule__ClauseExpression__Group_1_4__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_4__0__Impl_in_rule__ClauseExpression__Group_1_4__04186);
            rule__ClauseExpression__Group_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_4__1_in_rule__ClauseExpression__Group_1_4__04189);
            rule__ClauseExpression__Group_1_4__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_4__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_4__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1958:1: rule__ClauseExpression__Group_1_4__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_4_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1962:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_4_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1963:1: ( ( rule__ClauseExpression__FieldAssignment_1_4_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1963:1: ( ( rule__ClauseExpression__FieldAssignment_1_4_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1964:1: ( rule__ClauseExpression__FieldAssignment_1_4_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_4_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1965:1: ( rule__ClauseExpression__FieldAssignment_1_4_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1965:2: rule__ClauseExpression__FieldAssignment_1_4_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_4_0_in_rule__ClauseExpression__Group_1_4__0__Impl4216);
            rule__ClauseExpression__FieldAssignment_1_4_0();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_4__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_4__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1975:1: rule__ClauseExpression__Group_1_4__1 : rule__ClauseExpression__Group_1_4__1__Impl rule__ClauseExpression__Group_1_4__2 ;
    public final void rule__ClauseExpression__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1979:1: ( rule__ClauseExpression__Group_1_4__1__Impl rule__ClauseExpression__Group_1_4__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1980:2: rule__ClauseExpression__Group_1_4__1__Impl rule__ClauseExpression__Group_1_4__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_4__1__Impl_in_rule__ClauseExpression__Group_1_4__14246);
            rule__ClauseExpression__Group_1_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_4__2_in_rule__ClauseExpression__Group_1_4__14249);
            rule__ClauseExpression__Group_1_4__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_4__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_4__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1987:1: rule__ClauseExpression__Group_1_4__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1991:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1992:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1992:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1993:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_4_1()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_4__1__Impl4277); 
             after(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_4__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_4__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2006:1: rule__ClauseExpression__Group_1_4__2 : rule__ClauseExpression__Group_1_4__2__Impl ;
    public final void rule__ClauseExpression__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2010:1: ( rule__ClauseExpression__Group_1_4__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2011:2: rule__ClauseExpression__Group_1_4__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_4__2__Impl_in_rule__ClauseExpression__Group_1_4__24308);
            rule__ClauseExpression__Group_1_4__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_4__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_4__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2017:1: rule__ClauseExpression__Group_1_4__2__Impl : ( ( rule__ClauseExpression__ValueAssignment_1_4_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2021:1: ( ( ( rule__ClauseExpression__ValueAssignment_1_4_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2022:1: ( ( rule__ClauseExpression__ValueAssignment_1_4_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2022:1: ( ( rule__ClauseExpression__ValueAssignment_1_4_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2023:1: ( rule__ClauseExpression__ValueAssignment_1_4_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_4_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2024:1: ( rule__ClauseExpression__ValueAssignment_1_4_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2024:2: rule__ClauseExpression__ValueAssignment_1_4_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValueAssignment_1_4_2_in_rule__ClauseExpression__Group_1_4__2__Impl4335);
            rule__ClauseExpression__ValueAssignment_1_4_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_4__2__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_5__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2040:1: rule__ClauseExpression__Group_1_5__0 : rule__ClauseExpression__Group_1_5__0__Impl rule__ClauseExpression__Group_1_5__1 ;
    public final void rule__ClauseExpression__Group_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2044:1: ( rule__ClauseExpression__Group_1_5__0__Impl rule__ClauseExpression__Group_1_5__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2045:2: rule__ClauseExpression__Group_1_5__0__Impl rule__ClauseExpression__Group_1_5__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_5__0__Impl_in_rule__ClauseExpression__Group_1_5__04371);
            rule__ClauseExpression__Group_1_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_5__1_in_rule__ClauseExpression__Group_1_5__04374);
            rule__ClauseExpression__Group_1_5__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_5__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_5__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2052:1: rule__ClauseExpression__Group_1_5__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_5_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2056:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_5_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2057:1: ( ( rule__ClauseExpression__FieldAssignment_1_5_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2057:1: ( ( rule__ClauseExpression__FieldAssignment_1_5_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2058:1: ( rule__ClauseExpression__FieldAssignment_1_5_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_5_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2059:1: ( rule__ClauseExpression__FieldAssignment_1_5_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2059:2: rule__ClauseExpression__FieldAssignment_1_5_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_5_0_in_rule__ClauseExpression__Group_1_5__0__Impl4401);
            rule__ClauseExpression__FieldAssignment_1_5_0();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_5__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_5__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2069:1: rule__ClauseExpression__Group_1_5__1 : rule__ClauseExpression__Group_1_5__1__Impl rule__ClauseExpression__Group_1_5__2 ;
    public final void rule__ClauseExpression__Group_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2073:1: ( rule__ClauseExpression__Group_1_5__1__Impl rule__ClauseExpression__Group_1_5__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2074:2: rule__ClauseExpression__Group_1_5__1__Impl rule__ClauseExpression__Group_1_5__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_5__1__Impl_in_rule__ClauseExpression__Group_1_5__14431);
            rule__ClauseExpression__Group_1_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_5__2_in_rule__ClauseExpression__Group_1_5__14434);
            rule__ClauseExpression__Group_1_5__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_5__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_5__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2081:1: rule__ClauseExpression__Group_1_5__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2085:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2086:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2086:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2087:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_5_1()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_5__1__Impl4462); 
             after(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_5__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_5__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2100:1: rule__ClauseExpression__Group_1_5__2 : rule__ClauseExpression__Group_1_5__2__Impl ;
    public final void rule__ClauseExpression__Group_1_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2104:1: ( rule__ClauseExpression__Group_1_5__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2105:2: rule__ClauseExpression__Group_1_5__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_5__2__Impl_in_rule__ClauseExpression__Group_1_5__24493);
            rule__ClauseExpression__Group_1_5__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_5__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_5__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2111:1: rule__ClauseExpression__Group_1_5__2__Impl : ( ( rule__ClauseExpression__ValueAssignment_1_5_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2115:1: ( ( ( rule__ClauseExpression__ValueAssignment_1_5_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2116:1: ( ( rule__ClauseExpression__ValueAssignment_1_5_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2116:1: ( ( rule__ClauseExpression__ValueAssignment_1_5_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2117:1: ( rule__ClauseExpression__ValueAssignment_1_5_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_5_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2118:1: ( rule__ClauseExpression__ValueAssignment_1_5_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2118:2: rule__ClauseExpression__ValueAssignment_1_5_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValueAssignment_1_5_2_in_rule__ClauseExpression__Group_1_5__2__Impl4520);
            rule__ClauseExpression__ValueAssignment_1_5_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_5__2__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_6__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2134:1: rule__ClauseExpression__Group_1_6__0 : rule__ClauseExpression__Group_1_6__0__Impl rule__ClauseExpression__Group_1_6__1 ;
    public final void rule__ClauseExpression__Group_1_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2138:1: ( rule__ClauseExpression__Group_1_6__0__Impl rule__ClauseExpression__Group_1_6__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2139:2: rule__ClauseExpression__Group_1_6__0__Impl rule__ClauseExpression__Group_1_6__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_6__0__Impl_in_rule__ClauseExpression__Group_1_6__04556);
            rule__ClauseExpression__Group_1_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_6__1_in_rule__ClauseExpression__Group_1_6__04559);
            rule__ClauseExpression__Group_1_6__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_6__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_6__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2146:1: rule__ClauseExpression__Group_1_6__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_6_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2150:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_6_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2151:1: ( ( rule__ClauseExpression__FieldAssignment_1_6_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2151:1: ( ( rule__ClauseExpression__FieldAssignment_1_6_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2152:1: ( rule__ClauseExpression__FieldAssignment_1_6_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_6_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2153:1: ( rule__ClauseExpression__FieldAssignment_1_6_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2153:2: rule__ClauseExpression__FieldAssignment_1_6_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_6_0_in_rule__ClauseExpression__Group_1_6__0__Impl4586);
            rule__ClauseExpression__FieldAssignment_1_6_0();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_6__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_6__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2163:1: rule__ClauseExpression__Group_1_6__1 : rule__ClauseExpression__Group_1_6__1__Impl rule__ClauseExpression__Group_1_6__2 ;
    public final void rule__ClauseExpression__Group_1_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2167:1: ( rule__ClauseExpression__Group_1_6__1__Impl rule__ClauseExpression__Group_1_6__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2168:2: rule__ClauseExpression__Group_1_6__1__Impl rule__ClauseExpression__Group_1_6__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_6__1__Impl_in_rule__ClauseExpression__Group_1_6__14616);
            rule__ClauseExpression__Group_1_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_6__2_in_rule__ClauseExpression__Group_1_6__14619);
            rule__ClauseExpression__Group_1_6__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_6__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_6__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2175:1: rule__ClauseExpression__Group_1_6__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2179:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2180:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2180:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2181:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_6_1()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_6__1__Impl4647); 
             after(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_6__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_6__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2194:1: rule__ClauseExpression__Group_1_6__2 : rule__ClauseExpression__Group_1_6__2__Impl ;
    public final void rule__ClauseExpression__Group_1_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2198:1: ( rule__ClauseExpression__Group_1_6__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2199:2: rule__ClauseExpression__Group_1_6__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_6__2__Impl_in_rule__ClauseExpression__Group_1_6__24678);
            rule__ClauseExpression__Group_1_6__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_6__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_6__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2205:1: rule__ClauseExpression__Group_1_6__2__Impl : ( ( rule__ClauseExpression__ValueAssignment_1_6_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2209:1: ( ( ( rule__ClauseExpression__ValueAssignment_1_6_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2210:1: ( ( rule__ClauseExpression__ValueAssignment_1_6_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2210:1: ( ( rule__ClauseExpression__ValueAssignment_1_6_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2211:1: ( rule__ClauseExpression__ValueAssignment_1_6_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_6_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2212:1: ( rule__ClauseExpression__ValueAssignment_1_6_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2212:2: rule__ClauseExpression__ValueAssignment_1_6_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValueAssignment_1_6_2_in_rule__ClauseExpression__Group_1_6__2__Impl4705);
            rule__ClauseExpression__ValueAssignment_1_6_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_6__2__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_7__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2228:1: rule__ClauseExpression__Group_1_7__0 : rule__ClauseExpression__Group_1_7__0__Impl rule__ClauseExpression__Group_1_7__1 ;
    public final void rule__ClauseExpression__Group_1_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2232:1: ( rule__ClauseExpression__Group_1_7__0__Impl rule__ClauseExpression__Group_1_7__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2233:2: rule__ClauseExpression__Group_1_7__0__Impl rule__ClauseExpression__Group_1_7__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_7__0__Impl_in_rule__ClauseExpression__Group_1_7__04741);
            rule__ClauseExpression__Group_1_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_7__1_in_rule__ClauseExpression__Group_1_7__04744);
            rule__ClauseExpression__Group_1_7__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_7__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_7__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2240:1: rule__ClauseExpression__Group_1_7__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_7_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2244:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_7_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2245:1: ( ( rule__ClauseExpression__FieldAssignment_1_7_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2245:1: ( ( rule__ClauseExpression__FieldAssignment_1_7_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2246:1: ( rule__ClauseExpression__FieldAssignment_1_7_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_7_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2247:1: ( rule__ClauseExpression__FieldAssignment_1_7_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2247:2: rule__ClauseExpression__FieldAssignment_1_7_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_7_0_in_rule__ClauseExpression__Group_1_7__0__Impl4771);
            rule__ClauseExpression__FieldAssignment_1_7_0();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_7__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_7__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2257:1: rule__ClauseExpression__Group_1_7__1 : rule__ClauseExpression__Group_1_7__1__Impl rule__ClauseExpression__Group_1_7__2 ;
    public final void rule__ClauseExpression__Group_1_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2261:1: ( rule__ClauseExpression__Group_1_7__1__Impl rule__ClauseExpression__Group_1_7__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2262:2: rule__ClauseExpression__Group_1_7__1__Impl rule__ClauseExpression__Group_1_7__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_7__1__Impl_in_rule__ClauseExpression__Group_1_7__14801);
            rule__ClauseExpression__Group_1_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_7__2_in_rule__ClauseExpression__Group_1_7__14804);
            rule__ClauseExpression__Group_1_7__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_7__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_7__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2269:1: rule__ClauseExpression__Group_1_7__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2273:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2274:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2274:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2275:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_7_1()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_7__1__Impl4832); 
             after(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_7__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_7__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2288:1: rule__ClauseExpression__Group_1_7__2 : rule__ClauseExpression__Group_1_7__2__Impl ;
    public final void rule__ClauseExpression__Group_1_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2292:1: ( rule__ClauseExpression__Group_1_7__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2293:2: rule__ClauseExpression__Group_1_7__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_7__2__Impl_in_rule__ClauseExpression__Group_1_7__24863);
            rule__ClauseExpression__Group_1_7__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_7__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_7__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2299:1: rule__ClauseExpression__Group_1_7__2__Impl : ( ( rule__ClauseExpression__ValueAssignment_1_7_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2303:1: ( ( ( rule__ClauseExpression__ValueAssignment_1_7_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2304:1: ( ( rule__ClauseExpression__ValueAssignment_1_7_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2304:1: ( ( rule__ClauseExpression__ValueAssignment_1_7_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2305:1: ( rule__ClauseExpression__ValueAssignment_1_7_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_7_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2306:1: ( rule__ClauseExpression__ValueAssignment_1_7_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2306:2: rule__ClauseExpression__ValueAssignment_1_7_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValueAssignment_1_7_2_in_rule__ClauseExpression__Group_1_7__2__Impl4890);
            rule__ClauseExpression__ValueAssignment_1_7_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_7__2__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_8__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2322:1: rule__ClauseExpression__Group_1_8__0 : rule__ClauseExpression__Group_1_8__0__Impl rule__ClauseExpression__Group_1_8__1 ;
    public final void rule__ClauseExpression__Group_1_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2326:1: ( rule__ClauseExpression__Group_1_8__0__Impl rule__ClauseExpression__Group_1_8__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2327:2: rule__ClauseExpression__Group_1_8__0__Impl rule__ClauseExpression__Group_1_8__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_8__0__Impl_in_rule__ClauseExpression__Group_1_8__04926);
            rule__ClauseExpression__Group_1_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_8__1_in_rule__ClauseExpression__Group_1_8__04929);
            rule__ClauseExpression__Group_1_8__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_8__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_8__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2334:1: rule__ClauseExpression__Group_1_8__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_8_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2338:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_8_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2339:1: ( ( rule__ClauseExpression__FieldAssignment_1_8_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2339:1: ( ( rule__ClauseExpression__FieldAssignment_1_8_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2340:1: ( rule__ClauseExpression__FieldAssignment_1_8_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_8_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2341:1: ( rule__ClauseExpression__FieldAssignment_1_8_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2341:2: rule__ClauseExpression__FieldAssignment_1_8_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_8_0_in_rule__ClauseExpression__Group_1_8__0__Impl4956);
            rule__ClauseExpression__FieldAssignment_1_8_0();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_8__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_8__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2351:1: rule__ClauseExpression__Group_1_8__1 : rule__ClauseExpression__Group_1_8__1__Impl rule__ClauseExpression__Group_1_8__2 ;
    public final void rule__ClauseExpression__Group_1_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2355:1: ( rule__ClauseExpression__Group_1_8__1__Impl rule__ClauseExpression__Group_1_8__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2356:2: rule__ClauseExpression__Group_1_8__1__Impl rule__ClauseExpression__Group_1_8__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_8__1__Impl_in_rule__ClauseExpression__Group_1_8__14986);
            rule__ClauseExpression__Group_1_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_8__2_in_rule__ClauseExpression__Group_1_8__14989);
            rule__ClauseExpression__Group_1_8__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_8__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_8__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2363:1: rule__ClauseExpression__Group_1_8__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2367:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2368:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2368:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2369:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_8_1()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_8__1__Impl5017); 
             after(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_8__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_8__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2382:1: rule__ClauseExpression__Group_1_8__2 : rule__ClauseExpression__Group_1_8__2__Impl ;
    public final void rule__ClauseExpression__Group_1_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2386:1: ( rule__ClauseExpression__Group_1_8__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2387:2: rule__ClauseExpression__Group_1_8__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_8__2__Impl_in_rule__ClauseExpression__Group_1_8__25048);
            rule__ClauseExpression__Group_1_8__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_8__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_8__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2393:1: rule__ClauseExpression__Group_1_8__2__Impl : ( ( rule__ClauseExpression__ValueAssignment_1_8_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2397:1: ( ( ( rule__ClauseExpression__ValueAssignment_1_8_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2398:1: ( ( rule__ClauseExpression__ValueAssignment_1_8_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2398:1: ( ( rule__ClauseExpression__ValueAssignment_1_8_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2399:1: ( rule__ClauseExpression__ValueAssignment_1_8_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_8_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2400:1: ( rule__ClauseExpression__ValueAssignment_1_8_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2400:2: rule__ClauseExpression__ValueAssignment_1_8_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValueAssignment_1_8_2_in_rule__ClauseExpression__Group_1_8__2__Impl5075);
            rule__ClauseExpression__ValueAssignment_1_8_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_8__2__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_9__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2416:1: rule__ClauseExpression__Group_1_9__0 : rule__ClauseExpression__Group_1_9__0__Impl rule__ClauseExpression__Group_1_9__1 ;
    public final void rule__ClauseExpression__Group_1_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2420:1: ( rule__ClauseExpression__Group_1_9__0__Impl rule__ClauseExpression__Group_1_9__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2421:2: rule__ClauseExpression__Group_1_9__0__Impl rule__ClauseExpression__Group_1_9__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_9__0__Impl_in_rule__ClauseExpression__Group_1_9__05111);
            rule__ClauseExpression__Group_1_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_9__1_in_rule__ClauseExpression__Group_1_9__05114);
            rule__ClauseExpression__Group_1_9__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_9__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_9__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2428:1: rule__ClauseExpression__Group_1_9__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_9_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2432:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_9_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2433:1: ( ( rule__ClauseExpression__FieldAssignment_1_9_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2433:1: ( ( rule__ClauseExpression__FieldAssignment_1_9_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2434:1: ( rule__ClauseExpression__FieldAssignment_1_9_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_9_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2435:1: ( rule__ClauseExpression__FieldAssignment_1_9_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2435:2: rule__ClauseExpression__FieldAssignment_1_9_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_9_0_in_rule__ClauseExpression__Group_1_9__0__Impl5141);
            rule__ClauseExpression__FieldAssignment_1_9_0();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_9__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_9__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2445:1: rule__ClauseExpression__Group_1_9__1 : rule__ClauseExpression__Group_1_9__1__Impl rule__ClauseExpression__Group_1_9__2 ;
    public final void rule__ClauseExpression__Group_1_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2449:1: ( rule__ClauseExpression__Group_1_9__1__Impl rule__ClauseExpression__Group_1_9__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2450:2: rule__ClauseExpression__Group_1_9__1__Impl rule__ClauseExpression__Group_1_9__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_9__1__Impl_in_rule__ClauseExpression__Group_1_9__15171);
            rule__ClauseExpression__Group_1_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_9__2_in_rule__ClauseExpression__Group_1_9__15174);
            rule__ClauseExpression__Group_1_9__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_9__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_9__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2457:1: rule__ClauseExpression__Group_1_9__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2461:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2462:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2462:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2463:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_9_1()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_9__1__Impl5202); 
             after(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_9__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_9__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2476:1: rule__ClauseExpression__Group_1_9__2 : rule__ClauseExpression__Group_1_9__2__Impl ;
    public final void rule__ClauseExpression__Group_1_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2480:1: ( rule__ClauseExpression__Group_1_9__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2481:2: rule__ClauseExpression__Group_1_9__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_9__2__Impl_in_rule__ClauseExpression__Group_1_9__25233);
            rule__ClauseExpression__Group_1_9__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_9__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_9__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2487:1: rule__ClauseExpression__Group_1_9__2__Impl : ( ( rule__ClauseExpression__ValueAssignment_1_9_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2491:1: ( ( ( rule__ClauseExpression__ValueAssignment_1_9_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2492:1: ( ( rule__ClauseExpression__ValueAssignment_1_9_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2492:1: ( ( rule__ClauseExpression__ValueAssignment_1_9_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2493:1: ( rule__ClauseExpression__ValueAssignment_1_9_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_9_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2494:1: ( rule__ClauseExpression__ValueAssignment_1_9_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2494:2: rule__ClauseExpression__ValueAssignment_1_9_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValueAssignment_1_9_2_in_rule__ClauseExpression__Group_1_9__2__Impl5260);
            rule__ClauseExpression__ValueAssignment_1_9_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValueAssignment_1_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_9__2__Impl"


    // $ANTLR start "rule__Exp1__BAssignment_1_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2511:1: rule__Exp1__BAssignment_1_1 : ( ruleBinaryExp ) ;
    public final void rule__Exp1__BAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2515:1: ( ( ruleBinaryExp ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2516:1: ( ruleBinaryExp )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2516:1: ( ruleBinaryExp )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2517:1: ruleBinaryExp
            {
             before(grammarAccess.getExp1Access().getBBinaryExpEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleBinaryExp_in_rule__Exp1__BAssignment_1_15301);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2526:1: rule__Exp1__RightAssignment_1_2 : ( ruleExp1 ) ;
    public final void rule__Exp1__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2530:1: ( ( ruleExp1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2531:1: ( ruleExp1 )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2531:1: ( ruleExp1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2532:1: ruleExp1
            {
             before(grammarAccess.getExp1Access().getRightExp1ParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleExp1_in_rule__Exp1__RightAssignment_1_25332);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2541:1: rule__Exp2__ValueAssignment_0 : ( ruleClauseExpression ) ;
    public final void rule__Exp2__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2545:1: ( ( ruleClauseExpression ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2546:1: ( ruleClauseExpression )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2546:1: ( ruleClauseExpression )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2547:1: ruleClauseExpression
            {
             before(grammarAccess.getExp2Access().getValueClauseExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleClauseExpression_in_rule__Exp2__ValueAssignment_05363);
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


    // $ANTLR start "rule__ClauseExpression__FieldAssignment_1_0_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2556:1: rule__ClauseExpression__FieldAssignment_1_0_0 : ( ruleSimpleField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2560:1: ( ( ruleSimpleField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2561:1: ( ruleSimpleField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2561:1: ( ruleSimpleField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2562:1: ruleSimpleField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldSimpleFieldParserRuleCall_1_0_0_0()); 
            pushFollow(FOLLOW_ruleSimpleField_in_rule__ClauseExpression__FieldAssignment_1_0_05394);
            ruleSimpleField();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getFieldSimpleFieldParserRuleCall_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__FieldAssignment_1_0_0"


    // $ANTLR start "rule__ClauseExpression__ValueAssignment_1_0_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2571:1: rule__ClauseExpression__ValueAssignment_1_0_2 : ( ruleSimpleFieldValue ) ;
    public final void rule__ClauseExpression__ValueAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2575:1: ( ( ruleSimpleFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2576:1: ( ruleSimpleFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2576:1: ( ruleSimpleFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2577:1: ruleSimpleFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValueSimpleFieldValueParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_ruleSimpleFieldValue_in_rule__ClauseExpression__ValueAssignment_1_0_25425);
            ruleSimpleFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValueSimpleFieldValueParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValueAssignment_1_0_2"


    // $ANTLR start "rule__ClauseExpression__FieldAssignment_1_1_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2586:1: rule__ClauseExpression__FieldAssignment_1_1_0 : ( ruleTypeField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2590:1: ( ( ruleTypeField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2591:1: ( ruleTypeField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2591:1: ( ruleTypeField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2592:1: ruleTypeField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldTypeFieldParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_ruleTypeField_in_rule__ClauseExpression__FieldAssignment_1_1_05456);
            ruleTypeField();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getFieldTypeFieldParserRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__FieldAssignment_1_1_0"


    // $ANTLR start "rule__ClauseExpression__ValueAssignment_1_1_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2601:1: rule__ClauseExpression__ValueAssignment_1_1_2 : ( ruleTypeFieldValue ) ;
    public final void rule__ClauseExpression__ValueAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2605:1: ( ( ruleTypeFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2606:1: ( ruleTypeFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2606:1: ( ruleTypeFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2607:1: ruleTypeFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValueTypeFieldValueParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_ruleTypeFieldValue_in_rule__ClauseExpression__ValueAssignment_1_1_25487);
            ruleTypeFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValueTypeFieldValueParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValueAssignment_1_1_2"


    // $ANTLR start "rule__ClauseExpression__FieldAssignment_1_2_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2616:1: rule__ClauseExpression__FieldAssignment_1_2_0 : ( ruleMethodField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2620:1: ( ( ruleMethodField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2621:1: ( ruleMethodField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2621:1: ( ruleMethodField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2622:1: ruleMethodField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldMethodFieldParserRuleCall_1_2_0_0()); 
            pushFollow(FOLLOW_ruleMethodField_in_rule__ClauseExpression__FieldAssignment_1_2_05518);
            ruleMethodField();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getFieldMethodFieldParserRuleCall_1_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__FieldAssignment_1_2_0"


    // $ANTLR start "rule__ClauseExpression__ValueAssignment_1_2_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2631:1: rule__ClauseExpression__ValueAssignment_1_2_2 : ( ruleMethodFieldValue ) ;
    public final void rule__ClauseExpression__ValueAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2635:1: ( ( ruleMethodFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2636:1: ( ruleMethodFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2636:1: ( ruleMethodFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2637:1: ruleMethodFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValueMethodFieldValueParserRuleCall_1_2_2_0()); 
            pushFollow(FOLLOW_ruleMethodFieldValue_in_rule__ClauseExpression__ValueAssignment_1_2_25549);
            ruleMethodFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValueMethodFieldValueParserRuleCall_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValueAssignment_1_2_2"


    // $ANTLR start "rule__ClauseExpression__FieldAssignment_1_3_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2646:1: rule__ClauseExpression__FieldAssignment_1_3_0 : ( ruleFilePathField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2650:1: ( ( ruleFilePathField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2651:1: ( ruleFilePathField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2651:1: ( ruleFilePathField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2652:1: ruleFilePathField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldFilePathFieldParserRuleCall_1_3_0_0()); 
            pushFollow(FOLLOW_ruleFilePathField_in_rule__ClauseExpression__FieldAssignment_1_3_05580);
            ruleFilePathField();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getFieldFilePathFieldParserRuleCall_1_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__FieldAssignment_1_3_0"


    // $ANTLR start "rule__ClauseExpression__ValueAssignment_1_3_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2661:1: rule__ClauseExpression__ValueAssignment_1_3_2 : ( ruleFilePathFieldValue ) ;
    public final void rule__ClauseExpression__ValueAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2665:1: ( ( ruleFilePathFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2666:1: ( ruleFilePathFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2666:1: ( ruleFilePathFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2667:1: ruleFilePathFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValueFilePathFieldValueParserRuleCall_1_3_2_0()); 
            pushFollow(FOLLOW_ruleFilePathFieldValue_in_rule__ClauseExpression__ValueAssignment_1_3_25611);
            ruleFilePathFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValueFilePathFieldValueParserRuleCall_1_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValueAssignment_1_3_2"


    // $ANTLR start "rule__ClauseExpression__FieldAssignment_1_4_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2676:1: rule__ClauseExpression__FieldAssignment_1_4_0 : ( ruleNumberField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2680:1: ( ( ruleNumberField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2681:1: ( ruleNumberField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2681:1: ( ruleNumberField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2682:1: ruleNumberField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldNumberFieldParserRuleCall_1_4_0_0()); 
            pushFollow(FOLLOW_ruleNumberField_in_rule__ClauseExpression__FieldAssignment_1_4_05642);
            ruleNumberField();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getFieldNumberFieldParserRuleCall_1_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__FieldAssignment_1_4_0"


    // $ANTLR start "rule__ClauseExpression__ValueAssignment_1_4_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2691:1: rule__ClauseExpression__ValueAssignment_1_4_2 : ( ruleNumberFieldValue ) ;
    public final void rule__ClauseExpression__ValueAssignment_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2695:1: ( ( ruleNumberFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2696:1: ( ruleNumberFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2696:1: ( ruleNumberFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2697:1: ruleNumberFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValueNumberFieldValueParserRuleCall_1_4_2_0()); 
            pushFollow(FOLLOW_ruleNumberFieldValue_in_rule__ClauseExpression__ValueAssignment_1_4_25673);
            ruleNumberFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValueNumberFieldValueParserRuleCall_1_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValueAssignment_1_4_2"


    // $ANTLR start "rule__ClauseExpression__FieldAssignment_1_5_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2706:1: rule__ClauseExpression__FieldAssignment_1_5_0 : ( ruleModifierField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2710:1: ( ( ruleModifierField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2711:1: ( ruleModifierField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2711:1: ( ruleModifierField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2712:1: ruleModifierField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldModifierFieldParserRuleCall_1_5_0_0()); 
            pushFollow(FOLLOW_ruleModifierField_in_rule__ClauseExpression__FieldAssignment_1_5_05704);
            ruleModifierField();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getFieldModifierFieldParserRuleCall_1_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__FieldAssignment_1_5_0"


    // $ANTLR start "rule__ClauseExpression__ValueAssignment_1_5_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2721:1: rule__ClauseExpression__ValueAssignment_1_5_2 : ( ruleModifierFieldValue ) ;
    public final void rule__ClauseExpression__ValueAssignment_1_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2725:1: ( ( ruleModifierFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2726:1: ( ruleModifierFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2726:1: ( ruleModifierFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2727:1: ruleModifierFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValueModifierFieldValueParserRuleCall_1_5_2_0()); 
            pushFollow(FOLLOW_ruleModifierFieldValue_in_rule__ClauseExpression__ValueAssignment_1_5_25735);
            ruleModifierFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValueModifierFieldValueParserRuleCall_1_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValueAssignment_1_5_2"


    // $ANTLR start "rule__ClauseExpression__FieldAssignment_1_6_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2736:1: rule__ClauseExpression__FieldAssignment_1_6_0 : ( ruleTimeField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2740:1: ( ( ruleTimeField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2741:1: ( ruleTimeField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2741:1: ( ruleTimeField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2742:1: ruleTimeField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldTimeFieldParserRuleCall_1_6_0_0()); 
            pushFollow(FOLLOW_ruleTimeField_in_rule__ClauseExpression__FieldAssignment_1_6_05766);
            ruleTimeField();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getFieldTimeFieldParserRuleCall_1_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__FieldAssignment_1_6_0"


    // $ANTLR start "rule__ClauseExpression__ValueAssignment_1_6_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2751:1: rule__ClauseExpression__ValueAssignment_1_6_2 : ( ruleTimeFieldValue ) ;
    public final void rule__ClauseExpression__ValueAssignment_1_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2755:1: ( ( ruleTimeFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2756:1: ( ruleTimeFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2756:1: ( ruleTimeFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2757:1: ruleTimeFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValueTimeFieldValueParserRuleCall_1_6_2_0()); 
            pushFollow(FOLLOW_ruleTimeFieldValue_in_rule__ClauseExpression__ValueAssignment_1_6_25797);
            ruleTimeFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValueTimeFieldValueParserRuleCall_1_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValueAssignment_1_6_2"


    // $ANTLR start "rule__ClauseExpression__FieldAssignment_1_7_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2766:1: rule__ClauseExpression__FieldAssignment_1_7_0 : ( ruleDocumentTypeField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2770:1: ( ( ruleDocumentTypeField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2771:1: ( ruleDocumentTypeField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2771:1: ( ruleDocumentTypeField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2772:1: ruleDocumentTypeField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldDocumentTypeFieldParserRuleCall_1_7_0_0()); 
            pushFollow(FOLLOW_ruleDocumentTypeField_in_rule__ClauseExpression__FieldAssignment_1_7_05828);
            ruleDocumentTypeField();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getFieldDocumentTypeFieldParserRuleCall_1_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__FieldAssignment_1_7_0"


    // $ANTLR start "rule__ClauseExpression__ValueAssignment_1_7_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2781:1: rule__ClauseExpression__ValueAssignment_1_7_2 : ( ruleDocumentTypeFieldValue ) ;
    public final void rule__ClauseExpression__ValueAssignment_1_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2785:1: ( ( ruleDocumentTypeFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2786:1: ( ruleDocumentTypeFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2786:1: ( ruleDocumentTypeFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2787:1: ruleDocumentTypeFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValueDocumentTypeFieldValueParserRuleCall_1_7_2_0()); 
            pushFollow(FOLLOW_ruleDocumentTypeFieldValue_in_rule__ClauseExpression__ValueAssignment_1_7_25859);
            ruleDocumentTypeFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValueDocumentTypeFieldValueParserRuleCall_1_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValueAssignment_1_7_2"


    // $ANTLR start "rule__ClauseExpression__FieldAssignment_1_8_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2796:1: rule__ClauseExpression__FieldAssignment_1_8_0 : ( ruleProjectNameField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2800:1: ( ( ruleProjectNameField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2801:1: ( ruleProjectNameField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2801:1: ( ruleProjectNameField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2802:1: ruleProjectNameField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldProjectNameFieldParserRuleCall_1_8_0_0()); 
            pushFollow(FOLLOW_ruleProjectNameField_in_rule__ClauseExpression__FieldAssignment_1_8_05890);
            ruleProjectNameField();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getFieldProjectNameFieldParserRuleCall_1_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__FieldAssignment_1_8_0"


    // $ANTLR start "rule__ClauseExpression__ValueAssignment_1_8_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2811:1: rule__ClauseExpression__ValueAssignment_1_8_2 : ( ruleProjectNameFieldValue ) ;
    public final void rule__ClauseExpression__ValueAssignment_1_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2815:1: ( ( ruleProjectNameFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2816:1: ( ruleProjectNameFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2816:1: ( ruleProjectNameFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2817:1: ruleProjectNameFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValueProjectNameFieldValueParserRuleCall_1_8_2_0()); 
            pushFollow(FOLLOW_ruleProjectNameFieldValue_in_rule__ClauseExpression__ValueAssignment_1_8_25921);
            ruleProjectNameFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValueProjectNameFieldValueParserRuleCall_1_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValueAssignment_1_8_2"


    // $ANTLR start "rule__ClauseExpression__FieldAssignment_1_9_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2826:1: rule__ClauseExpression__FieldAssignment_1_9_0 : ( ruleAnnotationField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2830:1: ( ( ruleAnnotationField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2831:1: ( ruleAnnotationField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2831:1: ( ruleAnnotationField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2832:1: ruleAnnotationField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAnnotationFieldParserRuleCall_1_9_0_0()); 
            pushFollow(FOLLOW_ruleAnnotationField_in_rule__ClauseExpression__FieldAssignment_1_9_05952);
            ruleAnnotationField();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getFieldAnnotationFieldParserRuleCall_1_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__FieldAssignment_1_9_0"


    // $ANTLR start "rule__ClauseExpression__ValueAssignment_1_9_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2841:1: rule__ClauseExpression__ValueAssignment_1_9_2 : ( ruleAnnotationFieldValue ) ;
    public final void rule__ClauseExpression__ValueAssignment_1_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2845:1: ( ( ruleAnnotationFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2846:1: ( ruleAnnotationFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2846:1: ( ruleAnnotationFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2847:1: ruleAnnotationFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValueAnnotationFieldValueParserRuleCall_1_9_2_0()); 
            pushFollow(FOLLOW_ruleAnnotationFieldValue_in_rule__ClauseExpression__ValueAssignment_1_9_25983);
            ruleAnnotationFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValueAnnotationFieldValueParserRuleCall_1_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValueAssignment_1_9_2"


    // $ANTLR start "rule__TypeField__ImplementedTypesAssignment_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2856:1: rule__TypeField__ImplementedTypesAssignment_0 : ( ( 'ImplementedTypes' ) ) ;
    public final void rule__TypeField__ImplementedTypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2860:1: ( ( ( 'ImplementedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2861:1: ( ( 'ImplementedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2861:1: ( ( 'ImplementedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2862:1: ( 'ImplementedTypes' )
            {
             before(grammarAccess.getTypeFieldAccess().getImplementedTypesImplementedTypesKeyword_0_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2863:1: ( 'ImplementedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2864:1: 'ImplementedTypes'
            {
             before(grammarAccess.getTypeFieldAccess().getImplementedTypesImplementedTypesKeyword_0_0()); 
            match(input,32,FOLLOW_32_in_rule__TypeField__ImplementedTypesAssignment_06019); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2879:1: rule__TypeField__ExtendedTypesAssignment_1 : ( ( 'ExtendedTypes' ) ) ;
    public final void rule__TypeField__ExtendedTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2883:1: ( ( ( 'ExtendedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2884:1: ( ( 'ExtendedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2884:1: ( ( 'ExtendedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2885:1: ( 'ExtendedTypes' )
            {
             before(grammarAccess.getTypeFieldAccess().getExtendedTypesExtendedTypesKeyword_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2886:1: ( 'ExtendedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2887:1: 'ExtendedTypes'
            {
             before(grammarAccess.getTypeFieldAccess().getExtendedTypesExtendedTypesKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__TypeField__ExtendedTypesAssignment_16063); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2902:1: rule__TypeField__UsedTypesAssignment_2 : ( ( 'UsedTypes' ) ) ;
    public final void rule__TypeField__UsedTypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2906:1: ( ( ( 'UsedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2907:1: ( ( 'UsedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2907:1: ( ( 'UsedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2908:1: ( 'UsedTypes' )
            {
             before(grammarAccess.getTypeFieldAccess().getUsedTypesUsedTypesKeyword_2_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2909:1: ( 'UsedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2910:1: 'UsedTypes'
            {
             before(grammarAccess.getTypeFieldAccess().getUsedTypesUsedTypesKeyword_2_0()); 
            match(input,34,FOLLOW_34_in_rule__TypeField__UsedTypesAssignment_26107); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2925:1: rule__TypeField__UsedTypesInTryAssignment_3 : ( ( 'UsedTypesInTry' ) ) ;
    public final void rule__TypeField__UsedTypesInTryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2929:1: ( ( ( 'UsedTypesInTry' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2930:1: ( ( 'UsedTypesInTry' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2930:1: ( ( 'UsedTypesInTry' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2931:1: ( 'UsedTypesInTry' )
            {
             before(grammarAccess.getTypeFieldAccess().getUsedTypesInTryUsedTypesInTryKeyword_3_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2932:1: ( 'UsedTypesInTry' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2933:1: 'UsedTypesInTry'
            {
             before(grammarAccess.getTypeFieldAccess().getUsedTypesInTryUsedTypesInTryKeyword_3_0()); 
            match(input,35,FOLLOW_35_in_rule__TypeField__UsedTypesInTryAssignment_36151); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2948:1: rule__TypeField__UsedTypesInFinallyAssignment_4 : ( ( 'UsedTypesInFinally' ) ) ;
    public final void rule__TypeField__UsedTypesInFinallyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2952:1: ( ( ( 'UsedTypesInFinally' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2953:1: ( ( 'UsedTypesInFinally' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2953:1: ( ( 'UsedTypesInFinally' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2954:1: ( 'UsedTypesInFinally' )
            {
             before(grammarAccess.getTypeFieldAccess().getUsedTypesInFinallyUsedTypesInFinallyKeyword_4_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2955:1: ( 'UsedTypesInFinally' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2956:1: 'UsedTypesInFinally'
            {
             before(grammarAccess.getTypeFieldAccess().getUsedTypesInFinallyUsedTypesInFinallyKeyword_4_0()); 
            match(input,36,FOLLOW_36_in_rule__TypeField__UsedTypesInFinallyAssignment_46195); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2971:1: rule__TypeField__ParameterTypesAssignment_5 : ( ( 'ParameterTypes' ) ) ;
    public final void rule__TypeField__ParameterTypesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2975:1: ( ( ( 'ParameterTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2976:1: ( ( 'ParameterTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2976:1: ( ( 'ParameterTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2977:1: ( 'ParameterTypes' )
            {
             before(grammarAccess.getTypeFieldAccess().getParameterTypesParameterTypesKeyword_5_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2978:1: ( 'ParameterTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2979:1: 'ParameterTypes'
            {
             before(grammarAccess.getTypeFieldAccess().getParameterTypesParameterTypesKeyword_5_0()); 
            match(input,37,FOLLOW_37_in_rule__TypeField__ParameterTypesAssignment_56239); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2994:1: rule__TypeField__ReturnTypeAssignment_6 : ( ( 'ReturnType' ) ) ;
    public final void rule__TypeField__ReturnTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2998:1: ( ( ( 'ReturnType' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2999:1: ( ( 'ReturnType' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2999:1: ( ( 'ReturnType' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3000:1: ( 'ReturnType' )
            {
             before(grammarAccess.getTypeFieldAccess().getReturnTypeReturnTypeKeyword_6_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3001:1: ( 'ReturnType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3002:1: 'ReturnType'
            {
             before(grammarAccess.getTypeFieldAccess().getReturnTypeReturnTypeKeyword_6_0()); 
            match(input,38,FOLLOW_38_in_rule__TypeField__ReturnTypeAssignment_66283); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3017:1: rule__TypeField__InstanceofTypesAssignment_7 : ( ( 'InstanceofTypes' ) ) ;
    public final void rule__TypeField__InstanceofTypesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3021:1: ( ( ( 'InstanceofTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3022:1: ( ( 'InstanceofTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3022:1: ( ( 'InstanceofTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3023:1: ( 'InstanceofTypes' )
            {
             before(grammarAccess.getTypeFieldAccess().getInstanceofTypesInstanceofTypesKeyword_7_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3024:1: ( 'InstanceofTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3025:1: 'InstanceofTypes'
            {
             before(grammarAccess.getTypeFieldAccess().getInstanceofTypesInstanceofTypesKeyword_7_0()); 
            match(input,39,FOLLOW_39_in_rule__TypeField__InstanceofTypesAssignment_76327); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3040:1: rule__TypeField__AllImplementedTypesAssignment_8 : ( ( 'AllImplementedTypes' ) ) ;
    public final void rule__TypeField__AllImplementedTypesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3044:1: ( ( ( 'AllImplementedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3045:1: ( ( 'AllImplementedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3045:1: ( ( 'AllImplementedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3046:1: ( 'AllImplementedTypes' )
            {
             before(grammarAccess.getTypeFieldAccess().getAllImplementedTypesAllImplementedTypesKeyword_8_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3047:1: ( 'AllImplementedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3048:1: 'AllImplementedTypes'
            {
             before(grammarAccess.getTypeFieldAccess().getAllImplementedTypesAllImplementedTypesKeyword_8_0()); 
            match(input,40,FOLLOW_40_in_rule__TypeField__AllImplementedTypesAssignment_86371); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3063:1: rule__TypeField__AllExtendedTypesAssignment_9 : ( ( 'AllExtendedTypes' ) ) ;
    public final void rule__TypeField__AllExtendedTypesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3067:1: ( ( ( 'AllExtendedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3068:1: ( ( 'AllExtendedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3068:1: ( ( 'AllExtendedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3069:1: ( 'AllExtendedTypes' )
            {
             before(grammarAccess.getTypeFieldAccess().getAllExtendedTypesAllExtendedTypesKeyword_9_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3070:1: ( 'AllExtendedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3071:1: 'AllExtendedTypes'
            {
             before(grammarAccess.getTypeFieldAccess().getAllExtendedTypesAllExtendedTypesKeyword_9_0()); 
            match(input,41,FOLLOW_41_in_rule__TypeField__AllExtendedTypesAssignment_96415); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3086:1: rule__TypeField__FieldTypeAssignment_10 : ( ( 'FieldType' ) ) ;
    public final void rule__TypeField__FieldTypeAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3090:1: ( ( ( 'FieldType' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3091:1: ( ( 'FieldType' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3091:1: ( ( 'FieldType' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3092:1: ( 'FieldType' )
            {
             before(grammarAccess.getTypeFieldAccess().getFieldTypeFieldTypeKeyword_10_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3093:1: ( 'FieldType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3094:1: 'FieldType'
            {
             before(grammarAccess.getTypeFieldAccess().getFieldTypeFieldTypeKeyword_10_0()); 
            match(input,42,FOLLOW_42_in_rule__TypeField__FieldTypeAssignment_106459); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3109:1: rule__TypeField__CaughtTypeAssignment_11 : ( ( 'CaughtType' ) ) ;
    public final void rule__TypeField__CaughtTypeAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3113:1: ( ( ( 'CaughtType' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3114:1: ( ( 'CaughtType' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3114:1: ( ( 'CaughtType' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3115:1: ( 'CaughtType' )
            {
             before(grammarAccess.getTypeFieldAccess().getCaughtTypeCaughtTypeKeyword_11_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3116:1: ( 'CaughtType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3117:1: 'CaughtType'
            {
             before(grammarAccess.getTypeFieldAccess().getCaughtTypeCaughtTypeKeyword_11_0()); 
            match(input,43,FOLLOW_43_in_rule__TypeField__CaughtTypeAssignment_116503); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3132:1: rule__TypeField__DeclaredFieldTypesAssignment_12 : ( ( 'DeclaredFieldTypes' ) ) ;
    public final void rule__TypeField__DeclaredFieldTypesAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3136:1: ( ( ( 'DeclaredFieldTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3137:1: ( ( 'DeclaredFieldTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3137:1: ( ( 'DeclaredFieldTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3138:1: ( 'DeclaredFieldTypes' )
            {
             before(grammarAccess.getTypeFieldAccess().getDeclaredFieldTypesDeclaredFieldTypesKeyword_12_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3139:1: ( 'DeclaredFieldTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3140:1: 'DeclaredFieldTypes'
            {
             before(grammarAccess.getTypeFieldAccess().getDeclaredFieldTypesDeclaredFieldTypesKeyword_12_0()); 
            match(input,44,FOLLOW_44_in_rule__TypeField__DeclaredFieldTypesAssignment_126547); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3155:1: rule__TypeField__DeclaringTypeAssignment_13 : ( ( 'DeclaringType' ) ) ;
    public final void rule__TypeField__DeclaringTypeAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3159:1: ( ( ( 'DeclaringType' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3160:1: ( ( 'DeclaringType' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3160:1: ( ( 'DeclaringType' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3161:1: ( 'DeclaringType' )
            {
             before(grammarAccess.getTypeFieldAccess().getDeclaringTypeDeclaringTypeKeyword_13_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3162:1: ( 'DeclaringType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3163:1: 'DeclaringType'
            {
             before(grammarAccess.getTypeFieldAccess().getDeclaringTypeDeclaringTypeKeyword_13_0()); 
            match(input,45,FOLLOW_45_in_rule__TypeField__DeclaringTypeAssignment_136591); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3178:1: rule__MethodField__UsedMethodsAssignment_0 : ( ( 'UsedMethods' ) ) ;
    public final void rule__MethodField__UsedMethodsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3182:1: ( ( ( 'UsedMethods' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3183:1: ( ( 'UsedMethods' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3183:1: ( ( 'UsedMethods' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3184:1: ( 'UsedMethods' )
            {
             before(grammarAccess.getMethodFieldAccess().getUsedMethodsUsedMethodsKeyword_0_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3185:1: ( 'UsedMethods' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3186:1: 'UsedMethods'
            {
             before(grammarAccess.getMethodFieldAccess().getUsedMethodsUsedMethodsKeyword_0_0()); 
            match(input,46,FOLLOW_46_in_rule__MethodField__UsedMethodsAssignment_06635); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3201:1: rule__MethodField__UsedMethodsInTryAssignment_1 : ( ( 'UsedMethodsInTry' ) ) ;
    public final void rule__MethodField__UsedMethodsInTryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3205:1: ( ( ( 'UsedMethodsInTry' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3206:1: ( ( 'UsedMethodsInTry' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3206:1: ( ( 'UsedMethodsInTry' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3207:1: ( 'UsedMethodsInTry' )
            {
             before(grammarAccess.getMethodFieldAccess().getUsedMethodsInTryUsedMethodsInTryKeyword_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3208:1: ( 'UsedMethodsInTry' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3209:1: 'UsedMethodsInTry'
            {
             before(grammarAccess.getMethodFieldAccess().getUsedMethodsInTryUsedMethodsInTryKeyword_1_0()); 
            match(input,47,FOLLOW_47_in_rule__MethodField__UsedMethodsInTryAssignment_16679); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3224:1: rule__MethodField__UsedMethodsInFinallyAssignment_2 : ( ( 'UsedMethodsInFinally' ) ) ;
    public final void rule__MethodField__UsedMethodsInFinallyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3228:1: ( ( ( 'UsedMethodsInFinally' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3229:1: ( ( 'UsedMethodsInFinally' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3229:1: ( ( 'UsedMethodsInFinally' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3230:1: ( 'UsedMethodsInFinally' )
            {
             before(grammarAccess.getMethodFieldAccess().getUsedMethodsInFinallyUsedMethodsInFinallyKeyword_2_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3231:1: ( 'UsedMethodsInFinally' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3232:1: 'UsedMethodsInFinally'
            {
             before(grammarAccess.getMethodFieldAccess().getUsedMethodsInFinallyUsedMethodsInFinallyKeyword_2_0()); 
            match(input,48,FOLLOW_48_in_rule__MethodField__UsedMethodsInFinallyAssignment_26723); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3247:1: rule__MethodField__OverriddenMethodsAssignment_3 : ( ( 'OverriddenMethods' ) ) ;
    public final void rule__MethodField__OverriddenMethodsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3251:1: ( ( ( 'OverriddenMethods' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3252:1: ( ( 'OverriddenMethods' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3252:1: ( ( 'OverriddenMethods' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3253:1: ( 'OverriddenMethods' )
            {
             before(grammarAccess.getMethodFieldAccess().getOverriddenMethodsOverriddenMethodsKeyword_3_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3254:1: ( 'OverriddenMethods' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3255:1: 'OverriddenMethods'
            {
             before(grammarAccess.getMethodFieldAccess().getOverriddenMethodsOverriddenMethodsKeyword_3_0()); 
            match(input,49,FOLLOW_49_in_rule__MethodField__OverriddenMethodsAssignment_36767); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3270:1: rule__FilePathField__ResourcePathAssignment : ( ( 'ResourcePath' ) ) ;
    public final void rule__FilePathField__ResourcePathAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3274:1: ( ( ( 'ResourcePath' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3275:1: ( ( 'ResourcePath' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3275:1: ( ( 'ResourcePath' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3276:1: ( 'ResourcePath' )
            {
             before(grammarAccess.getFilePathFieldAccess().getResourcePathResourcePathKeyword_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3277:1: ( 'ResourcePath' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3278:1: 'ResourcePath'
            {
             before(grammarAccess.getFilePathFieldAccess().getResourcePathResourcePathKeyword_0()); 
            match(input,50,FOLLOW_50_in_rule__FilePathField__ResourcePathAssignment6811); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3293:1: rule__NumberField__ParameterCountAssignment : ( ( 'ParameterCount' ) ) ;
    public final void rule__NumberField__ParameterCountAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3297:1: ( ( ( 'ParameterCount' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3298:1: ( ( 'ParameterCount' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3298:1: ( ( 'ParameterCount' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3299:1: ( 'ParameterCount' )
            {
             before(grammarAccess.getNumberFieldAccess().getParameterCountParameterCountKeyword_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3300:1: ( 'ParameterCount' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3301:1: 'ParameterCount'
            {
             before(grammarAccess.getNumberFieldAccess().getParameterCountParameterCountKeyword_0()); 
            match(input,51,FOLLOW_51_in_rule__NumberField__ParameterCountAssignment6855); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3316:1: rule__ModifierField__ModifiersAssignment : ( ( 'Modifiers' ) ) ;
    public final void rule__ModifierField__ModifiersAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3320:1: ( ( ( 'Modifiers' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3321:1: ( ( 'Modifiers' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3321:1: ( ( 'Modifiers' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3322:1: ( 'Modifiers' )
            {
             before(grammarAccess.getModifierFieldAccess().getModifiersModifiersKeyword_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3323:1: ( 'Modifiers' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3324:1: 'Modifiers'
            {
             before(grammarAccess.getModifierFieldAccess().getModifiersModifiersKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__ModifierField__ModifiersAssignment6899); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3339:1: rule__TimeField__TimestampAssignment : ( ( 'Timestamp' ) ) ;
    public final void rule__TimeField__TimestampAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3343:1: ( ( ( 'Timestamp' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3344:1: ( ( 'Timestamp' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3344:1: ( ( 'Timestamp' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3345:1: ( 'Timestamp' )
            {
             before(grammarAccess.getTimeFieldAccess().getTimestampTimestampKeyword_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3346:1: ( 'Timestamp' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3347:1: 'Timestamp'
            {
             before(grammarAccess.getTimeFieldAccess().getTimestampTimestampKeyword_0()); 
            match(input,53,FOLLOW_53_in_rule__TimeField__TimestampAssignment6943); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3362:1: rule__DocumentTypeField__TypeAssignment : ( ( 'Type' ) ) ;
    public final void rule__DocumentTypeField__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3366:1: ( ( ( 'Type' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3367:1: ( ( 'Type' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3367:1: ( ( 'Type' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3368:1: ( 'Type' )
            {
             before(grammarAccess.getDocumentTypeFieldAccess().getTypeTypeKeyword_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3369:1: ( 'Type' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3370:1: 'Type'
            {
             before(grammarAccess.getDocumentTypeFieldAccess().getTypeTypeKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__DocumentTypeField__TypeAssignment6987); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3385:1: rule__ProjectNameField__ProjectNameAssignment : ( ( 'ProjectName' ) ) ;
    public final void rule__ProjectNameField__ProjectNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3389:1: ( ( ( 'ProjectName' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3390:1: ( ( 'ProjectName' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3390:1: ( ( 'ProjectName' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3391:1: ( 'ProjectName' )
            {
             before(grammarAccess.getProjectNameFieldAccess().getProjectNameProjectNameKeyword_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3392:1: ( 'ProjectName' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3393:1: 'ProjectName'
            {
             before(grammarAccess.getProjectNameFieldAccess().getProjectNameProjectNameKeyword_0()); 
            match(input,55,FOLLOW_55_in_rule__ProjectNameField__ProjectNameAssignment7031); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3408:1: rule__AnnotationField__AnnotationsAssignment : ( ( 'Annotations' ) ) ;
    public final void rule__AnnotationField__AnnotationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3412:1: ( ( ( 'Annotations' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3413:1: ( ( 'Annotations' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3413:1: ( ( 'Annotations' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3414:1: ( 'Annotations' )
            {
             before(grammarAccess.getAnnotationFieldAccess().getAnnotationsAnnotationsKeyword_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3415:1: ( 'Annotations' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3416:1: 'Annotations'
            {
             before(grammarAccess.getAnnotationFieldAccess().getAnnotationsAnnotationsKeyword_0()); 
            match(input,56,FOLLOW_56_in_rule__AnnotationField__AnnotationsAssignment7075); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3431:1: rule__SimpleField__FullyQualifiedNameAssignment_0 : ( ( 'FullyQualifiedName' ) ) ;
    public final void rule__SimpleField__FullyQualifiedNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3435:1: ( ( ( 'FullyQualifiedName' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3436:1: ( ( 'FullyQualifiedName' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3436:1: ( ( 'FullyQualifiedName' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3437:1: ( 'FullyQualifiedName' )
            {
             before(grammarAccess.getSimpleFieldAccess().getFullyQualifiedNameFullyQualifiedNameKeyword_0_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3438:1: ( 'FullyQualifiedName' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3439:1: 'FullyQualifiedName'
            {
             before(grammarAccess.getSimpleFieldAccess().getFullyQualifiedNameFullyQualifiedNameKeyword_0_0()); 
            match(input,57,FOLLOW_57_in_rule__SimpleField__FullyQualifiedNameAssignment_07119); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3454:1: rule__SimpleField__FriendlyNameAssignment_1 : ( ( 'FriendlyName' ) ) ;
    public final void rule__SimpleField__FriendlyNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3458:1: ( ( ( 'FriendlyName' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3459:1: ( ( 'FriendlyName' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3459:1: ( ( 'FriendlyName' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3460:1: ( 'FriendlyName' )
            {
             before(grammarAccess.getSimpleFieldAccess().getFriendlyNameFriendlyNameKeyword_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3461:1: ( 'FriendlyName' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3462:1: 'FriendlyName'
            {
             before(grammarAccess.getSimpleFieldAccess().getFriendlyNameFriendlyNameKeyword_1_0()); 
            match(input,58,FOLLOW_58_in_rule__SimpleField__FriendlyNameAssignment_17163); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3477:1: rule__SimpleField__DeclaredMethodsAssignment_2 : ( ( 'DeclaredMethods' ) ) ;
    public final void rule__SimpleField__DeclaredMethodsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3481:1: ( ( ( 'DeclaredMethods' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3482:1: ( ( 'DeclaredMethods' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3482:1: ( ( 'DeclaredMethods' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3483:1: ( 'DeclaredMethods' )
            {
             before(grammarAccess.getSimpleFieldAccess().getDeclaredMethodsDeclaredMethodsKeyword_2_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3484:1: ( 'DeclaredMethods' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3485:1: 'DeclaredMethods'
            {
             before(grammarAccess.getSimpleFieldAccess().getDeclaredMethodsDeclaredMethodsKeyword_2_0()); 
            match(input,59,FOLLOW_59_in_rule__SimpleField__DeclaredMethodsAssignment_27207); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3500:1: rule__SimpleField__ReturnVariableEexpressionsAssignment_3 : ( ( 'ReturnVariableEexpressions' ) ) ;
    public final void rule__SimpleField__ReturnVariableEexpressionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3504:1: ( ( ( 'ReturnVariableEexpressions' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3505:1: ( ( 'ReturnVariableEexpressions' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3505:1: ( ( 'ReturnVariableEexpressions' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3506:1: ( 'ReturnVariableEexpressions' )
            {
             before(grammarAccess.getSimpleFieldAccess().getReturnVariableEexpressionsReturnVariableEexpressionsKeyword_3_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3507:1: ( 'ReturnVariableEexpressions' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3508:1: 'ReturnVariableEexpressions'
            {
             before(grammarAccess.getSimpleFieldAccess().getReturnVariableEexpressionsReturnVariableEexpressionsKeyword_3_0()); 
            match(input,60,FOLLOW_60_in_rule__SimpleField__ReturnVariableEexpressionsAssignment_37251); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3523:1: rule__SimpleField__AllDeclaredMethodNamesAssignment_4 : ( ( 'AllDeclaredMethodNames' ) ) ;
    public final void rule__SimpleField__AllDeclaredMethodNamesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3527:1: ( ( ( 'AllDeclaredMethodNames' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3528:1: ( ( 'AllDeclaredMethodNames' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3528:1: ( ( 'AllDeclaredMethodNames' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3529:1: ( 'AllDeclaredMethodNames' )
            {
             before(grammarAccess.getSimpleFieldAccess().getAllDeclaredMethodNamesAllDeclaredMethodNamesKeyword_4_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3530:1: ( 'AllDeclaredMethodNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3531:1: 'AllDeclaredMethodNames'
            {
             before(grammarAccess.getSimpleFieldAccess().getAllDeclaredMethodNamesAllDeclaredMethodNamesKeyword_4_0()); 
            match(input,61,FOLLOW_61_in_rule__SimpleField__AllDeclaredMethodNamesAssignment_47295); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3546:1: rule__SimpleField__DeclaredMethodNamesAssignment_5 : ( ( 'DeclaredMethodNames' ) ) ;
    public final void rule__SimpleField__DeclaredMethodNamesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3550:1: ( ( ( 'DeclaredMethodNames' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3551:1: ( ( 'DeclaredMethodNames' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3551:1: ( ( 'DeclaredMethodNames' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3552:1: ( 'DeclaredMethodNames' )
            {
             before(grammarAccess.getSimpleFieldAccess().getDeclaredMethodNamesDeclaredMethodNamesKeyword_5_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3553:1: ( 'DeclaredMethodNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3554:1: 'DeclaredMethodNames'
            {
             before(grammarAccess.getSimpleFieldAccess().getDeclaredMethodNamesDeclaredMethodNamesKeyword_5_0()); 
            match(input,62,FOLLOW_62_in_rule__SimpleField__DeclaredMethodNamesAssignment_57339); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3569:1: rule__SimpleField__DeclaredFieldNamesAssignment_6 : ( ( 'DeclaredFieldNames' ) ) ;
    public final void rule__SimpleField__DeclaredFieldNamesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3573:1: ( ( ( 'DeclaredFieldNames' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3574:1: ( ( 'DeclaredFieldNames' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3574:1: ( ( 'DeclaredFieldNames' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3575:1: ( 'DeclaredFieldNames' )
            {
             before(grammarAccess.getSimpleFieldAccess().getDeclaredFieldNamesDeclaredFieldNamesKeyword_6_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3576:1: ( 'DeclaredFieldNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3577:1: 'DeclaredFieldNames'
            {
             before(grammarAccess.getSimpleFieldAccess().getDeclaredFieldNamesDeclaredFieldNamesKeyword_6_0()); 
            match(input,63,FOLLOW_63_in_rule__SimpleField__DeclaredFieldNamesAssignment_67383); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3592:1: rule__SimpleField__AllDeclaredFieldNamesAssignment_7 : ( ( 'AllDeclaredFieldNames' ) ) ;
    public final void rule__SimpleField__AllDeclaredFieldNamesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3596:1: ( ( ( 'AllDeclaredFieldNames' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3597:1: ( ( 'AllDeclaredFieldNames' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3597:1: ( ( 'AllDeclaredFieldNames' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3598:1: ( 'AllDeclaredFieldNames' )
            {
             before(grammarAccess.getSimpleFieldAccess().getAllDeclaredFieldNamesAllDeclaredFieldNamesKeyword_7_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3599:1: ( 'AllDeclaredFieldNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3600:1: 'AllDeclaredFieldNames'
            {
             before(grammarAccess.getSimpleFieldAccess().getAllDeclaredFieldNamesAllDeclaredFieldNamesKeyword_7_0()); 
            match(input,64,FOLLOW_64_in_rule__SimpleField__AllDeclaredFieldNamesAssignment_77427); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3615:1: rule__SimpleField__FullTextAssignment_8 : ( ( 'FullText' ) ) ;
    public final void rule__SimpleField__FullTextAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3619:1: ( ( ( 'FullText' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3620:1: ( ( 'FullText' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3620:1: ( ( 'FullText' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3621:1: ( 'FullText' )
            {
             before(grammarAccess.getSimpleFieldAccess().getFullTextFullTextKeyword_8_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3622:1: ( 'FullText' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3623:1: 'FullText'
            {
             before(grammarAccess.getSimpleFieldAccess().getFullTextFullTextKeyword_8_0()); 
            match(input,65,FOLLOW_65_in_rule__SimpleField__FullTextAssignment_87471); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3638:1: rule__SimpleField__FieldsReadAssignment_9 : ( ( 'FieldsRead' ) ) ;
    public final void rule__SimpleField__FieldsReadAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3642:1: ( ( ( 'FieldsRead' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3643:1: ( ( 'FieldsRead' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3643:1: ( ( 'FieldsRead' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3644:1: ( 'FieldsRead' )
            {
             before(grammarAccess.getSimpleFieldAccess().getFieldsReadFieldsReadKeyword_9_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3645:1: ( 'FieldsRead' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3646:1: 'FieldsRead'
            {
             before(grammarAccess.getSimpleFieldAccess().getFieldsReadFieldsReadKeyword_9_0()); 
            match(input,66,FOLLOW_66_in_rule__SimpleField__FieldsReadAssignment_97515); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3661:1: rule__SimpleField__FieldsWrittenAssignment_10 : ( ( 'FieldsWritten' ) ) ;
    public final void rule__SimpleField__FieldsWrittenAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3665:1: ( ( ( 'FieldsWritten' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3666:1: ( ( 'FieldsWritten' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3666:1: ( ( 'FieldsWritten' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3667:1: ( 'FieldsWritten' )
            {
             before(grammarAccess.getSimpleFieldAccess().getFieldsWrittenFieldsWrittenKeyword_10_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3668:1: ( 'FieldsWritten' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3669:1: 'FieldsWritten'
            {
             before(grammarAccess.getSimpleFieldAccess().getFieldsWrittenFieldsWrittenKeyword_10_0()); 
            match(input,67,FOLLOW_67_in_rule__SimpleField__FieldsWrittenAssignment_107559); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3684:1: rule__SimpleField__UsedFieldsInFinallyAssignment_11 : ( ( 'UsedFieldsInFinally' ) ) ;
    public final void rule__SimpleField__UsedFieldsInFinallyAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3688:1: ( ( ( 'UsedFieldsInFinally' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3689:1: ( ( 'UsedFieldsInFinally' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3689:1: ( ( 'UsedFieldsInFinally' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3690:1: ( 'UsedFieldsInFinally' )
            {
             before(grammarAccess.getSimpleFieldAccess().getUsedFieldsInFinallyUsedFieldsInFinallyKeyword_11_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3691:1: ( 'UsedFieldsInFinally' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3692:1: 'UsedFieldsInFinally'
            {
             before(grammarAccess.getSimpleFieldAccess().getUsedFieldsInFinallyUsedFieldsInFinallyKeyword_11_0()); 
            match(input,68,FOLLOW_68_in_rule__SimpleField__UsedFieldsInFinallyAssignment_117603); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3707:1: rule__SimpleField__UsedFieldsInTryAssignment_12 : ( ( 'UsedFieldsInTry' ) ) ;
    public final void rule__SimpleField__UsedFieldsInTryAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3711:1: ( ( ( 'UsedFieldsInTry' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3712:1: ( ( 'UsedFieldsInTry' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3712:1: ( ( 'UsedFieldsInTry' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3713:1: ( 'UsedFieldsInTry' )
            {
             before(grammarAccess.getSimpleFieldAccess().getUsedFieldsInTryUsedFieldsInTryKeyword_12_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3714:1: ( 'UsedFieldsInTry' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3715:1: 'UsedFieldsInTry'
            {
             before(grammarAccess.getSimpleFieldAccess().getUsedFieldsInTryUsedFieldsInTryKeyword_12_0()); 
            match(input,69,FOLLOW_69_in_rule__SimpleField__UsedFieldsInTryAssignment_127647); 
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
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_0__0_in_rule__ClauseExpression__Alternatives_11589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1__0_in_rule__ClauseExpression__Alternatives_11607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_2__0_in_rule__ClauseExpression__Alternatives_11625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_3__0_in_rule__ClauseExpression__Alternatives_11643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_4__0_in_rule__ClauseExpression__Alternatives_11661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_5__0_in_rule__ClauseExpression__Alternatives_11679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_6__0_in_rule__ClauseExpression__Alternatives_11697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_7__0_in_rule__ClauseExpression__Alternatives_11715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_8__0_in_rule__ClauseExpression__Alternatives_11733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_9__0_in_rule__ClauseExpression__Alternatives_11751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__ImplementedTypesAssignment_0_in_rule__TypeField__Alternatives1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__ExtendedTypesAssignment_1_in_rule__TypeField__Alternatives1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__UsedTypesAssignment_2_in_rule__TypeField__Alternatives1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__UsedTypesInTryAssignment_3_in_rule__TypeField__Alternatives1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__UsedTypesInFinallyAssignment_4_in_rule__TypeField__Alternatives1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__ParameterTypesAssignment_5_in_rule__TypeField__Alternatives1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__ReturnTypeAssignment_6_in_rule__TypeField__Alternatives1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__InstanceofTypesAssignment_7_in_rule__TypeField__Alternatives1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__AllImplementedTypesAssignment_8_in_rule__TypeField__Alternatives1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__AllExtendedTypesAssignment_9_in_rule__TypeField__Alternatives1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__FieldTypeAssignment_10_in_rule__TypeField__Alternatives1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__CaughtTypeAssignment_11_in_rule__TypeField__Alternatives1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__DeclaredFieldTypesAssignment_12_in_rule__TypeField__Alternatives2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__DeclaringTypeAssignment_13_in_rule__TypeField__Alternatives2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodField__UsedMethodsAssignment_0_in_rule__MethodField__Alternatives2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodField__UsedMethodsInTryAssignment_1_in_rule__MethodField__Alternatives2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodField__UsedMethodsInFinallyAssignment_2_in_rule__MethodField__Alternatives2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodField__OverriddenMethodsAssignment_3_in_rule__MethodField__Alternatives2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__FullyQualifiedNameAssignment_0_in_rule__SimpleField__Alternatives2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__FriendlyNameAssignment_1_in_rule__SimpleField__Alternatives2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__DeclaredMethodsAssignment_2_in_rule__SimpleField__Alternatives2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__ReturnVariableEexpressionsAssignment_3_in_rule__SimpleField__Alternatives2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__AllDeclaredMethodNamesAssignment_4_in_rule__SimpleField__Alternatives2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__DeclaredMethodNamesAssignment_5_in_rule__SimpleField__Alternatives2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__DeclaredFieldNamesAssignment_6_in_rule__SimpleField__Alternatives2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__AllDeclaredFieldNamesAssignment_7_in_rule__SimpleField__Alternatives2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__FullTextAssignment_8_in_rule__SimpleField__Alternatives2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__FieldsReadAssignment_9_in_rule__SimpleField__Alternatives2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__FieldsWrittenAssignment_10_in_rule__SimpleField__Alternatives2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__UsedFieldsInFinallyAssignment_11_in_rule__SimpleField__Alternatives2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__UsedFieldsInTryAssignment_12_in_rule__SimpleField__Alternatives2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ModifierFieldValue__Alternatives2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ModifierFieldValue__Alternatives2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ModifierFieldValue__Alternatives2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ModifierFieldValue__Alternatives2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ModifierFieldValue__Alternatives2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ModifierFieldValue__Alternatives2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DocumentTypeFieldValue__Alternatives2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DocumentTypeFieldValue__Alternatives2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DocumentTypeFieldValue__Alternatives2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DocumentTypeFieldValue__Alternatives2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__UnaryExpression__Alternatives2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__UnaryExpression__Alternatives2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__UnaryExpression__Alternatives2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__UnaryExpression__Alternatives2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BinaryExp__Alternatives2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BinaryExp__Alternatives2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group__0__Impl_in_rule__Exp1__Group__02767 = new BitSet(new long[]{0xFFFFFFFF3F800000L,0x000000000000003FL});
    public static final BitSet FOLLOW_rule__Exp1__Group__1_in_rule__Exp1__Group__02770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp2_in_rule__Exp1__Group__0__Impl2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group__1__Impl_in_rule__Exp1__Group__12826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__0_in_rule__Exp1__Group__1__Impl2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__0__Impl_in_rule__Exp1__Group_1__02888 = new BitSet(new long[]{0xFFFFFFFF3F800000L,0x000000000000003FL});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__1_in_rule__Exp1__Group_1__02891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__1__Impl_in_rule__Exp1__Group_1__12949 = new BitSet(new long[]{0xFFFFFFFF3F800000L,0x000000000000003FL});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__2_in_rule__Exp1__Group_1__12952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__BAssignment_1_1_in_rule__Exp1__Group_1__1__Impl2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__2__Impl_in_rule__Exp1__Group_1__23010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__RightAssignment_1_2_in_rule__Exp1__Group_1__2__Impl3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__0__Impl_in_rule__Exp2__Group_1__03073 = new BitSet(new long[]{0xFFFFFFFF3F800000L,0x000000000000003FL});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__1_in_rule__Exp2__Group_1__03076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__Exp2__Group_1__0__Impl3104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__1__Impl_in_rule__Exp2__Group_1__13135 = new BitSet(new long[]{0xFFFFFFFF3F800000L,0x000000000000003FL});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__2_in_rule__Exp2__Group_1__13138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Exp2__Group_1__1__Impl3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__2__Impl_in_rule__Exp2__Group_1__23197 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__3_in_rule__Exp2__Group_1__23200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp1_in_rule__Exp2__Group_1__2__Impl3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__3__Impl_in_rule__Exp2__Group_1__33256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Exp2__Group_1__3__Impl3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group__0__Impl_in_rule__ClauseExpression__Group__03323 = new BitSet(new long[]{0xFFFFFFFF07800000L,0x000000000000003FL});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group__1_in_rule__ClauseExpression__Group__03326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__ClauseExpression__Group__0__Impl3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group__1__Impl_in_rule__ClauseExpression__Group__13385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Alternatives_1_in_rule__ClauseExpression__Group__1__Impl3412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_0__0__Impl_in_rule__ClauseExpression__Group_1_0__03446 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_0__1_in_rule__ClauseExpression__Group_1_0__03449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_0_0_in_rule__ClauseExpression__Group_1_0__0__Impl3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_0__1__Impl_in_rule__ClauseExpression__Group_1_0__13506 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_0__2_in_rule__ClauseExpression__Group_1_0__13509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_0__1__Impl3537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_0__2__Impl_in_rule__ClauseExpression__Group_1_0__23568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValueAssignment_1_0_2_in_rule__ClauseExpression__Group_1_0__2__Impl3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1__0__Impl_in_rule__ClauseExpression__Group_1_1__03631 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1__1_in_rule__ClauseExpression__Group_1_1__03634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_0_in_rule__ClauseExpression__Group_1_1__0__Impl3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1__1__Impl_in_rule__ClauseExpression__Group_1_1__13691 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1__2_in_rule__ClauseExpression__Group_1_1__13694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_1__1__Impl3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1__2__Impl_in_rule__ClauseExpression__Group_1_1__23753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValueAssignment_1_1_2_in_rule__ClauseExpression__Group_1_1__2__Impl3780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_2__0__Impl_in_rule__ClauseExpression__Group_1_2__03816 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_2__1_in_rule__ClauseExpression__Group_1_2__03819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_2_0_in_rule__ClauseExpression__Group_1_2__0__Impl3846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_2__1__Impl_in_rule__ClauseExpression__Group_1_2__13876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_2__2_in_rule__ClauseExpression__Group_1_2__13879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_2__1__Impl3907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_2__2__Impl_in_rule__ClauseExpression__Group_1_2__23938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValueAssignment_1_2_2_in_rule__ClauseExpression__Group_1_2__2__Impl3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_3__0__Impl_in_rule__ClauseExpression__Group_1_3__04001 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_3__1_in_rule__ClauseExpression__Group_1_3__04004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_3_0_in_rule__ClauseExpression__Group_1_3__0__Impl4031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_3__1__Impl_in_rule__ClauseExpression__Group_1_3__14061 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_3__2_in_rule__ClauseExpression__Group_1_3__14064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_3__1__Impl4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_3__2__Impl_in_rule__ClauseExpression__Group_1_3__24123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValueAssignment_1_3_2_in_rule__ClauseExpression__Group_1_3__2__Impl4150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_4__0__Impl_in_rule__ClauseExpression__Group_1_4__04186 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_4__1_in_rule__ClauseExpression__Group_1_4__04189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_4_0_in_rule__ClauseExpression__Group_1_4__0__Impl4216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_4__1__Impl_in_rule__ClauseExpression__Group_1_4__14246 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_4__2_in_rule__ClauseExpression__Group_1_4__14249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_4__1__Impl4277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_4__2__Impl_in_rule__ClauseExpression__Group_1_4__24308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValueAssignment_1_4_2_in_rule__ClauseExpression__Group_1_4__2__Impl4335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_5__0__Impl_in_rule__ClauseExpression__Group_1_5__04371 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_5__1_in_rule__ClauseExpression__Group_1_5__04374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_5_0_in_rule__ClauseExpression__Group_1_5__0__Impl4401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_5__1__Impl_in_rule__ClauseExpression__Group_1_5__14431 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_5__2_in_rule__ClauseExpression__Group_1_5__14434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_5__1__Impl4462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_5__2__Impl_in_rule__ClauseExpression__Group_1_5__24493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValueAssignment_1_5_2_in_rule__ClauseExpression__Group_1_5__2__Impl4520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_6__0__Impl_in_rule__ClauseExpression__Group_1_6__04556 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_6__1_in_rule__ClauseExpression__Group_1_6__04559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_6_0_in_rule__ClauseExpression__Group_1_6__0__Impl4586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_6__1__Impl_in_rule__ClauseExpression__Group_1_6__14616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_6__2_in_rule__ClauseExpression__Group_1_6__14619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_6__1__Impl4647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_6__2__Impl_in_rule__ClauseExpression__Group_1_6__24678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValueAssignment_1_6_2_in_rule__ClauseExpression__Group_1_6__2__Impl4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_7__0__Impl_in_rule__ClauseExpression__Group_1_7__04741 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_7__1_in_rule__ClauseExpression__Group_1_7__04744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_7_0_in_rule__ClauseExpression__Group_1_7__0__Impl4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_7__1__Impl_in_rule__ClauseExpression__Group_1_7__14801 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_7__2_in_rule__ClauseExpression__Group_1_7__14804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_7__1__Impl4832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_7__2__Impl_in_rule__ClauseExpression__Group_1_7__24863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValueAssignment_1_7_2_in_rule__ClauseExpression__Group_1_7__2__Impl4890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_8__0__Impl_in_rule__ClauseExpression__Group_1_8__04926 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_8__1_in_rule__ClauseExpression__Group_1_8__04929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_8_0_in_rule__ClauseExpression__Group_1_8__0__Impl4956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_8__1__Impl_in_rule__ClauseExpression__Group_1_8__14986 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_8__2_in_rule__ClauseExpression__Group_1_8__14989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_8__1__Impl5017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_8__2__Impl_in_rule__ClauseExpression__Group_1_8__25048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValueAssignment_1_8_2_in_rule__ClauseExpression__Group_1_8__2__Impl5075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_9__0__Impl_in_rule__ClauseExpression__Group_1_9__05111 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_9__1_in_rule__ClauseExpression__Group_1_9__05114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_9_0_in_rule__ClauseExpression__Group_1_9__0__Impl5141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_9__1__Impl_in_rule__ClauseExpression__Group_1_9__15171 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_9__2_in_rule__ClauseExpression__Group_1_9__15174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_9__1__Impl5202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_9__2__Impl_in_rule__ClauseExpression__Group_1_9__25233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValueAssignment_1_9_2_in_rule__ClauseExpression__Group_1_9__2__Impl5260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryExp_in_rule__Exp1__BAssignment_1_15301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp1_in_rule__Exp1__RightAssignment_1_25332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClauseExpression_in_rule__Exp2__ValueAssignment_05363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleField_in_rule__ClauseExpression__FieldAssignment_1_0_05394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFieldValue_in_rule__ClauseExpression__ValueAssignment_1_0_25425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeField_in_rule__ClauseExpression__FieldAssignment_1_1_05456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFieldValue_in_rule__ClauseExpression__ValueAssignment_1_1_25487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodField_in_rule__ClauseExpression__FieldAssignment_1_2_05518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodFieldValue_in_rule__ClauseExpression__ValueAssignment_1_2_25549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilePathField_in_rule__ClauseExpression__FieldAssignment_1_3_05580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilePathFieldValue_in_rule__ClauseExpression__ValueAssignment_1_3_25611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberField_in_rule__ClauseExpression__FieldAssignment_1_4_05642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberFieldValue_in_rule__ClauseExpression__ValueAssignment_1_4_25673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierField_in_rule__ClauseExpression__FieldAssignment_1_5_05704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierFieldValue_in_rule__ClauseExpression__ValueAssignment_1_5_25735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeField_in_rule__ClauseExpression__FieldAssignment_1_6_05766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeFieldValue_in_rule__ClauseExpression__ValueAssignment_1_6_25797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentTypeField_in_rule__ClauseExpression__FieldAssignment_1_7_05828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentTypeFieldValue_in_rule__ClauseExpression__ValueAssignment_1_7_25859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectNameField_in_rule__ClauseExpression__FieldAssignment_1_8_05890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectNameFieldValue_in_rule__ClauseExpression__ValueAssignment_1_8_25921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationField_in_rule__ClauseExpression__FieldAssignment_1_9_05952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationFieldValue_in_rule__ClauseExpression__ValueAssignment_1_9_25983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TypeField__ImplementedTypesAssignment_06019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__TypeField__ExtendedTypesAssignment_16063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__TypeField__UsedTypesAssignment_26107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__TypeField__UsedTypesInTryAssignment_36151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__TypeField__UsedTypesInFinallyAssignment_46195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__TypeField__ParameterTypesAssignment_56239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__TypeField__ReturnTypeAssignment_66283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TypeField__InstanceofTypesAssignment_76327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__TypeField__AllImplementedTypesAssignment_86371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__TypeField__AllExtendedTypesAssignment_96415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__TypeField__FieldTypeAssignment_106459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__TypeField__CaughtTypeAssignment_116503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__TypeField__DeclaredFieldTypesAssignment_126547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__TypeField__DeclaringTypeAssignment_136591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__MethodField__UsedMethodsAssignment_06635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__MethodField__UsedMethodsInTryAssignment_16679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__MethodField__UsedMethodsInFinallyAssignment_26723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__MethodField__OverriddenMethodsAssignment_36767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__FilePathField__ResourcePathAssignment6811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__NumberField__ParameterCountAssignment6855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ModifierField__ModifiersAssignment6899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__TimeField__TimestampAssignment6943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__DocumentTypeField__TypeAssignment6987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__ProjectNameField__ProjectNameAssignment7031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__AnnotationField__AnnotationsAssignment7075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__SimpleField__FullyQualifiedNameAssignment_07119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__SimpleField__FriendlyNameAssignment_17163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__SimpleField__DeclaredMethodsAssignment_27207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__SimpleField__ReturnVariableEexpressionsAssignment_37251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__SimpleField__AllDeclaredMethodNamesAssignment_47295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__SimpleField__DeclaredMethodNamesAssignment_57339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__SimpleField__DeclaredFieldNamesAssignment_67383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__SimpleField__AllDeclaredFieldNamesAssignment_77427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__SimpleField__FullTextAssignment_87471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__SimpleField__FieldsReadAssignment_97515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__SimpleField__FieldsWrittenAssignment_107559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__SimpleField__UsedFieldsInFinallyAssignment_117603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__SimpleField__UsedFieldsInTryAssignment_127647 = new BitSet(new long[]{0x0000000000000002L});

}