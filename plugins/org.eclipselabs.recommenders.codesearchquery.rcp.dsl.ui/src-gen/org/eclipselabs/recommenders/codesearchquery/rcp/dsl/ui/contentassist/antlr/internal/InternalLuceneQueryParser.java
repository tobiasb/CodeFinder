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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAMEWITHWC", "RULE_INT", "RULE_PATHWITHWC", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'private'", "'public'", "'static'", "'final'", "'abstract'", "'protected'", "'class'", "'method'", "'field'", "'trycatch'", "'-'", "'NOT'", "'!'", "'+'", "'AND'", "'OR'", "'||'", "'('", "')'", "':'", "'FullyQualifiedName'", "'FriendlyName'", "'DeclaredMethods'", "'ReturnVariableEexpressions'", "'AllDeclaredMethodNames'", "'DeclaredMethodNames'", "'DeclaredFieldNames'", "'AllDeclaredFieldNames'", "'FullText'", "'FieldsRead'", "'FieldsWritten'", "'UsedFieldsInFinally'", "'UsedFieldsInTry'", "'ImplementedTypes'", "'ExtendedTypes'", "'UsedTypes'", "'UsedTypesInTry'", "'UsedTypesInFinally'", "'ParameterTypes'", "'ReturnType'", "'InstanceofTypes'", "'AllImplementedTypes'", "'AllExtendedTypes'", "'FieldType'", "'CaughtType'", "'DeclaredFieldTypes'", "'DeclaringType'", "'UsedMethods'", "'UsedMethodsInTry'", "'UsedMethodsInFinally'", "'OverriddenMethods'", "'ResourcePath'", "'ParameterCount'", "'Modifiers'", "'Timestamp'", "'Type'", "'ProjectName'", "'Annotations'"
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
    public static final int T__70=70;
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


    // $ANTLR start "entryRuleSimpleField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:144:1: entryRuleSimpleField : ruleSimpleField EOF ;
    public final void entryRuleSimpleField() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:145:1: ( ruleSimpleField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:146:1: ruleSimpleField EOF
            {
             before(grammarAccess.getSimpleFieldRule()); 
            pushFollow(FOLLOW_ruleSimpleField_in_entryRuleSimpleField241);
            ruleSimpleField();

            state._fsp--;

             after(grammarAccess.getSimpleFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleField248); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:153:1: ruleSimpleField : ( ( rule__SimpleField__Alternatives ) ) ;
    public final void ruleSimpleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:157:2: ( ( ( rule__SimpleField__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:158:1: ( ( rule__SimpleField__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:158:1: ( ( rule__SimpleField__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:159:1: ( rule__SimpleField__Alternatives )
            {
             before(grammarAccess.getSimpleFieldAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:160:1: ( rule__SimpleField__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:160:2: rule__SimpleField__Alternatives
            {
            pushFollow(FOLLOW_rule__SimpleField__Alternatives_in_ruleSimpleField274);
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


    // $ANTLR start "entryRuleTypeField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:172:1: entryRuleTypeField : ruleTypeField EOF ;
    public final void entryRuleTypeField() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:173:1: ( ruleTypeField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:174:1: ruleTypeField EOF
            {
             before(grammarAccess.getTypeFieldRule()); 
            pushFollow(FOLLOW_ruleTypeField_in_entryRuleTypeField301);
            ruleTypeField();

            state._fsp--;

             after(grammarAccess.getTypeFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeField308); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:181:1: ruleTypeField : ( ( rule__TypeField__Alternatives ) ) ;
    public final void ruleTypeField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:185:2: ( ( ( rule__TypeField__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:186:1: ( ( rule__TypeField__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:186:1: ( ( rule__TypeField__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:187:1: ( rule__TypeField__Alternatives )
            {
             before(grammarAccess.getTypeFieldAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:188:1: ( rule__TypeField__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:188:2: rule__TypeField__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeField__Alternatives_in_ruleTypeField334);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:200:1: entryRuleMethodField : ruleMethodField EOF ;
    public final void entryRuleMethodField() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:201:1: ( ruleMethodField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:202:1: ruleMethodField EOF
            {
             before(grammarAccess.getMethodFieldRule()); 
            pushFollow(FOLLOW_ruleMethodField_in_entryRuleMethodField361);
            ruleMethodField();

            state._fsp--;

             after(grammarAccess.getMethodFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodField368); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:209:1: ruleMethodField : ( ( rule__MethodField__Alternatives ) ) ;
    public final void ruleMethodField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:213:2: ( ( ( rule__MethodField__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:214:1: ( ( rule__MethodField__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:214:1: ( ( rule__MethodField__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:215:1: ( rule__MethodField__Alternatives )
            {
             before(grammarAccess.getMethodFieldAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:216:1: ( rule__MethodField__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:216:2: rule__MethodField__Alternatives
            {
            pushFollow(FOLLOW_rule__MethodField__Alternatives_in_ruleMethodField394);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:228:1: entryRuleFilePathField : ruleFilePathField EOF ;
    public final void entryRuleFilePathField() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:229:1: ( ruleFilePathField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:230:1: ruleFilePathField EOF
            {
             before(grammarAccess.getFilePathFieldRule()); 
            pushFollow(FOLLOW_ruleFilePathField_in_entryRuleFilePathField421);
            ruleFilePathField();

            state._fsp--;

             after(grammarAccess.getFilePathFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilePathField428); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:237:1: ruleFilePathField : ( ( rule__FilePathField__ResourcePathAssignment ) ) ;
    public final void ruleFilePathField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:241:2: ( ( ( rule__FilePathField__ResourcePathAssignment ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:242:1: ( ( rule__FilePathField__ResourcePathAssignment ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:242:1: ( ( rule__FilePathField__ResourcePathAssignment ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:243:1: ( rule__FilePathField__ResourcePathAssignment )
            {
             before(grammarAccess.getFilePathFieldAccess().getResourcePathAssignment()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:244:1: ( rule__FilePathField__ResourcePathAssignment )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:244:2: rule__FilePathField__ResourcePathAssignment
            {
            pushFollow(FOLLOW_rule__FilePathField__ResourcePathAssignment_in_ruleFilePathField454);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:256:1: entryRuleNumberField : ruleNumberField EOF ;
    public final void entryRuleNumberField() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:257:1: ( ruleNumberField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:258:1: ruleNumberField EOF
            {
             before(grammarAccess.getNumberFieldRule()); 
            pushFollow(FOLLOW_ruleNumberField_in_entryRuleNumberField481);
            ruleNumberField();

            state._fsp--;

             after(grammarAccess.getNumberFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberField488); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:265:1: ruleNumberField : ( ( rule__NumberField__ParameterCountAssignment ) ) ;
    public final void ruleNumberField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:269:2: ( ( ( rule__NumberField__ParameterCountAssignment ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:270:1: ( ( rule__NumberField__ParameterCountAssignment ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:270:1: ( ( rule__NumberField__ParameterCountAssignment ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:271:1: ( rule__NumberField__ParameterCountAssignment )
            {
             before(grammarAccess.getNumberFieldAccess().getParameterCountAssignment()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:272:1: ( rule__NumberField__ParameterCountAssignment )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:272:2: rule__NumberField__ParameterCountAssignment
            {
            pushFollow(FOLLOW_rule__NumberField__ParameterCountAssignment_in_ruleNumberField514);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:284:1: entryRuleModifierField : ruleModifierField EOF ;
    public final void entryRuleModifierField() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:285:1: ( ruleModifierField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:286:1: ruleModifierField EOF
            {
             before(grammarAccess.getModifierFieldRule()); 
            pushFollow(FOLLOW_ruleModifierField_in_entryRuleModifierField541);
            ruleModifierField();

            state._fsp--;

             after(grammarAccess.getModifierFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifierField548); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:293:1: ruleModifierField : ( ( rule__ModifierField__ModifiersAssignment ) ) ;
    public final void ruleModifierField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:297:2: ( ( ( rule__ModifierField__ModifiersAssignment ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:298:1: ( ( rule__ModifierField__ModifiersAssignment ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:298:1: ( ( rule__ModifierField__ModifiersAssignment ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:299:1: ( rule__ModifierField__ModifiersAssignment )
            {
             before(grammarAccess.getModifierFieldAccess().getModifiersAssignment()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:300:1: ( rule__ModifierField__ModifiersAssignment )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:300:2: rule__ModifierField__ModifiersAssignment
            {
            pushFollow(FOLLOW_rule__ModifierField__ModifiersAssignment_in_ruleModifierField574);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:312:1: entryRuleTimeField : ruleTimeField EOF ;
    public final void entryRuleTimeField() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:313:1: ( ruleTimeField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:314:1: ruleTimeField EOF
            {
             before(grammarAccess.getTimeFieldRule()); 
            pushFollow(FOLLOW_ruleTimeField_in_entryRuleTimeField601);
            ruleTimeField();

            state._fsp--;

             after(grammarAccess.getTimeFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeField608); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:321:1: ruleTimeField : ( ( rule__TimeField__TimestampAssignment ) ) ;
    public final void ruleTimeField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:325:2: ( ( ( rule__TimeField__TimestampAssignment ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:326:1: ( ( rule__TimeField__TimestampAssignment ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:326:1: ( ( rule__TimeField__TimestampAssignment ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:327:1: ( rule__TimeField__TimestampAssignment )
            {
             before(grammarAccess.getTimeFieldAccess().getTimestampAssignment()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:328:1: ( rule__TimeField__TimestampAssignment )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:328:2: rule__TimeField__TimestampAssignment
            {
            pushFollow(FOLLOW_rule__TimeField__TimestampAssignment_in_ruleTimeField634);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:340:1: entryRuleDocumentTypeField : ruleDocumentTypeField EOF ;
    public final void entryRuleDocumentTypeField() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:341:1: ( ruleDocumentTypeField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:342:1: ruleDocumentTypeField EOF
            {
             before(grammarAccess.getDocumentTypeFieldRule()); 
            pushFollow(FOLLOW_ruleDocumentTypeField_in_entryRuleDocumentTypeField661);
            ruleDocumentTypeField();

            state._fsp--;

             after(grammarAccess.getDocumentTypeFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocumentTypeField668); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:349:1: ruleDocumentTypeField : ( ( rule__DocumentTypeField__TypeAssignment ) ) ;
    public final void ruleDocumentTypeField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:353:2: ( ( ( rule__DocumentTypeField__TypeAssignment ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:354:1: ( ( rule__DocumentTypeField__TypeAssignment ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:354:1: ( ( rule__DocumentTypeField__TypeAssignment ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:355:1: ( rule__DocumentTypeField__TypeAssignment )
            {
             before(grammarAccess.getDocumentTypeFieldAccess().getTypeAssignment()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:356:1: ( rule__DocumentTypeField__TypeAssignment )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:356:2: rule__DocumentTypeField__TypeAssignment
            {
            pushFollow(FOLLOW_rule__DocumentTypeField__TypeAssignment_in_ruleDocumentTypeField694);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:368:1: entryRuleProjectNameField : ruleProjectNameField EOF ;
    public final void entryRuleProjectNameField() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:369:1: ( ruleProjectNameField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:370:1: ruleProjectNameField EOF
            {
             before(grammarAccess.getProjectNameFieldRule()); 
            pushFollow(FOLLOW_ruleProjectNameField_in_entryRuleProjectNameField721);
            ruleProjectNameField();

            state._fsp--;

             after(grammarAccess.getProjectNameFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjectNameField728); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:377:1: ruleProjectNameField : ( ( rule__ProjectNameField__ProjectNameAssignment ) ) ;
    public final void ruleProjectNameField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:381:2: ( ( ( rule__ProjectNameField__ProjectNameAssignment ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:382:1: ( ( rule__ProjectNameField__ProjectNameAssignment ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:382:1: ( ( rule__ProjectNameField__ProjectNameAssignment ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:383:1: ( rule__ProjectNameField__ProjectNameAssignment )
            {
             before(grammarAccess.getProjectNameFieldAccess().getProjectNameAssignment()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:384:1: ( rule__ProjectNameField__ProjectNameAssignment )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:384:2: rule__ProjectNameField__ProjectNameAssignment
            {
            pushFollow(FOLLOW_rule__ProjectNameField__ProjectNameAssignment_in_ruleProjectNameField754);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:396:1: entryRuleAnnotationField : ruleAnnotationField EOF ;
    public final void entryRuleAnnotationField() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:397:1: ( ruleAnnotationField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:398:1: ruleAnnotationField EOF
            {
             before(grammarAccess.getAnnotationFieldRule()); 
            pushFollow(FOLLOW_ruleAnnotationField_in_entryRuleAnnotationField781);
            ruleAnnotationField();

            state._fsp--;

             after(grammarAccess.getAnnotationFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationField788); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:405:1: ruleAnnotationField : ( ( rule__AnnotationField__AnnotationsAssignment ) ) ;
    public final void ruleAnnotationField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:409:2: ( ( ( rule__AnnotationField__AnnotationsAssignment ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:410:1: ( ( rule__AnnotationField__AnnotationsAssignment ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:410:1: ( ( rule__AnnotationField__AnnotationsAssignment ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:411:1: ( rule__AnnotationField__AnnotationsAssignment )
            {
             before(grammarAccess.getAnnotationFieldAccess().getAnnotationsAssignment()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:412:1: ( rule__AnnotationField__AnnotationsAssignment )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:412:2: rule__AnnotationField__AnnotationsAssignment
            {
            pushFollow(FOLLOW_rule__AnnotationField__AnnotationsAssignment_in_ruleAnnotationField814);
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


    // $ANTLR start "entryRuleUnaryExpression"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:676:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:677:1: ( ruleUnaryExpression EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:678:1: ruleUnaryExpression EOF
            {
             before(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression1374);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression1381); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:685:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Alternatives ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:689:2: ( ( ( rule__UnaryExpression__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:690:1: ( ( rule__UnaryExpression__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:690:1: ( ( rule__UnaryExpression__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:691:1: ( rule__UnaryExpression__Alternatives )
            {
             before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:692:1: ( rule__UnaryExpression__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:692:2: rule__UnaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Alternatives_in_ruleUnaryExpression1407);
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


    // $ANTLR start "entryRuleFilePathFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:704:1: entryRuleFilePathFieldValue : ruleFilePathFieldValue EOF ;
    public final void entryRuleFilePathFieldValue() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:705:1: ( ruleFilePathFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:706:1: ruleFilePathFieldValue EOF
            {
             before(grammarAccess.getFilePathFieldValueRule()); 
            pushFollow(FOLLOW_ruleFilePathFieldValue_in_entryRuleFilePathFieldValue1434);
            ruleFilePathFieldValue();

            state._fsp--;

             after(grammarAccess.getFilePathFieldValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilePathFieldValue1441); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:713:1: ruleFilePathFieldValue : ( RULE_PATHWITHWC ) ;
    public final void ruleFilePathFieldValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:717:2: ( ( RULE_PATHWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:718:1: ( RULE_PATHWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:718:1: ( RULE_PATHWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:719:1: RULE_PATHWITHWC
            {
             before(grammarAccess.getFilePathFieldValueAccess().getPathWithWCTerminalRuleCall()); 
            match(input,RULE_PATHWITHWC,FOLLOW_RULE_PATHWITHWC_in_ruleFilePathFieldValue1467); 
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

                if ( (LA1_1==30) ) {
                    alt1=2;
                }
                else if ( (LA1_1==RULE_NAMEWITHWC||(LA1_1>=33 && LA1_1<=70)) ) {
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

                if ( (LA1_2==RULE_NAMEWITHWC||(LA1_2>=33 && LA1_2<=70)) ) {
                    alt1=1;
                }
                else if ( (LA1_2==30) ) {
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

                if ( (LA1_3==30) ) {
                    alt1=2;
                }
                else if ( (LA1_3==RULE_NAMEWITHWC||(LA1_3>=33 && LA1_3<=70)) ) {
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

                if ( (LA1_4==RULE_NAMEWITHWC||(LA1_4>=33 && LA1_4<=70)) ) {
                    alt1=1;
                }
                else if ( (LA1_4==30) ) {
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
            case 70:
                {
                alt1=1;
                }
                break;
            case 30:
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
            else if ( ((LA2_0>=33 && LA2_0<=70)) ) {
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
                alt3=1;
                }
                break;
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
                {
                alt3=2;
                }
                break;
            case 60:
            case 61:
            case 62:
            case 63:
                {
                alt3=3;
                }
                break;
            case 64:
                {
                alt3=4;
                }
                break;
            case 65:
                {
                alt3=5;
                }
                break;
            case 66:
                {
                alt3=6;
                }
                break;
            case 67:
                {
                alt3=7;
                }
                break;
            case 68:
                {
                alt3=8;
                }
                break;
            case 69:
                {
                alt3=9;
                }
                break;
            case 70:
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


    // $ANTLR start "rule__ClauseExpression__Alternatives_1_1_0_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:865:1: rule__ClauseExpression__Alternatives_1_1_0_2 : ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_0_2_0 ) ) | ( ( rule__ClauseExpression__Group_1_1_0_2_1__0 ) ) );
    public final void rule__ClauseExpression__Alternatives_1_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:869:1: ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_0_2_0 ) ) | ( ( rule__ClauseExpression__Group_1_1_0_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_NAMEWITHWC) ) {
                alt4=1;
            }
            else if ( (LA4_0==30) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:870:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_0_2_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:870:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_0_2_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:871:1: ( rule__ClauseExpression__ValuesAssignment_1_1_0_2_0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_0_2_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:872:1: ( rule__ClauseExpression__ValuesAssignment_1_1_0_2_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:872:2: rule__ClauseExpression__ValuesAssignment_1_1_0_2_0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_0_2_0_in_rule__ClauseExpression__Alternatives_1_1_0_21835);
                    rule__ClauseExpression__ValuesAssignment_1_1_0_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:876:6: ( ( rule__ClauseExpression__Group_1_1_0_2_1__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:876:6: ( ( rule__ClauseExpression__Group_1_1_0_2_1__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:877:1: ( rule__ClauseExpression__Group_1_1_0_2_1__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_0_2_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:878:1: ( rule__ClauseExpression__Group_1_1_0_2_1__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:878:2: rule__ClauseExpression__Group_1_1_0_2_1__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_0_2_1__0_in_rule__ClauseExpression__Alternatives_1_1_0_21853);
                    rule__ClauseExpression__Group_1_1_0_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_0_2_1()); 

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
    // $ANTLR end "rule__ClauseExpression__Alternatives_1_1_0_2"


    // $ANTLR start "rule__ClauseExpression__Alternatives_1_1_1_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:887:1: rule__ClauseExpression__Alternatives_1_1_1_2 : ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_1_2_0 ) ) | ( ( rule__ClauseExpression__Group_1_1_1_2_1__0 ) ) );
    public final void rule__ClauseExpression__Alternatives_1_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:891:1: ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_1_2_0 ) ) | ( ( rule__ClauseExpression__Group_1_1_1_2_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_NAMEWITHWC) ) {
                alt5=1;
            }
            else if ( (LA5_0==30) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:892:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_1_2_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:892:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_1_2_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:893:1: ( rule__ClauseExpression__ValuesAssignment_1_1_1_2_0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_1_2_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:894:1: ( rule__ClauseExpression__ValuesAssignment_1_1_1_2_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:894:2: rule__ClauseExpression__ValuesAssignment_1_1_1_2_0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_1_2_0_in_rule__ClauseExpression__Alternatives_1_1_1_21886);
                    rule__ClauseExpression__ValuesAssignment_1_1_1_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:898:6: ( ( rule__ClauseExpression__Group_1_1_1_2_1__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:898:6: ( ( rule__ClauseExpression__Group_1_1_1_2_1__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:899:1: ( rule__ClauseExpression__Group_1_1_1_2_1__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_1_2_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:900:1: ( rule__ClauseExpression__Group_1_1_1_2_1__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:900:2: rule__ClauseExpression__Group_1_1_1_2_1__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_1_2_1__0_in_rule__ClauseExpression__Alternatives_1_1_1_21904);
                    rule__ClauseExpression__Group_1_1_1_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_1_2_1()); 

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
    // $ANTLR end "rule__ClauseExpression__Alternatives_1_1_1_2"


    // $ANTLR start "rule__ClauseExpression__Alternatives_1_1_2_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:909:1: rule__ClauseExpression__Alternatives_1_1_2_2 : ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_2_2_0 ) ) | ( ( rule__ClauseExpression__Group_1_1_2_2_1__0 ) ) );
    public final void rule__ClauseExpression__Alternatives_1_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:913:1: ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_2_2_0 ) ) | ( ( rule__ClauseExpression__Group_1_1_2_2_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_NAMEWITHWC) ) {
                alt6=1;
            }
            else if ( (LA6_0==30) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:914:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_2_2_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:914:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_2_2_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:915:1: ( rule__ClauseExpression__ValuesAssignment_1_1_2_2_0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_2_2_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:916:1: ( rule__ClauseExpression__ValuesAssignment_1_1_2_2_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:916:2: rule__ClauseExpression__ValuesAssignment_1_1_2_2_0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_2_2_0_in_rule__ClauseExpression__Alternatives_1_1_2_21937);
                    rule__ClauseExpression__ValuesAssignment_1_1_2_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_2_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:920:6: ( ( rule__ClauseExpression__Group_1_1_2_2_1__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:920:6: ( ( rule__ClauseExpression__Group_1_1_2_2_1__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:921:1: ( rule__ClauseExpression__Group_1_1_2_2_1__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_2_2_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:922:1: ( rule__ClauseExpression__Group_1_1_2_2_1__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:922:2: rule__ClauseExpression__Group_1_1_2_2_1__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_2_2_1__0_in_rule__ClauseExpression__Alternatives_1_1_2_21955);
                    rule__ClauseExpression__Group_1_1_2_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_2_2_1()); 

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
    // $ANTLR end "rule__ClauseExpression__Alternatives_1_1_2_2"


    // $ANTLR start "rule__ClauseExpression__Alternatives_1_1_3_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:931:1: rule__ClauseExpression__Alternatives_1_1_3_2 : ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_3_2_0 ) ) | ( ( rule__ClauseExpression__Group_1_1_3_2_1__0 ) ) );
    public final void rule__ClauseExpression__Alternatives_1_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:935:1: ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_3_2_0 ) ) | ( ( rule__ClauseExpression__Group_1_1_3_2_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_PATHWITHWC) ) {
                alt7=1;
            }
            else if ( (LA7_0==30) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:936:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_3_2_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:936:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_3_2_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:937:1: ( rule__ClauseExpression__ValuesAssignment_1_1_3_2_0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_3_2_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:938:1: ( rule__ClauseExpression__ValuesAssignment_1_1_3_2_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:938:2: rule__ClauseExpression__ValuesAssignment_1_1_3_2_0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_3_2_0_in_rule__ClauseExpression__Alternatives_1_1_3_21988);
                    rule__ClauseExpression__ValuesAssignment_1_1_3_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_3_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:942:6: ( ( rule__ClauseExpression__Group_1_1_3_2_1__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:942:6: ( ( rule__ClauseExpression__Group_1_1_3_2_1__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:943:1: ( rule__ClauseExpression__Group_1_1_3_2_1__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_3_2_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:944:1: ( rule__ClauseExpression__Group_1_1_3_2_1__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:944:2: rule__ClauseExpression__Group_1_1_3_2_1__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_3_2_1__0_in_rule__ClauseExpression__Alternatives_1_1_3_22006);
                    rule__ClauseExpression__Group_1_1_3_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_3_2_1()); 

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
    // $ANTLR end "rule__ClauseExpression__Alternatives_1_1_3_2"


    // $ANTLR start "rule__ClauseExpression__Alternatives_1_1_4_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:953:1: rule__ClauseExpression__Alternatives_1_1_4_2 : ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_4_2_0 ) ) | ( ( rule__ClauseExpression__Group_1_1_4_2_1__0 ) ) );
    public final void rule__ClauseExpression__Alternatives_1_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:957:1: ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_4_2_0 ) ) | ( ( rule__ClauseExpression__Group_1_1_4_2_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==30) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:958:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_4_2_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:958:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_4_2_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:959:1: ( rule__ClauseExpression__ValuesAssignment_1_1_4_2_0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_4_2_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:960:1: ( rule__ClauseExpression__ValuesAssignment_1_1_4_2_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:960:2: rule__ClauseExpression__ValuesAssignment_1_1_4_2_0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_4_2_0_in_rule__ClauseExpression__Alternatives_1_1_4_22039);
                    rule__ClauseExpression__ValuesAssignment_1_1_4_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_4_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:964:6: ( ( rule__ClauseExpression__Group_1_1_4_2_1__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:964:6: ( ( rule__ClauseExpression__Group_1_1_4_2_1__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:965:1: ( rule__ClauseExpression__Group_1_1_4_2_1__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_4_2_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:966:1: ( rule__ClauseExpression__Group_1_1_4_2_1__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:966:2: rule__ClauseExpression__Group_1_1_4_2_1__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_4_2_1__0_in_rule__ClauseExpression__Alternatives_1_1_4_22057);
                    rule__ClauseExpression__Group_1_1_4_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_4_2_1()); 

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
    // $ANTLR end "rule__ClauseExpression__Alternatives_1_1_4_2"


    // $ANTLR start "rule__ClauseExpression__Alternatives_1_1_5_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:975:1: rule__ClauseExpression__Alternatives_1_1_5_2 : ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_5_2_0 ) ) | ( ( rule__ClauseExpression__Group_1_1_5_2_1__0 ) ) );
    public final void rule__ClauseExpression__Alternatives_1_1_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:979:1: ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_5_2_0 ) ) | ( ( rule__ClauseExpression__Group_1_1_5_2_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=13 && LA9_0<=18)) ) {
                alt9=1;
            }
            else if ( (LA9_0==30) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:980:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_5_2_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:980:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_5_2_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:981:1: ( rule__ClauseExpression__ValuesAssignment_1_1_5_2_0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_5_2_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:982:1: ( rule__ClauseExpression__ValuesAssignment_1_1_5_2_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:982:2: rule__ClauseExpression__ValuesAssignment_1_1_5_2_0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_5_2_0_in_rule__ClauseExpression__Alternatives_1_1_5_22090);
                    rule__ClauseExpression__ValuesAssignment_1_1_5_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_5_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:986:6: ( ( rule__ClauseExpression__Group_1_1_5_2_1__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:986:6: ( ( rule__ClauseExpression__Group_1_1_5_2_1__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:987:1: ( rule__ClauseExpression__Group_1_1_5_2_1__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_5_2_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:988:1: ( rule__ClauseExpression__Group_1_1_5_2_1__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:988:2: rule__ClauseExpression__Group_1_1_5_2_1__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_5_2_1__0_in_rule__ClauseExpression__Alternatives_1_1_5_22108);
                    rule__ClauseExpression__Group_1_1_5_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_5_2_1()); 

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
    // $ANTLR end "rule__ClauseExpression__Alternatives_1_1_5_2"


    // $ANTLR start "rule__ClauseExpression__Alternatives_1_1_6_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:997:1: rule__ClauseExpression__Alternatives_1_1_6_2 : ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_6_2_0 ) ) | ( ( rule__ClauseExpression__Group_1_1_6_2_1__0 ) ) );
    public final void rule__ClauseExpression__Alternatives_1_1_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1001:1: ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_6_2_0 ) ) | ( ( rule__ClauseExpression__Group_1_1_6_2_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_NAMEWITHWC) ) {
                alt10=1;
            }
            else if ( (LA10_0==30) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1002:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_6_2_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1002:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_6_2_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1003:1: ( rule__ClauseExpression__ValuesAssignment_1_1_6_2_0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_6_2_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1004:1: ( rule__ClauseExpression__ValuesAssignment_1_1_6_2_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1004:2: rule__ClauseExpression__ValuesAssignment_1_1_6_2_0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_6_2_0_in_rule__ClauseExpression__Alternatives_1_1_6_22141);
                    rule__ClauseExpression__ValuesAssignment_1_1_6_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_6_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1008:6: ( ( rule__ClauseExpression__Group_1_1_6_2_1__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1008:6: ( ( rule__ClauseExpression__Group_1_1_6_2_1__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1009:1: ( rule__ClauseExpression__Group_1_1_6_2_1__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_6_2_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1010:1: ( rule__ClauseExpression__Group_1_1_6_2_1__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1010:2: rule__ClauseExpression__Group_1_1_6_2_1__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_6_2_1__0_in_rule__ClauseExpression__Alternatives_1_1_6_22159);
                    rule__ClauseExpression__Group_1_1_6_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_6_2_1()); 

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
    // $ANTLR end "rule__ClauseExpression__Alternatives_1_1_6_2"


    // $ANTLR start "rule__ClauseExpression__Alternatives_1_1_7_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1019:1: rule__ClauseExpression__Alternatives_1_1_7_2 : ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_7_2_0 ) ) | ( ( rule__ClauseExpression__Group_1_1_7_2_1__0 ) ) );
    public final void rule__ClauseExpression__Alternatives_1_1_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1023:1: ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_7_2_0 ) ) | ( ( rule__ClauseExpression__Group_1_1_7_2_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=19 && LA11_0<=22)) ) {
                alt11=1;
            }
            else if ( (LA11_0==30) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1024:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_7_2_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1024:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_7_2_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1025:1: ( rule__ClauseExpression__ValuesAssignment_1_1_7_2_0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_7_2_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1026:1: ( rule__ClauseExpression__ValuesAssignment_1_1_7_2_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1026:2: rule__ClauseExpression__ValuesAssignment_1_1_7_2_0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_7_2_0_in_rule__ClauseExpression__Alternatives_1_1_7_22192);
                    rule__ClauseExpression__ValuesAssignment_1_1_7_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_7_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1030:6: ( ( rule__ClauseExpression__Group_1_1_7_2_1__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1030:6: ( ( rule__ClauseExpression__Group_1_1_7_2_1__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1031:1: ( rule__ClauseExpression__Group_1_1_7_2_1__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_7_2_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1032:1: ( rule__ClauseExpression__Group_1_1_7_2_1__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1032:2: rule__ClauseExpression__Group_1_1_7_2_1__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_7_2_1__0_in_rule__ClauseExpression__Alternatives_1_1_7_22210);
                    rule__ClauseExpression__Group_1_1_7_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_7_2_1()); 

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
    // $ANTLR end "rule__ClauseExpression__Alternatives_1_1_7_2"


    // $ANTLR start "rule__ClauseExpression__Alternatives_1_1_8_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1041:1: rule__ClauseExpression__Alternatives_1_1_8_2 : ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_8_2_0 ) ) | ( ( rule__ClauseExpression__Group_1_1_8_2_1__0 ) ) );
    public final void rule__ClauseExpression__Alternatives_1_1_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1045:1: ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_8_2_0 ) ) | ( ( rule__ClauseExpression__Group_1_1_8_2_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_NAMEWITHWC) ) {
                alt12=1;
            }
            else if ( (LA12_0==30) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1046:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_8_2_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1046:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_8_2_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1047:1: ( rule__ClauseExpression__ValuesAssignment_1_1_8_2_0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_8_2_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1048:1: ( rule__ClauseExpression__ValuesAssignment_1_1_8_2_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1048:2: rule__ClauseExpression__ValuesAssignment_1_1_8_2_0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_8_2_0_in_rule__ClauseExpression__Alternatives_1_1_8_22243);
                    rule__ClauseExpression__ValuesAssignment_1_1_8_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_8_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1052:6: ( ( rule__ClauseExpression__Group_1_1_8_2_1__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1052:6: ( ( rule__ClauseExpression__Group_1_1_8_2_1__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1053:1: ( rule__ClauseExpression__Group_1_1_8_2_1__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_8_2_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1054:1: ( rule__ClauseExpression__Group_1_1_8_2_1__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1054:2: rule__ClauseExpression__Group_1_1_8_2_1__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_8_2_1__0_in_rule__ClauseExpression__Alternatives_1_1_8_22261);
                    rule__ClauseExpression__Group_1_1_8_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_8_2_1()); 

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
    // $ANTLR end "rule__ClauseExpression__Alternatives_1_1_8_2"


    // $ANTLR start "rule__ClauseExpression__Alternatives_1_1_9_2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1063:1: rule__ClauseExpression__Alternatives_1_1_9_2 : ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_9_2_0 ) ) | ( ( rule__ClauseExpression__Group_1_1_9_2_1__0 ) ) );
    public final void rule__ClauseExpression__Alternatives_1_1_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1067:1: ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_9_2_0 ) ) | ( ( rule__ClauseExpression__Group_1_1_9_2_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_NAMEWITHWC) ) {
                alt13=1;
            }
            else if ( (LA13_0==30) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1068:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_9_2_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1068:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_9_2_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1069:1: ( rule__ClauseExpression__ValuesAssignment_1_1_9_2_0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_9_2_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1070:1: ( rule__ClauseExpression__ValuesAssignment_1_1_9_2_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1070:2: rule__ClauseExpression__ValuesAssignment_1_1_9_2_0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_9_2_0_in_rule__ClauseExpression__Alternatives_1_1_9_22294);
                    rule__ClauseExpression__ValuesAssignment_1_1_9_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_9_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1074:6: ( ( rule__ClauseExpression__Group_1_1_9_2_1__0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1074:6: ( ( rule__ClauseExpression__Group_1_1_9_2_1__0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1075:1: ( rule__ClauseExpression__Group_1_1_9_2_1__0 )
                    {
                     before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_9_2_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1076:1: ( rule__ClauseExpression__Group_1_1_9_2_1__0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1076:2: rule__ClauseExpression__Group_1_1_9_2_1__0
                    {
                    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_9_2_1__0_in_rule__ClauseExpression__Alternatives_1_1_9_22312);
                    rule__ClauseExpression__Group_1_1_9_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_9_2_1()); 

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
    // $ANTLR end "rule__ClauseExpression__Alternatives_1_1_9_2"


    // $ANTLR start "rule__SimpleField__Alternatives"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1085:1: rule__SimpleField__Alternatives : ( ( ( rule__SimpleField__FullyQualifiedNameAssignment_0 ) ) | ( ( rule__SimpleField__FriendlyNameAssignment_1 ) ) | ( ( rule__SimpleField__DeclaredMethodsAssignment_2 ) ) | ( ( rule__SimpleField__ReturnVariableEexpressionsAssignment_3 ) ) | ( ( rule__SimpleField__AllDeclaredMethodNamesAssignment_4 ) ) | ( ( rule__SimpleField__DeclaredMethodNamesAssignment_5 ) ) | ( ( rule__SimpleField__DeclaredFieldNamesAssignment_6 ) ) | ( ( rule__SimpleField__AllDeclaredFieldNamesAssignment_7 ) ) | ( ( rule__SimpleField__FullTextAssignment_8 ) ) | ( ( rule__SimpleField__FieldsReadAssignment_9 ) ) | ( ( rule__SimpleField__FieldsWrittenAssignment_10 ) ) | ( ( rule__SimpleField__UsedFieldsInFinallyAssignment_11 ) ) | ( ( rule__SimpleField__UsedFieldsInTryAssignment_12 ) ) );
    public final void rule__SimpleField__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1089:1: ( ( ( rule__SimpleField__FullyQualifiedNameAssignment_0 ) ) | ( ( rule__SimpleField__FriendlyNameAssignment_1 ) ) | ( ( rule__SimpleField__DeclaredMethodsAssignment_2 ) ) | ( ( rule__SimpleField__ReturnVariableEexpressionsAssignment_3 ) ) | ( ( rule__SimpleField__AllDeclaredMethodNamesAssignment_4 ) ) | ( ( rule__SimpleField__DeclaredMethodNamesAssignment_5 ) ) | ( ( rule__SimpleField__DeclaredFieldNamesAssignment_6 ) ) | ( ( rule__SimpleField__AllDeclaredFieldNamesAssignment_7 ) ) | ( ( rule__SimpleField__FullTextAssignment_8 ) ) | ( ( rule__SimpleField__FieldsReadAssignment_9 ) ) | ( ( rule__SimpleField__FieldsWrittenAssignment_10 ) ) | ( ( rule__SimpleField__UsedFieldsInFinallyAssignment_11 ) ) | ( ( rule__SimpleField__UsedFieldsInTryAssignment_12 ) ) )
            int alt14=13;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt14=1;
                }
                break;
            case 34:
                {
                alt14=2;
                }
                break;
            case 35:
                {
                alt14=3;
                }
                break;
            case 36:
                {
                alt14=4;
                }
                break;
            case 37:
                {
                alt14=5;
                }
                break;
            case 38:
                {
                alt14=6;
                }
                break;
            case 39:
                {
                alt14=7;
                }
                break;
            case 40:
                {
                alt14=8;
                }
                break;
            case 41:
                {
                alt14=9;
                }
                break;
            case 42:
                {
                alt14=10;
                }
                break;
            case 43:
                {
                alt14=11;
                }
                break;
            case 44:
                {
                alt14=12;
                }
                break;
            case 45:
                {
                alt14=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1090:1: ( ( rule__SimpleField__FullyQualifiedNameAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1090:1: ( ( rule__SimpleField__FullyQualifiedNameAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1091:1: ( rule__SimpleField__FullyQualifiedNameAssignment_0 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getFullyQualifiedNameAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1092:1: ( rule__SimpleField__FullyQualifiedNameAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1092:2: rule__SimpleField__FullyQualifiedNameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SimpleField__FullyQualifiedNameAssignment_0_in_rule__SimpleField__Alternatives2345);
                    rule__SimpleField__FullyQualifiedNameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getFullyQualifiedNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1096:6: ( ( rule__SimpleField__FriendlyNameAssignment_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1096:6: ( ( rule__SimpleField__FriendlyNameAssignment_1 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1097:1: ( rule__SimpleField__FriendlyNameAssignment_1 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getFriendlyNameAssignment_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1098:1: ( rule__SimpleField__FriendlyNameAssignment_1 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1098:2: rule__SimpleField__FriendlyNameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SimpleField__FriendlyNameAssignment_1_in_rule__SimpleField__Alternatives2363);
                    rule__SimpleField__FriendlyNameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getFriendlyNameAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1102:6: ( ( rule__SimpleField__DeclaredMethodsAssignment_2 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1102:6: ( ( rule__SimpleField__DeclaredMethodsAssignment_2 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1103:1: ( rule__SimpleField__DeclaredMethodsAssignment_2 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getDeclaredMethodsAssignment_2()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1104:1: ( rule__SimpleField__DeclaredMethodsAssignment_2 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1104:2: rule__SimpleField__DeclaredMethodsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SimpleField__DeclaredMethodsAssignment_2_in_rule__SimpleField__Alternatives2381);
                    rule__SimpleField__DeclaredMethodsAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getDeclaredMethodsAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1108:6: ( ( rule__SimpleField__ReturnVariableEexpressionsAssignment_3 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1108:6: ( ( rule__SimpleField__ReturnVariableEexpressionsAssignment_3 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1109:1: ( rule__SimpleField__ReturnVariableEexpressionsAssignment_3 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getReturnVariableEexpressionsAssignment_3()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1110:1: ( rule__SimpleField__ReturnVariableEexpressionsAssignment_3 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1110:2: rule__SimpleField__ReturnVariableEexpressionsAssignment_3
                    {
                    pushFollow(FOLLOW_rule__SimpleField__ReturnVariableEexpressionsAssignment_3_in_rule__SimpleField__Alternatives2399);
                    rule__SimpleField__ReturnVariableEexpressionsAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getReturnVariableEexpressionsAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1114:6: ( ( rule__SimpleField__AllDeclaredMethodNamesAssignment_4 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1114:6: ( ( rule__SimpleField__AllDeclaredMethodNamesAssignment_4 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1115:1: ( rule__SimpleField__AllDeclaredMethodNamesAssignment_4 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getAllDeclaredMethodNamesAssignment_4()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1116:1: ( rule__SimpleField__AllDeclaredMethodNamesAssignment_4 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1116:2: rule__SimpleField__AllDeclaredMethodNamesAssignment_4
                    {
                    pushFollow(FOLLOW_rule__SimpleField__AllDeclaredMethodNamesAssignment_4_in_rule__SimpleField__Alternatives2417);
                    rule__SimpleField__AllDeclaredMethodNamesAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getAllDeclaredMethodNamesAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1120:6: ( ( rule__SimpleField__DeclaredMethodNamesAssignment_5 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1120:6: ( ( rule__SimpleField__DeclaredMethodNamesAssignment_5 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1121:1: ( rule__SimpleField__DeclaredMethodNamesAssignment_5 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getDeclaredMethodNamesAssignment_5()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1122:1: ( rule__SimpleField__DeclaredMethodNamesAssignment_5 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1122:2: rule__SimpleField__DeclaredMethodNamesAssignment_5
                    {
                    pushFollow(FOLLOW_rule__SimpleField__DeclaredMethodNamesAssignment_5_in_rule__SimpleField__Alternatives2435);
                    rule__SimpleField__DeclaredMethodNamesAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getDeclaredMethodNamesAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1126:6: ( ( rule__SimpleField__DeclaredFieldNamesAssignment_6 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1126:6: ( ( rule__SimpleField__DeclaredFieldNamesAssignment_6 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1127:1: ( rule__SimpleField__DeclaredFieldNamesAssignment_6 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getDeclaredFieldNamesAssignment_6()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1128:1: ( rule__SimpleField__DeclaredFieldNamesAssignment_6 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1128:2: rule__SimpleField__DeclaredFieldNamesAssignment_6
                    {
                    pushFollow(FOLLOW_rule__SimpleField__DeclaredFieldNamesAssignment_6_in_rule__SimpleField__Alternatives2453);
                    rule__SimpleField__DeclaredFieldNamesAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getDeclaredFieldNamesAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1132:6: ( ( rule__SimpleField__AllDeclaredFieldNamesAssignment_7 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1132:6: ( ( rule__SimpleField__AllDeclaredFieldNamesAssignment_7 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1133:1: ( rule__SimpleField__AllDeclaredFieldNamesAssignment_7 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getAllDeclaredFieldNamesAssignment_7()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1134:1: ( rule__SimpleField__AllDeclaredFieldNamesAssignment_7 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1134:2: rule__SimpleField__AllDeclaredFieldNamesAssignment_7
                    {
                    pushFollow(FOLLOW_rule__SimpleField__AllDeclaredFieldNamesAssignment_7_in_rule__SimpleField__Alternatives2471);
                    rule__SimpleField__AllDeclaredFieldNamesAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getAllDeclaredFieldNamesAssignment_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1138:6: ( ( rule__SimpleField__FullTextAssignment_8 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1138:6: ( ( rule__SimpleField__FullTextAssignment_8 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1139:1: ( rule__SimpleField__FullTextAssignment_8 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getFullTextAssignment_8()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1140:1: ( rule__SimpleField__FullTextAssignment_8 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1140:2: rule__SimpleField__FullTextAssignment_8
                    {
                    pushFollow(FOLLOW_rule__SimpleField__FullTextAssignment_8_in_rule__SimpleField__Alternatives2489);
                    rule__SimpleField__FullTextAssignment_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getFullTextAssignment_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1144:6: ( ( rule__SimpleField__FieldsReadAssignment_9 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1144:6: ( ( rule__SimpleField__FieldsReadAssignment_9 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1145:1: ( rule__SimpleField__FieldsReadAssignment_9 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getFieldsReadAssignment_9()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1146:1: ( rule__SimpleField__FieldsReadAssignment_9 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1146:2: rule__SimpleField__FieldsReadAssignment_9
                    {
                    pushFollow(FOLLOW_rule__SimpleField__FieldsReadAssignment_9_in_rule__SimpleField__Alternatives2507);
                    rule__SimpleField__FieldsReadAssignment_9();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getFieldsReadAssignment_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1150:6: ( ( rule__SimpleField__FieldsWrittenAssignment_10 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1150:6: ( ( rule__SimpleField__FieldsWrittenAssignment_10 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1151:1: ( rule__SimpleField__FieldsWrittenAssignment_10 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getFieldsWrittenAssignment_10()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1152:1: ( rule__SimpleField__FieldsWrittenAssignment_10 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1152:2: rule__SimpleField__FieldsWrittenAssignment_10
                    {
                    pushFollow(FOLLOW_rule__SimpleField__FieldsWrittenAssignment_10_in_rule__SimpleField__Alternatives2525);
                    rule__SimpleField__FieldsWrittenAssignment_10();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getFieldsWrittenAssignment_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1156:6: ( ( rule__SimpleField__UsedFieldsInFinallyAssignment_11 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1156:6: ( ( rule__SimpleField__UsedFieldsInFinallyAssignment_11 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1157:1: ( rule__SimpleField__UsedFieldsInFinallyAssignment_11 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getUsedFieldsInFinallyAssignment_11()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1158:1: ( rule__SimpleField__UsedFieldsInFinallyAssignment_11 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1158:2: rule__SimpleField__UsedFieldsInFinallyAssignment_11
                    {
                    pushFollow(FOLLOW_rule__SimpleField__UsedFieldsInFinallyAssignment_11_in_rule__SimpleField__Alternatives2543);
                    rule__SimpleField__UsedFieldsInFinallyAssignment_11();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getUsedFieldsInFinallyAssignment_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1162:6: ( ( rule__SimpleField__UsedFieldsInTryAssignment_12 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1162:6: ( ( rule__SimpleField__UsedFieldsInTryAssignment_12 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1163:1: ( rule__SimpleField__UsedFieldsInTryAssignment_12 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getUsedFieldsInTryAssignment_12()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1164:1: ( rule__SimpleField__UsedFieldsInTryAssignment_12 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1164:2: rule__SimpleField__UsedFieldsInTryAssignment_12
                    {
                    pushFollow(FOLLOW_rule__SimpleField__UsedFieldsInTryAssignment_12_in_rule__SimpleField__Alternatives2561);
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


    // $ANTLR start "rule__TypeField__Alternatives"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1173:1: rule__TypeField__Alternatives : ( ( ( rule__TypeField__ImplementedTypesAssignment_0 ) ) | ( ( rule__TypeField__ExtendedTypesAssignment_1 ) ) | ( ( rule__TypeField__UsedTypesAssignment_2 ) ) | ( ( rule__TypeField__UsedTypesInTryAssignment_3 ) ) | ( ( rule__TypeField__UsedTypesInFinallyAssignment_4 ) ) | ( ( rule__TypeField__ParameterTypesAssignment_5 ) ) | ( ( rule__TypeField__ReturnTypeAssignment_6 ) ) | ( ( rule__TypeField__InstanceofTypesAssignment_7 ) ) | ( ( rule__TypeField__AllImplementedTypesAssignment_8 ) ) | ( ( rule__TypeField__AllExtendedTypesAssignment_9 ) ) | ( ( rule__TypeField__FieldTypeAssignment_10 ) ) | ( ( rule__TypeField__CaughtTypeAssignment_11 ) ) | ( ( rule__TypeField__DeclaredFieldTypesAssignment_12 ) ) | ( ( rule__TypeField__DeclaringTypeAssignment_13 ) ) );
    public final void rule__TypeField__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1177:1: ( ( ( rule__TypeField__ImplementedTypesAssignment_0 ) ) | ( ( rule__TypeField__ExtendedTypesAssignment_1 ) ) | ( ( rule__TypeField__UsedTypesAssignment_2 ) ) | ( ( rule__TypeField__UsedTypesInTryAssignment_3 ) ) | ( ( rule__TypeField__UsedTypesInFinallyAssignment_4 ) ) | ( ( rule__TypeField__ParameterTypesAssignment_5 ) ) | ( ( rule__TypeField__ReturnTypeAssignment_6 ) ) | ( ( rule__TypeField__InstanceofTypesAssignment_7 ) ) | ( ( rule__TypeField__AllImplementedTypesAssignment_8 ) ) | ( ( rule__TypeField__AllExtendedTypesAssignment_9 ) ) | ( ( rule__TypeField__FieldTypeAssignment_10 ) ) | ( ( rule__TypeField__CaughtTypeAssignment_11 ) ) | ( ( rule__TypeField__DeclaredFieldTypesAssignment_12 ) ) | ( ( rule__TypeField__DeclaringTypeAssignment_13 ) ) )
            int alt15=14;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt15=1;
                }
                break;
            case 47:
                {
                alt15=2;
                }
                break;
            case 48:
                {
                alt15=3;
                }
                break;
            case 49:
                {
                alt15=4;
                }
                break;
            case 50:
                {
                alt15=5;
                }
                break;
            case 51:
                {
                alt15=6;
                }
                break;
            case 52:
                {
                alt15=7;
                }
                break;
            case 53:
                {
                alt15=8;
                }
                break;
            case 54:
                {
                alt15=9;
                }
                break;
            case 55:
                {
                alt15=10;
                }
                break;
            case 56:
                {
                alt15=11;
                }
                break;
            case 57:
                {
                alt15=12;
                }
                break;
            case 58:
                {
                alt15=13;
                }
                break;
            case 59:
                {
                alt15=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1178:1: ( ( rule__TypeField__ImplementedTypesAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1178:1: ( ( rule__TypeField__ImplementedTypesAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1179:1: ( rule__TypeField__ImplementedTypesAssignment_0 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getImplementedTypesAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1180:1: ( rule__TypeField__ImplementedTypesAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1180:2: rule__TypeField__ImplementedTypesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TypeField__ImplementedTypesAssignment_0_in_rule__TypeField__Alternatives2594);
                    rule__TypeField__ImplementedTypesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getImplementedTypesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1184:6: ( ( rule__TypeField__ExtendedTypesAssignment_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1184:6: ( ( rule__TypeField__ExtendedTypesAssignment_1 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1185:1: ( rule__TypeField__ExtendedTypesAssignment_1 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getExtendedTypesAssignment_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1186:1: ( rule__TypeField__ExtendedTypesAssignment_1 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1186:2: rule__TypeField__ExtendedTypesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeField__ExtendedTypesAssignment_1_in_rule__TypeField__Alternatives2612);
                    rule__TypeField__ExtendedTypesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getExtendedTypesAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1190:6: ( ( rule__TypeField__UsedTypesAssignment_2 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1190:6: ( ( rule__TypeField__UsedTypesAssignment_2 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1191:1: ( rule__TypeField__UsedTypesAssignment_2 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getUsedTypesAssignment_2()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1192:1: ( rule__TypeField__UsedTypesAssignment_2 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1192:2: rule__TypeField__UsedTypesAssignment_2
                    {
                    pushFollow(FOLLOW_rule__TypeField__UsedTypesAssignment_2_in_rule__TypeField__Alternatives2630);
                    rule__TypeField__UsedTypesAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getUsedTypesAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1196:6: ( ( rule__TypeField__UsedTypesInTryAssignment_3 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1196:6: ( ( rule__TypeField__UsedTypesInTryAssignment_3 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1197:1: ( rule__TypeField__UsedTypesInTryAssignment_3 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getUsedTypesInTryAssignment_3()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1198:1: ( rule__TypeField__UsedTypesInTryAssignment_3 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1198:2: rule__TypeField__UsedTypesInTryAssignment_3
                    {
                    pushFollow(FOLLOW_rule__TypeField__UsedTypesInTryAssignment_3_in_rule__TypeField__Alternatives2648);
                    rule__TypeField__UsedTypesInTryAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getUsedTypesInTryAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1202:6: ( ( rule__TypeField__UsedTypesInFinallyAssignment_4 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1202:6: ( ( rule__TypeField__UsedTypesInFinallyAssignment_4 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1203:1: ( rule__TypeField__UsedTypesInFinallyAssignment_4 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getUsedTypesInFinallyAssignment_4()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1204:1: ( rule__TypeField__UsedTypesInFinallyAssignment_4 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1204:2: rule__TypeField__UsedTypesInFinallyAssignment_4
                    {
                    pushFollow(FOLLOW_rule__TypeField__UsedTypesInFinallyAssignment_4_in_rule__TypeField__Alternatives2666);
                    rule__TypeField__UsedTypesInFinallyAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getUsedTypesInFinallyAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1208:6: ( ( rule__TypeField__ParameterTypesAssignment_5 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1208:6: ( ( rule__TypeField__ParameterTypesAssignment_5 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1209:1: ( rule__TypeField__ParameterTypesAssignment_5 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getParameterTypesAssignment_5()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1210:1: ( rule__TypeField__ParameterTypesAssignment_5 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1210:2: rule__TypeField__ParameterTypesAssignment_5
                    {
                    pushFollow(FOLLOW_rule__TypeField__ParameterTypesAssignment_5_in_rule__TypeField__Alternatives2684);
                    rule__TypeField__ParameterTypesAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getParameterTypesAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1214:6: ( ( rule__TypeField__ReturnTypeAssignment_6 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1214:6: ( ( rule__TypeField__ReturnTypeAssignment_6 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1215:1: ( rule__TypeField__ReturnTypeAssignment_6 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getReturnTypeAssignment_6()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1216:1: ( rule__TypeField__ReturnTypeAssignment_6 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1216:2: rule__TypeField__ReturnTypeAssignment_6
                    {
                    pushFollow(FOLLOW_rule__TypeField__ReturnTypeAssignment_6_in_rule__TypeField__Alternatives2702);
                    rule__TypeField__ReturnTypeAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getReturnTypeAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1220:6: ( ( rule__TypeField__InstanceofTypesAssignment_7 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1220:6: ( ( rule__TypeField__InstanceofTypesAssignment_7 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1221:1: ( rule__TypeField__InstanceofTypesAssignment_7 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getInstanceofTypesAssignment_7()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1222:1: ( rule__TypeField__InstanceofTypesAssignment_7 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1222:2: rule__TypeField__InstanceofTypesAssignment_7
                    {
                    pushFollow(FOLLOW_rule__TypeField__InstanceofTypesAssignment_7_in_rule__TypeField__Alternatives2720);
                    rule__TypeField__InstanceofTypesAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getInstanceofTypesAssignment_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1226:6: ( ( rule__TypeField__AllImplementedTypesAssignment_8 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1226:6: ( ( rule__TypeField__AllImplementedTypesAssignment_8 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1227:1: ( rule__TypeField__AllImplementedTypesAssignment_8 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getAllImplementedTypesAssignment_8()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1228:1: ( rule__TypeField__AllImplementedTypesAssignment_8 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1228:2: rule__TypeField__AllImplementedTypesAssignment_8
                    {
                    pushFollow(FOLLOW_rule__TypeField__AllImplementedTypesAssignment_8_in_rule__TypeField__Alternatives2738);
                    rule__TypeField__AllImplementedTypesAssignment_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getAllImplementedTypesAssignment_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1232:6: ( ( rule__TypeField__AllExtendedTypesAssignment_9 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1232:6: ( ( rule__TypeField__AllExtendedTypesAssignment_9 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1233:1: ( rule__TypeField__AllExtendedTypesAssignment_9 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getAllExtendedTypesAssignment_9()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1234:1: ( rule__TypeField__AllExtendedTypesAssignment_9 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1234:2: rule__TypeField__AllExtendedTypesAssignment_9
                    {
                    pushFollow(FOLLOW_rule__TypeField__AllExtendedTypesAssignment_9_in_rule__TypeField__Alternatives2756);
                    rule__TypeField__AllExtendedTypesAssignment_9();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getAllExtendedTypesAssignment_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1238:6: ( ( rule__TypeField__FieldTypeAssignment_10 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1238:6: ( ( rule__TypeField__FieldTypeAssignment_10 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1239:1: ( rule__TypeField__FieldTypeAssignment_10 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getFieldTypeAssignment_10()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1240:1: ( rule__TypeField__FieldTypeAssignment_10 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1240:2: rule__TypeField__FieldTypeAssignment_10
                    {
                    pushFollow(FOLLOW_rule__TypeField__FieldTypeAssignment_10_in_rule__TypeField__Alternatives2774);
                    rule__TypeField__FieldTypeAssignment_10();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getFieldTypeAssignment_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1244:6: ( ( rule__TypeField__CaughtTypeAssignment_11 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1244:6: ( ( rule__TypeField__CaughtTypeAssignment_11 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1245:1: ( rule__TypeField__CaughtTypeAssignment_11 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getCaughtTypeAssignment_11()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1246:1: ( rule__TypeField__CaughtTypeAssignment_11 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1246:2: rule__TypeField__CaughtTypeAssignment_11
                    {
                    pushFollow(FOLLOW_rule__TypeField__CaughtTypeAssignment_11_in_rule__TypeField__Alternatives2792);
                    rule__TypeField__CaughtTypeAssignment_11();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getCaughtTypeAssignment_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1250:6: ( ( rule__TypeField__DeclaredFieldTypesAssignment_12 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1250:6: ( ( rule__TypeField__DeclaredFieldTypesAssignment_12 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1251:1: ( rule__TypeField__DeclaredFieldTypesAssignment_12 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getDeclaredFieldTypesAssignment_12()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1252:1: ( rule__TypeField__DeclaredFieldTypesAssignment_12 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1252:2: rule__TypeField__DeclaredFieldTypesAssignment_12
                    {
                    pushFollow(FOLLOW_rule__TypeField__DeclaredFieldTypesAssignment_12_in_rule__TypeField__Alternatives2810);
                    rule__TypeField__DeclaredFieldTypesAssignment_12();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeFieldAccess().getDeclaredFieldTypesAssignment_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1256:6: ( ( rule__TypeField__DeclaringTypeAssignment_13 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1256:6: ( ( rule__TypeField__DeclaringTypeAssignment_13 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1257:1: ( rule__TypeField__DeclaringTypeAssignment_13 )
                    {
                     before(grammarAccess.getTypeFieldAccess().getDeclaringTypeAssignment_13()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1258:1: ( rule__TypeField__DeclaringTypeAssignment_13 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1258:2: rule__TypeField__DeclaringTypeAssignment_13
                    {
                    pushFollow(FOLLOW_rule__TypeField__DeclaringTypeAssignment_13_in_rule__TypeField__Alternatives2828);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1267:1: rule__MethodField__Alternatives : ( ( ( rule__MethodField__UsedMethodsAssignment_0 ) ) | ( ( rule__MethodField__UsedMethodsInTryAssignment_1 ) ) | ( ( rule__MethodField__UsedMethodsInFinallyAssignment_2 ) ) | ( ( rule__MethodField__OverriddenMethodsAssignment_3 ) ) );
    public final void rule__MethodField__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1271:1: ( ( ( rule__MethodField__UsedMethodsAssignment_0 ) ) | ( ( rule__MethodField__UsedMethodsInTryAssignment_1 ) ) | ( ( rule__MethodField__UsedMethodsInFinallyAssignment_2 ) ) | ( ( rule__MethodField__OverriddenMethodsAssignment_3 ) ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt16=1;
                }
                break;
            case 61:
                {
                alt16=2;
                }
                break;
            case 62:
                {
                alt16=3;
                }
                break;
            case 63:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1272:1: ( ( rule__MethodField__UsedMethodsAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1272:1: ( ( rule__MethodField__UsedMethodsAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1273:1: ( rule__MethodField__UsedMethodsAssignment_0 )
                    {
                     before(grammarAccess.getMethodFieldAccess().getUsedMethodsAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1274:1: ( rule__MethodField__UsedMethodsAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1274:2: rule__MethodField__UsedMethodsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__MethodField__UsedMethodsAssignment_0_in_rule__MethodField__Alternatives2861);
                    rule__MethodField__UsedMethodsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodFieldAccess().getUsedMethodsAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1278:6: ( ( rule__MethodField__UsedMethodsInTryAssignment_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1278:6: ( ( rule__MethodField__UsedMethodsInTryAssignment_1 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1279:1: ( rule__MethodField__UsedMethodsInTryAssignment_1 )
                    {
                     before(grammarAccess.getMethodFieldAccess().getUsedMethodsInTryAssignment_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1280:1: ( rule__MethodField__UsedMethodsInTryAssignment_1 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1280:2: rule__MethodField__UsedMethodsInTryAssignment_1
                    {
                    pushFollow(FOLLOW_rule__MethodField__UsedMethodsInTryAssignment_1_in_rule__MethodField__Alternatives2879);
                    rule__MethodField__UsedMethodsInTryAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodFieldAccess().getUsedMethodsInTryAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1284:6: ( ( rule__MethodField__UsedMethodsInFinallyAssignment_2 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1284:6: ( ( rule__MethodField__UsedMethodsInFinallyAssignment_2 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1285:1: ( rule__MethodField__UsedMethodsInFinallyAssignment_2 )
                    {
                     before(grammarAccess.getMethodFieldAccess().getUsedMethodsInFinallyAssignment_2()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1286:1: ( rule__MethodField__UsedMethodsInFinallyAssignment_2 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1286:2: rule__MethodField__UsedMethodsInFinallyAssignment_2
                    {
                    pushFollow(FOLLOW_rule__MethodField__UsedMethodsInFinallyAssignment_2_in_rule__MethodField__Alternatives2897);
                    rule__MethodField__UsedMethodsInFinallyAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodFieldAccess().getUsedMethodsInFinallyAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1290:6: ( ( rule__MethodField__OverriddenMethodsAssignment_3 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1290:6: ( ( rule__MethodField__OverriddenMethodsAssignment_3 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1291:1: ( rule__MethodField__OverriddenMethodsAssignment_3 )
                    {
                     before(grammarAccess.getMethodFieldAccess().getOverriddenMethodsAssignment_3()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1292:1: ( rule__MethodField__OverriddenMethodsAssignment_3 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1292:2: rule__MethodField__OverriddenMethodsAssignment_3
                    {
                    pushFollow(FOLLOW_rule__MethodField__OverriddenMethodsAssignment_3_in_rule__MethodField__Alternatives2915);
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


    // $ANTLR start "rule__ModifierFieldValue__Alternatives"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1301:1: rule__ModifierFieldValue__Alternatives : ( ( 'private' ) | ( 'public' ) | ( 'static' ) | ( 'final' ) | ( 'abstract' ) | ( 'protected' ) );
    public final void rule__ModifierFieldValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1305:1: ( ( 'private' ) | ( 'public' ) | ( 'static' ) | ( 'final' ) | ( 'abstract' ) | ( 'protected' ) )
            int alt17=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt17=1;
                }
                break;
            case 14:
                {
                alt17=2;
                }
                break;
            case 15:
                {
                alt17=3;
                }
                break;
            case 16:
                {
                alt17=4;
                }
                break;
            case 17:
                {
                alt17=5;
                }
                break;
            case 18:
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1306:1: ( 'private' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1306:1: ( 'private' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1307:1: 'private'
                    {
                     before(grammarAccess.getModifierFieldValueAccess().getPrivateKeyword_0()); 
                    match(input,13,FOLLOW_13_in_rule__ModifierFieldValue__Alternatives2949); 
                     after(grammarAccess.getModifierFieldValueAccess().getPrivateKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1314:6: ( 'public' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1314:6: ( 'public' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1315:1: 'public'
                    {
                     before(grammarAccess.getModifierFieldValueAccess().getPublicKeyword_1()); 
                    match(input,14,FOLLOW_14_in_rule__ModifierFieldValue__Alternatives2969); 
                     after(grammarAccess.getModifierFieldValueAccess().getPublicKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1322:6: ( 'static' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1322:6: ( 'static' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1323:1: 'static'
                    {
                     before(grammarAccess.getModifierFieldValueAccess().getStaticKeyword_2()); 
                    match(input,15,FOLLOW_15_in_rule__ModifierFieldValue__Alternatives2989); 
                     after(grammarAccess.getModifierFieldValueAccess().getStaticKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1330:6: ( 'final' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1330:6: ( 'final' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1331:1: 'final'
                    {
                     before(grammarAccess.getModifierFieldValueAccess().getFinalKeyword_3()); 
                    match(input,16,FOLLOW_16_in_rule__ModifierFieldValue__Alternatives3009); 
                     after(grammarAccess.getModifierFieldValueAccess().getFinalKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1338:6: ( 'abstract' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1338:6: ( 'abstract' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1339:1: 'abstract'
                    {
                     before(grammarAccess.getModifierFieldValueAccess().getAbstractKeyword_4()); 
                    match(input,17,FOLLOW_17_in_rule__ModifierFieldValue__Alternatives3029); 
                     after(grammarAccess.getModifierFieldValueAccess().getAbstractKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1346:6: ( 'protected' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1346:6: ( 'protected' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1347:1: 'protected'
                    {
                     before(grammarAccess.getModifierFieldValueAccess().getProtectedKeyword_5()); 
                    match(input,18,FOLLOW_18_in_rule__ModifierFieldValue__Alternatives3049); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1359:1: rule__DocumentTypeFieldValue__Alternatives : ( ( 'class' ) | ( 'method' ) | ( 'field' ) | ( 'trycatch' ) );
    public final void rule__DocumentTypeFieldValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1363:1: ( ( 'class' ) | ( 'method' ) | ( 'field' ) | ( 'trycatch' ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt18=1;
                }
                break;
            case 20:
                {
                alt18=2;
                }
                break;
            case 21:
                {
                alt18=3;
                }
                break;
            case 22:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1364:1: ( 'class' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1364:1: ( 'class' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1365:1: 'class'
                    {
                     before(grammarAccess.getDocumentTypeFieldValueAccess().getClassKeyword_0()); 
                    match(input,19,FOLLOW_19_in_rule__DocumentTypeFieldValue__Alternatives3084); 
                     after(grammarAccess.getDocumentTypeFieldValueAccess().getClassKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1372:6: ( 'method' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1372:6: ( 'method' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1373:1: 'method'
                    {
                     before(grammarAccess.getDocumentTypeFieldValueAccess().getMethodKeyword_1()); 
                    match(input,20,FOLLOW_20_in_rule__DocumentTypeFieldValue__Alternatives3104); 
                     after(grammarAccess.getDocumentTypeFieldValueAccess().getMethodKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1380:6: ( 'field' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1380:6: ( 'field' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1381:1: 'field'
                    {
                     before(grammarAccess.getDocumentTypeFieldValueAccess().getFieldKeyword_2()); 
                    match(input,21,FOLLOW_21_in_rule__DocumentTypeFieldValue__Alternatives3124); 
                     after(grammarAccess.getDocumentTypeFieldValueAccess().getFieldKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1388:6: ( 'trycatch' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1388:6: ( 'trycatch' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1389:1: 'trycatch'
                    {
                     before(grammarAccess.getDocumentTypeFieldValueAccess().getTrycatchKeyword_3()); 
                    match(input,22,FOLLOW_22_in_rule__DocumentTypeFieldValue__Alternatives3144); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1401:1: rule__UnaryExpression__Alternatives : ( ( '-' ) | ( 'NOT' ) | ( '!' ) | ( '+' ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1405:1: ( ( '-' ) | ( 'NOT' ) | ( '!' ) | ( '+' ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt19=1;
                }
                break;
            case 24:
                {
                alt19=2;
                }
                break;
            case 25:
                {
                alt19=3;
                }
                break;
            case 26:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1406:1: ( '-' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1406:1: ( '-' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1407:1: '-'
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getHyphenMinusKeyword_0()); 
                    match(input,23,FOLLOW_23_in_rule__UnaryExpression__Alternatives3179); 
                     after(grammarAccess.getUnaryExpressionAccess().getHyphenMinusKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1414:6: ( 'NOT' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1414:6: ( 'NOT' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1415:1: 'NOT'
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getNOTKeyword_1()); 
                    match(input,24,FOLLOW_24_in_rule__UnaryExpression__Alternatives3199); 
                     after(grammarAccess.getUnaryExpressionAccess().getNOTKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1422:6: ( '!' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1422:6: ( '!' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1423:1: '!'
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getExclamationMarkKeyword_2()); 
                    match(input,25,FOLLOW_25_in_rule__UnaryExpression__Alternatives3219); 
                     after(grammarAccess.getUnaryExpressionAccess().getExclamationMarkKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1430:6: ( '+' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1430:6: ( '+' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1431:1: '+'
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getPlusSignKeyword_3()); 
                    match(input,26,FOLLOW_26_in_rule__UnaryExpression__Alternatives3239); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1443:1: rule__BinaryExp__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) | ( ( '||' ) ) );
    public final void rule__BinaryExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1447:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) | ( ( '||' ) ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt20=1;
                }
                break;
            case 28:
                {
                alt20=2;
                }
                break;
            case 29:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1448:1: ( ( 'AND' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1448:1: ( ( 'AND' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1449:1: ( 'AND' )
                    {
                     before(grammarAccess.getBinaryExpAccess().getAnd1EnumLiteralDeclaration_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1450:1: ( 'AND' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1450:3: 'AND'
                    {
                    match(input,27,FOLLOW_27_in_rule__BinaryExp__Alternatives3274); 

                    }

                     after(grammarAccess.getBinaryExpAccess().getAnd1EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1455:6: ( ( 'OR' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1455:6: ( ( 'OR' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1456:1: ( 'OR' )
                    {
                     before(grammarAccess.getBinaryExpAccess().getOr1EnumLiteralDeclaration_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1457:1: ( 'OR' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1457:3: 'OR'
                    {
                    match(input,28,FOLLOW_28_in_rule__BinaryExp__Alternatives3295); 

                    }

                     after(grammarAccess.getBinaryExpAccess().getOr1EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1462:6: ( ( '||' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1462:6: ( ( '||' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1463:1: ( '||' )
                    {
                     before(grammarAccess.getBinaryExpAccess().getOr2EnumLiteralDeclaration_2()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1464:1: ( '||' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1464:3: '||'
                    {
                    match(input,29,FOLLOW_29_in_rule__BinaryExp__Alternatives3316); 

                    }

                     after(grammarAccess.getBinaryExpAccess().getOr2EnumLiteralDeclaration_2()); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1476:1: rule__Exp1__Group__0 : rule__Exp1__Group__0__Impl rule__Exp1__Group__1 ;
    public final void rule__Exp1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1480:1: ( rule__Exp1__Group__0__Impl rule__Exp1__Group__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1481:2: rule__Exp1__Group__0__Impl rule__Exp1__Group__1
            {
            pushFollow(FOLLOW_rule__Exp1__Group__0__Impl_in_rule__Exp1__Group__03349);
            rule__Exp1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp1__Group__1_in_rule__Exp1__Group__03352);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1488:1: rule__Exp1__Group__0__Impl : ( ruleExp2 ) ;
    public final void rule__Exp1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1492:1: ( ( ruleExp2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1493:1: ( ruleExp2 )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1493:1: ( ruleExp2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1494:1: ruleExp2
            {
             before(grammarAccess.getExp1Access().getExp2ParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleExp2_in_rule__Exp1__Group__0__Impl3379);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1505:1: rule__Exp1__Group__1 : rule__Exp1__Group__1__Impl ;
    public final void rule__Exp1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1509:1: ( rule__Exp1__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1510:2: rule__Exp1__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Exp1__Group__1__Impl_in_rule__Exp1__Group__13408);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1516:1: rule__Exp1__Group__1__Impl : ( ( rule__Exp1__Group_1__0 )? ) ;
    public final void rule__Exp1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1520:1: ( ( ( rule__Exp1__Group_1__0 )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1521:1: ( ( rule__Exp1__Group_1__0 )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1521:1: ( ( rule__Exp1__Group_1__0 )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1522:1: ( rule__Exp1__Group_1__0 )?
            {
             before(grammarAccess.getExp1Access().getGroup_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1523:1: ( rule__Exp1__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_NAMEWITHWC||(LA21_0>=23 && LA21_0<=30)||(LA21_0>=33 && LA21_0<=70)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1523:2: rule__Exp1__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Exp1__Group_1__0_in_rule__Exp1__Group__1__Impl3435);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1537:1: rule__Exp1__Group_1__0 : rule__Exp1__Group_1__0__Impl rule__Exp1__Group_1__1 ;
    public final void rule__Exp1__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1541:1: ( rule__Exp1__Group_1__0__Impl rule__Exp1__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1542:2: rule__Exp1__Group_1__0__Impl rule__Exp1__Group_1__1
            {
            pushFollow(FOLLOW_rule__Exp1__Group_1__0__Impl_in_rule__Exp1__Group_1__03470);
            rule__Exp1__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp1__Group_1__1_in_rule__Exp1__Group_1__03473);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1549:1: rule__Exp1__Group_1__0__Impl : ( () ) ;
    public final void rule__Exp1__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1553:1: ( ( () ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1554:1: ( () )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1554:1: ( () )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1555:1: ()
            {
             before(grammarAccess.getExp1Access().getExp1LeftAction_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1556:1: ()
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1558:1: 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1568:1: rule__Exp1__Group_1__1 : rule__Exp1__Group_1__1__Impl rule__Exp1__Group_1__2 ;
    public final void rule__Exp1__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1572:1: ( rule__Exp1__Group_1__1__Impl rule__Exp1__Group_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1573:2: rule__Exp1__Group_1__1__Impl rule__Exp1__Group_1__2
            {
            pushFollow(FOLLOW_rule__Exp1__Group_1__1__Impl_in_rule__Exp1__Group_1__13531);
            rule__Exp1__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp1__Group_1__2_in_rule__Exp1__Group_1__13534);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1580:1: rule__Exp1__Group_1__1__Impl : ( ( rule__Exp1__BAssignment_1_1 )? ) ;
    public final void rule__Exp1__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1584:1: ( ( ( rule__Exp1__BAssignment_1_1 )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1585:1: ( ( rule__Exp1__BAssignment_1_1 )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1585:1: ( ( rule__Exp1__BAssignment_1_1 )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1586:1: ( rule__Exp1__BAssignment_1_1 )?
            {
             before(grammarAccess.getExp1Access().getBAssignment_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1587:1: ( rule__Exp1__BAssignment_1_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=27 && LA22_0<=29)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1587:2: rule__Exp1__BAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Exp1__BAssignment_1_1_in_rule__Exp1__Group_1__1__Impl3561);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1597:1: rule__Exp1__Group_1__2 : rule__Exp1__Group_1__2__Impl ;
    public final void rule__Exp1__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1601:1: ( rule__Exp1__Group_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1602:2: rule__Exp1__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Exp1__Group_1__2__Impl_in_rule__Exp1__Group_1__23592);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1608:1: rule__Exp1__Group_1__2__Impl : ( ( rule__Exp1__RightAssignment_1_2 ) ) ;
    public final void rule__Exp1__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1612:1: ( ( ( rule__Exp1__RightAssignment_1_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1613:1: ( ( rule__Exp1__RightAssignment_1_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1613:1: ( ( rule__Exp1__RightAssignment_1_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1614:1: ( rule__Exp1__RightAssignment_1_2 )
            {
             before(grammarAccess.getExp1Access().getRightAssignment_1_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1615:1: ( rule__Exp1__RightAssignment_1_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1615:2: rule__Exp1__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Exp1__RightAssignment_1_2_in_rule__Exp1__Group_1__2__Impl3619);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1631:1: rule__Exp2__Group_1__0 : rule__Exp2__Group_1__0__Impl rule__Exp2__Group_1__1 ;
    public final void rule__Exp2__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1635:1: ( rule__Exp2__Group_1__0__Impl rule__Exp2__Group_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1636:2: rule__Exp2__Group_1__0__Impl rule__Exp2__Group_1__1
            {
            pushFollow(FOLLOW_rule__Exp2__Group_1__0__Impl_in_rule__Exp2__Group_1__03655);
            rule__Exp2__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp2__Group_1__1_in_rule__Exp2__Group_1__03658);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1643:1: rule__Exp2__Group_1__0__Impl : ( ( ruleUnaryExpression )? ) ;
    public final void rule__Exp2__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1647:1: ( ( ( ruleUnaryExpression )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1648:1: ( ( ruleUnaryExpression )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1648:1: ( ( ruleUnaryExpression )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1649:1: ( ruleUnaryExpression )?
            {
             before(grammarAccess.getExp2Access().getUnaryExpressionParserRuleCall_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1650:1: ( ruleUnaryExpression )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=23 && LA23_0<=26)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1650:3: ruleUnaryExpression
                    {
                    pushFollow(FOLLOW_ruleUnaryExpression_in_rule__Exp2__Group_1__0__Impl3686);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1660:1: rule__Exp2__Group_1__1 : rule__Exp2__Group_1__1__Impl rule__Exp2__Group_1__2 ;
    public final void rule__Exp2__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1664:1: ( rule__Exp2__Group_1__1__Impl rule__Exp2__Group_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1665:2: rule__Exp2__Group_1__1__Impl rule__Exp2__Group_1__2
            {
            pushFollow(FOLLOW_rule__Exp2__Group_1__1__Impl_in_rule__Exp2__Group_1__13717);
            rule__Exp2__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp2__Group_1__2_in_rule__Exp2__Group_1__13720);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1672:1: rule__Exp2__Group_1__1__Impl : ( '(' ) ;
    public final void rule__Exp2__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1676:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1677:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1677:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1678:1: '('
            {
             before(grammarAccess.getExp2Access().getLeftParenthesisKeyword_1_1()); 
            match(input,30,FOLLOW_30_in_rule__Exp2__Group_1__1__Impl3748); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1691:1: rule__Exp2__Group_1__2 : rule__Exp2__Group_1__2__Impl rule__Exp2__Group_1__3 ;
    public final void rule__Exp2__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1695:1: ( rule__Exp2__Group_1__2__Impl rule__Exp2__Group_1__3 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1696:2: rule__Exp2__Group_1__2__Impl rule__Exp2__Group_1__3
            {
            pushFollow(FOLLOW_rule__Exp2__Group_1__2__Impl_in_rule__Exp2__Group_1__23779);
            rule__Exp2__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exp2__Group_1__3_in_rule__Exp2__Group_1__23782);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1703:1: rule__Exp2__Group_1__2__Impl : ( ruleExp1 ) ;
    public final void rule__Exp2__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1707:1: ( ( ruleExp1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1708:1: ( ruleExp1 )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1708:1: ( ruleExp1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1709:1: ruleExp1
            {
             before(grammarAccess.getExp2Access().getExp1ParserRuleCall_1_2()); 
            pushFollow(FOLLOW_ruleExp1_in_rule__Exp2__Group_1__2__Impl3809);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1720:1: rule__Exp2__Group_1__3 : rule__Exp2__Group_1__3__Impl ;
    public final void rule__Exp2__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1724:1: ( rule__Exp2__Group_1__3__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1725:2: rule__Exp2__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Exp2__Group_1__3__Impl_in_rule__Exp2__Group_1__33838);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1731:1: rule__Exp2__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Exp2__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1735:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1736:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1736:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1737:1: ')'
            {
             before(grammarAccess.getExp2Access().getRightParenthesisKeyword_1_3()); 
            match(input,31,FOLLOW_31_in_rule__Exp2__Group_1__3__Impl3866); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1758:1: rule__ClauseExpression__Group__0 : rule__ClauseExpression__Group__0__Impl rule__ClauseExpression__Group__1 ;
    public final void rule__ClauseExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1762:1: ( rule__ClauseExpression__Group__0__Impl rule__ClauseExpression__Group__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1763:2: rule__ClauseExpression__Group__0__Impl rule__ClauseExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group__0__Impl_in_rule__ClauseExpression__Group__03905);
            rule__ClauseExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group__1_in_rule__ClauseExpression__Group__03908);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1770:1: rule__ClauseExpression__Group__0__Impl : ( ( ruleUnaryExpression )? ) ;
    public final void rule__ClauseExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1774:1: ( ( ( ruleUnaryExpression )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1775:1: ( ( ruleUnaryExpression )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1775:1: ( ( ruleUnaryExpression )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1776:1: ( ruleUnaryExpression )?
            {
             before(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1777:1: ( ruleUnaryExpression )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=23 && LA24_0<=26)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1777:3: ruleUnaryExpression
                    {
                    pushFollow(FOLLOW_ruleUnaryExpression_in_rule__ClauseExpression__Group__0__Impl3936);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1787:1: rule__ClauseExpression__Group__1 : rule__ClauseExpression__Group__1__Impl ;
    public final void rule__ClauseExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1791:1: ( rule__ClauseExpression__Group__1__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1792:2: rule__ClauseExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group__1__Impl_in_rule__ClauseExpression__Group__13967);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1798:1: rule__ClauseExpression__Group__1__Impl : ( ( rule__ClauseExpression__Alternatives_1 ) ) ;
    public final void rule__ClauseExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1802:1: ( ( ( rule__ClauseExpression__Alternatives_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1803:1: ( ( rule__ClauseExpression__Alternatives_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1803:1: ( ( rule__ClauseExpression__Alternatives_1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1804:1: ( rule__ClauseExpression__Alternatives_1 )
            {
             before(grammarAccess.getClauseExpressionAccess().getAlternatives_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1805:1: ( rule__ClauseExpression__Alternatives_1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1805:2: rule__ClauseExpression__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Alternatives_1_in_rule__ClauseExpression__Group__1__Impl3994);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1819:1: rule__ClauseExpression__Group_1_1_0__0 : rule__ClauseExpression__Group_1_1_0__0__Impl rule__ClauseExpression__Group_1_1_0__1 ;
    public final void rule__ClauseExpression__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1823:1: ( rule__ClauseExpression__Group_1_1_0__0__Impl rule__ClauseExpression__Group_1_1_0__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1824:2: rule__ClauseExpression__Group_1_1_0__0__Impl rule__ClauseExpression__Group_1_1_0__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_0__0__Impl_in_rule__ClauseExpression__Group_1_1_0__04028);
            rule__ClauseExpression__Group_1_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_0__1_in_rule__ClauseExpression__Group_1_1_0__04031);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1831:1: rule__ClauseExpression__Group_1_1_0__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_1_0_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1835:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_1_0_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1836:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_0_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1836:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_0_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1837:1: ( rule__ClauseExpression__FieldAssignment_1_1_0_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_0_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1838:1: ( rule__ClauseExpression__FieldAssignment_1_1_0_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1838:2: rule__ClauseExpression__FieldAssignment_1_1_0_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_0_0_in_rule__ClauseExpression__Group_1_1_0__0__Impl4058);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1848:1: rule__ClauseExpression__Group_1_1_0__1 : rule__ClauseExpression__Group_1_1_0__1__Impl rule__ClauseExpression__Group_1_1_0__2 ;
    public final void rule__ClauseExpression__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1852:1: ( rule__ClauseExpression__Group_1_1_0__1__Impl rule__ClauseExpression__Group_1_1_0__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1853:2: rule__ClauseExpression__Group_1_1_0__1__Impl rule__ClauseExpression__Group_1_1_0__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_0__1__Impl_in_rule__ClauseExpression__Group_1_1_0__14088);
            rule__ClauseExpression__Group_1_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_0__2_in_rule__ClauseExpression__Group_1_1_0__14091);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1860:1: rule__ClauseExpression__Group_1_1_0__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1864:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1865:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1865:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1866:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_0_1()); 
            match(input,32,FOLLOW_32_in_rule__ClauseExpression__Group_1_1_0__1__Impl4119); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1879:1: rule__ClauseExpression__Group_1_1_0__2 : rule__ClauseExpression__Group_1_1_0__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1883:1: ( rule__ClauseExpression__Group_1_1_0__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1884:2: rule__ClauseExpression__Group_1_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_0__2__Impl_in_rule__ClauseExpression__Group_1_1_0__24150);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1890:1: rule__ClauseExpression__Group_1_1_0__2__Impl : ( ( rule__ClauseExpression__Alternatives_1_1_0_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1894:1: ( ( ( rule__ClauseExpression__Alternatives_1_1_0_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1895:1: ( ( rule__ClauseExpression__Alternatives_1_1_0_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1895:1: ( ( rule__ClauseExpression__Alternatives_1_1_0_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1896:1: ( rule__ClauseExpression__Alternatives_1_1_0_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_0_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1897:1: ( rule__ClauseExpression__Alternatives_1_1_0_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1897:2: rule__ClauseExpression__Alternatives_1_1_0_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Alternatives_1_1_0_2_in_rule__ClauseExpression__Group_1_1_0__2__Impl4177);
            rule__ClauseExpression__Alternatives_1_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_0_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ClauseExpression__Group_1_1_0_2_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1913:1: rule__ClauseExpression__Group_1_1_0_2_1__0 : rule__ClauseExpression__Group_1_1_0_2_1__0__Impl rule__ClauseExpression__Group_1_1_0_2_1__1 ;
    public final void rule__ClauseExpression__Group_1_1_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1917:1: ( rule__ClauseExpression__Group_1_1_0_2_1__0__Impl rule__ClauseExpression__Group_1_1_0_2_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1918:2: rule__ClauseExpression__Group_1_1_0_2_1__0__Impl rule__ClauseExpression__Group_1_1_0_2_1__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_0_2_1__0__Impl_in_rule__ClauseExpression__Group_1_1_0_2_1__04213);
            rule__ClauseExpression__Group_1_1_0_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_0_2_1__1_in_rule__ClauseExpression__Group_1_1_0_2_1__04216);
            rule__ClauseExpression__Group_1_1_0_2_1__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_0_2_1__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_0_2_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1925:1: rule__ClauseExpression__Group_1_1_0_2_1__0__Impl : ( '(' ) ;
    public final void rule__ClauseExpression__Group_1_1_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1929:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1930:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1930:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1931:1: '('
            {
             before(grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_0_2_1_0()); 
            match(input,30,FOLLOW_30_in_rule__ClauseExpression__Group_1_1_0_2_1__0__Impl4244); 
             after(grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_0_2_1__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_0_2_1__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1944:1: rule__ClauseExpression__Group_1_1_0_2_1__1 : rule__ClauseExpression__Group_1_1_0_2_1__1__Impl rule__ClauseExpression__Group_1_1_0_2_1__2 ;
    public final void rule__ClauseExpression__Group_1_1_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1948:1: ( rule__ClauseExpression__Group_1_1_0_2_1__1__Impl rule__ClauseExpression__Group_1_1_0_2_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1949:2: rule__ClauseExpression__Group_1_1_0_2_1__1__Impl rule__ClauseExpression__Group_1_1_0_2_1__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_0_2_1__1__Impl_in_rule__ClauseExpression__Group_1_1_0_2_1__14275);
            rule__ClauseExpression__Group_1_1_0_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_0_2_1__2_in_rule__ClauseExpression__Group_1_1_0_2_1__14278);
            rule__ClauseExpression__Group_1_1_0_2_1__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_0_2_1__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_0_2_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1956:1: rule__ClauseExpression__Group_1_1_0_2_1__1__Impl : ( ( rule__ClauseExpression__Group_1_1_0_2_1_1__0 )* ) ;
    public final void rule__ClauseExpression__Group_1_1_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1960:1: ( ( ( rule__ClauseExpression__Group_1_1_0_2_1_1__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1961:1: ( ( rule__ClauseExpression__Group_1_1_0_2_1_1__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1961:1: ( ( rule__ClauseExpression__Group_1_1_0_2_1_1__0 )* )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1962:1: ( rule__ClauseExpression__Group_1_1_0_2_1_1__0 )*
            {
             before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_0_2_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1963:1: ( rule__ClauseExpression__Group_1_1_0_2_1_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_NAMEWITHWC||(LA25_0>=23 && LA25_0<=26)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1963:2: rule__ClauseExpression__Group_1_1_0_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_0_2_1_1__0_in_rule__ClauseExpression__Group_1_1_0_2_1__1__Impl4305);
            	    rule__ClauseExpression__Group_1_1_0_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_0_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_0_2_1__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_0_2_1__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1973:1: rule__ClauseExpression__Group_1_1_0_2_1__2 : rule__ClauseExpression__Group_1_1_0_2_1__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_0_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1977:1: ( rule__ClauseExpression__Group_1_1_0_2_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1978:2: rule__ClauseExpression__Group_1_1_0_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_0_2_1__2__Impl_in_rule__ClauseExpression__Group_1_1_0_2_1__24336);
            rule__ClauseExpression__Group_1_1_0_2_1__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_0_2_1__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_0_2_1__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1984:1: rule__ClauseExpression__Group_1_1_0_2_1__2__Impl : ( ')' ) ;
    public final void rule__ClauseExpression__Group_1_1_0_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1988:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1989:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1989:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1990:1: ')'
            {
             before(grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_0_2_1_2()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_1_0_2_1__2__Impl4364); 
             after(grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_0_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_0_2_1__2__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_0_2_1_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2009:1: rule__ClauseExpression__Group_1_1_0_2_1_1__0 : rule__ClauseExpression__Group_1_1_0_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_0_2_1_1__1 ;
    public final void rule__ClauseExpression__Group_1_1_0_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2013:1: ( rule__ClauseExpression__Group_1_1_0_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_0_2_1_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2014:2: rule__ClauseExpression__Group_1_1_0_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_0_2_1_1__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_0_2_1_1__0__Impl_in_rule__ClauseExpression__Group_1_1_0_2_1_1__04401);
            rule__ClauseExpression__Group_1_1_0_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_0_2_1_1__1_in_rule__ClauseExpression__Group_1_1_0_2_1_1__04404);
            rule__ClauseExpression__Group_1_1_0_2_1_1__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_0_2_1_1__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_0_2_1_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2021:1: rule__ClauseExpression__Group_1_1_0_2_1_1__0__Impl : ( ( ruleUnaryExpression )? ) ;
    public final void rule__ClauseExpression__Group_1_1_0_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2025:1: ( ( ( ruleUnaryExpression )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2026:1: ( ( ruleUnaryExpression )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2026:1: ( ( ruleUnaryExpression )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2027:1: ( ruleUnaryExpression )?
            {
             before(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_0_2_1_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2028:1: ( ruleUnaryExpression )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=23 && LA26_0<=26)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2028:3: ruleUnaryExpression
                    {
                    pushFollow(FOLLOW_ruleUnaryExpression_in_rule__ClauseExpression__Group_1_1_0_2_1_1__0__Impl4432);
                    ruleUnaryExpression();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_0_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_0_2_1_1__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_0_2_1_1__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2038:1: rule__ClauseExpression__Group_1_1_0_2_1_1__1 : rule__ClauseExpression__Group_1_1_0_2_1_1__1__Impl ;
    public final void rule__ClauseExpression__Group_1_1_0_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2042:1: ( rule__ClauseExpression__Group_1_1_0_2_1_1__1__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2043:2: rule__ClauseExpression__Group_1_1_0_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_0_2_1_1__1__Impl_in_rule__ClauseExpression__Group_1_1_0_2_1_1__14463);
            rule__ClauseExpression__Group_1_1_0_2_1_1__1__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_0_2_1_1__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_0_2_1_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2049:1: rule__ClauseExpression__Group_1_1_0_2_1_1__1__Impl : ( ( rule__ClauseExpression__ValuesAssignment_1_1_0_2_1_1_1 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_0_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2053:1: ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_0_2_1_1_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2054:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_0_2_1_1_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2054:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_0_2_1_1_1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2055:1: ( rule__ClauseExpression__ValuesAssignment_1_1_0_2_1_1_1 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_0_2_1_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2056:1: ( rule__ClauseExpression__ValuesAssignment_1_1_0_2_1_1_1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2056:2: rule__ClauseExpression__ValuesAssignment_1_1_0_2_1_1_1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_0_2_1_1_1_in_rule__ClauseExpression__Group_1_1_0_2_1_1__1__Impl4490);
            rule__ClauseExpression__ValuesAssignment_1_1_0_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_0_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_0_2_1_1__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2070:1: rule__ClauseExpression__Group_1_1_1__0 : rule__ClauseExpression__Group_1_1_1__0__Impl rule__ClauseExpression__Group_1_1_1__1 ;
    public final void rule__ClauseExpression__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2074:1: ( rule__ClauseExpression__Group_1_1_1__0__Impl rule__ClauseExpression__Group_1_1_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2075:2: rule__ClauseExpression__Group_1_1_1__0__Impl rule__ClauseExpression__Group_1_1_1__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_1__0__Impl_in_rule__ClauseExpression__Group_1_1_1__04524);
            rule__ClauseExpression__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_1__1_in_rule__ClauseExpression__Group_1_1_1__04527);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2082:1: rule__ClauseExpression__Group_1_1_1__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_1_1_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2086:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_1_1_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2087:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_1_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2087:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_1_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2088:1: ( rule__ClauseExpression__FieldAssignment_1_1_1_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2089:1: ( rule__ClauseExpression__FieldAssignment_1_1_1_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2089:2: rule__ClauseExpression__FieldAssignment_1_1_1_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_1_0_in_rule__ClauseExpression__Group_1_1_1__0__Impl4554);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2099:1: rule__ClauseExpression__Group_1_1_1__1 : rule__ClauseExpression__Group_1_1_1__1__Impl rule__ClauseExpression__Group_1_1_1__2 ;
    public final void rule__ClauseExpression__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2103:1: ( rule__ClauseExpression__Group_1_1_1__1__Impl rule__ClauseExpression__Group_1_1_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2104:2: rule__ClauseExpression__Group_1_1_1__1__Impl rule__ClauseExpression__Group_1_1_1__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_1__1__Impl_in_rule__ClauseExpression__Group_1_1_1__14584);
            rule__ClauseExpression__Group_1_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_1__2_in_rule__ClauseExpression__Group_1_1_1__14587);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2111:1: rule__ClauseExpression__Group_1_1_1__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2115:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2116:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2116:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2117:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_1_1()); 
            match(input,32,FOLLOW_32_in_rule__ClauseExpression__Group_1_1_1__1__Impl4615); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2130:1: rule__ClauseExpression__Group_1_1_1__2 : rule__ClauseExpression__Group_1_1_1__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2134:1: ( rule__ClauseExpression__Group_1_1_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2135:2: rule__ClauseExpression__Group_1_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_1__2__Impl_in_rule__ClauseExpression__Group_1_1_1__24646);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2141:1: rule__ClauseExpression__Group_1_1_1__2__Impl : ( ( rule__ClauseExpression__Alternatives_1_1_1_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2145:1: ( ( ( rule__ClauseExpression__Alternatives_1_1_1_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2146:1: ( ( rule__ClauseExpression__Alternatives_1_1_1_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2146:1: ( ( rule__ClauseExpression__Alternatives_1_1_1_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2147:1: ( rule__ClauseExpression__Alternatives_1_1_1_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_1_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2148:1: ( rule__ClauseExpression__Alternatives_1_1_1_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2148:2: rule__ClauseExpression__Alternatives_1_1_1_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Alternatives_1_1_1_2_in_rule__ClauseExpression__Group_1_1_1__2__Impl4673);
            rule__ClauseExpression__Alternatives_1_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_1_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ClauseExpression__Group_1_1_1_2_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2164:1: rule__ClauseExpression__Group_1_1_1_2_1__0 : rule__ClauseExpression__Group_1_1_1_2_1__0__Impl rule__ClauseExpression__Group_1_1_1_2_1__1 ;
    public final void rule__ClauseExpression__Group_1_1_1_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2168:1: ( rule__ClauseExpression__Group_1_1_1_2_1__0__Impl rule__ClauseExpression__Group_1_1_1_2_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2169:2: rule__ClauseExpression__Group_1_1_1_2_1__0__Impl rule__ClauseExpression__Group_1_1_1_2_1__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_1_2_1__0__Impl_in_rule__ClauseExpression__Group_1_1_1_2_1__04709);
            rule__ClauseExpression__Group_1_1_1_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_1_2_1__1_in_rule__ClauseExpression__Group_1_1_1_2_1__04712);
            rule__ClauseExpression__Group_1_1_1_2_1__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_1_2_1__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_1_2_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2176:1: rule__ClauseExpression__Group_1_1_1_2_1__0__Impl : ( '(' ) ;
    public final void rule__ClauseExpression__Group_1_1_1_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2180:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2181:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2181:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2182:1: '('
            {
             before(grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_1_2_1_0()); 
            match(input,30,FOLLOW_30_in_rule__ClauseExpression__Group_1_1_1_2_1__0__Impl4740); 
             after(grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_1_2_1__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_1_2_1__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2195:1: rule__ClauseExpression__Group_1_1_1_2_1__1 : rule__ClauseExpression__Group_1_1_1_2_1__1__Impl rule__ClauseExpression__Group_1_1_1_2_1__2 ;
    public final void rule__ClauseExpression__Group_1_1_1_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2199:1: ( rule__ClauseExpression__Group_1_1_1_2_1__1__Impl rule__ClauseExpression__Group_1_1_1_2_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2200:2: rule__ClauseExpression__Group_1_1_1_2_1__1__Impl rule__ClauseExpression__Group_1_1_1_2_1__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_1_2_1__1__Impl_in_rule__ClauseExpression__Group_1_1_1_2_1__14771);
            rule__ClauseExpression__Group_1_1_1_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_1_2_1__2_in_rule__ClauseExpression__Group_1_1_1_2_1__14774);
            rule__ClauseExpression__Group_1_1_1_2_1__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_1_2_1__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_1_2_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2207:1: rule__ClauseExpression__Group_1_1_1_2_1__1__Impl : ( ( rule__ClauseExpression__Group_1_1_1_2_1_1__0 )* ) ;
    public final void rule__ClauseExpression__Group_1_1_1_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2211:1: ( ( ( rule__ClauseExpression__Group_1_1_1_2_1_1__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2212:1: ( ( rule__ClauseExpression__Group_1_1_1_2_1_1__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2212:1: ( ( rule__ClauseExpression__Group_1_1_1_2_1_1__0 )* )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2213:1: ( rule__ClauseExpression__Group_1_1_1_2_1_1__0 )*
            {
             before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_1_2_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2214:1: ( rule__ClauseExpression__Group_1_1_1_2_1_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_NAMEWITHWC||(LA27_0>=23 && LA27_0<=26)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2214:2: rule__ClauseExpression__Group_1_1_1_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_1_2_1_1__0_in_rule__ClauseExpression__Group_1_1_1_2_1__1__Impl4801);
            	    rule__ClauseExpression__Group_1_1_1_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_1_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_1_2_1__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_1_2_1__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2224:1: rule__ClauseExpression__Group_1_1_1_2_1__2 : rule__ClauseExpression__Group_1_1_1_2_1__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_1_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2228:1: ( rule__ClauseExpression__Group_1_1_1_2_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2229:2: rule__ClauseExpression__Group_1_1_1_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_1_2_1__2__Impl_in_rule__ClauseExpression__Group_1_1_1_2_1__24832);
            rule__ClauseExpression__Group_1_1_1_2_1__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_1_2_1__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_1_2_1__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2235:1: rule__ClauseExpression__Group_1_1_1_2_1__2__Impl : ( ')' ) ;
    public final void rule__ClauseExpression__Group_1_1_1_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2239:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2240:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2240:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2241:1: ')'
            {
             before(grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_1_2_1_2()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_1_1_2_1__2__Impl4860); 
             after(grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_1_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_1_2_1__2__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_1_2_1_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2260:1: rule__ClauseExpression__Group_1_1_1_2_1_1__0 : rule__ClauseExpression__Group_1_1_1_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_1_2_1_1__1 ;
    public final void rule__ClauseExpression__Group_1_1_1_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2264:1: ( rule__ClauseExpression__Group_1_1_1_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_1_2_1_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2265:2: rule__ClauseExpression__Group_1_1_1_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_1_2_1_1__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_1_2_1_1__0__Impl_in_rule__ClauseExpression__Group_1_1_1_2_1_1__04897);
            rule__ClauseExpression__Group_1_1_1_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_1_2_1_1__1_in_rule__ClauseExpression__Group_1_1_1_2_1_1__04900);
            rule__ClauseExpression__Group_1_1_1_2_1_1__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_1_2_1_1__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_1_2_1_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2272:1: rule__ClauseExpression__Group_1_1_1_2_1_1__0__Impl : ( ( ruleUnaryExpression )? ) ;
    public final void rule__ClauseExpression__Group_1_1_1_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2276:1: ( ( ( ruleUnaryExpression )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2277:1: ( ( ruleUnaryExpression )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2277:1: ( ( ruleUnaryExpression )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2278:1: ( ruleUnaryExpression )?
            {
             before(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_1_2_1_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2279:1: ( ruleUnaryExpression )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=23 && LA28_0<=26)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2279:3: ruleUnaryExpression
                    {
                    pushFollow(FOLLOW_ruleUnaryExpression_in_rule__ClauseExpression__Group_1_1_1_2_1_1__0__Impl4928);
                    ruleUnaryExpression();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_1_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_1_2_1_1__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_1_2_1_1__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2289:1: rule__ClauseExpression__Group_1_1_1_2_1_1__1 : rule__ClauseExpression__Group_1_1_1_2_1_1__1__Impl ;
    public final void rule__ClauseExpression__Group_1_1_1_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2293:1: ( rule__ClauseExpression__Group_1_1_1_2_1_1__1__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2294:2: rule__ClauseExpression__Group_1_1_1_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_1_2_1_1__1__Impl_in_rule__ClauseExpression__Group_1_1_1_2_1_1__14959);
            rule__ClauseExpression__Group_1_1_1_2_1_1__1__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_1_2_1_1__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_1_2_1_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2300:1: rule__ClauseExpression__Group_1_1_1_2_1_1__1__Impl : ( ( rule__ClauseExpression__ValuesAssignment_1_1_1_2_1_1_1 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_1_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2304:1: ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_1_2_1_1_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2305:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_1_2_1_1_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2305:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_1_2_1_1_1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2306:1: ( rule__ClauseExpression__ValuesAssignment_1_1_1_2_1_1_1 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_1_2_1_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2307:1: ( rule__ClauseExpression__ValuesAssignment_1_1_1_2_1_1_1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2307:2: rule__ClauseExpression__ValuesAssignment_1_1_1_2_1_1_1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_1_2_1_1_1_in_rule__ClauseExpression__Group_1_1_1_2_1_1__1__Impl4986);
            rule__ClauseExpression__ValuesAssignment_1_1_1_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_1_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_1_2_1_1__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_2__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2321:1: rule__ClauseExpression__Group_1_1_2__0 : rule__ClauseExpression__Group_1_1_2__0__Impl rule__ClauseExpression__Group_1_1_2__1 ;
    public final void rule__ClauseExpression__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2325:1: ( rule__ClauseExpression__Group_1_1_2__0__Impl rule__ClauseExpression__Group_1_1_2__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2326:2: rule__ClauseExpression__Group_1_1_2__0__Impl rule__ClauseExpression__Group_1_1_2__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_2__0__Impl_in_rule__ClauseExpression__Group_1_1_2__05020);
            rule__ClauseExpression__Group_1_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_2__1_in_rule__ClauseExpression__Group_1_1_2__05023);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2333:1: rule__ClauseExpression__Group_1_1_2__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_1_2_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2337:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_1_2_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2338:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_2_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2338:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_2_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2339:1: ( rule__ClauseExpression__FieldAssignment_1_1_2_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_2_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2340:1: ( rule__ClauseExpression__FieldAssignment_1_1_2_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2340:2: rule__ClauseExpression__FieldAssignment_1_1_2_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_2_0_in_rule__ClauseExpression__Group_1_1_2__0__Impl5050);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2350:1: rule__ClauseExpression__Group_1_1_2__1 : rule__ClauseExpression__Group_1_1_2__1__Impl rule__ClauseExpression__Group_1_1_2__2 ;
    public final void rule__ClauseExpression__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2354:1: ( rule__ClauseExpression__Group_1_1_2__1__Impl rule__ClauseExpression__Group_1_1_2__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2355:2: rule__ClauseExpression__Group_1_1_2__1__Impl rule__ClauseExpression__Group_1_1_2__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_2__1__Impl_in_rule__ClauseExpression__Group_1_1_2__15080);
            rule__ClauseExpression__Group_1_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_2__2_in_rule__ClauseExpression__Group_1_1_2__15083);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2362:1: rule__ClauseExpression__Group_1_1_2__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2366:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2367:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2367:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2368:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_2_1()); 
            match(input,32,FOLLOW_32_in_rule__ClauseExpression__Group_1_1_2__1__Impl5111); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2381:1: rule__ClauseExpression__Group_1_1_2__2 : rule__ClauseExpression__Group_1_1_2__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2385:1: ( rule__ClauseExpression__Group_1_1_2__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2386:2: rule__ClauseExpression__Group_1_1_2__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_2__2__Impl_in_rule__ClauseExpression__Group_1_1_2__25142);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2392:1: rule__ClauseExpression__Group_1_1_2__2__Impl : ( ( rule__ClauseExpression__Alternatives_1_1_2_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2396:1: ( ( ( rule__ClauseExpression__Alternatives_1_1_2_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2397:1: ( ( rule__ClauseExpression__Alternatives_1_1_2_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2397:1: ( ( rule__ClauseExpression__Alternatives_1_1_2_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2398:1: ( rule__ClauseExpression__Alternatives_1_1_2_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_2_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2399:1: ( rule__ClauseExpression__Alternatives_1_1_2_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2399:2: rule__ClauseExpression__Alternatives_1_1_2_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Alternatives_1_1_2_2_in_rule__ClauseExpression__Group_1_1_2__2__Impl5169);
            rule__ClauseExpression__Alternatives_1_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_2_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ClauseExpression__Group_1_1_2_2_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2415:1: rule__ClauseExpression__Group_1_1_2_2_1__0 : rule__ClauseExpression__Group_1_1_2_2_1__0__Impl rule__ClauseExpression__Group_1_1_2_2_1__1 ;
    public final void rule__ClauseExpression__Group_1_1_2_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2419:1: ( rule__ClauseExpression__Group_1_1_2_2_1__0__Impl rule__ClauseExpression__Group_1_1_2_2_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2420:2: rule__ClauseExpression__Group_1_1_2_2_1__0__Impl rule__ClauseExpression__Group_1_1_2_2_1__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_2_2_1__0__Impl_in_rule__ClauseExpression__Group_1_1_2_2_1__05205);
            rule__ClauseExpression__Group_1_1_2_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_2_2_1__1_in_rule__ClauseExpression__Group_1_1_2_2_1__05208);
            rule__ClauseExpression__Group_1_1_2_2_1__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_2_2_1__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_2_2_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2427:1: rule__ClauseExpression__Group_1_1_2_2_1__0__Impl : ( '(' ) ;
    public final void rule__ClauseExpression__Group_1_1_2_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2431:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2432:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2432:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2433:1: '('
            {
             before(grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_2_2_1_0()); 
            match(input,30,FOLLOW_30_in_rule__ClauseExpression__Group_1_1_2_2_1__0__Impl5236); 
             after(grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_2_2_1__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_2_2_1__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2446:1: rule__ClauseExpression__Group_1_1_2_2_1__1 : rule__ClauseExpression__Group_1_1_2_2_1__1__Impl rule__ClauseExpression__Group_1_1_2_2_1__2 ;
    public final void rule__ClauseExpression__Group_1_1_2_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2450:1: ( rule__ClauseExpression__Group_1_1_2_2_1__1__Impl rule__ClauseExpression__Group_1_1_2_2_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2451:2: rule__ClauseExpression__Group_1_1_2_2_1__1__Impl rule__ClauseExpression__Group_1_1_2_2_1__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_2_2_1__1__Impl_in_rule__ClauseExpression__Group_1_1_2_2_1__15267);
            rule__ClauseExpression__Group_1_1_2_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_2_2_1__2_in_rule__ClauseExpression__Group_1_1_2_2_1__15270);
            rule__ClauseExpression__Group_1_1_2_2_1__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_2_2_1__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_2_2_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2458:1: rule__ClauseExpression__Group_1_1_2_2_1__1__Impl : ( ( rule__ClauseExpression__Group_1_1_2_2_1_1__0 )* ) ;
    public final void rule__ClauseExpression__Group_1_1_2_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2462:1: ( ( ( rule__ClauseExpression__Group_1_1_2_2_1_1__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2463:1: ( ( rule__ClauseExpression__Group_1_1_2_2_1_1__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2463:1: ( ( rule__ClauseExpression__Group_1_1_2_2_1_1__0 )* )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2464:1: ( rule__ClauseExpression__Group_1_1_2_2_1_1__0 )*
            {
             before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_2_2_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2465:1: ( rule__ClauseExpression__Group_1_1_2_2_1_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_NAMEWITHWC||(LA29_0>=23 && LA29_0<=26)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2465:2: rule__ClauseExpression__Group_1_1_2_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_2_2_1_1__0_in_rule__ClauseExpression__Group_1_1_2_2_1__1__Impl5297);
            	    rule__ClauseExpression__Group_1_1_2_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_2_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_2_2_1__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_2_2_1__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2475:1: rule__ClauseExpression__Group_1_1_2_2_1__2 : rule__ClauseExpression__Group_1_1_2_2_1__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_2_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2479:1: ( rule__ClauseExpression__Group_1_1_2_2_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2480:2: rule__ClauseExpression__Group_1_1_2_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_2_2_1__2__Impl_in_rule__ClauseExpression__Group_1_1_2_2_1__25328);
            rule__ClauseExpression__Group_1_1_2_2_1__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_2_2_1__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_2_2_1__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2486:1: rule__ClauseExpression__Group_1_1_2_2_1__2__Impl : ( ')' ) ;
    public final void rule__ClauseExpression__Group_1_1_2_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2490:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2491:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2491:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2492:1: ')'
            {
             before(grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_2_2_1_2()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_1_2_2_1__2__Impl5356); 
             after(grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_2_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_2_2_1__2__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_2_2_1_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2511:1: rule__ClauseExpression__Group_1_1_2_2_1_1__0 : rule__ClauseExpression__Group_1_1_2_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_2_2_1_1__1 ;
    public final void rule__ClauseExpression__Group_1_1_2_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2515:1: ( rule__ClauseExpression__Group_1_1_2_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_2_2_1_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2516:2: rule__ClauseExpression__Group_1_1_2_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_2_2_1_1__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_2_2_1_1__0__Impl_in_rule__ClauseExpression__Group_1_1_2_2_1_1__05393);
            rule__ClauseExpression__Group_1_1_2_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_2_2_1_1__1_in_rule__ClauseExpression__Group_1_1_2_2_1_1__05396);
            rule__ClauseExpression__Group_1_1_2_2_1_1__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_2_2_1_1__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_2_2_1_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2523:1: rule__ClauseExpression__Group_1_1_2_2_1_1__0__Impl : ( ( ruleUnaryExpression )? ) ;
    public final void rule__ClauseExpression__Group_1_1_2_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2527:1: ( ( ( ruleUnaryExpression )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2528:1: ( ( ruleUnaryExpression )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2528:1: ( ( ruleUnaryExpression )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2529:1: ( ruleUnaryExpression )?
            {
             before(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_2_2_1_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2530:1: ( ruleUnaryExpression )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=23 && LA30_0<=26)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2530:3: ruleUnaryExpression
                    {
                    pushFollow(FOLLOW_ruleUnaryExpression_in_rule__ClauseExpression__Group_1_1_2_2_1_1__0__Impl5424);
                    ruleUnaryExpression();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_2_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_2_2_1_1__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_2_2_1_1__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2540:1: rule__ClauseExpression__Group_1_1_2_2_1_1__1 : rule__ClauseExpression__Group_1_1_2_2_1_1__1__Impl ;
    public final void rule__ClauseExpression__Group_1_1_2_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2544:1: ( rule__ClauseExpression__Group_1_1_2_2_1_1__1__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2545:2: rule__ClauseExpression__Group_1_1_2_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_2_2_1_1__1__Impl_in_rule__ClauseExpression__Group_1_1_2_2_1_1__15455);
            rule__ClauseExpression__Group_1_1_2_2_1_1__1__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_2_2_1_1__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_2_2_1_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2551:1: rule__ClauseExpression__Group_1_1_2_2_1_1__1__Impl : ( ( rule__ClauseExpression__ValuesAssignment_1_1_2_2_1_1_1 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_2_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2555:1: ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_2_2_1_1_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2556:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_2_2_1_1_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2556:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_2_2_1_1_1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2557:1: ( rule__ClauseExpression__ValuesAssignment_1_1_2_2_1_1_1 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_2_2_1_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2558:1: ( rule__ClauseExpression__ValuesAssignment_1_1_2_2_1_1_1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2558:2: rule__ClauseExpression__ValuesAssignment_1_1_2_2_1_1_1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_2_2_1_1_1_in_rule__ClauseExpression__Group_1_1_2_2_1_1__1__Impl5482);
            rule__ClauseExpression__ValuesAssignment_1_1_2_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_2_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_2_2_1_1__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_3__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2572:1: rule__ClauseExpression__Group_1_1_3__0 : rule__ClauseExpression__Group_1_1_3__0__Impl rule__ClauseExpression__Group_1_1_3__1 ;
    public final void rule__ClauseExpression__Group_1_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2576:1: ( rule__ClauseExpression__Group_1_1_3__0__Impl rule__ClauseExpression__Group_1_1_3__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2577:2: rule__ClauseExpression__Group_1_1_3__0__Impl rule__ClauseExpression__Group_1_1_3__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_3__0__Impl_in_rule__ClauseExpression__Group_1_1_3__05516);
            rule__ClauseExpression__Group_1_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_3__1_in_rule__ClauseExpression__Group_1_1_3__05519);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2584:1: rule__ClauseExpression__Group_1_1_3__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_1_3_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2588:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_1_3_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2589:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_3_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2589:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_3_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2590:1: ( rule__ClauseExpression__FieldAssignment_1_1_3_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_3_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2591:1: ( rule__ClauseExpression__FieldAssignment_1_1_3_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2591:2: rule__ClauseExpression__FieldAssignment_1_1_3_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_3_0_in_rule__ClauseExpression__Group_1_1_3__0__Impl5546);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2601:1: rule__ClauseExpression__Group_1_1_3__1 : rule__ClauseExpression__Group_1_1_3__1__Impl rule__ClauseExpression__Group_1_1_3__2 ;
    public final void rule__ClauseExpression__Group_1_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2605:1: ( rule__ClauseExpression__Group_1_1_3__1__Impl rule__ClauseExpression__Group_1_1_3__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2606:2: rule__ClauseExpression__Group_1_1_3__1__Impl rule__ClauseExpression__Group_1_1_3__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_3__1__Impl_in_rule__ClauseExpression__Group_1_1_3__15576);
            rule__ClauseExpression__Group_1_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_3__2_in_rule__ClauseExpression__Group_1_1_3__15579);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2613:1: rule__ClauseExpression__Group_1_1_3__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2617:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2618:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2618:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2619:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_3_1()); 
            match(input,32,FOLLOW_32_in_rule__ClauseExpression__Group_1_1_3__1__Impl5607); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2632:1: rule__ClauseExpression__Group_1_1_3__2 : rule__ClauseExpression__Group_1_1_3__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2636:1: ( rule__ClauseExpression__Group_1_1_3__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2637:2: rule__ClauseExpression__Group_1_1_3__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_3__2__Impl_in_rule__ClauseExpression__Group_1_1_3__25638);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2643:1: rule__ClauseExpression__Group_1_1_3__2__Impl : ( ( rule__ClauseExpression__Alternatives_1_1_3_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2647:1: ( ( ( rule__ClauseExpression__Alternatives_1_1_3_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2648:1: ( ( rule__ClauseExpression__Alternatives_1_1_3_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2648:1: ( ( rule__ClauseExpression__Alternatives_1_1_3_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2649:1: ( rule__ClauseExpression__Alternatives_1_1_3_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_3_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2650:1: ( rule__ClauseExpression__Alternatives_1_1_3_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2650:2: rule__ClauseExpression__Alternatives_1_1_3_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Alternatives_1_1_3_2_in_rule__ClauseExpression__Group_1_1_3__2__Impl5665);
            rule__ClauseExpression__Alternatives_1_1_3_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_3_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ClauseExpression__Group_1_1_3_2_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2666:1: rule__ClauseExpression__Group_1_1_3_2_1__0 : rule__ClauseExpression__Group_1_1_3_2_1__0__Impl rule__ClauseExpression__Group_1_1_3_2_1__1 ;
    public final void rule__ClauseExpression__Group_1_1_3_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2670:1: ( rule__ClauseExpression__Group_1_1_3_2_1__0__Impl rule__ClauseExpression__Group_1_1_3_2_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2671:2: rule__ClauseExpression__Group_1_1_3_2_1__0__Impl rule__ClauseExpression__Group_1_1_3_2_1__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_3_2_1__0__Impl_in_rule__ClauseExpression__Group_1_1_3_2_1__05701);
            rule__ClauseExpression__Group_1_1_3_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_3_2_1__1_in_rule__ClauseExpression__Group_1_1_3_2_1__05704);
            rule__ClauseExpression__Group_1_1_3_2_1__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_3_2_1__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_3_2_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2678:1: rule__ClauseExpression__Group_1_1_3_2_1__0__Impl : ( '(' ) ;
    public final void rule__ClauseExpression__Group_1_1_3_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2682:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2683:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2683:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2684:1: '('
            {
             before(grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_3_2_1_0()); 
            match(input,30,FOLLOW_30_in_rule__ClauseExpression__Group_1_1_3_2_1__0__Impl5732); 
             after(grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_3_2_1__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_3_2_1__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2697:1: rule__ClauseExpression__Group_1_1_3_2_1__1 : rule__ClauseExpression__Group_1_1_3_2_1__1__Impl rule__ClauseExpression__Group_1_1_3_2_1__2 ;
    public final void rule__ClauseExpression__Group_1_1_3_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2701:1: ( rule__ClauseExpression__Group_1_1_3_2_1__1__Impl rule__ClauseExpression__Group_1_1_3_2_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2702:2: rule__ClauseExpression__Group_1_1_3_2_1__1__Impl rule__ClauseExpression__Group_1_1_3_2_1__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_3_2_1__1__Impl_in_rule__ClauseExpression__Group_1_1_3_2_1__15763);
            rule__ClauseExpression__Group_1_1_3_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_3_2_1__2_in_rule__ClauseExpression__Group_1_1_3_2_1__15766);
            rule__ClauseExpression__Group_1_1_3_2_1__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_3_2_1__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_3_2_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2709:1: rule__ClauseExpression__Group_1_1_3_2_1__1__Impl : ( ( rule__ClauseExpression__Group_1_1_3_2_1_1__0 )* ) ;
    public final void rule__ClauseExpression__Group_1_1_3_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2713:1: ( ( ( rule__ClauseExpression__Group_1_1_3_2_1_1__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2714:1: ( ( rule__ClauseExpression__Group_1_1_3_2_1_1__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2714:1: ( ( rule__ClauseExpression__Group_1_1_3_2_1_1__0 )* )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2715:1: ( rule__ClauseExpression__Group_1_1_3_2_1_1__0 )*
            {
             before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_3_2_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2716:1: ( rule__ClauseExpression__Group_1_1_3_2_1_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_PATHWITHWC||(LA31_0>=23 && LA31_0<=26)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2716:2: rule__ClauseExpression__Group_1_1_3_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_3_2_1_1__0_in_rule__ClauseExpression__Group_1_1_3_2_1__1__Impl5793);
            	    rule__ClauseExpression__Group_1_1_3_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_3_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_3_2_1__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_3_2_1__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2726:1: rule__ClauseExpression__Group_1_1_3_2_1__2 : rule__ClauseExpression__Group_1_1_3_2_1__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_3_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2730:1: ( rule__ClauseExpression__Group_1_1_3_2_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2731:2: rule__ClauseExpression__Group_1_1_3_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_3_2_1__2__Impl_in_rule__ClauseExpression__Group_1_1_3_2_1__25824);
            rule__ClauseExpression__Group_1_1_3_2_1__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_3_2_1__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_3_2_1__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2737:1: rule__ClauseExpression__Group_1_1_3_2_1__2__Impl : ( ')' ) ;
    public final void rule__ClauseExpression__Group_1_1_3_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2741:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2742:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2742:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2743:1: ')'
            {
             before(grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_3_2_1_2()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_1_3_2_1__2__Impl5852); 
             after(grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_3_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_3_2_1__2__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_3_2_1_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2762:1: rule__ClauseExpression__Group_1_1_3_2_1_1__0 : rule__ClauseExpression__Group_1_1_3_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_3_2_1_1__1 ;
    public final void rule__ClauseExpression__Group_1_1_3_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2766:1: ( rule__ClauseExpression__Group_1_1_3_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_3_2_1_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2767:2: rule__ClauseExpression__Group_1_1_3_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_3_2_1_1__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_3_2_1_1__0__Impl_in_rule__ClauseExpression__Group_1_1_3_2_1_1__05889);
            rule__ClauseExpression__Group_1_1_3_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_3_2_1_1__1_in_rule__ClauseExpression__Group_1_1_3_2_1_1__05892);
            rule__ClauseExpression__Group_1_1_3_2_1_1__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_3_2_1_1__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_3_2_1_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2774:1: rule__ClauseExpression__Group_1_1_3_2_1_1__0__Impl : ( ( ruleUnaryExpression )? ) ;
    public final void rule__ClauseExpression__Group_1_1_3_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2778:1: ( ( ( ruleUnaryExpression )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2779:1: ( ( ruleUnaryExpression )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2779:1: ( ( ruleUnaryExpression )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2780:1: ( ruleUnaryExpression )?
            {
             before(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_3_2_1_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2781:1: ( ruleUnaryExpression )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=23 && LA32_0<=26)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2781:3: ruleUnaryExpression
                    {
                    pushFollow(FOLLOW_ruleUnaryExpression_in_rule__ClauseExpression__Group_1_1_3_2_1_1__0__Impl5920);
                    ruleUnaryExpression();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_3_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_3_2_1_1__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_3_2_1_1__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2791:1: rule__ClauseExpression__Group_1_1_3_2_1_1__1 : rule__ClauseExpression__Group_1_1_3_2_1_1__1__Impl ;
    public final void rule__ClauseExpression__Group_1_1_3_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2795:1: ( rule__ClauseExpression__Group_1_1_3_2_1_1__1__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2796:2: rule__ClauseExpression__Group_1_1_3_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_3_2_1_1__1__Impl_in_rule__ClauseExpression__Group_1_1_3_2_1_1__15951);
            rule__ClauseExpression__Group_1_1_3_2_1_1__1__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_3_2_1_1__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_3_2_1_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2802:1: rule__ClauseExpression__Group_1_1_3_2_1_1__1__Impl : ( ( rule__ClauseExpression__ValuesAssignment_1_1_3_2_1_1_1 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_3_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2806:1: ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_3_2_1_1_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2807:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_3_2_1_1_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2807:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_3_2_1_1_1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2808:1: ( rule__ClauseExpression__ValuesAssignment_1_1_3_2_1_1_1 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_3_2_1_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2809:1: ( rule__ClauseExpression__ValuesAssignment_1_1_3_2_1_1_1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2809:2: rule__ClauseExpression__ValuesAssignment_1_1_3_2_1_1_1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_3_2_1_1_1_in_rule__ClauseExpression__Group_1_1_3_2_1_1__1__Impl5978);
            rule__ClauseExpression__ValuesAssignment_1_1_3_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_3_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_3_2_1_1__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_4__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2823:1: rule__ClauseExpression__Group_1_1_4__0 : rule__ClauseExpression__Group_1_1_4__0__Impl rule__ClauseExpression__Group_1_1_4__1 ;
    public final void rule__ClauseExpression__Group_1_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2827:1: ( rule__ClauseExpression__Group_1_1_4__0__Impl rule__ClauseExpression__Group_1_1_4__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2828:2: rule__ClauseExpression__Group_1_1_4__0__Impl rule__ClauseExpression__Group_1_1_4__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_4__0__Impl_in_rule__ClauseExpression__Group_1_1_4__06012);
            rule__ClauseExpression__Group_1_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_4__1_in_rule__ClauseExpression__Group_1_1_4__06015);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2835:1: rule__ClauseExpression__Group_1_1_4__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_1_4_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2839:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_1_4_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2840:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_4_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2840:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_4_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2841:1: ( rule__ClauseExpression__FieldAssignment_1_1_4_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_4_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2842:1: ( rule__ClauseExpression__FieldAssignment_1_1_4_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2842:2: rule__ClauseExpression__FieldAssignment_1_1_4_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_4_0_in_rule__ClauseExpression__Group_1_1_4__0__Impl6042);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2852:1: rule__ClauseExpression__Group_1_1_4__1 : rule__ClauseExpression__Group_1_1_4__1__Impl rule__ClauseExpression__Group_1_1_4__2 ;
    public final void rule__ClauseExpression__Group_1_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2856:1: ( rule__ClauseExpression__Group_1_1_4__1__Impl rule__ClauseExpression__Group_1_1_4__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2857:2: rule__ClauseExpression__Group_1_1_4__1__Impl rule__ClauseExpression__Group_1_1_4__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_4__1__Impl_in_rule__ClauseExpression__Group_1_1_4__16072);
            rule__ClauseExpression__Group_1_1_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_4__2_in_rule__ClauseExpression__Group_1_1_4__16075);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2864:1: rule__ClauseExpression__Group_1_1_4__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2868:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2869:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2869:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2870:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_4_1()); 
            match(input,32,FOLLOW_32_in_rule__ClauseExpression__Group_1_1_4__1__Impl6103); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2883:1: rule__ClauseExpression__Group_1_1_4__2 : rule__ClauseExpression__Group_1_1_4__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2887:1: ( rule__ClauseExpression__Group_1_1_4__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2888:2: rule__ClauseExpression__Group_1_1_4__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_4__2__Impl_in_rule__ClauseExpression__Group_1_1_4__26134);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2894:1: rule__ClauseExpression__Group_1_1_4__2__Impl : ( ( rule__ClauseExpression__Alternatives_1_1_4_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2898:1: ( ( ( rule__ClauseExpression__Alternatives_1_1_4_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2899:1: ( ( rule__ClauseExpression__Alternatives_1_1_4_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2899:1: ( ( rule__ClauseExpression__Alternatives_1_1_4_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2900:1: ( rule__ClauseExpression__Alternatives_1_1_4_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_4_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2901:1: ( rule__ClauseExpression__Alternatives_1_1_4_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2901:2: rule__ClauseExpression__Alternatives_1_1_4_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Alternatives_1_1_4_2_in_rule__ClauseExpression__Group_1_1_4__2__Impl6161);
            rule__ClauseExpression__Alternatives_1_1_4_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_4_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ClauseExpression__Group_1_1_4_2_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2917:1: rule__ClauseExpression__Group_1_1_4_2_1__0 : rule__ClauseExpression__Group_1_1_4_2_1__0__Impl rule__ClauseExpression__Group_1_1_4_2_1__1 ;
    public final void rule__ClauseExpression__Group_1_1_4_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2921:1: ( rule__ClauseExpression__Group_1_1_4_2_1__0__Impl rule__ClauseExpression__Group_1_1_4_2_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2922:2: rule__ClauseExpression__Group_1_1_4_2_1__0__Impl rule__ClauseExpression__Group_1_1_4_2_1__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_4_2_1__0__Impl_in_rule__ClauseExpression__Group_1_1_4_2_1__06197);
            rule__ClauseExpression__Group_1_1_4_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_4_2_1__1_in_rule__ClauseExpression__Group_1_1_4_2_1__06200);
            rule__ClauseExpression__Group_1_1_4_2_1__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_4_2_1__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_4_2_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2929:1: rule__ClauseExpression__Group_1_1_4_2_1__0__Impl : ( '(' ) ;
    public final void rule__ClauseExpression__Group_1_1_4_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2933:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2934:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2934:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2935:1: '('
            {
             before(grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_4_2_1_0()); 
            match(input,30,FOLLOW_30_in_rule__ClauseExpression__Group_1_1_4_2_1__0__Impl6228); 
             after(grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_4_2_1__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_4_2_1__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2948:1: rule__ClauseExpression__Group_1_1_4_2_1__1 : rule__ClauseExpression__Group_1_1_4_2_1__1__Impl rule__ClauseExpression__Group_1_1_4_2_1__2 ;
    public final void rule__ClauseExpression__Group_1_1_4_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2952:1: ( rule__ClauseExpression__Group_1_1_4_2_1__1__Impl rule__ClauseExpression__Group_1_1_4_2_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2953:2: rule__ClauseExpression__Group_1_1_4_2_1__1__Impl rule__ClauseExpression__Group_1_1_4_2_1__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_4_2_1__1__Impl_in_rule__ClauseExpression__Group_1_1_4_2_1__16259);
            rule__ClauseExpression__Group_1_1_4_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_4_2_1__2_in_rule__ClauseExpression__Group_1_1_4_2_1__16262);
            rule__ClauseExpression__Group_1_1_4_2_1__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_4_2_1__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_4_2_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2960:1: rule__ClauseExpression__Group_1_1_4_2_1__1__Impl : ( ( rule__ClauseExpression__Group_1_1_4_2_1_1__0 )* ) ;
    public final void rule__ClauseExpression__Group_1_1_4_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2964:1: ( ( ( rule__ClauseExpression__Group_1_1_4_2_1_1__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2965:1: ( ( rule__ClauseExpression__Group_1_1_4_2_1_1__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2965:1: ( ( rule__ClauseExpression__Group_1_1_4_2_1_1__0 )* )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2966:1: ( rule__ClauseExpression__Group_1_1_4_2_1_1__0 )*
            {
             before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_4_2_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2967:1: ( rule__ClauseExpression__Group_1_1_4_2_1_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_INT||(LA33_0>=23 && LA33_0<=26)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2967:2: rule__ClauseExpression__Group_1_1_4_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_4_2_1_1__0_in_rule__ClauseExpression__Group_1_1_4_2_1__1__Impl6289);
            	    rule__ClauseExpression__Group_1_1_4_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_4_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_4_2_1__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_4_2_1__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2977:1: rule__ClauseExpression__Group_1_1_4_2_1__2 : rule__ClauseExpression__Group_1_1_4_2_1__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_4_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2981:1: ( rule__ClauseExpression__Group_1_1_4_2_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2982:2: rule__ClauseExpression__Group_1_1_4_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_4_2_1__2__Impl_in_rule__ClauseExpression__Group_1_1_4_2_1__26320);
            rule__ClauseExpression__Group_1_1_4_2_1__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_4_2_1__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_4_2_1__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2988:1: rule__ClauseExpression__Group_1_1_4_2_1__2__Impl : ( ')' ) ;
    public final void rule__ClauseExpression__Group_1_1_4_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2992:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2993:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2993:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:2994:1: ')'
            {
             before(grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_4_2_1_2()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_1_4_2_1__2__Impl6348); 
             after(grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_4_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_4_2_1__2__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_4_2_1_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3013:1: rule__ClauseExpression__Group_1_1_4_2_1_1__0 : rule__ClauseExpression__Group_1_1_4_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_4_2_1_1__1 ;
    public final void rule__ClauseExpression__Group_1_1_4_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3017:1: ( rule__ClauseExpression__Group_1_1_4_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_4_2_1_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3018:2: rule__ClauseExpression__Group_1_1_4_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_4_2_1_1__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_4_2_1_1__0__Impl_in_rule__ClauseExpression__Group_1_1_4_2_1_1__06385);
            rule__ClauseExpression__Group_1_1_4_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_4_2_1_1__1_in_rule__ClauseExpression__Group_1_1_4_2_1_1__06388);
            rule__ClauseExpression__Group_1_1_4_2_1_1__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_4_2_1_1__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_4_2_1_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3025:1: rule__ClauseExpression__Group_1_1_4_2_1_1__0__Impl : ( ( ruleUnaryExpression )? ) ;
    public final void rule__ClauseExpression__Group_1_1_4_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3029:1: ( ( ( ruleUnaryExpression )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3030:1: ( ( ruleUnaryExpression )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3030:1: ( ( ruleUnaryExpression )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3031:1: ( ruleUnaryExpression )?
            {
             before(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_4_2_1_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3032:1: ( ruleUnaryExpression )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=23 && LA34_0<=26)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3032:3: ruleUnaryExpression
                    {
                    pushFollow(FOLLOW_ruleUnaryExpression_in_rule__ClauseExpression__Group_1_1_4_2_1_1__0__Impl6416);
                    ruleUnaryExpression();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_4_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_4_2_1_1__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_4_2_1_1__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3042:1: rule__ClauseExpression__Group_1_1_4_2_1_1__1 : rule__ClauseExpression__Group_1_1_4_2_1_1__1__Impl ;
    public final void rule__ClauseExpression__Group_1_1_4_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3046:1: ( rule__ClauseExpression__Group_1_1_4_2_1_1__1__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3047:2: rule__ClauseExpression__Group_1_1_4_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_4_2_1_1__1__Impl_in_rule__ClauseExpression__Group_1_1_4_2_1_1__16447);
            rule__ClauseExpression__Group_1_1_4_2_1_1__1__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_4_2_1_1__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_4_2_1_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3053:1: rule__ClauseExpression__Group_1_1_4_2_1_1__1__Impl : ( ( rule__ClauseExpression__ValuesAssignment_1_1_4_2_1_1_1 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_4_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3057:1: ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_4_2_1_1_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3058:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_4_2_1_1_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3058:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_4_2_1_1_1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3059:1: ( rule__ClauseExpression__ValuesAssignment_1_1_4_2_1_1_1 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_4_2_1_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3060:1: ( rule__ClauseExpression__ValuesAssignment_1_1_4_2_1_1_1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3060:2: rule__ClauseExpression__ValuesAssignment_1_1_4_2_1_1_1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_4_2_1_1_1_in_rule__ClauseExpression__Group_1_1_4_2_1_1__1__Impl6474);
            rule__ClauseExpression__ValuesAssignment_1_1_4_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_4_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_4_2_1_1__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_5__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3074:1: rule__ClauseExpression__Group_1_1_5__0 : rule__ClauseExpression__Group_1_1_5__0__Impl rule__ClauseExpression__Group_1_1_5__1 ;
    public final void rule__ClauseExpression__Group_1_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3078:1: ( rule__ClauseExpression__Group_1_1_5__0__Impl rule__ClauseExpression__Group_1_1_5__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3079:2: rule__ClauseExpression__Group_1_1_5__0__Impl rule__ClauseExpression__Group_1_1_5__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_5__0__Impl_in_rule__ClauseExpression__Group_1_1_5__06508);
            rule__ClauseExpression__Group_1_1_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_5__1_in_rule__ClauseExpression__Group_1_1_5__06511);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3086:1: rule__ClauseExpression__Group_1_1_5__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_1_5_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3090:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_1_5_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3091:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_5_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3091:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_5_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3092:1: ( rule__ClauseExpression__FieldAssignment_1_1_5_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_5_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3093:1: ( rule__ClauseExpression__FieldAssignment_1_1_5_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3093:2: rule__ClauseExpression__FieldAssignment_1_1_5_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_5_0_in_rule__ClauseExpression__Group_1_1_5__0__Impl6538);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3103:1: rule__ClauseExpression__Group_1_1_5__1 : rule__ClauseExpression__Group_1_1_5__1__Impl rule__ClauseExpression__Group_1_1_5__2 ;
    public final void rule__ClauseExpression__Group_1_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3107:1: ( rule__ClauseExpression__Group_1_1_5__1__Impl rule__ClauseExpression__Group_1_1_5__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3108:2: rule__ClauseExpression__Group_1_1_5__1__Impl rule__ClauseExpression__Group_1_1_5__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_5__1__Impl_in_rule__ClauseExpression__Group_1_1_5__16568);
            rule__ClauseExpression__Group_1_1_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_5__2_in_rule__ClauseExpression__Group_1_1_5__16571);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3115:1: rule__ClauseExpression__Group_1_1_5__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3119:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3120:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3120:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3121:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_5_1()); 
            match(input,32,FOLLOW_32_in_rule__ClauseExpression__Group_1_1_5__1__Impl6599); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3134:1: rule__ClauseExpression__Group_1_1_5__2 : rule__ClauseExpression__Group_1_1_5__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3138:1: ( rule__ClauseExpression__Group_1_1_5__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3139:2: rule__ClauseExpression__Group_1_1_5__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_5__2__Impl_in_rule__ClauseExpression__Group_1_1_5__26630);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3145:1: rule__ClauseExpression__Group_1_1_5__2__Impl : ( ( rule__ClauseExpression__Alternatives_1_1_5_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3149:1: ( ( ( rule__ClauseExpression__Alternatives_1_1_5_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3150:1: ( ( rule__ClauseExpression__Alternatives_1_1_5_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3150:1: ( ( rule__ClauseExpression__Alternatives_1_1_5_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3151:1: ( rule__ClauseExpression__Alternatives_1_1_5_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_5_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3152:1: ( rule__ClauseExpression__Alternatives_1_1_5_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3152:2: rule__ClauseExpression__Alternatives_1_1_5_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Alternatives_1_1_5_2_in_rule__ClauseExpression__Group_1_1_5__2__Impl6657);
            rule__ClauseExpression__Alternatives_1_1_5_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_5_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ClauseExpression__Group_1_1_5_2_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3168:1: rule__ClauseExpression__Group_1_1_5_2_1__0 : rule__ClauseExpression__Group_1_1_5_2_1__0__Impl rule__ClauseExpression__Group_1_1_5_2_1__1 ;
    public final void rule__ClauseExpression__Group_1_1_5_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3172:1: ( rule__ClauseExpression__Group_1_1_5_2_1__0__Impl rule__ClauseExpression__Group_1_1_5_2_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3173:2: rule__ClauseExpression__Group_1_1_5_2_1__0__Impl rule__ClauseExpression__Group_1_1_5_2_1__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_5_2_1__0__Impl_in_rule__ClauseExpression__Group_1_1_5_2_1__06693);
            rule__ClauseExpression__Group_1_1_5_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_5_2_1__1_in_rule__ClauseExpression__Group_1_1_5_2_1__06696);
            rule__ClauseExpression__Group_1_1_5_2_1__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_5_2_1__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_5_2_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3180:1: rule__ClauseExpression__Group_1_1_5_2_1__0__Impl : ( '(' ) ;
    public final void rule__ClauseExpression__Group_1_1_5_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3184:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3185:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3185:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3186:1: '('
            {
             before(grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_5_2_1_0()); 
            match(input,30,FOLLOW_30_in_rule__ClauseExpression__Group_1_1_5_2_1__0__Impl6724); 
             after(grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_5_2_1__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_5_2_1__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3199:1: rule__ClauseExpression__Group_1_1_5_2_1__1 : rule__ClauseExpression__Group_1_1_5_2_1__1__Impl rule__ClauseExpression__Group_1_1_5_2_1__2 ;
    public final void rule__ClauseExpression__Group_1_1_5_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3203:1: ( rule__ClauseExpression__Group_1_1_5_2_1__1__Impl rule__ClauseExpression__Group_1_1_5_2_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3204:2: rule__ClauseExpression__Group_1_1_5_2_1__1__Impl rule__ClauseExpression__Group_1_1_5_2_1__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_5_2_1__1__Impl_in_rule__ClauseExpression__Group_1_1_5_2_1__16755);
            rule__ClauseExpression__Group_1_1_5_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_5_2_1__2_in_rule__ClauseExpression__Group_1_1_5_2_1__16758);
            rule__ClauseExpression__Group_1_1_5_2_1__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_5_2_1__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_5_2_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3211:1: rule__ClauseExpression__Group_1_1_5_2_1__1__Impl : ( ( rule__ClauseExpression__Group_1_1_5_2_1_1__0 )* ) ;
    public final void rule__ClauseExpression__Group_1_1_5_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3215:1: ( ( ( rule__ClauseExpression__Group_1_1_5_2_1_1__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3216:1: ( ( rule__ClauseExpression__Group_1_1_5_2_1_1__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3216:1: ( ( rule__ClauseExpression__Group_1_1_5_2_1_1__0 )* )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3217:1: ( rule__ClauseExpression__Group_1_1_5_2_1_1__0 )*
            {
             before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_5_2_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3218:1: ( rule__ClauseExpression__Group_1_1_5_2_1_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=13 && LA35_0<=18)||(LA35_0>=23 && LA35_0<=26)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3218:2: rule__ClauseExpression__Group_1_1_5_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_5_2_1_1__0_in_rule__ClauseExpression__Group_1_1_5_2_1__1__Impl6785);
            	    rule__ClauseExpression__Group_1_1_5_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_5_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_5_2_1__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_5_2_1__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3228:1: rule__ClauseExpression__Group_1_1_5_2_1__2 : rule__ClauseExpression__Group_1_1_5_2_1__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_5_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3232:1: ( rule__ClauseExpression__Group_1_1_5_2_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3233:2: rule__ClauseExpression__Group_1_1_5_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_5_2_1__2__Impl_in_rule__ClauseExpression__Group_1_1_5_2_1__26816);
            rule__ClauseExpression__Group_1_1_5_2_1__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_5_2_1__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_5_2_1__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3239:1: rule__ClauseExpression__Group_1_1_5_2_1__2__Impl : ( ')' ) ;
    public final void rule__ClauseExpression__Group_1_1_5_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3243:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3244:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3244:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3245:1: ')'
            {
             before(grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_5_2_1_2()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_1_5_2_1__2__Impl6844); 
             after(grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_5_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_5_2_1__2__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_5_2_1_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3264:1: rule__ClauseExpression__Group_1_1_5_2_1_1__0 : rule__ClauseExpression__Group_1_1_5_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_5_2_1_1__1 ;
    public final void rule__ClauseExpression__Group_1_1_5_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3268:1: ( rule__ClauseExpression__Group_1_1_5_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_5_2_1_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3269:2: rule__ClauseExpression__Group_1_1_5_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_5_2_1_1__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_5_2_1_1__0__Impl_in_rule__ClauseExpression__Group_1_1_5_2_1_1__06881);
            rule__ClauseExpression__Group_1_1_5_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_5_2_1_1__1_in_rule__ClauseExpression__Group_1_1_5_2_1_1__06884);
            rule__ClauseExpression__Group_1_1_5_2_1_1__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_5_2_1_1__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_5_2_1_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3276:1: rule__ClauseExpression__Group_1_1_5_2_1_1__0__Impl : ( ( ruleUnaryExpression )? ) ;
    public final void rule__ClauseExpression__Group_1_1_5_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3280:1: ( ( ( ruleUnaryExpression )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3281:1: ( ( ruleUnaryExpression )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3281:1: ( ( ruleUnaryExpression )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3282:1: ( ruleUnaryExpression )?
            {
             before(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_5_2_1_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3283:1: ( ruleUnaryExpression )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=23 && LA36_0<=26)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3283:3: ruleUnaryExpression
                    {
                    pushFollow(FOLLOW_ruleUnaryExpression_in_rule__ClauseExpression__Group_1_1_5_2_1_1__0__Impl6912);
                    ruleUnaryExpression();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_5_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_5_2_1_1__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_5_2_1_1__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3293:1: rule__ClauseExpression__Group_1_1_5_2_1_1__1 : rule__ClauseExpression__Group_1_1_5_2_1_1__1__Impl ;
    public final void rule__ClauseExpression__Group_1_1_5_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3297:1: ( rule__ClauseExpression__Group_1_1_5_2_1_1__1__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3298:2: rule__ClauseExpression__Group_1_1_5_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_5_2_1_1__1__Impl_in_rule__ClauseExpression__Group_1_1_5_2_1_1__16943);
            rule__ClauseExpression__Group_1_1_5_2_1_1__1__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_5_2_1_1__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_5_2_1_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3304:1: rule__ClauseExpression__Group_1_1_5_2_1_1__1__Impl : ( ( rule__ClauseExpression__ValuesAssignment_1_1_5_2_1_1_1 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_5_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3308:1: ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_5_2_1_1_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3309:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_5_2_1_1_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3309:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_5_2_1_1_1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3310:1: ( rule__ClauseExpression__ValuesAssignment_1_1_5_2_1_1_1 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_5_2_1_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3311:1: ( rule__ClauseExpression__ValuesAssignment_1_1_5_2_1_1_1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3311:2: rule__ClauseExpression__ValuesAssignment_1_1_5_2_1_1_1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_5_2_1_1_1_in_rule__ClauseExpression__Group_1_1_5_2_1_1__1__Impl6970);
            rule__ClauseExpression__ValuesAssignment_1_1_5_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_5_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_5_2_1_1__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_6__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3325:1: rule__ClauseExpression__Group_1_1_6__0 : rule__ClauseExpression__Group_1_1_6__0__Impl rule__ClauseExpression__Group_1_1_6__1 ;
    public final void rule__ClauseExpression__Group_1_1_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3329:1: ( rule__ClauseExpression__Group_1_1_6__0__Impl rule__ClauseExpression__Group_1_1_6__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3330:2: rule__ClauseExpression__Group_1_1_6__0__Impl rule__ClauseExpression__Group_1_1_6__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_6__0__Impl_in_rule__ClauseExpression__Group_1_1_6__07004);
            rule__ClauseExpression__Group_1_1_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_6__1_in_rule__ClauseExpression__Group_1_1_6__07007);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3337:1: rule__ClauseExpression__Group_1_1_6__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_1_6_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3341:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_1_6_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3342:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_6_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3342:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_6_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3343:1: ( rule__ClauseExpression__FieldAssignment_1_1_6_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_6_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3344:1: ( rule__ClauseExpression__FieldAssignment_1_1_6_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3344:2: rule__ClauseExpression__FieldAssignment_1_1_6_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_6_0_in_rule__ClauseExpression__Group_1_1_6__0__Impl7034);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3354:1: rule__ClauseExpression__Group_1_1_6__1 : rule__ClauseExpression__Group_1_1_6__1__Impl rule__ClauseExpression__Group_1_1_6__2 ;
    public final void rule__ClauseExpression__Group_1_1_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3358:1: ( rule__ClauseExpression__Group_1_1_6__1__Impl rule__ClauseExpression__Group_1_1_6__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3359:2: rule__ClauseExpression__Group_1_1_6__1__Impl rule__ClauseExpression__Group_1_1_6__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_6__1__Impl_in_rule__ClauseExpression__Group_1_1_6__17064);
            rule__ClauseExpression__Group_1_1_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_6__2_in_rule__ClauseExpression__Group_1_1_6__17067);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3366:1: rule__ClauseExpression__Group_1_1_6__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_1_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3370:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3371:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3371:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3372:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_6_1()); 
            match(input,32,FOLLOW_32_in_rule__ClauseExpression__Group_1_1_6__1__Impl7095); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3385:1: rule__ClauseExpression__Group_1_1_6__2 : rule__ClauseExpression__Group_1_1_6__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3389:1: ( rule__ClauseExpression__Group_1_1_6__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3390:2: rule__ClauseExpression__Group_1_1_6__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_6__2__Impl_in_rule__ClauseExpression__Group_1_1_6__27126);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3396:1: rule__ClauseExpression__Group_1_1_6__2__Impl : ( ( rule__ClauseExpression__Alternatives_1_1_6_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3400:1: ( ( ( rule__ClauseExpression__Alternatives_1_1_6_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3401:1: ( ( rule__ClauseExpression__Alternatives_1_1_6_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3401:1: ( ( rule__ClauseExpression__Alternatives_1_1_6_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3402:1: ( rule__ClauseExpression__Alternatives_1_1_6_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_6_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3403:1: ( rule__ClauseExpression__Alternatives_1_1_6_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3403:2: rule__ClauseExpression__Alternatives_1_1_6_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Alternatives_1_1_6_2_in_rule__ClauseExpression__Group_1_1_6__2__Impl7153);
            rule__ClauseExpression__Alternatives_1_1_6_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_6_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ClauseExpression__Group_1_1_6_2_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3419:1: rule__ClauseExpression__Group_1_1_6_2_1__0 : rule__ClauseExpression__Group_1_1_6_2_1__0__Impl rule__ClauseExpression__Group_1_1_6_2_1__1 ;
    public final void rule__ClauseExpression__Group_1_1_6_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3423:1: ( rule__ClauseExpression__Group_1_1_6_2_1__0__Impl rule__ClauseExpression__Group_1_1_6_2_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3424:2: rule__ClauseExpression__Group_1_1_6_2_1__0__Impl rule__ClauseExpression__Group_1_1_6_2_1__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_6_2_1__0__Impl_in_rule__ClauseExpression__Group_1_1_6_2_1__07189);
            rule__ClauseExpression__Group_1_1_6_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_6_2_1__1_in_rule__ClauseExpression__Group_1_1_6_2_1__07192);
            rule__ClauseExpression__Group_1_1_6_2_1__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_6_2_1__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_6_2_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3431:1: rule__ClauseExpression__Group_1_1_6_2_1__0__Impl : ( '(' ) ;
    public final void rule__ClauseExpression__Group_1_1_6_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3435:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3436:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3436:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3437:1: '('
            {
             before(grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_6_2_1_0()); 
            match(input,30,FOLLOW_30_in_rule__ClauseExpression__Group_1_1_6_2_1__0__Impl7220); 
             after(grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_6_2_1__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_6_2_1__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3450:1: rule__ClauseExpression__Group_1_1_6_2_1__1 : rule__ClauseExpression__Group_1_1_6_2_1__1__Impl rule__ClauseExpression__Group_1_1_6_2_1__2 ;
    public final void rule__ClauseExpression__Group_1_1_6_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3454:1: ( rule__ClauseExpression__Group_1_1_6_2_1__1__Impl rule__ClauseExpression__Group_1_1_6_2_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3455:2: rule__ClauseExpression__Group_1_1_6_2_1__1__Impl rule__ClauseExpression__Group_1_1_6_2_1__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_6_2_1__1__Impl_in_rule__ClauseExpression__Group_1_1_6_2_1__17251);
            rule__ClauseExpression__Group_1_1_6_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_6_2_1__2_in_rule__ClauseExpression__Group_1_1_6_2_1__17254);
            rule__ClauseExpression__Group_1_1_6_2_1__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_6_2_1__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_6_2_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3462:1: rule__ClauseExpression__Group_1_1_6_2_1__1__Impl : ( ( rule__ClauseExpression__Group_1_1_6_2_1_1__0 )* ) ;
    public final void rule__ClauseExpression__Group_1_1_6_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3466:1: ( ( ( rule__ClauseExpression__Group_1_1_6_2_1_1__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3467:1: ( ( rule__ClauseExpression__Group_1_1_6_2_1_1__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3467:1: ( ( rule__ClauseExpression__Group_1_1_6_2_1_1__0 )* )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3468:1: ( rule__ClauseExpression__Group_1_1_6_2_1_1__0 )*
            {
             before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_6_2_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3469:1: ( rule__ClauseExpression__Group_1_1_6_2_1_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_NAMEWITHWC||(LA37_0>=23 && LA37_0<=26)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3469:2: rule__ClauseExpression__Group_1_1_6_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_6_2_1_1__0_in_rule__ClauseExpression__Group_1_1_6_2_1__1__Impl7281);
            	    rule__ClauseExpression__Group_1_1_6_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_6_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_6_2_1__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_6_2_1__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3479:1: rule__ClauseExpression__Group_1_1_6_2_1__2 : rule__ClauseExpression__Group_1_1_6_2_1__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_6_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3483:1: ( rule__ClauseExpression__Group_1_1_6_2_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3484:2: rule__ClauseExpression__Group_1_1_6_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_6_2_1__2__Impl_in_rule__ClauseExpression__Group_1_1_6_2_1__27312);
            rule__ClauseExpression__Group_1_1_6_2_1__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_6_2_1__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_6_2_1__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3490:1: rule__ClauseExpression__Group_1_1_6_2_1__2__Impl : ( ')' ) ;
    public final void rule__ClauseExpression__Group_1_1_6_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3494:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3495:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3495:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3496:1: ')'
            {
             before(grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_6_2_1_2()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_1_6_2_1__2__Impl7340); 
             after(grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_6_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_6_2_1__2__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_6_2_1_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3515:1: rule__ClauseExpression__Group_1_1_6_2_1_1__0 : rule__ClauseExpression__Group_1_1_6_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_6_2_1_1__1 ;
    public final void rule__ClauseExpression__Group_1_1_6_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3519:1: ( rule__ClauseExpression__Group_1_1_6_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_6_2_1_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3520:2: rule__ClauseExpression__Group_1_1_6_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_6_2_1_1__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_6_2_1_1__0__Impl_in_rule__ClauseExpression__Group_1_1_6_2_1_1__07377);
            rule__ClauseExpression__Group_1_1_6_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_6_2_1_1__1_in_rule__ClauseExpression__Group_1_1_6_2_1_1__07380);
            rule__ClauseExpression__Group_1_1_6_2_1_1__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_6_2_1_1__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_6_2_1_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3527:1: rule__ClauseExpression__Group_1_1_6_2_1_1__0__Impl : ( ( ruleUnaryExpression )? ) ;
    public final void rule__ClauseExpression__Group_1_1_6_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3531:1: ( ( ( ruleUnaryExpression )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3532:1: ( ( ruleUnaryExpression )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3532:1: ( ( ruleUnaryExpression )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3533:1: ( ruleUnaryExpression )?
            {
             before(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_6_2_1_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3534:1: ( ruleUnaryExpression )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=23 && LA38_0<=26)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3534:3: ruleUnaryExpression
                    {
                    pushFollow(FOLLOW_ruleUnaryExpression_in_rule__ClauseExpression__Group_1_1_6_2_1_1__0__Impl7408);
                    ruleUnaryExpression();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_6_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_6_2_1_1__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_6_2_1_1__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3544:1: rule__ClauseExpression__Group_1_1_6_2_1_1__1 : rule__ClauseExpression__Group_1_1_6_2_1_1__1__Impl ;
    public final void rule__ClauseExpression__Group_1_1_6_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3548:1: ( rule__ClauseExpression__Group_1_1_6_2_1_1__1__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3549:2: rule__ClauseExpression__Group_1_1_6_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_6_2_1_1__1__Impl_in_rule__ClauseExpression__Group_1_1_6_2_1_1__17439);
            rule__ClauseExpression__Group_1_1_6_2_1_1__1__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_6_2_1_1__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_6_2_1_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3555:1: rule__ClauseExpression__Group_1_1_6_2_1_1__1__Impl : ( ( rule__ClauseExpression__ValuesAssignment_1_1_6_2_1_1_1 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_6_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3559:1: ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_6_2_1_1_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3560:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_6_2_1_1_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3560:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_6_2_1_1_1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3561:1: ( rule__ClauseExpression__ValuesAssignment_1_1_6_2_1_1_1 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_6_2_1_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3562:1: ( rule__ClauseExpression__ValuesAssignment_1_1_6_2_1_1_1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3562:2: rule__ClauseExpression__ValuesAssignment_1_1_6_2_1_1_1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_6_2_1_1_1_in_rule__ClauseExpression__Group_1_1_6_2_1_1__1__Impl7466);
            rule__ClauseExpression__ValuesAssignment_1_1_6_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_6_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_6_2_1_1__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_7__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3576:1: rule__ClauseExpression__Group_1_1_7__0 : rule__ClauseExpression__Group_1_1_7__0__Impl rule__ClauseExpression__Group_1_1_7__1 ;
    public final void rule__ClauseExpression__Group_1_1_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3580:1: ( rule__ClauseExpression__Group_1_1_7__0__Impl rule__ClauseExpression__Group_1_1_7__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3581:2: rule__ClauseExpression__Group_1_1_7__0__Impl rule__ClauseExpression__Group_1_1_7__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_7__0__Impl_in_rule__ClauseExpression__Group_1_1_7__07500);
            rule__ClauseExpression__Group_1_1_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_7__1_in_rule__ClauseExpression__Group_1_1_7__07503);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3588:1: rule__ClauseExpression__Group_1_1_7__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_1_7_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3592:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_1_7_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3593:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_7_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3593:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_7_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3594:1: ( rule__ClauseExpression__FieldAssignment_1_1_7_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_7_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3595:1: ( rule__ClauseExpression__FieldAssignment_1_1_7_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3595:2: rule__ClauseExpression__FieldAssignment_1_1_7_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_7_0_in_rule__ClauseExpression__Group_1_1_7__0__Impl7530);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3605:1: rule__ClauseExpression__Group_1_1_7__1 : rule__ClauseExpression__Group_1_1_7__1__Impl rule__ClauseExpression__Group_1_1_7__2 ;
    public final void rule__ClauseExpression__Group_1_1_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3609:1: ( rule__ClauseExpression__Group_1_1_7__1__Impl rule__ClauseExpression__Group_1_1_7__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3610:2: rule__ClauseExpression__Group_1_1_7__1__Impl rule__ClauseExpression__Group_1_1_7__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_7__1__Impl_in_rule__ClauseExpression__Group_1_1_7__17560);
            rule__ClauseExpression__Group_1_1_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_7__2_in_rule__ClauseExpression__Group_1_1_7__17563);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3617:1: rule__ClauseExpression__Group_1_1_7__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_1_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3621:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3622:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3622:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3623:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_7_1()); 
            match(input,32,FOLLOW_32_in_rule__ClauseExpression__Group_1_1_7__1__Impl7591); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3636:1: rule__ClauseExpression__Group_1_1_7__2 : rule__ClauseExpression__Group_1_1_7__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3640:1: ( rule__ClauseExpression__Group_1_1_7__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3641:2: rule__ClauseExpression__Group_1_1_7__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_7__2__Impl_in_rule__ClauseExpression__Group_1_1_7__27622);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3647:1: rule__ClauseExpression__Group_1_1_7__2__Impl : ( ( rule__ClauseExpression__Alternatives_1_1_7_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3651:1: ( ( ( rule__ClauseExpression__Alternatives_1_1_7_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3652:1: ( ( rule__ClauseExpression__Alternatives_1_1_7_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3652:1: ( ( rule__ClauseExpression__Alternatives_1_1_7_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3653:1: ( rule__ClauseExpression__Alternatives_1_1_7_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_7_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3654:1: ( rule__ClauseExpression__Alternatives_1_1_7_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3654:2: rule__ClauseExpression__Alternatives_1_1_7_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Alternatives_1_1_7_2_in_rule__ClauseExpression__Group_1_1_7__2__Impl7649);
            rule__ClauseExpression__Alternatives_1_1_7_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_7_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ClauseExpression__Group_1_1_7_2_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3670:1: rule__ClauseExpression__Group_1_1_7_2_1__0 : rule__ClauseExpression__Group_1_1_7_2_1__0__Impl rule__ClauseExpression__Group_1_1_7_2_1__1 ;
    public final void rule__ClauseExpression__Group_1_1_7_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3674:1: ( rule__ClauseExpression__Group_1_1_7_2_1__0__Impl rule__ClauseExpression__Group_1_1_7_2_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3675:2: rule__ClauseExpression__Group_1_1_7_2_1__0__Impl rule__ClauseExpression__Group_1_1_7_2_1__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_7_2_1__0__Impl_in_rule__ClauseExpression__Group_1_1_7_2_1__07685);
            rule__ClauseExpression__Group_1_1_7_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_7_2_1__1_in_rule__ClauseExpression__Group_1_1_7_2_1__07688);
            rule__ClauseExpression__Group_1_1_7_2_1__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_7_2_1__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_7_2_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3682:1: rule__ClauseExpression__Group_1_1_7_2_1__0__Impl : ( '(' ) ;
    public final void rule__ClauseExpression__Group_1_1_7_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3686:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3687:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3687:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3688:1: '('
            {
             before(grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_7_2_1_0()); 
            match(input,30,FOLLOW_30_in_rule__ClauseExpression__Group_1_1_7_2_1__0__Impl7716); 
             after(grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_7_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_7_2_1__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_7_2_1__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3701:1: rule__ClauseExpression__Group_1_1_7_2_1__1 : rule__ClauseExpression__Group_1_1_7_2_1__1__Impl rule__ClauseExpression__Group_1_1_7_2_1__2 ;
    public final void rule__ClauseExpression__Group_1_1_7_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3705:1: ( rule__ClauseExpression__Group_1_1_7_2_1__1__Impl rule__ClauseExpression__Group_1_1_7_2_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3706:2: rule__ClauseExpression__Group_1_1_7_2_1__1__Impl rule__ClauseExpression__Group_1_1_7_2_1__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_7_2_1__1__Impl_in_rule__ClauseExpression__Group_1_1_7_2_1__17747);
            rule__ClauseExpression__Group_1_1_7_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_7_2_1__2_in_rule__ClauseExpression__Group_1_1_7_2_1__17750);
            rule__ClauseExpression__Group_1_1_7_2_1__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_7_2_1__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_7_2_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3713:1: rule__ClauseExpression__Group_1_1_7_2_1__1__Impl : ( ( rule__ClauseExpression__Group_1_1_7_2_1_1__0 )* ) ;
    public final void rule__ClauseExpression__Group_1_1_7_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3717:1: ( ( ( rule__ClauseExpression__Group_1_1_7_2_1_1__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3718:1: ( ( rule__ClauseExpression__Group_1_1_7_2_1_1__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3718:1: ( ( rule__ClauseExpression__Group_1_1_7_2_1_1__0 )* )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3719:1: ( rule__ClauseExpression__Group_1_1_7_2_1_1__0 )*
            {
             before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_7_2_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3720:1: ( rule__ClauseExpression__Group_1_1_7_2_1_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=19 && LA39_0<=26)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3720:2: rule__ClauseExpression__Group_1_1_7_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_7_2_1_1__0_in_rule__ClauseExpression__Group_1_1_7_2_1__1__Impl7777);
            	    rule__ClauseExpression__Group_1_1_7_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_7_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_7_2_1__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_7_2_1__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3730:1: rule__ClauseExpression__Group_1_1_7_2_1__2 : rule__ClauseExpression__Group_1_1_7_2_1__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_7_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3734:1: ( rule__ClauseExpression__Group_1_1_7_2_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3735:2: rule__ClauseExpression__Group_1_1_7_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_7_2_1__2__Impl_in_rule__ClauseExpression__Group_1_1_7_2_1__27808);
            rule__ClauseExpression__Group_1_1_7_2_1__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_7_2_1__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_7_2_1__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3741:1: rule__ClauseExpression__Group_1_1_7_2_1__2__Impl : ( ')' ) ;
    public final void rule__ClauseExpression__Group_1_1_7_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3745:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3746:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3746:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3747:1: ')'
            {
             before(grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_7_2_1_2()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_1_7_2_1__2__Impl7836); 
             after(grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_7_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_7_2_1__2__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_7_2_1_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3766:1: rule__ClauseExpression__Group_1_1_7_2_1_1__0 : rule__ClauseExpression__Group_1_1_7_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_7_2_1_1__1 ;
    public final void rule__ClauseExpression__Group_1_1_7_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3770:1: ( rule__ClauseExpression__Group_1_1_7_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_7_2_1_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3771:2: rule__ClauseExpression__Group_1_1_7_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_7_2_1_1__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_7_2_1_1__0__Impl_in_rule__ClauseExpression__Group_1_1_7_2_1_1__07873);
            rule__ClauseExpression__Group_1_1_7_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_7_2_1_1__1_in_rule__ClauseExpression__Group_1_1_7_2_1_1__07876);
            rule__ClauseExpression__Group_1_1_7_2_1_1__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_7_2_1_1__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_7_2_1_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3778:1: rule__ClauseExpression__Group_1_1_7_2_1_1__0__Impl : ( ( ruleUnaryExpression )? ) ;
    public final void rule__ClauseExpression__Group_1_1_7_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3782:1: ( ( ( ruleUnaryExpression )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3783:1: ( ( ruleUnaryExpression )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3783:1: ( ( ruleUnaryExpression )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3784:1: ( ruleUnaryExpression )?
            {
             before(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_7_2_1_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3785:1: ( ruleUnaryExpression )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=23 && LA40_0<=26)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3785:3: ruleUnaryExpression
                    {
                    pushFollow(FOLLOW_ruleUnaryExpression_in_rule__ClauseExpression__Group_1_1_7_2_1_1__0__Impl7904);
                    ruleUnaryExpression();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_7_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_7_2_1_1__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_7_2_1_1__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3795:1: rule__ClauseExpression__Group_1_1_7_2_1_1__1 : rule__ClauseExpression__Group_1_1_7_2_1_1__1__Impl ;
    public final void rule__ClauseExpression__Group_1_1_7_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3799:1: ( rule__ClauseExpression__Group_1_1_7_2_1_1__1__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3800:2: rule__ClauseExpression__Group_1_1_7_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_7_2_1_1__1__Impl_in_rule__ClauseExpression__Group_1_1_7_2_1_1__17935);
            rule__ClauseExpression__Group_1_1_7_2_1_1__1__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_7_2_1_1__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_7_2_1_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3806:1: rule__ClauseExpression__Group_1_1_7_2_1_1__1__Impl : ( ( rule__ClauseExpression__ValuesAssignment_1_1_7_2_1_1_1 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_7_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3810:1: ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_7_2_1_1_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3811:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_7_2_1_1_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3811:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_7_2_1_1_1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3812:1: ( rule__ClauseExpression__ValuesAssignment_1_1_7_2_1_1_1 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_7_2_1_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3813:1: ( rule__ClauseExpression__ValuesAssignment_1_1_7_2_1_1_1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3813:2: rule__ClauseExpression__ValuesAssignment_1_1_7_2_1_1_1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_7_2_1_1_1_in_rule__ClauseExpression__Group_1_1_7_2_1_1__1__Impl7962);
            rule__ClauseExpression__ValuesAssignment_1_1_7_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_7_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_7_2_1_1__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_8__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3827:1: rule__ClauseExpression__Group_1_1_8__0 : rule__ClauseExpression__Group_1_1_8__0__Impl rule__ClauseExpression__Group_1_1_8__1 ;
    public final void rule__ClauseExpression__Group_1_1_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3831:1: ( rule__ClauseExpression__Group_1_1_8__0__Impl rule__ClauseExpression__Group_1_1_8__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3832:2: rule__ClauseExpression__Group_1_1_8__0__Impl rule__ClauseExpression__Group_1_1_8__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_8__0__Impl_in_rule__ClauseExpression__Group_1_1_8__07996);
            rule__ClauseExpression__Group_1_1_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_8__1_in_rule__ClauseExpression__Group_1_1_8__07999);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3839:1: rule__ClauseExpression__Group_1_1_8__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_1_8_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3843:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_1_8_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3844:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_8_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3844:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_8_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3845:1: ( rule__ClauseExpression__FieldAssignment_1_1_8_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_8_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3846:1: ( rule__ClauseExpression__FieldAssignment_1_1_8_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3846:2: rule__ClauseExpression__FieldAssignment_1_1_8_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_8_0_in_rule__ClauseExpression__Group_1_1_8__0__Impl8026);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3856:1: rule__ClauseExpression__Group_1_1_8__1 : rule__ClauseExpression__Group_1_1_8__1__Impl rule__ClauseExpression__Group_1_1_8__2 ;
    public final void rule__ClauseExpression__Group_1_1_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3860:1: ( rule__ClauseExpression__Group_1_1_8__1__Impl rule__ClauseExpression__Group_1_1_8__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3861:2: rule__ClauseExpression__Group_1_1_8__1__Impl rule__ClauseExpression__Group_1_1_8__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_8__1__Impl_in_rule__ClauseExpression__Group_1_1_8__18056);
            rule__ClauseExpression__Group_1_1_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_8__2_in_rule__ClauseExpression__Group_1_1_8__18059);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3868:1: rule__ClauseExpression__Group_1_1_8__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_1_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3872:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3873:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3873:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3874:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_8_1()); 
            match(input,32,FOLLOW_32_in_rule__ClauseExpression__Group_1_1_8__1__Impl8087); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3887:1: rule__ClauseExpression__Group_1_1_8__2 : rule__ClauseExpression__Group_1_1_8__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3891:1: ( rule__ClauseExpression__Group_1_1_8__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3892:2: rule__ClauseExpression__Group_1_1_8__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_8__2__Impl_in_rule__ClauseExpression__Group_1_1_8__28118);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3898:1: rule__ClauseExpression__Group_1_1_8__2__Impl : ( ( rule__ClauseExpression__Alternatives_1_1_8_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3902:1: ( ( ( rule__ClauseExpression__Alternatives_1_1_8_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3903:1: ( ( rule__ClauseExpression__Alternatives_1_1_8_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3903:1: ( ( rule__ClauseExpression__Alternatives_1_1_8_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3904:1: ( rule__ClauseExpression__Alternatives_1_1_8_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_8_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3905:1: ( rule__ClauseExpression__Alternatives_1_1_8_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3905:2: rule__ClauseExpression__Alternatives_1_1_8_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Alternatives_1_1_8_2_in_rule__ClauseExpression__Group_1_1_8__2__Impl8145);
            rule__ClauseExpression__Alternatives_1_1_8_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_8_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ClauseExpression__Group_1_1_8_2_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3921:1: rule__ClauseExpression__Group_1_1_8_2_1__0 : rule__ClauseExpression__Group_1_1_8_2_1__0__Impl rule__ClauseExpression__Group_1_1_8_2_1__1 ;
    public final void rule__ClauseExpression__Group_1_1_8_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3925:1: ( rule__ClauseExpression__Group_1_1_8_2_1__0__Impl rule__ClauseExpression__Group_1_1_8_2_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3926:2: rule__ClauseExpression__Group_1_1_8_2_1__0__Impl rule__ClauseExpression__Group_1_1_8_2_1__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_8_2_1__0__Impl_in_rule__ClauseExpression__Group_1_1_8_2_1__08181);
            rule__ClauseExpression__Group_1_1_8_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_8_2_1__1_in_rule__ClauseExpression__Group_1_1_8_2_1__08184);
            rule__ClauseExpression__Group_1_1_8_2_1__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_8_2_1__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_8_2_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3933:1: rule__ClauseExpression__Group_1_1_8_2_1__0__Impl : ( '(' ) ;
    public final void rule__ClauseExpression__Group_1_1_8_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3937:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3938:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3938:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3939:1: '('
            {
             before(grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_8_2_1_0()); 
            match(input,30,FOLLOW_30_in_rule__ClauseExpression__Group_1_1_8_2_1__0__Impl8212); 
             after(grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_8_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_8_2_1__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_8_2_1__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3952:1: rule__ClauseExpression__Group_1_1_8_2_1__1 : rule__ClauseExpression__Group_1_1_8_2_1__1__Impl rule__ClauseExpression__Group_1_1_8_2_1__2 ;
    public final void rule__ClauseExpression__Group_1_1_8_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3956:1: ( rule__ClauseExpression__Group_1_1_8_2_1__1__Impl rule__ClauseExpression__Group_1_1_8_2_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3957:2: rule__ClauseExpression__Group_1_1_8_2_1__1__Impl rule__ClauseExpression__Group_1_1_8_2_1__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_8_2_1__1__Impl_in_rule__ClauseExpression__Group_1_1_8_2_1__18243);
            rule__ClauseExpression__Group_1_1_8_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_8_2_1__2_in_rule__ClauseExpression__Group_1_1_8_2_1__18246);
            rule__ClauseExpression__Group_1_1_8_2_1__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_8_2_1__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_8_2_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3964:1: rule__ClauseExpression__Group_1_1_8_2_1__1__Impl : ( ( rule__ClauseExpression__Group_1_1_8_2_1_1__0 )* ) ;
    public final void rule__ClauseExpression__Group_1_1_8_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3968:1: ( ( ( rule__ClauseExpression__Group_1_1_8_2_1_1__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3969:1: ( ( rule__ClauseExpression__Group_1_1_8_2_1_1__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3969:1: ( ( rule__ClauseExpression__Group_1_1_8_2_1_1__0 )* )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3970:1: ( rule__ClauseExpression__Group_1_1_8_2_1_1__0 )*
            {
             before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_8_2_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3971:1: ( rule__ClauseExpression__Group_1_1_8_2_1_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_NAMEWITHWC||(LA41_0>=23 && LA41_0<=26)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3971:2: rule__ClauseExpression__Group_1_1_8_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_8_2_1_1__0_in_rule__ClauseExpression__Group_1_1_8_2_1__1__Impl8273);
            	    rule__ClauseExpression__Group_1_1_8_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_8_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_8_2_1__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_8_2_1__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3981:1: rule__ClauseExpression__Group_1_1_8_2_1__2 : rule__ClauseExpression__Group_1_1_8_2_1__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_8_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3985:1: ( rule__ClauseExpression__Group_1_1_8_2_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3986:2: rule__ClauseExpression__Group_1_1_8_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_8_2_1__2__Impl_in_rule__ClauseExpression__Group_1_1_8_2_1__28304);
            rule__ClauseExpression__Group_1_1_8_2_1__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_8_2_1__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_8_2_1__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3992:1: rule__ClauseExpression__Group_1_1_8_2_1__2__Impl : ( ')' ) ;
    public final void rule__ClauseExpression__Group_1_1_8_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3996:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3997:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3997:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:3998:1: ')'
            {
             before(grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_8_2_1_2()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_1_8_2_1__2__Impl8332); 
             after(grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_8_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_8_2_1__2__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_8_2_1_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4017:1: rule__ClauseExpression__Group_1_1_8_2_1_1__0 : rule__ClauseExpression__Group_1_1_8_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_8_2_1_1__1 ;
    public final void rule__ClauseExpression__Group_1_1_8_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4021:1: ( rule__ClauseExpression__Group_1_1_8_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_8_2_1_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4022:2: rule__ClauseExpression__Group_1_1_8_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_8_2_1_1__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_8_2_1_1__0__Impl_in_rule__ClauseExpression__Group_1_1_8_2_1_1__08369);
            rule__ClauseExpression__Group_1_1_8_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_8_2_1_1__1_in_rule__ClauseExpression__Group_1_1_8_2_1_1__08372);
            rule__ClauseExpression__Group_1_1_8_2_1_1__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_8_2_1_1__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_8_2_1_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4029:1: rule__ClauseExpression__Group_1_1_8_2_1_1__0__Impl : ( ( ruleUnaryExpression )? ) ;
    public final void rule__ClauseExpression__Group_1_1_8_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4033:1: ( ( ( ruleUnaryExpression )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4034:1: ( ( ruleUnaryExpression )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4034:1: ( ( ruleUnaryExpression )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4035:1: ( ruleUnaryExpression )?
            {
             before(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_8_2_1_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4036:1: ( ruleUnaryExpression )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=23 && LA42_0<=26)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4036:3: ruleUnaryExpression
                    {
                    pushFollow(FOLLOW_ruleUnaryExpression_in_rule__ClauseExpression__Group_1_1_8_2_1_1__0__Impl8400);
                    ruleUnaryExpression();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_8_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_8_2_1_1__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_8_2_1_1__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4046:1: rule__ClauseExpression__Group_1_1_8_2_1_1__1 : rule__ClauseExpression__Group_1_1_8_2_1_1__1__Impl ;
    public final void rule__ClauseExpression__Group_1_1_8_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4050:1: ( rule__ClauseExpression__Group_1_1_8_2_1_1__1__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4051:2: rule__ClauseExpression__Group_1_1_8_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_8_2_1_1__1__Impl_in_rule__ClauseExpression__Group_1_1_8_2_1_1__18431);
            rule__ClauseExpression__Group_1_1_8_2_1_1__1__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_8_2_1_1__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_8_2_1_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4057:1: rule__ClauseExpression__Group_1_1_8_2_1_1__1__Impl : ( ( rule__ClauseExpression__ValuesAssignment_1_1_8_2_1_1_1 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_8_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4061:1: ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_8_2_1_1_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4062:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_8_2_1_1_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4062:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_8_2_1_1_1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4063:1: ( rule__ClauseExpression__ValuesAssignment_1_1_8_2_1_1_1 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_8_2_1_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4064:1: ( rule__ClauseExpression__ValuesAssignment_1_1_8_2_1_1_1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4064:2: rule__ClauseExpression__ValuesAssignment_1_1_8_2_1_1_1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_8_2_1_1_1_in_rule__ClauseExpression__Group_1_1_8_2_1_1__1__Impl8458);
            rule__ClauseExpression__ValuesAssignment_1_1_8_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_8_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_8_2_1_1__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_9__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4078:1: rule__ClauseExpression__Group_1_1_9__0 : rule__ClauseExpression__Group_1_1_9__0__Impl rule__ClauseExpression__Group_1_1_9__1 ;
    public final void rule__ClauseExpression__Group_1_1_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4082:1: ( rule__ClauseExpression__Group_1_1_9__0__Impl rule__ClauseExpression__Group_1_1_9__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4083:2: rule__ClauseExpression__Group_1_1_9__0__Impl rule__ClauseExpression__Group_1_1_9__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_9__0__Impl_in_rule__ClauseExpression__Group_1_1_9__08492);
            rule__ClauseExpression__Group_1_1_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_9__1_in_rule__ClauseExpression__Group_1_1_9__08495);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4090:1: rule__ClauseExpression__Group_1_1_9__0__Impl : ( ( rule__ClauseExpression__FieldAssignment_1_1_9_0 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4094:1: ( ( ( rule__ClauseExpression__FieldAssignment_1_1_9_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4095:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_9_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4095:1: ( ( rule__ClauseExpression__FieldAssignment_1_1_9_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4096:1: ( rule__ClauseExpression__FieldAssignment_1_1_9_0 )
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_9_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4097:1: ( rule__ClauseExpression__FieldAssignment_1_1_9_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4097:2: rule__ClauseExpression__FieldAssignment_1_1_9_0
            {
            pushFollow(FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_9_0_in_rule__ClauseExpression__Group_1_1_9__0__Impl8522);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4107:1: rule__ClauseExpression__Group_1_1_9__1 : rule__ClauseExpression__Group_1_1_9__1__Impl rule__ClauseExpression__Group_1_1_9__2 ;
    public final void rule__ClauseExpression__Group_1_1_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4111:1: ( rule__ClauseExpression__Group_1_1_9__1__Impl rule__ClauseExpression__Group_1_1_9__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4112:2: rule__ClauseExpression__Group_1_1_9__1__Impl rule__ClauseExpression__Group_1_1_9__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_9__1__Impl_in_rule__ClauseExpression__Group_1_1_9__18552);
            rule__ClauseExpression__Group_1_1_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_9__2_in_rule__ClauseExpression__Group_1_1_9__18555);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4119:1: rule__ClauseExpression__Group_1_1_9__1__Impl : ( ':' ) ;
    public final void rule__ClauseExpression__Group_1_1_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4123:1: ( ( ':' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4124:1: ( ':' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4124:1: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4125:1: ':'
            {
             before(grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_9_1()); 
            match(input,32,FOLLOW_32_in_rule__ClauseExpression__Group_1_1_9__1__Impl8583); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4138:1: rule__ClauseExpression__Group_1_1_9__2 : rule__ClauseExpression__Group_1_1_9__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4142:1: ( rule__ClauseExpression__Group_1_1_9__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4143:2: rule__ClauseExpression__Group_1_1_9__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_9__2__Impl_in_rule__ClauseExpression__Group_1_1_9__28614);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4149:1: rule__ClauseExpression__Group_1_1_9__2__Impl : ( ( rule__ClauseExpression__Alternatives_1_1_9_2 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4153:1: ( ( ( rule__ClauseExpression__Alternatives_1_1_9_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4154:1: ( ( rule__ClauseExpression__Alternatives_1_1_9_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4154:1: ( ( rule__ClauseExpression__Alternatives_1_1_9_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4155:1: ( rule__ClauseExpression__Alternatives_1_1_9_2 )
            {
             before(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_9_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4156:1: ( rule__ClauseExpression__Alternatives_1_1_9_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4156:2: rule__ClauseExpression__Alternatives_1_1_9_2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Alternatives_1_1_9_2_in_rule__ClauseExpression__Group_1_1_9__2__Impl8641);
            rule__ClauseExpression__Alternatives_1_1_9_2();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_9_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ClauseExpression__Group_1_1_9_2_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4172:1: rule__ClauseExpression__Group_1_1_9_2_1__0 : rule__ClauseExpression__Group_1_1_9_2_1__0__Impl rule__ClauseExpression__Group_1_1_9_2_1__1 ;
    public final void rule__ClauseExpression__Group_1_1_9_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4176:1: ( rule__ClauseExpression__Group_1_1_9_2_1__0__Impl rule__ClauseExpression__Group_1_1_9_2_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4177:2: rule__ClauseExpression__Group_1_1_9_2_1__0__Impl rule__ClauseExpression__Group_1_1_9_2_1__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_9_2_1__0__Impl_in_rule__ClauseExpression__Group_1_1_9_2_1__08677);
            rule__ClauseExpression__Group_1_1_9_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_9_2_1__1_in_rule__ClauseExpression__Group_1_1_9_2_1__08680);
            rule__ClauseExpression__Group_1_1_9_2_1__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_9_2_1__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_9_2_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4184:1: rule__ClauseExpression__Group_1_1_9_2_1__0__Impl : ( '(' ) ;
    public final void rule__ClauseExpression__Group_1_1_9_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4188:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4189:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4189:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4190:1: '('
            {
             before(grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_9_2_1_0()); 
            match(input,30,FOLLOW_30_in_rule__ClauseExpression__Group_1_1_9_2_1__0__Impl8708); 
             after(grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_9_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_9_2_1__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_9_2_1__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4203:1: rule__ClauseExpression__Group_1_1_9_2_1__1 : rule__ClauseExpression__Group_1_1_9_2_1__1__Impl rule__ClauseExpression__Group_1_1_9_2_1__2 ;
    public final void rule__ClauseExpression__Group_1_1_9_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4207:1: ( rule__ClauseExpression__Group_1_1_9_2_1__1__Impl rule__ClauseExpression__Group_1_1_9_2_1__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4208:2: rule__ClauseExpression__Group_1_1_9_2_1__1__Impl rule__ClauseExpression__Group_1_1_9_2_1__2
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_9_2_1__1__Impl_in_rule__ClauseExpression__Group_1_1_9_2_1__18739);
            rule__ClauseExpression__Group_1_1_9_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_9_2_1__2_in_rule__ClauseExpression__Group_1_1_9_2_1__18742);
            rule__ClauseExpression__Group_1_1_9_2_1__2();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_9_2_1__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_9_2_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4215:1: rule__ClauseExpression__Group_1_1_9_2_1__1__Impl : ( ( rule__ClauseExpression__Group_1_1_9_2_1_1__0 )* ) ;
    public final void rule__ClauseExpression__Group_1_1_9_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4219:1: ( ( ( rule__ClauseExpression__Group_1_1_9_2_1_1__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4220:1: ( ( rule__ClauseExpression__Group_1_1_9_2_1_1__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4220:1: ( ( rule__ClauseExpression__Group_1_1_9_2_1_1__0 )* )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4221:1: ( rule__ClauseExpression__Group_1_1_9_2_1_1__0 )*
            {
             before(grammarAccess.getClauseExpressionAccess().getGroup_1_1_9_2_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4222:1: ( rule__ClauseExpression__Group_1_1_9_2_1_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_NAMEWITHWC||(LA43_0>=23 && LA43_0<=26)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4222:2: rule__ClauseExpression__Group_1_1_9_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_9_2_1_1__0_in_rule__ClauseExpression__Group_1_1_9_2_1__1__Impl8769);
            	    rule__ClauseExpression__Group_1_1_9_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getClauseExpressionAccess().getGroup_1_1_9_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_9_2_1__1__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_9_2_1__2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4232:1: rule__ClauseExpression__Group_1_1_9_2_1__2 : rule__ClauseExpression__Group_1_1_9_2_1__2__Impl ;
    public final void rule__ClauseExpression__Group_1_1_9_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4236:1: ( rule__ClauseExpression__Group_1_1_9_2_1__2__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4237:2: rule__ClauseExpression__Group_1_1_9_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_9_2_1__2__Impl_in_rule__ClauseExpression__Group_1_1_9_2_1__28800);
            rule__ClauseExpression__Group_1_1_9_2_1__2__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_9_2_1__2"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_9_2_1__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4243:1: rule__ClauseExpression__Group_1_1_9_2_1__2__Impl : ( ')' ) ;
    public final void rule__ClauseExpression__Group_1_1_9_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4247:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4248:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4248:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4249:1: ')'
            {
             before(grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_9_2_1_2()); 
            match(input,31,FOLLOW_31_in_rule__ClauseExpression__Group_1_1_9_2_1__2__Impl8828); 
             after(grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_9_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_9_2_1__2__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_9_2_1_1__0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4268:1: rule__ClauseExpression__Group_1_1_9_2_1_1__0 : rule__ClauseExpression__Group_1_1_9_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_9_2_1_1__1 ;
    public final void rule__ClauseExpression__Group_1_1_9_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4272:1: ( rule__ClauseExpression__Group_1_1_9_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_9_2_1_1__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4273:2: rule__ClauseExpression__Group_1_1_9_2_1_1__0__Impl rule__ClauseExpression__Group_1_1_9_2_1_1__1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_9_2_1_1__0__Impl_in_rule__ClauseExpression__Group_1_1_9_2_1_1__08865);
            rule__ClauseExpression__Group_1_1_9_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_9_2_1_1__1_in_rule__ClauseExpression__Group_1_1_9_2_1_1__08868);
            rule__ClauseExpression__Group_1_1_9_2_1_1__1();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_9_2_1_1__0"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_9_2_1_1__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4280:1: rule__ClauseExpression__Group_1_1_9_2_1_1__0__Impl : ( ( ruleUnaryExpression )? ) ;
    public final void rule__ClauseExpression__Group_1_1_9_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4284:1: ( ( ( ruleUnaryExpression )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4285:1: ( ( ruleUnaryExpression )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4285:1: ( ( ruleUnaryExpression )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4286:1: ( ruleUnaryExpression )?
            {
             before(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_9_2_1_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4287:1: ( ruleUnaryExpression )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=23 && LA44_0<=26)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4287:3: ruleUnaryExpression
                    {
                    pushFollow(FOLLOW_ruleUnaryExpression_in_rule__ClauseExpression__Group_1_1_9_2_1_1__0__Impl8896);
                    ruleUnaryExpression();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_9_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_9_2_1_1__0__Impl"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_9_2_1_1__1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4297:1: rule__ClauseExpression__Group_1_1_9_2_1_1__1 : rule__ClauseExpression__Group_1_1_9_2_1_1__1__Impl ;
    public final void rule__ClauseExpression__Group_1_1_9_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4301:1: ( rule__ClauseExpression__Group_1_1_9_2_1_1__1__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4302:2: rule__ClauseExpression__Group_1_1_9_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ClauseExpression__Group_1_1_9_2_1_1__1__Impl_in_rule__ClauseExpression__Group_1_1_9_2_1_1__18927);
            rule__ClauseExpression__Group_1_1_9_2_1_1__1__Impl();

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
    // $ANTLR end "rule__ClauseExpression__Group_1_1_9_2_1_1__1"


    // $ANTLR start "rule__ClauseExpression__Group_1_1_9_2_1_1__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4308:1: rule__ClauseExpression__Group_1_1_9_2_1_1__1__Impl : ( ( rule__ClauseExpression__ValuesAssignment_1_1_9_2_1_1_1 ) ) ;
    public final void rule__ClauseExpression__Group_1_1_9_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4312:1: ( ( ( rule__ClauseExpression__ValuesAssignment_1_1_9_2_1_1_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4313:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_9_2_1_1_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4313:1: ( ( rule__ClauseExpression__ValuesAssignment_1_1_9_2_1_1_1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4314:1: ( rule__ClauseExpression__ValuesAssignment_1_1_9_2_1_1_1 )
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_9_2_1_1_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4315:1: ( rule__ClauseExpression__ValuesAssignment_1_1_9_2_1_1_1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4315:2: rule__ClauseExpression__ValuesAssignment_1_1_9_2_1_1_1
            {
            pushFollow(FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_9_2_1_1_1_in_rule__ClauseExpression__Group_1_1_9_2_1_1__1__Impl8954);
            rule__ClauseExpression__ValuesAssignment_1_1_9_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_9_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__Group_1_1_9_2_1_1__1__Impl"


    // $ANTLR start "rule__Exp1__BAssignment_1_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4330:1: rule__Exp1__BAssignment_1_1 : ( ruleBinaryExp ) ;
    public final void rule__Exp1__BAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4334:1: ( ( ruleBinaryExp ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4335:1: ( ruleBinaryExp )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4335:1: ( ruleBinaryExp )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4336:1: ruleBinaryExp
            {
             before(grammarAccess.getExp1Access().getBBinaryExpEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleBinaryExp_in_rule__Exp1__BAssignment_1_18993);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4345:1: rule__Exp1__RightAssignment_1_2 : ( ruleExp1 ) ;
    public final void rule__Exp1__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4349:1: ( ( ruleExp1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4350:1: ( ruleExp1 )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4350:1: ( ruleExp1 )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4351:1: ruleExp1
            {
             before(grammarAccess.getExp1Access().getRightExp1ParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleExp1_in_rule__Exp1__RightAssignment_1_29024);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4360:1: rule__Exp2__ValueAssignment_0 : ( ruleClauseExpression ) ;
    public final void rule__Exp2__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4364:1: ( ( ruleClauseExpression ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4365:1: ( ruleClauseExpression )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4365:1: ( ruleClauseExpression )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4366:1: ruleClauseExpression
            {
             before(grammarAccess.getExp2Access().getValueClauseExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleClauseExpression_in_rule__Exp2__ValueAssignment_09055);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4375:1: rule__ClauseExpression__DefaultAssignment_1_0 : ( ruleSimpleFieldValue ) ;
    public final void rule__ClauseExpression__DefaultAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4379:1: ( ( ruleSimpleFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4380:1: ( ruleSimpleFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4380:1: ( ruleSimpleFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4381:1: ruleSimpleFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getDefaultSimpleFieldValueParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleSimpleFieldValue_in_rule__ClauseExpression__DefaultAssignment_1_09086);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4390:1: rule__ClauseExpression__FieldAssignment_1_1_0_0 : ( ruleSimpleField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4394:1: ( ( ruleSimpleField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4395:1: ( ruleSimpleField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4395:1: ( ruleSimpleField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4396:1: ruleSimpleField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldSimpleFieldParserRuleCall_1_1_0_0_0()); 
            pushFollow(FOLLOW_ruleSimpleField_in_rule__ClauseExpression__FieldAssignment_1_1_0_09117);
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


    // $ANTLR start "rule__ClauseExpression__ValuesAssignment_1_1_0_2_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4405:1: rule__ClauseExpression__ValuesAssignment_1_1_0_2_0 : ( ruleSimpleFieldValue ) ;
    public final void rule__ClauseExpression__ValuesAssignment_1_1_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4409:1: ( ( ruleSimpleFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4410:1: ( ruleSimpleFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4410:1: ( ruleSimpleFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4411:1: ruleSimpleFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesSimpleFieldValueParserRuleCall_1_1_0_2_0_0()); 
            pushFollow(FOLLOW_ruleSimpleFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_0_2_09148);
            ruleSimpleFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValuesSimpleFieldValueParserRuleCall_1_1_0_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValuesAssignment_1_1_0_2_0"


    // $ANTLR start "rule__ClauseExpression__ValuesAssignment_1_1_0_2_1_1_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4420:1: rule__ClauseExpression__ValuesAssignment_1_1_0_2_1_1_1 : ( ruleSimpleFieldValue ) ;
    public final void rule__ClauseExpression__ValuesAssignment_1_1_0_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4424:1: ( ( ruleSimpleFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4425:1: ( ruleSimpleFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4425:1: ( ruleSimpleFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4426:1: ruleSimpleFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesSimpleFieldValueParserRuleCall_1_1_0_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleSimpleFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_0_2_1_1_19179);
            ruleSimpleFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValuesSimpleFieldValueParserRuleCall_1_1_0_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValuesAssignment_1_1_0_2_1_1_1"


    // $ANTLR start "rule__ClauseExpression__FieldAssignment_1_1_1_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4435:1: rule__ClauseExpression__FieldAssignment_1_1_1_0 : ( ruleTypeField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4439:1: ( ( ruleTypeField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4440:1: ( ruleTypeField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4440:1: ( ruleTypeField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4441:1: ruleTypeField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldTypeFieldParserRuleCall_1_1_1_0_0()); 
            pushFollow(FOLLOW_ruleTypeField_in_rule__ClauseExpression__FieldAssignment_1_1_1_09210);
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


    // $ANTLR start "rule__ClauseExpression__ValuesAssignment_1_1_1_2_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4450:1: rule__ClauseExpression__ValuesAssignment_1_1_1_2_0 : ( ruleTypeFieldValue ) ;
    public final void rule__ClauseExpression__ValuesAssignment_1_1_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4454:1: ( ( ruleTypeFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4455:1: ( ruleTypeFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4455:1: ( ruleTypeFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4456:1: ruleTypeFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesTypeFieldValueParserRuleCall_1_1_1_2_0_0()); 
            pushFollow(FOLLOW_ruleTypeFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_1_2_09241);
            ruleTypeFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValuesTypeFieldValueParserRuleCall_1_1_1_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValuesAssignment_1_1_1_2_0"


    // $ANTLR start "rule__ClauseExpression__ValuesAssignment_1_1_1_2_1_1_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4465:1: rule__ClauseExpression__ValuesAssignment_1_1_1_2_1_1_1 : ( ruleTypeFieldValue ) ;
    public final void rule__ClauseExpression__ValuesAssignment_1_1_1_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4469:1: ( ( ruleTypeFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4470:1: ( ruleTypeFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4470:1: ( ruleTypeFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4471:1: ruleTypeFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesTypeFieldValueParserRuleCall_1_1_1_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleTypeFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_1_2_1_1_19272);
            ruleTypeFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValuesTypeFieldValueParserRuleCall_1_1_1_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValuesAssignment_1_1_1_2_1_1_1"


    // $ANTLR start "rule__ClauseExpression__FieldAssignment_1_1_2_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4480:1: rule__ClauseExpression__FieldAssignment_1_1_2_0 : ( ruleMethodField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4484:1: ( ( ruleMethodField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4485:1: ( ruleMethodField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4485:1: ( ruleMethodField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4486:1: ruleMethodField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldMethodFieldParserRuleCall_1_1_2_0_0()); 
            pushFollow(FOLLOW_ruleMethodField_in_rule__ClauseExpression__FieldAssignment_1_1_2_09303);
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


    // $ANTLR start "rule__ClauseExpression__ValuesAssignment_1_1_2_2_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4495:1: rule__ClauseExpression__ValuesAssignment_1_1_2_2_0 : ( ruleMethodFieldValue ) ;
    public final void rule__ClauseExpression__ValuesAssignment_1_1_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4499:1: ( ( ruleMethodFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4500:1: ( ruleMethodFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4500:1: ( ruleMethodFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4501:1: ruleMethodFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesMethodFieldValueParserRuleCall_1_1_2_2_0_0()); 
            pushFollow(FOLLOW_ruleMethodFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_2_2_09334);
            ruleMethodFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValuesMethodFieldValueParserRuleCall_1_1_2_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValuesAssignment_1_1_2_2_0"


    // $ANTLR start "rule__ClauseExpression__ValuesAssignment_1_1_2_2_1_1_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4510:1: rule__ClauseExpression__ValuesAssignment_1_1_2_2_1_1_1 : ( ruleMethodFieldValue ) ;
    public final void rule__ClauseExpression__ValuesAssignment_1_1_2_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4514:1: ( ( ruleMethodFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4515:1: ( ruleMethodFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4515:1: ( ruleMethodFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4516:1: ruleMethodFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesMethodFieldValueParserRuleCall_1_1_2_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleMethodFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_2_2_1_1_19365);
            ruleMethodFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValuesMethodFieldValueParserRuleCall_1_1_2_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValuesAssignment_1_1_2_2_1_1_1"


    // $ANTLR start "rule__ClauseExpression__FieldAssignment_1_1_3_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4525:1: rule__ClauseExpression__FieldAssignment_1_1_3_0 : ( ruleFilePathField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4529:1: ( ( ruleFilePathField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4530:1: ( ruleFilePathField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4530:1: ( ruleFilePathField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4531:1: ruleFilePathField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldFilePathFieldParserRuleCall_1_1_3_0_0()); 
            pushFollow(FOLLOW_ruleFilePathField_in_rule__ClauseExpression__FieldAssignment_1_1_3_09396);
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


    // $ANTLR start "rule__ClauseExpression__ValuesAssignment_1_1_3_2_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4540:1: rule__ClauseExpression__ValuesAssignment_1_1_3_2_0 : ( ruleFilePathFieldValue ) ;
    public final void rule__ClauseExpression__ValuesAssignment_1_1_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4544:1: ( ( ruleFilePathFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4545:1: ( ruleFilePathFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4545:1: ( ruleFilePathFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4546:1: ruleFilePathFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesFilePathFieldValueParserRuleCall_1_1_3_2_0_0()); 
            pushFollow(FOLLOW_ruleFilePathFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_3_2_09427);
            ruleFilePathFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValuesFilePathFieldValueParserRuleCall_1_1_3_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValuesAssignment_1_1_3_2_0"


    // $ANTLR start "rule__ClauseExpression__ValuesAssignment_1_1_3_2_1_1_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4555:1: rule__ClauseExpression__ValuesAssignment_1_1_3_2_1_1_1 : ( ruleFilePathFieldValue ) ;
    public final void rule__ClauseExpression__ValuesAssignment_1_1_3_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4559:1: ( ( ruleFilePathFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4560:1: ( ruleFilePathFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4560:1: ( ruleFilePathFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4561:1: ruleFilePathFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesFilePathFieldValueParserRuleCall_1_1_3_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleFilePathFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_3_2_1_1_19458);
            ruleFilePathFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValuesFilePathFieldValueParserRuleCall_1_1_3_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValuesAssignment_1_1_3_2_1_1_1"


    // $ANTLR start "rule__ClauseExpression__FieldAssignment_1_1_4_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4570:1: rule__ClauseExpression__FieldAssignment_1_1_4_0 : ( ruleNumberField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_1_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4574:1: ( ( ruleNumberField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4575:1: ( ruleNumberField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4575:1: ( ruleNumberField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4576:1: ruleNumberField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldNumberFieldParserRuleCall_1_1_4_0_0()); 
            pushFollow(FOLLOW_ruleNumberField_in_rule__ClauseExpression__FieldAssignment_1_1_4_09489);
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


    // $ANTLR start "rule__ClauseExpression__ValuesAssignment_1_1_4_2_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4585:1: rule__ClauseExpression__ValuesAssignment_1_1_4_2_0 : ( ruleNumberFieldValue ) ;
    public final void rule__ClauseExpression__ValuesAssignment_1_1_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4589:1: ( ( ruleNumberFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4590:1: ( ruleNumberFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4590:1: ( ruleNumberFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4591:1: ruleNumberFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesNumberFieldValueParserRuleCall_1_1_4_2_0_0()); 
            pushFollow(FOLLOW_ruleNumberFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_4_2_09520);
            ruleNumberFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValuesNumberFieldValueParserRuleCall_1_1_4_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValuesAssignment_1_1_4_2_0"


    // $ANTLR start "rule__ClauseExpression__ValuesAssignment_1_1_4_2_1_1_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4600:1: rule__ClauseExpression__ValuesAssignment_1_1_4_2_1_1_1 : ( ruleNumberFieldValue ) ;
    public final void rule__ClauseExpression__ValuesAssignment_1_1_4_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4604:1: ( ( ruleNumberFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4605:1: ( ruleNumberFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4605:1: ( ruleNumberFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4606:1: ruleNumberFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesNumberFieldValueParserRuleCall_1_1_4_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleNumberFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_4_2_1_1_19551);
            ruleNumberFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValuesNumberFieldValueParserRuleCall_1_1_4_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValuesAssignment_1_1_4_2_1_1_1"


    // $ANTLR start "rule__ClauseExpression__FieldAssignment_1_1_5_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4615:1: rule__ClauseExpression__FieldAssignment_1_1_5_0 : ( ruleModifierField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_1_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4619:1: ( ( ruleModifierField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4620:1: ( ruleModifierField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4620:1: ( ruleModifierField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4621:1: ruleModifierField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldModifierFieldParserRuleCall_1_1_5_0_0()); 
            pushFollow(FOLLOW_ruleModifierField_in_rule__ClauseExpression__FieldAssignment_1_1_5_09582);
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


    // $ANTLR start "rule__ClauseExpression__ValuesAssignment_1_1_5_2_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4630:1: rule__ClauseExpression__ValuesAssignment_1_1_5_2_0 : ( ruleModifierFieldValue ) ;
    public final void rule__ClauseExpression__ValuesAssignment_1_1_5_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4634:1: ( ( ruleModifierFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4635:1: ( ruleModifierFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4635:1: ( ruleModifierFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4636:1: ruleModifierFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesModifierFieldValueParserRuleCall_1_1_5_2_0_0()); 
            pushFollow(FOLLOW_ruleModifierFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_5_2_09613);
            ruleModifierFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValuesModifierFieldValueParserRuleCall_1_1_5_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValuesAssignment_1_1_5_2_0"


    // $ANTLR start "rule__ClauseExpression__ValuesAssignment_1_1_5_2_1_1_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4645:1: rule__ClauseExpression__ValuesAssignment_1_1_5_2_1_1_1 : ( ruleModifierFieldValue ) ;
    public final void rule__ClauseExpression__ValuesAssignment_1_1_5_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4649:1: ( ( ruleModifierFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4650:1: ( ruleModifierFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4650:1: ( ruleModifierFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4651:1: ruleModifierFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesModifierFieldValueParserRuleCall_1_1_5_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleModifierFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_5_2_1_1_19644);
            ruleModifierFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValuesModifierFieldValueParserRuleCall_1_1_5_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValuesAssignment_1_1_5_2_1_1_1"


    // $ANTLR start "rule__ClauseExpression__FieldAssignment_1_1_6_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4660:1: rule__ClauseExpression__FieldAssignment_1_1_6_0 : ( ruleTimeField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_1_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4664:1: ( ( ruleTimeField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4665:1: ( ruleTimeField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4665:1: ( ruleTimeField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4666:1: ruleTimeField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldTimeFieldParserRuleCall_1_1_6_0_0()); 
            pushFollow(FOLLOW_ruleTimeField_in_rule__ClauseExpression__FieldAssignment_1_1_6_09675);
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


    // $ANTLR start "rule__ClauseExpression__ValuesAssignment_1_1_6_2_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4675:1: rule__ClauseExpression__ValuesAssignment_1_1_6_2_0 : ( ruleTimeFieldValue ) ;
    public final void rule__ClauseExpression__ValuesAssignment_1_1_6_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4679:1: ( ( ruleTimeFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4680:1: ( ruleTimeFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4680:1: ( ruleTimeFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4681:1: ruleTimeFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesTimeFieldValueParserRuleCall_1_1_6_2_0_0()); 
            pushFollow(FOLLOW_ruleTimeFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_6_2_09706);
            ruleTimeFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValuesTimeFieldValueParserRuleCall_1_1_6_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValuesAssignment_1_1_6_2_0"


    // $ANTLR start "rule__ClauseExpression__ValuesAssignment_1_1_6_2_1_1_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4690:1: rule__ClauseExpression__ValuesAssignment_1_1_6_2_1_1_1 : ( ruleTimeFieldValue ) ;
    public final void rule__ClauseExpression__ValuesAssignment_1_1_6_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4694:1: ( ( ruleTimeFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4695:1: ( ruleTimeFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4695:1: ( ruleTimeFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4696:1: ruleTimeFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesTimeFieldValueParserRuleCall_1_1_6_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleTimeFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_6_2_1_1_19737);
            ruleTimeFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValuesTimeFieldValueParserRuleCall_1_1_6_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValuesAssignment_1_1_6_2_1_1_1"


    // $ANTLR start "rule__ClauseExpression__FieldAssignment_1_1_7_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4705:1: rule__ClauseExpression__FieldAssignment_1_1_7_0 : ( ruleDocumentTypeField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_1_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4709:1: ( ( ruleDocumentTypeField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4710:1: ( ruleDocumentTypeField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4710:1: ( ruleDocumentTypeField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4711:1: ruleDocumentTypeField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldDocumentTypeFieldParserRuleCall_1_1_7_0_0()); 
            pushFollow(FOLLOW_ruleDocumentTypeField_in_rule__ClauseExpression__FieldAssignment_1_1_7_09768);
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


    // $ANTLR start "rule__ClauseExpression__ValuesAssignment_1_1_7_2_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4720:1: rule__ClauseExpression__ValuesAssignment_1_1_7_2_0 : ( ruleDocumentTypeFieldValue ) ;
    public final void rule__ClauseExpression__ValuesAssignment_1_1_7_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4724:1: ( ( ruleDocumentTypeFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4725:1: ( ruleDocumentTypeFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4725:1: ( ruleDocumentTypeFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4726:1: ruleDocumentTypeFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesDocumentTypeFieldValueParserRuleCall_1_1_7_2_0_0()); 
            pushFollow(FOLLOW_ruleDocumentTypeFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_7_2_09799);
            ruleDocumentTypeFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValuesDocumentTypeFieldValueParserRuleCall_1_1_7_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValuesAssignment_1_1_7_2_0"


    // $ANTLR start "rule__ClauseExpression__ValuesAssignment_1_1_7_2_1_1_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4735:1: rule__ClauseExpression__ValuesAssignment_1_1_7_2_1_1_1 : ( ruleDocumentTypeFieldValue ) ;
    public final void rule__ClauseExpression__ValuesAssignment_1_1_7_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4739:1: ( ( ruleDocumentTypeFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4740:1: ( ruleDocumentTypeFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4740:1: ( ruleDocumentTypeFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4741:1: ruleDocumentTypeFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesDocumentTypeFieldValueParserRuleCall_1_1_7_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleDocumentTypeFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_7_2_1_1_19830);
            ruleDocumentTypeFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValuesDocumentTypeFieldValueParserRuleCall_1_1_7_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValuesAssignment_1_1_7_2_1_1_1"


    // $ANTLR start "rule__ClauseExpression__FieldAssignment_1_1_8_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4750:1: rule__ClauseExpression__FieldAssignment_1_1_8_0 : ( ruleProjectNameField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_1_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4754:1: ( ( ruleProjectNameField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4755:1: ( ruleProjectNameField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4755:1: ( ruleProjectNameField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4756:1: ruleProjectNameField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldProjectNameFieldParserRuleCall_1_1_8_0_0()); 
            pushFollow(FOLLOW_ruleProjectNameField_in_rule__ClauseExpression__FieldAssignment_1_1_8_09861);
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


    // $ANTLR start "rule__ClauseExpression__ValuesAssignment_1_1_8_2_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4765:1: rule__ClauseExpression__ValuesAssignment_1_1_8_2_0 : ( ruleProjectNameFieldValue ) ;
    public final void rule__ClauseExpression__ValuesAssignment_1_1_8_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4769:1: ( ( ruleProjectNameFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4770:1: ( ruleProjectNameFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4770:1: ( ruleProjectNameFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4771:1: ruleProjectNameFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesProjectNameFieldValueParserRuleCall_1_1_8_2_0_0()); 
            pushFollow(FOLLOW_ruleProjectNameFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_8_2_09892);
            ruleProjectNameFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValuesProjectNameFieldValueParserRuleCall_1_1_8_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValuesAssignment_1_1_8_2_0"


    // $ANTLR start "rule__ClauseExpression__ValuesAssignment_1_1_8_2_1_1_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4780:1: rule__ClauseExpression__ValuesAssignment_1_1_8_2_1_1_1 : ( ruleProjectNameFieldValue ) ;
    public final void rule__ClauseExpression__ValuesAssignment_1_1_8_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4784:1: ( ( ruleProjectNameFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4785:1: ( ruleProjectNameFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4785:1: ( ruleProjectNameFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4786:1: ruleProjectNameFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesProjectNameFieldValueParserRuleCall_1_1_8_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleProjectNameFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_8_2_1_1_19923);
            ruleProjectNameFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValuesProjectNameFieldValueParserRuleCall_1_1_8_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValuesAssignment_1_1_8_2_1_1_1"


    // $ANTLR start "rule__ClauseExpression__FieldAssignment_1_1_9_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4795:1: rule__ClauseExpression__FieldAssignment_1_1_9_0 : ( ruleAnnotationField ) ;
    public final void rule__ClauseExpression__FieldAssignment_1_1_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4799:1: ( ( ruleAnnotationField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4800:1: ( ruleAnnotationField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4800:1: ( ruleAnnotationField )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4801:1: ruleAnnotationField
            {
             before(grammarAccess.getClauseExpressionAccess().getFieldAnnotationFieldParserRuleCall_1_1_9_0_0()); 
            pushFollow(FOLLOW_ruleAnnotationField_in_rule__ClauseExpression__FieldAssignment_1_1_9_09954);
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


    // $ANTLR start "rule__ClauseExpression__ValuesAssignment_1_1_9_2_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4810:1: rule__ClauseExpression__ValuesAssignment_1_1_9_2_0 : ( ruleAnnotationFieldValue ) ;
    public final void rule__ClauseExpression__ValuesAssignment_1_1_9_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4814:1: ( ( ruleAnnotationFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4815:1: ( ruleAnnotationFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4815:1: ( ruleAnnotationFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4816:1: ruleAnnotationFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesAnnotationFieldValueParserRuleCall_1_1_9_2_0_0()); 
            pushFollow(FOLLOW_ruleAnnotationFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_9_2_09985);
            ruleAnnotationFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValuesAnnotationFieldValueParserRuleCall_1_1_9_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValuesAssignment_1_1_9_2_0"


    // $ANTLR start "rule__ClauseExpression__ValuesAssignment_1_1_9_2_1_1_1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4825:1: rule__ClauseExpression__ValuesAssignment_1_1_9_2_1_1_1 : ( ruleAnnotationFieldValue ) ;
    public final void rule__ClauseExpression__ValuesAssignment_1_1_9_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4829:1: ( ( ruleAnnotationFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4830:1: ( ruleAnnotationFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4830:1: ( ruleAnnotationFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4831:1: ruleAnnotationFieldValue
            {
             before(grammarAccess.getClauseExpressionAccess().getValuesAnnotationFieldValueParserRuleCall_1_1_9_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleAnnotationFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_9_2_1_1_110016);
            ruleAnnotationFieldValue();

            state._fsp--;

             after(grammarAccess.getClauseExpressionAccess().getValuesAnnotationFieldValueParserRuleCall_1_1_9_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClauseExpression__ValuesAssignment_1_1_9_2_1_1_1"


    // $ANTLR start "rule__SimpleField__FullyQualifiedNameAssignment_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4840:1: rule__SimpleField__FullyQualifiedNameAssignment_0 : ( ( 'FullyQualifiedName' ) ) ;
    public final void rule__SimpleField__FullyQualifiedNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4844:1: ( ( ( 'FullyQualifiedName' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4845:1: ( ( 'FullyQualifiedName' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4845:1: ( ( 'FullyQualifiedName' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4846:1: ( 'FullyQualifiedName' )
            {
             before(grammarAccess.getSimpleFieldAccess().getFullyQualifiedNameFullyQualifiedNameKeyword_0_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4847:1: ( 'FullyQualifiedName' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4848:1: 'FullyQualifiedName'
            {
             before(grammarAccess.getSimpleFieldAccess().getFullyQualifiedNameFullyQualifiedNameKeyword_0_0()); 
            match(input,33,FOLLOW_33_in_rule__SimpleField__FullyQualifiedNameAssignment_010052); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4863:1: rule__SimpleField__FriendlyNameAssignment_1 : ( ( 'FriendlyName' ) ) ;
    public final void rule__SimpleField__FriendlyNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4867:1: ( ( ( 'FriendlyName' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4868:1: ( ( 'FriendlyName' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4868:1: ( ( 'FriendlyName' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4869:1: ( 'FriendlyName' )
            {
             before(grammarAccess.getSimpleFieldAccess().getFriendlyNameFriendlyNameKeyword_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4870:1: ( 'FriendlyName' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4871:1: 'FriendlyName'
            {
             before(grammarAccess.getSimpleFieldAccess().getFriendlyNameFriendlyNameKeyword_1_0()); 
            match(input,34,FOLLOW_34_in_rule__SimpleField__FriendlyNameAssignment_110096); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4886:1: rule__SimpleField__DeclaredMethodsAssignment_2 : ( ( 'DeclaredMethods' ) ) ;
    public final void rule__SimpleField__DeclaredMethodsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4890:1: ( ( ( 'DeclaredMethods' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4891:1: ( ( 'DeclaredMethods' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4891:1: ( ( 'DeclaredMethods' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4892:1: ( 'DeclaredMethods' )
            {
             before(grammarAccess.getSimpleFieldAccess().getDeclaredMethodsDeclaredMethodsKeyword_2_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4893:1: ( 'DeclaredMethods' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4894:1: 'DeclaredMethods'
            {
             before(grammarAccess.getSimpleFieldAccess().getDeclaredMethodsDeclaredMethodsKeyword_2_0()); 
            match(input,35,FOLLOW_35_in_rule__SimpleField__DeclaredMethodsAssignment_210140); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4909:1: rule__SimpleField__ReturnVariableEexpressionsAssignment_3 : ( ( 'ReturnVariableEexpressions' ) ) ;
    public final void rule__SimpleField__ReturnVariableEexpressionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4913:1: ( ( ( 'ReturnVariableEexpressions' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4914:1: ( ( 'ReturnVariableEexpressions' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4914:1: ( ( 'ReturnVariableEexpressions' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4915:1: ( 'ReturnVariableEexpressions' )
            {
             before(grammarAccess.getSimpleFieldAccess().getReturnVariableEexpressionsReturnVariableEexpressionsKeyword_3_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4916:1: ( 'ReturnVariableEexpressions' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4917:1: 'ReturnVariableEexpressions'
            {
             before(grammarAccess.getSimpleFieldAccess().getReturnVariableEexpressionsReturnVariableEexpressionsKeyword_3_0()); 
            match(input,36,FOLLOW_36_in_rule__SimpleField__ReturnVariableEexpressionsAssignment_310184); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4932:1: rule__SimpleField__AllDeclaredMethodNamesAssignment_4 : ( ( 'AllDeclaredMethodNames' ) ) ;
    public final void rule__SimpleField__AllDeclaredMethodNamesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4936:1: ( ( ( 'AllDeclaredMethodNames' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4937:1: ( ( 'AllDeclaredMethodNames' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4937:1: ( ( 'AllDeclaredMethodNames' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4938:1: ( 'AllDeclaredMethodNames' )
            {
             before(grammarAccess.getSimpleFieldAccess().getAllDeclaredMethodNamesAllDeclaredMethodNamesKeyword_4_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4939:1: ( 'AllDeclaredMethodNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4940:1: 'AllDeclaredMethodNames'
            {
             before(grammarAccess.getSimpleFieldAccess().getAllDeclaredMethodNamesAllDeclaredMethodNamesKeyword_4_0()); 
            match(input,37,FOLLOW_37_in_rule__SimpleField__AllDeclaredMethodNamesAssignment_410228); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4955:1: rule__SimpleField__DeclaredMethodNamesAssignment_5 : ( ( 'DeclaredMethodNames' ) ) ;
    public final void rule__SimpleField__DeclaredMethodNamesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4959:1: ( ( ( 'DeclaredMethodNames' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4960:1: ( ( 'DeclaredMethodNames' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4960:1: ( ( 'DeclaredMethodNames' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4961:1: ( 'DeclaredMethodNames' )
            {
             before(grammarAccess.getSimpleFieldAccess().getDeclaredMethodNamesDeclaredMethodNamesKeyword_5_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4962:1: ( 'DeclaredMethodNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4963:1: 'DeclaredMethodNames'
            {
             before(grammarAccess.getSimpleFieldAccess().getDeclaredMethodNamesDeclaredMethodNamesKeyword_5_0()); 
            match(input,38,FOLLOW_38_in_rule__SimpleField__DeclaredMethodNamesAssignment_510272); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4978:1: rule__SimpleField__DeclaredFieldNamesAssignment_6 : ( ( 'DeclaredFieldNames' ) ) ;
    public final void rule__SimpleField__DeclaredFieldNamesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4982:1: ( ( ( 'DeclaredFieldNames' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4983:1: ( ( 'DeclaredFieldNames' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4983:1: ( ( 'DeclaredFieldNames' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4984:1: ( 'DeclaredFieldNames' )
            {
             before(grammarAccess.getSimpleFieldAccess().getDeclaredFieldNamesDeclaredFieldNamesKeyword_6_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4985:1: ( 'DeclaredFieldNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:4986:1: 'DeclaredFieldNames'
            {
             before(grammarAccess.getSimpleFieldAccess().getDeclaredFieldNamesDeclaredFieldNamesKeyword_6_0()); 
            match(input,39,FOLLOW_39_in_rule__SimpleField__DeclaredFieldNamesAssignment_610316); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5001:1: rule__SimpleField__AllDeclaredFieldNamesAssignment_7 : ( ( 'AllDeclaredFieldNames' ) ) ;
    public final void rule__SimpleField__AllDeclaredFieldNamesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5005:1: ( ( ( 'AllDeclaredFieldNames' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5006:1: ( ( 'AllDeclaredFieldNames' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5006:1: ( ( 'AllDeclaredFieldNames' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5007:1: ( 'AllDeclaredFieldNames' )
            {
             before(grammarAccess.getSimpleFieldAccess().getAllDeclaredFieldNamesAllDeclaredFieldNamesKeyword_7_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5008:1: ( 'AllDeclaredFieldNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5009:1: 'AllDeclaredFieldNames'
            {
             before(grammarAccess.getSimpleFieldAccess().getAllDeclaredFieldNamesAllDeclaredFieldNamesKeyword_7_0()); 
            match(input,40,FOLLOW_40_in_rule__SimpleField__AllDeclaredFieldNamesAssignment_710360); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5024:1: rule__SimpleField__FullTextAssignment_8 : ( ( 'FullText' ) ) ;
    public final void rule__SimpleField__FullTextAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5028:1: ( ( ( 'FullText' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5029:1: ( ( 'FullText' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5029:1: ( ( 'FullText' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5030:1: ( 'FullText' )
            {
             before(grammarAccess.getSimpleFieldAccess().getFullTextFullTextKeyword_8_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5031:1: ( 'FullText' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5032:1: 'FullText'
            {
             before(grammarAccess.getSimpleFieldAccess().getFullTextFullTextKeyword_8_0()); 
            match(input,41,FOLLOW_41_in_rule__SimpleField__FullTextAssignment_810404); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5047:1: rule__SimpleField__FieldsReadAssignment_9 : ( ( 'FieldsRead' ) ) ;
    public final void rule__SimpleField__FieldsReadAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5051:1: ( ( ( 'FieldsRead' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5052:1: ( ( 'FieldsRead' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5052:1: ( ( 'FieldsRead' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5053:1: ( 'FieldsRead' )
            {
             before(grammarAccess.getSimpleFieldAccess().getFieldsReadFieldsReadKeyword_9_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5054:1: ( 'FieldsRead' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5055:1: 'FieldsRead'
            {
             before(grammarAccess.getSimpleFieldAccess().getFieldsReadFieldsReadKeyword_9_0()); 
            match(input,42,FOLLOW_42_in_rule__SimpleField__FieldsReadAssignment_910448); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5070:1: rule__SimpleField__FieldsWrittenAssignment_10 : ( ( 'FieldsWritten' ) ) ;
    public final void rule__SimpleField__FieldsWrittenAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5074:1: ( ( ( 'FieldsWritten' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5075:1: ( ( 'FieldsWritten' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5075:1: ( ( 'FieldsWritten' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5076:1: ( 'FieldsWritten' )
            {
             before(grammarAccess.getSimpleFieldAccess().getFieldsWrittenFieldsWrittenKeyword_10_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5077:1: ( 'FieldsWritten' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5078:1: 'FieldsWritten'
            {
             before(grammarAccess.getSimpleFieldAccess().getFieldsWrittenFieldsWrittenKeyword_10_0()); 
            match(input,43,FOLLOW_43_in_rule__SimpleField__FieldsWrittenAssignment_1010492); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5093:1: rule__SimpleField__UsedFieldsInFinallyAssignment_11 : ( ( 'UsedFieldsInFinally' ) ) ;
    public final void rule__SimpleField__UsedFieldsInFinallyAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5097:1: ( ( ( 'UsedFieldsInFinally' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5098:1: ( ( 'UsedFieldsInFinally' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5098:1: ( ( 'UsedFieldsInFinally' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5099:1: ( 'UsedFieldsInFinally' )
            {
             before(grammarAccess.getSimpleFieldAccess().getUsedFieldsInFinallyUsedFieldsInFinallyKeyword_11_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5100:1: ( 'UsedFieldsInFinally' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5101:1: 'UsedFieldsInFinally'
            {
             before(grammarAccess.getSimpleFieldAccess().getUsedFieldsInFinallyUsedFieldsInFinallyKeyword_11_0()); 
            match(input,44,FOLLOW_44_in_rule__SimpleField__UsedFieldsInFinallyAssignment_1110536); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5116:1: rule__SimpleField__UsedFieldsInTryAssignment_12 : ( ( 'UsedFieldsInTry' ) ) ;
    public final void rule__SimpleField__UsedFieldsInTryAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5120:1: ( ( ( 'UsedFieldsInTry' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5121:1: ( ( 'UsedFieldsInTry' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5121:1: ( ( 'UsedFieldsInTry' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5122:1: ( 'UsedFieldsInTry' )
            {
             before(grammarAccess.getSimpleFieldAccess().getUsedFieldsInTryUsedFieldsInTryKeyword_12_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5123:1: ( 'UsedFieldsInTry' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5124:1: 'UsedFieldsInTry'
            {
             before(grammarAccess.getSimpleFieldAccess().getUsedFieldsInTryUsedFieldsInTryKeyword_12_0()); 
            match(input,45,FOLLOW_45_in_rule__SimpleField__UsedFieldsInTryAssignment_1210580); 
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


    // $ANTLR start "rule__TypeField__ImplementedTypesAssignment_0"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5139:1: rule__TypeField__ImplementedTypesAssignment_0 : ( ( 'ImplementedTypes' ) ) ;
    public final void rule__TypeField__ImplementedTypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5143:1: ( ( ( 'ImplementedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5144:1: ( ( 'ImplementedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5144:1: ( ( 'ImplementedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5145:1: ( 'ImplementedTypes' )
            {
             before(grammarAccess.getTypeFieldAccess().getImplementedTypesImplementedTypesKeyword_0_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5146:1: ( 'ImplementedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5147:1: 'ImplementedTypes'
            {
             before(grammarAccess.getTypeFieldAccess().getImplementedTypesImplementedTypesKeyword_0_0()); 
            match(input,46,FOLLOW_46_in_rule__TypeField__ImplementedTypesAssignment_010624); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5162:1: rule__TypeField__ExtendedTypesAssignment_1 : ( ( 'ExtendedTypes' ) ) ;
    public final void rule__TypeField__ExtendedTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5166:1: ( ( ( 'ExtendedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5167:1: ( ( 'ExtendedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5167:1: ( ( 'ExtendedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5168:1: ( 'ExtendedTypes' )
            {
             before(grammarAccess.getTypeFieldAccess().getExtendedTypesExtendedTypesKeyword_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5169:1: ( 'ExtendedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5170:1: 'ExtendedTypes'
            {
             before(grammarAccess.getTypeFieldAccess().getExtendedTypesExtendedTypesKeyword_1_0()); 
            match(input,47,FOLLOW_47_in_rule__TypeField__ExtendedTypesAssignment_110668); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5185:1: rule__TypeField__UsedTypesAssignment_2 : ( ( 'UsedTypes' ) ) ;
    public final void rule__TypeField__UsedTypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5189:1: ( ( ( 'UsedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5190:1: ( ( 'UsedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5190:1: ( ( 'UsedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5191:1: ( 'UsedTypes' )
            {
             before(grammarAccess.getTypeFieldAccess().getUsedTypesUsedTypesKeyword_2_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5192:1: ( 'UsedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5193:1: 'UsedTypes'
            {
             before(grammarAccess.getTypeFieldAccess().getUsedTypesUsedTypesKeyword_2_0()); 
            match(input,48,FOLLOW_48_in_rule__TypeField__UsedTypesAssignment_210712); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5208:1: rule__TypeField__UsedTypesInTryAssignment_3 : ( ( 'UsedTypesInTry' ) ) ;
    public final void rule__TypeField__UsedTypesInTryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5212:1: ( ( ( 'UsedTypesInTry' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5213:1: ( ( 'UsedTypesInTry' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5213:1: ( ( 'UsedTypesInTry' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5214:1: ( 'UsedTypesInTry' )
            {
             before(grammarAccess.getTypeFieldAccess().getUsedTypesInTryUsedTypesInTryKeyword_3_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5215:1: ( 'UsedTypesInTry' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5216:1: 'UsedTypesInTry'
            {
             before(grammarAccess.getTypeFieldAccess().getUsedTypesInTryUsedTypesInTryKeyword_3_0()); 
            match(input,49,FOLLOW_49_in_rule__TypeField__UsedTypesInTryAssignment_310756); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5231:1: rule__TypeField__UsedTypesInFinallyAssignment_4 : ( ( 'UsedTypesInFinally' ) ) ;
    public final void rule__TypeField__UsedTypesInFinallyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5235:1: ( ( ( 'UsedTypesInFinally' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5236:1: ( ( 'UsedTypesInFinally' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5236:1: ( ( 'UsedTypesInFinally' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5237:1: ( 'UsedTypesInFinally' )
            {
             before(grammarAccess.getTypeFieldAccess().getUsedTypesInFinallyUsedTypesInFinallyKeyword_4_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5238:1: ( 'UsedTypesInFinally' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5239:1: 'UsedTypesInFinally'
            {
             before(grammarAccess.getTypeFieldAccess().getUsedTypesInFinallyUsedTypesInFinallyKeyword_4_0()); 
            match(input,50,FOLLOW_50_in_rule__TypeField__UsedTypesInFinallyAssignment_410800); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5254:1: rule__TypeField__ParameterTypesAssignment_5 : ( ( 'ParameterTypes' ) ) ;
    public final void rule__TypeField__ParameterTypesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5258:1: ( ( ( 'ParameterTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5259:1: ( ( 'ParameterTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5259:1: ( ( 'ParameterTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5260:1: ( 'ParameterTypes' )
            {
             before(grammarAccess.getTypeFieldAccess().getParameterTypesParameterTypesKeyword_5_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5261:1: ( 'ParameterTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5262:1: 'ParameterTypes'
            {
             before(grammarAccess.getTypeFieldAccess().getParameterTypesParameterTypesKeyword_5_0()); 
            match(input,51,FOLLOW_51_in_rule__TypeField__ParameterTypesAssignment_510844); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5277:1: rule__TypeField__ReturnTypeAssignment_6 : ( ( 'ReturnType' ) ) ;
    public final void rule__TypeField__ReturnTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5281:1: ( ( ( 'ReturnType' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5282:1: ( ( 'ReturnType' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5282:1: ( ( 'ReturnType' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5283:1: ( 'ReturnType' )
            {
             before(grammarAccess.getTypeFieldAccess().getReturnTypeReturnTypeKeyword_6_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5284:1: ( 'ReturnType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5285:1: 'ReturnType'
            {
             before(grammarAccess.getTypeFieldAccess().getReturnTypeReturnTypeKeyword_6_0()); 
            match(input,52,FOLLOW_52_in_rule__TypeField__ReturnTypeAssignment_610888); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5300:1: rule__TypeField__InstanceofTypesAssignment_7 : ( ( 'InstanceofTypes' ) ) ;
    public final void rule__TypeField__InstanceofTypesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5304:1: ( ( ( 'InstanceofTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5305:1: ( ( 'InstanceofTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5305:1: ( ( 'InstanceofTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5306:1: ( 'InstanceofTypes' )
            {
             before(grammarAccess.getTypeFieldAccess().getInstanceofTypesInstanceofTypesKeyword_7_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5307:1: ( 'InstanceofTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5308:1: 'InstanceofTypes'
            {
             before(grammarAccess.getTypeFieldAccess().getInstanceofTypesInstanceofTypesKeyword_7_0()); 
            match(input,53,FOLLOW_53_in_rule__TypeField__InstanceofTypesAssignment_710932); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5323:1: rule__TypeField__AllImplementedTypesAssignment_8 : ( ( 'AllImplementedTypes' ) ) ;
    public final void rule__TypeField__AllImplementedTypesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5327:1: ( ( ( 'AllImplementedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5328:1: ( ( 'AllImplementedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5328:1: ( ( 'AllImplementedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5329:1: ( 'AllImplementedTypes' )
            {
             before(grammarAccess.getTypeFieldAccess().getAllImplementedTypesAllImplementedTypesKeyword_8_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5330:1: ( 'AllImplementedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5331:1: 'AllImplementedTypes'
            {
             before(grammarAccess.getTypeFieldAccess().getAllImplementedTypesAllImplementedTypesKeyword_8_0()); 
            match(input,54,FOLLOW_54_in_rule__TypeField__AllImplementedTypesAssignment_810976); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5346:1: rule__TypeField__AllExtendedTypesAssignment_9 : ( ( 'AllExtendedTypes' ) ) ;
    public final void rule__TypeField__AllExtendedTypesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5350:1: ( ( ( 'AllExtendedTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5351:1: ( ( 'AllExtendedTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5351:1: ( ( 'AllExtendedTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5352:1: ( 'AllExtendedTypes' )
            {
             before(grammarAccess.getTypeFieldAccess().getAllExtendedTypesAllExtendedTypesKeyword_9_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5353:1: ( 'AllExtendedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5354:1: 'AllExtendedTypes'
            {
             before(grammarAccess.getTypeFieldAccess().getAllExtendedTypesAllExtendedTypesKeyword_9_0()); 
            match(input,55,FOLLOW_55_in_rule__TypeField__AllExtendedTypesAssignment_911020); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5369:1: rule__TypeField__FieldTypeAssignment_10 : ( ( 'FieldType' ) ) ;
    public final void rule__TypeField__FieldTypeAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5373:1: ( ( ( 'FieldType' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5374:1: ( ( 'FieldType' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5374:1: ( ( 'FieldType' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5375:1: ( 'FieldType' )
            {
             before(grammarAccess.getTypeFieldAccess().getFieldTypeFieldTypeKeyword_10_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5376:1: ( 'FieldType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5377:1: 'FieldType'
            {
             before(grammarAccess.getTypeFieldAccess().getFieldTypeFieldTypeKeyword_10_0()); 
            match(input,56,FOLLOW_56_in_rule__TypeField__FieldTypeAssignment_1011064); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5392:1: rule__TypeField__CaughtTypeAssignment_11 : ( ( 'CaughtType' ) ) ;
    public final void rule__TypeField__CaughtTypeAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5396:1: ( ( ( 'CaughtType' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5397:1: ( ( 'CaughtType' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5397:1: ( ( 'CaughtType' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5398:1: ( 'CaughtType' )
            {
             before(grammarAccess.getTypeFieldAccess().getCaughtTypeCaughtTypeKeyword_11_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5399:1: ( 'CaughtType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5400:1: 'CaughtType'
            {
             before(grammarAccess.getTypeFieldAccess().getCaughtTypeCaughtTypeKeyword_11_0()); 
            match(input,57,FOLLOW_57_in_rule__TypeField__CaughtTypeAssignment_1111108); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5415:1: rule__TypeField__DeclaredFieldTypesAssignment_12 : ( ( 'DeclaredFieldTypes' ) ) ;
    public final void rule__TypeField__DeclaredFieldTypesAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5419:1: ( ( ( 'DeclaredFieldTypes' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5420:1: ( ( 'DeclaredFieldTypes' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5420:1: ( ( 'DeclaredFieldTypes' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5421:1: ( 'DeclaredFieldTypes' )
            {
             before(grammarAccess.getTypeFieldAccess().getDeclaredFieldTypesDeclaredFieldTypesKeyword_12_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5422:1: ( 'DeclaredFieldTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5423:1: 'DeclaredFieldTypes'
            {
             before(grammarAccess.getTypeFieldAccess().getDeclaredFieldTypesDeclaredFieldTypesKeyword_12_0()); 
            match(input,58,FOLLOW_58_in_rule__TypeField__DeclaredFieldTypesAssignment_1211152); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5438:1: rule__TypeField__DeclaringTypeAssignment_13 : ( ( 'DeclaringType' ) ) ;
    public final void rule__TypeField__DeclaringTypeAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5442:1: ( ( ( 'DeclaringType' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5443:1: ( ( 'DeclaringType' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5443:1: ( ( 'DeclaringType' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5444:1: ( 'DeclaringType' )
            {
             before(grammarAccess.getTypeFieldAccess().getDeclaringTypeDeclaringTypeKeyword_13_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5445:1: ( 'DeclaringType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5446:1: 'DeclaringType'
            {
             before(grammarAccess.getTypeFieldAccess().getDeclaringTypeDeclaringTypeKeyword_13_0()); 
            match(input,59,FOLLOW_59_in_rule__TypeField__DeclaringTypeAssignment_1311196); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5461:1: rule__MethodField__UsedMethodsAssignment_0 : ( ( 'UsedMethods' ) ) ;
    public final void rule__MethodField__UsedMethodsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5465:1: ( ( ( 'UsedMethods' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5466:1: ( ( 'UsedMethods' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5466:1: ( ( 'UsedMethods' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5467:1: ( 'UsedMethods' )
            {
             before(grammarAccess.getMethodFieldAccess().getUsedMethodsUsedMethodsKeyword_0_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5468:1: ( 'UsedMethods' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5469:1: 'UsedMethods'
            {
             before(grammarAccess.getMethodFieldAccess().getUsedMethodsUsedMethodsKeyword_0_0()); 
            match(input,60,FOLLOW_60_in_rule__MethodField__UsedMethodsAssignment_011240); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5484:1: rule__MethodField__UsedMethodsInTryAssignment_1 : ( ( 'UsedMethodsInTry' ) ) ;
    public final void rule__MethodField__UsedMethodsInTryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5488:1: ( ( ( 'UsedMethodsInTry' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5489:1: ( ( 'UsedMethodsInTry' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5489:1: ( ( 'UsedMethodsInTry' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5490:1: ( 'UsedMethodsInTry' )
            {
             before(grammarAccess.getMethodFieldAccess().getUsedMethodsInTryUsedMethodsInTryKeyword_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5491:1: ( 'UsedMethodsInTry' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5492:1: 'UsedMethodsInTry'
            {
             before(grammarAccess.getMethodFieldAccess().getUsedMethodsInTryUsedMethodsInTryKeyword_1_0()); 
            match(input,61,FOLLOW_61_in_rule__MethodField__UsedMethodsInTryAssignment_111284); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5507:1: rule__MethodField__UsedMethodsInFinallyAssignment_2 : ( ( 'UsedMethodsInFinally' ) ) ;
    public final void rule__MethodField__UsedMethodsInFinallyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5511:1: ( ( ( 'UsedMethodsInFinally' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5512:1: ( ( 'UsedMethodsInFinally' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5512:1: ( ( 'UsedMethodsInFinally' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5513:1: ( 'UsedMethodsInFinally' )
            {
             before(grammarAccess.getMethodFieldAccess().getUsedMethodsInFinallyUsedMethodsInFinallyKeyword_2_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5514:1: ( 'UsedMethodsInFinally' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5515:1: 'UsedMethodsInFinally'
            {
             before(grammarAccess.getMethodFieldAccess().getUsedMethodsInFinallyUsedMethodsInFinallyKeyword_2_0()); 
            match(input,62,FOLLOW_62_in_rule__MethodField__UsedMethodsInFinallyAssignment_211328); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5530:1: rule__MethodField__OverriddenMethodsAssignment_3 : ( ( 'OverriddenMethods' ) ) ;
    public final void rule__MethodField__OverriddenMethodsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5534:1: ( ( ( 'OverriddenMethods' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5535:1: ( ( 'OverriddenMethods' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5535:1: ( ( 'OverriddenMethods' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5536:1: ( 'OverriddenMethods' )
            {
             before(grammarAccess.getMethodFieldAccess().getOverriddenMethodsOverriddenMethodsKeyword_3_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5537:1: ( 'OverriddenMethods' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5538:1: 'OverriddenMethods'
            {
             before(grammarAccess.getMethodFieldAccess().getOverriddenMethodsOverriddenMethodsKeyword_3_0()); 
            match(input,63,FOLLOW_63_in_rule__MethodField__OverriddenMethodsAssignment_311372); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5553:1: rule__FilePathField__ResourcePathAssignment : ( ( 'ResourcePath' ) ) ;
    public final void rule__FilePathField__ResourcePathAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5557:1: ( ( ( 'ResourcePath' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5558:1: ( ( 'ResourcePath' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5558:1: ( ( 'ResourcePath' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5559:1: ( 'ResourcePath' )
            {
             before(grammarAccess.getFilePathFieldAccess().getResourcePathResourcePathKeyword_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5560:1: ( 'ResourcePath' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5561:1: 'ResourcePath'
            {
             before(grammarAccess.getFilePathFieldAccess().getResourcePathResourcePathKeyword_0()); 
            match(input,64,FOLLOW_64_in_rule__FilePathField__ResourcePathAssignment11416); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5576:1: rule__NumberField__ParameterCountAssignment : ( ( 'ParameterCount' ) ) ;
    public final void rule__NumberField__ParameterCountAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5580:1: ( ( ( 'ParameterCount' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5581:1: ( ( 'ParameterCount' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5581:1: ( ( 'ParameterCount' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5582:1: ( 'ParameterCount' )
            {
             before(grammarAccess.getNumberFieldAccess().getParameterCountParameterCountKeyword_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5583:1: ( 'ParameterCount' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5584:1: 'ParameterCount'
            {
             before(grammarAccess.getNumberFieldAccess().getParameterCountParameterCountKeyword_0()); 
            match(input,65,FOLLOW_65_in_rule__NumberField__ParameterCountAssignment11460); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5599:1: rule__ModifierField__ModifiersAssignment : ( ( 'Modifiers' ) ) ;
    public final void rule__ModifierField__ModifiersAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5603:1: ( ( ( 'Modifiers' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5604:1: ( ( 'Modifiers' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5604:1: ( ( 'Modifiers' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5605:1: ( 'Modifiers' )
            {
             before(grammarAccess.getModifierFieldAccess().getModifiersModifiersKeyword_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5606:1: ( 'Modifiers' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5607:1: 'Modifiers'
            {
             before(grammarAccess.getModifierFieldAccess().getModifiersModifiersKeyword_0()); 
            match(input,66,FOLLOW_66_in_rule__ModifierField__ModifiersAssignment11504); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5622:1: rule__TimeField__TimestampAssignment : ( ( 'Timestamp' ) ) ;
    public final void rule__TimeField__TimestampAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5626:1: ( ( ( 'Timestamp' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5627:1: ( ( 'Timestamp' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5627:1: ( ( 'Timestamp' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5628:1: ( 'Timestamp' )
            {
             before(grammarAccess.getTimeFieldAccess().getTimestampTimestampKeyword_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5629:1: ( 'Timestamp' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5630:1: 'Timestamp'
            {
             before(grammarAccess.getTimeFieldAccess().getTimestampTimestampKeyword_0()); 
            match(input,67,FOLLOW_67_in_rule__TimeField__TimestampAssignment11548); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5645:1: rule__DocumentTypeField__TypeAssignment : ( ( 'Type' ) ) ;
    public final void rule__DocumentTypeField__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5649:1: ( ( ( 'Type' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5650:1: ( ( 'Type' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5650:1: ( ( 'Type' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5651:1: ( 'Type' )
            {
             before(grammarAccess.getDocumentTypeFieldAccess().getTypeTypeKeyword_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5652:1: ( 'Type' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5653:1: 'Type'
            {
             before(grammarAccess.getDocumentTypeFieldAccess().getTypeTypeKeyword_0()); 
            match(input,68,FOLLOW_68_in_rule__DocumentTypeField__TypeAssignment11592); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5668:1: rule__ProjectNameField__ProjectNameAssignment : ( ( 'ProjectName' ) ) ;
    public final void rule__ProjectNameField__ProjectNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5672:1: ( ( ( 'ProjectName' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5673:1: ( ( 'ProjectName' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5673:1: ( ( 'ProjectName' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5674:1: ( 'ProjectName' )
            {
             before(grammarAccess.getProjectNameFieldAccess().getProjectNameProjectNameKeyword_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5675:1: ( 'ProjectName' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5676:1: 'ProjectName'
            {
             before(grammarAccess.getProjectNameFieldAccess().getProjectNameProjectNameKeyword_0()); 
            match(input,69,FOLLOW_69_in_rule__ProjectNameField__ProjectNameAssignment11636); 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5691:1: rule__AnnotationField__AnnotationsAssignment : ( ( 'Annotations' ) ) ;
    public final void rule__AnnotationField__AnnotationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5695:1: ( ( ( 'Annotations' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5696:1: ( ( 'Annotations' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5696:1: ( ( 'Annotations' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5697:1: ( 'Annotations' )
            {
             before(grammarAccess.getAnnotationFieldAccess().getAnnotationsAnnotationsKeyword_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5698:1: ( 'Annotations' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:5699:1: 'Annotations'
            {
             before(grammarAccess.getAnnotationFieldAccess().getAnnotationsAnnotationsKeyword_0()); 
            match(input,70,FOLLOW_70_in_rule__AnnotationField__AnnotationsAssignment11680); 
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
    public static final BitSet FOLLOW_ruleSimpleField_in_entryRuleSimpleField241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleField248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__Alternatives_in_ruleSimpleField274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeField_in_entryRuleTypeField301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeField308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__Alternatives_in_ruleTypeField334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodField_in_entryRuleMethodField361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodField368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodField__Alternatives_in_ruleMethodField394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilePathField_in_entryRuleFilePathField421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilePathField428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilePathField__ResourcePathAssignment_in_ruleFilePathField454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberField_in_entryRuleNumberField481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberField488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberField__ParameterCountAssignment_in_ruleNumberField514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierField_in_entryRuleModifierField541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifierField548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModifierField__ModifiersAssignment_in_ruleModifierField574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeField_in_entryRuleTimeField601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeField608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeField__TimestampAssignment_in_ruleTimeField634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentTypeField_in_entryRuleDocumentTypeField661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocumentTypeField668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentTypeField__TypeAssignment_in_ruleDocumentTypeField694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectNameField_in_entryRuleProjectNameField721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjectNameField728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectNameField__ProjectNameAssignment_in_ruleProjectNameField754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationField_in_entryRuleAnnotationField781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationField788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationField__AnnotationsAssignment_in_ruleAnnotationField814 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression1374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Alternatives_in_ruleUnaryExpression1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilePathFieldValue_in_entryRuleFilePathFieldValue1434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilePathFieldValue1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PATHWITHWC_in_ruleFilePathFieldValue1467 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_0_2_0_in_rule__ClauseExpression__Alternatives_1_1_0_21835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_0_2_1__0_in_rule__ClauseExpression__Alternatives_1_1_0_21853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_1_2_0_in_rule__ClauseExpression__Alternatives_1_1_1_21886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_1_2_1__0_in_rule__ClauseExpression__Alternatives_1_1_1_21904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_2_2_0_in_rule__ClauseExpression__Alternatives_1_1_2_21937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_2_2_1__0_in_rule__ClauseExpression__Alternatives_1_1_2_21955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_3_2_0_in_rule__ClauseExpression__Alternatives_1_1_3_21988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_3_2_1__0_in_rule__ClauseExpression__Alternatives_1_1_3_22006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_4_2_0_in_rule__ClauseExpression__Alternatives_1_1_4_22039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_4_2_1__0_in_rule__ClauseExpression__Alternatives_1_1_4_22057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_5_2_0_in_rule__ClauseExpression__Alternatives_1_1_5_22090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_5_2_1__0_in_rule__ClauseExpression__Alternatives_1_1_5_22108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_6_2_0_in_rule__ClauseExpression__Alternatives_1_1_6_22141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_6_2_1__0_in_rule__ClauseExpression__Alternatives_1_1_6_22159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_7_2_0_in_rule__ClauseExpression__Alternatives_1_1_7_22192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_7_2_1__0_in_rule__ClauseExpression__Alternatives_1_1_7_22210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_8_2_0_in_rule__ClauseExpression__Alternatives_1_1_8_22243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_8_2_1__0_in_rule__ClauseExpression__Alternatives_1_1_8_22261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_9_2_0_in_rule__ClauseExpression__Alternatives_1_1_9_22294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_9_2_1__0_in_rule__ClauseExpression__Alternatives_1_1_9_22312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__FullyQualifiedNameAssignment_0_in_rule__SimpleField__Alternatives2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__FriendlyNameAssignment_1_in_rule__SimpleField__Alternatives2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__DeclaredMethodsAssignment_2_in_rule__SimpleField__Alternatives2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__ReturnVariableEexpressionsAssignment_3_in_rule__SimpleField__Alternatives2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__AllDeclaredMethodNamesAssignment_4_in_rule__SimpleField__Alternatives2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__DeclaredMethodNamesAssignment_5_in_rule__SimpleField__Alternatives2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__DeclaredFieldNamesAssignment_6_in_rule__SimpleField__Alternatives2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__AllDeclaredFieldNamesAssignment_7_in_rule__SimpleField__Alternatives2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__FullTextAssignment_8_in_rule__SimpleField__Alternatives2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__FieldsReadAssignment_9_in_rule__SimpleField__Alternatives2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__FieldsWrittenAssignment_10_in_rule__SimpleField__Alternatives2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__UsedFieldsInFinallyAssignment_11_in_rule__SimpleField__Alternatives2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__UsedFieldsInTryAssignment_12_in_rule__SimpleField__Alternatives2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__ImplementedTypesAssignment_0_in_rule__TypeField__Alternatives2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__ExtendedTypesAssignment_1_in_rule__TypeField__Alternatives2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__UsedTypesAssignment_2_in_rule__TypeField__Alternatives2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__UsedTypesInTryAssignment_3_in_rule__TypeField__Alternatives2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__UsedTypesInFinallyAssignment_4_in_rule__TypeField__Alternatives2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__ParameterTypesAssignment_5_in_rule__TypeField__Alternatives2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__ReturnTypeAssignment_6_in_rule__TypeField__Alternatives2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__InstanceofTypesAssignment_7_in_rule__TypeField__Alternatives2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__AllImplementedTypesAssignment_8_in_rule__TypeField__Alternatives2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__AllExtendedTypesAssignment_9_in_rule__TypeField__Alternatives2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__FieldTypeAssignment_10_in_rule__TypeField__Alternatives2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__CaughtTypeAssignment_11_in_rule__TypeField__Alternatives2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__DeclaredFieldTypesAssignment_12_in_rule__TypeField__Alternatives2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeField__DeclaringTypeAssignment_13_in_rule__TypeField__Alternatives2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodField__UsedMethodsAssignment_0_in_rule__MethodField__Alternatives2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodField__UsedMethodsInTryAssignment_1_in_rule__MethodField__Alternatives2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodField__UsedMethodsInFinallyAssignment_2_in_rule__MethodField__Alternatives2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodField__OverriddenMethodsAssignment_3_in_rule__MethodField__Alternatives2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ModifierFieldValue__Alternatives2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ModifierFieldValue__Alternatives2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ModifierFieldValue__Alternatives2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ModifierFieldValue__Alternatives3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ModifierFieldValue__Alternatives3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ModifierFieldValue__Alternatives3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DocumentTypeFieldValue__Alternatives3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DocumentTypeFieldValue__Alternatives3104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DocumentTypeFieldValue__Alternatives3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DocumentTypeFieldValue__Alternatives3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__UnaryExpression__Alternatives3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__UnaryExpression__Alternatives3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__UnaryExpression__Alternatives3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__UnaryExpression__Alternatives3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BinaryExp__Alternatives3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BinaryExp__Alternatives3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__BinaryExp__Alternatives3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group__0__Impl_in_rule__Exp1__Group__03349 = new BitSet(new long[]{0xFFFFFFFE7F800010L,0x000000000000007FL});
    public static final BitSet FOLLOW_rule__Exp1__Group__1_in_rule__Exp1__Group__03352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp2_in_rule__Exp1__Group__0__Impl3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group__1__Impl_in_rule__Exp1__Group__13408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__0_in_rule__Exp1__Group__1__Impl3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__0__Impl_in_rule__Exp1__Group_1__03470 = new BitSet(new long[]{0xFFFFFFFE7F800010L,0x000000000000007FL});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__1_in_rule__Exp1__Group_1__03473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__1__Impl_in_rule__Exp1__Group_1__13531 = new BitSet(new long[]{0xFFFFFFFE7F800010L,0x000000000000007FL});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__2_in_rule__Exp1__Group_1__13534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__BAssignment_1_1_in_rule__Exp1__Group_1__1__Impl3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__Group_1__2__Impl_in_rule__Exp1__Group_1__23592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp1__RightAssignment_1_2_in_rule__Exp1__Group_1__2__Impl3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__0__Impl_in_rule__Exp2__Group_1__03655 = new BitSet(new long[]{0xFFFFFFFE7F800010L,0x000000000000007FL});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__1_in_rule__Exp2__Group_1__03658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__Exp2__Group_1__0__Impl3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__1__Impl_in_rule__Exp2__Group_1__13717 = new BitSet(new long[]{0xFFFFFFFE7F800010L,0x000000000000007FL});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__2_in_rule__Exp2__Group_1__13720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Exp2__Group_1__1__Impl3748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__2__Impl_in_rule__Exp2__Group_1__23779 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__3_in_rule__Exp2__Group_1__23782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp1_in_rule__Exp2__Group_1__2__Impl3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exp2__Group_1__3__Impl_in_rule__Exp2__Group_1__33838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Exp2__Group_1__3__Impl3866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group__0__Impl_in_rule__ClauseExpression__Group__03905 = new BitSet(new long[]{0xFFFFFFFE07800010L,0x000000000000007FL});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group__1_in_rule__ClauseExpression__Group__03908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__ClauseExpression__Group__0__Impl3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group__1__Impl_in_rule__ClauseExpression__Group__13967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Alternatives_1_in_rule__ClauseExpression__Group__1__Impl3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_0__0__Impl_in_rule__ClauseExpression__Group_1_1_0__04028 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_0__1_in_rule__ClauseExpression__Group_1_1_0__04031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_0_0_in_rule__ClauseExpression__Group_1_1_0__0__Impl4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_0__1__Impl_in_rule__ClauseExpression__Group_1_1_0__14088 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_0__2_in_rule__ClauseExpression__Group_1_1_0__14091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ClauseExpression__Group_1_1_0__1__Impl4119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_0__2__Impl_in_rule__ClauseExpression__Group_1_1_0__24150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Alternatives_1_1_0_2_in_rule__ClauseExpression__Group_1_1_0__2__Impl4177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_0_2_1__0__Impl_in_rule__ClauseExpression__Group_1_1_0_2_1__04213 = new BitSet(new long[]{0x0000000087800010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_0_2_1__1_in_rule__ClauseExpression__Group_1_1_0_2_1__04216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ClauseExpression__Group_1_1_0_2_1__0__Impl4244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_0_2_1__1__Impl_in_rule__ClauseExpression__Group_1_1_0_2_1__14275 = new BitSet(new long[]{0x0000000087800010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_0_2_1__2_in_rule__ClauseExpression__Group_1_1_0_2_1__14278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_0_2_1_1__0_in_rule__ClauseExpression__Group_1_1_0_2_1__1__Impl4305 = new BitSet(new long[]{0x0000000007800012L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_0_2_1__2__Impl_in_rule__ClauseExpression__Group_1_1_0_2_1__24336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_1_0_2_1__2__Impl4364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_0_2_1_1__0__Impl_in_rule__ClauseExpression__Group_1_1_0_2_1_1__04401 = new BitSet(new long[]{0x0000000007800010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_0_2_1_1__1_in_rule__ClauseExpression__Group_1_1_0_2_1_1__04404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__ClauseExpression__Group_1_1_0_2_1_1__0__Impl4432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_0_2_1_1__1__Impl_in_rule__ClauseExpression__Group_1_1_0_2_1_1__14463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_0_2_1_1_1_in_rule__ClauseExpression__Group_1_1_0_2_1_1__1__Impl4490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_1__0__Impl_in_rule__ClauseExpression__Group_1_1_1__04524 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_1__1_in_rule__ClauseExpression__Group_1_1_1__04527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_1_0_in_rule__ClauseExpression__Group_1_1_1__0__Impl4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_1__1__Impl_in_rule__ClauseExpression__Group_1_1_1__14584 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_1__2_in_rule__ClauseExpression__Group_1_1_1__14587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ClauseExpression__Group_1_1_1__1__Impl4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_1__2__Impl_in_rule__ClauseExpression__Group_1_1_1__24646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Alternatives_1_1_1_2_in_rule__ClauseExpression__Group_1_1_1__2__Impl4673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_1_2_1__0__Impl_in_rule__ClauseExpression__Group_1_1_1_2_1__04709 = new BitSet(new long[]{0x0000000087800010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_1_2_1__1_in_rule__ClauseExpression__Group_1_1_1_2_1__04712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ClauseExpression__Group_1_1_1_2_1__0__Impl4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_1_2_1__1__Impl_in_rule__ClauseExpression__Group_1_1_1_2_1__14771 = new BitSet(new long[]{0x0000000087800010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_1_2_1__2_in_rule__ClauseExpression__Group_1_1_1_2_1__14774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_1_2_1_1__0_in_rule__ClauseExpression__Group_1_1_1_2_1__1__Impl4801 = new BitSet(new long[]{0x0000000007800012L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_1_2_1__2__Impl_in_rule__ClauseExpression__Group_1_1_1_2_1__24832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_1_1_2_1__2__Impl4860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_1_2_1_1__0__Impl_in_rule__ClauseExpression__Group_1_1_1_2_1_1__04897 = new BitSet(new long[]{0x0000000007800010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_1_2_1_1__1_in_rule__ClauseExpression__Group_1_1_1_2_1_1__04900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__ClauseExpression__Group_1_1_1_2_1_1__0__Impl4928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_1_2_1_1__1__Impl_in_rule__ClauseExpression__Group_1_1_1_2_1_1__14959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_1_2_1_1_1_in_rule__ClauseExpression__Group_1_1_1_2_1_1__1__Impl4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_2__0__Impl_in_rule__ClauseExpression__Group_1_1_2__05020 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_2__1_in_rule__ClauseExpression__Group_1_1_2__05023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_2_0_in_rule__ClauseExpression__Group_1_1_2__0__Impl5050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_2__1__Impl_in_rule__ClauseExpression__Group_1_1_2__15080 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_2__2_in_rule__ClauseExpression__Group_1_1_2__15083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ClauseExpression__Group_1_1_2__1__Impl5111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_2__2__Impl_in_rule__ClauseExpression__Group_1_1_2__25142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Alternatives_1_1_2_2_in_rule__ClauseExpression__Group_1_1_2__2__Impl5169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_2_2_1__0__Impl_in_rule__ClauseExpression__Group_1_1_2_2_1__05205 = new BitSet(new long[]{0x0000000087800010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_2_2_1__1_in_rule__ClauseExpression__Group_1_1_2_2_1__05208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ClauseExpression__Group_1_1_2_2_1__0__Impl5236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_2_2_1__1__Impl_in_rule__ClauseExpression__Group_1_1_2_2_1__15267 = new BitSet(new long[]{0x0000000087800010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_2_2_1__2_in_rule__ClauseExpression__Group_1_1_2_2_1__15270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_2_2_1_1__0_in_rule__ClauseExpression__Group_1_1_2_2_1__1__Impl5297 = new BitSet(new long[]{0x0000000007800012L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_2_2_1__2__Impl_in_rule__ClauseExpression__Group_1_1_2_2_1__25328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_1_2_2_1__2__Impl5356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_2_2_1_1__0__Impl_in_rule__ClauseExpression__Group_1_1_2_2_1_1__05393 = new BitSet(new long[]{0x0000000007800010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_2_2_1_1__1_in_rule__ClauseExpression__Group_1_1_2_2_1_1__05396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__ClauseExpression__Group_1_1_2_2_1_1__0__Impl5424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_2_2_1_1__1__Impl_in_rule__ClauseExpression__Group_1_1_2_2_1_1__15455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_2_2_1_1_1_in_rule__ClauseExpression__Group_1_1_2_2_1_1__1__Impl5482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_3__0__Impl_in_rule__ClauseExpression__Group_1_1_3__05516 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_3__1_in_rule__ClauseExpression__Group_1_1_3__05519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_3_0_in_rule__ClauseExpression__Group_1_1_3__0__Impl5546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_3__1__Impl_in_rule__ClauseExpression__Group_1_1_3__15576 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_3__2_in_rule__ClauseExpression__Group_1_1_3__15579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ClauseExpression__Group_1_1_3__1__Impl5607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_3__2__Impl_in_rule__ClauseExpression__Group_1_1_3__25638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Alternatives_1_1_3_2_in_rule__ClauseExpression__Group_1_1_3__2__Impl5665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_3_2_1__0__Impl_in_rule__ClauseExpression__Group_1_1_3_2_1__05701 = new BitSet(new long[]{0x0000000087800040L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_3_2_1__1_in_rule__ClauseExpression__Group_1_1_3_2_1__05704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ClauseExpression__Group_1_1_3_2_1__0__Impl5732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_3_2_1__1__Impl_in_rule__ClauseExpression__Group_1_1_3_2_1__15763 = new BitSet(new long[]{0x0000000087800040L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_3_2_1__2_in_rule__ClauseExpression__Group_1_1_3_2_1__15766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_3_2_1_1__0_in_rule__ClauseExpression__Group_1_1_3_2_1__1__Impl5793 = new BitSet(new long[]{0x0000000007800042L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_3_2_1__2__Impl_in_rule__ClauseExpression__Group_1_1_3_2_1__25824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_1_3_2_1__2__Impl5852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_3_2_1_1__0__Impl_in_rule__ClauseExpression__Group_1_1_3_2_1_1__05889 = new BitSet(new long[]{0x0000000007800040L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_3_2_1_1__1_in_rule__ClauseExpression__Group_1_1_3_2_1_1__05892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__ClauseExpression__Group_1_1_3_2_1_1__0__Impl5920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_3_2_1_1__1__Impl_in_rule__ClauseExpression__Group_1_1_3_2_1_1__15951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_3_2_1_1_1_in_rule__ClauseExpression__Group_1_1_3_2_1_1__1__Impl5978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_4__0__Impl_in_rule__ClauseExpression__Group_1_1_4__06012 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_4__1_in_rule__ClauseExpression__Group_1_1_4__06015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_4_0_in_rule__ClauseExpression__Group_1_1_4__0__Impl6042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_4__1__Impl_in_rule__ClauseExpression__Group_1_1_4__16072 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_4__2_in_rule__ClauseExpression__Group_1_1_4__16075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ClauseExpression__Group_1_1_4__1__Impl6103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_4__2__Impl_in_rule__ClauseExpression__Group_1_1_4__26134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Alternatives_1_1_4_2_in_rule__ClauseExpression__Group_1_1_4__2__Impl6161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_4_2_1__0__Impl_in_rule__ClauseExpression__Group_1_1_4_2_1__06197 = new BitSet(new long[]{0x0000000087800020L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_4_2_1__1_in_rule__ClauseExpression__Group_1_1_4_2_1__06200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ClauseExpression__Group_1_1_4_2_1__0__Impl6228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_4_2_1__1__Impl_in_rule__ClauseExpression__Group_1_1_4_2_1__16259 = new BitSet(new long[]{0x0000000087800020L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_4_2_1__2_in_rule__ClauseExpression__Group_1_1_4_2_1__16262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_4_2_1_1__0_in_rule__ClauseExpression__Group_1_1_4_2_1__1__Impl6289 = new BitSet(new long[]{0x0000000007800022L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_4_2_1__2__Impl_in_rule__ClauseExpression__Group_1_1_4_2_1__26320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_1_4_2_1__2__Impl6348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_4_2_1_1__0__Impl_in_rule__ClauseExpression__Group_1_1_4_2_1_1__06385 = new BitSet(new long[]{0x0000000007800020L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_4_2_1_1__1_in_rule__ClauseExpression__Group_1_1_4_2_1_1__06388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__ClauseExpression__Group_1_1_4_2_1_1__0__Impl6416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_4_2_1_1__1__Impl_in_rule__ClauseExpression__Group_1_1_4_2_1_1__16447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_4_2_1_1_1_in_rule__ClauseExpression__Group_1_1_4_2_1_1__1__Impl6474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_5__0__Impl_in_rule__ClauseExpression__Group_1_1_5__06508 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_5__1_in_rule__ClauseExpression__Group_1_1_5__06511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_5_0_in_rule__ClauseExpression__Group_1_1_5__0__Impl6538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_5__1__Impl_in_rule__ClauseExpression__Group_1_1_5__16568 = new BitSet(new long[]{0x000000004007E000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_5__2_in_rule__ClauseExpression__Group_1_1_5__16571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ClauseExpression__Group_1_1_5__1__Impl6599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_5__2__Impl_in_rule__ClauseExpression__Group_1_1_5__26630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Alternatives_1_1_5_2_in_rule__ClauseExpression__Group_1_1_5__2__Impl6657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_5_2_1__0__Impl_in_rule__ClauseExpression__Group_1_1_5_2_1__06693 = new BitSet(new long[]{0x000000008787E000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_5_2_1__1_in_rule__ClauseExpression__Group_1_1_5_2_1__06696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ClauseExpression__Group_1_1_5_2_1__0__Impl6724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_5_2_1__1__Impl_in_rule__ClauseExpression__Group_1_1_5_2_1__16755 = new BitSet(new long[]{0x000000008787E000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_5_2_1__2_in_rule__ClauseExpression__Group_1_1_5_2_1__16758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_5_2_1_1__0_in_rule__ClauseExpression__Group_1_1_5_2_1__1__Impl6785 = new BitSet(new long[]{0x000000000787E002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_5_2_1__2__Impl_in_rule__ClauseExpression__Group_1_1_5_2_1__26816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_1_5_2_1__2__Impl6844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_5_2_1_1__0__Impl_in_rule__ClauseExpression__Group_1_1_5_2_1_1__06881 = new BitSet(new long[]{0x000000000787E000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_5_2_1_1__1_in_rule__ClauseExpression__Group_1_1_5_2_1_1__06884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__ClauseExpression__Group_1_1_5_2_1_1__0__Impl6912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_5_2_1_1__1__Impl_in_rule__ClauseExpression__Group_1_1_5_2_1_1__16943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_5_2_1_1_1_in_rule__ClauseExpression__Group_1_1_5_2_1_1__1__Impl6970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_6__0__Impl_in_rule__ClauseExpression__Group_1_1_6__07004 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_6__1_in_rule__ClauseExpression__Group_1_1_6__07007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_6_0_in_rule__ClauseExpression__Group_1_1_6__0__Impl7034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_6__1__Impl_in_rule__ClauseExpression__Group_1_1_6__17064 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_6__2_in_rule__ClauseExpression__Group_1_1_6__17067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ClauseExpression__Group_1_1_6__1__Impl7095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_6__2__Impl_in_rule__ClauseExpression__Group_1_1_6__27126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Alternatives_1_1_6_2_in_rule__ClauseExpression__Group_1_1_6__2__Impl7153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_6_2_1__0__Impl_in_rule__ClauseExpression__Group_1_1_6_2_1__07189 = new BitSet(new long[]{0x0000000087800010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_6_2_1__1_in_rule__ClauseExpression__Group_1_1_6_2_1__07192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ClauseExpression__Group_1_1_6_2_1__0__Impl7220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_6_2_1__1__Impl_in_rule__ClauseExpression__Group_1_1_6_2_1__17251 = new BitSet(new long[]{0x0000000087800010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_6_2_1__2_in_rule__ClauseExpression__Group_1_1_6_2_1__17254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_6_2_1_1__0_in_rule__ClauseExpression__Group_1_1_6_2_1__1__Impl7281 = new BitSet(new long[]{0x0000000007800012L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_6_2_1__2__Impl_in_rule__ClauseExpression__Group_1_1_6_2_1__27312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_1_6_2_1__2__Impl7340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_6_2_1_1__0__Impl_in_rule__ClauseExpression__Group_1_1_6_2_1_1__07377 = new BitSet(new long[]{0x0000000007800010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_6_2_1_1__1_in_rule__ClauseExpression__Group_1_1_6_2_1_1__07380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__ClauseExpression__Group_1_1_6_2_1_1__0__Impl7408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_6_2_1_1__1__Impl_in_rule__ClauseExpression__Group_1_1_6_2_1_1__17439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_6_2_1_1_1_in_rule__ClauseExpression__Group_1_1_6_2_1_1__1__Impl7466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_7__0__Impl_in_rule__ClauseExpression__Group_1_1_7__07500 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_7__1_in_rule__ClauseExpression__Group_1_1_7__07503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_7_0_in_rule__ClauseExpression__Group_1_1_7__0__Impl7530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_7__1__Impl_in_rule__ClauseExpression__Group_1_1_7__17560 = new BitSet(new long[]{0x0000000040780000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_7__2_in_rule__ClauseExpression__Group_1_1_7__17563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ClauseExpression__Group_1_1_7__1__Impl7591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_7__2__Impl_in_rule__ClauseExpression__Group_1_1_7__27622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Alternatives_1_1_7_2_in_rule__ClauseExpression__Group_1_1_7__2__Impl7649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_7_2_1__0__Impl_in_rule__ClauseExpression__Group_1_1_7_2_1__07685 = new BitSet(new long[]{0x0000000087F80000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_7_2_1__1_in_rule__ClauseExpression__Group_1_1_7_2_1__07688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ClauseExpression__Group_1_1_7_2_1__0__Impl7716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_7_2_1__1__Impl_in_rule__ClauseExpression__Group_1_1_7_2_1__17747 = new BitSet(new long[]{0x0000000087F80000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_7_2_1__2_in_rule__ClauseExpression__Group_1_1_7_2_1__17750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_7_2_1_1__0_in_rule__ClauseExpression__Group_1_1_7_2_1__1__Impl7777 = new BitSet(new long[]{0x0000000007F80002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_7_2_1__2__Impl_in_rule__ClauseExpression__Group_1_1_7_2_1__27808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_1_7_2_1__2__Impl7836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_7_2_1_1__0__Impl_in_rule__ClauseExpression__Group_1_1_7_2_1_1__07873 = new BitSet(new long[]{0x0000000007F80000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_7_2_1_1__1_in_rule__ClauseExpression__Group_1_1_7_2_1_1__07876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__ClauseExpression__Group_1_1_7_2_1_1__0__Impl7904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_7_2_1_1__1__Impl_in_rule__ClauseExpression__Group_1_1_7_2_1_1__17935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_7_2_1_1_1_in_rule__ClauseExpression__Group_1_1_7_2_1_1__1__Impl7962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_8__0__Impl_in_rule__ClauseExpression__Group_1_1_8__07996 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_8__1_in_rule__ClauseExpression__Group_1_1_8__07999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_8_0_in_rule__ClauseExpression__Group_1_1_8__0__Impl8026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_8__1__Impl_in_rule__ClauseExpression__Group_1_1_8__18056 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_8__2_in_rule__ClauseExpression__Group_1_1_8__18059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ClauseExpression__Group_1_1_8__1__Impl8087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_8__2__Impl_in_rule__ClauseExpression__Group_1_1_8__28118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Alternatives_1_1_8_2_in_rule__ClauseExpression__Group_1_1_8__2__Impl8145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_8_2_1__0__Impl_in_rule__ClauseExpression__Group_1_1_8_2_1__08181 = new BitSet(new long[]{0x0000000087800010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_8_2_1__1_in_rule__ClauseExpression__Group_1_1_8_2_1__08184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ClauseExpression__Group_1_1_8_2_1__0__Impl8212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_8_2_1__1__Impl_in_rule__ClauseExpression__Group_1_1_8_2_1__18243 = new BitSet(new long[]{0x0000000087800010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_8_2_1__2_in_rule__ClauseExpression__Group_1_1_8_2_1__18246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_8_2_1_1__0_in_rule__ClauseExpression__Group_1_1_8_2_1__1__Impl8273 = new BitSet(new long[]{0x0000000007800012L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_8_2_1__2__Impl_in_rule__ClauseExpression__Group_1_1_8_2_1__28304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_1_8_2_1__2__Impl8332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_8_2_1_1__0__Impl_in_rule__ClauseExpression__Group_1_1_8_2_1_1__08369 = new BitSet(new long[]{0x0000000007800010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_8_2_1_1__1_in_rule__ClauseExpression__Group_1_1_8_2_1_1__08372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__ClauseExpression__Group_1_1_8_2_1_1__0__Impl8400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_8_2_1_1__1__Impl_in_rule__ClauseExpression__Group_1_1_8_2_1_1__18431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_8_2_1_1_1_in_rule__ClauseExpression__Group_1_1_8_2_1_1__1__Impl8458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_9__0__Impl_in_rule__ClauseExpression__Group_1_1_9__08492 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_9__1_in_rule__ClauseExpression__Group_1_1_9__08495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__FieldAssignment_1_1_9_0_in_rule__ClauseExpression__Group_1_1_9__0__Impl8522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_9__1__Impl_in_rule__ClauseExpression__Group_1_1_9__18552 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_9__2_in_rule__ClauseExpression__Group_1_1_9__18555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ClauseExpression__Group_1_1_9__1__Impl8583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_9__2__Impl_in_rule__ClauseExpression__Group_1_1_9__28614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Alternatives_1_1_9_2_in_rule__ClauseExpression__Group_1_1_9__2__Impl8641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_9_2_1__0__Impl_in_rule__ClauseExpression__Group_1_1_9_2_1__08677 = new BitSet(new long[]{0x0000000087800010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_9_2_1__1_in_rule__ClauseExpression__Group_1_1_9_2_1__08680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ClauseExpression__Group_1_1_9_2_1__0__Impl8708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_9_2_1__1__Impl_in_rule__ClauseExpression__Group_1_1_9_2_1__18739 = new BitSet(new long[]{0x0000000087800010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_9_2_1__2_in_rule__ClauseExpression__Group_1_1_9_2_1__18742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_9_2_1_1__0_in_rule__ClauseExpression__Group_1_1_9_2_1__1__Impl8769 = new BitSet(new long[]{0x0000000007800012L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_9_2_1__2__Impl_in_rule__ClauseExpression__Group_1_1_9_2_1__28800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ClauseExpression__Group_1_1_9_2_1__2__Impl8828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_9_2_1_1__0__Impl_in_rule__ClauseExpression__Group_1_1_9_2_1_1__08865 = new BitSet(new long[]{0x0000000007800010L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_9_2_1_1__1_in_rule__ClauseExpression__Group_1_1_9_2_1_1__08868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__ClauseExpression__Group_1_1_9_2_1_1__0__Impl8896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__Group_1_1_9_2_1_1__1__Impl_in_rule__ClauseExpression__Group_1_1_9_2_1_1__18927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClauseExpression__ValuesAssignment_1_1_9_2_1_1_1_in_rule__ClauseExpression__Group_1_1_9_2_1_1__1__Impl8954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryExp_in_rule__Exp1__BAssignment_1_18993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp1_in_rule__Exp1__RightAssignment_1_29024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClauseExpression_in_rule__Exp2__ValueAssignment_09055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFieldValue_in_rule__ClauseExpression__DefaultAssignment_1_09086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleField_in_rule__ClauseExpression__FieldAssignment_1_1_0_09117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_0_2_09148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_0_2_1_1_19179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeField_in_rule__ClauseExpression__FieldAssignment_1_1_1_09210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_1_2_09241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_1_2_1_1_19272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodField_in_rule__ClauseExpression__FieldAssignment_1_1_2_09303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_2_2_09334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_2_2_1_1_19365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilePathField_in_rule__ClauseExpression__FieldAssignment_1_1_3_09396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilePathFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_3_2_09427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilePathFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_3_2_1_1_19458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberField_in_rule__ClauseExpression__FieldAssignment_1_1_4_09489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_4_2_09520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_4_2_1_1_19551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierField_in_rule__ClauseExpression__FieldAssignment_1_1_5_09582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_5_2_09613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_5_2_1_1_19644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeField_in_rule__ClauseExpression__FieldAssignment_1_1_6_09675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_6_2_09706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_6_2_1_1_19737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentTypeField_in_rule__ClauseExpression__FieldAssignment_1_1_7_09768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentTypeFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_7_2_09799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentTypeFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_7_2_1_1_19830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectNameField_in_rule__ClauseExpression__FieldAssignment_1_1_8_09861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectNameFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_8_2_09892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectNameFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_8_2_1_1_19923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationField_in_rule__ClauseExpression__FieldAssignment_1_1_9_09954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_9_2_09985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationFieldValue_in_rule__ClauseExpression__ValuesAssignment_1_1_9_2_1_1_110016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__SimpleField__FullyQualifiedNameAssignment_010052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__SimpleField__FriendlyNameAssignment_110096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__SimpleField__DeclaredMethodsAssignment_210140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__SimpleField__ReturnVariableEexpressionsAssignment_310184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__SimpleField__AllDeclaredMethodNamesAssignment_410228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__SimpleField__DeclaredMethodNamesAssignment_510272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__SimpleField__DeclaredFieldNamesAssignment_610316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__SimpleField__AllDeclaredFieldNamesAssignment_710360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__SimpleField__FullTextAssignment_810404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__SimpleField__FieldsReadAssignment_910448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__SimpleField__FieldsWrittenAssignment_1010492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__SimpleField__UsedFieldsInFinallyAssignment_1110536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__SimpleField__UsedFieldsInTryAssignment_1210580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__TypeField__ImplementedTypesAssignment_010624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__TypeField__ExtendedTypesAssignment_110668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__TypeField__UsedTypesAssignment_210712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__TypeField__UsedTypesInTryAssignment_310756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__TypeField__UsedTypesInFinallyAssignment_410800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__TypeField__ParameterTypesAssignment_510844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__TypeField__ReturnTypeAssignment_610888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__TypeField__InstanceofTypesAssignment_710932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__TypeField__AllImplementedTypesAssignment_810976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__TypeField__AllExtendedTypesAssignment_911020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__TypeField__FieldTypeAssignment_1011064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__TypeField__CaughtTypeAssignment_1111108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__TypeField__DeclaredFieldTypesAssignment_1211152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__TypeField__DeclaringTypeAssignment_1311196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__MethodField__UsedMethodsAssignment_011240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__MethodField__UsedMethodsInTryAssignment_111284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__MethodField__UsedMethodsInFinallyAssignment_211328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__MethodField__OverriddenMethodsAssignment_311372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__FilePathField__ResourcePathAssignment11416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__NumberField__ParameterCountAssignment11460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__ModifierField__ModifiersAssignment11504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__TimeField__TimestampAssignment11548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__DocumentTypeField__TypeAssignment11592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__ProjectNameField__ProjectNameAssignment11636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__AnnotationField__AnnotationsAssignment11680 = new BitSet(new long[]{0x0000000000000002L});

}